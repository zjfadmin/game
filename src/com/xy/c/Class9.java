package com.xy.c;

import com.xy.a.Class142;
import com.xy.a.a.Class38;
import com.xy.a.a.Class50;
import com.xy.a.a.Class53;
import com.xy.a.i.Class42;
import com.xy.a.q.Class103;
import com.xy.a.q.Class49;
import com.xy.a.q.Class55;
import com.xy.a.q.Class57;
import com.xy.a.v.Class39;
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

public class Class9 implements ServerAction {
   public static void s(int var0, String var1, RoleData var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 5;
      int var8;
      int var10000 = var8 = 0;

      while (var10000 < var1.length()) {
         String var10001 = "4";
         if ((var8 = var1.indexOf("#", var7 + 1)) == -1) {
            var8 = var1.length();
         }

         if (var6 == 0) {
            var3 = com.xy.v.Class12.ad(var1, var7, var8);
            var10000 = var8;
         } else if (var6 == 1) {
            var4 = com.xy.v.Class12.ad(var1, var7, var8);
            var10000 = var8;
         } else {
            if (var6 == 2) {
               var5 = com.xy.v.Class12.ad(var1, var7, var8);
            }

            var10000 = var8;
         }

         var6++;
         var7 = var10000 + 1;
         var10000 = var8;
      }

      if (var0 == 0) {
         var2.getMountSHByindex(var3).setUnlock(var4);
      } else if (var0 == 1) {
         var2.getMountSHByindex(var3).setLvl(var4);
         var2.getMountSHByindex(var3).setExp(var5);
      } else {
         if (var0 == 2) {
            var2.getMountSHByindex(0).getMounts()[var3].setB3(var4);
            if (var4 <= 0) {
               GameView var11 = var2.getGameView();
               String var10003 = "乜夌筝";
               StringBuilder var12 = new StringBuilder("中天第").append(MsgUntil.h(var3 + 1));
               String var10002 = "丽寇抳榲皓寇抳瞼耇上工纀耀屲云ｃ诠屲忼蠪兒聟乒";
               var11._do(var12.append("个守护槽的守护石耐久已经耗尽了，请尽快补充耐久").toString());
            }
         }
      }
   }

   public static void t(String var0, RoleData var1) {
      int var2;
      if ((var2 = var0.indexOf(44, 6)) == -1) {
         var2 = var0.length();
      }

      int var3 = com.xy.v.Class12.ad(var0, 5, var2);
      var1.getMountSHByindex(0).getMounts()[var3].a(var2 < var0.length() ? var0.substring(var2 + 1) : "");
   }

   @Override
   public void b(String var1, String var2, GameClient var3) {
      AssetUpdate var4 = com.xy.v.Class31.a().fromJson(var2, AssetUpdate.class);
      if (var3.assetIndex == -111L || var4.getI() != var3.assetIndex) {
         var3.assetIndex = var4.getI();
         u(var4, var3.gameView);
      }
   }

