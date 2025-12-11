package com.xy.a.q;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class Class76 extends com.xy.q.Class54 {
   // $VF: synthetic field
   final Class7 akg;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (Class7.fo(this.akg)) {
         Graphics2D var2 = (Graphics2D)var1;
         var2.setComposite(com.xy.w.Class1.l);
         var2.setColor(Color.BLACK);
         var2.fillRoundRect(0, 0, 55, 55, 10, 10);
      }
   }

   Class76(Class7 var1, com.xy.q.Class30 var2) {
      super(var2);
      this.akg = var1;
   }
}
