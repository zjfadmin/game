package com.xy.w;

import java.awt.Graphics;

public class Class6 implements Class0 {
   private Class0 a;
   private Class0 b;
   private long c;
   private Class1[] d;
   private int e;
   private long f;
   private long[] g;
   private Class5[] h;
   private int i;

   @Override
   public void m() {
      synchronized (this) {
         int var2;
         if (this.d != null) {
            for (int var10000 = var2 = 0; var10000 < this.d.length; var10000 = var2) {
               this.d[var2++] = null;
            }
         }
      }

      if (this.a != null) {
         this.a.m();
      }
   }

   @Override
   public void r(Graphics var1, int var2, int var3, int var4, long var5) {
      synchronized (this) {
         if (this.d == null) {
            this.y();
         }

         if (this.b != null) {
            this.b.k(var1, var2, var3, var4, var5, 1.0F);
         } else {
            Class11.ab.ab(var1, var2, var3);
         }

         int var8;
         for (int var10000 = var8 = 0; var10000 < this.d.length; var10000 = ++var8) {
            if (this.d[var8] == null) {
               this.z(var8);
            }

            if (this.d[var8] != null) {
               this.d[var8].j(var5, var4);
               this.d[var8].ab(var1, var2, var3);
            }
         }
      }

      if (this.a != null) {
         this.a.r(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void e(Class0 var1) {
      this.a = var1;
   }

   @Override
   public Class0 l(int var1, long var2, Class5[] var4) {
      if (this.e == var1) {
         if (this.c == var2) {
            return this;
         } else {
            synchronized (this) {
               this.c = var2;
               this.h = var4;
               this.y();
               return this;
            }
         }
      } else {
         return this.a != null ? this.a.l(var1, var2, var4) : this;
      }
   }

   @Override
   public Class0 v() {
      return this.a;
   }

   public void y() {
      Class6 var4;
      this.g = this.h[0].b();
      label53:
      if (this.b != null) {
         int var1;
         for (int var10000 = var1 = 0; var10000 < this.h.length; var10000 = ++var1) {
            if (this.h[var1].a() == 2) {
               var4 = this;
               this.g = this.h[var1].b();
               break label53;
            }
         }

         var4 = this;
      } else {
         label58: {
            int var2;
            for (int var5 = var2 = 0; var5 < this.h.length; var5 = ++var2) {
               if (this.h[var2].a() == this.i) {
                  var4 = this;
                  this.g = this.h[var2].b();
                  break label58;
               }
            }

            var4 = this;
         }
      }

      if (var4.d != null && this.d.length == this.g.length) {
         int var3;
         for (int var6 = var3 = 0; var6 < this.d.length; var6 = var3) {
            this.d[var3++] = null;
         }
      } else {
         this.d = new Class1[this.g.length];
      }
   }

   @Override
   public void a(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.e != 1) {
         if (this.a != null) {
            this.a.a(var1, var2, var3, var4, var5);
         }
      } else {
         synchronized (this) {
            if (this.d == null) {
               this.y();
            }

            Class11.ab.ab(var1, var2, var3);

            int var7;
            for (int var10000 = var7 = 0; var10000 < this.d.length; var10000 = ++var7) {
               if (this.d[var7] == null) {
                  this.z(var7);
               }

               if (this.d[var7] != null) {
                  this.d[var7].j(this.d[var7].a() - 1, Class11.s(var4, this.d[var7].z()));
                  this.d[var7].k(var1, var2, var3, var5);
               }
            }
         }
      }
   }

   @Override
   public void u() {
   }

   @Override
   public void d(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         Class6 var10000;
         if (this.b != null) {
            var10000 = this;
            this.b.k(var1, var2, var3, var4, var5, var7);
         } else {
            Class11.ab.ab(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.d == null) {
            this.y();
         }

         int var9;
         for (int var11 = var9 = 0; var11 < this.d.length; var11 = ++var9) {
            if (this.d[var9] == null) {
               this.z(var9);
            }

            if (this.d[var9] != null) {
               this.d[var9].j(var5, var4);
               this.d[var9].g(var1, var2, var3, var7);
            }
         }
      }

      if (this.a != null) {
         this.a.c(var1, var2, var3, var4, var5, var7);
      }
   }

   @Override
   public Class0 s(String var1) {
      if (this.aa(var1)) {
         return this.a;
      } else {
         if (this.a != null) {
            this.a = this.a.s(var1);
         }

         return this;
      }
   }

   @Override
   public int j() {
      return this.e != 1 && this.a != null ? this.a.j() : this.i;
   }

   @Override
   public Class0 q(Class0 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.x() < this.e) {
         var1.e(this);
         return var1;
      } else if (this.a == null) {
         this.a = var1;
         return this;
      } else {
         this.a = this.a.q(var1);
         return this;
      }
   }

   @Override
   public void c(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         Class6 var10000;
         if (this.b != null) {
            var10000 = this;
            this.b.k(var1, var2, var3, var4, var5, var7);
         } else {
            Class11.ab.ab(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.d == null) {
            this.y();
         }

         int var9;
         for (int var11 = var9 = 0; var11 < this.d.length; var11 = ++var9) {
            if (this.d[var9] == null) {
               this.z(var9);
            }

            if (this.d[var9] != null) {
               this.d[var9].j(var5, var4);
               this.d[var9].k(var1, var2, var3, var7);
            }
         }
      }

      if (this.a != null) {
         this.a.c(var1, var2, var3, var4, var5, var7);
      }
   }

   public void z(int var1) {
      this.d[var1] = Class11.ag(this.f << 40 | this.g[var1], this.i);
   }

   @Override
   public int i() {
      if (this.e == 1) {
         synchronized (this) {
            if (this.d != null) {
               int var2 = 0;

               int var3;
               for (int var10000 = var3 = 0; var10000 < this.d.length; var10000 = ++var3) {
                  if (this.d[var3] != null && this.d[var3].o() > var2) {
                     var2 = this.d[var3].o();
                  }
               }

               return var2;
            }
         }
      } else if (this.a != null) {
         return this.a.i();
      }

      return -1;
   }

   @Override
   public void n(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         if (this.d == null) {
            this.y();
         }

         Class11.ab.ab(var1, var2, var3);

         int var9;
         for (int var10000 = var9 = 0; var10000 < this.d.length; var10000 = ++var9) {
            if (this.d[var9] == null) {
               this.z(var9);
            }

            if (this.d[var9] != null) {
               this.d[var9].j(var5, Class11.s(var4, this.d[var9].z()));
               this.d[var9].g(var1, var2, var3, var7);
            }
         }
      }

      if (this.a != null) {
         this.a.n(var1, var2, var3, var4, var5, var7);
      }
   }

