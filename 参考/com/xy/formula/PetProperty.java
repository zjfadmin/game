package com.xy.formula;

import com.xy.bk;
import com.xy.cX;
import com.xy.hd;
import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityPetManualRole;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.Goodstable;
import com.xy.readbean.PalData;
import com.xy.readbean.Skill;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class PetProperty {
   public static String[] evs;

   static {
      String[] var10000 = new String[91 & 45];
      boolean var10002 = true;
      var10000[3 >> 2] = "根骨=";
      var10000[4 ^ 5] = "灵性=";
      var10000[1 ^ 3] = "力量=";
      var10000[--3] = "敏捷=";
      var10000[--4] = "炼化属性";
      var10000[--5] = "增加气血";
      var10000[7 & 126] = "增加法力";
      var10000[55 & 79] = "增加攻击";
      var10000[120 & 15] = "附加速度";
      evs = var10000;
   }

   public static int[] getPetHMASp(RoleSummoning var0, RoleData var1) {
      int[] var10000 = new int[94 & 43];
      boolean var10002 = true;
      int[] var2 = var10000;
      int var3 = cX.p(var0.getGrade());
      int var4 = cX.n(var0.getGrade());
      double var5 = Double.valueOf(var0.getGrowlevel());
      int var10001 = --4;
      int var10003 = --3;
      int var10005 = 5 >> 1;
      int var10007 = --1;
      var2[3 & 4] = var0.getHp();
      var2[var10007] = var0.getMp();
      var2[var10005] = var0.getAp();
      var2[var10003] = var0.getSp();
      var2[var10001] = 3 & 4;
      int var7 = 5 >> 3;
      int var8 = 3 >> 2;
      int var9 = 3 >> 2;
      int var10 = 5 >> 3;
      int var11 = 3 >> 2;
      int var12 = 3 ^ 3;
      int var13 = 5 >> 3;
      int var14 = 3 >> 2;
      if (var5 >= 2.5D || var2[5 >> 3] > (23980 & 12287) || var2[--1] > (12204 & 24063) || var2[--2] > (24508 & 11759) || var2[--3] > (28100 & 7167)) {
         bk.c();
      }

      int var22;
      int var71;
      if (var0.getStye() != null && var0.getStye().length() > (2 ^ 3)) {
         String[] var15 = var0.getStye().split("\\|");

         int var16;
         for(var71 = var16 = 2 ^ 3; var71 < var15.length; var71 = var16) {
            String[] var17;
            Goodstable var18;
            if ((var17 = var15[var16].split("-")).length >= (1 ^ 3) && (var18 = var1.getGoodEquip(new BigDecimal(var17[--1]))) != null) {
               String[] var19 = var18.getValue().split("\\|");

               int var20;
               for(var71 = var20 = 3 & 4; var71 < var19.length; var71 = var20) {
                  String[] var21;
                  if (var19[var20].startsWith(evs[2 & 5])) {
                     var21 = var19[var20].split("=");
                     var7 += Integer.parseInt(var21[2 ^ 3]);
                  } else if (var19[var20].startsWith(evs[--1])) {
                     var21 = var19[var20].split("=");
                     var8 += Integer.parseInt(var21[1]);
                  } else if (var19[var20].startsWith(evs[5 >> 1])) {
                     var21 = var19[var20].split("=");
                     var9 += Integer.parseInt(var21[1]);
                  } else if (var19[var20].startsWith(evs[--3])) {
                     var21 = var19[var20].split("=");
                     var10 += Integer.parseInt(var21[1]);
                  } else if (var19[var20].startsWith(evs[13 & 122])) {
                     var21 = var19[var20].split("=");
                     var14 += Integer.parseInt(var21[1]);
                  } else if (var19[var20].startsWith(evs[--4])) {
                     var21 = var19[var20].split("\\&");

                     for(var71 = var22 = 1; var71 < var21.length; var71 = var22) {
                        String[] var23;
                        if (var21[var22].startsWith(evs[--5])) {
                           var23 = var21[var22].split("=");
                           var11 = (int)((double)var11 + Double.parseDouble(var23[1]));
                        } else if (var21[var22].startsWith(evs[102 & 31])) {
                           var23 = var21[var22].split("=");
                           var12 = (int)((double)var12 + Double.parseDouble(var23[1]));
                        } else if (var21[var22].startsWith(evs[71 & 63])) {
                           var23 = var21[var22].split("=");
                           var13 = (int)((double)var13 + Double.parseDouble(var23[1]));
                        } else if (var21[var22].startsWith(evs[107 & 28])) {
                           var23 = var21[var22].split("=");
                           var14 = (int)((double)var14 + Double.parseDouble(var23[1]));
                        }

                        ++var22;
                     }
                  }

                  ++var20;
               }
            }

            ++var16;
         }
      }

      RoleData var73;
      label372: {
         if (var1.getGameView().getClient().gamePetManual) {
            RolePet var38 = var1.getRolePet(var0.getSid().longValue());
            ActivitySeries var40;
            Activity var42;
            ActivityPetManualRole var45 = (var42 = (var40 = var1.getObjectArea().br()).getActivityPetManual()) != null ? (ActivityPetManualRole)var1.getActivity(var42.getId()) : null;
            if (var45 != null) {
               int var47 = Integer.parseInt(var0.getSummoningid());
               List var49 = var45.getList(1, var42, var40);

               int var52;
               for(var71 = var52 = 0; var71 < var49.size(); var71 = var52) {
                  BaseQl var51;
                  if ((var51 = (BaseQl)var49.get(var52)).getValue2() == 0.0D || var51.getValue2() == (double)var47) {
                     if (var51.getKey().endsWith(BaseEquip.keys[0])) {
                        var7 = (int)((double)var7 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[1])) {
                        var8 = (int)((double)var8 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[5 >> 1])) {
                        var9 = (int)((double)var9 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[--3])) {
                        var10 = (int)((double)var10 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[--4])) {
                        var11 = (int)((double)var11 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[--5])) {
                        var12 = (int)((double)var12 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[15 & 118])) {
                        var13 = (int)((double)var13 + var51.getValue());
                     } else if (var51.getKey().endsWith(BaseEquip.keys[127 & 7])) {
                        var14 = (int)((double)var14 + var51.getValue());
                     }
                  }

                  ++var52;
               }

               Skill var54 = var38 != null && var38.getQy() > 0 ? var1.getObjectArea().bf(String.valueOf(var38.getQy())) : null;
               if (var54 != null && var54.getFormulas() != null) {
                  var22 = Integer.parseInt(var54.getSkillid());
                  int var56 = var45 != null ? var45.d(var22, var42, var40) : 0;
                  if (var56 > 0) {
                     if (var22 == (30391 & 16377)) {
                        var14 += (int)var54.getFormulas()[0].a((double)var56, var3, var4);
                        var73 = var1;
                        break label372;
                     }

                     if (var22 == (30706 & 16063)) {
                        var14 -= (int)var54.getFormulas()[0].a((double)var56, var3, var4);
                        var73 = var1;
                        break label372;
                     }

                     if (var22 == (30715 & 16055)) {
                        var11 += (int)var54.getFormulas()[0].a((double)var56, var3, var4);
                        var73 = var1;
                        break label372;
                     }

                     if (var22 == (16119 & 30652)) {
                        var12 += (int)var54.getFormulas()[0].a((double)var56, var3, var4);
                        var73 = var1;
                        break label372;
                     }

                     if (var22 == (30654 & 16119)) {
                        var13 += (int)var54.getFormulas()[0].a((double)var56, var3, var4);
                     }
                  }
               }
            }
         }

         var73 = var1;
      }

      Mount var39 = var73.getPetMount(var0.getSid());
      if (var1.getGameView().getClient().gameMount) {
         double var43 = 1.0D;
         double var46 = 1.0D;
         double var50 = 1.0D;
         double var53 = 1.0D;
         var10001 = --4;
         int var72 = --3;
         var2[5] = var0.getBone();
         var2[6] = var0.getSpir();
         var2[7] = var0.getPower();
         var2[8] = var0.getSpeed();
         var2[9] = var0.getCalm();
         var2[0] = getPetValue(var3, var2[5], var5, var2[0], 0);
         var2[1] = getPetValue(var3, var2[6], var5, var2[1], 1);
         var2[2] = getPetValue(var3, var2[7], var5, var2[2], 2);
         var2[var72] = getPetValue(var3, var2[8], var5, var2[3], 3);
         var2[var10001] = getPetValue(var3, var2[9], var5, var2[4], 4);
         if (var39 != null) {
            String var24;
            int var27;
            int var28;
            int var29;
            BaseMountSkill var33;
            if (!hd.o(var24 = var39.getDataValue("JN"))) {
               if ((var4 = var39.getMountlvl()) > 100) {
                  var4 -= 100;
               }

               int var58 = (int)Math.floor((double)((float)var39.getSpri() + (float)var4 / 10.0F * (float)var39.getSpri() / 2.0F));
               int var60 = (int)Math.floor((double)((float)var39.getPower() + (float)var4 / 10.0F * (float)var39.getPower() / 2.0F));
               var27 = (int)Math.floor((double)((float)var39.getBone() + (float)var4 / 10.0F * (float)var39.getBone() / 2.0F));
               int var30;
               if ((var29 = (var28 = var39.getMountCZ()) >> 6) > 0) {
                  for(var71 = var30 = 0; var71 < 3; var71 = var30) {
                     if ((var28 >> 2 * var30 & 1) != 0) {
                        boolean var31 = (var28 >> 2 * var30 + 1 & 1) == 1;
                        if (var30 == 0) {
                           var58 += var31 ? var29 : -var29;
                        } else if (var30 == 1) {
                           var60 += var31 ? var29 : -var29;
                        } else if (var30 == 2) {
                           var27 += var31 ? var29 : -var29;
                        }
                     }

                     ++var30;
                  }
               }

               var30 = 0;

               byte var65;
               int var66;
               for(var71 = var65 = 0; var71 < var24.length(); var71 = var66) {
                  if ((var66 = var24.indexOf("#", var30 + 1)) == -1) {
                     var66 = var24.length();
                  }

                  if ((var33 = PropertyUtil.getBaseMountSkill(var24.substring(var30, var66))) == null) {
                     var71 = var66;
                  } else {
                     double var34 = var33.getXs(var58, var60, var27, var39.getProficiency(), var39.getMountid());
                     if (var33.getBt() == 0) {
                        var43 += var34 / var33.getBx() / 100.0D;
                        var71 = var66;
                     } else if (var33.getBt() == 1) {
                        var46 += var34 / var33.getBx() / 100.0D;
                        var71 = var66;
                     } else if (var33.getBt() == 2) {
                        var50 += var34 / var33.getBx() / 100.0D;
                        var71 = var66;
                     } else {
                        if (var33.getBt() == 3) {
                           var53 += var34 / var33.getBx() / 100.0D;
                        }

                        var71 = var66;
                     }
                  }

                  var30 = var71 + 1;
               }
            }

            BaseMountSH var37;
            if ((var37 = var1.getMountSHByMountId(var39.getMountid())) != null && var37.getLvl() > 0) {
               BaseMountSH var59 = var1.getMountSHByindex(0);
               BaseMountSkill var61 = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[var37.getId()]);
               BaseMountSkill var62 = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[0]);
               boolean var63 = false;
               var29 = var37.getLvl() - 1;
               double var64 = var62.getMountSHByZT(var37.getId(), var59.getLvl());
               var28 = var29 / var61.getBases().length;
               var29 = 1 + var29 % var61.getBases().length;
               int var32 = 0;
               int var67 = var28 > 0 ? var61.getBases().length : var29;

               for(var71 = var32; var71 < var67; var71 = var32) {
                  BaseQl var68 = var61.getBases()[var32];
                  double var35 = (double)(var28 + (var32 < var29 ? 1 : 0)) * var68.getValue() * var64;
                  if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE1[0])) {
                     var11 = (int)((double)var11 + var35);
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE1[1])) {
                     var12 = (int)((double)var12 + var35);
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE1[2])) {
                     var13 = (int)((double)var13 + var35);
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE1[3])) {
                     var14 = (int)((double)var14 + (var0.getSp() < 0 ? -var35 : var35));
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE2[0])) {
                     var43 += var35 / 100.0D;
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE2[1])) {
                     var46 += var35 / 100.0D;
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE2[2])) {
                     var50 += var35 / 100.0D;
                  } else if (var68.getKey().equals(PropertyUtil.SH_HEAD_BASE2[3])) {
                     var53 += var35 / 100.0D;
                  }

                  ++var32;
               }

               if ((var32 = var59.a(var39.getMountid())) > 0) {
                  var33 = var59.getMounts()[var32 - 1];
                  int var69 = 0;
                  int var70 = var33.getBases() != null && var33.getB3() > 0 ? var33.getBases().length : 0;

                  for(var71 = var69; var71 < var70; var71 = var69) {
                     BaseQl var36;
                     if ((var36 = var33.getBases()[var69]).getKey().equals("技能")) {
                        var27 = (int)var36.getValue();
                        var28 = (int)var36.getValue2();
                        if (var27 == 2105) {
                           var13 = (int)((double)var13 + Math.min(0.002D * (double)var28 * (double)var2[2], (double)(500 * var28)));
                        } else if (var27 == 2106) {
                           var13 = (int)((double)var13 + Math.min(0.004D * (double)var28 * (double)var2[2], (double)(1000 * var28)));
                        }
                     } else if (var36.getKey().equals(PropertyUtil.SH_HEAD_BASE3[0])) {
                        var11 = (int)((double)var11 + var36.getValue());
                     } else if (var36.getKey().equals(PropertyUtil.SH_HEAD_BASE3[1])) {
                        var12 = (int)((double)var12 + var36.getValue());
                     } else if (var36.getKey().equals(PropertyUtil.SH_HEAD_BASE3[2])) {
                        var13 = (int)((double)var13 + var36.getValue());
                     } else if (var36.getKey().equals(PropertyUtil.SH_HEAD_BASE3[3])) {
                        var14 = (int)((double)var14 + (var0.getSp() < 0 ? -var36.getValue() : var36.getValue()));
                     }

                     ++var69;
                  }
               }
            }
         }

         if (var7 > 0) {
            var11 += getPetValue(var3, var2[5] += var7, var5, var0.getHp(), 0) - var2[0];
         }

         if (var8 > 0) {
            var12 += getPetValue(var3, var2[6] += var8, var5, var0.getMp(), 1) - var2[1];
         }

         if (var9 > 0) {
            var13 += getPetValue(var3, var2[7] += var9, var5, var0.getAp(), 2) - var2[2];
         }

         if (var10 > 0) {
            var14 += getPetValue(var3, var2[8] += var10, var5, var0.getSp(), 3) - var2[3];
         }

         var2[0] = (int)((double)var2[0] * var43);
         var2[0] += var11;
         var2[1] = (int)((double)var2[1] * var46);
         var2[1] += var12;
         var2[2] = (int)((double)var2[2] * var50);
         var2[2] += var13;
         var2[3] = (int)((double)var2[3] * var53);
         var2[3] += var14;
         var0.getSI(var2, var3, cX.n(var0.getGrade()), var1.getObjectArea());
         return var2;
      } else {
         var2[5] = var0.getBone() + var7;
         var2[6] = var0.getSpir() + var8;
         var2[7] = var0.getPower() + var9;
         var2[8] = var0.getSpeed() + var10;
         var2[9] = var0.getCalm();
         var2[0] = getPetValue(var3, var2[5], var5, var2[0], 0) + var11;
         var2[1] = getPetValue(var3, var2[6], var5, var2[1], 1) + var12;
         var2[2] = getPetValue(var3, var2[7], var5, var2[2], 2) + var13;
         var2[3] = getPetValue(var3, var2[8], var5, var2[3], 3) + var14;
         var2[4] = getPetValue(var3, var2[9], var5, var2[4], 4);
         var0.getSI(var2, var3, cX.n(var0.getGrade()), var1.getObjectArea());
         List var41;
         if (var39 != null && (var41 = var39.getMountskill()) != null) {
            double var44 = 1.0D;
            double var48 = 1.0D;
            double var55 = 1.0D;
            double var57 = 1.0D;

            for(var71 = var4 = 0; var71 < var41.size(); var71 = var4) {
               String var25;
               if ((var25 = PropertyUtil.i(var39, ((MountSkill)var41.get(var4)).getSkillname())) != null) {
                  String[] var26;
                  if ((var26 = var25.split("="))[0].equals("HP")) {
                     var44 += Double.parseDouble(var26[1]);
                  } else if (var26[0].equals("MP")) {
                     var48 += Double.parseDouble(var26[1]);
                  } else if (var26[0].equals("AP")) {
                     var55 += Double.parseDouble(var26[1]);
                  } else if (var26[0].equals("SP")) {
                     var57 += Double.parseDouble(var26[1]);
                  }
               }

               ++var4;
            }

            var2[0] = (int)((double)var2[0] * var44);
            var2[1] = (int)((double)var2[1] * var48);
            var2[2] = (int)((double)var2[2] * var55);
            var2[3] = (int)((double)var2[3] * var57);
         }

         return var2;
      }
   }

   public static int[] getPalHMASp(Pal var0, PalData var1, RoleData var2) {
      int[] var10000 = new int[--4];
      boolean var10002 = true;
      int[] var8 = var10000;
      double var4 = var0 != null ? var0.getGrow() : 1.0D;
      Integer var6 = var2.getLoginResult().getGrade();
      int var12 = cX.d(var6);
      int var7 = cX.g(var6);
      int var10005;
      if (var0 != null) {
         Map var11;
         Map var14 = var11 = PropertyUtil.getPalMap(var0, (boolean)(3 & 5), var2);
         int var10003 = --3;
         var10005 = 5 >> 1;
         int var10007 = 5 >> 2;
         var8[3 ^ 3] = getBase(var12, (int)PropertyUtil.getMapValue(var11, "根骨"), var4, var1.getHp(), 5 >> 3, var11);
         var8[var10007] = getBase(var12, (int)PropertyUtil.getMapValue(var11, "灵性"), var4, var1.getMp(), --1, var11);
         var8[var10005] = getBase(var12, (int)PropertyUtil.getMapValue(var11, "力量"), var4, var1.getAp(), 1 ^ 3, var11);
         var8[var10003] = getBase(var12, (int)PropertyUtil.getMapValue(var11, "敏捷"), var4, var1.getSp(), --3, var11);
         var14.clear();
         return var8;
      } else {
         int[] var3;
         int var10 = (var3 = var1.getJds())[2 & 5] + var3[4 ^ 5] + var3[1 ^ 3] + var3[--3];
         int var13 = var12 + var7 * (43 & 124);
         var7 = var12 % var10;

         int var9;
         for(var13 = var9 = 3 ^ 3; var13 < var8.length; var13 = var9) {
            var8[var9] += var12 + var7 / var10 * var3[var9];
            if (var7 > 0 && var3[var9] > 0) {
               if (var7 > var1.getJds()[var9]) {
                  var8[var9] += var3[var9];
                  var7 -= var3[var9];
               } else {
                  var8[var9] += var7;
                  var7 = 3 ^ 3;
               }
            }

            ++var9;
         }

         int var15 = --3;
         int var10004 = 1 ^ 3;
         var10005 = --1;
         var8[3 ^ 3] = getPetValue(var12, var8[3 ^ 3], var4, var1.getHp(), 3 ^ 3);
         var8[var10005] = getPetValue(var12, var8[5 >> 2], var4, var1.getMp(), 4 ^ 5);
         var8[var10004] = getPetValue(var12, var8[5 >> 1], var4, var1.getAp(), 1 ^ 3);
         var8[var15] = getPetValue(var12, var8[--3], var4, var1.getSp(), --3);
         return var8;
      }
   }

   public static int getPetValue(int var0, int var1, double var2, int var4, int var5) {
      if (var5 != 0 && var5 != 5 >> 2) {
         if (var5 == (1 ^ 3)) {
            return (int)((double)(var0 * var1) * var2 / 5.0D) + (int)((0.14D * (double)var0 * var2 + 1.0D) * (double)var4);
         } else {
            return var5 == --3 ? (int)((double)(var4 + var1) * var2) : var1;
         }
      } else {
         return (int)((double)(var0 * var1) * var2) + (int)((0.7D * (double)var0 * var2 + 1.0D) * (double)var4);
      }
   }

   public static int getBase(int var0, int var1, double var2, int var4, int var5, Map<String, Double> var6) {
      var1 = getPetValue(var0, var1, var2, var4, var5);
      if (var5 == 0) {
         return (int)((double)((int)((double)((int)((double)((int)((double)((int)((double)var1 + PropertyUtil.getMapValue(var6, "hp"))) + PropertyUtil.getMapValue(var6, "HP"))) + PropertyUtil.getMapValue(var6, "加气血"))) * (PropertyUtil.getMapValue(var6, "HP成长") + 1.0D))) * (PropertyUtil.getMapValue(var6, "加强气血") / 100.0D + 1.0D));
      } else if (var5 == 5 >> 2) {
         return (int)((double)((int)((double)((int)((double)((int)((double)var1 + PropertyUtil.getMapValue(var6, "mp"))) + PropertyUtil.getMapValue(var6, "MP"))) + PropertyUtil.getMapValue(var6, "加魔法"))) * (PropertyUtil.getMapValue(var6, "MP成长") + PropertyUtil.getMapValue(var6, "加强魔法") / 100.0D + 1.0D));
      } else if (var5 == (1 ^ 3)) {
         return (int)((double)((int)((double)((int)((double)((int)((double)((int)((double)var1 + PropertyUtil.getMapValue(var6, "ap"))) + PropertyUtil.getMapValue(var6, "AP"))) + PropertyUtil.getMapValue(var6, "攻击"))) + PropertyUtil.getMapValue(var6, "加攻击"))) * (PropertyUtil.getMapValue(var6, "AP成长") + PropertyUtil.getMapValue(var6, "加强攻击") / 100.0D + 1.0D));
      } else {
         if (var5 == --3) {
            var1 = (int)((double)((int)((double)((int)((double)((int)((double)((int)((double)var1 + PropertyUtil.getMapValue(var6, "sp"))) + PropertyUtil.getMapValue(var6, "SP"))) + PropertyUtil.getMapValue(var6, "速度"))) + PropertyUtil.getMapValue(var6, "加速度"))) * (PropertyUtil.getMapValue(var6, "SP成长") + PropertyUtil.getMapValue(var6, "加强速度") / 100.0D + 1.0D));
         }

         return var1;
      }
   }
}
