package com.xy.a.q;

import com.xy.readbean.aCard;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class0 implements ListSelectionListener {
   // $VF: synthetic field
   final Class103 cx;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         int var2;
         if ((var2 = Class103.alr(this.cx).getSelectedRow()) != -1) {
            Vector var3 = (Vector)Class103.alo(this.cx).get(var2);
            aCard var4 = this.cx.yt().bx().getaMap().get((Integer)var3.get(4));
            this.cx.alp(var4);
         }
      }
   }

   Class0(Class103 var1) {
      this.cx = var1;
   }
}
