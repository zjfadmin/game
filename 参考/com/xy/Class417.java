package com.xy;

import com.xy.readbean.Eshop;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;

public class Class417 extends Class345 {
   private JLabel[] fb;
   private Class529[] ah;
   private Class556[] acy;
   private int fk;
   private int ay;
   private int j;
   private Class245 yl;
   private Class254[] qt;
   private Class529[] acz;

   public int e() {
      int var4 = 3 & 4;
      String var2 = String.valueOf(this.fk);
      List var3 = this.vc().ba();

      int var1;
      for(int var10000 = var1 = 3 & 4; var10000 < var3.size(); var10000 = var1) {
         if (((Eshop)var3.get(var1)).getEshoptype().equals(var2)) {
            ++var4;
         }

         ++var1;
      }

      return var4;
   }

   public Class556[] uk() {
      return this.acy;
   }

   public void dp(int var1) {
      if (var1 == (20469 & 12559)) {
         this.as(--1);
      } else if (var1 == (1918 & 31111)) {
         this.as(this.j);
      } else if (var1 == (32047 & 983)) {
         this.as(this.ay - (4 ^ 5));
      } else {
         if (var1 == (14684 & 18347)) {
            this.as(this.ay + (3 >> 1));
         }

      }
   }

   public Class417(GameView var1) {
      int var10001 = 6 & 127;
      int var10003 = 3 >> 2;
      int var10005 = 3 >> 1;
      int var10007 = 4 ^ 5;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.ay = var10007;
      this.j = var10005;
      this.va(var10003, 3 ^ 3, 3775 & 29674, 11771 & 21471, Class345.aei);
      Class529[] var5 = new Class529[var10001];
      boolean var11 = true;
      this.acz = var5;

      int var2;
      Class529[] var4;
      Font var13;
      int var10000;
      int var10006;
      String var10009;
      Class417 var10010;
      for(var10000 = var2 = 3 >> 2; var10000 < this.acz.length; var10000 = var2) {
         var4 = this.acz;
         Class529 var10002 = new Class529;
         var10005 = 5 >> 1;
         var10006 = (17151 & 15867) + var2;
         var13 = Class681.cw;
         if (var2 == 0) {
            var10009 = "材料";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "徽章";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "神兽";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "符石";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "配饰";
            var10010 = this;
         } else if (var2 == --5) {
            var10009 = "积分";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/39.png", var10005, var10006, var13, (Color[])null, var10009, var10010);
         var4[var2] = var10002;
         this.acz[var2].setOffsetTexts(Class681.cl);
         this.acz[var2].setBounds((127 & 54) + (69 & 123) * var2, 127 & 73, 127 & 63, 120 & 31);
         this.add(this.acz[var2++]);
      }

      Class254[] var6 = new Class254[79 & 58];
      var11 = true;
      this.qt = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2] = new Class254(this);
         this.qt[var2].setBounds((62 & 119) + var2 % --5 * (125 & 122), (109 & 115) + var2 / --5 * (5629 & 27303), 123 & 119, 29591 & 3326);
         this.add(this.qt[var2++]);
      }

      var5 = new Class529[--4];
      var11 = true;
      this.ah = var5;

