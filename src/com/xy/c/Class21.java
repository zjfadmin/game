package com.xy.c;

import com.xy.bean.RoleShow;
import com.xy.bean.TitleBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class21 implements ServerAction {
   public void a(String var1, GameView var2) {
      RoleShow var3 = com.xy.v.Class31.a().fromJson(var1, RoleShow.class);
      GameView var10000;
      if (var2.roleUnit.ap.getRole_id().compareTo(var3.getRole_id()) == 0) {
         var10000 = var2;
         var2.roleUnit.aq(var3.getTitle());
      } else {
         com.xy.d.Class8 var4;
         if ((var4 = var2.mapScene.j(var3.getRolename())) != null) {
            var4.aq(var3.getTitle());
         }

         var10000 = var2;
      }

      var10000.getFormManagement().f(10);
   }

   public void c(String var1, GameView var2) {
      TitleBean var3 = com.xy.v.Class31.a().fromJson(var1, TitleBean.class);
      ((com.xy.a.w.Class10)var2.getFormManagement().j(10)).lh(var3);
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("titlelist")) {
         this.c(var2, var3.gameView);
      } else {
         if (var1.equals("titlechange")) {
            this.a(var2, var3.gameView);
         }
      }
   }
}
