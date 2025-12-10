package com.xy;

import java.awt.Graphics;
import javax.swing.JLabel;

public class Class245 extends JLabel {
   protected Class604 ame;
   protected boolean op;

   public Class245(Class604 var1) {
      int var10003 = 5 >> 2;
      super();
      this.op = (boolean)var10003;
      this.ame = var1;
   }

   protected void paintComponent(Graphics var1) {
      if (this.ame != null) {
         this.ame.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.op) {
         int var10000 = -2 & -1;
         var1.translate(1 ^ 3, 3 >> 2);
         super.paintComponent(var1);
         var1.translate(var10000, 3 ^ 3);
      } else {
         super.paintComponent(var1);
      }
   }

   public void setText(String var1) {
      if (!Class394.r(var1, this.getText())) {
         super.setText(var1);
      }
   }

   public void eq(Class604 var1) {
      this.ame = var1;
   }

   public Class245() {
      int var10001 = 5 >> 2;
      super();
      this.op = (boolean)var10001;
   }

   public void setHorizontalAlignment(int var1) {
      super.setHorizontalAlignment(var1);
      this.op = (boolean)(var1 != 0 ? 3 >> 1 : 0);
   }
}
