package com.xy.c;

import com.xy.a.Class48;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class22 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      String var10001 = "b";
      if (var2.startsWith("2")) {
         var2 = var2.substring(1);
         Goodstable var10 = com.xy.v.Class31.a().fromJson(var2, Goodstable.class);
         ((Class48)var3.gameView.getFormManagement().j(46)).hr(var10, true);
      } else {
         var10001 = "B";
         if (var2.startsWith("3")) {
            var2 = var2.substring(1);
            RoleSummoning var9 = com.xy.v.Class31.a().fromJson(var2, RoleSummoning.class);
            ((com.xy.a.Class1)var3.gameView.getFormManagement().j(42)).aa(var9, null, true);
         } else {
            var10001 = "d";
            if (var2.startsWith("4")) {
               var2 = var2.substring(1);
               Lingbao var4 = com.xy.v.Class31.a().fromJson(var2, Lingbao.class);
               ((com.xy.a.Class7)var3.gameView.getFormManagement().j(45)).cs(var4, true);
            }
         }
      }
   }
}
