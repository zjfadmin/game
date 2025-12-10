package com.xy;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Class604 {
   private Image a;
   private int b;
   private int c;
   private int d;
   private Image e;
   private int f;

   public Class604 a(int var1, int var2, int var3, int var4) {
      this.c = var1;
      this.f = var4;
      this.b = var3;
      this.d = var4;
      return this;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.f;
   }

   public void d(Graphics var1) {
      this.g(var1, this.a.getWidth((ImageObserver)null) + this.c + this.b, this.a.getHeight((ImageObserver)null) + this.f + this.d);
   }

   public Class604(Image var1, int var2, int var3, int var4, int var5) {
      this.e = var1;
      this.c = var2;
      this.f = var3;
      this.b = var4;
      this.d = var5;
   }

   public void e(Image var1) {
      this.a = var1;
   }

   public Class604(Class604 var1) {
      this(var1.e, var1.c, var1.f, var1.b, var1.d);
   }

   public Image f() {
      return this.e;
   }

   public void g(Graphics var1, int var2, int var3) {
      var1.drawImage(this.e, 3 ^ 3, 3 ^ 3, this.c, this.f, 2 & 5, 2 & 5, this.c, this.f, (ImageObserver)null);
      var1.drawImage(this.e, this.c, 3 & 4, var2 - this.b, this.f, this.c, 3 & 4, this.e.getWidth((ImageObserver)null) - this.b, this.f, (ImageObserver)null);
      var1.drawImage(this.e, 3 ^ 3, this.f, this.c, var3 - this.d, 2 & 5, this.f, this.c, this.e.getHeight((ImageObserver)null) - this.d, (ImageObserver)null);
      var1.drawImage(this.e, 3 >> 2, var3 - this.d, this.c, var3, 2 & 5, this.e.getHeight((ImageObserver)null) - this.d, this.c, this.e.getHeight((ImageObserver)null), (ImageObserver)null);
      var1.drawImage(this.e, var2 - this.b, var3 - this.d, var2, var3, this.e.getWidth((ImageObserver)null) - this.b, this.e.getHeight((ImageObserver)null) - this.d, this.e.getWidth((ImageObserver)null), this.e.getHeight((ImageObserver)null), (ImageObserver)null);
      var1.drawImage(this.e, this.c, var3 - this.d, var2 - this.b, var3, this.c, this.e.getHeight((ImageObserver)null) - this.d, this.e.getWidth((ImageObserver)null) - this.b, this.e.getHeight((ImageObserver)null), (ImageObserver)null);
      var1.drawImage(this.e, var2 - this.b, this.f, var2, var3 - this.d, this.e.getWidth((ImageObserver)null) - this.b, this.f, this.e.getWidth((ImageObserver)null), this.e.getHeight((ImageObserver)null) - this.d, (ImageObserver)null);
      var1.drawImage(this.e, var2 - this.b, 2 & 5, var2, this.f, this.e.getWidth((ImageObserver)null) - this.b, 3 ^ 3, this.e.getWidth((ImageObserver)null), this.f, (ImageObserver)null);
      if (this.a != null) {
         var1.drawImage(this.a, this.c, this.f, var2 - this.c - this.b, var3 - this.f - this.d, (ImageObserver)null);
      } else {
         var1.drawImage(this.e, this.c, this.f, var2 - this.b, var3 - this.d, this.c, this.f, this.e.getWidth((ImageObserver)null) - this.b, this.e.getHeight((ImageObserver)null) - this.d, (ImageObserver)null);
      }
   }

   public Image h() {
      return this.a;
   }

   public int i() {
      return this.b;
   }

   public int j() {
      return this.d;
   }
}
