/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.iIiIiiiiIiIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.iIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiIiIII
extends IIIiiiiiIiIiI {
    final /* synthetic */ iIiIiiiiIiIII iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public IIIiIiiiIiIII(iIiIiiiiIiIII iIiIiiiiIiIII2, int type, int index) {
        this.iiIiiiiiiiIii = iIiIiiiiIiIII2;
        if (type != 0) return;
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI(iIiIiiiiIiIII2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setBounds(2, 2, 38, 38);
        this.add((Component)this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)2, (int)2, (int)38, (int)38, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.ALLATORIxDEMO.setText(index == 0 ? "\u7279\u6548" : (index == 1 ? "\u88c5\u9970\u54c1" : (index == 2 ? "\u8db3\u8ff9" : (index == 3 ? "\u7fc5\u8180" : ""))));
        this.add(this.ALLATORIxDEMO);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO(IIIiIiiiIiIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }
}
