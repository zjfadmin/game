/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIIiiiiIiiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.IIiIIiiiiIiiI;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IiiiiiiiiIiII
extends IIIiiiiiIiIiI {
    private int IIiiIiiiIIiIi;
    private Goodstable iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private String IiiiiiiiIIIII;
    final /* synthetic */ IIiIIiiiiIiiI ALLATORIxDEMO;
    private int IiiiiiiiIIIII;

    public int iIiIiiiiIIiii() {
        return this.ALLATORIxDEMO.ALLATORIxDEMO().getGoodNum(this.iIiIiiiiIiIii.getGoodsid()) / this.IiIIIiiiiIiiI;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiiiiiiiIiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII == null) {
            return;
        }
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        if (this.IiiiiiiiIIIII < 100) {
            int IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().getGoodNum(this.iIiIiiiiIiIii.getGoodsid());
            if (this.IIiiIiiiIIiIi != IiiiiiiiIIIII) {
                this.IIiiIiiiIIiIi = IiiiiiiiIIIII;
                this.iiIiiiiiiiIii = this.IiIIIiiiiIiiI * IiiiiiiiIIIII;
                this.IiiiiiiiIIIII = String.valueOf(this.IIiiIiiiIIiIi) + "/" + this.iiIiiiiiiiIii;
            }
            g.setColor(this.IIiiIiiiIIiIi >= this.iiIiiiiiiiIii ? Color.green : Color.WHITE);
        } else {
            g.setColor(Color.WHITE);
        }
        g.drawString(this.IiiiiiiiIIIII, 8, 15);
    }

    public void ALLATORIxDEMO(int num) {
        if (this.iIiIiiiiIiIii == null) {
            this.IiiiiiiiIIIII = null;
            return;
        }
        if (this.IiiiiiiiIIIII < 100) {
            this.IIiiIiiiIIiIi = this.ALLATORIxDEMO.ALLATORIxDEMO().getGoodNum(this.iIiIiiiiIiIii.getGoodsid());
            this.iiIiiiiiiiIii = this.IiIIIiiiiIiiI * num;
            this.IiiiiiiiIIIII = String.valueOf(this.IIiiIiiiIIiIi) + "/" + this.iiIiiiiiiiIii;
            return;
        }
        this.IiiiiiiiIIIII = null;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, int n2, int n3, Goodstable goodstable) {
        void good;
        void max;
        void min;
        void type;
        this.IiiiiiiiIIIII = type;
        this.IiIIIiiiiIiiI = min;
        this.iiIiiiiiiiIii = max;
        this.iIiIiiiiIiIii = good;
        this.ALLATORIxDEMO(good != null ? 1 : 0, good);
        this.ALLATORIxDEMO(1);
        this.setVisible(type != -1);
    }

    public IiiiiiiiiIiII(IIiIIiiiiIiiI iIiIIiiiiIiiI) {
        this.ALLATORIxDEMO = iIiIIiiiiIiiI;
        super(iIiIIiiiiIiiI.ALLATORIxDEMO());
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO(IIIiiiiiIiIiI.IIIiiiiiIIiII);
    }
}
