/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.MsgUntil
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.formula.ExpUtil;
import com.xy.formula.MsgUntil;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
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
static class IIiiIiiiIiiiI
extends IIIiiiiiIiIiI {
    private JLabel[] IiIIIiiiiIiiI;
    final /* synthetic */ IiIIIiiiiiiIi iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        this.IiiiiiiiIIIII.setVisible(false);
        this.ALLATORIxDEMO.setVisible(false);
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].setVisible(false);
        }
        Goodstable IiiiiiiiIIIII2 = (Goodstable)IiIIIiiiiiiIi.ALLATORIxDEMO((IiIIIiiiiiiIi)this.iiIiiiiiiiIii)[0].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            this.IiIIIiiiiIiiI[0].setForeground(Color.gray);
            this.IiIIIiiiiIiiI[0].setText("\u8bf7\u653e\u5165\u5df2\u6709\u89c9\u9192\u6280\u7684\u88c5\u5907");
            this.IiIIIiiiiIiiI[0].setBounds(0, 0, 165, 56);
            return;
        }
        String IiiiiiiiIIIII3 = MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII2.getValue().split("\\|"), (String)"\u89c9\u9192\u6280");
        if (IiiiiiiiIIIII3 == null) {
            this.IiIIIiiiiIiiI[0].setForeground(Color.red);
            this.IiIIIiiiiIiiI[0].setText("\u8be5\u88c5\u5907\u8fd8\u6ca1\u6709\u89c9\u9192\u6280");
            this.IiIIIiiiiIiiI[0].setBounds(0, 0, 165, 56);
            return;
        }
        String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII3.split("&");
        long IiiiiiiiIIIII5 = Long.parseLong(IiiiiiiiIIIII4[3]);
        long IiiiiiiiIIIII6 = ExpUtil.ALLATORIxDEMO((long)IiiiiiiiIIIII5);
        long IiiiiiiiIIIII7 = ExpUtil.getPetSkillNowExp((long)IiiiiiiiIIIII5);
        long IiiiiiiiIIIII8 = ExpUtil.getPetSkillMaxExp((long)IiiiiiiiIIIII6);
        this.IiIIIiiiiIiiI[1].setText("\u89c9\u9192\u6280:" + IiiiiiiiIIIII4[0]);
        this.IiIIIiiiiIiiI[2].setText("\u7b49  \u7ea7:" + IiiiiiiiIIIII6);
        this.IiIIIiiiiIiiI[3].setText("\u7ecf  \u9a8c:");
        int IiiiiiiiIIIII9 = new BigDecimal(IiiiiiiiIIIII7).multiply(new BigDecimal(104)).divide(new BigDecimal(IiiiiiiiIIIII8), 2, 4).intValue();
        this.IiiiiiiiIIIII.setBounds(55, 39, IiiiiiiiIIIII9 == 0 ? 1 : IiiiiiiiIIIII9, 12);
        this.IiIIIiiiiIiiI[0].setForeground(Color.white);
        this.IiIIIiiiiIiiI[0].setText(String.valueOf(IiiiiiiiIIIII7) + "/" + IiiiiiiiIIIII8);
        this.IiIIIiiiiIiiI[0].setBounds(52, 36, 110, 18);
        this.IiiiiiiiIIIII.setVisible(true);
        this.ALLATORIxDEMO.setVisible(true);
        int IiiiiiiiIIIII10 = 1;
        while (IiiiiiiiIIIII10 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII10++].setVisible(true);
        }
    }

    public IIiiIiiiIiiiI(IiIIIiiiiiiIi iiIIIiiiiiiIi) {
        this.iiIiiiiiiiIii = iiIIIiiiiiiIi;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiIIIiiiiIiiI = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 0 ? 0 : 10), (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI[1].setBounds(11, 3, 151, 16);
        this.IiIIIiiiiIiiI[2].setBounds(11, 19, 151, 16);
        this.IiIIIiiiiIiiI[3].setBounds(11, 36, 151, 16);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/67.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.ALLATORIxDEMO.setBounds(52, 36, 110, 18);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.ALLATORIxDEMO);
    }
}
