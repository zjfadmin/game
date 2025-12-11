package com.xy.a;

import java.awt.Graphics;
import javax.swing.JComponent;

class Class30 extends JComponent {
   // $VF: synthetic field
   final Class121 rb;

   Class30(Class121 var1) {
      this.rb = var1;
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      this.rb.dj(var1);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      this.rb.dn(var1);
   }
}
