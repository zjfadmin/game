package com.xy;

import java.awt.Graphics;

public class Class154 implements Class19 {
   private Class8[] a;
   private long[] b;
   private Class19 c;
   private long d;
   private Class25[] e;
   private Class19 f;
   private int g;
   private int h;
   private long i;

   public void a(Graphics var1, int var2, int var3, int var4, long var5) {
      synchronized(this) {
         if (this.a == null) {
            this.l();
         }

         if (this.f != null) {
            this.f.i(var1, var2, var3, var4, var5, 1.0F);
         } else {
            Class330.t.aa(var1, var2, var3);
         }

         int var8;
         int var10000 = var8 = 0;

         while(true) {
            if (var10000 >= this.a.length) {
               break;
            }

            if (this.a[var8] == null) {
               this.y(var8);
            }

            if (this.a[var8] != null) {
               this.a[var8].d(var5, var4);
               this.a[var8].aa(var1, var2, var3);
            }

            ++var8;
            var10000 = var8;
         }
      }

      if (this.c != null) {
         this.c.a(var1, var2, var3, var4, var5);
      }

   }


   private boolean b(String var1) {
      return var1.equals(String.valueOf(this.d));
   }

   public Class19 c(int var1, String var2) {
      if (this.h == var1) {
         Object var3 = null;
         long var4;
         if (Class394.i(var2) && Class330.ac(var4 = Long.parseLong(var2), -4 >> 2) != null) {
            var3 = new Class188(var4, this.g, var1, this.i);
         }

         if (var3 == null) {
            var3 = new Class277(var2, this.g, var1, this.i);
         }

         ((Class19)var3).k(this.c);
         return (Class19)var3;
      } else {
         return (Class19)(this.c != null ? this.c.c(var1, var2) : this);
      }
   }

