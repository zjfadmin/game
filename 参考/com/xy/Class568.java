package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.RoleSuitBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class568 extends Class345 {
   private Class556 ps;
   private MoneyType no;
   private Class350 pt;
   private Class245 pu;
   private Class436[] pv;
   private JLabel[] hj;
   private Class489 pw;
   private Class44[] px;
   private BigDecimal py;

   public void p() {
      RoleData var1 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.px[2 & 5].hr()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      PartJade var5 = (PartJade)this.px[2 ^ 3].hr();
      if (var2 != null && var5 != null) {
         int var4 = (int)this.px[--1].gl();
         if (this.py.compareTo(var1.getLoginResult().getGold()) > 0) {
            this.aej.fw("金币不足..");
         } else if (var2.getGoodlock() == (4 ^ 5)) {
            this.aej.fw("该物品已被加锁");
         } else {
            SuitOperBean var3 = new SuitOperBean();
            ArrayList var6;
            (var6 = new ArrayList()).add(var2.getRgid());
            PartJade var7 = new PartJade(var5.getSuitid(), var5.getPartId());
            var7.setJade(var4, 3 >> 1);
            var3.setType(--3);
            var3.setGoods(var6);
            var3.setJade(var7);
            String var10 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var3));
            this.uw().d(var10);
            String var9 = GoodType.getExtra(var2.getValue(), "套装属性");
            String[] var11 = var2.getValue().split("\\|");
            String var12 = MsgUntil.p(--1, var9);
            int var10003 = --3;
            var11[3 >> 2] = "套装品质=" + MsgUntil.p(--3, var9);
            var2.setValue(GoodType.o(var11, var10003, var12));
            int var14 = 3 >> 2;
            var5.b(var4, 3 >> 1);
            var1.getLoginResult().setGold(var1.getLoginResult().getGold().subtract(this.py));
            int var8 = var14;

            for(int var10000 = var8; var10000 < this.px.length; var10000 = var8) {
               Class44 var13 = this.px[var8];
               ++var8;
               var13.c(3 >> 2, (Object)null);
            }

            this.aej.fw("消耗了一个" + MsgUntil.s(var4) + "玉符..");
            this.aej.fw("消耗了" + this.py.longValue() / 10000L + "W金币..");
         }
      } else {
         this.aej.fw("请准备要升级的装备和玉符。");
      }
   }

   public void s() {
      this.px[5 >> 2].c(5 >> 3, (Object)null);
      RoleData var1 = this.vd();
      Goodstable var2;
      if ((var2 = (Goodstable)this.px[3 & 4].hr()) != null) {
         var2 = var1.getGood(var2.getRgid());
      }

      if (var2 != null) {
         String var4 = var2.getGoodsname().split("\\·")[3 & 4];
         int var3 = Integer.parseInt(var2.getValue().split("\\|")[--1].split("=")[4 ^ 5]);
         RoleSuitBean var5 = this.vc().v().a(var4);
         PartJade var6;
         int var7;
         if (!(var6 = this.vd().getPackRecord().getPartJade(var5.getSuitID(), var3)).d() && (var7 = MsgUntil.f(MsgUntil.p(3 ^ 3, GoodType.getExtra(var2.getValue(), "套装属性")))) < --5 && var6.getJade(var7 + --1) > 0) {
            this.px[2 ^ 3].c((101 & 126) + var7 + (3 >> 1), var6);
         }

      }
   }

   public Class568(GameView var1) {
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.py = new BigDecimal(this.uw().n(1 ^ 3, 44 & 95) ? 1000000 : (this.uw().gameType == (1 ^ 3) ? 5000000 : 10000000));
      int var10001 = --3;
      this.va(62 & 111, 126 & 75, 5627 & 27630, 4092 & 29103, Class345.aei);
      this.pw = new Class489("sc/e/31.png", --1, --3, Class681.ak, Class681.c, "升 级", this);
      this.pw.setBounds(20341 & 12715, 13779 & 19325, 127 & 79, 125 & 27);
      this.add(this.pw);
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var5;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(123 & 61, 95 & 120, 53 & 111, 91 & 53, 2 & 5, Class681.c("#c000000"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "套装" : (var2 == 5 >> 2 ? "消耗金钱" : (var2 == --2 ? "拥有金钱" : "")));
         if (var2 >= (4 ^ 5) && var2 <= 5 >> 1) {
            this.hj[var2].setBounds(10167 & 22879, (7549 & 25563) + (var2 - (3 & 5)) * (90 & 63), 72, 19);
         }

         this.hj[var2].setBounds(this.hj[var2].getX() - 46, this.hj[var2].getY() - 74, this.hj[var2].getWidth(), this.hj[var2].getHeight());
         this.add(this.hj[var2++]);
      }

      var10001 = 1 ^ 3;
      this.no = new MoneyType();
      this.no.setIdAndKey(4 ^ 5, "现 金");
      this.ps = Class133.m(308, 297, 118, 19, 10, Color.white, Class681.q, this.no, var1);
      this.ps.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)));
      this.ps.ab(1 ^ 3);
      this.pu = Class133.a(308, 271, 118, 19, 10, Color.white, Class681.q);
      this.pu.eq(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(3 & 4)));
      this.add(this.pu);
      this.add(this.ps);
      Class44[] var7 = new Class44[var10001];
      var10003 = true;
      this.px = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.px.length; var10000 = var2) {
         this.px[var2] = new Class44(this);
         this.px[var2].setBounds(241 + var2 * 120, 84, 50, 50);
         this.add(this.px[var2++]);
      }

      Class436[] var8 = new Class436[6];
      var10003 = true;
      this.pv = var8;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.pv.length; var10000 = var2) {
         this.pv[var2] = new Class436();
         this.add(this.pv[var2]);
         Class568 var6;
         if (var2 == 0) {
            var10000 = 5 >> 1;
            this.pv[var2].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(2 & 5)));
            this.pv[var2].setBounds(59, 109, 156, 360);
            Class216[] var10 = new Class216[var10000];
            boolean var9 = true;
            Class216[] var4 = var10;

            int var3;
            for(var10000 = var3 = 5 >> 3; var10000 < var4.length; var10000 = var3) {
               if (var3 == 0) {
                  var4[var3] = new Class216("sc/e/42.png", 5 >> 2, 3 & 4, this);
                  var10000 = var3;
               } else {
                  var4[var3] = new Class216("sc/e/43.png", 3 >> 1, 3 >> 1, this);
                  var10000 = var3;
               }

               if (var10000 == 0) {
                  var6 = this;
                  var4[var3].setBounds(111, 395, 18, 18);
               } else {
                  var4[var3].setBounds(140, 395, 18, 18);
                  var6 = this;
               }

               var6.add(var4[var3++]);
            }

            var6 = this;
            this.pt = new Class350(1 ^ 3, this, --3, 7, 51, 51, 3 ^ 3, 3 ^ 3, 14, 37);
            this.pt.hf(Class511.a("sc/d/18.png"));
            this.pt.aix(var4, 3 & 5);
            this.add(this.pt);
         } else {
            label123: {
               if (var2 >= (4 ^ 5) && var2 <= --3) {
                  this.pv[var2].fw("sc/d/4.png");
                  if (var2 >= --1 && var2 <= 2) {
                     var6 = this;
                     this.pv[var2].setBounds(283 + (var2 - 1) * 120, 154, 59, 57);
                     break label123;
                  }

                  if (var2 == 3) {
                     var6 = this;
                     this.pv[var2].setBounds(343, 254, 59, 57);
                     break label123;
                  }
               } else {
                  if (var2 == 4) {
                     var6 = this;
                     this.pv[var2].fw("sc/d/71.png");
                     this.pv[var2].setBounds(345, 221, 56, 30);
                     break label123;
                  }

                  if (var2 == 5) {
                     this.pv[var2].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, false));
                     this.pv[var2].setBounds(229, 111, 289, 358);
                  }
               }

               var6 = this;
            }
         }

         var6.pv[var2].setBounds(this.pv[var2].getX() - 46, this.pv[var2].getY() - 74, this.pv[var2].getWidth(), this.pv[var2++].getHeight());
      }

      Class681.j(this.pu, this.py.longValue());
   }

   public void d() {
      int var1;
      for(int var10000 = var1 = 2 & 5; var10000 < this.px.length; var10000 = var1) {
         Class44 var2 = this.px[var1];
         ++var1;
         var2.c(2 & 5, (Object)null);
      }

      this.pt.aiz().i(2 & 5);
      this.ps.cc();
   }

   public Class44[] iu() {
      return this.px;
   }
}
