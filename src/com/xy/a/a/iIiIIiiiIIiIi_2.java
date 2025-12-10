/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiIiiiiIIiI
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.BaseValue
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.a;

import com.xy.a.a.IIIiIiiiiIIiI;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseValue;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIIiiiIIiIi
extends iIiIIiiiIiiiI {
    private iiIiIiiiiIiIi iiiiIiiiIiiII;
    private JLabel[] iiiIiiiiiiiIi = new JLabel[3];
    final /* synthetic */ IIIiIiiiiIIiI iIiiIiiiiiiII;
    private MoneyType IIiiIiiiIIiIi;
    private IiiiIiiiiIiII iIiIiiiiIiIii;
    private long IiIIIiiiiIiiI = 0L;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private IIiIIiiiIIIiI IiiiiiiiIIIII;
    private iIIiIiiiIiiIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(BaseMountSH mountSH) {
        this.IiIIIiiiiIiiI = BaseValue.getSHMoney((int)mountSH.getLvl());
        this.iiiiIiiiIiiII.iIiIiiiiIIiii();
        this.iIiIiiiiIiIii.setText(String.valueOf(1));
    }

    static /* synthetic */ IIiIIiiiIIIiI ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public iIiIIiiiIIiIi(IIIiIiiiiIIiI iIIiIiiiiIIiI) {
        this.iIiiIiiiiiiII = iIIiIiiiiIIiI;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)(0 + IiiiiiiiIIIII * 31), (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6240\u9700\u91d1\u94b1" : (IiiiiiiiIIIII == 1 ? "\u5f53\u524d\u91d1\u94b1" : (IiiiiiiiIIIII == 2 ? "\u63d0\u5347\u70b9\u6570" : "")));
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new MoneyType();
        this.IIiiIiiiIIiIi.setIdAndKey(1, "\u91d1 \u94b1");
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)0, (int)134, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiiIiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)31, (int)134, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IIiiIiiiIIiIi, (GameView)iIIiIiiiiIIiI.iiIIiiiiIiIIi);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIiIiiiiIiIii.setHorizontalAlignment(0);
        this.iIiIiiiiIiIii.setBounds(73, 62, 134, 19);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiiiiiiiIIIII = new IIiIIiiiIIIiI(15, (JTextField)this.iIiIiiiiIiIii, iIIiIiiiiIIiI.ALLATORIxDEMO());
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiiiIiiiIiiII);
        this.add((Component)this.iIiIiiiiIiIii);
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/46.png", 1, 211 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u63d0\u5347\u4fee\u4e3a\u70b9" : (IiiiiiiiIIIII == 1 ? "\u4e00\u952e\u63d0\u5347" : ""), iIIiIiiiiIIiI.ALLATORIxDEMO());
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.black);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(127, 108, 119, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(0, 108, 119, 25);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ MoneyType ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ iIIiIiiiIiiIi ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ long ALLATORIxDEMO(iIiIIiiiIIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }
}
