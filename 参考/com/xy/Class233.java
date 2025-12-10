package com.xy;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Class233 {
   private static final long a = 2191491798990378838L;
   private int b;
   private int c;
   private Image d;
   private int e;

   public void a() {
      this.d = null;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public boolean c(int var1, int var2) {
      if (this.d == null) {
         return (boolean)(3 & 4);
      } else {
         int var10000;
         if (this.b != 0) {
            var1 = this.e - var1;
            var10000 = var2;
         } else {
            var1 += this.e;
            var10000 = var2;
         }

         var2 = var10000 + this.c;
         if (var1 >= 0 && var1 < this.d.getWidth((ImageObserver)null) && var2 >= 0 && var2 < this.d.getHeight((ImageObserver)null)) {
            if (this.d instanceof BufferedImage) {
               return (boolean)(((BufferedImage)this.d).getRGB(var1, var2) != 0 ? 4 ^ 5 : 0);
            } else {
               return true;
            }
         } else {
            return false;
         }
      }
   }

   protected void d(Graphics2D var1, int var2, int var3, int var4, int var5) {
      var2 -= this.e;
      var3 -= this.c;
      var1.drawImage(this.d, var2, var3, var2 + var4, var3 + var5, 3 ^ 3, 3 ^ 3, var4, var5, (ImageObserver)null);
   }

   public int e() {
      return this.d.getWidth((ImageObserver)null);
   }

   public int f() {
      return this.d.getHeight((ImageObserver)null);
   }

   public Image g() {
      return this.d;
   }

   public Class233(Image var1, int var2, int var3) {
      this.d = var1;
      this.e = var2;
      this.c = var3;
   }

   public void h(int var1) {
      this.b = var1;
   }

   public int i() {
      return this.c;
   }

   public Class233(int var1) {
      this.b = var1;
   }

   public void j(BufferedImage var1) {
      this.b = 3 ^ 3;
      this.d = var1;
   }

   public int k() {
      return this.e;
   }

   public void l(int var1) {
      this.e = var1;
   }

   public Class233(BufferedImage var1, int var2, int var3) {
      this.d = var1;
      this.e = var2;
      this.c = var3;
   }

   public void m(Image var1, int var2, int var3) {
      this.b = 2 ^ 3;
      this.e = var2;
      this.c = var3;
      this.d = var1;
   }

   public int n() {
      return this.b;
   }
}
