package com.xy.c;

import com.xy.a.Class48;
import com.xy.battle.BattleConnection;
import com.xy.battle.BattlePlay;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleVideo;
import com.xy.battle.FightingRound;
import com.xy.bean.BattleEnd;
import com.xy.bean.PathPoint;
import com.xy.bean.UseCardBean;
import com.xy.formula.BaseQl;
import com.xy.formula.Ql;
import com.xy.richtext.ChatBox;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class15 implements ServerAction {
   public void ar(String var1, int var2, int var3, GameView var4) {
      int var5 = var2;
      int var6;
      int var10000 = var6 = 0;

      while (var10000 < var3) {
         String var10001 = "\f";
         if ((var6 = var1.indexOf("#", var5 + 1)) == -1 || var6 > var3) {
            var6 = var3;
         }

         this.at(var1, var5, var6, var4);
         var5 = var6 + 1;
         var10000 = var6;
      }
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("fig7")) {
         int var21 = 0;
         int var32;
         int var62 = var32 = 0;

         while (var62 != var2.length()) {
            String var80 = "d";
            if ((var32 = var2.indexOf("|", var21 + 1)) == -1) {
               var32 = var2.length();
            }

            if (var2.charAt(var21) == 'R') {
               var62 = var32;
               this.as(var2, var21 + 1, var32, var4);
            } else {
               if (var2.charAt(var21) == 'M') {
                  this.ar(var2, var21 + 1, var32, var4);
               }

               var62 = var32;
            }

            var21 = var62 + 1;
            var62 = var32;
         }
      } else if (var1.equals("fig5")) {
         FightingRound var20;
         BattleScene var31;
         if ((var31 = com.xy.v.Class27.e((var20 = com.xy.v.Class31.a().fromJson(var2, FightingRound.class)).getFightingsumber())) != null) {
            BattlePlay var37 = new BattlePlay();
            var37.setRound(var20.getRound());
            var31.v(var20.getCurrentRound(), var37);
         }
      } else if (var1.equals("fig1")) {
         String var88 = "S";
         int var19 = var2.indexOf("|");
         BattleScene var30;
         if ((var30 = com.xy.v.Class27.e(com.xy.v.Class12.ad(var2, 0, var19))) != null) {
            var30.d(var2, var19 + 1);
         }
      } else if (var1.equals("fig4")) {
         BattleScene var29;
         if ((var29 = com.xy.v.Class27.e(Integer.parseInt(var2))) != null) {
            var29.u(var29.getBattleRound() + 1);
         }
      } else {
         if (var1.equals("fig6")) {
            BattleEnd var5;
            BattleScene var6;
            com.xy.d.Class11 var7 = (var6 = com.xy.v.Class27.e((var5 = com.xy.v.Class31.a().fromJson(var2, BattleEnd.class)).getFightingNumber())) != null
               ? var6.getBattleUnit(0, var4.roleData.getRoleId())
               : null;
            boolean var8 = false;
            if (var7 != null) {
               boolean var9 = var5.getCamp() == var7.ab();
               if (!var3.l(2, 12)) {
                  String var81;
                  if (var9) {
                     var81 = "(L(A戓斏胗刱";
                     var81 = "#T#Y战斗胜利";
                  } else {
                     var81 = "{{{v所斸奩贊";
                     var81 = "#T#Y战斗失败";
                  }

                  var4.chatBox.addChat(5, var81);
               }

               if (!com.xy.v.Class12.h(var5.getMsg())) {
                  String var10000 = var5.getMsg();
                  String var10001 = "Wd";
                  String[] var10 = var10000.split("\\|");

                  int var11;
                  for (int var40 = var11 = 0; var40 < var10.length; var40 = var11) {
                     ChatBox var41 = var4.chatBox;
                     String var10004 = "{w{v";
                     StringBuilder var83 = new StringBuilder("#X#Y");
                     String var10003 = var10[var11];
                     var11++;
                     var41.addChat(6, var83.append(var10003).toString());
                  }
               }

               if (!var9) {
                  var8 = true;
               }
            }

            if (var5.getTaskDaily() != null) {
               var4.roleData.getPkSys().d(var5.getTaskDaily());
            }

            Class9.u(var5.getAssetUpdate(), var4);
            var4.roleData.getTaskSystem().d(var5.getTaskn());
            if (var8) {
               var4.automation.m();
               return;
            }
         } else if (var1.equals("battleconnection")) {
            BattleConnection var14;
            if ((var14 = com.xy.v.Class31.a().fromJson(var2, BattleConnection.class)).getFightingNumber() == -1) {
               BattleScene var24;
               if ((var24 = var4.getBattleScene()) != null) {
                  var24.e(var4.getBattleControl());
               }

               return;
            }

            BattleScene var22 = null;
            synchronized (com.xy.v.Class27.c()) {
               BattleScene var42;
               if ((var22 = com.xy.v.Class27.e(var14.getFightingNumber())) == null) {
                  var42 = var22 = com.xy.v.Class27.b(var14);
               } else {
                  var42 = var22;
                  var22.ac(var14);
               }

               if (var42.battleMapId == 0L) {
                  var22.battleMapId = var4.mapScene.a;
                  var22.gameBattle = var4.getClient().gameBattle;
               }
            }

            BattleScene var43;
            label229: {
               if (var14.getState() == 1) {
                  long var34 = var4.roleData.getRoleId();
                  if (var14.getEventState() == 1) {
                     var43 = var22;
                     var22.setHandleUnit(var34, 0, false);
                     var22.setHandleUnit(var34, 1, false);
                     break label229;
                  }

                  if (var14.getEventState() == 2) {
                     var43 = var22;
                     var22.setHandleUnit(var34, 0, true);
                     var22.setHandleUnit(var34, 1, false);
                     break label229;
                  }

                  var22.setHandleUnit(var34, 0, true);
                  var22.setHandleUnit(var34, 1, true);
               }

               var43 = var22;
            }

            var43.ae(var4.getBattleControl());
            if (var14.BattleType == 10 && var14.getRound() == 1 && var4.getBattleControl().battleCamp == 1) {
               String var64 = "杘亱馁";
               var4.roleData.af("杀人香");
            }

            var4.automation.f();
            if (var4.getGameReadBar().readBarType == 2 || var4.getGameReadBar().readBarType == 3) {
               var4.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
            }

            if (var22.getBattleType() == 101) {
               var4.getFormManagement().f(5);
               return;
            }

            if (var22.getBattleType() == 103) {
               var4.getFormManagement().f(111);
               return;
            }
         } else {
            if (var1.equals("fig8")) {
               if (com.xy.v.Class12.h(var2)) {
                  return;
               }

               Ql var18 = com.xy.v.Class31.a().fromJson(var2, Ql.class);
               ((com.xy.a.w.Class25)var4.getFormManagement().j(8)).abn(var18, 0, null);
               return;
            }

            if (var1.equals(Agreement.fightCard)) {
               if (com.xy.v.Class12.h(var2)) {
                  return;
               }

               String var66 = "号軳华";
               UseCardBean var17;
               if ((var17 = var4.roleData.getLimit("变身卡")) == null) {
                  return;
               }

               int var28 = Integer.parseInt(var2);

               int var36;
               for (int var44 = var36 = 0; var44 < var17.getQls().length; var44 = ++var36) {
                  BaseQl var38;
                  if ((var38 = var17.getQls()[var36]) != null) {
                     String var45 = var38.getKey();
                     var66 = "亪咇劃";
                     if (!var45.equals("亲和力")) {
                        String var46 = var38.getKey();
                        var66 = "笑纈";
                        if (!var46.equals("等级")) {
                           String var47 = var38.getKey();
                           var66 = "秆旗";
                           if (!var47.equals("种族")) {
                              String var48 = var38.getKey();
                              var66 = "釾";
                              if (!var48.equals("金")) {
                                 String var49 = var38.getKey();
                                 var66 = "朰";
                                 if (!var49.equals("木")) {
                                    String var50 = var38.getKey();
                                    var66 = "氛";
                                    if (!var50.equals("水")) {
                                       String var51 = var38.getKey();
                                       var66 = "灳";
                                       if (!var51.equals("火")) {
                                          String var52 = var38.getKey();
                                          var66 = "地";
                                          if (!var52.equals("土")) {
                                             String var53 = var38.getKey();
                                             var66 = "皥肼";
                                             if (!var53.equals("皮肤")) {
                                                int var39 = (int)(var38.getValue() * var28 / 100.0);
                                                String var54 = var38.getKey();
                                                var66 = "勸引汌衯";
                                                if (var54.equals("加强气血")) {
                                                   ChatBox var55 = var4.chatBox;
                                                   String var94 = ";S;Y佸皏朘夬P[墆劫亞";
                                                   StringBuilder var84 = new StringBuilder("#X#R你的最大HP增加了").append(var39);
                                                   String var90 = "\n";
                                                   var55.addChat(6, var84.append("%").toString());
                                                } else {
                                                   String var56 = var38.getKey();
                                                   var66 = "劫弢魟泍";
                                                   if (var56.equals("加强魔法")) {
                                                      ChatBox var57 = var4.chatBox;
                                                      String var95 = "\f\u0000\f\n住盜术奿b\b墱勸亩";
                                                      StringBuilder var85 = new StringBuilder("#X#R你的最大MP增加了").append(var39);
                                                      String var91 = "=";
                                                      var57.addChat(6, var85.append("%").toString());
                                                   } else {
                                                      String var58 = var38.getKey();
                                                      var66 = "勸引散凔";
                                                      if (var58.equals("加强攻击")) {
                                                         ChatBox var59 = var4.chatBox;
                                                         String var96 = ";S;Y佸皏朘夬Y[墆劫亞";
                                                         StringBuilder var86 = new StringBuilder("#X#R你的最大AP增加了").append(var39);
                                                         String var92 = "\n";
                                                         var59.addChat(6, var86.append("%").toString());
                                                      } else {
                                                         String var60 = var38.getKey();
                                                         var66 = "劫弢途庾";
                                                         if (var60.equals("加强速度")) {
                                                            ChatBox var61 = var4.chatBox;
                                                            String var97 = "\f\u0000\f\n住盜术奿|\b墱勸亩";
                                                            StringBuilder var87 = new StringBuilder("#X#R你的最大SP增加了").append(var39);
                                                            String var93 = "=";
                                                            var61.addChat(6, var87.append("%").toString());
                                                         } else {
                                                            String var98 = "{w{}";
                                                            var4.chatBox.addChat(6, "#X#R" + var38.getKey() + var39 + Class48.qb(var38.getKey()));
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               return;
            }

            if (var1.equals(Agreement.fightAuto)) {
               String var89 = "d";
               int var16 = var2.indexOf("|");
               int var27 = com.xy.v.Class12.ad(var2, 0, var16);
               int var35 = com.xy.v.Class12.ad(var2, var16 + 1, var2.length());
               var4.getBattleControl().t(var27, var35);
               return;
            }

            if (var1.equals(Agreement.fightVideo)) {
               if (var4.getBattleScene() != null) {
                  String var65 = "伸圇所斸乵Ｃ斸泺覚眤弍僠";
                  var4._do("你在战斗中，无法观看录像");
                  return;
               }

               BattleVideo var15 = com.xy.v.Class31.a().fromJson(var2, BattleVideo.class);
               BattleScene var25 = null;
               synchronized (com.xy.v.Class27.c()) {
                  var25 = new BattleScene();
                  var25.l(var15);
                  var25.battleMapId = var4.mapScene.a;
                  var25.gameBattle = var4.getClient().gameBattle;
                  com.xy.v.Class27.c().add(var25);
               }

               var25.ae(var4.getBattleControl());
               var4.automation.f();
               if (var4.getGameReadBar().readBarType == 2 || var4.getGameReadBar().readBarType == 3) {
                  var4.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
               }
            }
         }
      }
   }

   public void d(GameView var1) {
      if (var1.roleUnit.ap.getFighting() != 0) {
         BattleScene var2;
         if ((var2 = var1.getBattleScene()) != null && var2.getBattleId() == var1.roleUnit.ap.getFighting()) {
            var2.e(var1.getBattleControl());
         }
      }
   }

   public void as(String var1, int var2, int var3, GameView var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = var2;
      int var8;
      int var10000 = var8 = 0;

      while (var10000 < var3) {
         String var10001 = ";";
         if ((var8 = var1.indexOf("#", var7 + 1)) == -1 || var8 > var3) {
            var8 = var3;
         }

         if (var6 == 0) {
            var5 = com.xy.v.Class12.ad(var1, var7, var8);
            var10000 = var8;
         } else {
            com.xy.d.Class8 var9;
            if ((var9 = var4.mapScene.j(var1.substring(var7, var8))) == null) {
               var10000 = var8;
            } else {
               if (var5 == 0 && var9 == var4.roleUnit) {
                  this.d(var4);
               }

               var9.ap.setFighting(var5);
               var9.as();
               var10000 = var8;
            }
         }

         var6++;
         var7 = var10000 + 1;
         var10000 = var8;
      }
   }

   public void at(String var1, int var2, int var3, GameView var4) {
      int var5 = 0;
      com.xy.d.Class9 var6 = null;
      int var7 = 0;
      int var8 = var2;
      int var9;
      int var10000 = var9 = 0;

      while (var10000 < var3) {
         String var10001 = "F";
         if ((var9 = var1.indexOf("^", var8 + 1)) == -1 || var9 > var3) {
            var9 = var3;
         }

         if (var7 == 0) {
            var5 = com.xy.v.Class12.ad(var1, var8, var9);
            var10000 = var9;
         } else if (var7 == 1) {
            int var10;
            if ((var10 = com.xy.v.Class12.ad(var1, var8, var9)) == 2) {
               var4.mapScene.q(var5);
               return;
            }

            if ((var6 = var4.mapScene.h(var5)) == null) {
               return;
            }

            var6.au.setType(var10);
            var10000 = var9;
         } else {
            label54: {
               if (var1.charAt(var8) == 'H') {
                  int var14;
                  if ((var14 = var1.indexOf(",", var8 + 1)) != -1) {
                     if (var14 > var9) {
                        var10000 = var9;
                     } else {
                        int var11 = com.xy.v.Class12.ad(var1, var8 + 1, var14);
                        int var12 = com.xy.v.Class12.ad(var1, var14 + 1, var9);
                        if (var6.au.getHP() != null) {
                           var6.au.getHP().setX(var11);
                           var10000 = var9;
                           var6.au.getHP().setY(var12);
                        } else {
                           var6.au.setHP(new PathPoint(var11, var12));
                           var10000 = var9;
                        }
                     }
                     break label54;
                  }
               } else if (var1.charAt(var8) == 'G') {
                  com.xy.d.Class8 var15;
                  if ((var15 = var4.mapScene.ag(new BigDecimal(var1.substring(var8 + 1, var9)))) != null) {
                     var10000 = var9;
                     var6.au.setFollow(var15.ae());
                     break label54;
                  }
               } else {
                  int var16;
                  if (var1.charAt(var8) == 'Z' && (var16 = var1.indexOf(",", var8 + 1)) != -1) {
                     if (var16 > var9) {
                        var10000 = var9;
                        break label54;
                     }

                     int var17 = com.xy.v.Class12.ad(var1, var8 + 1, var16);
                     int var18;
                     int var20 = var18 = com.xy.v.Class12.ad(var1, var16 + 1, var9);
                     var6.au.setX(var17);
                     var6.au.setY(var18);
                     var6.ae = var17;
                     var6.v = var20;
                  }
               }

               var10000 = var9;
            }
         }

         var7++;
         var8 = var10000 + 1;
         var10000 = var9;
      }
   }
}
