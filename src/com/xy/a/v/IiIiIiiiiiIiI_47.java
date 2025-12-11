/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIiIiiiiIiIi
 *  com.xy.a.v.iiiIiiiiIiiiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.BWDHTeam
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.iiIiIiiiiIiIi;
import com.xy.a.v.iiiIiiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.BWDHTeam;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.table.TableCellRenderer;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiIiiiiiIiI
extends iIiIIiiiIiiiI {
    final /* synthetic */ iiIiIiiiiIiIi IiIIIiiiiIiiI;
    private Vector<Vector<Object>> iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private JTable ALLATORIxDEMO;

    public IiIiIiiiiiIiI(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.IiIIIiiiiIiiI = iiIiIiiiiIiIi2;
        Vector<String> IiiiiiiiIIIII = new Vector<String>();
        IiiiiiiiIIIII.addElement("排名");
        IiiiiiiiIIIII.addElement("队伍名");
        IiiiiiiiIIIII.addElement("积分");
        IiiiiiiiIIIII.addElement("胜场");
        IiiiiiiiIIIII.addElement("负场");
        IiiiiiiiIIIII.addElement("回合数");
        IiiiiiiiIIIII.addElement("召唤兽消耗");
        IiiiiiiiIIIII.addElement("灵宝消耗");
        this.iiIiiiiiiiIii = new Vector();
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO(this.iiIiiiiiiiIii, IiiiiiiiIIIII, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white, (int[])new int[]{68, 80, 60, 60, 60, 90, 90});
        iiiIiiiiIiiiI IiiiiiiiIIIII2 = new iiiIiiiiIiiiI(this);
        IiiiiiiiIIIII2.setHorizontalAlignment(0);
        this.ALLATORIxDEMO.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII2);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)48, (int)95, (int)595, (int)357, (Component)this.ALLATORIxDEMO, (int)20);
        this.IiiiiiiiIIIII.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/106.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 8));
        this.add(this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(BWDHTeam[] teams) {
        this.iiIiiiiiiiIii.clear();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < teams.length) {
            BWDHTeam IiiiiiiiIIIII2 = teams[IiiiiiiiIIIII];
            Vector<String> IiiiiiiiIIIII3 = new Vector<String>();
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII + 1));
            IiiiiiiiIIIII3.add(IiiiiiiiIIIII2.getName());
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[0]));
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[1]));
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[2]));
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[3]));
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[4]));
            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII2.getData2()[5]));
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiiIii.addElement(IiiiiiiiIIIII3);
        }
        if (this.ALLATORIxDEMO.getRowCount() > 0) {
            this.ALLATORIxDEMO.setRowSelectionInterval(0, 0);
        }
        this.ALLATORIxDEMO.updateUI();
        JScrollBar IiiiiiiiIIIII2 = this.IiiiiiiiIIIII.getVerticalScrollBar();
        IiiiiiiiIIIII2.setMaximum(this.ALLATORIxDEMO.getHeight());
        IiiiiiiiIIIII2.setValue(0);
    }
}
