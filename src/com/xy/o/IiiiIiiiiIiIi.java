/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iIiIIiiiIIiIi
 */
package com.xy.o;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.xy.q.iIiIIiiiIIiIi;
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

public class IiiiIiiiiIiIi
extends BasicLabelUI {
    private static final Object ALLATORIxDEMO = new Object();

    public static ComponentUI ALLATORIxDEMO(JComponent c) {
        AppContext IiiiiiiiIIIII = AppContext.getAppContext();
        IiiiIiiiiIiIi IiiiiiiiIIIII2 = (IiiiIiiiiIiIi)IiiiiiiiIIIII.get(ALLATORIxDEMO);
        if (IiiiiiiiIIIII2 != null) return IiiiiiiiIIIII2;
        IiiiiiiiIIIII2 = new IiiiIiiiiIiIi();
        IiiiiiiiIIIII.put(ALLATORIxDEMO, IiiiiiiiIIIII2);
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void paintDisabledText(JLabel l, Graphics g, String s, int textX, int textY) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = l.getDisplayedMnemonicIndex();
        if (WindowsLookAndFeel.isMnemonicHidden()) {
            IiiiiiiiIIIII2 = -1;
        }
        if (UIManager.getColor("Label.disabledForeground") instanceof Color && UIManager.getColor("Label.disabledShadow") instanceof Color) {
            g.setColor(UIManager.getColor("Label.disabledShadow"));
            SwingUtilities2.drawStringUnderlineCharAt(l, g, s, IiiiiiiiIIIII2, textX + 1, textY + 1);
            g.setColor(UIManager.getColor("Label.disabledForeground"));
            SwingUtilities2.drawStringUnderlineCharAt(l, g, s, IiiiiiiiIIIII2, textX, textY);
            return;
        }
        Color color = l.getBackground();
        g.setColor(IiiiiiiiIIIII.brighter());
        SwingUtilities2.drawStringUnderlineCharAt(l, g, s, IiiiiiiiIIIII2, textX + 1, textY + 1);
        g.setColor(IiiiiiiiIIIII.darker());
        SwingUtilities2.drawStringUnderlineCharAt(l, g, s, IiiiiiiiIIIII2, textX, textY);
    }

    @Override
    protected void paintEnabledText(JLabel l, Graphics g, String s, int textX, int textY) {
        Graphics2D IiiiiiiiIIIII;
        g.setColor(l.getForeground());
        if (!(l.getFont() instanceof iIiIIiiiIIiIi)) {
            SwingUtilities2.drawStringUnderlineCharAt(l, g, s, -1, textX, textY);
            return;
        }
        Graphics2D graphics2D = IiiiiiiiIIIII = (Graphics2D)g;
        Graphics2D graphics2D2 = IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2 = graphics2D2.getRenderingHint(RenderingHints.KEY_RENDERING);
        Object IiiiiiiiIIIII3 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
        Object IiiiiiiiIIIII4 = graphics2D2.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
        Object IiiiiiiiIIIII5 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII6 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII2 != RenderingHints.VALUE_RENDER_QUALITY) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        } else {
            IiiiiiiiIIIII2 = null;
        }
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IiiiiiiiIIIII4 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        } else {
            IiiiiiiiIIIII4 = null;
        }
        if (IiiiiiiiIIIII5 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII5 = null;
        }
        if (IiiiiiiiIIIII6 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII6 = null;
        }
        SwingUtilities2.drawStringUnderlineCharAt(l, IiiiiiiiIIIII, s, -1, textX, textY);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII6);
    }
}
