package com.xy.a.q;

import com.xy.bean.GoodTrans;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;

class Class89 {
   private int a;
   private String b;
   private String c;
   private GoodTrans d;
   // $VF: synthetic field
   final Class108 e;
   private BigDecimal f;

   public void a(long var1) {
      if (this.f != null) {
         com.xy.q.Class49.b(Class108.amx(this.e)[0], var1);
      }
   }

   // $VF: synthetic method
   static String b(Class89 var0) {
      return var0.c;
   }

   Class89(Class108 var1) {
      this.e = var1;
   }

   // $VF: synthetic method
   static GoodTrans c(Class89 var0) {
      return var0.d;
   }

   // $VF: synthetic method
   static void d(Class89 var0, GoodTrans var1) {
      var0.d = var1;
   }

   public void e(int var1) {
      this.a = var1;
      if (this.a == 0) {
         this.b = null;
         com.xy.w.Class18 var3 = Class108.amz(this.e)[this.f == null ? 3 : 4];
         String var5 = "*mvkv<` )`>";
         var3.dp("sc/e/29.png");
      } else if (this.a == 1) {
         this.b = "未确定";
         com.xy.w.Class18 var2 = Class108.amz(this.e)[this.f == null ? 3 : 4];
         String var4 = "kh7n78(%he\u007f";
         var2.dp("sc/e/30.png");
      } else {
         if (this.a == 2) {
            this.b = "已确定";
            com.xy.w.Class18 var10000 = Class108.amz(this.e)[this.f == null ? 3 : 4];
            String var10001 = "*mvkv=i )`>";
            var10000.dp("sc/e/30.png");
         }
      }
   }

   protected void f(Graphics var1) {
      if (this.c != null) {
         var1.setColor(Color.red);
         var1.drawString(this.c, 313, 290);
         if (this.d != null) {
            this.d.a(var1, 1);
         }

         if (this.b != null) {
            var1.setColor(Color.RED);
            var1.drawString(this.b, 473, 290);
            return;
         }
      } else {
         var1.setColor(Color.white);
         if (this.d != null) {
            this.d.a(var1, 0);
         }

         if (this.b != null) {
            var1.setColor(Color.RED);
            var1.drawString(this.b, 160, 280);
         }
      }
   }

   // $VF: synthetic method
   static void g(Class89 var0, BigDecimal var1) {
      var0.f = var1;
   }

   public void h(BigDecimal var1, String var2) {
      this.f = var1;
      this.c = var2;
      this.d = new GoodTrans();
      this.e(0);
      this.a(0L);
   }

   // $VF: synthetic method
   static BigDecimal i(Class89 var0) {
      return var0.f;
   }

   // $VF: synthetic method
   static int j(Class89 var0) {
      return var0.a;
   }
}
