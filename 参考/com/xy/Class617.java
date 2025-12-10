package com.xy;

import com.google.gson.reflect.TypeToken;
import com.xy.bean.ApplyPayBean;
import com.xy.bean.BeauBean;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.FriendBean;
import com.xy.bean.GangChangeBean;
import com.xy.bean.GangResultBean;
import com.xy.bean.LoginResult;
import com.xy.bean.Middle;
import com.xy.bean.PalacePkBean;
import com.xy.bean.PayvipBean;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.RoleTransBean;
import com.xy.bean.Stall;
import com.xy.bean.UseCardBean;
import com.xy.bean.UserRoleArrBean;
import com.xy.entity.DataOther;
import com.xy.entity.TeamRole;
import com.xy.formula.BaseMeridians;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityRole;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.List;

public class Class617 implements ServerAction {

   private void m(String var1, GameClient var2) {
      PalacePkBean var3 = (PalacePkBean)Class695.b().fromJson(var1, PalacePkBean.class);
      GameView var4 = var2.gameView;
      if (var3.getType() == 0) {
         ((Class0)var4.getFormManagement().e(95 & 98)).ahl(5 >> 1, var3);
      } else {
         ((Class0)var4.getFormManagement().e(118 & 75)).ahl(--3, var3);
      }
   }


   private void n(String var1, GameClient var2) {
      GangChangeBean var8 = (GangChangeBean)Class695.b().fromJson(var1, GangChangeBean.class);
      GameView var9;
      GameView var10000 = var9 = var2.gameView;
      LoginResult var4 = var10000.roleData.getLoginResult();
      RoleShow var3 = var10000.roleUnit.r;
      var4.setGang_id(var8.getGangid());
      var4.setGangname(var8.getGangName());
      String var5 = var4.getGangpost();
      var4.setGangpost(var8.getPost());
      var3.setGang_id(var8.getGangid());
      var3.setGangname(var8.getGangName());
      if (var8.getMsg() != null) {
         var9.f(var8.getMsg());
      }

      Class490 var10;
      if ((var10 = (Class490)var9.getFormManagement().m(63 & 112)) != null) {
         GangResultBean var11 = var10.agb().dy();
         int var6;
         LoginResult var7;
         int var12;
         if ("帮主".equals(var8.getPost())) {
            for(var12 = var6 = 5 >> 3; var12 < var11.getRoleTables().size(); var12 = var6) {
               var7 = (LoginResult)var11.getRoleTables().get(var6);
               if ("帮主".equals(var7.getGangpost())) {
                  var7.setGangpost(var5);
               }

               ++var6;
            }
         }

         Class490 var13;
         label31: {
            for(var12 = var6 = 0; var12 < var11.getRoleTables().size(); var12 = var6) {
               if ((var7 = (LoginResult)var11.getRoleTables().get(var6)).getRole_id().compareTo(var4.getRole_id()) == 0) {
                  var7.setGang_id(var8.getGangid());
                  var7.setGangname(var8.getGangName());
                  var7.getGangpost();
                  var7.setGangpost(var8.getPost());
                  var13 = var10;
                  break label31;
               }

               ++var6;
            }

            var13 = var10;
         }

         var13.agb().ea(var11);
         var10.agb().r((boolean)(3 >> 2));
         var10.agb().r((boolean)(2 ^ 3));
      }

   }


   private void o(String var1, GameClient var2) {
      if (var1.charAt(3 >> 2) == (87 & 105)) {
         this.ac(var1, var2);
      } else {
         GameView var5;
         RoleData var10000 = (var5 = var2.gameView).roleData;
         BaseMeridians var4 = var10000.getRoleProperty().g(var1.substring(5 >> 2));
         var10000.getRoleProperty().n();
         if (var4 != null) {
            BaseMeridians var7;
            label25: {
               Class371 var3;
               if ((var3 = (Class371)var5.getFormManagement().d(126 & 83)) != null) {
                  if (var4.getBh() == 0) {
                     var7 = var4;
                     var3.as(3 & 5);
                     break label25;
                  }

                  var4.getBh();
               }

               var7 = var4;
            }

            Class473 var6;
            if (var7.getBh() == 0 && (var6 = (Class473)var5.getFormManagement().d(123 & 127)) != null) {
               var6.apy(var4, -4 >> 2);
            }

         }
      }
   }


