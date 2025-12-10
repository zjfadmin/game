package com.xy;

import com.xy.bean.GangResultBean;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;

public class Class490 extends Class345 {
   private Class533 aot;
   private int j;
   private Class210 aou;
   private Class436 bl;
   private Class322[] adb;

   public void ea(GangResultBean var1) {
      this.aou.ea(var1);
      this.aou.r((boolean)(3 & 4));
      this.aou.r((boolean)(4 ^ 5));
      this.aot.in(var1.getGang(), var1.getGangGroup());
      this.ve().a(this.ae());
   }

   public Class210 agb() {
      return this.aou;
   }

   public Class490(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(60 & 115, --2, Class345.aef, var1);
      this.va(var10005, 3 & 4, 6079 & 27350, 17375 & 15867, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 117 & 78, 117 & 78, 117 & 78, 117 & 78, (boolean)(3 ^ 3)), "帮派管理");
      Class322[] var4 = new Class322[var10001];
      boolean var10003 = true;
      this.adb = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.adb.length; var10000 = var2) {
         Class322[] var3 = this.adb;
         Class322 var10002 = new Class322;
         var10005 = 5 >> 1;
         int var10006 = (5321 & 27647) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class490 var10010;
         if (var2 == 0) {
            var10009 = "帮派总览";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "帮派成员";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "帮派战役";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.adb[var2].setOffsetTexts(Class681.bv);
         this.adb[var2].setBounds((86 & 105) + (118 & 111) * var2, 94 & 55, 95 & 127, 99 & 61);
         this.add(this.adb[var2++]);
      }

      this.aot = new Class533(var1);
      this.aou = new Class210(var1);
      this.add(this.aot);
      this.add(this.aou);
      this.bl = new Class436(Class511.q("sc/d/35.png", 87 & 120, 31 & 106, 87 & 120, 26 & 111, (boolean)(3 ^ 3)));
      this.bl.setBounds(52 & 107, 63 & 100, 29679 & 3702, 20);
      this.add(this.bl);
   }

   public void y(int var1) {
      if (var1 != 5 >> 1) {
         this.j = var1;

         int var2;
         for(int var10000 = var2 = 3 & 4; var10000 < this.adb.length; var10000 = var2) {
            this.adb[var2].setKeep((boolean)(var2 == this.j ? --1 : 0));
            ++var2;
         }

         if (var1 == (2 ^ 3)) {
            this.aou.as(3 ^ 3);
         }

         this.aot.setVisible((boolean)(var1 == 0 ? 2 ^ 3 : 0));
         this.aou.setVisible((boolean)(var1 == --1 ? 3 >> 1 : 0));
      }
   }

   public void eb(BigDecimal var1, String var2) {
      this.aou.eb(var1, var2);
   }

   public void q() {
      this.y(3 & 4);
      super.q();
   }

   public void bk(BigDecimal var1) {
      this.aou.bk(var1);
   }
}
