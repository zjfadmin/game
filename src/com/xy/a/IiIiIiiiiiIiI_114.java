/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.iiIiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiiIiI
extends DefaultTableCellRenderer {
    final /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (table == null) {
            return this;
        }
        JTable.DropLocation IiiiiiiiIIIII = table.getDropLocation();
        if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.isInsertRow() && !IiiiiiiiIIIII.isInsertColumn() && IiiiiiiiIIIII.getRow() == row && IiiiiiiiIIIII.getColumn() == column) {
            isSelected = true;
        }
        if (isSelected) {
            super.setBackground(iiIIiiiiIiiII.iIiiIiiiIIIIi);
        } else {
            super.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        }
        if (row < 3) {
            super.setForeground(Color.yellow);
        } else {
            super.setForeground(Color.white);
        }
        this.setFont(table.getFont());
        this.setValue(value);
        return this;
    }

    IiIiIiiiiiIiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiIi2;
    }
}
