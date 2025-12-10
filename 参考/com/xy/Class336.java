package com.xy;

import com.xy.bean.QuackGameBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class336 implements ServerAction {
   public static void aw(QuackGameBean var0, GameView var1) {
      String[] var5;
      if (var0.getType() == 5 >> 2) {
         var5 = var0.getPetmsg().split("\\|");
         ((Class40)var1.getFormManagement().e(79 & 119)).df(var5);
      } else {
         if (var0.getType() == (1 ^ 3)) {
            if (var0.getMoney() != null) {
               var1.roleData.getLoginResult().setGold(var1.roleData.getLoginResult().getGold().add(var0.getMoney()));
            }

            Class40 var2;
            if ((var2 = (Class40)var1.getFormManagement().m(127 & 71)) != null) {
               String[] var3 = var0.getPetmsg().split("\\|");
               var2.de(var3, var0.getMoney());
               return;
            }
         } else {
            if (var0.getType() == --3) {
               ((Class657)var1.getFormManagement().e(95 & 119)).hm(var0);
               return;
            }

            if (var0.getType() == --4) {
               var5 = var0.getPetmsg().split("\\|");
               ((Class657)var1.getFormManagement().e(87 & 127)).df(var5);
               return;
            }

            if (var0.getType() == (14 & 119)) {
               BigDecimal[] var10000 = new BigDecimal[(var5 = var0.getPetmsg().split("\\|")).length];
               boolean var10002 = true;
               BigDecimal[] var6 = var10000;

               int var4;
               for(int var7 = var4 = 3 ^ 3; var7 < var6.length; var7 = var4) {
                  int var10001 = var4;
                  BigDecimal var8 = new BigDecimal(var5[var4]);
                  ++var4;
                  var6[var10001] = var8;
               }

               ((Class559)var1.getFormManagement().e(123 & 116)).ajv(var6);
               return;
            }

            if (var0.getType() == (39 & 95)) {
               ((Class208)var1.getFormManagement().e(119 & 126)).hm(var0);
               return;
            }

            if (var0.getType() == (46 & 91)) {
               if (var0.getMoney().intValue() <= (102 & 125)) {
                  ((Class309)var1.getFormManagement().e(119 & 127)).hh(var0);
                  return;
               }

               if (var0.getMoney().intValue() <= (16378 & 17389)) {
                  ((Class669)var1.getFormManagement().e(126 & 127)).hh(var0);
                  return;
               }

               if (var0.getMoney().intValue() > (8182 & 26585) && var0.getMoney().intValue() <= (4093 & 31674)) {
                  ((Class508)var1.getFormManagement().e(25824 & 7071)).hl(var0);
                  return;
               }

               ((Class144)var1.getFormManagement().e(127)).hl(var0);
               return;
            }

            if (var0.getType() == 11) {
               if (var0.getMoney().intValue() <= 100) {
                  ((Class309)var1.getFormManagement().e(119)).hl(var0);
                  return;
               }

               if (var0.getMoney().intValue() <= 1000) {
                  ((Class669)var1.getFormManagement().e(126)).hl(var0);
                  return;
               }

               if (var0.getMoney().intValue() > 2000 && var0.getMoney().intValue() <= 3000) {
                  ((Class508)var1.getFormManagement().e(128)).hh(var0);
                  return;
               }

               ((Class144)var1.getFormManagement().e(127)).hh(var0);
            }
         }

      }
   }

   public void a(String var1, String var2, GameClient var3) {
      aw((QuackGameBean)Class695.b().fromJson(var2, QuackGameBean.class), var3.gameView);
   }
}
