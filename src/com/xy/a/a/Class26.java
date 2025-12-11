package com.xy.a.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class26 implements ListSelectionListener {
   // $VF: synthetic field
   final Class34 yn;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         String var2;
         if (com.xy.v.Class12.h(var2 = (String)Class34.ace(this.yn).getSelectedValue())) {
            return;
         }

         this.yn.cp(1, var2);
      }
   }

   Class26(Class34 var1) {
      this.yn = var1;
   }
}
