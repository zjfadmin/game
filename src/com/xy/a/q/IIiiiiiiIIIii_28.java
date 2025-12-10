/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiiIIii
 *  com.xy.readbean.aCard
 */
package com.xy.a.q;

import com.xy.a.q.IIIiIiiiiIIii;
import com.xy.readbean.aCard;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiiiiiIIIii
implements ListSelectionListener {
    final /* synthetic */ IIIiIiiiiIIii ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) {
            return;
        }
        int IiiiiiiiIIIII = IIIiIiiiiIIii.ALLATORIxDEMO((IIIiIiiiiIIii)this.ALLATORIxDEMO).getSelectedRow();
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        Vector IiiiiiiiIIIII2 = (Vector)IIIiIiiiiIIii.ALLATORIxDEMO((IIIiIiiiiIIii)this.ALLATORIxDEMO).get(IiiiiiiiIIIII);
        aCard IiiiiiiiIIIII3 = (aCard)this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO().getaMap().get((int)((Integer)IiiiiiiiIIIII2.get(4)));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    IIiiiiiiIIIii(IIIiIiiiiIIii iIIiIiiiiIIii) {
        this.ALLATORIxDEMO = iIIiIiiiiIIii;
    }
}
