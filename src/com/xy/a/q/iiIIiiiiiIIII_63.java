/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiiIiiiiiIIi
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iIiiIiiiiiIIi;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiiiiiIIII
extends JComponent {
    private IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private IiiiIiiiiIiIi iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public BigDecimal ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void ALLATORIxDEMO(Goodstable good, int sum, int isDraw) {
        this.IIiiIiiiIIiIi = good != null ? good.getGoodsid() : null;
        this.iIiIiiiiIiIii = sum;
        this.IiiiiiiiIIIII = isDraw == 1;
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        this.iiiIiiiiiiiIi.setVisible(true);
        if (this.IIiiIiiiIIiIi == null) {
            this.iiIiiiiiiiIii.setText(null);
            this.IiIIIiiiiIiiI.setText(null);
            return;
        }
        this.iiIiiiiiiiIii.setText(sum > 1 ? String.valueOf(sum) : null);
        this.IiIIIiiiiIiiI.setText(good.getGoodsname());
        this.IiIIIiiiiIiiI.setForeground(Color.BLACK);
    }

    public void ALLATORIxDEMO(boolean isDraw) {
        this.IiiiiiiiIIIII = isDraw;
    }

    public boolean ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable good, int sum) {
        this.IIiiIiiiIIiIi = good != null ? good.getGoodsid() : null;
        this.iIiIiiiiIiIii = sum;
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
        this.iiiIiiiiiiiIi.setVisible(true);
        if (this.IIiiIiiiIIiIi != null) {
            this.ALLATORIxDEMO();
            return;
        }
        this.IiIIIiiiiIiiI.setText(null);
    }

    static /* synthetic */ boolean ALLATORIxDEMO(iiIIiiiiiIIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO() {
        if (this.IIiiIiiiIIiIi == null) return;
        int IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO().getGoodNum(this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI.setText(String.valueOf(IiiiiiiiIIIII) + "/" + this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI.setForeground(IiiiiiiiIIIII >= this.iIiIiiiiIiIii ? Color.green : Color.red);
    }

    public JLabel ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public iiIIiiiiiIIII(int viewType, IiiiIiiiiIiIi form) {
        this.iIiiIiiiiiiII = form;
        this.setLayout(null);
        this.setOpaque(false);
        this.ALLATORIxDEMO = viewType;
        if (this.ALLATORIxDEMO == 1) {
            this.setPreferredSize(new Dimension(75, 70));
            this.iiIiiiiiiiIii = new JLabel("", 4);
            this.IiIIIiiiiIiiI = new JLabel("", 0);
            this.iiIiiiiiiiIii.setForeground(Color.red);
            this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.iiiIiiiiiiiIi = new iIiiIiiiiiIIi(this, form);
            this.iiIiiiiiiiIii.setBounds(0, 5, 63, 15);
            this.IiIIIiiiiIiiI.setBounds(0, 55, 75, 15);
            this.iiiIiiiiiiiIi.setBounds(10, 0, 55, 55);
        } else {
            this.setPreferredSize(new Dimension(55, 70));
            this.IiIIIiiiiIiiI = new JLabel("", 0);
            this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
            this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
            this.IiIIIiiiiIiiI.setBounds(0, 55, 55, 15);
            this.iiiIiiiiiiiIi.setBounds(0, 0, 55, 55);
        }
        if (this.iiIiiiiiiiIii != null) {
            this.add(this.iiIiiiiiiiIii);
        }
        if (this.IiIIIiiiiIiiI != null) {
            this.add(this.IiIIIiiiiIiiI);
        }
        if (this.iiiIiiiiiiiIi != null) {
            this.add((Component)this.iiiIiiiiiiiIi);
        }
        this.ALLATORIxDEMO(null, 0);
    }
}
