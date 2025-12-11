package com.xy.w;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Class1 {
   private static AffineTransform a = new AffineTransform();
   private int b;
   public static AlphaComposite c = AlphaComposite.getInstance(3, 1.0F);
   private int d;
   private Class3[] e;
   private Class10 f;
   private int g;
   private short h;
   private int i = 0;
   private int j = -1;
   public static AlphaComposite k = AlphaComposite.getInstance(3, 0.4F);
   public static AlphaComposite l = AlphaComposite.getInstance(3, 0.6F);
   private Class3 m;
   private int n;
   private int o;
   public static Map<Float, AlphaComposite> p = new HashMap<>();
   private short q;
   public static AlphaComposite r = AlphaComposite.getInstance(3, 0.5F);

   static {
      p.put(0.4F, k);
      p.put(0.5F, r);
      p.put(0.6F, l);
      p.put(1.0F, c);
   }

   public int a() {
      return this.g * 100;
   }

   public Class3[] b() {
      return this.e;
   }

   public Class3 c() {
      return this.m;
   }

   public short d() {
      return this.h;
   }

   public static AlphaComposite e(float var0) {
      AlphaComposite var1;
      if ((var1 = p.get(var0)) == null) {
         p.put(var0, var1 = AlphaComposite.getInstance(3, var0));
      }

      return var1;
   }

   public void f(short var1) {
      this.q = var1;
   }

   public void g(Graphics var1, int var2, int var3, float var4) {
      if (var4 == 1.0F) {
         this.h(var1, var2, var3);
      } else {
         Graphics2D var5 = (Graphics2D)var1;
         Composite var6 = null;

         Composite var10000;
         label27: {
            try {
               var6 = var5.getComposite();
               var5.setComposite(var4 == 0.6F ? l : AlphaComposite.getInstance(3, var4));
               this.h(var5, var2, var3);
            } catch (Exception var8) {
               var10000 = var6;
               var8.printStackTrace();
               break label27;
            }

            var10000 = var6;
         }

         if (var10000 != null) {
            var5.setComposite(var6);
         }
      }
   }

   public void h(Graphics var1, int var2, int var3) {
      if (this.m.h() != null) {
         if (this.m.b() == 0) {
            var2 -= this.m.f();
            var3 -= this.m.l();
            Class11.al((Graphics2D)var1, var2, var3, null, (BufferedImage)this.m.h());
            return;
         }

         Graphics2D var4 = (Graphics2D)var1;
         var2 += this.m.f();
         var3 -= this.m.l();
         a.setToIdentity();
         a.scale(-1.0, 1.0);
         a.translate(-var2, var3);
         Class11.al(var4, var2, var3, a, (BufferedImage)this.m.h());
      }
   }

   public Class3 i(int var1) {
      return this.e[var1 * this.g];
   }

   public void j(long var1, int var3) {
      try {
         if (var1 < 0L) {
            var1 = var1 % this.a() + this.a();
         }

         this.i = 1;
         var3 %= this.n;
         long var6;
         var1 = (var6 = var1 / 100L) % this.g;
         this.m = this.e[(int)(var3 * this.g + var1)];
         if (this.j == -1 && this.m.h() == null) {
            this.j = var3;
            Class11.ac(this);
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void k(Graphics var1, int var2, int var3, float var4) {
      if (var4 == 1.0F) {
         this.ab(var1, var2, var3);
      } else {
         Graphics2D var5 = (Graphics2D)var1;
         Composite var6 = null;

         Composite var10000;
         label21: {
            try {
               var6 = var5.getComposite();
               var5.setComposite(e(var4));
               this.ab(var5, var2, var3);
            } catch (Exception var8) {
               var10000 = var6;
               var8.printStackTrace();
               break label21;
            }

            var10000 = var6;
         }

         if (var10000 != null) {
            var5.setComposite(var6);
         }
      }
   }

   public static int l(int var0, int var1) {
      if (var0 == 4) {
         return var1 == 1 ? 1 : 0;
      } else if (var0 == 0) {
         return var1 == 1 ? 4 : 7;
      } else if (var0 == 7) {
         return var1 == 1 ? 0 : 3;
      } else if (var0 == 3) {
         return var1 == 1 ? 7 : 6;
      } else if (var0 == 6) {
         return var1 == 1 ? 3 : 2;
      } else if (var0 == 2) {
         return var1 == 1 ? 6 : 5;
      } else if (var0 == 5) {
         return var1 == 1 ? 2 : 1;
      } else {
         return var1 == 1 ? 5 : 4;
      }
   }

   public int m() {
      return this.i;
   }

   public int n() {
      return this.j;
   }

   public int o() {
      return this.d;
   }

   public void p(int var1) {
      this.j = var1;
   }

   public short q() {
      return this.q;
   }

   public int r() {
      return this.b;
   }

   public Class1(Class3[] var1, int var2, int var3, Class10 var4, int var5, int var6, short var7, short var8) {
      this.e = var1;
      this.m = var1[0];
      this.n = var2;
      this.g = var3;
      this.f = var4;
      this.b = var5;
      this.o = var6;
      this.q = var7;
      this.h = var8;
   }

   public boolean s(int var1, int var2) {
      try {
         if (this.m.h() == null) {
            return false;
         }

         Image var3 = this.m.h();
         int var10000;
         if (this.m.b() != 0) {
            var1 = this.m.f() - var1;
            var10000 = var2;
         } else {
            var1 += this.m.f();
            var10000 = var2;
         }

         var2 = var10000 + this.m.l();
         if (var1 >= 0 && var1 < var3.getWidth(null) && var2 >= 0 && var2 < var3.getHeight(null)) {
            if (var3 instanceof BufferedImage) {
               if (((BufferedImage)var3).getRGB(var1, var2) != 0) {
                  return true;
               }

               return false;
            }

            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return false;
   }

   public int t() {
      return this.o;
   }

   public void u(short var1) {
      this.h = var1;
   }

   public void v() {
      int var1 = -99999;

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.e.length; var10000 = ++var2) {
         Class3 var3;
         if ((var3 = this.e[var2]).h() != null && var3.l() + var3.a() > var1) {
            var1 = var3.l() + var3.a();
         }
      }

      if (var1 == -99999) {
         var1 = 0;
      }

      this.d = var1;
      if (this.d >= 135) {
         this.d = 135;
      }
   }

   public int w() {
      return this.g;
   }

   public void x(int var1, int var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < this.g; var10000 = var3) {
         Class3 var4 = this.e[var1 * this.g + var3];
         Class3 var5 = this.e[var2 * this.g + var3];
         Image var10001 = var4.h();
         int var10002 = var4.f();
         var3++;
         var5.d(var10001, var10002, var4.l());
      }
   }

   public Class10 y() {
      return this.f;
   }

   public int z() {
      return this.n;
   }

   public void aa(int var1) {
      this.i = var1;
   }

   public void ab(Graphics var1, int var2, int var3) {
      if (this.m.h() != null) {
         if (this.m.b() == 0) {
            var2 -= this.m.f();
            var3 -= this.m.l();
            var1.drawImage(this.m.h(), var2, var3, this.m.n(), this.m.a(), null);
            return;
         }

         Graphics2D var4 = (Graphics2D)var1;
         var2 += this.m.f();
         var3 -= this.m.l();
         a.setToIdentity();
         a.scale(-1.0, 1.0);
         a.translate(-var2, var3);
         var4.drawImage(this.m.h(), a, null);
      }
   }

   public void ac() {
      int var10000 = 0;
      this.j = -1;

      for (int var1 = 0; var10000 < this.e.length; var10000 = ++var1) {
         if (this.e[var1].h() == null) {
            this.v();
            return;
         }
      }

      this.f.h();
      this.f = null;
      this.v();
   }
}
