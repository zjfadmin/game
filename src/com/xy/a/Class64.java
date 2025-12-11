package com.xy.a;

import com.xy.game.GameUtil;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class64 implements MouseListener {
   // $VF: synthetic field
   final Class50 abf;

   @Override
   public void mousePressed(MouseEvent var1) {
      Class50.rz(this.abf, Class50.sc(this.abf).isMonitor(var1.getX(), var1.getY()));
      if (Class50.ry(this.abf) != null) {
         Class50.ry(this.abf).setM(true);
      }
   }

   Class64(Class50 var1) {
      this.abf = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (Class50.ry(this.abf) != null) {
         GameUtil.b(Class50.ry(this.abf), this.abf.eg().afx);
         Class50.rz(this.abf, null);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
