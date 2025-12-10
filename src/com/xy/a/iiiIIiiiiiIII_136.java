/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiiiiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiiiiI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIIiiiiiIII
extends MouseAdapter {
    final /* synthetic */ IIIiIiiiiiiiI ALLATORIxDEMO;

    iiiIIiiiiiIII(IIIiIiiiiiiiI iIIiIiiiiiiiI) {
        this.ALLATORIxDEMO = iIIiIiiiiiiiI;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!SwingUtilities.isLeftMouseButton(e)) {
            return;
        }
        TreePath IiiiiiiiIIIII = IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.ALLATORIxDEMO).getSelectionPath();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.ALLATORIxDEMO).isExpanded(IiiiiiiiIIIII)) {
            IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.ALLATORIxDEMO).collapsePath(IiiiiiiiIIIII);
            return;
        }
        IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.ALLATORIxDEMO).expandPath(IiiiiiiiIIIII);
    }
}
