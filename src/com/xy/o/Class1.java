package com.xy.o;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicLabelUI;
import sun.awt.AppContext;
import sun.swing.SwingUtilities2;

public class Class1 extends BasicLabelUI {
   private static final Object acx = new Object();

   public static ComponentUI wq(JComponent var0) {
      AppContext var1;
      Class1 var2;
      if ((var2 = (Class1)(var1 = AppContext.getAppContext()).get(acx)) == null) {
         var2 = new Class1();
         var1.put(acx, var2);
      }

      return var2;
   }

   @Override
   protected void paintDisabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      int var6 = var1.getDisplayedMnemonicIndex();
      if (WindowsLookAndFeel.isMnemonicHidden()) {
         var6 = -1;
      }

      String var10000 = "@2n6`}h:\u007f2n?i7J<~6k!c&b7";
      if (UIManager.getColor("Label.disabledForeground") instanceof Color) {
         var10000 = "\u001b\u00065\u0002;I3\u000e$\u00065\u000b2\u0003\u0004\u000f6\u00038\u0010";
         if (UIManager.getColor("Label.disabledShadow") instanceof Color) {
            String var10003 = "\u001b\u00065\u0002;I3\u000e$\u00065\u000b2\u0003\u0011\b%\u00020\u00158\u00129\u0003";
            String var10007 = "@2n6`}h:\u007f2n?i7_;m7c$";
            var2.setColor(UIManager.getColor("Label.disabledShadow"));
            SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4 + 1, var5 + 1);
            var2.setColor(UIManager.getColor("Label.disabledForeground"));
            SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4, var5);
            return;
         }
      }

      Color var7 = var1.getBackground();
      var2.setColor(var7.brighter());
      SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4 + 1, var5 + 1);
      var2.setColor(var7.darker());
      SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4, var5);
   }

   @Override
   protected void paintEnabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      var2.setColor(var1.getForeground());
      if (var1.getFont() instanceof com.xy.q.Class0) {
         Graphics2D var6;
         Graphics2D var10000 = var6 = (Graphics2D)var2;
         Object var7 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
         Object var8 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
         Object var9 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
         Object var10 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var11 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var12;
         if (var7 != RenderingHints.VALUE_RENDER_QUALITY) {
            var12 = var8;
            var6.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         } else {
            var7 = null;
            var12 = var8;
         }

         if (var12 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            var12 = var9;
            var6.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
         } else {
            var8 = null;
            var12 = var9;
         }

         if (var12 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            var12 = var10;
            var6.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
         } else {
            var9 = null;
            var12 = var10;
         }

         if (var12 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var12 = var11;
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var10 = null;
            var12 = var11;
         }

         if (var12 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var12 = var1;
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var11 = null;
            var12 = var1;
         }

         SwingUtilities2.drawStringUnderlineCharAt((JComponent)var12, var6, var3, -1, var4, var5);
         if (var7 != null) {
            var6.setRenderingHint(RenderingHints.KEY_RENDERING, var7);
         }

         if (var8 != null) {
            var6.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var8);
         }

         if (var9 != null) {
            var6.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var9);
         }

         if (var10 != null) {
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var10);
         }

         if (var11 != null) {
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var11);
            return;
         }
      } else {
         SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, -1, var4, var5);
      }
   }
}
