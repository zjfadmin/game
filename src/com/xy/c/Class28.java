package com.xy.c;

import com.xy.bean.BabyListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class28 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      BabyListBean var5 = com.xy.v.Class31.a().fromJson(var2, BabyListBean.class);
      var4.roleData.setBabys(var5.getBabyList());
      var4.getFormManagement().b(1);
   }
}
