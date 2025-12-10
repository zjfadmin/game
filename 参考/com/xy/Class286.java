package com.xy;

import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivityRole;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Class286 implements ServerAction {
   public static void l(String var0, GameView var1) {
      boolean var6 = var1.getObjectArea().ad();
      int var10 = 3 >> 2;
      RoleData var4 = var1.roleData;
      int var5 = 2 & 5;
      int var2 = 2 & 5;
      int var7 = 3 >> 2;

      int var10000;
      for(var10000 = var2; var10000 < var0.length(); var10000 = var2) {
         if ((var2 = var0.indexOf("|", var5 + (3 & 5))) == -4 >> 2) {
            var2 = var0.length();
         }

         if ((var7 = var0.indexOf("#", var5 + --1)) == -4 >> 2 || var7 > var2) {
            var7 = var2;
         }

         label109: {
            int var8 = Class394.b(var0, var5, var7);
            Activity var3;
            Object var9;
            if ((var9 = var4.getActivity(var8)) == null) {
               if ((var3 = var1.getObjectArea().aq(var8)) == null) {
                  var10000 = var2;
                  break label109;
               }

               RoleData var15;
               if (var3.getModelId() != --1 && var3.getModelId() != --2 && var3.getModelId() != --3 && var3.getModelId() != --5) {
                  if (var3.getModelId() == (14 & 119)) {
                     var9 = new ActivityPetManualRole((String)null, 3 ^ 3, 3 ^ 3);
                  }

                  var15 = var4;
               } else {
                  var9 = new Activity2Role((String)null, 5 >> 3, 5 >> 3);
                  var15 = var4;
               }

               var15.ad(var8, (ActivityRole)var9);
            }

            ((ActivityRole)var9).setValueByKey(var0, var7 + (3 & 5), var2);
            var3 = var6 ? var1.getObjectArea().aq(var8) : null;
            if (var3 == null) {
               var10000 = var2;
            } else if (var3.getModelId() == 3 >> 1) {
               var10 |= 3 & 5;
               var10000 = var2;
            } else if (var3.getModelId() == 5 >> 1) {
               var10 |= 5 >> 1;
               var10000 = var2;
            } else if (var3.getModelId() == --3) {
               var10 |= --4;
               var10000 = var2;
            } else if (var3.getModelId() == --5) {
               var10 |= 74 & 61;
               var10000 = var2;
            } else {
               if (var3.getModelId() == (79 & 54)) {
                  var10 |= 73 & 118;
               }

               var10000 = var2;
            }
         }

         var5 = var10000 + 1;
      }

      for(var10000 = var5 = 3 ^ 3; var10000 < 7; var10000 = var5) {
         if ((var10 >> var5 & 5 >> 2) == (2 ^ 3)) {
            if (var5 == 0) {
               Class694 var11;
               if ((var11 = (Class694)var1.getFormManagement().m(7150 & 25785)) != null) {
                  var11.p();
               }
            } else if (var5 == (4 ^ 5)) {
               Class316 var12;
               if ((var12 = (Class316)var1.getFormManagement().m(22439 & 10495)) != null) {
                  var12.as(1 ^ 3);
               }
            } else if (var5 == --3) {
               Class214 var13;
               if ((var13 = (Class214)var1.getFormManagement().m(8638 & 24315)) != null) {
                  var13.d();
               }
            } else if (var5 == (118 & 15)) {
               var1.roleData.getRoleProperty().n();
               Class395 var14;
               if ((var14 = (Class395)var1.getFormManagement().m(20731 & 12223)) != null) {
                  var14.d();
               }
            }
         }

         ++var5;
      }

   }

   public void ak(int var1, int var2, String var3, Activity var4, GameClient var5) {
      Class94 var8;
      if ((var8 = (Class94)var5.gameView.getFormManagement().m(8635 & 24308)) != null && var8.e() == 0) {
         BWDHRuleBattle[] var10000 = new BWDHRuleBattle[var2 < var3.length() ? --1 + Class394.aj((char)('\u007f' & '|'), var3, var2, var3.length()) : 0];
         boolean var10002 = true;
         BWDHRuleBattle[] var9 = var10000;
         int var6 = 5 >> 3;
         int var7 = var9.length > 0 ? 3 ^ 3 : var3.length();

         for(int var10 = var7; var10 < var3.length(); var10 = var7) {
            if ((var7 = var3.indexOf("|", var2 + (3 >> 1))) == -4 >> 2) {
               var7 = var3.length();
            }

            var9[var6] = new BWDHRuleBattle();
            var9[var6].b(var3, var2, var7);
            ++var6;
            var2 = var7 + (3 >> 1);
         }

         ((Class34)var8.kc()[3 & 4]).c(var1 - (5 >> 1), var9);
      }
   }

   public void al(int var1, String var2, Activity var3, GameClient var4) {
      Class94 var8;
      if ((var8 = (Class94)var4.gameView.getFormManagement().m(30395 & 2548)) != null && var8.e() == 0) {
         BWDHTeam[] var10000 = new BWDHTeam[var1 < var2.length() ? (3 & 5) + Class394.aj((char)('~' & '}'), var2, var1, var2.length()) : 0];
         boolean var10002 = true;
         BWDHTeam[] var9 = var10000;
         int var5 = 5 >> 3;
         int var6 = var9.length > 0 ? 3 & 4 : var2.length();
         int var7 = 5 >> 3;

         for(int var10 = var6; var10 < var2.length(); var10 = var6) {
            if ((var6 = var2.indexOf("|", var1 + --1)) == -4 >> 2) {
               var6 = var2.length();
            }

            if ((var7 = var2.indexOf("#", var1 + (2 ^ 3))) == -4 >> 2 || var7 > var6) {
               var7 = var6;
            }

            var9[var5] = new BWDHTeam();
            var9[var5].setId(Class394.b(var2, var1, var7));
            var9[var5].setName(var2.substring(var7 + (3 >> 1), var6));
            ++var5;
            var1 = var6 + --1;
         }

         ((Class34)var8.kc()[5 >> 3]).c(5 >> 3, var9);
      }
   }

   public void am(int var1, String var2, Activity var3, GameClient var4) {
      int var5 = 5 >> 2;
      int var6 = 3 ^ 3;
      int var7 = 2 & 5;
      String var8 = null;
      BWDHTeam var9;
      BWDHTeam var10000 = var9 = new BWDHTeam();
      int[] var10001 = new int[102 & 31];
      boolean var10003 = true;
      var10000.setData2(var10001);
      BWDHTeam var10 = new BWDHTeam();
      int[] var10002 = new int[78 & 55];
      boolean var10004 = true;
      var10.setData2(var10002);
      int var11 = var2.indexOf("|", var1 + (5 >> 2));
      var6 = Class394.b(var2, var1, var11);
      var1 = var11 + (3 >> 1);
      var11 = var2.indexOf("|", var1 + --1);
      var7 = Class394.b(var2, var1, var11);
      var1 = var11 + --1;
      var11 = var2.indexOf("|", var1 + --1);
      int var12 = 3 & 4;

      int var13;
      int var17;
      for(var17 = var13 = 3 & 4; var17 < var11; var17 = var13) {
         if ((var13 = var2.indexOf("#", var1 + (5 >> 2))) == -4 >> 2 || var13 > var11) {
            var13 = var11;
         }

         if (var12 == 0) {
            var17 = var13;
            var9.setId(Class394.b(var2, var1, var13));
         } else if (var12 == (3 & 5)) {
            var17 = var13;
            var9.setName(var2.substring(var1, var13));
         } else {
            var9.getData2()[var12 - --2] = Class394.b(var2, var1, var13);
            var17 = var13;
         }

         ++var12;
         var1 = var17 + 1;
      }

      var1 = var11 + --1;
      if ((var11 = var2.indexOf("|", var1 + --1)) == -4 >> 2) {
         var11 = var2.length();
      }

      var12 = 0;

      for(var17 = var13 = 2 & 5; var17 < var11; var17 = var13) {
         if ((var13 = var2.indexOf("#", var1 + (5 >> 2))) == -4 >> 2 || var13 > var11) {
            var13 = var11;
         }

         if (var12 == 0) {
            var17 = var13;
            var10.setId(Class394.b(var2, var1, var13));
         } else if (var12 == (4 ^ 5)) {
            var17 = var13;
            var10.setName(var2.substring(var1, var13));
         } else {
            var10.getData2()[var12 - (1 ^ 3)] = Class394.b(var2, var1, var13);
            var17 = var13;
         }

         ++var12;
         var1 = var17 + 1;
      }

      if ((var1 = var11 + (5 >> 2)) < var2.length()) {
         var8 = var2.substring(var1);
      }

      GameView var16;
      ActivityRole var18;
      long var14 = (var18 = (var16 = var4.gameView).roleData.getActivity(var3.getId())) != null ? var18.getValueByKey(2 ^ 3) : 0L;
      if (var14 != (long)var9.getId()) {
         var5 = 3 >> 2;
         var10000 = var9;
         var9 = var10;
         var10 = var10000;
      }

      ((Class667)var16.getFormManagement().e(7350 & 25595)).amw((boolean)var5, var6, var7, var9, var10, var8);
   }

   public void an(int var1, int var2, int var3, String var4, Activity var5, GameClient var6) {
      Class94 var9;
      if ((var9 = (Class94)var6.gameView.getFormManagement().m(5565 & 27378)) != null && var9.e() == 5 >> 2) {
         ArrayList var10 = new ArrayList();
         int var7 = 3 >> 2;

         int var8;
         int var10000;
         for(var10000 = var3; var10000 < var4.length(); var10000 = var8) {
            if ((var8 = var4.indexOf("|", var3 + (3 >> 1))) == -4 >> 2) {
               var8 = var4.length();
            }

            (new BWDHRuleBattle()).d(var4, var3, var8, var10);
            ++var7;
            var3 = var8 + (2 ^ 3);
         }

         BWDHRuleBattleRecord[] var13 = new BWDHRuleBattleRecord[var10.size()];
         boolean var10002 = true;
         BWDHRuleBattleRecord[] var11 = var13;

         for(var10000 = var8 = 3 >> 2; var10000 < var11.length; var10000 = var8) {
            int var10001 = var8;
            BWDHRuleBattleRecord var14 = (BWDHRuleBattleRecord)var10.get(var8);
            ++var8;
            var11[var10001] = var14;
         }

         Class153.e(var11);
         Class11 var12 = (Class11)var9.kc()[2 ^ 3];
         if (var1 == --3) {
            var12.wz(var2, var11);
         } else {
            var12.wy(var1 - --2, var11);
         }
      }
   }

   public void ao(int var1, String var2, Activity var3, GameClient var4) {
      char var5;
      int var6;
      int var7;
      int var9;
      int var10;
      int var10000;
      if ((var5 = var2.charAt(var1)) != (95 & 114) && var5 != (95 & 109)) {
         if (var5 == (126 & 85) || var5 == (124 & 119)) {
            if ((var6 = var2.indexOf("|", var1 + (2 ^ 3))) == -4 >> 2) {
               var6 = var2.length();
            }

            var7 = Class394.b(var2, var1 + (3 >> 1), var6);
            BWDHTeam var13 = new BWDHTeam();
            var13.setId(var7);
            this.ap(var5, var6 + (3 >> 1), var2, var13, var3, var4);
            return;
         }

         if (var5 == (95 & 110)) {
            if ((var6 = var2.indexOf("|", var1 + (4 ^ 5))) == -4 >> 2) {
               var6 = var2.length();
            }

            int[] var12;
            int[] var16;
            boolean var10002;
            if ((var7 = Class394.b(var2, var1 + (4 ^ 5), var6)) == (1 ^ 3)) {
               var1 = var6 + --1;
               var16 = new int[--3];
               var10002 = true;
               var12 = var16;
               var9 = 2 & 5;

               for(var10000 = var10 = 3 ^ 3; var10000 < var2.length(); var10000 = var10) {
                  if ((var10 = var2.indexOf("#", var1 + 1)) == -4 >> 2) {
                     var10 = var2.length();
                  }

                  if (var9 < var12.length) {
                     var12[var9] = Class394.b(var2, var1, var10);
                  }

                  ++var9;
                  var1 = var10 + 1;
               }

               ((Class472)var4.gameView.getFormManagement().e(31 & 123)).lz(var3.getId(), var12);
               return;
            }

            var1 = var6 + 1;
            var16 = new int[14 & 119];
            var10002 = true;
            var12 = var16;
            String var14 = null;
            var10 = 0;

            byte var11;
            for(var10000 = var11 = 0; var10000 < var2.length(); var10000 = var6) {
               if ((var6 = var2.indexOf("#", var1 + 1)) == -4 >> 2) {
                  var6 = var2.length();
               }

               if (var10 >= var12.length) {
                  var14 = var2.substring(var1);
                  break;
               }

               var12[var10] = Class394.b(var2, var1, var6);
               ++var10;
               var1 = var6 + 1;
            }

            Point var15 = new Point(var7, var12[0]);
            ((Class472)var4.gameView.getFormManagement().e(123 & 31)).lt(var3.getId(), var15, var12, var14);
            return;
         }

         if (var5 == (79 & 114)) {
            this.au(var1 + 1, var2, var3, var4);
            return;
         }

         if (var5 == (118 & 107)) {
            this.am(var1 + 1, var2, var3, var4);
            return;
         }

         if (var5 == (122 & 85)) {
            this.ar(var1 + 2, var2, var3, var4);
         }
      } else {
         if ((var6 = var2.indexOf("|", var1 + --1)) == -4 >> 2) {
            var6 = var2.length();
         }

         var7 = 0;
         int var8 = 2 & 5;
         var9 = 3 & 4;
         var10000 = var10 = 2 & 5;

         while(true) {
            if (var10000 >= var6) {
               if (var5 == (90 & 119)) {
                  if (var7 == 5 >> 1) {
                     this.al(var6 + --1, var2, var3, var4);
                     return;
                  }

                  if (var7 == --3) {
                     this.aq(var8, var6 + --1, var2, var3, var4);
                     return;
                  }

                  if (var7 != --4 && var7 != --5) {
                     break;
                  }

                  this.ak(var7, var6 + (4 ^ 5), var2, var3, var4);
                  return;
               }

               if (var5 != (79 & 125)) {
                  break;
               }

               if (var7 == --2) {
                  this.av(var6 + --1, var2, var3, var4);
                  return;
               }

               if (var7 != --3 && var7 != --4 && var7 != --5) {
                  break;
               }

               this.an(var7, var8, var6 + (4 ^ 5), var2, var3, var4);
               return;
            }

            if ((var10 = var2.indexOf("#", var1 + (3 >> 1))) == -4 >> 2 || var10 > var6) {
               var10 = var6;
            }

            if (var9 == 0) {
               var7 = Class394.b(var2, var1 + (3 >> 1), var10);
               var10000 = var10;
            } else {
               if (var9 == --1) {
                  var8 = Class394.b(var2, var1, var10);
               }

               var10000 = var10;
            }

            ++var9;
            var1 = var10000 + 1;
            var10000 = var10;
         }
      }

   }

   public void ap(char var1, int var2, String var3, BWDHTeam var4, Activity var5, GameClient var6) {
      GameView var9 = var6.gameView;
      RoleShow[] var10000 = new RoleShow[var2 < var3.length() ? Class394.aj((char)('|' & '\u007f'), var3, var2, var3.length()) : 0];
      boolean var10002 = true;
      RoleShow[] var10 = var10000;
      int var7 = 5 >> 3;
      int var8 = var10.length > 0 ? 5 >> 3 : var3.length();

      for(int var12 = var8; var12 < var3.length(); var12 = var8) {
         if ((var8 = var3.indexOf("|", var2 + (2 ^ 3))) == -4 >> 2) {
            var8 = var3.length();
         }

         if (var7 == 0) {
            var12 = var8;
            var4.setName(var3.substring(var2, var8));
         } else {
            var10[var7 - (3 & 5)] = new RoleShow();
            var10[var7 - (3 >> 1)].a(var3, var2, var8);
            var12 = var8;
         }

         ++var7;
         var2 = var12 + 1;
      }

      var4.setRoleShows(var10);
      if (var1 == (125 & 86)) {
         Class94 var11;
         if ((var11 = (Class94)var9.getFormManagement().m(5369 & 27574)) == null) {
            return;
         }

         if (var11.e() == 0) {
            ((Class34)var11.kc()[3 & 4]).uq(var4);
            return;
         }
      } else if (var1 == (127 & 116)) {
         ((Class525)var9.getFormManagement().e(7351 & 25595)).ans(var4);
      }

   }

   public void aq(int var1, int var2, String var3, Activity var4, GameClient var5) {
      Class94 var8;
      if ((var8 = (Class94)var5.gameView.getFormManagement().m(27314 & 5629)) != null && var8.e() == 0) {
         BWDHRuleBattle[] var10000 = new BWDHRuleBattle[var2 < var3.length() ? (3 >> 1) + Class394.aj((char)('\u007f' & '|'), var3, var2, var3.length()) : 0];
         boolean var10002 = true;
         BWDHRuleBattle[] var9 = var10000;
         int var6 = 3 & 4;
         int var7 = var9.length > 0 ? 3 & 4 : var3.length();

         for(int var10 = var7; var10 < var3.length(); var10 = var7) {
            if ((var7 = var3.indexOf("|", var2 + --1)) == -4 >> 2) {
               var7 = var3.length();
            }

            var9[var6] = new BWDHRuleBattle(var3, var2, var7);
            ++var6;
            var2 = var7 + (2 ^ 3);
         }

         ((Class34)var8.kc()[5 >> 3]).alr(var1, var9);
      }
   }

   public void ar(int var1, String var2, Activity var3, GameClient var4) {
      Class94 var6;
      if ((var6 = (Class94)var4.gameView.getFormManagement().m(17080 & 15863)) != null && var6.e() == (1 ^ 3)) {
         ArrayList var7 = new ArrayList();
         int var10000 = 3 ^ 3;

         int var5;
         for(var10000 = var1; var10000 < var2.length(); var10000 = var5) {
            if ((var5 = var2.indexOf("|", var1 + --1)) == -4 >> 2) {
               var5 = var2.length();
            }

            this.at(var2, var1, var5, var7);
            var1 = var5 + --1;
         }

         ((Class575)var6.kc()[5 >> 1]).ck(var7);
      }
   }

   public void as(int var1, String var2, Activity var3, GameClient var4) {
      GameView var11 = var4.gameView;
      char var5 = var2.charAt(var1);
      int var6;
      if ((var6 = var2.indexOf("|", var1 + (2 ^ 3))) == -4 >> 2) {
         var6 = var2.length();
      }

      int var7 = Class394.b(var2, var1 + --1, var6);
      var1 = var6 + --1;
      var6 = 5 >> 3;
      if (var5 == (78 & 125)) {
         ((Class503)var11.getFormManagement().e(507 & 32429)).ua(var2, var1);
      } else {
         if (var5 == (87 & 123)) {
            Class316 var8;
            if ((var8 = (Class316)var11.getFormManagement().m(14015 & 18919)) == null) {
               return;
            }

            Class75 var9;
            Class137 var12 = (var9 = (Class75)var8.jh(5 >> 1, var3.getId())) != null ? var9.ank() : null;
            if (var12 == null || !var12.isVisible() || var12.ae() != var7) {
               return;
            }

            int[] var10000;
            if (var1 < var2.length()) {
               var10000 = new int[--1 + Class394.aj((char)('}' & '.'), var2, var1, var2.length())];
               boolean var10002 = true;
            } else {
               var10000 = null;
            }

            int[] var10 = var10000;
            int var13 = 3 >> 2;
            var7 = var10 != null ? var10.length : 0;

            for(int var14 = var13; var14 < var7; var14 = var13) {
               if ((var6 = var2.indexOf(",", var1 + (4 ^ 5))) == -4 >> 2 || var6 > var2.length()) {
                  var6 = var2.length();
               }

               var10[var13] = Class394.b(var2, var1, var6);
               ++var13;
               var1 = var6 + (2 ^ 3);
            }

            var12.ch(var10);
         }

      }
   }

   public void at(String var1, int var2, int var3, List<BWDHTeam> var4) {
      int var5;
      if ((var5 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var5 > var3) {
         var5 = var3;
      }

      int var6 = Class394.b(var1, var2, var5);
      var2 = var5 + --1;
      int var7 = 3 >> 2;

      for(int var10000 = var5; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (5 >> 2))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if ((var7 = var1.indexOf("&", var2 + (3 >> 1))) == -4 >> 2 || var7 > var5) {
            var7 = var5;
         }

         BWDHTeam var8 = new BWDHTeam();
         var8.setId(Class394.b(var1, var2, var7));
         var8.setName(var1.substring(var7 + (3 & 5), var5));
         var8.setFlag(var6);
         var4.add(var8);
         var2 = var5 + (2 ^ 3);
      }

   }

   public void a(String var1, String var2, GameClient var3) {
      if (var1.equals("activity")) {
         l(var2, var3.gameView);
      } else {
         if (var1.equals("activityS")) {
            this.e(var2, var3);
         }

      }
   }

   public void au(int var1, String var2, Activity var3, GameClient var4) {
      BWDHTeam var9 = new BWDHTeam();
      BWDHTeam var5 = new BWDHTeam();
      int var6;
      if ((var6 = var2.indexOf("|", var1 + (2 ^ 3))) == -4 >> 2) {
         var6 = var2.length();
      }

      RoleShow[] var10001 = new RoleShow[Class394.aj((char)('g' & '>'), var2, var1, var6) - (2 ^ 3)];
      boolean var10003 = true;
      var9.setRoleShows(var10001);
      int var7 = 2 & 5;

      int var8;
      int var10000;
      for(var10000 = var8 = 3 ^ 3; var10000 < var6; var10000 = var8) {
         if ((var8 = var2.indexOf("&", var1 + (3 & 5))) == -4 >> 2 || var8 > var6) {
            var8 = var6;
         }

         if (var7 == 0) {
            var10000 = var8;
            var9.setId(Class394.b(var2, var1, var8));
         } else if (var7 == (3 & 5)) {
            var10000 = var8;
            var9.setName(var2.substring(var1, var8));
         } else {
            var9.getRoleShows()[var7 - (1 ^ 3)] = new RoleShow();
            var9.getRoleShows()[var7 - (5 >> 1)].a(var2, var1, var8);
            var10000 = var8;
         }

         ++var7;
         var1 = var10000 + 1;
      }

      var1 = var6 + (2 ^ 3);
      var6 = var2.length();
      var10001 = new RoleShow[Class394.aj((char)('v' & '/'), var2, var1, var6) - --1];
      var10003 = true;
      var5.setRoleShows(var10001);
      var7 = 2 & 5;

      for(var10000 = var8 = 5 >> 3; var10000 < var6; var10000 = var8) {
         if ((var8 = var2.indexOf("&", var1 + (3 >> 1))) == -4 >> 2 || var8 > var6) {
            var8 = var6;
         }

         if (var7 == 0) {
            var10000 = var8;
            var5.setId(Class394.b(var2, var1, var8));
         } else if (var7 == (2 ^ 3)) {
            var10000 = var8;
            var5.setName(var2.substring(var1, var8));
         } else {
            var5.getRoleShows()[var7 - (1 ^ 3)] = new RoleShow();
            var5.getRoleShows()[var7 - (5 >> 1)].a(var2, var1, var8);
            var10000 = var8;
         }

         ++var7;
         var1 = var10000 + 1;
      }

      GameView var10 = var4.gameView;
      if (var9.a(var10.roleData.getLoginResult().getRole_id()) == -4 >> 2) {
         BWDHTeam var11 = var9;
         var9 = var5;
         var5 = var11;
      }

      ((Class257)var10.getFormManagement().e(21429 & 11515)).ei(var9, var5);
   }

   public void e(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      int var4;
      if ((var4 = var1.indexOf("|")) == -4 >> 2) {
         var4 = var1.length();
      }

      int var5 = Class394.b(var1, 3 ^ 3, var4);
      Activity var6;
      if ((var6 = var3.getObjectArea().aq(var5)) != null) {
         ++var4;
         if (var6.getModelId() == 5 >> 1) {
            this.as(var4, var1, var6, var2);
         } else {
            if (var6.getModelId() == --3) {
               this.ao(var4, var1, var6, var2);
            }

         }
      }
   }

   public void av(int var1, String var2, Activity var3, GameClient var4) {
      Class94 var7;
      if ((var7 = (Class94)var4.gameView.getFormManagement().m(32694 & 249)) != null && var7.e() == (2 ^ 3)) {
         BWDHTeam[] var10000 = new BWDHTeam[var1 < var2.length() ? (4 ^ 5) + Class394.aj((char)('~' & '}'), var2, var1, var2.length()) : 0];
         boolean var10002 = true;
         BWDHTeam[] var8 = var10000;
         int var5 = 5 >> 3;
         int var6 = var8.length > 0 ? 5 >> 3 : var2.length();

         for(int var9 = var6; var9 < var2.length(); var9 = var6) {
            if ((var6 = var2.indexOf("|", var1 + (2 ^ 3))) == -4 >> 2) {
               var6 = var2.length();
            }

            var8[var5] = new BWDHTeam();
            var8[var5].b(var2, var1, var6);
            ++var5;
            var1 = var6 + (2 ^ 3);
         }

         Class153.d(var8);
         ((Class11)var7.kc()[5 >> 2]).wy(3 & 4, var8);
      }
   }
}
