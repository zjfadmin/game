/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiiiIiiiiiIiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iiiiIiiiiiIiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiIiiiiiIIIII
extends JComponent {
    final /* synthetic */ iiiiIiiiiiIiI iIiIiiiiIiIii;
    private IiiiiiiiiIIII IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)51, (int)51, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    static /* synthetic */ int ALLATORIxDEMO(IiIiiiiiIIIII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(IiIiiiiiIIIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(IiIiiiiiIIIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public IiIiiiiiIIIII(iiiiIiiiiiIiI iiiiIiiiiiIiI2) {
        this.iIiIiiiiIiIii = iiiiIiiiiiIiI2;
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(iiiiIiiiiiIiI2.ALLATORIxDEMO());
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIiiiiiIiIiI.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO.setBounds(0, 0, 51, 51);
        this.IiIIIiiiiIiiI = new IiiiiiiiiIIII("sc/e/27.png", 1, 187, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", iiiiIiiiiiIiI2.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.ALLATORIxDEMO((Object)this);
        this.IiIIIiiiiIiiI.setBounds(0, 52, 51, 18);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(int type, Goodstable good) {
        this.IiiiiiiiIIIII = type;
        if (good == null) {
            this.iiIiiiiiiiIii.setVisible(true);
            this.ALLATORIxDEMO.ALLATORIxDEMO(0, null);
            this.ALLATORIxDEMO.setVisible(true);
            this.IiIIIiiiiIiiI.setForeground(Color.GRAY);
            this.IiIIIiiiiIiiI.setText("\u53ef\u6253\u9020");
            this.IiIIIiiiiIiiI.setBtn(0, null);
            return;
        }
        this.iiIiiiiiiiIii.setVisible(false);
        this.ALLATORIxDEMO.ALLATORIxDEMO(1, (Object)good);
        if (type == 1) {
            this.IiIIIiiiiIiiI.setForeground(Color.white);
            this.IiIIIiiiiIiiI.setText("\u6458\u9664");
            this.IiIIIiiiiIiiI.setBtn(1, "sc/e/27.png");
            return;
        }
        this.IiIIIiiiiIiiI.setForeground(Color.red);
        this.IiIIIiiiiIiiI.setText("\u5f85\u6253\u9020");
        this.IiIIIiiiiIiiI.setBtn(0, null);
    }
}
