package com.xy.n;

class Class7 {
   public int a;
   public int b;
   public Class7 c;
   public int d;
   public int e;
   public boolean f;
   public int g;

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + this.g;
      return 31 * var2 + this.b;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof Class7)) {
         return false;
      } else {
         Class7 var2 = (Class7)var1;
         return this.g == var2.g && this.b == var2.b;
      }
   }

   public Class7() {
   }

   public Class7(int var1, int var2, boolean var3, int var4) {
      this(var1, var2, var3, var4, null);
   }

   public Class7(int var1, int var2, boolean var3, int var4, Class7 var5) {
      this.a = var4;
      this.g = var1;
      this.b = var2;
      this.f = var3;
      this.c = var5;
      this.d = this.b();
      this.e = this.d + var4;
   }

   public void a(Class7 var1) {
      this.c = var1;
      this.d = this.b();
      this.e = this.d + this.a;
   }

   public Class7(int var1, int var2, boolean var3) {
      this.g = var1;
      this.b = var2;
      this.f = var3;
   }

   // $VF: synthetic method
   private int b() {
      if (this.c == null) {
         return 0;
      } else if (this.c.g != this.g && this.c.b != this.b) {
         return 14 + this.c.d;
      } else {
         return this.c.g == this.g && this.c.b == this.b ? 0 + this.c.d : 10 + this.c.d;
      }
   }
}
