package com.xy.a.i;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class30 implements MouseListener {
   // $VF: synthetic field
   final Class10 js;

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (Class10.hn(this.js) != 1) {
         this.js.g(1);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   Class30(Class10 var1) {
      this.js = var1;
   }
}
