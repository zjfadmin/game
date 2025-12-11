package com.xy.q;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class32 implements ListSelectionListener {
   // $VF: synthetic field
   final Class44 abv;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         Class60 var2;
         if ((var2 = (Class60)Class44.afq(this.abv).getSelectedValue()) == null) {
            return;
         }

         this.abv.afr(var2);
         this.abv.be(false);
      }
   }

   Class32(Class44 var1) {
      this.abv = var1;
   }
}
