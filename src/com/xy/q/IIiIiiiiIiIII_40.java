/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IIiIiiiiIiiIi
 */
package com.xy.q;

import com.xy.q.IIIIIiiiIiiII;
import com.xy.q.IIiIiiiiIiiIi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiIII
extends MouseAdapter {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        Serializable IiiiiiiiIIIII;
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO)) {
            TreePath IiiiiiiiIIIII2;
            IiiiiiiiIIIII = (DefaultMutableTreeNode)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getLastSelectedPathComponent();
            if (IiiiiiiiIIIII != null && ((DefaultMutableTreeNode)IiiiiiiiIIIII).getUserObject() instanceof IIiIiiiiIiiIi) {
                this.ALLATORIxDEMO.ALLATORIxDEMO((DefaultMutableTreeNode)IiiiiiiiIIIII, e.getButton());
            } else if (SwingUtilities.isRightMouseButton(e) && (IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getClosestPathForLocation(e.getX(), e.getY())) != null) {
                IiiiiiiiIIIII = (DefaultMutableTreeNode)IiiiiiiiIIIII2.getLastPathComponent();
                this.ALLATORIxDEMO.ALLATORIxDEMO((DefaultMutableTreeNode)IiiiiiiiIIIII, e.getButton());
            }
        }
        if (!SwingUtilities.isLeftMouseButton(e)) return;
        IiiiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).getSelectionPath();
        if (IiiiiiiiIIIII == null) return;
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).isExpanded((TreePath)IiiiiiiiIIIII)) {
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).collapsePath((TreePath)IiiiiiiiIIIII);
            return;
        }
        IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.ALLATORIxDEMO).expandPath((TreePath)IiiiiiiiIIIII);
    }

    IIiIiiiiIiIII(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }
}
