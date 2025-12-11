package com.xy.c;

import com.xy.a.Class46;
import com.xy.bean.TeamBean;
import com.xy.bean.TeamRoleList;
import com.xy.bean.TeanBeanList;
import com.xy.d.Class8;
import com.xy.entity.TeamRole;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class0 implements ServerAction {
   public void a(String var1, GameView var2) {
      String var10001 = "\u0011";
      String[] var3 = var1.split("#");
      BigDecimal var4 = new BigDecimal(var3[0]);
      String var10000 = var3[1];
      var10001 = "9\u0012;\u000b";
      if (!var10000.equals("null")) {
         var10000 = var3[1];
         var10001 = "\u001fN";
         String[] var5 = var10000.split("\\|");

         int var6;
         for (int var12 = var6 = 0; var12 < var5.length; var12 = ++var6) {
            com.xy.d.Class8 var7;
            if ((var7 = var2.mapScene.j(var5[var6])) != null) {
               var7.ap.setTroop_id(var4);
               var7.ap.setTeamInfo(var3[1]);
               var7.bk();
            }
         }
      }

      int var8;
      for (int var13 = var8 = 2; var13 < var3.length; var13 = ++var8) {
         var10000 = var3[var8];
         var10001 = "A";
         String[] var9 = var10000.split("&");
         com.xy.d.Class8 var10;
         if ((var10 = var2.mapScene.j(var9[0])) != null) {
            Class8 var15;
            label32: {
               if (Integer.parseInt(var9[1]) == -3) {
                  var10.ap.setTroop_id(null);
                  if (var10 == var2.roleUnit) {
                     var15 = var10;
                     var2.roleData.teamBean = null;
                     this.d(var2);
                     break label32;
                  }
               } else {
                  var10.ap.setTroop_id(var4);
               }

               var15 = var10;
            }

            var15.ap.setTeamInfo(null);
            var10.bk();
         }
      }
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("team1")) {
         TeamBean var9 = com.xy.v.Class31.a().fromJson(var2, TeamBean.class);
         var4.roleData.teamBean = var9;
         this.d(var4);
      } else if (var1.equals("team2")) {
         com.xy.q.Class30 var8;
         if ((var8 = var4.getFormManagement().l(30)) != null) {
            TeamRole var6 = com.xy.v.Class31.a().fromJson(var2, TeamRole.class);
            ((Class46)var8).mv(var6);
         } else {
            var4.baseView.ab(3, true);
         }
      } else if (var1.equals("team3")) {
         this.a(var2, var4);
      } else if (var1.equals("team4")) {
         this.c(var2, var4);
      } else if (var1.equals("team6")) {
         TeamRoleList var7 = com.xy.v.Class31.a().fromJson(var2, TeamRoleList.class);
         ((Class46)var4.getFormManagement().j(30)).fm(var7.getT());
      } else {
         if (var1.equals("enlist")) {
            TeanBeanList var5 = com.xy.v.Class31.a().fromJson(var2, TeanBeanList.class);
         }
      }
   }

   public void c(String var1, GameView var2) {
      TeamBean var3 = var2.roleData.teamBean;
      if (var2.roleData.teamBean != null) {
         TeamRole var4 = com.xy.v.Class31.a().fromJson(var1, TeamRole.class);
         byte var5 = 0;
         TeamBean var10000;
         if (var4.getState() == -3) {
            var5 = 1;
            var10000 = var3;
         } else {
            if (var4.getState() == 1 && var3.getTeams().get(0).getRoleId().compareTo(var4.getRoleId()) != 0) {
               var5 = 2;
            }

            var10000 = var3;
         }

         var10000.a(var4, var5);
         this.d(var2);
      }
   }

   public void d(GameView var1) {
      com.xy.q.Class30 var2;
      if ((var2 = var1.getFormManagement().l(13)) != null) {
         ((com.xy.a.Class25)var2).h();
      }

      var1.baseView.xb(var1.roleUnit.ap, var1.roleData.teamBean);
   }
}
