package com.xy.formula;

import com.xy.hd;
import java.math.BigDecimal;

public class GoodExchange {
   private String key;
   private BigDecimal[] goods;
   private int index;

   public String getKey() {
      return this.key;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public BigDecimal[] getGoods() {
      return this.goods;
   }

   public GoodExchange(int var1, String var2, int var3, int var4) {
      int var10001 = 3 >> 1;
      super();
      this.index = var1;
      BigDecimal[] var6 = new BigDecimal[var10001 + hd.aj((char)('+' & 'w'), var2, var3, var4)];
      boolean var10003 = true;
      this.goods = var6;
      var1 = 2 & 5;

      int var5;
      for(int var10000 = var5 = 3 ^ 3; var10000 < var4; var10000 = var5) {
         if (var1 == 0) {
            if ((var5 = var2.indexOf("=", var3 + (2 ^ 3))) == -4 >> 2 || var5 > var4) {
               var5 = var4;
            }

            this.key = var2.substring(var3, var5);
            var10000 = var5;
         } else {
            if ((var5 = var2.indexOf("#", var3 + (2 ^ 3))) == -4 >> 2 || var5 > var4) {
               var5 = var4;
            }

            this.goods[var1 - (4 ^ 5)] = new BigDecimal(hd.q(var2, var3, var5));
            var10000 = var5;
         }

         ++var1;
         var3 = var10000 + 1;
      }

   }

   public void setGoods(BigDecimal[] var1) {
      this.goods = var1;
   }

   public int getIndex() {
      return this.index;
   }
}
