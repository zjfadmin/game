package com.xy.w;

import java.awt.Graphics;
import java.awt.Image;

public class Class9 {
   private int a;
   private int b;
   private Image c;
   private Image d;
   private int e;
   private int f;

   public int a() {
      return this.b;
   }

   public Image b() {
      return this.d;
   }

   public Class9 c(int var1, int var2, int var3, int var4) {
      this.b = var1;
      this.e = var4;
      this.f = var3;
      this.a = var4;
      return this;
   }

   public int d() {
      return this.f;
   }

   public int e() {
      return this.a;
   }

   public Class9(Image var1, int var2, int var3, int var4, int var5) {
      this.c = var1;
      this.b = var2;
      this.e = var3;
      this.f = var4;
      this.a = var5;
   }

   public void f(Graphics var1) {
      this.g(var1, this.d.getWidth(null) + this.b + this.f, this.d.getHeight(null) + this.e + this.a);
   }

   public void g(Graphics var1, int var2, int var3) {
      var1.drawImage(this.c, 0, 0, this.b, this.e, 0, 0, this.b, this.e, null);
      var1.drawImage(this.c, this.b, 0, var2 - this.f, this.e, this.b, 0, this.c.getWidth(null) - this.f, this.e, null);
      var1.drawImage(this.c, 0, this.e, this.b, var3 - this.a, 0, this.e, this.b, this.c.getHeight(null) - this.a, null);
      var1.drawImage(this.c, 0, var3 - this.a, this.b, var3, 0, this.c.getHeight(null) - this.a, this.b, this.c.getHeight(null), null);
      var1.drawImage(
         this.c,
         var2 - this.f,
         var3 - this.a,
         var2,
         var3,
         this.c.getWidth(null) - this.f,
         this.c.getHeight(null) - this.a,
         this.c.getWidth(null),
         this.c.getHeight(null),
         null
      );
      var1.drawImage(
         this.c,
         this.b,
         var3 - this.a,
         var2 - this.f,
         var3,
         this.b,
         this.c.getHeight(null) - this.a,
         this.c.getWidth(null) - this.f,
         this.c.getHeight(null),
         null
      );
      var1.drawImage(
         this.c,
         var2 - this.f,
         this.e,
         var2,
         var3 - this.a,
         this.c.getWidth(null) - this.f,
         this.e,
         this.c.getWidth(null),
         this.c.getHeight(null) - this.a,
         null
      );
      var1.drawImage(this.c, var2 - this.f, 0, var2, this.e, this.c.getWidth(null) - this.f, 0, this.c.getWidth(null), this.e, null);
      if (this.d != null) {
         var1.drawImage(this.d, this.b, this.e, var2 - this.b - this.f, var3 - this.e - this.a, null);
      } else {
         var1.drawImage(
            this.c, this.b, this.e, var2 - this.f, var3 - this.a, this.b, this.e, this.c.getWidth(null) - this.f, this.c.getHeight(null) - this.a, null
         );
      }
   }

   public Image h() {
      return this.c;
   }

   public Class9(Class9 var1) {
      this(var1.c, var1.b, var1.e, var1.f, var1.a);
   }

   public int i() {
      return this.e;
   }

   public void j(Image var1) {
      this.d = var1;
   }
}
