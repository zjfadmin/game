package com.xy.a.i;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class18 implements MouseListener {
   // $VF: synthetic field
   final Class31 wi;
   private int ah;

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((com.xy.a.Class48)Class31.abr(this.wi).zc().j(46)).hr(Class31.abs(this.wi.aiy, this.ah), false);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Class31.abr(this.wi).zc().f(46);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (Class31.abr(this.wi) instanceof Class13) {
         if (this.wi.aiy.getJade(this.ah) > 0) {
            ((Class13)Class31.abr(this.wi)).ka()[1].gs(100 + this.ah, this.wi.aiy);
         }
      } else if (Class31.abr(this.wi) instanceof Class34) {
         Class34 var4 = (Class34)Class31.abr(this.wi);
         var4.ep().gs(100 + this.ah, this.wi.aiy);
         var4.h();
      } else if (Class31.abr(this.wi) instanceof Class5) {
         if (this.wi.aiy.getJade(this.ah) > 0) {
            Class5 var3 = (Class5)Class31.abr(this.wi);
            var3.ep().gs(100 + this.ah, this.wi.aiy);
            var3.eo()[1].setText("1");
         }
      } else {
         if (Class31.abr(this.wi) instanceof Class14) {
            if (this.wi.aiy.getJade(this.ah) <= 0) {
               return;
            }

            Class14 var10000 = (Class14)Class31.abr(this.wi);
            var10000.ep().gs(100 + this.ah, this.wi.aiy);
            var10000.f();
         }
      }
   }

   public Class18(Class31 var1, int var2) {
      this.wi = var1;
      this.ah = var2;
   }
}
