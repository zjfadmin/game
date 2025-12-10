package com.xy;

import com.xy.bean.ShopGoodsBean;
import com.xy.readbean.Shop;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class Class384 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var10 = var3.gameView;
      if (var1.equals("shop")) {
         String[] var12 = var2.split("\\|");
         List var15 = (List)var10.getObjectArea().bz().getNpcShopMap().get(var12[5 >> 3]);
         Class684 var16 = (Class684)var10.getFormManagement().e(31 & 119);
         var16.afi(var15, Integer.parseInt(var12[3 ^ 3]), new BigDecimal(var12[2 ^ 3]));
         var10.getFormManagement().a(23 & 127);
      } else if (var1.equals("shopGood")) {
         ShopGoodsBean var11 = (ShopGoodsBean)Class695.b().fromJson(var2, ShopGoodsBean.class);
         Class684 var14 = (Class684)var10.getFormManagement().e(87 & 63);
         var14.afj(var11);
         var10.getFormManagement().a(23 & 127);
      } else {
         if (var1.equals("shopPrice")) {
            Class603 var4 = var10.getObjectArea();
            int var5;
            if ((var5 = var2.indexOf("|")) == -4 >> 2) {
               return;
            }

            String var6 = var2.substring(2 & 5, var5);
            if ((var5 = var2.indexOf("|", var5 + (3 >> 1))) == -4 >> 2) {
               return;
            }

            var1 = var2.substring(var6.length() + (4 ^ 5), var5);
            long var7 = Long.parseLong(var2.substring(var5 + (2 ^ 3)));
            Shop var9;
            if (var6.equals("1")) {
               if ((var9 = var4.e(var1)) == null) {
                  return;
               }

               if (var9.getShoptype() >= (16367 & 21401) && var9.getShoptype() <= (7071 & 30702)) {
                  Class138 var13;
                  if ((var13 = (Class138)var10.getFormManagement().m(24735 & 8165)) != null && var13.od().isVisible()) {
                     var13.od().el(var1, var7);
                  }

                  return;
               }

               ((Class684)var10.getFormManagement().e(31 & 119)).el(var1, var7);
               return;
            }

            if (var6.equals("2")) {
               if ((var9 = var4.e(var1)) == null) {
                  return;
               }

               var9.setShopprice(var7);
               ((Class270)var10.getFormManagement().e(111 & 62)).rz(var9);
            }
         }

      }
   }
}
