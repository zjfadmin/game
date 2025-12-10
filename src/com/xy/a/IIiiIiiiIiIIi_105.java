/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiiiiiiIiiii
 *  com.xy.a.iiIiIiiiiIIII
 *  com.xy.a.iiiiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a;

import com.xy.a.iIiiiiiiIiiii;
import com.xy.a.iiIiIiiiiIIII;
import com.xy.a.iiiiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollPane;

/*
 * Exception performing whole class analysis ignored.
 */
public static class IIiiIiiiIiIIi
extends JComponent {
    private iIiiiiiiIiiii IIiiIiiiIIiIi;
    final /* synthetic */ iiIiIiiiiIIII iIiIiiiiIiIii;
    private JComponent IiIIIiiiiIiiI;
    private List<iIiiiiiiIiiii> iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private JList<iIiiiiiiIiiii> ALLATORIxDEMO;

    static /* synthetic */ JList ALLATORIxDEMO(IIiiIiiiIiIIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ iIiiiiiiIiiii ALLATORIxDEMO(IIiiIiiiIiIIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ List ALLATORIxDEMO(IIiiIiiiIiIIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public IIiiIiiiIiIIi(iiIiIiiiiIIII iiIiIiiiiIIII2) {
        this.iIiIiiiiIiIii = iiIiIiiiiIIII2;
        this.setOpaque(false);
        this.setLayout(null);
        this.IiIIIiiiiIiiI = new iiiiIiiiiIIiI(this);
        this.IiIIIiiiiIiiI.setBounds(0, 0, 490, 288);
        this.IiIIIiiiiIiiI.addMouseListener(IiIIIiiiiIIiI.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI.setVisible(false);
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new ArrayList<iIiiiiiiIiiii>();
        this.ALLATORIxDEMO = new JList();
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.ALLATORIxDEMO.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.ALLATORIxDEMO.setSelectionMode(0);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)490, (int)288, this.ALLATORIxDEMO, (int)-1);
        this.add(this.IiiiiiiiIIIII);
    }

    static /* synthetic */ JComponent ALLATORIxDEMO(IIiiIiiiIiIIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIiiIiiiIiIIi arg0, iIiiiiiiIiiii arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }
}
