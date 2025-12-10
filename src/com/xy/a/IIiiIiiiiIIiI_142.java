/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiiiiiiiiIiI
 */
package com.xy.a;

import com.xy.a.iiiiiiiiiiIiI;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiiIIiI
implements ListSelectionListener {
    final /* synthetic */ iiiiiiiiiiIiI ALLATORIxDEMO;

    IIiiIiiiiIIiI(iiiiiiiiiiIiI iiiiiiiiiiIiI2) {
        this.ALLATORIxDEMO = iiiiiiiiiiIiI2;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) {
            return;
        }
        if (iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.ALLATORIxDEMO).getSelectedRow() != -1) return;
    }
}
