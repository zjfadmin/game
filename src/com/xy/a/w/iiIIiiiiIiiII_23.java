/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.iiIiIiiiiIiii
 */
package com.xy.a.w;

import com.xy.a.w.iiIiIiiiiIiii;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiiII
extends MouseAdapter {
    final /* synthetic */ iiIiIiiiiIiii ALLATORIxDEMO;

    iiIIiiiiIiiII(iiIiIiiiiIiii iiIiIiiiiIiii2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiii2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int IiiiiiiiIIIII = iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.ALLATORIxDEMO).ALLATORIxDEMO().getSelectedIndex();
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        this.ALLATORIxDEMO.iIiIiiiiIIiIi(IiiiiiiiIIIII + 1);
    }
}
