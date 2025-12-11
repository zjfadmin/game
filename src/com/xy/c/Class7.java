package com.xy.c;

import com.xy.a.Class83;
import com.xy.bean.GangReward;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import java.util.List;

public class Class7 implements ServerAction {
   public void r(String var1, GameClient var2) {
      List var3 = com.xy.v.Class31.a().fromJson(var1, new Class18(this).getType());
      ((Class83)var2.gameView.getFormManagement().j(59)).fm(var3);
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("obtainarticle")) {
         this.r(var2, var3);
      } else {
         if (var1.equals("drawnitems")) {
            this.h(var2, var3);
         }
      }
   }

   public void h(String var1, GameClient var2) {
      Class83 var3;
      if ((var3 = (Class83)var2.gameView.getFormManagement().l(59)) != null) {
         GangReward var4 = com.xy.v.Class31.a().fromJson(var1, GangReward.class);
         var3.hc(var4);
      }
   }
}
