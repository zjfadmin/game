package com.xy;

import java.awt.Graphics;

public class Class277 implements Class19 {
   private int p;
   private long d;
   private Class19 q;
   private String r;
   private Class8 s;
   private int h;
   private Class19 t;

   public Class19 s() {
      Class277 var1 = new Class277(this.r, this.h, this.p, this.d);
      if (this.q != null) {
         var1.k(this.q.s());
      }

      return var1;
   }

   public Class19 d(Class19 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.g() < this.p) {
         var1.k(this);
         return var1;
      } else if (this.q == null) {
         this.q = var1;
         return this;
      } else {
         this.q = this.q.d(var1);
         return this;
      }
   }

   public void w(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.t != null) {
         this.t.i(var1, var2, var3, var4, var5, var7);
      }

      if (this.s == null) {
         this.u();
      }

      synchronized(this) {
         if (this.s != null) {
            this.s.d(var5, var4);
            this.s.p(var1, var2, var3, var7);
         }
      }

      if (this.q != null) {
         this.q.w(var1, var2, var3, var4, var5, var7);
      }

   }

   public void f(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.p != (2 ^ 3)) {
         if (this.q != null) {
            this.q.f(var1, var2, var3, var4, var5);
         }

      } else {
         if (this.s == null) {
            this.u();
         }

         synchronized(this) {
            if (this.s != null) {
               this.s.d((long)(this.s.k() - (5 >> 2)), Class330.v(var4, this.s.z()));
               this.s.p(var1, var2, var3, var5);
            }

         }
      }
   }

   public void u() {
      Class277 var1 = this;
      synchronized(this) {
         Class277 var10000;
         if (this.h == (-1 & -2)) {
            var10000 = var1;
            this.s = Class330.q(Class222.m(this.r));
         } else if (this.h == -4 >> 2) {
            var10000 = var1;
            this.s = Class330.q(Class222.v(this.r));
         } else if (this.t != null) {
            this.s = Class330.q(Class222.q(this.r, 5 >> 1, this.d));
            var10000 = var1;
         } else {
            this.s = Class330.q(Class222.q(this.r, this.h, this.d));
            var10000 = var1;
         }

      }
   }

   public void r(int var1) {
      Class277 var10000;
      if (this.h > 0 && this.h != var1) {
         this.h = var1;
         synchronized(this) {
            this.s = null;
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.q != null) {
         this.q.r(var1);
      }

   }

   public void n() {
      synchronized(this) {
         this.s = null;
      }

      if (this.q != null) {
         this.q.n();
      }

   }

   public void i(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.s == null) {
         this.u();
      }

      synchronized(this) {
         if (this.s != null) {
            this.s.d(var5, var4);
            this.s.p(var1, var2, var3, var7);
         }

      }
   }

   public int g() {
      return this.p;
   }

   public Class19 j(String var1) {
      if (this.b(var1)) {
         return this.q;
      } else {
         if (this.q != null) {
            this.q = this.q.j(var1);
         }

         return this;
      }
   }

   public Class19 c(int var1, String var2) {
      if (this.p == var1) {
         long var3;
         if (Class394.i(var2) && Class330.ac(var3 = Long.parseLong(var2), -4 >> 2) != null) {
            Class188 var10000 = new Class188(var3, this.h, var1, this.d);
            var10000.k(this.q);
            return var10000;
         } else {
            this.r = var2;
            synchronized(this) {
               this.s = null;
               return this;
            }
         }
      } else {
         return (Class19)(this.q != null ? this.q.c(var1, var2) : this);
      }
   }

   public void p(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.s == null) {
         this.u();
      }

      if (var5 == -1L && this.p != --1) {
         if (this.q != null) {
            this.q.p(var1, var2, var3, var4, var5, var7);
         }

      } else {
         synchronized(this) {
            if (this.s != null) {
               this.s.d(var5, Class330.v(var4, this.s.z()));
               this.s.m(var1, var2, var3, var7);
            }
         }

         if (this.q != null) {
            this.q.p(var1, var2, var3, var4, var5, var7);
         }

      }
   }

   public void a(Graphics var1, int var2, int var3, int var4, long var5) {
      if (this.t != null) {
         this.t.i(var1, var2, var3, var4, var5, 1.0F);
      }

      if (this.s == null) {
         this.u();
      }

      synchronized(this) {
         if (this.s != null) {
            this.s.d(var5, var4);
            this.s.aa(var1, var2, var3);
         }
      }

      if (this.q != null) {
         this.q.a(var1, var2, var3, var4, var5);
      }

   }


   private boolean b(String var1) {
      return var1.equals(this.r);
   }

   public Class19 v(int var1, long var2, Class25[] var4) {
      if (this.p == var1) {
         Class154 var10000 = new Class154(var2, var4, this.h, var1, this.d);
         var10000.k(this.q);
         return var10000;
      } else {
         return (Class19)(this.q != null ? this.q.v(var1, var2, var4) : this);
      }
   }

   public int e() {
      if (this.p != (4 ^ 5) && this.q != null) {
         return this.q.e();
      } else {
         synchronized(this) {
            if (this.s != null) {
               return this.s.k();
            }
         }

         this.u();
         return 32251 & 1716;
      }
   }

   public int m() {
      if (this.p == (4 ^ 5)) {
         synchronized(this) {
            if (this.s != null) {
               return this.s.q();
            }
         }
      } else if (this.q != null) {
         return this.q.m();
      }

      return -1;
   }

   public void k(Class19 var1) {
      this.q = var1;
   }

   public int aa() {
      if (this.p == 5 >> 2) {
         synchronized(this) {
            if (this.s != null) {
               return this.s.z();
            }
         }
      } else if (this.q != null) {
         return this.q.aa();
      }

      return 2;
   }

   public void t(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.t != null) {
         this.t.i(var1, var2, var3, var4, var5, var7);
      }

      if (this.s == null) {
         this.u();
      }

      synchronized(this) {
         if (this.s != null) {
            this.s.d(var5, var4);
            this.s.m(var1, var2, var3, var7);
         }
      }

      if (this.q != null) {
         this.q.t(var1, var2, var3, var4, var5, var7);
      }

   }

   public boolean x(int var1, int var2) {
      if (this.p == 5 >> 2) {
         synchronized(this) {
            if (this.s != null) {
               return this.s.o(var1, var2);
            }
         }
      } else if (this.q != null) {
         return this.q.x(var1, var2);
      }

      return false;
   }

   public int z() {
      return this.p != (4 ^ 5) && this.q != null ? this.q.z() : this.h;
   }

   public Class19 h() {
      return this.q;
   }

   public void q(String var1) {
      if (this.p == 5 >> 2) {
         if (var1 == null) {
            this.t = null;
         } else {
            this.t = Class330.f(var1, 5 >> 1, 5 >> 2, (String)null);
         }
      } else {
         if (this.q != null) {
            this.q.q(var1);
         }

      }
   }

   public Class277(String var1, int var2, int var3, long var4) {
      this.r = var1;
      this.h = var2;
      this.p = var3;
      this.d = var4;
   }

   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (this.s == null) {
         this.u();
      }

      synchronized(this) {
         if (this.s != null) {
            this.s.d(var5, Class330.v(var4, this.s.z()));
            this.s.p(var1, var2, var3, var7);
         }
      }

      if (this.q != null) {
         this.q.o(var1, var2, var3, var4, var5, var7);
      }

   }
}
