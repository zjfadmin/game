package com.xy.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class122 implements ListSelectionListener {
   // $VF: synthetic field
   final Class46 asn;

   Class122(Class46 var1) {
      this.asn = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         if (Class46.ph(this.asn).getSelectedRow() != -1) {
            ;
         }
      }
   }
}
