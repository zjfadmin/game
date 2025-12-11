package com.xy.c;

import com.xy.a.q.Class108;
import com.xy.bean.ConfirmBean;
import com.xy.bean.GoodTrans2;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class14 implements ServerAction {
   public void a(String var1, GameView var2) {
      GoodTrans2 var3 = com.xy.v.Class31.a().fromJson(var1, GoodTrans2.class);
      ((Class108)var2.getFormManagement().j(14)).anc(var3);
   }

   public void c(String var1, GameView var2) {
      String var10001 = "\u001fN";
      String[] var3;
      int var4;
      if ((var4 = Integer.parseInt((var3 = var1.split("\\|"))[0])) == 0) {
         String var10004 = var3[1];
         String var10007 = "\u0007\u001f玍寮\u0007\n";
         StringBuilder var10005 = new StringBuilder("#G玩家#R").append(var3[1]);
         String var10006 = "`u讴汰仧昡";
         var2.dm(new ConfirmBean(21, var10004, var10005.append("#G请求交易").toString()));
      } else if (var4 == 1) {
         Class108 var10000 = (Class108)var2.getFormManagement().j(14);
         BigDecimal var6;
         String[] var10002;
         if (var3.length > 2) {
            var6 = new BigDecimal(var3[2]);
            var10002 = var3;
         } else {
            var6 = null;
            var10002 = var3;
         }

         var10000.adb(var6, var10002[1]);
      } else if (var4 == 2) {
         ((Class108)var2.getFormManagement().j(14)).cr(false);
      } else if (var4 != 3 && var4 != 4 && (var4 != 5 || var3.length != 2)) {
         if (var4 == 5) {
            ((Class108)var2.getFormManagement().j(14)).cr(true);
         }
      } else {
         ((Class108)var2.getFormManagement().j(14)).cp(var4, var3[1]);
      }
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("TransGood")) {
         this.a(var2, var3.gameView);
      } else {
         if (var1.equals("TransState")) {
            this.c(var2, var3.gameView);
         }
      }
   }
}
