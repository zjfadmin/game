package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import java.awt.Point;
import javax.swing.JLabel;

public class Class23 extends com.xy.q.Class30 {
   private long qa;
   private Class10 wm;
   private Class40 wn;
   private com.xy.w.Class18[] fd;
   private com.xy.w.Class18 gh;
   private Class31[] wo;
   private int eg;
   private Class27 wp;

   public void rp(int var1, Object var2) {
      int var10000 = 0;
      this.eg = var1;

      for (int var3 = 0; var10000 < this.wo.length; var10000 = var3) {
         if (this.wo[var3].yd(var3 == this.eg)) {
            Class31 var4 = this.wo[var3];
            String var6;
            if (Class31.yc(this.wo[var3])) {
               var6 = "\u0018IDND\u001bX\u001aEZ\u0005M";
               var6 = "sc/d/130.png";
            } else {
               var6 = "}:!=!h=h )`>";
               var6 = "sc/d/131.png";
            }

            var4.dp(var6);
         }

         Class31 var5 = this.wo[var3];
         int var8 = (var3 >= this.eg ? 57 : 47) + 93 * var3;
         byte var10002;
         Class23 var10003;
         if (Class31.yc(this.wo[var3])) {
            var10002 = 51;
            var10003 = this;
         } else {
            var10002 = 52;
            var10003 = this;
         }

         int var9 = Class31.yc(var10003.wo[var3]) ? 142 : 140;
         var3++;
         var5.setBounds(var8, var10002, var9, 40);
      }

      if (this.eg == 0) {
         this.wm.js((BWDHTeam[])var2);
         this.wm.setVisible(true);
         this.wn.setVisible(false);
      } else {
         Class40.acu(this.wn).setVisible(this.eg == 1);
         this.wn.acv((BWDHRuleBattleRecord[])var2);
         this.wn.setVisible(true);
         this.wm.setVisible(false);
      }
   }

   public void g(int var1) {
      if (com.xy.v.Class22.f() - this.qa < com.xy.v.Class22.h * 5) {
         String var10001 = "伹炷冢皊女忥仟";
         this.afx._do("你点击的太快了");
      } else {
         this.qa = com.xy.v.Class22.f();
         Activity var2 = this.wp.wg();
         StringBuilder var10002 = new StringBuilder(String.valueOf(var2.getId()));
         String var10003 = "\u0017gX\t";
         String var3 = Agreement.getSendTextAES("activity", var10002.append("|M3#").append(var1).toString());
         this.za().k(var3);
      }
   }

   public Class23(Class27 var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1.afx);
      this.yy(0, 0, 718, 526, com.xy.q.Class30.agf);
      this.wp = var1;
      this.wo = new Class31[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.wo.length; var10000 = var2) {
         this.wo[var2] = new Class31(this, var2);
         Class31 var10003 = this.wo[var2];
         String var10004 = "}:!=!h=h )`>";
         var10003.dp("sc/d/131.png");
         this.wo[var2].setBounds(47 + var2 * 93, 52, 140, 40);
         this.add(this.wo[var2++]);
      }

      this.wm = new Class10(this);
      this.wn = new Class40(this);
      this.wm.setBounds(0, 0, 718, 526);
      this.wn.setBounds(0, 0, 718, 526);
      this.add(this.wm);
      this.add(this.wn);
      this.fd = new com.xy.w.Class18[2];

      for (int var4 = var2 = 0; var4 < this.fd.length; var4 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class23 var5;
         if (var2 == 0) {
            var5 = this;
            com.xy.w.Class18 var6 = this.fd[var2];
            String var9 = "\u0018IDND\u001b[\u001fEZ\u0005M";
            var6.mt(com.xy.w.Class16.m("sc/d/105.png", 3, 3, 3, 3, false));
            this.fd[var2].setBounds(636, 118, 6, 336);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var10001 = this.fd[var2];
               String var7 = "}:!=!h:j )`>";
               var10001.mt(com.xy.w.Class16.m("sc/d/143.png", 10, 10, 10, 10, false));
               this.fd[var2].setBounds(48, 95, 601, 21);
            }

            var5 = this;
         }

         var5.add(this.fd[var2++]);
      }

      String var10006 = "\u0018IDND\u001bX\u0018EZ\u0005M";
      this.gh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/132.png", 50, 50, 50, 50, false));
      this.gh.setBounds(41, 88, 615, 376);
      this.add(this.gh);
   }

   public void rq(int var1, BWDHRuleBattleRecord[] var2) {
      this.rp(1, var2);
      JLabel var10000 = Class40.acu(this.wn).en();
      String var3;
      if (var1 == 0) {
         var3 = "Z\u001c彑抈伦赱";
         var3 = "16强抢位赛";
      } else if (var1 == 1) {
         var3 = "a弴拻佃贂";
         var3 = "8强抢位赛";
      } else {
         var3 = "\u001e彑抈伦赱";
         var3 = "4强抢位赛";
      }

      var10000.setText(var3);
   }

   public void h() {
      if (com.xy.v.Class22.f() - this.qa >= com.xy.v.Class22.h * 5) {
         this.qa = com.xy.v.Class22.f();
         Activity var1;
         String var10000 = (var1 = this.wp.wg()).getActivitySet();
         String var10001 = "贂券诧罠d";
         String var10002 = "V";
         int var2;
         ActivityFC var3 = (var2 = com.xy.v.Class12.f(var10000, "赛制设置=", "|")) > 0 ? this.yt().ba(var2) : null;
         BWDHRule var4 = var3 != null && var3.getType() == 5 ? (BWDHRule)var3.getData() : null;

         int var5;
         for (int var9 = var5 = 0; var9 < this.wo.length; var9 = ++var5) {
            Class31 var10 = this.wo[var5];
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
         var10002 = "r\u0014";
         String var6 = Agreement.getSendTextAES("activity", var12.append("|M").append(var5 + 2).toString());
         this.za().k(var6);
      }
   }

   // $VF: synthetic method
   static Class27 rr(Class23 var0) {
      return var0.wp;
   }

   public void gs(int var1, Object var2) {
      if (var1 == 161) {
         Activity var6 = this.wp.wg();
         int var7 = (Integer)var2;
         StringBuilder var9 = new StringBuilder(String.valueOf(var6.getId()));
         String var10 = "r\u001a";
         String var8 = Agreement.getSendTextAES("activity", var9.append("|C").append(var7).toString());
         this.za().k(var8);
      } else {
         if (var1 == 162) {
            Activity var3 = this.wp.wg();
            int var4 = (Integer)var2;
            StringBuilder var10001 = new StringBuilder(String.valueOf(var3.getId()));
            String var10002 = "\u0017I";
            String var5 = Agreement.getSendTextAES("activity", var10001.append("|c").append(var4).toString());
            this.za().k(var5);
         }
      }
   }
}