      for(var10000 = var2 = 3 ^ 3; var10000 < this.ah.length; var10000 = var2) {
         var4 = this.ah;
         Class529 var8 = new Class529;
         String var10004 = var2 == (1 ^ 3) ? "sc/e/42.png" : (var2 == --3 ? "sc/e/43.png" : "sc/e/6.png");
         var10006 = 261 + var2;
         var13 = Class681.bm;
         if (var2 == 0) {
            var10009 = "首页";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "末页";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var8.<init>(var10004, 1, var10006, var13, (Color[])null, var10009, var10010);
         var4[var2] = var8;
         this.ah[var2].setBounds(264 + 140 * var2, 435, 34, 18);
         if (var2 == --2 || var2 == --3) {
            this.ah[var2].setBounds(301 + 82 * (var2 - (1 ^ 3)), 435, 18, 18);
         }

         this.add(this.ah[var2++]);
      }

      JLabel[] var9 = new JLabel[--4];
      var11 = true;
      this.fb = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.fb.length; var10000 = var2) {
         this.fb[var2] = Class133.b(480, 34 + (var2 + --1) * 19, 72, 18, Color.black, Class681.ak);
         this.fb[var2].setText(var2 == 0 ? "累计充值" : (var2 == --1 ? "当前积分" : (var2 == (1 ^ 3) ? "元" : (var2 == 3 ? "积分" : ""))));
         this.fb[var2].setHorizontalAlignment(10);
         this.add(this.fb[var2]);
         if (var2 >= 2 && var2 <= 3) {
            this.fb[var2].setForeground(Color.white);
            this.fb[var2].setFont(Class681.bm);
            this.fb[var2].setBounds(627, 53 + (var2 - 2) * 19, 30, 18);
            this.fb[var2].setHorizontalAlignment(4);
         }

         ++var2;
      }

      Class556[] var10 = new Class556[2];
      var11 = true;
      this.acy = var10;

      for(var10000 = var2 = 3 >> 2; var10000 < this.acy.length; var10000 = var2) {
         MoneyType var3 = new MoneyType();
         Class417 var12;
         if (var2 == 0) {
            var12 = this;
            var3.setIdAndKey(5, "累计");
         } else {
            if (var2 == --1) {
               var3.setIdAndKey(4, "积分");
            }

            var12 = this;
         }

         var12.acy[var2] = Class133.i(10, Color.white, Class681.q, var3, var1);
         this.acy[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)));
         this.acy[var2].setBounds(552, 34 + (var2 + (2 ^ 3)) * 19, 110, 18);
         this.acy[var2].ab(2);
         this.add(this.acy[var2++]);
      }

      this.yl = Class133.a(322, 435, 58, 18, 2 & 5, Color.white, Class681.q);
      this.yl.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
      this.add(this.yl);
   }

   public void as(int var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.qt.length; var10000 = var2) {
         this.qt[var2].q();
         this.qt[var2++].setVisible((boolean)(3 >> 2));
      }

      Class417 var9;
      if (var1 <= 0) {
         var1 = 3 & 5;
         var9 = this;
      } else {
         if (var1 >= this.j) {
            var1 = this.j;
         }

         var9 = this;
      }

      var9.ay = var1;
      var10000 = 3 >> 2;
      this.yl.setText(this.ay + "/" + this.j);
      var2 = var10000;
      int var3 = 2 & 5;
      var1 = (var1 - (5 >> 2)) * (46 & 91);
      String var4 = String.valueOf(this.fk);
      String var5 = this.fk == --5 ? "积分" : "仙玉";
      List var6 = this.vc().ba();

      int var7;
      for(var10000 = var7 = 5 >> 3; var10000 < var6.size(); var10000 = var7) {
         Eshop var8;
         if ((var8 = (Eshop)var6.get(var7)).getEshoptype().equals(var4)) {
            if (var2 >= var1) {
               Class254 var10 = this.qt[var3];
               ++var3;
               var10.xk(var8, var5);
               if (var3 >= this.qt.length) {
                  return;
               }
            }

            ++var2;
         }

         ++var7;
      }

   }

   public void y(int var1) {
      int var10000 = 3 >> 2;
      this.fk = var1;

      for(var1 = var10000; var10000 < this.acz.length; var10000 = var1) {
         this.acz[var1].setKeep((boolean)(var1 == this.fk ? 4 ^ 5 : 0));
         ++var1;
      }

      this.j = (var1 = this.e()) % (63 & 74) == 0 ? var1 / (110 & 27) : var1 / 10 + (2 ^ 3);
      this.as(3 & 5);
   }
}
