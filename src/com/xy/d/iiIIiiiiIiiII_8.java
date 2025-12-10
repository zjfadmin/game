/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.StallBean
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.bean.StallBean;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IiiiIiiiiIiIi;
import java.awt.Color;
import java.awt.Graphics;

public class iiIIiiiiIiiII
extends iiiiiiiiiiIiI {
    private transient IIiIiiiiIIiii IIiiiiiiIiiII;
    public StallBean IiiiIiiiIiIII;
    private boolean IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    private int iiiiIiiiIIiii;
    private boolean iiIIIiiiiiiiI;
    public static int IiIiiiiiIIIII = 0;
    private boolean iiIiIiiiiIIIi;
    private static Color iiiiIiiiIiiII;
    public static int iiiIiiiiiiiIi;
    public static int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private static IiiiIiiiiIiIi iIiIiiiiIiIii;
    public static int IiIIIiiiiIiiI;
    private static Color ALLATORIxDEMO;

    public void IiiIiiiiiiIiI(Graphics g) {
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(Graphics graphics, iiiiiiiiiiIiI iiiiiiiiiiIiI2, GameView gameView) {
        void g;
        g.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        graphics.setColor(this.iiIIIiiiiiiiI ? iiiiIiiiIiiII : ALLATORIxDEMO);
        if (this.IIiiiiiiiIIIi) {
            if (this.iiIiIiiiiIIIi) {
                this.IIiiiiiiIiiII = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/stall2.png", (int)7, (int)7, (int)16, (int)7, (boolean)false);
                this.IIiiIiiiIIiIi = g.getFontMetrics().stringWidth((String)this.IIIiiiiiIIiII);
                if (this.IIiiIiiiIIiIi < 96) {
                    this.iiiiIiiiIIiii = 110;
                    this.IIiiIiiiIIiIi = 48 - this.IIiiIiiiIIiIi / 2 + 8;
                } else {
                    this.iiiiIiiiIIiii = 14 + this.IIiiIiiiIIiIi;
                    this.IIiiIiiiIIiIi = 8;
                }
                this.iiiiIiiiIIiii += 14;
                this.IIIiiiiiIIiII = 29;
                this.iiIiIiiiiIIIi = false;
            }
            g.translate(this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi - 2);
            this.IIiiiiiiIiiII.ALLATORIxDEMO((Graphics)g, this.iiiiIiiiIIiii, this.IIIiiiiiIIiII);
            g.drawString((String)this.IIIiiiiiIIiII, this.IIiiIiiiIIiIi, 20);
            g.translate(-this.iiIiiiiiiIIiI, -this.iIiiIiiiIiIIi + 2);
            return;
        }
        if (this.iiIiIiiiiIIIi) {
            this.IIiiiiiiIiiII = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/b/stall1.png", (int)7, (int)7, (int)7, (int)7, (boolean)false);
            this.IIiiIiiiIIiIi = g.getFontMetrics().stringWidth((String)this.IIIiiiiiIIiII);
            if (this.IIiiIiiiIIiIi < 96) {
                this.iiiiIiiiIIiii = 110;
                this.IIiiIiiiIIiIi = 48 - this.IIiiIiiiIIiIi / 2 + 8;
            } else {
                this.iiiiIiiiIIiii = 14 + this.IIiiIiiiIIiIi;
                this.IIiiIiiiIIiIi = 8;
            }
            this.IIIiiiiiIIiII = 24;
            this.iiIiIiiiiIIIi = false;
        }
        g.translate(this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi);
        this.IIiiiiiiIiiII.ALLATORIxDEMO((Graphics)g, this.iiiiIiiiIIiii, this.IIIiiiiiIIiII);
        g.drawString((String)this.IIIiiiiiIIiII, this.IIiiIiiiIIiIi, 17);
        g.translate(-this.iiIiiiiiiIIiI, -this.iIiiIiiiIiIIi);
    }

    static {
        iIiiIiiiiiiII = 1;
        IiIIIiiiiIiiI = 2;
        iiiIiiiiiiiIi = 3;
        ALLATORIxDEMO = new Color(203, 181, 91);
        iiiiIiiiIiiII = new Color(211, 146, 112);
    }

    public void ALLATORIxDEMO(GameView gameView) {
        this.iiIIIiiiiiiiI = true;
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"stallget", (String)String.valueOf(this.IiiiIiiiIiIII.getId()));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public boolean iiiIiiiiiiIIi() {
        if (this.IiiiIiiiIiIII.getState() != IiIIIiiiiIiiI) return false;
        return true;
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        if (this.IiiiIiiiIiIII.getState() != IiIIIiiiiIiiI) return false;
        if (iIiIiiiiIiIii != null) return iIiIiiiiIiIii.ALLATORIxDEMO(x - (this.iiIiIiiiiIIIi + 50), y - (this.IIiiiiiiiIIIi + 135));
        iIiIiiiiIiIii = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)"300040", (int)2, (int)1, null);
        return iIiIiiiiIiIii.ALLATORIxDEMO(x - (this.iiIiIiiiiIIIi + 50), y - (this.IIiiiiiiiIIIi + 135));
    }

    public boolean iIiIiiiiIIiii(int x, int y) {
        if (this.iiIiIiiiiIIIi) return false;
        if (x <= this.iiIiIiiiiIIIi) return false;
        if (y <= this.IIiiiiiiiIIIi) return false;
        if (x >= this.iiIiIiiiiIIIi + this.iiiiIiiiIIiii) return false;
        if (y >= this.IIiiiiiiiIIIi + this.IIIiiiiiIIiII) return false;
        return true;
    }

    public iiIIiiiiIiiII(StallBean stallBean) {
        this.iIIiIiiiiiiIi = 11;
        this.ALLATORIxDEMO(stallBean);
    }

    public boolean iIiIiiiiIIiii() {
        return this.iiIIIiiiiiiiI;
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        if (unit.IIIIiiiiiiiII <= this.IIIIiiiiiiiII) return -1;
        return 1;
    }

    public void ALLATORIxDEMO(Graphics g, iiiiiiiiiiIiI XZUnit, GameView view) {
        if (iIiIiiiiIiIii == null) {
            iIiIiiiiIiIii = com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((String)"300040", (int)2, (int)1, null);
        }
        if (XZUnit == this) {
            iIiIiiiiIiIii.iIiIiiiiIIiIi(g, this.iiIiiiiiiIIiI + 50, this.iIiiIiiiIiIIi + 135, this.iiIiiiiiiiIii, (long)this.iiiiIiiiIIiii, 1.0f);
            return;
        }
        iIiIiiiiIiIii.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI + 50, this.iIiiIiiiIiIIi + 135, this.iiIiiiiiiiIii, (long)this.iiiiIiiiIIiii);
    }

    public void iiiIiiiiiiIIi(Graphics g) {
    }

    public void ALLATORIxDEMO(StallBean stallBean) {
        try {
            this.IiiiIiiiIiIII = stallBean;
            this.iiIiIiiiiIIIi = true;
            this.iiIiIiiiiIIIi = stallBean.getX();
            this.IIiiiiiiiIIIi = stallBean.getY();
            this.IiiiiiiiIIIII = 0;
            this.IIIiiiiiIIiII = (int)stallBean.getStall();
            this.iiiIiiiiiiiIi = (int)null;
            this.iiIiiiiiiiIii = 4;
            this.IIiiiiiiiIIIi = stallBean.ALLATORIxDEMO();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public void iIiIiiiiIIiii(boolean click) {
        this.iiIIIiiiiiiiI = click;
    }
}
