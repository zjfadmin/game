package com.xy.a.i;

import java.awt.Image;
import java.awt.event.MouseEvent;

class Class40 extends com.xy.i.Class5 {
   private int eg;
   // $VF: synthetic field
   final Class22 ahy;

   @Override
   public void cw(MouseEvent var1) {
      if (this.eg == -1) {
         this.ahy.zc().b(138);
      }
   }

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   public Class40(Class22 var1, int var2) {
      super(null, 1, null, var1.eg());
      this.ahy = var1;
      this.eg = var2;
      if (var2 == -1) {
         Image[] var3 = new Image[3];
         String var10000 = "iV5W{[}\u001aBeXAtmJ\u001bnVj";
         com.xy.w.Class1 var4;
         if ((var4 = com.xy.w.Class11.f("sc/bang/XPBtnXP.tcp", null)) != null) {
            var3[0] = com.xy.w.Class11.r(var4.y(), var4.b()[0], var4);
            var3[1] = com.xy.w.Class11.r(var4.y(), var4.b()[2], var4);
            var3[2] = com.xy.w.Class11.r(var4.y(), var4.b()[1], var4);
         }

         if (var3[0] == null || var3[1] == null || var3[2] == null) {
            var3[0] = var3[1] = var3[2] = com.xy.w.Class16.i();
         }

         this.ro(var3);
      }
   }
}
