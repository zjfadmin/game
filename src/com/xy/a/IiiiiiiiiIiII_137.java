/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiiiiI
 *  com.xy.readbean.petExchange
 *  com.xy.v.IIiIIiiiIIIiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiiiiI;
import com.xy.readbean.petExchange;
import com.xy.v.IIiIIiiiIIIiI;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiiiiiiIiII
implements TreeSelectionListener {
    final /* synthetic */ IIIiIiiiiiiiI ALLATORIxDEMO;

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(null);
            return;
        }
        if (!IiiiiiiiIIIII.isLeaf()) return;
        int IiiiiiiiIIIII2 = Integer.parseInt(((IIiIIiiiIIIiI)IiiiiiiiIIIII.getUserObject()).iIiIiiiiIIiii());
        petExchange IiiiiiiiIIIII3 = IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.ALLATORIxDEMO).ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    IiiiiiiiiIiII(IIIiIiiiiiiiI iIIiIiiiiiiiI) {
        this.ALLATORIxDEMO = iIIiIiiiiiiiI;
    }
}
