package com.xy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Class179 extends BasicScrollBarUI {
   private GradientPaint avs;
   private static RenderingHints avt;
   private GradientPaint avu;
   private Class604 avv;
   private JButton avw;
   private static Color wg;
   private JButton avx;
   private int m;

   public Dimension getPreferredSize(JComponent var1) {
      var1.setPreferredSize(new Dimension(this.m, 5 >> 3));
      return super.getPreferredSize(var1);
   }

   protected JButton createIncreaseButton(int var1) {
      if (this.avx != null) {
         return this.avx;
      } else {
         this.avx = new JButton();
         this.avx.setBorderPainted((boolean)(5 >> 3));
         this.avx.setContentAreaFilled((boolean)(2 & 5));
         this.avx.setBorder((Border)null);
         return this.avx;
      }
   }

   protected void paintThumb(Graphics var1, JComponent var2, Rectangle var3) {
      super.paintThumb(var1, var2, var3);
      var1.translate(var3.x, var3.y);
      Graphics2D var4 = (Graphics2D)var1;
      var4.addRenderingHints(avt);
      this.avv.g(var4, var3.width, var3.height);
   }

   protected void configureScrollBarColors() {
      this.setThumbBounds(3 & 4, 3 & 4, --3, 91 & 46);
      this.trackHighlightColor = wg;
   }

   protected JButton createDecreaseButton(int var1) {
      if (this.avw != null) {
         return this.avw;
      } else {
         this.avw = new JButton();
         this.avw.setBorderPainted((boolean)(5 >> 3));
         this.avw.setContentAreaFilled((boolean)(3 >> 2));
         this.avw.setBorder((Border)null);
         return this.avw;
      }
   }

   public static synchronized Class179 alc() {
      return new Class179();
   }

   public Class179(Class604 var1, int var2) {
      this.ald(var1, var2);
   }

   public void ald(Class604 var1, int var2) {
      this.avv = var1;
      this.m = var2;
   }

   static {
      wg = Class681.cu;
      avt = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
   }

   public void paintTrack(Graphics var1, JComponent var2, Rectangle var3) {
      Graphics2D var4 = (Graphics2D)var1;
      var2.setOpaque((boolean)(5 >> 3));
      Graphics2D var10000;
      if (this.scrollbar.getOrientation() == (4 ^ 5)) {
         if (this.avu == null || this.avu.getPoint2().getX() != (double)var3.width) {
            this.avu = new GradientPaint(0.0F, 0.0F, wg, (float)var3.width, 0.0F, wg);
         }

         var10000 = var4;
         var4.setPaint(this.avu);
      } else if (this.scrollbar.getOrientation() == 0) {
         if (this.avs == null || this.avs.getPoint2().getX() != (double)var3.height) {
            this.avs = new GradientPaint(0.0F, 0.0F, wg, (float)var3.height, 0.0F, wg);
         }

         var10000 = var4;
         var4.setPaint(this.avs);
      } else {
         var10000 = var4;
         var4.setPaint((Paint)null);
      }

      var10000.fillRect(var3.x, var3.y, var3.width, var3.height);
      if (this.trackHighlight == (2 ^ 3)) {
         this.paintDecreaseHighlight(var1);
      } else {
         if (this.trackHighlight == --2) {
            this.paintIncreaseHighlight(var1);
         }

      }
   }

   public Class179() {
      this(Class511.q("sc/d/22.png", 39 & 94, 39 & 94, 39 & 94, 39 & 94, (boolean)(3 & 4)), 118 & 25);
   }
}
