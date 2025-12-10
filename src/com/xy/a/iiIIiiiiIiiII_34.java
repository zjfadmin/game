/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIiiII
 *  com.xy.readbean.TaskData
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIiiII;
import com.xy.readbean.TaskData;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiIiiII
implements TreeSelectionListener {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) return;
        if (!IiiiiiiiIIIII.isLeaf()) return;
        this.ALLATORIxDEMO.ALLATORIxDEMO((TaskData)IiiiiiiiIIIII.getUserObject());
    }

    iiIIiiiiIiiII(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }
}
