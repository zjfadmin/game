package com.xy.a.v;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;

public class Class27 extends com.xy.q.Class30 {
   private com.xy.i.Class22 abw;
   private com.xy.q.Class30[] abx;
   private int ae;
   private Activity aby;
   private com.xy.i.Class7[] abz;
   private com.xy.w.Class18 dn;

   public void h() {
      String var10000 = this.aby.getActivitySet();
      String var10001 = "覗刕讧昂n";
      String var10002 = "\"";
      int var1;
      ActivityFC var2 = (var1 = com.xy.v.Class12.f(var10000, "规则说明=", "|")) > 0 ? this.yt().ba(var1) : null;
      if (var2 != null) {
         var10000 = var2.getValue();
      } else {
         var10000 = "返杹讲缽诸晝斋板";
         var10000 = "还未设置说明文本";
      }

      String var3 = var10000;
      new StringBuffer(var3.length());
      int var5 = 0;
      int var6 = 0;
      var10000 = var3;

      Class27 var15;
      while (true) {
         var10001 = "%";
         if ((var5 = var10000.indexOf("{", var6)) == -1) {
            var15 = this;
            break;
         }

         var10001 = ".";
         if ((var6 = var3.indexOf("}", var5 + 1)) == -1) {
            var15 = this;
            break;
         }

         String var7;
         var10000 = var7 = var3.substring(var5 + 1, var6);
         var10001 = "%";
         if (var10000.indexOf("{") != -1) {
            var10000 = var3;
            var5++;
         } else {
            int var8 = var3.length();
            var3 = wh(var7, var3, this.aby.getTimeOpen());
            var6 += var3.length() - var8;
            var10000 = var3;
         }
      }

      com.xy.a.Class17 var16 = (com.xy.a.Class17)var15.zc().j(180);
      var10001 = "毘欵夫佉览削";
      var16.es("比武大会规则", var3);
   }