   private void p(String var1, GameClient var2) {
      GameView var6 = var2.gameView;
      int var3;
      if ((var3 = var1.indexOf("|")) == -4 >> 2) {
         var3 = var1.length();
      }

      int var4;
      Class653 var5;
      if ((var4 = Integer.parseInt(var1.substring(3 >> 2, var3))) != (4927 & 28150) && var4 != (10623 & 22455)) {
         if (var4 == (23996 & 9083) || var4 == (4539 & 28541)) {
            if ((var5 = (Class653)var6.getFormManagement().e(31671 & 1231)).jz() == null) {
               return;
            }

            var5.jy(--1, (boolean)(var4 == (15292 & 17787) ? 2 ^ 3 : 0));
            if (var3 < var1.length()) {
               var6.f(var1.substring(var3 + (3 >> 1)));
            }
         }
      } else {
         if ((var5 = (Class653)var6.getFormManagement().e(6295 & 26607)).jx() == null) {
            return;
         }

         var5.jy(3 >> 2, (boolean)(var4 == (17343 & 15734) ? --1 : 0));
         if (var3 < var1.length()) {
            var6.f(var1.substring(var3 + (5 >> 2)));
            return;
         }
      }

   }


   private void q(String var1, GameClient var2) {
      GameView var7 = var2.gameView;
      Class622 var3;
      if (var1.startsWith("X0")) {
         var3 = (Class622)var7.getFormManagement().e(127 & 117);
         var3.gd(3 & 4, var1);
         if (var7.getFormManagement().m(127 & 117) == null) {
            var7.getFormManagement().a(127 & 117);
            return;
         }
      } else if (var1.startsWith("X1")) {
         var3 = (Class622)var7.getFormManagement().e(127 & 117);
         var3.gd(3 & 5, var1);
         if (var7.getFormManagement().m(127 & 117) == null) {
            var7.getFormManagement().a(119 & 125);
            return;
         }
      } else if (var1.startsWith("S1")) {
         int var8 = var1.indexOf("|");
         long var4 = Long.parseLong(var1.substring(--2, var8));
         BigDecimal var6 = new BigDecimal(var1.substring(var8 + (2 ^ 3)));
         var7.roleData.getLoginResult().setCodecard(var7.roleData.getLoginResult().getCodecard().add(var6));
         ((Class622)var7.getFormManagement().e(125 & 119)).gh(var4);
         var7.f("下架成功");
      }

   }


   private void r(String var1, GameClient var2) {
      GangResultBean var3 = (GangResultBean)Class695.b().fromJson(var1, GangResultBean.class);
      ((Class490)var2.gameView.getFormManagement().e(118 & 57)).ea(var3);
   }


   private void s(String var1, GameClient var2) {
      GameView var4 = var2.gameView;
      UserRoleArrBean var3;
      if ((var3 = (UserRoleArrBean)Class695.b().fromJson(var1, UserRoleArrBean.class)) != null && var3.getList() != null) {
         ((Class1)var4.getFormManagement().e(125 & 62)).tr(var3.getPhonestatues(), var3.getList());
      }
   }


   private void t(String var1, GameClient var2) {
      Class219 var4;
      GameView var8;
      List var5 = (var4 = (var8 = var2.gameView).baseView).ks();
      String[] var10 = var1.split("\\|");

      int var6;
      for(int var10000 = var6 = 2 & 5; var10000 < var10.length; var10000 = var6) {
         int var7 = Class394.b(var10[var6], 2 ^ 3, var10[var6].length());
         int var3;
         if (var10[var6].startsWith("R")) {
            if (var7 > (126 & 101) && var7 < (29150 & 3817) && var8.roleData.getActivity(var7) != null) {
               var8.roleData.aq(var7);
               Activity var9 = var8.getObjectArea().ad() ? var8.getObjectArea().aq(var7) : null;
               if (var9 != null) {
                  if (var9.getModelId() == (3 & 5)) {
                     var8.getFormManagement().n(2283 & 30652);
                  } else if (var9.getModelId() == (1 ^ 3)) {
                     var8.getFormManagement().n(29934 & 3001);
                  }
               }
            }

            for(var10000 = var3 = 0; var10000 < var5.size(); var10000 = var3) {
               if (var7 == ((Class441)var5.get(var3)).tp()) {
                  var5.remove(var3);
                  var4.remove((Component)var5.get(var3));
                  break;
               }

               ++var3;
            }
         } else if (var10[var6].startsWith("A")) {
            var10000 = var3 = 2 & 5;

            while(true) {
               if (var10000 >= var5.size()) {
                  Class441 var11 = new Class441("sc/b/vicon" + var7 + ".png", --1, 5 >> 3, var4);
                  var11.ab(var7);
                  var4.add(var11);
                  var5.add(var11);
                  break;
               }

               if (var7 == ((Class441)var5.get(var3)).tp()) {
                  break;
               }

               ++var3;
               var10000 = var3;
            }
         }

         ++var6;
      }

      var4.p();
      var2.gameView.automation.setAutomationBtnRed(--5);
   }

