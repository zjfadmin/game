/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIiiiiiiIIIii
 *  com.xy.a.i.iIIiIiiiIiiIi
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.readbean.LaborShop
 *  com.xy.readbean.LaborVip
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.i;

import com.xy.a.i.IIiiiiiiIIIii;
import com.xy.a.i.iIIiIiiiIiiIi;
import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIiiiiIiIIi
extends JComponent {
    private IIiiiiiiIIIii[] iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private Image IiIIIiiiiIiiI;
    private List<iIIiIiiiIiiIi> iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    final /* synthetic */ iIiIIiiiIIIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(int value) {
        if (this.iIiIiiiiIiIii == value) {
            return;
        }
        this.iIiIiiiiIiIii = value;
        this.iIiiIiiiiiiII = 585;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            iIIiIiiiIiiIi IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (value >= iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII2).getMoney()) {
                if (IiiiiiiiIIIII != 0) {
                    value -= iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)this.iiIiiiiiiiIii.get(IiiiiiiiIIIII - 1)).getMoney();
                }
                int IiiiiiiiIIIII3 = 585 / this.iiIiiiiiiiIii.size();
                this.iIiiIiiiiiiII = (int)((double)IiiiiiiiIIIII3 * ((double)IiiiiiiiIIIII + (double)value / (double)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII2).getMoney()));
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        List IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO().getShopList(0);
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = (iIiIIiiiIIIiI.ALLATORIxDEMO((iIiIIiiiIIIiI)this.ALLATORIxDEMO) - 1) * this.iiiIiiiiiiiIi.length;
        while (IiiiiiiiIIIII2 < this.iiiIiiiiiiiIi.length) {
            LaborShop IiiiiiiiIIIII4;
            LaborShop laborShop = IiiiiiiiIIIII4 = IiiiiiiiIIIII3 < IiiiiiiiIIIII.size() ? (LaborShop)IiiiiiiiIIIII.get(IiiiiiiiIIIII3) : null;
            if (IiiiiiiiIIIII4 != null || this.iiiIiiiiiiiIi[IiiiiiiiIIIII2] != null) {
                if (this.iiiIiiiiiiiIi[IiiiiiiiIIIII2] == null) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII2] = new IIiiiiiiIIIii(this.ALLATORIxDEMO);
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].setBounds(143 + 163 * IiiiiiiiIIIII2, 257, 155, 234);
                    this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII2]);
                }
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(0, IiiiiiiiIIIII4);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII2].setVisible(IiiiiiiiIIIII4 != null);
            }
            ++IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII3;
        }
    }

    public IiiIiiiiIiIIi(iIiIIiiiIIIiI iIiIIiiiIIIiI2) {
        this.ALLATORIxDEMO = iIiIIiiiIIIiI2;
        this.setOpaque(false);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(802, 538));
        this.setBounds(0, 0, 802, 538);
        this.iiIiiiiiiiIii = new ArrayList<iIIiIiiiIiiIi>();
        this.iiiIiiiiiiiIi = new IIiiiiiiIIIii[4];
    }

    static /* synthetic */ IIiiiiiiIIIii[] ALLATORIxDEMO(IiiIiiiiIiIIi arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO() {
        iIIiIiiiIiiIi IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = this.ALLATORIxDEMO.ALLATORIxDEMO().getLoginResult().getPaysum().intValue();
        if (this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO.ALLATORIxDEMO().getLoginResult().getScoretype("\u56de\u9988\u5145\u503c").intValue();
        }
        long IiiiiiiiIIIII3 = this.ALLATORIxDEMO.ALLATORIxDEMO().getPackRecord().getLabortype(0);
        LaborVip[] IiiiiiiiIIIII4 = this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO().getVips();
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
            iIIiIiiiIiiIi iIIiIiiiIiiIi2 = IiiiiiiiIIIII = IiiiiiiiIIIII5 < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(IiiiiiiiIIIII5) : null;
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new iIIiIiiiIiiIi(this.ALLATORIxDEMO, IiiiiiiiIIIII5);
                this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
                this.add(iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII));
                this.add((Component)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII));
            }
            int IiiiiiiiIIIII6 = 0;
            if ((IiiiiiiiIIIII3 >> IiiiiiiiIIIII5 & 1L) == 1L) {
                IiiiiiiiIIIII6 = 2;
            } else if (IiiiiiiiIIIII2 >= IiiiiiiiIIIII4[IiiiiiiiIIIII5].getMoney()) {
                IiiiiiiiIIIII6 = 1;
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII4[IiiiiiiiIIIII5], IiiiiiiiIIIII6, 140 + (IiiiiiiiIIIII5 + 1) * (585 / IiiiiiiiIIIII4.length));
            iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII).setForeground(IiiiiiiiIIIII5 + 1 == IiiiiiiiIIIII4.length ? Color.red : Color.black);
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = this.iiIiiiiiiiIii.size() - 1;
        while (IiiiiiiiIIIII5 >= IiiiiiiiIIIII4.length) {
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.remove(IiiiiiiiIIIII5);
            --IiiiiiiiIIIII5;
            this.remove(iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII));
            this.remove((Component)iIIiIiiiIiiIi.ALLATORIxDEMO((iIIiIiiiIiiIi)IiiiiiiiIIIII));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.IiiiiiiiIIIII == null) {
            this.IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S336.png");
        }
        g.drawImage(this.IiiiiiiiIIIII, 143, 52, null);
        if (this.IiIIIiiiiIiiI == null) {
            this.IiIIIiiiiIiiI = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S337.png");
        }
        g.drawImage(this.IiIIIiiiiIiiI, 148, 190, null);
        if (this.iIiiIiiiiiiII <= 0) return;
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S338.png");
        }
        Graphics IiiiiiiiIIIII = g.create(163, 195, this.iIiiIiiiiiiII, 15);
        IiiiiiiiIIIII.drawImage(this.IIiiIiiiIIiIi, 0, 0, null);
        IiiiiiiiIIIII.dispose();
    }
}
