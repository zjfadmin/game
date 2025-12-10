package com.xy;

import com.xy.entity.PartJade;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;

public class Class671 extends Class345 {
   private Class345[] sh;
   private Class529[] le;
   private int m;

   public void cb(PartJade var1) {
      if (this.m == 0 && this.sh[3 >> 2] != null) {
         ((Class401)this.sh[3 & 4]).xi().cb(var1);
      } else {
         if (this.m == --3 && this.sh[--3] != null) {
            ((Class37)this.sh[--3]).xi().cb(var1);
         }

      }
   }

   public int e() {
      return this.m;
   }

   public Class671(GameView var1) {
      int var10001 = --5;
      int var10006 = 5 >> 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10006, 3 & 4, 18230 & 15099, 1757 & 31530, Class345.aei);
      this.uv(Class511.q("sc/d/36.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)), this.ady);
      this.ad(new Class116(62 & 111, 106 & 95, 122 & 31, 127 & 18));
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.le = var4;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.le.length; var10000 = var2) {
         Class529[] var3 = this.le;
         Class529 var10002 = new Class529;
         int var10005 = --2;
         var10006 = (124 & 119) + var2;
         Font var10007 = Class681.cw;
         String var10009;
         Class671 var10010;
         if (var2 == 0) {
            var10009 = "合 成";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "洗 练";
            var10010 = this;
         } else if (var2 == 5 >> 1) {
            var10009 = "套装升级";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "玉符升级";
            var10010 = this;
         } else if (var2 == --4) {
            var10009 = "拆解转移";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/61.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         this.le[var2].setOffsetTexts(Class681.cl);
         this.le[var2].setBounds((119 & 63) + (124 & 95) * var2, 118 & 59, 94 & 123, 24 & 127);
         this.add(this.le[var2++]);
      }

      Class345[] var5 = new Class345[--5];
      var10003 = true;
      this.sh = var5;
   }

   public Class14 arl() {
      return (Class14)this.sh[--1];
   }

   public void y(int var1) {
      int var10000 = 3 >> 2;
      this.m = var1;

      int var2;
      for(var2 = var10000; var10000 < this.le.length; var10000 = var2) {
         this.le[var2].setKeep((boolean)(var2 == this.m ? 3 & 5 : 0));
         ++var2;
      }

      Class671 var3;
      if (var1 == 0) {
         if (this.sh[var1] == null) {
            this.add(this.sh[var1] = new Class401(this.aej));
         }

         ((Class401)this.sh[var1]).d();
         var3 = this;
      } else if (var1 == 3 >> 1) {
         if (this.sh[var1] == null) {
            this.add(this.sh[var1] = new Class14(this.aej));
         }

         ((Class14)this.sh[var1]).d();
         var3 = this;
      } else if (var1 == --2) {
         if (this.sh[var1] == null) {
            this.add(this.sh[var1] = new Class568(this.aej));
         }

         ((Class568)this.sh[var1]).d();
         var3 = this;
      } else if (var1 == --3) {
         if (this.sh[var1] == null) {
            this.add(this.sh[var1] = new Class37(this.aej));
         }

         ((Class37)this.sh[var1]).p();
         var3 = this;
      } else {
         if (var1 == --4) {
            if (this.sh[var1] == null) {
               this.add(this.sh[var1] = new Class644(this.aej));
            }

            ((Class644)this.sh[var1]).s();
         }

         var3 = this;
      }

      if (var3.sh[var1] != null) {
         this.sh[var1].setVisible((boolean)(3 & 5));
      }

      for(var10000 = var2 = 0; var10000 < this.sh.length; var10000 = var2) {
         if (this.sh[var2] != null && var1 != var2) {
            this.sh[var2].setVisible((boolean)(2 & 5));
         }

         ++var2;
      }

   }
}
