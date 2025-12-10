/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIIiiiIiiII
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Skill
 *  com.xy.readbean.TYC
 *  com.xy.socket.GameClient
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIIIIiiiIiiII;
import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.socket.GameClient;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiIII
extends IIIiiiiiIiIiI
implements MouseListener {
    private int iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII;
    private Skill IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private TYC iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    static /* synthetic */ int iiiIiiiiiiIIi(IIiIiiiiIiIII arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    public void ALLATORIxDEMO(int o) {
        this.IiIIIiiiiIiiI = o;
        this.iiiIiiiiiiiIi = o;
        this.iIiiIiiiiiiII = true;
        this.iiiIiiiiiiIIi();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void iIiIiiiiIIiIi() {
        this.IiIIIiiiiIiiI = 0;
        this.iiiIiiiiiiiIi = 0;
        this.iIiiIiiiiiiII = false;
        this.iiiIiiiiiiIIi();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    static /* synthetic */ int iIiIiiiiIIiii(IIiIiiiiIiIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!this.iIiiIiiiiiiII) {
            return;
        }
        int IiiiiiiiIIIII = this.IiIIIiiiiIiiI + (e.isMetaDown() ? -1 : 1);
        if (IiiiiiiiIIIII > 0 && IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getText().equals("0")) {
            return;
        }
        if (IiiiiiiiIIIII < this.iiiIiiiiiiiIi) {
            return;
        }
        if (IiiiiiiiIIIII > this.iIiIiiiiIiIii) {
            return;
        }
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII;
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(boolean learn) {
        this.iIiiIiiiiiiII = learn;
        this.iiiIiiiiiiIIi();
    }

    public IIiIiiiiIiIII(IIIIIiiiIiiII iIIIIiiiIiiII, TYC tyc) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
        this.IiiiiiiiIIIII = tyc.getV2();
        this.iiIiiiiiiiIii = tyc;
        this.IIiiIiiiIIiIi = iIIIIiiiIiiII.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(this.IiiiiiiiIIIII));
        this.iIiiIiiiiiiII = false;
        this.IiIIIiiiiIiiI = 0;
        this.iiiIiiiiiiiIi = 0;
        this.iIiIiiiiIiIii = 1;
        this.addMouseListener(this);
    }

    static /* synthetic */ TYC ALLATORIxDEMO(IIiIiiiiIiIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public void iiiIiiiiiiIIi() {
        if (this.IiIIIiiiiIiiI > 0) {
            this.iIiIiiiiIIiii("sc/c/161");
            return;
        }
        if (this.iIiiIiiiiiiII) {
            this.iIiIiiiiIIiii("sc/c/162");
            return;
        }
        this.iIiIiiiiIIiii();
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiIiiiiIiIII arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return;
        String IiiiiiiiIIIII2 = IIiiIiiiIiiiI.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII, (int)this.iiIiiiiiiiIii.getV2(), (int)1, (Skill)this.IIiiIiiiIIiIi, (GameClient)this.ALLATORIxDEMO.ALLATORIxDEMO());
        ((iiIiiiiiIIiiI)this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(this.IIiiIiiiIIiIi.getSkillname(), IiiiiiiiIIIII2);
    }
}
