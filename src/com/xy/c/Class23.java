package com.xy.c;

import com.xy.a.Class59;
import com.xy.bean.GangListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;

public class Class23 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("ganglist")) {
         GangListBean var4 = com.xy.v.Class31.a().fromJson(var2, GangListBean.class);
         ((Class59)var3.gameView.getFormManagement().j(28)).fm(var4.getGangs());
      }
   }
}
