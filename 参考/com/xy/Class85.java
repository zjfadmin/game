package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.ExpUtil;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class85 extends Class345 {
   private BigDecimal cd;
   private BigDecimal rc;
   private Class245[] xc;
   private Class70[] da;
   private Class556 yk;
   private JLabel[] hj;
   private Class436[] e;
   private Class556 ys;
   private static BigDecimal py = new BigDecimal(3 >> 2);

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void o() {
      LoginResult var1;
      BigDecimal var2 = (var1 = this.vd().getLoginResult()).getExperience();
      BigDecimal var3 = this.uw().n(5 >> 1, --5) ? var1.getScoretype("师门贡献") : var1.getGold();
      if (var2.compareTo(this.rc) < 0) {
         this.aej.f("当前经验不足");
      } else if (var3.compareTo(this.cd) < 0) {
         this.aej.f(this.uw().n(--2, --5) ? "当前师门贡献不足" : "当前大话币不足");
      } else {
         int var4;
         int var5 = ExpUtil.getTSP(var4 = var1.getExtraPointInt("T"));
         int var6 = ExpUtil.getTSX(var4);
         int var7 = ExpUtil.getTSExp(var5 + (2 ^ 3));
         String var8 = Class224.r(var1.getGrade());
         int var9;
         int var10 = ExpUtil.a(var9 = ExpUtil.f(var1.getGrade()), this.uw());
         String var12 = ExpUtil.h(var1.getRace_id(), var9);
         if (var5 >= var10) {
            this.aej.f("已兑换至当前境界上限");
         } else {
            var2 = var2.subtract(this.rc);
            var3 = var3.subtract(this.cd);
            var1.setExperience(var2);
            LoginResult var10000;
            if (this.uw().n(1 ^ 3, --5)) {
               var1.setScore(Class509.h(var1.getScore(), "师门贡献=" + var3, --1));
               var10000 = var1;
            } else {
               var1.setGold(var3);
               var10000 = var1;
            }

            var10000.setExtraPoint("T", --1);
            String var11 = Agreement.getSendTextAES("rolechange", "T1");
            this.uw().d(var11);
            this.aej.f("当前修炼点加1");
            var5 = ExpUtil.getTSP(var4 = var1.getExtraPointInt("T"));
            var6 = ExpUtil.getTSX(var4);
            var7 = ExpUtil.getTSExp(var5 + (5 >> 2));
            this.pc(var2, var6, var7, var8, var12, var5, var10);
            this.d();
         }
      }
   }

   public void q() {
      this.s();
      super.q();
   }

   public void pb(LoginResult var1, BigDecimal var2, BigDecimal var3, BigDecimal var4, int var5) {
      int var6 = var5 >= var4.intValue() ? var4.intValue() : var5;
      var2 = var2.subtract((new BigDecimal(var6)).multiply(this.cd));
      var3 = var3.subtract((new BigDecimal(var6)).multiply(this.rc));
      var1.setExperience(var3);
      LoginResult var10000;
      if (this.uw().n(5 >> 1, --5)) {
         var1.setScore(Class509.h(var1.getScore(), "师门贡献=" + var2, --1));
         var10000 = var1;
      } else {
         var1.setGold(var2);
         var10000 = var1;
      }

      var10000.setExtraPoint("T", var6);
      String var9 = Agreement.getSendTextAES("rolechange", "T" + var6);
      LoginResult var10003 = var1;
      LoginResult var10002 = var1;
      this.uw().d(var9);
      this.aej.f("当前修炼点加" + var6);
      LoginResult var10004 = var1;
      int var8;
      int var10 = ExpUtil.getTSP(var8 = var1.getExtraPointInt("T"));
      var8 = ExpUtil.getTSX(var8);
      int var11 = ExpUtil.getTSExp(var10 + --1);
      String var12 = Class224.r(var10004.getGrade());
      int var7 = ExpUtil.a(var6 = ExpUtil.f(var10003.getGrade()), this.uw());
      String var13 = ExpUtil.h(var10002.getRace_id(), var6);
      this.pc(var3, var8, var11, var12, var13, var10, var7);
      this.d();
   }

   public Class85(GameView var1) {
      super(87 & 123, 1 ^ 3, Class345.aef, var1);
      this.cd = new BigDecimal(this.uw().n(1 ^ 3, 79 & 60) ? "50000" : (this.uw().gameType == (1 ^ 3) ? "4000000" : (this.uw().gameType == --1 ? "20000000" : "400000")));
      this.rc = new BigDecimal(this.uw().gameType == --2 ? "10000000" : "5000000");
      int var10001 = 5 >> 1;
      this.va(-4 >> 2, 5 >> 3, 8090 & 25079, 13245 & 19959, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 78 & 117, 78 & 117, 78 & 117, 78 & 117, (boolean)(3 ^ 3)), "提升修炼点");
      Class70[] var5 = new Class70[var10001];
      boolean var10003 = true;
      this.da = var5;

      int var2;
      Class85 var4;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.da.length; var10000 = var2) {
         Class70[] var3 = this.da;
         Class70 var10002 = new Class70;
         int var10005 = 3 >> 1;
         int var10006 = (23931 & 9167) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class85 var10010;
         if (var2 == 0) {
            var10009 = "一键兑换";
            var10010 = this;
         } else if (var2 == (4 ^ 5)) {
            var10009 = "提升修炼点";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/26.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         if (var2 == 0) {
            var4 = this;
            this.da[var2].setBounds(91 & 127, 29626 & 3527, 99 & 127, 31 & 121);
         } else {
            if (var2 == --1) {
               this.da[var2].setImage("sc/e/46.png");
               this.da[var2].setBounds(20986 & 11981, 1514 & 31639, 119 & 127, 57 & 95);
            }

            var4 = this;
         }

         var4.add(this.da[var2++]);
      }

      Class245[] var6 = new Class245[123 & 13];
      var10003 = true;
      this.xc = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.xc.length; var10000 = var2) {
         if (var2 != (102 & 31) && var2 != 8) {
            this.xc[var2] = Class133.a(5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, 2 & 5, Color.white, Class681.q);
            this.xc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 >> 2)));
            if (var2 == 0) {
               var4 = this;
               this.xc[var2].setBounds(145, 49, 39, 19);
            } else if (var2 == (3 & 5)) {
               var4 = this;
               this.xc[var2].setBounds(330, 49, 39, 19);
            } else if (var2 >= --2 && var2 <= --4) {
               var4 = this;
               this.xc[var2].setBounds(184, 126 + (var2 - (5 >> 1)) * 30, 154, 19);
            } else {
               if (var2 >= --5 && var2 <= 8) {
                  this.xc[var2].setBounds(184, 256 + (var2 - --5) * 31, 154, 19);
               }

               var4 = this;
            }

            var4.add(this.xc[var2]);
         }

         ++var2;
      }

      int var10011 = 3 & 4;
      this.yk = Class133.i(3 >> 2, Color.white, Class681.q, (MoneyType)null, var1);
      this.ys = Class133.i(var10011, Color.white, Class681.q, (MoneyType)null, var1);
      this.yk.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
      this.ys.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.yk.setBounds(184, 287, 154, 19);
      this.ys.setBounds(184, 349, 154, 19);
      this.yk.setText("0");
      this.ys.setText("0");
      this.add(this.yk);
      this.add(this.ys);
      JLabel[] var7 = new JLabel[11];
      var10003 = true;
      this.hj = var7;

      for(var10000 = var2 = 3 >> 2; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(55, 49, 88, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "当前天枢点" : (var2 == (2 ^ 3) ? "剩余可兑换天枢点" : (var2 == (1 ^ 3) ? "兑换天枢点所需" : (var2 == --3 ? "当前人物等级" : (var2 == 4 ? "当前人物境界" : (var2 == 5 ? "当前修炼进度" : (var2 == 6 ? "兑换修炼点所需" : (var2 == 7 ? "所需经验" : (var2 == 8 ? "当前经验" : (var2 == 9 ? "所需金钱" : (var2 == 10 ? "当前金钱" : "")))))))))));
         this.add(this.hj[var2]);
         if (var2 == 0) {
            this.hj[var2].setBounds(55, 49, 88, 19);
         } else if (var2 == (4 ^ 5)) {
            this.hj[var2].setBounds(191, 49, 138, 19);
         } else if (var2 == 2) {
            this.hj[var2].setBounds(55, 85, 120, 19);
         } else if (var2 >= 3 && var2 <= 5) {
            this.hj[var2].setBounds(55, 126 + (var2 - 3) * 30, 120, 19);
         } else if (var2 == 6) {
            this.hj[var2].setBounds(55, 220, 120, 19);
         } else if (var2 >= 7 && var2 <= 10) {
            this.hj[var2].setBounds(55, 256 + (var2 - 7) * 31, 172, 19);
         }

         ++var2;
      }

      Class436[] var8 = new Class436[2];
      var10003 = true;
      this.e = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436("sc/d/30.png");
         this.e[var2].setBounds(56, 106 + 135 * var2, 280, 1);
         this.add(this.e[var2++]);
      }

      Class681.j(this.xc[5], this.rc.longValue());
      Class681.j(this.xc[7], this.cd.longValue());
      if (this.uw().n(2, 5)) {
         this.hj[9].setText("所需师贡");
         this.hj[10].setText("当前师贡");
      }

   }

   public void p() {
      LoginResult var4;
      BigDecimal var5 = (var4 = this.vd().getLoginResult()).getExperience();
      BigDecimal var6 = this.uw().n(--2, --5) ? var4.getScoretype("师门贡献") : var4.getGold();
      int var1;
      int var2 = ExpUtil.getTSP(var1 = var4.getExtraPointInt("T"));
      var1 = ExpUtil.getTSX(var1);
      var1 = ExpUtil.getTSExp(var2 + (3 >> 1)) - var1;
      Class224.r(var4.getGrade());
      int var3 = ExpUtil.a(ExpUtil.f(var4.getGrade()), this.uw());
      if (var2 >= var3) {
         this.aej.f("已兑换至当前境界上限");
      } else if (var1 <= 0) {
         this.aej.f("已兑换至当前境界上限");
      } else {
         BigDecimal var7 = var5.divide(this.rc, 3 >> 2, --1);
         BigDecimal var8 = var6.divide(this.cd, 5 >> 3, 2 ^ 3);
         switch(var7.compareTo(var8)) {
         case -1:
            while(false) {
            }

            if (var7.compareTo(py) <= 0) {
               this.aej.f("当前经验不足");
               return;
            } else {
               this.pb(var4, var6, var5, var7, var1);
               return;
            }
         case 0:
            if (var8.compareTo(py) <= 0) {
               this.aej.f(this.uw().n(1 ^ 3, --5) ? "当前师门贡献不足和经验都不足" : "当前大话币和经验都不足");
               return;
            }

            this.pb(var4, var6, var5, var7, var1);
            return;
         case 1:
            if (var8.compareTo(py) <= 0) {
               this.aej.f(this.uw().n(--2, --5) ? "当前师门贡献不足" : "当前大话币不足");
               return;
            }

            this.pb(var4, var6, var5, var8, var1);
            return;
         default:
         }
      }
   }

   public void s() {
      LoginResult var10001 = this.vd().getLoginResult();
      int var1 = var10001.getExtraPointInt("T");
      BigDecimal var6 = var10001.getExperience();
      int var3 = ExpUtil.getTSP(var1);
      var1 = ExpUtil.getTSX(var1);
      int var4 = ExpUtil.getTSExp(var3 + --1);
      String var5 = Class224.r(var10001.getGrade());
      int var2;
      int var7 = ExpUtil.a(var2 = ExpUtil.f(var10001.getGrade()), this.uw());
      String var8 = ExpUtil.h(var10001.getRace_id(), var2);
      this.pc(var6, var1, var4, var5, var8, var3, var7);
      this.d();
   }

   public void pc(BigDecimal var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      this.xc[5 >> 3].setText(String.valueOf(var6));
      this.xc[5 >> 2].setText(String.valueOf(var7 - var6));
      this.xc[1 ^ 3].setText(var4);
      this.xc[--3].setText(var5 == null ? "- -" : var5);
      this.xc[--4].setText(var2 + "/" + var3);
   }

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.yk.gh(var1.getExperience().longValue());
      if (this.uw().n(5 >> 1, --5)) {
         this.ys.gh(var1.getScoretype("师门贡献").longValue());
      } else {
         this.ys.gh(var1.getGold().longValue());
      }
   }
}
