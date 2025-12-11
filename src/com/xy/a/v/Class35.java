package com.xy.a.v;

import com.xy.q.Class54;
import java.awt.Color;
import javax.swing.JLabel;

class Class35 extends Class54 {
   private JLabel di;
   // $VF: synthetic field
   final Class37 adg;

   public void _do(String var1) {
      if (!com.xy.v.Class12.am(this.di.getText(), var1)) {
         this.di.setText(var1);
      }
   }

   public Class35(Class37 var1, com.xy.q.Class30 var2) {
      super(var2);
      this.adg = var1;
      this.di = com.xy.q.Class1.k(4, 4, 42, 14, Color.white, com.xy.q.Class49.n);
      this.add(this.di);
   }
}
