/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.IIIIIiiiIiiII
 */
package com.xy.q;

import com.xy.q.IIIIIiiiIiiII;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiIiii
implements TreeSelectionListener {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    iiIiIiiiiIiii(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII, 1);
    }
}
