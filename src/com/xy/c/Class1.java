package com.xy.c;

import com.xy.a.v.Class38;
import com.xy.a.v.Class39;
import com.xy.a.v.Class45;
import com.xy.a.v.Class46;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
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

public class Class1 implements ServerAction {
   public void e(int var1, String var2, Activity var3, GameClient var4) {
      com.xy.a.v.Class27 var6;
      if ((var6 = (com.xy.a.v.Class27)var4.gameView.getFormManagement().l(176)) != null && var6.dx() == 2) {
         ArrayList var7 = new ArrayList();
         int var8 = 0;
         int var10000 = var1;

         while (var10000 < var2.length()) {
            String var10001 = "Z";
            int var9;
            if ((var9 = var2.indexOf("|", var1 + 1)) == -1) {
               var9 = var2.length();
            }

            this.k(var2, var1, var9, var7);
            var8++;
            var1 = var9 + 1;
            var10000 = var9;
         }

         ((Class45)var6.wf()[2]).fm(var7);
      }
   }

   public void f(int var1, int var2, String var3, Activity var4, GameClient var5) {
      com.xy.a.v.Class27 var7;
      if ((var7 = (com.xy.a.v.Class27)var5.gameView.getFormManagement().l(176)) != null && var7.dx() == 0) {
         BWDHRuleBattle[] var8 = new BWDHRuleBattle[var2 < var3.length() ? 1 + com.xy.v.Class12.al('|', var3, var2, var3.length()) : 0];
         int var9 = 0;
         int var10 = var8.length > 0 ? 0 : var3.length();
         int var10000 = var10;

         while (var10000 < var3.length()) {
            String var10001 = "Z";
            if ((var10 = var3.indexOf("|", var2 + 1)) == -1) {
               var10 = var3.length();
            }

            var8[var9] = new BWDHRuleBattle();
            var8[var9].d(var3, var2, var10);
            var9++;
            var2 = var10 + 1;
            var10000 = var10;
         }

         ((Class38)var7.wf()[0]).rp(var1 - 2, var8);
      }
   }

   public void g(int var1, String var2, Activity var3, GameClient var4) {
      com.xy.a.v.Class27 var6;
      if ((var6 = (com.xy.a.v.Class27)var4.gameView.getFormManagement().l(176)) != null && var6.dx() == 1) {
         BWDHTeam[] var7 = new BWDHTeam[var1 < var2.length() ? 1 + com.xy.v.Class12.al('|', var2, var1, var2.length()) : 0];
         int var8 = 0;
         int var9 = var7.length > 0 ? 0 : var2.length();
         int var10000 = var9;

         while (var10000 < var2.length()) {
            String var10001 = "E";
            if ((var9 = var2.indexOf("|", var1 + 1)) == -1) {
               var9 = var2.length();
            }

            var7[var8] = new BWDHTeam();
            var7[var8].b(var2, var1, var9);
            var8++;
            var1 = var9 + 1;
            var10000 = var9;
         }

         com.xy.v.Class6.c(var7);
         ((com.xy.a.v.Class23)var6.wf()[1]).rp(0, var7);
      }
   }

   public void h(String var1, GameClient var2) {
      GameView var3 = var2.gameView;
      String var10001 = "E";
      int var4;
      if ((var4 = var1.indexOf("|")) == -1) {
         var4 = var1.length();
      }

      int var5 = com.xy.v.Class12.ad(var1, 0, var4);
      Activity var6;
      if ((var6 = var3.getObjectArea().cd(var5)) != null) {
         var4++;
         if (var6.getModelId() == 2) {
            this.q(var4, var1, var6, var2);
         } else {
            if (var6.getModelId() == 3) {
               this.o(var4, var1, var6, var2);
            }
         }
      }
   }

