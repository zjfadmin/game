package com.xy.game;

import com.xy.W;
import com.xy.cP;
import com.xy.cX;
import com.xy.eC;
import com.xy.ev;
import com.xy.gs;
import com.xy.hd;
import com.xy.jJ;
import com.xy.kd;
import com.xy.lD;
import com.xy.lt;
import com.xy.mw;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.formula.BaseValue;
import com.xy.formula.BaseXuanBao;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class HandleGood {
   public static void a(Goodstable var0, int var1, RoleData var2) {
      if (l(var2)) {
         eC var4 = var2.getGameView().roleUnit;
         MapModel var3 = var2.getGameView().mapScene.ad();
         String var8 = var4.r.getMapid() + "," + var3.getMapName() + "," + var4.ab + "," + var4.al;
         int var10000;
         String[] var5;
         int var6;
         StringBuffer var7;
         Goodstable var9;
         if (var1 == (-609 & -391)) {
            var7 = new StringBuffer();
            if ((var5 = var0.getValue().split("\\|")).length >= (54 & 79)) {
               var2.getGameView().fw("记录点已经满了");
               return;
            }

            for(var10000 = var6 = 0; var10000 < var5.length - --1; var10000 = var6) {
               if (var7.length() != 0) {
                  var7.append("|");
               }

               var7.append(var5[var6++]);
            }

            if (var7.length() != 0) {
               var7.append("|");
            }

            var7.append("传送=");
            var7.append(var8);
            var7.append("|");
            var7.append(var5[var5.length - --1]);
            var0.setValue(var7.toString());
            var9 = var0;
         } else if (var1 <= 0) {
            var1 = Math.abs(var1);
            var7 = new StringBuffer();
            var5 = var0.getValue().split("\\|");

            for(var10000 = var6 = 3 & 4; var10000 < var5.length; var10000 = var6) {
               if (var7.length() != 0) {
                  var7.append("|");
               }

               if (var6 == var1) {
                  var7.append("传送=");
                  var7.append(var8);
               } else {
                  var7.append(var5[var6]);
               }

               ++var6;
            }

            var9 = var0;
            var0.setValue(var7.toString());
         } else {
            var9 = var0;
            var0.setValue("传送=" + var8 + "|可用次数=" + var1);
         }

         ParamTool.g(var9, 2, var2.getGameView().getClient());
         var2.getGameView().fw("记录点生效");
      }
   }

   public static int[] b(String var0) {
      String[] var1;
      int[] var10000 = new int[(var1 = var0.split("=")[4 ^ 5].split("\\|")).length];
      boolean var10002 = true;
      int[] var2 = var10000;

      int var3;
      for(int var5 = var3 = 5 >> 3; var5 < var1.length; var5 = var3) {
         String var4 = var1[var3].split("\\&")[3 >> 2];
         int var10001 = var3;
         int var6 = Integer.parseInt(var4);
         ++var3;
         var2[var10001] = var6;
      }

      return var2;
   }

   public static void c(Goodstable var0, RoleData var1) {
      LoginResult var6 = var1.getLoginResult();
      int var3 = 3 >> 2;
      String[] var4 = var0.getValue().split("\\|");

      int var5;
      for(int var10000 = var5 = 2 & 5; var10000 < var4.length; var10000 = var5) {
         String[] var2;
         if ((var2 = var4[var5].split("="))[3 & 4].equals("等级要求")) {
            if (!cX.j(var6.getGrade(), var2[4 ^ 5])) {
               var1.getGameView().fw("你等级太低");
               return;
            }
         } else if (var2[3 ^ 3].equals("物品")) {
            var2 = var2[--1].split("\\&");

            int var7;
            for(var10000 = var7 = 3 ^ 3; var10000 < var2.length; var10000 = var7) {
               String[] var8 = var2[var7].split("\\$");
               Goodstable var9;
               if ((var9 = var1.getObjectArea().n(new BigDecimal(var8[2 & 5]))) != null) {
                  var3 += !GoodType.ag(var9.getType()) ? Integer.parseInt(var8[4 ^ 5]) : 1;
               }

               ++var7;
            }
         }

         ++var5;
      }

      if (var3 != 0) {
         if (var1.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var3) < var3) {
            var1.getGameView().fw("你的背包不够");
         } else {
            var0.ab(--1);
            if (var0.getUsetime() <= 0) {
               var1.h(var0.getRgid());
            }

            String var10 = Agreement.getSendTextAES("user", var0.getRgid().toString());
            var1.getGameView().getClient().d(var10);
         }
      }
   }

   public static void d(Goodstable var0, RoleData var1, int var2) {
      GameView var5 = var1.getGameView();
      Goodstable var4;
      if ((var4 = var1.getChoseXuanBao()) == null) {
         var5.fw("你没有选中的玄宝");
      } else {
         BaseXuanBao var10000 = var4.getBaseXuanBao();
         int var3 = cX.d(var1.getLoginResult().getGrade());
         int var6 = cX.g(var1.getLoginResult().getGrade());
         var3 = BaseValue.getlvlMax(var3, var6);
         if (var10000.getLvl() >= var3) {
            var5.fw("玄宝等级不能超过人物等级");
         } else {
            String var7 = Agreement.getSendTextAES("user", var4.getRgid() + "|" + var0.getRgid() + "|" + var2);
            var1.getGameView().getClient().d(var7);
         }
      }
   }

   public static void e(Goodstable var0, RoleData var1) {
      long[] var2;
      if ((var2 = cX.a(var0.getValue()))[--4] != 0L && m(var2[--4], var1)) {
         int var10002 = --1;
         var0.ab(3 >> 1);
         ParamTool.g(var0, var10002, var1.getGameView().getClient());
         ParamTool.f(var1.getPrivateData(), var1.getGameView().getClient());
         gs var3;
         if ((var3 = (gs)var1.getGameView().getFormManagement().m(123 & 86)) != null) {
            var3.as(3 >> 2);
         }
      }

   }

   public static void f(Goodstable var0, RoleData var1) {
      if (k(GoodType.ao(var0.getValue()), var1)) {
         var0.ab(--1);
      }
   }

   public static void g(Goodstable var0, RoleData var1) {
      if (l(var1)) {
         if (var0.getValue() != null && !var0.getValue().equals("")) {
            ((jJ)var1.getGameView().getFormManagement().e(27 & 127)).av(var0);
         } else {
            long var2 = var0.getType();
            int var4 = 3 ^ 3;
            Goodstable var10000;
            if (var2 == 2010L) {
               var4 = 79 & 58;
               var10000 = var0;
            } else if (var2 == 2011L) {
               var4 = 3 & 5;
               var10000 = var0;
            } else {
               if (var2 == 2012L) {
                  var4 = 115 & 111;
               }

               var10000 = var0;
            }

            a(var10000, var4, var1);
         }
      }
   }

   public static void h(Goodstable var0, RoleData var1) {
      Goodstable var10000;
      PKSys var2;
      if ((var2 = var1.getPkSys()).getPk1() > 0) {
         var10000 = var0;
         var2.c();
      } else {
         var1.getGameView().f("你身上没有PK点,就不要瞎捣乱,特赦令就不还给你了");
         var10000 = var0;
      }

      var10000.ab(1);
      ParamTool.g(var0, 4 ^ 5, var1.getGameView().getClient());
   }

   public static void i(Goodstable var0, RoleData var1) {
      Goodstable var8;
      String var9 = (var8 = var1.getObjectArea().n(var0.getGoodsid())) != null ? var8.getValue() : null;
      if (hd.o(var9)) {
         var1.getGameView().fw("数据异常");
      } else {
         int var4 = 0;
         int var5 = 2 & 5;
         int var6 = 2 & 5;
         int var7 = 3 >> 2;
         int var2 = 3 & 4;

         int var3;
         for(int var10000 = var3 = 3 ^ 3; var10000 < var9.length(); var10000 = var3) {
            if ((var3 = var9.indexOf("!", var7 + (5 >> 2))) == -4 >> 2) {
               var3 = var9.length();
            }

            if ((var2 = var9.indexOf("@", var7 + (3 & 5))) == -4 >> 2 || var2 > var3) {
               var2 = var3;
            }

            String var10 = var9.substring(var7, var2);
            var7 = var2 + (5 >> 2);
            if ((var2 = var9.indexOf("@", var7 + (4 ^ 5))) == -4 >> 2 || var2 > var3) {
               var2 = var3;
            }

            String var11;
            if ((var2 = (var11 = var9.substring(var7, var2)).indexOf("=")) == -4 >> 2) {
               var2 = var11.length();
            }

            int var12 = hd.b(var11, 5 >> 3, var2);
            int var13 = var2 < var11.length() ? hd.b(var11, var2 + (3 & 5), var11.length()) : 1;
            if (var10.equals("物品")) {
               if ((var8 = var1.getObjectArea().n(new BigDecimal(var12))) != null && GoodType.ag(var8.getType())) {
                  var10000 = var3;
                  ++var4;
               } else {
                  var4 += var13;
                  var10000 = var3;
               }
            } else if (var10.equals("召唤兽")) {
               var5 += var13;
               var10000 = var3;
            } else {
               if (var10.equals("灵宝")) {
                  var6 += var13;
               }

               var10000 = var3;
            }

            var7 = var10000 + 1;
         }

         if (var4 > 0 && var1.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), var4) < var4) {
            var1.getGameView().fw("你的背包不够");
         } else if (var5 > 0 && var1.pets.size() + var5 > (127 & 21)) {
            var1.getGameView().fw("你的召唤兽栏不够");
         } else if (var6 > 0 && var1.lingbaoList.size() + var6 > (100 & 123)) {
            var1.getGameView().fw("你的灵宝数量已达上限");
         } else {
            String var14 = Agreement.getSendTextAES("user", var0.getRgid().toString());
            var1.getGameView().getClient().d(var14);
         }
      }
   }

   public static boolean j(int[] var0, double var1, double var3, double var5, double var7, RoleData var9) {
      if (var1 == var3 && var5 == var7) {
         int var11 = 5 >> 3;
         var9.getGameView().fw("你已经很健康了");
         return (boolean)var11;
      } else {
         int var10 = 0;
         int[] var10000;
         if ((var0[3 ^ 3] != 0 || var0[1 ^ 3] != 0) && var1 > var3) {
            var10 = 2 ^ 3;
            var10000 = var0;
         } else {
            if (var1 <= var3 && (var0[2 & 5] != 0 || var0[--2] != 0)) {
               var9.getGameView().fw("生命值已满");
            }

            var10000 = var0;
         }

         if ((var10000[1] != 0 || var0[--3] != 0) && var5 > var7) {
            return (boolean)(var10 = 3 & 5);
         } else {
            if (var5 <= var7 && (var0[3 & 5] != 0 || var0[--3] != 0)) {
               var9.getGameView().fw("魔法值已满");
            }

            return (boolean)var10;
         }
      }
   }

   public static boolean k(int[] var0, RoleData var1) {
      double var2 = (double)var1.getRoleProperty().getHp();
      double var4 = (double)var1.getLoginResult().getHp().intValue();
      double var6 = (double)var1.getRoleProperty().getMp();
      double var8 = (double)var1.getLoginResult().getMp().intValue();
      if (var4 == 0.0D) {
         var4 = var2;
         var8 = var6;
      }

      if (!j(var0, var2, var4, var6, var8, var1)) {
         return (boolean)(3 >> 2);
      } else {
         if (var0[3 & 4] != 0 || var0[5 >> 1] != 0) {
            if ((var4 = var4 + (double)var0[3 & 4] + (double)var0[1 ^ 3] * var2 / 100.0D) > var2) {
               var4 = var2;
            }

            var1.getLoginResult().setHp(new BigDecimal((int)var4));
         }

         if (var0[--1] != 0 || var0[--3] != 0) {
            if ((var8 = var8 + (double)var0[4 ^ 5] + (double)var0[--3] * var6 / 100.0D) > var6) {
               var8 = var6;
            }

            var1.getLoginResult().setMp(new BigDecimal((int)var8));
         }

         return true;
      }
   }

   public static boolean l(RoleData var0) {
      if (var0.getTaskSystem().s()) {
         int var10000 = 3 ^ 3;
         var0.getGameView().fw("传送限制");
         return (boolean)var10000;
      } else if (var0.getGameView().mapScene.ad().getMapFlag() == (3 & 5) && var0.getGameView().roleUnit.h()) {
         return true;
      } else {
         var0.getGameView().fw("飞行棋使用限制");
         return (boolean)(2 & 5);
      }
   }

   public static boolean m(long var0, RoleData var2) {
      RoleData var3 = var2;
      PrivateData var7 = var2.getPrivateData();
      int var4 = cX.i(var2.getLoginResult().getGrade());
      String[] var5;
      int var10000;
      if ((var5 = var7.getSkill("S")) == null) {
         var10000 = 5 >> 3;
         var2.getGameView().fw("你还未学习技能");
         return (boolean)var10000;
      } else {
         int var6;
         for(var10000 = var6 = 0; var10000 < var5.length; var10000 = var6) {
            String[] var11;
            double var8 = Double.parseDouble((var11 = var5[var6].split("_"))[3 >> 1]);
            Skill var10;
            if (!((double)var4 <= var8) && (var10 = var3.getObjectArea().bf(var11[2 & 5])) != null) {
               if ((double)var4 < var8 + (double)var0) {
                  var0 = (long)((int)((double)var4 - var8));
               }

               var8 += (double)var0;
               var3.getGameView().fw("你的" + var10.getSkillname() + "获得" + var0 + "熟练度");
               var5[var6] = var11[--1] + "_" + (int)var8;
               StringBuffer var12 = new StringBuffer();

               int var13;
               for(var10000 = var13 = 2 & 5; var10000 < var5.length; var10000 = var13) {
                  if (var12.length() != 0) {
                     var12.append("#");
                  }

                  var12.append(var5[var13++]);
               }

               var10000 = 5 >> 2;
               var7.setSkills("S", var12.toString());
               return (boolean)var10000;
            }

            ++var6;
         }

         var10000 = 2 & 5;
         var3.getGameView().fw("技能熟练度已满!");
         return (boolean)var10000;
      }
   }

   public static void n(Goodstable var0, RoleData var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < var1.goodChoses.length; var10000 = var2) {
         if (var1.goodChoses[var2] != null) {
            var1.getGameView().fw("请脱下装备");
            return;
         }

         ++var2;
      }

      LoginResult var5;
      LoginResult var6 = var5 = var1.getLoginResult();
      int var3;
      var6.setBone(var3 = cX.d(var6.getGrade()));
      var6.setSpir(var3);
      var6.setPower(var3);
      var6.setSpeed(var3);
      if (var6.getTurnAround() >= --4) {
         var5.setCalm(var3);
      }

      var5.setHp(new BigDecimal(var1.getRoleProperty().getHp()));
      var5.setMp(new BigDecimal(var1.getRoleProperty().getMp()));
      var1.getGameView().fw("你的使用了" + var0.getGoodsname());
      var0.ab(3 & 5);
      ParamTool.g(var0, --1, var1.getGameView().getClient());
      var1.getRoleProperty().k();
      String var4 = Agreement.getSendTextAES("rolechange", "D" + var5.getBone() + "=" + var5.getSpir() + "=" + var5.getPower() + "=" + var5.getSpeed() + "=" + var5.getCalm());
      var1.getGameView().getClient().d(var4);
   }

   public static void o(Goodstable var0, RoleData var1) {
      long var2;
      String var5;
      if ((var2 = var0.getType()) != 100L && var2 != 888L && var2 != 2041L) {
         int var13;
         long var16;
         RoleShow var18;
         if (var2 != 7005L && var2 != 118L && var2 != 2051L && var2 != 2052L && var2 != 2057L && var2 != 1007L) {
            String var15;
            if (var2 == 502L) {
               if (var1.pets.size() >= (87 & 61)) {
                  var1.getGameView().f("您的召唤兽可携带的数量已满！！！");
               } else {
                  var0.ab(--1);
                  var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                  var1.getGameView().getClient().d(var15);
               }
            } else {
               if (var2 == 717L) {
                  if ((var13 = Integer.parseInt(var0.getValue()) / (118 & 109)) <= (119 & 15)) {
                     if (var1.getGameView().getFormManagement().m(71 & 63) == null) {
                        if (var1.getMount(var13) != null) {
                           var1.getGameView().fw("你已有这种坐骑！");
                           return;
                        }

                        var0.ab(4 ^ 5);
                        var5 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                        var1.getGameView().getClient().d(var5);
                        return;
                     }

                     HandleMount.c(var0, var1);
                     return;
                  }
               } else {
                  if (var2 == 2525L) {
                     if (var0.getGoodsid().compareTo(new BigDecimal(81445)) == 0) {
                        if (3337L != var1.getGameView().mapScene.b()) {
                           var1.getGameView().f("前往孔庙(33,16)使用");
                           return;
                        }

                        var18 = var1.getGameView().roleUnit.r;
                        var16 = (long)((var18.getX() - (4060 & 29375)) / (56 & 111));
                        long var17 = (long)((var18.getY() - (21471 & 11631)) / (44 & 123));
                        var16 = Math.abs(var16);
                        var17 = Math.abs(var17);
                        if (var16 > 4L || var17 > 4L) {
                           var1.getGameView().f("前往孔庙(33,16)使用");
                           return;
                        }
                     }

                     var0.ab(--1);
                     var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                     var1.getGameView().getClient().d(var15);
                     return;
                  }

                  if (GoodType.t(var2) || GoodType.ae(var2) || var2 == 88L || var2 == 99L || var2 == 111L || var2 == 112L || var2 == 113L || var2 == 151L || var2 == 193L) {
                     var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                     var1.getGameView().getClient().d(var15);
                     return;
                  }

                  if (var2 == 1006L) {
                     var0.ab(--1);
                     var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                     var1.getGameView().getClient().d(var15);
                     return;
                  }

                  if (var2 == 2054L) {
                     var0.ab(--1);
                     var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                     var1.getGameView().getClient().d(var15);
                     return;
                  }

                  if (var2 == 509L) {
                     var15 = Agreement.getSendTextAES("user", var0.getRgid().toString());
                     var1.getGameView().getClient().d(var15);
                  }
               }

            }
         } else if (var1.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), 4 ^ 5) == 0) {
            var1.getGameView().fw("你的背包已满");
         } else {
            var13 = 1;
            if (var2 == 118L) {
               if ((var13 = Math.max(2 ^ 3, hd.an(var0.getValue(), "需要数量=", "|"))) > var0.getUsetime()) {
                  var1.getGameView().f("你需要凑够" + var13 + "个相同物品才能开启");
                  return;
               }

               if ((var16 = hd.p(var0.getValue(), "读条=", "|")) > 0L) {
                  var1.getGameView().getGameReadBar().setReadBar(--1, --3, "开启" + var0.getGoodsname(), (double)Math.max(300L, var16), ev.l(), var0.getRgid());
                  return;
               }
            } else {
               String[] var14;
               if ((var2 == 2051L || var2 == 2052L || var2 == 2057L || var2 == 1007L) && (var14 = var0.getValue().split("\\="))[3 ^ 3].equals("宝图")) {
                  String[] var10000 = var14[5 >> 2].split(",");
                  int var6 = Integer.parseInt(var10000[5 >> 3]);
                  int var7 = Integer.parseInt(var10000[--2]) / (52 & 95);
                  int var8 = Integer.parseInt(var10000[--3]) / (20 & 127);
                  if ((long)var6 != var1.getGameView().mapScene.b()) {
                     var1.getGameView().f("好像不是在这个场景吧");
                     return;
                  }

                  var18 = var1.getGameView().roleUnit.r;
                  long var9 = (long)(var18.getX() / (95 & 52));
                  long var11 = (long)(var18.getY() / (127 & 20));
                  var7 = (int)((long)var7 - var9);
                  var8 = (int)((long)var8 - var11);
                  var7 = Math.abs(var7);
                  var8 = Math.abs(var8);
                  if (var7 > --4 || var8 > --4) {
                     var1.getGameView().f("坐标不对");
                     return;
                  }
               }
            }

            var0.ab(var13);
            var5 = Agreement.getSendTextAES("user", var0.getRgid().toString());
            var1.getGameView().getClient().d(var5);
         }
      } else {
         long[] var4;
         if ((var4 = cX.a(var0.getValue()))[2 & 5] != 0L && var1.getLoginResult().getGold().longValue() + var4[3 >> 2] > W.f.longValue()) {
            var1.getGameView().fw("金钱上限99.99亿");
         } else {
            var0.ab(3 & 5);
            var5 = Agreement.getSendTextAES("user", var0.getRgid().toString());
            var1.getGameView().getClient().d(var5);
         }
      }
   }

   public static void p(Goodstable var0, boolean var1, RoleData var2) throws Exception {
      long var3 = var0.getType();
      if (var1 && (var2.getGameView().getClient().n(5 >> 1, 108 & 31) || var3 == 132L) && (var3 == 88L || var3 == 112L || var3 == 118L || var3 == 151L || var3 == 2041L || var3 == 132L || GoodType.ae(var3) || GoodType.t(var3) || var3 == 814L)) {
         ((mw)var2.getGameView().getFormManagement().e(17395 & 15534)).arc(3 & 4, (BigDecimal)null, var0);
      } else {
         Goodstable var10000;
         int var5;
         if ((var5 = GoodType.ai(var3)) != -4 >> 2) {
            var10000 = var0;
            HandleEquip.b(var2, var5, var0);
         } else {
            label288: {
               if (var3 == 0L) {
                  var5 = var0.getUsetime();
                  f(var0, var2);
                  if (var5 != var0.getUsetime()) {
                     var10000 = var0;
                     ParamTool.g(var0, --1, var2.getGameView().getClient());
                     String var10 = Agreement.getSendTextAES("rolechange", "H" + var2.getLoginResult().getHp() + "=" + var2.getLoginResult().getMp());
                     var2.getGameView().getClient().d(var10);
                     var2.getRoleProperty().k();
                     var2.getGameView().abh((boolean)(3 >> 2), "战斗、站立、行走使用药品.mp3");
                     break label288;
                  }
               } else {
                  label270: {
                     if (var3 != 60001L && var3 != 60002L) {
                        if (var3 == 60005L && var2.getGameView().getClient().i()) {
                           var10000 = var0;
                           i(var0, var2);
                           break label288;
                        }

                        if (var3 == 2114L) {
                           var10000 = var0;
                           n(var0, var2);
                           break label288;
                        }

                        if (var3 == 2042L) {
                           var10000 = var0;
                           e(var0, var2);
                           break label288;
                        }

                        if (GoodType.au(var3)) {
                           var10000 = var0;
                           g(var0, var2);
                           break label288;
                        }

                        if (var3 == 188L) {
                           var10000 = var0;
                           HandleLingbao.c(var0, var2);
                           break label288;
                        }

                        if (var3 == 1688L) {
                           var10000 = var0;
                           var2.getGameView().aal(new ConfirmBean(93 & 115, var0.getRgid().toString(), "请输入你的新名称,修改成功后将扣除一张改名卡"));
                           break label288;
                        }

                        if (var3 == 300L) {
                           var10000 = var0;
                           var2.getGameView().aal(new ConfirmBean(115 & 94, var0.getRgid().toString(), "请输入你要想要的修正#r编号  男人-1,女人-2,男魔-3,女魔-4,男仙-5,女仙-6,男鬼-7,女鬼-8,男龙-9,女龙-10#r输入格式如:1-2-3即一世男人 二世女人 三世男魔"));
                           break label288;
                        }

                        if (var3 == 121L) {
                           var10000 = var0;
                           var2.getGameView().aal(new ConfirmBean(87 & 124, var0.getRgid().toString(), "输入玩家的角色ID解除对应的被禁言玩家#r不知道ID在客户端左上角查看"));
                           break label288;
                        }

                        if (var3 == 122L) {
                           var10000 = var0;
                           var2.getGameView().aal(new ConfirmBean(119 & 93, var0.getRgid().toString(), "输入玩家的账号解除对应的被封号玩家"));
                           break label288;
                        }

                        if (var3 == 213L) {
                           var10000 = var0;
                           h(var0, var2);
                           break label288;
                        }

                        jJ var10001;
                        if (var3 == 132L) {
                           var10001 = (jJ)var2.getGameView().getFormManagement().e(59 & 95);
                           var10000 = var0;
                           var10001.ew(var0, 4 ^ 5);
                           break label288;
                        }

                        if ((var3 < 50L || var3 > 61L) && var3 != 133L && var3 != 134L && var3 != 139L) {
                           if (var3 == 1003L) {
                              var10000 = var0;
                              r(var0, var2);
                              break label288;
                           }

                           if (var3 == 729L) {
                              var10000 = var0;
                              HandlePet.e(var0, var2);
                              break label288;
                           }

                           if (var3 == 889L) {
                              String var9 = Agreement.getSendTextAES("getfivemsg", "G");
                              var2.getGameView().getClient().d(var9);
                              return;
                           }

                           if (var3 == 559L) {
                              ((cP)var2.getGameView().getFormManagement().e(119 & 126)).ax(var0);
                              return;
                           }

                           if (var3 == 560L) {
                              if ((var5 = var0.getValue().indexOf("=")) == -4 >> 2) {
                                 return;
                              }

                              int var6;
                              String var7;
                              if ((var6 = Integer.parseInt(var0.getValue().substring(var5 + --1))) <= (100 & 127)) {
                                 var7 = Agreement.getSendTextAES("getfivemsg", "DD" + var6);
                                 var2.getGameView().getClient().d(var7);
                                 return;
                              }

                              if (var6 <= (14335 & 19432)) {
                                 var7 = Agreement.getSendTextAES("getfivemsg", "RR" + var6);
                                 var2.getGameView().getClient().d(var7);
                                 return;
                              }

                              if (var6 > (6136 & 28631)) {
                                 var7 = Agreement.getSendTextAES("getfivemsg", "VV" + var6);
                                 var2.getGameView().getClient().d(var7);
                              }

                              return;
                           }

                           if (var3 == 60003L) {
                              kd var8 = (kd)var2.getGameView().getFormManagement().e(87 & 127);
                              var8.y(Integer.parseInt(var0.getValue()));
                              var2.getGameView().getFormManagement().a(119 & 95);
                              return;
                           }

                           if (var3 == 506L) {
                              break label270;
                           }

                           if (var3 == 190L || var3 == 891L || var3 == 1002L) {
                              var10000 = var0;
                              HandleLingbao.b(var0, var1, var2);
                              break label288;
                           }

                           if (var3 == 520L) {
                              var10000 = var0;
                              var2.getGameView().aal(new ConfirmBean(5 >> 1, var0.getRgid().toString(), "真的要放入地煞星录吗?"));
                              break label288;
                           }

                           if (GoodType.v(var3)) {
                              var10000 = var0;
                              HandleBabyAndPal.c(var0, var2);
                              break label288;
                           }

                           if (var3 == 717L && var2.getChoseMount() != null) {
                              var10000 = var0;
                              HandleMount.c(var0, var2);
                              break label288;
                           }

                           if (var3 == 721L && var2.getChoseMount() == null && var2.getGameView().getClient().gameMount) {
                              var10001 = (jJ)var2.getGameView().getFormManagement().e(27 & 127);
                              var10000 = var0;
                              var10001.ax(var0);
                              break label288;
                           }

                           if (var3 != 718L && var3 != 719L && var3 != 720L && var3 != 721L && var3 != 724L && var3 != 801L && var3 != 802L && var3 != 103L) {
                              if (var3 == 136L || var3 == 137L || var3 == 138L) {
                                 if (!var2.getGameView().getClient().gameBaby) {
                                    return;
                                 } else if (var3 == 137L) {
                                    var2.getGameView().getFormManagement().a(25767 & 7165);
                                    return;
                                 } else {
                                    ((lD)var2.getGameView().getFormManagement().e(16358 & 16575)).as(var3 == 136L ? 3 & 5 : 0);
                                    return;
                                 }
                              }

                              if (var3 == 811L) {
                                 ((lt)var2.getGameView().getFormManagement().e(188)).av(var0);
                                 return;
                              }

                              if (var3 == 814L) {
                                 d(var0, var2, 5 >> 2);
                                 var10000 = var0;
                                 break label288;
                              }

                              o(var0, var2);
                              break label270;
                           }

                           var10000 = var0;
                           HandleMount.c(var0, var2);
                           break label288;
                        }

                        var10000 = var0;
                        HandleBabyAndPal.e(var0, var1, var2);
                        break label288;
                     }

                     var10000 = var0;
                     c(var0, var2);
                     break label288;
                  }
               }

               var10000 = var0;
            }
         }

         if (var10000.getUsetime() <= 0) {
            var2.h(var0.getRgid());
         }

      }
   }

   public static int q(String var0) {
      String[] var4 = var0.split("=")[3 & 5].split("\\|");
      int var5 = (int)(Math.random() * 100.0D + 1.0D);
      int var3 = 3 >> 2;
      int var1 = 3 >> 2;

      int var2;
      for(int var10000 = var2 = 3 >> 2; var10000 < var4.length; var10000 = var2) {
         String var6 = var4[var2].split("\\&")[3 >> 2];
         String var7 = var4[var2].split("\\&")[3 & 5];
         if (var5 > var1 && var5 <= var1 + Integer.parseInt(var7)) {
            var3 = Integer.parseInt(var6);
         }

         ++var2;
         var1 += Integer.parseInt(var7);
      }

      return var3;
   }

   public static void r(Goodstable var0, RoleData var1) {
      Task var2 = null;
      int[] var4 = b(var0.getValue());
      int var3;
      int var10000 = var3 = 2 & 5;

      String var5;
      Task var6;
      while(true) {
         if (var10000 >= var4.length) {
            var6 = var2;
            break;
         }

         if ((var2 = var1.getTaskSystem().getTaskId(var4[var3])) != null) {
            var5 = Agreement.getSendTextAES("taskN", "E" + var2.getTaskId());
            var6 = var2;
            var1.getGameView().getClient().d(var5);
            var0.ab(3 >> 1);
            ParamTool.g(var0, 4 ^ 5, var1.getGameView().getClient());
            break;
         }

         ++var3;
         var10000 = var3;
      }

      if (var6 == null) {
         var3 = q(var0.getValue());
         var5 = Agreement.getSendTextAES("taskN", "L" + var3);
         var1.getGameView().getClient().d(var5);
      }

   }
}
