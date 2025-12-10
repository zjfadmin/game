package com.xy.formula;

import com.xy.bk;
import com.xy.cX;
import com.xy.em;
import com.xy.fO;
import com.xy.hd;
import com.xy.lg;
import com.xy.bean.UseCardBean;
import com.xy.entity.Lingbao;
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
import com.xy.socket.GameClient;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PropertyUtil {
   public static Map<String, BaseMountSkill> mountSkillMap;
   public static String[] SH_HEAD_BASE2;
   public static double[][] zuoqi;
   public static String[] SH_HEAD_BASE1;
   public static double[] xishu;
   public static String[] SH_HEAD_BASE3;

   public static void a(RoleSummoning var0, Ql var1, int var2, int var3, String var4) {
      int var5 = cX.p(var0.getGrade());
      int var6 = var0.getTurnRount();
      long var7 = var0.getFriendliness();
      double var9;
      if (var4.equals("暗度陈仓")) {
         var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 5.0E-6D;
         QualityZW.c(var1, "忽视躲闪", (double)Math.round(var9 * 10000.0D) / 100.0D);
         QualityZW.c(var1, "忽视反击", (double)Math.round(var9 * 10000.0D) / 100.0D);
      } else if (var4.equals("凌波微步")) {
         var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 1.0E-5D;
         QualityZW.c(var1, "躲闪率", (double)Math.round(var9 * 10000.0D) / 100.0D);
      } else {
         int var13;
         if (var4.equals("借力打力")) {
            var13 = e(var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 1.0E-5D);
            QualityZW.c(var1, "反击率", (double)Math.round(var9 * 10000.0D) / 100.0D);
            QualityZW.c(var1, "反击次数", (double)var13);
         } else if (var4.equals("梅花三弄")) {
            var13 = b(var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 5.0E-6D);
            QualityZW.c(var1, "仙法连击率", (double)Math.round(var9 * 10000.0D) / 100.0D);
            QualityZW.c(var1, "仙法连击次数", (double)var13);
         } else if (var4.equals("红颜白发")) {
            var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 5.0E-6D;
            QualityZW.c(var1, "仙法狂暴", (double)Math.round(var9 * 10000.0D) / 100.0D);
         } else if (var4.equals("开天辟地")) {
            var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 5.0E-6D;
            QualityZW.c(var1, "忽视仙法抗性率", (double)Math.round(var9 * 10000.0D) / 100.0D * 0.7D);
            QualityZW.c(var1, "忽视仙法抗性程度", (double)Math.round(var9 * 10000.0D) / 100.0D);
         } else {
            if (var4.equals("万佛朝宗")) {
               double var11 = (var9 = Math.floor((Math.pow((double)(var5 * var2) * 0.04D, 0.5D) * (1.0D + 0.25D * (double)var3) + Math.pow((double)var7, 0.16666666666666666D) * c(var6, var3) * (double)var2 / 50.0D) * 1000.0D) * 5.0E-6D) * 2.0D;
               QualityZW.c(var1, "反震率", (double)Math.round(var9 * 10000.0D) / 100.0D);
               QualityZW.c(var1, "反震程度", (double)Math.round(var11 * 10000.0D) / 100.0D);
            }

         }
      }
   }

   public static int b(double var0) {
      if (var0 > 0.28D) {
         return --5;
      } else if (var0 > 0.21D) {
         return --4;
      } else if (var0 > 0.14D) {
         return --3;
      } else {
         return var0 > 0.7D ? 1 ^ 3 : 1;
      }
   }

   public static double c(int var0, int var1) {
      if (var0 * var1 == --1) {
         return 1.04D;
      } else if (var0 * var1 == --4) {
         return 1.071D;
      } else if (var0 * var1 == (103 & 30)) {
         return 1.073D;
      } else {
         return var0 * var1 == (125 & 11) ? 1.09D : 1.0D;
      }
   }

   public static void d(Map<String, Double> var0, String var1, double var2) {
      if (var2 != 0.0D) {
         Double var4;
         if ((var4 = (Double)var0.get(var1)) != null) {
            var2 += var4;
         }

         var0.put(var1, var2);
      }
   }

   public static int e(double var0) {
      if (var0 > 0.56D) {
         return 26 & 111;
      } else if (var0 > 0.51D) {
         return 10 & 125;
      } else if (var0 > 0.45D) {
         return 111 & 23;
      } else if (var0 > 0.39D) {
         return 103 & 30;
      } else if (var0 > 0.32D) {
         return --5;
      } else if (var0 > 0.25D) {
         return --4;
      } else if (var0 > 0.17D) {
         return --3;
      } else {
         return var0 > 0.09D ? --2 : 1;
      }
   }

   public static String f(String var0) {
      int var1 = var0.indexOf("=");
      String var2;
      return (var2 = var0.substring(5 >> 3, var1)).equals("抗三尸虫") ? var2 + "+" + hd.b(var0, var1 + (4 ^ 5), var0.length()) : var2 + "+" + (int)(Float.parseFloat(var0.substring(var1 + (3 & 5))) * 100.0F) + "%";
   }

   public static synchronized Map<String, Double> getBaoMap(Lingbao var0, RoleData var1) {
      Map var2;
      (var2 = em.e()).put("契合度", (double)var0.getLingbaoqihe());
      var2.put("活跃", (double)var0.getBaoactive());
      var2.put("速度", Double.parseDouble(var0.getBaospeed()));
      var2.put("支援", var0.getAssistance());
      var2.put("伤害", Double.parseDouble(var0.getBaoap()));
      var2.put("回复", Double.parseDouble(var0.getBaoreply()));
      var2.put("落宝", var0.getBaoshot());
      var2.put("抗落宝", var0.getResistshop());
      int var5;
      int var10000;
      Map var26;
      if (var0.getTianfuskill() != null) {
         String[] var6 = var0.getTianfuskill().split("\\|");

         int var4;
         for(var10000 = var4 = 3 >> 2; var10000 < var6.length; var10000 = var4) {
            var5 = var6[var4].startsWith("低级") ? 5 >> 2 : (var6[var4].startsWith("高级") ? 1 ^ 3 : 0);
            if (var5 != 0) {
               String var3;
               if ((var3 = var6[var4].substring(--2)).equals("契合")) {
                  d(var2, "契合度百分比", (double)var5 * 0.1D);
               } else if (var3.equals("闪现")) {
                  d(var2, "支援", (double)var5 * 0.1D);
               } else if (var3.equals("活跃")) {
                  d(var2, "活跃百分比", (double)var5 * 0.1D);
               } else if (var3.equals("抵抗")) {
                  d(var2, "抗落宝", (double)var5 * 0.1D);
               } else if (var3.equals("敏捷")) {
                  d(var2, "速度", (double)(var5 == (4 ^ 5) ? 2558 & 30409 : 300));
               } else if (var3.endsWith("增强") || var3.endsWith("回生")) {
                  int var7 = 0;
                  if (var3.startsWith("根骨")) {
                     var26 = var2;
                     var7 = var1.getRoleProperty().getBone() / --4;
                  } else if (var3.startsWith("灵性")) {
                     var26 = var2;
                     var7 = var1.getRoleProperty().getSpir() / --4;
                  } else if (var3.startsWith("力量")) {
                     var26 = var2;
                     var7 = var1.getRoleProperty().getPower() / --4;
                  } else {
                     if (var3.startsWith("敏捷")) {
                        var7 = var1.getRoleProperty().getSpeed() / --4;
                     }

                     var26 = var2;
                  }

                  String var10001;
                  int var10002;
                  if (var3.endsWith("增强")) {
                     var10001 = "伤害";
                     var10002 = var5;
                  } else {
                     var10001 = "回复";
                     var10002 = var5;
                  }

                  d(var26, var10001, (double)(var10002 * var7) * 5.0E-4D);
               }
            }

            ++var4;
         }
      }

      if (var0.getFushis() != null && !var0.getFushis().equals("")) {
         String[] var21;
         int var17 = (var21 = var0.getFushis().split("\\|")).length;

         for(var10000 = var5 = 5 >> 3; var10000 < var17; var10000 = var5) {
            String var18 = var21[var5];
            Goodstable var8;
            if ((var8 = var1.getGoodEquip(new BigDecimal(var18))) != null) {
               String[] var20 = var8.getValue().split("\\|");
               Map var9 = em.e();

               int var10;
               for(var10000 = var10 = 2 & 5; var10000 < var20.length; var10000 = var10) {
                  if (var20[var10].startsWith(GoodType.Extras[5 >> 2])) {
                     String[] var11 = var20[var10].split("&");

                     int var12;
                     for(var10000 = var12 = --2; var10000 < var11.length; var10000 = var12) {
                        int var13;
                        if ((var13 = var11[var12].indexOf("=")) != -4 >> 2) {
                           String var14 = var11[var12].substring(3 & 4, var13);
                           double var15 = Double.parseDouble(var11[var12].substring(var13 + (5 >> 2)));
                           d(var9, var14, var15);
                        }

                        ++var12;
                     }

                     var20[var10] = null;
                     break;
                  }

                  ++var10;
               }

               for(var10000 = var10 = 0; var10000 < var20.length; var10000 = var10) {
                  int var22;
                  if (var20[var10] != null && (var22 = var20[var10].indexOf("=")) != -4 >> 2) {
                     String var23 = var20[var10].substring(5 >> 3, var22);
                     double var24 = Double.parseDouble(var20[var10].substring(var22 + (5 >> 2)));
                     if (var23.equals("负敏")) {
                        var23 = "速度";
                        var24 = -var24;
                        var26 = var9;
                     } else {
                        if (!var23.equals("速度") && !var23.equals("活跃")) {
                           var24 /= 100.0D;
                        }

                        var26 = var9;
                     }

                     Double var25;
                     if ((var25 = (Double)var26.get(var23.equals("负敏") ? "加强速度" : "加强" + var23)) != null) {
                        var24 *= 1.0D + var25 / 100.0D;
                     }

                     d(var2, var23, var24);
                  }

                  ++var10;
               }

               em.d(var9);
            }

            ++var5;
         }
      }

      Double var19;
      if ((var19 = (Double)var2.remove("契合度百分比")) != null) {
         d(var2, "契合度", (Double)var2.get("契合度") * var19);
      }

      if ((var19 = (Double)var2.remove("活跃百分比")) != null) {
         d(var2, "活跃", (Double)var2.get("活跃") * var19);
      }

      return var2;
   }

   public static BaseMountSkill getBaseMountSkill(String var0) {
      return (BaseMountSkill)mountSkillMap.get(var0);
   }

   public static String getBaoString(Lingbao var0, RoleData var1, int var2) {
      var2 = (var2 - (95 & 38)) / --2 / (70 & 63) * (71 & 62);
      int var5 = 3 >> 2;
      int var4 = 5 >> 3;
      StringBuffer var3 = new StringBuffer();
      Map var6;
      Map var10000 = var6 = getBaoMap(var0, var1);
      var3.append("#G契合度");
      var5 = var3.length();
      var3.append(((Double)var10000.get("契合度")).longValue());
      int var8 = var3.length() - var5;
      var4 = (var2 - (36 & 127) - var8 * (62 & 71)) / (110 & 23);
      int var7 = 3 >> 2;

      int var9;
      for(var9 = var7; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      var3.append(" 活跃度");
      var5 = var3.length();
      var3.append(((Double)var6.get("活跃")).longValue() + "#W(" + var0.getBaoactive() + ")");
      var8 = var3.length() - --2 - var5;
      var4 = (var2 - (127 & 36) - var8 * (15 & 118)) / (63 & 70);
      var7 = 3 ^ 3;

      for(var9 = var7; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      var3.append("#r#G速度");
      var5 = var3.length();
      var3.append(((Double)var6.get("速度")).longValue() + "#W(" + var0.getBaospeed() + ")");
      var8 = var3.length() - (1 ^ 3) - var5;
      var4 = (var2 - (31 & 120) - var8 * (87 & 46)) / (15 & 118);
      var7 = 3 & 4;

      for(var9 = var7; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      var3.append(" #G援助");
      var5 = var3.length();
      var3.append(hd.ak((Double)var6.get("支援") * 100.0D, 4 ^ 5) + "#W(" + hd.ak(var0.getAssistance() * 100.0D, 3 & 5) + ")");
      var8 = var3.length() - (5 >> 1) - var5;
      var4 = (var2 - (30 & 121) - var8 * (39 & 94)) / (71 & 62);
      var7 = 5 >> 3;

      for(var9 = var7; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      StringBuffer var10;
      if (var0.getBaotype().equals("攻击")) {
         var3.append("#r#G伤害");
         var5 = var3.length();
         var3.append(hd.ak((Double)var6.get("伤害") * 100.0D, --1) + "#W(" + hd.ak(Double.parseDouble(var0.getBaoap()) * 100.0D, 5 >> 2) + ")");
         var10 = var3;
      } else if (var0.getBaotype().equals("辅助")) {
         var3.append("#r#G回复");
         var5 = var3.length();
         var3.append(hd.ak((Double)var6.get("回复") * 100.0D, 5 >> 2) + "#W(" + hd.ak(Double.parseDouble(var0.getBaoreply()) * 100.0D, 3 >> 1) + ")");
         var10 = var3;
      } else {
         var3.append("#r#G落宝");
         var5 = var3.length();
         var3.append(hd.ak((Double)var6.get("落宝") * 100.0D, 5 >> 2) + "#W(" + hd.ak(var0.getBaoshot() * 100.0D, --1) + ")");
         var10 = var3;
      }

      var8 = var10.length() - (1 ^ 3) - var5;
      var4 = (var2 - (126 & 25) - var8 * 6) / 6;

      for(var9 = var7 = 3 ^ 3; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      var3.append(" #G抗落宝");
      var5 = var3.length();
      var3.append(hd.ak((Double)var6.get("抗落宝") * 100.0D, 4 ^ 5) + "#W(" + hd.ak(var0.getResistshop() * 100.0D, 3 & 5) + ")");
      var8 = var3.length() - (1 ^ 3) - var5;
      var4 = (var2 - 36 - var8 * 6) / 6;
      var7 = 3 ^ 3;

      for(var9 = var7; var9 < var4; var9 = var7) {
         ++var7;
         var3.insert(var5, " ");
      }

      em.d(var6);
      return var3.toString();
   }

   public static String g(String var0, Mount var1, String var2) {
      double var3 = 1.0D;
      if (var1.getMountid() == --2 || var1.getMountid() == --4) {
         var3 = 1.2D;
      }

      int var5;
      if ((var5 = var1.getMountlvl()) > (119 & 108)) {
         var5 -= 100;
      }

      Mount var10000 = var1;
      int var6 = (int)Math.floor((double)((float)var1.getSpri() + (float)var5 / 10.0F * (float)var1.getSpri() / 2.0F));
      int var7 = (int)Math.floor((double)((float)var1.getPower() + (float)var5 / 10.0F * (float)var1.getPower() / 2.0F));
      int var10 = (int)Math.floor((double)((float)var1.getBone() + (float)var5 / 10.0F * (float)var1.getBone() / 2.0F));
      var5 = var10000.getProficiency();
      double var8 = 0.0D;
      if (var0.equals("HP")) {
         if (var2.equals("金身不坏")) {
            var8 = ((double)var10 * xishu[5 >> 1] + (double)var6 * xishu[--4] + (double)var7 * xishu[3 >> 1]) * var3 / zuoqi[--4][2 & 5] + (double)(var5 / (16150 & 26617)) / zuoqi[--4][--1];
         } else if (var2.equals("后发制人")) {
            var8 = ((double)var10 * xishu[3 & 4] + (double)var6 * xishu[--4] + (double)var7 * xishu[--3]) * var3 / zuoqi[113 & 30][3 ^ 3] + (double)var5 / xishu[87 & 47] / zuoqi[125 & 18][--1];
         } else if (var2.equals("心如止水")) {
            var8 = ((double)var10 * xishu[--2] + (double)var6 * xishu[--1] + (double)var7 * xishu[--5]) * var3 / zuoqi[5 >> 2][3 ^ 3] + (double)var5 / xishu[110 & 23] / zuoqi[5 >> 2][3 >> 1];
         }
      } else if (var0.equals("MP")) {
         if (var2.equals("天雷怒火")) {
            var8 = ((double)var10 * xishu[--4] + (double)var6 * xishu[--3] + (double)var7 * xishu[5 >> 3]) * var3 / zuoqi[45 & 95][5 >> 3] + (double)var5 / xishu[22 & 111] / zuoqi[45 & 95][3 >> 1];
         } else if (var2.equals("兴风作浪")) {
            var8 = ((double)var10 * xishu[2 ^ 3] + (double)var6 * xishu[1 ^ 3] + (double)var7 * xishu[--5]) * var3 / zuoqi[126 & 11][3 ^ 3] + (double)var5 / xishu[15 & 118] / zuoqi[126 & 11][4 ^ 5];
         } else if (var2.equals("万劫不复")) {
            var8 = ((double)var10 * xishu[--5] + (double)(var6 * (5 >> 2)) + (double)var7 * xishu[--4]) * var3 / zuoqi[30 & 105][2 & 5] + (double)var5 / xishu[86 & 47] / zuoqi[25 & 110][--1];
         }
      } else if (var0.equals("AP")) {
         var8 = ((double)var10 * xishu[5] + (double)var6 * xishu[4] + (double)(var7 * 1)) * var3 / zuoqi[119 & 26][0] + (double)var5 / xishu[7] / zuoqi[18][1];
      } else if (var0.equals("SP")) {
         if (var2.equals("夺命追魂")) {
            var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[0] + (double)var7 * xishu[3]) * var3 / zuoqi[21][0] + (double)var5 / xishu[6] / zuoqi[21][1];
         } else if (var2.equals("天神护体")) {
            var8 = ((double)(var10 * 1) + (double)var6 * xishu[4] + (double)var7 * xishu[4]) * var3 / zuoqi[3][0] + (double)var5 / xishu[6] / zuoqi[3][1];
         }
      } else if (!var0.equals("连击率") && !var0.equals("致命") && !var0.equals("命中")) {
         if (var0.equals("抗鬼火")) {
            if (var2.equals("天神护体")) {
               var8 = ((double)(var10 * 1) + (double)var6 * xishu[4] + (double)var7 * xishu[4]) * var3 / zuoqi[2][0] + (double)var5 / xishu[6] / zuoqi[2][1];
            } else if (var2.equals("天雷怒火")) {
               var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[2] + (double)var7 * xishu[1]) * var3 / zuoqi[15][0] + (double)var5 / xishu[6] / zuoqi[15][1];
            } else if (var2.equals("兴风作浪")) {
               var8 = ((double)var10 * xishu[1] + (double)var6 * xishu[2] + (double)var7 * xishu[5]) * var3 / zuoqi[12][0] + (double)var5 / xishu[6] / zuoqi[12][1];
            }
         } else if (!var0.equals("抗风法") && !var0.equals("抗火法") && !var0.equals("抗水法") && !var0.equals("抗雷法")) {
            if (!var0.equals("火法伤害") && !var0.equals("雷法伤害") && !var0.equals("火雷伤害")) {
               if (var0.equals("抗火雷")) {
                  var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[2] + (double)var7 * xishu[1]) * var3 / zuoqi[15][0] + (double)var5 / xishu[6] / zuoqi[15][1];
               } else if (var0.equals("抗物理")) {
                  var8 = ((double)var10 * xishu[3] + (double)var6 * xishu[5] + (double)var7 * xishu[0]) * var3 / zuoqi[5][0] + (double)var5 / xishu[6] / zuoqi[5][1];
               } else if (var0.equals("抗震慑")) {
                  var8 = ((double)var10 * xishu[3] + (double)var6 * xishu[4] + (double)var7 * xishu[1]) * var3 / zuoqi[6][0] + (double)var5 / xishu[6] / zuoqi[6][1];
               } else if (var0.equals("抗中毒")) {
                  if (var2.equals("金身不坏")) {
                     var8 = ((double)var10 * xishu[2] + (double)var6 * xishu[4] + (double)var7 * xishu[0]) * var3 / zuoqi[7][0] + (double)(var5 / 10000) / zuoqi[7][1];
                  } else if (var2.equals("心如止水")) {
                     var8 = ((double)var10 * xishu[3] + (double)var6 * xishu[0] + (double)var7 * xishu[4]) * var3 / zuoqi[0][0] + (double)var5 / xishu[7] / zuoqi[0][1];
                  }
               } else if (var0.equals("抗三尸虫")) {
                  var8 = ((double)var10 * xishu[2] + (double)var6 * xishu[4] + (double)var7 * xishu[0]) * 125.0D / 3.0D + (double)(var5 * 1500 / 100000);
               } else if (var0.equals("狂暴")) {
                  if (var2.equals("破釜沉舟")) {
                     var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[4] + (double)(var7 * 1)) * var3 / zuoqi[19][0] + (double)var5 / xishu[6] / zuoqi[19][1];
                  } else if (var2.equals("后发制人")) {
                     var8 = ((double)var10 * xishu[1] + (double)var6 * xishu[5] + (double)var7 * xishu[3]) * var3 / zuoqi[17][0] + (double)var5 / xishu[6] / zuoqi[17][1];
                  }
               } else if (!var0.equals("忽视防御几率") && !var0.equals("忽视防御程度")) {
                  if (!var0.equals("风法伤害") && !var0.equals("水法伤害")) {
                     if (!var0.equals("加强风") && !var0.equals("加强火") && !var0.equals("加强水") && !var0.equals("加强雷")) {
                        if (!var0.equals("抗昏睡") && !var0.equals("抗封印") && !var0.equals("抗混乱")) {
                           if (var0.equals("抗遗忘")) {
                              var8 = ((double)var10 * xishu[3] + (double)var6 * xishu[0] + (double)var7 * xishu[4]) * var3 / zuoqi[0][0] + (double)var5 / xishu[7] / zuoqi[0][1];
                           }
                        } else {
                           var8 = ((double)var10 * xishu[3] + (double)var6 * xishu[0] + (double)var7 * xishu[4]) * var3 / zuoqi[0][0] + (double)var5 / xishu[7] / zuoqi[0][1];
                        }
                     } else {
                        var8 = ((double)var10 * xishu[5] + (double)(var6 * 1) + (double)var7 * xishu[5]) * var3 / zuoqi[9][0] + (double)var5 / xishu[6] / zuoqi[9][1];
                     }
                  } else {
                     var8 = ((double)var10 * xishu[0] + (double)var6 * xishu[3] + (double)var7 * xishu[5]) * var3 / zuoqi[11][0] + (double)var5 / xishu[6] / zuoqi[11][1];
                  }
               } else {
                  var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[5] + (double)(var7 * 1)) * var3 / zuoqi[20][0] + (double)var5 / xishu[6] / zuoqi[20][1];
               }
            } else {
               var8 = ((double)var10 * xishu[5] + (double)var6 * xishu[3] + (double)var7 * xishu[0]) * var3 / zuoqi[14][0] + (double)(var5 / 10000) / zuoqi[14][1];
            }
         } else if (var2.equals("天神护体")) {
            var8 = ((double)(var10 * 1) + (double)var6 * xishu[4] + (double)var7 * xishu[4]) * var3 / zuoqi[2][0] + (double)var5 / xishu[6] / zuoqi[2][1];
         } else if (var2.equals("兴风作浪")) {
            var8 = ((double)var10 * xishu[1] + (double)var6 * xishu[2] + (double)var7 * xishu[5]) * var3 / zuoqi[12][0] + (double)var5 / xishu[6] / zuoqi[12][1];
         } else if (var2.equals("天雷怒火")) {
            var8 = ((double)var10 * xishu[4] + (double)var6 * xishu[2] + (double)var7 * xishu[1]) * var3 / zuoqi[15][0] + (double)var5 / xishu[6] / zuoqi[15][1];
         }
      } else {
         var8 = ((double)var10 * xishu[5] + (double)var6 * xishu[1] + (double)var7 * xishu[2]) * var3 / zuoqi[22][0] + (double)(var5 / 10000) / zuoqi[22][1];
      }

      String var11 = var0 + "=" + k(var8 / 100.0D);
      if (var0.equals("抗三尸虫")) {
         var11 = var0 + "=" + (int)k(var8);
      }

      return var11;
   }

   public static void getMountSHZTString(RoleData var0, StringBuffer var1, boolean var2) {
      BaseMountSH var3 = var0.getMountSHByindex(2 & 5);
      BaseMountSkill var4 = getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[3 & 4]);
      int var10000;
      int var7;
      if (var2) {
         for(var10000 = var7 = 3 ^ 3; var10000 < 4; var10000 = var7) {
            double var8 = var3.getLvl() > 0 ? var4.getMountSHByZTPercentage(var7 + (4 ^ 5), var3.getLvl()) : 0.0D;
            if (var8 <= 0.0D) {
               return;
            }

            var1.append(var7 == 0 ? "#G" : "#r");
            var1.append(BaseMountSH.SH_HEAD_NAME[--1 + var7]);
            var1.append("守护属性提升");
            var1.append(hd.ak(var8, --1));
            ++var7;
            var1.append("%");
         }

      } else {
         var1.append(var3.getLvl() == 0 ? "#c727272" : "#G");
         var7 = 3 ^ 3;

         for(var10000 = var7; var10000 < 24; var10000 = var7) {
            if (var7 != 0) {
               var1.append("#r");
            }

            if (var7 == var3.getLvl()) {
               var1.append("#c727272");
            }

            BaseQl var5 = var4.getBases()[var7 / --4];
            var1.append(var7 + (3 >> 1));
            var1.append(var7 < (123 & 13) ? "级  " : "级 ");
            var1.append(BaseMountSH.SH_HEAD_NAME[(2 ^ 3) + var7 % --4]);
            var1.append("守护属性提升");
            var1.append(hd.ak(var5.getValue(), 5 >> 2));
            ++var7;
            var1.append("%");
         }

      }
   }

   public static double getMapValue(Map<String, Double> var0, String var1) {
      Double var2;
      return (var2 = (Double)var0.get(var1)) != null ? var2 : 0.0D;
   }

   public static String h(Mount var0, String var1) {
      String var4 = "";
      String var2;
      String var3;
      String var5;
      String var6;
      if (var1.equals("夺命追魂")) {
         var3 = g("SP", var0, "夺命追魂");
         var2 = g("连击率", var0, "夺命追魂");
         var5 = g("致命", var0, "夺命追魂");
         var6 = g("命中", var0, "夺命追魂");
         return var3 + "|" + var2 + "|" + var5 + "|" + var6;
      } else {
         String var7;
         String var8;
         if (var1.equals("天雷怒火")) {
            var3 = g("MP", var0, "天雷怒火");
            var2 = g("火法伤害", var0, "天雷怒火");
            var5 = g("雷法伤害", var0, "天雷怒火");
            var6 = g("抗火", var0, "天雷怒火");
            var7 = g("抗雷", var0, "天雷怒火");
            var8 = g("抗鬼火", var0, "天雷怒火");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7 + "|" + var8;
         } else if (var1.equals("金身不坏")) {
            var3 = g("HP", var0, "金身不坏");
            var2 = g("抗物理", var0, "金身不坏");
            var5 = g("抗震慑", var0, "金身不坏");
            var6 = g("抗中毒", var0, "金身不坏");
            var7 = g("抗三尸虫", var0, "金身不坏");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7;
         } else if (var1.equals("破釜沉舟")) {
            var3 = g("AP", var0, "破釜沉舟");
            var2 = g("狂暴", var0, "破釜沉舟");
            var5 = g("忽视防御几率", var0, "破釜沉舟");
            var6 = g("忽视防御程度", var0, "破釜沉舟");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6;
         } else if (var1.equals("兴风作浪")) {
            var3 = g("MP", var0, "兴风作浪");
            var2 = g("风法伤害", var0, "兴风作浪");
            var5 = g("水法伤害", var0, "兴风作浪");
            var6 = g("抗风法", var0, "兴风作浪");
            var7 = g("抗水法", var0, "兴风作浪");
            var8 = g("抗鬼火", var0, "兴风作浪");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7 + "|" + var8;
         } else if (var1.equals("天神护体")) {
            var3 = g("SP", var0, "天神护体");
            var2 = g("抗风法", var0, "天神护体");
            var5 = g("抗火法", var0, "天神护体");
            var6 = g("抗水法", var0, "天神护体");
            var7 = g("抗雷法", var0, "天神护体");
            var8 = g("抗鬼火", var0, "天神护体");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7 + "|" + var8;
         } else if (var1.equals("后发制人")) {
            var3 = g("HP", var0, "后发制人");
            var2 = g("狂暴", var0, "后发制人");
            return var3 + "|" + var2;
         } else if (var1.equals("万劫不复")) {
            var3 = g("MP", var0, "万劫不复");
            var2 = g("加强风", var0, "万劫不复");
            var5 = g("加强火", var0, "万劫不复");
            var6 = g("加强水", var0, "万劫不复");
            var7 = g("加强雷", var0, "万劫不复");
            return var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7;
         } else {
            if (var1.equals("心如止水")) {
               var3 = g("HP", var0, "心如止水");
               var2 = g("抗昏睡", var0, "心如止水");
               var5 = g("抗封印", var0, "心如止水");
               var6 = g("抗中毒", var0, "心如止水");
               var7 = g("抗混乱", var0, "心如止水");
               var8 = g("抗遗忘", var0, "心如止水");
               var4 = var3 + "|" + var2 + "|" + var5 + "|" + var6 + "|" + var7 + "|" + var8;
            }

            return var4;
         }
      }
   }

   public static Map<String, Double> getPalMap(Pal var0, boolean var1, RoleData var2) {
      Map var7 = em.e();
      PalData var4;
      if ((var4 = var2.getObjectArea().aa(var0.getpId())) == null) {
         return var7;
      } else {
         Integer var10000 = var2.getLoginResult().getGrade();
         int var5 = cX.d(var10000);
         int var6 = cX.g(var10000);
         int var8;
         String[] var13;
         String var10001;
         String[] var17;
         int var20;
         Pal var21;
         int var23;
         if (var1) {
            label127: {
               int[] var3;
               var8 = (var3 = var4.getJds())[3 ^ 3] + var3[4 ^ 5] + var3[5 >> 1] + var3[--3];
               int var9 = var5 + var6 * (44 & 123);
               d(var7, "根骨", (double)(var5 + var9 / var8 * var4.getJds()[3 ^ 3]));
               d(var7, "灵性", (double)(var5 + var9 / var8 * var4.getJds()[3 & 5]));
               d(var7, "力量", (double)(var5 + var9 / var8 * var4.getJds()[1 ^ 3]));
               d(var7, "敏捷", (double)(var5 + var9 / var8 * var4.getJds()[--3]));
               var9 = var5 % var8;

               int var10;
               for(var20 = var10 = 3 & 4; var20 < var3.length; var20 = var10) {
                  if (var9 <= 0) {
                     var21 = var0;
                     break label127;
                  }

                  if (var3[var10] != 0) {
                     if (var9 > var3[var10]) {
                        PalData var10002;
                        if (var10 == 0) {
                           var10001 = "根骨";
                           var10002 = var4;
                        } else if (var10 == (2 ^ 3)) {
                           var10001 = "灵性";
                           var10002 = var4;
                        } else if (var10 == 5 >> 1) {
                           var10001 = "力量";
                           var10002 = var4;
                        } else {
                           var10001 = "敏捷";
                           var10002 = var4;
                        }

                        d(var7, var10001, (double)var10002.getJds()[var10]);
                        var9 -= var4.getJds()[var10];
                     } else {
                        if (var10 == 0) {
                           var10001 = "根骨";
                           var23 = var9;
                        } else if (var10 == 3 >> 1) {
                           var10001 = "灵性";
                           var23 = var9;
                        } else if (var10 == 5 >> 1) {
                           var10001 = "力量";
                           var23 = var9;
                        } else {
                           var10001 = "敏捷";
                           var23 = var9;
                        }

                        d(var7, var10001, (double)var23);
                        var9 = 2 & 5;
                     }
                  }

                  ++var10;
               }

               var21 = var0;
            }
         } else {
            if (var4.getKx() != null && !var4.getKx().equals("")) {
               var13 = var4.getKx().split("\\|");

               for(var20 = var8 = 2 & 5; var20 < var13.length; var20 = var8) {
                  String[] var22 = var17 = var13[var8].split("=");
                  double var18 = Double.parseDouble(var22[3 & 5]);
                  if (var22.length == --3) {
                     var18 += Double.parseDouble(var17[5 >> 1]) * (double)var5;
                  }

                  var23 = 5 >> 3;
                  ++var8;
                  d(var7, var17[var23], var18);
               }
            }

            var21 = var0;
         }

         if (var21.getParts() != null && !var0.getParts().equals("")) {
            var13 = var0.getParts().split("\\|");

            for(var20 = var8 = 3 & 4; var20 < var13.length; var20 = var8) {
               var17 = var13[var8].split("=");
               Goodstable var19;
               if ((var19 = var2.getGoodEquip(new BigDecimal(var17[3 & 5]))) != null) {
                  String[] var11 = var19.getValue().split("\\|");

                  int var15;
                  for(var20 = var15 = 2 ^ 3; var20 < var11.length; var20 = var15) {
                     String[] var16;
                     if (var11[var15].startsWith(GoodType.Extras[3 ^ 3])) {
                        var16 = var11[var15].split("\\&");

                        for(var20 = var6 = 5 >> 2; var20 < var16.length; var20 = var6) {
                           String[] var12 = var16[var6].split("=");
                           var10001 = var12[2 & 5];
                           int var10003 = 2 ^ 3;
                           ++var6;
                           d(var7, var10001, Double.parseDouble(var12[var10003]));
                        }
                     } else {
                        var16 = var11[var15].split("=");
                        d(var7, var16[3 >> 2], QualityZW.getDouble(var16[3 >> 1]));
                     }

                     ++var15;
                  }
               }

               ++var8;
            }
         }

         if (!var1) {
            Double var14;
            if ((var14 = (Double)var7.remove("四抗")) != null) {
               d(var7, "抗混乱", var14);
               d(var7, "抗封印", var14);
               d(var7, "抗昏睡", var14);
               d(var7, "抗遗忘", var14);
            }

            if ((var14 = (Double)var7.remove("抗仙法")) != null) {
               d(var7, "抗风", var14);
               d(var7, "抗火", var14);
               d(var7, "抗水", var14);
               d(var7, "抗雷", var14);
            }
         }

         return var7;
      }
   }

   public static String i(Mount var0, String var1) {
      if (var1.equals("夺命追魂")) {
         return g("SP", var0, "夺命追魂");
      } else if (var1.equals("天雷怒火")) {
         return g("MP", var0, "天雷怒火");
      } else if (var1.equals("金身不坏")) {
         return g("HP", var0, "金身不坏");
      } else if (var1.equals("破釜沉舟")) {
         return g("AP", var0, "破釜沉舟");
      } else if (var1.equals("兴风作浪")) {
         return g("MP", var0, "兴风作浪");
      } else if (var1.equals("天神护体")) {
         return g("SP", var0, "天神护体");
      } else if (var1.equals("后发制人")) {
         return g("HP", var0, "后发制人");
      } else if (var1.equals("万劫不复")) {
         return g("MP", var0, "万劫不复");
      } else {
         return var1.equals("心如止水") ? g("HP", var0, "心如止水") : null;
      }
   }

   static {
      double[] var10000 = new double[111 & 25];
      boolean var10002 = true;
      var10000[5 >> 3] = 0.3D;
      var10000[4 ^ 5] = 0.3D;
      var10000[1 ^ 3] = 0.7D;
      var10000[--3] = 0.7D;
      var10000[--4] = 0.0D;
      var10000[--5] = 0.0D;
      var10000[47 & 86] = 10000.0D;
      var10000[39 & 95] = 10000.0D;
      var10000[88 & 47] = 1.2D;
      xishu = var10000;
      double[][] var0 = new double[23 & 127][];
      var10002 = true;
      double[] var3 = new double[1 ^ 3];
      boolean var10004 = true;
      int var10005 = 3 & 4;
      var3[3 & 4] = 4.115226337D;
      var3[4 ^ 5] = 1.141552511D;
      var0[var10005] = var3;
      var3 = new double[--2];
      var10004 = true;
      var3[2 & 5] = 14.40329218D;
      var10005 = 3 & 5;
      var3[3 & 5] = 3.99543379D;
      var0[var10005] = var3;
      int var4 = --2;
      double[] var10003 = new double[--2];
      boolean var5 = true;
      var10003[3 & 4] = 4.8D;
      var10003[5 >> 2] = 1.333333333D;
      var0[var4] = var10003;
      var4 = --3;
      var10003 = new double[1 ^ 3];
      var5 = true;
      var10003[3 >> 2] = 14.4D;
      var10003[--1] = 4.0D;
      var0[var4] = var10003;
      var4 = --4;
      var10003 = new double[5 >> 1];
      var5 = true;
      var10003[3 ^ 3] = 14.4D;
      var10003[3 >> 1] = 4.0D;
      var0[var4] = var10003;
      var4 = --5;
      var10003 = new double[--2];
      var5 = true;
      var10003[3 ^ 3] = 3.6D;
      var10003[3 >> 1] = 1.0D;
      var0[var4] = var10003;
      var4 = 15 & 118;
      var10003 = new double[--2];
      var5 = true;
      var10003[2 & 5] = 7.2D;
      var10003[4 ^ 5] = 2.0D;
      var0[var4] = var10003;
      var4 = 87 & 47;
      var10003 = new double[--2];
      var5 = true;
      var10003[3 & 4] = 4.8D;
      var10003[2 ^ 3] = 1.333333333D;
      var0[var4] = var10003;
      var4 = 8 & 127;
      var10003 = new double[1 ^ 3];
      var5 = true;
      var10003[3 >> 2] = 7.2D;
      var10003[3 & 5] = 2.0D;
      var0[var4] = var10003;
      var4 = 89 & 47;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 4.8D;
      var10003[1] = 1.333333333D;
      var0[var4] = var10003;
      var4 = 94 & 43;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[var4] = var10003;
      var4 = 95 & 43;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 4.8D;
      var10003[1] = 1.333333333D;
      var0[var4] = var10003;
      var4 = 76 & 63;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[var4] = var10003;
      var4 = 13 & 127;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[var4] = var10003;
      var4 = 14 & 127;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 4.8D;
      var10003[1] = 1.333333333D;
      var0[var4] = var10003;
      var4 = 79 & 63;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[var4] = var10003;
      var4 = 84 & 59;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 14.4D;
      var10003[1] = 4.0D;
      var0[var4] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 4.8D;
      var10003[1] = 1.333333333D;
      var0[17] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[18] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 4.8D;
      var10003[1] = 1.333333333D;
      var0[19] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 3.6D;
      var10003[1] = 1.0D;
      var0[20] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 14.4D;
      var10003[1] = 4.0D;
      var0[21] = var10003;
      var10003 = new double[2];
      var5 = true;
      var10003[0] = 7.2D;
      var10003[1] = 2.0D;
      var0[22] = var10003;
      zuoqi = var0;
      mountSkillMap = new HashMap();
      String[] var1 = new String[4];
      var10002 = true;
      var1[0] = "气血";
      var1[1] = "法力";
      var1[2] = "攻击";
      var1[3] = "速度";
      SH_HEAD_BASE1 = var1;
      var1 = new String[4];
      var10002 = true;
      var1[0] = "气血加成";
      var1[1] = "法力加成";
      var1[2] = "攻击加成";
      var1[3] = "速度加成";
      SH_HEAD_BASE2 = var1;
      var1 = new String[4];
      var10002 = true;
      var1[0] = "附加气血";
      var1[1] = "附加魔法";
      var1[2] = "附加攻击";
      var1[3] = "附加速度";
      SH_HEAD_BASE3 = var1;
      Map var2 = mountSkillMap;
      int[] var6 = new int[3];
      boolean var10007 = true;
      var6[0] = 30;
      var6[1] = 70;
      BaseQl[] var10008 = new BaseQl[3];
      boolean var10010 = true;
      boolean var10013 = false;
      var10008[0] = new BaseQl("命中", 7.2D);
      var10008[1] = new BaseQl("连击率", 7.2D);
      var10008[2] = new BaseQl("致命", 7.2D);
      var2.put("夺命追魂", new BaseMountSkill("夺命追魂", var6, 3, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[1] = 100;
      var10008 = new BaseQl[3];
      var10010 = true;
      var10008[0] = new BaseQl("狂暴率", 4.8D);
      var10008[1] = new BaseQl("忽视防御程度", 3.6D);
      var10008[2] = new BaseQl("忽视防御几率", 3.6D);
      var2.put("破釜沉舟", new BaseMountSkill("破釜沉舟", var6, 2, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[1] = 70;
      var6[2] = 30;
      var10008 = new BaseQl[2];
      var10010 = true;
      var10008[0] = new BaseQl("狂暴率", 4.8D);
      var10008[1] = new BaseQl("致命", 4.8D);
      var2.put("后发制人", new BaseMountSkill("后发制人", var6, 0, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 70;
      var6[1] = 30;
      var10008 = new BaseQl[6];
      var10010 = true;
      var10008[0] = new BaseQl("加强火", 4.8D);
      var10008[1] = new BaseQl("加强雷", 4.8D);
      var10008[2] = new BaseQl("加强鬼火", 4.8D);
      var10008[3] = new BaseQl("抗火", 7.2D);
      var10008[4] = new BaseQl("抗雷", 7.2D);
      var10008[5] = new BaseQl("抗鬼火", 7.2D);
      var2.put("天雷怒火", new BaseMountSkill("天雷怒火", var6, 1, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 70;
      var6[2] = 30;
      var10008 = new BaseQl[6];
      var10010 = true;
      var10008[0] = new BaseQl("加强风", 4.8D);
      var10008[1] = new BaseQl("加强水", 4.8D);
      var10008[2] = new BaseQl("加强鬼火", 4.8D);
      var10008[3] = new BaseQl("抗风", 7.2D);
      var10008[4] = new BaseQl("抗水", 7.2D);
      var10008[5] = new BaseQl("抗鬼火", 7.2D);
      var2.put("兴风作浪", new BaseMountSkill("兴风作浪", var6, 1, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 100;
      var10008 = new BaseQl[2];
      var10010 = true;
      var10008[0] = new BaseQl("强仙法", 4.8D);
      var10008[1] = new BaseQl("加强鬼火", 4.8D);
      var2.put("万劫不复", new BaseMountSkill("万劫不复", var6, 1, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[1] = 30;
      var6[2] = 70;
      var10008 = new BaseQl[4];
      var10010 = true;
      var10008[0] = new BaseQl("抗物理", 3.6D);
      var10008[1] = new BaseQl("抗震慑", 7.2D);
      var10008[2] = new BaseQl("抗中毒", 4.8D);
      var10008[3] = new BaseQl("抗三尸虫", 0.024D);
      var2.put("金身不坏", new BaseMountSkill("金身不坏", var6, 0, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[2] = 100;
      var10008 = new BaseQl[2];
      var10010 = true;
      var10008[0] = new BaseQl("抗仙法", 4.8D);
      var10008[1] = new BaseQl("抗鬼火", 4.8D);
      var2.put("天神护体", new BaseMountSkill("天神护体", var6, 3, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 30;
      var6[2] = 70;
      var10008 = new BaseQl[2];
      var10010 = true;
      var10008[0] = new BaseQl("抗人法", 4.11522633744856D);
      var10008[1] = new BaseQl("抗遗忘", 4.11522633744856D);
      var2.put("心如止水", new BaseMountSkill("心如止水", var6, 0, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 30;
      var6[1] = 70;
      var10008 = new BaseQl[3];
      var10010 = true;
      var10008[0] = new BaseQl("反击率", 4.8D);
      var10008[1] = new BaseQl("反击时忽视防御几率", 7.2D);
      var10008[2] = new BaseQl("反击时忽视防御程度", 7.2D);
      var2.put("反客为主", new BaseMountSkill("反客为主", var6, 2, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[1] = 50;
      var6[2] = 50;
      var10008 = new BaseQl[3];
      var10010 = true;
      var10008[0] = new BaseQl("躲闪率", 9.2D);
      var10008[1] = new BaseQl("反震率", 7.2D);
      var10008[2] = new BaseQl("反震程度", 7.2D);
      var2.put("反治其身", new BaseMountSkill("反治其身", var6, 0, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 70;
      var6[2] = 30;
      var10008 = new BaseQl[6];
      var10010 = true;
      var10008[0] = new BaseQl("忽视仙法", 7.2D);
      var10008[1] = new BaseQl("忽视鬼火", 7.2D);
      var10008[2] = new BaseQl("仙法狂暴", 7.2D);
      var10008[3] = new BaseQl("鬼火狂暴", 7.2D);
      var10008[4] = new BaseQl("仙法狂暴程度", 7.2D);
      var10008[5] = new BaseQl("鬼火狂暴程度", 7.2D);
      var2.put("得心应手", new BaseMountSkill("得心应手", var6, 1, 7.2D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 70;
      var6[1] = 30;
      var10008 = new BaseQl[1];
      var10010 = true;
      var10008[0] = new BaseQl("增加强克效果", 5.18134715D);
      var2.put("山外青山", new BaseMountSkill("山外青山", var6, 3, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[0] = 30;
      var6[2] = 70;
      var10008 = new BaseQl[1];
      var10010 = true;
      var10008[0] = new BaseQl("抵御强克效果", 7.2D);
      var2.put("视险如夷", new BaseMountSkill("视险如夷", var6, 0, 14.4D, var10008));
      var2 = mountSkillMap;
      var6 = new int[3];
      var10007 = true;
      var6[1] = 30;
      var6[2] = 70;
      var10008 = new BaseQl[2];
      var10010 = true;
      var10008[0] = new BaseQl("法术躲闪", 14.4D);
      var10008[1] = new BaseQl("随机抗灵宝伤害", 0.0048D);
      var2.put("游刃有余", new BaseMountSkill("游刃有余", var6, 3, 20.9D, var10008));
      var2 = mountSkillMap;
      BaseQl[] var7 = new BaseQl[6];
      var10007 = true;
      var7[0] = new BaseQl("四象守护之力", 10.0D);
      var7[1] = new BaseQl("四象守护之力", 15.0D);
      var7[2] = new BaseQl("四象守护之力", 15.0D);
      var7[3] = new BaseQl("四象守护之力", 20.0D);
      var7[4] = new BaseQl("四象守护之力", 20.0D);
      var7[5] = new BaseQl("四象守护之力", 20.0D);
      var2.put("中天", new BaseMountSkill("中天", var7));
      var2 = mountSkillMap;
      var7 = new BaseQl[8];
      var10007 = true;
      var7[0] = new BaseQl("速度", 2.0D);
      var7[1] = new BaseQl("物理吸收", 0.5D);
      var7[2] = new BaseQl("气血", 500.0D);
      var7[3] = new BaseQl("速度加成", 0.5D);
      var7[4] = new BaseQl("速度", 2.0D);
      var7[5] = new BaseQl("物理吸收", 0.5D);
      var7[6] = new BaseQl("法力", 500.0D);
      var7[7] = new BaseQl("法术躲闪", 0.5D);
      var2.put("青龙", new BaseMountSkill("青龙", var7));
      var2 = mountSkillMap;
      var7 = new BaseQl[8];
      var10007 = true;
      var7[0] = new BaseQl("攻击", 200.0D);
      var7[1] = new BaseQl("攻击加成", 0.5D);
      var7[2] = new BaseQl("气血", 500.0D);
      var7[3] = new BaseQl("狂暴率", 1.0D);
      var7[4] = new BaseQl("攻击", 200.0D);
      var7[5] = new BaseQl("攻击加成", 0.5D);
      var7[6] = new BaseQl("气血", 500.0D);
      var7[7] = new BaseQl("命中率", 1.0D);
      var2.put("白虎", new BaseMountSkill("白虎", var7));
      var2 = mountSkillMap;
      var7 = new BaseQl[8];
      var10007 = true;
      var7[0] = new BaseQl("法力", 500.0D);
      var7[1] = new BaseQl("法力加成", 0.5D);
      var7[2] = new BaseQl("气血", 500.0D);
      var7[3] = new BaseQl("忽视抗仙法鬼火", 1.0D);
      var7[4] = new BaseQl("法力", 500.0D);
      var7[5] = new BaseQl("法力加成", 0.5D);
      var7[6] = new BaseQl("气血", 500.0D);
      var7[7] = new BaseQl("仙法鬼火命中率", 0.5D);
      var2.put("朱雀", new BaseMountSkill("朱雀", var7));
      var2 = mountSkillMap;
      var7 = new BaseQl[8];
      var10007 = true;
      var7[0] = new BaseQl("气血", 500.0D);
      var7[1] = new BaseQl("气血加成", 0.5D);
      var7[2] = new BaseQl("法力", 500.0D);
      var7[3] = new BaseQl("抗致命率", 1.0D);
      var7[4] = new BaseQl("气血", 500.0D);
      var7[5] = new BaseQl("气血加成", 0.5D);
      var7[6] = new BaseQl("法力", 500.0D);
      var7[7] = new BaseQl("抗仙法鬼火狂暴率", 1.0D);
      var2.put("玄武", new BaseMountSkill("玄武", var7));
   }

   public static void getMountSHSXString(int var0, RoleData var1, StringBuffer var2, boolean var3) {
      BaseMountSH var4 = var1.getMountSHByindex(var0);
      BaseMountSkill var5 = getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[var0]);
      int var10000;
      if (!var3) {
         var2.append(var4.getLvl() == 0 ? "#c727272" : "#G");
         int var18 = 5 >> 3;

         for(var10000 = var18; var10000 < 24; var10000 = var18) {
            if (var18 != 0) {
               var2.append("#r");
            }

            if (var18 == var4.getLvl()) {
               var2.append("#c727272");
            }

            BaseQl var7 = var5.getBases()[var18 % var5.getBases().length];
            var2.append(var18 + (3 >> 1));
            var2.append(var18 < (73 & 63) ? "级  " : "级 ");
            var2.append(var7.getKey());
            var2.append(" +");
            var2.append(hd.ak(var7.getValue(), 3 >> 1));
            ++var18;
            var2.append(fO.so(var7.getKey()));
         }

      } else {
         var2.append("#G");
         double var6 = 1.0D;
         BaseMountSH var15 = var1.getMountSHByindex(2 & 5);
         double var8;
         if (var15.getLvl() > 0 && (var8 = getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[3 & 4]).getMountSHByZTPercentage(var0, var15.getLvl())) > 0.0D) {
            var6 += var8 / 100.0D;
            var2.append(BaseMountSH.SH_HEAD_NAME[var0]);
            var2.append("守护属性提升");
            var2.append(hd.ak(var8, 2 ^ 3));
            var2.append("%");
         }

         int var17 = 0;
         int var19 = 3 & 4;
         int var9;
         var19 = (var9 = var4.getLvl() - (3 & 5)) / var5.getBases().length;
         var9 = (3 >> 1) + var9 % var5.getBases().length;
         int var16 = 3 & 4;
         int var10 = var19 > 0 ? var5.getBases().length : var9;

         for(var10000 = var16; var10000 < var10; var10000 = var16) {
            if ((var17 >> var16 & --1) != 3 >> 1) {
               var17 |= 3 >> 1 << var16;
               BaseQl var11 = var5.getBases()[var16];
               double var12 = (double)(var19 + (var16 < var9 ? 5 >> 2 : 0)) * var11.getValue();

               int var14;
               for(var10000 = var14 = var16 + --1; var10000 < var10; var10000 = var14) {
                  if ((var17 >> var14 & 3 & 5) != (2 ^ 3) && var11.getKey().equals(var5.getBases()[var14].getKey())) {
                     var17 |= --1 << var14;
                     var12 += (double)(var19 + (var14 < var9 ? --1 : 0)) * var5.getBases()[var14].getValue();
                  }

                  ++var14;
               }

               if (!(var12 <= 0.0D)) {
                  var12 *= var6;
                  if (var2.length() > 0) {
                     var2.append("#r");
                  }

                  var2.append(var11.getKey());
                  var2.append(" +");
                  var2.append(hd.ak(var12, 5 >> 2));
                  var2.append(fO.so(var11.getKey()));
               }
            }

            ++var16;
         }

      }
   }

   public static void j(Ql var0, String var1, int var2, long var3, RoleSummoning var5, lg var6, GameClient var7) {
      if (var1 != null && !var1.equals("")) {
         Skill var8 = null;
         String[] var17 = var1.split("\\|");

         int var11;
         for(int var10000 = var11 = 5 >> 3; var10000 < var17.length; var10000 = var11) {
            double var9;
            int var14;
            Skill var15;
            if (var17[var11].startsWith("L")) {
               String[] var20 = var17[var11].split("=");

               int var19;
               for(var10000 = var19 = --3; var10000 < var20.length; var10000 = var19) {
                  if ((var14 = var20[var19].indexOf("-")) != -4 >> 2 && (var15 = var6.bf(var20[var19].substring(3 ^ 3, var14))) != null && var15.getSkillid().equals("11005")) {
                     int var16 = Integer.parseInt(var20[var19].substring(var14 + --1));
                     var9 = Double.parseDouble(var15.getValue()) + Double.parseDouble(var15.getGrow()) * (double)var16;
                     QualityZW.c(var0, "抗封印", var9);
                     QualityZW.c(var0, "抗混乱", var9);
                     QualityZW.c(var0, "抗遗忘", var9);
                  }

                  ++var19;
               }
            } else if (!var17[var11].startsWith("Q") && !var17[var11].startsWith("T")) {
               int var12;
               if (var17[var11].startsWith("X")) {
                  var12 = 5 >> 3;
                  if (var7.n(5 >> 1, 31 & 104) || var7.n(--2, 47 & 90)) {
                     var12 = var5.c("1250");
                  }

                  String[] var18 = var17[var11].split("=");

                  for(var10000 = var14 = 4 ^ 5; var10000 < var18.length; var10000 = var14) {
                     if ((var15 = var6.bf(var18[var14])) != null) {
                        if (var15.getSkillid().equals("1255")) {
                           if (var7.gameBattle) {
                              QualityZW.c(var0, "连击率", (1.0D + CustomFunction.a(var3, 0.12D)) * (var12 != 0 ? 1.0D : 0.7D));
                           } else {
                              QualityZW.c(var0, "连击率", (2.0D + CustomFunction.a(var3, 0.15D)) * (var12 != 0 ? 1.0D : 0.7D));
                           }
                        } else if (var15.getSkillid().equals("1256")) {
                           if (var7.gameBattle) {
                              QualityZW.c(var0, "致命率", (1.0D + CustomFunction.a(var3, 0.12D)) * (var12 != 0 ? 1.0D : 0.7D));
                           } else {
                              QualityZW.c(var0, "致命率", (2.0D + CustomFunction.a(var3, 0.15D)) * (var12 != 0 ? 1.0D : 0.7D));
                           }
                        } else if (var15.getSkillid().equals("1259")) {
                           if (var7.gameBattle) {
                              QualityZW.c(var0, "忽视防御几率", (1.0D + CustomFunction.a(var3, 0.1D)) * (var12 != 0 ? 1.0D : 0.7D));
                           } else {
                              QualityZW.c(var0, "忽视防御几率", (5.0D + CustomFunction.a(var3, 0.25D)) * (var12 != 0 ? 1.0D : 0.7D));
                           }
                        } else if (var15.getSkillid().equals("1260")) {
                           if (var7.gameBattle) {
                              QualityZW.c(var0, "忽视防御程度", (1.0D + CustomFunction.a(var3, 0.1D)) * (var12 != 0 ? 1.0D : 0.7D));
                           } else {
                              QualityZW.c(var0, "忽视防御程度", (5.0D + CustomFunction.a(var3, 0.25D)) * (var12 != 0 ? 1.0D : 0.7D));
                           }
                        }
                     }

                     ++var14;
                  }
               } else {
                  label293: {
                     if ((var12 = var17[var11].indexOf("=")) != -4 >> 2) {
                        var17[var11] = var17[var11].substring(2 & 5, var12);
                     }

                     String var13;
                     switch((var13 = var17[var11]).hashCode()) {
                     case 1509352:
                        while(false) {
                        }

                        if (var13.equals("1207")) {
                           var9 = 3.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "连击率", var9);
                        }
                        break label293;
                     case 1509353:
                        if (var13.equals("1208")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "忽视防御几率", var9);
                           QualityZW.c(var0, "忽视防御程度", var9);
                        }
                        break label293;
                     case 1509354:
                        if (var13.equals("1209")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.3D);
                           QualityZW.c(var0, "狂暴率", var9);
                           QualityZW.c(var0, "致命率", var9);
                        }
                        break label293;
                     case 1509379:
                        if (var13.equals("1213")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.3D);
                           QualityZW.c(var0, "反震率", var9);
                           QualityZW.c(var0, "反震程度", var9);
                        }
                        break label293;
                     case 1509380:
                        if (var13.equals("1214") && !var7.gameBattle) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.4D);
                           QualityZW.c(var0, "狂暴率", var9);
                           QualityZW.c(var0, "致命率", var9);
                           QualityZW.c(var0, "命中率", var9);
                        }
                        break label293;
                     case 1509409:
                        if (var13.equals("1222")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.4D);
                           QualityZW.c(var0, "抗震慑", var9);
                        }
                        break label293;
                     case 1509413:
                        if (var13.equals("1226")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "物理吸收", var9);
                        }
                        break label293;
                     case 1515142:
                        if (var13.equals("1810")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.3D);
                           QualityZW.c(var0, "抗风", -var9);
                           QualityZW.c(var0, "抗火", -var9);
                           QualityZW.c(var0, "抗水", -var9);
                           QualityZW.c(var0, "抗雷", -var9);
                           QualityZW.c(var0, "抗鬼火", -var9);
                           QualityZW.c(var0, "反震率", var9);
                           QualityZW.c(var0, "反震程度", var9);
                        }
                        break label293;
                     case 1515143:
                        if (var13.equals("1811")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "抗风", -var9);
                           QualityZW.c(var0, "抗火", -var9);
                           QualityZW.c(var0, "抗水", -var9);
                           QualityZW.c(var0, "抗雷", -var9);
                           QualityZW.c(var0, "抗鬼火", -var9);
                           QualityZW.c(var0, "反震率", var9);
                           QualityZW.c(var0, "反震程度", var9);
                        }
                        break label293;
                     case 1515145:
                        if (!var13.equals("1813")) {
                           break label293;
                        }
                        break;
                     case 1515147:
                        if (var13.equals("1815")) {
                           var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "金", 50.0D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515148:
                        if (var13.equals("1816")) {
                           var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "木", 50.0D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515149:
                        if (var13.equals("1817")) {
                           var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "水", 50.0D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515150:
                        if (var13.equals("1818")) {
                           var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "火", 50.0D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515151:
                        if (var13.equals("1819")) {
                           var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                           QualityZW.c(var0, "土", 50.0D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515173:
                        if (!var13.equals("1820")) {
                           break label293;
                        }
                        break;
                     case 1515174:
                        if (!var13.equals("1821")) {
                           break label293;
                        }
                        break;
                     case 1515175:
                        if (!var13.equals("1822")) {
                           break label293;
                        }
                        break;
                     case 1515176:
                        if (!var13.equals("1823")) {
                           break label293;
                        }
                        break;
                     case 1515177:
                        if (!var13.equals("1824")) {
                           break label293;
                        }
                        break;
                     case 1515240:
                        if (var13.equals("1845")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.5D);
                           QualityZW.c(var0, "附加封印攻击", var9);
                        }
                        break label293;
                     case 1515241:
                        if (var13.equals("1846")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.5D);
                           QualityZW.c(var0, "附加混乱攻击", var9);
                        }
                        break label293;
                     case 1515271:
                        if (var13.equals("1855")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "抗致命率", var9);
                        }
                        break label293;
                     case 1515272:
                        if (var13.equals("1856")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "仙法狂暴", var9);
                        }
                        break label293;
                     case 1515273:
                        if (var13.equals("1857")) {
                           var9 = 10.0D + CustomFunction.a(var3, 0.6D);
                           QualityZW.c(var0, "忽视仙法", var9);
                        }
                        break label293;
                     case 1515275:
                        if (var13.equals("1859")) {
                           var9 = 3.0D + CustomFunction.a(var3, 0.3D);
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                        break label293;
                     case 1515297:
                        if (var13.equals("1860")) {
                           var9 = 5.0D + CustomFunction.a(var3, 0.5D);
                           QualityZW.c(var0, "附加三尸攻击", var9);
                        }
                        break label293;
                     case 1516081:
                        if (var13.equals("1909")) {
                           var9 = ((Formula0)var8.getFormulas()[3 & 4]).getValue() + CustomFunction.a(var3, ((Formula0)var8.getFormulas()[2 & 5]).getSv());
                           QualityZW.c(var0, "抗致命率", var9);
                           var9 = ((Formula0)var8.getFormulas()[--2]).getValue() + CustomFunction.a(var3, ((Formula0)var8.getFormulas()[1 ^ 3]).getSv());
                           QualityZW.c(var0, "防御", var9);
                        }
                        break label293;
                     case 46759957:
                        if (var13.equals("11005") && (var8 = var6.bf(var17[var11])) != null) {
                           var9 = Double.parseDouble(var8.getValue()) + Double.parseDouble(var8.getGrow()) * (double)var2;
                           QualityZW.c(var0, "抗封印", var9);
                           QualityZW.c(var0, "抗混乱", var9);
                           QualityZW.c(var0, "抗遗忘", var9);
                        }
                     default:
                        break label293;
                     }

                     var9 = 2.0D + CustomFunction.a(var3, 0.2D);
                     QualityZW.c(var0, "抗封印", var9);
                     QualityZW.c(var0, "抗混乱", var9);
                     QualityZW.c(var0, "抗遗忘", var9);
                  }
               }
            }

            ++var11;
         }

      }
   }

   public static Ql getPetQl(RoleSummoning var0, RoleData var1) {
      Ql var2 = em.i();
      if (var0 == null) {
         return var2;
      } else {
         lg var8 = var1.getObjectArea();
         int var4 = 75 & 127;
         double var5 = 0.0D;

         Ql var69;
         label631: {
            label630: {
               try {
                  int var3;
                  String[] var7;
                  String[] var9;
                  Goodstable var10;
                  int var12;
                  int var14;
                  String[] var15;
                  int var10000;
                  if (var0.getStye() != null && var0.getStye().length() > --1) {
                     var7 = var0.getStye().split("\\|");

                     for(var10000 = var3 = 5 >> 2; var10000 < var7.length; var10000 = var3) {
                        if ((var9 = var7[var3].split("-")).length >= 5 >> 1 && (var10 = var1.getGoodEquip(new BigDecimal(var9[--1]))) != null && var10.getType() != 729L) {
                           String[] var11 = var10.getValue().split("\\|");

                           for(var10000 = var12 = 118 & 15; var10000 < var11.length; var10000 = var12) {
                              if (var11[var12].startsWith("炼化属性")) {
                                 String[] var13 = var11[var12].split("\\&");

                                 for(var10000 = var14 = 3 & 5; var10000 < var13.length; var10000 = var14) {
                                    if (!(var15 = var13[var14].split("="))[3 >> 2].endsWith("等级")) {
                                       QualityZW.c(var2, var15[3 >> 2], Double.parseDouble(var15[--1]));
                                    }

                                    ++var14;
                                 }
                              }

                              ++var12;
                           }
                        }

                        ++var3;
                     }
                  }

                  if (var0.getResistance() != null && !var0.getResistance().equals("")) {
                     if ((var7 = var0.getResistance().split("\\|")).length >= --3) {
                        bk.c();
                        return var2;
                     }

                     for(var10000 = var3 = 0; var10000 < var7.length; var10000 = var3) {
                        double var36;
                        if ((var36 = Double.parseDouble((var9 = var7[var3].split("="))[3 & 5])) != 30.0D) {
                           bk.c();
                           return var2;
                        }

                        int var10002 = 5 >> 3;
                        ++var3;
                        QualityZW.c(var2, var9[var10002], var36);
                     }
                  }

                  int var16;
                  int var17;
                  double var19;
                  String var30;
                  int var35;
                  int var37;
                  int var38;
                  int var51;
                  int var58;
                  RoleSummoning var67;
                  label493: {
                     Mount var34;
                     if ((var34 = var1.getPetMount(var0.getSid())) != null) {
                        GameClient var65 = var1.getGameView().getClient();
                        var4 += 20;
                        if (var65.gameMount) {
                           if (!hd.o(var30 = var34.getDataValue("JN"))) {
                              if ((var35 = var34.getMountlvl()) > (103 & 124)) {
                                 var35 -= 100;
                              }

                              var37 = (int)Math.floor((double)((float)var34.getSpri() + (float)var35 / 10.0F * (float)var34.getSpri() / 2.0F));
                              var38 = (int)Math.floor((double)((float)var34.getPower() + (float)var35 / 10.0F * (float)var34.getPower() / 2.0F));
                              var12 = (int)Math.floor((double)((float)var34.getBone() + (float)var35 / 10.0F * (float)var34.getBone() / 2.0F));
                              int var43;
                              if ((var14 = (var43 = var34.getMountCZ()) >> (6 & 127)) > 0) {
                                 for(var10000 = var51 = 2 & 5; var10000 < 3; var10000 = var51) {
                                    if ((var43 >> (5 >> 1) * var51 & 5 >> 2) != 0) {
                                       var16 = (var43 >> --2 * var51 + (5 >> 2) & (2 ^ 3)) == --1 ? 4 ^ 5 : 0;
                                       if (var51 == 0) {
                                          var37 += var16 != 0 ? var14 : -var14;
                                       } else if (var51 == (2 ^ 3)) {
                                          var38 += var16 != 0 ? var14 : -var14;
                                       } else if (var51 == (1 ^ 3)) {
                                          var12 += var16 != 0 ? var14 : -var14;
                                       }
                                    }

                                    ++var51;
                                 }
                              }

                              var51 = 0;

                              String var10001;
                              BaseMountSkill var18;
                              int var21;
                              BaseQl var22;
                              for(var10000 = var16 = 5 >> 3; var10000 < var30.length(); var10000 = var16) {
                                 if ((var16 = var30.indexOf("#", var51 + (3 >> 1))) == -4 >> 2) {
                                    var16 = var30.length();
                                 }

                                 if ((var18 = getBaseMountSkill(var30.substring(var51, var16))) == null) {
                                    var10000 = var16;
                                 } else {
                                    var19 = var18.getXs(var37, var38, var12, var34.getProficiency(), var34.getMountid());

                                    for(var10000 = var21 = 2 & 5; var10000 < var18.getBases().length; var10000 = var21) {
                                       var22 = var18.getBases()[var21];
                                       var10001 = var22.getKey();
                                       ++var21;
                                       QualityZW.c(var2, var10001, var19 / var22.getValue());
                                    }

                                    var10000 = var16;
                                 }

                                 var51 = var10000 + 1;
                              }

                              UseCardBean var53 = var34.getMountid() == (127 & 7) ? var1.getLimit("百炼丹") : null;
                              var16 = 5 >> 3;
                              var17 = var53 != null ? var53.getQls().length : 0;

                              for(var10000 = var16; var10000 < var17; var10000 = var16) {
                                 BaseQl var57 = var53.getQls()[var16];
                                 var10001 = var57.getKey();
                                 ++var16;
                                 QualityZW.c(var2, var10001, var57.getValue());
                              }

                              BaseMountSH var56 = var1.getMountSHByindex(0);
                              int var24;
                              int var25;
                              double var27;
                              BaseMountSH var55;
                              BaseMountSkill var59;
                              int var60;
                              if ((var55 = var1.getMountSHByMountId(var34.getMountid())) != null && var55.getLvl() > 0) {
                                 var18 = getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[var55.getId()]);
                                 var59 = getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[0]);
                                 boolean var20 = false;
                                 var21 = var55.getLvl() - 1;
                                 double var61 = var59.getMountSHByZT(var55.getId(), var56.getLvl());
                                 var60 = var21 / var18.getBases().length;
                                 var21 = 1 + var21 % var18.getBases().length;
                                 var24 = 0;
                                 var25 = var60 > 0 ? var18.getBases().length : var21;

                                 for(var10000 = var24; var10000 < var25; var10000 = var24) {
                                    BaseQl var26;
                                    if (!(var26 = var18.getBases()[var24]).getKey().equals(SH_HEAD_BASE1[0]) && !var26.getKey().equals(SH_HEAD_BASE1[1]) && !var26.getKey().equals(SH_HEAD_BASE1[--2]) && !var26.getKey().equals(SH_HEAD_BASE1[--3]) && !var26.getKey().equals(SH_HEAD_BASE2[0]) && !var26.getKey().equals(SH_HEAD_BASE2[1]) && !var26.getKey().equals(SH_HEAD_BASE2[1 ^ 3]) && !var26.getKey().equals(SH_HEAD_BASE2[--3])) {
                                       var27 = (double)(var60 + (var24 < var21 ? 1 : 0)) * var26.getValue() * var61;
                                       QualityZW.c(var2, var26.getKey(), var27);
                                    }

                                    ++var24;
                                 }
                              }

                              if ((var58 = var56.a(var34.getMountid())) > 0) {
                                 var59 = var56.getMounts()[var58 - 1];
                                 var60 = 0;
                                 var21 = var59.getBases() != null && var59.getB3() > 0 ? var59.getBases().length : 0;

                                 for(var10000 = var60; var10000 < var21; var10000 = var60) {
                                    if ((var22 = var59.getBases()[var60]).getKey().equals("技能")) {
                                       int var23 = (int)var22.getValue();
                                       var24 = (int)var22.getValue2();
                                       if (var23 != (6971 & 27901) && var23 != (12031 & 22841)) {
                                          if (var23 == (11381 & 23531) || var23 == (32359 & 2554)) {
                                             double var62 = -(var23 == (11646 & 23267) ? 0.6D : 0.6D) * (double)var24;
                                             int var64;
                                             double var66;
                                             if (var23 == (28530 & 6383)) {
                                                var66 = 0.6D;
                                                var64 = var24;
                                             } else {
                                                var66 = 0.4D;
                                                var64 = var24;
                                             }

                                             var27 = var66 * (double)var64;
                                             QualityZW.c(var2, "物理吸收率", var62);
                                             QualityZW.c(var2, "抗仙法", var62);
                                             QualityZW.c(var2, "四抗", var27);
                                          }
                                       } else {
                                          var25 = cX.p(var0.getGrade());
                                          double var63 = Double.valueOf(var0.getGrowlevel());
                                          int var28 = Math.abs(PetProperty.getPetValue(var25, var0.getSpeed(), var63, var0.getSp(), --3));
                                          QualityZW.c(var2, "躲闪率", (double)var28 * (var23 == (10493 & 24379) ? 1.0E-4D : 2.0E-4D) * (double)var24);
                                       }
                                    } else {
                                       QualityZW.c(var2, var22.getKey(), var22.getValue());
                                    }

                                    ++var60;
                                 }

                                 var67 = var0;
                                 break label493;
                              }
                           }
                        } else {
                           List var31;
                           if ((var31 = var34.getMountskill()) != null) {
                              for(var10000 = var35 = 0; var10000 < var31.size(); var10000 = var35) {
                                 String[] var39 = h(var34, ((MountSkill)var31.get(var35)).getSkillname()).split("\\|");

                                 for(var10000 = var38 = 0; var10000 < var39.length; var10000 = var38) {
                                    String[] var45;
                                    String[] var68 = var45 = var39[var38].split("=");
                                    double var47 = Double.parseDouble(var68[1]);
                                    if (!var68[0].equals("HP") && !var45[0].equals("MP") && !var45[0].equals("AP") && !var45[0].equals("SP")) {
                                       if (!var45[0].equals("风法伤害") && !var45[0].equals("水法伤害") && !var45[0].equals("火法伤害") && !var45[0].equals("雷法伤害")) {
                                          if (var45[0].indexOf("次数") == -4 >> 2 && var45[0].indexOf("三尸") == -4 >> 2) {
                                             var47 *= 100.0D;
                                          }

                                          var69 = var2;
                                       } else {
                                          var47 *= 10000.0D;
                                          var69 = var2;
                                       }

                                       QualityZW.c(var69, var45[0], var47);
                                    }

                                    ++var38;
                                 }

                                 ++var35;
                              }
                           }
                        }
                     }

                     var67 = var0;
                  }

                  if (var67.getInnerGoods() != null && !var0.getInnerGoods().equals("")) {
                     String[] var32 = var0.getInnerGoods().split("\\|");

                     for(var10000 = var35 = 0; var10000 < var32.length; var10000 = var35) {
                        if ((var10 = var1.getGoodEquip(new BigDecimal(var32[var35]))) != null) {
                           String var42;
                           boolean var46 = (var42 = var10.getGoodsname()).equals("红颜白发") || var42.equals("梅花三弄") || var42.equals("开天辟地") || var42.equals("万佛朝宗") || var42.equals("暗渡陈仓") || var42.equals("借力打力") || var42.equals("凌波微步");
                           if (var46) {
                              var15 = var10.getValue().split("\\|")[1 ^ 3].split("\\=")[1].split("\\转");
                              var16 = Integer.parseInt(var15[1]);
                              var17 = Integer.parseInt(var15[0]);
                              a(var0, var2, var16, var17, var42);
                           }
                        }

                        ++var35;
                     }
                  }

                  if (!hd.o(var0.getLyk())) {
                     var30 = var0.getLyk();
                     var35 = 0;

                     byte var40;
                     for(var10000 = var40 = 0; var10000 < var30.length(); var10000 = var37) {
                        if ((var37 = var30.indexOf("|", var35 + 1)) == -4 >> 2) {
                           var37 = var30.length();
                        }

                        label531: {
                           if ((var38 = var30.indexOf("=", var35 + 1)) != -4 >> 2) {
                              if (var38 >= var37) {
                                 var10000 = var37;
                                 break label531;
                              }

                              String var49;
                              if ((var49 = var30.substring(var35, var38)).equals("物品亲密")) {
                                 var10000 = var37;
                                 break label531;
                              }

                              QualityZW.c(var2, var49, Double.parseDouble(var30.substring(var38 + 1, var37)));
                           }

                           var10000 = var37;
                        }

                        var35 = var10000 + 1;
                     }
                  }

                  label586: {
                     if (var1.getGameView().getClient().gamePetManual) {
                        RolePet var33 = var1.getRolePet(var0.getSid().longValue());
                        ActivitySeries var41;
                        Activity var48;
                        ActivityPetManualRole var44 = (var48 = (var41 = var1.getObjectArea().br()).getActivityPetManual()) != null ? (ActivityPetManualRole)var1.getActivity(var48.getId()) : null;
                        if (var44 != null) {
                           var12 = Integer.parseInt(var0.getSummoningid());
                           List var50 = var44.getList(1, var48, var41);

                           for(var10000 = var14 = 0; var10000 < var50.size(); var10000 = var14) {
                              BaseQl var54;
                              if ((var54 = (BaseQl)var50.get(var14)).getValue2() == 0.0D || var54.getValue2() == (double)var12) {
                                 QualityZW.c(var2, var54.getKey(), var54.getValue());
                              }

                              ++var14;
                           }

                           Skill var52 = var33 != null && var33.getQy() > 0 ? var1.getObjectArea().bf(String.valueOf(var33.getQy())) : null;
                           if (var52 != null && var52.getFormulas() != null) {
                              var51 = Integer.parseInt(var52.getSkillid());
                              var16 = var44 != null ? var44.d(var51, var48, var1.getObjectArea().br()) : 0;
                              if (var16 > 0) {
                                 var17 = cX.p(var0.getGrade());
                                 var58 = cX.n(var0.getGrade());
                                 var19 = var52.getFormulas()[0].a((double)var16, var17, var58);
                                 if (var51 == (16375 & 30397)) {
                                    var69 = var2;
                                    QualityZW.c(var2, "防御", var19);
                                    break label586;
                                 }

                                 if (var51 == (30399 & 16375)) {
                                    var5 = var19;
                                    var69 = var2;
                                    break label586;
                                 }

                                 if (var51 == (32703 & 14071)) {
                                    var69 = var2;
                                    QualityZW.c(var2, "强仙法", var19);
                                    QualityZW.c(var2, "加强鬼火", var19);
                                    break label586;
                                 }

                                 if (var51 == (32441 & 14335)) {
                                    var69 = var2;
                                    QualityZW.c(var2, "每回合回复气血", var19);
                                    break label586;
                                 }

                                 if (var51 == 14010) {
                                    var69 = var2;
                                    QualityZW.c(var2, "每回合回复法力", var19);
                                    break label586;
                                 }

                                 if (var51 == 14011) {
                                    var69 = var2;
                                    QualityZW.c(var2, "抗混乱", var19);
                                    break label586;
                                 }

                                 if (var51 == 14012) {
                                    var69 = var2;
                                    QualityZW.c(var2, "抗封印", var19);
                                    break label586;
                                 }

                                 if (var51 == 14013) {
                                    var69 = var2;
                                    QualityZW.c(var2, "抗昏睡", var19);
                                    break label586;
                                 }

                                 if (var51 == 14014) {
                                    var69 = var2;
                                    QualityZW.c(var2, "抗遗忘", var19);
                                    break label586;
                                 }

                                 if (var51 == 14015) {
                                    var69 = var2;
                                    QualityZW.c(var2, "物理吸收", var19);
                                    break label586;
                                 }

                                 if (var51 == 14016) {
                                    var69 = var2;
                                    QualityZW.c(var2, "忽视反震几率", var19);
                                    break label586;
                                 }

                                 if (var51 == 14017) {
                                    var69 = var2;
                                    QualityZW.c(var2, "反震率", var19);
                                    break label586;
                                 }

                                 if (var51 == 14017) {
                                    var69 = var2;
                                    QualityZW.c(var2, "抗震慑", var19);
                                    break label586;
                                 }

                                 if (var51 == 14017) {
                                    QualityZW.c(var2, "抗仙法", var19);
                                    QualityZW.c(var2, "抗鬼火", var19);
                                 }
                              }
                           }
                        }
                     }

                     var69 = var2;
                  }

                  j(var69, var0.getSkill(), 1, var0.getFriendliness(), var0, var8, var1.getGameView().getClient());
                  j(var2, var0.getPetSkills(), 1, var0.getFriendliness(), var0, var8, var1.getGameView().getClient());
                  j(var2, var0.getBeastSkills(), 1, var0.getFriendliness(), var0, var8, var1.getGameView().getClient());
                  if (var0.getFriendliness() > 100000L) {
                     QualityZW.c(var2, "连击率", 5.0D + CustomFunction.a(var0.getFriendliness(), 0.7D));
                     QualityZW.c(var2, "连击次数", (double)((int)(3.0D + CustomFunction.a(var0.getFriendliness(), 0.2D))));
                     QualityZW.c(var2, "命中率", 2.0D + CustomFunction.a(var0.getFriendliness(), 0.4D));
                  }

                  if (!var1.getGameView().getClient().gameBattle) {
                     break label630;
                  }

                  if ((var3 = cX.p(var0.getGrade())) >= 135) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 11250.0D);
                     break label631;
                  }

                  if (var3 >= 125) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 9040.0D);
                     break label631;
                  }

                  if (var3 >= 115) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 7750.0D);
                     break label631;
                  }

                  if (var3 >= 105) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 6500.0D);
                     break label631;
                  }

                  if (var3 >= 95) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 5500.0D);
                     break label631;
                  }

                  if (var3 >= 85) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 3150.0D);
                     break label631;
                  }

                  if (var3 >= 75) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 1900.0D);
                     break label631;
                  }

                  if (var3 >= 65) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 1150.0D);
                     break label631;
                  }

                  if (var3 >= 55) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 800.0D);
                     break label631;
                  }

                  if (var3 >= 45) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 450.0D);
                     break label631;
                  }

                  if (var3 >= 35) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 300.0D);
                     break label631;
                  }

                  if (var3 >= 25) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 200.0D);
                     break label631;
                  }

                  if (var3 >= 15) {
                     var69 = var2;
                     QualityZW.c(var2, "防御", 100.0D);
                     break label631;
                  }

                  if (var3 < 5) {
                     break label630;
                  }

                  QualityZW.c(var2, "防御", 50.0D);
               } catch (Exception var29) {
                  var29.printStackTrace();
                  break label630;
               }

               var69 = var2;
               break label631;
            }

            var69 = var2;
         }

         var69.a((double)var4);
         var2.e((double)(var4 + (var0.getTurnRount() >= 4 ? 10 : 0)));
         if (var2.getRolewxj() == 0.0D && var2.getRolewxm() == 0.0D && var2.getRolewxt() == 0.0D && var2.getRolewxs() == 0.0D && var2.getRolewxh() == 0.0D) {
            var69 = var2;
            QualityZW.c(var2, "金", Double.parseDouble(var0.getGold()));
            QualityZW.c(var2, "木", Double.parseDouble(var0.getWood()));
            QualityZW.c(var2, "土", Double.parseDouble(var0.getSoil()));
            QualityZW.c(var2, "水", Double.parseDouble(var0.getWater()));
            QualityZW.c(var2, "火", Double.parseDouble(var0.getFire()));
         } else {
            var69 = var2;
            QualityZW.c(var2, "金", Double.parseDouble(var0.getGold()) / 2.0D);
            QualityZW.c(var2, "木", Double.parseDouble(var0.getWood()) / 2.0D);
            QualityZW.c(var2, "土", Double.parseDouble(var0.getSoil()) / 2.0D);
            QualityZW.c(var2, "水", Double.parseDouble(var0.getWater()) / 2.0D);
            QualityZW.c(var2, "火", Double.parseDouble(var0.getFire()) / 2.0D);
         }

         var69.setRolewxj((double)((int)var2.getRolewxj()));
         var2.setRolewxm((double)((int)var2.getRolewxm()));
         var2.setRolewxt((double)((int)var2.getRolewxt()));
         var2.setRolewxs((double)((int)var2.getRolewxs()));
         var2.setRolewxh((double)((int)var2.getRolewxh()));
         if (var5 != 0.0D) {
            var2.f(var5);
         }

         return var2;
      }
   }

   public static double k(Double var0) {
      return (new BigDecimal(var0)).setScale(5 >> 1, --4).doubleValue();
   }

   public static Ql getPalQl(Pal var0, RoleData var1) {
      Ql var2 = em.i();
      if (var0 == null) {
         return var2;
      } else if (var1.getObjectArea().aa(var0.getpId()) == null) {
         return var2;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = getPalMap(var0, (boolean)(3 ^ 3), var1).entrySet().iterator(); var10000.hasNext(); var10000 = var3) {
            Entry var4 = (Entry)var3.next();
            QualityZW.c(var2, (String)var4.getKey(), (Double)var4.getValue());
         }

         return var2;
      }
   }
}
