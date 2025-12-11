package com.xy.a;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class Class67 implements MouseWheelListener {
   // $VF: synthetic field
   final Class51 ke;

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      this.ke.cc(-var1.getWheelRotation() * 40, Class51.sm(this.ke).getHeight());
   }

   Class67(Class51 var1) {
      this.ke = var1;
   }
}
