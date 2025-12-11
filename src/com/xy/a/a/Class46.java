package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.game.RoleData;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class46 implements ListSelectionListener {
   // $VF: synthetic field
   final Class1 amc;

   Class46(Class1 var1) {
      this.amc = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      if (!var1.getValueIsAdjusting()) {
         String var2;
         if (com.xy.v.Class12.h(var2 = (String)Class1.k(this.amc).getSelectedValue())) {
            return;
         }

         RoleData var3;
         Mount var4 = (var3 = this.amc.yx()) != null ? var3.getChoseMount() : null;
         if (var4 == null) {
            return;
         }

         this.amc.m(var4, var2);
      }
   }
}
