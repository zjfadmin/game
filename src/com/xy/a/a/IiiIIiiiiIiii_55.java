/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.PetJpanel1
 *  com.xy.entity.Mount
 *  com.xy.game.RoleData
 */
package com.xy.a.a;

import com.xy.a.a.PetJpanel1;
import com.xy.entity.Mount;
import com.xy.game.RoleData;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiIIiiiiIiii
implements ListSelectionListener {
    final /* synthetic */ PetJpanel1 ALLATORIxDEMO;

    @Override
    public void valueChanged(ListSelectionEvent e) {
        try {
            if (PetJpanel1.ALLATORIxDEMO((PetJpanel1)this.ALLATORIxDEMO).getSelectedIndex() < 0) return;
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
            Mount IiiiiiiiIIIII2 = (Mount)IiiiiiiiIIIII.mounts.get(PetJpanel1.ALLATORIxDEMO((PetJpanel1)this.ALLATORIxDEMO).getSelectedIndex());
            this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    IiiIIiiiiIiii(PetJpanel1 petJpanel1) {
        this.ALLATORIxDEMO = petJpanel1;
    }
}