   public void u(String var1, GameClient var2) {
      GameView var6 = var2.gameView;
      if (var1.startsWith("CJ")) {
         int var7;
         if ((var7 = var1.indexOf("|")) != -4 >> 2) {
            int var4 = Integer.parseInt(var1.substring(5 >> 1, var7));
            List var5 = (List)Class695.b().fromJson(var1.substring(var7 + --1), (new TypeToken<List<ChongjipackBean>>() {
            }).getType());
            ((Class284)var6.getFormManagement().e(20654 & 12247)).tr(var4, var5);
         }
      } else {
         List var3 = (List)Class695.b().fromJson(var1, (new TypeToken<List<ChongjipackBean>>() {
         }).getType());
         ((Class420)var6.getFormManagement().e(119 & 111)).aqg(var3);
      }
   }


   private void v(String var1, GameClient var2) {
      GameView var4 = var2.gameView;
      List var3 = (List)Class695.b().fromJson(var1, (new TypeToken<List<PayvipBean>>() {
      }).getType());
      Class174 var5;
      if ((var5 = (Class174)var4.getFormManagement().m(39 & 127)) != null) {
         var5.ck(var3);
      }

   }


   private void w(String var1, GameClient var2) {
      GameView var6 = var2.gameView;
      if (var1.startsWith("X")) {
         ((Class204)var6.getFormManagement().e(126 & 123)).f(var1);
      } else if (!var1.startsWith("B") && !var1.startsWith("T")) {
         Class484 var3 = (Class484)var6.getFormManagement().e(110 & 125);
         if (var1.startsWith("D")) {
            if (var1.length() > --1) {
               var6.f(var1.substring(4 ^ 5));
            }

            var3.s();
         } else {
            String var4;
            if (var1.startsWith("A")) {
               var4 = var1.substring(3 >> 1);
               BigDecimal var7;
               if ((var7 = new BigDecimal(var4)).compareTo(var6.roleData.getLoginResult().getRole_id()) == 0) {
                  var3.y(1 ^ 3);
               }

               var3.bk(var7);
            } else {
               List var5;
               if (var1.startsWith("O")) {
                  var4 = var1.substring(2 ^ 3);
                  var5 = (List)Class695.b().fromJson(var4, (new TypeToken<List<TeamRole>>() {
                  }).getType());
                  int var10002 = 2 & 5;
                  var3.oo(var5, 3 & 5);
                  var3.y(var10002);
                  var6.getFormManagement().a(109 & 126);
               } else {
                  if (var1.startsWith("E")) {
                     var4 = var1.substring(2 ^ 3);
                     var5 = (List)Class695.b().fromJson(var4, (new TypeToken<List<TeamRole>>() {
                     }).getType());
                     var3.oo(var5, 3 >> 2);
                  }

               }
            }
         }
      } else {
         ((Class392)var6.getFormManagement().e(125 & 126)).f(var1);
      }
   }


   private void x(String var1, GameClient var2) {
      String var10000 = var1;
      var1 = var1.substring(3 ^ 3, --1);
      String var3 = var10000.substring(3 >> 1);
      int var4;
      if ((var4 = Integer.parseInt(var1)) != 0 && var4 != 5 >> 2 && var4 != 5 >> 1 && var4 != --3 && var4 == --4) {
         GameView var6 = var2.gameView;
         var6.roleData.getPackRecord().setCollect(var3);
         Class218 var5;
         if ((var5 = (Class218)var6.getFormManagement().m(107 & 85)) != null) {
            var5.d();
         }
      }

   }


