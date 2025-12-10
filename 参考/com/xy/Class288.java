package com.xy;

import com.xy.bean.BabyListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class288 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      BabyListBean var5 = (BabyListBean)Class695.b().fromJson(var2, BabyListBean.class);
      var4.roleData.setBabys(var5.getBabyList());
      var4.getFormManagement().a(5 >> 2);
   }
}
