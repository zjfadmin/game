package com.xy.n;

class Class5 {
   private int a;
   private Class4 b;
   private int c;
   private int d;
   private transient Class5 e;
   private int f;
   private int g;

   // $VF: synthetic method
   static Class5 a(Class5 var0) {
      return var0.e;
   }

   // $VF: synthetic method
   static Class4 b(Class5 var0) {
      return var0.b;
   }

   // $VF: synthetic method
   static int c(Class5 var0) {
      return var0.c;
   }

   // $VF: synthetic method
   static int d(Class5 var0) {
      return var0.d;
   }

   public Class5(int var1, int var2, int var3, int var4) {
      this.d = var1;
      this.g = var2;
      this.f = var3;
      this.a = var4;
   }

   // $VF: synthetic method
   static int e(Class5 var0) {
      return var0.f;
   }

   public boolean f(int var1) {
      if (this.b == null) {
         return false;
      } else if (this.b.f == var1) {
         return true;
      } else {
         return this.e != null ? this.e.f(var1) : false;
      }
   }

   public Class5(Class4 var1, Class5 var2) {
      this.b = var1;
      this.d = var1.i();
      this.g = var1.v();
      this.f = var1.d();
      this.a = var1.t();
      this.e = var2;
      if (var1.q() == 2) {
         this.c = var2.c;
      } else {
         this.c = var2.c + Class3.d(var2.g, var2.f, var1.j, var1.c) + 10000;
      }
   }

   // $VF: synthetic method
   static int g(Class5 var0) {
      return var0.a;
   }

   public Class5 h() {
      return this.b != null ? new Class5(this.b.f, this.b.j, this.b.c, this.b.e) : this;
   }

   // $VF: synthetic method
   static int i(Class5 var0) {
      return var0.g;
   }

   public boolean j(int var1) {
      if (this.b != null && var1 != 0) {
         if (this.b.r() == var1) {
            return true;
         } else {
            return this.e != null ? this.e.j(var1) : false;
         }
      } else {
         return false;
      }
   }

   public Class5(int var1, int var2, int var3, int var4, Class5 var5) {
      this.d = var1;
      this.g = var2;
      this.f = var3;
      this.a = var4;
      this.e = var5;
      this.c = var5.c + Class3.d(var5.g, var5.f, var2, var3);
   }

   public int k() {
      return this.b != null ? this.b.f : this.d;
   }

   // $VF: synthetic method
   static void l(Class5 var0, Class5 var1) {
      var0.e = var1;
   }

   // $VF: synthetic method
   static void m(Class5 var0, int var1) {
      var0.c = var1;
   }
}
