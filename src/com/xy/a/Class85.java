package com.xy.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class85 implements ListSelectionListener {
   // $VF: synthetic field
   final Class47 air;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         this.air.ci((String)Class47.pl(this.air).getSelectedValue());
      }
   }

   Class85(Class47 var1) {
      this.air = var1;
   }
}
