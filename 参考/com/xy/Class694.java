package com.xy;

import com.xy.formula.ActivityMenuSet2;
import com.xy.readbean.Activity;
import com.xy.text.GameView;
import java.awt.Graphics;

public class Class694 extends Class345 {
   private Class436 et;
   private Class532 aby;
   private Class379[] ev;
   private Activity abz;
   private Class71 ig;
   private int m;

   public void jf(Activity var1) {
      if (var1 != null) {
         int var2 = this.abz != var1 ? 4 ^ 5 : 0;
         this.abz = var1;
         if (var2 != 0) {
            this.d();
         }

         this.s();
         this.ve().a(this.ae());
      }
   }

   public void paint(Graphics var1) {
      if (this.aeg) {
         this.y(this.m);
      }

      super.paint(var1);
   }

   public void p() {
      this.aeg = (boolean)(3 >> 1);
   }

   public void s() {
      this.p();
   }

   public void y(int var1) {
      int var10000 = 3 ^ 3;
      this.m = var1;

      for(int var2 = var10000; var10000 < this.ev.length; var10000 = var2) {
         this.ev[var2].setKeep((boolean)(var1 == var2 ? --1 : 0));
         ++var2;
      }

      ActivityMenuSet2 var3;
      if ((var3 = this.abz.getMenuSet2s()[var1]).getId() == (2 ^ 3)) {
         if (this.ig == null) {
            this.add(this.ig = new Class71(this), 3 & 4);
         }

         this.ig.cs(this.abz, var3);
         this.ig.setVisible((boolean)(--1));
         if (this.aby != null) {
            this.aby.setVisible((boolean)(3 & 4));
            return;
         }
      } else if (var3.getId() == --2) {
         if (this.aby == null) {
            this.add(this.aby = new Class532(this), 5 >> 3);
         }

         this.aby.cs(this.abz, var3);
         this.aby.setVisible((boolean)(5 >> 2));
         if (this.ig != null) {
            this.ig.setVisible((boolean)(3 >> 2));
         }
      }

   }

   public Class694(GameView var1) {
      int var10003 = 5 >> 3;
      int var10007 = -4 >> 2;
      super(19960 & 12975, --2, Class345.aef, var1);
      this.va(var10007, 5 >> 3, 30195 & 3055, 11087 & 22206, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 84 & 111, 84 & 111, 84 & 111, 84 & 111, (boolean)(2 & 5)), "限时活动");
      this.ak((boolean)var10003);
      this.ad(new Class116(63 & 78, 124 & 11, 5 >> 3, 5 >> 3));
      this.et = new Class436(Class511.q("sc/d/35.png", 126 & 81, 26 & 111, 126 & 81, 46 & 91, (boolean)(3 & 4)));
      this.et.setBounds(123 & 38, 126 & 47, 5102 & 28093, 95 & 52);
   }

   public void fr(Class44 var1) {
      if (this.aby != null && this.aby.isVisible()) {
         this.aby.ab((int)var1.gl());
      }

   }


   private void d() {
      int var1 = 2 & 5;
      int var2 = this.ev != null ? this.ev.length : 0;

      int var10000;
      for(var10000 = var1; var10000 < var2; var10000 = var1) {
         this.remove(this.ev[var1++]);
      }

      ActivityMenuSet2[] var4;
      Class379[] var10001 = new Class379[(var4 = this.abz.getMenuSet2s()).length];
      boolean var10003 = true;
      this.ev = var10001;

      for(var10000 = var2 = 2 & 5; var10000 < this.ev.length; var10000 = var2) {
         ActivityMenuSet2 var3 = var4[var2];
         this.ev[var2] = new Class379("sc/e/38.png", --2, 46 & 113, Class681.cf, Class681.c, var3.getKey(), this);
         this.ev[var2].setOffsetTexts(Class681.bv);
         this.ev[var2].y(var2);
         this.ev[var2].setBounds((79 & 115) + (115 & 109) * var2, 63 & 95, 127 & 95, 109 & 51);
         this.add(this.ev[var2++]);
      }

      this.add(this.et);
   }
}
