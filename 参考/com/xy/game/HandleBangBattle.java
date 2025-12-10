package com.xy.game;

import com.xy.cz;
import com.xy.fa;
import com.xy.jJ;
import com.xy.mw;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.readbean.Door;
import com.xy.scene.BangFightScene;
import com.xy.socket.Agreement;
import java.math.BigDecimal;

public class HandleBangBattle {
   public static String a(String var0, jJ var1) {
      if (var0.equals("驯养参战召唤兽亲密")) {
         BigDecimal var3;
         if ((var3 = var1.vd().getLoginResult().getSummoning_id()) == null) {
            var1.aej.f("您并没有携带召唤兽!!!");
            return null;
         } else {
            return "44|" + var3;
         }
      } else {
         Mount var2;
         if ((var2 = var1.vd().getMount(var1.aej.roleUnit.r.getMount_id())) == null) {
            var1.aej.f("你当前未骑坐骑");
            return null;
         } else {
            return (var0.equals("驯养坐骑经验") ? "45|" : "46|") + var2.getMid();
         }
      }
   }

   public static void b(String var0, jJ var1) {
      RoleData var2 = var1.vd();
      if (var0.equals("批量驯养参战召唤兽亲密")) {
         BigDecimal var5;
         if ((var5 = var2.getLoginResult().getSummoning_id()) == null) {
            var1.aej.f("您并没有携带召唤兽!!!");
         } else {
            ((mw)var1.ve().e(17582 & 15347)).eb(var5, var0);
         }
      } else if (!var0.equals("批量驯养坐骑经验") && !var0.equals("批量驯养坐骑技能熟练度")) {
         Lingbao var4;
         if (!var0.equals("批量驯养灵宝契合") && !var0.equals("批量驯养灵宝经验")) {
            if (var0.equals("批量驯养首个参战法宝经验")) {
               var4 = var2.lingbaoChoses[--1] != null ? var2.getLingbao(var2.lingbaoChoses[3 >> 1]) : null;
               if (var4 == null) {
                  var1.aej.f("您并没有携带法宝!!!(最左边参战的法宝)");
                  return;
               }

               ((mw)var1.ve().e(4526 & 28403)).eb(var4.getBaoid(), var0);
            }

         } else {
            var4 = var2.lingbaoChoses[2 & 5] != null ? var2.getLingbao(var2.lingbaoChoses[2 & 5]) : null;
            if (var4 == null) {
               var1.aej.f("您并没有携带灵宝!!!");
            } else {
               ((mw)var1.ve().e(10731 & 22198)).eb(var4.getBaoid(), var0);
            }
         }
      } else {
         Mount var3;
         if ((var3 = var2.getMount(var1.aej.roleUnit.r.getMount_id())) == null) {
            var1.aej.f("你当前未骑坐骑");
         } else {
            ((mw)var1.ve().e(25254 & 7675)).eb(var3.getMid(), var0);
         }
      }
   }

