/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiIiiiiIIiI
 *  com.xy.formula.BaseMountSH
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.a;

import com.xy.a.a.IIIiIiiiiIIiI;
import com.xy.formula.BaseMountSH;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class StarcardPanel1
extends StarcardJpanel1 {
    private iiIiIiiiiIiIi iIiiIiiiiiiII;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private long iIiIiiiiIiIii;
    final /* synthetic */ IIIiIiiiiIIiI IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii = new JLabel[2];
    private IiIiIiiiiIIiI IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    static /* synthetic */ long ALLATORIxDEMO(StarcardPanel1 arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public StarcardPanel1(IIIiIiiiiIIiI iIIiIiiiiIIiI) {
        this.IiIIIiiiiIiiI = iIIiIiiiiIIiI;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)(0 + IiiiiiiiIIIII * 31), (int)90, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6240\u9700\u7075\u5143\u6676" : (IiiiiiiiIIIII == 1 ? "\u5f53\u524d\u7075\u5143\u6676" : ""));
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new MoneyType();
        this.ALLATORIxDEMO.setIdAndMax(-4, 107L);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)91, (int)0, (int)116, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)91, (int)31, (int)116, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.ALLATORIxDEMO, (GameView)iIIiIiiiiIIiI.iiIIiiiiIiIIi);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = new IiIiIiiiiIIiI("sc/e/7.png", 1, 213, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u7a81\u7834", iIIiIiiiiIIiI.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setForeground(Color.black);
        this.IiiiiiiiIIIII.setBounds(88, 108, 59, 25);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(BaseMountSH mountSH) {
        this.iIiiIiiiiiiII.iIiIiiiiIIiii();
        this.iIiIiiiiIiIii = mountSH.getLYJTotal();
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)this.iIiIiiiiIiIii);
    }
}
