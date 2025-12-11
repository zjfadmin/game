package com.xy.d;

import com.xy.v.Class22;
import com.xy.w.Class15;
import java.awt.Graphics;
import java.awt.Point;

public class Class6 {
   private long a;
   private String b;
   private int c;
   private com.xy.w.Class1 d;
   public Class6 e;
   private long f;
   private int g;

   public String a() {
      return this.b;
   }

   public Class6(String var1, int var2, int var3) {
      this.b = var1;
      this.b(var2, var3);
   }

   public void b(int var1, int var2) {
      this.c = var1;
      this.g = var2;
      this.a = Class22.l();
      long var10001 = Class22.l();
      String var10003 = "匟纈";
      this.f = var10001 + (this.b.equals("升级") ? com.xy.v.Class0.c / 2L : com.xy.v.Class0.c / 4L);
      if (this.d != null) {
         this.f = this.a + this.d.a();
      }
   }

   public boolean c(Graphics var1, long var2, com.xy.n.Class9 var4) {
      if (var2 > this.f) {
         return true;
      } else {
         Point var5;
         if ((var5 = var4.k(this.c, this.g)) == null) {
            return false;
         } else {
            if (this.d == null) {
               this.d = com.xy.w.Class11.x(Class15.p(this.b));
               if (this.d != null) {
                  this.f = this.a + this.d.a();
               }
            }

            if (this.d != null) {
               this.d.j(var2 - this.a, 0);
               this.d.ab(var1, var5.x, var5.y);
            }

            return false;
         }
      }
   }
}
