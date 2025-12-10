package com.xy;

import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class591 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      Goodstable var4;
      if ((var4 = (Goodstable)Class695.b().fromJson(var2, Goodstable.class)).getRole_id().longValue() == var3.getRoleId()) {
         if (var4.getUsetime() == null) {
            var4.setUsetime(3 & 5);
         }

         var4.setStatus(3 >> 2);
         var3.gameView.roleData.ao(var4);
      }
   }
}
