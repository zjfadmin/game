package com.xy.d;

import com.xy.text.GameView;
import com.xy.v.Class32;
import com.xy.w.Class15;
import java.awt.Graphics;
import java.awt.Point;

public class Class2 {
   private Class32[] a;
   private int b;
   private String c;

   public static String a(String var0) {
      int var10000 = (2 ^ 5) << 3 ^ 3 ^ 5;
      int var10001 = 5 << 4 ^ 3;
      int var10002 = 3 << 3 ^ 5;
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

   public void b(long var1) {
      var1 = (long)(var1 * 1.5);

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.a.length; var10000 = ++var3) {
         if (this.a[var3].f() != -1) {
            this.a[var3].e((int)(this.a[var3].f() + var1));
         }
      }
   }

   public void c(int var1, int var2, int var3) {
      if (this.b-- < 0) {
         int var4;
         for (int var5 = var4 = 0; var5 < this.a.length; var5 = ++var4) {
            if (this.a[var4].f() == -1) {
               this.b = 30;
               this.a[var4].d(0, var3, var1, var2);
               return;
            }
         }
      }
   }

   public void d(Graphics var1, GameView var2) {
      com.xy.w.Class1 var3 = null;

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.a.length; var10000 = ++var4) {
         if (this.a[var4].f() != -1) {
            if (var3 == null) {
               var3 = com.xy.w.Class11.x(Class15.p(this.c));
            }

            if (var3 != null) {
               if (this.a[var4].f() <= var3.a()) {
                  Point var5;
                  if ((var5 = var2.mapCamera.k(this.a[var4].c(), this.a[var4].b())) != null) {
                     var3.j(this.a[var4].f(), this.a[var4].h());
                     var3.ab(var1, var5.x, var5.y);
                  }
               } else {
                  this.a[var4].e(-1);
               }
            }
         }
      }
   }

   public Class2(String var1) {
      this.c = var1;
      this.a = new Class32[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.a.length; var10000 = var2) {
         Class32[] var3 = this.a;
         int var10001 = var2;
         Class32 var10002 = new Class32(-1, 0, 0, 0);
         var2++;
         var3[var10001] = var10002;
      }

      this.b = 30;
   }

   public void e(String var1) {
      this.c = var1;
   }
}
