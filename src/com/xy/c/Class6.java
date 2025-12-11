package com.xy.c;

import com.xy.bean.StallBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class6 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("stallstate")) {
         StallBean var4 = com.xy.v.Class31.a().fromJson(var2, StallBean.class);
         var3.gameView.mapScene.i(var4, var3.gameView);
      }
   }
}
