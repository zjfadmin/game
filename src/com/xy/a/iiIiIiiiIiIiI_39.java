/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiiIiII
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.IIIIiiiiiIiII;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiIiIiI
extends DefaultTreeCellRenderer {
    final /* synthetic */ IIIIiiiiiIiII IiiiiiiiIIIII;
    Color ALLATORIxDEMO = new Color(237, 234, 0);

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)value;
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        if (IiiiiiiiIIIII.getLevel() == 1) {
            this.setForeground(this.ALLATORIxDEMO);
            this.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        }
        if (IiiiiiiiIIIII.getLevel() != 2) return this;
        this.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        return this;
    }

    iiIiIiiiIiIiI(IIIIiiiiiIiII iIIIiiiiiIiII) {
        this.IiiiiiiiIIIII = iIIIiiiiiIiII;
    }
}
