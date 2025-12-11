package com.xy.a.v;

import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;

public class Class24 extends com.xy.q.Class30 {
   private com.xy.w.Class18 gh;
   private int ds;
   private com.xy.q.Class30[] yo;
   private com.xy.i.Class22[] ss;

   public Class24(GameView var1) {
      super(186, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "/=s:sor.29";
      this.yy(-1, 0, 703, 542, com.xy.q.Class30.agh);
      com.xy.w.Class9 var5 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "\u0007霹\u0007厝\u0007";
      this.yu(var5, " 靓 号 ");
      this.ss = new com.xy.i.Class22[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ss.length; var10000 = var2) {
         com.xy.i.Class22[] var3 = this.ss;
         var10004 = "-?q9qofr.29";
         int var10006 = 171 + var2;
         String var7;
         Class24 var10010;
         if (var2 == 0) {
            var7 = "逮霹叐";
            var7 = "选靓号";
            var10010 = this;
         } else if (var2 == 1) {
            var7 = "拼霏厩";
            var7 = "抢靓号";
            var10010 = this;
         } else if (var2 == 2) {
            var7 = "霹叐例筨";
            var7 = "靓号信筏";
            var10010 = this;
         } else {
            var7 = "";
            var10010 = this;
         }

         com.xy.i.Class22 var10002 = new com.xy.i.Class22 ("sc/e/38.png", 2, var10006, Class49.bx, Class49.bv, var7, var10010);
         var3[var2] = var10002;
         this.ss[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.ss[var2].setBounds(60 + 102 * var2, 18, 95, 33);
         this.add(this.ss[var2++]);
      }

      String var10008 = "-?q8qokr.29";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 2, 2, 2, 2, false));
      this.gh.setBounds(36, 33, 638, 20);
      this.add(this.gh);
      this.yo = new com.xy.q.Class30[this.ss.length];
   }

   public void g(int var1) {
      if (var1 == 2) {
         this.gs(var1, null);
      } else {
         String var10003 = "q";
         String var2 = Agreement.getSendTextAES("BEAU", "V" + var1);
         this.za().k(var2);
      }
   }

   public void gs(int var1, Object var2) {
      int var10000 = 0;
      this.ds = var1;

      for (int var3 = 0; var10000 < this.ss.length; var10000 = ++var3) {
         this.ss[var3].setKeep(var1 == var3);
      }

      Class24 var5;
      if (var1 == 0) {
         if (this.yo[0] == null) {
            boolean var10005 = false;
            this.add(this.yo[0] = new Class22(this.afx), 0);
         }

         ((Class22)this.yo[0]).ne((int[])var2);
         var5 = this;
      } else if (var1 == 1) {
         if (this.yo[1] == null) {
            this.add(this.yo[1] = new Class20(this.afx), 0);
         }

         ((Class20)this.yo[1]).ne((int[])var2);
         var5 = this;
      } else {
         if (var1 == 2) {
            if (this.yo[2] == null) {
               this.add(this.yo[2] = new Class0(this.afx), 0);
            }

            ((Class0)this.yo[2]).h();
         }

         var5 = this;
      }

      if (var5.yo[var1] != null) {
         this.yo[var1].setVisible(true);
      }

      int var4;
      for (int var6 = var4 = 0; var6 < this.yo.length; var6 = ++var4) {
         if (this.yo[var4] != null && var1 != var4) {
            this.yo[var4].setVisible(false);
         }
      }
   }

   public void h() {
      if (this.ds == 1 && this.yo[1] != null) {
         ((Class20)this.yo[1]).h();
      }
   }
}
