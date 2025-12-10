/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.iiIIiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IiIIiiiiiiiII
extends JComponent {
    private int iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    final /* synthetic */ iiIIiiiiiIIII iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        if (!this.iIiIiiiiIiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) return;
        int IiiiiiiiIIIII = this.iIiIiiiiIiIii.ALLATORIxDEMO().getGoodNum(this.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii.setText(String.valueOf(IiiiiiiiIIIII) + "/" + this.iiiIiiiiiiiIi);
        this.iiIiiiiiiiIii.setForeground(IiiiiiiiIIIII >= this.iiiIiiiiiiiIi ? Color.green : Color.red);
    }

    public void ALLATORIxDEMO(boolean isDraw) {
        this.IiiiiiiiIIIII = isDraw;
    }

    public BigDecimal ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(Goodstable good, int sum) {
        this.IIiiIiiiIIiIi = good != null ? good.getGoodsid() : null;
        this.iiiIiiiiiiiIi = sum;
        this.ALLATORIxDEMO.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        this.ALLATORIxDEMO.setVisible(true);
        if (this.IIiiIiiiIIiIi != null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.iiIiiiiiiiIii.setText(null);
    }

    public IiIIiiiiiiiII(iiIIiiiiiIIII iiIIiiiiiIIII2, int viewType) {
        this.iIiIiiiiIiIii = iiIIiiiiiIIII2;
        this.setLayout(null);
        this.setOpaque(false);
        this.iIiiIiiiiiiII = viewType;
        this.setPreferredSize(new Dimension(55, 70));
        this.iiIiiiiiiiIii = new JLabel("", 0);
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(iiIIiiiiiIIII2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIiiiiiIiIiI.IIIiiiiiIIiII);
        this.ALLATORIxDEMO.setBounds(0, 0, 55, 55);
        this.iiIiiiiiiiIii.setBounds(0, 55, 55, 15);
        if (this.IiIIIiiiiIiiI != null) {
            this.add(this.IiIIIiiiiIiiI);
        }
        if (this.iiIiiiiiiiIii != null) {
            this.add(this.iiIiiiiiiiIii);
        }
        if (this.ALLATORIxDEMO != null) {
            this.add((Component)this.ALLATORIxDEMO);
        }
        this.ALLATORIxDEMO(null, 0);
    }

    public boolean ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public JLabel ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }
}