   private void y(String var1, GameClient var2) {
      char var3;
      if ((var3 = var1.charAt(3 ^ 3)) == (118 & 91)) {
         this.aa(var1, var2);
      } else {
         if (var3 == (95 & 118)) {
            if ((var3 = var1.charAt(--1)) == (124 & 51)) {
               this.ag(2 & 5, var1, var2);
               return;
            }

            if (var3 == (123 & 53)) {
               this.ag(3 & 5, var1, var2);
               return;
            }
         } else if (var3 == (91 & 119)) {
            if ((var3 = var1.charAt(4 ^ 5)) == (112 & 63)) {
               var2.gameView.automation.o((boolean)(3 >> 1));
               return;
            }

            if (var3 == (63 & 113)) {
               var2.gameView.automation.p();
            }
         }

      }
   }


   private void z(String var1, GameClient var2) {
      RoleData var5;
      GameView var7;
      LoginResult var4 = (var5 = (var7 = var2.gameView).roleData).getLoginResult();
      ApplyPayBean var6;
      if ((var6 = (ApplyPayBean)Class695.b().fromJson(var1, ApplyPayBean.class)).getAddX() != null) {
         var4.setCodecard(var4.getCodecard().add(var6.getAddX()));
      }

      if (var6.getAddC() != null) {
         var4.setMoney(var4.getMoney() + var6.getAddC().intValue());
      }

      if (var6.getAddM() != null) {
         var4.setPaysum(var4.getPaysum().add(var6.getAddM()));
         var4.setDaypaysum(var4.getDaypaysum().add(var6.getAddM()));
         Class174 var3;
         if ((var3 = (Class174)var7.getFormManagement().m(55 & 111)) != null) {
            var3.y(--3);
         }
      }

      if (var6.getLowOrHihtpack() != null) {
         var4.setLowOrHihtpack(var6.getLowOrHihtpack().intValue());
      }

      if (var6.getDayandpayorno() != null) {
         int var10001 = --1;
         var4.setDayandpayorno(var4.getDayandpayorno());
         var4.setDayfirstinorno(var10001);
      }

      UseCardBean var8;
      if (var6.getUseCardBean() != null) {
         var8 = var6.getUseCardBean();
         var5.k(var8.getName(), var8.getType(), var8.getSkin(), var8.getValue(), var8.getTime());
      }

      if (var6.getVIPBean() != null) {
         var8 = var6.getVIPBean();
         var5.k(var8.getName(), var8.getType(), var8.getSkin(), var8.getValue(), var8.getTime());
      }

      if (var6.getActivity() != null) {
         Class286.l(var6.getActivity(), var7);
      }

      if (var6.getMsg() != null) {
         var7.f(var6.getMsg());
      }

   }


