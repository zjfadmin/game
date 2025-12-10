/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.q;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIiiiiIiIII
extends JComponent {
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private IIiIiiiiIIiii IiiiiiiiIIIII;
    private String[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(int x, int y, int h) {
        this.IiIIIiiiiIiiI = x;
        this.iIiIiiiiIiIii = y;
        this.iiIiiiiiiiIii = h;
    }

    public void ALLATORIxDEMO() {
    }

    public IIiIiiiiIIiii ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D IiiiiiiiIIIII;
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
        }
        if (this.ALLATORIxDEMO == null) {
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
        IiiiiiiiIIIII.setColor(Color.black);
        IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIIIIiiiiiIIi);
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.ALLATORIxDEMO.length) {
            g.drawString(this.ALLATORIxDEMO[IiiiiiiiIIIII7], this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii + this.iiIiiiiiiiIii * IiiiiiiiIIIII7++);
        }
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

    public void ALLATORIxDEMO(String value, IIiIiiiiIIiii imgCut) {
        this.IiiiiiiiIIIII = imgCut;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            this.ALLATORIxDEMO = null;
            return;
        }
        this.ALLATORIxDEMO = new String[value.length()];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            int n = IiiiiiiiIIIII;
            String string = value.substring(IiiiiiiiIIIII, IiiiiiiiIIIII + 1);
            ++IiiiiiiiIIIII;
            this.ALLATORIxDEMO[n] = string;
        }
    }

    public String[] ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }
}
