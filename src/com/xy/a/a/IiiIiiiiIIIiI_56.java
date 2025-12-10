/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiiiiI
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiIiIiiiiiiiI;
import com.xy.v.IIiiIiiiiIIiI;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIiiiiIIIiI
implements ListSelectionListener {
    final /* synthetic */ iiIiIiiiiiiiI ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        String IiiiiiiiIIIII = (String)iiIiIiiiiiiiI.ALLATORIxDEMO((iiIiIiiiiiiiI)this.ALLATORIxDEMO).getSelectedValue();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(1, IiiiiiiiIIIII);
    }

    IiiIiiiiIIIiI(iiIiIiiiiiiiI iiIiIiiiiiiiI2) {
        this.ALLATORIxDEMO = iiIiIiiiiiiiI2;
    }
}
