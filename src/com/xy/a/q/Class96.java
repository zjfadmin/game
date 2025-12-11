package com.xy.a.q;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

class Class96 extends JComponent {
   // $VF: synthetic field
   final Class20 abp;

   @Override
   protected void paintComponent(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      var2.setComposite(com.xy.w.Class1.r);
      var2.setColor(Color.BLACK);
      var2.fill(this.getBounds());
      var2.dispose();
   }

   Class96(Class20 var1) {
      this.abp = var1;
   }
}
