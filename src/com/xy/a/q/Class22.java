package com.xy.a.q;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class22 implements MouseListener {
   // $VF: synthetic field
   final Class97 qn;

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   Class22(Class97 var1) {
      this.qn = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (Class97.aij(this.qn) != 1) {
         this.qn.g(1);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
