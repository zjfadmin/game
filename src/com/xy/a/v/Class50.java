package com.xy.a.v;

import com.xy.bean.RoleShow;
import com.xy.readbean.Activity;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;

class Class50 extends com.xy.q.Class50 {
   private int gz;
   // $VF: synthetic field
   final Class38 axy;
   private com.xy.i.Class7[] axz;
   private Class12[] aya;
   private com.xy.i.Class22[] ayb;
   private BWDHTeam[] ayc;
   private com.xy.w.Class18 gh;
   private com.xy.w.Class18 af;
   private int eg;
   private com.xy.i.Class22[] ss;

   public BWDHTeam ann(int var1) {
      int var2 = 0;
      int var3 = this.ayc != null ? this.ayc.length : 0;

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         if (this.ayc[var2].getId() == var1) {
            return this.ayc[var2];
         }
      }

      return null;
   }

   public void t() {
      int var1 = 0;
      int var2 = this.gz * this.ayb.length;

      for (int var10000 = var1; var10000 < this.ayb.length; var2++) {
         BWDHTeam var3 = this.ayc != null && var2 < this.ayc.length ? this.ayc[var2] : null;
         if (var3 != null) {
            this.ayb[var1].setKeep(this.eg == var3.getId());
         }

         var10000 = ++var1;
      }
   }

   public void gs(int var1, Object var2) {
      if (var1 != 141 && var1 != 142) {
         if (var1 == 143) {
            int var6 = (Integer)var2;
            Activity var7 = Class38.abp(this.axy).wg();
            StringBuilder var10002 = new StringBuilder(String.valueOf(var7.getId()));
            String var10003 = "+3";
            String var5 = Agreement.getSendTextAES("activity", var10002.append("|T").append(var6).toString());
            this.axy.za().k(var5);
         }
      } else {
         int var3 = this.ayc != null ? Math.max((this.ayc.length - 1) / this.ayb.length, 0) : 0;
         int var4 = this.gz;
         int var10000;
         if (var1 == 141) {
            var4 = var4 == 0 ? var3 : var4 - 1;
            var10000 = var4;
         } else {
            if (var1 == 142) {
               var4 = var4 == var3 ? 0 : var4 + 1;
            }

            var10000 = var4;
         }

         if (var10000 != this.gz) {
            this.n(var4);
         }
      }
   }

   public void hk(BWDHTeam var1) {
      this.eg = var1 != null ? var1.getId() : 0;
      if (var1 == null) {
         int var6;
         for (int var10 = var6 = 0; var10 < this.aya.length; var10 = var6) {
            this.aya[var6++].kt(null);
         }

         com.xy.i.Class7 var11 = this.axz[1];
         String[] var14 = new String[4];
         String var10004 = "陷";
         var14[0] = "队";
         var10004 = "佪";
         var14[1] = "伍";
         var10004 = "呥";
         var14[2] = "名";
         var10004 = "禗";
         var14[3] = "称";
         var11.tg(var14);
         this.t();
      } else {
         BWDHTeam var2;
         if ((var2 = this.ann(var1.getId())) == null) {
            this.hk(null);
         } else {
            var1.setName(var2.getName());
            RoleShow[] var3 = var1.getRoleShows();

            int var4;
            for (int var10000 = var4 = 0; var10000 < this.aya.length; var10000 = var4) {
               RoleShow var5 = var4 < var3.length ? var3[var4] : null;
               this.aya[var4++].kt(var5);
            }

            String[] var7 = new String[var1.getName().length()];

            int var8;
            for (int var9 = var8 = 0; var9 < var7.length; var9 = var8) {
               String var10002 = var1.getName();
               int var12 = var8;
               var10002 = var10002.substring(var8, var8 + 1);
               var8++;
               var7[var12] = var10002;
            }

            this.axz[1].tg(var7);
            this.t();
         }
      }
   }

   public Class50(Class38 var1) {
      this.axy = var1;
      this.setBounds(0, 0, 718, 526);
      this.ss = new com.xy.i.Class22[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ss.length; var10000 = var2) {
         com.xy.i.Class22[] var7 = this.ss;
         String var26;
         if (var2 == 0) {
            var26 = "$\u0004x\u0002xVbQy\u00179\u0000";
            var26 = "sc/e/156.png";
         } else {
            var26 = "t\u000b(\r(Y2])\u0018i\u000f";
            var26 = "sc/e/155.png";
         }

         com.xy.i.Class22 var10001 = new com.xy.i.Class22(var26, 1, 141 + var2, var1.eg());
         var7[var2] = var10001;
         Class50 var8;
         if (var2 == 0) {
            var8 = this;
            this.ss[var2].setBounds(76, 150, 18, 25);
         } else {
            if (var2 == 1) {
               this.ss[var2].setBounds(631, 150, 18, 25);
            }

            var8 = this;
         }

         var8.add(this.ss[var2++]);
      }

      this.axz = new com.xy.i.Class7[2];

      for (int var9 = var2 = 0; var9 < this.axz.length; var9 = var2) {
         String[] var10;
         if (var2 == 0) {
            var10 = new String[4];
            String var10003 = "烞";
            var10[0] = "点";
            var10003 = "冓";
            var10[1] = "击";
            var10003 = "枂";
            var10[2] = "查";
            var10003 = "督";
            var10[3] = "看";
         } else {
            var10 = new String[4];
            String var22 = "陸";
            var10[0] = "队";
            var22 = "佥";
            var10[1] = "伍";
            var22 = "呪";
            var10[2] = "名";
            var22 = "禘";
            var10[3] = "称";
         }

         String[] var3 = var10;
         this.axz[var2] = new com.xy.i.Class7(null, -1, 0, com.xy.q.Class49.ao, null, var3, var1.eg());
         com.xy.i.Class7 var14 = this.axz[var2];
         String var15 = "t\u0004`#aVeW";
         var14.setForeground(com.xy.q.Class49.c("#c7D6120"));
         Class50 var11;
         if (var2 == 0) {
            var11 = this;
            this.axz[var2].setBounds(58, 124, 20, 120);
         } else {
            if (var2 == 1) {
               this.axz[var2].setBounds(58, 278, 20, 120);
            }

            var11 = this;
         }

         var11.axz[var2].wp(new com.xy.v.Class32(1, 20, 0, 0));
         this.add(this.axz[var2++]);
      }

      this.ayb = new com.xy.i.Class22[16];

      for (int var12 = var2 = 0; var12 < this.ayb.length; var12 = var2) {
         String var10007 = "t\u000b(\r(Y1[)\u0018i\u000f";
         this.ayb[var2] = new com.xy.i.Class22("sc/e/163.png", 2, 143, com.xy.q.Class49.k, com.xy.q.Class49.bv, "", var1.eg());
         this.ayb[var2].setBounds(94 + var2 % 4 * 138, 109 + var2 / 4 * 27, 121, 27);
         this.add(this.ayb[var2++]);
      }

      this.aya = new Class12[5];

      for (int var13 = var2 = 0; var13 < this.aya.length; var13 = var2) {
         this.aya[var2] = new Class12(var1);
         this.aya[var2].setBounds(72 + 108 * var2, 230, 135, 200);
         this.aya[var2].setVisible(false);
         this.add(this.aya[var2++]);
      }

      String var10006 = "$\u0004x\u0003xVdTy\u00179\u0000";
      this.af = new com.xy.w.Class18("sc/d/133.png");
      this.af.setBounds(54, 249, 29, 164);
      this.add(this.af);
      String var28 = "\u001bdGcG1^)\u0018i\u000f";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/66.png", 50, 1, 50, 1, false));
      this.gh.setBounds(94, 228, 532, 2);
      this.add(this.gh);
   }

   public void n(int var1) {
      this.gz = var1;
      int var2 = 0;
      int var3 = var1 * this.ayb.length;

      for (int var10000 = var2; var10000 < this.ayb.length; var3++) {
         BWDHTeam var4 = this.ayc != null && var3 < this.ayc.length ? this.ayc[var3] : null;
         if (var4 == null) {
            this.ayb[var2].setVisible(false);
         } else {
            this.ayb[var2].setText(var4.getName());
            this.ayb[var2].setName(String.valueOf(var4.getId()));
            this.ayb[var2].setKeep(this.eg == var4.getId());
            this.ayb[var2].setVisible(true);
         }

         var10000 = ++var2;
      }
   }

   public void js(BWDHTeam[] var1) {
      this.ayc = var1;
      this.n(0);
   }
}
