package com.xy;

import com.xy.entity.Mount;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;

public class Class329 extends Class345 {
   private Class436 r;
   private int bn;
   private Class643[] xo;
   private Class345[] axn;

   public boolean bl() {
      if (this.bn == 0) {
         ((Class364)this.axn[3 ^ 3]).s();
         return (boolean)(--1);
      } else if (this.bn == 5 >> 2) {
         ((Class195)this.axn[2 ^ 3]).s();
         return (boolean)(--1);
      } else {
         return false;
      }
   }

   public void d() {
   }

   public Class329(GameView var1) {
      int var10001 = --2;
      int var10005 = -4 >> 2;
      super(2813 & 30126, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 5 >> 3, 27631 & 5879, 9023 & 24263, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 68 & 127, 68 & 127, 68 & 127, 68 & 127, (boolean)(5 >> 3)), " 坐骑 ");
      Class643[] var4 = new Class643[var10001];
      boolean var10003 = true;
      this.xo = var4;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.xo.length; var10000 = var2) {
         Class643[] var3 = this.xo;
         Class643 var10002 = new Class643;
         var10005 = 1 ^ 3;
         int var10006 = (24995 & 7933) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class329 var10010;
         if (var2 == 0) {
            var10009 = "坐骑";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "守护";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.xo[var2].setOffsetTexts(Class681.bv);
         this.xo[var2].setBounds((125 & 62) + (103 & 126) * var2, 79 & 63, 95 & 127, 47 & 113);
         this.add(this.xo[var2++]);
      }

      this.r = new Class436();
      this.r.eq(Class511.q("sc/d/35.png", 117 & 90, 106 & 31, 117 & 90, 14 & 123, (boolean)(3 ^ 3)));
      this.r.setBounds(119 & 58, 93 & 63, 25531 & 7901, 20);
      this.add(this.r);
      Class345[] var5 = new Class345[this.xo.length];
      var10003 = true;
      this.axn = var5;
   }

   public boolean amv(Mount var1) {
      if (this.bn == 0) {
         ((Class364)this.axn[2 & 5]).adi(var1);
         return (boolean)(--1);
      } else {
         return false;
      }
   }

   public void y(int var1) {
      int var10000 = 2 & 5;
      this.bn = var1;

      int var2;
      for(var2 = var10000; var10000 < this.xo.length; var10000 = var2) {
         this.xo[var2].setKeep((boolean)(var2 == this.bn ? 4 ^ 5 : 0));
         ++var2;
      }

      Class329 var3;
      if (var1 == 0) {
         if (this.axn[5 >> 3] == null) {
            this.add(this.axn[3 & 4] = new Class364(this.aej));
         }

         ((Class364)this.axn[3 & 4]).s();
         var3 = this;
      } else {
         if (var1 == 5 >> 2) {
            if (this.axn[--1] == null) {
               this.add(this.axn[--1] = new Class195(this.aej));
            }

            ((Class195)this.axn[--1]).d();
         }

         var3 = this;
      }

      if (var3.axn[var1] != null) {
         this.axn[var1].setVisible((boolean)(5 >> 2));
      }

      for(var10000 = var2 = 0; var10000 < this.axn.length; var10000 = var2) {
         if (this.axn[var2] != null && var1 != var2) {
            this.axn[var2].setVisible((boolean)(5 >> 3));
            if (var2 == 0) {
               ((Class364)this.axn[3 ^ 3]).o();
            } else if (var2 == (4 ^ 5)) {
               ((Class195)this.axn[3 & 5]).p();
            }
         }

         ++var2;
      }

   }

   public void q() {
      this.y(3 ^ 3);
      super.q();
   }

   public boolean t() {
      Class329 var10000;
      if (this.bn == 0) {
         ((Class364)this.axn[3 ^ 3]).o();
         var10000 = this;
      } else {
         if (this.bn == --1) {
            ((Class195)this.axn[3 >> 1]).p();
         }

         var10000 = this;
      }

      return var10000.t();
   }
}
