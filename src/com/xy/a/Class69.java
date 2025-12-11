package com.xy.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class69 implements ListSelectionListener {
   // $VF: synthetic field
   final Class134 acy;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         int var2;
         if ((var2 = Class134.ani(this.acy).getSelectedIndex()) == -1) {
            return;
         }

         this.acy.g(var2 + 1);
      }
   }

   Class69(Class134 var1) {
      this.acy = var1;
   }
}
