package com.xy.a.a;

import com.xy.formula.BaseMountSH;
import com.xy.readbean.MoneyType;
import java.awt.Color;
import javax.swing.JLabel;

class Class58 extends com.xy.q.Class50 {
   private com.xy.q.Class52 ek;
   private com.xy.q.Class14 ac;
   private long qd;
   // $VF: synthetic field
   final Class22 atj;
   private JLabel[] gj;
   private com.xy.i.Class4 ze;
   private MoneyType ca;

   // $VF: synthetic method
   static long all(Class58 var0) {
      return var0.qd;
   }

   public Class58(Class22 var1) {
      this.atj = var1;
      this.gj = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.gj.length; var10000 = var2) {
         this.gj[var2] = com.xy.q.Class1.k(0, 0 + var2 * 31, 90, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var3 = this.gj[var2];
         String var4;
         if (var2 == 0) {
            var4 = "托霋灭先普";
            var4 = "所需灵元晶";
         } else if (var2 == 1) {
            var4 = "彔剛灲兕晱";
            var4 = "当前灵元晶";
         } else {
            var4 = "";
         }

         var3.setText(var4);
         this.gj[var2].setHorizontalAlignment(10);
         this.add(this.gj[var2++]);
      }

      this.ca = new MoneyType();
      this.ca.setIdAndMax(-4, 107L);
      this.ac = com.xy.q.Class1.i(91, 0, 116, 19, 0, Color.white, com.xy.q.Class49.w);
      this.ek = com.xy.q.Class1.m(91, 31, 116, 19, 0, Color.white, com.xy.q.Class49.w, this.ca, var1.afx);
      String var10004 = "kh7o7:/%he\u007f";
      this.ac.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      String var10003 = "tu(r('08wx`";
      this.ek.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ac);
      this.add(this.ek);
      String var10009 = "x{$}$/%he\u007f";
      String var10014 = "窗砳";
      this.ze = new com.xy.i.Class4("sc/e/7.png", 1, 213, com.xy.q.Class49.ch, null, "突破", var1.eg());
      this.ze.setForeground(Color.black);
      this.ze.setBounds(88, 108, 59, 25);
      this.add(this.ze);
   }

   public void ig(BaseMountSH var1) {
      this.ek.l();
      this.qd = var1.getLYJTotal();
      com.xy.q.Class49.b(this.ac, this.qd);
   }
}
