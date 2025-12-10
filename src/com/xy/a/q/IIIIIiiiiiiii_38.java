/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiiIiiiIiIIi
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iIiiIiiiIiIIi;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiiiiii {
    final /* synthetic */ iIiiIiiiIiIIi iIiIiiiiIiIii;
    private IiiiiiiiiIIII IiIIIiiiiIiiI;
    private IiiiIiiiiIiIi iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    static /* synthetic */ BigDecimal ALLATORIxDEMO(IIIIIiiiiiiii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(String value) {
        this.IiIIIiiiiIiiI.setVisible(value != null);
        if (value == null) {
            iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[6 + 4 * this.IiiiiiiiIIIII].setText(null);
            iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[7 + 4 * this.IiiiiiiiIIIII].setText(null);
            iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[8 + 4 * this.IiiiiiiiIIIII].setText(null);
            iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[9 + 4 * this.IiiiiiiiIIIII].setText(null);
            this.ALLATORIxDEMO = null;
            this.iiIiiiiiiiIii = null;
            return;
        }
        String[] IiiiiiiiIIIII = value.split("=");
        int IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII[5]);
        int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[6]);
        this.ALLATORIxDEMO = new BigDecimal(IiiiiiiiIIIII[0]);
        this.iiIiiiiiiiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII[1], (int)7, (int)1, null);
        iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[6 + 4 * this.IiiiiiiiIIIII].setText(IiiiiiiiIIIII[3]);
        iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[7 + 4 * this.IiiiiiiiIIIII].setText(IiiiIiiiiIIII.iIiIiiiiIIiii((int)Integer.parseInt(IiiiiiiiIIIII[2])));
        iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[8 + 4 * this.IiiiiiiiIIIII].setText(IiiiiiiiIIIII[4]);
        iIiiIiiiIiIIi.ALLATORIxDEMO((iIiiIiiiIiIIi)this.iIiIiiiiIiIii)[9 + 4 * this.IiiiiiiiIIIII].setText(String.valueOf(IiiiiiiiIIIII3) + "/" + (IiiiiiiiIIIII2 - IiiiiiiiIIIII3));
    }

    /*
     * WARNING - void declaration
     */
    public IIIIIiiiiiiii(iIiiIiiiIiIIi iIiiIiiiIiIIi2, int n, iIiiIiiiIiIIi iIiiIiiiIiIIi3) {
        void view;
        void index;
        this.iIiIiiiiIiIii = iIiiIiiiIiIIi2;
        this.IiiiiiiiIIIII = n;
        this.IiIIIiiiiIiiI = new IiiiiiiiiIIII("sc/e/7.png", 1, 58 + index, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u819c\u62dc", (com.xy.q.IiiiIiiiiIiIi)view);
        this.IiIIIiiiiIiiI.setBounds(68 + 117 * index, 390, 59, 26);
        view.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(Graphics g) {
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 94 + this.IiiiiiiiIIIII * 117, 286, 0, System.currentTimeMillis());
    }
}
