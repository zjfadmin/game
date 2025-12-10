/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIiIiiiiIIii
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.formula.FormulaNum
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IIIiIiiiiIIii;
import com.xy.formula.ActivityMenuSet2;
import com.xy.formula.FormulaNum;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;

public class IiiIiiiiIiIIi
extends iIiIIiiiIiiiI {
    private IiiiIiiiiIiIi iiiiIiiiIiiII;
    private Activity iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private IIIiIiiiiIIii[] IIiiIiiiIIiIi;
    private iIIiIiiiIiiIi iIiIiiiiIiIii;
    private iiIiIiiiIIIiI IiIIIiiiiIiiI;
    private ActivityMenuSet2 iiIiiiiiiiIii;
    private iiIiIiiiIIIiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int page) {
        this.iIiiIiiiiiiII = Math.max(1, Math.min(page, this.ALLATORIxDEMO));
        IiiiiiiiiIIII IiiiiiiiIIIII = this.iiiiIiiiIiiII.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = -(this.iIiiIiiiiiiII - 1) * this.IIiiIiiiIIiIi.length;
        FormulaNum[] formulaNumArray = this.iiIiiiiiiiIii.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            FormulaNum IiiiiiiiIIIII3 = formulaNumArray[n2];
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getSize();
            if (IiiiiiiiIIIII2 + IiiiiiiiIIIII4 < 0) {
                IiiiiiiiIIIII2 += IiiiiiiiIIIII4;
            } else {
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4 && IiiiiiiiIIIII2 < this.IIiiIiiiIIiIi.length) {
                    if (IiiiiiiiIIIII2 >= 0) {
                        int IiiiiiiiIIIII6 = (int)IiiiiiiiIIIII3.getZhi(IiiiiiiiIIIII5);
                        ActivityFC IiiiiiiiIIIII7 = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII6);
                        this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII7 != null && IiiiiiiiIIIII7.getType() == 1 ? IiiiiiiiIIIII7 : null);
                    }
                    ++IiiiiiiiIIIII5;
                    ++IiiiiiiiIIIII2;
                }
            }
            ++n2;
        }
        int IiiiiiiiIIIII8 = Math.max(0, IiiiiiiiIIIII2);
        while (IiiiiiiiIIIII8 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII8++].ALLATORIxDEMO(null);
        }
        this.iIiIiiiiIiIii.setText(String.valueOf(page) + "/" + this.ALLATORIxDEMO);
    }

    public IiiIiiiiIiIIi(IiiiIiiiiIiIi form) {
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.setBounds(0, 0, 745, 452);
        this.iiiiIiiiIiiII = form;
        this.IIiiIiiiIIiIi = new IIIiIiiiiIIii[9];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiIiiiiIIii(this, "sc/b/B454.png", 1, form);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(203 + IiiiiiiiIIIII % 3 * 169, 160 + IiiiiiiiIIIII / 3 * 83, 162, 67);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)412, (int)405, (int)80, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new iiIiIiiiIIIiI("sc/e/156.png", 1, 102, form, (JComponent)((Object)this));
        this.IiiiiiiiIIIII = new iiIiIiiiIIIiI("sc/e/155.png", 1, 103, form, (JComponent)((Object)this));
        this.IiIIIiiiiIiiI.setBounds(391, 402, 18, 25);
        this.IiiiiiiiIIIII.setBounds(495, 402, 18, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int id) {
        if (id == 102) {
            if (this.iIiiIiiiiiiII <= 1) {
                return;
            }
            this.iIiIiiiiIIiii(this.iIiiIiiiiiiII - 1);
            return;
        }
        if (id != 103) return;
        if (this.iIiiIiiiiiiII >= this.ALLATORIxDEMO) {
            return;
        }
        this.iIiIiiiiIIiii(this.iIiiIiiiiiiII + 1);
    }

    public void ALLATORIxDEMO(Activity activity, ActivityMenuSet2 menuSet2) {
        this.iiiIiiiiiiiIi = activity;
        this.iiIiiiiiiiIii = menuSet2;
        int IiiiiiiiIIIII = 0;
        FormulaNum[] formulaNumArray = menuSet2.getBases();
        int n = formulaNumArray.length;
        int n2 = 0;
        while (n2 < n) {
            FormulaNum IiiiiiiiIIIII2 = formulaNumArray[n2];
            ++n2;
            IiiiiiiiIIIII += IiiiiiiiIIIII2.getSize();
        }
        this.ALLATORIxDEMO = 1 + (IiiiiiiiIIIII - 1) / this.IIiiIiiiIIiIi.length;
        this.iIiIiiiiIIiii(1);
    }

    static /* synthetic */ Activity ALLATORIxDEMO(IiiIiiiiIiIIi arg0) {
        return arg0.iiiIiiiiiiiIi;
    }
}
