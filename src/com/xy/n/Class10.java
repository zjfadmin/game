package com.xy.n;

public class Class10 {
   private int a;
   private int b;
   private int c;

   public int a() {
      return this.a;
   }

   public Class10() {
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int c() {
      return this.c;
   }

   public void d(int var1) {
      this.a = var1;
   }

   public static String e(String var0) {
      int var10000 = (2 ^ 5) << 4 ^ 3;
      int var10001 = (3 ^ 5) << 3 ^ 1;
      int var10002 = (3 ^ 5) << 4 ^ 3 << 2 ^ 1;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var9 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var9;

      for (int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var10 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var10 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10 = var3--;
         var1[var10] = (char)(var5.charAt(var10) ^ var4);
      }

      return new String(var1);
   }

   public int f() {
      return this.b;
   }

   public Class10(int var1, int var2, int var3) {
      this.c = var1;
      this.b = var2;
      this.a = var3;
   }

   public void g(int var1) {
      this.b = var1;
   }
}