   public static void c(String var0, jJ var1) {
      label535: {
         String var10000;
         String var2;
         label696: {
            label697: {
               label698: {
                  label472: {
                     label471: {
                        var2 = null;
                        switch(var0.hashCode()) {
                        case -2098057065:
                           while(false) {
                           }

                           if (!var0.equals("驯养参战召唤兽亲密")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label472;
                        case -1983188943:
                           var10000 = !var0.equals("我要参观上古战场的风采") ? var2 : (var2 = "36");
                           break label696;
                        case -1903313279:
                           var10000 = !var0.equals("自动参加水陆大会") ? var2 : (var2 = "-39");
                           break label696;
                        case -1880254751:
                           if (var0.equals("批量驯养参战召唤兽亲密")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case -1545100141:
                           var10000 = !var0.equals("我要参加水陆大会") ? var2 : (var2 = "39");
                           break label696;
                        case -1510558556:
                           if (!var0.equals("我要攻击塔")) {
                              var10000 = var2;
                              break label696;
                           }
                           break;
                        case -1510150040:
                           var10000 = !var0.equals("我要进行九生九死挑战") ? var2 : (var2 = "31");
                           break label696;
                        case -1471622272:
                           if (var0.equals("批量驯养坐骑经验")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case -1429993029:
                           var10000 = !var0.equals("取消种族赛匹配") ? var2 : (var2 = "24");
                           break label696;
                        case -1299354086:
                           var10000 = !var0.equals("我要参加跨服联赛") ? var2 : (var2 = "33");
                           break label696;
                        case -1295660671:
                           if (var0.equals("批量驯养灵宝契合")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case -1295345081:
                           if (var0.equals("批量驯养灵宝经验")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case -1240673340:
                           var10000 = !var0.equals("我来报名参加帮战") ? var2 : (var2 = "0");
                           break label696;
                        case -1163769974:
                           var10000 = !var0.equals("一键领取擂台赛奖励") ? var2 : (var2 = "30");
                           break label696;
                        case -1017069617:
                           var10000 = !var0.equals("参加擂台赛") ? var2 : (var2 = "29");
                           break label696;
                        case -1011750885:
                           if (!var0.equals("参加种族赛")) {
                              var10000 = var2;
                           } else {
                              var1.aej.getFormManagement().n(127 & 41);
                              var10000 = var2 = "21";
                           }
                           break label696;
                        case -903464138:
                           var10000 = !var0.equals("领取大乱斗吃鸡奖励") ? var2 : (var2 = "51");
                           break label696;
                        case -854478984:
                           if (!var0.equals("驯养坐骑技能熟练度")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label472;
                        case -636676670:
                           if (var0.equals("批量驯养坐骑技能熟练度")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case -515006494:
                           var10000 = !var0.equals("我要领取守卫蟠桃园奖励") ? var2 : (var2 = "13");
                           break label696;
                        case -480452485:
                           var10000 = !var0.equals("挑战四层守护者") ? var2 : (var2 = "20");
                           break label696;
                        case -456546579:
                           var10000 = !var0.equals("种族赛匹配") ? var2 : (var2 = "23");
                           break label696;
                        case -347435818:
                           var10000 = !var0.equals("一键领取种族赛奖励") ? var2 : (var2 = "22");
                           break label696;
                        case -272784922:
                           var10000 = !var0.equals("开启桃源仙境") ? var2 : (var2 = "32");
                           break label696;
                        case -32800764:
                           var10000 = !var0.equals("送我回后方营地") ? var2 : (var2 = "37");
                           break label696;
                        case 61304272:
                           var10000 = !var0.equals("领取水陆大会奖励") ? var2 : (var2 = "40");
                           break label696;
                        case 97807589:
                           var10000 = !var0.equals("我要领取帮战奖励") ? var2 : (var2 = "52");
                           break label696;
                        case 167679452:
                           if (var0.equals("我要去守卫蟠桃园")) {
                              Door var10 = new Door();
                              int var10001 = 1 ^ 3;
                              var10.setDoormap("3324");
                              var10.setDoorpoint("1800|600");
                              HandleOption.ac(var10, var10001, var1.aej);
                              return;
                           }

                           var10000 = var2;
                           break label696;
                        case 176741946:
                           if (!var0.equals("我来上交地煞星之魂")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label697;
                        case 221998399:
                           var10000 = !var0.equals("我要参加大乱斗") ? var2 : (var2 = "50");
                           break label696;
                        case 261804443:
                           var10000 = !var0.equals("领取强法加成") ? var2 : (var2 = "42");
                           break label696;
                        case 284299992:
                           var10000 = !var0.equals("我要参加帮战") ? var2 : (var2 = "1");
                           break label696;
                        case 284335088:
                           var10000 = !var0.equals("领取抗性加成") ? var2 : (var2 = "43");
                           break label696;
                        case 291541200:
                           var10000 = !var0.equals("我要取消战书") ? var2 : (var2 = "27|" + var1.lj());
                           break label696;
                        case 291553961:
                           var10000 = !var0.equals("我要取消挑战") ? var2 : (var2 = "7");
                           break label696;
                        case 291562929:
                           if (!var0.equals("我要取消操作")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label471;
                        case 392314842:
                           var10000 = !var0.equals("升级驯养师等级") ? var2 : (var2 = "49");
                           break label696;
                        case 409671658:
                           if (!var0.equals("我要掐断炮火")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label698;
                        case 410058447:
                           var10000 = !var0.equals("我要接收战书") ? var2 : (var2 = "26|" + var1.lj());
                           break label696;
                        case 513911261:
                           var10000 = !var0.equals("领取经验加成") ? var2 : (var2 = "41");
                           break label696;
                        case 549924953:
                           var10000 = !var0.equals("进入宝库三层") ? var2 : (var2 = "15");
                           break label696;
                        case 549929014:
                           var10000 = !var0.equals("进入宝库二层") ? var2 : (var2 = "14");
                           break label696;
                        case 549994951:
                           var10000 = !var0.equals("进入宝库四层") ? var2 : (var2 = "16");
                           break label696;
                        case 614233027:
                           if (!var0.equals("我要给塔充能")) {
                              var10000 = var2;
                              break label696;
                           }

                           if (var2 == null) {
                              var2 = "9|";
                           }
                           break;
                        case 640419684:
                           var10000 = !var0.equals("我要脱离帮战") ? var2 : (var2 = "2");
                           break label696;
                        case 683782717:
                           var10000 = !var0.equals("回到营地") ? var2 : (var2 = "5");
                           break label696;
                        case 742360092:
                           var10000 = !var0.equals("我要进入战场") ? var2 : (var2 = "4");
                           break label696;
                        case 770934154:
                           if (!var0.equals("驯养坐骑经验")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label472;
                        case 782506900:
                           var10000 = !var0.equals("我要应战") ? var2 : (var2 = "8");
                           break label696;
                        case 782542519:
                           var10000 = !var0.equals("我要挑战") ? var2 : (var2 = "6");
                           break label696;
                        case 782849574:
                           var10000 = !var0.equals("我要观战") ? var2 : (var2 = "28|" + var1.lj());
                           break label696;
                        case 1036984732:
                           if (!var0.equals("我来上交上古宝箱")) {
                              var10000 = var2;
                              break label696;
                           }
                           break label697;
                        case 1084211598:
                           var10000 = !var0.equals("升级帮派等级") ? var2 : (var2 = "47");
                           break label696;
                        case 1292340173:
                           var10000 = !var0.equals("升级科技等级") ? var2 : (var2 = "48");
                           break label696;
                        case 1504489351:
                           var10000 = !var0.equals("我要进入高手挑战赛") ? var2 : (var2 = "3");
                           break label696;
                        case 1550181585:
                           if (var0.equals("批量驯养首个参战法宝经验")) {
                              break label535;
                           }

                           var10000 = var2;
                           break label696;
                        case 1584176812:
                           var10000 = !var0.equals("我要回到500年前") ? var2 : (var2 = "34");
                           break label696;
                        case 1720892704:
                           var10000 = !var0.equals("挑战一层守护者") ? var2 : (var2 = "17");
                           break label696;
                        case 1729204393:
                           var10000 = !var0.equals("挑战三层守护者") ? var2 : (var2 = "19");
                           break label696;
                        case 1850185644:
                           var10000 = !var0.equals("挑战二层守护者") ? var2 : (var2 = "18");
                           break label696;
                        case 2102895615:
                           var10000 = !var0.equals("领取大闹天宫奖励") ? var2 : (var2 = "38");
                           break label696;
                        default:
                           var10000 = var2;
                           break label696;
                        }

                        if (var2 == null) {
                           var2 = "10|";
                        }
                     }

                     if (var2 == null) {
                        var2 = "11|";
                     }
                     break label698;
                  }

                  var10000 = var2 = a(var0, var1);
                  break label696;
               }

               if (var2 == null) {
                  var2 = "12|";
               }

               if (var1.aej.scene == null || !(var1.aej.scene instanceof BangFightScene)) {
                  return;
               }

               BangFightScene var4;
               if ((var4 = (BangFightScene)var1.aej.scene).buildMouse == null) {
                  return;
               }

               var10000 = var2 = var2 + var4.buildMouse.getBh();
               break label696;
            }

            fa var3;
            if ((var3 = var1.ls()) == null || !(var3 instanceof cz)) {
               return;
            }

            cz var5 = (cz)var3;
            long var6 = (long)(var3.ab - var1.aej.roleUnit.ab);
            long var8 = (long)(var3.al - var1.aej.roleUnit.al);
            if (Math.abs(var6) >= 200L || Math.abs(var8) >= 200L) {
               var1.aej.f("你离NPC太远了");
               return;
            }

            var10000 = var2 = "35|" + var5.bb.getNpctype();
         }

         if (var10000 == null) {
            return;
         }

         String var11 = Agreement.getSendTextAES("gangbattle", var2);
         var1.uw().d(var11);
         return;
      }

      b(var0, var1);
   }
}
