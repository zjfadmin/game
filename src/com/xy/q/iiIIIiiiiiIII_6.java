/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.q;

import com.xy.q.iiIIiiiiIiiII;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
class iiIIIiiiiiIII
extends DefaultTableCellRenderer {
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
        super.setForeground(table.getForeground());
        this.setFont(table.getFont());
        this.setValue(value);
        return this;
    }

    iiIIIiiiiiIII() {
    }
}
