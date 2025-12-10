package com.xy.game;

import com.xy.mi;
import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;

public class HandleMount {
   public static void a(Goodstable var0, Mount var1, RoleData var2) {
      long var3;
      if ((var3 = var0.getType()) == 721L) {
         if (var1.getUseNumber() >= --3) {
            var2.getGameView().f("只能使用3次筋骨提气丹");
            return;
         }
      } else if (var3 == 724L) {
         if (var1.getExquisiteUseTime() >= --5) {
            var2.getGameView().f("只能使用5次玲珑丹");
            return;
         }
      } else if (var3 != 717L) {
         int var5;
         if (var3 == 801L) {
            if ((var5 = var1.getMountlvl()) == (110 & 117) || var5 >= (13819 & 19148)) {
               var2.getGameView().f("坐骑" + var1.getMountname() + "已达最高等级100级！！");
               return;
            }
         } else if (var3 == 802L) {
            var5 = 100000;
            if (var1.getMountlvl() > (100 & 127)) {
               var5 = 150000;
               if (var2.getGameView().getClient().n(5 >> 1, 12 & 123) || var2.getGameView().getClient().n(5 >> 1, 111 & 26) || var2.getGameView().getClient().n(--2, 61 & 78)) {
                  var5 = 100000;
               }
            }

            if (var1.getProficiency() >= var5) {
               var2.getGameView().f("坐骑" + var1.getMountname() + "的技能熟练度已达到峰值！！");
               return;
            }
         } else if (var3 != 103L || !var2.getGameView().getClient().gameMount) {
            return;
         }
      }

      String var6 = Agreement.getSendTextAES("usermount", var0.getRgid() + "|" + var1.getMid());
      var2.getGameView().getClient().d(var6);
   }

   public static void b(Goodstable var0, Mount var1, RoleData var2) {
      int var10002 = --1;
      var0.ab(--1);
      ParamTool.g(var0, var10002, var2.getGameView().getClient());
      if (var1.getMountskill().size() != 0) {
         var1.getMountskill().clear();
         String var3 = Agreement.getSendTextAES("missmountskill", mi.b().toJson(var1.getMid()));
         var2.getGameView().getClient().d(var3);
         RoleSummoning var4;
         if ((var4 = var2.getChosePet()) != null) {
            var2.getRoleProperty().m(var4);
         }
      }

   }

   public static void c(Goodstable var0, RoleData var1) {
      Mount var2;
      if ((var2 = var1.getChoseMount()) == null) {
         var1.getGameView().fw("你没有选中的坐骑");
      } else {
         long var3 = var0.getType();
         if (!var1.getGameView().getClient().gameMount || var3 != 718L && var3 != 719L) {
            if (var3 == 718L) {
               d(var0, var2, var1);
            } else if (var3 == 719L) {
               b(var0, var2, var1);
            } else {
               if (var3 != 720L) {
                  a(var0, var2, var1);
               }

            }
         } else {
            String var5 = Agreement.getSendTextAES("usermount", var0.getRgid() + "|" + var2.getMid());
            var1.getGameView().getClient().d(var5);
         }
      }
   }

   public static void d(Goodstable var0, Mount var1, RoleData var2) {
      if (var1.getMountskill().size() >= 5 >> 1) {
         var2.getGameView().fw("这个坐骑技能已超过两个！！！");
      } else {
         MountSkill var3 = new MountSkill();
         int var10000 = 3 ^ 3;
         var3.setMid(var1.getMid());
         var3.setSkillname(var0.getGoodsname());

         int var4;
         for(var10000 = var4 = 3 ^ 3; var10000 < var1.getMountskill().size(); var10000 = var4) {
            if (((MountSkill)var1.getMountskill().get(var4)).getSkillname().equals(var3.getSkillname())) {
               var2.getGameView().fw("该坐骑已有这个技能!");
               return;
            }

            ++var4;
         }

         var1.getMountskill().add(var3);
         int var10003 = 4 ^ 5;
         var0.ab(--1);
         ParamTool.g(var0, var10003, var2.getGameView().getClient());
         String var6 = Agreement.getSendTextAES("addmountskill", mi.b().toJson(var3));
         var2.getGameView().getClient().d(var6);
         RoleSummoning var5 = var2.getChosePet();
         if (var5 != null) {
            var2.getRoleProperty().m(var5);
         }

      }
   }
}
