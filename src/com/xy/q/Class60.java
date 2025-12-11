package com.xy.q;

public class Class60 {
   private Object a;
   private String b;

   public Object a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public static String c(String var0) {
      int var10000 = (2 ^ 5) << 4 ^ 2 ^ 5;
      int var10001 = (3 ^ 5) << 3 ^ 2;
      int var10002 = 4 << 4 ^ 3;
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

   public void d(Object var1) {
      this.a = var1;
   }

   public void e(String var1) {
      this.b = var1;
   }

   public Class60(String var1, Object var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public String toString() {
      return this.b;
   }
}
