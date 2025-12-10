package com.xy;

import com.xy.bean.RoleMoveBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class262 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      RoleMoveBean var4;
      Class183 var5 = !Class394.o((var4 = (RoleMoveBean)Class695.b().fromJson(var2, RoleMoveBean.class)).getRole()) ? var3.gameView.mapScene.a(var4.getRole()) : null;
      if (var5 != null && var3.getRoleId() != var5.r.getRole_id().longValue()) {
         var5.bs(var4.getPaths(), var5.r.getSp());
      }
   }
}
