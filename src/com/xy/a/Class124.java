package com.xy.a;

import java.awt.Color;
import java.awt.Graphics;

class Class124 {
   private int a;
   private int b;
   private int c;
   private String d;
   private int e;
   private int f;
   private int g;
   // $VF: synthetic field
   final Class121 h;
   private int i;

   // $VF: synthetic method
   static int a(Class124 var0) {
      return var0.f;
   }

   public Class124(Class121 var1, int var2, int var3, int var4, String var5) {
      this.h = var1;
      this.i = var3;
      this.f = var4;
      this.d = var5 != null ? var5 : "";
   }

   // $VF: synthetic method
   static void b(Class124 var0, int var1) {
      var0.e = var1;
   }

   // $VF: synthetic method
   static void c(Class124 var0, int var1) {
      var0.i = var1;
   }

   // $VF: synthetic method
   static int d(Class124 var0) {
      return var0.g;
   }

   public void e(Graphics var1) {
      var1.setFont(com.xy.q.Class49.bz);
      var1.setColor(this.e == 1 ? Color.cyan : Color.green);
      if (this.c == 0) {
         this.c = var1.getFontMetrics().stringWidth(this.d);
         this.a = this.i - this.c / 2 + 5;
         this.b = this.f + 8;
      }

      var1.drawString(this.d, this.a, this.b);
   }

   // $VF: synthetic method
   static int f(Class124 var0) {
      return var0.i;
   }

   // $VF: synthetic method
   static void g(Class124 var0, int var1) {
      var0.f = var1;
   }
}
