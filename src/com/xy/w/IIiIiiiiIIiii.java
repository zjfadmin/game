/*
 * Decompiled with CFR 0.152.
 */
package com.xy.w;

import java.awt.Graphics;
import java.awt.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIIiii {
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private Image IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public int iIiIiiiiIIiIi() {
        return this.iIiIiiiiIiIii;
    }

    public Image iIiIiiiiIIiii() {
        return this.iiIiiiiiiiIii;
    }

    public IIiIiiiiIIiii ALLATORIxDEMO(int w1, int h1, int w2, int h2) {
        this.iIiIiiiiIiIii = w1;
        this.IiiiiiiiIIIII = h2;
        this.ALLATORIxDEMO = w2;
        this.IIiiIiiiIIiIi = h2;
        return this;
    }

    public int iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO;
    }

    public int iIiIiiiiIIiii() {
        return this.IIiiIiiiIIiIi;
    }

    public IIiIiiiiIIiii(Image image, int w1, int h1, int w2, int h2) {
        this.IiIIIiiiiIiiI = image;
        this.iIiIiiiiIiIii = w1;
        this.IiiiiiiiIIIII = h1;
        this.ALLATORIxDEMO = w2;
        this.IIiiIiiiIIiIi = h2;
    }

    public void ALLATORIxDEMO(Graphics graphics) {
        this.ALLATORIxDEMO(graphics, this.iiIiiiiiiiIii.getWidth(null) + this.iIiIiiiiIiIii + this.ALLATORIxDEMO, this.iiIiiiiiiiIii.getHeight(null) + this.IiiiiiiiIIIII + this.IIiiIiiiIIiIi);
    }

    public void ALLATORIxDEMO(Graphics g, int w, int h) {
        g.drawImage(this.IiIIIiiiiIiiI, 0, 0, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII, 0, 0, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII, null);
        g.drawImage(this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii, 0, w - this.ALLATORIxDEMO, this.IiiiiiiiIIIII, this.iIiIiiiiIiIii, 0, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, this.IiiiiiiiIIIII, null);
        g.drawImage(this.IiIIIiiiiIiiI, 0, this.IiiiiiiiIIIII, this.iIiIiiiiIiIii, h - this.IIiiIiiiIIiIi, 0, this.IiiiiiiiIIIII, this.iIiIiiiiIiIii, this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, null);
        g.drawImage(this.IiIIIiiiiIiiI, 0, h - this.IIiiIiiiIIiIi, this.iIiIiiiiIiIii, h, 0, this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, this.iIiIiiiiIiIii, this.IiIIIiiiiIiiI.getHeight(null), null);
        g.drawImage(this.IiIIIiiiiIiiI, w - this.ALLATORIxDEMO, h - this.IIiiIiiiIIiIi, w, h, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, this.IiIIIiiiiIiiI.getWidth(null), this.IiIIIiiiiIiiI.getHeight(null), null);
        g.drawImage(this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii, h - this.IIiiIiiiIIiIi, w - this.ALLATORIxDEMO, h, this.iIiIiiiiIiIii, this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, this.IiIIIiiiiIiiI.getHeight(null), null);
        g.drawImage(this.IiIIIiiiiIiiI, w - this.ALLATORIxDEMO, this.IiiiiiiiIIIII, w, h - this.IIiiIiiiIIiIi, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, this.IiiiiiiiIIIII, this.IiIIIiiiiIiiI.getWidth(null), this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, null);
        g.drawImage(this.IiIIIiiiiIiiI, w - this.ALLATORIxDEMO, 0, w, this.IiiiiiiiIIIII, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, 0, this.IiIIIiiiiIiiI.getWidth(null), this.IiiiiiiiIIIII, null);
        if (this.iiIiiiiiiiIii != null) {
            g.drawImage(this.iiIiiiiiiiIii, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII, w - this.iIiIiiiiIiIii - this.ALLATORIxDEMO, h - this.IiiiiiiiIIIII - this.IIiiIiiiIIiIi, null);
            return;
        }
        g.drawImage(this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII, w - this.ALLATORIxDEMO, h - this.IIiiIiiiIIiIi, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII, this.IiIIIiiiiIiiI.getWidth(null) - this.ALLATORIxDEMO, this.IiIIIiiiiIiiI.getHeight(null) - this.IIiiIiiiIIiIi, null);
    }

    public Image ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public IIiIiiiiIIiii(IIiIiiiiIIiii imgCut) {
        this(imgCut.IiIIIiiiiIiiI, imgCut.iIiIiiiiIiIii, imgCut.IiiiiiiiIIIII, imgCut.ALLATORIxDEMO, imgCut.IIiiIiiiIIiIi);
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Image imageMiddle) {
        this.iiIiiiiiiiIii = imageMiddle;
    }
}
