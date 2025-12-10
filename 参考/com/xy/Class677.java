package com.xy;

import com.xy.bean.AssetUpdate;
import com.xy.bean.LoginResult;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.PackRecord;
import com.xy.entity.Pal;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.formula.RoleProperty;
import com.xy.game.ExpIncreaseUntil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;
import java.util.List;

public class Class677 implements ServerAction {
   public static void f(String var0, RoleData var1) {
      int var2;
      if ((var2 = var0.indexOf(126 & 45, 55 & 78)) == -4 >> 2) {
         var2 = var0.length();
      }

      int var3 = Class394.b(var0, --5, var2);
      var1.getMountSHByindex(5 >> 3).getMounts()[var3].a(var2 < var0.length() ? var0.substring(var2 + (3 >> 1)) : "");
   }

   public static void g(String var0, RoleData var1) {
      int var7 = 3 >> 2;
      int var6 = 3 ^ 3;
      int var4 = 3 ^ 3;
      int var5 = 2 & 5;
      int var3 = --5;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < var0.length(); var10000 = var2) {
         if ((var2 = var0.indexOf("#", var3 + (4 ^ 5))) == -4 >> 2) {
            var2 = var0.length();
         }

         if (var5 == 0) {
            var7 = Class394.b(var0, var3, var2);
            var10000 = var2;
         } else if (var5 == 3 >> 1) {
            var6 = Class394.b(var0, var3, var2);
            var10000 = var2;
         } else {
            if (var5 == (1 ^ 3)) {
               var4 = Class394.b(var0, var3, var2);
            }

            var10000 = var2;
         }

         ++var5;
         var3 = var10000 + 1;
      }