   public void i(int var1, int var2, int var3, String var4, Activity var5, GameClient var6) {
      com.xy.a.v.Class27 var8;
      if ((var8 = (com.xy.a.v.Class27)var6.gameView.getFormManagement().l(176)) != null && var8.dx() == 1) {
         ArrayList var9 = new ArrayList();
         int var10 = 0;
         int var10000 = var3;

         while (var10000 < var4.length()) {
            String var10001 = "Z";
            int var11;
            if ((var11 = var4.indexOf("|", var3 + 1)) == -1) {
               var11 = var4.length();
            }

            new BWDHRuleBattle().c(var4, var3, var11, var9);
            var10++;
            var3 = var11 + 1;
            var10000 = var11;
         }

         BWDHRuleBattleRecord[] var12 = new BWDHRuleBattleRecord[var9.size()];

         int var13;
         for (int var15 = var13 = 0; var15 < var12.length; var15 = var13) {
            int var16 = var13;
            BWDHRuleBattleRecord var10002 = (BWDHRuleBattleRecord)var9.get(var13);
            var13++;
            var12[var16] = var10002;
         }

         com.xy.v.Class6.b(var12);
         com.xy.a.v.Class23 var14 = (com.xy.a.v.Class23)var8.wf()[1];
         if (var1 == 3) {
            var14.rq(var2, var12);
         } else {
            var14.rp(var1 - 2, var12);
         }
      }
   }

   public void j(int var1, int var2, String var3, Activity var4, GameClient var5) {
      com.xy.a.v.Class27 var7;
      if ((var7 = (com.xy.a.v.Class27)var5.gameView.getFormManagement().l(176)) != null && var7.dx() == 0) {
         BWDHRuleBattle[] var8 = new BWDHRuleBattle[var2 < var3.length() ? 1 + com.xy.v.Class12.al('|', var3, var2, var3.length()) : 0];
         int var9 = 0;
         int var10 = var8.length > 0 ? 0 : var3.length();
         int var10000 = var10;

         while (var10000 < var3.length()) {
            String var10001 = "E";
            if ((var10 = var3.indexOf("|", var2 + 1)) == -1) {
               var10 = var3.length();
            }

            var8[var9] = new BWDHRuleBattle(var3, var2, var10);
            var9++;
            var2 = var10 + 1;
            var10000 = var10;
         }

         ((Class38)var7.wf()[0]).gm(var1, var8);
      }
   }

   public static void c(String var0, GameView var1) {
      boolean var2 = var1.getObjectArea().s();
      int var3 = 0;
      RoleData var4 = var1.roleData;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var10000 = var6;

      while (var10000 < var0.length()) {
         String var10001 = "E";
         if ((var6 = var0.indexOf("|", var5 + 1)) == -1) {
            var6 = var0.length();
         }

         var10001 = "\u0005";
         if ((var7 = var0.indexOf("#", var5 + 1)) == -1 || var7 > var6) {
            var7 = var6;
         }

         label99: {
            int var8 = com.xy.v.Class12.ad(var0, var5, var7);
            Object var9;
            if ((var9 = var4.getActivity(var8)) == null) {
               Activity var10;
               if ((var10 = var1.getObjectArea().cd(var8)) == null) {
                  var10000 = var6;
                  break label99;
               }

               if (var10.getModelId() == 1 || var10.getModelId() == 2 || var10.getModelId() == 3 || var10.getModelId() == 5) {
                  var9 = new Activity2Role(null, 0, 0);
               }

               var4.f(var8, (ActivityRole)var9);
            }

            ((ActivityRole)var9).setValueByKey(var0, var7 + 1, var6);
            Activity var17 = var2 ? var1.getObjectArea().cd(var8) : null;
            if (var17 == null) {
               var10000 = var6;
            } else if (var17.getModelId() == 1) {
               var3 |= 1;
               var10000 = var6;
            } else if (var17.getModelId() == 2) {
               var3 |= 2;
               var10000 = var6;
            } else if (var17.getModelId() == 3) {
               var3 |= 4;
               var10000 = var6;
            } else {
               if (var17.getModelId() == 5) {
                  var3 |= 8;
               }

               var10000 = var6;
            }
         }

         var5 = var10000 + 1;
         var10000 = var6;
      }

      for (int var19 = var5 = 0; var19 < 4; var19 = ++var5) {
         if ((var3 >> var5 & 1) == 1) {
            if (var5 == 0) {
               com.xy.a.v.Class30 var13;
               if ((var13 = (com.xy.a.v.Class30)var1.getFormManagement().l(168)) != null) {
                  var13.f();
               }
            } else if (var5 == 1) {
               Class39 var14;
               if ((var14 = (Class39)var1.getFormManagement().l(167)) != null) {
                  var14.y(2);
               }
            } else {
               com.xy.a.v.Class24 var15;
               if (var5 == 3 && (var15 = (com.xy.a.v.Class24)var1.getFormManagement().l(186)) != null) {
                  var15.h();
               }
            }
         }
      }
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      if (var1.equals("activity")) {
         c(var2, var3.gameView);
      } else {
         if (var1.equals("activityS")) {
            this.h(var2, var3);
         }
      }
   }

