/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIIIiiiIIiII
 *  com.xy.a.i.iIIIIiiiIiiIi
 */
package com.xy.a.i;

import com.xy.a.i.IiIIIiiiIIiII;
import com.xy.a.i.iIIIIiiiIiiIi;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiIiiiIiIII
extends DefaultTreeCellRenderer {
    final /* synthetic */ IiIIIiiiIIiII ALLATORIxDEMO;

    IIIiIiiiIiIII(IiIIIiiiIIiII iiIIIiiiIIiII) {
        this.ALLATORIxDEMO = iiIIIiiiIIiII;
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        if (!(value instanceof iIIIIiiiIiiIi)) return this;
        this.setForeground(((iIIIIiiiIiiIi)value).ALLATORIxDEMO());
        return this;
    }
}
