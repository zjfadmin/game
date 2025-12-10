/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.bean.GoodTrans
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.bean.GoodTrans;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiiIiIi {
    private int IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    private String IiIIIiiiiIiiI;
    private GoodTrans iiIiiiiiiiIii;
    final /* synthetic */ iIiIIiiiIiiiI IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void ALLATORIxDEMO(long money) {
        if (this.ALLATORIxDEMO == null) return;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)[0], (long)money);
    }

    static /* synthetic */ String ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    IiiiIiiiiIiIi(iIiIIiiiIiiiI iIiIIiiiIiiiI2) {
        this.IiiiiiiiIIIII = iIiIIiiiIiiiI2;
    }

    static /* synthetic */ GoodTrans ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiIiiiiIiIi arg0, GoodTrans arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    public void ALLATORIxDEMO(int type) {
        this.IIiiIiiiIIiIi = type;
        if (this.IIiiIiiiIIiIi == 0) {
            this.iIiIiiiiIiIii = null;
            iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)[this.ALLATORIxDEMO == null ? 3 : 4].iIiIiiiiIIiii("sc/e/29.png");
            return;
        }
        if (this.IIiiIiiiIIiIi == 1) {
            this.iIiIiiiiIiIii = "\u672a\u786e\u5b9a";
            iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)[this.ALLATORIxDEMO == null ? 3 : 4].iIiIiiiiIIiii("sc/e/30.png");
            return;
        }
        if (this.IIiiIiiiIIiIi != 2) return;
        this.iIiIiiiiIiIii = "\u5df2\u786e\u5b9a";
        iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)this.IiiiiiiiIIIII)[this.ALLATORIxDEMO == null ? 3 : 4].iIiIiiiiIIiii("sc/e/30.png");
    }

    protected void ALLATORIxDEMO(Graphics g) {
        if (this.IiIIIiiiiIiiI != null) {
            g.setColor(Color.red);
            g.drawString(this.IiIIIiiiiIiiI, 313, 290);
            if (this.iiIiiiiiiiIii != null) {
                this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 1);
            }
            if (this.iIiIiiiiIiIii == null) return;
            g.setColor(Color.RED);
            g.drawString(this.iIiIiiiiIiIii, 473, 290);
            return;
        }
        g.setColor(Color.white);
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 0);
        }
        if (this.iIiIiiiiIiIii == null) return;
        g.setColor(Color.RED);
        g.drawString(this.iIiIiiiiIiIii, 160, 280);
    }

    static /* synthetic */ void ALLATORIxDEMO(IiiiIiiiiIiIi arg0, BigDecimal arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    public void ALLATORIxDEMO(BigDecimal role_id, String roleName) {
        this.ALLATORIxDEMO = role_id;
        this.IiIIIiiiiIiiI = roleName;
        this.iiIiiiiiiiIii = new GoodTrans();
        this.ALLATORIxDEMO(0);
        this.ALLATORIxDEMO(0L);
    }

    static /* synthetic */ BigDecimal ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiiIiiiiIiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }
}
