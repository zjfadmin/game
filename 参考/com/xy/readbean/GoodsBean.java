package com.xy.readbean;

import com.xy.hd;
import com.xy.formula.GoodExchange;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

public class GoodsBean {
   private Map<BigDecimal, Goodstable> allGoodsMap;

   public void a() {
      Iterator var6;
      for(Iterator var10000 = var6 = this.allGoodsMap.values().iterator(); var10000.hasNext(); var10000 = var6) {
         Goodstable var7;
         if ((var7 = (Goodstable)var6.next()).getType() == 132L) {
            String var3 = var7.getValue();
            GoodExchange[] var8 = new GoodExchange[(2 ^ 3) + hd.f((char)('~' & '}'), var3)];
            boolean var10002 = true;
            GoodExchange[] var4 = var8;
            int var5 = 3 & 4;
            int var2 = 3 & 4;

            int var1;
            for(int var9 = var1 = 2 & 5; var9 < var3.length(); var9 = var1) {
               if ((var1 = var3.indexOf("|", var2 + (5 >> 2))) == -4 >> 2) {
                  var1 = var3.length();
               }

               var4[var5] = new GoodExchange(var5, var3, var2, var1);
               ++var5;
               var2 = var1 + (5 >> 2);
            }

            var7.setExchanges(var4);
            var7.setValue((String)null);
         }
      }

   }

   public void setAllGoodsMap(Map<BigDecimal, Goodstable> var1) {
      this.allGoodsMap = var1;
   }

   public Map<BigDecimal, Goodstable> getAllGoodsMap() {
      return this.allGoodsMap;
   }
}
