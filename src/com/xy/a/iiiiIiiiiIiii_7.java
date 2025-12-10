/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiiiiiI
 */
package com.xy.a;

import com.xy.a.iIiIIiiiiiiiI;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiIiiiiIiii
implements ListSelectionListener {
    final /* synthetic */ iIiIIiiiiiiiI ALLATORIxDEMO;

    iiiiIiiiiIiii(iIiIIiiiiiiiI iIiIIiiiiiiiI2) {
        this.ALLATORIxDEMO = iIiIIiiiiiiiI2;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) {
            return;
        }
        int IiiiiiiiIIIII = iIiIIiiiiiiiI.ALLATORIxDEMO((iIiIIiiiiiiiI)this.ALLATORIxDEMO).getSelectedRow();
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO((Vector)iIiIIiiiiiiiI.ALLATORIxDEMO((iIiIIiiiiiiiI)this.ALLATORIxDEMO).get(IiiiiiiiIIIII));
    }
}
