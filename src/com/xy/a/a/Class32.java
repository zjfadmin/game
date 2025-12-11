package com.xy.a.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class32 implements MouseListener {
   // $VF: synthetic field
   final Class19 pc;

   Class32(Class19 var1) {
      this.pc = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (Class19.mz(this.pc) != 1) {
         this.pc.g(1);
      }
   }
}
