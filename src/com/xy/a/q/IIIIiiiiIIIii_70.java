/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiIiIii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.IIIiIiiiIiIii;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiIIIii
extends JComponent {
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)45, (int)7, (int)17, (int)12, (int)4, (Color)Color.red, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
    final /* synthetic */ IIIiIiiiIiIii IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(IIIIiiiiIIIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public IIIIiiiiIIIii(IIIiIiiiIiIii iIIiIiiiIiIii) {
        this.IiiiiiiiIIIII = iIIiIiiiIiIii;
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)58, (int)75, (int)20, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(iIIiIiiiIiIii.ALLATORIxDEMO());
        this.ALLATORIxDEMO.ALLATORIxDEMO("sc/d/4.png");
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIiiiiiIiIiI.ALLATORIxDEMO);
        this.ALLATORIxDEMO.setBounds(8, 0, 59, 57);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
        this.add(this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(Goodstable good, int num) {
        if (good == null) {
            this.ALLATORIxDEMO.ALLATORIxDEMO(0, null);
            this.ALLATORIxDEMO.ALLATORIxDEMO(IIiIiiiiIiiIi.IiiIiiiiiiIiI((String)"p0"));
            this.ALLATORIxDEMO.setVisible(true);
            this.iiIiiiiiiiIii.setText("");
            this.IiIIIiiiiIiiI.setText("");
            return;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(1, (Object)good);
        this.iiIiiiiiiiIii.setText(String.valueOf(num));
        this.IiIIIiiiiIiiI.setText(good.getGoodsname());
    }
}
