package com.xy.w;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Class3 {
   private Image a;
   private int b;
   private static final long c = 2191491798990378838L;
   private int d;
   private int e;

   public int a() {
      return this.a.getHeight(null);
   }

   public int b() {
      return this.e;
   }

   public boolean c(int var1, int var2) {
      if (this.a == null) {
         return false;
      } else {
         int var10000;
         if (this.e != 0) {
            var1 = this.d - var1;
            var10000 = var2;
         } else {
            var1 += this.d;
            var10000 = var2;
         }

         var2 = var10000 + this.b;
         if (var1 < 0 || var1 >= this.a.getWidth(null) || var2 < 0 || var2 >= this.a.getHeight(null)) {
            return false;
         } else {
            return this.a instanceof BufferedImage ? ((BufferedImage)this.a).getRGB(var1, var2) != 0 : true;
         }
      }
   }

   public void d(Image var1, int var2, int var3) {
      this.e = 1;
      this.d = var2;
      this.b = var3;
      this.a = var1;
   }

   protected void e(Graphics2D var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - this.d;
      int var7 = var3 - this.b;
      var1.drawImage(this.a, var6, var7, var6 + var4, var7 + var5, 0, 0, var4, var5, null);
   }

   public Class3(int var1) {
      this.e = var1;
   }

   public Class3(BufferedImage var1, int var2, int var3) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
   }

   public int f() {
      return this.d;
   }

   public void g(int var1) {
      this.b = var1;
   }

   public Image h() {
      return this.a;
   }

   public void i(int var1) {
      this.d = var1;
   }

   public Class3(Image var1, int var2, int var3) {
      this.a = var1;
      this.d = var2;
      this.b = var3;
   }

   public void j(int var1) {
      this.e = var1;
   }

   public void k() {
      this.a = null;
   }

   public int l() {
      return this.b;
   }

   public void m(BufferedImage var1) {
      this.e = 0;
      this.a = var1;
   }

   public int n() {
      return this.a.getWidth(null);
   }
}
