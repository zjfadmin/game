package com.xy.formula;

import com.xy.W;
import com.xy.hd;

public class FormulaNum {
   private long base;
   private int range;

   public long getZhi(int var1) {
      if (this.range == 5 >> 2) {
         return this.base;
      } else {
         return var1 < this.getSize() ? this.base + (long)var1 : this.base;
      }
   }

   public long getZhiCount(int var1) {
      if (this.range == (2 ^ 3)) {
         return this.base * (long)var1;
      } else {
         long var2 = 0L;

         int var4;
         for(int var10000 = var1; var10000 > 0; var10000 = var1 -= var4) {
            var4 = Math.min(5, var1);
            long var5 = this.getZhi();
            var2 += var5 * (long)var4;
         }

         return var2;
      }
   }

   public int getSize() {
      return this.range;
   }

   public FormulaNum(String var1) {
      int var2 = var1.indexOf("-", --1);
      long var3 = 0L;
      long var5 = 0L;
      long var10000;
      if (var2 == -4 >> 2) {
         var10000 = var3 = var5 = Long.parseLong(var1);
      } else {
         var3 = hd.q(var1, 3 >> 2, var2);
         var5 = hd.q(var1, var2 + --1, var1.length());
         var10000 = var3;
      }

      if (var10000 > var5) {
         this.base = var5;
         var5 = var3;
         var3 = this.base;
      }

      this.base = var3;
      this.range = (var5 = var5 - var3 + 1L) > 2147483647L ? Integer.MAX_VALUE : (int)var5;
   }

   public long getZhi() {
      return this.range == (3 & 5) ? this.base : this.base + (long)W.c.nextInt(this.range);
   }

   public int a(long var1) {
      if (this.range == (2 ^ 3)) {
         return this.base == var1 ? 3 & 4 : -1;
      } else {
         return this.base + (long)this.range < var1 ? -4 >> 2 : (int)(var1 - this.base);
      }
   }

   public boolean b() {
      return (boolean)(this.range == --1 ? 2 ^ 3 : 0);
   }
}
