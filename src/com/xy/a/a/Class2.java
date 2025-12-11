package com.xy.a.a;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

class Class2 extends JComponent {
   private JLabel[] r;
   private com.xy.q.Class14[] s;
   private com.xy.q.Class36 t;
   // $VF: synthetic field
   final Class4 u;
   private com.xy.i.Class4[] v;

   public Class2(Class4 var1) {
      this.u = var1;
      this.v = new com.xy.i.Class4[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.v.length; var10000 = var2) {
         com.xy.i.Class4[] var5 = this.v;
         String var30;
         if (var2 == 0) {
            var30 = "sc/e/40.png";
         } else {
            var30 = "sc/e/7.png";
         }

         int var10006 = 3 + var2;
         Font var10007 = var2 == 0 ? com.xy.q.Class49.bz : com.xy.q.Class49.ch;
         String var33;
         Class4 var10010;
         if (var2 == 0) {
            var33 = "改";
            var10010 = var1;
         } else if (var2 == 1) {
            var33 = "跟随";
            var10010 = var1;
         } else if (var2 == 2) {
            var33 = "参战";
            var10010 = var1;
         } else {
            var33 = "";
            var10010 = var1;
         }

         com.xy.i.Class4 var10001 = new com.xy.i.Class4(var30, 1, var10006, var10007, null, var33, var10010.eg());
         var5[var2] = var10001;
         Class2 var6;
         if (var2 == 0) {
            this.v[var2].setBounds(205, 10, 18, 18);
            var6 = this;
         } else {
            this.v[var2].setForeground(Color.black);
            var6 = this;
            this.v[var2].setBounds(56 + 73 * (var2 - 1), 181, 59, 25);
         }

         var6.add(this.v[var2++]);
      }

      this.r = new JLabel[14];

      for (int var7 = var2 = 0; var7 < this.r.length; var7 = var2) {
         this.r[var2] = com.xy.q.Class1.f(0, 0, 0, 0, 0, Color.black, com.xy.q.Class49.ch);
         Class2 var8;
         if (var2 == 0) {
            var8 = this;
            this.r[var2].setBounds(16, 10, 35, 19);
         } else if (var2 >= 1 && var2 <= 12) {
            var8 = this;
            this.r[var2].setBounds(16 + (var2 - 1) % 2 * 108, 31 + (var2 - 1) / 2 * 21, 35, 19);
         } else {
            if (var2 == 13) {
               this.r[var2].setBounds(1, 157, 51, 19);
            }

            var8 = this;
         }

         JLabel var9 = var8.r[var2];
         String var13;
         if (var2 == 0) {
            var13 = "乳名";
         } else if (var2 == 1) {
            var13 = "气质";
         } else if (var2 == 2) {
            var13 = "内力";
         } else if (var2 == 3) {
            var13 = "智力";
         } else if (var2 == 4) {
            var13 = "耐力";
         } else if (var2 == 5) {
            var13 = "名气";
         } else if (var2 == 6) {
            var13 = "道德";
         } else if (var2 == 7) {
            var13 = "叛逆";
         } else if (var2 == 8) {
            var13 = "玩性";
         } else if (var2 == 9) {
            var13 = "亲密";
         } else if (var2 == 10) {
            var13 = "孝心";
         } else if (var2 == 11) {
            var13 = "温饱";
         } else if (var2 == 12) {
            var13 = "疲劳";
         } else if (var2 == 13) {
            var13 = "养育金";
         } else {
            var13 = "";
         }

         var9.setText(var13);
         this.add(this.r[var2++]);
      }

      this.t = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
      this.t.setBounds(52, 10, 172, 19);
      this.add(this.t);
      this.s = new com.xy.q.Class14[13];

      for (int var10 = var2 = 0; var10 < this.s.length; var10 = var2) {
         this.s[var2] = com.xy.q.Class1.i(52 + var2 % 2 * 108, 31 + var2 / 2 * 21, 64, 19, 10, Color.white, com.xy.q.Class49.w);
         this.s[var2].mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
         if (var2 == 12) {
            this.s[var2].setBounds(52, 157, 172, 19);
         }

         this.add(this.s[var2++]);
      }
   }

   // $VF: synthetic method
   static com.xy.i.Class4[] q(Class2 var0) {
      return var0.v;
   }

   // $VF: synthetic method
   static com.xy.q.Class36 r(Class2 var0) {
      return var0.t;
   }

   // $VF: synthetic method
   static com.xy.q.Class14[] s(Class2 var0) {
      return var0.s;
   }

   public void t() {
      int var10000 = 0;
      this.t.setText(null);

      for (int var1 = 0; var10000 < this.s.length; var10000 = var1) {
         this.s[var1++].setText(null);
      }

      this.v[2].setText("参战");
   }
}
