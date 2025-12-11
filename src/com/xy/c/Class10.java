package com.xy.c;

import com.xy.a.Class106;
import com.xy.a.Class107;
import com.xy.a.Class134;
import com.xy.a.Class74;
import com.xy.a.Class93;
import com.xy.a.Class98;
import com.xy.a.q.Class104;
import com.xy.a.q.Class39;
import com.xy.a.q.Class47;
import com.xy.a.q.Class55;
import com.xy.a.q.Class67;
import com.xy.a.q.Class70;
import com.xy.bean.ApplyPayBean;
import com.xy.bean.BeauBean;
import com.xy.bean.ChongjipackBean;
import com.xy.bean.FriendBean;
import com.xy.bean.GangChangeBean;
import com.xy.bean.GangResultBean;
import com.xy.bean.LoginResult;
import com.xy.bean.Middle;
import com.xy.bean.PalacePkBean;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.RoleTransBean;
import com.xy.bean.Stall;
import com.xy.bean.UseCardBean;
import com.xy.bean.UserRoleArrBean;
import com.xy.entity.PackRecord;
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

public class Class10 implements ServerAction {
   // $VF: synthetic method
   private void x(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      List var4 = com.xy.v.Class31.a().fromJson(var1, new Class32(this).getType());
      ((Class55)var3.getFormManagement().j(101)).fm(var4);
   }

   // $VF: synthetic method
   private void y(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      ChongjipackBean var4 = com.xy.v.Class31.a().fromJson(var1, ChongjipackBean.class);
      ((Class47)var3.getFormManagement().j(102)).ux(var4);
   }

   // $VF: synthetic method
   private void z(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      UserRoleArrBean var4;
      if ((var4 = com.xy.v.Class31.a().fromJson(var1, UserRoleArrBean.class)) != null && var4.getList() != null) {
         ((Class134)var3.getFormManagement().j(60)).so(var4.getPhonestatues(), var4.getList());
      }
   }

   // $VF: synthetic method
   private void aa(String var1, GameClient var2) {
      char var3;
      if ((var3 = var1.charAt(0)) == 'R') {
         this.ap(var1, var2);
      } else {
         if (var3 == 'V') {
            if ((var3 = var1.charAt(1)) == '0') {
               this.an(0, var1, var2);
               return;
            }

            if (var3 == '1') {
               this.an(1, var1, var2);
            }
         }
      }
   }

