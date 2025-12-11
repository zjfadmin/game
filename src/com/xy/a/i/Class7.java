package com.xy.a.i;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class7 implements MouseListener {
   // $VF: synthetic field
   final Class10 js;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (Class10.hn(this.js) != 0) {
         this.js.g(0);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   Class7(Class10 var1) {
      this.js = var1;
   }
}
