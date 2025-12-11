package com.xy.a;

import java.awt.Graphics;

class Class3 extends com.xy.w.Class18 {
   private int cb;
   private com.xy.w.Class1 cc;
   // $VF: synthetic field
   final Class74 cd;
   private com.xy.i.Class18 ce;
   private boolean cf;

   // $VF: synthetic method
   static boolean bd(Class3 var0) {
      return var0.cf;
   }

   public void be(boolean var1) {
      this.cf = var1;
      this.cc = null;
   }

   public Class3(Class74 var1, int var2) {
      super("sc/c/27");
      String var10006 = "8HdHd\u0019|";
      this.cd = var1;
      this.cb = var2;
      String var10008 = "kh7h7";
      this.ce = new com.xy.i.Class18("sc/c/" + (28 + var2), 1, 10 + var2, var1.eg());
      this.ce.setBounds(3, 3, 33, 33);
      this.add(this.ce);
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.cf) {
         Class3 var10000;
         label25: {
            if (this.cc == null) {
               if (this.cb == 3) {
                  var10000 = this;
                  this.cc = com.xy.w.Class15.f(com.xy.w.Class15.q);
                  break label25;
               }

               if (this.cb == 9) {
                  this.cc = com.xy.w.Class15.f(com.xy.w.Class15.k);
               }
            }

            var10000 = this;
         }

         if (var10000.cc != null) {
            this.cc.j(com.xy.v.Class22.l(), 0);
            this.cc.ab(var1, 3, 3);
         }
      }
   }
}
