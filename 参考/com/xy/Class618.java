package com.xy;

import com.google.gson.reflect.TypeToken;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class Class618 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var7 = var3.gameView;
      if (var1.equals("pawn")) {
         Goodstable var9 = (Goodstable)Class695.b().fromJson(var2, Goodstable.class);
         var7.roleData.ao(var9);
      } else {
         List var8;
         if (var1.equals("pawnpet")) {
            if (var2.startsWith("S")) {
               var8 = (List)Class695.b().fromJson(var2.substring(5 >> 2), (new TypeToken<List<RoleSummoning>>() {
               }).getType());
               ((Class258)var7.getFormManagement().e(23015 & 9883)).ck(var8);
               return;
            }

            if (var2.startsWith("P") || var2.startsWith("R")) {
               RoleSummoning var10;
               GameView var10000;
               label33: {
                  RoleData var4;
                  LoginResult var5 = (var4 = var7.roleData).getLoginResult();
                  var5.setGold(new BigDecimal(var5.getGold().longValue() - 1000000L));
                  var10 = (RoleSummoning)Class695.b().fromJson(var2.substring(3 & 5), RoleSummoning.class);
                  if (var2.startsWith("P")) {
                     RolePet var6;
                     if ((var6 = var4.getRolePet(var10.getSid().longValue())) != null) {
                        var10000 = var7;
                        var4.pets.remove(var6);
                        break label33;
                     }
                  } else {
                     var4.be(var10);
                  }

                  var10000 = var7;
               }

               Class258 var11;
               if ((var11 = (Class258)var10000.getFormManagement().m(16859 & 16039)) != null) {
                  var11.gs(var10, var2.startsWith("P") ? --1 : 2);
                  return;
               }
            }
         } else if (var1.equals("parcel")) {
            var8 = (List)Class695.b().fromJson(var2, (new TypeToken<List<Goodstable>>() {
            }).getType());
            var7.roleData.ab(var8);
            var7.getFormManagement().a(32759 & 190);
         }

      }
   }
}
