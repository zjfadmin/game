package com.xy.a.a;

import com.xy.entity.Mount;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Class37 implements ListSelectionListener {
   // $VF: synthetic field
   final Class31 aka;

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      try {
         if (Class31.aah(this.aka).getSelectedIndex() >= 0) {
            Mount var3 = this.aka.yx().mounts.get(Class31.aah(this.aka).getSelectedIndex());
            this.aka.b(var3);
            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   Class37(Class31 var1) {
      this.aka = var1;
   }
}
