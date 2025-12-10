package com.xy;

import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Point;

public class Class446 {
   private String a;
   private Class116[] b;
   private int c;

   public void a(int var1, int var2, int var3) {
      int var10002 = this.c;
      this.c = var10002 - --1;
      if (var10002 < 0) {
         int var4;
         for(int var10000 = var4 = 0; var10000 < this.b.length; var10000 = var4) {
            if (this.b[var4].g() == -4 >> 2) {
               this.c = 126 & 31;
               this.b[var4].b(2 & 5, var3, var1, var2);
               return;
            }

            ++var4;
         }

      }
   }

   public Class446(String var1) {
      int var10001 = --5;
      super();
      this.a = var1;
      Class116[] var4 = new Class116[var10001];
      boolean var10003 = true;
      this.b = var4;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.b.length; var10000 = var2) {
         Class116[] var3 = this.b;
         var10001 = var2;
         Class116 var10002 = new Class116(-4 >> 2, 3 ^ 3, 3 ^ 3, 3 ^ 3);
         ++var2;
         var3[var10001] = var10002;
      }

      this.c = 31 & 126;
   }

   public void b(Graphics var1, GameView var2) {
      Class8 var4 = null;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < this.b.length; var10000 = var3) {
         if (this.b[var3].g() != -4 >> 2) {
            if (var4 == null) {
               var4 = Class330.q(Class222.m(this.a));
            }

            if (var4 != null) {
               if (this.b[var3].g() <= var4.k()) {
                  Point var5;
                  if ((var5 = var2.mapCamera.i(this.b[var3].h(), this.b[var3].i())) != null) {
                     var4.d((long)this.b[var3].g(), this.b[var3].d());
                     var4.aa(var1, var5.x, var5.y);
                  }
               } else {
                  this.b[var3].f(-4 >> 2);
               }
            }
         }

         ++var3;
      }

   }

   public void c(String var1) {
      this.a = var1;
   }

   public void d(long var1) {
      var1 = (long)((double)var1 * 1.5D);

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.b.length; var10000 = var3) {
         if (this.b[var3].g() != -4 >> 2) {
            this.b[var3].f((int)((long)this.b[var3].g() + var1));
         }

         ++var3;
      }

   }
}