   public void k(String var1, int var2, int var3, List<BWDHTeam> var4) {
      String var10001 = "\u001a";
      int var5;
      if ((var5 = var1.indexOf("#", var2 + 1)) == -1 || var5 > var3) {
         var5 = var3;
      }

      int var6 = com.xy.v.Class12.ad(var1, var2, var5);
      var2 = var5 + 1;
      int var7 = 0;
      int var10000 = var5;

      while (var10000 < var3) {
         var10001 = "\u0005";
         if ((var5 = var1.indexOf("#", var2 + 1)) == -1 || var5 > var3) {
            var5 = var3;
         }

         var10001 = "\u001f";
         if ((var7 = var1.indexOf("&", var2 + 1)) == -1 || var7 > var5) {
            var7 = var5;
         }

         BWDHTeam var8 = new BWDHTeam();
         var8.setId(com.xy.v.Class12.ad(var1, var2, var7));
         var8.setName(var1.substring(var7 + 1, var5));
         var8.setFlag(var6);
         var4.add(var8);
         var2 = var5 + 1;
         var10000 = var5;
      }
   }

   public void l(int var1, String var2, Activity var3, GameClient var4) {
      BWDHTeam var5 = new BWDHTeam();
      BWDHTeam var6 = new BWDHTeam();
      String var10001 = "Z";
      int var7;
      if ((var7 = var2.indexOf("|", var1 + 1)) == -1) {
         var7 = var2.length();
      }

      var5.setRoleShows(new RoleShow[com.xy.v.Class12.al('&', var2, var1, var7) - 1]);
      int var8 = 0;
      int var9;
      int var10000 = var9 = 0;

      while (var10000 < var7) {
         var10001 = "\u001f";
         if ((var9 = var2.indexOf("&", var1 + 1)) == -1 || var9 > var7) {
            var9 = var7;
         }

         if (var8 == 0) {
            var10000 = var9;
            var5.setId(com.xy.v.Class12.ad(var2, var1, var9));
         } else if (var8 == 1) {
            var10000 = var9;
            var5.setName(var2.substring(var1, var9));
         } else {
            var5.getRoleShows()[var8 - 2] = new RoleShow();
            var5.getRoleShows()[var8 - 2].d(var2, var1, var9);
            var10000 = var9;
         }

         var8++;
         var1 = var10000 + 1;
         var10000 = var9;
      }

      var1 = var7 + 1;
      var7 = var2.length();
      var6.setRoleShows(new RoleShow[com.xy.v.Class12.al('&', var2, var1, var7) - 1]);
      var8 = 0;
      int var15;
      var10000 = var15 = 0;

      while (var10000 < var7) {
         var10001 = "\u0000";
         if ((var15 = var2.indexOf("&", var1 + 1)) == -1 || var15 > var7) {
            var15 = var7;
         }

         if (var8 == 0) {
            var10000 = var15;
            var6.setId(com.xy.v.Class12.ad(var2, var1, var15));
         } else if (var8 == 1) {
            var10000 = var15;
            var6.setName(var2.substring(var1, var15));
         } else {
            var6.getRoleShows()[var8 - 2] = new RoleShow();
            var6.getRoleShows()[var8 - 2].d(var2, var1, var15);
            var10000 = var15;
         }

         var8++;
         var1 = var10000 + 1;
         var10000 = var15;
      }

      GameView var13 = var4.gameView;
      if (var5.a(var13.roleData.getLoginResult().getRole_id()) == -1) {
         BWDHTeam var20 = var5;
         var5 = var6;
         var6 = var20;
      }

      ((com.xy.a.v.Class8)var13.getFormManagement().j(177)).hp(var5, var6);
   }

