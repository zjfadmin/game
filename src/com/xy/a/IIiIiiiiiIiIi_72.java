/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiIiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiIiIiiiIIiiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiIiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiiIiIi
extends IIIiiiiiIiIiI {
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    final /* synthetic */ IiIiIiiiIIiiI ALLATORIxDEMO;

    public IIiIiiiiiIiIi(IiIiIiiiIIiiI iiIiIiiiIIiiI) {
        this.ALLATORIxDEMO = iiIiIiiiIIiiI;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/25", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iIIiIiiiIiiIi();
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].addMouseListener((MouseListener)new iiIiIiiiIiIiI(2 + IiiiiiiiIIIII, iiIiIiiiIIiiI.ALLATORIxDEMO()));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d" : (IiiiiiiiIIIII == 1 ? "\u7ec4\u961f" : (IiiiiiiiIIIII == 2 ? "\u5e2e\u6d3e" : (IiiiiiiiIIIII == 3 ? "\u4e16\u754c" : "\u4f20\u97f3"))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(1, 1 + 18 * IiiiiiiiIIIII, 45, 18);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(int type) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == type ? IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/26", (int)5, (int)5, (int)5, (int)5, (boolean)false) : null);
            ++IiiiiiiiIIIII;
        }
    }
}
