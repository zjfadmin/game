/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIiIiiiiIIiii
 *  com.xy.a.v.IIiiIiiiIiiiI
 *  com.xy.a.v.IiIIIiiiiiiIi
 *  com.xy.a.v.IiiiiiiiiIIII
 *  com.xy.a.v.BWDHJpanel1
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.BWDHRule
 *  com.xy.scene.BWDHRuleBattle
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIiIiiiiIIiii;
import com.xy.a.v.IIiiIiiiIiiiI;
import com.xy.a.v.IiIIIiiiiiiIi;
import com.xy.a.v.IiiiiiiiiIIII;
import com.xy.a.v.BWDHJpanel1;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

public class BWDHJpanel6
extends IiiiIiiiiIiIi {
    private BWDHJpanel1 iIiiIiiiiiiII;
    private IIIIIiiiIiIii IIiiIiiiIIiIi = null;
    private long iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IiIIIiiiiiiIi[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private iIiIIiiiIiiiI[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(BWDHTeam bwdhTeam) {
        if (this.IiiiiiiiIIIII != 0) return;
        ((IiiiiiiiiIIII)this.ALLATORIxDEMO[0]).ALLATORIxDEMO(bwdhTeam);
    }

    public void iIiIiiiiIIiii(int ruleFlag) {
        if (com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iIiIiiiiIiIii < (long)(com.xy.v.iIiIIiiiIiiiI.IIIIiiiiiiiII * 5)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你点击的太快了");
            return;
        }
        this.iIiIiiiiIiIii = com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii();
        Activity IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|R3#" + ruleFlag));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiii(int type, Object data) {
        this.IiiiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == this.IiiiiiiiIIIII)) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii(IiIIIiiiiiiIi.ALLATORIxDEMO((IiIIIiiiiiiIi)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? "sc/d/130.png" : "sc/d/131.png");
            }
            IiIIIiiiiiiIi iiIIIiiiiiiIi = this.iiIiiiiiiiIii[IiiiiiiiIIIII];
            int n = (IiiiiiiiIIIII >= this.IiiiiiiiIIIII ? 57 : 47) + 93 * IiiiiiiiIIIII;
            int n2 = IiIIIiiiiiiIi.ALLATORIxDEMO((IiIIIiiiiiiIi)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? 51 : 52;
            int n3 = IiIIIiiiiiiIi.ALLATORIxDEMO((IiIIIiiiiiiIi)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? 142 : 140;
            ++IiiiiiiiIIIII;
            iiIIIiiiiiiIi.setBounds(n, n2, n3, 40);
        }
        if (this.IiiiiiiiIIIII == 0) {
            if (this.ALLATORIxDEMO[0] == null) {
                this.ALLATORIxDEMO[0] = new IiiiiiiiiIIII(this);
                this.add((Component)this.ALLATORIxDEMO[0], 0);
            }
            ((IiiiiiiiiIIII)this.ALLATORIxDEMO[0]).ALLATORIxDEMO((BWDHTeam[])data);
        } else if (this.IiiiiiiiIIIII == 1) {
            if (this.ALLATORIxDEMO[1] == null) {
                this.ALLATORIxDEMO[1] = new IIiIiiiiIIiii(this);
                this.add((Component)this.ALLATORIxDEMO[1], 0);
            }
            ((IIiIiiiiIIiii)this.ALLATORIxDEMO[1]).ALLATORIxDEMO((BWDHRuleBattle[])data);
        } else if (this.IiiiiiiiIIIII == 2 || this.IiiiiiiiIIIII == 3) {
            type = 2;
            if (this.ALLATORIxDEMO[2] == null) {
                this.ALLATORIxDEMO[2] = new IIiiIiiiIiiiI(this);
                this.add((Component)this.ALLATORIxDEMO[2], 0);
            }
            ((IIiiIiiiIiiiI)this.ALLATORIxDEMO[2]).ALLATORIxDEMO(this.IiiiiiiiIIIII, (BWDHRuleBattle[])data);
        }
        if (this.ALLATORIxDEMO[type] != null) {
            this.ALLATORIxDEMO[type].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII] != null && type != IiiiiiiiIIIII) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iIiIiiiiIIiIi() {
        if (com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iIiIiiiiIiIii < (long)(com.xy.v.iIiIIiiiIiiiI.IIIIiiiiiiiII * 5)) {
            return;
        }
        this.iIiIiiiiIiIii = com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii();
        Activity IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getActivitySet(), (String)"赛制设置=", (String)"|");
        ActivityFC IiiiiiiiIIIII3 = IiiiiiiiIIIII2 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2) : null;
        BWDHRule IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getType() == 5 ? (BWDHRule)IiiiiiiiIIIII3.getData() : null;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getRuleTimes(2 + IiiiiiiiIIIII5) : null, IiiiiiiiIIIII);
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getRuleIndex((com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii() - IiiiiiiiIIIII.getTimeOpen()) / 1000L) : 0;
        IiiiiiiiIIIII5 = Math.max(Math.min(IiiiiiiiIIIII5 - 2, 3), 0);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|R" + (IiiiiiiiIIIII5 + 2)));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public void ALLATORIxDEMO(int id, Object data) {
        if (id != 141 && id != 142 && id != 143) {
            if (id != 146) return;
            ((IIiIiiiiIIiii)this.ALLATORIxDEMO[1]).ALLATORIxDEMO(id, data);
            return;
        }
        ((IiiiiiiiiIIII)this.ALLATORIxDEMO[0]).ALLATORIxDEMO(id, data);
    }

    public void iiiIiiiiiiIIi() {
        this.IIiiIiiiIIiIi = null;
        if (this.ALLATORIxDEMO[0] == null) return;
        ((IiiiiiiiiIIII)this.ALLATORIxDEMO[0]).ALLATORIxDEMO(null);
    }

    public BWDHJpanel6(BWDHJpanel1 bwdhView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, bwdhView.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO(0, 0, 718, 526, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiiIiiiiiiII = bwdhView;
        this.iiIiiiiiiiIii = new IiIIIiiiiiiIi[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIIIiiiiiiIi(this, IiiiiiiiIIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/131.png");
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47 + IiiiiiiiIIIII * 93, 52, 140, 40);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/132.png", (int)50, (int)50, (int)50, (int)50, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(41, 88, 615, 376);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO = new iIiIIiiiIiiiI[3];
    }

    public void ALLATORIxDEMO(int ruleFlag, BWDHRuleBattle[] ruleBattles) {
        this.iIiIiiiiIIiii(1, ruleBattles);
        IIiIiiiiIIiii.ALLATORIxDEMO((IIiIiiiiIIiii)((IIiIiiiiIIiii)this.ALLATORIxDEMO[1])).ALLATORIxDEMO().setText(ruleFlag == 0 ? "A组" : (ruleFlag == 1 ? "B组" : (ruleFlag == 2 ? "C组" : "D组")));
    }

    static /* synthetic */ void ALLATORIxDEMO(iiIiIiiiiiIIi arg0, IIIIIiiiIiIii arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    static /* synthetic */ iiIiIiiiiIiii ALLATORIxDEMO(iiIiIiiiiiIIi arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    static /* synthetic */ IIIIIiiiIiIii ALLATORIxDEMO(iiIiIiiiiiIIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }
}