   public void m(int var1, String var2, Activity var3, GameClient var4) {
      com.xy.a.v.Class27 var6;
      if ((var6 = (com.xy.a.v.Class27)var4.gameView.getFormManagement().l(176)) != null && var6.dx() == 0) {
         BWDHTeam[] var7 = new BWDHTeam[var1 < var2.length() ? 1 + com.xy.v.Class12.al('|', var2, var1, var2.length()) : 0];
         int var8 = 0;
         int var9 = var7.length > 0 ? 0 : var2.length();
         int var10 = 0;
         int var10000 = var9;

         while (var10000 < var2.length()) {
            String var10001 = "Z";
            if ((var9 = var2.indexOf("|", var1 + 1)) == -1) {
               var9 = var2.length();
            }

            var10001 = "\u001a";
            if ((var10 = var2.indexOf("#", var1 + 1)) == -1 || var10 > var9) {
               var10 = var9;
            }

            var7[var8] = new BWDHTeam();
            var7[var8].setId(com.xy.v.Class12.ad(var2, var1, var10));
            var7[var8].setName(var2.substring(var10 + 1, var9));
            var8++;
            var1 = var9 + 1;
            var10000 = var9;
         }

         ((Class38)var6.wf()[0]).rp(0, var7);
      }
   }

   public void n(int var1, String var2, Activity var3, GameClient var4) {
      boolean var5 = true;
      int var6 = 0;
      int var7 = 0;
      String var8 = null;
      BWDHTeam var9;
      (var9 = new BWDHTeam()).setData2(new int[6]);
      BWDHTeam var10 = new BWDHTeam();
      var10.setData2(new int[6]);
      String var10005 = "Z";
      int var11 = var2.indexOf("|", var1 + 1);
      var6 = com.xy.v.Class12.ad(var2, var1, var11);
      var1 = var11 + 1;
      String var10003 = "E";
      var11 = var2.indexOf("|", var1 + 1);
      var7 = com.xy.v.Class12.ad(var2, var1, var11);
      var1 = var11 + 1;
      String var10001 = "Z";
      var11 = var2.indexOf("|", var1 + 1);
      int var12 = 0;
      int var13;
      int var10000 = var13 = 0;

      while (var10000 < var11) {
         var10001 = "\u001a";
         if ((var13 = var2.indexOf("#", var1 + 1)) == -1 || var13 > var11) {
            var13 = var11;
         }

         if (var12 == 0) {
            var10000 = var13;
            var9.setId(com.xy.v.Class12.ad(var2, var1, var13));
         } else if (var12 == 1) {
            var10000 = var13;
            var9.setName(var2.substring(var1, var13));
         } else {
            var9.getData2()[var12 - 2] = com.xy.v.Class12.ad(var2, var1, var13);
            var10000 = var13;
         }

         var12++;
         var1 = var10000 + 1;
         var10000 = var13;
      }

      var1 = var11 + 1;
      var10001 = "Z";
      if ((var11 = var2.indexOf("|", var1 + 1)) == -1) {
         var11 = var2.length();
      }

      var12 = 0;
      int var28;
      var10000 = var28 = 0;

      while (var10000 < var11) {
         var10001 = "\u001a";
         if ((var28 = var2.indexOf("#", var1 + 1)) == -1 || var28 > var11) {
            var28 = var11;
         }

         if (var12 == 0) {
            var10000 = var28;
            var10.setId(com.xy.v.Class12.ad(var2, var1, var28));
         } else if (var12 == 1) {
            var10000 = var28;
            var10.setName(var2.substring(var1, var28));
         } else {
            var10.getData2()[var12 - 2] = com.xy.v.Class12.ad(var2, var1, var28);
            var10000 = var28;
         }

         var12++;
         var1 = var10000 + 1;
         var10000 = var28;
      }

      if ((var1 = var11 + 1) < var2.length()) {
         var8 = var2.substring(var1);
      }

      GameView var26 = var4.gameView;
      ActivityRole var30;
      long var14 = (var30 = var4.gameView.roleData.getActivity(var3.getId())) != null ? var30.getValueByKey(1) : 0L;
      if (var14 != var9.getId()) {
         var5 = false;
         BWDHTeam var34 = var9;
         var9 = var10;
         var10 = var34;
      }

      ((com.xy.a.v.Class34)var26.getFormManagement().j(178)).yl(var5, var6, var7, var9, var10, var8);
   }

