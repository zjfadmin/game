/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiiiiiiiiiIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiiIIiI
implements MouseListener {
    final /* synthetic */ iiiiiiiiiiIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IIiiIiiiiIIiI(iiiiiiiiiiIiI iiiiiiiiiiIiI2, int index) {
        this.IiiiiiiiIIIII = iiiiiiiiiiIiI2;
        this.ALLATORIxDEMO = index;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mousePressed(MouseEvent e) {
        block4: {
            if (this.ALLATORIxDEMO >= 4) break block4;
            if (iiiiiiiiiiIiI.iIiIiiiiIIiii((iiiiiiiiiiIiI)this.IiiiiiiiIIIII) == this.ALLATORIxDEMO) {
                return;
            }
            iiiiiiiiiiIiI.iIiIiiiiIIiii((iiiiiiiiiiIiI)this.IiiiiiiiIIIII, (int)this.ALLATORIxDEMO);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
        }
        if (iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII) == this.ALLATORIxDEMO - 4) {
            return;
        }
        iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII, (int)(this.ALLATORIxDEMO - 4));
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl21
        do {
            iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII)[IiiiiiiiIIIII + 4].iIiIiiiiIIiii(iiiiiiiiiiIiI.iIiIiiiiIIiii((iiiiiiiiiiIiI)this.IiiiiiiiIIIII) == IiiiiiiiIIIII ? "sc/e/67.png" : "sc/e/68.png");
            ++IiiiiiiiIIIII;
lbl16:
            // 2 sources

        } while (IiiiiiiiIIIII < 4);
        return;
        do {
            iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII)[IiiiiiiiIIIII + 8].iIiIiiiiIIiii(iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII) == IiiiiiiiIIIII ? "sc/e/67.png" : "sc/e/68.png");
            ++IiiiiiiiIIIII;
lbl21:
            // 2 sources

        } while (IiiiiiiiIIIII < 4);
    }
}
