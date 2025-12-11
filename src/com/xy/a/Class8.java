package com.xy.a;

import com.xy.battle.TypeState;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

class Class8 extends JComponent {
   // $VF: synthetic field
   final Class123 ep;
   List<Class16> eq;
   String[] er;
   int ah;

   public Class8(Class123 var1) {
      this.ep = var1;
      this.eq = new ArrayList<>();
   }

   public Class16 dz() {
      Class16 var1 = this.ah < this.eq.size() ? this.eq.get(this.ah) : null;
      if (var1 == null) {
         this.eq.add(var1 = new Class16(this.ep));
         var1.setBounds(22, 2 + this.ah * 30, 115, 25);
         this.add(var1);
      }

      this.ah++;
      return var1;
   }

   public void ea(TypeState var1) {
      this.dz().ea(var1);
   }

   public void t() {
      int var10000 = 0;
      this.setVisible(false);
      this.ah = 0;

      for (int var1 = 0; var10000 < this.eq.size(); var10000 = var1) {
         Object var2 = this.eq.get(var1);
         var1++;
         ((Class16)var2).ea(null);
      }

      this.er = null;
   }
}
