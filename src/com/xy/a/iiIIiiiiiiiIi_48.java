/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIiII
 *  com.xy.a.IiiiIiiiIIIiI
 *  com.xy.battle.TypeState
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIiII;
import com.xy.a.IiiiIiiiIIIiI;
import com.xy.battle.TypeState;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class iiIIiiiiiiiIi
extends JComponent {
    final /* synthetic */ IiIIiiiiiIiII IiIIIiiiiIiiI;
    List<IiiiIiiiIIIiI> iiIiiiiiiiIii = new ArrayList<IiiiIiiiIIIiI>();
    String[] IiiiiiiiIIIII;
    int ALLATORIxDEMO;

    public iiIIiiiiiiiIi(IiIIiiiiiIiII iiIIiiiiiIiII) {
        this.IiIIIiiiiIiiI = iiIIiiiiiIiII;
    }

    public IiiiIiiiIIIiI ALLATORIxDEMO() {
        IiiiIiiiIIIiI IiiiiiiiIIIII;
        IiiiIiiiIIIiI iiiiIiiiIIIiI = IiiiiiiiIIIII = this.ALLATORIxDEMO < this.iiIiiiiiiiIii.size() ? this.iiIiiiiiiiIii.get(this.ALLATORIxDEMO) : null;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new IiiiIiiiIIIiI(this.IiIIIiiiiIiiI);
            this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
            IiiiiiiiIIIII.setBounds(22, 2 + this.ALLATORIxDEMO * 30, 115, 25);
            this.add((Component)IiiiiiiiIIIII);
        }
        ++this.ALLATORIxDEMO;
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(TypeState typeState) {
        this.ALLATORIxDEMO().ALLATORIxDEMO(typeState);
    }

    public void ALLATORIxDEMO() {
        this.setVisible(false);
        this.ALLATORIxDEMO = 0;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            IiiiIiiiIIIiI iiiiIiiiIIIiI = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iiiiIiiiIIIiI.ALLATORIxDEMO(null);
        }
        this.IiiiiiiiIIIII = null;
    }
}
