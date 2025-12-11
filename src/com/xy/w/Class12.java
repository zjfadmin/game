package com.xy.w;

import java.awt.Graphics;

public class Class12 implements Class0 {
   private int p;
   private int j;
   private Class1[] d;
   private long q;
   private Class0 r;
   private long[] g;
   private Class0 s;
   private long t;

   @Override
   public void r(Graphics var1, int var2, int var3, int var4, long var5) {
      synchronized (this) {
         if (this.d == null) {
            this.y();
         }

         if (this.s != null) {
            this.s.k(var1, var2, var3, var4, var5, 1.0F);
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

      if (this.r != null) {
         this.r.r(var1, var2, var3, var4, var5);
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
      if (this.p == 1) {
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
      } else if (this.r != null) {
         return this.r.f();
      }

      return 2;
   }

   @Override
   public Class0 v() {
      return this.r;
   }

   @Override
   public void w(String var1) {
      if (this.p == 1) {
         if (var1 == null) {
            this.s = null;
         } else {
            this.s = Class11.t(var1, 2, 1, null);
         }
      } else {
         if (this.r != null) {
            this.r.w(var1);
         }
      }
   }

   @Override
   public int i() {
      if (this.p == 1) {
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
      } else if (this.r != null) {
         return this.r.i();
      }

      return -1;
   }

   @Override
   public int x() {
      return this.p;
   }

   @Override
   public Class0 g(int var1, String var2) {
      if (this.p == var1) {
         long var3;
         if (!com.xy.v.Class12.u(var2) || Class11.y(var3 = Long.parseLong(var2), -1) == null) {
            Class8 var10000 = new Class8(var2, this.j, var1, this.q);
            var10000.e(this.r);
            return var10000;
         } else if (this.t == var3) {
            return this;
         } else {
            synchronized (this) {
               this.t = var3;
               this.y();
               return this;
            }
         }
      } else {
         return this.r != null ? this.r.g(var1, var2) : this;
      }
   }

   @Override
   public Class0 l(int var1, long var2, Class5[] var4) {
      if (this.p == var1) {
         Class6 var10000 = new Class6(var2, var4, this.j, var1, this.q);
         var10000.e(this.r);
         return var10000;
      } else {
         return this.r != null ? this.r.l(var1, var2, var4) : this;
      }
   }

   @Override
   public Class0 q(Class0 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.x() < this.p) {
         var1.e(this);
         return var1;
      } else if (this.r == null) {
         this.r = var1;
         return this;
      } else {
         this.r = this.r.q(var1);
         return this;
      }
   }

   @Override
   public Class0 b() {
      Class12 var1 = new Class12(this.t, this.j, this.p, this.q);
      if (this.r != null) {
         var1.e(this.r.b());
      }

      return var1;
   }

   @Override
   public void c(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         Class12 var10000;
         if (this.s != null) {
            var10000 = this;
            this.s.k(var1, var2, var3, var4, var5, var7);
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

      if (this.r != null) {
         this.r.c(var1, var2, var3, var4, var5, var7);
      }
   }

   public void y() {
      this.g = Class11.y(this.t, this.s != null ? 2 : this.j);
      if (this.d != null && this.d.length == this.g.length) {
         int var1;
         for (int var10000 = var1 = 0; var10000 < this.d.length; var10000 = var1) {
            this.d[var1++] = null;
         }
      } else {
         this.d = new Class1[this.g.length];
      }
   }

   @Override
   public void a(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.p != 1) {
         if (this.r != null) {
            this.r.a(var1, var2, var3, var4, var5);
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

   public void z(int var1) {
      this.d[var1] = Class11.a(this.q << 40 | this.g[var1], this.j);
   }

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

      if (this.r != null) {
         this.r.m();
      }
   }

   @Override
   public void d(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized (this) {
         Class12 var10000;
         if (this.s != null) {
            var10000 = this;
            this.s.k(var1, var2, var3, var4, var5, var7);
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

      if (this.r != null) {
         this.r.d(var1, var2, var3, var4, var5, var7);
      }
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

      if (this.r != null) {
         this.r.n(var1, var2, var3, var4, var5, var7);
      }
   }

   @Override
   public void t(int var1) {
      Class12 var10000;
      if (this.j != var1) {
         this.j = var1;
         synchronized (this) {
            this.y();
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.r != null) {
         this.r.t(var1);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public int p() {
      if (this.p != 1 && this.r != null) {
         return this.r.p();
      } else {
         Class12 var1 = this;
         synchronized (this) {
            if (this.d == null) {
               this.y();
            }

            Class12 var10000;
            if (this.d.length > 1) {
               if (this.d[1] != null) {
                  return this.d[1].a();
               }

               this.z(1);
               var10000 = var1;
            } else {
               if (this.d.length == 1) {
                  if (this.d[0] != null) {
                     return this.d[0].a();
                  }

                  this.z(0);
               }

               var10000 = var1;
            }

            // $VF: monitorexit
            return 1200;
         }
      }
   }

   // $VF: synthetic method
   private boolean aa(String var1) {
      return var1.equals(String.valueOf(this.t));
   }

   @Override
   public int j() {
      return this.p != 1 && this.r != null ? this.r.j() : this.j;
   }

   public Class12(long var1, int var3, int var4, long var5) {
      this.t = var1;
      this.j = var3;
      this.p = var4;
      this.q = var5;
   }

   @Override
   public void u() {
   }

   @Override
   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (var5 == -1L && this.p != 1) {
         if (this.r != null) {
            this.r.n(var1, var2, var3, var4, var5, var7);
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

         if (this.r != null) {
            this.r.o(var1, var2, var3, var4, var5, var7);
         }
      }
   }

   @Override
   public void e(Class0 var1) {
      this.r = var1;
   }

   @Override
   public boolean h(int var1, int var2) {
      if (this.p == 1) {
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
      } else if (this.r != null) {
         return this.r.h(var1, var2);
      }

      return false;
   }

   @Override
   public Class0 s(String var1) {
      if (this.aa(var1)) {
         return this.r;
      } else {
         if (this.r != null) {
            this.r = this.r.s(var1);
         }

         return this;
      }
   }
}
