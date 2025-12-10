/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIIiiiiIiiI
 *  com.xy.v.IIiIIiiiIIIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiIIiiiiIiiI;
import com.xy.v.IIiIIiiiIIIiI;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIIiiiiiIII
implements TreeSelectionListener {
    final /* synthetic */ IIiIIiiiiIiiI ALLATORIxDEMO;

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.ALLATORIxDEMO).setViewportView(null);
            return;
        }
        if (!(IiiiiiiiIIIII.getUserObject() instanceof IIiIIiiiIIIiI)) return;
        int IiiiiiiiIIIII2 = Integer.parseInt(((IIiIIiiiIIIiI)IiiiiiiiIIIII.getUserObject()).iIiIiiiiIIiii());
        this.ALLATORIxDEMO.iIiIiiiiIIiii(this.ALLATORIxDEMO.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2));
    }

    iiiIIiiiiiIII(IIiIIiiiiIiiI iIiIIiiiiIiiI) {
        this.ALLATORIxDEMO = iIiIIiiiiIiiI;
    }
}
