package com.xy;

import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;

public class Class205 {
   private StringBuffer a = new StringBuffer();
   public static final int b = 25;
   private int c;
   private int d;
   private static Class8 e;
   static String f = "[";
   private int g;
   public static final int h = 70;
   private Point i = new Point(3 ^ 3, 3 ^ 3);
   private int j;
   private int k;
   static String l = "]";
   private int m;
   static String n = ",";
   public GameView o;
   private int p;
   private int q;
   public Class471 r;
   private int s;
   public ScreenData t;
   private int u;
   private int v;
   private int w;

   public ScreenData a() {
      return this.t;
   }

   public void b(int var1, int var2) {
      this.u = this.v = var1;
      this.q = var2;
      this.j = var2;
      var1 = this.t.Screen_x / (1 ^ 3);
      if (this.v > this.r.r.b - var1) {
         this.v = this.r.r.b - var1;
      }

      if (this.v < var1) {
         this.v = var1;
      }

      var1 = this.t.Screen_y / (5 >> 1);
      if (this.q > this.r.r.j - var1) {
         this.q = this.r.r.j - var1;
      }

      if (this.q < var1) {
         this.q = var1;
      }

   }

   public Point c(int var1, int var2, int var3, int var4) {
      var3 /= 5 >> 1;
      var4 /= 5 >> 1;
      if (Math.abs(var1 + var3 - this.v) < this.t.Screen_x / (5 >> 1) + var3 && Math.abs(var2 + var4 - this.q) < this.t.Screen_y / (5 >> 1) + var4) {
         this.i.x = var1 - this.v + this.t.Screen_x / (5 >> 1);
         this.i.y = var2 - this.q + this.t.Screen_y / (5 >> 1);
         return this.i;
      } else {
         return null;
      }
   }

   public void d(Graphics var1, int var2, int var3) {
      if (this.r.r != null) {
         this.m = -var2 % Class409.f;
         this.c = -var3 % Class409.q;
         var1.translate(this.m, this.c);
         var2 /= Class409.f;
         var3 /= Class409.q;

         int var4;
         for(int var10000 = var4 = 3 & 4; var10000 < this.g; var10000 = var4) {
            this.d = var4 * Class409.f;
            this.s = var4 + var2;

            int var5;
            for(var10000 = var5 = 5 >> 3; var10000 < this.w; var10000 = var5) {
               Image var6;
               if ((var6 = this.r.ae(this.s, var5 + var3)) != null) {
                  var1.drawImage(var6, this.d, var5 * Class409.q, (ImageObserver)null);
               } else {
                  this.t(var1, this.d, var5 * Class409.q);
               }

               ++var5;
            }

            ++var4;
         }

         var1.translate(-this.m, -this.c);
      }
   }

   public void e(Graphics var1) {
      this.d(var1, this.v - this.t.Screen_x / --2, this.q - this.t.Screen_y / --2);
   }

   public void f(int var1) {
      if (var1 != this.u || var1 != this.v) {
         if (var1 != this.u) {
            this.k(var1);
         }

      }
   }

   public void g(int var1) {
      if (var1 != this.j || var1 != this.q) {
         int var10001 = this.q;
         int var10002;
         int var10003;
         if (var1 - this.q > 0) {
            var10002 = 4 ^ 5;
            var10003 = var1;
         } else {
            var10002 = -1;
            var10003 = var1;
         }

         this.q = var10001 + var10002 * (Math.abs(var10003 - this.q) > (1 ^ 3) ? 1 ^ 3 : 1);
         int var2 = this.t.Screen_y / (5 >> 1);
         if (this.q > this.r.r.j - var2) {
            this.q = this.r.r.j - var2;
         }

         if (this.q < var2) {
            this.q = var2;
         }

         this.j = var1;
      }
   }

   public int h() {
      return this.q - this.t.Screen_y / (5 >> 1);
   }

   public Point i(int var1, int var2) {
      if (Math.abs(var1 - this.v) < this.t.Screen_x / --2 && Math.abs(var2 - this.q) < this.t.Screen_y / --2) {
         this.i.x = var1 - this.v + this.t.Screen_x / --2;
         this.i.y = var2 - this.q + this.t.Screen_y / (5 >> 1);
         return this.i;
      } else {
         return null;
      }
   }

   public int j() {
      return this.v - this.t.Screen_x / (1 ^ 3);
   }

   public void k(int var1) {
      int var2 = this.t.Screen_x / --2;
      if (Math.abs(this.v - var1) > (95 & 102)) {
         this.v = var1 + (var1 - this.v < 0 ? 102 & 95 : -70);
      }

      if (this.v > this.r.r.b - var2) {
         this.v = this.r.r.b - var2;
      }

      if (this.v < var2) {
         this.v = var2;
      }

   }

   public Class471 l() {
      return this.r;
   }

   public void m() {
      this.g = this.t.getScreen_x() / Class409.f + --2;
      this.w = this.t.getScreen_y() / Class409.q + --2;
      this.k = Class409.f * this.g;
      this.p = Class409.q * this.w;
   }

   public void n(int var1) {
      if (var1 != this.j || var1 != this.q) {
         if (var1 != this.j) {
            this.p(var1);
         }

      }
   }

   public void o(int var1) {
      if (var1 != this.u || var1 != this.v) {
         int var10001 = this.v;
         int var10002;
         int var10003;
         if (var1 - this.v > 0) {
            var10002 = --1;
            var10003 = var1;
         } else {
            var10002 = -1;
            var10003 = var1;
         }

         this.v = var10001 + var10002 * (Math.abs(var10003 - this.v) > 5 >> 1 ? 5 >> 1 : 1);
         int var2 = this.t.Screen_x / --2;
         if (this.v > this.r.r.b - var2) {
            this.v = this.r.r.b - var2;
         }

         if (this.v < var2) {
            this.v = var2;
         }

         this.u = var1;
      }
   }

   public Class205(GameView var1) {
      this.o = var1;
      this.t = var1.screenData;
      this.m();
   }

   public void p(int var1) {
      int var2 = this.t.Screen_y / (1 ^ 3);
      if (Math.abs(this.q - var1) > (59 & 93)) {
         this.q = var1 + (var1 - this.q < 0 ? 127 & 25 : -25);
      }

      if (this.q > this.r.r.j - var2) {
         this.q = this.r.r.j - var2;
      }

      if (this.q < var2) {
         this.q = var2;
      }

   }

   public void q(ScreenData var1) {
      this.t = var1;
   }

   public void r(int var1, int var2) {
      if (this.r.r != null) {
         if (this.u == var1 && this.j == var2) {
            this.o(var1);
            this.g(var2);
         } else {
            this.a.setLength(3 >> 2);
            this.a.append(f);
            this.a.append(var1 / (87 & 60));
            this.a.append(n);
            this.a.append(var2 / (84 & 63));
            this.a.append(l);
            this.o.getBaseView().lb(this.a.toString());
            this.f(var1);
            this.n(var2);
            this.u = var1;
            this.j = var2;
         }
      }
   }

   public void s(Class471 var1) {
      this.r = var1;
   }

   public void t(Graphics var1, int var2, int var3) {
      var1.setColor(Color.black);
      var1.fillRect(var2, var3, Class409.f, Class409.q);
   }
}
