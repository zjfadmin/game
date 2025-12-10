package com.xy;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class232 extends Class345 {
   private Class390 cr;
   private Class436[] cs;
   private Class44[] ct;
   private int j;
   private Class489[] cu;
   private Class245 cv;
   private Class357 cw;

   public void s() {
      if (this.cr == null) {
         this.r((boolean)(5 >> 2));
      } else {
         this.r((boolean)(this.cr.isVisible() ? 3 ^ 3 : 1));
      }
   }

   public List<BigDecimal> bj(List<BigDecimal> var1, BigDecimal[] var2) {
      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var2.length; var10000 = var3) {
         Goodstable var4;
         if ((var4 = this.vd().getGoodEquip(var2[var3])) != null) {
            if (var1 == null) {
               var1 = new ArrayList();
            }

            ((List)var1).add(var4.getRgid());
         }

         ++var3;
      }

      return (List)var1;
   }

   public void q() {
      this.d();
      super.q();
   }

   public boolean t() {
      this.ax((Goodstable)null);
      return super.t();
   }

   public Class232(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(18101 & 14831, 5 >> 1, Class345.aef, var1);
      this.j = var10007;
      this.va(var10005, 3 & 4, 32254 & 895, 16895 & 16247, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 68 & 127, 68 & 127, 68 & 127, 68 & 127, (boolean)(5 >> 3)), "点金");
      Class489[] var8 = new Class489[var10001];
      boolean var10003 = true;
      this.cu = var8;

      int var3;
      Class232 var7;
      int var10000;
      for(var10000 = var3 = 3 >> 2; var10000 < this.cu.length; var10000 = var3) {
         Class489[] var6 = this.cu;
         Class489 var9 = new Class489;
         String var10004 = var3 == 0 ? "sc/e/28.png" : "sc/e/7.png";
         int var10006 = (127 & 71) + var3;
         Font var18 = var3 == 0 ? Class681.bm : Class681.ak;
         String var10009;
         Class232 var10010;
         if (var3 == 0) {
            var10009 = "已穿装备";
            var10010 = this;
         } else if (var3 == 5 >> 2) {
            var10009 = "点金";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var9.<init>(var10004, 1, var10006, var18, (Color[])null, var10009, var10010);
         var6[var3] = var9;
         if (var3 == 0) {
            var7 = this;
            this.cu[var3].setBounds(110 & 127, 123 & 127, 60 & 127, 90 & 55);
         } else {
            if (var3 == 5 >> 2) {
               this.cu[var3].setBounds(6829 & 26110, 15038 & 17919, 63 & 123, 59 & 93);
               this.cu[var3].setForeground(Color.black);
            }

            var7 = this;
         }

         var7.add(this.cu[var3++]);
      }

      var10001 = --2;
      this.cv = Class133.a(12537 & 20463, 122 & 127, 92 & 99, 19, 2 & 5, Color.white, Class681.q);
      this.cv.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
      this.add(this.cv);
      Class44[] var10 = new Class44[var10001];
      var10003 = true;
      this.ct = var10;

      for(var10000 = var3 = 3 & 4; var10000 < this.ct.length; var10000 = var3) {
         this.ct[var3] = new Class44(this);
         this.ct[var3].fw("sc/d/4.png");
         this.ct[var3].ad(Class44.arh);
         this.ct[var3].setBounds(110 + var3 * 125, 64, 59, 57);
         this.add(this.ct[var3++]);
      }

      Class436[] var11 = new Class436[5 >> 1];
      var10003 = true;
      this.cs = var11;

      for(var10000 = var3 = 3 & 4; var10000 < this.cs.length; var10000 = var3) {
         this.cs[var3] = new Class436();
         if (var3 == 0) {
            var7 = this;
            this.cs[var3].eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 ^ 3)));
            this.cs[var3].setBounds(47, 231, 311, 105);
         } else {
            if (var3 == --1) {
               this.cs[var3].eq(Class511.q("sc/d/49.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
               this.cs[var3].setBounds(46, 32, 311, 200);
            }

            var7 = this;
         }

         var7.add(this.cs[var3++]);
      }

      Class216[] var14 = new Class216[5 >> 1];
      boolean var12 = true;
      Class216[] var5 = var14;

      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < var5.length; var10000 = var2) {
         var5[var2] = new Class216(var2 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, var2, this);
         if (var2 == 0) {
            var5[var2].setBounds(316, 338, 18, 18);
            var7 = this;
         } else {
            var5[var2].setBounds(338, 338, 18, 18);
            var7 = this;
         }

         var7.add(var5[var2++]);
      }

      this.cw = new Class357(this, 6, --2, 51, 51, 2 & 5, 2 & 5, 48, 233);
      this.cw.hf(Class511.a("sc/d/18.png"));
      this.cw.aiw(var5, 2 ^ 3);
      long[] var15 = new long[3 & 5];
      boolean var16 = true;
      var15[3 ^ 3] = 139L;
      this.cw.ud(var15);
      this.add(this.cw);
      Goodstable var4 = this.vc().n(new BigDecimal(667));
      Class44 var17 = this.ct[2 ^ 3];
      Goodstable var13;
      if (var4 != null) {
         var10001 = --1;
         var13 = var4;
      } else {
         var10001 = 0;
         var13 = var4;
      }

      var17.c(var10001, var13);
   }

   public void ax(Goodstable var1) {
      Class44 var10000 = this.ct[3 & 4];
      int var10001;
      Goodstable var10002;
      if (var1 != null) {
         var10001 = --1;
         var10002 = var1;
      } else {
         var10001 = 0;
         var10002 = var1;
      }

      var10000.c(var10001, var10002);
   }

   public void r(boolean var1) {
      if (this.cr != null || var1) {
         if (var1) {
            if (this.cr == null) {
               this.add(this.cr = new Class390(this), 3 & 4);
            }

            int var10004 = 2 & 5;
            this.cr.qc.ak((boolean)(2 & 5));
            this.cr.qc.oy().removeAllElements();
            int var4 = var10004;
            RoleData var6 = this.vd();
            List var2 = null;

            int var5;
            for(int var10000 = var5 = 5 >> 3; var10000 < var6.babys.size(); var10000 = var5) {
               Baby var3;
               BigDecimal[] var7 = (var3 = (Baby)var6.babys.get(var5)).getpartAll();
               if (var2 != null) {
                  var2.clear();
               }

               if ((var2 = this.bj(var2, var7)) != null && var2.size() != 0) {
                  var4 += var2.size();
                  Class367 var8 = new Class367(var3.getBabyname() + "(" + var2.size() + ")", var3.getBabyid());
                  this.cr.qc.amy(var8);
               }

               ++var5;
            }

            Class367 var9 = new Class367("全部(" + var4 + ")", (Object)null);
            this.cr.qc.amy(var9);
            this.cr.qc.y(this.cr.qc.oy().size() - --1);
            this.cr.setBounds(95 & 62, 124 & 111, 20990 & 12107, 26078 & 6839);
         }

         this.cr.setVisible(var1);
      }
   }

   public void bk(BigDecimal var1) {
      if (this.cr != null) {
         RoleData var5 = this.vd();
         Object var3 = new ArrayList();

         int var4;
         for(int var10000 = var4 = 5 >> 3; var10000 < var5.babys.size(); var10000 = var4) {
            Baby var2 = (Baby)var5.babys.get(var4);
            if (var1 == null || var2.getBabyid().compareTo(var1) == 0) {
               BigDecimal[] var6 = var2.getpartAll();
               var3 = this.bj((List)var3, var6);
            }

            ++var4;
         }

         this.cr.qb.aiz().i(5 >> 3);
         this.cr.qb.ck((List)var3);
      }
   }

   public void d() {
      RoleData var1;
      long var2 = (var1 = this.vd()).getGoodTypeNum(4239 & 28665);
      if ((long)this.j != var2) {
         this.j = (int)var2;
         this.cv.setText("1/" + this.j);
      }

      if (this.ct[2 & 5].tp() != 0) {
         Goodstable var4;
         if ((var4 = (Goodstable)this.ct[3 >> 2].hr()) != null) {
            var4 = var1.getGood(var4.getRgid());
         }

         if (var4 == null) {
            this.ax((Goodstable)null);
            return;
         }
      }

   }

   public void y(int var1) {
      if (var1 == (119 & 79)) {
         this.s();
      } else {
         if (var1 == (123 & 76)) {
            this.bl();
         }

      }
   }

   protected void paintComponent(Graphics var1) {
      if (this.aej.bl()) {
         this.d();
      }

      super.paintComponent(var1);
   }

   public boolean bl() {
      int var10000;
      RoleData var1;
      Goodstable var4;
      if ((var4 = (var1 = this.vd()).az(137L)) == null) {
         var10000 = 3 & 4;
         this.aej.f("缺少点金石");
         return (boolean)var10000;
      } else {
         Goodstable var3;
         if ((var3 = (Goodstable)this.ct[3 >> 2].hr()) != null) {
            var3 = var1.getGood(var3.getRgid());
         }

         if (var3 == null) {
            var10000 = 5 >> 3;
            this.aej.f("请选择对应物品");
            return (boolean)var10000;
         } else if (GoodType.getExtra(var3.getValue(), "炼器属性") != null) {
            var10000 = 3 >> 2;
            this.aej.f("该装备已经点金成功");
            return (boolean)var10000;
         } else {
            SuitOperBean var5 = new SuitOperBean();
            ArrayList var2;
            (var2 = new ArrayList()).add(var3.getRgid());
            var2.add(var4.getRgid());
            var5.setType(30439 & 2462);
            var5.setGoods(var2);
            String var6 = Agreement.getSendTextAES("suitoperate", Class695.b().toJson(var5));
            this.uw().d(var6);
            return (boolean)(--1);
         }
      }
   }
}
