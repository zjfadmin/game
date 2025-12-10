/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIIIiiiiIiiII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iIIIiiiiIiiII;
import com.xy.i.IiiiiiiiiIIII;
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
static class iiIiIiiiIiIiI
extends JComponent {
    private IiiiiiiiiIIII IIiiIiiiIIiIi;
    private IiiiiiiiiIIII iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    final /* synthetic */ iIIIiiiiIiiII IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(boolean match) {
        this.IiIIIiiiiIiiI = match;
        this.ALLATORIxDEMO.setVisible(match);
        this.iIiIiiiiIiIii.setImage(match ? "sc/c/60" : "sc/b/B439.png");
        if (match) {
            this.iIiIiiiiIiIii.setBounds(482, 239, 25, 25);
            return;
        }
        this.iIiIiiiiIiIii.setBounds(407, 239, 100, 26);
    }

    public iiIiIiiiIiIiI(iIIIiiiiIiiII iIIIiiiiIiiII2) {
        this.IiiiiiiiIIIII = iIIIiiiiIiiII2;
        this.setBounds(0, 0, 602, 375);
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII(null, 1, 208, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.add((Component)this.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/b/B443.png", 1, 209, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.iiIiiiiiiiIii.setBounds(259, 211, 100, 25);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new IiiiiiiiiIIII("sc/b/B444.png", 1, 210, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.IIiiIiiiIIiIi.setBounds(259, 240, 100, 25);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)407, (int)239, (int)100, (int)26, (Color)Color.WHITE, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO.setText("\u6b63\u5728\u5339\u914d");
        this.add(this.ALLATORIxDEMO);
        this.ALLATORIxDEMO(false);
    }

    public boolean ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }
}
