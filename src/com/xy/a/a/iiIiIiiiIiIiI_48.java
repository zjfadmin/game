/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIIIiiiiIiiII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iIIIiiiiIiiII;
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
static class iiIiIiiiIiIiI
extends IIIiiiiiIiIiI {
    final /* synthetic */ iIIIiiiiIiiII iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO(iiIiIiiiIiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public iiIiIiiiIiIiI(iIIIiiiiIiiII iIIIiiiiIiiII2, int type, int index) {
        this.iiIiiiiiiiIii = iIIIiiiiIiiII2;
        if (type == 0) {
            this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iIIIiiiiIiiII2.ALLATORIxDEMO());
            this.ALLATORIxDEMO.setBounds(2, 2, 41, 41);
            this.add((Component)this.ALLATORIxDEMO);
            this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)45, (int)45, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.IiiiiiiiIIIII.setText("\u6682\u65e0");
            this.add(this.IiiiiiiiIIIII);
            this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            return;
        }
        if (type == 1) {
            this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iIIIiiiiIiiII2.ALLATORIxDEMO());
            this.ALLATORIxDEMO.setBounds(4, 4, 50, 50);
            this.add((Component)this.ALLATORIxDEMO);
            this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)59, (int)57, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.IiiiiiiiIIIII.setText(index == 0 ? "\u8863\u670d" : (index == 1 ? "\u5e3d\u5b50" : (index == 2 ? "\u978b\u5b50" : (index == 3 ? "\u6b66\u5668" : ""))));
            this.add(this.IiiiiiiiIIIII);
            this.ALLATORIxDEMO("sc/d/4.png");
            return;
        }
        if (type == 2) {
            this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iIIIiiiiIiiII2.ALLATORIxDEMO());
            this.ALLATORIxDEMO.setBounds(4, 4, 50, 50);
            this.add((Component)this.ALLATORIxDEMO);
            this.ALLATORIxDEMO("sc/d/4.png");
            return;
        }
        if (type != 3) return;
        this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(11, 11, 38, 38);
        this.add((Component)this.ALLATORIxDEMO);
        this.ALLATORIxDEMO("sc/d/40.png");
    }
}
