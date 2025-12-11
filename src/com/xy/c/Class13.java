package com.xy.c;

import com.xy.a.q.Class85;
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

public class Class13 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("pawn")) {
         Goodstable var11 = com.xy.v.Class31.a().fromJson(var2, Goodstable.class);
         var4.roleData.aq(var11);
      } else {
         if (var1.equals("pawnpet")) {
            String var10001 = "\u000f";
            if (var2.startsWith("S")) {
               List var9 = com.xy.v.Class31.a().fromJson(var2.substring(1), new Class2(this).getType());
               ((Class85)var4.getFormManagement().j(131)).fm(var9);
               return;
            }

            var10001 = "x";
            if (!var2.startsWith("P")) {
               var10001 = "\u000e";
               if (!var2.startsWith("R")) {
                  return;
               }
            }

            RoleSummoning var7;
            GameView var10000;
            label35: {
               RoleData var5 = var4.roleData;
               LoginResult var6 = var4.roleData.getLoginResult();
               var6.setGold(new BigDecimal(var6.getGold().longValue() - 1000000L));
               var7 = com.xy.v.Class31.a().fromJson(var2.substring(1), RoleSummoning.class);
               var10001 = "x";
               if (var2.startsWith("P")) {
                  RolePet var8;
                  if ((var8 = var5.getRolePet(var7.getSid().longValue())) != null) {
                     var10000 = var4;
                     var5.pets.remove(var8);
                     break label35;
                  }
               } else {
                  var5.bg(var7);
               }

               var10000 = var4;
            }

            Class85 var12;
            if ((var12 = (Class85)var10000.getFormManagement().l(131)) != null) {
               String var10003 = "\f";
               var12.ey(var7, var2.startsWith("P") ? 1 : 2);
               return;
            }
         } else if (var1.equals("parcel")) {
            List var10 = com.xy.v.Class31.a().fromJson(var2, new Class33(this).getType());
            var4.roleData.ak(var10);
            var4.getFormManagement().b(182);
         }
      }
   }
}
