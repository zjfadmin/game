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
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiIII
extends DefaultTreeCellRenderer {
    final /* synthetic */ IIIIIiiiIiiII ALLATORIxDEMO;

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)value;
        if (!(IiiiiiiiIIIII.getUserObject() instanceof TaskData)) return this;
        TaskData IiiiiiiiIIIII2 = (TaskData)IiiiiiiiIIIII.getUserObject();
        this.setText(IiiiiiiiIIIII2.getTaskName());
        return this;
    }

    IIiIiiiiIiIII(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.ALLATORIxDEMO = iIIIIiiiIiiII;
    }
}
