package com.xy.a;

import com.xy.readbean.GoodFight;
import java.awt.Graphics;
import java.math.BigDecimal;

class Class31 {
   private GoodFight a;
   private int b;
   private BigDecimal c;
   // $VF: synthetic field
   final Class121 d;
   private int e;

   public Class31(Class121 var1, BigDecimal var2, GoodFight var3) {
      this.d = var1;
      this.c = var2;
      this.a = var3;
      this.b = (int)(var3.getX() / Class121.akp(var1) - 2.5);
      this.e = (int)(var3.getY() / Class121.akh(var1) - 2.5);
      this.b = this.b + Class121.ajy(var1)[2].getX();
      this.e = this.e + Class121.ajy(var1)[2].getY();
   }

   // $VF: synthetic method
   static int a(Class31 var0) {
      return var0.e;
   }

   // $VF: synthetic method
   static int b(Class31 var0) {
      return var0.b;
   }

   // $VF: synthetic method
   static GoodFight c(Class31 var0) {
      return var0.a;
   }

   public void d(Graphics var1) {
      if (Class121.vv() == null) {
         String var10000 = "N+O*\\";
         Class121.vy(com.xy.w.Class11.f(com.xy.w.Class15.p("fight"), null));
      }

      if (Class121.vv() != null) {
         Class121.vv().j(com.xy.v.Class22.l(), 0);
         Class121.vv().ab(var1, this.b, this.e);
      }
   }

   // $VF: synthetic method
   static BigDecimal e(Class31 var0) {
      return var0.c;
   }
}
