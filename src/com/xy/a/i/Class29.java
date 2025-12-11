package com.xy.a.i;

import com.xy.readbean.RoleSuitBean;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class29 implements ListSelectionListener {
   // $VF: synthetic field
   final Class15 aiq;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         RoleSuitBean var2;
         if ((var2 = this.aiq.yt().bs().a((String)Class15.ll(this.aiq).getSelectedValue())) == null) {
            return;
         }

         this.aiq.lk(var2);
      }
   }

   Class29(Class15 var1) {
      this.aiq = var1;
   }
}