   public void o(int var1, String var2, Activity var3, GameClient var4) {
      char var5;
      if ((var5 = var2.charAt(var1)) != 'R' && var5 != 'M') {
         if (var5 == 'T' || var5 == 't') {
            String var36 = "Z";
            int var15;
            if ((var15 = var2.indexOf("|", var1 + 1)) == -1) {
               var15 = var2.length();
            }

            int var17 = com.xy.v.Class12.ad(var2, var1 + 1, var15);
            BWDHTeam var20 = new BWDHTeam();
            var20.setId(var17);
            this.p(var5, var15 + 1, var2, var20, var3, var4);
            return;
         }

         if (var5 == 'N') {
            String var33 = "E";
            int var14;
            if ((var14 = var2.indexOf("|", var1 + 1)) == -1) {
               var14 = var2.length();
            }

            int var16;
            if ((var16 = com.xy.v.Class12.ad(var2, var1 + 1, var14)) == 2) {
               var1 = var14 + 1;
               int[] var19 = new int[3];
               int var22 = 0;
               int var26;
               int var31 = var26 = 0;

               while (var31 < var2.length()) {
                  var33 = "\u0005";
                  if ((var26 = var2.indexOf("#", var1 + 1)) == -1) {
                     var26 = var2.length();
                  }

                  if (var22 < var19.length) {
                     var19[var22] = com.xy.v.Class12.ad(var2, var1, var26);
                  }

                  var22++;
                  var1 = var26 + 1;
                  var31 = var26;
               }

               ((com.xy.a.Class6)var4.gameView.getFormManagement().j(27)).cf(var3.getId(), var19);
               return;
            }

            var1 = var14 + 1;
            int[] var18 = new int[6];
            String var21 = null;
            int var24 = 0;
            int var11;
            int var30 = var11 = 0;

            while (var30 < var2.length()) {
               var33 = "\u001a";
               if ((var11 = var2.indexOf("#", var1 + 1)) == -1) {
                  var11 = var2.length();
               }

               if (var24 >= var18.length) {
                  var21 = var2.substring(var1);
                  break;
               }

               var18[var24] = com.xy.v.Class12.ad(var2, var1, var11);
               var24++;
               var1 = var11 + 1;
               var30 = var11;
            }

            Point var25 = new Point(var16, var18[0]);
            ((com.xy.a.Class6)var4.gameView.getFormManagement().j(27)).bs(var3.getId(), var25, var18, var21);
            return;
         }

         if (var5 == 'B') {
            this.l(var1 + 1, var2, var3, var4);
            return;
         }

         if (var5 == 'b') {
            this.n(var1 + 1, var2, var3, var4);
            return;
         }

         if (var5 == 'P') {
            this.e(var1 + 2, var2, var3, var4);
         }
      } else {
         String var10001 = "Z";
         int var6;
         if ((var6 = var2.indexOf("|", var1 + 1)) == -1) {
            var6 = var2.length();
         }

         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10;
         int var10000 = var10 = 0;

         while (var10000 < var6) {
            var10001 = "\u001a";
            if ((var10 = var2.indexOf("#", var1 + 1)) == -1 || var10 > var6) {
               var10 = var6;
            }

            if (var9 == 0) {
               var7 = com.xy.v.Class12.ad(var2, var1 + 1, var10);
               var10000 = var10;
            } else {
               if (var9 == 1) {
                  var8 = com.xy.v.Class12.ad(var2, var1, var10);
               }

               var10000 = var10;
            }

            var9++;
            var1 = var10000 + 1;
            var10000 = var10;
         }

         if (var5 == 'R') {
            if (var7 == 2) {
               this.m(var6 + 1, var2, var3, var4);
               return;
            }

            if (var7 == 3) {
               this.j(var8, var6 + 1, var2, var3, var4);
               return;
            }

            if (var7 == 4 || var7 == 5) {
               this.f(var7, var6 + 1, var2, var3, var4);
               return;
            }
         } else if (var5 == 'M') {
            if (var7 == 2) {
               this.g(var6 + 1, var2, var3, var4);
               return;
            }

            if (var7 == 3 || var7 == 4 || var7 == 5) {
               this.i(var7, var8, var6 + 1, var2, var3, var4);
               return;
            }
         }
      }
   }

