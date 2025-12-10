/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIiIIiiiIIIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIiIIiiiIIIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiiIiI
implements MouseListener {
    final /* synthetic */ IIiIIiiiIIIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IiIiIiiiiiIiI(IIiIIiiiIIIiI iIiIIiiiIIIiI, int type, int index) {
        this.iiIiiiiiiiIii = iIiIIiiiIIIiI;
        this.ALLATORIxDEMO = type;
        this.IiiiiiiiIIIII = index;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        boolean IiiiiiiiIIIII;
        if (this.ALLATORIxDEMO != 1) return;
        boolean bl = IiiiiiiiIIIII = this.IiiiiiiiIIIII == 1;
        if (IiiiiiiiIIIII == IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii)) {
            return;
        }
        IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii, (boolean)IiiiiiiiIIIII);
        IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii)[1].iIiIiiiiIIiii(IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii) ? "sc/e/63.png" : "sc/e/62.png");
        IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii)[2].iIiIiiiiIIiii(IIiIIiiiIIIiI.ALLATORIxDEMO((IIiIIiiiIIIiI)this.iiIiiiiiiiIii) ? "sc/e/62.png" : "sc/e/63.png");
        this.iiIiiiiiiiIii.iIiIiiiiIIiIi();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
