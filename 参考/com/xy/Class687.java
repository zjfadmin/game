package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class687 extends Class345 {
   private Class44[] gb;
   private JLabel[] er;
   private BigDecimal cf;
   private Class643 kr;
   private Class245 eu;
   private Class556 ks;
   private MoneyType am;
   private Class436[] an;
   private Class357 cw;

   public void ey(Goodstable var1, int var2, int var3) {
      if (var3 == 0) {
         this.gb[1 ^ 3].c(3 & 4, (Object)null);
      } else {
         var1 = (Goodstable)var1.clone();
         var1.setRgid((BigDecimal)null);
         var1.setValue(var2 + "|" + var3);
         this.gb[5 >> 1].c(3 >> 1, var1);
      }
   }

   public void av(Goodstable var1) {
      Point var2 = var1.nd();
      this.gb[2 & 5].c(5 >> 2, var1);
      this.fq(var1, var2);
      this.ve().a(this.ae());
   }

   public void ax(Goodstable var1) {
      if (var1.getType() == 811L) {
         if (this.gb[3 >> 2].tp() == --1 && this.gb[4 ^ 5].tp() != 3 >> 1) {
            Goodstable var4 = (Goodstable)this.gb[3 >> 2].hr();
            Point var3;
            if ((var4 = this.vd().getGood(var4.getRgid())) == null) {
               var3 = var1.nd();
               this.gb[3 & 4].c(--1, var1);
               this.fq(var1, var3);
            } else if (!fp(var4, var1)) {
               this.aej.f("不符合升级公式");
            } else if (var4.getUsetime() > --1 || !Class394.v(var4.getRgid(), var1.getRgid())) {
               var3 = var1.nd();
               this.gb[3 & 5].c(--1, var1);
               this.ey(var1, var3.x, fs(var3.y, var4.nd().y));
            }
         } else {
            Point var2 = var1.nd();
            this.gb[3 ^ 3].c(--1, var1);
            this.fq(var1, var2);
         }
      }
   }

   public static boolean fp(Goodstable var0, Goodstable var1) {
      return (boolean)(fs(var0.nd().y, var1.nd().y) != 0 ? 3 & 5 : 0);
   }

   public void fq(Goodstable var1, Point var2) {
      int var6 = 5 >> 3;
      int var10;
      Class687 var10000;
      if (var2.y == (3 & 5) || var2.y >= (91 & 46) && var2.y <= (110 & 31)) {
         var6 = var2.y;
         var10000 = this;
      } else {
         if (var2.y < 5 >> 1 || var2.y > (107 & 29)) {
            int var4;
            for(var10 = var4 = 1; var10 < 3; var10 = var4) {
               Class44 var11 = this.gb[var4];
               ++var4;
               var11.c(5 >> 3, (Object)null);
            }

            return;
         }

         var10000 = this;
         var6 = var2.y - (5 >> 2);
      }

      RoleData var9 = var10000.vd();
      String var5 = var2.x + "|" + var6;
      if (this.gb[--1].tp() == 3 >> 1) {
         Goodstable var3 = (Goodstable)this.gb[5 >> 2].hr();
         if ((var3 = var9.getGood(var3.getRgid())) != null && var3.getType() == 811L && Class394.r(var3.getValue(), var5) && (var1.getUsetime() > --1 || !Class394.v(var1.getRgid(), var3.getRgid()))) {
            this.ey(var3, var2.x, fs(var2.y, var6));
            return;
         }
      }

      int var8;
      for(var10 = var8 = 0; var10 < var9.goodPacks.length; var10 = var8) {
         Goodstable var7;
         if ((var7 = var9.getGood(var9.goodPacks[var8])) != null && var7.getType() == 811L && Class394.r(var7.getValue(), var5) && (var1.getUsetime() > 3 >> 1 || !Class394.v(var1.getRgid(), var7.getRgid()))) {
            this.gb[3 >> 1].c(3 & 5, var7);
            this.ey(var7, var2.x, fs(var2.y, var6));
            return;
         }

         ++var8;
      }

   }

   public void y(int var1) {
      if (var1 == (7133 & 25855)) {
         if (this.vd().getLoginResult().getGold().compareTo(this.cf) < 0) {
            this.aej.fw("金币不足..");
            return;
         }

         if (this.gb[5 >> 3].tp() != (4 ^ 5) || this.gb[--1].tp() != --1) {
            this.aej.f("请先凑齐物品");
            return;
         }

         Goodstable var4 = (Goodstable)this.gb[3 & 4].hr();
         var4 = this.vd().getGood(var4.getRgid());
         Goodstable var2 = (Goodstable)this.gb[3 & 5].hr();
         var2 = this.vd().getGood(var2.getRgid());
         if (var4 == null || var2 == null) {
            this.aej.f("物品不在背包");
            return;
         }

         ArrayList var3;
         (var3 = new ArrayList()).add(var4.getRgid());
         var3.add(var2.getRgid());
         SuitOperBean var5 = new SuitOperBean();
         int var10004 = 511 & 32407;
         var5.setGoods(var3);
         var5.setType(var10004);
         String var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var5));
         int var10002 = 5 >> 3;
         this.uw().d(var6);
         var1 = var10002;

         for(int var10000 = var1; var10000 < this.gb.length; var10000 = var1) {
            Class44 var7 = this.gb[var1];
            ++var1;
            var7.c(3 ^ 3, (Object)null);
         }
      }

   }

   public void fr(Class44 var1) {
      if (var1 != this.gb[1 ^ 3]) {
         if (var1.tp() == --1) {
            var1.c(3 ^ 3, (Object)null);
            this.gb[1 ^ 3].c(3 >> 2, (Object)null);
         }
      }
   }

   public static int fs(int var0, int var1) {
      if (var0 == var1) {
         if (var0 == 3 >> 1 || var0 >= (46 & 91) && var0 <= (30 & 111)) {
            return var0 + (4 ^ 5);
         }
      } else if (Math.abs(var1 - var0) == --1 && (var1 = Math.max(var0, var1)) >= (1 ^ 3) && var1 <= (95 & 41)) {
         return var1 + (2 ^ 3);
      }

      return 0;
   }

   public Class687(GameView var1) {
      int var10001 = --5;
      int var10005 = -4 >> 2;
      super(5631 & 27324, --2, Class345.aef, var1);
      this.cf = new BigDecimal(200000);
      this.va(var10005, 2 & 5, 15321 & 18046, 29679 & 3513, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 71 & 124, 71 & 124, 71 & 124, 71 & 124, (boolean)(3 >> 2)), "升级玄印");
      JLabel[] var6 = new JLabel[var10001];
      boolean var10003 = true;
      this.er = var6;

      int var2;
      Class687 var5;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.er.length; var10000 = var2) {
         if (var2 < 0 || var2 > --2) {
            this.er[var2] = Class133.c(41 & 126, 29147 & 3766, 15590 & 17307, 95 & 50, 31 & 106, Color.white, Class681.cn);
            this.er[var2].setText(var2 >= 0 && var2 <= --2 ? "10级" : (var2 == --3 ? "消耗金钱" : (var2 == --4 ? "拥有金钱" : "")));
            if (var2 != 0 && var2 != --1) {
               if (var2 == --2) {
                  var5 = this;
                  this.er[var2].setBounds(16893 & 16051, 14575 & 18418, 48, 16);
               } else {
                  if (var2 == --3 || var2 == --4) {
                     this.er[var2].setBounds(80, 300 + (var2 - --3) * 29, 72, 19);
                  }

                  var5 = this;
               }
            } else {
               var5 = this;
               this.er[var2].setBounds((126 & 125) + (127 & 108) * var2, 127 & 113, 125 & 50, 26 & 117);
            }

            var5.add(this.er[var2]);
         }

         ++var2;
      }

      var10001 = --3;
      this.am = new MoneyType();
      this.am.setIdAndKey(4 ^ 5, "金钱");
      this.eu = Class133.a(150, 300, 170, 19, 10, Color.white, Class681.q);
      this.eu.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.add(this.eu);
      this.ks = Class133.i(10, Color.white, Class681.q, this.am, var1);
      this.ks.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
      this.ks.ab(1 ^ 3);
      this.ks.setBounds(150, 329, 170, 19);
      this.add(this.ks);
      Class681.j(this.eu, this.cf.longValue());
      Class44[] var7 = new Class44[var10001];
      var10003 = true;
      this.gb = var7;

      for(var10000 = var2 = 5 >> 3; var10000 < this.gb.length; var10000 = var2) {
         this.gb[var2] = new Class44(this);
         this.gb[var2].ad(Class44.adw);
         this.gb[var2].eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
         this.gb[var2].gt((boolean)(3 & 4));
         if (var2 == 5 >> 1) {
            var5 = this;
            this.gb[var2].setBounds(175, 194, 48, 48);
         } else {
            var5 = this;
            this.gb[var2].setBounds(122 + 108 * var2, 81, 48, 48);
         }

         var5.add(this.gb[var2++]);
      }

      Class216[] var10 = new Class216[5 >> 1];
      boolean var8 = true;
      Class216[] var4 = var10;

      int var3;
      for(var10000 = var3 = 3 & 4; var10000 < var4.length; var10000 = var3) {
         var4[var3] = new Class216(var3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, var3, this);
         var4[var3].setBounds(564, 349 + 22 * var3, 18, 18);
         this.add(var4[var3++]);
      }

      this.cw = new Class357(this, 4, 7, 51, 51, 3 ^ 3, 3 ^ 3, 357, 36);
      this.cw.hf(Class511.a("sc/d/18.png"));
      this.cw.aix(var4, 3 >> 1);
      this.add(this.cw);
      long[] var10009 = new long[--1];
      boolean var10011 = true;
      var10009[3 >> 2] = 811L;
      this.cw.ud(var10009);
      this.kr = new Class643("sc/e/174.png", --1, 221, Class681.cm, (Color[])null, "升级", this);
      this.kr.setForeground(Class681.c("#c512B01"));
      this.kr.setBounds(140, 355, 120, 33);
      this.add(this.kr);
      Class436[] var9 = new Class436[2];
      var10003 = true;
      this.an = var9;

      for(var10000 = var3 = 3 ^ 3; var10000 < this.an.length; var10000 = var3) {
         this.an[var3] = new Class436();
         if (var3 == 0) {
            var5 = this;
            this.an[var3].fw("sc/music/230.a");
            this.an[var3].setBounds(164, 131, 68, 60);
         } else {
            if (var3 == --1) {
               this.an[var3].fw("sc/music/229.a");
               this.an[var3].setBounds(56, 25, 288, 376);
            }

            var5 = this;
         }

         var5.add(this.an[var3++]);
      }

   }
}
