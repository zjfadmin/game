package com.xy.i;

import com.xy.a.Class121;
import com.xy.a.Class93;
import com.xy.a.q.Class101;
import com.xy.a.q.Class35;
import com.xy.a.v.Class39;
import com.xy.q.Class30;
import com.xy.q.Class49;
import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class0 extends Class1 {
   private int ah;

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public static void ff(int var0, GameView var1) {
      fh(var0, var1, null);
   }

   public static void fg(GameView var0) {
      BigDecimal var1;
      if ((var1 = var0.roleUnit.ap.getGang_id()) != null && var1.longValue() != 0L) {
         String var2 = Agreement.getSendTextAES("intogang", var1.toString());
         var0.getClient().k(var2);
      } else {
         String var10001 = "伸沎村币浦\u000e";
         var0._do("你没有帮派!");
      }
   }

   public Class0(String var1, int var2, int var3, Class30 var4) {
      super(var1, var2, var4);
      this.ah = var3;
   }

   public static void fh(int var0, GameView var1, Object var2) {
      Class30 var3;
      if ((var3 = var1.getFormManagement().l(var0)) != null && var3.isVisible()) {
         var1.getFormManagement().f(var0);
      } else if (var0 == 22) {
         ((Class121)var1.getFormManagement().j(22)).mc(var1.mapScene.r);
      } else if (var0 == 48) {
         fg(var1);
      } else if (var0 == 87) {
         Class101 var9 = (Class101)var1.getFormManagement().j(var0);
         var9.g(1);
         var1.getFormManagement().b(var0);
      } else if (var0 == 103) {
         ((Class35)var1.getFormManagement().j(var0)).g(1);
      } else if (var0 == 117) {
         if (var1.getClient().l(2, 3) || var1.getClient().l(2, 8) || var1.getClient().l(2, 12)) {
            Class93 var8 = (Class93)var1.getFormManagement().j(var0);
            var8.g(3);
            var1.getFormManagement().b(var0);
         } else if (var1.getClient().gameType != 1 && var1.getClient().gameType != 2) {
            String var10001 = "i]\u0000";
            String var7 = Agreement.getSendTextAES("exchange", "X01");
            var1.getClient().k(var7);
         } else {
            Class93 var6 = (Class93)var1.getFormManagement().j(var0);
            var6.g(2);
            var1.getFormManagement().b(var0);
         }
      } else if (var0 == 137) {
         ((com.xy.a.i.Class22)var1.getFormManagement().j(var0)).y(-1);
      } else {
         if (var0 == 167) {
            Class39 var4 = (Class39)var1.getFormManagement().j(var0);
            if (var2 == null) {
               var4.g(0);
               return;
            }

            if (var2 instanceof Integer) {
               var4.g((Integer)var2);
               return;
            }

            if (var2 instanceof Activity) {
               var4.ws((Activity)var2);
               return;
            }
         } else if (var0 == 168) {
            com.xy.a.v.Class30 var5 = (com.xy.a.v.Class30)var1.getFormManagement().j(var0);
            if (var2 instanceof Activity) {
               var5.ws((Activity)var2);
               return;
            }
         } else {
            var1.getFormManagement().b(var0);
         }
      }
   }

   @Override
   public void cw(MouseEvent var1) {
      ff(this.ah, this.form.afx);
   }

   public Class0(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class30 var7) {
      super(var1, var2, var5, var7);
      this.ah = var3;
      Class0 var10000;
      if (var4 != null) {
         var10000 = this;
         this.setFont(var4);
      } else {
         var10000 = this;
         this.setFont(Class49.bz);
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public Class0(String var1, int var2, int var3, String var4, Class30 var5) {
      this(var1, var2, var3, null, null, var4, var5);
   }
}
