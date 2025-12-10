/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiIiiiiIiIi
 */
package com.xy.a;

import com.xy.a.iiIiIiiiiIiIi;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIIiiiIIIiI
implements ListSelectionListener {
    final /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        int IiiiiiiiIIIII = iiIiIiiiiIiIi.ALLATORIxDEMO((iiIiIiiiiIiIi)this.ALLATORIxDEMO).getSelectedIndex();
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        this.ALLATORIxDEMO.iIiIiiiiIIiii(IiiiiiiiIIIII + 1);
    }

    IIiIIiiiIIIiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiIi2;
    }
}
