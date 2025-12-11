package com.xy.c;

import com.xy.a.Class48;
import com.xy.a.q.Class49;
import com.xy.bean.ShopGoodsBean;
import com.xy.readbean.Shop;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class Class34 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("shop")) {
         String var22 = "7g";
         String[] var14 = var2.split("\\|");
         List var17 = var4.getObjectArea().bg().getNpcShopMap().get(var14[0]);
         com.xy.a.q.Class18 var18 = (com.xy.a.q.Class18)var4.getFormManagement().j(23);
         var18.kr(var17, Integer.parseInt(var14[0]), new BigDecimal(var14[1]));
         var4.getFormManagement().b(23);
      } else if (var1.equals("shopGood")) {
         ShopGoodsBean var13 = com.xy.v.Class31.a().fromJson(var2, ShopGoodsBean.class);
         com.xy.a.q.Class18 var16 = (com.xy.a.q.Class18)var4.getFormManagement().j(23);
         var16.ks(var13);
         var4.getFormManagement().b(23);
      } else {
         if (var1.equals("shopPrice")) {
            com.xy.v.Class8 var5 = var4.getObjectArea();
            String var10001 = "\n";
            int var6;
            if ((var6 = var2.indexOf("|")) == -1) {
               return;
            }

            String var7 = var2.substring(0, var6);
            var10001 = "g";
            if ((var6 = var2.indexOf("|", var6 + 1)) == -1) {
               return;
            }

            String var8 = var2.substring(var7.length() + 1, var6);
            long var9 = Long.parseLong(var2.substring(var6 + 1));
            if (var7.equals("1")) {
               Shop var19;
               if ((var19 = var5.au(var8)) == null) {
                  return;
               }

               if (var19.getShoptype() >= 5001 && var19.getShoptype() <= 5006) {
                  Class49 var12;
                  if ((var12 = (Class49)var4.getFormManagement().l(133)) != null && var12.ve().isVisible()) {
                     var12.ve().eh(var8, var9);
                  }

                  return;
               }

               ((com.xy.a.q.Class18)var4.getFormManagement().j(23)).eh(var8, var9);
               return;
            }

            var10001 = "D";
            if (var7.equals("2")) {
               Shop var11;
               if ((var11 = var5.au(var8)) == null) {
                  return;
               }

               var11.setShopprice(var9);
               ((Class48)var4.getFormManagement().j(46)).ov(var11);
            }
         }
      }
   }
}
