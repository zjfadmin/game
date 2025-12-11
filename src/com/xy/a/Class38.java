package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

class Class38 implements MouseListener {
   private JLabel di;
   // $VF: synthetic field
   final Class83 sv;

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   public Class38(Class83 var1, JLabel var2) {
      this.sv = var1;
      this.di = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = 0;
      String var10000 = this.di.getText();
      String var10001 = "駼顒";
      int var4;
      if (var10000.equals("首页")) {
         var4 = var2 = 0;
      } else {
         var10000 = this.di.getText();
         var10001 = "屦顚";
         var4 = var10000.equals("尾页") ? (var2 = (Class83.aau(this.sv).size() - 1) / 24) : (var2 = Integer.parseInt(this.di.getText()) - 1);
      }

      if (var4 != Class83.aax(this.sv)) {
         this.sv.g(var2);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
