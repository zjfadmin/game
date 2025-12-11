package com.xy.q;

import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Class48 extends Class30 {
   Rectangle aso;

   public Class48(GameView var1) {
      super(-1, -1, Class30.agf, var1);
      this.yy(0, 0, var1.screenData.getScreen_x(), var1.screenData.getScreen_y(), Class30.agf);
      this.addMouseListener(Class1.c);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2;
      Graphics2D var10000 = var2 = (Graphics2D)var1;
      Composite var3 = var10000.getComposite();
      var10000.setComposite(com.xy.w.Class1.k);
      var10000.setColor(Color.BLACK);
      if (this.aso == null) {
         this.aso = this.getBounds();
      }

      var2.fill(this.aso);
      var2.setComposite(var3);
   }

   public void cc(int var1, int var2) {
      this.setSize(var1, var2);
      this.aso = null;
   }
}
