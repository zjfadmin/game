package com.xy.q;

import com.xy.richtext.InputBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Class11 extends PlainDocument {
   private List<InputBean> iv = new ArrayList<>();
   private static final long kd = 1L;

   @Override
   public void remove(int var1, int var2) throws BadLocationException {
      this.cc(var1, -var2);
      super.remove(var1, var2);
   }

   public String jg() {
      try {
         String var1 = super.getText(0, this.getLength());
         if (this.iv.size() == 0) {
            return var1;
         } else {
            int var2 = 0;
            StringBuffer var3 = new StringBuffer();

            int var4;
            for (int var10000 = var4 = 0; var10000 < this.iv.size(); var10000 = var4) {
               InputBean var5 = this.iv.get(var4);
               String var6 = var1.substring(0, var5.getIndex() - var2);
               var3.append(var6);
               String var10002 = "\u0019:";
               var3.append("#V");
               var3.append(com.xy.v.Class31.a().toJson(var5));
               String var10004 = "FO";
               var3.append("#L");
               var1 = var1.substring(var5.getIndex() + var5.getName().length() - var2);
               int var8 = var5.getIndex();
               String var10005 = var5.getName();
               var4++;
               var2 = var8 + var10005.length();
            }

            var3.append(var1);
            return var3.toString();
         }
      } catch (BadLocationException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public void cc(int var1, int var2) {
      int var3;
      for (int var10000 = var3 = this.iv.size() - 1; var10000 >= 0; var10000 = --var3) {
         InputBean var4;
         if ((var4 = this.iv.get(var3)).getIndex() >= var1) {
            var4.setIndex(var4.getIndex() + var2);
            if (var4.getIndex() < var1) {
               this.iv.remove(var3);
            }
         }
      }
   }

   public void lw(InputBean var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = ++var2) {
         if (this.iv.get(var2).getIndex() > var1.getIndex()) {
            this.iv.add(var2, var1);
            return;
         }
      }

      this.iv.add(var1);
   }

   public void lx(int var1, int var2, BigDecimal var3, String var4, String var5, AttributeSet var6) throws BadLocationException {
      if (var4 != null && this.iv.size() < 3) {
         String var10001 = "O";
         String var10002 = "#";
         var4 = var4.replace("#", " ");

         int var7;
         for (int var10000 = var7 = this.iv.size() - 1; var10000 >= 0; var10000 = --var7) {
            if (this.iv.get(var7).isIndex(var1)) {
               return;
            }
         }

         this.cc(var1, var4.length());
         this.lw(new InputBean(var1, var2, var3, var4, var5));
         super.insertString(var1, var4, var6);
      }
   }

   @Override
   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      if (var2 != null) {
         int var4;
         for (int var10000 = var4 = this.iv.size() - 1; var10000 >= 0; var10000 = --var4) {
            if (this.iv.get(var4).isIndex(var1)) {
               return;
            }
         }

         this.cc(var1, var2.length());
         super.insertString(var1, var2, var3);
      }
   }
}
