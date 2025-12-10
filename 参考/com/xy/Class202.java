package com.xy;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Class202 extends PlainDocument {
   private static final long gf = 1L;
   public static final int j = 15;
   private boolean lc;
   private JTextField qz;
   private Class345 pr;

   public JTextField jj() {
      return this.qz;
   }

   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      super.insertString(var1, var2, var3);
      String var4 = null;
      if (this.lc) {
         if (var4 == null) {
            var4 = this.getText(2 & 5, this.getLength());
         }

         this.fx(var4);
      }

   }

   public void fx(String var1) {
      if (this.pr != null) {
         if (this.pr instanceof Class4) {
            ((Class4)this.pr).iw(var1, this.qz);
         }

      }
   }

   public void remove(int var1, int var2) throws BadLocationException {
      super.remove(var1, var2);
      String var3 = null;
      if (this.lc) {
         if (var3 == null) {
            var3 = this.getText(2 & 5, this.getLength());
         }

         this.fx(var3);
      }

   }

   public Class202(int var1, JTextField var2, Class345 var3) {
      this.pr = var3;
      this.qz = var2;
      this.lc = (boolean)((var1 >> --3 & --1) == (3 & 5) ? 3 & 5 : 0);
      this.qz.setDocument(this);
   }

   public void replace(int var1, int var2, String var3, AttributeSet var4) throws BadLocationException {
      if (var3 != null && var3.length() > 5 >> 2) {
         if (this.lc) {
            this.fx(var3);
         }

      } else {
         super.replace(var1, var2, var3, var4);
      }
   }
}
