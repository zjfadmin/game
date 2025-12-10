package com.xy.game;

import com.xy.cX;
import com.xy.hd;
import com.xy.jJ;
import com.xy.ll;
import com.xy.mw;
import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.formula.PetProperty;
import com.xy.readbean.ColorScheme;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.math.BigDecimal;

public class HandlePet {
   public static int getIDSKIN(int var0) {
      switch(var0) {
      case 506:
         while(false) {
         }

         return 500012;
      case 508:
         return 400318;
      case 512:
         return 500104;
      case 200009:
         return 400051;
      case 200055:
         return 400024;
      case 200061:
         return 400077;
      case 200065:
         return 400079;
      case 200076:
         return 400078;
      case 200077:
         return 400088;
      case 200085:
         return 400095;
      case 200087:
         return 400092;
      case 200090:
         return 400091;
      case 200092:
         return 400102;
      case 200093:
         return 400103;
      case 200095:
         return 400105;
      case 200124:
         return 400135;
      case 200126:
         return 400142;
      case 200127:
         return 400145;
      case 200132:
         return 400148;
      case 200134:
         return 400151;
      case 200135:
         return 400138;
      case 200138:
         return 400140;
      case 200141:
         return 400181;
      case 200147:
         return 400316;
      case 200148:
         return 400150;
      case 200149:
         return 400134;
      case 200154:
         return 400311;
      case 200155:
         return 400304;
      case 200156:
         return 400147;
      case 200158:
         return 400506;
      case 200182:
         return 400509;
      case 200183:
         return 400558;
      case 200184:
         return 400575;
      case 200185:
         return 400556;
      default:
         return -1;
      }
   }

   public static void a(RoleSummoning var0, Goodstable var1, boolean var2, RoleData var3) {
      long var4 = var1.getType();
      if (var2 && var3.getGameView().getClient().n(--2, 110 & 29) && (var4 == 715L || var4 == 1005L || var4 == 2040L || var4 == 2323L)) {
         ((mw)var3.getGameView().getFormManagement().e(27111 & 5818)).arc(3 & 5, var0.getSid(), var1);
      } else {
         Goodstable var10000;
         label50: {
            if (var4 == 0L) {
               int var6 = var1.getUsetime();
               j(var0, var1, var3);
               if (var6 != var1.getUsetime()) {
                  var10000 = var1;
                  ParamTool.g(var1, 5 >> 2, var3.getGameView().getClient());
                  ParamTool.h(var0, var3.getGameView().getClient());
                  var3.getRoleProperty().m(var0);
                  var3.getGameView().abh((boolean)(3 & 4), "战斗、站立、行走使用药品.mp3");
                  break label50;
               }
            } else {
               if (var4 == 750L) {
                  var10000 = var1;
                  i(var0, var1, var3);
                  break label50;
               }

               if (var4 == 2115L) {
                  var10000 = var1;
                  g(var0, var1, var3);
                  break label50;
               }

               if (var4 == 729L || var4 == 510L || var4 == 511L || var4 == 512L) {
                  d(var0, var1, var3);
                  var10000 = var1;
                  break label50;
               }

               if (var4 == 117L) {
                  jJ var10001 = (jJ)var3.getGameView().getFormManagement().e(31 & 123);
                  var10000 = var1;
                  var10001.lf(var0, var1);
                  break label50;
               }

               h(var0, var1, var3);
            }

            var10000 = var1;
         }

         if (var10000.getUsetime() <= 0) {
            var3.h(var1.getRgid());
         }

      }
   }

   public static boolean b(RoleSummoning var0, int[] var1, int[] var2, RoleData var3) {
      double var4 = (double)var1[5 >> 3];
      double var8 = (double)var1[2 ^ 3];
      double var6 = (double)var0.getBasishp(var1[3 & 4]);
      double var10 = (double)var0.getBasismp(var1[--1]);
      if (!HandleGood.j(var2, var4, var6, var8, var10, var3)) {
         return (boolean)(2 & 5);
      } else {
         if (var2[3 >> 2] != 0 || var2[--2] != 0) {
            if ((var6 = var6 + (double)var2[3 ^ 3] + (double)var2[1 ^ 3] * var4 / 100.0D) > var4) {
               var6 = var4;
            }

            var0.setBasishp((int)var6);
         }

         if (var2[4 ^ 5] != 0 || var2[--3] != 0) {
            if ((var10 = var10 + (double)var2[5 >> 2] + (double)var2[--3] * var8 / 100.0D) > var8) {
               var10 = var8;
            }

            var0.setBasismp((int)var10);
         }

         return true;
      }
   }

