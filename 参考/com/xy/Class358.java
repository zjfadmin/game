package com.xy;

import com.xy.bean.QualityClBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class358 implements ServerAction {
   public void a(String var1, String var2, GameClient var3) {
      QualityClBean var8;
      if ((var8 = (QualityClBean)Class695.b().fromJson(var2, QualityClBean.class)) != null) {
         GameView var9 = var3.gameView;
         if (var8.getType() != (2 ^ 3) && var8.getType() != (1 ^ 3) && var8.getType() != (-1 & -2) && (var8.getType() < (119 & 79) || var8.getType() > (125 & 78)) && var8.getType() != (127 & 53) && var8.getType() != (54 & 127) && var8.getType() != (-1 & -81) && var8.getType() != (-18 & -65) && var8.getType() != (61 & 119) && var8.getType() != (126 & 83) && var8.getType() != (8909 & 23991) && var8.getType() != (10959 & 21943)) {
            Class605 var4;
            if (var8.getType() != --4 && var8.getType() != -4) {
               Goodstable var12;
               if (var8.getType() == 44) {
                  if ((var12 = var9.roleData.getGood(var8.getRgid())) == null) {
                     return;
                  }

                  String var13 = MsgUntil.getValuesMessage(var12.getValue().split("\\|"), "觉醒技");
                  Class229 var16 = (Class229)var9.getFormManagement().e(94);
                  var16.ua(var13, 3 ^ 3);
                  var16.ua(var8.getNewAttr(), --1);
                  var16.ay(var8);
                  if (!var16.isVisible()) {
                     var9.getFormManagement().a(94);
                  }

                  Class605 var18;
                  if ((var18 = (Class605)var9.getFormManagement().m(121)) != null) {
                     var18.la(var8.getNewAttr());
                     return;
                  }
               } else {
                  if (var8.getType() == 46) {
                     if ((var12 = var9.roleData.getGood(var8.getRgid())) == null) {
                        return;
                     }

                     var12.setValue(GoodType.o(var12.getValue().split("\\|"), --5, var8.getNewAttr()));
                     Class185 var15;
                     BigDecimal var10000;
                     Goodstable var17;
                     Goodstable var10001;
                     if ((var17 = (Goodstable)(var15 = (Class185)var9.getFormManagement().e(91)).qv()[3 >> 2].u().hr()) != null) {
                        var10000 = var17.getRgid();
                        var10001 = var12;
                     } else {
                        var10000 = null;
                        var10001 = var12;
                     }

                     if (!Class394.v(var10000, var10001.getRgid())) {
                        return;
                     }

                     var15.ax(var12);
                     return;
                  }

                  if (var8.getType() == --5) {
                     if ((var12 = var9.roleData.getGood(var8.getRgid())) == null) {
                        return;
                     }

                     var12.setValue(GoodType.o(var12.getValue().split("\\|"), --4, var8.getNewAttr()));
                     ((Class312)var9.getFormManagement().e(84)).ax(var12);
                     if (var12.getStatus() == (2 ^ 3)) {
                        var9.roleData.getRoleProperty().q();
                        return;
                     }
                  } else if (var8.getType() == 143) {
                     Class428 var14 = (Class428)var9.getFormManagement().e(175);
                     var14.c(--2, var8);
                     if ((var4 = (Class605)var9.getFormManagement().m(121)) != null) {
                        var4.pl(var8.getNewAttr());
                        return;
                     }
                  } else if (var8.getType() == 144) {
                     if (!Class394.o(var8.getNewAttr()) && (var12 = var9.roleData.getGood(var8.getRgid())) != null) {
                        var12.setValue(var8.getNewAttr());
                     }

                     ((Class428)var9.getFormManagement().e(175)).c(3 & 5, var8);
                  }
               }
            } else {
               Class86 var11 = (Class86)var9.getFormManagement().e(74);
               var11.ay(var8);
               if ((var4 = (Class605)var9.getFormManagement().m(121)) != null) {
                  var4.lb(var8.getNewAttr());
                  return;
               }
            }

         } else {
            Class53 var10 = (Class53)var9.getFormManagement().e(79 & 59);
            if (var8.getType() == (119 & 61) || var8.getType() == (54 & 127)) {
               BigDecimal var5;
               if ((var5 = ((Class95)var9.getFormManagement().e(127 & 95)).ez()) == null) {
                  return;
               }

               Goodstable var6;
               if ((var6 = var9.roleData.getGood(var5)) == null) {
                  return;
               }

               if (!var10.isVisible()) {
                  String var7 = var6.getValue().split("\\|")[var8.getType() == (63 & 117) ? --3 : 4];
                  var10.zi(var8.getRgid(), var7, var8.getType() == 53 ? 5 >> 1 : 3, false);
               }
            }

            var10.ay(var8);
         }
      }
   }
}
