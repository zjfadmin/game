package com.xy.game;

import com.xy.W;
import com.xy.cX;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.math.BigDecimal;

public class HandleEquip {
   public static boolean a(RoleData var0, Baby var1, Goodstable var2, int var3) {
      if (var2 != null) {
         BigDecimal var6 = var1.b(var2.getRgid(), var3);
         var0.ac(var2.getRgid());
         var2.setStatus(4 ^ 5);
         ParamTool.g(var2, 2 & 5, var0.getGameView().getClient());
         Goodstable var5;
         if ((var5 = var0.getGoodEquip(var6)) != null) {
            var0.i(var5);
            int var10002 = 3 & 4;
            var5.setStatus(3 & 4);
            ParamTool.g(var5, var10002, var0.getGameView().getClient());
         }

         ParamTool.b(var1, var0.getGameView().getClient());
         return (boolean)(3 & 5);
      } else {
         BigDecimal var4 = var1.b(new BigDecimal(-4 >> 2), var3);
         if ((var2 = var0.getGoodEquip(var4)) != null && var0.i(var2)) {
            int var10000 = 2 ^ 3;
            int var10003 = 2 & 5;
            var2.setStatus(5 >> 3);
            ParamTool.g(var2, var10003, var0.getGameView().getClient());
            ParamTool.b(var1, var0.getGameView().getClient());
            return (boolean)var10000;
         } else {
            var1.b(var2.getRgid(), var3);
            var0.getGameView().fw("背包已满");
            return (boolean)(3 ^ 3);
         }
      }
   }

   public static void b(RoleData var0, int var1, Goodstable var2) throws Exception {
      if (!var0.getGameView().getClient().n(1 ^ 3, --3) || var1 == 0 || var1 == (3 & 5) || var1 == (1 ^ 3) || var1 == --3 || var1 == --5) {
         int var3;
         if ((var3 = getEquiptmentOrNo(var0, var2)) == (-1 & -2)) {
            var0.getGameView().f("你达不到装备要求");
         } else {
            RoleData var10000;
            if (var3 != -4 >> 2) {
               var1 = var3;
               var10000 = var0;
            } else {
               if (var1 == (95 & 42) && var0.getEquipGood(var1) != null) {
                  var1 = 43 & 95;
               }

               var10000 = var0;
            }

            c(var10000, var1, var2);
         }
      }
   }

   public static boolean c(RoleData var0, int var1, Goodstable var2) {
      RoleData var10000;
      String var5;
      if (var1 != -4 >> 2 && var2 != null) {
         StringBuffer var7;
         (var7 = new StringBuffer()).append("E");
         var7.append(var1);
         Goodstable var8 = var0.getEquipGood(var1);
         if (var8 != null) {
            var8.setStatus(5 >> 3);
            var7.append("=A");
            var7.append(var8.getRgid());
         }

         var7.append("=B");
         var7.append(var2.getRgid());
         var2.setStatus(--1);
         var0.ac(var2.getRgid());
         if (var8 != null) {
            var0.i(var8);
         }

         var10000 = var0;
         var0.goodChoses[var1] = var2.getRgid();
         var5 = Agreement.getSendTextAES("rolechange", var7.toString());
         var0.getGameView().getClient().d(var5);
         var0.getPackRecord().setEquip(var0.goodChoses);
      } else if (var2 == null) {
         Goodstable var3;
         if ((var3 = var0.getEquipGood(var1)) == null) {
            return (boolean)(5 >> 3);
         }

         if (!var0.i(var3)) {
            var0.getGameView().f("背包已满");
            return (boolean)(3 >> 2);
         }

         var0.goodChoses[var1] = null;
         var3.setStatus(2 & 5);
         StringBuffer var4;
         (var4 = new StringBuffer()).append("E");
         var4.append(var1);
         var4.append("=A");
         var4.append(var3.getRgid());
         var5 = Agreement.getSendTextAES("rolechange", var4.toString());
         var0.getGameView().getClient().d(var5);
         var0.getPackRecord().setEquip(var0.goodChoses);
         var10000 = var0;
      } else {
         var10000 = var0;
      }

      var10000.getRoleProperty().q();

      label36: {
         try {
            Thread.sleep(5L);
         } catch (Exception var6) {
            var10000 = var0;
            var6.printStackTrace();
            break label36;
         }

         var10000 = var0;
      }

      var10000.f(false);
      return (boolean)(--1);
   }

