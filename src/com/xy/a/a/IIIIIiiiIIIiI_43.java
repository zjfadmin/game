/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiIIIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiIIIiI;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiIIIiI
implements ListSelectionListener {
    final /* synthetic */ iiIiIiiiIIIiI ALLATORIxDEMO;

    IIIIIiiiIIIiI(iiIiIiiiIIIiI iiIiIiiiIIIiI2) {
        this.ALLATORIxDEMO = iiIiIiiiIIIiI2;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        String IiiiiiiiIIIII = (String)iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.ALLATORIxDEMO).getSelectedValue();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.equals("")) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(iiIiIiiiIIIiI.ALLATORIxDEMO((iiIiIiiiIIIiI)this.ALLATORIxDEMO).ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII), false);
    }
}
