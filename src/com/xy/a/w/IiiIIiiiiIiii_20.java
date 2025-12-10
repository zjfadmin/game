/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIIiiiiIIIIi
 *  com.xy.game.NpcOption
 *  com.xy.q.IiIIIiiiiIIiI
 */
package com.xy.a.w;

import com.xy.a.w.IIIIiiiiIIIIi;
import com.xy.game.NpcOption;
import com.xy.q.IiIIIiiiiIIiI;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JScrollPane;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIIiiiiIiii {
    private JList<NpcOption> IiIIIiiiiIiiI = new JList();
    private int iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    final /* synthetic */ IIIIiiiiIIIIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(JList<NpcOption> list) {
        this.IiIIIiiiiIiiI = list;
        this.IiiiiiiiIIIII.setViewportView(list);
    }

    static /* synthetic */ JList ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO() {
        this.iiIiiiiiiiIii = 0;
        this.IiIIIiiiiIiiI.removeAll();
    }

    public void ALLATORIxDEMO(NpcOption option) {
        this.IiIIIiiiiIiiI.add((Component)option);
        option.setBounds(0, this.iiIiiiiiiiIii, 149, option.getHeight());
        this.iiIiiiiiiiIii += option.getHeight();
        this.IiIIIiiiiIiiI.setPreferredSize(new Dimension(149, this.iiIiiiiiiiIii));
    }

    /*
     * WARNING - void declaration
     */
    public IiiIIiiiiIiii(IIIIiiiiIIIIi iIIIiiiiIIIIi, int n, IIIIiiiiIIIIi iIIIiiiiIIIIi2) {
        void view;
        void index;
        this.ALLATORIxDEMO = iIIIiiiiIIIIi;
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(index == false ? 60 : 235), (int)110, (int)149, (int)155, this.IiIIIiiiiIiiI, (int)20);
        view.add((Component)this.IiiiiiiiIIIII);
    }
}
