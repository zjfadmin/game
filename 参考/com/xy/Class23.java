package com.xy;

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
import com.xy.text.GameView;
import java.util.List;

public class Class23 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      GameView var10 = var3.gameView;
      int var13;
      int var30;
      if (var1.equals("userretreat")) {
         Class471 var18 = var10.mapScene;
         var13 = 2 & 5;
         int var23 = 3 ^ 3;

         int var24;
         for(var30 = var24 = 3 & 4; var30 != var2.length(); var30 = var24) {
            if ((var24 = var2.indexOf("|", var23 + (4 ^ 5))) == -4 >> 2) {
               var24 = var2.length();
            }

            var18.m(var2.substring(var23, var24));
            ++var13;
            var23 = var24 + (3 >> 1);
         }

      } else {
         int var8;
         int var27;
         if (var1.equals("intogame")) {
            GetClientUserMesageBean var17 = (GetClientUserMesageBean)Class695.b().fromJson(var2, GetClientUserMesageBean.class);
            var13 = 3 & 4;
            var10.isLoadMap = (boolean)(2 & 5);
            if (var17.getIsmap() == --1) {
               RoleShow var19 = var17.a(var10.roleData.getRoleId());
               var10.roleUnit.w(var19);
               var10.roleUnit.ac = 2 & 5;
               LoginResult var20 = var10.roleData.getLoginResult();
               var20.setX((long)var19.getX());
               var20.setY((long)var19.getY());
               var20.setMapid(var19.getMapid());
               var13 = var10.abd(var20.getMapid(), var20.getX().intValue(), var20.getY().intValue());
               var10.mapScene.ag(var10.roleUnit);
            }

            Class603 var21 = var10.getObjectArea();
            List var22;
            if ((var22 = var17.getRoleShows()) != null) {
               for(var30 = var8 = var22.size() - --1; var30 >= 0; var30 = var8) {
                  RoleShow var29;
                  if ((var29 = (RoleShow)var22.get(var8)) != null) {
                     var29.setColorTitle(var21.u(var29.getTitle()));
                     var10.mapScene.x(var29);
                  }

                  --var8;
               }
            }

            List var28;
            Class471 var32;
            if ((var28 = var17.getStallBeans()) != null) {
               for(var30 = var27 = var28.size() - (5 >> 2); var30 >= 0; var30 = var27) {
                  var32 = var10.mapScene;
                  Object var10001 = var28.get(var27);
                  --var27;
                  var32.ah((StallBean)var10001, var10);
               }
            }

            var32 = var10.mapScene;
            String var31 = var17.getMonster();
            int var10002;
            GameView var10003;
            if (var17.getIsmap() == 3 >> 1) {
               var10002 = 5 >> 2;
               var10003 = var10;
            } else {
               var10002 = 0;
               var10003 = var10;
            }

            var32.d(var31, (boolean)var10002, var10003);
            var10002 = 4 ^ 5;
            var10.im(var17.getSceneMsg());
            var10.isLoadMap = (boolean)var10002;
            if (var13 != 0 && var10.roleData.getPkSys().getPk1() > --4 && var10.roleData.getPkSys().getPk2() == 0) {
               if (var10.roleUnit.h() && !var10.mapScene.i && Class27.c.nextInt(116 & 111) < (62 & 95)) {
                  HandleOption.ab(15 & 127, var10);
                  return;
               }

               var10.f("你当前有" + var10.roleData.getPkSys().getPk1() + "点PK标志,进城有惊喜");
               return;
            }
         } else {
            if (var1.equals("monsterrefresh")) {
               var10.mapScene.d(var2, (boolean)(5 >> 3), var10);
               return;
            }

            if (var1.equals("scene")) {
               var10.im(var2);
               return;
            }

            String[] var4;
            if (var1.equals("gangstate")) {
               if (var10.scene == null || var10.scene instanceof BangFightScene) {
                  var4 = var2 != null ? var2.split("\\|") : null;
                  if (var10.scene == null) {
                     var10.scene = new BangFightScene(var4, var10);
                     return;
                  }

                  ((BangFightScene)var10.scene).g(var4);
                  return;
               }
            } else if (var1.equals("bangtz")) {
               if ((var10.scene == null || var10.scene instanceof BangFightScene) && (var4 = var2.split("\\|")).length > (4 ^ 5) && var10.getBattleScene() == null) {
                  ((BangFightScene)var10.scene).tz = new BangTZ(var4);
                  return;
               }
            } else {
               int var12;
               if (var1.equals("clickmonsters")) {
                  if ((var12 = var2.indexOf("|")) == -4 >> 2) {
                     return;
                  }

                  long var16;
                  if (var2.startsWith("FZ")) {
                     var13 = Integer.parseInt(var2.substring(--3, var12));
                     var16 = (long)(Integer.parseInt(var2.substring(var12 + (3 >> 1))) * (2026 & 31741)) + 500L;
                     petExchange var26;
                     if ((var26 = var10.getObjectArea().as(var13)) == null) {
                        return;
                     }

                     var10.getGameReadBar().setReadBar(var13, --2, "制作" + var26.getName(), (double)var16, Class280.l(), (Object)null);
                     return;
                  }

                  var13 = Integer.parseInt(var2.substring(3 & 4, var12));
                  if ((var12 = (var2 = var2.substring(var12 + (5 >> 2))).indexOf("|")) == -4 >> 2) {
                     return;
                  }

                  var16 = (long)(Integer.parseInt(var2.substring(3 & 4, var12)) * (21481 & 12286));
                  var2 = var2.substring(var12 + 1);
                  var10.getGameReadBar().setReadBar(var13, 1, var2, (double)var16, Class280.l(), (Object)null);
                  return;
               }

               Class183 var5;
               if (var1.equals("rolelevelup")) {
                  if ((var12 = var2.indexOf("|")) == -4 >> 2) {
                     return;
                  }

                  if ((var5 = var10.mapScene.a(var2.substring(0, var12))) == null) {
                     return;
                  }

                  if (var5 != var10.roleUnit) {
                     var5.r.setGrade(Class394.b(var2, var12 + 1, var2.length()));
                  }

                  var10.mapScene.j("升级", var5.ab, var5.al);
                  return;
               }

               if (var1.equals("upRoleShow")) {
                  RoleShow var14 = (RoleShow)Class695.b().fromJson(var2, RoleShow.class);
                  if ((var5 = var10.mapScene.a(var14.getRolename())) == null) {
                     return;
                  }

                  var14.setX(var5.r.getX());
                  var14.setY(var5.r.getY());
                  var5.w(var14);
                  return;
               }

               if (var1.equals("changerolename")) {
                  ChangeRoleNameBean var11;
                  if (!(var11 = (ChangeRoleNameBean)Class695.b().fromJson(var2, ChangeRoleNameBean.class)).a()) {
                     var10.f("你修改的名称已被其他玩家使用");
                     return;
                  }

                  if ((var5 = var10.mapScene.m(var11.getOldName())) == null) {
                     return;
                  }

                  var5.r.setRolename(var11.getNewName());
                  var5.ax(var11.getNewName());
                  var10.mapScene.ag(var5);
                  LoginResult var6 = var10.roleData.getLoginResult();
                  if (Class394.r(var11.getOldName(), var6.getRolename())) {
                     var6.setRolename(var11.getNewName());
                     GameView var10000;
                     if (var11.getRgid() != null) {
                        var10000 = var10;
                        var10.roleData.c(var11.getRgid());
                     } else {
                        var6.setMoney(var6.getMoney() - (62 & 95));
                        var10000 = var10;
                     }

                     var10000.setViewTitle();
                     return;
                  }

                  if (Class394.r(var11.getOldName(), var6.getMarryObject())) {
                     var6.setMarryObject(var11.getNewName());
                     return;
                  }
               } else if (var1.equals("mapScene")) {
                  if ((var12 = var2.indexOf("|")) == -4 >> 2) {
                     return;
                  }

                  var13 = Class394.b(var2, 0, var12++);
                  if (var13 == 1) {
                     String var15 = null;
                     String var7 = null;
                     var8 = 0;

                     byte var9;
                     for(var30 = var9 = 0; var30 < var2.length(); var30 = var27) {
                        if ((var27 = var2.indexOf("|", var12 + 1)) == -4 >> 2) {
                           var27 = var2.length();
                        }

                        if (var8 == 0) {
                           var15 = var2.substring(var12, var27);
                           var30 = var27;
                        } else {
                           if (var8 == 1) {
                              var7 = var2.substring(var12, var27);
                           }

                           var30 = var27;
                        }

                        ++var8;
                        var12 = var30 + 1;
                     }

                     Class183 var25 = var7 != null ? var10.mapScene.a(var7) : null;
                     if (var25 == null) {
                        return;
                     }

                     var10.mapScene.j(var15, var25.ab - (127 & 80) + Class27.c.nextInt(28856 & 4071), var25.al - (60 & 127) + Class27.c.nextInt(122 & 125));
                  }
               }
            }
         }

      }
   }
}
