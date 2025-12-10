/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiIiIiiiiIIiI;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiiII
extends JComponent {
    List<IiIiIiiiiIIiI> iiIiiiiiiiIii;
    private BigDecimal IiiiiiiiIIIII;
    final /* synthetic */ iiIiIiiiiIiii ALLATORIxDEMO;

    static /* synthetic */ BigDecimal ALLATORIxDEMO(iiIIiiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(int x, int y) {
        IiIiIiiiiIIiI IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.ALLATORIxDEMO).getComponentCount();
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.pets.size()) {
            RolePet IiiiiiiiIIIII6 = (RolePet)IiiiiiiiIIIII2.pets.get(IiiiiiiiIIIII5);
            if (IiiiiiiiIIIII6.getId().compareTo(this.IiiiiiiiIIIII) != 0) {
                IiIiIiiiiIIiI IiiiiiiiIIIII7;
                IiIiIiiiiIIiI iiIiIiiiiIIiI = IiiiiiiiIIIII7 = IiiiiiiiIIIII3 < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(IiiiiiiiIIIII3) : null;
                if (IiiiiiiiIIIII7 == null) {
                    IiiiiiiiIIIII7 = new IiIiIiiiiIIiI("sc/c/81", 1, 7, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, this.ALLATORIxDEMO.ALLATORIxDEMO());
                    this.iiIiiiiiiiIii.add(IiiiiiiiIIIII7);
                    this.add((Component)IiiiiiiiIIIII7);
                }
                IiiiiiiiIIIII7.setText(String.valueOf(IiiiiiiiIIIII5 + 1));
                int n = 3 + IiiiiiiiIIIII3 % 6 * 18;
                int n2 = 1 + IiiiiiiiIIIII3 / 6 * 18;
                ++IiiiiiiiIIIII3;
                IiiiiiiiIIIII7.setBounds(n, n2, 18, 18);
                IiiiiiiiIIIII7.setVisible(true);
            }
            ++IiiiiiiiIIIII5;
        }
        IiIiIiiiiIIiI iiIiIiiiiIIiI = IiiiiiiiIIIII = IiiiiiiiIIIII3 < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(IiiiiiiiIIIII3) : null;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new IiIiIiiiiIIiI("sc/c/81", 1, 7, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, this.ALLATORIxDEMO.ALLATORIxDEMO());
            this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
            this.add((Component)IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.setText("X");
        int n = 3 + IiiiiiiiIIIII3 % 6 * 18;
        int n3 = 1 + IiiiiiiiIIIII3 / 6 * 18;
        IiiiiiiiIIIII.setBounds(n, n3, 18, 18);
        IiiiiiiiIIIII.setVisible(true);
        int IiiiiiiiIIIII8 = ++IiiiiiiiIIIII3;
        while (IiiiiiiiIIIII8 < this.iiIiiiiiiiIii.size()) {
            IiIiIiiiiIIiI iiIiIiiiiIIiI2 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII8);
            ++IiiiiiiiIIIII8;
            iiIiIiiiiIIiI2.setVisible(false);
        }
        iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.ALLATORIxDEMO).setBounds(x, y, 114, 20 + (IiiiiiiiIIIII3 - 1) / 6 * 18);
    }

    public void ALLATORIxDEMO(BigDecimal pointId) {
        this.IiiiiiiiIIIII = pointId;
    }

    public iiIIiiiiIiiII(iiIiIiiiiIiii iiIiIiiiiIiii2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiii2;
        this.setLayout(null);
        this.setBackground(com.xy.q.iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setVisible(false);
        this.iiIiiiiiiiIii = new ArrayList<IiIiIiiiiIIiI>();
    }
}
