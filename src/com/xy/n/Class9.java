package com.xy.n;

import com.xy.text.GameView;
import com.xy.text.ScreenData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Class9 {
   private int a;
   private StringBuffer b;
   private int c;
   private int d;
   private int e;
   private int f;
   public static final int g = 70;
   private int h;
   private int i;
   public static final int j = 25;
   private Point k = new Point(0, 0);
   private static com.xy.w.Class1 l;
   private int m;
   private int n;
   static String o = "]";
   public GameView p;
   static String q = "[";
   public ScreenData r;
   public Class0 s;
   private int t;
   static String u = ",";
   private int v;
   private int w;

   public void a(Graphics var1) {
      this.f(var1, this.t - this.r.Screen_x / 2, this.d - this.r.Screen_y / 2);
   }

   public void b(Class0 var1) {
      this.s = var1;
   }

   public Class0 c() {
      return this.s;
   }

   public void d(int var1) {
      if (var1 != this.c || var1 != this.d) {
         byte var10002;
         int var10003;
         if (var1 - this.d > 0) {
            var10002 = 1;
            var10003 = var1;
         } else {
            var10002 = -1;
            var10003 = var1;
         }

         this.d = this.d + var10002 * (Math.abs(var10003 - this.d) > 2 ? 2 : 1);
         int var2 = this.r.Screen_y / 2;
         if (this.d > this.s.n.o - var2) {
            this.d = this.s.n.o - var2;
         }

         if (this.d < var2) {
            this.d = var2;
         }

         this.c = var1;
      }
   }

   public void e(int var1, int var2) {
      this.t = var1;
      this.w = var1;
      this.d = var2;
      this.c = var2;
      int var3 = this.r.Screen_x / 2;
      if (this.t > this.s.n.i - var3) {
         this.t = this.s.n.i - var3;
      }

      if (this.t < var3) {
         this.t = var3;
      }

      int var4 = this.r.Screen_y / 2;
      if (this.d > this.s.n.o - var4) {
         this.d = this.s.n.o - var4;
      }

      if (this.d < var4) {
         this.d = var4;
      }
   }

   public void f(Graphics var1, int var2, int var3) {
      if (this.s.n != null) {
         this.n = -var2 % Class2.j;
         this.a = -var3 % Class2.c;
         var1.translate(this.n, this.a);
         var2 /= Class2.j;
         var3 /= Class2.c;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.v; var10000 = ++var4) {
            this.h = var4 * Class2.j;
            this.e = var4 + var2;

            int var5;
            for (int var9 = var5 = 0; var9 < this.f; var9 = ++var5) {
               Image var6;
               if ((var6 = this.s.z(this.e, var5 + var3)) != null) {
                  var1.drawImage(var6, this.h, var5 * Class2.c, null);
               } else {
                  this.n(var1, this.h, var5 * Class2.c);
               }
            }
         }

         var1.translate(-this.n, -this.a);
      }
   }

   public void g(ScreenData var1) {
      this.r = var1;
   }

   public void h(int var1, int var2) {
      if (this.s.n != null) {
         if (this.w == var1 && this.c == var2) {
            this.p(var1);
            this.d(var2);
         } else {
            this.b.setLength(0);
            this.b.append(q);
            this.b.append(var1 / 20);
            this.b.append(u);
            this.b.append(var2 / 20);
            this.b.append(o);
            this.p.getBaseView().bk(this.b.toString());
            this.j(var1);
            this.o(var2);
            this.w = var1;
            this.c = var2;
         }
      }
   }

   public ScreenData i() {
      return this.r;
   }

   public void j(int var1) {
      if (var1 != this.w || var1 != this.t) {
         if (var1 != this.w) {
            this.s(var1);
         }
      }
   }

   public Point k(int var1, int var2) {
      if (Math.abs(var1 - this.t) < this.r.Screen_x / 2 && Math.abs(var2 - this.d) < this.r.Screen_y / 2) {
         this.k.x = var1 - this.t + this.r.Screen_x / 2;
         this.k.y = var2 - this.d + this.r.Screen_y / 2;
         return this.k;
      } else {
         return null;
      }
   }

   public void l(int var1) {
      int var2 = this.r.Screen_y / 2;
      if (Math.abs(this.d - var1) > 25) {
         this.d = var1 + (var1 - this.d < 0 ? 25 : -25);
      }

      if (this.d > this.s.n.o - var2) {
         this.d = this.s.n.o - var2;
      }

      if (this.d < var2) {
         this.d = var2;
      }
   }

   public int m() {
      return this.d - this.r.Screen_y / 2;
   }

   public void n(Graphics var1, int var2, int var3) {
      var1.setColor(Color.black);
      var1.fillRect(var2, var3, Class2.j, Class2.c);
   }

   public void o(int var1) {
      if (var1 != this.c || var1 != this.d) {
         if (var1 != this.c) {
            this.l(var1);
         }
      }
   }

   public void p(int var1) {
      if (var1 != this.w || var1 != this.t) {
         byte var10002;
         int var10003;
         if (var1 - this.t > 0) {
            var10002 = 1;
            var10003 = var1;
         } else {
            var10002 = -1;
            var10003 = var1;
         }

         this.t = this.t + var10002 * (Math.abs(var10003 - this.t) > 2 ? 2 : 1);
         int var2 = this.r.Screen_x / 2;
         if (this.t > this.s.n.i - var2) {
            this.t = this.s.n.i - var2;
         }

         if (this.t < var2) {
            this.t = var2;
         }

         this.w = var1;
      }
   }

   public Class9(GameView var1) {
      this.b = new StringBuffer();
      this.p = var1;
      this.r = var1.screenData;
      this.t();
   }

   public int q() {
      return this.t - this.r.Screen_x / 2;
   }

   public Point r(int var1, int var2, int var3, int var4) {
      var3 /= 2;
      var4 /= 2;
      if (Math.abs(var1 + var3 - this.t) < this.r.Screen_x / 2 + var3 && Math.abs(var2 + var4 - this.d) < this.r.Screen_y / 2 + var4) {
         this.k.x = var1 - this.t + this.r.Screen_x / 2;
         this.k.y = var2 - this.d + this.r.Screen_y / 2;
         return this.k;
      } else {
         return null;
      }
   }

   public void s(int var1) {
      int var2 = this.r.Screen_x / 2;
      if (Math.abs(this.t - var1) > 70) {
         this.t = var1 + (var1 - this.t < 0 ? 70 : -70);
      }

      if (this.t > this.s.n.i - var2) {
         this.t = this.s.n.i - var2;
      }

      if (this.t < var2) {
         this.t = var2;
      }
   }

   public void t() {
      this.v = this.r.getScreen_x() / Class2.j + 2;
      this.f = this.r.getScreen_y() / Class2.c + 2;
      this.m = Class2.j * this.v;
      this.i = Class2.c * this.f;
   }
}
