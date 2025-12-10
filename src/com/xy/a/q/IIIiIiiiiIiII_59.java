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
static class IIIiIiiiiIiII
extends JComponent {
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private IiiiiiiiiIIII IIiiIiiiIIiIi;
    private IiiiiiiiiIIII iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    final /* synthetic */ iIIIiiiiIiiII iiIiiiiiiiIii;
    private IiiiiiiiiIIII IiiiiiiiIIIII;
    private IiiiiiiiiIIII ALLATORIxDEMO;

    public void ALLATORIxDEMO(boolean match) {
        this.IiIIIiiiiIiiI = match;
        this.iIiiIiiiiiiII.setVisible(match);
        this.iiiIiiiiiiiIi.setImage(match ? "sc/c/60" : "sc/b/B440.png");
        if (match) {
            this.iiiIiiiiiiiIi.setBounds(173, 300, 25, 25);
            return;
        }
        this.iiiIiiiiiiiIi.setBounds(98, 300, 100, 26);
    }

    public boolean ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public IIIiIiiiiIiII(iIIIiiiiIiiII iIIIiiiiIiiII2) {
        this.iiIiiiiiiiIii = iIIIiiiiIiiII2;
        this.setBounds(0, 0, 602, 375);
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII(null, 1, 211, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IIiiIiiiIIiIi = new IiiiiiiiiIIII("sc/b/B443.png", 1, 212, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.ALLATORIxDEMO = new IiiiiiiiiIIII("sc/b/B445.png", 1, 213, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII = new IiiiiiiiiIIII("sc/b/B446.png", 1, 214, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII("sc/b/B447.png", 1, 215, iIIIiiiiIiiII2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(259, 276, 100, 25);
        this.IiiiiiiiIIIII.setBounds(259, 305, 100, 25);
        this.iIiIiiiiIiIii.setBounds(439, 276, 100, 25);
        this.IIiiIiiiIIiIi.setBounds(439, 305, 100, 25);
        this.IIiiIiiiIIiIi.setVisible(false);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.iIiIiiiiIiIii);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)98, (int)300, (int)100, (int)26, (Color)Color.WHITE, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.iIiiIiiiiiiII.setText("\u6b63\u5728\u5339\u914d");
        this.add(this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO(false);
    }
}
