package com.xy.a;

import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class32 implements ListSelectionListener {
   // $VF: synthetic field
   final Class59 rn;

   Class32(Class59 var1) {
      this.rn = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         int var2;
         if ((var2 = Class59.uy(this.rn).getSelectedRow()) != -1) {
            this.rn.uz((Vector<Object>)Class59.va(this.rn).get(var2));
         }
      }
   }
}
