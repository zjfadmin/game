package com.xy.a;

import com.xy.game.GameUtil;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class21 implements MouseListener {
   // $VF: synthetic field
   final Class51 ke;

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (Class51.sl(this.ke) != null) {
         GameUtil.b(Class51.sl(this.ke), this.ke.ze());
      }
   }

   Class21(Class51 var1) {
      this.ke = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Class51.sk(this.ke, Class51.sg(this.ke, var1.getX(), var1.getY()));
      if (Class51.sl(this.ke) != null) {
         Class51.sl(this.ke).setM(true);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
