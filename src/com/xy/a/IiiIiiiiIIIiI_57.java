/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIiiiiIIIiI {
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    final /* synthetic */ iIiIiiiiiiiIi IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private String IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    static /* synthetic */ int iIiIiiiiIIiii(IiiIiiiiIIIiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ void iIiIiiiiIIiii(IiiIiiiiIIIiI arg0, int arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    public void ALLATORIxDEMO(Graphics g) {
        g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        g.setColor(Color.green);
        if (this.iIiIiiiiIiIii == 0) {
            this.iIiIiiiiIiIii = g.getFontMetrics().stringWidth(this.IiiiiiiiIIIII);
            this.iIiiIiiiiiiII = this.ALLATORIxDEMO + 12;
            this.IIiiIiiiIIiIi = this.iiIiiiiiiiIii + 8;
        }
        g.drawString(this.IiiiiiiiIIIII, this.iIiiIiiiiiiII, this.IIiiIiiiIIiIi);
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() / 100L % 2L == 0L) {
            if (iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI) == null) {
                iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI, (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/111.png"));
            }
            g.drawImage(iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI), this.ALLATORIxDEMO, this.iiIiiiiiiiIii, null);
            return;
        }
        if (iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI) == null) {
            iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI, (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/e/112.png"));
        }
        g.drawImage(iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)this.IiIIIiiiiIiiI), this.ALLATORIxDEMO, this.iiIiiiiiiiIii, null);
    }

    /*
     * WARNING - void declaration
     */
    public IiiIiiiiIIIiI(iIiIiiiiiiiIi iIiIiiiiiiiIi2, int n, int n2, String string) {
        void name;
        void y;
        void x;
        this.IiIIIiiiiIiiI = iIiIiiiiiiiIi2;
        this.ALLATORIxDEMO = x;
        this.iiIiiiiiiiIii = y;
        this.IiiiiiiiIIIII = name != null ? name : "";
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiIiiiiIIIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiIiiiiIIIiI arg0, int arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }
}
