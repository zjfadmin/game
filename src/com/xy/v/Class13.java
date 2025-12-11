package com.xy.v;

import com.xy.q.Class49;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Class13 extends BasicScrollBarUI {
   private JButton aci;
   private static Color acj = Class49.bk;
   private GradientPaint ack;
   private JButton acl;
   private com.xy.w.Class9 acm;
   private int ds;
   private static RenderingHints acn = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
   private GradientPaint aco;

   @Override
   public void paintTrack(Graphics var1, JComponent var2, Rectangle var3) {
      Graphics2D var4 = (Graphics2D)var1;
      var2.setOpaque(false);
      Graphics2D var10000;
      if (this.scrollbar.getOrientation() == 1) {
         if (this.ack == null || this.ack.getPoint2().getX() != var3.width) {
            this.ack = new GradientPaint(0.0F, 0.0F, acj, var3.width, 0.0F, acj);
         }

         var10000 = var4;
         var4.setPaint(this.ack);
      } else if (this.scrollbar.getOrientation() == 0) {
         if (this.aco == null || this.aco.getPoint2().getX() != var3.height) {
            this.aco = new GradientPaint(0.0F, 0.0F, acj, var3.height, 0.0F, acj);
         }

         var10000 = var4;
         var4.setPaint(this.aco);
      } else {
         var10000 = var4;
         var4.setPaint(null);
      }

      var10000.fillRect(var3.x, var3.y, var3.width, var3.height);
      if (this.trackHighlight == 1) {
         this.paintDecreaseHighlight(var1);
      } else {
         if (this.trackHighlight == 2) {
            this.paintIncreaseHighlight(var1);
         }
      }
   }

   @Override
   protected JButton createDecreaseButton(int var1) {
      if (this.acl != null) {
         return this.acl;
      } else {
         this.acl = new JButton();
         this.acl.setBorderPainted(false);
         this.acl.setContentAreaFilled(false);
         this.acl.setBorder(null);
         return this.acl;
      }
   }

   @Override
   protected void paintThumb(Graphics var1, JComponent var2, Rectangle var3) {
      super.paintThumb(var1, var2, var3);
      var1.translate(var3.x, var3.y);
      Graphics2D var4 = (Graphics2D)var1;
      var4.addRenderingHints(acn);
      this.acm.g(var4, var3.width, var3.height);
   }

   @Override
   protected JButton createIncreaseButton(int var1) {
      if (this.aci != null) {
         return this.aci;
      } else {
         this.aci = new JButton();
         this.aci.setBorderPainted(false);
         this.aci.setContentAreaFilled(false);
         this.aci.setBorder(null);
         return this.aci;
      }
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      var1.setPreferredSize(new Dimension(this.ds, 0));
      return super.getPreferredSize(var1);
   }

   @Override
   protected void configureScrollBarColors() {
      this.setThumbBounds(0, 0, 3, 10);
      this.trackHighlightColor = acj;
   }

   public Class13() {
      this(com.xy.w.Class16.m("sc/d/22.png", 6, 6, 6, 6, false), 16);
      String var10001 = "\u0006ZZ]Z\u000bG\u0017\u0005W\u0012";
   }

   public Class13(com.xy.w.Class9 var1, int var2) {
      this.acm = var1;
      this.ds = var2;
   }

   public static synchronized Class13 wo() {
      return new Class13();
   }
}
