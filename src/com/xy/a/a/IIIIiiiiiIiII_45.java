/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIIIiiiiIiiII
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.a;

import com.xy.a.a.iIIIiiiiIiiII;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIiiiiiIiII
extends JComponent {
    private JLabel[] iIiIiiiiIiIii;
    private iIIiIiiiIiiIi[] IiIIIiiiiIiiI;
    private IiiiIiiiiIiII iiIiiiiiiiIii;
    final /* synthetic */ iIIIiiiiIiiII IiiiiiiiIIIII;
    private IiIiIiiiiIIiI[] ALLATORIxDEMO = new IiIiIiiiiIIiI[3];

    public IIIIiiiiiIiII(iIIIiiiiIiiII iIIIiiiiIiiII2) {
        this.IiiiiiiiIIIII = iIIIiiiiIiiII2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 0 ? "sc/e/40.png" : "sc/e/7.png", 1, 3 + IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u6539" : (IiiiiiiiIIIII == 1 ? "\u8ddf\u968f" : (IiiiiiiiIIIII == 2 ? "\u53c2\u6218" : "")), iIIIiiiiIiiII2.ALLATORIxDEMO());
            IIIIiiiiiIiII iIIIiiiiiIiII = this;
            if (IiiiiiiiIIIII == 0) {
                iIIIiiiiiIiII.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(205, 10, 18, 18);
            } else {
                iIIIiiiiiIiII.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(56 + 73 * (IiiiiiiiIIIII - 1), 181, 59, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[14];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(16, 10, 35, 19);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 12) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(16 + (IiiiiiiiIIIII - 1) % 2 * 108, 31 + (IiiiiiiiIIIII - 1) / 2 * 21, 35, 19);
            } else if (IiiiiiiiIIIII == 13) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(1, 157, 51, 19);
            }
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u4e73\u540d" : (IiiiiiiiIIIII == 1 ? "\u6c14\u8d28" : (IiiiiiiiIIIII == 2 ? "\u5185\u529b" : (IiiiiiiiIIIII == 3 ? "\u667a\u529b" : (IiiiiiiiIIIII == 4 ? "\u8010\u529b" : (IiiiiiiiIIIII == 5 ? "\u540d\u6c14" : (IiiiiiiiIIIII == 6 ? "\u9053\u5fb7" : (IiiiiiiiIIIII == 7 ? "\u53db\u9006" : (IiiiiiiiIIIII == 8 ? "\u73a9\u6027" : (IiiiiiiiIIIII == 9 ? "\u4eb2\u5bc6" : (IiiiiiiiIIIII == 10 ? "\u5b5d\u5fc3" : (IiiiiiiiIIIII == 11 ? "\u6e29\u9971" : (IiiiiiiiIIIII == 12 ? "\u75b2\u52b3" : (IiiiiiiiIIIII == 13 ? "\u517b\u80b2\u91d1" : ""))))))))))))));
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iiIiiiiiiiIii.setBounds(52, 10, 172, 19);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiIIIiiiiIiiI = new iIIiIiiiIiiIi[13];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(52 + IiiiiiiiIIIII % 2 * 108), (int)(31 + IiiiiiiiIIIII / 2 * 21), (int)64, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 12) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(52, 157, 172, 19);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ IiIiIiiiiIIiI[] ALLATORIxDEMO(IIIIiiiiiIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ IiiiIiiiiIiII ALLATORIxDEMO(IIIIiiiiiIiII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(IIIIiiiiiIiII arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO() {
        this.iiIiiiiiiiIii.setText(null);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].setText(null);
        }
        this.ALLATORIxDEMO[2].setText("\u53c2\u6218");
    }
}
