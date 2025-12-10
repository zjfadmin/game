package com.xy;

import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class Class658 extends Class93 {
   private int m;

   public static void cx(GameView var0) {
      BigDecimal var1;
      if ((var1 = var0.roleUnit.r.getGang_id()) != null && var1.longValue() != 0L) {
         String var2 = Agreement.getSendTextAES("intogang", var1.toString());
         var0.getClient().d(var2);
      } else {
         var0.f("你没有帮派!");
      }
   }

   public static void cy(int var0, GameView var1) {
      cz(var0, var1, (Object)null);
   }

   public Class658(String var1, int var2, int var3, Class345 var4) {
      super(var1, var2, var4);
      this.m = var3;
   }

   public void af(MouseEvent var1) {
      cy(this.m, this.form.aej);
   }

   public void ac(MouseEvent var1, boolean var2) {
   }

   public Class658(String var1, int var2, int var3, String var4, Class345 var5) {
      this(var1, var2, var3, (Font)null, (Color[])null, var4, var5);
   }

   public Class658(String var1, int var2, int var3, Font var4, Color[] var5, String var6, Class345 var7) {
      super(var1, var2, var5, var7);
      this.m = var3;
      Class658 var10000;
      if (var4 != null) {
         this.setFont(var4);
         var10000 = this;
      } else {
         this.setFont(Class681.bm);
         var10000 = this;
      }

      var10000.setHorizontalAlignment(0);
      this.setText(var6);
   }

   public static void cz(int var0, GameView var1, Object var2) {
      Class345 var3;
      if ((var3 = var1.getFormManagement().m(var0)) != null && var3.isVisible()) {
         var1.getFormManagement().n(var0);
      } else if (var0 == (55 & 94)) {
         ((Class49)var1.getFormManagement().e(95 & 54)).iv(var1.mapScene.d);
      } else if (var0 == (60 & 115)) {
         cx(var1);
      } else if (var0 == (127 & 87)) {
         Class657 var8 = (Class657)var1.getFormManagement().e(var0);
         var8.y(5 >> 2);
         var1.getFormManagement().a(var0);
      } else if (var0 == (127 & 103)) {
         ((Class420)var1.getFormManagement().e(var0)).y(2 ^ 3);
      } else if (var0 == (117 & 127)) {
         Class622 var6;
         if (!var1.getClient().n(1 ^ 3, --3) && !var1.getClient().n(5 >> 1, 42 & 93) && !var1.getClient().n(5 >> 1, 62 & 77)) {
            if (var1.getClient().gameType != 5 >> 2 && var1.getClient().gameType != (1 ^ 3)) {
               String var7 = Agreement.getSendTextAES("exchange", "X01");
               var1.getClient().d(var7);
            } else {
               var6 = (Class622)var1.getFormManagement().e(var0);
               var6.y(5 >> 1);
               var1.getFormManagement().a(var0);
            }
         } else {
            var6 = (Class622)var1.getFormManagement().e(var0);
            var6.y(--3);
            var1.getFormManagement().a(var0);
         }
      } else if (var0 == (32461 & 443)) {
         ((Class551)var1.getFormManagement().e(var0)).as(-4 >> 2);
      } else {
         if (var0 == (31719 & 1215)) {
            Class316 var4 = (Class316)var1.getFormManagement().e(var0);
            if (var2 == null) {
               var4.y(2 & 5);
               return;
            }

            if (var2 instanceof Integer) {
               var4.y((Integer)var2);
               return;
            }

            if (var2 instanceof Activity) {
               var4.jf((Activity)var2);
               return;
            }
         } else if (var0 == (4072 & 28863)) {
            Class694 var5 = (Class694)var1.getFormManagement().e(var0);
            if (var2 instanceof Activity) {
               var5.jf((Activity)var2);
               return;
            }
         } else {
            var1.getFormManagement().a(var0);
         }

      }
   }
}