   public Class27(GameView var1) {
      super(176, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "/=s:sonfr.29";
      this.yy(-1, 0, 718, 526, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/128.png", 0, 0, 0, 0, false), null);
      this.wp(new com.xy.v.Class32(0, 0, 25, 0));
      String var10008 = "\u007f0#6#b:a\"#b4";
      this.agi.setImage("sc/e/162.png");
      this.agi.setBounds(641, 30, 27, 27);
      var10008 = "/=s;sodor.29";
      this.abw = new com.xy.i.Class22("sc/e/181.png", 1, 140, this);
      this.abw.setBounds(610, 28, 31, 31);
      this.add(this.abw);
      this.abz = new com.xy.i.Class7[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abz.length; var10000 = var2) {
         String[] var4;
         if (var2 == 0) {
            var4 = new String[4];
            String var10003 = "陌";
            var4[0] = "队";
            var10003 = "体";
            var4[1] = "伍";
            var10003 = "亘";
            var4[2] = "介";
            var10003 = "纓";
            var4[3] = "绍";
         } else if (var2 == 1) {
            var4 = new String[4];
            String var8 = "糭";
            var4[0] = "精";
            var8 = "強";
            var4[1] = "彩";
            var8 = "殇";
            var4[2] = "比";
            var8 = "贅";
            var4[3] = "赛";
         } else if (var2 == 2) {
            var4 = new String[4];
            String var12 = "贈";
            var4[0] = "赛";
            var12 = "嬽";
            var4[1] = "季";
            var12 = "呞";
            var4[2] = "名";
            var12 = "歿";
            var4[3] = "次";
         } else {
            var4 = new String[4];
            String var16 = "夅";
            var4[0] = "奖";
            var16 = "咟";
            var4[1] = "品";
            var16 = "将";
            var4[2] = "展";
            var16 = "祤";
            var4[3] = "示";
         }

         String[] var3 = var4;
         var10009 = "\u007f0#6#b:g\"#b4";
         this.abz[var2] = new com.xy.i.Class7("sc/e/164.png", 2, 7 + var2, com.xy.q.Class49.ar, null, var3, this);
         this.abz[var2].setBounds(673, 48 + var2 * 106, 45, 106);
         this.abz[var2].ne(com.xy.q.Class49.v);
         this.abz[var2].wp(new com.xy.v.Class32(12, 26, 0, 0));
         this.add(this.abz[var2++]);
      }

      var10008 = "/=s:songr.29";
      this.dn = new com.xy.w.Class18("sc/d/129.png");
      this.dn.setBounds(113, 2, 160, 57);
      this.add(this.dn);
      this.abx = new com.xy.q.Class30[this.abz.length];
   }

   public int dx() {
      return this.ae;
   }

   public com.xy.q.Class30[] wf() {
      return this.abx;
   }

   public void g(int var1) {
      int var10000 = 0;
      this.ae = var1;

      for (int var2 = 0; var10000 < this.abz.length; var10000 = var2) {
         this.abz[var2].be(var2 == this.ae);
         com.xy.i.Class7 var4 = this.abz[var2];
         String var7;
         if (var2 == this.ae) {
            var7 = "/0;\u0017:b>c";
            var7 = "#c7D6120";
         } else {
            var7 = "\u007f=\u0019k\u0018n\u001dg";
            var7 = "#cE5D0A9";
         }

         Color var9 = com.xy.q.Class49.c(var7);
         var2++;
         var4.setForeground(var9);
      }

      Class27 var5;
      if (var1 == 0) {
         if (this.abx[0] == null) {
            boolean var10005 = false;
            this.add(this.abx[0] = new Class38(this), 0);
         }

         ((Class38)this.abx[0]).f();
         var5 = this;
      } else if (var1 == 1) {
         if (this.abx[1] == null) {
            this.add(this.abx[1] = new Class23(this), 0);
         }

         ((Class23)this.abx[1]).h();
         var5 = this;
      } else if (var1 == 2) {
         if (this.abx[2] == null) {
            this.add(this.abx[2] = new Class45(this), 0);
         }

         ((Class45)this.abx[2]).h();
         var5 = this;
      } else {
         if (var1 == 3) {
            if (this.abx[3] == null) {
               this.add(this.abx[3] = new Class2(this), 0);
            }

            ((Class2)this.abx[3]).h();
         }

         var5 = this;
      }

      if (var5.abx[var1] != null) {
         this.abx[var1].setVisible(true);
      }

      int var3;
      for (int var6 = var3 = 0; var6 < this.abx.length; var6 = ++var3) {
         if (this.abx[var3] != null && var1 != var3) {
            this.abx[var3].setVisible(false);
         }
      }
   }

   public Activity wg() {
      return this.aby;
   }

   public static String wh(String var0, String var1, long var2) {
      String var4 = null;
      String var10001 = "斨閨d";
      String var10000;
      if (var0.startsWith("时间:")) {
         var10000 = var4 = com.xy.v.Class22.i(var2 + BWDHRule.b(var0, 3, var0.length()) * 1000L);
      } else {
         var10001 = "斶朓i";
         if (var0.startsWith("日期:")) {
            long var5 = var2 + BWDHRule.b(var0, 3, var0.length()) * 1000L;
            var10001 = "%'%'q\u0013\u0011s8:";
            var4 = com.xy.v.Class22.j(var5, "yyyy-MM-dd");
         }

         var10000 = var4;
      }

      if (var10000 == null) {
         return var1;
      } else {
         String var10003 = "(";
         StringBuilder var8 = new StringBuilder("{").append(var0);
         String var10002 = "#";
         return var1.replace(var8.append("}").toString(), var4);
      }
   }

   @Override
   public void l() {
      this.aby = null;
      List var1 = this.afx.baseView.rs();
      int var2;
      int var10000 = var2 = 0;

      Class27 var5;
      while (true) {
         if (var10000 >= var1.size()) {
            var5 = this;
            break;
         }

         com.xy.i.Class21 var3;
         Activity var4 = (var3 = (com.xy.i.Class21)var1.get(var2)).il() > 100 && var3.il() < 200 ? this.yt().cd(var3.il()) : null;
         if (var4 != null && var4.getModelId() == 3) {
            var5 = this;
            this.aby = var4;
            break;
         }

         var10000 = ++var2;
      }

      if (var5.aby != null) {
         this.g(0);
         super.l();
      }
   }

   @Override
   public boolean ah() {
      if (this.abx[0] != null) {
         ((Class38)this.abx[0]).h();
      }

      return super.ah();
   }
}
