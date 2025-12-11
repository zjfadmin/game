package com.xy.a.i;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Class44 implements MouseListener {
   // $VF: synthetic field
   final Class2 fu;

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   Class44(Class2 var1) {
      this.fu = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Class2.co(this.fu, !Class2.cj(this.fu));
      com.xy.w.Class18 var10000 = Class2.cm(this.fu);
      String var2;
      if (Class2.cj(this.fu)) {
         var2 = "' {&{pdm$-3";
         var2 = "sc/e/30.png";
      } else {
         var2 = "A\n\u001d\f\u001d[\u000bGB\u0007U";
         var2 = "sc/e/29.png";
      }

      var10000.gt(com.xy.w.Class16.c(var2));
      this.fu.l();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}
