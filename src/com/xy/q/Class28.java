package com.xy.q;

import java.awt.event.MouseEvent;

class Class28 extends com.xy.i.Class1 {
   // $VF: synthetic field
   final Class44 abv;

   @Override
   public void fe(MouseEvent var1, boolean var2) {
   }

   Class28(Class44 var1, String var2, int var3, Class30 var4) {
      super(var2, var3, var4);
      this.abv = var1;
   }

   @Override
   public void cw(MouseEvent var1) {
      this.abv.be(!Class44.afp(this.abv).isVisible());
   }
}
