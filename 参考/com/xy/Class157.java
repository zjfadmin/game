package com.xy;

import com.xy.bean.RoleShow;
import com.xy.bean.TitleBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class Class157 implements ServerAction {
   public void k(String var1, GameView var2) {
      TitleBean var3 = (TitleBean)Class695.b().fromJson(var1, TitleBean.class);
      ((Class410)var2.getFormManagement().e(30 & 107)).ahq(var3);
   }

   public void l(String var1, GameView var2) {
      RoleShow var4;
      (var4 = (RoleShow)Class695.b().fromJson(var1, RoleShow.class)).setColorTitle(var2.getObjectArea().u(var4.getTitle()));
      GameView var10000;
      if (var2.roleUnit.r.getRole_id().compareTo(var4.getRole_id()) == 0) {
         var2.roleUnit.ag(var4.getTitle(), var4.getColorTitle());
         var10000 = var2;
      } else {
         Class183 var3;
         if ((var3 = var2.mapScene.a(var4.getRolename())) != null) {
            var3.ag(var4.getTitle(), var4.getColorTitle());
         }

         var10000 = var2;
      }

      var10000.getFormManagement().n(14 & 123);
   }

   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("titlelist")) {
         this.k(var2, var3.gameView);
      } else {
         if (var1.equals("titlechange")) {
            this.l(var2, var3.gameView);
         }

      }
   }
}
