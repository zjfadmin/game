package com.xy;

import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class437 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var2.startsWith("G7")) {
         ((Class147)var4.getFormManagement().e(125 & 127)).f(var2.substring(1 ^ 3));
      } else {
         var4.roleData.getTaskSystem().m(var2);
      }
   }
}
