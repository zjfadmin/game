package com.xy;

import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Point;

public class Class427 {
   private <undefinedtype> a;
   private Class19 b;
   private <undefinedtype> c;
   private int d;
   private <undefinedtype> e;

   public void a(Class292 var1, boolean var2) {
      this.d();
      if (var2 && (this.d += 4 ^ 5) % (125 & 27) == 0) {
         this.d = 3 & 4;
         <undefinedtype> var3 = this.e();
         int var10003 = -4 >> 2;
         var3.a = null;
         var3.h = var1.ab;
         var3.e = var1.al;
         var3.c = var1.as;
         var3.d = var1.an;
         var3.f = var10003;
         var3.g();
         if (this.a != null) {
            this.a.a = var3;
         }

         this.a = var3;
         if (this.c == null) {
            this.c = var3;
         }
      }

   }

   public void b(Object var1) {
      this.e = var1;
   }

   public void c(Graphics var1, GameView var2) {
      <undefinedtype> var3;
      for(<undefinedtype> var10000 = var3 = this.c; var10000 != null; var10000 = var3 = var10000.a) {
         Point var4;
         if ((var4 = var2.mapCamera.i(var3.h, var3.e)) == null) {
            var10000 = var3;
         } else {
            this.b.w(var1, var4.x, var4.y, var3.c, var3.d, var3.g);
            var10000 = var3;
         }
      }

   }

   public void d() {
      <undefinedtype> var1;
      for(<undefinedtype> var10000 = var1 = this.c; var10000 != null; var10000 = var1 = var10000.a) {
         if (!var1.g()) {
            var10000 = var1;
         } else {
            if (var1 == this.c) {
               this.c = var1.a;
            }

            if (var1 == this.a) {
               this.a = null;
            }

            this.b(var1);
            var10000 = var1;
         }
      }

   }

   public Class427(Class292 var1) {
      this.b = var1.af.s();
      this.b.r(2 ^ 3);
   }

   public <undefinedtype> e() {
      if (this.e == null) {
         return (<undefinedtype>)(new Object() {
            public <undefinedtype> a;
            private int c;
            private long d;
            private int e;
            private int f;
            private float g;
            private int h;

            public boolean g() {
               this.f += 5 >> 2;
               <undefinedtype> var10000;
               if (this.f <= (47 & 95)) {
                  var10000 = this;
                  this.g = 0.8F;
               } else if (this.f <= (95 & 62)) {
                  var10000 = this;
                  this.g = 0.6F;
               } else if (this.f <= (127 & 45)) {
                  var10000 = this;
                  this.g = 0.4F;
               } else {
                  var10000 = this;
                  this.g = 0.3F;
               }

               return (boolean)(var10000.f >= (124 & 63) ? 3 & 5 : 0);
            }
         });
      } else {
         <undefinedtype> var1 = this.e;
         this.e = null;
         return var1;
      }
   }
}
