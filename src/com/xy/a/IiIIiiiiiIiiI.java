/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.iiIIiiiiiIIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIiiiiiIiiI
extends JComponent {
    private JLabel iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private IIIIIiiiIIIiI iIiIiiiiIiIii;
    private long IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    final /* synthetic */ iiIIiiiiiIIII ALLATORIxDEMO;

    public IiIIiiiiiIiiI(iiIIiiiiiIIII iiIIiiiiiIIII2) {
        this.ALLATORIxDEMO = iiIIiiiiiIIII2;
        this.setPreferredSize(new Dimension(402, 36));
        this.iIiiIiiiiiiII = iiIIiiiiiIIII2.ALLATORIxDEMO().ALLATORIxDEMO(2, 11) ? new IIIiiiiiIiIiI(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"yb500")) : new IIIiiiiiIiIiI(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"236"));
        this.iIiiIiiiiiiII.setBounds(5, 3, 30, 30);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new JLabel("0");
        this.iiiIiiiiiiiIi.setBounds(35, 10, 60, 16);
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiIiiiiiiiIi.setForeground(Color.white);
        this.add(this.iiiIiiiiiiiIi);
        this.IIiiIiiiIIiIi = new JLabel("0");
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.IIiiIiiiIIiIi);
        this.iiIiiiiiiiIii = new JLabel("0");
        this.iiIiiiiiiiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new JLabel("0");
        this.IiiiiiiiIIIII.setBounds(310, 10, 60, 16);
        this.IiiiiiiiIIIII.setForeground(Color.white);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.add(this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new IIIIIiiiIIIiI("sc/e/6.png", 1, 190, "\u4e0b\u67b6", iiIIiiiiiIIII2.ALLATORIxDEMO());
        this.iIiIiiiiIiIii.ALLATORIxDEMO((Object)this);
        this.iIiIiiiiIiIii.setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.iIiIiiiiIiIii.setBounds(365, 9, 34, 17);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    static /* synthetic */ long ALLATORIxDEMO(IiIIiiiiiIiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(String[] vs) {
        this.IiIIIiiiiIiiI = Long.parseLong(vs[0]);
        this.iiiIiiiiiiiIi.setText(vs[1]);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)Long.parseLong(vs[3]));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)(Long.parseLong(vs[1]) * Long.parseLong(vs[3])));
        this.IiiiiiiiIIIII.setText(String.valueOf(Long.parseLong(vs[1]) - Long.parseLong(vs[2])));
        if (vs[4].equals("1")) {
            this.iIiIiiiiIiIii.setForeground(Color.white);
            this.iIiIiiiiIiIii.setBtn(1);
            this.iIiIiiiiIiIii.setText("\u4e0b\u67b6");
        } else if (vs[4].equals("3")) {
            this.iIiIiiiiIiIii.setForeground(Color.gray);
            this.iIiIiiiiIiIii.setBtn(0);
            this.iIiIiiiiIiIii.setText("\u505c\u552e");
        } else {
            this.iIiIiiiiIiIii.setForeground(Color.gray);
            this.iIiIiiiiIiIii.setBtn(0);
            this.iIiIiiiiIiIii.setText("\u552e\u7f44");
        }
        this.IIiiIiiiIIiIi.setBounds(105, 10, 85, 16);
        this.iiIiiiiiiiIii.setBounds(195, 10, 110, 16);
        this.IiiiiiiiIIIII.setVisible(true);
        this.iIiIiiiiIiIii.setVisible(true);
    }

    public void ALLATORIxDEMO() {
        this.iIiIiiiiIiIii.setForeground(Color.gray);
        this.iIiIiiiiIiIii.setBtn(0);
        this.iIiIiiiiIiIii.setText("\u505c\u552e");
    }

    public void ALLATORIxDEMO(long b1, long b2) {
        this.IiIIIiiiiIiiI = 0L;
        this.iiiIiiiiiiiIi.setText(String.valueOf(b2));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)b1);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)(b1 * b2));
        this.IIiiIiiiIIiIi.setBounds(150, 10, 85, 16);
        this.iiIiiiiiiiIii.setBounds(300, 10, 110, 16);
        this.IiiiiiiiIIIII.setVisible(false);
        this.iIiIiiiiIiIii.setVisible(false);
    }
}
