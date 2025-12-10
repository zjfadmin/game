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
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiiiiiI
extends DefaultTreeCellRenderer {
    final /* synthetic */ IIiIIiiiiIiiI ALLATORIxDEMO;

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)value;
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        if (!(IiiiiiiiIIIII.getUserObject() instanceof IIiIIiiiIIIiI)) return this;
        IIiIIiiiIIIiI IiiiiiiiIIIII2 = (IIiIIiiiIIIiI)IiiiiiiiIIIII.getUserObject();
        this.setText(IiiiiiiiIIIII2.ALLATORIxDEMO());
        return this;
    }

    IIIiIiiiiiiiI(IIiIIiiiiIiiI iIiIIiiiiIiiI) {
        this.ALLATORIxDEMO = iIiIIiiiiIiiI;
    }
}