      var1.getMountSHByindex(var6).setGZ(var4, var7);
      var1.getRoleProperty().m(var1.getChosePet());
   }

   public void a(String var1, String var2, GameClient var3) {
      AssetUpdate var4 = (AssetUpdate)Class695.b().fromJson(var2, AssetUpdate.class);
      if (var3.assetIndex == -111L || var4.getI() != var3.assetIndex) {
         var3.assetIndex = var4.getI();
         i(var4, var3.gameView);
      }
   }

   public static void h(PartJade var0, RoleData var1, GameView var2) {
      Class595 var3;
      if ((var3 = (Class595)var2.getFormManagement().m(125 & 63)) != null) {
         var3.cb(var0);
      }

      Class407 var4;
      if ((var4 = (Class407)var2.getFormManagement().m(63 & 127)) != null) {
         var4.xi().cb(var0);
      }

      Class263 var5;
      if ((var5 = (Class263)var2.getFormManagement().m(95 & 96)) != null) {
         var5.xi().cb(var0);
      }

   }

   public static void i(AssetUpdate var0, GameView var1) {
      if (var0 != null) {
         RoleData var2;
         LoginResult var11 = (var2 = var1.roleData).getLoginResult();
         int var4 = 3 ^ 3;
         int var5 = 3 & 4;
         int var6 = 2 & 5;
         int var7 = 3 & 4;
         String var8;
         int var9;
         int var14;
         int var10000;
         int var16;
         if (var0.getData() != null) {
            var8 = var0.getData();
            var9 = 3 ^ 3;
            int var10 = 3 >> 2;

            int var3;
            for(var10000 = var3 = 3 ^ 3; var10000 < var8.length(); var10000 = var3) {
               if ((var3 = var8.indexOf("|", var10 + (3 >> 1))) == -4 >> 2) {
                  var3 = var8.length();
               }

               char var12;
               long var34;
               if ((var12 = var8.charAt(var10)) == (68 & 127)) {
                  var34 = Class394.q(var8, var10 + --2, var3);
                  var11.setGold(new BigDecimal(var11.getGold().longValue() + var34));
                  var10000 = var3;
               } else if (var12 == (126 & 89)) {
                  if (var8.charAt(var10 + (5 >> 2)) == (82 & 125)) {
                     var10000 = 4 ^ 5;
                     var2.getPackRecord().setStarSoulType(var8.substring(var10 + --2, var3));
                     var4 = var10000;
                     var10000 = var3;
                  } else {
                     var34 = Class394.q(var8, var10 + (1 ^ 3), var3);
                     var10000 = var3;
                     var11.setCodecard(new BigDecimal(var11.getCodecard().longValue() + var34));
                  }
               } else if (var12 == (87 & 123)) {
                  var34 = Class394.q(var8, var10 + --2, var3);
                  var11.setSavegold(new BigDecimal(var11.getSavegold().longValue() + var34));
                  var10000 = var3;
               } else if (var12 == (75 & 119)) {
                  var34 = Class394.q(var8, var10 + --2, var3);
                  var11.setMoney((int)((long)var11.getMoney() + var34));
                  var10000 = var3;
               } else if (var12 == (83 & 126)) {
                  var10000 = var3;
                  ExpIncreaseUntil.d(var8.substring(var10, var3), var2);
               } else if (var12 == (114 & 93)) {
                  var10000 = var3;
                  ExpIncreaseUntil.b(var8.substring(var10, var3), var2);
               } else if (var12 == (127 & 77)) {
                  var10000 = var3;
                  ExpIncreaseUntil.e(var8.substring(var10, var3), var2);
               } else if (var12 == (127 & 76)) {
                  var10000 = var3;
                  ExpIncreaseUntil.f(var8.substring(var10, var3), var2);
               } else {
                  label587: {
                     String var13;
                     BigDecimal var15;
                     String[] var33;
                     if (var12 == (119 & 79)) {
                        if ((var13 = var8.substring(var10 + (4 ^ 5), var3)).startsWith("P")) {
                           var14 = var13.indexOf("=");
                           var15 = new BigDecimal(Class394.q(var13, --1, var14));
                           var16 = Class394.b(var13, var14 + --1, var13.length());
                           if (var2.an()) {
                              var10000 = var3;
                              var2.p(var15, var16);
                              break label587;
                           }
                        } else if ((var33 = var13.split("=")).length == (1 ^ 3)) {
                           var15 = new BigDecimal(var33[2 & 5]);
                           var16 = Integer.parseInt(var33[3 & 5]);
                           Goodstable var17;
                           if ((var17 = var2.getGood(var15)) == null) {
                              var10000 = var3;
                              break label587;
                           }

                           var17.setRgid(var15);
                           var17.setUsetime(var16);
                           var2.ao(var17);
                           if (var17.getType() == 2326L) {
                              var6 = --1;
                              var10000 = var3;
                              break label587;
                           }
                        } else if (var33.length == --4) {
                           var10000 = var3;
                           ExpIncreaseUntil.a(var33, var2);
                           break label587;
                        }
                     } else {
                        if (var12 == (117 & 94)) {
                           var10000 = var3;
                           var1.gameTXMask.a(var8.substring(var10 + (4 ^ 5), var3), 5 >> 3, (String)null);
                           break label587;
                        }

                        if (var12 == (114 & 79)) {
                           var34 = Class394.q(var8, var10 + (1 ^ 3), var3);
                           var11.setContribution(new BigDecimal(var11.getContribution().longValue() + var34));
                           var10000 = var3;
                           break label587;
                        }

                        if (var12 == (111 & 91)) {
                           var34 = Class394.q(var8, var10 + (1 ^ 3), var3);
                           var11.setPkrecord(new BigDecimal(var11.getPkrecord().longValue() + var34));
                           var10000 = var3;
                           break label587;
                        }

                        if (var12 == (93 & 103)) {
                           String[] var32 = var8.substring(var10 + (2 ^ 3), var3).split("=");
                           var11.setFGExtraPoint(var32[3 & 4], Integer.parseInt(var32[1]));
                           Class313 var35;
                           if ((var35 = (Class313)var1.getFormManagement().m(55 & 126)) != null) {
                              var35.d();
                           }

                           Class544 var37;
                           if ((var37 = (Class544)var1.getFormManagement().m(107 & 126)) != null) {
                              var10000 = var3;
                              var37.s();
                              break label587;
                           }
                        } else {
                           Class472 var46;
                           if (var12 == 'N') {
                              if ((var13 = var8.substring(var10, var3)).startsWith("NL")) {
                                 var2.getPackRecord().setLabortype(var13.substring(--2));
                                 var5 = 1;
                                 var10000 = var3;
                                 break label587;
                              }

                              var33 = var13.split("=");
                              var15 = new BigDecimal(var33[0].substring(--5));
                              if (var33[0].startsWith("NSKIN")) {
                                 Class472 var44 = (Class472)var1.getFormManagement().e(27);
                                 var10000 = var3;
                                 var44.bk(var15);
                                 break label587;
                              }

                              if (var33[0].startsWith("NBASE")) {
                                 var16 = Integer.parseInt(var33[1]);
                                 var46 = (Class472)var1.getFormManagement().e(27);
                                 var10000 = var3;
                                 var46.bx(var15, var16);
                                 break label587;
                              }
                           } else if (var12 == 'A') {
                              if ((var13 = var8.substring(var10, var3)).startsWith("ATTReset")) {
                                 var11.setKillTypeTwo(var13.substring(8));
                                 var11.setKillTypeHead("D", 1, (String)null);
                                 var11.setPkrecord(new BigDecimal(0));
                                 BigDecimal var36 = var11.getScoretype("竞技积分");
                                 if (var36.longValue() != 0L) {
                                    var10000 = var3;
                                    var11.setScore(Class509.h(var11.getScore(), "竞技积分=" + var36, --3));
                                    break label587;
                                 }
                              } else {
                                 if (var13.startsWith("AFZE")) {
                                    Class138 var38 = (Class138)var1.getFormManagement().e(133);
                                    var10000 = var3;
                                    var38.oc().dp(Class394.b(var13, --4, var13.length()));
                                    break label587;
                                 }

                                 if (var13.startsWith("AFZ")) {
                                    var14 = Integer.parseInt(var13.substring(--3));
                                    var2.getPackRecord().setEquip("FZ", "FZ" + var14);
                                    Class138 var39;
                                    if ((var39 = (Class138)var1.getFormManagement().m(133)) != null) {
                                       var10000 = var3;
                                       var39.dp(-4 >> 2);
                                       break label587;
                                    }
                                 } else {
                                    if (!var13.startsWith("ASH")) {
                                       var11.setKillTypeTwo(var13.substring(1));
                                       var10000 = var3;
                                       break label587;
                                    }

                                    var7 = 1;
                                    if (var13.startsWith("ASHGZ")) {
                                       g(var13, var2);
                                       var10000 = var3;
                                       break label587;
                                    }

                                    if (var13.startsWith("ASHUN")) {
                                       j(0, var13, var2);
                                       var10000 = var3;
                                       break label587;
                                    }

                                    if (var13.startsWith("ASHXL")) {
                                       j(1, var13, var2);
                                       var10000 = var3;
                                       break label587;
                                    }

                                    if (var13.startsWith("ASHNJ")) {
                                       j(2, var13, var2);
                                       var10000 = var3;
                                       break label587;
                                    }

                                    if (var13.startsWith("ASHXQ")) {
                                       var10000 = var3;
                                       f(var13, var2);
                                       break label587;
                                    }
                                 }
                              }
                           } else {
                              if ((var13 = var8.substring(var10, var3)).startsWith("偷钱")) {
                                 var33 = var13.split("=");
                                 long var42 = Long.parseLong(var33[1]);
                                 var46 = (Class472)var1.getFormManagement().e(27);
                                 var10000 = var3;
                                 var46.la("和你开个小小的玩笑而已,何必动怒,这份礼物送你,你得到了" + var42 + "金钱");
                                 break label587;
                              }

                              if (var13.startsWith("击杀")) {
                                 var10000 = var3;
                                 var11.setKill(Class509.h(var11.getKill(), var13, 5));
                                 break label587;
                              }

                              if (var13.startsWith("包裹=")) {
                                 var10000 = var3;
                                 var11.setKill(Class509.h(var11.getKill(), var13, 5));
                                 var2.bs(var11.getTurnAround());
                                 break label587;
                              }

                              if (var13.startsWith("声望=")) {
                                 long var40 = Long.parseLong(var13.substring(3));
                                 var11.setPrestige(new BigDecimal(var11.getPrestige().longValue() + var40));
                                 var2.getRoleProperty().x();
                                 var10000 = var3;
                                 break label587;
                              }

                              var11.setScore(Class509.h(var11.getScore(), var13, 2));
                           }
                        }
                     }

                     var10000 = var3;
                  }
               }

               ++var9;
               var10 = var10000 + 1;
            }
         }

         if (var0.getVip() != null) {
            var11.setVipget(var0.getVip());
         }

         if (var0.getSceneMsg() != null) {
            var1.im(var0.getSceneMsg());
         }

         List var18 = var0.getGoods();
         List var22 = var0.getPets();
         List var27 = var0.getLingbaos();
         List var24 = var0.getMounts();
         List var31 = var0.getBabys();
         List var41 = var0.getPals();
         var14 = 0;
         int var43 = var18 != null ? var18.size() : 0;

         for(var10000 = var14; var10000 < var43; var10000 = var14) {
            var2.ao((Goodstable)var18.get(var14++));
         }

         var14 = 0;
         var43 = var22 != null ? var22.size() : 0;

         for(var10000 = var14; var10000 < var43; var10000 = var14) {
            RoleSummoning var45;
            if ((var45 = (RoleSummoning)var22.get(var14)).getRoleid() != null && var45.getBasishp() == 0) {
               int[] var48;
               var45.setBasishp((var48 = PetProperty.getPetHMASp(var45, var2))[0]);
               var45.setBasismp(var48[1]);
            }

            RolePet var50 = var2.getRolePet(var45.getSid().longValue());
            if (var45.getRoleid() == null) {
               if (var50 != null) {
                  var2.pets.remove(var50);
               }

               if (var2.bj(var50.getId())) {
                  var2.setChosePetId((BigDecimal)null);
               }
            } else {
               if (var50 == null) {
                  var50 = var2.be(var45);
               }

               var50.setPet(var45);
               var2.getRoleProperty().m(var45);
               var6 = 1;
            }

            ++var14;
         }

         var14 = 0;
         var43 = var27 != null ? var27.size() : 0;

         RoleData var83;
         for(var10000 = var14; var10000 < var43; var10000 = var14) {
            Lingbao var47;
            if ((var47 = (Lingbao)var27.get(var14)).getBaotype().equals("法宝") && var2.s(var47)) {
               var47.setOperation("删除");
               ParamTool.i(var47, var1.getClient());
            } else {
               label461: {
                  if (var2.getLingbao(var47.getBaoid()) == null) {
                     if (!var47.getBaotype().equals("法宝")) {
                        var2.lingbaoList.add(var47.getBaoid());
                        if (var47.getEquipment() == 1) {
                           var83 = var2;
                           var2.lingbaoChoses[0] = var47.getBaoid();
                           break label461;
                        }
                     } else {
                        var2.fabaoList.add(var47.getBaoid());
                        if (var47.getEquipment() == 1) {
                           BigDecimal[] var84 = var2.lingbaoChoses;
                           byte var10001;
                           Lingbao var81;
                           if (var2.lingbaoChoses[1] == null) {
                              var10001 = 1;
                              var81 = var47;
                           } else {
                              var10001 = 2;
                              var81 = var47;
                           }

                           var84[var10001] = var81.getBaoid();
                        }
                     }
                  }

                  var83 = var2;
               }

               var83.lingbaoMap.put(var47.getBaoid(), var47);
               var2.getRoleProperty().h(var47);
            }

            ++var14;
         }

         var14 = 0;
         var43 = var24 != null ? var24.size() : 0;

         int var21;
         for(var10000 = var14; var10000 < var43; var10000 = var14) {
            Mount var49;
            label447: {
               var49 = (Mount)var24.get(var14);
               Mount var53;
               if ((var53 = var2.getMount(var49.getMid())) == null) {
                  var2.mounts.add(var49);
                  if (var1.getClient().gameMount) {
                     Class329 var19;
                     if ((var19 = (Class329)var1.getFormManagement().m(172)) != null) {
                        var83 = var2;
                        var19.bl();
                        break label447;
                     }
                  } else {
                     Class199 var20;
                     if ((var20 = (Class199)var1.getFormManagement().m(7)) != null) {
                        var83 = var2;
                        var20.o();
                        break label447;
                     }
                  }
               } else {
                  var21 = var2.mounts.indexOf(var53);
                  var2.mounts.set(var21, var49);
               }

               var83 = var2;
            }

            RoleProperty var85 = var83.getRoleProperty();
            ++var14;
            var85.l(var49);
         }

         var14 = 0;
         var43 = var31 != null ? var31.size() : 0;

         for(var10000 = var14; var10000 < var43; var10000 = var14) {
            Baby var51;
            Baby var86;
            label436: {
               var51 = (Baby)var31.get(var14);
               Baby var55;
               if ((var55 = var2.getBaby(var51.getBabyid())) == null) {
                  var2.babys.add(var51);
                  Class237 var23;
                  if ((var23 = (Class237)var1.getFormManagement().m(1)) != null) {
                     var86 = var51;
                     var23.s();
                     break label436;
                  }
               } else {
                  var21 = var2.babys.indexOf(var55);
                  var2.babys.set(var21, var51);
               }

               var86 = var51;
            }

            if (Class394.v(var86.getBabyid(), var11.getBabyId())) {
               var2.getRoleProperty().f(var51);
            }

            ++var14;
            var2.getRoleProperty().d(var51);
         }

         AssetUpdate var87;
         label430: {
            if (var41 != null) {
               boolean var59 = false;
               boolean var52 = false;

               for(var10000 = var16 = 0; var10000 < var41.size(); var10000 = var16) {
                  Pal var56 = (Pal)var41.get(var16);
                  Pal var25;
                  if ((var25 = var2.getPal(var56.getId())) == null) {
                     var59 = true;
                     var2.pals.add(var56);
                  } else {
                     if (!var52) {
                        var52 = var2.q(var56.getId());
                     }

                     var9 = var2.pals.indexOf(var25);
                     var2.pals.set(var9, var56);
                  }

                  ++var16;
               }

               Class135 var54;
               if ((var54 = (Class135)var1.getFormManagement().m(105)) != null) {
                  if (var59) {
                     var87 = var0;
                     var54.p();
                     break label430;
                  }

                  if (var52 && var2.getChosePal() != null) {
                     var54.as(var2.getChosePal().getpId());
                  }
               }
            }

            var87 = var0;
         }

         List var66 = var87.getJades();
         var43 = 0;
         var16 = var66 != null ? var66.size() : 0;

         for(var10000 = var43; var10000 < var16; var10000 = var43) {
            PartJade var60 = (PartJade)var66.get(var43);
            PackRecord var82 = var2.getPackRecord();
            ++var43;
            var82.setPartJade(var60);
            h(var60, var2, var1);
         }

         if (var0.getDataOther() != null) {
            var2.bn(var0.getDataOther());
         }

         if (var0.getGameBean() != null) {
            Class336.aw(var0.getGameBean(), var1);
         }

         if (var0.getUseCard() != null) {
            UseCardBean var57 = var0.getUseCard();
            var2.k(var57.getName(), var57.getType(), var57.getSkin(), var57.getValue(), var57.getTime());
            if (var57.getlCard() != null) {
               GameView var88;
               if (var1.getClient().gameMount) {
                  var2.getPackRecord().setOtherValue("BS", var57.getlCard());
                  var88 = var1;
               } else {
                  var2.getPackRecord().setlCard(var57.getlCard());
                  var88 = var1;
               }

               Class21 var58;
               if ((var58 = (Class21)var88.getFormManagement().m(89)) != null) {
                  var58.r(false);
               }
            }
         }

         if (var0.getResistance() != null) {
            var11.setResistance(!var0.getResistance().equals("") ? var0.getResistance() : null);
            var2.getRoleProperty().q();
            var2.getRoleProperty().n();
            Class313 var61;
            if ((var61 = (Class313)var1.getFormManagement().m(54)) != null) {
               var61.d();
            }
         }

         if (var0.getTask() != null) {
            var2.getTaskSystem().m(var0.getTask());
         }

         if (var0.getActivity() != null) {
            Class286.l(var0.getActivity(), var1);
         }

         if (var4 != 0) {
            Class551 var63;
            if ((var63 = (Class551)var1.getFormManagement().m(137)) != null) {
               var63.d();
            }

            Class247 var62;
            if ((var62 = (Class247)var1.getFormManagement().m(138)) != null) {
               var62.d();
            }

            Class588 var64;
            if ((var64 = (Class588)var1.getFormManagement().m(139)) != null) {
               var64.d();
            }

            Class391 var28;
            if ((var28 = (Class391)var1.getFormManagement().m(140)) != null) {
               var28.o();
            }

            Class459 var26;
            if ((var26 = (Class459)var1.getFormManagement().m(141)) != null) {
               var26.d();
            }
         }

         Class181 var67;
         if (var5 != 0 && (var67 = (Class181)var1.getFormManagement().m(142)) != null) {
            var67.d();
         }

         if (var6 != 0) {
            Class680 var70;
            if ((var70 = (Class680)var1.getFormManagement().m(163)) != null) {
               var70.d();
            }

            Class429 var65;
            if ((var65 = (Class429)var1.getFormManagement().m(17)) != null) {
               var65.p();
            }
         }

         if (var7 != 0) {
            Class329 var72;
            if ((var72 = (Class329)var1.getFormManagement().m(172)) != null) {
               var72.bl();
            }

            Class172 var68;
            if ((var68 = (Class172)var1.getFormManagement().m(174)) != null) {
               var68.d();
            }
         }

         int var71;
         String var73;
         if (var0.getType() >= 21 && var0.getType() < 30) {
            if (!Class394.o(var73 = var0.getMsg())) {
               Class605 var77 = (Class605)var1.getFormManagement().m(121);
               var71 = 0;

               byte var30;
               for(var10000 = var30 = 0; var10000 < var73.length(); var10000 = var21) {
                  if ((var21 = var73.indexOf("|", var71 + 1)) == -1) {
                     var21 = var73.length();
                  }

                  String var29 = var73.substring(var71, var21);
                  var1.f(var29);
                  if (var77 != null && var29.equals("重悟技能失败")) {
                     var77.la((String)null);
                  }

                  var71 = var21 + 1;
               }
            }

            if (var0.getType() == 26) {
               Class174 var78;
               if ((var78 = (Class174)var1.getFormManagement().m(39)) != null) {
                  var78.y(3);
                  return;
               }
            } else if (var0.getType() == 27) {
               Class376 var79;
               if ((var79 = (Class376)var1.getFormManagement().m(100)) != null) {
                  var79.d();
                  return;
               }
            } else {
               Class620 var80;
               if (var0.getType() == 28 && (var80 = (Class620)var1.getFormManagement().m(101)) != null) {
                  var80.d();
                  return;
               }
            }
         } else {
            byte var69;
            if (var0.getType() != 30 && var0.getType() != 31) {
               if (var0.getType() == 41) {
                  if (!Class394.o(var73 = var0.getMsg())) {
                     var16 = 0;

                     for(var10000 = var69 = 0; var10000 < var73.length(); var10000 = var71) {
                        if ((var71 = var73.indexOf("|", var16 + 1)) == -1) {
                           var71 = var73.length();
                        }

                        var8 = var73.substring(var16, var71);
                        var1.fw(var8);
                        var16 = var71 + 1;
                     }

                     return;
                  }
               } else if ((var73 = var0.a()) != null) {
                  var1.f(var73);
               }
            } else {
               if ((var73 = var0.getMsg()) != null) {
                  var16 = 0;

                  for(var10000 = var69 = 0; var10000 < var73.length(); var10000 = var71) {
                     if ((var71 = var73.indexOf("|", var16 + 1)) == -1) {
                        var71 = var73.length();
                     }

                     var8 = var73.substring(var16, var71);
                     var1.f("你获得了" + var8);
                     var16 = var71 + 1;
                  }
               }

               if (var0.getType() == 30) {
                  Class420 var74;
                  if ((var74 = (Class420)var1.getFormManagement().m(103)) != null) {
                     var74.d();
                  }

                  Class316 var76;
                  if ((var76 = (Class316)var1.getFormManagement().m(167)) != null) {
                     var76.as(1);
                     return;
                  }
               } else {
                  Class284 var75;
                  if ((var75 = (Class284)var1.getFormManagement().m(134)) != null) {
                     var75.d();
                     return;
                  }
               }
            }
         }

      }
   }

   public static void j(int var0, String var1, RoleData var2) {
      int var8 = 3 & 4;
      int var4 = 3 & 4;
      int var5 = 3 >> 2;
      int var6 = 3 ^ 3;
      int var7 = --5;

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("#", var7 + (2 ^ 3))) == -4 >> 2) {
            var3 = var1.length();
         }

         if (var6 == 0) {
            var8 = Class394.b(var1, var7, var3);
            var10000 = var3;
         } else if (var6 == 5 >> 2) {
            var4 = Class394.b(var1, var7, var3);
            var10000 = var3;
         } else {
            if (var6 == --2) {
               var5 = Class394.b(var1, var7, var3);
            }

            var10000 = var3;
         }

         ++var6;
         var7 = var10000 + 1;
      }

      if (var0 == 0) {
         var2.getMountSHByindex(var8).setUnlock(var4);
      } else if (var0 == 5 >> 2) {
         var2.getMountSHByindex(var8).setLvl(var4);
         var2.getMountSHByindex(var8).setExp(var5);
      } else {
         if (var0 == 5 >> 1) {
            var2.getMountSHByindex(3 & 4).getMounts()[var8].setB3(var4);
            if (var4 <= 0) {
               var2.getGameView().f("中天第" + MsgUntil.b(var8 + --1) + "个守护槽的守护石耐久已经耗尽了，请尽快补充耐久");
            }
         }

      }
   }
}
