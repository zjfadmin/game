package com.xy;

import java.awt.Graphics;
import java.awt.Point;

public class Class230 {
   private long a;
   public Class230 b;
   private int c;
   private String d;
   private int e;
   private Class8 f;
   private long g;

   public boolean a(Graphics var1, long var2, Class205 var4) {
      if (var2 > this.a) {
         return (boolean)(3 >> 1);
      } else {
         Point var5;
         if ((var5 = var4.i(this.c, this.e)) == null) {
            return (boolean)(3 >> 2);
         } else {
            if (this.f == null) {
               this.f = Class330.q(Class222.m(this.d));
               if (this.f != null) {
                  this.a = this.g + (long)this.f.k();
               }
            }

            if (this.f != null) {
               this.f.d(var2 - this.g, 3 & 4);
               this.f.aa(var1, var5.x, var5.y);
            }

            return false;
         }
      }
   }

   public Class230(String var1, int var2, int var3) {
      this.d = var1;
      this.b(var2, var3);
   }

   public void b(int var1, int var2) {
      this.c = var1;
      this.e = var2;
      this.g = Class280.l();
      this.a = Class280.l() + (this.d.equals("升级") ? Class27.d / 2L : Class27.d / 4L);
      if (this.f != null) {
         this.a = this.g + (long)this.f.k();
      }

   }

   public String c() {
      return this.d;
   }
}
