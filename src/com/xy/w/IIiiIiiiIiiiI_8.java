/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.IIIIIiiiIiIii
 */
package com.xy.w;

import com.xy.w.IIIIIiiiIiIii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;

public class IIiiIiiiIiiiI
implements Icon {
    private int IIiiIiiiIIiIi;
    private Image iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IIiiIiiiIiiiI(Image image, int w, int h, int dx, int dy) {
        this.iIiIiiiiIiIii = image;
        this.IIiiIiiiIIiIi = w;
        this.IiIIIiiiiIiiI = h;
        this.ALLATORIxDEMO = dx;
        this.IiiiiiiiIIIII = dy;
    }

    public IIiiIiiiIiiiI(Image image, int w, int h) {
        this.iIiIiiiiIiIii = image;
        this.IIiiIiiiIIiIi = w;
        this.IiIIIiiiiIiiI = h;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        void IiiiiiiiIIIII2;
        if (this.ALLATORIxDEMO == 0 && this.IiiiiiiiIIIII == 0) {
            g.drawImage(this.iIiIiiiiIiIii, x, y, this.IIiiIiiiIIiIi, this.IiIIIiiiiIiiI, null);
            if (!this.iiIiiiiiiiIii) return;
            Graphics2D IiiiiiiiIIIII2 = (Graphics2D)g;
            IiiiiiiiIIIII2.setComposite(IIIIIiiiIiIii.iIiiIiiiiiiII);
            IiiiiiiiIIIII2.setColor(Color.BLACK);
            IiiiiiiiIIIII2.fillRect(x, y, this.IIiiIiiiIIiIi, this.IiIIIiiiiIiiI);
            IiiiiiiiIIIII2.setComposite(IIIIIiiiIiIii.iIiiIiiiIiIIi);
            return;
        }
        g.drawImage(this.iIiIiiiiIiIii, x + this.ALLATORIxDEMO, y + this.IiiiiiiiIIIII, this.IIiiIiiiIIiIi - 2 * this.ALLATORIxDEMO, this.IiIIIiiiiIiiI - 2 * this.IiiiiiiiIIIII, null);
        if (!this.iiIiiiiiiiIii) return;
        Graphics2D graphics2D = (Graphics2D)g;
        IiiiiiiiIIIII2.setComposite(IIIIIiiiIiIii.iIiiIiiiiiiII);
        IiiiiiiiIIIII2.setColor(Color.BLACK);
        IiiiiiiiIIIII2.fillRect(x + this.ALLATORIxDEMO, y + this.IiiiiiiiIIIII, this.IIiiIiiiIIiIi - 2 * this.ALLATORIxDEMO, this.IiIIIiiiiIiiI - 2 * this.IiiiiiiiIIIII);
        graphics2D.setComposite(IIIIIiiiIiIii.iIiiIiiiIiIIi);
    }

    @Override
    public int getIconHeight() {
        return this.IiIIIiiiiIiiI;
    }

    @Override
    public int getIconWidth() {
        return this.IIiiIiiiIIiIi;
    }
}
