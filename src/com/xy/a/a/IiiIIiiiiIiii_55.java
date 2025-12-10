/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.entity.Mount
 *  com.xy.game.RoleData
 */
package com.xy.a.a;

import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIIiiiiIiii
implements ListSelectionListener {
    final /* synthetic */ IIIIiiiiIIIIi ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            if (IIIIiiiiIIIIi.ALLATORIxDEMO((IIIIiiiiIIIIi)this.ALLATORIxDEMO).getSelectedIndex() < 0) return;
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
            Mount IiiiiiiiIIIII2 = (Mount)IiiiiiiiIIIII.mounts.get(IIIIiiiiIIIIi.ALLATORIxDEMO((IIIIiiiiIIIIi)this.ALLATORIxDEMO).getSelectedIndex());
            this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    IiiIIiiiiIiii(IIIIiiiiIIIIi iIIIiiiiIIIIi) {
        this.ALLATORIxDEMO = iIIIiiiiIIIIi;
    }
}
