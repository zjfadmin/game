package com.xy.a.a;

import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseValue;
import com.xy.readbean.MoneyType;
import java.awt.Color;
import javax.swing.JLabel;

class Class11 extends com.xy.q.Class50 {
   private com.xy.q.Class52 ls;
   private JLabel[] lt;
   // $VF: synthetic field
   final Class22 lu;
   private MoneyType lv;
   private com.xy.q.Class36 lw;
   private long lx;
   private com.xy.i.Class4[] ly;
   private com.xy.q.Class27 lz;
   private com.xy.q.Class14 p;

   public void ig(BaseMountSH var1) {
      this.lx = BaseValue.getSHMoney(var1.getLvl());
      this.ls.l();
      this.lw.setText(String.valueOf(1));
   }

   // $VF: synthetic method
   static com.xy.q.Class27 ih(Class11 var0) {
      return var0.lz;
   }

   public Class11(Class22 var1) {
      this.lu = var1;
      this.lx = 0L;
      this.lt = new JLabel[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.lt.length; var10000 = var2) {
         this.lt[var2] = com.xy.q.Class1.k(0, 0 + var2 * 31, 72, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var4 = this.lt[var2];
         String var8;
         if (var2 == 0) {
            var8 = "所需金钱";
         } else if (var2 == 1) {
            var8 = "当前金钱";
         } else if (var2 == 2) {
            var8 = "提升点数";
         } else {
            var8 = "";
         }

         var4.setText(var8);
         this.lt[var2].setHorizontalAlignment(10);
         this.add(this.lt[var2++]);
      }

      this.lv = new MoneyType();
      this.lv.setIdAndKey(1, "金 钱");
      this.p = com.xy.q.Class1.i(73, 0, 134, 19, 0, Color.white, com.xy.q.Class49.w);
      this.ls = com.xy.q.Class1.m(73, 31, 134, 19, 0, Color.white, com.xy.q.Class49.w, this.lv, var1.afx);
      this.lw = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.lw.setHorizontalAlignment(0);
      this.lw.setBounds(73, 62, 134, 19);
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.ls.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.lz = new com.xy.q.Class27(15, this.lw, var1.eg());
      this.add(this.p);
      this.add(this.ls);
      this.add(this.lw);
      this.ly = new com.xy.i.Class4[2];

      for (int var5 = var2 = 0; var5 < this.ly.length; var5 = var2) {
         com.xy.i.Class4[] var6 = this.ly;
         int var13 = 211 + var2;
         String var14;
         Class22 var16;
         if (var2 == 0) {
            var14 = "提升修为点";
            var16 = var1;
         } else if (var2 == 1) {
            var14 = "一键提升";
            var16 = var1;
         } else {
            var14 = "";
            var16 = var1;
         }

         com.xy.i.Class4 var11 = new com.xy.i.Class4("sc/e/46.png", 1, var13, com.xy.q.Class49.ch, null, var14, var16.eg());
         var6[var2] = var11;
         this.ly[var2].setForeground(Color.black);
         Class11 var7;
         if (var2 == 0) {
            var7 = this;
            this.ly[var2].setBounds(127, 108, 119, 25);
         } else {
            if (var2 == 1) {
               this.ly[var2].setBounds(0, 108, 119, 25);
            }

            var7 = this;
         }

         var7.add(this.ly[var2++]);
      }
   }

   // $VF: synthetic method
   static MoneyType ii(Class11 var0) {
      return var0.lv;
   }

   // $VF: synthetic method
   static com.xy.q.Class14 ij(Class11 var0) {
      return var0.p;
   }

   // $VF: synthetic method
   static long ik(Class11 var0) {
      return var0.lx;
   }
}
