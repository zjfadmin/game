package com.xy.d;

import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Point;

public class Class7 {
   private int a;
   private com.xy.w.Class0 b;
   private Class5 c;
   private Class5 d;
   private Class5 e;

   public void a(Graphics var1, GameView var2) {
      Class5 var3;
      Class5 var10000 = var3 = this.c;

      while (var10000 != null) {
         Point var4;
         if ((var4 = var2.mapCamera.k(Class5.i(var3), Class5.h(var3))) == null) {
            var10000 = var3;
         } else {
            this.b.c(var1, var4.x, var4.y, Class5.f(var3), Class5.c(var3), Class5.e(var3));
            var10000 = var3;
         }

         var10000 = var3 = var10000.h;
      }
   }

   public void b() {
      Class5 var1;
      Class5 var10000 = var1 = this.c;

      while (var10000 != null) {
         if (!var1.a()) {
            var10000 = var1;
         } else {
            if (var1 == this.c) {
               this.c = var1.h;
            }

            if (var1 == this.d) {
               this.d = null;
            }

            this.d(var1);
            var10000 = var1;
         }

         var10000 = var1 = var10000.h;
      }
   }

   public void c(Class4 var1, boolean var2) {
      this.b();
      if (var2 && ++this.a % 25 == 0) {
         this.a = 0;
         Class5 var3 = this.f();
         var3.h = null;
         Class5.b(var3, var1.ae);
         Class5.g(var3, var1.v);
         Class5.k(var3, var1.ak);
         Class5.j(var3, var1.z);
         Class5.d(var3, -1);
         var3.a();
         if (this.d != null) {
            this.d.h = var3;
         }

         this.d = var3;
         if (this.c == null) {
            this.c = var3;
         }
      }
   }

   public void d(Class5 var1) {
      this.e = var1;
   }

   public static String e(String var0) {
      int var10000 = 4 << 3 ^ 2;
      int var10001 = (3 ^ 5) << 4 ^ 3;
      int var10002 = (3 ^ 5) << 4 ^ 3 << 2 ^ 3;
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

   public Class7(Class4 var1) {
      this.b = var1.ac.b();
      this.b.t(1);
   }

   public Class5 f() {
      if (this.e == null) {
         return new Class5(this);
      } else {
         Class5 var1 = this.e;
         this.e = null;
         return var1;
      }
   }
}
