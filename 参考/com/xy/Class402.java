package com.xy;

import java.awt.Image;
import java.util.Vector;

public class Class402 {
   private int a;
   private int b;
   private int c;
   private Vector<Class233> d;

   public Class233 a(long var1) {
      if (var1 < 0L) {
         return (Class233)this.d.get(5 >> 3);
      } else {
         var1 /= 120L;
         return (Class233)this.d.get((int)(var1 % (long)this.d.size()));
      }
   }

   public int b() {
      if (this.c == -4 >> 2) {
         this.c = ((Class233)this.d.get(3 ^ 3)).e();
      }

      return this.c;
   }

   public int c() {
      if (this.a == -4 >> 2) {
         this.a = ((Class233)this.d.get(5 >> 3)).e();
      }

      return this.a;
   }

   public Class402(String var1, int var2, int var3) {
      int var10000 = 3 >> 2;
      int var10003 = -4 >> 2;
      int var10005 = -4 >> 2;
      super();
      this.c = var10005;
      this.a = var10003;
      this.d = new Vector(2 ^ 3);
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 5 >> 3; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("|", var2 + --1)) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.b = Class394.b(var1, var2, var5);
         } else if (var4 == --1) {
            var10000 = var5;
            this.c = Class394.b(var1, var2, var5);
         } else if (var4 == 5 >> 1) {
            var10000 = var5;
            this.a = Class394.b(var1, var2, var5);
         } else {
            this.d.add(new Class233(Class511.a(var1.substring(var2, var5) + ".png"), 3 ^ 3, 3 ^ 3));
            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public Class402(int var1, int var2, Vector<Class233> var3) {
      int var10007 = -4 >> 2;
      int var10009 = -4 >> 2;
      super();
      this.c = var10009;
      this.a = var10007;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public Class402(Image var1) {
      int var10002 = -4 >> 2;
      int var10004 = -4 >> 2;
      super();
      this.c = var10004;
      this.a = var10002;
      this.d = new Vector(--1);
      this.d.add(new Class233(var1, 3 >> 2, 3 >> 2));
   }

   public int d() {
      return this.b;
   }
}
