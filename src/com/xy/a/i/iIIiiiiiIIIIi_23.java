/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.i.iIiIIiiiIiiiI
 *  com.xy.readbean.StarSoul
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiiiiiIIIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.readbean.StarSoul;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIiiiiiIIIIi
extends com.xy.i.iIiIIiiiIiiiI {
    final /* synthetic */ IiIiiiiiIIIiI IiIIIiiiiIiiI;
    private IIIIIiiiIiIii iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(MouseEvent e) {
        if (IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.IiIIIiiiiIiiI) != -1L) {
            return;
        }
        IiIiiiiiIIIiI.ALLATORIxDEMO((IiIiiiiiIIIiI)this.IiIIIiiiiIiiI, (long)iIiIIiiiIiiiI.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(this.ALLATORIxDEMO);
    }

    protected void ALLATORIxDEMO(IIIIIiiiIiIii XPJH, Graphics g) {
        if (this.IiiiiiiiIIIII) {
            if (this.iiIiiiiiiiIii != null) {
                this.iiIiiiiiiiIii.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
                this.iiIiiiiiiiIii.ALLATORIxDEMO(g, this.getX(), this.getY());
            } else {
                this.iiIiiiiiiiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((String)("sc/bang/XPDL" + this.ALLATORIxDEMO + ".tcp"), null);
            }
        }
        if (XPJH == null) return;
        XPJH.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        XPJH.ALLATORIxDEMO(g, this.getX(), this.getY());
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIiiiiiIIIIi arg0, boolean arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIiiiiiIIIIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
    }

    static /* synthetic */ boolean ALLATORIxDEMO(iIIiiiiiIIIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        super.mouseEntered(mouseEvent);
        StarSoul IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().ALLATORIxDEMO(10000 + this.ALLATORIxDEMO);
        ((iiIiiiiiIIiiI)this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, (long)(this.IiiiiiiiIIIII ? 1 : 0));
    }

    public iIIiiiiiIIIIi(IiIiiiiiIIIiI iiIiiiiiIIIiI, int index) {
        this.IiIIIiiiiIiiI = iiIiiiiiIIIiI;
        super(null, 1, null, iiIiiiiiIIIiI.ALLATORIxDEMO());
        this.ALLATORIxDEMO(IiIiiiiiIIIiI.ALLATORIxDEMO((int)index));
        this.ALLATORIxDEMO = index;
        if (index == 1) {
            this.setBounds(247, 8, 137, 65);
            return;
        }
        if (index == 2) {
            this.setBounds(388, 28, 115, 113);
            return;
        }
        if (index == 3) {
            this.setBounds(469, 141, 65, 137);
            return;
        }
        if (index == 4) {
            this.setBounds(395, 280, 114, 115);
            return;
        }
        if (index == 5) {
            this.setBounds(263, 365, 135, 61);
            return;
        }
        if (index == 6) {
            this.setBounds(146, 291, 114, 116);
            return;
        }
        if (index == 7) {
            this.setBounds(115, 156, 65, 140);
            return;
        }
        if (index != 8) return;
        this.setBounds(137, 39, 114, 113);
    }
}
