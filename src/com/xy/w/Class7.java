package com.xy.w;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Vector;

public class Class7 {
   private long a;
   private static final long b = 1L;
   private Class3 c;
   private int d;
   private int e;
   private long f;
   private Object g = new Object();
   private Vector<Class3> h;

   public void a(Vector<Class3> var1) {
      this.h = var1;
   }

   public Class3 b() {
      return this.c;
   }

   public Object c() {
      return this.g;
   }

   public int d() {
      return this.d;
   }

   public void e() {
      synchronized (this.g) {
         this.f = 0L;
         this.d = 0;
         this.c = this.h.size() > 0 ? this.h.get(0) : null;
      }
   }

   public Class7() {
      this.h = new Vector<>();
   }

   public void f(Class3 var1) {
      this.c = var1;
   }

   public Class7(Vector<Class3> var1) {
      this.h = var1;
      this.c = var1.get(0);
      this.e = var1.size();
      this.a = 100 * this.e;
   }

   public void g(BufferedImage var1, int var2, int var3) {
      synchronized (this.g) {
         this.a += 100L;
         Class3 var5 = new Class3(var1, var2, var3);
         this.h.add(var5);
         this.e++;
         this.c = var5;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int h() {
      Object var1 = this.g;
      synchronized (this.g) {
         int var10000;
         Object var10001;
         if (this.c == null) {
            var10000 = 0;
            var10001 = var1;
         } else {
            var10000 = this.c.l();
            var10001 = var1;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public boolean i(int var1, int var2) {
      return this.c.c(var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int j() {
      Object var1 = this.g;
      synchronized (this.g) {
         int var10000;
         Object var10001;
         if (this.c == null) {
            var10000 = 0;
            var10001 = var1;
         } else {
            var10000 = this.c.f();
            var10001 = var1;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public void k(Class3 var1) {
      synchronized (this.g) {
         this.a += 100L;
         this.h.add(var1);
         this.e++;
         this.c = var1;
      }
   }

   public Class7 l() {
      return new Class7(this);
   }

   public void m() {
      Iterator var2;
      for (Iterator var10000 = var2 = this.h.iterator(); var10000.hasNext(); var10000 = var2) {
         ((Class3)var2.next()).k();
      }

      this.h.clear();
   }

   public static String n(String var0) {
      int var10000 = 3 << 3 ^ 3 ^ 5;
      int var10001 = (3 ^ 5) << 3 ^ 2 ^ 5;
      int var10002 = 5 << 4 ^ 2 ^ 5;
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

   public void o(long var1) {
      this.f = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int p() {
      Object var1 = this.g;
      synchronized (this.g) {
         int var10000;
         Object var10001;
         if (this.c == null) {
            var10000 = 0;
            var10001 = var1;
         } else {
            var10000 = this.c.n();
            var10001 = var1;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public void q(Object var1) {
      this.g = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Image r() {
      Object var1 = this.g;
      synchronized (this.g) {
         Image var10000;
         Object var10001;
         if (this.c == null) {
            var10000 = null;
            var10001 = var1;
         } else {
            var10000 = this.c.h();
            var10001 = var1;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public void s(long var1) {
      synchronized (this.g) {
         Class7 var10000;
         if (this.e > 1) {
            this.f = var1;
            this.d = (int)(this.f / 100L);
            this.d = this.d % this.e;
            this.c = this.h.get(this.d);
            var10000 = this;
         } else {
            if (this.e > 0) {
               this.c = this.h.get(0);
            }

            var10000 = this;
         }

         var10000.g.notifyAll();
      }
   }

   // $VF: synthetic method
   // $VF: bridge method
   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.l();
   }

   public long t() {
      return this.a;
   }

   public Vector<Class3> u() {
      return this.h;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int v() {
      Object var1 = this.g;
      synchronized (this.g) {
         int var10000;
         Object var10001;
         if (this.c == null) {
            var10000 = 0;
            var10001 = var1;
         } else {
            var10000 = this.c.a();
            var10001 = var1;
         }

         // $VF: monitorexit
         return var10000;
      }
   }

   public Class7(Class7 var1) {
      this.a = var1.a;
      this.h = var1.h;
      this.c = var1.c;
      this.e = var1.u().size();
   }

   public static long w() {
      return 1L;
   }

   public void x(long var1) {
      this.f += var1;
      this.s(this.f);
   }

   public void y(int var1) {
      this.d = var1;
      this.c = this.h.get(var1);
   }

   public long z() {
      return this.f;
   }

   public void aa(long var1) {
      this.a = var1;
   }
}
