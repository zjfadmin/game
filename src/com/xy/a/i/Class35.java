package com.xy.a.i;

import com.xy.q.Class49;
import com.xy.q.Class54;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class35 extends JComponent {
   private JLabel ad;
   private com.xy.w.Class18 gh;
   private com.xy.w.Class18 af;
   // $VF: synthetic field
   final Class15 and;
   private Class54 ft;

   public void t() {
      this.ad.setText(null);
      this.ft.gs(0, null);
   }

   // $VF: synthetic method
   static JLabel agn(Class35 var0) {
      return var0.ad;
   }

   // $VF: synthetic method
   static Class54 ago(Class35 var0) {
      return var0.ft;
   }

   public Class35(Class15 var1) {
      this.and = var1;
      this.ad = com.xy.q.Class1.k(4, 4, 50, 16, Color.white, Class49.ac);
      this.add(this.ad);
      this.ft = new Class54(var1.eg());
      this.ft.setBounds(4, 4, 50, 50);
      this.add(this.ft);
      String var10010 = "\u0016`JgJ7Ks\u000bd";
      this.af = new com.xy.w.Class18("sc/d/4.png");
      String var10009 = "7\bk\u000fkXtE4\u0005#";
      this.gh = new com.xy.w.Class18("sc/d/30.png");
      this.af.setBounds(0, 0, 59, 57);
      this.gh.setBounds(1, 57, 58, 1);
      this.add(this.af);
      this.add(this.gh);
   }
}
