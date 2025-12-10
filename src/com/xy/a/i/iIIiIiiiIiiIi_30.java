/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.LaborVip
 */
package com.xy.a.i;

import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.LaborVip;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIiIiiiIiiIi {
    private JLabel IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
    private LaborVip iiIiiiiiiiIii;
    private iiIiIiiiiIiii IiiiiiiiIIIII;
    final /* synthetic */ iIiIIiiiIIIiI ALLATORIxDEMO;

    static /* synthetic */ iiIiIiiiiIiii ALLATORIxDEMO(iIIiIiiiIiiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ LaborVip ALLATORIxDEMO(iIIiIiiiIiiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    /*
     * WARNING - void declaration
     */
    public iIIiIiiiIiiIi(iIiIIiiiIIIiI iIiIIiiiIIIiI2, int n) {
        void index;
        this.ALLATORIxDEMO = iIiIIiiiIIIiI2;
        this.IiiiiiiiIIIII = new iiIiIiiiiIiii("sc/b/B308.png", 1, 53, iIiIIiiiIIIiI2.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setName(String.valueOf((int)index));
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iIIiIiiiIiiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(LaborVip laborVip, int flag, int width) {
        this.iiIiiiiiiiIii = laborVip;
        if (flag == 0 || flag == 2) {
            this.IiiiiiiiIIIII.setBtn(-1, flag == 0 ? "sc/b/B309.png" : "sc/b/B310.png");
        } else {
            this.IiiiiiiiIIIII.setBtn(1, "sc/b/B308.png");
        }
        this.IiiiiiiiIIIII.setBounds(width, 184, 45, 36);
        this.IiIIIiiiiIiiI.setText(String.valueOf(laborVip.getMoney()));
        this.IiIIIiiiiIiiI.setBounds(width, 220, 45, 18);
    }
}
