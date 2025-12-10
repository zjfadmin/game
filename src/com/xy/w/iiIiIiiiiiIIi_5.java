/*
 * Decompiled with CFR 0.152.
 */
package com.xy.w;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiiIIi {
    private Image iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private static final long iiIiiiiiiiIii = 2191491798990378838L;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public int IiiIiiiiiiIiI() {
        return this.iIiIiiiiIiIii.getHeight(null);
    }

    public int iIiIiiiiIIiIi() {
        return this.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        if (this.iIiIiiiiIiIii == null) {
            return false;
        }
        x = this.ALLATORIxDEMO != 0 ? this.IiiiiiiiIIIII - x : (x += this.IiiiiiiiIIIII);
        if (x < 0) return false;
        if (x >= this.iIiIiiiiIiIii.getWidth(null)) return false;
        if ((y += this.IiIIIiiiiIiiI) < 0) return false;
        if (y >= this.iIiIiiiiIiIii.getHeight(null)) return false;
        if (!(this.iIiIiiiiIiIii instanceof BufferedImage)) return true;
        if (((BufferedImage)this.iIiIiiiiIiIii).getRGB(x, y) == 0) return false;
        return true;
    }

    public void ALLATORIxDEMO(Image image, int x, int y) {
        this.ALLATORIxDEMO = 1;
        this.IiiiiiiiIIIII = x;
        this.IiIIIiiiiIiiI = y;
        this.iIiIiiiiIiIii = image;
    }

    protected void ALLATORIxDEMO(Graphics2D g2, int x, int y, int width, int height) {
        int IiiiiiiiIIIII = x - this.IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = y - this.IiIIIiiiiIiiI;
        g2.drawImage(this.iIiIiiiiIiIii, IiiiiiiiIIIII, IiiiiiiiIIIII2, IiiiiiiiIIIII + width, IiiiiiiiIIIII2 + height, 0, 0, width, height, null);
    }

    public iiIiIiiiiiIIi(int pos) {
        this.ALLATORIxDEMO = pos;
    }

    public iiIiIiiiiiIIi(BufferedImage image, int centerX, int centerY) {
        this.iIiIiiiiIiIii = image;
        this.IiiiiiiiIIIII = centerX;
        this.IiIIIiiiiIiiI = centerY;
    }

    public int iiiIiiiiiiIIi() {
        return this.IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi(int centerY) {
        this.IiIIIiiiiIiiI = centerY;
    }

    public Image ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void iIiIiiiiIIiii(int centerX) {
        this.IiiiiiiiIIIII = centerX;
    }

    public iiIiIiiiiiIIi(Image image, int centerX, int centerY) {
        this.iIiIiiiiIiIii = image;
        this.IiiiiiiiIIIII = centerX;
        this.IiIIIiiiiIiiI = centerY;
    }

    public void ALLATORIxDEMO(int pos) {
        this.ALLATORIxDEMO = pos;
    }

    public void ALLATORIxDEMO() {
        this.iIiIiiiiIiIii = null;
    }

    public int iIiIiiiiIIiii() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(BufferedImage image) {
        this.ALLATORIxDEMO = 0;
        this.iIiIiiiiIiIii = image;
    }

    public int ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii.getWidth(null);
    }
}
