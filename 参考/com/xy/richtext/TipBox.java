package com.xy.richtext;

import com.xy.W;
import com.xy.em;
import com.xy.ev;
import com.xy.ho;
import com.xy.lf;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Dimension;
import java.awt.Graphics;

public class TipBox {
   private RichLabel label;
   private String text;
   private GameView gameView;
   private int width;
   private int px;
   private boolean load;
   private long time;
   private lf imgCut;
   private int height;

   public RichLabel getLabel() {
      return this.label;
   }

   public int getPx() {
      return this.px;
   }

   public void setPx(int var1) {
      this.px = var1;
   }

   public boolean IsTime(long var1) {
      return (boolean)(var1 - this.time > W.d ? 3 >> 1 : 0);
   }

   public void setWidth(int var1) {
      this.width = var1;
   }

   public void paint(Graphics var1) {
      if (this.load) {
         this.loadText();
      }

      var1.translate(this.px, 5 >> 3);
      this.imgCut.g(var1, this.width, this.height);
      var1.translate(this.label.getX(), this.label.getY());
      this.label.paint(var1);
      var1.translate(-this.px - this.label.getX(), -this.label.getY());
   }

   public int getWidth() {
      return this.width;
   }

   public void loadText() {
      synchronized(this) {
         if (this.load) {
            this.label = em.l(this.text, lz.ce, 3 & 4);
            this.label.setLocation(75 & 62, 75 & 62);
            Dimension var2 = this.label.computeSize(17305 & 16102);
            this.label.setSize(var2);
            this.width = var2.width + (31 & 116);
            this.height = var2.height + (28 & 119);
            if (this.gameView != null && this.gameView.getClient().n(--2, 46 & 93)) {
               this.width = Math.max(21494 & 11593, this.width);
               this.height = var2.height + (63 & 94);
               this.label.setLocation(58 & 79, 63 & 79);
            }

            this.px = this.gameView != null ? this.gameView.screenData.Screen_x / (1 ^ 3) - this.width / --2 : 0;
            int var10002 = 3 >> 2;
            this.imgCut = ho.q("sc/c/0", 46 & 87, 46 & 87, 46 & 87, 46 & 87, (boolean)(5 >> 3));
            this.text = null;
            this.load = (boolean)var10002;
         }
      }
   }

   public void paint(int var1, int var2, Graphics var3) {
      if (this.load) {
         this.loadText();
      }

      var3.translate(var1, var2);
      this.imgCut.g(var3, this.width, this.height);
      var3.translate(this.label.getX(), this.label.getY());
      this.label.paint(var3);
      var3.translate(-var1 - this.label.getX(), -var2 - this.label.getY());
   }

   public void clear() {
      em.b(this.label);
   }

   public int getHeight() {
      return this.height;
   }

   public TipBox(String var1, GameView var2) {
      this.gameView = var2;
      this.setText(var1);
   }

   public void setHeight(int var1) {
      this.height = var1;
   }

   public void setLabel(RichLabel var1) {
      this.label = var1;
   }

   public void setText(String var1) {
      int var10002 = 2 ^ 3;
      this.text = var1;
      this.load = (boolean)var10002;
      this.time = ev.l();
   }
}
