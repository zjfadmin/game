package com.xy;

import com.xy.bean.StallBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class561 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("stallstate")) {
         StallBean var4 = (StallBean)Class695.b().fromJson(var2, StallBean.class);
         var3.gameView.mapScene.ah(var4, var3.gameView);
      }

   }
}
