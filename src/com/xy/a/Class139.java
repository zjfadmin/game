package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

class Class139 implements MouseListener {
   // $VF: synthetic field
   final Class116 ayk;
   private int ah;

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   public Class139(Class116 var1, int var2) {
      this.ayk = var1;
      this.ah = var2;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (this.ah >= 100) {
         Class116.ahm(this.ayk, this.ah - 100);
         this.ayk.ahl();
      } else if (var1.isMetaDown()) {
         this.ayk.zc().f(this.ayk.lj());
      } else {
         if ((Class116.ahn(this.ayk) - 1) * 40 + this.ah <= 168) {
            JTextField var2 = this.ayk.afx.baseView.ty();
            StringBuilder var10000 = new StringBuilder(String.valueOf(var2.getText()));
            String var10002 = "\u007f";
            var2.setText(var10000.append("#").append((Class116.ahn(this.ayk) - 1) * 40 + this.ah).toString());
         }
      }
   }
}
