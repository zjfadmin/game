/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiIiiiiiIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiIiiiiiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiIIIiI
extends JComponent {
    private JLabel iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)4, (int)4, (int)50, (int)16, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    final /* synthetic */ IiIiIiiiiiIiI IiiiiiiiIIIII;
    private com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO() {
        this.iIiIiiiiIiIii.setText(null);
        this.ALLATORIxDEMO.ALLATORIxDEMO(0, null);
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iiIiIiiiIIIiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO(iiIiIiiiIIIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public iiIiIiiiIIIiI(IiIiIiiiiiIiI iiIiIiiiiiIiI) {
        this.IiiiiiiiIIIII = iiIiIiiiiiIiI;
        this.add(this.iIiIiiiiIiIii);
        this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iiIiIiiiiiIiI.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(4, 4, 50, 50);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI("sc/d/4.png");
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/30.png");
        this.iiIiiiiiiiIii.setBounds(0, 0, 59, 57);
        this.IiIIIiiiiIiiI.setBounds(1, 57, 58, 1);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.IiIIIiiiiIiiI);
    }
}
