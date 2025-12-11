/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.AlreadyRecordedJpanel
 *  com.xy.readbean.RoleSuitBean
 */
package com.xy.a.i;

import com.xy.a.i.AlreadyRecordedJpanel;
import com.xy.readbean.RoleSuitBean;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class AlreadyRecordedListener
implements ListSelectionListener {
    final /* synthetic */ AlreadyRecordedJpanel ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting()) return;
        RoleSuitBean IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO().ALLATORIxDEMO((String)AlreadyRecordedJpanel.ALLATORIxDEMO((AlreadyRecordedJpanel)this.ALLATORIxDEMO).getSelectedValue());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    AlreadyRecordedListener(AlreadyRecordedJpanel iiIiIiiiiiIiI) {
        this.ALLATORIxDEMO = iiIiIiiiiiIiI;
    }
}
