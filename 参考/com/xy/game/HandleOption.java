package com.xy.game;

import com.xy.W;
import com.xy.aF;
import com.xy.cX;
import com.xy.cz;
import com.xy.dJ;
import com.xy.eC;
import com.xy.fa;
import com.xy.gs;
import com.xy.iI;
import com.xy.jJ;
import com.xy.kq;
import com.xy.lP;
import com.xy.lw;
import com.xy.md;
import com.xy.mi;
import com.xy.mw;
import com.xy.bean.BuyShopBean;
import com.xy.bean.ChangeMapBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.FightingForesee;
import com.xy.bean.LoginResult;
import com.xy.bean.MonsterBean;
import com.xy.bean.QuoteOutBean;
import com.xy.bean.RoleShow;
import com.xy.bean.SuitOperBean;
import com.xy.entity.Mount;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Door;
import com.xy.readbean.Eshop;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.MoneyType;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Npctable;
import com.xy.readbean.Robots;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class HandleOption {
   public static void a(boolean var0, GoodFight var1, Goodstable var2, GameView var3) {
      GoodFight var4;
      String var5;
      if ((var5 = (var4 = var2.getFight()).d(var1, (boolean)(2 ^ 3))) != null) {
         var2.setValueTwo(var5);
         if (var4.getNum() <= 0) {
            var2.setUsetime(3 & 4);
            var3.roleData.h(var2.getRgid());
         }

         ParamTool.g(var2, 1 ^ 3, var3.getClient());
         Door var6 = new Door();
         var6.setDoormap(String.valueOf(var1.getMap()));
         var6.setDoorpoint(var1.getX() + "|" + var1.getY());
         if (var3.getObjectArea().ay(String.valueOf(var1.getMap())).getMapFlag() == --1 && var3.roleUnit.h()) {
            int var10001;
            GameView var10002;
            if (var0) {
               var10001 = --3;
               var10002 = var3;
            } else {
               var10001 = 1;
               var10002 = var3;
            }

            ac(var6, var10001, var10002);
         } else {
            var3.f("飞行棋使用限制");
         }
      }
   }

   public static void b(BuyShopBean var0, Shop var1, int var2, MoneyType var3, GameView var4) {
      if (!var4.t()) {
         Goodstable var5 = var4.getObjectArea().n(var1.getShopiid());
         RoleData var10000 = var4.roleData;
         long var10001;
         Shop var10002;
         if (var5 != null) {
            var10001 = var5.getType();
            var10002 = var1;
         } else {
            var10001 = 6500L;
            var10002 = var1;
         }

         if ((var2 = var10000.getGoodPackSum(var10001, var10002.getShopiid(), var2)) <= 0) {
            var4.fw("你背包空间不足");
         } else {
            long var6 = 0L;
            long var8 = var1.getShopprice();
            if ((var6 = var4.roleData.getMoney(var3) / var8) > (long)var2) {
               var6 = (long)var2;
            }

            long var10 = var8 * var6;
            if (var6 <= 0L) {
               var4.fw("你没有足够的" + var3.getKey());
            } else {
               if (MsgUntil.m(var1.getShopname())) {
                  if (var4.roleData.j(var1.getShopname())) {
                     return;
                  }

                  boolean var13 = true;
                  var6 = 1L;
                  var10 = var8 * var6;
               }

               var0.setCd(var1.getShopid().toString());
               var0.setSum((int)var6);
               if (var3.getId() == -4 >> 2) {
                  var3.setMax(var3.getMax() - var10);
               }

               String var12 = Agreement.getSendTextAES("nbuy", mi.b().toJson(var0));
               var4.getClient().d(var12);
            }
         }
      }
   }

   public static boolean c(int var0, fa var1, GameView var2) {
      int var10000;
      if (var0 != (-71 & -1) && var0 != (-1 & -89)) {
         lP var3;
         if (var1 != null && var1 instanceof lP && (var3 = (lP)var1).p.getRobottype() == 5 >> 1) {
            String var9 = Agreement.getSendTextAES("clickmonsters", "" + var3.p.getI());
            var10000 = 3 >> 1;
            var2.getClient().d(var9);
            return (boolean)var10000;
         } else if (var0 != (5490 & 28383) && var0 != (30419 & 2863) && var0 != (21215 & 12157)) {
            List var7;
            if ((var7 = (List)var2.getObjectArea().bz().getNpcShopMap().get(String.valueOf(var0))) == null) {
               return (boolean)(3 & 4);
            } else {
               lw var8 = (lw)var2.getFormManagement().e(63 & 87);
               var10000 = 3 >> 1;
               var8.afi(var7, var0, (BigDecimal)null);
               var2.getFormManagement().a(55 & 95);
               return (boolean)var10000;
            }
         } else {
            String var6 = Agreement.getSendTextAES("shop", String.valueOf(var0));
            var10000 = --1;
            var2.getClient().d(var6);
            return (boolean)var10000;
         }
      } else if (var2.getFormManagement().m(29 & 110) != null) {
         var10000 = 3 >> 1;
         var2.fw("你现在已经处于给予状态");
         return (boolean)var10000;
      } else {
         NpcInfoBean var4 = new NpcInfoBean();
         Npctable var5;
         (var5 = new Npctable()).setNpcname(var0 == (-71 & -1) ? "金币回收商" : "绑玉回收商");
         var10000 = --1;
         var5.setNpctype(String.valueOf(Math.abs(var0)));
         var5.setNpcid("0");
         var5.setSkin("0");
         var5.setDir("0");
         var5.setTx("0");
         var5.setTy("0");
         var4.setNpctable(var5);
         eC.al(new cz(var4), var2);
         return (boolean)var10000;
      }
   }

   public static void d(int var0, GameView var1) {
      Skill var6;
      if ((var6 = var1.getObjectArea().bf(String.valueOf(var0))) != null) {
         String[] var3 = var1.roleData.getPrivateData().getSkill("S");
         int var4 = 3 >> 2;
         int var5 = var3 != null ? var3.length : 0;

         int var10000;
         for(var10000 = var4; var10000 < var5; var10000 = var4) {
            if (var3[var4].startsWith(var6.getSkillid())) {
               var1.fw("你已经学会了该技能");
               return;
            }

            ++var4;
         }

         var4 = Integer.parseInt(var6.getSkillid());
         var5 = Integer.parseInt(var6.getSkilllevel());
         if ((var5 = x(var4, var5, var3)) == 0) {
            StringBuffer var2 = new StringBuffer();
            int var7 = 3 & 4;
            int var8 = var3 != null ? var3.length : 0;

            for(var10000 = var7; var10000 < var8; var10000 = var7) {
               if (var2.length() != 0) {
                  var2.append("#");
               }

               var2.append(var3[var7++]);
            }

            if (var2.length() != 0) {
               var2.append("#");
            }

            var2.append(var4);
            var2.append("_");
            var2.append(cX.i(var1.roleData.getLoginResult().getGrade()));
            var1.roleData.getPrivateData().setSkills("S", var2.toString());
            ParamTool.f(var1.roleData.getPrivateData(), var1.getClient());
            gs var9;
            if ((var9 = (gs)var1.getFormManagement().m(87 & 122)) != null) {
               var9.as(3 ^ 3);
            }

            var1.fw("你学会了" + var6.getSkillname());
         } else if (var5 == (1 ^ 3)) {
            var1.fw("你还不够火候学习当前技能");
         } else {
            if (var5 == 5 >> 2) {
               var1.fw("年轻人不要好高骛远,先去学习上一个技能!");
            }

         }
      }
   }

   public static void e(int var0, GameView var1) {
      Door var2 = new Door();
      var2.setDoormap("1207");
      var2.setDoorpoint(var1.getClient().n(5 >> 1, --3) ? "5080|3960" : "4294|2887");
      Door var10000;
      if (var0 == (3 & 5)) {
         var10000 = var2;
         var2.setDoormap("3312");
         var2.setDoorpoint("2373|1737");
      } else if (var0 == 5 >> 1) {
         var10000 = var2;
         var2.setDoormap("3313");
         var2.setDoorpoint("162|1734");
      } else {
         if (var0 == --3) {
            var2.setDoormap("3314");
            var2.setDoorpoint("361|1657");
         }

         var10000 = var2;
      }

      ac(var10000, 2, var1);
   }

   public static void f(GameView var0) {
      RoleData var10000 = var0.roleData;
      LoginResult var1 = var10000.getLoginResult();
      PKSys var2;
      (var2 = var10000.getPkSys()).setPk2(W.c.nextInt(58 & 79) < (107 & 29) ? 1 ^ 3 : 1);
      var2.setPk1(var2.getPk1() - (3 & 5));
      if (var2.getPk1() < 3 >> 1) {
         var2.setPk1(4 ^ 5);
      }

      if (var2.getPk1() >= (12 & 123) && var2.getPk3() % --4 == --3) {
         long var3 = var1.getExperience().longValue();
         long var5 = (long)((double)var0.getObjectArea().ac(var1.getTurnAround(), cX.d(var1.getGrade())) * 0.6D);
         var3 -= var5;
         var0.f("你损失了" + var5 + "经验");
         var1.setExperience(new BigDecimal(var3));
         var2.setPk3(var2.getPk3() + --1);
      }

      var2.setPk4(var2.getPk4() + (2 ^ 3));
      var1.setTaskDaily(var2.b());
      QuoteOutBean var7 = new QuoteOutBean();
      var7.setData(var1.getTaskDaily());
      String var4 = Agreement.getSendTextAES("quoteout", mi.b().toJson(var7));
      var0.getClient().d(var4);
      var0.f("好好改造,重新做人");
   }

   public static void g(GoodFight var0, Goodstable var1, GameView var2) {
      RoleShow var3 = var2.roleUnit.r;
      String var4;
      if ((var4 = var1.getFight().e(var0, var3.getMapid().intValue(), var3.getX(), var3.getY(), var2.mapScene.ad().getMapName())) != null) {
         int var10001 = --2;
         var1.setValueTwo(var4);
         ParamTool.g(var1, var10001, var2.getClient());
         var2.f("已经重新做好路标");
      }
   }

   public static void h(String var0, GameView var1) {
      if (var0.equals("打造11-14级装备")) {
         var0 = "打造11-16级装备";
      }

      if (var0.equals("符石")) {
         var1.getFormManagement().a(95 & 102);
      } else if (var0.equals("打造孩子装备")) {
         var1.getFormManagement().a(12772 & 20159);
      } else {
         ((aF)var1.getFormManagement().e(90 & 63)).f(var0);
      }
   }

   public static void i(GameView var0) {
      RoleData var10000 = var0.roleData;
      Mount var1;
      if ((var1 = var10000.getMount(var10000.getLoginResult().getMount_id())) == null) {
         var0.fw("你没有设置乘骑的坐骑");
      } else if (var1.getMountid() >= 5 >> 2 && var1.getMountid() <= --5) {
         if (var1.getMountlvl() == (28157 & 4810) && var1.getProficiency() >= 100000 && var1.getUseNumber() >= --3) {
            ((kq)var0.getFormManagement().e(7359 & 25579)).adg(var1);
         } else {
            var0.fw("需要坐骑点化100级满熟练且吃满筋骨提气丸");
         }
      } else {
         var0.fw("1-5坐骑才能重塑");
      }
   }

   public static void j(GameView var0) {
      RoleData var10000 = var0.roleData;
      Mount var1;
      if ((var1 = var10000.getMount(var10000.getLoginResult().getMount_id())) == null) {
         var0.fw("你没有设置乘骑的坐骑");
      } else {
         String var2 = Agreement.getSendTextAES("usermount", "DH|" + var1.getMid());
         var0.getClient().d(var2);
      }
   }

   public static void k(GameView var0) {
      if (ParamTool.c(2000L, var0)) {
         LoginResult var1 = var0.roleData.getLoginResult();
         int var2 = var0.roleData.getRoleProperty().getHp();
         int var3 = var0.roleData.getRoleProperty().getMp();
         if (var2 > var1.getHp().intValue() || var3 > var1.getMp().intValue()) {
            var1.setHp(new BigDecimal(var2));
            var1.setMp(new BigDecimal(var3));
            String var4 = Agreement.getSendTextAES("rolechange", "H" + var1.getHp() + "=" + var1.getMp());
            var0.getClient().d(var4);
         }

         var0.fw("休息了一夜,你变得更精神了");
      }
   }

   public static void l(GoodFight var0, Goodstable var1, GameView var2) {
      String var3;
      if ((var3 = var1.getFight().e(var0, 5 >> 3, 5 >> 3, 5 >> 3, (String)null)) != null) {
         int var10001 = --2;
         var1.setValueTwo(var3);
         ParamTool.g(var1, var10001, var2.getClient());
         var2.f("路标已删除");
      }
   }

   public static void m(GameView var0) {
      RoleData var4;
      int var6 = cX.i((var4 = var0.roleData).getLoginResult().getGrade());
      StringBuffer var3 = new StringBuffer();

      int var1;
      for(int var10000 = var1 = 3 >> 2; var10000 < 3; var10000 = var1) {
         int var5 = SkillUtil.getSepciesIndex(var4.getLoginResult().getSpecies_id(), var1);

         int var2;
         for(var10000 = var2 = 3 & 4; var10000 < 5; var10000 = var2) {
            int var7 = 1001 + var5 * --5 + var2;
            if (var3.length() != 0) {
               var3.append("#");
            }

            var3.append(var7);
            var3.append("_");
            ++var2;
            var3.append(var6);
         }

         ++var1;
      }

      var4.getPrivateData().setSkills("S", var3.toString());
      ParamTool.f(var4.getPrivateData(), var0.getClient());
      gs var8;
      if ((var8 = (gs)var0.getFormManagement().m(90 & 119)) != null) {
         var8.as(3 ^ 3);
      }

   }

   public static void n(MapModel var0, int var1, int var2, GameView var3, boolean var4) {
      Goodstable var5;
      if ((var5 = var3.roleData.az(105L)) != null) {
         if (var0.getMapFlag() == (2 ^ 3) && var3.roleUnit.h()) {
            if (!var4) {
               var3.aal(new ConfirmBean(28 & 127, var0.getMapId() + "|" + var1 + "|" + var2, "你要使用#R" + var5.getGoodsname() + "#W去哪里?"));
            } else if (var3.getBattleScene() != null) {
               var3.f("你在战斗中");
            } else {
               int var10002 = 3 & 5;
               var5.ab(--1);
               ParamTool.g(var5, var10002, var3.getClient());
               if (var5.getUsetime() <= 0) {
                  var3.roleData.h(var5.getRgid());
               }

               GameView var10000 = var3;
               var3.automation.n((boolean)(2 & 5), 2 & 5);
               ChangeMapBean var7 = new ChangeMapBean();
               int var10003 = --1;
               var7.setMapid(String.valueOf(var0.getMapId()));
               var7.setMapx(var1);
               var7.setMapy(var2);
               var7.setType(var10003);
               String var6 = Agreement.getSendTextAES("changemap", mi.b().toJson(var7));
               var10000.getClient().d(var6);
            }
         } else {
            var3.f("飞行棋使用限制");
         }
      }
   }

   public static void o(int var0, jJ var1) {
      if (var1.ls() != null && var1.ls() instanceof lP) {
         z((lP)null, var1);
      } else if (var1.ls() != null && var1.ls() instanceof iI) {
         ae(var0, (iI)null, var1);
      } else if (var1.aej.getBattleScene() == null && var1.aej.roleUnit.h()) {
         RoleData var2 = var1.vd();
         NpcInfoBean var3;
         Robots var4 = (var3 = var1.vc().ck(var1.lj().toString())) != null ? var1.vc().at(var3.getNpctable().getBinding()) : null;
         Task var5 = var4 != null ? var2.getTaskSystem().n(Integer.parseInt(var3.getNpctable().getNpcid())) : null;
         if (var5 != null) {
            jJ var10000 = var1;
            var1.aej.roleUnit.bq();
            FightingForesee var7 = new FightingForesee();
            int var10003 = 5 >> 1;
            var7.setYidui(var1.aej.roleUnit.r.getTeam());
            var7.setAlias(var3.getNpctable().getNpcname());
            var7.setRobotid(var4.getRobotid());
            var7.setNd(var0);
            var7.setType(var10003);
            String var6 = Agreement.getSendTextAES("fig2", mi.b().toJson(var7));
            var10000.aej.getClient().d(var6);
         }
      }
   }

   public static void getfight(int var0, GameView var1) {
      if (var1.getBattleScene() == null && var1.roleUnit.h()) {
         FightingForesee var2;
         FightingForesee var10002 = var2 = new FightingForesee();
         GameView var10000 = var1;
         var2.setType(var0);
         var10002.setYidui(var1.roleUnit.r.getTeam());
         var1.roleUnit.bq();
         String var3 = Agreement.getSendTextAES("fig2", mi.b().toJson(var2));
         var10000.getClient().d(var3);
      }
   }

   public static void p(String var0, GameView var1) {
      int var2 = var1.roleData.getLoginResult().getGrade();
      int var3 = 3 ^ 3;
      GameView var10000;
      if (var0.equals("我想转换种族")) {
         var3 = var2 > (31723 & 1503) ? 126 & 13 : (var2 > (9174 & 23931) ? 78 & 59 : (var2 > (119 & 110) ? 9 & 126 : 6));
         var10000 = var1;
      } else {
         boolean var4 = true;
         if (var2 == (102 & 127)) {
            var3 = 56 & 79;
            var10000 = var1;
         } else if (var2 == (16634 & 16343)) {
            var3 = 11 & 124;
            var10000 = var1;
         } else if (var2 == (16215 & 16890)) {
            var3 = 10 & 127;
            var10000 = var1;
         } else {
            if (var2 != (32751 & 475)) {
               var1.fw("你还不具备转生的条件！");
               return;
            }

            var3 = 30 & 109;
            var10000 = var1;
         }
      }

      md var5 = (md)var10000.getFormManagement().e(125 & 43);
      int var10001;
      int var10002;
      if (var0.equals("我想转换种族")) {
         var10001 = 3 >> 2;
         var10002 = var3;
      } else {
         var10001 = 1;
         var10002 = var3;
      }

      var5.cf(var10001, var10002);
   }

   public static void q(String var0, jJ var1) {
      if (var1.uw().n(1 ^ 3, 108 & 31) && (var0.equals("换个高级藏宝图") || var0.equals("换个超级藏宝图"))) {
         BigDecimal var8 = null;
         dJ[] var11 = null;
         BigDecimal var12;
         dJ[] var13;
         boolean var10002;
         switch(var0.hashCode()) {
         case -1332643322:
            while(false) {
            }

            if (!var0.equals("换个超级藏宝图")) {
               var12 = var8;
               break;
            } else {
               var8 = new BigDecimal(80060);
               var13 = new dJ[3 & 5];
               var10002 = true;
               var13[3 >> 2] = new dJ(80059L, 5L);
               var11 = var13;
            }
         default:
            var12 = var8;
            break;
         case 1817486809:
            if (!var0.equals("换个高级藏宝图")) {
               var12 = var8;
            } else {
               var8 = new BigDecimal(25851 & 7086);
               var13 = new dJ[5 >> 2];
               var10002 = true;
               var13[3 & 4] = new dJ(171L, 3L);
               var11 = var13;
               var12 = var8;
            }
         }

         Goodstable var5 = var12 != null ? var1.vc().n(var8) : null;
         if (var5 != null) {
            ((mw)var1.ve().e(935 & 31994)).ard(var8, var11, var5);
         }
      } else {
         RoleData var2 = var1.vd();
         if (var0.equals("我是来召唤你的")) {
            NpcInfoBean var3;
            int var4;
            if ((var4 = (var3 = var1.vc().ck(var1.lj().toString())).getNpctable().getNpcname().indexOf(":")) == -4 >> 2) {
               return;
            }

            var0 = var3.getNpctable().getNpcname().substring(var4 + --1);
         }

         PartJade var9;
         List var10;
         PartJade var10000;
         label522: {
            label523: {
               dJ[] var10001;
               boolean var10003;
               label409: {
                  label524: {
                     label477: {
                        label525: {
                           label402: {
                              label526: {
                                 label478: {
                                    label397: {
                                       var9 = null;
                                       var10 = null;
                                       switch(var0.hashCode()) {
                                       case -1968694045:
                                          while(false) {
                                          }

                                          if (!var0.equals("狂力封印之书")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200092);
                                          var10001 = new dJ[--4];
                                          var10003 = true;
                                          var10001[3 >> 2] = new dJ(175L, 1L);
                                          var10001[3 >> 1] = new dJ(176L, 1L);
                                          var10001[--2] = new dJ(177L, 1L);
                                          var10001[3] = new dJ(179L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -1615211208:
                                          if (!var0.equals("天雷封印之书")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200094);
                                          var10001 = new dJ[--4];
                                          var10003 = true;
                                          var10001[3 ^ 3] = new dJ(175L, 1L);
                                          var10001[--1] = new dJ(176L, 1L);
                                          var10001[5 >> 1] = new dJ(177L, 1L);
                                          var10001[--3] = new dJ(178L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -1467640939:
                                          if (!var0.equals("兑换彩晶石")) {
                                             return;
                                          }

                                          var9 = new PartJade(0L, 80165);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80164L, 10L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -1332643322:
                                          if (!var0.equals("换个超级藏宝图")) {
                                             return;
                                          }

                                          var9 = new PartJade(0L, 80060);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80059L, 5L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -1214389739:
                                          if (!var0.equals("剧毒封印之书")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200096);
                                          var10001 = new dJ[--4];
                                          var10003 = true;
                                          var10001[3 >> 2] = new dJ(174L, 1L);
                                          var10001[3 >> 1] = new dJ(175L, 1L);
                                          var10001[5 >> 1] = new dJ(177L, 1L);
                                          var10001[--3] = new dJ(178L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -901855626:
                                          if (!var0.equals("北冥龙君(288碎片)")) {
                                             return;
                                          }
                                          break label526;
                                       case -841984324:
                                          if (!var0.equals("画皮娘子(188碎片)")) {
                                             return;
                                          }
                                          break;
                                       case -500066278:
                                          if (!var0.equals("御剑封印之书")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200093);
                                          var10001 = new dJ[--4];
                                          var10003 = true;
                                          var10001[3 >> 2] = new dJ(176L, 1L);
                                          var10001[2 ^ 3] = new dJ(177L, 1L);
                                          var10001[5 >> 1] = new dJ(178L, 1L);
                                          var10001[--3] = new dJ(179L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case -391352380:
                                          if (!var0.equals("孟极(288碎片)")) {
                                             return;
                                          }
                                          break label525;
                                       case -252839138:
                                          if (!var0.equals("孔雀明王(188碎片)")) {
                                             return;
                                          }
                                          break label397;
                                       case -89065514:
                                          if (!var0.equals("妙音栾女(388碎片)")) {
                                             return;
                                          }
                                          break label409;
                                       case 645090:
                                          if (!var0.equals("五叶")) {
                                             return;
                                          }
                                          break label478;
                                       case 22173296:
                                          if (!var0.equals("垂云叟")) {
                                             return;
                                          }
                                          break label523;
                                       case 27817131:
                                          if (!var0.equals("浪淘沙")) {
                                             return;
                                          }
                                          break label402;
                                       case 38284259:
                                          if (!var0.equals("颜如玉")) {
                                             return;
                                          }

                                          if (var9 == null) {
                                             var9 = new PartJade(1L, 200101);
                                          }
                                          break label478;
                                       case 40681492:
                                          if (!var0.equals("龙马(188碎片)")) {
                                             return;
                                          }

                                          if (var9 == null) {
                                             var9 = new PartJade(1L, 200124);
                                          }
                                          break;
                                       case 314263709:
                                          if (!var0.equals("画中仙(488碎片)")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200117);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80167L, 488L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 459383875:
                                          if (!var0.equals("佳音小使古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200146);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[0] = new dJ(175L, 1L);
                                          var10001[1] = new dJ(176L, 1L);
                                          var10001[2] = new dJ(179L, 1L);
                                          var10001[3] = new dJ(180L, 1L);
                                          var10001[4] = new dJ(182L, 2L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 651015043:
                                          if (!var0.equals("冥灵古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200135);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[3 >> 2] = new dJ(176L, 1L);
                                          var10001[3 & 5] = new dJ(178L, 1L);
                                          var10001[2] = new dJ(179L, 2L);
                                          var10001[3] = new dJ(181L, 1L);
                                          var10001[4] = new dJ(182L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 707196064:
                                          if (!var0.equals("如意古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200144);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[0] = new dJ(175L, 1L);
                                          var10001[1] = new dJ(178L, 1L);
                                          var10001[2] = new dJ(180L, 1L);
                                          var10001[3] = new dJ(181L, 2L);
                                          var10001[4] = new dJ(182L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 748348967:
                                          if (!var0.equals("巨翼古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200137);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[3 >> 2] = new dJ(176L, 1L);
                                          var10001[1] = new dJ(177L, 1L);
                                          var10001[2] = new dJ(179L, 2L);
                                          var10001[3] = new dJ(180L, 1L);
                                          var10001[4] = new dJ(182L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 750978263:
                                          if (!var0.equals("当康古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200133);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[0] = new dJ(174L, 1L);
                                          var10001[1] = new dJ(176L, 1L);
                                          var10001[2] = new dJ(177L, 1L);
                                          var10001[3] = new dJ(180L, 2L);
                                          var10001[4] = new dJ(183L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 829117173:
                                          if (!var0.equals("松鼠古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200134);
                                          var10001 = new dJ[2];
                                          var10003 = true;
                                          var10001[0] = new dJ(180L, 3L);
                                          var10001[1] = new dJ(181L, 3L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 911529650:
                                          if (!var0.equals("玲珑古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200147);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[3 & 4] = new dJ(177L, 1L);
                                          var10001[3 & 5] = new dJ(178L, 1L);
                                          var10001[2] = new dJ(179L, 2L);
                                          var10001[3] = new dJ(180L, 1L);
                                          var10001[4] = new dJ(181L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 983967266:
                                          if (!var0.equals("白泽(468碎片)")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200123);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80167L, 468L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1018376513:
                                          if (!var0.equals("苍凛古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200145);
                                          var10001 = new dJ[5];
                                          var10003 = true;
                                          var10001[0] = new dJ(174L, 2L);
                                          var10001[1] = new dJ(179L, 1L);
                                          var10001[2] = new dJ(180L, 1L);
                                          var10001[3] = new dJ(181L, 1L);
                                          var10001[4] = new dJ(183L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1023207363:
                                          if (!var0.equals("范式之魂")) {
                                             return;
                                          }
                                          break label524;
                                       case 1042713838:
                                          if (!var0.equals("葫芦古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200136);
                                          var10001 = new dJ[14 & 119];
                                          var10003 = true;
                                          var10001[0] = new dJ(174L, 1L);
                                          var10001[1] = new dJ(176L, 1L);
                                          var10001[2] = new dJ(177L, 1L);
                                          var10001[3] = new dJ(179L, 1L);
                                          var10001[4] = new dJ(182L, 1L);
                                          var10001[5] = new dJ(183L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1106960532:
                                          if (!var0.equals("赭炎古卷")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200132);
                                          var10001 = new dJ[7 & 126];
                                          var10003 = true;
                                          var10001[0] = new dJ(174L, 1L);
                                          var10001[1] = new dJ(175L, 1L);
                                          var10001[2] = new dJ(180L, 1L);
                                          var10001[3] = new dJ(181L, 1L);
                                          var10001[4] = new dJ(182L, 1L);
                                          var10001[5] = new dJ(183L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1162282396:
                                          if (!var0.equals("镜花水月(388碎片)")) {
                                             return;
                                          }
                                          break label477;
                                       case 1502595688:
                                          if (!var0.equals("寒冰封印之书")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200095);
                                          var10001 = new dJ[--4];
                                          var10003 = true;
                                          var10001[5 >> 3] = new dJ(174L, 1L);
                                          var10001[2 ^ 3] = new dJ(175L, 1L);
                                          var10001[--2] = new dJ(177L, 1L);
                                          var10001[--3] = new dJ(179L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1624805537:
                                          if (!var0.equals("我要兑换推广礼包")) {
                                             return;
                                          }

                                          var9 = new PartJade(0L, 80046);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80047L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1676496623:
                                          if (!var0.equals("年(588碎片)")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200116);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80167L, 588L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1681718485:
                                          if (!var0.equals("我要兑换武圣之魂")) {
                                             return;
                                          }

                                          var9 = new PartJade(1L, 200157);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(80047L, 1L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 1817486809:
                                          if (!var0.equals("换个高级藏宝图")) {
                                             return;
                                          }

                                          var9 = new PartJade(0L, 26031 & 6906);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(171L, 3L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       case 2132727578:
                                          if (!var0.equals("换个玲珑藏宝图(消耗10E大话币,1W仙玉)")) {
                                             return;
                                          }

                                          if (var2.getLoginResult().getGold().compareTo(new BigDecimal(1000000000)) < 0) {
                                             var1.aej.f("你大话币不足10亿");
                                             return;
                                          }

                                          if (var2.getLoginResult().getCodecard().compareTo(new BigDecimal(16150 & 26617)) < 0) {
                                             var1.aej.f("你仙玉不足1万");
                                             return;
                                          }

                                          var9 = new PartJade(0L, 81579);
                                          var10001 = new dJ[1];
                                          var10003 = true;
                                          var10001[0] = new dJ(81578L, 5L);
                                          var10 = var2.aa(var10001);
                                          var10000 = var9;
                                          break label522;
                                       default:
                                          return;
                                       }

                                       if (var9 == null) {
                                          var9 = new PartJade(1L, 200138);
                                       }
                                    }

                                    if (var9 == null) {
                                       var9 = new PartJade(1L, 200141);
                                    }

                                    if (var10 == null) {
                                       var10001 = new dJ[1];
                                       var10003 = true;
                                       var10001[0] = new dJ(80168L, 188L);
                                       var10 = var2.aa(var10001);
                                    }
                                    break label526;
                                 }

                                 if (var9 == null) {
                                    var9 = new PartJade(1L, 200100);
                                 }
                                 break label402;
                              }

                              if (var9 == null) {
                                 var9 = new PartJade(1L, 200142);
                              }
                              break label525;
                           }

                           if (var9 == null) {
                              var9 = new PartJade(1L, 200099);
                           }
                           break label524;
                        }

                        if (var9 == null) {
                           var9 = new PartJade(1L, 200140);
                        }

                        if (var10 == null) {
                           var10001 = new dJ[1];
                           var10003 = true;
                           var10001[0] = new dJ(80168L, 288L);
                           var10 = var2.aa(var10001);
                        }
                     }

                     if (var9 == null) {
                        var9 = new PartJade(1L, 200143);
                     }
                     break label409;
                  }

                  if (var9 == null) {
                     var9 = new PartJade(1L, 200098);
                  }
                  break label523;
               }

               if (var9 == null) {
                  var9 = new PartJade(1L, 200158);
               }

               if (var10 == null) {
                  var10001 = new dJ[1];
                  var10003 = true;
                  var10001[0] = new dJ(80168L, 388L);
                  var10 = var2.aa(var10001);
                  var10000 = var9;
               } else {
                  var10000 = var9;
               }
               break label522;
            }

            if (var9 == null) {
               var9 = new PartJade(1L, 200097);
            }

            var10 = aa(var2);
            var10000 = var9;
         }

         if (var10000 != null && var10 != null) {
            if (var9.getSuitid() == 1L && var2.pets.size() >= (23 & 125)) {
               var1.aej.fw("您的召唤兽可携带的数量已满");
            } else if (var9.getSuitid() == 0L && var2.getGoodPackSum(-1L, new BigDecimal(1), 1) <= 0) {
               var1.aej.fw("背包已满");
            } else {
               SuitOperBean var6 = new SuitOperBean();
               var6.setType(119 & 29);
               var6.setJade(var9);
               var6.setGoods(var2.br(var10));
               String var7 = Agreement.getSendTextAES("suitoperate", mi.b().toJson(var6));
               var1.uw().d(var7);
            }
         } else {
            var1.aej.fw("物品不足");
         }
      }
   }

   public static void r(int var0, int var1, int var2, GameView var3) {
      if (var3.getBattleScene() != null) {
         var3.f("你在战斗中");
      } else {
         ChangeMapBean var4 = new ChangeMapBean();
         int var10002 = --3;
         var4.setMapid(String.valueOf(var0));
         var4.setMapx(var1);
         var4.setMapy(var2);
         var4.setType(var10002);
         String var5 = Agreement.getSendTextAES("changemap", mi.b().toJson(var4));
         var3.getClient().d(var5);
      }
   }

   public static void s(String var0, GameView var1) {
      RoleData var10000 = var1.roleData;
      RoleSummoning var2;
      if ((var2 = var10000.getPet(var10000.getLoginResult().getSummoning_id())) == null) {
         var1.fw("你没有设置参战的召唤兽");
      } else {
         String var3 = null;
         String var7;
         if (var0.equals("转生当前召唤兽")) {
            if (var2.getTurnRount() >= --3) {
               var1.fw("最高到3转");
               return;
            }

            var7 = var3 = Agreement.getSendTextAES("userpet", "DH|" + var2.getSid());
         } else if (var0.equals("点化当前召唤兽")) {
            long var4 = (long)(var1.getClient().n(1 ^ 3, 79 & 60) ? 500000 : 2000000);
            int var6 = var1.getClient().n(1 ^ 3, 45 & 94) ? 16319 & 16981 : 543;
            if (var2.getGrade() != var6 || var2.getFriendliness() < var4) {
               var1.fw("召唤兽不符合点化要求");
               return;
            }

            var7 = var3 = Agreement.getSendTextAES("userpet", "DH|" + var2.getSid());
         } else if (var0.equals("飞升当前参战神兽")) {
            var7 = var3 = Agreement.getSendTextAES("userpet", "FS|" + var2.getSid());
         } else if (var0.equals("神兽学习技能")) {
            var7 = var3 = Agreement.getSendTextAES("userpet", "SS|" + var2.getSid());
         } else {
            if (var0.equals("启灵当前召唤兽")) {
               var3 = Agreement.getSendTextAES("userpet", "QL|" + var2.getSid());
            }

            var7 = var3;
         }

         if (var7 != null) {
            var1.getClient().d(var3);
         }
      }
   }

   public static void t(int var0, GameView var1) {
      RoleData var2 = var1.roleData;
      if (var0 == 0) {
         RoleSummoning var5;
         if ((var5 = var2.getChosePet()) == null) {
            var1.fw("当前没有选中召唤兽");
         } else {
            w(var5, var2);
         }
      } else {
         int var3;
         if (var0 == --1) {
            for(int var10000 = var3 = 5 >> 3; var10000 < var2.pets.size(); var10000 = var3) {
               RolePet var4 = (RolePet)var2.pets.get(var3);
               ++var3;
               w(var4.getPet(), var2);
            }
         }

      }
   }

   public static void u(Goodstable var0, GameView var1) {
      RoleShow var2 = var1.roleUnit.r;
      String var3;
      if ((var3 = var0.getFight().b(var2.getMapid().intValue(), var2.getX(), var2.getY(), var1.mapScene.ad().getMapName())) != null) {
         int var10001 = 5 >> 1;
         var0.setValueTwo(var3);
         ParamTool.g(var0, var10001, var1.getClient());
         var1.f("路标已添加");
      }
   }

   public static void v(int var0, jJ var1) {
      RoleData var2;
      if ((var2 = var1.vd()).pets.size() >= (23 & 125)) {
         var1.aej.fw("您的召唤兽可携带的数量已满");
      } else {
         List var3 = null;
         List var10000;
         dJ[] var10001;
         boolean var10003;
         if (var0 == 3 >> 1) {
            var10001 = new dJ[3 >> 1];
            var10003 = true;
            var10001[2 & 5] = new dJ(901L, 90L);
            var10000 = var3 = var2.aw(var10001);
         } else {
            if (var0 == 5 >> 1) {
               var10001 = new dJ[3 >> 1];
               var10003 = true;
               var10001[3 >> 2] = new dJ(904L, 500L);
               var3 = var2.aw(var10001);
            }

            var10000 = var3;
         }

         if (var10000 == null) {
            var1.aej.fw("物品不足");
         } else {
            SuitOperBean var4 = new SuitOperBean();
            var4.setType(23 & 125);
            var4.setJade(new PartJade(2L, var0));
            var4.setGoods(var2.br(var3));
            String var5 = Agreement.getSendTextAES("suitoperate", mi.b().toJson(var4));
            var1.uw().d(var5);
         }
      }
   }

   public static void w(RoleSummoning var0, RoleData var1) {
      int[] var2 = PetProperty.getPetHMASp(var0, var1);
      int var5 = var0.getFaithful();
      int var4 = var2[3 ^ 3];
      int var3 = var2[5 >> 2];
      int var6 = var0.getBasishp(var2[2 & 5]);
      int var9 = var0.getBasismp(var2[--1]);
      long var7 = (long)((var4 - var6 + (var3 - var9) + ((100 & 127) - var5)) / (127 & 15));
      if (var5 >= (119 & 108) && var6 >= var4 && var9 >= var3) {
         var1.getGameView().fw("您携带的召唤兽血量和忠诚度都已满");
      } else {
         var9 = var1.getLoginResult().getGrade() <= (103 & 126) ? 5 >> 2 : 0;
         int var10000;
         if (var9 != 0) {
            var7 = 0L;
            var10000 = var9;
         } else {
            if (var7 <= 0L) {
               var7 = 10000L;
            }

            var10000 = var9;
         }

         if (var10000 != 0 || ParamTool.c(var7, var1.getGameView())) {
            var0.setFaithful(119 & 108);
            var0.setBasishp(var4);
            var0.setBasismp(var3);
            ParamTool.h(var0, var1.getGameView().getClient());
            if (var1.getChosePet() == var0) {
               var1.getRoleProperty().m(var0);
            }

            if (var9 != 0) {
               var1.getGameView().fw("您的召唤兽恢复健康了,你处于新手阶段本次治疗免费");
            } else {
               var1.getGameView().fw("您的召唤兽恢复健康了");
            }
         }
      }
   }

   public static int x(int var0, int var1, String[] var2) {
      if (var1 == --1) {
         return 5 >> 3;
      } else if (var2 == null) {
         return 3 >> 1;
      } else {
         String var4 = var0 - (4 ^ 5) + "_";

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].startsWith(var4)) {
               if (Integer.parseInt(var2[var3].substring(var4.length())) > (30700 & 3067)) {
                  return 3 ^ 3;
               }

               return 2;
            }

            ++var3;
         }

         return 3 >> 1;
      }
   }

   public static void y(GameView var0) {
      RoleData var1;
      if ((var1 = var0.roleData).getLoginResult().getGang_id() != null && var1.getLoginResult().getGang_id().intValue() != 0) {
         Door var2 = new Door();
         int var10001 = --4;
         var2.setDoormap("3000");
         var2.setDoorpoint("300|3000");
         ac(var2, var10001, var0);
      } else {
         var0.f("你还没有帮派");
      }
   }

   public static void z(lP var0, jJ var1) {
      if (var1.aej.getBattleScene() == null && var1.aej.roleUnit.h()) {
         if (var0 == null) {
            var0 = (lP)var1.ls();
         }

         MonsterBean var2;
         if ((var2 = var0.p).getType() != 0) {
            var1.aej.f("怪物正在忙碌中");
         } else {
            FightingForesee var3 = new FightingForesee();
            var3.setType(5 >> 2);
            if (var2.getRobotid() == (26319 & 7099)) {
               if (var1.aej.roleUnit.r.getTeam().split("\\|").length > --1) {
                  var1.aej.f("只能单人击杀");
                  return;
               }

               var3.setType(--4);
            }

            var3.setYidui(var1.aej.roleUnit.r.getTeam());
            var3.setI(var2.getI());
            jJ var10000 = var1;
            var1.aej.roleUnit.bq();
            String var4 = Agreement.getSendTextAES("fig2", mi.b().toJson(var3));
            var10000.aej.getClient().d(var4);
         }
      }
   }

   public static List<dJ> aa(RoleData var0) {
      dJ[] var10001 = new dJ[26 & 111];
      boolean var10003 = true;
      var10001[5 >> 3] = new dJ(901L, 1L);
      var10001[3 & 5] = new dJ(902L, 1L);
      var10001[5 >> 1] = new dJ(903L, 1L);
      var10001[--3] = new dJ(904L, 1L);
      var10001[--4] = new dJ(905L, 1L);
      var10001[--5] = new dJ(906L, 1L);
      var10001[102 & 31] = new dJ(907L, 1L);
      var10001[87 & 47] = new dJ(908L, 1L);
      var10001[76 & 59] = new dJ(909L, 1L);
      var10001[47 & 89] = new dJ(910L, 1L);
      return var0.aa(var10001);
   }

   public static void ab(int var0, GameView var1) {
      if (var1.roleUnit.r.getFighting() == 0) {
         GameView var10000 = var1;
         var1.roleUnit.bq();
         FightingForesee var2 = new FightingForesee();
         var2.setYidui(var1.roleUnit.r.getTeam());
         var2.setType(var0);
         String var3 = Agreement.getSendTextAES("fig2", mi.b().toJson(var2));
         var10000.getClient().d(var3);
      }
   }

   public static void ac(Door var0, int var1, GameView var2) {
      if (var0 != null) {
         if (var1 != --3 && var1 != 0) {
            var2.automation.n((boolean)(5 >> 3), 5 >> 3);
         }

         if (var2.getBattleScene() != null) {
            var2.f("你在战斗中");
         } else {
            ChangeMapBean var3;
            ChangeMapBean var10000 = var3 = new ChangeMapBean();
            var3.setMapid(var0.getDoormap());
            String[] var10003 = var0.getDoorpoint().split("\\|");
            int var4 = Integer.parseInt(var10003[3 >> 2]);
            int var5 = Integer.parseInt(var10003[5 >> 2]);
            var10000.setMapx(var4);
            var3.setMapy(var5);
            var10000.setType(var1);
            String var6 = Agreement.getSendTextAES("changemap", mi.b().toJson(var3));
            var2.getClient().d(var6);
         }
      }
   }

   public static void ad(BuyShopBean var0, Eshop var1, int var2, MoneyType var3, GameView var4) {
      if (!var4.t()) {
         Goodstable var5 = var4.getObjectArea().n(new BigDecimal(var1.getEshopiid()));
         if ((var2 = var4.roleData.getGoodPackSum(var5 != null ? var5.getType() : 6500L, new BigDecimal(var1.getEshopiid()), var2)) <= 0) {
            var4.fw("你背包空间不足");
         } else {
            long var6 = 0L;
            long var8 = Long.parseLong(var1.getEshopprice());
            if ((var6 = var4.roleData.getMoney(var3) / var8) > (long)var2) {
               var6 = (long)var2;
            }

            long var10 = var8 * var6;
            if (var6 <= 0L) {
               var4.fw("你没有足够的" + var3.getKey());
            } else {
               if (MsgUntil.m(var1.getEshopname())) {
                  if (var4.roleData.j(var1.getEshopname())) {
                     return;
                  }

                  boolean var13 = true;
                  var6 = 1L;
                  var10 = var8 * var6;
               }

               var0.setCd(var1.getEshopid().toString());
               var0.setSum((int)var6);
               if (var3.getId() == -4 >> 2) {
                  var3.setMax(var3.getMax() - var10);
               }

               String var12 = Agreement.getSendTextAES("nbuy", mi.b().toJson(var0));
               var4.getClient().d(var12);
            }
         }
      }
   }

   public static void ae(int var0, iI var1, jJ var2) {
      if (var2.aej.getBattleScene() == null && var2.aej.roleUnit.h()) {
         RoleData var3 = var2.vd();
         if (var1 == null) {
            var1 = (iI)var2.ls();
         }

         Robots var4 = var1 != null ? var2.vc().at(String.valueOf(var1.y.getDId())) : null;
         Task var5 = var4 != null ? var3.getTaskSystem().h(var1.y) : null;
         if (var5 != null) {
            var2.aej.roleUnit.bq();
            FightingForesee var7 = new FightingForesee();
            int var10003 = 5 >> 1;
            var7.setYidui(var2.aej.roleUnit.r.getTeam());
            var7.setAlias(var1.aw());
            var7.setRobotid(var4.getRobotid());
            var7.setNd(var0);
            var7.setType(var10003);
            String var6 = Agreement.getSendTextAES("fig2", mi.b().toJson(var7));
            var2.aej.getClient().d(var6);
         }
      }
   }

   public static void af(int var0, GameView var1) {
      String var2;
      if (var0 == -4 >> 2) {
         var2 = Agreement.getSendTextAES("usercard", "S");
         var1.getClient().d(var2);
      } else if (var0 == (-2 & -1)) {
         var2 = Agreement.getSendTextAES("usercard", "Q");
         var1.getClient().d(var2);
      } else {
         var2 = Agreement.getSendTextAES("usercard", "R" + var0 * (61 & 126));
         var1.getClient().d(var2);
      }
   }
}
