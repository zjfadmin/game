/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.w;

import com.xy.q.IiiiIiiiiIiIi;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiiiIiIiI
extends JComponent {
    protected IIiIiiiiIIiii IiIIIiiiiIiiI;
    protected Image iiIiiiiiiiIii;
    private Integer IiiiiiiiIIIII;
    protected Image ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.ALLATORIxDEMO = null;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        try {
            if (this.getX() != x) {
                IiiiIiiiiIiIi.iIiiIiiiIiIIi.set(this, x);
            }
            if (this.getY() != y) {
                IiiiIiiiiIiIi.IiiIIiiiiiiiI.set(this, y);
            }
            if (this.getWidth() != width) {
                IiiiIiiiiIiIi.iIiiIiiiiiiII.set(this, width);
            }
            if (this.getHeight() == height) return;
            IiiiIiiiiIiIi.IiIIiiiiIIIII.set(this, height);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public void ALLATORIxDEMO(double xs, int width) {
        if (xs <= 0.0) {
            width = 0;
        } else if (xs < 1.0) {
            width = (int)((double)width * xs);
        }
        this.setBounds(this.getX(), this.getY(), width, this.getHeight());
    }

    public void ALLATORIxDEMO(double xs) {
        if (xs <= 0.0) {
            this.IiiiiiiiIIIII = 0;
            return;
        }
        if (xs >= 1.0) {
            this.IiiiiiiiIIIII = this.getWidth() - 2;
            return;
        }
        this.IiiiiiiiIIIII = (int)((double)(this.getWidth() - 2) * xs);
    }

    public IIIiiiiiIiIiI() {
    }

    public IIIiiiiiIiIiI(Image image) {
        this.ALLATORIxDEMO = image;
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) {
            return;
        }
        this.show(aFlag);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.ALLATORIxDEMO != null) {
            if (this.IiiiiiiiIIIII != null) {
                g.drawImage(this.ALLATORIxDEMO, 1, 0, this.IiiiiiiiIIIII, this.getHeight(), null);
            } else {
                g.drawImage(this.ALLATORIxDEMO, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
        if (this.iiIiiiiiiiIii != null) {
            g.drawImage(this.iiIiiiiiiiIii, 0, 0, this.getWidth(), this.getHeight(), null);
            return;
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, this.getWidth(), this.getHeight());
    }

    public void iIiIiiiiIIiii(String path) {
        this.ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)path);
    }

    public IIIiiiiiIiIiI(String path) {
        this.ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)path);
    }

    public void ALLATORIxDEMO(String path) {
        this.iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)path);
    }

    public void iIiIiiiiIIiii(Image image) {
        this.iiIiiiiiiiIii = image;
    }

    public IIIiiiiiIiIiI(IIiIiiiiIIiii imgCut) {
        this.IiIIIiiiiIiiI = imgCut;
    }

    @Override
    public void repaint(long tm, int x, int y, int width, int height) {
    }

    public Image ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO() {
        this.iiIiiiiiiiIii = null;
    }

    public void ALLATORIxDEMO(IIiIiiiiIIiii imgCut) {
        this.IiIIIiiiiIiiI = imgCut;
    }

    public void ALLATORIxDEMO(Image image) {
        this.ALLATORIxDEMO = image;
    }
}
