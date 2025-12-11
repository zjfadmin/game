package com.xy.a.w;

import com.xy.q.Class60;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class29 implements ListSelectionListener {
   // $VF: synthetic field
   final Class10 awg;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         Class60 var2;
         if ((var2 = (Class60)Class10.lg(this.awg).getSelectedValue()) == null) {
            return;
         }

         this.awg.li(var2);
      }
   }

   Class29(Class10 var1) {
      this.awg = var1;
   }
}
