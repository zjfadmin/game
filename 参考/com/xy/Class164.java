package com.xy;

import com.xy.text.GameView;

public class Class164 extends Class345 {
   private Class246 aql;
   private Class436 ih;

   public Class164(GameView var1) {
      int var10000 = 59 & 78;
      int var10008 = -3 & -1;
      super(63 & 119, 1 ^ 3, Class345.aef, var1);
      this.va(var10008, 2 & 5, 31227 & 1951, 13783 & 19385, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 77 & 118, 77 & 118, 77 & 118, 77 & 118, (boolean)(3 & 4)), "典当");
      this.ih = new Class436();
      this.ih.eq(Class511.q("sc/d/19.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
      this.ih.setBounds(123 & 55, 119 & 30, 5494 & 27583, 6631 & 26495);
      this.add(this.ih);
      Class216[] var4 = new Class216[var10000];
      boolean var10002 = true;
      Class216[] var3 = var4;

      int var2;
      for(var10000 = var2 = 3 ^ 3; var10000 < var3.length; var10000 = var2) {
         var3[var2] = new Class216((String)null, --2, var2);
         var3[var2].setBounds(3452 & 29675, (94 & 61) + var2 * (63 & 99), 127 & 36, 35 & 125);
         Class164 var5;
         if (var2 == 0) {
            var5 = this;
            var3[var2].setImage("sc/e/8.png");
         } else if (var2 == (2 ^ 3)) {
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
         } else if (var2 == (31 & 102)) {
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

      this.aql = new Class246(this, 6, 7, 51, 51, 3 & 4, 3 & 4, 52, 24);
      this.aql.hf(Class511.a("sc/d/18.png"));
      this.aql.aix(var3, 2 & 5);
      this.add(this.aql);
   }
}
