package com.xy.game;

import com.xy.hd;
import com.xy.mw;
import com.xy.entity.Lingbao;
import com.xy.formula.BaseValue;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class HandleLingbao {
   public static void a(BigDecimal var0, Lingbao var1, RoleData var2) {
      Goodstable var3;
      if ((var3 = var2.getGoodEquip(var0)) != null && var3.getType() == 188L) {
         String var4;
         if ((var4 = var1.getFushis()) == null) {
            var4 = "";
         }

         var1.f(var3.getRgid().toString());
         if (var4.length() > var1.getFushis().length() && var2.i(var3)) {
            int var10004 = 3 ^ 3;
            var3.setStatus(3 >> 2);
            ParamTool.g(var3, var10004, var2.getGameView().getClient());
            ParamTool.i(var1, var2.getGameView().getClient());
            var2.getRoleProperty().h(var1);
         } else {
            var1.f(var3.getRgid().toString());
            var2.getGameView().fw("背包已满");
         }
      }
   }

   public static void b(Goodstable var0, boolean var1, RoleData var2) {
      Lingbao var6;
      if ((var6 = var2.getChoseBao()) == null) {
         var2.getGameView().fw("你没有选中的灵宝");
      } else {
         long var4 = var0.getType();
         if (var1 && var2.getGameView().getClient().n(1 ^ 3, 44 & 95) && var4 == 1002L) {
            ((mw)var2.getGameView().getFormManagement().e(9703 & 23226)).arc(--4, var6.getBaoid(), var0);
         } else {
            if (var4 == 190L) {
               if (var6.getBaotype().equals("法宝")) {
                  var2.getGameView().fw("法宝不能打技能");
                  return;
               }
            } else if (var4 == 891L) {
               int var7;
               if ((var7 = BaseValue.getQv(var6.getBaoquality())) >= (63 & 114)) {
                  var2.getGameView().fw("已经达到最高品质了");
                  return;
               }

               var7 /= 94 & 43;
               int var3 = 4 ^ 5;
               ++var7;
               Goodstable var10000;
               switch(var7) {
               case 2:
                  while(false) {
                  }

                  var3 = 1;
                  var10000 = var0;
                  break;
               case 3:
                  var3 = 2;
                  var10000 = var0;
                  break;
               case 4:
                  var3 = 4;
                  var10000 = var0;
                  break;
               case 5:
                  var3 = 10;
               default:
                  var10000 = var0;
               }

               if (var10000.getUsetime() < var3) {
                  var2.getGameView().fw("该品质提升需要消耗" + var3 + "个灵宝诸天印");
                  return;
               }
            } else if (var4 != 1002L) {
               return;
            }

            String var8 = Agreement.getSendTextAES("userling", var0.getRgid() + "|" + var6.getBaoid());
            var2.getGameView().getClient().d(var8);
         }
      }
   }

   public static void c(Goodstable var0, RoleData var1) {
      GameView var4 = var1.getGameView();
      Lingbao var3;
      if ((var3 = var1.getChoseBao()) == null) {
         var4.fw("你没有选中的灵宝");
      } else if (var3.getBaotype().equals("法宝")) {
         var4.fw("法宝不能打符石");
      } else {
         String[] var2 = null;
         if (!hd.o(var3.getFushis())) {
            var2 = var3.getFushis().split("\\|");
         }

         int var10000;
         Lingbao var10001;
         if (var2 != null) {
            var10000 = var2.length;
            var10001 = var3;
         } else {
            var10000 = 0;
            var10001 = var3;
         }

         if (var10000 < var10001.getFusum()) {
            int var5;
            if (var2 != null) {
               for(var10000 = var5 = 3 ^ 3; var10000 < var2.length; var10000 = var5) {
                  Goodstable var6;
                  if ((var6 = var1.getGood(new BigDecimal(var2[var5]))) == null) {
                     return;
                  }

                  if (var6.getGoodsname().equals(var0.getGoodsname())) {
                     var4.fw("你已经穿戴了同类型的符石");
                     return;
                  }

                  ++var5;
               }
            }

            var1.ac(var0.getRgid());
            var0.setStatus(--1);
            ParamTool.g(var0, 5 >> 3, var4.getClient());
            var3.f("" + var0.getRgid());
            ParamTool.i(var3, var4.getClient());
            var1.getRoleProperty().h(var3);
         }
      }
   }
}
