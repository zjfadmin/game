package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Class644 extends Class345 {
   private BigDecimal rl;
   private BigDecimal rm;
   private MoneyType rn;
   private Class350 ro;
   private Class245[] rp;
   private Class350 rq;
   private BigDecimal cf;
   private MoneyType rr;
   private Class44[] ct;
   private Class556[] rs;
   private JLabel[] ad;
   private Class489[] rt;
   private Class436[] g;

   public Class44[] iu() {
      return this.ct;
   }

   public void p() {
      int var10000 = 3 >> 2;
      this.rm = this.rl = null;
      this.cf = null;

      for(int var1 = var10000; var10000 < this.rp.length; var10000 = var1) {
         this.rp[var1++].setText((String)null);
      }

      RoleData var4 = this.vd();
      Goodstable var2 = (Goodstable)this.ct[3 & 4].hr();
      Goodstable var3 = (Goodstable)this.ct[5 >> 1].hr();
      if (var2 != null) {
         var2 = var4.getGood(var2.getRgid());
      }

      if (var3 != null) {
         var3 = var4.getGood(var3.getRgid());
      }

      if (var2 != null) {
         this.rl = new BigDecimal(100000);
         Class681.j(this.rp[2 & 5], this.rl.longValue());
         if (var3 != null) {
            this.rm = new BigDecimal(10000000);
            this.cf = new BigDecimal(MsgUntil.getSxlxz(var2.getValue()));
            Class681.j(this.rp[2 ^ 3], this.rm.longValue());
            Class681.j(this.rp[--3], this.cf.longValue());
         }
      }

   }

   public void s() {
      Class679 var10001 = this.ro.aiz();
      int var10003 = 5 >> 3;
      int var10000 = 5 >> 3;
      var10001.i(var10003);
      this.rq.aiz().i(3 & 4);

      for(int var1 = var10003; var10000 < this.ct.length; var10000 = var1) {
         Class44 var2 = this.ct[var1];
         ++var1;
         var2.c(3 & 4, (Object)null);
      }

      this.p();
      this.d();
   }

   public void y(int var1) {
      RoleData var2 = this.vd();
      Goodstable var3 = (Goodstable)this.ct[5 >> 3].hr();
      Goodstable var4 = (Goodstable)this.ct[5 >> 1].hr();
      if (var3 != null) {
         var3 = var2.getGood(var3.getRgid());
      }

      if (var4 != null) {
         var4 = var2.getGood(var4.getRgid());
      }

      ArrayList var5;
      SuitOperBean var6;
      String var7;
      if (var1 == --5) {
         if (var3 == null) {
            this.aej.fw("请选择你要拆解的套装..");
            return;
         }

         if (var3.getGoodlock() == (3 & 5)) {
            this.aej.fw("该物品已被加锁");
            return;
         }

         if (var2.getLoginResult().getGold().compareTo(this.rl) < 0) {
            this.aej.fw("金币不足..");
            return;
         }

         (var5 = new ArrayList()).add(var3.getRgid());
         var6 = new SuitOperBean();
         int var10003 = --5;
         var6.setGoods(var5);
         var6.setType(var10003);
         var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var6));
         this.uw().d(var7);
         var2.getLoginResult().setGold(var2.getLoginResult().getGold().subtract(this.rl));
         this.aej.fw("消耗了10W金币..");
      } else if (var1 == (111 & 22)) {
         if (var3 == null) {
            this.aej.fw("请选择含有套装属性的装备..");
            return;
         }

         if (var4 == null) {
            this.aej.fw("请选择你要转移属性的装备..");
            return;
         }

         if (var3.getGoodlock() == --1 || var4.getGoodlock() == (2 ^ 3)) {
            this.aej.fw("该物品已被加锁");
            return;
         }

         if (GoodType.ai(var3.getType()) != GoodType.ai(var4.getType())) {
            this.aej.fw("装备类型不一致..");
            return;
         }

         if (var2.getLoginResult().getGold().compareTo(this.rm) < 0) {
            this.aej.fw("金币不足..");
            return;
         }

         if (var2.getLoginResult().getScoretype("灵修值").longValue() < this.cf.longValue()) {
            this.aej.fw("灵修值不足..");
            return;
         }

         (var5 = new ArrayList()).add(var3.getRgid());
         var5.add(var4.getRgid());
         var6 = new SuitOperBean();
         int var10004 = 110 & 23;
         var6.setGoods(var5);
         var6.setType(var10004);
         var7 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var6));
         this.uw().d(var7);
         var2.getLoginResult().setGold(var2.getLoginResult().getGold().subtract(this.rm));
         var2.getLoginResult().setScore(Class509.h(var2.getLoginResult().getScore(), "灵修值=" + this.cf.toString(), --3));
         this.aej.fw("消耗了1000W金币..");
         this.aej.fw("消耗了" + this.cf + "点灵修值..");
      }

      int var8;
      for(int var10000 = var8 = 0; var10000 < this.ct.length; var10000 = var8) {
         Class44 var9 = this.ct[var8];
         ++var8;
         var9.c(5 >> 3, (Object)null);
      }

      this.p();
   }

   public void d() {
      RoleData var1;
      long var2 = (var1 = this.vd()).getMoney(this.rr);
      this.rs[3 & 4].gh(var2);
      this.rs[--1].gh(var2);
      var2 = var1.getMoney(this.rn);
      this.rs[5 >> 1].gh(var2);
      this.rs[--3].gh(var2);
   }

   public Class644(GameView var1) {
      int var10001 = 5 >> 1;
      int var10003 = 46 & 127;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10003, 90 & 111, 25070 & 8187, 15295 & 17900, Class345.aei);
      Class489[] var6 = new Class489[var10001];
      boolean var14 = true;
      this.rt = var6;

      int var2;
      int var10000;
      for(var10000 = var2 = 2 & 5; var10000 < this.rt.length; var10000 = var2) {
         Class489[] var5 = this.rt;
         Class489 var10002 = new Class489;
         int var10005 = 3 >> 1;
         int var10006 = --5 + var2;
         Font var10007 = Class681.ak;
         Color[] var10008 = Class681.c;
         String var10009;
         Class644 var10010;
         if (var2 == 0) {
            var10009 = "拆 解";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "转 移";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/31.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var5[var2] = var10002;
         this.rt[var2].setBounds((95 & 121) + (1791 & 31220) * var2, 29573 & 3579, 79 & 127, 25 & 127);
         this.add(this.rt[var2++]);
      }

      JLabel[] var8 = new JLabel[95 & 44];
      var14 = true;
      this.ad = var8;

      Class644 var7;
      for(var10000 = var2 = 5 >> 3; var10000 < this.ad.length; var10000 = var2) {
         this.ad[var2] = Class133.c((111 & 82) + (19455 & 13553) * var2, 123 & 92, 23039 & 9908, 19 & 125, 90 & 47, Class681.c("#c000000"), Class681.ak);
         this.ad[var2].setText(var2 == 0 ? "套装" : (var2 == (2 ^ 3) ? "未合成玉符装备" : (var2 == (1 ^ 3) ? "拆解玉符" : (var2 == --3 ? "转移玉符" : (var2 != --4 && var2 != --5 ? (var2 != 6 && var2 != 7 ? (var2 != 8 && var2 != 9 ? (var2 != 10 && var2 != 11 ? "" : "拥有灵修值") : "消耗灵修值") : "拥有金钱") : "消耗金钱")))));
         if (var2 >= --2 && var2 <= --3) {
            var7 = this;
            this.ad[var2].setForeground(Class681.c("#cFFFFFF"));
            this.ad[var2].setFont(Class681.cw);
            this.ad[var2].setBounds(78 + (var2 - (5 >> 1)) * 244, 249, 100, 23);
         } else {
            if (var2 >= --4 && var2 <= 11) {
               this.ad[var2].setBounds(62 + (var2 - --4) % (5 >> 1) * 244, 349 + (var2 - --4) / (1 ^ 3) * 26, 90, 19);
            }

            var7 = this;
         }

         var7.ad[var2].setBounds(this.ad[var2].getX() - 46, this.ad[var2].getY() - 74, this.ad[var2].getWidth(), this.ad[var2].getHeight());
         this.add(this.ad[var2++]);
      }

      Class245[] var9 = new Class245[--4];
      var14 = true;
      this.rp = var9;
      Class556[] var10 = new Class556[4];
      var14 = true;
      this.rs = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.rp.length; var10000 = var2) {
         this.rp[var2] = Class133.a(3 ^ 3, 3 ^ 3, 3 ^ 3, 3 ^ 3, 10, Color.white, Class681.q);
         this.rp[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
         if (var2 == 0) {
            var7 = this;
            this.rp[var2].setBounds(154, 349, 118, 19);
         } else if (var2 == 3 >> 1) {
            var7 = this;
            this.rp[var2].setBounds(398, 349, 118, 19);
         } else if (var2 == 2) {
            var7 = this;
            this.rp[var2].setBounds(154, 401, 118, 19);
         } else {
            if (var2 == 3) {
               this.rp[var2].setBounds(398, 401, 118, 19);
            }

            var7 = this;
         }

         var7.rp[var2].setBounds(this.rp[var2].getX() - 46, this.rp[var2].getY() - 74, this.rp[var2].getWidth(), this.rp[var2].getHeight());
         this.add(this.rp[var2++]);
      }

      this.rr = new MoneyType();
      this.rn = new MoneyType();
      this.rr.setIdAndKey(3 >> 1, "金钱");
      int var11 = 2 & 5;
      var10000 = 2 & 5;
      this.rn.setIdAndKey(var11, "灵修值");

      for(var2 = var11; var10000 < this.rs.length; var10000 = var2) {
         this.rs[var2] = Class133.i(10, Color.white, Class681.q, (MoneyType)null, var1);
         this.rs[var2].ab(2);
         this.rs[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
         if (var2 == 0) {
            var7 = this;
            this.rs[var2].setBounds(154, 375, 118, 19);
         } else if (var2 == (3 & 5)) {
            var7 = this;
            this.rs[var2].setBounds(398, 375, 118, 19);
         } else if (var2 == 2) {
            var7 = this;
            this.rs[var2].setBounds(154, 427, 118, 19);
         } else {
            if (var2 == 3) {
               this.rs[var2].setBounds(398, 427, 118, 19);
            }

            var7 = this;
         }

         var7.rs[var2].setBounds(this.rs[var2].getX() - 46, this.rs[var2].getY() - 74, this.rs[var2].getWidth(), this.rs[var2].getHeight());
         this.add(this.rs[var2++]);
      }

      Class44[] var12 = new Class44[3];
      var14 = true;
      this.ct = var12;

      for(var10000 = var2 = 3 >> 2; var10000 < this.ct.length; var10000 = var2) {
         this.ct[var2] = new Class44(this);
         if (var2 == 0) {
            var7 = this;
            this.ct[var2].setBounds(95, 207, 50, 50);
         } else {
            if (var2 >= (3 & 5) && var2 <= 2) {
               this.ct[var2].setBounds(287 + (var2 - --1) * 115, 207, 50, 50);
            }

            var7 = this;
         }

         var7.add(this.ct[var2++]);
      }

      Class436[] var13 = new Class436[10];
      var14 = true;
      this.g = var13;

      for(var10000 = var2 = 3 >> 2; var10000 < this.g.length; var10000 = var2) {
         this.g[var2] = new Class436();
         this.add(this.g[var2]);
         if (var2 >= 0 && var2 <= (3 & 5)) {
            var7 = this;
            this.g[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, (boolean)(3 ^ 3)));
            this.g[var2].setBounds(63 + var2 * 241, 108, 207, 105);
         } else if (var2 >= 2 && var2 <= 3) {
            var7 = this;
            this.g[var2].fw("sc/d/34.png");
            this.g[var2].setBounds(58 + (var2 - 2) * 244, 249, 190, 23);
         } else {
            label278: {
               if (var2 >= 4 && var2 <= 6) {
                  this.g[var2].fw("sc/d/4.png");
                  if (var2 == 4) {
                     var7 = this;
                     this.g[var2].setBounds(137, 277, 59, 57);
                     break label278;
                  }

                  if (var2 >= 5 && var2 <= 6) {
                     var7 = this;
                     this.g[var2].setBounds(329 + (var2 - 5) * 115, 277, 59, 57);
                     break label278;
                  }
               } else {
                  if (var2 == 7) {
                     var7 = this;
                     this.g[var2].fw("sc/d/69.png");
                     this.g[var2].setBounds(401, 278, 30, 56);
                     break label278;
                  }

                  if (var2 >= 8 && var2 <= 9) {
                     int var3;
                     Class216[] var4;
                     boolean var15;
                     Class216[] var16;
                     if (var2 == 8) {
                        var16 = new Class216[2];
                        var15 = true;
                        var4 = var16;

                        for(var10000 = var3 = 2 & 5; var10000 < var4.length; var10000 = var3) {
                           if (var3 == 0) {
                              var4[var3] = new Class216("sc/e/42.png", 1, 0, this);
                              var10000 = var3;
                           } else {
                              var4[var3] = new Class216("sc/e/43.png", 1, 1, this);
                              var10000 = var3;
                           }

                           if (var10000 == 0) {
                              var7 = this;
                              var4[var3].setBounds(160, 140, 18, 18);
                           } else {
                              var4[var3].setBounds(189, 140, 18, 18);
                              var7 = this;
                           }

                           var7.add(var4[var3++]);
                        }

                        var7 = this;
                        this.ro = new Class350(2, this, 4, 2, 51, 51, 0, 0, 18, 36);
                        this.ro.hf(Class511.a("sc/d/18.png"));
                        this.ro.aix(var4, 1);
                        this.add(this.ro);
                     } else {
                        var16 = new Class216[2];
                        var15 = true;
                        var4 = var16;

                        for(var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
                           if (var3 == 0) {
                              var4[var3] = new Class216("sc/e/42.png", 1, 0, this);
                              var10000 = var3;
                           } else {
                              var4[var3] = new Class216("sc/e/43.png", 1, 1, this);
                              var10000 = var3;
                           }

                           if (var10000 == 0) {
                              var7 = this;
                              var4[var3].setBounds(401, 140, 18, 18);
                           } else {
                              var4[var3].setBounds(430, 140, 18, 18);
                              var7 = this;
                           }

                           var7.add(var4[var3++]);
                        }

                        var7 = this;
                        this.rq = new Class350(1, this, 4, 2, 51, 51, 0, 0, 259, 36);
                        this.rq.hf(Class511.a("sc/d/18.png"));
                        this.rq.aix(var4, 1);
                        this.add(this.rq);
                     }

                     var7.g[var2].eq(Class511.q("sc/d/33.png", 30, 30, 30, 30, false));
                     this.g[var2].setBounds(52 + (var2 - 8) * 244, 243, 229, 248);
                  }
               }

               var7 = this;
            }
         }

         var7.g[var2].setBounds(this.g[var2].getX() - 46, this.g[var2].getY() - 74, this.g[var2].getWidth(), this.g[var2++].getHeight());
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }
}
