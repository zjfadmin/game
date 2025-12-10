/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiIiiiIiIii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 */
package com.xy.a.q;

import com.xy.a.q.IIiiIiiiIiIii;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiiiiiIIIiI
extends JComponent {
    private JLabel iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    final /* synthetic */ IIiiIiiiIiIii iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(Goodstable good, int sum) {
        this.iiIiiiiiiiIii = good != null ? good.getGoodsid() : null;
        this.IIiiIiiiIIiIi = sum;
        this.IiiiiiiiIIIII.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        if (this.iiIiiiiiiiIii == null) {
            this.ALLATORIxDEMO.setText(null);
            this.iIiiIiiiiiiII.setText(null);
            return;
        }
        this.ALLATORIxDEMO.setText(sum > 1 ? String.valueOf(sum) : null);
        this.iIiiIiiiiiiII.setText(good.getGoodsname());
        this.iIiiIiiiiiiII.setForeground(Color.WHITE);
    }

    public IIiiiiiiIIIiI(IIiiIiiiIiIii iIiiIiiiIiIii, int i) {
        this.iIiIiiiiIiIii = iIiiIiiiIiIii;
        this.IiIIIiiiiIiiI = i;
        this.setOpaque(false);
        this.setLayout(null);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(iIiiIiiiIiIii.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setBounds(15, 12, 46, 46);
        this.ALLATORIxDEMO = new JLabel("", 4);
        this.iIiiIiiiiiiII = new JLabel("", 0);
        this.ALLATORIxDEMO.setForeground(Color.red);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.ALLATORIxDEMO.setBounds(43, 17, 18, 15);
        this.iIiiIiiiiiiII.setBounds(0, 60, 76, 15);
        this.add(this.ALLATORIxDEMO);
        this.add(this.iIiiIiiiiiiII);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        IiiiiiiiIIIII.setColor(this.IiIIIiiiiIiiI == IIiiIiiiIiIii.ALLATORIxDEMO((IIiiIiiiIiIii)this.iIiIiiiiIiIii) ? iiIIiiiiIiiII.iIiiIiiiiiiII : iiIIiiiiIiiII.iIiiIiiiIiIIi);
        IiiiiiiiIIIII.fillOval(3, 0, 70, 70);
    }
}
