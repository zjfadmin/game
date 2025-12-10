/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiiIiII
 */
package com.xy.a;

import com.xy.a.IIIIiiiiiIiII;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiIiII
extends MouseAdapter {
    final /* synthetic */ IIIIiiiiiIiII ALLATORIxDEMO;

    IIIiIiiiiIiII(IIIIiiiiiIiII iIIIiiiiiIiII) {
        this.ALLATORIxDEMO = iIIIiiiiiIiII;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        TreePath IiiiiiiiIIIII = IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).getSelectionPath();
        if (IiiiiiiiIIIII == null) return;
        if (IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).isExpanded(IiiiiiiiIIIII)) {
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).collapsePath(IiiiiiiiIIIII);
            return;
        }
        IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).expandPath(IiiiiiiiIIIII);
    }
}
