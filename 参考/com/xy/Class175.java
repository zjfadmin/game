package com.xy;

import com.xy.richtext.InputBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Class175 extends PlainDocument {
   private List<InputBean> lq = new ArrayList();
   private static final long aol = 1L;

   public void are(InputBean var1) {
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.lq.size(); var10000 = var2) {
         if (((InputBean)this.lq.get(var2)).getIndex() > var1.getIndex()) {
            this.lq.add(var2, var1);
            return;
         }

         ++var2;
      }

      this.lq.add(var1);
   }

   public String nn() {
      try {
         String var1 = super.getText(5 >> 3, this.getLength());
         if (this.lq.size() == 0) {
            return var1;
         } else {
            int var5 = 0;
            StringBuffer var3 = new StringBuffer();

            int var4;
            for(int var10000 = var4 = 3 & 4; var10000 < this.lq.size(); var10000 = var4) {
               InputBean var2 = (InputBean)this.lq.get(var4);
               String var6 = var1.substring(5 >> 3, var2.getIndex() - var5);
               var3.append(var6);
               var3.append("#V");
               var3.append(Class695.b().toJson(var2));
               var3.append("#L");
               var1 = var1.substring(var2.getIndex() + var2.getName().length() - var5);
               int var10004 = var2.getIndex();
               String var10005 = var2.getName();
               ++var4;
               var5 = var10004 + var10005.length();
            }

            var3.append(var1);
            return var3.toString();
         }
      } catch (BadLocationException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public void cf(int var1, int var2) {
      int var3;
      for(int var10000 = var3 = this.lq.size() - (4 ^ 5); var10000 >= 0; var10000 = var3) {
         InputBean var4;
         if ((var4 = (InputBean)this.lq.get(var3)).getIndex() >= var1) {
            var4.setIndex(var4.getIndex() + var2);
            if (var4.getIndex() < var1) {
               this.lq.remove(var3);
            }
         }

         --var3;
      }

   }

   public void remove(int var1, int var2) throws BadLocationException {
      this.cf(var1, -var2);
      super.remove(var1, var2);
   }

   public void arf(int var1, int var2, BigDecimal var3, String var4, String var5, AttributeSet var6) throws BadLocationException {
      if (var4 != null && this.lq.size() < --3) {
         var4 = var4.replace("#", " ");

         int var7;
         for(int var10000 = var7 = this.lq.size() - --1; var10000 >= 0; var10000 = var7) {
            if (((InputBean)this.lq.get(var7)).isIndex(var1)) {
               return;
            }

            --var7;
         }

         this.cf(var1, var4.length());
         this.are(new InputBean(var1, var2, var3, var4, var5));
         super.insertString(var1, var4, var6);
      }
   }

   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      if (var2 != null) {
         int var4;
         for(int var10000 = var4 = this.lq.size() - --1; var10000 >= 0; var10000 = var4) {
            if (((InputBean)this.lq.get(var4)).isIndex(var1)) {
               return;
            }

            --var4;
         }

         this.cf(var1, var2.length());
         super.insertString(var1, var2, var3);
      }
   }
}
