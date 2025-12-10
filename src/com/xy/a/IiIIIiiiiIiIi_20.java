/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.readbean.GoodFight
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.iIiIiiiiiiiIi;
import com.xy.readbean.GoodFight;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.math.BigDecimal;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiIiIi {
    private GoodFight iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    final /* synthetic */ iIiIiiiiiiiIi IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IiIIIiiiiIiIi(iIiIiiiiiiiIi iIiIiiiiiiiIi2, BigDecimal rgid, GoodFight goodFight) {
        this.IiiiiiiiIIIII = iIiIiiiiiiiIi2;
        this.iiIiiiiiiiIii = rgid;
        this.iIiIiiiiIiIii = goodFight;
        this.IiIIIiiiiIiiI = (int)((double)goodFight.getX() / iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)iIiIiiiiiiiIi2) - 2.5);
        this.ALLATORIxDEMO = (int)((double)goodFight.getY() / iIiIiiiiiiiIi.iIiIiiiiIIiii((iIiIiiiiiiiIi)iIiIiiiiiiiIi2) - 2.5);
        this.IiIIIiiiiIiiI += iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)iIiIiiiiiiiIi2)[2].getX();
        this.ALLATORIxDEMO += iIiIiiiiiiiIi.ALLATORIxDEMO((iIiIiiiiiiiIi)iIiIiiiiiiiIi2)[2].getY();
    }

    static /* synthetic */ int iIiIiiiiIIiii(IiIIIiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIIIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ GoodFight ALLATORIxDEMO(IiIIIiiiiIiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public void ALLATORIxDEMO(Graphics g) {
        if (iIiIiiiiiiiIi.ALLATORIxDEMO() == null) {
            iIiIiiiiiiiIi.ALLATORIxDEMO((IIIIIiiiIiIii)iiiiiiiiiiIiI.ALLATORIxDEMO((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"fight"), null));
        }
        if (iIiIiiiiiiiIi.ALLATORIxDEMO() == null) {
            return;
        }
        iIiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        iIiIiiiiiiiIi.ALLATORIxDEMO().ALLATORIxDEMO(g, this.IiIIIiiiiIiiI, this.ALLATORIxDEMO);
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(IiIIIiiiiIiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }
}
