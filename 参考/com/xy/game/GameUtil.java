package com.xy.game;

import com.xy.cN;
import com.xy.cX;
import com.xy.hd;
import com.xy.ii;
import com.xy.lI;
import com.xy.lg;
import com.xy.mi;
import com.xy.bean.Coordinates;
import com.xy.bean.PathPoint;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleMoveBean;
import com.xy.bean.RoleShow;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.readbean.Door;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.TaskData;
import com.xy.readbean.Title;
import com.xy.richtext.InputBean;
import com.xy.scene.BangFightScene;
import com.xy.script.ScriptOpen;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameUtil {
   public static final int CONFIRM_BAO_Grid_FUSHI = 5;
   public static final int CONFIRM_BAO_TUPO = 9;
   public static final int CONFIRM_PET_JPDTL = 31;
   public static final int CONFIRM_GAME_LB_BUY = 87;
   public static final int CONFIRM_PAL_JH = 23;
   public static final int CONFIRM_BATTLE_TX = 37;
   public static final int CONFIRM_GANG_TR = 26;
   public static final int CONFIRM_GAME_XY_BUY = 29;
   public static final int EXCHANGE_0_CARD_GN = 81;
   public static final int CONFIRM_BEAU_BUY = 35;
   public static final int CONFIRM_STARCARD_XZ = 20;
   public static final int CONFIRM_GOOD_DELETE = 1;
   public static final int EXCHANGE_4_CARD_JF = 85;
   public static final int CONFIRM_BAO_Grid_SKILL = 6;
   public static final int CONFIRM_XQ_FJ = 22;
   public static final int CONFIRM_PET_SKILL_DELETE = 12;
   public static final int CONFIRM_PET_DELETE = 11;
   public static final int CONFIRM_GAME_RWX = 28;
   public static final int CONFIRM_STARCARD_DEPOSIT = 2;
   public static final String ACTIVITY_CHONGJIPACK_TIME = "限时礼包";
   public static final int CONFIRM_TYC_ADD = 38;
   public static final int CONFIRM_ROLE_RACECHANGE = 89;
   public static final int CONFIRM_ROLE_TYC_WASHPOINT = 15;
   public static final int CONFIRM_GANG_TC = 24;
   public static final int CONFIRM_TASK_BUY = 17;
   public static final int CONFIRM_GEM_CX = 19;
   public static final int CONFIRM_BAO_SKILL_DELETE = 7;
   public static final int CONFIRM_TYC_SAVE = 39;
   public static final int CONFIRM_ROLE_GANG_WASHPOINT = 16;
   public static final int CONFIRM_BABY_DELETE = 4;
   public static final int CONFIRM_BABY_ADD = 3;
   public static final int CONFIRM_BEAU = 34;
   public static final int EXCHANGE_3_CARD_JJ = 84;
   public static final String BEAU_TIME = "靓号";
   public static final int EXCHANGE_5_ZM = 86;
   public static final int CONFIRM_BAO_DELETE = 8;
   public static final int CONFIRM_GEM_JD = 18;
   public static final int CONFIRM_MOUNT_SH_GZ = 32;
   public static final int CONFIRM_GAME_BABY_FLHT = 30;
   public static final int CONFIRM_GANG_TW = 25;
   public static final int CONFIRM_XUANBAO_YIN = 36;
   public static final int EXCHANGE_1_CARD_XZ = 82;
   public static final int EXCHANGE_2 = 83;
   public static final int CONFIRM_GAME_EXIT = 27;
   public static final int CONFIRM_MOUNT_DELETE = 14;
   public static final int CONFIRM_GAME_ACTIVITY = 88;
   public static final int CONFIRM_PET_LX_WASHPOINT = 13;
   public static final int CONFIRM_TRANS = 21;
   public static final int CONFIRM_BAO_KX = 10;
   public static final int CONFIRM_BWDH_ENROLL = 33;

   public static void a(int var0, int var1, int var2, GameView var3) {
      var3.automation.n((boolean)(3 & 4), 3 & 4);
      f(var0, var1, var2, (boolean)(5 >> 3), var3);
   }

   public static void b(List<PathPoint> var0, GameView var1) {
      if (var0 != null) {
         RoleMoveBean var2 = new RoleMoveBean();
         var2.setPaths(var0);
         String var3 = Agreement.getSendText("move", mi.b().toJson(var2));
         var1.getClient().d(var3);
         var1.roleUnit.bs(var0, var1.roleUnit.r.getSp());
      }
   }

   public static boolean c(int var0, int[] var1) {
      int var2 = cX.d(var0);
      int var3 = cX.g(var0);
      if (var2 >= var1[3 >> 1] && var2 <= var1[--3]) {
         if (var3 < var1[3 & 4]) {
            return (boolean)(3 >> 2);
         } else {
            return var3 <= var1[5 >> 1] && (var3 != var1[--2] || var2 <= var1[--4]);
         }
      } else {
         return false;
      }
   }

   public static void d(InputBean var0, GameView var1) {
      var0.setM((boolean)(3 & 4));
      if (var0.getType() == (3 & 5)) {
         cN var6 = (cN)var1.getFormManagement().e(79 & 125);
         String var9 = var0.getName().substring(2 ^ 3, var0.getName().length() - (2 ^ 3));
         var6.eb(var0.getId(), var9);
      } else {
         String var2;
         if (var0.getType() != (1 ^ 3) && var0.getType() != --3 && var0.getType() != --4) {
            if (var0.getType() == (79 & 63)) {
               var2 = Agreement.getSendTextAES("stallget", var0.getId().toString());
               var1.getClient().d(var2);
            } else {
               if (var0.getType() == (122 & 15) || var0.getType() == (117 & 30) || var0.getType() == (31 & 117) || var0.getType() == (126 & 23) || var0.getType() == (87 & 63) || var0.getType() == (29 & 122) || var0.getType() == (25 & 127) || var0.getType() == (59 & 94) || var0.getType() == (91 & 63) || var0.getType() == (92 & 63)) {
                  if (var1.getBattleScene() != null) {
                     return;
                  }

                  Coordinates var4;
                  if ((var4 = var0.getZb()) != null) {
                     RoleShow var3 = var1.roleUnit.r;
                     List var5;
                     if ((var5 = var1.getObjectArea().ca().d(var3.getMapid().intValue(), var3.getX(), var3.getY(), 3 & 4, var4.getMapID(), var4.getX(), var4.getY(), 3 & 4, 3 & 4, var1.roleData)) == null) {
                        var1.f("你所在位置无法达到目的地");
                        return;
                     }

                     if (var0.getType() == (61 & 87) || var0.getType() == (31 & 118) || var0.getType() == (55 & 95) || var0.getType() == (25 & 127) || var0.getType() == 27) {
                        int var7 = var0.getType() - 20;
                        ScriptOpen var10000 = new ScriptOpen;
                        byte var10002;
                        InputBean var10003;
                        if (var7 == (2 ^ 3)) {
                           var10002 = 14;
                           var10003 = var0;
                        } else {
                           var10002 = 11;
                           var10003 = var0;
                        }

                        var10000.<init>(var10002, var10003.getId().longValue());
                        ScriptOpen var8 = var10000;
                        var5.add(3 >> 2, var8);
                     }

                     var1.automation.b(var5);
                  }
               }

            }
         } else {
            var2 = Agreement.getSendTextAES("richm", mi.b().toJson(var0));
            var1.getClient().d(var2);
         }
      }
   }

   public static String getRoleSkin(String var0, List<String> var1, RoleShow var2, RoleData var3) {
      StringBuffer var4 = new StringBuffer();
      RoleData var15;
      if (var0 != null && !var0.equals("")) {
         var15 = var3;
         var4.append("S");
         var4.append(var0);
      } else {
         if (var3.goodChoses[3 & 4] != null) {
            Goodstable var10000 = var3.getGoodEquip(var3.goodChoses[3 ^ 3]);
            long var6 = var2.getSpecies_id().longValue();
            long var8;
            if ((var8 = (long)e(Integer.parseInt(var10000.getSkin()))) != 0L) {
               var8 += 18L;
               var4.append("S");
               var4.append(var8 << (102 & 57) | var6);
            }
         }

         var15 = var3;
      }

      int var5;
      int var16;
      StringBuffer var17;
      List var18;
      label132: {
         if (var15.getGameView().getClient().gameType == 5 >> 1) {
            for(var16 = var5 = 3 & 4; var16 <= 5; var16 = var5) {
               String var7;
               Goodstable var10;
               if (var5 != --4 && var3.goodChoses[var5] != null && GoodType.an((var10 = var3.getGoodEquip(var3.goodChoses[var5])).getType()) && (var7 = hd.d(var10.getValue(), "阶数=", "|")) != null && Integer.parseInt(var7) >= (47 & 86)) {
                  RoleTxBean var14 = var3.getObjectArea().bw(11767 & 22205);
                  if (var4.length() != 0) {
                     var4.append("|");
                  }

                  if (var14.getRdType() == (2 ^ 3)) {
                     var17 = var4;
                     var4.append("X");
                  } else if (var14.getRdType() == (1 ^ 3)) {
                     var17 = var4;
                     var4.append("P");
                  } else {
                     var17 = var4;
                     var4.append("J");
                  }

                  var17.append(var14.getRdId());
                  if (var14.getRdType() == --1 || var14.getRdType() == 5 >> 1) {
                     var4.append("_");
                     var4.append(var14.getRdStatues() - var14.getRdType());
                     var18 = var1;
                     break label132;
                  }
                  break;
               }

               ++var5;
            }
         }

         var18 = var1;
      }

      if (var18 != null) {
         for(var16 = var5 = 3 & 4; var16 < var1.size(); var16 = var5) {
            int var12 = Integer.parseInt((String)var1.get(var5));
            RoleTxBean var13;
            if ((var13 = var3.getObjectArea().bw(var12)) != null) {
               if (var4.length() != 0) {
                  var4.append("|");
               }

               if (var13.getRdType() == (2 ^ 3)) {
                  var17 = var4;
                  var4.append("X");
               } else if (var13.getRdType() == 5 >> 1) {
                  var17 = var4;
                  var4.append("P");
               } else {
                  var17 = var4;
                  var4.append("J");
               }

               var17.append(var13.getRdId());
               if (var13.getRdType() == (3 & 5) || var13.getRdType() == (1 ^ 3)) {
                  var4.append("_");
                  var4.append(var13.getRdStatues() - var13.getRdType());
               }
            }

            ++var5;
         }
      }

      Title var11;
      if (var2.getTitle() != null && (var11 = var3.getObjectArea().a(var2.getTitle())) != null && var11.getSkin() != null) {
         if (var4.length() != 0) {
            var4.append("|");
         }

         var4.append("C");
         var4.append(var11.getSkin());
      }

      if (var3.goodChoses[12 & 127] != null) {
         if (var4.length() != 0) {
            var4.append("|");
         }

         var4.append("B");
         var4.append(var3.getGoodEquip(var3.goodChoses[92 & 47]).getSkin());
      }

      return var4.toString();
   }

   public static int e(int var0) {
      if ((var0 < (20094 & 14273) || var0 > (14287 & 20095)) && var0 != (8189 & 30678) && var0 != (32734 & 7039)) {
         if ((var0 < (30586 & 3581) || var0 > (13799 & 20383)) && var0 != (16347 & 22526) && var0 != (32622 & 7157)) {
            if ((var0 < (14319 & 19548) || var0 > (15999 & 17883)) && var0 != (22524 & 16367) && var0 != (32749 & 7039)) {
               if ((var0 < (16062 & 17905) || var0 > (13823 & 20159)) && var0 != (16366 & 22523) && var0 != (31614 & 8175)) {
                  if ((var0 < 2200 || var0 > 2215) && var0 != 6109 && var0 != 7016) {
                     if ((var0 < 2400 || var0 > 2415) && var0 != 6119 && var0 != 7020) {
                        if ((var0 < 1300 || var0 > 1315) && var0 != 6103 && var0 != 7009) {
                           if ((var0 < 1700 || var0 > 1715) && var0 != 6102 && var0 != 7008) {
                              if ((var0 < 2100 || var0 > 2115) && var0 != 7013 && var0 != 6105) {
                                 if ((var0 < 1000 || var0 > 1015) && var0 != 6118 && var0 != 7007) {
                                    if (var0 != 7019 && var0 != 6120) {
                                       if ((var0 < 1800 || var0 > 1815) && var0 != 6104 && var0 != 7011) {
                                          if ((var0 < 1900 || var0 > 1915) && var0 != 6108 && var0 != 7017) {
                                             if ((var0 < 2200 || var0 > 2215) && var0 != 6109 && var0 != 7010) {
                                                if ((var0 < 1500 || var0 > 1515) && var0 != 7014 && var0 != 6117) {
                                                   if ((var0 < 2000 || var0 > 2015) && var0 != 6107 && var0 != 7015) {
                                                      if (var0 != 7018 && var0 != 6121) {
                                                         return (var0 < 2617 || var0 > 2632) && var0 != 6125 && var0 != 7023 ? 0 : 18;
                                                      } else {
                                                         return 17;
                                                      }
                                                   } else {
                                                      return 16;
                                                   }
                                                } else {
                                                   return 15;
                                                }
                                             } else {
                                                return 14;
                                             }
                                          } else {
                                             return 13;
                                          }
                                       } else {
                                          return 12;
                                       }
                                    } else {
                                       return 11;
                                    }
                                 } else {
                                    return 10;
                                 }
                              } else {
                                 return 9;
                              }
                           } else {
                              return 8;
                           }
                        } else {
                           return 7;
                        }
                     } else {
                        return 6;
                     }
                  } else {
                     return 5;
                  }
               } else {
                  return 4;
               }
            } else {
               return 3;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   public static void f(int var0, int var1, int var2, boolean var3, GameView var4) {
      var4.flyEquip = null;
      if (!var4.getClient().s()) {
         var4.f("重连中,时间若太长重上");
      } else if (var4.scene != null && var4.scene instanceof BangFightScene && !((BangFightScene)var4.scene).i()) {
         var4.fw("你当前状态被限制");
      } else {
         if (var0 > (1 ^ 3) && var0 < var4.mapScene.t() / (119 & 28) - (5 >> 1) && var1 > 5 >> 1 && var1 < var4.mapScene.ab() / (118 & 29) - --2) {
            var4.mapScene.j("点击", var0 * (29 & 118), var1 * (60 & 87));
         }

         RoleShow var7;
         if ((var7 = var4.roleUnit.r).getFighting() == 0 && var7.getBooth_id() == null && var4.roleUnit.h()) {
            int var5 = var4.mapScene.ad().getMapMove();
            int var6 = var4.roleUnit.aa(var4) ? --1 : 0;
            if (var5 >= var6) {
               var6 = 3 >> 2;
            }

            if (var3 && var4.mapScene.f(var0, var1, 3 >> 2)) {
               var6 = --1;
            }

            int var8 = var7.getX() / (126 & 21);
            var5 = var7.getY() / (54 & 93);
            if (var8 != var0 || var5 != var1) {
               ArrayList var9;
               if (var6 == 0) {
                  if (var4.mapScene.f(var8, var5, 3 ^ 3)) {
                     var9 = new ArrayList();
                     var9.add(new PathPoint(var7.getX(), var7.getY()));
                     var9.add(new PathPoint(var0 * (85 & 62) + (11 & 126), var1 * (61 & 86) + (30 & 107)));
                     b(var9, var4);
                  } else {
                     b(lI.j(var8, var5, 3 & 4, var0, var1, 3 & 4, var4.roleUnit, var4.mapCamera.r.r), var4);
                  }
               } else {
                  (var9 = new ArrayList()).add(new PathPoint(var7.getX(), var7.getY()));
                  var9.add(new PathPoint(var0 * (61 & 86) + (62 & 75), var1 * (62 & 85) + (26 & 111)));
                  b(var9, var4);
               }
            }
         }
      }
   }

   public static Map<Integer, TaskRecord> g(RoleData var0) {
      HashMap var5 = new HashMap();
      PrivateData var2;
      if (hd.o((var2 = var0.getPrivateData()).getTaskComplete())) {
         return var5;
      } else {
         String var9 = var2.getTaskComplete();
         int var4 = 3 ^ 3;

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 != var9.length(); var10000 = var3) {
            if ((var3 = var9.indexOf("|", var4 + --1)) == -4 >> 2) {
               var3 = var9.length();
            }

            label40: {
               try {
                  String[] var1 = var9.substring(var4, var3).split("-");
                  TaskRecord var6 = new TaskRecord(Integer.parseInt(var1[3 >> 2]));
                  var10000 = --3;
                  int var10003 = --2;
                  var6.a(Integer.parseInt(var1[2 ^ 3]));
                  var6.c(Integer.parseInt(var1[var10003]));
                  int var7 = var10000;

                  while(true) {
                     if (var10000 >= var1.length) {
                        var5.put(var6.getTaskId(), var6);
                        break;
                     }

                     if (var1[var7].startsWith("B")) {
                        var6.setbSum(Integer.parseInt(var1[var7].substring(3 & 5)));
                     } else {
                        var6.setNewID(Integer.parseInt(var1[var7]));
                     }

                     ++var7;
                     var10000 = var7;
                  }
               } catch (Exception var8) {
                  var10000 = var3;
                  var8.printStackTrace();
                  break label40;
               }

               var10000 = var3;
            }

            var4 = var10000 + 1;
         }

         return var5;
      }
   }

   public static void h(FormulaNum[] var0, ii var1, lg var2) {
      int var3 = 3 >> 2;
      int var4 = var0 != null ? var0.length : 0;

      for(int var10000 = var3; var10000 < var4; var10000 = var3) {
         FormulaNum var5 = var0[var3];
         int var6 = 2 & 5;
         int var7 = var5.getSize();

         for(var10000 = var6; var10000 < var7; var10000 = var6) {
            long var8 = var5.getZhi(var6);
            NpcInfoBean var13;
            if ((var13 = var2.ck(String.valueOf(var8))) != null) {
               if (var13.getNpctable().getNpctype().equals("2") && var13.getDoors() == null) {
                  ArrayList var9 = new ArrayList();
                  if (var13.getNpctable().getNpcway() != null) {
                     List var10 = hd.ae(var13.getNpctable().getNpcway());

                     int var11;
                     for(var10000 = var11 = 5 >> 3; var10000 < var10.size(); var10000 = var11) {
                        Door var12;
                        if ((var12 = var2.bo((String)var10.get(var11))) != null) {
                           var9.add(var12);
                        }

                        ++var11;
                     }
                  }

                  var13.setDoors(var9);
               }

               var1.e(var13);
            }

            ++var6;
         }

         ++var3;
      }

   }

   public static List<Task> i(RoleData var0) {
      ArrayList var5 = new ArrayList();
      lg var7 = var0.getObjectArea();
      PrivateData var3;
      if (hd.o((var3 = var0.getPrivateData()).getTaskData())) {
         return var5;
      } else {
         String var11 = var3.getTaskData();
         int var4 = 3 ^ 3;

         int var1;
         for(int var10000 = var1 = 5 >> 3; var10000 != var11.length(); var10000 = var1) {
            if ((var1 = var11.indexOf("|", var4 + (5 >> 2))) == -4 >> 2) {
               var1 = var11.length();
            }

            String[] var6 = var11.substring(var4, var1).split("=");
            int var2 = Integer.parseInt(var6[2 & 5]);
            int var8 = Integer.parseInt(var6[5 >> 2]);
            TaskData var9;
            if ((var9 = var7.am(var2)) == null) {
               var10000 = var1;
            } else {
               Task var10 = new Task(var2, var8, var9);
               var10000 = var1;
               var10.b(var6, var7);
               var5.add(var10);
            }

            var4 = var10000 + 1;
         }

         return var5;
      }
   }
}
