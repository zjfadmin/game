package com.xy.a.q;

import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

class Class48 {
   // $VF: synthetic field
   final Class67 a;
   private com.xy.i.Class19 b;
   private com.xy.w.Class0 c;
   private int d;
   private BigDecimal e;

   // $VF: synthetic method
   static BigDecimal a(Class48 var0) {
      return var0.e;
   }

   public void b(String var1) {
      this.b.setVisible(var1 != null);
      if (var1 == null) {
         Class67.aag(this.a)[6 + 4 * this.d].setText(null);
         Class67.aag(this.a)[7 + 4 * this.d].setText(null);
         Class67.aag(this.a)[8 + 4 * this.d].setText(null);
         Class67.aag(this.a)[9 + 4 * this.d].setText(null);
         this.e = null;
         this.c = null;
      } else {
         String var10001 = "z";
         String[] var2;
         String[] var10000 = var2 = var1.split("=");
         int var3 = Integer.parseInt(var10000[5]);
         int var4 = Integer.parseInt(var10000[6]);
         this.e = new BigDecimal(var2[0]);
         this.c = com.xy.w.Class11.t(var2[1], 7, 1, null);
         Class67.aag(this.a)[6 + 4 * this.d].setText(var2[3]);
         Class67.aag(this.a)[7 + 4 * this.d].setText(com.xy.v.Class4.h(Integer.parseInt(var2[2])));
         Class67.aag(this.a)[8 + 4 * this.d].setText(var2[4]);
         JLabel var5 = Class67.aag(this.a)[9 + 4 * this.d];
         StringBuilder var6 = new StringBuilder(String.valueOf(var4));
         String var10002 = "Y";
         var5.setText(var6.append("/").append(var3 - var4).toString());
      }
   }

   public Class48(Class67 var1, int var2, Class67 var3) {
      this.a = var1;
      this.d = var2;
      String var10006 = "3$o\"opn7. ";
      int var10008 = 58 + var2;
      String var10011 = "膐抪";
      this.b = new com.xy.i.Class19("sc/e/7.png", 1, var10008, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "膜拜", var3);
      this.b.setBounds(68 + 117 * var2, 390, 59, 26);
      var3.add(this.b);
   }

   public void c(Graphics var1) {
      if (this.c != null) {
         this.c.r(var1, 94 + this.d * 117, 286, 0, System.currentTimeMillis());
      }
   }
}
