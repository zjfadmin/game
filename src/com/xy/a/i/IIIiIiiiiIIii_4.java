/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIiiiiiiIIIii
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.readbean.LaborShop
 */
package com.xy.a.i;

import com.xy.a.i.IIiiiiiiIIIii;
import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.readbean.LaborShop;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiIIii
extends JComponent {
    final /* synthetic */ iIiIIiiiIIIiI iiIiiiiiiiIii;
    private IIiiiiiiIIIii[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public IIIiIiiiiIIii(iIiIIiiiIIIiI iIiIIiiiIIIiI2, int n) {
        void type;
        this.iiIiiiiiiiIii = iIiIIiiiIIIiI2;
        this.ALLATORIxDEMO = type;
        this.setOpaque(false);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(802, 538));
        this.setBounds(0, 0, 802, 538);
        this.IiiiiiiiIIIII = new IIiiiiiiIIIii[type == true ? 9 : (type == 2 ? 15 : 8)];
    }

    public void iIiIiiiiIIiii() {
    }

    public void ALLATORIxDEMO() {
        List IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO().getShopList(this.ALLATORIxDEMO);
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = (iIiIIiiiIIIiI.ALLATORIxDEMO((iIiIIiiiIIIiI)this.iiIiiiiiiiIii) - 1) * this.IiiiiiiiIIIII.length;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            LaborShop IiiiiiiiIIIII4;
            LaborShop laborShop = IiiiiiiiIIIII4 = IiiiiiiiIIIII3 < IiiiiiiiIIIII.size() ? (LaborShop)IiiiiiiiIIIII.get(IiiiiiiiIIIII3) : null;
            if (IiiiiiiiIIIII4 != null || this.IiiiiiiiIIIII[IiiiiiiiIIIII2] != null) {
                if (this.IiiiiiiiIIIII[IiiiiiiiIIIII2] == null) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII2] = new IIiiiiiiIIIii(this.iiIiiiiiiiIii);
                    if (this.ALLATORIxDEMO == 1) {
                        this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(142 + IiiiiiiiIIIII2 % 3 * 217, 65 + IiiiiiiiIIIII2 / 3 * 149, 213, 124);
                    } else if (this.ALLATORIxDEMO == 2) {
                        this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(144 + IiiiiiiiIIIII2 % 3 * 217, 49 + IiiiiiiiIIIII2 / 3 * 93, 208, 86);
                    } else if (this.ALLATORIxDEMO == 3) {
                        this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(143 + IiiiiiiiIIIII2 % 4 * 163, 52 + IiiiiiiiIIIII2 / 4 * 229, 155, 220);
                    }
                    this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII2]);
                }
                this.IiiiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII4);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setVisible(IiiiiiiiIIIII4 != null);
            }
            ++IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII3;
        }
    }

    static /* synthetic */ IIiiiiiiIIIii[] ALLATORIxDEMO(IIIiIiiiiIIii arg0) {
        return arg0.IiiiiiiiIIIII;
    }
}
