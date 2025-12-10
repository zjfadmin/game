package com.xy.richtext;

import com.xy.W;
import com.xy.em;
import com.xy.ev;
import com.xy.gT;
import com.xy.ho;
import com.xy.lf;
import com.xy.lz;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class FloatBox {
   private RichLabel label;
   private lf imgCut;
   private long time;
   public FloatBox nextFloatBox;
   private int height;
   private String text;
   private int width;

   public void setText(String var1) {
      this.text = var1;
   }

   public boolean IsBattleTime(long var1) {
      return (boolean)(var1 - this.time < W.b ? 4 ^ 5 : 0);
   }

   public RichLabel getLabel() {
      return this.label;
   }

   public FloatBox(String var1, String var2, Font var3) {
      this.text = var1;
      this.label = em.l(var1, lz.ce, 5 >> 3);
      this.label.setLocation(--4, --3);
      Dimension var4 = this.label.computeSize(126 & 99);
      this.label.setSize(var4);
      this.width = (108 & 27) + var4.width;
      this.height = (47 & 86) + var4.height;
      this.time = ev.l();
      this.imgCut = ho.q(var2 == null ? gT.iIiiIiiiiiiI("rc-d*73/ynm") : gT.iIiiIiiiiiiI("rc-d*73/ynm"), 6, 6, 6, 6, (boolean)(5 >> 3));
   }

   public FloatBox(String var1) {
      this(var1, (String)null, (Font)null);
      this.text = var1;
   }

   public boolean IsTime(long var1) {
      return (boolean)(var1 - this.time < W.d ? 3 & 5 : 0);
   }

   public int getWidth() {
      return this.width;
   }

   public void paint(Graphics var1) {
      this.imgCut.g(var1, this.width, this.height);
      if (this.label != null) {
         var1.translate(this.label.getX(), this.label.getY());
         this.label.paint(var1);
         var1.translate(-this.label.getX(), -this.label.getY());
      }
   }

   public String getText() {
      return this.text;
   }

   public int getHeight() {
      return this.height;
   }

   public void removeLabel() {
      synchronized(this) {
         if (this.label != null) {
            em.b(this.label);
            this.label = null;
         }
      }
   }
}
