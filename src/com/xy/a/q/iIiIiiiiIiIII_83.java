/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class iIiIiiiiIiIII
extends JComponent {
    final /* synthetic */ IIIIIiiiIIIiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public Goodstable ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii.ALLATORIxDEMO() != 1) return null;
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII.getRgid() == null) return null;
        return this.iIiIiiiiIiIii.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
    }

    public String ALLATORIxDEMO() {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return null;
        return IiiiiiiiIIIII.getValue();
    }

    public long ALLATORIxDEMO() {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return -1L;
        return IiiiiiiiIIIII.getType();
    }

    public iIiIiiiiIiIII(IIIIIiiiIIIiI iIIIIiiiIIIiI) {
        this.iIiIiiiiIiIii = iIIIIiiiIIIiI;
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI(iIIIIiiiIIIiI.ALLATORIxDEMO());
        this.iiIiiiiiiiIii.setBounds(4, 4, 50, 50);
        this.add((Component)this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)21, (int)58, (int)16, (int)0, (Color)Color.gray, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/4.png");
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/30.png");
        this.IiiiiiiiIIIII.setBounds(0, 0, 59, 57);
        this.IiIIIiiiiIiiI.setBounds(1, 57, 58, 1);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public BigDecimal ALLATORIxDEMO() {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) return null;
        return IiiiiiiiIIIII.getRgid();
    }

    public void ALLATORIxDEMO(String text) {
        this.ALLATORIxDEMO.setText(text);
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO(iIiIiiiiIiIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.ALLATORIxDEMO.setVisible(good == null);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
    }
}
