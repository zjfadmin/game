package com.xy;

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

public class Class203 implements ServerAction {
   public void ah(String var1, int var2, int var3, GameView var4) {
      var2 = var2;

      int var5;
      for(int var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (4 ^ 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         this.ai(var1, var2, var5, var4);
         var2 = var5 + (3 >> 1);
      }

   }

   public void ai(String var1, int var2, int var3, GameView var4) {
      int var5 = 3 & 4;
      Class572 var6 = null;
      int var7 = 2 & 5;
      var2 = var2;

      int var8;
      for(int var10000 = var8 = 2 & 5; var10000 < var3; var10000 = var8) {
         if ((var8 = var1.indexOf("^", var2 + (3 >> 1))) == -4 >> 2 || var8 > var3) {
            var8 = var3;
         }

         if (var7 == 0) {
            var5 = Class394.b(var1, var2, var8);
            var10000 = var8;
         } else {
            int var9;
            if (var7 == --1) {
               if ((var9 = Class394.b(var1, var2, var8)) == 5 >> 1) {
                  var4.mapScene.k(var5);
                  return;
               }

               if ((var6 = var4.mapScene.q(var5)) == null) {
                  return;
               }

               var6.p.setType(var9);
               var10000 = var8;
            } else {
               label69: {
                  int var10;
                  int var11;
                  if (var1.charAt(var2) == (127 & 72)) {
                     if ((var9 = var1.indexOf(",", var2 + (3 >> 1))) != -4 >> 2) {
                        if (var9 > var8) {
                           var10000 = var8;
                        } else {
                           var10 = Class394.b(var1, var2 + (2 ^ 3), var9);
                           var11 = Class394.b(var1, var9 + (3 & 5), var8);
                           if (var6.p.getHP() != null) {
                              var6.p.getHP().setX(var10);
                              var10000 = var8;
                              var6.p.getHP().setY(var11);
                           } else {
                              var6.p.setHP(new PathPoint(var10, var11));
                              var10000 = var8;
                           }
                        }
                        break label69;
                     }
                  } else if (var1.charAt(var2) == (103 & 95)) {
                     Class183 var12;
                     if ((var12 = var4.mapScene.o(new BigDecimal(var1.substring(var2 + (5 >> 2), var8)))) != null) {
                        var10000 = var8;
                        var6.p.setFollow(var12.aw());
                        break label69;
                     }
                  } else if (var1.charAt(var2) == (95 & 122) && (var9 = var1.indexOf(",", var2 + (3 >> 1))) != -4 >> 2) {
                     if (var9 > var8) {
                        var10000 = var8;
                        break label69;
                     }

                     var10 = Class394.b(var1, var2 + --1, var9);
                     int var10001 = var11 = Class394.b(var1, var9 + (4 ^ 5), var8);
                     var6.p.setX(var10);
                     var6.p.setY(var11);
                     var6.ab = var10;
                     var6.al = var10001;
                  }

                  var10000 = var8;
               }
            }
         }

         ++var7;
         var2 = var10000 + 1;
      }

   }

   public void aj(String var1, int var2, int var3, GameView var4) {
      int var5 = 3 & 4;
      int var6 = 5 >> 3;
      var2 = var2;

      int var7;
      for(int var10000 = var7 = 3 & 4; var10000 < var3; var10000 = var7) {
         if ((var7 = var1.indexOf("#", var2 + (5 >> 2))) == -4 >> 2 || var7 > var3) {
            var7 = var3;
         }

         if (var6 == 0) {
            var5 = Class394.b(var1, var2, var7);
            var10000 = var7;
         } else {
            Class183 var8;
            if ((var8 = var4.mapScene.a(var1.substring(var2, var7))) == null) {
               var10000 = var7;
            } else {
               if (var5 == 0 && var8 == var4.roleUnit) {
                  this.c(var4);
               }

               var8.r.setFighting(var5);
               var8.bq();
               var10000 = var7;
            }
         }

         ++var6;
         var2 = var10000 + 1;
      }

   }

   public void c(GameView var1) {
      if (var1.roleUnit.r.getFighting() != 0) {
         BattleScene var2;
         if ((var2 = var1.getBattleScene()) != null && var2.getBattleId() == (long)var1.roleUnit.r.getFighting()) {
            var2.ag(var1.getBattleControl());
         }
      }
   }

   public void a(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      int var16;
      int var10000;
      int var25;
      if (var1.equals("fig7")) {
         var16 = 3 ^ 3;

         for(var10000 = var25 = 5 >> 3; var10000 != var2.length(); var10000 = var25) {
            if ((var25 = var2.indexOf("|", var16 + (2 ^ 3))) == -4 >> 2) {
               var25 = var2.length();
            }

            if (var2.charAt(var16) == (127 & 82)) {
               var10000 = var25;
               this.aj(var2, var16 + (3 & 5), var25, var4);
            } else {
               if (var2.charAt(var16) == (125 & 79)) {
                  this.ah(var2, var16 + --1, var25, var4);
               }

               var10000 = var25;
            }

            var16 = var10000 + 1;
         }

      } else {
         BattleScene var6;
         if (var1.equals("fig5")) {
            FightingRound var19;
            if ((var6 = Class271.a((long)(var19 = (FightingRound)Class695.b().fromJson(var2, FightingRound.class)).getFightingsumber())) != null) {
               BattlePlay var23 = new BattlePlay();
               var23.setRound(var19.getRound());
               var6.a(var19.getCurrentRound(), var23);
            }
         } else {
            int var10001;
            if (var1.equals("fig1")) {
               var16 = var2.charAt(3 & 4) == (117 & 75) ? 3 & 5 : 0;
               var25 = var2.indexOf("|");
               int var28;
               if (var16 == 0) {
                  var10001 = 3 ^ 3;
                  var28 = var25;
               } else {
                  var10001 = 1;
                  var28 = var25;
               }

               BattleScene var22;
               if ((var22 = Class271.a((long)Class394.b(var2, var10001, var28))) != null) {
                  var22.c(var16, var2, var25 + (3 & 5));
               }
            } else if (var1.equals("fig4")) {
               if ((var6 = Class271.a((long)Integer.parseInt(var2))) != null) {
                  var6.f(var6.getBattleRound() + --1);
               }
            } else {
               int var9;
               if (var1.equals("fig6")) {
                  BattleEnd var5;
                  Class514 var7 = (var6 = Class271.a((long)(var5 = (BattleEnd)Class695.b().fromJson(var2, BattleEnd.class)).getFightingNumber())) != null ? var6.getBattleUnit(2 & 5, var4.roleData.getRoleId()) : null;
                  int var8 = 2 & 5;
                  if (var7 != null) {
                     var9 = var5.getCamp() == var7.ap() ? 3 >> 1 : 0;
                     if (!var3.n(5 >> 1, 12 & 127)) {
                        var4.chatBox.addChat(--5, var9 != 0 ? "#T#Y战斗胜利" : "#T#Y战斗失败");
                     }

                     if (!Class394.o(var5.getMsg())) {
                        String[] var10 = var5.getMsg().split("\\|");

                        int var11;
                        for(var10000 = var11 = 2 & 5; var10000 < var10.length; var10000 = var11) {
                           ChatBox var26 = var4.chatBox;
                           var10001 = 47 & 86;
                           StringBuilder var10002 = new StringBuilder("#X#Y");
                           String var10003 = var10[var11];
                           ++var11;
                           var26.addChat(var10001, var10002.append(var10003).toString());
                        }
                     }

                     if (var9 == 0) {
                        var8 = 2 ^ 3;
                     }
                  }

                  if (var5.getTaskDaily() != null) {
                     var4.roleData.getPkSys().a(var5.getTaskDaily());
                  }

                  Class677.i(var5.getAssetUpdate(), var4);
                  var4.roleData.getTaskSystem().m(var5.getTaskn());
                  if (var8 != 0) {
                     var4.automation.r();
                     return;
                  }
               } else if (var1.equals("battleconnection")) {
                  BattleConnection var14;
                  if ((var14 = (BattleConnection)Class695.b().fromJson(var2, BattleConnection.class)).getFightingNumber() == -4 >> 2) {
                     if ((var6 = var4.getBattleScene()) != null) {
                        var6.ag(var4.getBattleControl());
                     }

                     return;
                  }

                  var6 = null;
                  BattleScene var27;
                  synchronized(Class271.h()) {
                     if ((var6 = Class271.a((long)var14.getFightingNumber())) == null) {
                        var27 = var6 = Class271.j(var14);
                     } else {
                        var27 = var6;
                        var6.ac(var14);
                     }

                     if (var27.battleMapId == 0L) {
                        var6.battleMapId = var4.mapScene.l;
                        var6.gameBattle = var4.getClient().gameBattle;
                     }
                  }

                  label240: {
                     if (var14.getState() == (2 ^ 3)) {
                        long var20 = var4.roleData.getRoleId();
                        if (var14.getEventState() == --1) {
                           var27 = var6;
                           var6.setHandleUnit(var20, 2 & 5, (boolean)(2 & 5));
                           var6.setHandleUnit(var20, --1, (boolean)(3 ^ 3));
                           break label240;
                        }

                        if (var14.getEventState() == --2) {
                           var27 = var6;
                           var6.setHandleUnit(var20, 0, true);
                           var6.setHandleUnit(var20, 1, false);
                           break label240;
                        }

                        var6.setHandleUnit(var20, 0, true);
                        var6.setHandleUnit(var20, 1, true);
                     }

                     var27 = var6;
                  }

                  var27.z(var4.getBattleControl());
                  if (var14.BattleType == (10 & 127) && var14.getRound() == 1 && var4.getBattleControl().battleCamp == 1) {
                     var4.roleData.ag("杀人香");
                  }

                  var4.automation.q();
                  if (var4.getGameReadBar().readBarType == 5 >> 1 || var4.getGameReadBar().readBarType == --3) {
                     var4.getGameReadBar().setReadBar(0, 0, (String)null, 0.0D, 0L, (Object)null);
                  }

                  if (var6.getBattleType() == (127 & 101)) {
                     var4.getFormManagement().n(--5);
                     return;
                  }

                  if (var6.getBattleType() == (127 & 103)) {
                     var4.getFormManagement().n(111 & 127);
                     return;
                  }
               } else {
                  if (var1.equals("fig8")) {
                     if (Class394.o(var2)) {
                        return;
                     }

                     Ql var18 = (Ql)Class695.b().fromJson(var2, Ql.class);
                     ((Class207)var4.getFormManagement().e(47 & 88)).aoo(var18, 0, (BigDecimal)null);
                     return;
                  }

                  int var21;
                  if (var1.equals(Agreement.fightCard)) {
                     if (Class394.o(var2)) {
                        return;
                     }

                     UseCardBean var17;
                     if ((var17 = var4.roleData.getLimit("变身卡")) == null) {
                        return;
                     }

                     var25 = Integer.parseInt(var2);

                     for(var10000 = var21 = 0; var10000 < var17.getQls().length; var10000 = var21) {
                        BaseQl var24;
                        if ((var24 = var17.getQls()[var21]) != null && !var24.getKey().equals("亲和力") && !var24.getKey().equals("等级") && !var24.getKey().equals("种族") && !var24.getKey().equals("金") && !var24.getKey().equals("木") && !var24.getKey().equals("水") && !var24.getKey().equals("火") && !var24.getKey().equals("土") && !var24.getKey().equals("皮肤")) {
                           var9 = (int)(var24.getValue() * (double)var25 / 100.0D);
                           if (var24.getKey().equals("加强气血")) {
                              var4.chatBox.addChat(15 & 118, "#X#R你的最大HP增加了" + var9 + "%");
                           } else if (var24.getKey().equals("加强魔法")) {
                              var4.chatBox.addChat(38 & 95, "#X#R你的最大MP增加了" + var9 + "%");
                           } else if (var24.getKey().equals("加强攻击")) {
                              var4.chatBox.addChat(95 & 38, "#X#R你的最大AP增加了" + var9 + "%");
                           } else if (var24.getKey().equals("加强速度")) {
                              var4.chatBox.addChat(110 & 23, "#X#R你的最大SP增加了" + var9 + "%");
                           } else {
                              var4.chatBox.addChat(47 & 86, "#X#R" + var24.getKey() + var9 + Class270.so(var24.getKey()));
                           }
                        }

                        ++var21;
                     }

                     return;
                  }

                  if (var1.equals(Agreement.fightAuto)) {
                     var16 = var2.indexOf("|");
                     var25 = Class394.b(var2, 0, var16);
                     var21 = Class394.b(var2, var16 + 1, var2.length());
                     var4.getBattleControl().l(var25, var21);
                     return;
                  }

                  if (var1.equals(Agreement.fightVideo)) {
                     if (var4.getBattleScene() != null) {
                        var4.f("你在战斗中，无法观看录像");
                        return;
                     }

                     BattleVideo var15 = (BattleVideo)Class695.b().fromJson(var2, BattleVideo.class);
                     var6 = null;
                     synchronized(Class271.h()) {
                        var6 = new BattleScene();
                        var6.l(var15);
                        var6.battleMapId = var4.mapScene.l;
                        var6.gameBattle = var4.getClient().gameBattle;
                        Class271.h().add(var6);
                     }

                     var6.z(var4.getBattleControl());
                     var4.automation.q();
                     if (var4.getGameReadBar().readBarType == --2 || var4.getGameReadBar().readBarType == --3) {
                        var4.getGameReadBar().setReadBar(0, 0, (String)null, 0.0D, 0L, (Object)null);
                        return;
                     }
                  } else if (var1.equals("fig3")) {
                     ((Class270)var3.gameView.getFormManagement().e(47 & 126)).lb(var2);
                  }
               }

            }
         }
      }
   }
}
