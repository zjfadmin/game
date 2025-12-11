package com.xy.v;

public class Class32 {
   public int a;
   public int b;
   public int c;
   public int d;

   public int a() {
      return this.a + this.c;
   }

   public int b() {
      return this.c;
   }

   public Class32(int var1, int var2, int var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public int c() {
      return this.b;
   }

   public void d(int var1, int var2, int var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void e(int var1) {
      this.d = var1;
   }

   public int f() {
      return this.d;
   }

   public void g(int var1) {
      this.b = var1;
   }

   public int h() {
      return this.a;
   }

   public int i() {
      return this.d + this.b;
   }

   public void j(int var1) {
      this.a = var1;
   }

   public void k(int var1) {
      this.c = var1;
   }
}
