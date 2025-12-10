/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIiiiiiIIIiI
 *  com.xy.a.a.iIIiIiiiIiiIi
 *  com.xy.a.a.iiIIiiiiIiIiI
 *  com.xy.a.a.iiIiiiiiIIiiI
 *  com.xy.formula.BaseMountSH
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiIiiiiiIIIiI;
import com.xy.a.a.iIIiIiiiIiiIi;
import com.xy.a.a.iiIIiiiiIiIiI;
import com.xy.a.a.iiIiiiiiIIiiI;
import com.xy.formula.BaseMountSH;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIIiiiiiIII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private iIiIIiiiIiiiI iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private iIIiIiiiIiiIi iIiIiiiiIiIii;
    private iiIIiiiiIiIiI IiIIIiiiiIiiI;
    private IiIiiiiiIIIiI[] iiIiiiiiiiIii;
    private IiIiIiiiiIIiI IiiiiiiiIIIII;
    private IIIIIiiiIiIii ALLATORIxDEMO = null;

    public iiIIIiiiiiIII(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 743, 519, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)112, (int)267, (int)40, (int)19, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c4D3E2F"), (Font)iiIIiiiiIiiII.IiIiiiiiIiIiI);
        this.IIiiIiiiIIiIi.setText("\u4e2d\u5929");
        this.IIiiIiiiIIiIi.setHorizontalAlignment(0);
        this.add(this.IIiiIiiiIIiIi);
        this.iIiiIiiiiiiII = new iiIiiiiiIIiiI(this);
        this.iIiiIiiiiiiII.setBounds(50, 195, 200, 160);
        this.iiIiiiiiiiIii = new IiIiiiiiIIIiI[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            int n = IiiiiiiiIIIII;
            IiIiiiiiIIIiI iiIiiiiiIIIiI = new IiIiiiiiIIIiI(this, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiiIii[n] = iiIiiiiiIIIiI;
        }
        this.IiiiiiiiIIIII = new IiIiIiiiiIIiI("sc/e/174.png", 1, 191, iiIIiiiiIiiII.IiIiiiiiIiIiI, null, "\u5347\u7ea7", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c512B01"));
        this.IiiiiiiiIIIII.setBounds(421, 450, 120, 33);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new iIIiIiiiIiiIi(this);
        this.IiIIIiiiiIiiI = new iiIIiiiiIiIiI(this);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/174.png");
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(55, 189, 170, 178);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/166.png");
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(47, 50, 668, 447);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(iiIIIiiiiiIII arg0, IIIIIiiiIiIii arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    public void iiiIiiiiiiIIi(boolean is) {
        this.iIiIiiiiIiIii.ALLATORIxDEMO(is);
    }

    static /* synthetic */ iIiIIiiiIiiiI ALLATORIxDEMO(iiIIIiiiiiIII arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public int iiiIiiiiiiIIi() {
        return this.iiiIiiiiiiiIi;
    }

    public void IiiIiiiiiiIiI() {
        this.iiiIiiiiiiiIi = 0;
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            JLabel jLabel = IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.iiIiiiiiiiIii[IiiiiiiiIIIII2]);
            BaseMountSH baseMountSH = IiiiiiiiIIIII.getMountSHByindex(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            jLabel.setText(String.valueOf(baseMountSH.getLvl()));
        }
        this.iIiIiiiiIIiii(this.iiiIiiiiiiiIi);
    }

    public void iIiIiiiiIIiii(int type) {
        this.iiiIiiiiiiiIi = type;
        this.iIiiIiiiiiiII.setVisible(this.iiiIiiiiiiiIi == 0);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            boolean IiiiiiiiIIIII2;
            boolean bl = IiiiiiiiIIIII2 = IiiiiiiiIIIII == this.iiiIiiiiiiiIi;
            if (IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.iiIiiiiiiiIii[IiiiiiiiIIIII]).ALLATORIxDEMO() != IiiiiiiiIIIII2) {
                IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.iiIiiiiiiiIii[IiiiiiiiIIIII]).setKeep(IiiiiiiiIIIII2);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (this.iiiIiiiiiiiIi == 0) {
            this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII2);
            this.iIiIiiiiIiIii.setVisible(true);
            this.IiIIIiiiiIiiI.setVisible(false);
            return;
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.iiiIiiiiiiiIi, IiiiiiiiIIIII2);
        this.IiIIIiiiiIiiI.setVisible(true);
        this.iIiIiiiiIiIii.setVisible(false);
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO(iiIIIiiiiiIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ int ALLATORIxDEMO(iiIIIiiiiiIII arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.iIiIiiiiIiIii.ALLATORIxDEMO(good);
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO = null;
    }
}
