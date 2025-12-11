package com.xy.d;

class Class5 {
   private int a;
   private float b;
   private int c;
   private int d;
   // $VF: synthetic field
   final Class7 e;
   private int f;
   private long g;
   public Class5 h;

   public boolean a() {
      this.c++;
      Class5 var10000;
      if (this.c <= 15) {
         var10000 = this;
         this.b = 0.8F;
      } else if (this.c <= 30) {
         var10000 = this;
         this.b = 0.6F;
      } else if (this.c <= 45) {
         var10000 = this;
         this.b = 0.4F;
      } else {
         var10000 = this;
         this.b = 0.3F;
      }

      return var10000.c >= 60;
   }

   // $VF: synthetic method
   static void b(Class5 var0, int var1) {
      var0.f = var1;
   }

   // $VF: synthetic method
   static long c(Class5 var0) {
      return var0.g;
   }

   // $VF: synthetic method
   static void d(Class5 var0, int var1) {
      var0.c = var1;
   }

   // $VF: synthetic method
   static float e(Class5 var0) {
      return var0.b;
   }

   // $VF: synthetic method
   static int f(Class5 var0) {
      return var0.a;
   }

   // $VF: synthetic method
   static void g(Class5 var0, int var1) {
      var0.d = var1;
   }

   // $VF: synthetic method
   static int h(Class5 var0) {
      return var0.d;
   }

   // $VF: synthetic method
   static int i(Class5 var0) {
      return var0.f;
   }

   Class5(Class7 var1) {
      this.e = var1;
   }

   // $VF: synthetic method
   static void j(Class5 var0, long var1) {
      var0.g = var1;
   }

   // $VF: synthetic method
   static void k(Class5 var0, int var1) {
      var0.a = var1;
   }
}
