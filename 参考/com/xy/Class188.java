package com.xy;

import java.awt.Graphics;

public class Class188 implements Class19 {
   private long j;
   private long[] k;
   private Class19 l;
   private long m;
   private Class19 f;
   private Class8[] n;
   private int h;
   private int o;

   public Class19 v(int var1, long var2, Class25[] var4) {
      if (this.o == var1) {
         Class154 var10000 = new Class154(var2, var4, this.h, var1, this.j);
         var10000.k(this.f);
         return var10000;
      } else {
         return (Class19)(this.f != null ? this.f.v(var1, var2, var4) : this);
      }
   }

   public void i(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         if (this.n == null) {
            this.l();
         }

         int var8;
         for(int var10000 = var8 = 0; var10000 < this.n.length; var10000 = var8) {
            if (this.n[var8] == null) {
               this.y(var8);
            }

            if (this.n[var8] != null) {
               this.n[var8].d(var5, var4);
               this.n[var8].aa(var1, var2, var3);
            }

            ++var8;
         }

      }
   }

   public void a(Graphics var1, int var2, int var3, int var4, long var5) {
      synchronized(this) {
         if (this.n == null) {
            this.l();
         }

         if (this.l != null) {
            this.l.i(var1, var2, var3, var4, var5, 1.0F);
         } else {
            Class330.t.aa(var1, var2, var3);
         }

         int var8;
         int var10000 = var8 = 0;

         while(true) {
            if (var10000 >= this.n.length) {
               break;
            }

            if (this.n[var8] == null) {
               this.y(var8);
            }

            if (this.n[var8] != null) {
               this.n[var8].d(var5, var4);
               this.n[var8].aa(var1, var2, var3);
            }

            ++var8;
            var10000 = var8;
         }
      }

      if (this.f != null) {
         this.f.a(var1, var2, var3, var4, var5);
      }

   }

   public void o(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      if (var5 == -1L && this.o != --1) {
         if (this.f != null) {
            this.f.p(var1, var2, var3, var4, var5, var7);
         }

      } else {
         synchronized(this) {
            if (this.n == null) {
               this.l();
            }

            Class330.t.aa(var1, var2, var3);

            int var9;
            for(int var10000 = var9 = 3 >> 2; var10000 < this.n.length; var10000 = var9) {
               if (this.n[var9] == null) {
                  this.y(var9);
               }

               if (this.n[var9] != null) {
                  this.n[var9].d(var5, Class330.v(var4, this.n[var9].z()));
                  this.n[var9].p(var1, var2, var3, var7);
               }

               ++var9;
            }
         }

         if (this.f != null) {
            this.f.o(var1, var2, var3, var4, var5, var7);
         }

      }
   }

   public int g() {
      return this.o;
   }

   public void w(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         Class188 var10000;
         if (this.l != null) {
            var10000 = this;
            this.l.i(var1, var2, var3, var4, var5, var7);
         } else {
            Class330.t.aa(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.n == null) {
            this.l();
         }

         int var9;
         int var11 = var9 = 0;

         while(true) {
            if (var11 >= this.n.length) {
               break;
            }

            if (this.n[var9] == null) {
               this.y(var9);
            }

            if (this.n[var9] != null) {
               this.n[var9].d(var5, var4);
               this.n[var9].p(var1, var2, var3, var7);
            }

            ++var9;
            var11 = var9;
         }
      }

      if (this.f != null) {
         this.f.w(var1, var2, var3, var4, var5, var7);
      }

   }

   public Class19 d(Class19 var1) {
      if (var1 == null) {
         return this;
      } else if (var1.g() < this.o) {
         var1.k(this);
         return var1;
      } else if (this.f == null) {
         this.f = var1;
         return this;
      } else {
         this.f = this.f.d(var1);
         return this;
      }
   }

   public Class19 c(int var1, String var2) {
      if (this.o == var1) {
         long var3;
         if (Class394.i(var2) && Class330.ac(var3 = Long.parseLong(var2), -4 >> 2) != null) {
            if (this.m == var3) {
               return this;
            } else {
               synchronized(this) {
                  this.m = var3;
                  this.l();
                  return this;
               }
            }
         } else {
            Class277 var10000 = new Class277(var2, this.h, var1, this.j);
            var10000.k(this.f);
            return var10000;
         }
      } else {
         return (Class19)(this.f != null ? this.f.c(var1, var2) : this);
      }
   }


   private boolean b(String var1) {
      return var1.equals(String.valueOf(this.m));
   }

   public void f(Graphics var1, int var2, int var3, int var4, float var5) {
      if (this.o != 5 >> 2) {
         if (this.f != null) {
            this.f.f(var1, var2, var3, var4, var5);
         }

      } else {
         synchronized(this) {
            if (this.n == null) {
               this.l();
            }

            Class330.t.aa(var1, var2, var3);

            int var7;
            for(int var10000 = var7 = 3 ^ 3; var10000 < this.n.length; var10000 = var7) {
               if (this.n[var7] == null) {
                  this.y(var7);
               }

               if (this.n[var7] != null) {
                  this.n[var7].d((long)(this.n[var7].k() - --1), Class330.v(var4, this.n[var7].z()));
                  this.n[var7].p(var1, var2, var3, var5);
               }

               ++var7;
            }

         }
      }
   }

   public void n() {
      synchronized(this) {
         int var2;
         if (this.n != null) {
            for(int var10000 = var2 = 2 & 5; var10000 < this.n.length; var10000 = var2) {
               this.n[var2++] = null;
            }
         }
      }

      if (this.f != null) {
         this.f.n();
      }

   }

   public void t(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         Class188 var10000;
         if (this.l != null) {
            var10000 = this;
            this.l.i(var1, var2, var3, var4, var5, var7);
         } else {
            Class330.t.aa(var1, var2, var3);
            var10000 = this;
         }

         if (var10000.n == null) {
            this.l();
         }

         int var9;
         int var11 = var9 = 0;

         while(true) {
            if (var11 >= this.n.length) {
               break;
            }

            if (this.n[var9] == null) {
               this.y(var9);
            }

            if (this.n[var9] != null) {
               this.n[var9].d(var5, var4);
               this.n[var9].m(var1, var2, var3, var7);
            }

            ++var9;
            var11 = var9;
         }
      }

      if (this.f != null) {
         this.f.t(var1, var2, var3, var4, var5, var7);
      }

   }

   public void y(int var1) {
      this.n[var1] = Class330.n(this.j << (127 & 40) | this.k[var1], this.h);
   }

   public void k(Class19 var1) {
      this.f = var1;
   }

   public Class188(long var1, int var3, int var4, long var5) {
      this.m = var1;
      this.h = var3;
      this.o = var4;
      this.j = var5;
   }

   public void p(Graphics var1, int var2, int var3, int var4, long var5, float var7) {
      synchronized(this) {
         if (this.n == null) {
            this.l();
         }

         Class330.t.aa(var1, var2, var3);

         int var9;
         for(int var10000 = var9 = 2 & 5; var10000 < this.n.length; var10000 = var9) {
            if (this.n[var9] == null) {
               this.y(var9);
            }

            if (this.n[var9] != null) {
               this.n[var9].d(var5, Class330.v(var4, this.n[var9].z()));
               this.n[var9].m(var1, var2, var3, var7);
            }

            ++var9;
         }
      }

      if (this.f != null) {
         this.f.p(var1, var2, var3, var4, var5, var7);
      }

   }

   public int z() {
      return this.o != --1 && this.f != null ? this.f.z() : this.h;
   }

   public int e() {
      if (this.o != (4 ^ 5) && this.f != null) {
         return this.f.e();
      } else {
         Class188 var1 = this;
         synchronized(this) {
            if (this.n == null) {
               this.l();
            }

            Class188 var10000;
            if (this.n.length > --1) {
               if (this.n[3 & 5] != null) {
                  return this.n[3 & 5].k();
               }

               this.y(2 ^ 3);
               var10000 = var1;
            } else {
               if (this.n.length == --1) {
                  if (this.n[3 & 4] != null) {
                     return this.n[3 ^ 3].k();
                  }

                  this.y(3 ^ 3);
               }

               var10000 = var1;
            }

            return 1200;
         }
      }
   }

   public Class19 s() {
      Class188 var1 = new Class188(this.m, this.h, this.o, this.j);
      if (this.f != null) {
         var1.k(this.f.s());
      }

      return var1;
   }

   public void l() {
      this.k = Class330.ac(this.m, this.l != null ? 1 ^ 3 : this.h);
      if (this.n != null && this.n.length == this.k.length) {
         int var1;
         for(int var10000 = var1 = 0; var10000 < this.n.length; var10000 = var1) {
            this.n[var1++] = null;
         }

      } else {
         Class8[] var10001 = new Class8[this.k.length];
         boolean var10003 = true;
         this.n = var10001;
      }
   }

   public Class19 h() {
      return this.f;
   }

   public void r(int var1) {
      Class188 var10000;
      if (this.h != var1) {
         this.h = var1;
         synchronized(this) {
            this.l();
         }

         var10000 = this;
      } else {
         var10000 = this;
      }

      if (var10000.f != null) {
         this.f.r(var1);
      }

   }

   public void q(String var1) {
      if (this.o == (4 ^ 5)) {
         if (var1 == null) {
            this.l = null;
         } else {
            this.l = Class330.f(var1, 5 >> 1, 2 ^ 3, (String)null);
         }
      } else {
         if (this.f != null) {
            this.f.q(var1);
         }

      }
   }

   public boolean x(int var1, int var2) {
      if (this.o == --1) {
         synchronized(this) {
            int var4;
            if (this.n != null) {
               for(int var10000 = var4 = 3 & 4; var10000 < this.n.length; var10000 = var4) {
                  boolean var5;
                  if (this.n[var4] != null && (var5 = this.n[var4].o(var1, var2))) {
                     return var5;
                  }

                  ++var4;
               }
            }
         }
      } else if (this.f != null) {
         return this.f.x(var1, var2);
      }

      return false;
   }

   public Class19 j(String var1) {
      if (this.b(var1)) {
         return this.f;
      } else {
         if (this.f != null) {
            this.f = this.f.j(var1);
         }

         return this;
      }
   }

   public int aa() {
      if (this.o == (2 ^ 3)) {
         synchronized(this) {
            int var2;
            if (this.n != null) {
               for(int var10000 = var2 = 3 >> 2; var10000 < this.n.length; var10000 = var2) {
                  if (this.n[var2] != null) {
                     return this.n[var2].z();
                  }

                  ++var2;
               }
            }
         }
      } else if (this.f != null) {
         return this.f.aa();
      }

      return 2;
   }

   public int m() {
      if (this.o == (3 & 5)) {
         synchronized(this) {
            if (this.n != null) {
               int var2 = 2 & 5;

               int var3;
               for(int var10000 = var3 = 3 ^ 3; var10000 < this.n.length; var10000 = var3) {
                  if (this.n[var3] != null && this.n[var3].q() > var2) {
                     var2 = this.n[var3].q();
                  }

                  ++var3;
               }

               return var2;
            }
         }
      } else if (this.f != null) {
         return this.f.m();
      }

      return -1;
   }

   public void u() {
   }
}
