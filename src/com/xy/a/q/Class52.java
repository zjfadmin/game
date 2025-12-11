package com.xy.a.q;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class52 implements MouseListener {
   // $VF: synthetic field
   final Class101 acg;

   Class52(Class101 var1) {
      this.acg = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Class101.akt(this.acg, !Class101.akv(this.acg));
      com.xy.w.Class18 var10000 = Class101.aku(this.acg)[3];
      String var2;
      if (Class101.akv(this.acg)) {
         var2 = "@E\u001cC\u001c\u0015\u0003\bCHT";
         var2 = "sc/e/30.png";
      } else {
         var2 = "' {&{qmm$-3";
         var2 = "sc/e/29.png";
      }

      var10000.dp(var2);
   }
}
