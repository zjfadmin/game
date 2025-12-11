package com.xy.q;

import com.xy.a.Class132;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Class23 extends PlainDocument {
   private boolean gk;
   public static final int ae = 15;
   private static final long et = 1L;
   private JTextField zo;
   private Class30 eu;

   @Override
   public void remove(int var1, int var2) throws BadLocationException {
      super.remove(var1, var2);
      String var3 = null;
      if (this.gk) {
         if (var3 == null) {
            var3 = this.getText(0, this.getLength());
         }

         this.dq(var3);
      }
   }

   public Class23(int var1, JTextField var2, Class30 var3) {
      this.eu = var3;
      this.zo = var2;
      this.gk = (var1 >> 3 & 1) == 1;
      this.zo.setDocument(this);
   }

   @Override
   public void replace(int var1, int var2, String var3, AttributeSet var4) throws BadLocationException {
      if (var3 != null && var3.length() > 1) {
         if (this.gk) {
            this.dq(var3);
         }
      } else {
         super.replace(var1, var2, var3, var4);
      }
   }

   public JTextField ty() {
      return this.zo;
   }

   public void dq(String var1) {
      if (this.eu != null) {
         if (this.eu instanceof Class132) {
            ((Class132)this.eu).ams(var1, this.zo);
         }
      }
   }

   @Override
   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      super.insertString(var1, var2, var3);
      String var4 = null;
      if (this.gk) {
         if (var4 == null) {
            var4 = this.getText(0, this.getLength());
         }

         this.dq(var4);
      }
   }
}