   public static void c(RoleSummoning var0, Goodstable var1, int var2, RoleData var3) {
      String var4 = var0.getStye();
      BigDecimal var5 = null;
      RoleData var10000;
      if (var2 != -4 >> 2) {
         if (var3.getGoodPackSum(-1L, new BigDecimal(-4 >> 2), --1) == 0) {
            var3.getGameView().fw("你的背包已满");
            return;
         }

         var5 = var0.b((Goodstable)null, var2, var3.getGameView());
         var10000 = var3;
      } else {
         var2 = GoodType.getPetGoodType(var1.getType());
         var3.ac(var1.getRgid());
         var1.setStatus(3 >> 1);
         ParamTool.g(var1, 5 >> 3, var3.getGameView().getClient());
         var5 = var0.b(var1, var2, var3.getGameView());
         var10000 = var3;
      }

      if ((var1 = var10000.getGoodEquip(var5)) != null) {
         int var10003 = 3 >> 2;
         var1.setStatus(3 >> 2);
         ParamTool.g(var1, var10003, var3.getGameView().getClient());
         var3.i(var1);
      }

      int[] var6;
      var0.setBasishp((var6 = PetProperty.getPetHMASp(var0, var3))[3 & 4]);
      var0.setBasismp(var6[5 >> 2]);
      if (!var4.equals(var0.getStye())) {
         ParamTool.h(var0, var3.getGameView().getClient());
      }

      var3.getRoleProperty().m(var0);
   }

   public static void getChangeCJS(Goodstable var0, String var1, RoleData var2) {
      if (var0.getGoodsname().equals("彩晶石")) {
         String[] var6 = var0.getValue().split("\\|");
         int var4 = 3 & 4;

         int var5;
         for(int var10000 = var5 = 5 >> 3; var10000 < var6.length; var10000 = var5) {
            String[] var3;
            if ((var3 = var6[var5].split("="))[3 & 4].equals("品质")) {
               var4 = Integer.parseInt(var3[4 ^ 5]);
            }

            ++var5;
         }

         if (var4 >= (18175 & 14842)) {
            var5 = getPetId(var1.substring(3 >> 2, var1.length() - (5 >> 1)));
            StringBuffer var7;
            (var7 = new StringBuffer()).append("召唤兽=");
            var7.append(var5);
            var7.append("|皮肤=");
            var7.append(getCJSID(var5));
            var7.append("|颜色=无|");
            var7.append(var0.getValue());
            int var10008 = --2;
            var0.setValue(var7.toString());
            var0.setGoodsname(var1);
            var0.setSkin("pets" + var5);
            ParamTool.g(var0, var10008, var2.getGameView().getClient());
            var0.setRgid(new BigDecimal(var0.getRgid().longValue()));
         }
      }
   }

   public static void d(RoleSummoning var0, Goodstable var1, RoleData var2) {
      String var3;
      if ((var3 = hd.d(var1.getValue(), "召唤兽=", "|")) != null && !var0.getSummoningid().equals(var3) && !f(Integer.parseInt(var0.getSummoningid()), var0.getSummoningskin(), Integer.parseInt(var3))) {
         var2.getGameView().f("召唤兽无法佩戴该召唤兽装备");
      } else {
         c(var0, var1, -4 >> 2, var2);
      }
   }

   public static void e(Goodstable var0, RoleData var1) {
      if (var0.getGoodsname().equals("彩晶石")) {
         if (hd.an(var0.getValue(), "品质=", "|") < (17663 & 15354)) {
            var1.getGameView().fw("品质超过250时可以转为指定召唤兽饰品");
         } else {
            ((jJ)var1.getGameView().getFormManagement().e(27 & 127)).lo(var0);
         }
      } else {
         if (hd.an(var0.getValue(), "品质=", "|") >= (28404 & 5563) && hd.d(var0.getValue(), "颜色=", "|").equals("无")) {
            ColorScheme var2;
            if ((var2 = var1.getObjectArea().s(3 & 4)) == null) {
               return;
            }

            hd.af(var0.getValue(), "颜色=", "|", "颜色=" + var2.getName());
            ParamTool.g(var0, --2, var1.getGameView().getClient());
         }

      }
   }