   public static void u(AssetUpdate var0, GameView var1) {
      if (var0 != null) {
         RoleData var2 = var1.roleData;
         LoginResult var3 = var1.roleData.getLoginResult();
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;
         if (var0.getData() != null) {
            String var8 = var0.getData();
            int var9 = 0;
            int var10 = 0;
            int var11;
            int var10000 = var11 = 0;

            while (var10000 < var8.length()) {
               String var10001 = "\r";
               if ((var11 = var8.indexOf("|", var10 + 1)) == -1) {
                  var11 = var8.length();
               }

               char var12;
               if ((var12 = var8.charAt(var10)) == 'D') {
                  long var13 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                  var3.setGold(new BigDecimal(var3.getGold().longValue() + var13));
                  var10000 = var11;
               } else if (var12 == 'X') {
                  if (var8.charAt(var10 + 1) == 'P') {
                     var2.getPackRecord().setStarSoulType(var8.substring(var10 + 2, var11));
                     var4 = true;
                     var10000 = var11;
                  } else {
                     long var26 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                     var10000 = var11;
                     var3.setCodecard(new BigDecimal(var3.getCodecard().longValue() + var26));
                  }
               } else if (var12 == 'S') {
                  long var27 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                  var3.setSavegold(new BigDecimal(var3.getSavegold().longValue() + var27));
                  var10000 = var11;
               } else if (var12 == 'C') {
                  long var28 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                  var3.setMoney((int)(var3.getMoney().intValue() + var28));
                  var10000 = var11;
               } else if (var12 == 'R') {
                  var10000 = var11;
                  ExpIncreaseUntil.d(var8.substring(var10, var11), var2);
               } else if (var12 == 'P') {
                  var10000 = var11;
                  ExpIncreaseUntil.f(var8.substring(var10, var11), var2);
               } else if (var12 == 'M') {
                  var10000 = var11;
                  ExpIncreaseUntil.b(var8.substring(var10, var11), var2);
               } else if (var12 == 'L') {
                  var10000 = var11;
                  ExpIncreaseUntil.c(var8.substring(var10, var11), var2);
               } else {
                  label527: {
                     if (var12 == 'G') {
                        String var29;
                        String var124 = var29 = var8.substring(var10 + 1, var11);
                        var10001 = "G";
                        if (var124.startsWith("P")) {
                           var10001 = "L";
                           int var14 = var29.indexOf("=");
                           BigDecimal var15 = new BigDecimal(com.xy.v.Class12.s(var29, 1, var14));
                           int var16 = com.xy.v.Class12.ad(var29, var14 + 1, var29.length());
                           if (var2.j()) {
                              var10000 = var11;
                              var2.bo(var15, var16);
                              break label527;
                           }
                        } else {
                           var10001 = "*";
                           String[] var37;
                           if ((var37 = var29.split("=")).length == 2) {
                              BigDecimal var52 = new BigDecimal(var37[0]);
                              int var74 = Integer.parseInt(var37[1]);
                              Goodstable var17;
                              if ((var17 = var2.getGood(var52)) == null) {
                                 var10000 = var11;
                                 break label527;
                              }

                              var17.setRgid(var52);
                              var17.setUsetime(var74);
                              var2.aq(var17);
                              if (var17.getType() == 2326L) {
                                 var6 = true;
                                 var10000 = var11;
                                 break label527;
                              }
                           } else if (var37.length == 4) {
                              var10000 = var11;
                              ExpIncreaseUntil.e(var37, var2);
                              break label527;
                           }
                        }
                     } else {
                        if (var12 == 'T') {
                           var10000 = var11;
                           var1.gameTXMask.a(var8.substring(var10 + 1, var11), 0, null);
                           break label527;
                        }

                        if (var12 == 'B') {
                           long var35 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                           var3.setContribution(new BigDecimal(var3.getContribution().longValue() + var35));
                           var10000 = var11;
                           break label527;
                        }

                        if (var12 == 'K') {
                           long var34 = com.xy.v.Class12.s(var8, var10 + 2, var11);
                           var3.setPkrecord(new BigDecimal(var3.getPkrecord().longValue() + var34));
                           var10000 = var11;
                           break label527;
                        }

                        if (var12 == 'E') {
                           String var125 = var8.substring(var10 + 1, var11);
                           var10001 = "L";
                           String[] var30 = var125.split("=");
                           var3.setFGExtraPoint(var30[0], Integer.parseInt(var30[1]));
                           com.xy.a.w.Class0 var38;
                           if ((var38 = (com.xy.a.w.Class0)var1.getFormManagement().l(54)) != null) {
                              var38.h();
                           }

                           com.xy.a.w.Class28 var53;
                           if ((var53 = (com.xy.a.w.Class28)var1.getFormManagement().l(106)) != null) {
                              var10000 = var11;
                              var53.f();
                              break label527;
                           }
                        } else if (var12 == 'N') {
                           String var31;
                           String var126 = var31 = var8.substring(var10, var11);
                           var10001 = "\u0001[";
                           if (var126.startsWith("NL")) {
                              var2.getPackRecord().setLabortype(var31.substring(2));
                              var5 = true;
                              var10000 = var11;
                              break label527;
                           }

                           var10001 = "L";
                           String[] var39 = var31.split("=");
                           BigDecimal var54 = new BigDecimal(var39[0].substring(5));
                           String var127 = var39[0];
                           var10001 = "Y\u001c\\\u0006Y";
                           if (var127.startsWith("NSKIN")) {
                              com.xy.a.Class6 var76 = (com.xy.a.Class6)var1.getFormManagement().j(27);
                              var10000 = var11;
                              var76.i(var54);
                              break label527;
                           }

                           String var128 = var39[0];
                           var10001 = "?g0v4";
                           if (var128.startsWith("NBASE")) {
                              int var75 = Integer.parseInt(var39[1]);
                              com.xy.a.Class6 var96 = (com.xy.a.Class6)var1.getFormManagement().j(27);
                              var10000 = var11;
                              var96.bj(var54, var75);
                              break label527;
                           }
                        } else if (var12 == 'A') {
                           String var32;
                           String var129 = var32 = var8.substring(var10, var11);
                           var10001 = "\u000eC\u001bE*d*c";
                           if (var129.startsWith("ATTReset")) {
                              var10001 = "5";
                              var3.setKillTypeTwo(var32.substring(8));
                              var3.setKillTypeHead("D", 1, null);
                              String var10002 = "窑抗禠刑";
                              var3.setPkrecord(new BigDecimal(0));
                              BigDecimal var40 = var3.getScoretype("竞技积分");
                              if (var40.longValue() != 0L) {
                                 var10000 = var11;
                                 var10002 = var3.getScore();
                                 String var10005 = "窯报禞刣L";
                                 var3.setScore(com.xy.v.Class5.a(var10002, "竞技积分=" + var40, 3));
                                 break label527;
                              }
                           } else {
                              var10001 = "\u000eQ\u0015R";
                              if (var32.startsWith("AFZE")) {
                                 Class49 var42 = (Class49)var1.getFormManagement().j(133);
                                 var10000 = var11;
                                 var42.vd().lm(com.xy.v.Class12.ad(var32, 4, var32.length()));
                                 break label527;
                              }

                              var10001 = "0c+";
                              if (var32.startsWith("AFZ")) {
                                 int var41 = Integer.parseInt(var32.substring(3));
                                 PackRecord var162 = var2.getPackRecord();
                                 String var182 = "\tM";
                                 String var189 = "c+";
                                 var162.setEquip("FZ", "FZ" + var41);
                                 Class49 var55;
                                 if ((var55 = (Class49)var1.getFormManagement().l(133)) != null) {
                                    var10000 = var11;
                                    var55.g(-1);
                                    break label527;
                                 }
                              } else {
                                 var10001 = "V\u001c_";
                                 if (!var32.startsWith("ASH")) {
                                    var3.setKillTypeTwo(var32.substring(1));
                                    var10000 = var11;
                                    break label527;
                                 }

                                 var7 = true;
                                 var10001 = "0v9b+";
                                 if (var32.startsWith("ASHGZ")) {
                                    v(var32, var2);
                                    var10000 = var11;
                                    break label527;
                                 }

                                 var10001 = "V\u001c_\u001aY";
                                 if (var32.startsWith("ASHUN")) {
                                    s(0, var32, var2);
                                    var10000 = var11;
                                    break label527;
                                 }

                                 var10001 = "0v9}=";
                                 if (var32.startsWith("ASHXL")) {
                                    s(1, var32, var2);
                                    var10000 = var11;
                                    break label527;
                                 }

                                 var10001 = "V\u001c_\u0001]";
                                 if (var32.startsWith("ASHNJ")) {
                                    s(2, var32, var2);
                                    var10000 = var11;
                                    break label527;
                                 }

                                 var10001 = "0v9} ";
                                 if (var32.startsWith("ASHXQ")) {
                                    var10000 = var11;
                                    t(var32, var2);
                                    break label527;
                                 }
                              }
                           }
                        } else {
                           String var33;
                           String var130 = var33 = var8.substring(var10, var11);
                           var10001 = "倸钦";
                           if (var130.startsWith("偷钱")) {
                              var10001 = "L";
                              String[] var44 = var33.split("=");
                              long var56 = Long.parseLong(var44[1]);
                              com.xy.a.Class6 var97 = (com.xy.a.Class6)var1.getFormManagement().j(27);
                              var10000 = var11;
                              String var10004 = "哃佷彏丽局尘盋玾筞耛嶽;会忒勧怅c迎亲礫爦逖伯;伯往剿云";
                              StringBuilder var183 = new StringBuilder("和你开个小小的玩笑而已,何必动怒,这份礼物送你,你得到了").append(var56);
                              String var10003 = "釴铀";
                              var97.bk(var183.append("金钱").toString());
                              break label527;
                           }

                           var10001 = "冴杗";
                           if (var33.startsWith("击杀")) {
                              var10000 = var11;
                              var3.setKill(com.xy.v.Class5.a(var3.getKill(), var33, 5));
                              break label527;
                           }

                           var10001 = "墁朾L";
                           if (var33.startsWith("声望=")) {
                              long var43 = Long.parseLong(var33.substring(3));
                              var3.setPrestige(new BigDecimal(var3.getPrestige().longValue() + var43));
                              var2.getRoleProperty().p();
                              var10000 = var11;
                              break label527;
                           }

                           var3.setScore(com.xy.v.Class5.a(var3.getScore(), var33, 2));
                        }
                     }

                     var10000 = var11;
                  }
               }

               var9++;
               var10 = var10000 + 1;
               var10000 = var11;
            }
         }

         if (var0.getVip() != null) {
            var3.setVipget(var0.getVip());
         }

         if (var0.getSceneMsg() != null) {
            var1.dq(var0.getSceneMsg());
         }

         List var20 = var0.getGoods();
         List var21 = var0.getPets();
         List var22 = var0.getLingbaos();
         List var24 = var0.getMounts();
         List var25 = var0.getBabys();
         List var36 = var0.getPals();
         int var45 = 0;
         int var57 = var20 != null ? var20.size() : 0;

         for (int var131 = var45; var131 < var57; var131 = var45) {
            var2.aq((Goodstable)var20.get(var45++));
         }

         var45 = 0;
         var57 = var21 != null ? var21.size() : 0;

         for (int var132 = var45; var132 < var57; var132 = ++var45) {
            RoleSummoning var77;
            if ((var77 = (RoleSummoning)var21.get(var45)).getRoleid() != null && var77.getBasishp() == 0) {
               int[] var98;
               var77.setBasishp((var98 = PetProperty.getPetHMASp(var77, var2))[0]);
               var77.setBasismp(var98[1]);
            }

            RolePet var99 = var2.getRolePet(var77.getSid().longValue());
            if (var77.getRoleid() == null) {
               if (var99 != null) {
                  var2.pets.remove(var99);
               }

               if (var2.bh(var99.getId())) {
                  var2.setChosePetId(null);
               }
            } else {
               if (var99 == null) {
                  var99 = var2.bg(var77);
               }

               var99.setPet(var77);
               var2.getRoleProperty().i(var77);
               var6 = true;
            }
         }

         var45 = 0;
         var57 = var22 != null ? var22.size() : 0;

         for (int var133 = var45; var133 < var57; var133 = ++var45) {
            Lingbao var78;
            String var134 = (var78 = (Lingbao)var22.get(var45)).getBaotype();
            String var173 = "沚宊";
            if (var134.equals("法宝") && var2.s(var78)) {
               String var187 = "刅阕";
               var78.setOperation("删除");
               ParamTool.b(var78, var1.getClient());
            } else {
               RoleData var136;
               label456: {
                  if (var2.getLingbao(var78.getBaoid()) == null) {
                     String var135 = var78.getBaotype();
                     var173 = "沚宊";
                     if (!var135.equals("法宝")) {
                        var2.lingbaoList.add(var78.getBaoid());
                        if (var78.getEquipment() == 1) {
                           var136 = var2;
                           var2.lingbaoChoses[0] = var78.getBaoid();
                           break label456;
                        }
                     } else {
                        var2.fabaoList.add(var78.getBaoid());
                        if (var78.getEquipment() == 1) {
                           int var175;
                           Lingbao var185;
                           if (var2.lingbaoChoses[1] == null) {
                              var175 = 1;
                              var185 = var78;
                           } else {
                              var175 = 2;
                              var185 = var78;
                           }

                           var2.lingbaoChoses[var175] = var185.getBaoid();
                        }
                     }
                  }

                  var136 = var2;
               }

               var136.lingbaoMap.put(var78.getBaoid(), var78);
               var2.getRoleProperty().v(var78);
            }
         }

         var45 = 0;
         var57 = var24 != null ? var24.size() : 0;

         for (int var137 = var45; var137 < var57; var137 = var45) {
            Mount var79;
            RoleData var138;
            label445: {
               var79 = (Mount)var24.get(var45);
               Mount var100;
               if ((var100 = var2.getMount(var79.getMid())) == null) {
                  var2.mounts.add(var79);
                  if (var1.getClient().gameMount) {
                     Class53 var18;
                     if ((var18 = (Class53)var1.getFormManagement().l(172)) != null) {
                        var138 = var2;
                        var18.dh();
                        break label445;
                     }
                  } else {
                     com.xy.a.a.Class31 var111;
                     if ((var111 = (com.xy.a.a.Class31)var1.getFormManagement().l(7)) != null) {
                        var138 = var2;
                        var111.e();
                        break label445;
                     }
                  }
               } else {
                  int var112 = var2.mounts.indexOf(var100);
                  var2.mounts.set(var112, var79);
               }

               var138 = var2;
            }

            RoleProperty var139 = var138.getRoleProperty();
            var45++;
            var139.a(var79);
         }

         var45 = 0;
         var57 = var25 != null ? var25.size() : 0;

         for (int var140 = var45; var140 < var57; var140 = var45) {
            Baby var80;
            Baby var141;
            label433: {
               var80 = (Baby)var25.get(var45);
               Baby var101;
               if ((var101 = var2.getBaby(var80.getBabyid())) == null) {
                  var2.babys.add(var80);
                  com.xy.a.a.Class4 var113;
                  if ((var113 = (com.xy.a.a.Class4)var1.getFormManagement().l(1)) != null) {
                     var141 = var80;
                     var113.h();
                     break label433;
                  }
               } else {
                  int var114 = var2.babys.indexOf(var101);
                  var2.babys.set(var114, var80);
               }

               var141 = var80;
            }

            if (com.xy.v.Class12.x(var141.getBabyid(), var3.getBabyId())) {
               var2.getRoleProperty().s(var80);
            }

            var45++;
            var2.getRoleProperty().x(var80);
         }

         AssetUpdate var143;
         label426: {
            if (var36 != null) {
               boolean var50 = false;
               boolean var62 = false;

               int var81;
               for (int var142 = var81 = 0; var142 < var36.size(); var142 = ++var81) {
                  Pal var102 = (Pal)var36.get(var81);
                  Pal var115;
                  if ((var115 = var2.getPal(var102.getId())) == null) {
                     var50 = true;
                     var2.pals.add(var102);
                  } else {
                     if (!var62) {
                        var62 = var2.ab(var102.getId());
                     }

                     int var19 = var2.pals.indexOf(var115);
                     var2.pals.set(var19, var102);
                  }
               }

               Class38 var82;
               if ((var82 = (Class38)var1.getFormManagement().l(105)) != null) {
                  if (var50) {
                     var143 = var0;
                     var82.f();
                     break label426;
                  }

                  if (var62 && var2.getChosePal() != null) {
                     var82.g(var2.getChosePal().getpId());
                  }
               }
            }

            var143 = var0;
         }

         List var51 = var143.getJades();
         var57 = 0;
         int var83 = var51 != null ? var51.size() : 0;

         for (int var144 = var57; var144 < var83; var144 = var57) {
            PartJade var103 = (PartJade)var51.get(var57);
            PackRecord var186 = var2.getPackRecord();
            var57++;
            var186.setPartJade(var103);
            w(var103, var2, var1);
         }

         if (var0.getGameBean() != null) {
            Class20.au(var0.getGameBean(), var1);
         }

         if (var0.getUseCard() != null) {
            UseCardBean var64 = var0.getUseCard();
            var2.bd(var64.getName(), var64.getType(), var64.getSkin(), var64.getValue(), var64.getTime());
            if (var64.getlCard() != null) {
               GameView var146;
               if (var1.getClient().gameMount) {
                  PackRecord var145 = var2.getPackRecord();
                  String var176 = "g\"";
                  var145.setOtherValue("BS", var64.getlCard());
                  var146 = var1;
               } else {
                  var2.getPackRecord().setlCard(var64.getlCard());
                  var146 = var1;
               }

               Class103 var84;
               if ((var84 = (Class103)var146.getFormManagement().l(89)) != null) {
                  var84.hy(false);
               }
            }
         }

         if (var0.getResistance() != null) {
            var3.setResistance(!var0.getResistance().equals("") ? var0.getResistance() : null);
            var2.getRoleProperty().f();
            var2.getRoleProperty().y();
            com.xy.a.w.Class0 var65;
            if ((var65 = (com.xy.a.w.Class0)var1.getFormManagement().l(54)) != null) {
               var65.h();
            }
         }

         if (var0.getTask() != null) {
            var2.getTaskSystem().d(var0.getTask());
         }

         if (var0.getActivity() != null) {
            Class1.c(var0.getActivity(), var1);
         }

         if (var4) {
            com.xy.a.i.Class22 var66;
            if ((var66 = (com.xy.a.i.Class22)var1.getFormManagement().l(137)) != null) {
               var66.h();
            }

            Class42 var85;
            if ((var85 = (Class42)var1.getFormManagement().l(138)) != null) {
               var85.h();
            }

            com.xy.a.i.Class38 var104;
            if ((var104 = (com.xy.a.i.Class38)var1.getFormManagement().l(139)) != null) {
               var104.f();
            }

            com.xy.a.i.Class24 var116;
            if ((var116 = (com.xy.a.i.Class24)var1.getFormManagement().l(140)) != null) {
               var116.c();
            }

            com.xy.a.i.Class3 var121;
            if ((var121 = (com.xy.a.i.Class3)var1.getFormManagement().l(141)) != null) {
               var121.h();
            }
         }

         com.xy.a.i.Class28 var67;
         if (var5 && (var67 = (com.xy.a.i.Class28)var1.getFormManagement().l(142)) != null) {
            var67.h();
         }

         if (var6) {
            Class50 var68;
            if ((var68 = (Class50)var1.getFormManagement().l(163)) != null) {
               var68.f();
            }

            com.xy.a.q.Class34 var86;
            if ((var86 = (com.xy.a.q.Class34)var1.getFormManagement().l(17)) != null) {
               var86.e();
            }
         }

         if (var7) {
            Class53 var69;
            if ((var69 = (Class53)var1.getFormManagement().l(172)) != null) {
               var69.dh();
            }

            com.xy.a.a.Class22 var87;
            if ((var87 = (com.xy.a.a.Class22)var1.getFormManagement().l(174)) != null) {
               var87.h();
            }
         }

         if (var0.getType() >= 21 && var0.getType() < 30) {
            String var73;
            if (!com.xy.v.Class12.h(var73 = var0.getMsg())) {
               Class142 var92 = (Class142)var1.getFormManagement().l(121);
               int var110 = 0;
               int var119;
               int var149 = var119 = 0;

               while (var149 < var73.length()) {
                  String var179 = "k";
                  if ((var119 = var73.indexOf("|", var110 + 1)) == -1) {
                     var119 = var73.length();
                  }

                  String var122 = var73.substring(var110, var119);
                  var1._do(var122);
                  if (var92 != null) {
                     var179 = "釨惮报肌夔赔";
                     if (var122.equals("重悟技能失败")) {
                        var92.ci(null);
                     }
                  }

                  var110 = var119 + 1;
                  var149 = var119;
               }
            }

            if (var0.getType() == 26) {
               com.xy.a.q.Class6 var93;
               if ((var93 = (com.xy.a.q.Class6)var1.getFormManagement().l(39)) != null) {
                  var93.g(3);
                  return;
               }
            } else if (var0.getType() == 27) {
               com.xy.a.q.Class8 var94;
               if ((var94 = (com.xy.a.q.Class8)var1.getFormManagement().l(100)) != null) {
                  var94.h();
                  return;
               }
            } else {
               Class55 var95;
               if (var0.getType() == 28 && (var95 = (Class55)var1.getFormManagement().l(101)) != null) {
                  var95.h();
                  return;
               }
            }
         } else if (var0.getType() != 30 && var0.getType() != 31) {
            if (var0.getType() == 41) {
               String var71;
               if (!com.xy.v.Class12.h(var71 = var0.getMsg())) {
                  var83 = 0;
                  int var108;
                  int var148 = var108 = 0;

                  while (var148 < var71.length()) {
                     String var178 = "k";
                     if ((var108 = var71.indexOf("|", var83 + 1)) == -1) {
                        var108 = var71.length();
                     }

                     String var118 = var71.substring(var83, var108);
                     var1.dp(var118);
                     var83 = var108 + 1;
                     var148 = var108;
                  }

                  return;
               }
            } else {
               String var72;
               if ((var72 = var0.a()) != null) {
                  var1._do(var72);
               }
            }
         } else {
            String var70;
            if ((var70 = var0.getMsg()) != null) {
               var83 = 0;
               int var105;
               int var147 = var105 = 0;

               while (var147 < var70.length()) {
                  String var177 = "k";
                  if ((var105 = var70.indexOf("|", var83 + 1)) == -1) {
                     var105 = var70.length();
                  }

                  String var117 = var70.substring(var83, var105);
                  String var188 = "佅菆徲价";
                  var1._do("你获得了" + var117);
                  var83 = var105 + 1;
                  var147 = var105;
               }
            }

            if (var0.getType() == 30) {
               com.xy.a.q.Class35 var89;
               if ((var89 = (com.xy.a.q.Class35)var1.getFormManagement().l(103)) != null) {
                  var89.e();
               }

               Class39 var107;
               if ((var107 = (Class39)var1.getFormManagement().l(167)) != null) {
                  var107.y(1);
                  return;
               }
            } else {
               com.xy.a.q.Class39 var90;
               if ((var90 = (com.xy.a.q.Class39)var1.getFormManagement().l(134)) != null) {
                  var90.h();
                  return;
               }
            }
         }
      }
   }

