package com.xy;

public class Class424 {
   public static String iIiiIiiiiiiI(String var0) {
      String var10000 = new String;
      char[] var10002 = new char[var0.length()];
      boolean var10004 = true;
      int var8 = 1 << 3 ^ 2;
      int var3;
      int var6 = var3 = var10002.length - 1;
      char[] var1 = var10002;

      for(int var2 = var8; var6 >= 0; var6 = var3) {
         char var4 = (char)(var0.charAt(var3) ^ var2);
         char var5 = (char)((char)(var3 ^ var2) & 63);
         var1[var3] = var4;
         --var3;
         if (var3 < 0) {
            break;
         }

         var4 = (char)(var0.charAt(var3) ^ var5);
         var2 = (char)((char)(var3 ^ var5) & 63);
         var1[var3] = var4;
         --var3;
      }

      var10000.<init>(var1);
      return var10000;
   }

   public static String ALLATORIxDEMO(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10004 = var10003.getClassName() + var10003.getMethodName();
      int var3;
      int var8 = var3 = var10004.length() - 1;
      String var2 = var10004;
      int var4 = var8;
      int var10001 = var0.length();
      char[] var5 = new char[var10001];
      int var6 = 1 << 3 ^ 2;

      for(int var7 = var10001 - 1; var7 >= 0; --var7) {
         char var10005 = var2.charAt(var4);
         var5[var7] = (char)(var10005 ^ var0.charAt(var7) ^ var6);
         var6 = (char)(63 & (var6 ^ var7 ^ var10005));
         --var4;
         if (var4 < 0) {
            var4 = var3;
         }
      }

      return new String(var5);
   }
}
