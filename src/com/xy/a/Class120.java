package com.xy.a;

import com.xy.richtext.RichLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

class Class120 extends RichLabel {
   // $VF: synthetic field
   final Class48 arv;

   @Override
   public void paintComponent(Graphics var1) {
      ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      super.paintComponent(var1);
      ((Graphics2D)var1).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
   }

   Class120(Class48 var1, String var2, Font var3, int var4) {
      super(var2, var3, var4);
      this.arv = var1;
   }
}
