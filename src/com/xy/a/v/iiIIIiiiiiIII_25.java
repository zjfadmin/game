/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiIiiiiIIIIi
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IiiIiiiiIIIIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.Goodstable;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIIIiiiiiIII
extends iIiIIiiiIiiiI {
    private com.xy.q.IIIiiiiiIiIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    final /* synthetic */ IiiIiiiiIIIIi iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(int num, ActivityFCBase lucky) {
        this.IiiiiiiiIIIII.setText(String.valueOf(num) + "/" + lucky.getNum());
        this.IiiiiiiiIIIII.setForeground(num > 0 ? Color.black : Color.red);
        IiiiiiiiiIIII iiiiiiiiiIIII = IiiIiiiiIIIIi.ALLATORIxDEMO((IiiIiiiiIIIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII = iiiiiiiiiIIII.ALLATORIxDEMO(new BigDecimal(lucky.getId()));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII != null ? 1 : 0, (Object)IiiiiiiiIIIII);
    }

    public iiIIIiiiiiIII(IiiIiiiiIIIIi iiiIiiiiIIIIi) {
        this.iiIiiiiiiiIii = iiiIiiiiIIIIi;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.iIiIiiiiIiIii = new com.xy.q.IIIiiiiiIiIiI(IiiIiiiiIIIIi.ALLATORIxDEMO((IiiIiiiiIIIIi)iiiIiiiiIIIIi));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.ALLATORIxDEMO);
    }

    static /* synthetic */ int ALLATORIxDEMO(iiIIIiiiiiIII arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(int style) {
        if (this.IiIIIiiiiIiiI == style) {
            return;
        }
        this.IiIIIiiiiIiiI = style;
        if (style == 1) {
            if (this.IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)22, (int)78, (int)54, (int)14, (Color)Color.white, (Font)iiIIiiiiIiiII.IiiiiiiiIIIII);
                this.IiiiiiiiIIIII.setHorizontalAlignment(0);
                this.add(this.IiiiiiiiIIIII, 0);
            }
            if (!this.IiiiiiiiIIIII.isVisible()) {
                this.IiiiiiiiIIIII.setVisible(true);
            }
            this.iIiIiiiiIiIii.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IIIIIiiiIiIIi);
            this.iIiIiiiiIiIii.setBounds(23, 24, 52, 52);
            this.ALLATORIxDEMO.iIiIiiiiIIiii("sc/d/122.png");
            this.ALLATORIxDEMO.setBounds(0, 0, 102, 99);
            return;
        }
        if (style != 2) return;
        if (this.IiiiiiiiIIIII != null && this.IiiiiiiiIIIII.isVisible()) {
            this.IiiiiiiiIIIII.setVisible(false);
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.IiiIiiiiIIiiI);
        this.iIiIiiiiIiIii.setBounds(10, 11, 43, 43);
        this.ALLATORIxDEMO.iIiIiiiiIIiii("sc/d/123.png");
        this.ALLATORIxDEMO.setBounds(0, 0, 65, 64);
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iiIIIiiiiiIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.iIiIiiiiIiIii.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
    }
}
