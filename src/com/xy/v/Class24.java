package com.xy.v;

public class Class24 {
   public long a;
   public long b;

   public long a() {
      return this.a;
   }

   public long b() {
      return this.b;
   }

   public Class24(long var1, long var3) {
      this.b = var1;
      this.a = var3;
   }

   public static String c(String var0) {
      int var10000 = 4 << 4 ^ 2 << 2 ^ 3;
      int var10001 = 5 << 4 ^ 5;
      int var10002 = 5 << 3 ^ 3;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var10 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var10;

      for (int var2 = var10000; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var11 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var11 ^ var2);
         if (var3 < 0) {
            break;
         }

         var11 = var3--;
         var1[var11] = (char)(var5.charAt(var11) ^ var4);
      }

      return new String(var1);
   }

   public Class24() {
   }

   public void d(long var1) {
      this.b = var1;
   }

   public void e(long var1) {
      this.a = var1;
   }
}
