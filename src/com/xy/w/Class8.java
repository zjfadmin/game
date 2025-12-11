package com.xy.w;

import java.awt.Graphics;

public class Class8 implements Class0 {
   private int j;
   private String k;
   private int e;
   private Class1 l;
   private Class0 m;
   private long n;
   private Class0 o;

   @Override
   public void c(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.o != null) {
         this.o.k(var1, var2, var3, var4, var5, var7);
      }

      if (this.l == null) {
         this.u();
      }

      synchronized (this) {
         if (this.l != null) {
            this.l.j(var5, var4);
            this.l.k(var1, var2, var3, var7);
         }
      }

      if (this.m != null) {
         this.m.c(var1, var2, var3, var4, var5, var7);
      }
   }

   @Override
   public boolean h(int var1, int var2) {
      if (this.e == 1) {
         synchronized (this) {
            if (this.l != null) {
               return this.l.s(var1, var2);
            }
         }
      } else if (this.m != null) {
         return this.m.h(var1, var2);
      }

      return false;
   }

   @Override
   public void a(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.e != 1) {
         if (this.m != null) {
            this.m.a(var1, var2, var3, var4, var5);
         }
      } else {
         if (this.l == null) {
            this.u();
         }

         synchronized (this) {
            if (this.l != null) {
               this.l.j(this.l.a() - 1, Class11.s(var4, this.l.z()));
               this.l.k(var1, var2, var3, var5);
            }
         }
      }
   }

   @Override
   public void e(Class0 var1) {
      this.m = var1;
   }

   @Override
   public void k(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.l == null) {
         this.u();
      }

      synchronized (this) {
         if (this.l != null) {
            this.l.j(var5, var4);
            this.l.k(var1, var2, var3, var7);
         }
      }
   }

   @Override
   public int p() {
      if (this.e != 1 && this.m != null) {
         return this.m.p();
      } else {
         synchronized (this) {
            if (this.l != null) {
               return this.l.a();
            }
         }

         this.u();
         return 1200;
      }
   }

   @Override
   public void r(Graphics var1, int var2, int var3, int var4, long var5) {
      if (this.o != null) {
         this.o.k(var1, var2, var3, var4, var5, 1.0F);
      }

      if (this.l == null) {
         this.u();
      }

      synchronized (this) {
         if (this.l != null) {
            this.l.j(var5, var4);
            this.l.ab(var1, var2, var3);
         }
      }

      if (this.m != null) {
         this.m.r(var1, var2, var3, var4, var5);
      }
   }

   // $VF: synthetic method
   private boolean aa(String var1) {
      return var1.equals(this.k);
   }

   @Override
   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.l == null) {
         this.u();
      }

      synchronized (this) {
         if (this.l != null) {
            this.l.j(var5, Class11.s(var4, this.l.z()));
            this.l.k(var1, var2, var3, var7);
         }
      }

      if (this.m != null) {
         this.m.o(var1, var2, var3, var4, var5, var7);
      }
   }

   @Override
   public Class0 b() {
      Class8 var1 = new Class8(this.k, this.j, this.e, this.n);
      if (this.m != null) {
         var1.e(this.m.b());
      }

      return var1;
   }

   @Override
   public Class0 l(int var1, long var2, Class5[] var4) {
      if (this.e == var1) {
         Class6 var10000 = new Class6(var2, var4, this.j, var1, this.n);
         var10000.e(this.m);
         return var10000;
      } else {
         return this.m != null ? this.m.l(var1, var2, var4) : this;
      }
   }

   @Override
   public void w(String var1) {
      if (this.e == 1) {
         if (var1 == null) {
            this.o = null;
         } else {
            this.o = Class11.t(var1, 2, 1, null);
         }
      } else {
         if (this.m != null) {
            this.m.w(var1);
         }
      }
   }

   @Override
   public int f() {
      if (this.e == 1) {
         synchronized (this) {
            if (this.l != null) {
               return this.l.z();
            }
         }
      } else if (this.m != null) {
         return this.m.f();
      }

      return 2;
   }

   @Override
   public Class0 v() {
      return this.m;
   }

   @Override
   public void m() {
      synchronized (this) {
         this.l = null;
      }

      if (this.m != null) {
         this.m.m();
      }
   }

   @Override
   public void n(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.l == null) {
         this.u();
      }

      if (var5 == -1L && this.e != 1) {
         if (this.m != null) {
            this.m.n(var1, var2, var3, var4, var5, var7);
         }
      } else {
         synchronized (this) {
            if (this.l != null) {
               this.l.j(var5, Class11.s(var4, this.l.z()));
               this.l.g(var1, var2, var3, var7);
            }
         }

         if (this.m != null) {
            this.m.n(var1, var2, var3, var4, var5, var7);
         }
      }
   }

   public Class8(String var1, int var2, int var3, long var4) {
      this.k = var1;
      this.j = var2;
      this.e = var3;
      this.n = var4;
   }

   @Override
   public Class0 g(int var1, String var2) {
      if (this.e == var1) {
         long var3;
         if (com.xy.v.Class12.u(var2) && Class11.y(var3 = Long.parseLong(var2), -1) != null) {
            Class12 var10000 = new Class12(var3, this.j, var1, this.n);
            var10000.e(this.m);
            return var10000;
         } else {
            this.k = var2;
            synchronized (this) {
               this.l = null;
               return this;
            }
         }
      } else {
         return this.m != null ? this.m.g(var1, var2) : this;
      }
   }

   @Override
   public int i() {
      if (this.e == 1) {
         synchronized (this) {
            if (this.l != null) {
               return this.l.o();
            }
         }
      } else if (this.m != null) {
         return this.m.i();
      }

      return -1;
   }

   @Override
   public Class0 s(String var1) {
      if (this.aa(var1)) {
         return this.m;
      } else {
         if (this.m != null) {
            this.m = this.m.s(var1);
         }

         return this;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void u() {
      Class8 var1 = this;
      synchronized (this) {
         Class8 var10000;
         if (this.j == -2) {
            var10000 = var1;
            this.l = Class11.x(Class15.p(this.k));
         } else if (this.j == -1) {
            var10000 = var1;
            this.l = Class11.x(Class15.t(this.k));
         } else if (this.o != null) {
            this.l = Class11.x(Class15.c(this.k, 2, this.n));
            var10000 = var1;
         } else {
            this.l = Class11.x(Class15.c(this.k, this.j, this.n));
            var10000 = var1;
         }

         // $VF: monitorexit
      }
   }

   @Override
   public Class0 q(Class0 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.x() < this.e) {
         var1.e(this);
         return var1;
      } else if (this.m == null) {
         this.m = var1;
         return this;
      } else {
         this.m = this.m.q(var1);
         return this;
      }
   }

   @Override
   public int j() {
      return this.e != 1 && this.m != null ? this.m.j() : this.j;
   }

   @Override
   public void t(int var1) {
      Class8 var10000;
      if (this.j > 0 && this.j != var1) {
         this.j = var1;
         synchronized (this) {
            this.l = null;
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.m != null) {
         this.m.t(var1);
      }
   }

   @Override
   public int x() {
      return this.e;
   }

   @Override
   public void d(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.o != null) {
         this.o.k(var1, var2, var3, var4, var5, var7);
      }

      if (this.l == null) {
         this.u();
      }

      synchronized (this) {
         if (this.l != null) {
            this.l.j(var5, var4);
            this.l.g(var1, var2, var3, var7);
         }
      }

      if (this.m != null) {
         this.m.d(var1, var2, var3, var4, var5, var7);
      }
   }
}
