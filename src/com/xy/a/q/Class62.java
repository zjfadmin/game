package com.xy.a.q;

import com.xy.bean.ChongjipackBean;
import com.xy.bean.XXGDBean;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import java.util.List;

class Class62 extends com.xy.w.Class18 {
   private ChongjipackBean agr;
   private RichLabel in;
   private com.xy.q.Class54[] rh;
   // $VF: synthetic field
   final Class55 ags;
   private com.xy.i.Class19 kc;
   private com.xy.q.Class14[] k;
   private int ah;

   // $VF: synthetic method
   static int zh(Class62 var0) {
      return var0.ah;
   }

   public void gy(ChongjipackBean var1, boolean var2) {
      if ((this.agr = var1) == null) {
         this.setVisible(false);
      } else {
         RichLabel var10002 = this.in;
         String var10005 = "\u0003\u001f\u0003\u000e迾纨入偹\u0003\u0017";
         StringBuilder var10004 = new StringBuilder("#Z#K连续充值#R").append(this.agr.getPackgradetype());
         var10005 = "\u001a\u000e夐";
         var10002.setTextSize(var10004.append("#K天").toString(), 400);
         this.in.setBounds(280, 16, this.in.getWidth(), this.in.getHeight());
         this.ah = 0;
         List var3 = ChongjipackBean.getGoods(var1.getPackgoods());

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.size(); var10000 = var4) {
            int var10001 = this.ah;
            XXGDBean var10 = (XXGDBean)var3.get(var4);
            var4++;
            this.ah = var10001 + var10.getSum();
         }

         for (int var8 = var4 = 0; var8 < this.k.length; var8 = ++var4) {
            XXGDBean var5 = var4 < var3.size() ? (XXGDBean)var3.get(var4) : null;
            if (var5 == null) {
               this.rh[var4].gs(0, null);
               this.rh[var4].setVisible(true);
               this.k[var4].setVisible(false);
            } else {
               Goodstable var6 = this.ags.yt().ay(var5.getId());
               this.rh[var4].gs(1, var6);
               this.k[var4].setText(String.valueOf(var5.getSum()));
            }
         }

         Class62 var9;
         if (var2) {
            String var11 = "6CjEj\u0015}\u000e5N\"";
            this.kc.setBtn(-1, "sc/e/58.png");
            var9 = this;
         } else {
            String var12 = "J&\u0016 \u0016v\bkI+^";
            this.kc.setBtn(1, "sc/e/31.png");
            var9 = this;
         }

         var9.setVisible(true);
      }
   }

   // $VF: synthetic method
   static ChongjipackBean zi(Class62 var0) {
      return var0.agr;
   }

   public Class62(Class55 var1) {
      super(com.xy.w.Class16.m("sc/d/36.png", 15, 15, 15, 15, false));
      String var10007 = "6CjDj\u0013s\u000e5N\"";
      this.ags = var1;
      String var10009 = "J&\u0016 \u0016v\bkI+^";
      String var10014 = "飃\u0000厓";
      this.kc = new com.xy.i.Class19("sc/e/31.png", 1, 121, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "领 取", var1.eg());
      this.kc.gw(this);
      this.kc.setBounds(473, 18, 79, 25);
      this.add(this.kc);
      this.in = new RichLabel(null, com.xy.q.Class49.bx);
      this.add(this.in);
      this.k = new com.xy.q.Class14[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.k.length; var10000 = var2) {
         int var10005 = 40 + var2 * 52;
         String var10010 = "fZu\t\u0003\u007fu\t";
         this.k[var2] = com.xy.q.Class1.i(var10005, 7, 16, 16, 0, com.xy.q.Class49.c("#c00FF00"), com.xy.q.Class49.bz);
         com.xy.q.Class14 var10002 = this.k[var2];
         String var10003 = "S&\u000f'\u000f6\u0012q\u000e5N\"";
         var10002.mt(com.xy.w.Class16.m("sc/b/s24.png", 3, 3, 3, 3, false));
         this.add(this.k[var2++]);
      }

      this.rh = new com.xy.q.Class54[5];

      for (int var4 = var2 = 0; var4 < this.rh.length; var4 = var2) {
         this.rh[var2] = new com.xy.q.Class54(var1.eg());
         this.rh[var2].wp(com.xy.q.Class54.atu);
         com.xy.q.Class54 var7 = this.rh[var2];
         String var10004 = "6Zj]j\rkI+^";
         var7.mt(com.xy.w.Class16.m("sc/d/4.png", 5, 5, 5, 5, false));
         this.rh[var2].setBounds(7 + var2 * 52, 7, 49, 47);
         this.add(this.rh[var2++]);
      }
   }
}