   public static int getSkillNum(int var0) {
      if (var0 <= (31 & 102)) {
         return var0;
      } else {
         return var0 - --1 > (74 & 61) ? 45 & 90 : var0 - (5 >> 2);
      }
   }

   public static boolean f(int var0, String var1, Integer var2) {
      if (var2 == 200055 && (var1.equals("400050") || var1.equals("400066") || var1.equals("400024") || var1.equals("400073") || var1.equals("400081"))) {
         return true;
      } else {
         if (var0 >= 200102 && var0 <= 200107 || var0 >= 200092 && var0 <= 200096 || var0 == 200076 || var0 == 200068 || var0 == 200060 || var0 == 200075 || var0 == 200065 || var0 == 200043) {
            if (var2 == 200095 && var1.equals("400105")) {
               return (boolean)(3 >> 1);
            }

            if (var2 == 200093 && var1.equals("400103")) {
               return (boolean)(3 & 5);
            }

            if (var2 == 200092 && var1.equals("400102")) {
               return (boolean)(5 >> 2);
            }

            if (var2 == 200065 && var1.equals("400079")) {
               return (boolean)(--1);
            }

            if (var2 == 200076 && var1.equals("400078")) {
               return (boolean)(4 ^ 5);
            }
         }

         return String.valueOf(getIDSKIN(var2)).equals(var1);
      }
   }

   public static int getPetId(String var0) {
      switch(var0.hashCode()) {
      case 670860:
         while(false) {
         }

         if (var0.equals("凤凰")) {
            return 200076;
         }
         break;
      case 686578:
         if (var0.equals("冥雷")) {
            return 200126;
         }
         break;
      case 862050:
         if (var0.equals("松鼠")) {
            return 200134;
         }
         break;
      case 938560:
         if (var0.equals("猪怪")) {
            return 200009;
         }
         break;
      case 946186:
         if (var0.equals("猴精")) {
            return 200077;
         }
         break;
      case 1011309:
         if (var0.equals("精卫")) {
            return 200147;
         }
         break;
      case 1151169:
         if (var0.equals("赭炎")) {
            return 200132;
         }
         break;
      case 1306099:
         if (var0.equals("龙马")) {
            return 200124;
         }
         break;
      case 20372551:
         if (var0.equals("俏娘子")) {
            return 200184;
         }
         break;
      case 20781099:
         if (var0.equals("冲冲虫")) {
            return 200061;
         }
         break;
      case 21269896:
         if (var0.equals("剑精灵")) {
            return 200093;
         }
         break;
      case 21333850:
         if (var0.equals("冰雪魔")) {
            return 200090;
         }
         break;
      case 21542489:
         if (var0.equals("哥俩好")) {
            return 200092;
         }
         break;
      case 21663904:
         if (var0.equals("吉祥果")) {
            return 200148;
         }
         break;
      case 23224291:
         if (var0.equals("天龙女")) {
            return 200149;
         }
         break;
      case 23225869:
         if (var0.equals("孙小圣")) {
            return 508;
         }
         break;
      case 25241553:
         if (var0.equals("拨浪鼓")) {
            return 200154;
         }
         break;
      case 26328304:
         if (var0.equals("木甲人")) {
            return 200185;
         }
         break;
      case 26541119:
         if (var0.equals("棕小仙")) {
            return 200182;
         }
         break;
      case 27766332:
         if (var0.equals("泥石怪")) {
            return 200087;
         }
         break;
      case 29361245:
         if (var0.equals("狮虎兽")) {
            return 200155;
         }
         break;
      case 30440673:
         if (var0.equals("白龙帝")) {
            return 512;
         }
         break;
      case 36518022:
         if (var0.equals("金不换")) {
            return 200156;
         }
         break;
      case 40236944:
         if (var0.equals("黄金兽")) {
            return 200085;
         }
         break;
      case 651061661:
         if (var0.equals("冥灵妃子")) {
            return 200135;
         }
         break;
      case 721976815:
         if (var0.equals("妙音鸾女")) {
            return 200158;
         }
         break;
      case 734439977:
         if (var0.equals("孔雀明王")) {
            return 200141;
         }
         break;
      case 923993163:
         if (var0.equals("画皮娘子")) {
            return 200138;
         }
         break;
      case 947804019:
         if (var0.equals("碧水精魄")) {
            return 200183;
         }
         break;
      case 960729675:
         if (var0.equals("符咒女娲")) {
            return 200055;
         }
         break;
      case 992639858:
         if (var0.equals("罗刹鬼姬")) {
            return 200095;
         }
         break;
      case 1067007385:
         if (var0.equals("蝴蝶仙子")) {
            return 200065;
         }
         break;
      case 1070943615:
         if (var0.equals("西域响马")) {
            return 200127;
         }
         break;
      case 1448910114:
         if (var0.equals("瀚威猫将的")) {
            return 506;
         }
      }

      return -1;
   }

