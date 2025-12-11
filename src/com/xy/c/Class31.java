package com.xy.c;

import com.xy.a.Class110;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class31 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      ((Class110)var3.gameView.getFormManagement().j(9)).ci(var2);
   }
}
