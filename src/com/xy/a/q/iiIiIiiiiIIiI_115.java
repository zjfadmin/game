/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIIiiiiiiiIi
 */
package com.xy.a.q;

import com.xy.a.q.iiIIiiiiiiiIi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiIIiI
extends MouseAdapter {
    final /* synthetic */ iiIIiiiiiiiIi ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (iiIIiiiiiiiIi.ALLATORIxDEMO((iiIIiiiiiiiIi)this.ALLATORIxDEMO).ALLATORIxDEMO().getSelectedIndex() == -1) {
            return;
        }
        String IiiiiiiiIIIII = (String)iiIIiiiiiiiIi.ALLATORIxDEMO((iiIIiiiiiiiIi)this.ALLATORIxDEMO).ALLATORIxDEMO().getSelectedValue();
        iiIIiiiiiiiIi.iIiIiiiiIIiii((iiIIiiiiiiiIi)this.ALLATORIxDEMO).setText(IiiiiiiiIIIII);
        iiIIiiiiiiiIi.ALLATORIxDEMO((iiIIiiiiiiiIi)this.ALLATORIxDEMO).setVisible(false);
    }

    iiIiIiiiiIIiI(iiIIiiiiiiiIi iiIIiiiiiiiIi2) {
        this.ALLATORIxDEMO = iiIIiiiiiiiIi2;
    }
}
