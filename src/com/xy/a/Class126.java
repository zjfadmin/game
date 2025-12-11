package com.xy.a;

import java.awt.Color;
import java.awt.Graphics;

class Class126 {
   private int a;
   private int b;
   private int c;
   // $VF: synthetic field
   final Class121 d;
   private int e;
   private String f;
   private int g;

   // $VF: synthetic method
   static int a(Class126 var0) {
      return var0.e;
   }

   // $VF: synthetic method
   static void b(Class126 var0, int var1) {
      var0.g = var1;
   }

   public void c(Graphics var1) {
      var1.setFont(com.xy.q.Class49.bz);
      var1.setColor(Color.green);
      if (this.c == 0) {
         this.c = var1.getFontMetrics().stringWidth(this.f);
         this.a = this.g + 12;
         this.b = this.e + 8;
      }

      var1.drawString(this.f, this.a, this.b);
      if (com.xy.v.Class22.l() / 100L % 2L == 0L) {
         if (Class121.aki(this.d) == null) {
            String var2 = "\u000fESCS\u0017M\u0017RV\u0012A";
            Class121.akl(this.d, com.xy.w.Class16.c("sc/e/111.png"));
         }

         var1.drawImage(Class121.aki(this.d), this.g, this.e, null);
      } else {
         if (Class121.akj(this.d) == null) {
            String var10001 = "\u001aQFWF\u0003X\u0000GB\u0007U";
            Class121.ajz(this.d, com.xy.w.Class16.c("sc/e/112.png"));
         }

         var1.drawImage(Class121.akj(this.d), this.g, this.e, null);
      }
   }

   public Class126(Class121 var1, int var2, int var3, String var4) {
      this.d = var1;
      this.g = var2;
      this.e = var3;
      this.f = var4 != null ? var4 : "";
   }

   // $VF: synthetic method
   static int d(Class126 var0) {
      return var0.g;
   }

   // $VF: synthetic method
   static void e(Class126 var0, int var1) {
      var0.e = var1;
   }
}
