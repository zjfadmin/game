package com.xy.a.q;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Class66 extends MouseAdapter {
   // $VF: synthetic field
   final Class43 ahr;

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (Class43.tr(this.ahr).th().getSelectedIndex() != -1) {
         String var3 = Class43.tr(this.ahr).th().getSelectedValue();
         Class43.tp(this.ahr).setText(var3);
         Class43.tr(this.ahr).setVisible(false);
      }
   }

   Class66(Class43 var1) {
      this.ahr = var1;
   }
}
