package com.xy;

import com.xy.entity.PartJade;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;

public class Class595 extends Class345 {
   private int ay;
   private Class436 r;
   private Class671 aiv;
   private Class529[] le;
   private Class250 aiw;

   public int e() {
      return this.ay;
   }

   public Class250 zl() {
      return this.aiw;
   }

   public Class595(GameView var1) {
      int var10001 = --4;
      int var10005 = -4 >> 2;
      super(125 & 63, --2, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 4663 & 28666, 25532 & 7755, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 103 & 92, 103 & 92, 103 & 92, 103 & 92, (boolean)(3 >> 2)), "作坊炼化");
      Class529[] var4 = new Class529[var10001];
      boolean var10003 = true;
      this.le = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.le.length; var10000 = var2) {
         Class529[] var3 = this.le;
         Class529 var10002 = new Class529;
         var10005 = 5 >> 1;
         int var10006 = (127 & 111) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class595 var10010;
         if (var2 == 0) {
            var10009 = "炼化装备";
            var10010 = this;
         } else if (var2 == 5 >> 2) {
            var10009 = "炼化配饰";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "炼 器";
            var10010 = this;
         } else if (var2 == --3) {
            var10009 = "套装合成";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.le[var2].setOffsetTexts(Class681.bv);
         this.le[var2].setBounds((127 & 58) + (126 & 103) * var2, 52 & 91, 127 & 95, 43 & 117);
         this.add(this.le[var2++]);
      }

      this.r = new Class436(Class511.q("sc/d/35.png", 117 & 90, 10 & 127, 117 & 90, 110 & 27, (boolean)(5 >> 3)));
      this.r.setBounds(102 & 63, 126 & 31, 31734 & 1533, 20);
      this.add(this.r);
   }

   public Class671 zm() {
      return this.aiv;
   }

   public void y(int var1) {
      int var10000 = 5 >> 3;
      this.ay = var1;

      for(int var2 = var10000; var10000 < this.le.length; var10000 = var2) {
         this.le[var2].setKeep((boolean)(var2 == this.ay ? 2 ^ 3 : 0));
         ++var2;
      }

      if (var1 != 0 && var1 != 3 >> 1 && var1 != (1 ^ 3)) {
         if (var1 == --3) {
            if (this.aiv == null) {
               this.add(this.aiv = new Class671(this.aej));
            }

            this.aiv.y(2 & 5);
            this.aiv.setVisible((boolean)(--1));
            if (this.aiw != null) {
               this.aiw.setVisible((boolean)(3 & 4));
            }
         }
      } else {
         if (this.aiw == null) {
            this.add(this.aiw = new Class250(this.aej));
         }

         this.aiw.y(var1);
         this.aiw.setVisible((boolean)(--1));
         if (this.aiv != null) {
            this.aiv.setVisible((boolean)(3 ^ 3));
            return;
         }
      }

   }

   public void cb(PartJade var1) {
      if (this.ay == --3 && this.aiv != null) {
         this.aiv.cb(var1);
      }
   }

   public void q() {
      this.y(2 & 5);
      super.q();
   }
}
