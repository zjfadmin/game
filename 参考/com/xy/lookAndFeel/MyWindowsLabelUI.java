package com.xy.lookAndFeel;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.xy.bg;
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

public class MyWindowsLabelUI extends BasicLabelUI {
   private static final Object WINDOWS_LABEL_UI_KEY = new Object();

   protected void paintDisabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      int var6 = var1.getDisplayedMnemonicIndex();
      if (WindowsLookAndFeel.isMnemonicHidden()) {
         var6 = -4 >> 2;
      }

      if (UIManager.getColor("Label.disabledForeground") instanceof Color && UIManager.getColor("Label.disabledShadow") instanceof Color) {
         var2.setColor(UIManager.getColor("Label.disabledShadow"));
         SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4 + (2 ^ 3), var5 + --1);
         var2.setColor(UIManager.getColor("Label.disabledForeground"));
         SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, var6, var4, var5);
      } else {
         JLabel var10001 = var1;
         JLabel var10000 = var1;
         Color var7 = var1.getBackground();
         var2.setColor(var7.brighter());
         SwingUtilities2.drawStringUnderlineCharAt(var10001, var2, var3, var6, var4 + (3 & 5), var5 + (2 ^ 3));
         var2.setColor(var7.darker());
         SwingUtilities2.drawStringUnderlineCharAt(var10000, var2, var3, var6, var4, var5);
      }
   }

   protected void paintEnabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      var2.setColor(var1.getForeground());
      if (var1.getFont() instanceof bg) {
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

         JLabel var13;
         if (var12 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var13 = var1;
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var11 = null;
            var13 = var1;
         }

         SwingUtilities2.drawStringUnderlineCharAt(var13, var6, var3, -4 >> 2, var4, var5);
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
         SwingUtilities2.drawStringUnderlineCharAt(var1, var2, var3, -4 >> 2, var4, var5);
      }

   }

   public static ComponentUI createUI(JComponent var0) {
      AppContext var1;
      MyWindowsLabelUI var2;
      if ((var2 = (MyWindowsLabelUI)(var1 = AppContext.getAppContext()).get(WINDOWS_LABEL_UI_KEY)) == null) {
         var2 = new MyWindowsLabelUI();
         var1.put(WINDOWS_LABEL_UI_KEY, var2);
      }

      return var2;
   }
}
