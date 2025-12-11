package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Point;
import javax.swing.JLabel;

public class Class38 extends com.xy.q.Class30 {
   private Class27 aiu;
   private com.xy.w.Class1 aiv = null;
   private long qd;
   private com.xy.w.Class18 gh;
   private Class36[] aiw;
   private int eg;
   private com.xy.q.Class50[] aix;

   public void hk(BWDHTeam var1) {
      if (this.eg == 0) {
         ((Class50)this.aix[0]).hk(var1);
      }
   }

   public void g(int var1) {
      if (com.xy.v.Class22.f() - this.qd < com.xy.v.Class22.h * 5) {
         String var10001 = "佢炫凹皖夨忹亄";
         this.afx._do("你点击的太快了");
      } else {
         this.qd = com.xy.v.Class22.f();
         Activity var2 = this.aiu.wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
         String var10003 = "6\u000ey\u007f";
         String var3 = Agreement.getSendTextAES("activity", var10002.append("|R3#").append(var1).toString());
         this.za().k(var3);
      }
   }

   public void rp(int var1, Object var2) {
      int var10000 = 0;
      this.eg = var1;

      for (int var3 = 0; var10000 < this.aiw.length; var10000 = var3) {
         if (this.aiw[var3].yd(var3 == this.eg)) {
            Class36 var5 = this.aiw[var3];
            String var9;
            if (Class36.zo(this.aiw[var3])) {
               var9 = "aa=f=3!2<r|e";
               var9 = "sc/d/130.png";
            } else {
               var9 = "9?e8emymd,$;";
               var9 = "sc/d/131.png";
            }

            var5.dp(var9);
         }

         Class36 var6 = this.aiw[var3];
         int var11 = (var3 >= this.eg ? 57 : 47) + 93 * var3;
         byte var10002;
         Class38 var10003;
         if (Class36.zo(this.aiw[var3])) {
            var10002 = 51;
            var10003 = this;
         } else {
            var10002 = 52;
            var10003 = this;
         }

         int var12 = Class36.zo(var10003.aiw[var3]) ? 142 : 140;
         var3++;
         var6.setBounds(var11, var10002, var12, 40);
      }

      Class38 var7;
      if (this.eg == 0) {
         if (this.aix[0] == null) {
            boolean var10005 = false;
            this.add(this.aix[0] = new Class50(this), 0);
         }

         ((Class50)this.aix[0]).js((BWDHTeam[])var2);
         var7 = this;
      } else if (this.eg == 1) {
         if (this.aix[1] == null) {
            this.add(this.aix[1] = new Class26(this), 0);
         }

         ((Class26)this.aix[1]).we((BWDHRuleBattle[])var2);
         var7 = this;
      } else {
         if (this.eg == 2 || this.eg == 3) {
            var1 = 2;
            if (this.aix[2] == null) {
               this.add(this.aix[2] = new Class6(this), 0);
            }

            ((Class6)this.aix[2]).gm(this.eg, (BWDHRuleBattle[])var2);
         }

         var7 = this;
      }

      if (var7.aix[var1] != null) {
         this.aix[var1].setVisible(true);
      }

      int var4;
      for (int var8 = var4 = 0; var8 < this.aix.length; var8 = ++var4) {
         if (this.aix[var4] != null && var1 != var4) {
            this.aix[var4].setVisible(false);
         }
      }
   }

   public void f() {
      if (com.xy.v.Class22.f() - this.qd >= com.xy.v.Class22.h * 5) {
         this.qd = com.xy.v.Class22.f();
         Activity var1;
         String var10000 = (var1 = this.aiu.wg()).getActivitySet();
         String var10001 = "贇剼询缤a";
         String var10002 = "~";
         int var2;
         ActivityFC var3 = (var2 = com.xy.v.Class12.f(var10000, "赛制设置=", "|")) > 0 ? this.yt().ba(var2) : null;
         BWDHRule var4 = var3 != null && var3.getType() == 5 ? (BWDHRule)var3.getData() : null;

         int var5;
         for (int var9 = var5 = 0; var9 < this.aiw.length; var9 = ++var5) {
            Class36 var10 = this.aiw[var5];
            Point[] var11;
            Activity var13;
            if (var4 != null) {
               var11 = var4.getRuleTimes(2 + var5);
               var13 = var1;
            } else {
               var11 = null;
               var13 = var1;
            }

            var10.ye(var11, var13);
         }

         var5 = var4 != null ? var4.getRuleIndex((com.xy.v.Class22.f() - var1.getTimeOpen()) / 1000L) : 0;
         var5 = Math.max(Math.min(var5 - 2, 3), 0);
         StringBuilder var12 = new StringBuilder(String.valueOf(var1.getId()));
         var10002 = "6\u000e";
         String var6 = Agreement.getSendTextAES("activity", var12.append("|R").append(var5 + 2).toString());
         this.za().k(var6);
      }
   }

   public void gs(int var1, Object var2) {
      if (var1 != 141 && var1 != 142 && var1 != 143) {
         if (var1 == 146) {
            ((Class26)this.aix[1]).gs(var1, var2);
         }
      } else {
         ((Class50)this.aix[0]).gs(var1, var2);
      }
   }

   public void h() {
      this.aiv = null;
      if (this.aix[0] != null) {
         ((Class50)this.aix[0]).hk(null);
      }
   }

   public Class38(Class27 var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1.afx);
      this.yy(0, 0, 718, 526, com.xy.q.Class30.agf);
      this.aiu = var1;
      this.aiw = new Class36[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aiw.length; var10000 = var2) {
         this.aiw[var2] = new Class36(this, var2);
         Class36 var10003 = this.aiw[var2];
         String var10004 = "9?e8emymd,$;";
         var10003.dp("sc/d/131.png");
         this.aiw[var2].setBounds(47 + var2 * 93, 52, 140, 40);
         this.add(this.aiw[var2++]);
      }

      String var10008 = "aa=f=3!0<r|e";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/132.png", 50, 50, 50, 50, false));
      this.gh.setBounds(41, 88, 615, 376);
      this.add(this.gh);
      this.aix = new com.xy.q.Class50[3];
   }

   public void gm(int var1, BWDHRuleBattle[] var2) {
      this.rp(1, var2);
      JLabel var10000 = Class26.wd((Class26)this.aix[1]).en();
      String var3;
      if (var1 == 0) {
         var3 = "S细";
         var3 = "A组";
      } else if (var1 == 1) {
         var3 = "\b纘";
         var3 = "B组";
      } else if (var1 == 2) {
         var3 = "Q细";
         var3 = "C组";
      } else {
         var3 = "\u000e纘";
         var3 = "D组";
      }

      var10000.setText(var3);
   }

   // $VF: synthetic method
   static void abo(Class38 var0, com.xy.w.Class1 var1) {
      var0.aiv = var1;
   }

   // $VF: synthetic method
   static Class27 abp(Class38 var0) {
      return var0.aiu;
   }

   // $VF: synthetic method
   static com.xy.w.Class1 abq(Class38 var0) {
      return var0.aiv;
   }
}
