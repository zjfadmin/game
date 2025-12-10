/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiiiiii
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.iIiIIiiiiiiii;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiIiiiiiIII
extends JComponent {
    final /* synthetic */ iIiIIiiiiiiii iiIiiiiiiiIii;
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)5, (int)0, (int)150, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);

    public String ALLATORIxDEMO() {
        return this.ALLATORIxDEMO.getText();
    }

    public iiiiIiiiiiIII(iIiIIiiiiiiii iIiIIiiiiiiii2, String text) {
        this.iiIiiiiiiiIii = iIiIIiiiiiiii2;
        this.ALLATORIxDEMO.setText(text);
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/e/140.png", 1, 343, iIiIIiiiiiiii2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.ALLATORIxDEMO((Object)this);
        this.IiiiiiiiIIIII.setBounds(160, 4, 12, 12);
        this.add(this.ALLATORIxDEMO);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