   public static void g(RoleSummoning var0, Goodstable var1, RoleData var2) {
      int var3;
      var0.setBone(var3 = cX.p(var0.getGrade()));
      var0.setSpir(var3);
      var0.setPower(var3);
      var0.setSpeed(var3);
      if (var0.getTurnRount() >= --4) {
         var0.setCalm(var3);
      }

      var2.getGameView().f("你的使用了" + var1.getGoodsname());
      var1.ab(4 ^ 5);
      ParamTool.g(var1, 3 & 5, var2.getGameView().getClient());
      ParamTool.h(var0, var2.getGameView().getClient());
      var2.getRoleProperty().m(var0);
   }

   public static int getCJSID(int var0) {
      switch(var0) {
      case 506:
         while(false) {
         }

         return 500013;
      case 508:
         return 400319;
      case 512:
         return 500105;
      case 200009:
         return 400537;
      case 200055:
         return 400536;
      case 200061:
         return 400538;
      case 200065:
         return 400540;
      case 200076:
         return 400539;
      case 200077:
         return 400549;
      case 200085:
         return 400543;
      case 200087:
         return 400542;
      case 200090:
         return 400541;
      case 200092:
         return 400526;
      case 200093:
         return 400544;
      case 200095:
         return 400527;
      case 200124:
         return 400528;
      case 200126:
         return 400529;
      case 200127:
         return 400530;
      case 200132:
         return 400547;
      case 200134:
         return 400532;
      case 200135:
         return 400545;
      case 200138:
         return 400546;
      case 200141:
         return 400548;
      case 200147:
         return 400534;
      case 200148:
         return 400551;
      case 200149:
         return 400550;
      case 200154:
         return 400533;
      case 200155:
         return 400552;
      case 200156:
         return 400531;
      case 200158:
         return 400553;
      case 200182:
         return 400535;
      case 200183:
         return 400559;
      case 200184:
         return 400576;
      case 200185:
         return 400557;
      default:
         return -1;
      }
   }

