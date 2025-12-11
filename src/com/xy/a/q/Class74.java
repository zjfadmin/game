package com.xy.a.q;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Class74 extends MouseAdapter {
   // $VF: synthetic field
   final Class43 ahr;

   Class74(Class43 var1) {
      this.ahr = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (Class43.to(this.ahr).th().getSelectedIndex() != -1) {
         String var3 = Class43.to(this.ahr).th().getSelectedValue();
         Class43.tq(this.ahr).setText(var3);
         Class43.to(this.ahr).setVisible(false);
      }
   }
}
