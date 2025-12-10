package com.xy;

import com.xy.text.GameView;

public class Class448 extends Class345 {
   private Class387 axk;
   private Class436 ih;

   public Class448(GameView var1) {
      int var10000 = 94 & 43;
      int var10008 = -1 & -3;
      super(27647 & 5302, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 5 >> 3, 7167 & 26011, 20409 & 12759, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 118 & 77, 118 & 77, 118 & 77, 118 & 77, (boolean)(3 ^ 3)), "包裹");
      this.ih = new Class436();
      this.ih.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(3 & 4)));
      this.ih.setBounds(123 & 55, 118 & 31, 8063 & 25014, 20967 & 12159);
      this.add(this.ih);
      Class216[] var4 = new Class216[var10000];
      boolean var10002 = true;
      Class216[] var3 = var4;

      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < var3.length; var10000 = var2) {
         var3[var2] = new Class216((String)null, --2, var2);
         var3[var2].setBounds(25960 & 7167, (94 & 61) + var2 * (47 & 115), 37 & 126, 99 & 61);
         Class448 var5;
         if (var2 == 0) {
            var5 = this;
            var3[var2].setImage("sc/e/8.png");
         } else if (var2 == --1) {
            var5 = this;
            var3[var2].setImage("sc/e/9.png");
         } else if (var2 == (1 ^ 3)) {
            var5 = this;
            var3[var2].setImage("sc/e/10.png");
         } else if (var2 == --3) {
            var5 = this;
            var3[var2].setImage("sc/e/11.png");
         } else if (var2 == --4) {
            var5 = this;
            var3[var2].setImage("sc/e/12.png");
         } else if (var2 == --5) {
            var5 = this;
            var3[var2].setImage("sc/b/6.png");
         } else if (var2 == (22 & 111)) {
            var5 = this;
            var3[var2].setImage("sc/b/7.png");
         } else if (var2 == 7) {
            var5 = this;
            var3[var2].setImage("sc/b/8.png");
         } else if (var2 == 8) {
            var5 = this;
            var3[var2].setImage("sc/b/9.png");
         } else {
            if (var2 == 9) {
               var3[var2].setImage("sc/b/10.png");
            }

            var5 = this;
         }

         var5.add(var3[var2++]);
      }

      this.axk = new Class387(this, 6, 7, 51, 51, 2 & 5, 2 & 5, 52, 24);
      this.axk.hf(Class511.a("sc/d/18.png"));
      this.axk.aix(var3, 3 ^ 3);
      this.add(this.axk);
   }
}
