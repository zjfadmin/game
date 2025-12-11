package com.xy.a.a;

import java.awt.Graphics;

class Class40 extends com.xy.q.Class50 {
   // $VF: synthetic field
   final Class27 ala;

   Class40(Class27 var1) {
      this.ala = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (Class27.tu(this.ala) == null) {
         String var10001 = "\u0011^";
         Class27.ts(this.ala, com.xy.w.Class11.x(com.xy.w.Class15.p("zt")));
      }

      if (Class27.tu(this.ala) != null) {
         Class27.tu(this.ala).j(com.xy.v.Class22.l(), 0);
         Class27.tu(this.ala).ab(var1, 7, 3);
      }
   }
}
