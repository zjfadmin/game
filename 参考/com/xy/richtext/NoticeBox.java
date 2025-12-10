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

public class NoticeBox {
   private int height;
   private GameView gameView;
   private boolean load;
   private int width;
   private RichLabel label;
   private String text;
   private lf imgCut;
   private int px;
   private long time;

   public void setHeight(int var1) {
      this.height = var1;
   }

   public int getWidth() {
      return this.width;
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

   public void setWidth(int var1) {
      this.width = var1;
   }

   public void setText(String var1) {
      int var10001 = --1;
      this.time = ev.l();
      this.text = var1;
      this.load = (boolean)var10001;
   }

   public void loadText() {
      synchronized(this) {
         if (this.load) {
            this.label = em.l(this.text, lz.y, 3 & 4);
            this.label.setLocation(62 & 71, 62 & 71);
            Dimension var2;
            (var2 = this.label.computeSize(10197 & 23210)).setSize(16094 & 17315, 79 & 123);
            this.label.setSize(var2);
            this.width = var2.width + (125 & 14);
            this.height = var2.height + (30 & 109);
            this.px = this.gameView != null ? this.gameView.screenData.Screen_x / (1 ^ 3) - var2.width / (5 >> 1) : 0;
            int var10002 = 3 & 4;
            this.imgCut = ho.q("sc/c/68", 31 & 102, 31 & 102, 31 & 102, 31 & 102, (boolean)(3 ^ 3));
            this.text = null;
            this.load = (boolean)var10002;
         }
      }
   }

   public int getPx() {
      return this.px;
   }

   public void setLabel(RichLabel var1) {
      this.label = var1;
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

   public int getHeight() {
      return this.height;
   }

   public boolean IsTime(long var1) {
      return (boolean)(var1 - this.time > W.d ? --1 : 0);
   }

   public void setPx(int var1) {
      this.px = var1;
   }

   public RichLabel getLabel() {
      return this.label;
   }

   public NoticeBox(String var1, GameView var2) {
      this.gameView = var2;
      this.setText(var1);
   }

   public void clear() {
      em.b(this.label);
   }
}
