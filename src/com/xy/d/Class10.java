package com.xy.d;

import java.util.ArrayList;

public class Class10 {
   public static int a(ArrayList<Class4> var0, int var1, int var2) {
      Class4 var3 = var0.get(var2);
      int var4 = var1;

      int var5;
      for (int var10000 = var5 = var1; var10000 < var2; var10000 = ++var5) {
         if (e(var3, var0.get(var5)) != -1) {
            Class4 var6 = var0.get(var5);
            var0.set(var5, var0.get(var4));
            var0.set(var4++, var6);
         }
      }

      var0.set(var2, var0.get(var4));
      var0.set(var4, var3);
      return var4;
   }

   public static int b(ArrayList<Class11> var0, int var1, int var2) {
      Class11 var3 = var0.get(var2);
      int var4 = var1;

      int var5;
      for (int var10000 = var5 = var1; var10000 < var2; var10000 = ++var5) {
         if (d(var3, var0.get(var5)) != -1) {
            Class11 var6 = var0.get(var5);
            var0.set(var5, var0.get(var4));
            var0.set(var4++, var6);
         }
      }

      var0.set(var2, var0.get(var4));
      var0.set(var4, var3);
      return var4;
   }

   public static void c(ArrayList<Class4> var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = a(var0, var1, var2);
         c(var0, var1, var3 - 1);
         c(var0, var3 + 1, var2);
      }
   }

   public static int d(Class11 var0, Class11 var1) {
      if (var1.y == var0.y) {
         return var0.c(var1);
      } else {
         return var0.y > var1.y ? 1 : -1;
      }
   }

   public static int e(Class4 var0, Class4 var1) {
      if (var1.v == var0.v) {
         if (var0 instanceof Class8) {
            return var1 instanceof Class8 ? var0.c(var1) : -1;
         } else {
            return var1 instanceof Class8 ? 1 : var0.c(var1);
         }
      } else {
         return var0.v > var1.v ? 1 : -1;
      }
   }

   public static String f(String var0) {
      int var10000 = 4 << 4 ^ 4 << 1;
      int var10001 = 4 << 3;
      int var10002 = (3 ^ 5) << 4 ^ 2 ^ 5;
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

   public static void g(ArrayList<Class11> var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = b(var0, var1, var2);
         g(var0, var1, var3 - 1);
         g(var0, var3 + 1, var2);
      }
   }
}
