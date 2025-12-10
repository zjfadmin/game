package com.xy.game;

import com.xy.ci;
import com.xy.bean.LoginResult;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.PetProperty;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class ExpIncreaseUntil {
   public static void a(String[] var0, RoleData var1) {
      Goodstable var4;
      if ((var4 = var1.getGood(new BigDecimal(var0[2 & 5]))) != null && var4.getType() == 750L) {
         String[] var2 = var4.getValue().split("\\|");
         StringBuffer var3;
         (var3 = new StringBuffer()).append(var2[5 >> 3]);
         var3.append("|");
         var3.append(var2[3 >> 1]);
         var3.append("|内丹等级=");
         var3.append(var0[--1]);
         var3.append("转");
         var3.append(var0[--2]);
         var3.append("|经验=");
         var3.append(var0[--3]);
         var4.setValue(var3.toString());
      }
   }

   public static void b(String var0, RoleData var1) {
      String[] var6 = var0.split("=");
      RoleSummoning var3;
      if ((var3 = var1.getPet(new BigDecimal(var6[3 >> 2].substring(3 >> 1)))) != null) {
         int var4 = var3.getGrade();
         int var5;
         var3.setGrade(var5 = Integer.parseInt(var6[--1]));
         var3.setExp(new BigDecimal(var6[1 ^ 3]));
         var3.setFriendliness(Long.parseLong(var6[--3]));
         RoleData var10000;
         int var2;
         if (var5 != var4) {
            var2 = var5 - var4;
            var3.setBone(var3.getBone() + var2);
            var3.setSpir(var3.getSpir() + var2);
            var3.setPower(var3.getPower() + var2);
            var3.setSpeed(var3.getSpeed() + var2);
            if (var3.getTurnRount() >= --4) {
               var3.setCalm(var3.getCalm() + var2);
            }

            int[] var7;
            var3.setBasishp((var7 = PetProperty.getPetHMASp(var3, var1))[3 >> 2]);
            var3.setBasismp(var7[2 ^ 3]);
            var10000 = var1;
         } else {
            var2 = Integer.parseInt(var6[--4]);
            int var9 = Integer.parseInt(var6[--5]);
            if (var2 == 0) {
               int[] var8 = PetProperty.getPetHMASp(var3, var1);
               var10000 = var1;
               int var10003 = --1;
               var3.setBasishp(var8[2 & 5]);
               var3.setBasismp(var8[var10003]);
            } else {
               var3.setBasishp(var2);
               var10000 = var1;
               var3.setBasismp(var9);
            }
         }

         if (var10000.bj(var3.getSid())) {
            var1.getRoleProperty().m(var3);
         }

      }
   }

   public static void c(GameView var0) {
      LoginResult var1;
      LoginResult var10000 = var1 = var0.roleData.getLoginResult();
      var10000.setGrade(var10000.getGrade() + --1);
      var10000.setBone(var10000.getBone() + (3 & 5));
      var10000.setSpir(var10000.getSpir() + --1);
      var10000.setPower(var10000.getPower() + (3 & 5));
      var10000.setSpeed(var10000.getSpeed() + (2 ^ 3));
      if (var10000.getTurnAround() >= --4) {
         var1.setCalm(var1.getCalm() + --1);
      }

      var0.roleData.getRoleProperty().isReset = (boolean)(2 & 5);
      var0.roleData.getRoleProperty().z();
      var0.roleData.getRoleProperty().q();
      var0.roleData.getRoleProperty().isReset = (boolean)(2 ^ 3);
      var1.setHp(new BigDecimal(var0.roleData.getRoleProperty().getHp()));
      var1.setMp(new BigDecimal(var0.roleData.getRoleProperty().getMp()));
      var0.roleData.getRoleProperty().k();
   }

   public static void d(String var0, RoleData var1) {
      LoginResult var6 = var1.getLoginResult();
      String[] var4;
      String[] var10000 = var4 = var0.split("=");
      int var3 = var6.getHp().intValue();
      int var5 = var6.getMp().intValue();
      if (var10000.length >= --4) {
         var3 = (new BigDecimal(var4[--2])).intValue();
         var5 = (new BigDecimal(var4[--3])).intValue();
      }

      if (var3 == 0) {
         var3 = var1.getRoleProperty().getHp();
         var5 = var1.getRoleProperty().getMp();
      }

      int var10002 = 2 & 5;
      var6.setHp(new BigDecimal(var3));
      var6.setMp(new BigDecimal(var5));
      var6.setExperience(new BigDecimal(var4[--1]));
      var3 = Integer.parseInt(var4[var10002].substring(3 & 5));
      var5 = var6.getGrade();
      int var2;
      RoleData var9;
      if (var4.length > --4) {
         int var8 = --4;
         var6.setGrade(var3);
         var1.getGameView().roleUnit.r.setGrade(var3);

         for(var2 = var8; var8 < var4.length; var8 = var2) {
            if (var2 == --4) {
               var6.setBone(Integer.parseInt(var4[var2]));
            } else if (var2 == --5) {
               var6.setSpir(Integer.parseInt(var4[var2]));
            } else if (var2 == (62 & 71)) {
               var6.setPower(Integer.parseInt(var4[var2]));
            } else if (var2 == (15 & 119)) {
               var6.setSpeed(Integer.parseInt(var4[var2]));
            } else if (var2 == (107 & 28)) {
               var6.setCalm(Integer.parseInt(var4[var2]));
            }

            ++var2;
         }

         var9 = var1;
      } else {
         if (var3 != var5) {
            var6.setGrade(var3);
            var1.getGameView().roleUnit.r.setGrade(var3);
            var2 = var3 - var5;
            var6.setBone(var6.getBone() + var2);
            var6.setSpir(var6.getSpir() + var2);
            var6.setPower(var6.getPower() + var2);
            var6.setSpeed(var6.getSpeed() + var2);
            if (var6.getTurnAround() >= --4) {
               var6.setCalm(var6.getCalm() + var2);
            }

            var1.getRoleProperty().isReset = (boolean)(3 & 4);
            var1.getRoleProperty().z();
            var6.setHp(new BigDecimal(var1.getRoleProperty().getHp()));
            var6.setMp(new BigDecimal(var1.getRoleProperty().getMp()));
            var1.getRoleProperty().isReset = (boolean)(3 & 5);
            var1.getRoleProperty().k();
         }

         var9 = var1;
      }

      ci var7;
      if ((var7 = (ci)var9.getGameView().getFormManagement().m(125 & 107)) != null) {
         var7.s();
      }

      var1.getGameView().baseView.kh();
      if (var3 != var5) {
         var1.getGameView().automation.setAutomationTask(--3);
         var1.getGameView().automation.setAutomationBtnRed(--5);
      }

   }

   public static void e(String var0, RoleData var1) {
      String[] var2 = var0.split("=");
      Mount var3;
      if ((var3 = var1.getMount(new BigDecimal(var2[5 >> 3].substring(4 ^ 5)))) != null) {
         int var10001 = --3;
         int var10005 = 1 ^ 3;
         var3.setMountlvl(Integer.parseInt(var2[--1]));
         var3.setExp(Integer.parseInt(var2[var10005]));
         var3.setProficiency(Integer.parseInt(var2[var10001]));
         if (var1.g(var3.getMid())) {
            var1.getRoleProperty().l(var3);
         }

      }
   }

   public static void f(String var0, RoleData var1) {
      String[] var2 = var0.split("=");
      Lingbao var3;
      if ((var3 = var1.getLingbao(new BigDecimal(var2[3 >> 2].substring(5 >> 2)))) != null) {
         int var10002 = --3;
         var3.setLingbaolvl(new BigDecimal(var2[--1]));
         var3.setLingbaoexe(new BigDecimal(var2[--2]));
         var3.setLingbaoqihe(Long.parseLong(var2[var10002]));
         if (var1.bt(var3.getBaoid())) {
            var1.getRoleProperty().h(var3);
         }

      }
   }

   public static void g(Lingbao var0, long var1, GameView var3) {
      int var4 = var0.getLingbaolvl().intValue();
      long var5 = var0.getLingbaoexe().longValue();
      long var7 = ExpUtil.c(var4);
      var5 += var1;
      StringBuffer var9;
      (var9 = new StringBuffer()).append("#X#Y你的");
      var9.append(var0.getBaoname());
      var9.append("获得了");
      var9.append(ExpUtil.e(var1));
      var9.append("道行");
      int var10005 = 5 >> 3;
      var3.chatBox.addChat(46 & 87, var9.toString());
      int var10 = var10005;
      long var10000 = var5;

      int var11;
      while(true) {
         if (var10000 < var7) {
            var11 = var10;
            break;
         }

         if (var4 >= (4813 & 28154)) {
            var11 = var10;
            break;
         }

         if (var4 != 0 && var4 % (127 & 30) == 0) {
            var5 = var7;
            var11 = var10;
            var3.fw("突破后才可继续升级");
            break;
         }

         ++var4;
         var5 -= var7;
         var7 = ExpUtil.c(var4);
         var10 = 2 ^ 3;
         var10000 = var5;
      }

      if (var11 != 0) {
         (var9 = new StringBuffer()).append("你的");
         var9.append(var0.getBaoname());
         var9.append("升级了");
         var3.fw(var9.toString());
      }

      var0.setLingbaolvl(new BigDecimal(var4));
      var0.setLingbaoexe(new BigDecimal(var5));
   }
}