   public Class19 d(Class19 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.g() < this.h) {
         var1.k(this);
         return var1;
      } else if (this.c == null) {
         this.c = var1;
         return this;
      } else {
         this.c = this.c.d(var1);
         return this;
      }
   }

   public int e() {
      if (this.h != 3 >> 1 && this.c != null) {
         return this.c.e();
      } else {
         Class154 var1 = this;
         synchronized(this) {
            if (this.a == null) {
               this.l();
            }

            Class154 var10000;
            if (this.a.length > --1) {
               if (this.a[--1] != null) {
                  return this.a[2 ^ 3].k();
               }

               this.y(5 >> 2);
               var10000 = var1;
            } else {
               if (this.a[3 & 4] != null) {
                  return this.a[3 & 4].k();
               }

               this.y(5 >> 3);
               var10000 = var1;
            }

            return 1200;
         }
      }
   }

   public void f(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.h != (2 ^ 3)) {
         if (this.c != null) {
            this.c.f(var1, var2, var3, var4, var5);
         }

      } else {
         synchronized(this) {
            if (this.a == null) {
               this.l();
            }

            Class330.t.aa(var1, var2, var3);

            int var7;
            for(int var10000 = var7 = 3 & 4; var10000 < this.a.length; var10000 = var7) {
               if (this.a[var7] == null) {
                  this.y(var7);
               }

               if (this.a[var7] != null) {
                  this.a[var7].d((long)(this.a[var7].k() - (3 >> 1)), Class330.v(var4, this.a[var7].z()));
                  this.a[var7].p(var1, var2, var3, var5);
               }

               ++var7;
            }

         }
      }
   }

   public int g() {
      return this.h;
   }

   public Class19 h() {
      return this.c;
   }

   public void i(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         if (this.a == null) {
            this.l();
         }

         int var8;
         for(int var10000 = var8 = 0; var10000 < this.a.length; var10000 = var8) {
            if (this.a[var8] == null) {
               this.y(var8);
            }

            if (this.a[var8] != null) {
               this.a[var8].d(var5, var4);
               this.a[var8].aa(var1, var2, var3);
            }

            ++var8;
         }

      }
   }

   public Class19 j(String var1) {
      if (this.b(var1)) {
         return this.c;
      } else {
         if (this.c != null) {
            this.c = this.c.j(var1);
         }

         return this;
      }
   }

   public void k(Class19 var1) {
      this.c = var1;
   }

   public void l() {
      this.b = this.e[2 & 5].a();
      int var10000;
      int var1;
      Class154 var2;
      if (this.f != null) {
         label54: {
            for(var10000 = var1 = 3 ^ 3; var10000 < this.e.length; var10000 = var1) {
               if (this.e[var1].c() == 5 >> 1) {
                  var2 = this;
                  this.b = this.e[var1].a();
                  break label54;
               }

               ++var1;
            }

            var2 = this;
         }
      } else {
         label56: {
            for(var10000 = var1 = 0; var10000 < this.e.length; var10000 = var1) {
               if (this.e[var1].c() == this.g) {
                  var2 = this;
                  this.b = this.e[var1].a();
                  break label56;
               }

               ++var1;
            }

            var2 = this;
         }
      }

      if (var2.a != null && this.a.length == this.b.length) {
         for(var10000 = var1 = 0; var10000 < this.a.length; var10000 = var1) {
            this.a[var1++] = null;
         }

      } else {
         Class8[] var10001 = new Class8[this.b.length];
         boolean var10003 = true;
         this.a = var10001;
      }
   }

   public int m() {
      if (this.h == --1) {
         synchronized(this) {
            if (this.a != null) {
               int var2 = 2 & 5;

               int var3;
               for(int var10000 = var3 = 3 >> 2; var10000 < this.a.length; var10000 = var3) {
                  if (this.a[var3] != null && this.a[var3].q() > var2) {
                     var2 = this.a[var3].q();
                  }

                  ++var3;
               }

               return var2;
            }
         }
      } else if (this.c != null) {
         return this.c.m();
      }

      return -1;
   }

   public void n() {
      synchronized(this) {
         int var2;
         if (this.a != null) {
            for(int var10000 = var2 = 3 & 4; var10000 < this.a.length; var10000 = var2) {
               this.a[var2++] = null;
            }
         }
      }

      if (this.c != null) {
         this.c.n();
      }

   }

   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (var5 == -1L && this.h != 3 >> 1) {
         if (this.c != null) {
            this.c.p(var1, var2, var3, var4, var5, var7);
         }

      } else {
         synchronized(this) {
            if (this.a == null) {
               this.l();
            }

            Class330.t.aa(var1, var2, var3);

            int var9;
            for(int var10000 = var9 = 3 & 4; var10000 < this.a.length; var10000 = var9) {
               if (this.a[var9] == null) {
                  this.y(var9);
               }

               if (this.a[var9] != null) {
                  this.a[var9].d(var5, Class330.v(var4, this.a[var9].z()));
                  this.a[var9].p(var1, var2, var3, var7);
               }

               ++var9;
            }
         }

         if (this.c != null) {
            this.c.o(var1, var2, var3, var4, var5, var7);
         }

      }
   }

   public void p(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         if (this.a == null) {
            this.l();
         }

         Class330.t.aa(var1, var2, var3);

         int var9;
         for(int var10000 = var9 = 2 & 5; var10000 < this.a.length; var10000 = var9) {
            if (this.a[var9] == null) {
               this.y(var9);
            }

            if (this.a[var9] != null) {
               this.a[var9].d(var5, Class330.v(var4, this.a[var9].z()));
               this.a[var9].m(var1, var2, var3, var7);
            }

            ++var9;
         }
      }

      if (this.c != null) {
         this.c.p(var1, var2, var3, var4, var5, var7);
      }

   }

   public void q(String var1) {
      if (this.h == (2 ^ 3)) {
         if (var1 == null) {
            this.f = null;
         } else {
            this.f = Class330.f(var1, 5 >> 1, 2 ^ 3, (String)null);
         }
      } else {
         if (this.c != null) {
            this.c.q(var1);
         }

      }
   }

   public void r(int var1) {
      Class154 var10000;
      if (this.g != var1) {
         this.g = var1;
         synchronized(this) {
            this.l();
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.c != null) {
         this.c.r(var1);
      }

   }

   public Class154(long var1, Class25[] var3, int var4, int var5, long var6) {
      int var10007 = 3 & 4;
      super();
      this.d = var1;
      this.e = var3;
      this.b = var3[var10007].a();
      this.g = var4;
      this.h = var5;
      this.i = var6;
   }

   public Class19 s() {
      Class154 var1 = new Class154(this.d, this.e, this.g, this.h, this.i);
      if (this.c != null) {
         var1.k(this.c.s());
      }

      return var1;
   }

   public void t(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         Class154 var10000;
         if (this.f != null) {
            var10000 = this;
            this.f.i(var1, var2, var3, var4, var5, var7);
         } else {
            Class330.t.aa(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.a == null) {
            this.l();
         }

         int var9;
         int var11 = var9 = 0;

         while(true) {
            if (var11 >= this.a.length) {
               break;
            }

            if (this.a[var9] == null) {
               this.y(var9);
            }

            if (this.a[var9] != null) {
               this.a[var9].d(var5, var4);
               this.a[var9].m(var1, var2, var3, var7);
            }

            ++var9;
            var11 = var9;
         }
      }

      if (this.c != null) {
         this.c.w(var1, var2, var3, var4, var5, var7);
      }

   }

   public void u() {
   }

   public Class19 v(int var1, long var2, Class25[] var4) {
      if (this.h == var1) {
         if (this.d == var2) {
            return this;
         } else {
            synchronized(this) {
               this.d = var2;
               this.e = var4;
               this.l();
               return this;
            }
         }
      } else {
         return (Class19)(this.c != null ? this.c.v(var1, var2, var4) : this);
      }
   }

   public void w(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         Class154 var10000;
         if (this.f != null) {
            var10000 = this;
            this.f.i(var1, var2, var3, var4, var5, var7);
         } else {
            Class330.t.aa(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.a == null) {
            this.l();
         }

         int var9;
         int var11 = var9 = 0;

         while(true) {
            if (var11 >= this.a.length) {
               break;
            }

            if (this.a[var9] == null) {
               this.y(var9);
            }

            if (this.a[var9] != null) {
               this.a[var9].d(var5, var4);
               this.a[var9].p(var1, var2, var3, var7);
            }

            ++var9;
            var11 = var9;
         }
      }

      if (this.c != null) {
         this.c.w(var1, var2, var3, var4, var5, var7);
      }

   }

   public boolean x(int var1, int var2) {
      if (this.h == (2 ^ 3)) {
         synchronized(this) {
            int var4;
            if (this.a != null) {
               for(int var10000 = var4 = 3 & 4; var10000 < this.a.length; var10000 = var4) {
                  boolean var5;
                  if (this.a[var4] != null && (var5 = this.a[var4].o(var1, var2))) {
                     return var5;
                  }

                  ++var4;
               }
            }
         }
      } else if (this.c != null) {
         return this.c.x(var1, var2);
      }

      return false;
   }

   public void y(int var1) {
      this.a[var1] = Class330.aj(this.i << (58 & 109) | this.b[var1], this.g);
   }

   public int z() {
      return this.h != --1 && this.c != null ? this.c.z() : this.g;
   }

   public int aa() {
      if (this.h == --1) {
         synchronized(this) {
            int var2;
            if (this.a != null) {
               for(int var10000 = var2 = 3 & 4; var10000 < this.a.length; var10000 = var2) {
                  if (this.a[var2] != null) {
                     return this.a[var2].z();
                  }

                  ++var2;
               }
            }
         }
      } else if (this.c != null) {
         return this.c.aa();
      }

      return 2;
   }
}
