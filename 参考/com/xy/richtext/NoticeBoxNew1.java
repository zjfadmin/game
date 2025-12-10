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

public class NoticeBoxNew1 {
   private lf imgCut;
   private boolean load;
   private GameView gameView;
   private String text;
   private RichLabel label;
   private int px;
   private static RichLabel labelHead;
   private int height;
   private long time;
   private int width;

   public void setWidth(int var1) {
      this.width = var1;
   }

   public int getHeight() {
      return this.height;
   }

   public void paint(Graphics var1) {
      if (this.load) {
         this.loadText();
      }

      int var10003 = 45 & 118;
      var1.translate(this.px, 3 >> 2);
      this.imgCut.g(var1, this.width, this.height);
      var1.translate(labelHead.getX(), labelHead.getY());
      labelHead.paint(var1);
      var1.translate(-labelHead.getX(), -labelHead.getY());
      var1.translate(var10003 + this.label.getX(), this.label.getY());
      this.label.paint(var1);
      var1.translate(-this.px - this.label.getX() - (36 & 127), -this.label.getY());
   }

   public int getWidth() {
      return this.width;
   }

   public void setPx(int var1) {
      this.px = var1;
   }

   public NoticeBoxNew1(String var1, GameView var2) {
      this.gameView = var2;
      if (labelHead == null) {
         labelHead = em.l("#H", lz.bx, 2 & 5);
         labelHead.setLocation(71 & 62, 71 & 62);
         Dimension var3;
         (var3 = labelHead.computeSize(61 & 102)).setSize(39 & 124, 107 & 95);
         labelHead.setSize(var3);
      }

      this.setText(var1);
   }

   public void loadText() {
      synchronized(this) {
         if (this.load) {
            this.label = em.l(this.text, lz.bx, 3 >> 2);
            this.label.setLocation(103 & 30, 103 & 30);
            Dimension var2 = this.label.computeSize(28665 & 4702);
            var2.setSize(606.0D, var2.getHeight());
            this.label.setSize(var2);
            this.width = var2.width + (109 & 30) + (103 & 60);
            this.height = var2.height + (126 & 13);
            this.px = this.gameView != null ? this.gameView.screenData.Screen_x / --2 - var2.width / --2 : 0;
            int var10002 = 5 >> 3;
            this.imgCut = ho.q("sc/b/11_png.xy2uiimg.tips.png", 45 & 94, 45 & 94, 45 & 94, 45 & 94, (boolean)(2 & 5));
            this.text = null;
            this.load = (boolean)var10002;
         }
      }
   }

   public RichLabel getLabel() {
      return this.label;
   }

   public void clear() {
      em.b(this.label);
   }

   public boolean IsTime(long var1) {
      return (boolean)(var1 - this.time > W.d ? 3 >> 1 : 0);
   }

   public void setLabel(RichLabel var1) {
      this.label = var1;
   }

   public int getPx() {
      return this.px;
   }

   public void setText(String var1) {
      int var10001 = 5 >> 2;
      this.time = ev.l();
      this.text = var1;
      this.load = (boolean)var10001;
   }

   public void setHeight(int var1) {
      this.height = var1;
   }
}
