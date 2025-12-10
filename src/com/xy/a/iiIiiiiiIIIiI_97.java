/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Component;
import java.awt.Graphics;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiiiiiIIIiI
extends IIIiiiiiIiIiI {
    private int iIiIiiiiIiIii;
    private IIIIIiiiIiIii IiIIIiiiiIiiI;
    final /* synthetic */ IiIiIiiiIIiiI iiIiiiiiiiIii;
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    static /* synthetic */ boolean ALLATORIxDEMO(iiIiiiiiIIIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(boolean tips) {
        this.ALLATORIxDEMO = tips;
        this.IiIIIiiiiIiiI = null;
    }

    public iiIiiiiiIIIiI(IiIiIiiiIIiiI iiIiIiiiIIiiI, int type) {
        this.iiIiiiiiiiIii = iiIiIiiiIIiiI;
        super("sc/c/27");
        this.iIiIiiiiIiIii = type;
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/c/" + (28 + type), 1, 10 + type, iiIiIiiiIIiiI.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setBounds(3, 3, 33, 33);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (!this.ALLATORIxDEMO) {
            return;
        }
        if (this.IiIIIiiiiIiiI == null) {
            if (this.iIiIiiiiIiIii == 3) {
                this.IiIIIiiiiIiiI = IIiIiiiiIiiIi.ALLATORIxDEMO((String)IIiIiiiiIiiIi.IIiiIiiiIIiIi);
            } else if (this.iIiIiiiiIiIii == 9) {
                this.IiIIIiiiiIiiI = IIiIiiiiIiiIi.ALLATORIxDEMO((String)IIiIiiiiIiiIi.iiIIIiiiiiiiI);
            }
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, 3, 3);
    }
}
