package com.xy.c;

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

public class Class25 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      EnterGameBean var4;
      com.xy.v.Class22.d(
         (var4 = com.xy.v.Class31.a().fromJson(var2, EnterGameBean.class)).getServerTime() != 0L
            ? var4.getServerTime()
            : Long.parseLong(var4.getLoginResult().getUptime())
      );
      boolean var5 = false;
      if (var3.gameView == null) {
         var3.gameView = new GameView(GameMain.a(), var3);
         var5 = true;
      }

      GameView var6 = var3.gameView;
      var6.isLoadMap = false;
      LoginResult var7;
      var6.dk((var7 = var4.getLoginResult()).getMapid(), var7.getX().intValue(), var7.getY().intValue());
      RoleShow var8 = new RoleShow(var7);
      GameView var10000;
      if (var6.roleUnit == null) {
         var10000 = var6;
         var6.roleUnit = new com.xy.d.Class8(var8);
      } else {
         var10000 = var6;
         var6.roleUnit.bs(var8);
      }

      var10000.roleUnit.aa = 0;
      var6.mapScene.n(var6.roleUnit);
      List var9;
      int var10;
      if ((var9 = var4.getRoleShows()) != null) {
         for (int var16 = var10 = var9.size() - 1; var16 >= 0; var16 = --var10) {
            RoleShow var11;
            if ((var11 = (RoleShow)var9.get(var10)) != null) {
               var6.mapScene.aa(var11);
            }
         }
      }

      List var13;
      int var14;
      if ((var13 = var4.getStallBeans()) != null) {
         for (int var17 = var14 = var13.size() - 1; var17 >= 0; var17 = var14) {
            com.xy.n.Class0 var18 = var6.mapScene;
            Object var10001 = var13.get(var14);
            var14--;
            var18.i((StallBean)var10001, var6);
         }
      }

      var6.mapScene.s(var4.getMonster(), true, var6);
      var6.dq(var4.getSceneMsg());
      RoleData var15 = var6.roleData;
      String var19 = var7.getKill();
      String var21 = "/e0\u0014";
      String var10002 = "\u001f";
      String var12;
      if ((var12 = com.xy.v.Class5.i(var19, "FLY=", "|")) != null && !var12.equals("")) {
         var15.lastFlyId = new BigDecimal(var12);
      }

      var15.bf(var4.getPackRecord(), var4.getRoleSystem(), var4.getPrivateData(), var4.getLoginResult());
      var15.r();
      var15.ap(var4.getList());
      var15.m(var4.getRoleSummonings(), var4.getMounts(), var4.getLingbaos(), var4.getBabys(), var4.getPals());
      var15.ae();
      var15.teamBean = var4.getTeamBean();
      var15.a();
      var15.ax();
      var15.bm();
      var15.b(var4.getActivity());
      var15.ak(null);
      var6.baseView.c();
      var6.e();
      var6.baseView.xb(var8, var15.teamBean);
      var6.baseView.aef = true;
      var15.getTaskSystem().r();
      var15.as();
      var6.setViewTitleData();
      var6.isDraw = true;
      var6.isLoadMap = true;
      var6.getBaseView().ci(com.xy.v.Class22.g());
      var6.getGameReadBar().setCountDown();
      if (var5) {
         Class25 var20;
         label60: {
            var3.gameView.isDraw = true;
            var3.gameView.gameFrame.aby(var3.gameView);
            if (!var3.l(2, 9) && !var3.l(2, 12)) {
               if (var3.gameType == 2) {
                  if (var15.getLoginResult().getVipget() == null) {
                     ((com.xy.a.q.Class35)var6.getFormManagement().j(103)).g(1);
                     var20 = this;
                     break label60;
                  }
               } else if (var3.gameType == 4 || var6.roleUnit.ap.getGrade() <= (var3.gameType == 1 ? 465 : 102)) {
                  var6.getFormManagement().b(129);
               }
            }

            var20 = this;
         }

         var20.av(var6);
         this.d(var6);
      }

      var6.getFormManagement().f(182);
   }

   public void av(GameView var1) {
      if (var1.getClient().gameMount) {
         BaseMountSH var3 = var1.roleData.getMountSHByindex(0);

         int var4;
         for (int var10000 = var4 = 0; var10000 < var3.getMounts().length; var10000 = ++var4) {
            BaseMountSkill var5;
            if ((var5 = var3.getMounts()[var4]).getB1() != 0 && var5.getB2() != 0 && var5.getB3() == 0) {
               String var10001 = "佉杠审拍矚聹乬聾尔･诞屔忂蠌公";
               var1._do("你有守护石耐久耗尽，请尽快补充");
               return;
            }
         }
      }
   }

   public void d(GameView var1) {
      if (var1.getClient().gameBeau) {
         UseCardBean var3;
         if ((var3 = var1.roleData.getLimit("靓号")) != null) {
            if (var3.getUseTime() <= 7200) {
               String var10001 = "讔沇慬伏盧霼厔匜履剟杼";
               var1._do("请注意你的靓号即将到期");
            }
         }
      }
   }
}
