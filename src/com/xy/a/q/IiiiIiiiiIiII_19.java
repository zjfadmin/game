/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiiIIii
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.IIIiIiiiiIIii;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiiIiII
extends DefaultTableCellRenderer {
    final /* synthetic */ IIIiIiiiiIIii ALLATORIxDEMO;

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
        if (column == 0) {
            this.setForeground(this.ALLATORIxDEMO.ALLATORIxDEMO((String)value));
        } else {
            super.setForeground(table.getForeground());
        }
        this.setFont(table.getFont());
        this.setValue(value);
        return this;
    }

    IiiiIiiiiIiII(IIIiIiiiiIIii iIIiIiiiiIIii) {
        this.ALLATORIxDEMO = iIIiIiiiiIIii;
    }
}
