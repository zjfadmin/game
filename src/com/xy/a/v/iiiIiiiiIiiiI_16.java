/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiIiIiiiiiIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IiIiIiiiiiIiI;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiIiiiiIiiiI
extends DefaultTableCellRenderer {
    final /* synthetic */ IiIiIiiiiiIiI ALLATORIxDEMO;

    iiiIiiiiIiiiI(IiIiIiiiiiIiI iiIiIiiiiiIiI) {
        this.ALLATORIxDEMO = iiIiIiiiiiIiI;
    }

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
        super.setForeground(row < 32 ? Color.black : Color.red);
        this.setFont(table.getFont());
        this.setValue(value);
        return this;
    }
}
