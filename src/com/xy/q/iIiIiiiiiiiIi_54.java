/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.iiiIIiiiIIIii
 */
package com.xy.q;

import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.iiiIIiiiIIIii;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIiiiiiiiIi
implements ListSelectionListener {
    final /* synthetic */ IIIiIiiiiIiII ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        iiiIIiiiIIIii IiiiiiiiIIIII = (iiiIIiiiIIIii)IIIiIiiiiIiII.ALLATORIxDEMO((IIIiIiiiiIiII)this.ALLATORIxDEMO).getSelectedValue();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.iIiIiiiiIIiii(IiiiiiiiIIIII);
        this.ALLATORIxDEMO.ALLATORIxDEMO(false);
    }

    iIiIiiiiiiiIi(IIIiIiiiiIiII iIIiIiiiiIiII) {
        this.ALLATORIxDEMO = iIIiIiiiiIiII;
    }
}
