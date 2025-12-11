package com.xy.c;

import com.xy.bean.RoleMoveBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class26 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      RoleMoveBean var4;
      com.xy.d.Class8 var5 = !com.xy.v.Class12.h((var4 = com.xy.v.Class31.a().fromJson(var2, RoleMoveBean.class)).getRole())
         ? var3.gameView.mapScene.j(var4.getRole())
         : null;
      if (var5 != null && var3.getRoleId() != var5.ap.getRole_id().longValue()) {
         var5.t(var4.getPaths(), var5.ap.getSp());
      }
   }
}
