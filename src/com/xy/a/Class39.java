package com.xy.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class39 implements ListSelectionListener {
   // $VF: synthetic field
   final Class103 ta;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         this.ta.g(Class103.aff(this.ta).getSelectedIndex());
      }
   }

   Class39(Class103 var1) {
      this.ta = var1;
   }
}
