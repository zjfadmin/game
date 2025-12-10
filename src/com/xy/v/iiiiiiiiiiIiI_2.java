/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.v;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
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

public class iiiiiiiiiiIiI
extends BasicScrollBarUI {
    private JButton iiiIiiiiiiiIi;
    private static Color iIiiIiiiiiiII = iiIIiiiiIiiII.IIiIiiiiIIiII;
    private GradientPaint IIiiIiiiIIiIi;
    private JButton iIiIiiiiIiIii;
    private IIiIiiiiIIiii IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private static RenderingHints IiiiiiiiIIIII = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    private GradientPaint ALLATORIxDEMO;

    @Override
    public void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        c.setOpaque(false);
        if (this.scrollbar.getOrientation() == 1) {
            if (this.IIiiIiiiIIiIi == null || this.IIiiIiiiIIiIi.getPoint2().getX() != (double)trackBounds.width) {
                this.IIiiIiiiIIiIi = new GradientPaint(0.0f, 0.0f, iIiiIiiiiiiII, trackBounds.width, 0.0f, iIiiIiiiiiiII);
            }
            IiiiiiiiIIIII.setPaint(this.IIiiIiiiIIiIi);
        } else if (this.scrollbar.getOrientation() == 0) {
            if (this.ALLATORIxDEMO == null || this.ALLATORIxDEMO.getPoint2().getX() != (double)trackBounds.height) {
                this.ALLATORIxDEMO = new GradientPaint(0.0f, 0.0f, iIiiIiiiiiiII, trackBounds.height, 0.0f, iIiiIiiiiiiII);
            }
            IiiiiiiiIIIII.setPaint(this.ALLATORIxDEMO);
        } else {
            IiiiiiiiIIIII.setPaint(null);
        }
        IiiiiiiiIIIII.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
        if (this.trackHighlight == 1) {
            this.paintDecreaseHighlight(g);
            return;
        }
        if (this.trackHighlight != 2) return;
        this.paintIncreaseHighlight(g);
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        if (this.iIiIiiiiIiIii != null) {
            return this.iIiIiiiiIiIii;
        }
        this.iIiIiiiiIiIii = new JButton();
        this.iIiIiiiiIiIii.setBorderPainted(false);
        this.iIiIiiiiIiIii.setContentAreaFilled(false);
        this.iIiIiiiiIiIii.setBorder(null);
        return this.iIiIiiiiIiIii;
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        super.paintThumb(g, c, thumbBounds);
        g.translate(thumbBounds.x, thumbBounds.y);
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IiiiiiiiIIIII.addRenderingHints(iiiiiiiiiiIiI.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO((Graphics)IiiiiiiiIIIII, thumbBounds.width, thumbBounds.height);
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        if (this.iiiIiiiiiiiIi != null) {
            return this.iiiIiiiiiiiIi;
        }
        this.iiiIiiiiiiiIi = new JButton();
        this.iiiIiiiiiiiIi.setBorderPainted(false);
        this.iiiIiiiiiiiIi.setContentAreaFilled(false);
        this.iiiIiiiiiiiIi.setBorder(null);
        return this.iiiIiiiiiiiIi;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        void c;
        jComponent.setPreferredSize(new Dimension(this.iiIiiiiiiiIii, 0));
        return super.getPreferredSize((JComponent)c);
    }

    @Override
    protected void configureScrollBarColors() {
        this.setThumbBounds(0, 0, 3, 10);
        this.trackHighlightColor = iIiiIiiiiiiII;
    }

    public iiiiiiiiiiIiI() {
        this(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/22.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), 16);
    }

    public iiiiiiiiiiIiI(IIiIiiiiIIiii imgCut, int barW) {
        this.IiIIIiiiiIiiI = imgCut;
        this.iiIiiiiiiiIii = barW;
    }

    public static synchronized iiiiiiiiiiIiI ALLATORIxDEMO() {
        return new iiiiiiiiiiIiI();
    }
}
