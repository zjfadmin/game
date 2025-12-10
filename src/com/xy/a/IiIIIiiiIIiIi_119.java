/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiIiIiI
 *  com.xy.bean.GangReward
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 */
package com.xy.a;

import com.xy.a.iiiIiiiiIiIiI;
import com.xy.bean.GangReward;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIIIiiiIIiIi
extends IIIiiiiiIiIiI {
    final /* synthetic */ iiiIiiiiIiIiI iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public IiIIIiiiIIiIi(iiiIiiiiIiIiI iiiIiiiiIiIiI2) {
        this.iiIiiiiiiiIii = iiiIiiiiIiIiI2;
        super(iiiIiiiiIiIiI2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)1, (int)2, (int)42, (int)12, (int)10, (Color)Color.WHITE, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)7, (int)34, (int)42, (int)12, (int)4, (Color)Color.RED, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add(this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(GangReward gangReward) {
        Goodstable IiiiiiiiIIIII;
        Goodstable goodstable = IiiiiiiiIIIII = gangReward != null ? this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(gangReward.getGoodId()) : null;
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO(0, null);
            this.setVisible(true);
            this.IiiiiiiiIIIII.setText("");
            this.ALLATORIxDEMO.setText("");
            return;
        }
        this.ALLATORIxDEMO(1, IiiiiiiiIIIII);
        this.IiiiiiiiIIIII.setText(gangReward.getDropNum() > 1 ? String.valueOf(gangReward.getDropNum()) : "");
        this.ALLATORIxDEMO.setText(String.valueOf(gangReward.getRewardNum()));
    }
}