   public static void v(String var0, RoleData var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 5;
      int var7;
      int var10000 = var7 = 0;

      while (var10000 < var0.length()) {
         String var10001 = "R";
         if ((var7 = var0.indexOf("#", var6 + 1)) == -1) {
            var7 = var0.length();
         }

         if (var5 == 0) {
            var2 = com.xy.v.Class12.ad(var0, var6, var7);
            var10000 = var7;
         } else if (var5 == 1) {
            var3 = com.xy.v.Class12.ad(var0, var6, var7);
            var10000 = var7;
         } else {
            if (var5 == 2) {
               var4 = com.xy.v.Class12.ad(var0, var6, var7);
            }

            var10000 = var7;
         }

         var5++;
         var6 = var10000 + 1;
         var10000 = var7;
      }

      var1.getMountSHByindex(var3).setGZ(var4, var2);
      var1.getRoleProperty().i(var1.getChosePet());
   }

   public static void w(PartJade var0, RoleData var1, GameView var2) {
      Class57 var3;
      if ((var3 = (Class57)var2.getFormManagement().l(61)) != null) {
         var3.ck(var0);
      }

      com.xy.a.i.Class5 var4;
      if ((var4 = (com.xy.a.i.Class5)var2.getFormManagement().l(63)) != null) {
         var4.eq().ck(var0);
      }

      com.xy.a.i.Class14 var5;
      if ((var5 = (com.xy.a.i.Class14)var2.getFormManagement().l(64)) != null) {
         var5.eq().ck(var0);
      }
   }
}
