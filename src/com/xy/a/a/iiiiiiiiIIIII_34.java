/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiiIiiiiIIII
 *  com.xy.entity.Mount
 *  com.xy.game.RoleData
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiiiIiiiiIIII;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import com.xy.v.IIiiIiiiiIIiI;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiiiiiIIIII
implements ListSelectionListener {
    final /* synthetic */ IiiiIiiiiIIII ALLATORIxDEMO;

    iiiiiiiiIIIII(IiiiIiiiiIIII iiiiIiiiiIIII) {
        this.ALLATORIxDEMO = iiiiIiiiiIIII;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Mount IiiiiiiiIIIII;
        if (e.getValueIsAdjusting()) return;
        String IiiiiiiiIIIII2 = (String)IiiiIiiiiIIII.ALLATORIxDEMO((IiiiIiiiiIIII)this.ALLATORIxDEMO).getSelectedValue();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2)) {
            return;
        }
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO.ALLATORIxDEMO();
        Mount mount = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getChoseMount() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2);
    }
}
