/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIiiiiIiIII {
    private int iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private String IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    final /* synthetic */ iIiIiiiiiiiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ int iiiIiiiiiiIIi(iIIIiiiiIiIII arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    /*
     * WARNING - void declaration
     */
    public iIIIiiiiIiIII(iIiIiiiiiiiIi iIiIiiiiiiiIi2, int n, int n2, int n3, String string) {
        void name;
        void y;
        void x;
        this.IiiiiiiiIIIII = iIiIiiiiiiiIi2;
        this.ALLATORIxDEMO = x;
        this.IiIIIiiiiIiiI = y;
        this.IIiiIiiiIIiIi = name != null ? name : "";
    }

    static /* synthetic */ void iiiIiiiiiiIIi(iIIIiiiiIiIII arg0, int arg1) {
        arg0.iIiIiiiiIiIii = arg1;
    }

    static /* synthetic */ void iIiIiiiiIIiii(iIIIiiiiIiIII arg0, int arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    static /* synthetic */ int iIiIiiiiIIiii(iIIIiiiiIiIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics) {
        void g;
        g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        graphics.setColor(this.iIiIiiiiIiIii == 1 ? Color.cyan : Color.green);
        if (this.iIiiIiiiiiiII == 0) {
            this.iIiiIiiiiiiII = g.getFontMetrics().stringWidth(this.IIiiIiiiIIiIi);
            this.iiiiIiiiIiiII = this.ALLATORIxDEMO - this.iIiiIiiiiiiII / 2 + 5;
            this.iiiIiiiiiiiIi = this.IiIIIiiiiIiiI + 8;
        }
        g.drawString(this.IIiiIiiiIIiIi, this.iiiiIiiiIiiII, this.iiiIiiiiiiiIi);
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIIiiiiIiIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIiiiiIiIII arg0, int arg1) {
        arg0.IiIIIiiiiIiiI = arg1;
    }
}
