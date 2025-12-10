package com.xy;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Class79 extends Class345 {
   Rectangle asc;

   public void cf(int var1, int var2) {
      this.setSize(var1, var2);
      this.asc = null;
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var3;
      Graphics2D var10000 = var3 = (Graphics2D)var1;
      Composite var2 = var10000.getComposite();
      var10000.setComposite(Class8.j);
      var10000.setColor(Color.BLACK);
      if (this.asc == null) {
         this.asc = this.getBounds();
      }

      var3.fill(this.asc);
      var3.setComposite(var2);
   }

   public Class79(GameView var1) {
      int var10002 = 3 >> 2;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.va(var10002, 2 & 5, var1.screenData.getScreen_x(), var1.screenData.getScreen_y(), Class345.aei);
      this.addMouseListener(Class133.a);
   }
}
