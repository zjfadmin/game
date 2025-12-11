package com.xy.c;

import com.xy.a.q.Class101;
import com.xy.a.q.Class42;
import com.xy.a.q.Class43;
import com.xy.a.q.Class44;
import com.xy.a.q.Class59;
import com.xy.a.q.Class86;
import com.xy.a.q.Class87;
import com.xy.a.q.Class98;
import com.xy.bean.QuackGameBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class20 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      au(com.xy.v.Class31.a().fromJson(var2, QuackGameBean.class), var3.gameView);
   }

   public static void au(QuackGameBean var0, GameView var1) {
      if (var0.getType() == 1) {
         String var12 = var0.getPetmsg();
         String var16 = "+\u0005";
         String[] var7 = var12.split("\\|");
         ((Class59)var1.getFormManagement().j(71)).tg(var7);
      } else {
         if (var0.getType() == 2) {
            if (var0.getMoney() != null) {
               var1.roleData.getLoginResult().setGold(var1.roleData.getLoginResult().getGold().add(var0.getMoney()));
            }

            Class59 var2;
            if ((var2 = (Class59)var1.getFormManagement().l(71)) != null) {
               String var10000 = var0.getPetmsg();
               String var10001 = "5$";
               String[] var3 = var10000.split("\\|");
               var2.yr(var3, var0.getMoney());
               return;
            }
         } else {
            if (var0.getType() == 3) {
               ((Class101)var1.getFormManagement().j(87)).tm(var0);
               return;
            }

            if (var0.getType() == 4) {
               String var11 = var0.getPetmsg();
               String var15 = "+\u0005";
               String[] var6 = var11.split("\\|");
               ((Class101)var1.getFormManagement().j(87)).tg(var6);
               return;
            }

            if (var0.getType() == 6) {
               String var9 = var0.getPetmsg();
               String var13 = "5$";
               String[] var5;
               BigDecimal[] var8 = new BigDecimal[(var5 = var9.split("\\|")).length];

               int var4;
               for (int var10 = var4 = 0; var10 < var8.length; var10 = var4) {
                  int var14 = var4;
                  BigDecimal var10002 = new BigDecimal(var5[var4]);
                  var4++;
                  var8[var14] = var10002;
               }

               ((Class43)var1.getFormManagement().j(112)).tn(var8);
               return;
            }

            if (var0.getType() == 7) {
               ((Class42)var1.getFormManagement().j(118)).tm(var0);
               return;
            }

            if (var0.getType() == 10) {
               if (var0.getMoney().intValue() <= 100) {
                  ((Class44)var1.getFormManagement().j(119)).tw(var0);
                  return;
               }

               if (var0.getMoney().intValue() <= 1000) {
                  ((Class86)var1.getFormManagement().j(126)).tx(var0);
                  return;
               }

               if (var0.getMoney().intValue() > 2000 && var0.getMoney().intValue() <= 3000) {
                  ((Class98)var1.getFormManagement().j(128)).tm(var0);
                  return;
               }

               ((Class87)var1.getFormManagement().j(127)).tw(var0);
               return;
            }

            if (var0.getType() == 11) {
               if (var0.getMoney().intValue() <= 100) {
                  ((Class44)var1.getFormManagement().j(119)).tx(var0);
                  return;
               }

               if (var0.getMoney().intValue() <= 1000) {
                  ((Class86)var1.getFormManagement().j(126)).tw(var0);
                  return;
               }

               if (var0.getMoney().intValue() > 2000 && var0.getMoney().intValue() <= 3000) {
                  ((Class98)var1.getFormManagement().j(128)).tx(var0);
                  return;
               }

               ((Class87)var1.getFormManagement().j(127)).tx(var0);
            }
         }
      }
   }
}
