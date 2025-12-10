package com.xy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Class386 extends JComponent {
   private String[] axl;
   private int j;
   private Class604 axm;
   private int cy;
   private int m;

   public void q() {
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.axm != null) {
         this.axm.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.axl != null) {
         Graphics2D var2;
         Graphics2D var10000 = var2 = (Graphics2D)var1;
         Object var7 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
         Object var5 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
         Object var6 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var3 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var10;
         if (var7 != RenderingHints.VALUE_RENDER_QUALITY) {
            var10 = var4;
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         } else {
            var7 = null;
            var10 = var4;
         }

         if (var10 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            var10 = var5;
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
         } else {
            var4 = null;
            var10 = var5;
         }

         if (var10 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            var10 = var6;
            var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
         } else {
            var5 = null;
            var10 = var6;
         }

         if (var10 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var10 = var3;
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var6 = null;
            var10 = var3;
         }

         if (var10 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var10000 = var2;
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var3 = null;
            var10000 = var2;
         }

         var10000.setColor(Color.black);
         int var9 = 3 ^ 3;
         var2.setFont(Class681.ae);

         for(int var8 = var9; var9 < this.axl.length; var9 = var8) {
            var1.drawString(this.axl[var8], this.m, this.j + this.cy * var8++);
         }

         if (var7 != null) {
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, var7);
         }

         if (var4 != null) {
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var4);
         }

         if (var5 != null) {
            var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var5);
         }

         if (var6 != null) {
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var6);
         }

         if (var3 != null) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var3);
         }

      }
   }

   public void uz(String var1, Class604 var2) {
      this.axm = var2;
      if (Class394.o(var1)) {
         this.axl = null;
      } else {
         String[] var10001 = new String[var1.length()];
         boolean var10003 = true;
         this.axl = var10001;

         int var3;
         for(int var10000 = var3 = 3 & 4; var10000 < this.axl.length; var10000 = var3) {
            String[] var4 = this.axl;
            int var5 = var3;
            String var10002 = var1.substring(var3, var3 + (4 ^ 5));
            ++var3;
            var4[var5] = var10002;
         }

      }
   }

   public String[] amu() {
      return this.axl;
   }

   public void bm(int var1, int var2, int var3) {
      this.m = var1;
      this.j = var2;
      this.cy = var3;
   }

   public Class604 ev() {
      return this.axm;
   }
}
