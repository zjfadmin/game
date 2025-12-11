package com.xy.a;

import java.awt.Color;

class Class0 extends com.xy.w.Class18 {
   private com.xy.q.Class14[] k;
   // $VF: synthetic field
   final Class74 q;

   public Class0(Class74 var1) {
      super(com.xy.w.Class16.m("sc/c/25", 5, 5, 5, 5, false));
      this.q = var1;
      this.k = new com.xy.q.Class14[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.k.length; var10000 = var2) {
         this.k[var2] = new com.xy.q.Class14();
         this.k[var2].setFont(com.xy.q.Class49.ac);
         this.k[var2].setForeground(Color.white);
         this.k[var2].setHorizontalAlignment(0);
         this.k[var2].addMouseListener(new com.xy.q.Class9(2 + var2, var1.eg()));
         com.xy.q.Class14 var3 = this.k[var2];
         String var4;
         if (var2 == 0) {
            var4 = "弾剼";
            var4 = "当前";
         } else if (var2 == 1) {
            var4 = "练陷";
            var4 = "组队";
         } else if (var2 == 2) {
            var4 = "幃洏";
            var4 = "帮派";
         } else if (var2 == 3) {
            var4 = "丑甤";
            var4 = "世界";
         } else {
            var4 = "位韂";
            var4 = "传音";
         }

         var3.setText(var4);
         this.k[var2].setBounds(1, 1 + 18 * var2, 45, 18);
         this.add(this.k[var2++]);
      }
   }

   public void n(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.k.length; var10000 = ++var2) {
         com.xy.q.Class14 var3 = this.k[var2];
         com.xy.w.Class9 var4;
         if (var2 == var1) {
            String var10001 = "\u001bdGdG5^";
            var4 = com.xy.w.Class16.m("sc/c/26", 5, 5, 5, 5, false);
         } else {
            var4 = null;
         }

         var3.mt(var4);
      }
   }
}
