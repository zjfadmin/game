/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIiiiiiIiIiI
 *  com.xy.q.iiiIIiiiIIIii
 */
package com.xy.a.w;

import com.xy.a.w.IIIiiiiiIiIiI;
import com.xy.q.iiiIIiiiIIIii;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiiIiIi
implements ListSelectionListener {
    final /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        iiiIIiiiIIIii IiiiiiiiIIIII = (iiiIIiiiIIIii)IIIiiiiiIiIiI.ALLATORIxDEMO((IIIiiiiiIiIiI)this.ALLATORIxDEMO).getSelectedValue();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    IiiiIiiiiIiIi(IIIiiiiiIiIiI iIIiiiiiIiIiI) {
        this.ALLATORIxDEMO = iIIiiiiiIiIiI;
    }
}
