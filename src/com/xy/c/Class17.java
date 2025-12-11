package com.xy.c;

import com.xy.a.q.Class70;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class17 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      String var10001 = "T_";
      if (var2.startsWith("G7")) {
         ((Class70)var4.getFormManagement().j(125)).ci(var2.substring(2));
      } else {
         var4.roleData.getTaskSystem().d(var2);
      }
   }
}
