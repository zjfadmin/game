package com.xy;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseValue;
import com.xy.formula.BaseXuanBao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class134 extends Class345 {
   private Class245[] xc;
   private Class436 et;
   private BigDecimal aaq;
   private Class556 ks;
   private JLabel[] ad;
   private Class643[] xo;
   private BigDecimal py;

   public Class134(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(27391 & 5567, --2, Class345.aef, var1);
      this.aaq = null;
      this.py = new BigDecimal(15000000);
      this.va(var10005, 3 ^ 3, 6007 & 27131, 22901 & 10223, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 116 & 79, 116 & 79, 116 & 79, 116 & 79, (boolean)(3 & 4)), "玄蕴转换");
      Class643[] var5 = new Class643[var10001];
      boolean var10003 = true;
      this.xo = var5;

      int var2;
      Class134 var4;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.xo.length; var10000 = var2) {
         Class643[] var3 = this.xo;
         Class643 var6 = new Class643;
         String var10004 = var2 == 0 ? "sc/e/31.png" : "sc/e/26.png";
         int var10006 = (1535 & 31483) + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class134 var10010;
         if (var2 == 0) {
            var10009 = "修 炼";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "一键修炼";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var6.<init>(var10004, 1, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var6;
         if (var2 == 0) {
            var4 = this;
            this.xo[var2].setBounds(91 & 127, 31730 & 1343, 127 & 79, 89 & 63);
         } else {
            if (var2 == (4 ^ 5)) {
               this.xo[var2].setBounds(8687 & 24280, 2423 & 30650, 99 & 127, 63 & 89);
            }

            var4 = this;
         }

         var4.add(this.xo[var2++]);
      }

      Class245[] var7 = new Class245[94 & 39];
      var10003 = true;
      this.xc = var7;

      for(var10000 = var2 = 2 & 5; var10000 < this.xc.length; var10000 = var2) {
         this.xc[var2] = Class133.a(5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, 2 & 5, Color.white, Class681.q);
         this.xc[var2].eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
         if (var2 >= 0 && var2 <= (1 ^ 3)) {
            var4 = this;
            this.xc[var2].setBounds(1534 & 31417, (59 & 117) + 30 * var2, 154, 19);
         } else if (var2 == --3) {
            var4 = this;
            this.xc[var2].setBounds(184, 179, 154, 19);
         } else if (var2 == --4) {
            var4 = this;
            this.xc[var2].setBounds(184, 241, 154, 19);
         } else {
            if (var2 == --5) {
               this.xc[var2].setBounds(184, 272, 154, 19);
            }

            var4 = this;
         }

         var4.add(this.xc[var2++]);
      }

      int var9 = 5 >> 3;
      this.xc[--4].setText("100");
      this.xc[--5].setText("1");
      this.ks = Class133.i(var9, Color.white, Class681.q, (MoneyType)null, var1);
      this.ks.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.ks.setBounds(184, 210, 154, 19);
      this.ks.setText("0");
      this.add(this.ks);
      JLabel[] var8 = new JLabel[8];
      var10003 = true;
      this.ad = var8;

      for(var10000 = var2 = 2 & 5; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c(55, 49 + var2 * 30, 120, 19, 10, Class681.c("#c000000"), Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "玄宝名称" : (var2 == --1 ? "玄宝等级" : (var2 == (1 ^ 3) ? "当前玄蕴" : (var2 == --3 ? "人物经验转换" : (var2 == --4 ? "所需经验" : (var2 == --5 ? "拥有经验" : (var2 == 6 ? "获得玄蕴" : (var2 == 7 ? "转换次数" : ""))))))));
         this.add(this.ad[var2]);
         if (var2 == --3) {
            this.ad[var2].setBounds(55, 143, 120, 19);
         } else if (var2 >= 4 && var2 <= 7) {
            this.ad[var2].setBounds(55, 179 + (var2 - 4) * 31, 72, 19);
         }

         ++var2;
      }

      this.et = new Class436("sc/d/30.png");
      this.et.setBounds(56, 164, 280, 2 ^ 3);
      this.add(this.et);
   }

   public void y(int var1) {
      Goodstable var3;
      RoleData var4;
      if ((var3 = (var4 = this.vd()).getGood(this.aaq)) == null) {
         this.aej.fw("你没有选中的玄宝");
      } else {
         BaseXuanBao var10000 = var3.getBaseXuanBao();
         int var2 = Class224.d(var4.getLoginResult().getGrade());
         int var5 = Class224.g(var4.getLoginResult().getGrade());
         var2 = BaseValue.getlvlMax(var2, var5);
         if (var10000.getLvl() >= var2) {
            this.aej.fw("玄宝等级不能超过人物等级");
         } else {
            String var6 = Agreement.getSendTextAES("user", var3.getRgid() + "|E" + (var1 == (8956 & 24063) ? 9999 & 32767 : 1));
            var4.getGameView().getClient().d(var6);
         }
      }
   }

   public void av(Goodstable var1) {
      if (Class394.v(var1.getRgid(), this.aaq)) {
         BaseXuanBao var2 = var1.getBaseXuanBao();
         this.xc[3 ^ 3].setText(var1.getGoodsname());
         this.xc[--1].setText(var2.getLvl() + "级");
         this.xc[--2].setText(var2.getExp() + "/" + BaseValue.getXuanBaoExp(var2.getLvl()));
         Class681.j(this.xc[--3], this.py.longValue());
      }
   }

   public void ax(Goodstable var1) {
      this.aaq = var1.getRgid();
      BaseXuanBao var2 = var1.getBaseXuanBao();
      this.xc[3 & 4].setText(var1.getGoodsname());
      this.xc[2 ^ 3].setText(var2.getLvl() + "级");
      this.xc[5 >> 1].setText(var2.getExp() + "/" + BaseValue.getXuanBaoExp(var2.getLvl()));
      Class681.j(this.xc[--3], this.py.longValue());
      this.ve().a(this.ae());
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void d() {
      LoginResult var1 = this.vd().getLoginResult();
      this.ks.gh(var1.getExperience().longValue());
   }
}
