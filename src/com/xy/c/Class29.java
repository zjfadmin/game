package com.xy.c;

import com.xy.bean.ChangeRoleNameBean;
import com.xy.bean.GetClientUserMesageBean;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.game.HandleOption;
import com.xy.readbean.petExchange;
import com.xy.scene.BangFightScene;
import com.xy.scene.BangTZ;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameReadBar;
import com.xy.text.GameView;
import java.util.List;

public class Class29 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      GameView var4 = var3.gameView;
      if (var1.equals("userretreat")) {
         com.xy.n.Class0 var22 = var4.mapScene;
         int var29 = 0;
         int var35 = 0;
         int var39;
         int var55 = var39 = 0;

         while (var55 != var2.length()) {
            String var68 = "J";
            if ((var39 = var2.indexOf("|", var35 + 1)) == -1) {
               var39 = var2.length();
            }

            var22.g(var2.substring(var35, var39));
            var29++;
            var35 = var39 + 1;
            var55 = var39;
         }
      } else {
         if (var1.equals("intogame")) {
            GetClientUserMesageBean var21 = com.xy.v.Class31.a().fromJson(var2, GetClientUserMesageBean.class);
            boolean var28 = false;
            var4.isLoadMap = false;
            if (var21.getIsmap() == 1) {
               RoleShow var33 = var21.a(var4.roleData.getRoleId());
               var4.roleUnit.bs(var33);
               var4.roleUnit.aa = 0;
               LoginResult var36 = var4.roleData.getLoginResult();
               var36.setX((long)var33.getX());
               var36.setY((long)var33.getY());
               var36.setMapid(var33.getMapid());
               var28 = var4.dk(var36.getMapid(), var36.getX().intValue(), var36.getY().intValue());
               var4.mapScene.n(var4.roleUnit);
            }

            List var34;
            int var37;
            if ((var34 = var21.getRoleShows()) != null) {
               for (int var51 = var37 = var34.size() - 1; var51 >= 0; var51 = --var37) {
                  RoleShow var43;
                  if ((var43 = (RoleShow)var34.get(var37)) != null) {
                     var4.mapScene.aa(var43);
                  }
               }
            }

            List var38;
            int var44;
            if ((var38 = var21.getStallBeans()) != null) {
               for (int var52 = var44 = var38.size() - 1; var52 >= 0; var52 = var44) {
                  com.xy.n.Class0 var53 = var4.mapScene;
                  Object var65 = var38.get(var44);
                  var44--;
                  var53.i((StallBean)var65, var4);
               }
            }

            com.xy.n.Class0 var54 = var4.mapScene;
            String var66 = var21.getMonster();
            boolean var69;
            GameView var10003;
            if (var21.getIsmap() == 1) {
               var69 = true;
               var10003 = var4;
            } else {
               var69 = false;
               var10003 = var4;
            }

            var54.s(var66, var69, var10003);
            var4.dq(var21.getSceneMsg());
            var4.isLoadMap = true;
            if (var28 && var4.roleData.getPkSys().getPk1() > 4 && var4.roleData.getPkSys().getPk2() == 0) {
               if (var4.roleUnit.bb() && !var4.mapScene.l && com.xy.v.Class0.a.nextInt(100) < 30) {
                  HandleOption.v(15, var4);
                  return;
               }

               String var71 = "佮异剃杘";
               StringBuilder var67 = new StringBuilder("你当前有").append(var4.roleData.getPkSys().getPk1());
               String var70 = "炏2}桥忡N迭垬朿您喪";
               var4._do(var67.append("点PK标志,进城有惊喜").toString());
               return;
            }
         } else {
            if (var1.equals("monsterrefresh")) {
               var4.mapScene.s(var2, false, var4);
               return;
            }

            if (var1.equals("scene")) {
               var4.dq(var2);
               return;
            }

            if (var1.equals("gangstate")) {
               if (var4.scene == null || var4.scene instanceof BangFightScene) {
                  String[] var50;
                  if (var2 != null) {
                     String var64 = "R-";
                     var50 = var2.split("\\|");
                  } else {
                     var50 = null;
                  }

                  String[] var20 = var50;
                  if (var4.scene == null) {
                     var4.scene = new BangFightScene(var20, var4);
                     return;
                  }

                  ((BangFightScene)var4.scene).j(var20);
                  return;
               }
            } else if (var1.equals("bangtz")) {
               if (var4.scene == null || var4.scene instanceof BangFightScene) {
                  String var10001 = ">J";
                  String[] var5;
                  if ((var5 = var2.split("\\|")).length > 1 && var4.getBattleScene() == null) {
                     ((BangFightScene)var4.scene).tz = new BangTZ(var5);
                     return;
                  }
               }
            } else {
               if (var1.equals("clickmonsters")) {
                  String var61 = "-";
                  int var18;
                  if ((var18 = var2.indexOf("|")) == -1) {
                     return;
                  }

                  var61 = "$l";
                  if (var2.startsWith("FZ")) {
                     int var27 = Integer.parseInt(var2.substring(3, var18));
                     long var32 = Integer.parseInt(var2.substring(var18 + 1)) * 1000 + 500L;
                     petExchange var42;
                     if ((var42 = var4.getObjectArea().e(var27)) == null) {
                        return;
                     }

                     GameReadBar var49 = var4.getGameReadBar();
                     String var10005 = "券伍";
                     var49.setReadBar(var27, 2, "制作" + var42.getName(), var32, com.xy.v.Class22.l(), null);
                     return;
                  }

                  int var26 = Integer.parseInt(var2.substring(0, var18));
                  String var11;
                  String var48 = var11 = var2.substring(var18 + 1);
                  var61 = "J";
                  if ((var18 = var48.indexOf("|")) == -1) {
                     return;
                  }

                  long var31 = Integer.parseInt(var11.substring(0, var18)) * 1000;
                  var2 = var11.substring(var18 + 1);
                  var4.getGameReadBar().setReadBar(var26, 1, var2, var31, com.xy.v.Class22.l(), null);
                  return;
               }

               if (var1.equals("rolelevelup")) {
                  String var59 = "-";
                  int var17;
                  if ((var17 = var2.indexOf("|")) == -1) {
                     return;
                  }

                  com.xy.d.Class8 var25;
                  if ((var25 = var4.mapScene.j(var2.substring(0, var17))) == null) {
                     return;
                  }

                  if (var25 != var4.roleUnit) {
                     var25.ap.setGrade(com.xy.v.Class12.ad(var2, var17 + 1, var2.length()));
                  }

                  var59 = "匥纑";
                  var4.mapScene.d("升级", var25.ae, var25.v);
                  return;
               }

               if (var1.equals("upRoleShow")) {
                  RoleShow var16 = com.xy.v.Class31.a().fromJson(var2, RoleShow.class);
                  com.xy.d.Class8 var24;
                  if ((var24 = var4.mapScene.j(var16.getRolename())) == null) {
                     return;
                  }

                  var16.setX(var24.ap.getX());
                  var16.setY(var24.ap.getY());
                  var24.bs(var16);
                  return;
               }

               if (var1.equals("changerolename")) {
                  ChangeRoleNameBean var13;
                  if (!(var13 = com.xy.v.Class31.a().fromJson(var2, ChangeRoleNameBean.class)).a()) {
                     String var56 = "佮便攷盕吃禡巼裺典亇玧寧佱畹";
                     var4._do("你修改的名称已被其他玩家使用");
                     return;
                  }

                  com.xy.d.Class8 var6;
                  if ((var6 = var4.mapScene.g(var13.getOldName())) == null) {
                     return;
                  }

                  var6.ap.setRolename(var13.getNewName());
                  var6.au(var13.getNewName());
                  var4.mapScene.n(var6);
                  LoginResult var7 = var4.roleData.getLoginResult();
                  if (com.xy.v.Class12.am(var13.getOldName(), var7.getRolename())) {
                     var7.setRolename(var13.getNewName());
                     GameView var10000;
                     if (var13.getRgid() != null) {
                        var10000 = var4;
                        var4.roleData.q(var13.getRgid());
                     } else {
                        var7.setMoney(var7.getMoney() - 30);
                        var10000 = var4;
                     }

                     var10000.setViewTitle();
                     return;
                  }

                  if (com.xy.v.Class12.am(var13.getOldName(), var7.getMarryObject())) {
                     var7.setMarryObject(var13.getNewName());
                     return;
                  }
               } else if (var1.equals("mapScene")) {
                  String var57 = "J";
                  int var14;
                  if ((var14 = var2.indexOf("|")) == -1) {
                     return;
                  }

                  int var23 = com.xy.v.Class12.ad(var2, 0, var14++);
                  if (var23 == 1) {
                     String var30 = null;
                     String var8 = null;
                     int var9 = 0;
                     int var10;
                     int var46 = var10 = 0;

                     while (var46 < var2.length()) {
                        var57 = "-";
                        if ((var10 = var2.indexOf("|", var14 + 1)) == -1) {
                           var10 = var2.length();
                        }

                        if (var9 == 0) {
                           var30 = var2.substring(var14, var10);
                           var46 = var10;
                        } else {
                           if (var9 == 1) {
                              var8 = var2.substring(var14, var10);
                           }

                           var46 = var10;
                        }

                        var9++;
                        var14 = var46 + 1;
                        var46 = var10;
                     }

                     com.xy.d.Class8 var41 = var8 != null ? var4.mapScene.j(var8) : null;
                     if (var41 == null) {
                        return;
                     }

                     var4.mapScene.d(var30, var41.ae - 80 + com.xy.v.Class0.a.nextInt(160), var41.v - 60 + com.xy.v.Class0.a.nextInt(120));
                  }
               }
            }
         }
      }
   }
}
