package com.xy;

import com.xy.bean.EnterGameBean;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.bean.UseCardBean;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.game.RoleData;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class Class163 implements ServerAction {
   public void b(GameView var1) {
      if (var1.getClient().gameBeau) {
         UseCardBean var2;
         if ((var2 = var1.roleData.getLimit("靓号")) != null) {
            if (var2.getUseTime() <= (32740 & 7227)) {
               var1.f("请注意你的靓号即将到期");
            }
         }
      }
   }

   public void c(GameView var1) {
      if (var1.getClient().gameMount) {
         BaseMountSH var2 = var1.roleData.getMountSHByindex(5 >> 3);

         int var3;
         for(int var10000 = var3 = 3 >> 2; var10000 < var2.getMounts().length; var10000 = var3) {
            BaseMountSkill var4;
            if ((var4 = var2.getMounts()[var3]).getB1() != 0 && var4.getB2() != 0 && var4.getB3() == 0) {
               var1.f("你有守护石耐久耗尽，请尽快补充");
               return;
            }

            ++var3;
         }

      }
   }

   public void a(String var1, String var2, GameClient var3) {
      EnterGameBean var10;
      Class280.k((var10 = (EnterGameBean)Class695.b().fromJson(var2, EnterGameBean.class)).getServerTime() != 0L ? var10.getServerTime() : Long.parseLong(var10.getLoginResult().getUptime()));
      int var11 = 2 & 5;
      int var10000;
      if (var3.gameView == null) {
         var10000 = 4 ^ 5;
         var3.gameView = new GameView(GameMain.c(), var3);
         var11 = var10000;
      }

      GameView var4 = var3.gameView;
      var4.isLoadMap = (boolean)(2 & 5);
      LoginResult var5;
      var4.abd((var5 = var10.getLoginResult()).getMapid(), var5.getX().intValue(), var5.getY().intValue());
      RoleShow var6 = new RoleShow(var5);
      var6.setColorTitle(var4.getObjectArea().u(var6.getTitle()));
      GameView var16;
      if (var4.roleUnit == null) {
         var4.roleUnit = new Class183(var6);
         var16 = var4;
      } else {
         var4.roleUnit.w(var6);
         var16 = var4;
      }

      var16.roleUnit.ac = 3 ^ 3;
      var4.mapScene.ag(var4.roleUnit);
      List var7;
      int var8;
      if ((var7 = var10.getRoleShows()) != null) {
         for(var10000 = var8 = var7.size() - (4 ^ 5); var10000 >= 0; var10000 = var8) {
            RoleShow var9;
            if ((var9 = (RoleShow)var7.get(var8)) != null) {
               var4.mapScene.x(var9);
            }

            --var8;
         }
      }

      List var13;
      int var14;
      if ((var13 = var10.getStallBeans()) != null) {
         for(var10000 = var14 = var13.size() - (2 ^ 3); var10000 >= 0; var10000 = var14) {
            Class471 var18 = var4.mapScene;
            Object var10001 = var13.get(var14);
            --var14;
            var18.ah((StallBean)var10001, var4);
         }
      }

      var4.mapScene.d(var10.getMonster(), (boolean)(3 & 5), var4);
      var4.im(var10.getSceneMsg());
      RoleData var15 = var4.roleData;
      String var12;
      if ((var12 = Class509.c(var5.getKill(), "FLY=", "|")) != null && !var12.equals("")) {
         var15.lastFlyId = new BigDecimal(var12);
      }

      var15.o(var10.getPackRecord(), var10.getRoleSystem(), var10.getPrivateData(), var10.getLoginResult());
      var15.am();
      var15.as(var10.getList());
      var15.au(var10.getRoleSummonings(), var10.getMounts(), var10.getLingbaos(), var10.getBabys(), var10.getPals());
      var15.bg();
      var15.teamBean = var10.getTeamBean();
      var15.v();
      var15.w();
      var15.z(var10.getActivity());
      var15.ba();
      var15.ab((List)null);
      var4.baseView.km();
      var4.s();
      var4.baseView.ku(var6, var15.teamBean);
      var4.baseView.sw = (boolean)(4 ^ 5);
      var15.getTaskSystem().i();
      var15.ay();
      int var10004 = 4 ^ 5;
      int var10006 = 3 & 5;
      var4.setViewTitleData();
      var4.isDraw = (boolean)var10006;
      var4.isLoadMap = (boolean)var10004;
      var4.getBaseView().la(Class280.a());
      var4.getGameReadBar().setCountDown();
      if (var11 != 0) {
         Class163 var19;
         label58: {
            int var17 = 1 ^ 3;
            var3.gameView.isDraw = (boolean)(3 >> 1);
            var3.gameView.gameFrame.cx(var3.gameView);
            if (!var3.n(var17, 121 & 15) && !var3.n(1 ^ 3, 92 & 47)) {
               if (var3.gameType == --2) {
                  if (var15.getLoginResult().getVipget() == null) {
                     ((Class420)var4.getFormManagement().e(119 & 111)).y(3 & 5);
                     var19 = this;
                     break label58;
                  }
               } else if (var3.gameType == --4 || var4.roleUnit.r.getGrade() <= (var3.gameType == (2 ^ 3) ? 17915 & 15317 : 102)) {
                  var4.getFormManagement().a(22227 & 10669);
               }
            }

            var19 = this;
         }

         var19.c(var4);
         this.b(var4);
         var3.gameView.automation.setAutomationTask(22 & 111);
         var3.gameView.automation.setAutomationBtnRed(--5);
      }

      var4.getFormManagement().n(21431 & 11518);
   }
}
