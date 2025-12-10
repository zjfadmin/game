/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiiIIIi
 *  com.xy.a.IiIiIiiiiIiiI
 *  com.xy.bean.GangResultBean
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIiiiiiiiIIIi;
import com.xy.a.IiIiIiiiiIiiI;
import com.xy.bean.GangResultBean;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.math.BigDecimal;

public class iIIIiiiiIiiII
extends IiiiIiiiiIiIi {
    private IIIIIiiiIIIiI[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private IIiiiiiiiIIIi IiiiiiiiIIIII;
    private IiIiIiiiiIiiI ALLATORIxDEMO;

    public iIIIiiiiIiiII(GameView gameView) {
        super(48, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 662, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5e2e\u6d3e\u7ba1\u7406");
        this.iIiIiiiiIiIii = new IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/38.png", 2, 201 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5e2e\u6d3e\u603b\u89c8" : (IiiiiiiiIIIII == 1 ? "\u5e2e\u6d3e\u6210\u5458" : (IiiiiiiiIIIII == 2 ? "\u5e2e\u6d3e\u6218\u5f79" : "")), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(64 + 102 * IiiiiiiiIIIII, 22, 95, 33);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIiiiiiiiIIIi(gameView);
        this.ALLATORIxDEMO = new IiIiIiiiiIiiI(gameView);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(32, 36, 614, 20);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(BigDecimal roleId) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(roleId);
    }

    public void ALLATORIxDEMO(BigDecimal roleId, String post) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(roleId, post);
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public IiIiIiiiiIiiI ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(GangResultBean gangResultBean) {
        this.ALLATORIxDEMO.ALLATORIxDEMO(gangResultBean);
        this.ALLATORIxDEMO.iiiIiiiiiiIIi(false);
        this.ALLATORIxDEMO.iiiIiiiiiiIIi(true);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(gangResultBean.getGang(), gangResultBean.getGangGroup());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int type) {
        if (type == 2) {
            return;
        }
        this.iiIiiiiiiiIii = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIiiiiiiiIii);
            ++IiiiiiiiIIIII;
        }
        if (type == 1) {
            this.ALLATORIxDEMO.iiiIiiiiiiIIi(0);
        }
        this.IiiiiiiiIIIII.setVisible(type == 0);
        this.ALLATORIxDEMO.setVisible(type == 1);
    }
}