   public void p(char var1, int var2, String var3, BWDHTeam var4, Activity var5, GameClient var6) {
      GameView var7 = var6.gameView;
      RoleShow[] var8 = new RoleShow[var2 < var3.length() ? com.xy.v.Class12.al('|', var3, var2, var3.length()) : 0];
      int var9 = 0;
      int var10 = var8.length > 0 ? 0 : var3.length();
      int var10000 = var10;

      while (var10000 < var3.length()) {
         String var10001 = "E";
         if ((var10 = var3.indexOf("|", var2 + 1)) == -1) {
            var10 = var3.length();
         }

         if (var9 == 0) {
            var10000 = var10;
            var4.setName(var3.substring(var2, var10));
         } else {
            var8[var9 - 1] = new RoleShow();
            var8[var9 - 1].d(var3, var2, var10);
            var10000 = var10;
         }

         var9++;
         var2 = var10000 + 1;
         var10000 = var10;
      }

      var4.setRoleShows(var8);
      if (var1 == 'T') {
         com.xy.a.v.Class27 var11;
         if ((var11 = (com.xy.a.v.Class27)var7.getFormManagement().l(176)) == null) {
            return;
         }

         if (var11.dx() == 0) {
            ((Class38)var11.wf()[0]).hk(var4);
            return;
         }
      } else if (var1 == 't') {
         ((com.xy.a.v.Class7)var7.getFormManagement().j(179)).hk(var4);
      }
   }

   public void q(int var1, String var2, Activity var3, GameClient var4) {
      GameView var5 = var4.gameView;
      char var6 = var2.charAt(var1);
      String var10001 = "Z";
      int var7;
      if ((var7 = var2.indexOf("|", var1 + 1)) == -1) {
         var7 = var2.length();
      }

      int var8 = com.xy.v.Class12.ad(var2, var1 + 1, var7);
      var1 = var7 + 1;
      int var16 = 0;
      if (var6 == 'L') {
         ((Class46)var5.getFormManagement().j(169)).aih(var2, var1);
      } else {
         if (var6 == 'S') {
            Class39 var9;
            if ((var9 = (Class39)var5.getFormManagement().l(167)) == null) {
               return;
            }

            com.xy.a.v.Class28 var10;
            com.xy.a.v.Class16 var11 = (var10 = (com.xy.a.v.Class28)var9.acn(2, var3.getId())) != null ? var10.wl() : null;
            if (var11 == null || !var11.isVisible() || var11.il() != var8) {
               return;
            }

            int[] var12 = var1 < var2.length() ? new int[1 + com.xy.v.Class12.al(',', var2, var1, var2.length())] : null;
            int var13 = 0;
            int var14 = var12 != null ? var12.length : 0;

            for (int var10000 = var13; var10000 < var14; var10000 = var13) {
               if ((var16 = var2.indexOf(",", var1 + 1)) == -1 || var16 > var2.length()) {
                  var16 = var2.length();
               }

               var12[var13] = com.xy.v.Class12.ad(var2, var1, var16);
               var13++;
               var1 = var16 + 1;
            }

            var11.ne(var12);
         }
      }
   }
}
