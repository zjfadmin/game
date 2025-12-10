package com.xy;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import java.util.List;

public class Class87 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      if (var2.startsWith("2")) {
         var2 = var2.substring(--1);
         Goodstable var8 = (Goodstable)Class695.b().fromJson(var2, Goodstable.class);
         ((Class270)var3.gameView.getFormManagement().e(126 & 47)).oj(var8, (boolean)(3 >> 1));
      } else if (var2.startsWith("3")) {
         int var7 = var2.indexOf("|");
         String var4 = var2.substring(3 & 5, var7);
         RoleSummoning var5 = (RoleSummoning)Class695.b().fromJson(var2.substring(var7 + (3 >> 1)), RoleSummoning.class);
         ((Class106)var3.gameView.getFormManagement().e(122 & 47)).amj(var5, var4, (List)null, (boolean)(5 >> 2));
      } else {
         if (var2.startsWith("4")) {
            var2 = var2.substring(5 >> 2);
            Lingbao var6 = (Lingbao)Class695.b().fromJson(var2, Lingbao.class);
            ((Class73)var3.gameView.getFormManagement().e(125 & 47)).ge(var6, (boolean)(5 >> 2));
         }

      }
   }
}
