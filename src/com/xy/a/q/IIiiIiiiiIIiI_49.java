/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiiiiiiiiiIiI
 *  com.xy.entity.TeamRole
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.iiiiiiiiiiIiI;
import com.xy.entity.TeamRole;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiiIIiI
extends JComponent {
    private int IIiiIiiiIIiIi = 0;
    final /* synthetic */ iiiiiiiiiiIiI iIiIiiiiIiIii;
    private BigDecimal IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IIiiIiiiiIIiI arg0, int arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    public void ALLATORIxDEMO(TeamRole teamRole, int type) {
        if (teamRole == null) {
            this.IiIIIiiiiIiiI = null;
            this.iiIiiiiiiiIii.iIiIiiiiIIiii();
            this.IiiiiiiiIIIII.setText(null);
            this.ALLATORIxDEMO.setText(null);
            this.IIiiIiiiIIiIi = 0;
            return;
        }
        this.IiIIIiiiiIiiI = teamRole.getRoleId();
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + teamRole.getSpeciesId())));
        if (type == 0) {
            this.IiiiiiiiIIIII.setText("");
            this.ALLATORIxDEMO.setText("");
            return;
        }
        this.IiiiiiiiIIIII.setText(teamRole.getName());
        this.ALLATORIxDEMO.setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)teamRole.getGrade())) + "\u7ea7");
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiiIiiiiIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(IIiiIiiiiIIiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public IIiiIiiiiIIiI(iiiiiiiiiiIiI iiiiiiiiiiIiI2) {
        this.iIiIiiiiIiIii = iiiiiiiiiiIiI2;
        this.setPreferredSize(new Dimension(93, 110));
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.setBounds(26, 20, 40, 40);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new JLabel();
        this.IiiiiiiiIIIII.setBounds(0, 67, 93, 15);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new JLabel();
        this.ALLATORIxDEMO.setBounds(0, 82, 93, 15);
        this.ALLATORIxDEMO.setForeground(Color.red);
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.ALLATORIxDEMO.setHorizontalAlignment(0);
        this.add(this.ALLATORIxDEMO);
    }
}
