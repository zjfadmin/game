package com.xy.c;

import com.xy.a.Class142;
import com.xy.a.q.Class105;
import com.xy.a.q.Class94;
import com.xy.a.q.Class97;
import com.xy.bean.QualityClBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class Class27 implements ServerAction {
   @Override
   public void b(String var1, String var2, GameClient var3) {
      QualityClBean var4;
      if ((var4 = com.xy.v.Class31.a().fromJson(var2, QualityClBean.class)) != null) {
         GameView var5 = var3.gameView;
         if (var4.getType() != 1
            && var4.getType() != 2
            && var4.getType() != -2
            && (var4.getType() < 71 || var4.getType() > 76)
            && var4.getType() != 53
            && var4.getType() != 54
            && var4.getType() != -81
            && var4.getType() != -82
            && var4.getType() != 53
            && var4.getType() != 82
            && var4.getType() != 133
            && var4.getType() != 135) {
            if (var4.getType() == 4 || var4.getType() == -4) {
               com.xy.a.i.Class1 var16 = (com.xy.a.i.Class1)var5.getFormManagement().j(74);
               var16.ba(var4);
               Class142 var19;
               if ((var19 = (Class142)var5.getFormManagement().l(121)) != null) {
                  var19.aou(var4.getNewAttr());
                  return;
               }
            } else if (var4.getType() == 44) {
               Goodstable var11;
               if ((var11 = var5.roleData.getGood(var4.getRgid())) == null) {
                  return;
               }

               String var23 = var11.getValue();
               String var26 = "P/";
               String[] var24 = var23.split("\\|");
               var26 = "觡釆抨";
               String var7 = MsgUntil.getValuesMessage(var24, "觉醒技");
               Class94 var20 = (Class94)var5.getFormManagement().j(94);
               var20.aih(var7, 0);
               var20.aih(var4.getNewAttr(), 1);
               var20.ba(var4);
               if (!var20.isVisible()) {
                  var5.getFormManagement().b(94);
               }

               Class142 var22;
               if ((var22 = (Class142)var5.getFormManagement().l(121)) != null) {
                  var22.ci(var4.getNewAttr());
                  return;
               }
            } else {
               if (var4.getType() == 46) {
                  Goodstable var15;
                  if ((var15 = var5.roleData.getGood(var4.getRgid())) == null) {
                     return;
                  }

                  String var29 = var15.getValue();
                  String var31 = "P/";
                  var15.setValue(GoodType.e(var29.split("\\|"), 5, var4.getNewAttr()));
                  Class97 var18;
                  Goodstable var21;
                  BigDecimal var25;
                  Goodstable var30;
                  if ((var21 = (Goodstable)(var18 = (Class97)var5.getFormManagement().j(91)).ail()[0].ep().jx()) != null) {
                     var25 = var21.getRgid();
                     var30 = var15;
                  } else {
                     var25 = null;
                     var30 = var15;
                  }

                  if (!com.xy.v.Class12.x(var25, var30.getRgid())) {
                     return;
                  }

                  var18.bb(var15);
                  return;
               }

               if (var4.getType() == 5) {
                  Goodstable var12;
                  if ((var12 = var5.roleData.getGood(var4.getRgid())) == null) {
                     return;
                  }

                  String var28 = var12.getValue();
                  String var10002 = "\bT";
                  var12.setValue(GoodType.e(var28.split("\\|"), 4, var4.getNewAttr()));
                  ((Class105)var5.getFormManagement().j(84)).ay(var12);
                  if (var12.getStatus() == 1) {
                     var5.roleData.getRoleProperty().f();
                     return;
                  }
               } else if (var4.getType() == 143) {
                  com.xy.a.q.Class13 var13 = (com.xy.a.q.Class13)var5.getFormManagement().j(175);
                  var13.gs(2, var4);
                  Class142 var17;
                  if ((var17 = (Class142)var5.getFormManagement().l(121)) != null) {
                     var17.aos(var4.getNewAttr());
                     return;
                  }
               } else if (var4.getType() == 144) {
                  Goodstable var14;
                  if (!com.xy.v.Class12.h(var4.getNewAttr()) && (var14 = var5.roleData.getGood(var4.getRgid())) != null) {
                     var14.setValue(var4.getNewAttr());
                  }

                  ((com.xy.a.q.Class13)var5.getFormManagement().j(175)).gs(1, var4);
               }
            }
         } else {
            com.xy.a.q.Class30 var6 = (com.xy.a.q.Class30)var5.getFormManagement().j(11);
            if (var4.getType() == 53 || var4.getType() == 54) {
               BigDecimal var8;
               if ((var8 = ((com.xy.a.a.Class19)var5.getFormManagement().j(95)).em()) == null) {
                  return;
               }

               Goodstable var9;
               if ((var9 = var5.roleData.getGood(var8)) == null) {
                  return;
               }

               if (!var6.isVisible()) {
                  String var10000 = var9.getValue();
                  String var10001 = "\bT";
                  String var10 = var10000.split("\\|")[var4.getType() == 53 ? 3 : 4];
                  var6.oz(var4.getRgid(), var10, var4.getType() == 53 ? 2 : 3, false);
               }
            }

            var6.ba(var4);
         }
      }
   }
}
