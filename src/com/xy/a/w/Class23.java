package com.xy.a.w;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Class23 extends MouseAdapter {
   // $VF: synthetic field
   final Class20 ahu;

   Class23(Class20 var1) {
      this.ahu = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2;
      if ((var2 = Class20.uk(this.ahu).th().getSelectedIndex()) != -1) {
         this.ahu.bi(var2 + 1);
      }
   }
}
