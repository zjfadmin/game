package com.xy.c;

import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class35 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      Goodstable var4;
      if ((var4 = com.xy.v.Class31.a().fromJson(var2, Goodstable.class)).getRole_id().longValue() == var3.getRoleId()) {
         if (var4.getUsetime() == null) {
            var4.setUsetime(1);
         }

         var4.setStatus(0);
         var3.gameView.roleData.aq(var4);
      }
   }
}
