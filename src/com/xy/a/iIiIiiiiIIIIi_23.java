/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIiIiiiiIiiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.IiIiIiiiiIiiI;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIiiiiIIIIi
extends DefaultTableCellRenderer {
    final /* synthetic */ IiIiIiiiiIiiI ALLATORIxDEMO;

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
        if (row < IiIiIiiiiIiiI.ALLATORIxDEMO((IiIiIiiiiIiiI)this.ALLATORIxDEMO)) {
            super.setForeground(Color.yellow);
        } else {
            super.setForeground(Color.white);
        }
        this.setFont(table.getFont());
        this.setValue(value);
        return this;
    }

    iIiIiiiiIIIIi(IiIiIiiiiIiiI iiIiIiiiiIiiI) {
        this.ALLATORIxDEMO = iiIiIiiiiIiiI;
    }
}
