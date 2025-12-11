package com.xy.a;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class66 extends JComponent {
   private com.xy.q.Class54 fe;
   private JLabel di;
   // $VF: synthetic field
   final Class74 q;

   public Class66(Class74 var1) {
      this.q = var1;
      this.fe = new com.xy.q.Class54(var1.eg());
      String var10005 = "V}\n}\n+\u0011";
      this.fe.mt(com.xy.w.Class16.m("sc/c/54", 6, 6, 6, 6, false));
      this.fe.wp(com.xy.q.Class54.aul);
      this.fe.setBounds(1, 2, 22, 22);
      this.add(this.fe);
      this.di = com.xy.q.Class1.f(0, 22, 24, 16, 0, Color.white, com.xy.q.Class49.e);
      this.add(this.di);
   }

   // $VF: synthetic method
   static com.xy.q.Class54 wi(Class66 var0) {
      return var0.fe;
   }

   // $VF: synthetic method
   static JLabel wj(Class66 var0) {
      return var0.di;
   }

   public void t() {
      this.fe.gs(0, null);
      this.di.setText(null);
      this.setVisible(false);
   }
}
