/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiIiiiiiIiI
 *  com.xy.readbean.RoleSuitBean
 */
package com.xy.a.i;

import com.xy.a.i.IiIiIiiiiiIiI;
import com.xy.readbean.RoleSuitBean;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIiiiiIiiiI
implements ListSelectionListener {
    final /* synthetic */ IiIiIiiiiiIiI ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        RoleSuitBean IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO().ALLATORIxDEMO((String)IiIiIiiiiiIiI.ALLATORIxDEMO((IiIiIiiiiiIiI)this.ALLATORIxDEMO).getSelectedValue());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    iiiIiiiiIiiiI(IiIiIiiiiiIiI iiIiIiiiiiIiI) {
        this.ALLATORIxDEMO = iiIiIiiiiiIiI;
    }
}
