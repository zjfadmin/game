package com.xy.q;

import java.awt.Graphics;
import javax.swing.JPasswordField;

public class Class12 extends JPasswordField {
   protected com.xy.w.Class9 rm;

   @Override
   public void paintImmediately(int var1, int var2, int var3, int var4) {
   }

   public Class12(com.xy.w.Class9 var1) {
      this.rm = var1;
   }

   public Class12() {
   }

   public void mt(com.xy.w.Class9 var1) {
      this.rm = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.rm != null) {
         this.rm.g(var1, this.getWidth(), this.getHeight());
         var1.translate(2, 0);
         super.paintComponent(var1);
         var1.translate(-2, 0);
      } else {
         super.paintComponent(var1);
      }
   }
}
