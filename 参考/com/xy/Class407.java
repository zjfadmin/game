package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class407 extends Class345 {
   private Class436[] nn;
   private Class319 aux;
   private Class44 aob;
   private Class585 auy;
   private Class489[] auz;
   private Class614 ava;
   private Class436 r;
   private Class245 yl;
   private Class217[] dc;
   private JLabel[] u;

   public Class614 xi() {
      return this.ava;
   }

   public void q() {
      this.d();
      this.ava.d();
      this.aob.c(2 & 5, (Object)null);
      this.dc[--1].setText("0");
      super.q();
   }

   public Long x(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.aob.tp() != 0) {
         if (this.aob.tp() == (4 ^ 5)) {
            Goodstable var5 = (Goodstable)this.aob.hr();
            if (var1 > (long)var5.getUsetime() && var5.getUsetime() <= (32751 & 1015)) {
               return var5.getUsetime().longValue();
            }
         } else if (this.aob.tp() == (63 & 78)) {
            PartJade var6 = (PartJade)this.aob.hr();
            int var4 = (int)this.aob.gl();
            if (var1 > (long)var6.getJade(var4) && var6.getJade(var4) <= (22511 & 11255)) {
               return (long)var6.getJade(var4);
            }
         }

         return var1 > 9999L ? 9999L : null;
      } else {
         return 0L;
      }
   }

   public Class217[] ajz() {
      return this.dc;
   }

   public void z(long var1, JTextField var3) {
      if (var1 <= 0L) {
         Class681.j(this.yl, 0L);
      } else if (this.aob.tp() == (2 ^ 3)) {
         Class681.j(this.yl, 3L * var1);
      } else if (this.aob.tp() == (111 & 30)) {
         Class681.j(this.yl, (long)MsgUntil.h((int)this.aob.gl()) * var1);
      } else {
         Class681.j(this.yl, 0L);
      }
   }

   public void y(int var1) {
      if (var1 == (123 & 13)) {
         Goodstable var2;
         PartJade var3;
         int var4;
         RoleData var9;
         Goodstable var10000;
         label40: {
            var9 = this.vd();
            var2 = null;
            var3 = null;
            var4 = 5 >> 3;
            if (this.aob.tp() == 5 >> 2) {
               if ((var2 = (Goodstable)this.aob.hr()) != null) {
                  var10000 = var2 = var9.getGood(var2.getRgid());
                  break label40;
               }
            } else if (this.aob.tp() == (15 & 126)) {
               var3 = (PartJade)this.aob.hr();
               var4 = (int)this.aob.gl();
            }

            var10000 = var2;
         }

         if (var10000 == null && var3 == null) {
            this.aej.fw("请选择你要兑换的玉符或玄玉。");
            return;
         }

         int var5;
         if ((var5 = (int)this.aux.gl()) <= 0) {
            this.aej.f("请输入你要兑换的玉符或玄玉的数量。");
            return;
         }

         int var6 = 0;
         SuitOperBean var7 = new SuitOperBean();
         var7.setType(103 & 31);
         PartJade var8;
         if (var3 != null) {
            var8 = new PartJade(var3.getSuitid(), var3.getPartId());
            var8.setJade(var4, var5);
            var6 = MsgUntil.h(var4) * var5;
            var7.setJade(var8);
            var3.b(var4, var5);
         } else if (var2 != null) {
            if (var5 > var2.getUsetime()) {
               this.aej.f("物品数量不足");
               return;
            }

            (var8 = new PartJade(-1L, -4 >> 2)).setJade1(var5);
            ArrayList var10;
            (var10 = new ArrayList()).add(var2.getRgid());
            var7.setGoods(var10);
            var7.setJade(var8);
            var6 = var5 * --3;
            var2.ab(var5);
            if (var2.getUsetime() <= 0) {
               var9.h(var2.getRgid());
            }
         }

         String var11 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var7));
         this.uw().d(var11);
         this.aej.fw("获得了 " + var6 + " 点灵修值..");
         this.aob.c(3 & 4, (Object)null);
         this.dc[--1].setText("0");
      }

   }

   public Class407(GameView var1) {
      int var10001 = --3;
      int var10004 = 5 >> 3;
      int var10008 = -4 >> 2;
      super(127 & 63, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 2 & 5, 27583 & 5743, 31743 & 1519, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 109 & 86, 109 & 86, 109 & 86, 109 & 86, (boolean)(2 & 5)), "兑换灵修值");
      this.ak((boolean)var10004);
      this.ad(new Class116(63 & 78, 3 >> 2, 127 & 7, 3 >> 2));
      Class489[] var5 = new Class489[var10001];
      boolean var10003 = true;
      this.auz = var5;

      int var2;
      Class407 var4;
      int var10000;
      for(var10000 = var2 = 3 & 4; var10000 < this.auz.length; var10000 = var2) {
         Class489[] var3 = this.auz;
         Class489 var10002 = new Class489;
         int var10005 = 3 & 5;
         int var10006 = (31 & 103) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class407 var10010;
         if (var2 == 0) {
            var10009 = "高级查询";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "兑换";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/28.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.auz[var2].setBounds(29651 & 3439, 127 & 24, 68 & 127, 19 & 126);
         if (var2 == 0) {
            var4 = this;
            this.auz[var2].setFont(Class681.bm);
         } else if (var2 == (3 & 5)) {
            var4 = this;
            this.auz[var2].setImage("sc/e/65.png");
            this.auz[var2].setBounds(27631 & 5623, 24 & 127, 90 & 55, 90 & 55);
         } else {
            if (var2 == (1 ^ 3)) {
               this.auz[var2].setForeground(Color.black);
               this.auz[var2].setImage("sc/e/7.png");
               this.auz[var2].setBounds(107 & 117, 15807 & 17405, 59, 25);
            }

            var4 = this;
         }

         var4.add(this.auz[var2++]);
      }

      var10001 = --5;
      this.r = new Class436();
      this.r.setBounds(45, 255, 17, 17);
      this.add(this.r);
      this.ava = new Class614(this, this.r);
      this.ava.ce().setBounds(46, 64, 165, 187);
      this.add(this.ava.ce());
      this.ava.by().setBounds(216, 44, 306, 210);
      this.add(this.ava.by());
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.u = var6;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.c(46, 43, 165, 21, 10, Class681.c("#c000000"), Class681.ak);
         this.u[var2].setText(var2 == 0 ? "套装列表" : (var2 == (3 & 5) ? "只显示已有玉符" : (var2 == 5 >> 1 ? "玉符或九玄仙玉" : (var2 == --3 ? "兑换数量" : (var2 == --4 ? "可获得灵修值" : "")))));
         if (var2 == 0) {
            var4 = this;
            this.u[var2].setForeground(Class681.c("#cFFFFFF"));
            this.u[var2].setHorizontalAlignment(2 & 5);
         } else if (var2 == (4 ^ 5)) {
            var4 = this;
            this.u[var2].setFont(Class681.ab);
            this.u[var2].setBounds(63, 256, 100, 14);
         } else if (var2 == 5 >> 1) {
            var4 = this;
            this.u[var2].setHorizontalAlignment(3 ^ 3);
            this.u[var2].setBounds(36, 340, 180, 18);
         } else {
            if (var2 >= --3 && var2 <= --4) {
               this.u[var2].setBounds(58, 371 + 35 * (var2 - --3), 120, 17);
            }

            var4 = this;
         }

         var4.add(this.u[var2++]);
      }

      Class217[] var7 = new Class217[5 >> 1];
      var10003 = true;
      this.dc = var7;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.dc.length; var10000 = var2) {
         this.dc[var2] = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)), Class681.q, Color.white);
         if (var2 == 0) {
            this.dc[var2].setBounds(396, 23, 110, 20);
            var10000 = var2;
         } else {
            this.dc[var2].setBounds(55, 387, 144, 19);
            var10000 = var2;
         }

         if (var10000 == 1) {
            this.aux = new Class319(15, this.dc[var2], this);
         }

         this.add(this.dc[var2++]);
      }

      this.yl = Class133.a(55, 422, 144, 19, 10, Color.white, Class681.q);
      this.yl.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.add(this.yl);
      this.aob = new Class44(this);
      this.aob.setBounds(100, 284, 50, 50);
      this.add(this.aob);
      Class436[] var9 = new Class436[6];
      var10003 = true;
      this.nn = var9;

      for(var10000 = var2 = 5 >> 3; var10000 < this.nn.length; var10000 = var2) {
         this.nn[var2] = new Class436();
         this.add(this.nn[var2]);
         if (var2 == 0) {
            this.nn[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 & 4)));
            this.nn[var2].setBounds(46, 43, 165, 21);
         } else if (var2 == --1) {
            this.nn[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
            this.nn[var2].setBounds(46, 43, 165, 210);
         } else if (var2 == 2) {
            this.nn[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, (boolean)(3 ^ 3)));
            this.nn[var2].setBounds(214, 44, 308, 210);
         } else if (var2 == 3) {
            this.nn[var2].fw("sc/d/4.png");
            this.nn[var2].setBounds(96, 280, 59, 57);
         } else if (var2 == 4) {
            this.nn[var2].fw("sc/d/30.png");
            this.nn[var2].setBounds(97, 337, 58, 1);
         } else if (var2 == 5) {
            this.nn[var2].eq(Class511.q("sc/d/19.png", 5, 5, 5, 5, false));
            this.nn[var2].setBounds(214, 259, 309, 207);
         }

         ++var2;
      }

      this.auy = new Class585(this, 6, 4, 51, 51, 0, 0, 215, 261);
      this.auy.hf(Class511.a("sc/d/18.png"));
      this.auy.gb(true);
      this.add(this.auy);
   }

   public void d() {
      Class216[] var10001;
      Class407 var10002;
      if (this.auy.aiz() != null) {
         var10001 = this.auy.aiz().f();
         var10002 = this;
      } else {
         var10001 = null;
         var10002 = this;
      }

      Class216[] var1 = this.vg(var10001, var10002.vd().goodPacks.length / (26 & 125), this.auy.t(), 5 >> 3, 10027 & 23263, 6559 & 26467);
      this.auy.aiw(var1, 2 & 5);
   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(2 ^ 3);
   }

   public Class44 u() {
      return this.aob;
   }
}
