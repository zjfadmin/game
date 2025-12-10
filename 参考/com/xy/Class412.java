package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.GoodTrans2;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class412 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("TransGood")) {
         this.k(var2, var3.gameView);
      } else {
         if (var1.equals("TransState")) {
            this.l(var2, var3.gameView);
         }

      }
   }

   public void k(String var1, GameView var2) {
      GoodTrans2 var3 = (GoodTrans2)Class695.b().fromJson(var1, GoodTrans2.class);
      ((Class674)var2.getFormManagement().e(62 & 79)).oi(var3);
   }

   public void l(String var1, GameView var2) {
      int var3;
      String[] var4;
      if ((var3 = Integer.parseInt((var4 = var1.split("\\|"))[3 & 4])) == 0) {
         var2.aal(new ConfirmBean(127 & 21, var4[--1], "#G玩家#R" + var4[--1] + "#G请求交易"));
      } else if (var3 == --1) {
         Class674 var10000 = (Class674)var2.getFormManagement().e(127 & 14);
         BigDecimal var10001;
         String[] var10002;
         if (var4.length > --2) {
            var10001 = new BigDecimal(var4[5 >> 1]);
            var10002 = var4;
         } else {
            var10001 = null;
            var10002 = var4;
         }

         var10000.eb(var10001, var10002[1]);
      } else if (var3 == 5 >> 1) {
         ((Class674)var2.getFormManagement().e(110 & 31)).r((boolean)(3 >> 2));
      } else if (var3 == --3 || var3 == --4 || var3 == --5 && var4.length == (1 ^ 3)) {
         ((Class674)var2.getFormManagement().e(110 & 31)).gd(var3, var4[2 ^ 3]);
      } else {
         if (var3 == --5) {
            ((Class674)var2.getFormManagement().e(78 & 63)).r((boolean)(--1));
         }

      }
   }
}
