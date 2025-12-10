package com.xy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;

public class Class457 {
   private static Image a = Class511.a("sc/e/194.png");
   private static Image b = Class511.a("sc/e/193.png");
   private String c;
   public static final Color d = new Color(22934 & 9981, 123 & 61, 119 & 27);
   private int e;
   private static Image f = Class511.a("sc/e/195.png");

   public void a(Graphics var1, int var2, int var3) {
      var1.drawImage(b, var2 - (119 & 46), var3 - (5348 & 27551), 115 & 78, 63 & 119, (ImageObserver)null);
      Graphics2D var4;
      Graphics2D var10000 = var4 = (Graphics2D)var1;
      Object var5 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
      Object var6 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
      Object var7 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
      Object var8 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var9 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object var10;
      if (var5 != RenderingHints.VALUE_RENDER_QUALITY) {
         var10 = var6;
         var4.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      } else {
         var5 = null;
         var10 = var6;
      }

      if (var10 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
         var10 = var7;
         var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      } else {
         var6 = null;
         var10 = var7;
      }

      if (var10 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
         var10 = var8;
         var4.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      } else {
         var7 = null;
         var10 = var8;
      }

      if (var10 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var10 = var9;
         var4.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var8 = null;
         var10 = var9;
      }

      Graphics var11;
      if (var10 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var11 = var1;
         var4.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var9 = null;
         var11 = var1;
      }

      var11.setFont(Class681.ak);
      if (this.e == 0) {
         this.e = var1.getFontMetrics().stringWidth(this.c) / (5 >> 1);
      }

      var3 -= 111 & 117;
      var2 = var2 - this.e - --4;
      var1.setColor(d);
      var1.drawString(this.c, var2, var3);
      if (var5 != null) {
         var4.setRenderingHint(RenderingHints.KEY_RENDERING, var5);
      }

      if (var6 != null) {
         var4.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var6);
      }

      if (var7 != null) {
         var4.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var7);
      }

      if (var8 != null) {
         var4.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var8);
      }

      if (var9 != null) {
         var4.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var9);
      }

   }

   public Class457(String var1) {
      this.c = var1;
   }
}