   @Override
   public Class0 b() {
      Class6 var1 = new Class6(this.c, this.h, this.i, this.e, this.f);
      if (this.a != null) {
         var1.e(this.a.b());
      }

      return var1;
   }

   @Override
   public boolean h(int var1, int var2) {
      if (this.e == 1) {
         synchronized (this) {
            int var4;
            if (this.d != null) {
               for (int var10000 = var4 = 0; var10000 < this.d.length; var10000 = ++var4) {
                  boolean var5;
                  if (this.d[var4] != null && (var5 = this.d[var4].s(var1, var2))) {
                     return var5;
                  }
               }
            }
         }
      } else if (this.a != null) {
         return this.a.h(var1, var2);
      }

      return false;
   }

   @Override
   public void t(int var1) {
      Class6 var10000;
      if (this.i != var1) {
         this.i = var1;
         synchronized (this) {
            this.y();
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.a != null) {
         this.a.t(var1);
      }
   }

   public Class6(long var1, Class5[] var3, int var4, int var5, long var6) {
      this.c = var1;
      this.h = var3;
      this.g = var3[0].b();
      this.i = var4;
      this.e = var5;
      this.f = var6;
   }

   @Override
   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (var5 == -1L && this.e != 1) {
         if (this.a != null) {
            this.a.n(var1, var2, var3, var4, var5, var7);
         }
      } else {
         synchronized (this) {
            if (this.d == null) {
               this.y();
            }

            Class11.ab.ab(var1, var2, var3);

            int var9;
            for (int var10000 = var9 = 0; var10000 < this.d.length; var10000 = ++var9) {
               if (this.d[var9] == null) {
                  this.z(var9);
               }

               if (this.d[var9] != null) {
                  this.d[var9].j(var5, Class11.s(var4, this.d[var9].z()));
                  this.d[var9].k(var1, var2, var3, var7);
               }
            }
         }

         if (this.a != null) {
            this.a.o(var1, var2, var3, var4, var5, var7);
         }
      }
   }

   @Override
   public int x() {
      return this.e;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public int p() {
      if (this.e != 1 && this.a != null) {
         return this.a.p();
      } else {
         Class6 var1 = this;
         synchronized (this) {
            if (this.d == null) {
               this.y();
            }

            Class6 var10000;
            if (this.d.length > 1) {
               if (this.d[1] != null) {
                  return this.d[1].a();
               }

               this.z(1);
               var10000 = var1;
            } else {
               if (this.d[0] != null) {
                  return this.d[0].a();
               }

               this.z(0);
               var10000 = var1;
            }

            // $VF: monitorexit
            return 1200;
         }
      }
   }

   @Override
   public void w(String var1) {
      if (this.e == 1) {
         if (var1 == null) {
            this.b = null;
         } else {
            this.b = Class11.t(var1, 2, 1, null);
         }
      } else {
         if (this.a != null) {
            this.a.w(var1);
         }
      }
   }

   @Override
   public void k(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         if (this.d == null) {
            this.y();
         }

         int var9;
         for (int var10000 = var9 = 0; var10000 < this.d.length; var10000 = ++var9) {
            if (this.d[var9] == null) {
               this.z(var9);
            }

            if (this.d[var9] != null) {
               this.d[var9].j(var5, var4);
               this.d[var9].ab(var1, var2, var3);
            }
         }
      }
   }

   @Override
   public int f() {
      if (this.e == 1) {
         synchronized (this) {
            int var2;
            if (this.d != null) {
               for (int var10000 = var2 = 0; var10000 < this.d.length; var10000 = ++var2) {
                  if (this.d[var2] != null) {
                     return this.d[var2].z();
                  }
               }
            }
         }
      } else if (this.a != null) {
         return this.a.f();
      }

      return 2;
   }

   @Override
   public Class0 g(int var1, String var2) {
      if (this.e == var1) {
         Object var3 = null;
         long var4;
         if (com.xy.v.Class12.u(var2) && Class11.y(var4 = Long.parseLong(var2), -1) != null) {
            var3 = new Class12(var4, this.i, var1, this.f);
         }

         if (var3 == null) {
            var3 = new Class8(var2, this.i, var1, this.f);
         }

         ((Class0)var3).e(this.a);
         return (Class0)var3;
      } else {
         return this.a != null ? this.a.g(var1, var2) : this;
      }
   }

   // $VF: synthetic method
   private boolean aa(String var1) {
      return var1.equals(String.valueOf(this.c));
   }
}
