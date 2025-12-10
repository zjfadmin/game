/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiiiiiI
 */
package com.xy.a;

import com.xy.a.iiiIiiiiiiiiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIIiiiiIiIi
implements MouseListener {
    private int iiIiiiiiiiIii;
    final /* synthetic */ iiiIiiiiiiiiI IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    @Override
    public void mousePressed(MouseEvent e) {
    }

    public void ALLATORIxDEMO(boolean selected) {
        this.ALLATORIxDEMO = selected;
        iiiIiiiiiiiiI.ALLATORIxDEMO((iiiIiiiiiiiiI)this.IiiiiiiiIIIII)[2 + this.iiIiiiiiiiIii].iIiIiiiiIIiii(selected ? "sc/e/30.png" : "sc/e/29.png");
    }

    static /* synthetic */ boolean ALLATORIxDEMO(iiIIIiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.ALLATORIxDEMO(!this.ALLATORIxDEMO);
    }

    public iiIIIiiiiIiIi(iiiIiiiiiiiiI iiiIiiiiiiiiI2, int id) {
        this.IiiiiiiiIIIII = iiiIiiiiiiiiI2;
        this.iiIiiiiiiiIii = id;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
}
