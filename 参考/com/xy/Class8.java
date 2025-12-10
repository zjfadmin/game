package com.xy;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.HashMap;
import java.util.Map;

public class Class8 {
   private int a;
   private Class233 b;
   private Class434 c;
   public static Map<Float, AlphaComposite> d = new HashMap();
   private Class233[] e;
   private static AffineTransform f = new AffineTransform();
   public static AlphaComposite g = AlphaComposite.getInstance(--3, 1.0F);
   private short h;
   private int i;
   public static AlphaComposite j = AlphaComposite.getInstance(--3, 0.4F);
   private int k;
   private int l;
   public static AlphaComposite m = AlphaComposite.getInstance(--3, 0.6F);
   public static AlphaComposite n = AlphaComposite.getInstance(--3, 0.5F);
   private int o;
   private short p;
   private int q;
   private int r;
   private int s;

   public void a(int var1) {
      this.r = var1;
   }

   public void b(short var1) {
      this.p = var1;
   }

   public Class233[] c() {
      return this.e;
   }

   public void d(long var1, int var3) {
      try {
         if (var1 < 0L) {
            var1 = var1 % (long)this.k() + (long)this.k();
         }

         this.q = --1;
         var3 %= this.s;
         var1 = (var1 /= 100L) % (long)this.i;
         this.b = this.e[(int)((long)(var3 * this.i) + var1)];
         if (this.r == -4 >> 2 && this.b.g() == null) {
            this.r = var3;
            Class330.p(this);
            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public Class233 e(int var1) {
      return this.e[var1 * this.i];
   }

   public int f() {
      return this.r;
   }

   public short g() {
      return this.h;
   }

   public short h() {
      return this.p;
   }

   public int i() {
      return this.a;
   }

   public void j(int var1, int var2) {
      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < this.i; var10000 = var3) {
         Class233 var4 = this.e[var1 * this.i + var3];
         Class233 var5 = this.e[var2 * this.i + var3];
         Image var10001 = var4.g();
         int var10002 = var4.k();
         ++var3;
         var5.m(var10001, var10002, var4.i());
      }

   }

   public int k() {
      return this.i * (116 & 111);
   }

   public static int l(int var0, int var1) {
      if (var0 == --4) {
         return var1 == 5 >> 2 ? 5 >> 2 : 0;
      } else if (var0 == 0) {
         return var1 == --1 ? --4 : 7;
      } else if (var0 == (71 & 63)) {
         return var1 == --1 ? 5 >> 3 : 3;
      } else if (var0 == --3) {
         return var1 == 5 >> 2 ? 103 & 31 : 6;
      } else if (var0 == (15 & 118)) {
         return var1 == --1 ? --3 : 2;
      } else if (var0 == 5 >> 1) {
         return var1 == (3 & 5) ? 54 & 79 : 5;
      } else if (var0 == --5) {
         return var1 == (4 ^ 5) ? 1 ^ 3 : 1;
      } else {
         return var1 == (4 ^ 5) ? --5 : 4;
      }
   }

   public void m(Graphics var1, int var2, int var3, float var4) {
      if (var4 == 1.0F) {
         this.t(var1, var2, var3);
      } else {
         Graphics2D var7 = (Graphics2D)var1;
         Composite var5 = null;

         Composite var10000;
         label24: {
            try {
               var5 = var7.getComposite();
               var7.setComposite(var4 == 0.6F ? m : AlphaComposite.getInstance(3, var4));
               this.t(var7, var2, var3);
            } catch (Exception var6) {
               var10000 = var5;
               var6.printStackTrace();
               break label24;
            }

            var10000 = var5;
         }

         if (var10000 != null) {
            var7.setComposite(var5);
         }

      }
   }

   public Class8(int var1, Class233[] var2, int var3, int var4, Class434 var5, int var6, int var7, short var8, short var9) {
      int var10015 = 3 ^ 3;
      int var10022 = -4 >> 2;
      int var10024 = 3 >> 2;
      super();
      this.q = var10024;
      this.r = var10022;
      this.o = var1;
      this.e = var2;
      this.b = var2[var10015];
      this.s = var3;
      this.i = var4;
      this.c = var5;
      this.l = var6;
      this.a = var7;
      this.h = var8;
      this.p = var9;
   }

   public Class434 n() {
      return this.c;
   }

   public boolean o(int var1, int var2) {
      try {
         if (this.b.g() != null) {
            Image var3 = this.b.g();
            int var10000;
            if (this.b.n() != 0) {
               var1 = this.b.k() - var1;
               var10000 = var2;
            } else {
               var1 += this.b.k();
               var10000 = var2;
            }

            var2 = var10000 + this.b.i();
            if (var1 >= 0 && var1 < var3.getWidth((ImageObserver)null) && var2 >= 0 && var2 < var3.getHeight((ImageObserver)null)) {
               if (var3 instanceof BufferedImage) {
                  if (((BufferedImage)var3).getRGB(var1, var2) != 0) {
                     return (boolean)(3 >> 1);
                  }

                  return false;
               }

               return true;
            }

            return false;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         return false;
      }

      return (boolean)(2 & 5);
   }

   public void p(Graphics var1, int var2, int var3, float var4) {
      if (var4 == 1.0F) {
         this.aa(var1, var2, var3);
      } else {
         Graphics2D var7 = (Graphics2D)var1;
         Composite var5 = null;

         Composite var10000;
         label19: {
            try {
               var5 = var7.getComposite();
               var7.setComposite(v(var4));
               this.aa(var7, var2, var3);
            } catch (Exception var6) {
               var10000 = var5;
               var6.printStackTrace();
               break label19;
            }

            var10000 = var5;
         }

         if (var10000 != null) {
            var7.setComposite(var5);
         }

      }
   }

   public int q() {
      return this.k;
   }

   public int r() {
      return this.l;
   }

   public void s() {
      int var10000 = 5 >> 3;
      this.r = -4 >> 2;

      for(int var1 = var10000; var10000 < this.e.length; var10000 = var1) {
         if (this.e[var1].g() == null) {
            this.ab();
            return;
         }

         ++var1;
      }

      this.c.f();
      this.c = null;
      this.ab();
   }

   public void t(Graphics var1, int var2, int var3) {
      if (this.b.g() != null) {
         if (this.b.n() == 0) {
            var2 -= this.b.k();
            var3 -= this.b.i();
            Class330.aa((Graphics2D)var1, var2, var3, (AffineTransform)null, (BufferedImage)this.b.g());
            return;
         }

         Graphics2D var4 = (Graphics2D)var1;
         var2 += this.b.k();
         var3 -= this.b.i();
         f.setToIdentity();
         f.scale(-1.0D, 1.0D);
         f.translate((double)(-var2), (double)var3);
         Class330.aa(var4, var2, var3, f, (BufferedImage)this.b.g());
      }

   }

   public void u(short var1) {
      this.h = var1;
   }

   public static AlphaComposite v(float var0) {
      AlphaComposite var1;
      if ((var1 = (AlphaComposite)d.get(var0)) == null) {
         d.put(var0, var1 = AlphaComposite.getInstance(--3, var0));
      }

      return var1;
   }

   public int w() {
      return this.q;
   }

   public int x() {
      return this.i;
   }

   public void y(int var1) {
      this.q = var1;
   }

   public int z() {
      return this.s;
   }

   static {
      d.put(0.4F, j);
      d.put(0.5F, n);
      d.put(0.6F, m);
      d.put(1.0F, g);
   }

   public void aa(Graphics var1, int var2, int var3) {
      if (this.b.g() != null) {
         if (this.b.n() == 0) {
            var2 -= this.b.k();
            var3 -= this.b.i();
            var1.drawImage(this.b.g(), var2, var3, this.b.e(), this.b.f(), (ImageObserver)null);
            return;
         }

         Graphics2D var4 = (Graphics2D)var1;
         var2 += this.b.k();
         var3 -= this.b.i();
         f.setToIdentity();
         f.scale(-1.0D, 1.0D);
         f.translate((double)(-var2), (double)var3);
         var4.drawImage(this.b.g(), f, (ImageObserver)null);
      }

   }

   public void ab() {
      int var1 = -99999;

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.e.length; var10000 = var2) {
         Class233 var3;
         if ((var3 = this.e[var2]).g() != null && var3.i() + var3.f() > var1) {
            var1 = var3.i() + var3.f();
         }

         ++var2;
      }

      if (var1 == -99999) {
         var1 = 3 & 4;
      }

      this.k = var1;
      if (this.k >= (20959 & 11943)) {
         this.k = 12183 & 20719;
      }

   }

   public Class233 ac() {
      return this.b;
   }

   public int ad() {
      return this.o;
   }
}
