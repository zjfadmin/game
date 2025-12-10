/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiiIiiiiIiII
 */
package com.xy.a.v;

import com.xy.a.v.IiiiIiiiiIiII;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiiIIiI
implements ListSelectionListener {
    final /* synthetic */ IiiiIiiiiIiII ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) {
            return;
        }
        if (IiiiIiiiiIiII.ALLATORIxDEMO((IiiiIiiiiIiII)this.ALLATORIxDEMO).getSelectedRow() != -1) return;
    }

    IiIIIiiiiIIiI(IiiiIiiiiIiII iiiiIiiiiIiII) {
        this.ALLATORIxDEMO = iiiiIiiiiIiII;
    }
}
