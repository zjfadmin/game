package com.xy.a.i;

import com.xy.q.Class49;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;

class Class25 implements MouseListener {
   // $VF: synthetic field
   final Class1 afo;

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   Class25(Class1 var1) {
      this.afo = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Class1.ax(this.afo, !Class1.az(this.afo));
      com.xy.w.Class18 var10000 = Class1.bc(this.afo)[1];
      String var2;
      if (Class1.az(this.afo)) {
         var2 = "t%(#(u7hw(`";
         var2 = "sc/e/30.png";
      } else {
         var2 = "\u001bpGvG!Q=\u0018}\u000f";
         var2 = "sc/e/29.png";
      }

      var10000.gt(com.xy.w.Class16.c(var2));
      Class1.aw(this.afo, new BigDecimal(Class1.az(this.afo) ? 100000 : 80000));
      Class49.b(Class1.av(this.afo)[0], Class1.au(this.afo).longValue());
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }
}
