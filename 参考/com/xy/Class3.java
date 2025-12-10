package com.xy;

import com.xy.bean.GangListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class3 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("ganglist")) {
         GangListBean var4 = (GangListBean)Class695.b().fromJson(var2, GangListBean.class);
         ((Class15)var3.gameView.getFormManagement().e(31 & 124)).ck(var4.getGangs());
      }

   }
}