   // $VF: synthetic method
   private void ab(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      String var10001 = "p";
      if (var1.startsWith("X")) {
         ((Class67)var3.getFormManagement().j(122)).ci(var1);
      } else {
         var10001 = "\n";
         if (!var1.startsWith("B")) {
            var10001 = "|";
            if (!var1.startsWith("T")) {
               com.xy.a.q.Class11 var4 = (com.xy.a.q.Class11)var3.getFormManagement().j(108);
               var10001 = "\f";
               if (var1.startsWith("D")) {
                  if (var1.length() > 1) {
                     var3._do(var1.substring(1));
                  }

                  var4.f();
                  return;
               }

               var10001 = "i";
               if (var1.startsWith("A")) {
                  String var8 = var1.substring(1);
                  BigDecimal var10;
                  if ((var10 = new BigDecimal(var8)).compareTo(var3.roleData.getLoginResult().getRole_id()) == 0) {
                     var4.g(2);
                  }

                  var4.i(var10);
                  return;
               }

               var10001 = "\u0007";
               if (var1.startsWith("O")) {
                  String var7 = var1.substring(1);
                  List var9 = com.xy.v.Class31.a().fromJson(var7, new Class3(this).getType());
                  var4.hb(var9, 1);
                  var4.g(0);
                  var3.getFormManagement().b(108);
                  return;
               }

               var10001 = "m";
               if (var1.startsWith("E")) {
                  String var5 = var1.substring(1);
                  List var6 = com.xy.v.Class31.a().fromJson(var5, new Class11(this).getType());
                  var4.hb(var6, 0);
               }

               return;
            }
         }

         ((Class104)var3.getFormManagement().j(124)).ci(var1);
      }
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("chongjipackget")) {
         this.ai(var2, var3);
      } else if (var1.equals("teamArena")) {
         this.ab(var2, var3);
      } else if (var1.equals("petArena")) {
         this.h(var2, var3);
      } else if (var1.equals("Paydaygradepay")) {
         this.ah(var2, var3);
      } else if (var1.equals("Dayforweekgradeget")) {
         this.x(var2, var3);
      } else if (var1.equals("Dayforoneget")) {
         this.y(var2, var3);
      } else if (var1.equals("pankinglist")) {
         this.z(var2, var3);
      } else if (var1.equals("racialtransformation")) {
         this.ac(var2, var3);
      } else if (var1.equals("tip")) {
         var3.gameView._do(var2);
      } else if (var1.equals("bookofchalg")) {
         this.af(var2, var3);
      } else if (var1.equals("exchange")) {
         this.ak(var2, var3);
      } else if (var1.equals("intogang")) {
         this.ao(var2, var3);
      } else if (var1.equals("stall")) {
         this.al(var2, var3);
      } else if (var1.equals("Getvipgradepack")) {
         this.am(var2, var3);
      } else if (var1.equals("applypay")) {
         this.aj(var2, var3);
      } else if (var1.equals("middle")) {
         this.r(var2, var3);
      } else if (var1.equals("1")) {
         this.ae(var2, var3);
      } else if (var1.equals("rolechange")) {
         this.ag(var2, var3);
      } else if (var1.equals("gangchange")) {
         this.ad(var2, var3);
      } else if (var1.equals("vicon")) {
         this.aq(var2, var3);
      } else {
         if (var1.equals("BEAU")) {
            this.aa(var2, var3);
         }
      }
   }

   // $VF: synthetic method
   private void ac(String var1, GameClient var2) {
      RoleData var3 = var2.gameView.roleData;
      RoleTransBean var4;
      LoginResult var5;
      if ((var5 = (var4 = com.xy.v.Class31.a().fromJson(var1, RoleTransBean.class)).getLoginResult()).getTurnAround() != var3.getLoginResult().getTurnAround()) {
         PackRecord var10000 = var3.getPackRecord();
         String var10001 = "\n";
         String var10002 = "\u0016\u0018";
         var10000.setEquip("B", "B0");
      }

      PrivateData var6 = var4.getPrivateData();
      var3.getPrivateData().setSkills(var6.getSkills());
      var3.getPrivateData().setBorn(var6.getBorn());
      var3.setLoginResult(var5);
      if (var4.getMounts() != null) {
         var3.mounts = var4.getMounts();
      }

      var3.getRoleProperty().isReset = false;
      var3.getRoleProperty().n();
      var3.getRoleProperty().g(null, var4.getPrivateData().getBorn());
      var3.getRoleProperty().f();
      var3.getRoleProperty().isReset = true;
      var5.setHp(new BigDecimal(var3.getRoleProperty().getHp()));
      var5.setMp(new BigDecimal(var3.getRoleProperty().getMp()));
      var3.getRoleProperty().e();
      var2.gameView.roleUnit.ap.a(var5);
      var2.gameView.roleUnit.af(null, var2.gameView.roleUnit.ap);
      var2.gameView.baseView.c();
      var3.aa(var5.getTurnAround());
      var2.gameView.getFormManagement().f(41);
      var2.gameView.getFormManagement().f(7);
      var2.gameView.setViewTitleData();
   }

   // $VF: synthetic method
   private void ad(String var1, GameClient var2) {
      GangChangeBean var3 = com.xy.v.Class31.a().fromJson(var1, GangChangeBean.class);
      GameView var4;
      GameView var10000 = var4 = var2.gameView;
      LoginResult var6 = var2.gameView.roleData.getLoginResult();
      RoleShow var7 = var10000.roleUnit.ap;
      var6.setGang_id(var3.getGangid());
      var6.setGangname(var3.getGangName());
      String var8 = var6.getGangpost();
      var6.setGangpost(var3.getPost());
      var7.setGang_id(var3.getGangid());
      var7.setGangname(var3.getGangName());
      if (var3.getMsg() != null) {
         var4._do(var3.getMsg());
      }

      Class98 var9;
      if ((var9 = (Class98)var4.getFormManagement().l(48)) != null) {
         GangResultBean var10 = var9.adc().ahi();
         String var16 = "幺专";
         int var11;
         if ("帮主".equals(var3.getPost())) {
            for (int var17 = var11 = 0; var17 < var10.getRoleTables().size(); var17 = ++var11) {
               LoginResult var12 = var10.getRoleTables().get(var11);
               String var18 = "幉乳";
               if ("帮主".equals(var12.getGangpost())) {
                  var12.setGangpost(var8);
               }
            }
         }

         Class98 var20;
         label33: {
            for (int var19 = var11 = 0; var19 < var10.getRoleTables().size(); var19 = ++var11) {
               LoginResult var15;
               if ((var15 = var10.getRoleTables().get(var11)).getRole_id().compareTo(var6.getRole_id()) == 0) {
                  var15.setGang_id(var3.getGangid());
                  var15.setGangname(var3.getGangName());
                  var8 = var15.getGangpost();
                  var15.setGangpost(var3.getPost());
                  var20 = var9;
                  break label33;
               }
            }

            var20 = var9;
         }

         var20.adc().add(var10);
         var9.adc().cr(false);
         var9.adc().cr(true);
      }
   }

   // $VF: synthetic method
   private void ae(String var1, GameClient var2) {
      String var3 = var1.substring(0, 1);
      String var4 = var1.substring(1);
      int var5;
      if ((var5 = Integer.parseInt(var3)) != 0 && var5 != 1 && var5 != 2 && var5 != 3 && var5 == 4) {
         GameView var10000 = var2.gameView;
         var2.gameView.roleData.getPackRecord().setCollect(var4);
         com.xy.a.i.Class15 var8;
         if ((var8 = (com.xy.a.i.Class15)var10000.getFormManagement().l(65)) != null) {
            var8.h();
         }
      }
   }

   // $VF: synthetic method
   private void af(String var1, GameClient var2) {
      PalacePkBean var3 = com.xy.v.Class31.a().fromJson(var1, PalacePkBean.class);
      GameView var4 = var2.gameView;
      if (var3.getType() == 0) {
         ((Class106)var4.getFormManagement().j(66)).afw(2, var3);
      } else {
         ((Class106)var4.getFormManagement().j(66)).afw(3, var3);
      }
   }

   // $VF: synthetic method
   private void ag(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      RoleData var10000 = var2.gameView.roleData;
      BaseMeridians var5 = var2.gameView.roleData.getRoleProperty().b(var1.substring(1));
      var10000.getRoleProperty().y();
      if (var5 != null) {
         BaseMeridians var8;
         label25: {
            com.xy.a.w.Class4 var6;
            if ((var6 = (com.xy.a.w.Class4)var3.getFormManagement().n(82)) != null) {
               if (var5.getBh() == 0) {
                  var8 = var5;
                  var6.y(1);
                  break label25;
               }

               var5.getBh();
            }

            var8 = var5;
         }

         com.xy.a.w.Class3 var7;
         if (var8.getBh() == 0 && (var7 = (com.xy.a.w.Class3)var3.getFormManagement().n(123)) != null) {
            var7.dv(var5, -1);
         }
      }
   }

   // $VF: synthetic method
   private void ah(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      List var4 = com.xy.v.Class31.a().fromJson(var1, new Class30(this).getType());
      ((com.xy.a.q.Class8)var3.getFormManagement().j(100)).fm(var4);
   }

   public void ai(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      String var10001 = "$\u0002";
      if (var1.startsWith("CJ")) {
         var10001 = "T";
         int var7;
         if ((var7 = var1.indexOf("|")) != -1) {
            int var5 = Integer.parseInt(var1.substring(2, var7));
            List var6 = com.xy.v.Class31.a().fromJson(var1.substring(var7 + 1), new Class5(this).getType());
            ((Class39)var3.getFormManagement().j(134)).so(var5, var6);
         }
      } else {
         List var4 = com.xy.v.Class31.a().fromJson(var1, new Class4(this).getType());
         ((com.xy.a.q.Class35)var3.getFormManagement().j(103)).fm(var4);
      }
   }

   // $VF: synthetic method
   private void aj(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      RoleData var4 = var2.gameView.roleData;
      LoginResult var5 = var2.gameView.roleData.getLoginResult();
      ApplyPayBean var6;
      if ((var6 = com.xy.v.Class31.a().fromJson(var1, ApplyPayBean.class)).getAddX() != null) {
         var5.setCodecard(var5.getCodecard().add(var6.getAddX()));
      }

      if (var6.getAddC() != null) {
         var5.setMoney(var5.getMoney() + var6.getAddC().intValue());
      }

      if (var6.getAddM() != null) {
         var5.setPaysum(var5.getPaysum().add(var6.getAddM()));
         var5.setDaypaysum(var5.getDaypaysum().add(var6.getAddM()));
         com.xy.a.q.Class6 var7;
         if ((var7 = (com.xy.a.q.Class6)var3.getFormManagement().l(39)) != null) {
            var7.g(3);
         }
      }

      if (var6.getLowOrHihtpack() != null) {
         var5.setLowOrHihtpack(var6.getLowOrHihtpack().intValue());
      }

      if (var6.getDayandpayorno() != null) {
         var5.setDayandpayorno(var5.getDayandpayorno());
         var5.setDayfirstinorno(1);
      }

      if (var6.getUseCardBean() != null) {
         UseCardBean var8 = var6.getUseCardBean();
         var4.bd(var8.getName(), var8.getType(), var8.getSkin(), var8.getValue(), var8.getTime());
      }

      if (var6.getVIPBean() != null) {
         UseCardBean var9 = var6.getVIPBean();
         var4.bd(var9.getName(), var9.getType(), var9.getSkin(), var9.getValue(), var9.getTime());
      }

      if (var6.getActivity() != null) {
         Class1.c(var6.getActivity(), var3);
      }

      if (var6.getMsg() != null) {
         var3._do(var6.getMsg());
      }
   }

   // $VF: synthetic method
   private void ak(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      String var10001 = "\f\u0018";
      if (var1.startsWith("X0")) {
         Class93 var4 = (Class93)var3.getFormManagement().j(117);
         var4.cp(0, var1);
         if (var3.getFormManagement().l(117) == null) {
            var3.getFormManagement().b(117);
            return;
         }
      } else {
         var10001 = "?y";
         if (var1.startsWith("X1")) {
            Class93 var8 = (Class93)var3.getFormManagement().j(117);
            var8.cp(1, var1);
            if (var3.getFormManagement().l(117) == null) {
               var3.getFormManagement().b(117);
               return;
            }
         } else {
            var10001 = "\u0007\u0019";
            if (var1.startsWith("S1")) {
               String var10002 = "4";
               int var9 = var1.indexOf("|");
               long var5 = Long.parseLong(var1.substring(2, var9));
               BigDecimal var7 = new BigDecimal(var1.substring(var9 + 1));
               var3.roleData.getLoginResult().setCodecard(var3.roleData.getLoginResult().getCodecard().add(var7));
               ((Class93)var3.getFormManagement().j(117)).ef(var5);
               var10001 = "也枞扄劷";
               var3._do("下架成功");
            }
         }
      }
   }

   // $VF: synthetic method
   private void al(String var1, GameClient var2) {
      Stall var3 = com.xy.v.Class31.a().fromJson(var1, Stall.class);
      ((Class107)var2.gameView.getFormManagement().j(153)).agt(var3);
   }

   // $VF: synthetic method
   private void am(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      List var4 = com.xy.v.Class31.a().fromJson(var1, new Class16(this).getType());
      com.xy.a.q.Class6 var5;
      if ((var5 = (com.xy.a.q.Class6)var3.getFormManagement().l(39)) != null) {
         var5.fm(var4);
      }
   }

   // $VF: synthetic method
   private void an(int var1, String var2, GameClient var3) {
      int[] var4 = new int[1 + com.xy.v.Class12.al('|', var2, 2, var2.length()) + com.xy.v.Class12.al(',', var2, 2, var2.length())];
      int var5 = 0;
      int var6 = 2;
      int var7;
      int var10000 = var7 = 0;

      while (var10000 < var2.length()) {
         String var11;
         int var10002;
         if (var1 != 1 && var5 != 0) {
            var11 = ",";
            var10002 = var6;
         } else {
            var11 = "T";
            var11 = "|";
            var10002 = var6;
         }

         if ((var7 = var2.indexOf(var11, var10002 + 1)) == -1) {
            var7 = var2.length();
         }

         var4[var5] = com.xy.v.Class12.ad(var2, var6, var7);
         var5++;
         var6 = var7 + 1;
         var10000 = var7;
      }

      GameView var8 = var3.gameView;
      com.xy.a.v.Class24 var10 = (com.xy.a.v.Class24)var3.gameView.getFormManagement().j(186);
      var10.gs(var1, var4);
      if (!var10.isVisible()) {
         var8.getFormManagement().b(186);
      }
   }

   // $VF: synthetic method
   private void ao(String var1, GameClient var2) {
      GangResultBean var3 = com.xy.v.Class31.a().fromJson(var1, GangResultBean.class);
      ((Class98)var2.gameView.getFormManagement().j(48)).add(var3);
   }

   // $VF: synthetic method
   private void ap(String var1, GameClient var2) {
      BigDecimal var3 = null;
      BeauBean var4 = null;
      int var5 = 0;
      int var6 = 1;
      int var7;
      int var10000 = var7 = 0;

      while (var10000 < var1.length()) {
         String var10001 = "4";
         if ((var7 = var1.indexOf("|", var6 + 1)) == -1) {
            var7 = var1.length();
         }

         if (var5 == 0) {
            var3 = new BigDecimal(com.xy.v.Class12.s(var1, var6, var7));
            var10000 = var7;
         } else {
            if (var5 == 1) {
               var4 = new BeauBean(var1, var6, var7);
            }

            var10000 = var7;
         }

         var5++;
         var6 = var10000 + 1;
         var10000 = var7;
      }

      GameView var8 = var2.gameView;
      if (var3.longValue() == var8.roleData.getRoleId()) {
         var8.setViewTitleData();
      } else {
         FriendBean var9;
         if ((var9 = var8.roleData.getFriend(var3.longValue())) != null) {
            var9.setBeauBean(var4);
         }
      }
   }

   // $VF: synthetic method
   private void aq(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      Class74 var4 = var2.gameView.baseView;
      List var5 = var2.gameView.baseView.rs();
      String var10001 = "\bT";
      String[] var6 = var1.split("\\|");

      int var7;
      label64:
      for (int var10000 = var7 = 0; var10000 < var6.length; var10000 = ++var7) {
         int var8 = com.xy.v.Class12.ad(var6[var7], 1, var6[var7].length());
         String var14 = var6[var7];
         var10001 = "\u001a";
         if (var14.startsWith("R")) {
            if (var8 > 100 && var8 < 200 && var3.roleData.getActivity(var8) != null) {
               var3.roleData.e(var8);
               Activity var11 = var3.getObjectArea().s() ? var3.getObjectArea().cd(var8) : null;
               if (var11 != null) {
                  if (var11.getModelId() == 1) {
                     var3.getFormManagement().f(168);
                  } else if (var11.getModelId() == 2) {
                     var3.getFormManagement().f(168);
                  }
               }
            }

            int var13;
            for (int var17 = var13 = 0; var17 < var5.size(); var17 = ++var13) {
               if (var8 == ((com.xy.i.Class21)var5.get(var13)).il()) {
                  var5.remove(var13);
                  var4.remove((Component)var5.get(var13));
                  break;
               }
            }
         } else {
            String var15 = var6[var7];
            var10001 = "i";
            if (var15.startsWith("A")) {
               int var9;
               for (int var16 = var9 = 0; var16 < var5.size(); var16 = ++var9) {
                  if (var8 == ((com.xy.i.Class21)var5.get(var9)).il()) {
                     continue label64;
                  }
               }

               String var10004 = "\u0014+H*H>\u000e+\b&";
               com.xy.i.Class21 var12 = new com.xy.i.Class21("sc/b/vicon" + var8 + ".png", 1, 0, var4);
               var12.g(var8);
               var4.add(var12);
               var5.add(var12);
            }
         }
      }

      var4.h();
   }

   // $VF: synthetic method
   private void r(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      RoleData var4;
      RoleData var10000 = var4 = var2.gameView.roleData;
      LoginResult var5 = var2.gameView.roleData.getLoginResult();
      PrivateData var6 = var10000.getPrivateData();
      Middle var7 = com.xy.v.Class31.a().fromJson(var1, Middle.class);
      var5.setTaskDaily(var7.getTaskDaily());
      var6.setTaskComplete(var7.getTaskComplete());
      var4.getTaskSystem().i();
      var5.setDaypaysum(var7.getDaypaysum());
      var5.setDaygetorno(var7.getDaygetorno());
      var5.setDayandpayorno(var7.getDayandpayorno());
      var5.setVipget(var7.getVipget());
      var5.setDayfirstinorno(var7.getDayfirstinorno());
      if (var7.getLabor() != null) {
         var4.getPackRecord().setLabor(var7.getLabor());
         com.xy.a.i.Class28 var8;
         if ((var8 = (com.xy.a.i.Class28)var3.getFormManagement().l(142)) != null) {
            var8.h();
         }
      }

      if (var7.getActivity() != null) {
         String var13 = var7.getActivity();
         int var9 = 0;
         int var10;
         int var19 = var10 = 0;

         while (var19 < var13.length()) {
            String var10001 = "T";
            if ((var10 = var13.indexOf("|", var9 + 1)) == -1) {
               var10 = var13.length();
            }

            var10001 = "k";
            int var11;
            if ((var11 = var13.indexOf("#", var9 + 1)) == -1 || var11 > var10) {
               var11 = var10;
            }

            ActivityRole var12;
            if ((var12 = var4.getActivity(com.xy.v.Class12.ad(var13, var9, var11))) != null) {
               var12.a(var13, var11 + 1, var10);
            }

            var9 = var10 + 1;
            var19 = var10;
         }

         com.xy.a.v.Class39 var15;
         if ((var15 = (com.xy.a.v.Class39)var3.getFormManagement().l(167)) != null && var15.dx() != 1) {
            var15.y(var15.dx());
         }

         com.xy.a.v.Class30 var18;
         if ((var18 = (com.xy.a.v.Class30)var3.getFormManagement().l(168)) != null) {
            var18.f();
         }

         var3.getFormManagement().f(186);
      }

      com.xy.a.Class19 var14;
      if ((var14 = (com.xy.a.Class19)var3.getFormManagement().l(40)) != null) {
         var14.h();
      }

      Class70 var16;
      if ((var16 = (Class70)var3.getFormManagement().l(125)) != null) {
         var16.h();
      }
   }

   // $VF: synthetic method
   private void h(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      String var10001 = "4";
      int var4;
      if ((var4 = var1.indexOf("|")) == -1) {
         var4 = var1.length();
      }

      int var5;
      if ((var5 = Integer.parseInt(var1.substring(0, var4))) == 310 || var5 == 311) {
         com.xy.a.q.Class19 var7;
         if ((var7 = (com.xy.a.q.Class19)var3.getFormManagement().j(135)).le() == null) {
            return;
         }

         var7.ab(0, var5 == 310);
         if (var4 < var1.length()) {
            var3._do(var1.substring(var4 + 1));
            return;
         }
      } else if (var5 == 312 || var5 == 313) {
         com.xy.a.q.Class19 var6;
         if ((var6 = (com.xy.a.q.Class19)var3.getFormManagement().j(135)).lf() == null) {
            return;
         }

         var6.ab(1, var5 == 312);
         if (var4 < var1.length()) {
            var3._do(var1.substring(var4 + 1));
         }
      }
   }
}