   public static int getEquiptmentOrNo(RoleData var0, Goodstable var1) {
      int var8 = -4 >> 2;
      int var9 = 3 & 4;
      int var4 = 5 >> 3;
      double var5 = 1.0D;

      int var7;
      String[] var14;
      for(int var10000 = var7 = (var14 = var1.getValue().split("\\|")).length - (3 & 5); var10000 >= 0; var10000 = var7) {
         String[] var2;
         int var3;
         if (!var14[var7].startsWith(GoodType.Extras[2 & 5])) {
            if (var14[var7].startsWith(GoodType.Extras[5 >> 1])) {
               var2 = var14[var7].split("\\&");

               for(var10000 = var3 = 2 ^ 3; var10000 < var2.length; var10000 = var3) {
                  int var15;
                  if (var2[var3].startsWith("属性需求") && (var15 = var2[var3].indexOf("=")) != -4 >> 2) {
                     double var16 = Double.parseDouble(var2[var3].substring(var15 + --1)) / 100.0D;
                     var5 += var2[var3].startsWith("属性需求减少") ? -var16 : var16;
                  }

                  ++var3;
               }
            } else if (!(var2 = var14[var7].split("="))[3 & 4].equals("装备角色") && !var2[5 >> 3].equals("性别要求") && !var2[3 ^ 3].equals("性别")) {
               if (!var2[2 & 5].equals("等级要求") && !var2[3 & 4].equals("最高携带等级")) {
                  if (!var2[5 >> 3].equals("力量要求") && !var2[3 >> 2].equals("灵性要求") && !var2[2 & 5].equals("根骨要求") && !var2[3 >> 2].equals("敏捷要求") && !var2[0].equals("声望要求")) {
                     if (var2[0].equals("装备部位")) {
                        try {
                           var8 = Integer.parseInt(var2[1]);
                        } catch (Exception var13) {
                        }
                     }
                  } else if (var9 == 0 && !d(var0, var2, var5)) {
                     return -2 & -1;
                  }
               } else if (var4 == 0 && !d(var0, var2, var5)) {
                  return -1 & -2;
               }
            } else if (!d(var0, var2, var5)) {
               return -2 & -1;
            }
         } else {
            var2 = var14[var7].split("\\&");

            for(var10000 = var3 = 2 ^ 3; var10000 < var2.length; var10000 = var3) {
               String[] var10;
               int var11;
               if ((var10 = var2[var3].split("="))[5 >> 3].equals("特技")) {
                  for(var10000 = var11 = --1; var10000 < var10.length; var10000 = var11) {
                     if (var10[var11].equals("8016")) {
                        var9 = --1;
                     } else if (var10[var11].equals("8017")) {
                        var4 = 4 ^ 5;
                     }

                     ++var11;
                  }
               }

               ++var3;
            }
         }

         --var7;
      }

      return var8;
   }

   public static boolean d(RoleData var0, String[] var1, double var2) {
      String var4;
      switch((var4 = var1[3 >> 2]).hashCode()) {
      case 784100:
         while(false) {
         }

         if (!var4.equals("性别")) {
            return false;
         }
         break;
      case 666980469:
         if (var4.equals("力量要求")) {
            if ((double)var0.getRoleProperty().getPower() >= (double)Integer.valueOf(var1[3 & 5]) * var2) {
               return (boolean)(2 ^ 3);
            }

            return false;
         }

         return false;
      case 704766028:
         if (var4.equals("声望要求")) {
            if (var0.getLoginResult().getPrestige().intValue() >= Integer.valueOf(var1[2 ^ 3])) {
               return (boolean)(3 >> 1);
            }

            return false;
         }

         return false;
      case 754639045:
         if (!var4.equals("性别要求")) {
            return false;
         }
         break;
      case 798218473:
         if (var4.equals("敏捷要求")) {
            if ((double)var0.getRoleProperty().getSpeed() >= (double)Integer.valueOf(var1[--1]) * var2) {
               return (boolean)(5 >> 2);
            }

            return false;
         }

         return false;
      case 834020528:
         if (var4.equals("根骨要求")) {
            if ((double)var0.getRoleProperty().getBone() >= (double)Integer.valueOf(var1[5 >> 2]) * var2) {
               return (boolean)(--1);
            }

            return false;
         }

         return false;
      case 882427059:
         if (var4.equals("灵性要求")) {
            if ((double)var0.getRoleProperty().getSpir() >= (double)Integer.valueOf(var1[3 & 5]) * var2) {
               return (boolean)(--1);
            }

            return false;
         }

         return false;
      case 972511199:
         if (var4.equals("等级要求")) {
            return cX.j(var0.getLoginResult().getGrade(), var1[4 ^ 5]);
         }

         return false;
      case 1066101570:
         if (var4.equals("装备角色")) {
            if (var1[3 & 5].indexOf(var0.getLoginResult().getLocalname()) != -4 >> 2) {
               return (boolean)(3 & 5);
            }

            return false;
         }

         return false;
      case 2016393858:
         if (var4.equals("最高携带等级")) {
            return cX.h(var0.getLoginResult().getGrade(), var1[--1]);
         }

         return false;
      default:
         return false;
      }

      if (var1[--1].equals("2")) {
         return (boolean)(2 ^ 3);
      } else if (W.k(var0.getLoginResult().getSpecies_id()) == Integer.valueOf(var1[2 ^ 3])) {
         return (boolean)(4 ^ 5);
      } else {
         return false;
      }
   }
}
