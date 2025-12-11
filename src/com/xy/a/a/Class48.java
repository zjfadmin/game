package com.xy.a.a;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class48 implements ListSelectionListener {
   // $VF: synthetic field
   final Class15 aou;

   Class48(Class15 var1) {
      this.aou = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         String var2;
         if ((var2 = (String)Class15.km(this.aou).getSelectedValue()) == null || var2.equals("")) {
            return;
         }

         this.aou.kn(Class15.kl(this.aou).yt().bq(var2), false);
      }
   }
}
