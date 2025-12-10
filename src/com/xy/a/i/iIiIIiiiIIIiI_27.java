/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiIiiiiIIii
 *  com.xy.a.i.IiiIiiiiIiIIi
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.LaborVip
 *  com.xy.text.GameView
 */
package com.xy.a.i;

import com.xy.a.i.IIIiIiiiiIIii;
import com.xy.a.i.IiiIiiiiIiIIi;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.LaborVip;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private JLabel IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private iiIiIiiiiIiii iiiIiiiiiiiIi;
    private iIiIIiiiIIIiI iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private iiIiIiiiiIiii[] iIiIiiiiIiIii;
    private JComponent[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private iiIiIiiiiIiii ALLATORIxDEMO;

    static /* synthetic */ int ALLATORIxDEMO(iIiIIiiiIIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iiiIiiiiiiIIi(int index) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == index);
            ++IiiiiiiiIIIII;
        }
        if (this.IiIIIiiiiIiiI[index] == null) {
            this.IiIIIiiiiIiiI[index] = index == 0 ? new IiiIiiiiIiIIi(this) : new IIIiIiiiiIIii(this, index);
            if (this.IiIIIiiiiIiiI[index] != null) {
                this.add(this.IiIIIiiiiIiiI[index], 1);
            }
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            if (this.IiIIIiiiiIiiI[IiiiiiiiIIIII] != null) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(IiiiiiiiIIIII == index);
                if (IiiiiiiiIIIII == index) {
                    IiiIiiiiIiIIi IiiiiiiiIIIII2;
                    iIiIIiiiIIIiI iIiIIiiiIIIiI2 = this;
                    if (index == 0) {
                        IiiiiiiiIIIII2 = (IiiIiiiiIiIIi)iIiIIiiiIIIiI2.IiIIIiiiiIiiI[index];
                        IiiiiiiiIIIII2.ALLATORIxDEMO();
                        this.iiiiIiiiIiiII = 1 + (this.ALLATORIxDEMO().ALLATORIxDEMO().getShopList(0).size() - 1) / IiiIiiiiIiIIi.ALLATORIxDEMO((IiiIiiiiIiIIi)IiiiiiiiIIIII2).length;
                    } else {
                        IiiiiiiiIIIII2 = (IIIiIiiiiIIii)iIiIIiiiIIIiI2.IiIIIiiiiIiiI[index];
                        IiiiiiiiIIIII2.iIiIiiiiIIiii();
                        this.iiiiIiiiIiiII = 1 + (this.ALLATORIxDEMO().ALLATORIxDEMO().getShopList(index).size() - 1) / IIIiIiiiiIIii.ALLATORIxDEMO((IIIiIiiiiIIii)IiiiiiiiIIIII2).length;
                    }
                }
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiii(1);
    }

    public void iIiIiiiiIIiii(int index) {
        if (index == -2 || index == -1) {
            if ((index = this.IIiiIiiiIIiIi + (index == -2 ? -1 : 1)) <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u9996\u9875");
                return;
            }
            if (index > this.iiiiIiiiIiiII) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u5c3e\u9875");
                return;
            }
        }
        this.IIiiIiiiIIiIi = index;
        if (this.IIiiIiiiIIiIi > this.iiiiIiiiIiiII) {
            this.iiiiIiiiIiiII = this.IIiiIiiiIIiIi;
        }
        this.iiIiiiiiiiIii.setText(String.valueOf(this.IIiiIiiiIIiIi) + "/" + this.iiiiIiiiIiiII);
        if (this.iIiIiiiiIiIii[0].ALLATORIxDEMO() && this.IiIIIiiiiIiiI[0] != null) {
            ((IiiIiiiiIiIIi)this.IiIIIiiiiIiiI[0]).iIiIiiiiIIiii();
            return;
        }
        if (this.iIiIiiiiIiIii[1].ALLATORIxDEMO() && this.IiIIIiiiiIiiI[1] != null) {
            ((IIIiIiiiiIIii)this.IiIIIiiiiIiiI[1]).ALLATORIxDEMO();
            return;
        }
        if (this.iIiIiiiiIiIii[2].ALLATORIxDEMO() && this.IiIIIiiiiIiiI[2] != null) {
            ((IIIiIiiiiIIii)this.IiIIIiiiiIiiI[2]).ALLATORIxDEMO();
            return;
        }
        if (!this.iIiIiiiiIiIii[3].ALLATORIxDEMO()) return;
        if (this.IiIIIiiiiIiiI[3] == null) return;
        ((IIIiIiiiiIIii)this.IiIIIiiiiIiiI[3]).ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi(0);
        super.iIiIiiiiIIiii();
    }

    public double ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getPaysum().intValue();
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getScoretype("\u56de\u9988\u5145\u503c").intValue();
        }
        LaborVip[] IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO().getVips();
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.length - 1;
        while (IiiiiiiiIIIII3 >= 0) {
            if (IiiiiiiiIIIII >= IiiiiiiiIIIII2[IiiiiiiiIIIII3].getMoney()) {
                return IiiiiiiiIIIII2[IiiiiiiiIIIII3].getZk();
            }
            --IiiiiiiiIIIII3;
        }
        return 1.0;
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiIIIII, (long)IiiiiiiiIIIII.getLoginResult().getCodecard().longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII, (long)IiiiiiiiIIIII.getLoginResult().getMoney().intValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiIiiiiIIIi, (long)IiiiiiiiIIIII.getLoginResult().getScoretype("\u56de\u9988\u79ef\u5206").longValue());
        if (this.iIiIiiiiIiIii[0].getBtn() != 2) return;
        if (this.IiIIIiiiiIiiI[0] == null) return;
        int IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLoginResult().getPaysum().intValue();
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLoginResult().getScoretype("\u56de\u9988\u5145\u503c").intValue();
        }
        ((IiiIiiiiIiIIi)this.IiIIIiiiiIiiI[0]).ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public iIiIIiiiIIIiI(GameView gameView) {
        super(142, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 802, 538, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S333.png");
        this.IiIiiiiiIIIII.setBtnPath("sc/b/B448.png");
        this.IiIiiiiiIIIII.setBounds(761, 14, 22, 21);
        this.IiIIIiiiiIiiI = new JComponent[4];
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)272, (int)17, (int)110, (int)16, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add(this.IiIiiiiiIIIII);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)443, (int)17, (int)110, (int)16, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add(this.IiiiiiiiIIIII);
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)645, (int)17, (int)110, (int)16, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.add(this.iiIiIiiiiIIIi);
        this.iIiIiiiiIiIii = new iiIiIiiiiIiii[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            String IiiiiiiiIIIII2 = IiiiiiiiIIIII == 0 ? "\u5145 \u503c \u56de \u9988" : (IiiiiiiiIIIII == 1 ? "\u56de \u9988 \u8c6a \u793c" : (IiiiiiiiIIIII == 2 ? "\u7279 \u60e0 \u5546 \u57ce" : "\u7279 \u60e0 \u793c \u5305"));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/b/B449.png", 2, 41 + IiiiiiiiIIIII, iiIIiiiiIiiII.iIiIiiiiiiIIi, iiIIiiiiIiiII.IiiIIiiiiIiIi, IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(23, 66 + 35 * IiiiiiiiIIIII, 110, 30);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new iiIiIiiiiIiii("sc/b/B450.png", 1, 51, (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi = new iiIiIiiiiIiii("sc/b/B451.png", 1, 52, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)433, (int)511, (int)60, (int)16, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO.setBounds(416, 513, 12, 14);
        this.iiiIiiiiiiiIi.setBounds(498, 513, 12, 14);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIIiIi();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    public void iiiIiiiiiiIIi() {
        if (!this.iIiIiiiiIiIii[0].ALLATORIxDEMO()) return;
        if (this.IiIIIiiiiIiiI[0] == null) return;
        ((IiiIiiiiIiIIi)this.IiIIIiiiiIiiI[0]).ALLATORIxDEMO();
        ((IiiIiiiiIiIIi)this.IiIIIiiiiIiiI[0]).iIiIiiiiIIiii();
    }

    public iIiIIiiiIIIiI ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }
}
