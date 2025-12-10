package com.xy;

import com.google.gson.reflect.TypeToken;
import com.xy.bean.GangReward;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import java.util.List;

public class Class5 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("obtainarticle")) {
         this.d(var2, var3);
      } else {
         if (var1.equals("drawnitems")) {
            this.e(var2, var3);
         }

      }
   }

   public void d(String var1, GameClient var2) {
      List var3 = (List)Class695.b().fromJson(var1, (new TypeToken<List<GangReward>>() {
      }).getType());
      ((Class483)var2.gameView.getFormManagement().e(123 & 63)).ck(var3);
   }

   public void e(String var1, GameClient var2) {
      Class483 var4;
      if ((var4 = (Class483)var2.gameView.getFormManagement().m(59 & 127)) != null) {
         GangReward var3 = (GangReward)Class695.b().fromJson(var1, GangReward.class);
         var4.nx(var3);
      }
   }
}