   private void aa(String var1, GameClient var2) {
      BigDecimal var7 = null;
      BeauBean var4 = null;
      int var5 = 3 ^ 3;
      int var6 = 3 & 5;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var6 + (5 >> 2))) == -4 >> 2) {
            var3 = var1.length();
         }

         if (var5 == 0) {
            var7 = new BigDecimal(Class394.q(var1, var6, var3));
            var10000 = var3;
         } else {
            if (var5 == (2 ^ 3)) {
               var4 = new BeauBean(var1, var6, var3);
            }

            var10000 = var3;
         }

         ++var5;
         var6 = var10000 + 1;
      }

      GameView var8 = var2.gameView;
      if (var7.longValue() == var8.roleData.getRoleId()) {
         var8.setViewTitleData();
      } else {
         FriendBean var9;
         if ((var9 = var8.roleData.getFriend(var7.longValue())) != null) {
            var9.setBeauBean(var4);
         }

      }
   }


   private void ab(String var1, GameClient var2) {
      GameView var4 = var2.gameView;
      List var3 = (List)Class695.b().fromJson(var1, (new TypeToken<List<ChongjipackBean>>() {
      }).getType());
      ((Class376)var4.getFormManagement().e(124 & 103)).ck(var3);
   }


   private void ac(String var1, GameClient var2) {
      GameView var6 = var2.gameView;
      if (var1.charAt(3 & 5) == (75 & 117)) {
         int var3 = var1.indexOf("|", 5 >> 1);
         int var4 = Class394.b(var1, --2, var3);
         var1 = var1.substring(var3 + (3 & 5));
         List var5 = (List)Class695.b().fromJson(var1, (new TypeToken<List<DataOther>>() {
         }).getType());
         var6.roleData.ai(var5);
         if (var4 == 5 >> 2) {
            ((Class472)var6.getFormManagement().e(127 & 27)).p();
         }
      }

   }


   private void ad(String var1, GameClient var2) {
      Stall var3 = (Stall)Class695.b().fromJson(var1, Stall.class);
      ((Class9)var2.gameView.getFormManagement().e(28601 & 4319)).aja(var3);
   }


   private void ae(String var1, GameClient var2) {
      RoleData var3 = var2.gameView.roleData;
      LoginResult var4;
      RoleTransBean var6;
      if ((var4 = (var6 = (RoleTransBean)Class695.b().fromJson(var1, RoleTransBean.class)).getLoginResult()).getTurnAround() != var3.getLoginResult().getTurnAround()) {
         var3.getPackRecord().setEquip("B", "B0");
      }

      PrivateData var5 = var6.getPrivateData();
      var3.getPrivateData().setSkills(var5.getSkills());
      var3.getPrivateData().setBorn(var5.getBorn());
      var3.setLoginResult(var4);
      if (var6.getMounts() != null) {
         var3.mounts = var6.getMounts();
      }

      var3.getRoleProperty().isReset = (boolean)(2 & 5);
      var3.getRoleProperty().z();
      var3.getRoleProperty().ab((String[])null, var6.getPrivateData().getBorn());
      var3.getRoleProperty().q();
      var3.getRoleProperty().isReset = (boolean)(--1);
      var4.setHp(new BigDecimal(var3.getRoleProperty().getHp()));
      var4.setMp(new BigDecimal(var3.getRoleProperty().getMp()));
      var3.getRoleProperty().k();
      var2.gameView.roleUnit.r.b(var4);
      var2.gameView.roleUnit.ba((String)null, var2.gameView.roleUnit.r);
      var2.gameView.baseView.km();
      var3.bs(var4.getTurnAround());
      var2.gameView.getFormManagement().n(41 & 127);
      var2.gameView.getFormManagement().n(39 & 95);
      var2.gameView.getFormManagement().n(--2);
      var2.gameView.setViewTitleData();
      var2.gameView.automation.setAutomationTask(--3);
      var2.gameView.automation.setAutomationBtnRed(--5);
   }


   private void af(String var1, GameClient var2) {
      GameView var4 = var2.gameView;
      ChongjipackBean var3 = (ChongjipackBean)Class695.b().fromJson(var1, ChongjipackBean.class);
      ((Class476)var4.getFormManagement().e(102 & 127)).alu(var3);
   }


   private void ag(int var1, String var2, GameClient var3) {
      int[] var10000 = new int[(5 >> 2) + Class394.aj((char)('~' & '}'), var2, 5 >> 1, var2.length()) + Class394.aj((char)('\u007f' & ','), var2, 5 >> 1, var2.length())];
      boolean var10002 = true;
      int[] var4 = var10000;
      int var5 = 3 ^ 3;
      int var6 = 1 ^ 3;

      int var7;
      for(int var9 = var7 = 3 >> 2; var9 < var2.length(); var9 = var7) {
         int var11;
         String var10001;
         if (var1 != (4 ^ 5) && var5 != 0) {
            var10001 = ",";
            var11 = var6;
         } else {
            var10001 = "|";
            var11 = var6;
         }

         if ((var7 = var2.indexOf(var10001, var11 + 1)) == -4 >> 2) {
            var7 = var2.length();
         }

         var4[var5] = Class394.b(var2, var6, var7);
         ++var5;
         var6 = var7 + --1;
      }

      GameView var8;
      Class214 var10 = (Class214)(var8 = var3.gameView).getFormManagement().e(6143 & 26810);
      var10.c(var1, var4);
      if (!var10.isVisible()) {
         var8.getFormManagement().a(28862 & 4091);
      }

   }

   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("chongjipackget")) {
         this.u(var2, var3);
      } else if (var1.equals("teamArena")) {
         this.w(var2, var3);
      } else if (var1.equals("petArena")) {
         this.p(var2, var3);
      } else if (var1.equals("Paydaygradepay")) {
         this.ab(var2, var3);
      } else if (var1.equals("Dayforweekgradeget")) {
         this.d(var2, var3);
      } else if (var1.equals("Dayforoneget")) {
         this.af(var2, var3);
      } else if (var1.equals("pankinglist")) {
         this.s(var2, var3);
      } else if (var1.equals("racialtransformation")) {
         this.ae(var2, var3);
      } else if (var1.equals("tip")) {
         var3.gameView.f(var2);
      } else if (var1.equals("bookofchalg")) {
         this.m(var2, var3);
      } else if (var1.equals("exchange")) {
         this.q(var2, var3);
      } else if (var1.equals("intogang")) {
         this.r(var2, var3);
      } else if (var1.equals("stall")) {
         this.ad(var2, var3);
      } else if (var1.equals("Getvipgradepack")) {
         this.v(var2, var3);
      } else if (var1.equals("applypay")) {
         this.z(var2, var3);
      } else if (var1.equals("middle")) {
         this.e(var2, var3);
      } else if (var1.equals("1")) {
         this.x(var2, var3);
      } else if (var1.equals("rolechange")) {
         this.o(var2, var3);
      } else if (var1.equals("gangchange")) {
         this.n(var2, var3);
      } else if (var1.equals("vicon")) {
         this.t(var2, var3);
      } else {
         if (var1.equals("BEAU")) {
            this.y(var2, var3);
         }

      }
   }


   private void d(String var1, GameClient var2) {
      GameView var4 = var2.gameView;
      List var3 = (List)Class695.b().fromJson(var1, (new TypeToken<List<ChongjipackBean>>() {
      }).getType());
      ((Class620)var4.getFormManagement().e(127 & 101)).ck(var3);
   }


   private void e(String var1, GameClient var2) {
      RoleData var4;
      GameView var10;
      RoleData var10000 = var4 = (var10 = var2.gameView).roleData;
      LoginResult var3 = var10000.getLoginResult();
      PrivateData var5 = var10000.getPrivateData();
      Middle var8 = (Middle)Class695.b().fromJson(var1, Middle.class);
      var3.setTaskDaily(var8.getTaskDaily());
      var5.setTaskComplete(var8.getTaskComplete());
      var4.getTaskSystem().k();
      var3.setDaypaysum(var8.getDaypaysum());
      var3.setDaygetorno(var8.getDaygetorno());
      var3.setDayandpayorno(var8.getDayandpayorno());
      var3.setVipget(var8.getVipget());
      var3.setDayfirstinorno(var8.getDayfirstinorno());
      if (var8.getLabor() != null) {
         var4.getPackRecord().setLabor(var8.getLabor());
         Class181 var11;
         if ((var11 = (Class181)var10.getFormManagement().m(12799 & 20110)) != null) {
            var11.d();
         }
      }

      if (var8.getActivity() != null) {
         String var12 = var8.getActivity();
         int var15 = 5 >> 3;

         int var9;
         for(int var18 = var9 = 3 ^ 3; var18 < var12.length(); var18 = var9) {
            if ((var9 = var12.indexOf("|", var15 + (4 ^ 5))) == -4 >> 2) {
               var9 = var12.length();
            }

            int var6;
            if ((var6 = var12.indexOf("#", var15 + (3 & 5))) == -4 >> 2 || var6 > var9) {
               var6 = var9;
            }

            ActivityRole var7;
            if ((var7 = var4.getActivity(Class394.b(var12, var15, var6))) != null) {
               var7.f(var12, var6 + --1, var9);
            }

            var15 = var9 + (5 >> 2);
         }

         Class316 var16;
         if ((var16 = (Class316)var10.getFormManagement().m(9215 & 23719)) != null && var16.e() != --1) {
            var16.as(var16.e());
         }

         Class694 var13;
         if ((var13 = (Class694)var10.getFormManagement().m(15530 & 17405)) != null) {
            var13.p();
         }

         var10.getFormManagement().n(3003 & 29950);
      }

      Class665 var14;
      if ((var14 = (Class665)var10.getFormManagement().m(108 & 59)) != null) {
         var14.d();
      }

      Class147 var17;
      if ((var17 = (Class147)var10.getFormManagement().m(127 & 125)) != null) {
         var17.d();
      }

   }
}
