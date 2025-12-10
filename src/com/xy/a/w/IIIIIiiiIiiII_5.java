/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIiIiiiiIiiIi
 *  com.xy.a.w.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIiIiiiiIiiIi;
import com.xy.a.w.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiIiiII
extends IIIiiiiiIiIiI {
    private IIiIiiiiIiiIi[] iiIiiiiiiiIii;
    final /* synthetic */ IiIiIiiiiIIiI IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO = new JLabel[3];

    static /* synthetic */ IIiIiiiiIiiIi[] ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public IIIIIiiiIiiII(IiIiIiiiiIIiI iiIiIiiiiIIiI) {
        this.IiiiiiiiIIIII = iiIiIiiiiIIiI;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFBD833"), (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.IiIIIiiiIiiIi : iiIIiiiiIiiII.iiIiiiiiiIIiI));
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(0, 2, 170, 34);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("\u95e8\u6d3e");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(48, 39, 36, 14);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c00FF00"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(86, 39, 72, 14);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIiIiiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIiIiiiiIiiIi(iiIiIiiiiIIiI);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(2, 56 + IiiiiiiiIIIII * 49, 165, 45);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.ALLATORIxDEMO;
    }
}
