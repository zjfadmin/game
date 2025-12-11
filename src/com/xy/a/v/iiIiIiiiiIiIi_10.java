/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiIIIiiiIIiII
 *  com.xy.a.v.IiIiIiiiiiIiI
 *  com.xy.a.v.iiIiIiiiIIIiI
 *  com.xy.a.v.iiIiIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.BWDHRule
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.scene.BWDHTeam
 *  com.xy.socket.Agreement
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiIIIiiiIIiII;
import com.xy.a.v.IiIiIiiiiiIiI;
import com.xy.a.v.iiIiIiiiIIIiI;
import com.xy.a.v.iiIiIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.BWDHRule;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import com.xy.socket.Agreement;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

public class iiIiIiiiiIiIi
extends IiiiIiiiiIiIi {
    private long iiiIiiiiiiiIi;
    private IiIiIiiiiiIiI iIiiIiiiiiiII;
    private iiIiIiiiIIIiI IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IiIIIiiiIIiII[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private iiIiIiiiiIiii ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int type, Object data) {
        this.IiiiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII == this.IiiiiiiiIIIII)) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii(IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? "sc/d/130.png" : "sc/d/131.png");
            }
            IiIIIiiiIIiII iiIIIiiiIIiII = this.iiIiiiiiiiIii[IiiiiiiiIIIII];
            int n = (IiiiiiiiIIIII >= this.IiiiiiiiIIIII ? 57 : 47) + 93 * IiiiiiiiIIIII;
            int n2 = IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? 51 : 52;
            int n3 = IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII]) ? 142 : 140;
            ++IiiiiiiiIIIII;
            iiIIIiiiIIiII.setBounds(n, n2, n3, 40);
        }
        if (this.IiiiiiiiIIIII == 0) {
            this.iIiiIiiiiiiII.ALLATORIxDEMO((BWDHTeam[])data);
            this.iIiiIiiiiiiII.setVisible(true);
            this.IIiiIiiiIIiIi.setVisible(false);
            return;
        }
        iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.IIiiIiiiIIiIi).setVisible(this.IiiiiiiiIIIII == 1);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO((BWDHRuleBattleRecord[])data);
        this.IIiiIiiiIIiIi.setVisible(true);
        this.iIiiIiiiiiiII.setVisible(false);
    }

    public void iIiIiiiiIIiii(int ruleFlag) {
        if (iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iiiIiiiiiiiIi < (long)(iIiIIiiiIiiiI.IIIIiiiiiiiII * 5)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你点击的太快了");
            return;
        }
        this.iiiIiiiiiiiIi = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        Activity IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|M3#" + ruleFlag));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public iiIiIiiiiIiIi(iiIiIiiiiIiii bwdhView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, bwdhView.iiIIiiiiIiIIi);
        this.ALLATORIxDEMO(0, 0, 718, 526, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = bwdhView;
        this.iiIiiiiiiiIii = new IiIIIiiiIIiII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIIIiiiIIiII(this, IiiiiiiiIIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/131.png");
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47 + IiiiiiiiIIIII * 93, 52, 140, 40);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IiIiIiiiiiIiI(this);
        this.IIiiIiiiIIiIi = new iiIiIiiiIIIiI(this);
        this.iIiiIiiiiiiII.setBounds(0, 0, 718, 526);
        this.IIiiIiiiIIiIi.setBounds(0, 0, 718, 526);
        this.add((Component)this.iIiiIiiiiiiII);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/105.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(636, 118, 6, 336);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/143.png", (int)10, (int)10, (int)10, (int)10, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 95, 601, 21);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/132.png", (int)50, (int)50, (int)50, (int)50, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(41, 88, 615, 376);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(int ruleFlag, BWDHRuleBattleRecord[] records) {
        this.iIiIiiiiIIiii(1, records);
        iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.IIiiIiiiIIiIi).ALLATORIxDEMO().setText(ruleFlag == 0 ? "16强抢位赛" : (ruleFlag == 1 ? "8强抢位赛" : "4强抢位赛"));
    }

    public void iiiIiiiiiiIIi() {
        if (iIiIIiiiIiiiI.iIiIiiiiIIiii() - this.iiiIiiiiiiiIi < (long)(iIiIIiiiIiiiI.IIIIiiiiiiiII * 5)) {
            return;
        }
        this.iiiIiiiiiiiIi = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        Activity IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getActivitySet(), (String)"赛制设置=", (String)"|");
        ActivityFC IiiiiiiiIIIII3 = IiiiiiiiIIIII2 > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2) : null;
        BWDHRule IiiiiiiiIIIII4 = IiiiiiiiIIIII3 != null && IiiiiiiiIIIII3.getType() == 5 ? (BWDHRule)IiiiiiiiIIIII3.getData() : null;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getRuleTimes(2 + IiiiiiiiIIIII5) : null, IiiiiiiiIIIII);
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getRuleIndex((iIiIIiiiIiiiI.iIiIiiiiIIiii() - IiiiiiiiIIIII.getTimeOpen()) / 1000L) : 0;
        IiiiiiiiIIIII5 = Math.max(Math.min(IiiiiiiiIIIII5 - 2, 3), 0);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|M" + (IiiiiiiiIIIII5 + 2)));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    static /* synthetic */ iiIiIiiiiIiii ALLATORIxDEMO(iiIiIiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int id, Object data) {
        if (id == 161) {
            Activity IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
            int IiiiiiiiIIIII2 = (Integer)data;
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|C" + IiiiiiiiIIIII2));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (id != 162) return;
        Activity IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = (Integer)data;
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII.getId()) + "|c" + IiiiiiiiIIIII4));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
    }
}
