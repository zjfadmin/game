package com.xy.a;

import java.awt.Graphics;
import javax.swing.JComponent;

class Class109 extends JComponent {
   // $VF: synthetic field
   final Class51 ke;

   Class109(Class51 var1) {
      this.ke = var1;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      this.ke.dn(var1);
   }
}