   public static void h(RoleSummoning var0, Goodstable var1, RoleData var2) {
      long var3;
      String var5;
      if ((var3 = var1.getType()) == 715L) {
         if (var0.getFriendliness() >= 20000000L) {
            var2.getGameView().f("该召唤兽的亲密值已满！");
            return;
         }
      } else {
         int var6;
         if (var3 != 503L && var3 != 2326L) {
            int var9;
            if (var3 == 504L) {
               var9 = !var0.getSsn().equals("2") && !var0.getSsn().equals("3") && !var0.getSsn().equals("4") ? 9 : 9;
               if (var0.getOpenSealByType(3 >> 2) >= var9) {
                  var2.getGameView().f("这只召唤兽的技能格子都已解开！");
                  return;
               }
            } else if (var3 != 2040L) {
               if (var3 == 2043L) {
                  if (var0.getGrade() > (111 & 116)) {
                     var2.getGameView().f("该召唤兽等级过高！");
                     return;
                  }
               } else if (var3 == 2113L) {
                  var9 = var2.getGameView().getClient().gameType == --2 ? --5 : 3;
                  if (var0.getDragon() >= var9) {
                     var2.getGameView().f("龙骨数量已达到上限！");
                     return;
                  }
               } else if (var3 == 716L) {
                  if ((var5 = var1.getValue()) == null || var5.equals("")) {
                     var5 = "100|0";
                  }

                  String[] var10;
                  if (!(var10 = var5.split("\\|"))[3 & 5].equals("0") && !var10[--1].equals(var0.getSummoningid())) {
                     var2.getGameView().f("召唤兽无法使用该类型的元气丹");
                     return;
                  }

                  if (var1.getGoodsname().indexOf("元气") == -4 >> 2 && var0.getSsn().equals("6")) {
                     var2.getGameView().f("不能吃变色丹");
                     return;
                  }
               } else if (var3 == 192L) {
                  if (!var0.getSsn().equals("5") && !var0.getSummoningid().equals("200125")) {
                     var2.getGameView().f("不是龙涎丸宝宝");
                     return;
                  }

                  if ((var9 = var0.getDraC()) >= (79 & 57)) {
                     var2.getGameView().f("已经达到最大使用次数");
                     return;
                  }

                  var6 = 0;
                  int var10000;
                  if (var0.getGrade() >= (29687 & 3513)) {
                     var6 = 109 & 27;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (3070 & 30059)) {
                     var6 = 77 & 58;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (30714 & 2375)) {
                     var6 = 15 & 119;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (10514 & 22525)) {
                     var6 = 102 & 31;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (19709 & 13279)) {
                     var6 = --5;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (28863 & 4095)) {
                     var6 = --4;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (31167 & 1751)) {
                     var6 = --3;
                     var10000 = var9;
                  } else if (var0.getGrade() >= (123 & 94)) {
                     var6 = 1 ^ 3;
                     var10000 = var9;
                  } else {
                     if (var0.getGrade() >= (126 & 51)) {
                        var6 = 3 & 5;
                     }

                     var10000 = var9;
                  }

                  if (var10000 >= var6) {
                     String var7 = "召唤兽当前等级最多使用" + var6 + "个";
                     var2.getGameView().f(var7);
                     return;
                  }
               } else if (var3 == 667L) {
                  if (var0.getDragon() <= 0) {
                     var2.getGameView().fw("召唤兽没有服用过龙骨！！");
                     return;
                  }
               } else if (var3 == 2323L) {
                  if (var0.getPetSkills().indexOf("3034") == -4 >> 2) {
                     var2.getGameView().f("该召唤兽没有???");
                     return;
                  }
               } else {
                  if (var3 == 2325L) {
                     if (var0.getTurnRount() < --3) {
                        var2.getGameView().f("该召唤兽未3转！");
                        return;
                     }

                     if (var0.getPetSkills() != null && !var0.getPetSkills().equals("")) {
                        if (var0.getGoods() != null) {
                           var2.getGameView().f("该召唤兽携带着装备或内丹");
                           return;
                        }

                        if (var2.getPetMount(var0.getSid()) != null) {
                           var2.getGameView().f("这只召唤兽被管制中！！！");
                           return;
                        }

                        if (var2.getLoginResult().getSummoning_id() != null && var2.getLoginResult().getSummoning_id().compareTo(var0.getSid()) == 0) {
                           var2.getGameView().f("这只召唤兽已在参战中！！！");
                           return;
                        }

                        var2.getGameView().aal(new ConfirmBean(31, var1.getRgid().toString() + "|" + var0.getSid(), "你是否将召唤兽#R" + var0.getSummoningname() + "#W进行提炼?"));
                        return;
                     }

                     var2.getGameView().f("召唤兽没有技能");
                     return;
                  }

                  if (var3 == 727L) {
                     if ((var9 = Integer.parseInt(var0.getSummoningid())) != 200123 && var9 != 200116 && var9 != 200117 && var9 != 200097 && var9 != 200098 && var9 != 200099 && var9 != 200100 && var9 != 200101) {
                        String var11 = "白泽 年 画中仙 颜如玉 垂云叟 五叶 范式之魂才能使用化形丹";
                        var2.getGameView().f(var11);
                        return;
                     }
                  } else if (var3 == 2116L) {
                     if (!var0.getSsn().equals("2")) {
                        var2.getGameView().f("这只召唤兽不能使用神兽飞升丹!!!");
                        return;
                     }

                     if (var0.getFlyupNum() >= --3) {
                        var2.getGameView().f("神兽 " + var0.getSummoningname() + "的飞升次数已达到上限！");
                        return;
                     }
                  } else if (var3 != 1005L && var3 != 116L && var3 != 114L && var3 != 130L && var3 != 131L) {
                     return;
                  }
               }
            }
         } else {
            if (var3 == 2326L && var2.getGameView().getClient().gamePetSkill) {
               ((ll)var2.getGameView().getFormManagement().e(3839 & 29091)).zo(var1, var0);
               return;
            }

            var5 = var0.getPetSkills();
            if ((var6 = var0.getOpenSealByType(5 >> 3)) > 0 && var5 != null && !var5.equals("")) {
               int var8 = var5.split("\\|").length;
               if (var5.indexOf("L") != -4 >> 2) {
                  --var8;
               }

               if (var5.indexOf("Q") != -4 >> 2) {
                  --var8;
               }

               if (var5.indexOf("X") != -4 >> 2) {
                  --var8;
               }

               if (var5.indexOf("T") != -4 >> 2) {
                  --var8;
               }

               if (getSkillNum(var6) <= var8) {
                  var2.getGameView().f("召唤兽技能格子已经满了");
                  return;
               }
            }
         }
      }

      var5 = Agreement.getSendTextAES("userpet", var1.getRgid().toString() + "|" + var0.getSid());
      var2.getGameView().getClient().d(var5);
   }

