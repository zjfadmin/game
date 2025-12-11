package com.xy.a.v;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class11 implements ListSelectionListener {
   // $VF: synthetic field
   final Class46 my;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         if (Class46.aig(this.my).getSelectedRow() != -1) {
            ;
         }
      }
   }

   Class11(Class46 var1) {
      this.my = var1;
   }
}
