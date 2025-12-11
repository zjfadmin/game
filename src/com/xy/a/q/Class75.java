package com.xy.a.q;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class75 implements ListSelectionListener {
   // $VF: synthetic field
   final Class64 akf;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         this.akf.ci((String)Class64.zy(this.akf).getSelectedValue());
      }
   }

   Class75(Class64 var1) {
      this.akf = var1;
   }
}
