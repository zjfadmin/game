/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIiiII;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiIiii
extends MouseAdapter {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    iiIiIiiiiIiii(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getLastSelectedPathComponent();
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        TreePath IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getSelectionPath();
        if (IiiiiiiiIIIII2 == null) return;
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).isExpanded(IiiiiiiiIIIII2)) {
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).collapsePath(IiiiiiiiIIIII2);
            return;
        }
        IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).expandPath(IiiiiiiiIIIII2);
    }
}
