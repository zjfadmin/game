/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIIiiiiIiiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiIIiiiiIiiI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiiiIiI
extends MouseAdapter {
    final /* synthetic */ IIiIIiiiiIiiI ALLATORIxDEMO;

    IIiIiiiiiiIiI(IIiIIiiiiIiiI iIiIIiiiiIiiI) {
        this.ALLATORIxDEMO = iIiIIiiiiIiiI;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        TreePath IiiiiiiiIIIII = IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.ALLATORIxDEMO).getSelectionPath();
        if (IiiiiiiiIIIII == null) return;
        if (IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.ALLATORIxDEMO).isExpanded(IiiiiiiiIIIII)) {
            IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.ALLATORIxDEMO).collapsePath(IiiiiiiiIIIII);
            return;
        }
        IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.ALLATORIxDEMO).expandPath(IiiiiiiiIIIII);
    }
}
