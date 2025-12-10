package com.xy.richtext;

import com.xy.lz;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class ChatBoxOld extends JPanel {
   private int w;
   private int h;
   private boolean Gag;
   private List<RichLabel> labels;
   private static final long serialVersionUID = 1L;
   private float Alpha;
   private int deviation;
   private boolean display;

   public RichLabel removeAddText(String var1, int var2, Font var3) {
      this.removeAll();
      RichLabel var4 = this.labels.size() != 0 ? (RichLabel)this.labels.get(2 & 5) : null;
      this.labels.clear();
      ChatBoxOld var5;
      if (var4 == null) {
         RichLabel var10000 = var4 = new RichLabel(var1, var3);
         var10000.setSize(var10000.computeSize(var2));
         var5 = this;
      } else {
         var4.setFont(var3);
         var4.setTextSize(var1, var2);
         var5 = this;
      }

      var5.labels.add(var4);
      this.Formsize(var2);
      return var4;
   }

   public void Formsize(int var1) {
      int var2 = 94 & 39;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < this.labels.size(); var10000 = var3) {
         double var4 = (double)var2;
         double var10001 = ((RichLabel)this.labels.get(var3)).getSize().getHeight();
         ++var3;
         var2 = (int)(var4 + var10001);
      }

      this.setSize(var1, var2);
   }

   public void setLabels(List<RichLabel> var1) {
      this.labels = var1;
   }

   public void addText(String var1, int var2) {
      RichLabel var3;
      RichLabel var10000 = var3 = new RichLabel(var1, (Font)null);
      var10000.setSize(var10000.computeSize(var2));
      if (var10000 != null) {
         this.labels.add(var3);
      }

      this.add(var3);
      this.Formsize(var2);
   }

   public void setW(int var1) {
      this.w = var1;
   }

   public int getW() {
      return this.w;
   }

   public void addtext(RichLabel var1, int var2) {
      this.labels.size();
      if (var1 != null) {
         this.labels.add(var1);
      }

      this.Formsize(var2);
      if (this.ScreenFull() != 0) {
         for(ChatBoxOld var10000 = this; var10000.deviation < this.ScreenFull(); this.deviation += 2 ^ 3) {
            var10000 = this;
         }
      }

   }

   public void paint(Graphics var1) {
      if (this.labels.size() != 0) {
         if (this.Alpha != 0.0F) {
            Graphics2D var2;
            Graphics2D var10000 = var2 = (Graphics2D)var1;
            Composite var3 = var10000.getComposite();
            var10000.setComposite(AlphaComposite.getInstance(--3, this.Alpha));
            var10000.setColor(Color.BLACK);
            var10000.fillRoundRect(3 & 4, 3 & 4, this.getWidth(), this.h == 0 ? this.getHeight() : this.h, 10, 10);
            var2.setComposite(var3);
         }

         int var6 = 0;
         int var7 = -this.deviation * (55 & 94);
         var1.translate(3 ^ 3, var7);

         int var4;
         for(int var8 = var4 = 3 ^ 3; var8 < this.labels.size(); var8 = var4) {
            Component var5 = (Component)this.labels.get(var4);
            var1.translate(var5.getX(), var6);
            var6 = var5.getHeight();
            if ((var7 += var6) >= 0) {
               var5.paint(var1);
            }

            ++var4;
         }
      }

   }

   public void setGag(boolean var1) {
      this.Gag = var1;
   }

   public RichLabel removeAddTextFont(String var1, int var2, Font var3) {
      var1 = "#Z" + var1;
      this.removeAll();
      RichLabel var4 = this.labels.size() != 0 ? (RichLabel)this.labels.get(2 & 5) : null;
      this.labels.clear();
      ChatBoxOld var5;
      if (var4 == null) {
         RichLabel var10000 = var4 = new RichLabel(var1, var3);
         var10000.setSize(var10000.computeSize(var2));
         var5 = this;
      } else {
         var4.setFont(var3);
         var4.setTextSize(var1, var2);
         var5 = this;
      }

      var5.labels.add(var4);
      this.Formsize(var2);
      return var4;
   }

   public List<RichLabel> getLabels() {
      return this.labels;
   }

   public boolean isDisplay() {
      return this.display;
   }

   public int ScreenFull() {
      int var1 = 5 >> 3;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.labels.size(); var10000 = var2) {
         double var3 = (double)var1;
         double var10001 = ((RichLabel)this.labels.get(var2)).getSize().getHeight();
         ++var2;
         var1 = (int)(var3 + var10001);
      }

      return var1 - (62 & 87) >= this.h ? (var1 - this.h) / (86 & 63) + (5 >> 1) : 0;
   }

   public void removemsg() {
      this.removeAll();
      this.labels.clear();
   }

   public void setH(int var1) {
      this.h = var1;
   }

   public InputBean isMonitor(int var1, int var2) {
      int var4 = 2 & 5;
      int var3 = -this.deviation * (62 & 87);

      int var5;
      for(int var10000 = var5 = 3 ^ 3; var10000 < this.labels.size(); var10000 = var5) {
         RichLabel var6;
         var4 = (var6 = (RichLabel)this.labels.get(var5)).getHeight();
         if ((var3 += var4) >= 0 && var3 >= var2) {
            return var6.isMonitor(var1, var2 - (var3 - var4));
         }

         ++var5;
      }

      return null;
   }

   public void setDeviation(int var1) {
      this.deviation = var1;
   }

   public void setDisplay(boolean var1) {
      this.display = var1;
   }

   public ChatBoxOld() {
      int var10002 = 3 ^ 3;
      int var10004 = 3 & 4;
      int var10006 = 3 & 4;
      int var10010 = 2 ^ 3;
      int var10012 = 2 & 5;
      super();
      this.deviation = var10012;
      this.Gag = (boolean)var10010;
      this.Alpha = 0.0F;
      this.display = (boolean)var10006;
      this.w = var10004;
      this.h = var10002;
      this.labels = new ArrayList();
      this.setBackground(lz.cu);
   }

   public RichLabel addText(String var1, int var2, Font var3) {
      RichLabel var4;
      RichLabel var10000 = var4 = new RichLabel(var1, var3);
      var10000.setSize(var10000.computeSize(var2));
      if (var10000 != null) {
         this.labels.add(var4);
      }

      this.Formsize(var2);
      return var4;
   }

   public void setAlpha(float var1) {
      this.Alpha = var1;
   }

   public int getDeviation() {
      return this.deviation;
   }

   public boolean isGag() {
      return this.Gag;
   }

   public int getH() {
      return this.h;
   }

   public void addtext(String var1, int var2, Font var3) {
      this.labels.size();
      this.addText(var1, var2, var3);
      if (this.ScreenFull() != 0) {
         for(ChatBoxOld var10000 = this; var10000.deviation < this.ScreenFull(); this.deviation += --1) {
            var10000 = this;
         }
      }

   }

   public float getAlpha() {
      return this.Alpha;
   }
}
