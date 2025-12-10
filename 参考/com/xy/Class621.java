package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseFly;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Fly;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class Class621 extends Class345 {
   private JLabel[] er;
   private Class38 aur;
   private Class19 dt;
   private Class643[] aus;
   private Class436[] be;
   BigDecimal ne;
   private Class44 ae;
   private Class245[] ail;

   public void o() {
      RoleData var1 = this.vd();
      Class603 var2 = this.vc();
      Goodstable var3;
      if ((var3 = var1.getGood(this.ne)) != null) {
         BaseFly var10000 = var3.getBaseFly();
         Fly var6 = var10000.getFly(var2);
         if (var10000.getRl() < var6.getRlMax()) {
            Goodstable var4;
            if ((var4 = var1.az(8902L)) == null) {
               this.aej.fw("背包没有相应的道具");
            } else {
               String var5 = Agreement.getSendTextAES("rolechange", "FR" + var3.getRgid() + "|" + var4.getRgid());
               this.uw().d(var5);
            }
         }
      }
   }

   public void ax(Goodstable var1) {
      if (var1 == null) {
         int var10000 = 3 >> 2;
         this.ne = null;
         this.aus[2 & 5].setVisible((boolean)(3 & 4));
         this.er[5 >> 3].setText((String)null);
         this.er[--4].setText((String)null);
         this.er[--5].setText((String)null);

         for(int var7 = var10000; var10000 < this.ail.length; var10000 = var7) {
            this.ail[var7++].setText((String)null);
         }

      } else {
         RoleData var4 = this.vd();
         Class603 var3 = this.vc();
         this.ne = var1.getRgid();
         BaseFly var5;
         Fly var2 = (var5 = var1.getBaseFly()).getFly(var3);
         this.er[3 >> 2].setText(var2.getName() + "(" + MsgUntil.b(var2.getLvl()) + ")");
         this.ail[3 & 4].setText(var5.getLvl() + "/" + var2.getLvlMax());
         this.ail[2 ^ 3].setText(var5.getExp() + "/" + var2.getTotalExp(var5.getLvl() + (5 >> 2)));
         this.ail[--2].setText(String.valueOf(var4.getGoodTypeNum(29655 & 12015)));
         this.ail[--3].setText(var5.getRl() + "/" + var2.getRlMax());
         this.ail[--4].setText(String.valueOf(var2.getRlUse()));
         Fly var6 = var3.t(var2.getNext());
         this.er[--4].setText(String.valueOf(var2.getSp()));
         this.er[--5].setText(var6 != null ? String.valueOf(var6.getSp()) : null);
         this.aus[3 & 4].setText(var5.getLvl() < var2.getLvlMax() ? "一键升级" : "升阶");
         this.aus[3 ^ 3].setVisible((boolean)(var6 == null && var5.getLvl() >= var2.getLvlMax() ? 3 ^ 3 : 1));
         this.dt = Class330.f(var2.getSn2(), 1 ^ 3, 2 ^ 3, (String)null);
      }
   }

   public void q() {
      if (this.vd() != null) {
         this.d();
         super.q();
      }
   }

   public void p() {
      Goodstable var1;
      if ((var1 = this.vd().getGood(this.ne)) != null) {
         if (var1.getStatus() != 0) {
            this.aej.fw("装备的飞行器无法丢弃");
         } else {
            this.aej.aal(new ConfirmBean(4 ^ 5, var1.getRgid().toString(), "#W确定要将#G" + var1.getGoodsname() + "#W物品丢弃吗?"));
         }
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.dt != null) {
         this.dt.a(var1, 12025 & 20910, 29151 & 3766, --4, Class280.l());
      }

   }

   public Class621(GameView var1) {
      int var10001 = 11 & 125;
      int var10005 = -4 >> 2;
      super(13567 & 19347, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 2 & 5, 13101 & 20183, 30711 & 2476, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 84 & 111, 84 & 111, 84 & 111, 84 & 111, (boolean)(2 & 5)), " 飞 行 ");
      JLabel[] var7 = new JLabel[var10001];
      boolean var10003 = true;
      this.er = var7;

      int var3;
      Class621 var6;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.er.length; var10000 = var3) {
         this.er[var3] = Class133.c(31227 & 1831, (79 & 127) + (var3 - (4 ^ 5)) * (57 & 94), 126 & 73, 83 & 63, 2 & 5, Color.black, Class681.ak);
         this.er[var3].setText(var3 == 0 ? "学习(交流)" : (var3 == --1 ? "等级" : (var3 == 5 >> 1 ? "灵动值" : (var3 == --3 ? "飞行速度" : (var3 == --4 ? "36%" : (var3 == --5 ? "72%" : (var3 == (7 & 126) ? "燃灵值" : (var3 == (39 & 95) ? "每分消耗燃灵值" : (var3 == (30 & 105) ? "1/10" : "")))))))));
         if (var3 == 0) {
            var6 = this;
            this.er[var3].setBounds(13819 & 19231, 47 & 124, 11741 & 21226, 18);
         } else if (var3 != (3 & 5) && var3 != (1 ^ 3)) {
            if (var3 == --3) {
               var6 = this;
               this.er[var3].setBounds(291, 233, 72, 19);
            } else if (var3 == --4) {
               var6 = this;
               this.er[var3].setBounds(363, 233, 38, 19);
               this.er[var3].setFont(Class681.q);
            } else if (var3 == --5) {
               var6 = this;
               this.er[var3].setBounds(434, 233, 38, 19);
               this.er[var3].setFont(Class681.q);
            } else if (var3 == 6) {
               var6 = this;
               this.er[var3].setBounds(69, 241, 52, 19);
            } else if (var3 == 7) {
               var6 = this;
               this.er[var3].setBounds(67, 265, 122, 19);
            } else {
               if (var3 == 8) {
                  this.er[var3].setBounds(219, 374, 60, 19);
                  this.er[var3].setFont(Class681.cd);
               }

               var6 = this;
            }
         } else {
            var6 = this;
            this.er[var3].setHorizontalAlignment(--4);
         }

         var6.add(this.er[var3++]);
      }

      Class643[] var8 = new Class643[--3];
      var10003 = true;
      this.aus = var8;

      for(var10000 = var3 = 5 >> 3; var10000 < this.aus.length; var10000 = var3) {
         Class643[] var13 = this.aus;
         Class643 var9 = new Class643;
         String var10004 = var3 == 0 ? "sc/e/26.png" : (var3 == --1 ? "sc/e/6.png" : "sc/e/7.png");
         int var10006 = 71 + var3;
         Font var10007 = var3 == (4 ^ 5) ? Class681.bm : Class681.ak;
         String var10009;
         Class621 var10010;
         if (var3 == 0) {
            var10009 = "一键升级";
            var10010 = this;
         } else if (var3 == (2 ^ 3)) {
            var10009 = "补充";
            var10010 = this;
         } else if (var3 == 5 >> 1) {
            var10009 = "丢弃";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var9.<init>(var10004, 1, var10006, var10007, (Color[])null, var10009, var10010);
         var13[var3] = var9;
         if (var3 == 0) {
            var6 = this;
            this.aus[var3].setForeground(Color.black);
            this.aus[var3].setBounds(334, 262, 99, 25);
         } else if (var3 == --1) {
            var6 = this;
            this.aus[var3].setBounds(238, 242, 34, 18);
         } else {
            if (var3 == 5 >> 1) {
               this.aus[var3].setForeground(Color.black);
               this.aus[var3].setBounds(405, 372, 59, 25);
            }

            var6 = this;
         }

         var6.add(this.aus[var3++]);
      }

      Class245[] var10 = new Class245[--5];
      var10003 = true;
      this.ail = var10;

      for(var10000 = var3 = 3 & 4; var10000 < this.ail.length; var10000 = var3) {
         this.ail[var3] = Class133.a(2 & 5, 2 & 5, 2 & 5, 2 & 5, 10, var3 != 0 && var3 != (1 ^ 3) ? (var3 == --1 ? Color.red : Color.white) : Color.green, Class681.q);
         this.ail[var3].eq(Class511.q("sc/d/17.png", 3, 3, 3, 3, (boolean)(3 >> 2)));
         if (var3 != 0 && var3 != --1) {
            if (var3 == 2) {
               var6 = this;
               this.ail[var3].setHorizontalAlignment(3 ^ 3);
               this.ail[var3].setBounds(355, 197, 57, 19);
            } else if (var3 == 3) {
               var6 = this;
               this.ail[var3].setBounds(131, 241, 142, 19);
            } else {
               if (var3 == 4) {
                  this.ail[var3].setBounds(199, 265, 74, 19);
               }

               var6 = this;
            }
         } else {
            var6 = this;
            this.ail[var3].setBounds(366, 79 + var3 * 24, 104, 19);
         }

         var6.add(this.ail[var3++]);
      }

      this.ae = new Class44(this);
      this.ae.fw("sc/d/4.png");
      this.ae.fx("sc/item/99102.png");
      this.ae.ad(new Class116(4, 4, 50, 50));
      this.ae.setBounds(353, 132, 59, 57);
      Goodstable var4;
      if ((var4 = this.vc().n(new BigDecimal(66721))) != null && var4.getType() == 8903L) {
         var6 = this;
         this.ae.c(--1, var4);
      } else {
         var6 = this;
         this.ae.removeMouseListener(this.ae);
      }

      var6.add(this.ae);
      Class216[] var14 = new Class216[2];
      boolean var12 = true;
      Class216[] var5 = var14;

      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < var5.length; var10000 = var2) {
         var5[var2] = new Class216(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var2, this);
         if (var2 == 0) {
            var5[var2].setBounds(49, 321, 18, 18);
            var6 = this;
         } else {
            var5[var2].setBounds(470, 321, 18, 18);
            var6 = this;
         }

         var6.add(var5[var2++]);
      }

      this.aur = new Class38(this, 6, 1, 59, 57, 7, 0, 74, 301);
      this.aur.hf(Class511.a("sc/d/4.png"));
      this.aur.aiw(var5, 1);
      this.add(this.aur);
      Class436[] var11 = new Class436[13];
      var10003 = true;
      this.be = var11;

      for(var10000 = var2 = 0; var10000 < this.be.length; var10000 = var2) {
         this.be[var2] = new Class436();
         if (var2 == 0) {
            var6 = this;
            this.be[var2].eq(Class511.q("sc/d/16.png", 2, 2, 2, 2, false));
            this.be[var2].setBounds(63, 45, 210, 190);
         } else if (var2 == 1) {
            var6 = this;
            this.be[var2].fw("sc/d/63.png");
            this.be[var2].setBounds(401, 232, 27, 20);
         } else if (var2 == 2) {
            var6 = this;
            this.be[var2].setVisible(false);
            this.be[var2].eq(Class511.q("sc/d/64.png", 2, 2, 2, 2, false));
         } else if (var2 != 3 && var2 != 4) {
            if (var2 >= 5 && var2 <= 11) {
               this.be[var2].fw("sc/d/30.png");
               if (var2 == 11) {
                  var6 = this;
                  this.be[var2].setBounds(354, 189, 58, 1);
               } else {
                  var6 = this;
                  this.be[var2].setBounds(75 + 66 * (var2 - 5), 358, 58, 1);
               }
            } else {
               if (var2 == 12) {
                  this.be[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, false));
                  this.be[var2].setBounds(46, 32, 440, 264);
               }

               var6 = this;
            }
         } else {
            var6 = this;
            this.be[var2].fw("sc/d/30.png");
            this.be[var2].setBounds(298, 68 + 157 * (var2 - 3), 170, 1);
         }

         var6.add(this.be[var2++]);
      }

   }

   public void s() {
      RoleData var4 = this.vd();
      Class603 var2 = this.vc();
      Goodstable var3;
      if ((var3 = var4.getGood(this.ne)) != null) {
         BaseFly var10000 = var3.getBaseFly();
         Fly var1 = var10000.getFly(var2);
         Fly var7 = var2.t(var1.getNext());
         if (var10000.getLvl() < var1.getLvlMax()) {
            Goodstable var6;
            if ((var6 = var4.az(8903L)) != null) {
               String var8 = Agreement.getSendTextAES("rolechange", "FL" + var3.getRgid() + "|" + var6.getRgid());
               this.uw().d(var8);
            }
         } else {
            if (var7 != null) {
               String var5 = Agreement.getSendTextAES("rolechange", "FJ" + var3.getRgid());
               this.uw().d(var5);
            }

         }
      }
   }


   private synchronized void d() {
      RoleData var1;
      Goodstable var2;
      this.ax((var2 = (var1 = this.vd()).getGood(this.ne)) != null ? var2 : var1.getFlyGood(3 & 4));
      if (this.ne != null) {
         this.ail[--2].setText(String.valueOf(var1.getGoodTypeNum(12263 & 29407)));
      } else {
         this.ail[1 ^ 3].setText((String)null);
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }
}
