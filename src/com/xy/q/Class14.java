package com.xy.q;

import java.awt.Graphics;
import javax.swing.JLabel;

public class Class14 extends JLabel {
   protected boolean bi = true;
   protected com.xy.w.Class9 rm;

   @Override
   public void setText(String var1) {
      if (!com.xy.v.Class12.am(var1, this.getText())) {
         super.setText(var1);
      }
   }

   @Override
   public void setHorizontalAlignment(int var1) {
      super.setHorizontalAlignment(var1);
      this.bi = var1 != 0;
   }

   public Class14(com.xy.w.Class9 var1) {
      this.rm = var1;
   }

   public void mt(com.xy.w.Class9 var1) {
      this.rm = var1;
   }

   public Class14() {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.rm != null) {
         this.rm.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.bi) {
         var1.translate(2, 0);
         super.paintComponent(var1);
         var1.translate(-2, 0);
      } else {
         super.paintComponent(var1);
      }
   }
}
