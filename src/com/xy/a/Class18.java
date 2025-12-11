package com.xy.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class18 implements MouseListener {
   // $VF: synthetic field
   final Class115 io;

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Class115.ahh(this.io, !Class115.ahf(this.io));
      com.xy.w.Class18 var10000 = Class115.ahj(this.io)[2];
      String var2;
      if (Class115.ahf(this.io)) {
         var2 = "Y\b\u0005\u000e\u0005X\u001aEZ\u0005M";
         var2 = "sc/e/30.png";
      } else {
         var2 = "[C\u0007E\u0007\u0012\u0011\u000eXNO";
         var2 = "sc/e/29.png";
      }

      var10000.dp(var2);
      this.io.add(Class115.ahg(this.io));
   }

   Class18(Class115 var1) {
      this.io = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}
