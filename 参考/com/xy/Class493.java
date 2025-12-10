package com.xy;

import java.util.ArrayList;

public class Class493 {
   public static void a(ArrayList<Class514> var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = d(var0, var1, var2);
         a(var0, var1, var3 - (4 ^ 5));
         a(var0, var3 + (2 ^ 3), var2);
      }

   }

   public static int b(ArrayList<Class292> var0, int var1, int var2) {
      Class292 var4 = (Class292)var0.get(var2);
      int var3 = var1;

      for(int var10000 = var1 = var1; var10000 < var2; var10000 = var1) {
         if (e(var4, (Class292)var0.get(var1)) != -4 >> 2) {
            Class292 var5 = (Class292)var0.get(var1);
            var0.set(var1, (Class292)var0.get(var3));
            var0.set(var3++, var5);
         }

         ++var1;
      }

      var0.set(var2, (Class292)var0.get(var3));
      var0.set(var3, var4);
      return var3;
   }

   public static int c(Class514 var0, Class514 var1) {
      if (var1.ak == var0.ak) {
         return var0.l(var1);
      } else {
         return var0.ak > var1.ak ? 2 ^ 3 : -1;
      }
   }

   public static int d(ArrayList<Class514> var0, int var1, int var2) {
      Class514 var4 = (Class514)var0.get(var2);
      int var3 = var1;

      for(int var10000 = var1 = var1; var10000 < var2; var10000 = var1) {
         if (c(var4, (Class514)var0.get(var1)) != -4 >> 2) {
            Class514 var5 = (Class514)var0.get(var1);
            var0.set(var1, (Class514)var0.get(var3));
            var0.set(var3++, var5);
         }

         ++var1;
      }

      var0.set(var2, (Class514)var0.get(var3));
      var0.set(var3, var4);
      return var3;
   }

   public static int e(Class292 var0, Class292 var1) {
      if (var1.al == var0.al) {
         if (var0 instanceof Class183) {
            return var1 instanceof Class183 ? var0.l(var1) : -1;
         } else {
            return var1 instanceof Class183 ? 2 ^ 3 : var0.l(var1);
         }
      } else {
         return var0.al > var1.al ? 4 ^ 5 : -1;
      }
   }

   public static void f(ArrayList<Class292> var0, int var1, int var2) {
      if (var1 < var2) {
         int var3 = b(var0, var1, var2);
         f(var0, var1, var3 - --1);
         f(var0, var3 + (2 ^ 3), var2);
      }

   }
}
