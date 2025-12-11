package com.xy.q;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class Class40 extends JComponent {
   private int cb;
   private int ae;
   private int ds;
   private com.xy.w.Class9 qk;
   private String[] akr;

   public void fj(int var1, int var2, int var3) {
      this.ae = var1;
      this.cb = var2;
      this.ds = var3;
   }

   public void t() {
   }

   public com.xy.w.Class9 acz() {
      return this.qk;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.qk != null) {
         this.qk.g(var1, this.getWidth(), this.getHeight());
      }

      if (this.akr != null) {
         Graphics2D var2;
         Graphics2D var10000 = var2 = (Graphics2D)var1;
         Object var3 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
         Object var5 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
         Object var6 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var7 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var9;
         if (var3 != RenderingHints.VALUE_RENDER_QUALITY) {
            var9 = var4;
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         } else {
            var3 = null;
            var9 = var4;
         }

         if (var9 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            var9 = var5;
            var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
         } else {
            var4 = null;
            var9 = var5;
         }

         if (var9 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            var9 = var6;
            var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
         } else {
            var5 = null;
            var9 = var6;
         }

         if (var9 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var9 = var7;
            var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var6 = null;
            var9 = var7;
         }

         if (var9 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var7 = null;
         }

         var2.setColor(Color.black);
         int var14 = 0;
         var2.setFont(Class49.bt);

         for (int var8 = 0; var14 < this.akr.length; var14 = var8) {
            var1.drawString(this.akr[var8], this.ae, this.cb + this.ds * var8++);
         }

         if (var3 != null) {
            var2.setRenderingHint(RenderingHints.KEY_RENDERING, var3);
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

         if (var7 != null) {
            var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var7);
         }
      }
   }

   public void yz(String var1, com.xy.w.Class9 var2) {
      this.qk = var2;
      if (com.xy.v.Class12.h(var1)) {
         this.akr = null;
      } else {
         this.akr = new String[var1.length()];

         int var3;
         for (int var10000 = var3 = 0; var10000 < this.akr.length; var10000 = var3) {
            String[] var4 = this.akr;
            int var10001 = var3;
            String var10002 = var1.substring(var3, var3 + 1);
            var3++;
            var4[var10001] = var10002;
         }
      }
   }

   public String[] ada() {
      return this.akr;
   }
}
