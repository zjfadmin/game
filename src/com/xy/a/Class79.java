package com.xy.a;

import com.xy.game.GameUtil;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class79 implements MouseListener {
   // $VF: synthetic field
   final Class29 agt;

   @Override
   public void mousePressed(MouseEvent var1) {
      Class29.md(this.agt, Class29.mf(this.agt).isMonitor(var1.getX(), var1.getY()));
      if (Class29.mb(this.agt) != null) {
         Class29.mb(this.agt).setM(true);
      }
   }

   Class79(Class29 var1) {
      this.agt = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (Class29.mb(this.agt) != null) {
         GameUtil.b(Class29.mb(this.agt), this.agt.ze());
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }
}
