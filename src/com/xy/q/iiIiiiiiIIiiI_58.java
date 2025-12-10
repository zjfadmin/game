/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.q;

import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
class iiIiiiiiIIiiI
extends DefaultTableCellHeaderRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (table == null) {
            return this;
        }
        super.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        super.setForeground(Color.white);
        this.setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.setValue(value);
        return this;
    }

    iiIiiiiiIIiiI() {
    }
}