   public static void i(RoleSummoning var0, Goodstable var1, RoleData var2) {
      String[] var3 = var1.getValue().split("\\|")[1 ^ 3].split("=")[--1].split("转");
      int var7 = Integer.parseInt(var3[3 ^ 3]);
      int var4 = Integer.parseInt(var3[2 ^ 3]);
      int var5 = var0.getTurnRount();
      int var6 = cX.p(var0.getGrade());
      if (var5 >= var7 && (var5 != var7 || var6 >= var4)) {
         var3 = null;
         if (var0.getInnerGoods() != null && !var0.getInnerGoods().equals("")) {
            var3 = var0.getInnerGoods().split("\\|");
         }

         StringBuffer var8 = new StringBuffer();
         if (var3 != null) {
            if (var3.length >= --3) {
               var2.getGameView().f("该召唤兽的内丹已超过上限！");
               return;
            }

            if (var5 == 0 && var3.length >= (2 ^ 3)) {
               var2.getGameView().f("未转召唤兽只可以使用1个内丹");
               return;
            }

            if (var5 == --1 && var3.length >= --2) {
               var2.getGameView().f("1转召唤兽只可以使用2个内丹");
               return;
            }

            for(int var10000 = var5 = 0; var10000 < var3.length; var10000 = var5) {
               Goodstable var9;
               if ((var9 = var2.getGoodEquip(new BigDecimal(var3[var5]))) != null) {
                  if (var9.getGoodsname().equals(var1.getGoodsname())) {
                     var2.getGameView().fw("你已有这种类型的内丹了！");
                     return;
                  }

                  if (var8.length() != 0) {
                     var8.append("|");
                  }

                  var8.append(var3[var5]);
               }

               ++var5;
            }
         }

         if (var8.length() != 0) {
            var8.append("|");
         }

         var8.append(var1.getRgid());
         var0.setInnerGoods(var8.toString());
         var2.ac(var1.getRgid());
         var1.setStatus(5 >> 2);
         ParamTool.g(var1, 3 & 4, var2.getGameView().getClient());
         ParamTool.h(var0, var2.getGameView().getClient());
         var2.getGameView().fw("你获得了内丹技能 " + var1.getGoodsname());
         var2.getRoleProperty().m(var0);
      } else {
         var2.getGameView().f("您的召唤兽等级低于内丹等级！！！");
      }
   }

   public static void j(RoleSummoning var0, Goodstable var1, RoleData var2) {
      int[] var3 = cX.s(var1.getValue());
      if (b(var0, PetProperty.getPetHMASp(var0, var2), var3, var2)) {
         var1.ab(5 >> 2);
      }
   }
}
