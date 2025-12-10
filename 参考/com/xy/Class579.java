package com.xy;

import com.xy.bean.TeamBean;
import com.xy.bean.TeamRoleList;
import com.xy.bean.TeanBeanList;
import com.xy.entity.TeamRole;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class579 implements ServerAction {
   public void k(String var1, GameView var2) {
      TeamBean var3;
      if ((var3 = var2.roleData.teamBean) != null) {
         TeamRole var5 = (TeamRole)Class695.b().fromJson(var1, TeamRole.class);
         int var4 = 3 >> 2;
         TeamBean var10000;
         if (var5.getState() == (-3 & -1)) {
            var4 = --1;
            var10000 = var3;
         } else {
            if (var5.getState() == (3 & 5) && ((TeamRole)var3.getTeams().get(3 & 4)).getRoleId().compareTo(var5.getRoleId()) != 0) {
               var4 = 5 >> 1;
            }

            var10000 = var3;
         }

         var10000.a(var5, var4);
         this.c(var2);
      }
   }

   public void c(GameView var1) {
      Class345 var2;
      if ((var2 = var1.getFormManagement().m(15 & 125)) != null) {
         ((Class520)var2).d();
      }

      var1.baseView.ku(var1.roleUnit.r, var1.roleData.teamBean);
   }

   public void l(String var1, GameView var2) {
      String[] var7 = var1.split("#");
      BigDecimal var6 = new BigDecimal(var7[5 >> 3]);
      int var10000;
      Class183 var3;
      if (!var7[3 >> 1].equals("null")) {
         String[] var4 = var7[4 ^ 5].split("\\|");

         int var5;
         for(var10000 = var5 = 2 & 5; var10000 < var4.length; var10000 = var5) {
            if ((var3 = var2.mapScene.a(var4[var5])) != null) {
               var3.r.setTroop_id(var6);
               var3.r.setTeamInfo(var7[2 ^ 3]);
               var3.ac();
            }

            ++var5;
         }
      }

      int var8;
      for(var10000 = var8 = 2; var10000 < var7.length; var10000 = var8) {
         String[] var9 = var7[var8].split("&");
         if ((var3 = var2.mapScene.a(var9[3 >> 2])) != null) {
            Class183 var10;
            label32: {
               if (Integer.parseInt(var9[3 >> 1]) == (-1 & -3)) {
                  var3.r.setTroop_id((BigDecimal)null);
                  if (var3 == var2.roleUnit) {
                     var10 = var3;
                     var2.roleData.teamBean = null;
                     this.c(var2);
                     break label32;
                  }
               } else {
                  var3.r.setTroop_id(var6);
               }

               var10 = var3;
            }

            var10.r.setTeamInfo((String)null);
            var3.ac();
         }

         ++var8;
      }

   }

   public void a(String var1, String var2, GameClient var3) {
      GameView var6 = var3.gameView;
      if (var1.equals("team1")) {
         TeamBean var8 = (TeamBean)Class695.b().fromJson(var2, TeamBean.class);
         var6.roleData.teamBean = var8;
         this.c(var6);
      } else if (var1.equals("team2")) {
         Class345 var7;
         if ((var7 = var6.getFormManagement().m(63 & 94)) != null) {
            TeamRole var5 = (TeamRole)Class695.b().fromJson(var2, TeamRole.class);
            ((Class26)var7).hd(var5);
         } else {
            var6.baseView.jy(--3, (boolean)(5 >> 2));
         }
      } else if (var1.equals("team3")) {
         this.l(var2, var6);
      } else if (var1.equals("team4")) {
         this.k(var2, var6);
      } else if (var1.equals("team6")) {
         TeamRoleList var4 = (TeamRoleList)Class695.b().fromJson(var2, TeamRoleList.class);
         ((Class26)var6.getFormManagement().e(62 & 95)).ck(var4.getT());
      } else {
         if (var1.equals("enlist")) {
            TeanBeanList var10000 = (TeanBeanList)Class695.b().fromJson(var2, TeanBeanList.class);
         }

      }
   }
}
