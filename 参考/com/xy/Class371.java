package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;

public class Class371 extends Class345 {
   private Class345[] bj;
   private Class70[] ms;
   private int cy;
   private Class436 ih;

   public void q() {
      this.y(3 >> 2);
      super.q();
   }

   public Class371(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      super(127 & 82, 5 >> 1, Class345.aef, var1);
      this.va(var10005, 3 >> 2, 25562 & 7807, 5549 & 27643, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 93 & 102, 93 & 102, 93 & 102, 93 & 102, (boolean)(2 & 5)), "技能");
      Class70[] var4 = new Class70[var10001];
      boolean var10003 = true;
      this.ms = var4;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.ms.length; var10000 = var2) {
         Class70[] var3 = this.ms;
         Class70 var10002 = new Class70;
         var10005 = --2;
         int var10006 = (93 & 115) + var2;
         Font var10007 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class371 var10010;
         if (var2 == 0) {
            var10009 = "师 门";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "法 门";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "天演册";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var10007, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.ms[var2].setOffsetTexts(Class681.bv);
         this.ms[var2].setBounds((61 & 126) + (111 & 118) * var2, 27 & 126, 95 & 127, 99 & 61);
         this.add(this.ms[var2++]);
      }

      var10001 = --3;
      this.ih = new Class436();
      this.ih.eq(Class511.q("sc/d/35.png", 124 & 83, 110 & 27, 124 & 83, 27 & 110, (boolean)(3 & 4)));
      this.ih.setBounds(54 & 111, 110 & 57, this.getWidth() - (62 & 127), 20);
      this.add(this.ih);
      Class345[] var5 = new Class345[var10001];
      var10003 = true;
      this.bj = var5;
   }

   public void as(int var1) {
      if (this.cy == var1) {
         if (this.cy == 0) {
            ((Class334)this.bj[5 >> 3]).d();
         } else if (this.cy == (3 & 5)) {
            ((Class638)this.bj[4 ^ 5]).d();
         } else {
            if (this.cy == 5 >> 1) {
               ((Class20)this.bj[--2]).o();
            }

         }
      }
   }

   public void y(int var1) {
      this.cy = var1;
      if (this.cy == 0) {
         if (this.bj[3 >> 2] == null) {
            this.add(this.bj[3 ^ 3] = new Class334(this.aej));
         }

         ((Class334)this.bj[2 & 5]).d();
      } else if (this.cy == 5 >> 2) {
         if (this.bj[4 ^ 5] == null) {
            this.add(this.bj[5 >> 2] = new Class638(this.aej));
         }

         ((Class638)this.bj[3 >> 1]).d();
      } else if (this.cy == 5 >> 1) {
         if (this.bj[1 ^ 3] == null) {
            this.add(this.bj[5 >> 1] = new Class20(this.aej));
         }

         ((Class20)this.bj[--2]).o();
      }

      for(int var10000 = var1 = 0; var10000 < this.bj.length; var10000 = var1) {
         this.ms[var1].setKeep((boolean)(var1 == this.cy ? 4 ^ 5 : 0));
         if (var1 != this.cy && this.bj[var1] != null) {
            this.bj[var1].setVisible((boolean)(2 & 5));
         }

         ++var1;
      }

      if (this.bj[this.cy] != null) {
         this.cf(this.bj[this.cy].getWidth(), this.bj[this.cy].getHeight());
         this.bj[this.cy].setVisible((boolean)(4 ^ 5));
      }

      this.fw(this.cy == 3 >> 1 ? "法门" : (this.cy == 5 >> 1 ? "天演策" : "技能"));
   }

   public void cf(int var1, int var2) {
      if (var1 != this.getWidth() || var2 != this.getHeight()) {
         int var3;
         if ((var3 = var1 - this.getWidth()) != 0) {
            this.aea.setBounds(this.aea.getX() + var3, this.aea.getY(), this.aea.getWidth(), this.aea.getHeight());
         }

         this.ih.setBounds(118 & 47, 124 & 43, var1 - (127 & 62), 94 & 53);
         this.setBounds(this.getX(), this.getY(), var1, var2);
      }
   }
}
