package com.xy;

import java.awt.Graphics;
import javax.swing.JTextField;

public class Class217 extends JTextField {
   protected Class604 ip;

   protected void paintComponent(Graphics var1) {
      if (this.ip != null) {
         this.ip.g(var1, this.getWidth(), this.getHeight());
         int var10000 = -2 & -1;
         var1.translate(--2, 5 >> 3);
         super.paintComponent(var1);
         var1.translate(var10000, 3 ^ 3);
      } else {
         super.paintComponent(var1);
      }
   }

   public void eq(Class604 var1) {
      this.ip = var1;
   }

   public void paintImmediately(int var1, int var2, int var3, int var4) {
   }

   public Class217(Class604 var1) {
      this.ip = var1;
   }

   public Class217() {
   }
}
