/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiiiiiiiiIIII
 *  com.xy.formula.BaseSkillData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiiiiiiiiIIII;
import com.xy.formula.BaseSkillData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiIiiiI
extends IIIiiiiiIiIiI {
    private JLabel[] iIiIiiiiIiIii = new JLabel[3];
    private IIiIiiiiIiIII IiIIIiiiiIiiI;
    final /* synthetic */ IiiiiiiiiIIII iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public IIiiIiiiIiiiI(IiiiiiiiiIIII iiiiiiiiiIIII) {
        this.iiIiiiiiiiIii = iiiiiiiiiIIII;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 2 ? 0 : 10), (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)(IiiiiiiiIIIII == 1 ? "#c999999" : "#cFFFFFF")), (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iIiIiiiiiiIIi : (IiiiiiiiIIIII == 1 ? iiIIiiiiIiiII.iIIiiiiiiIIII : iiIIiiiiIiiII.iiIiiiiiiIIiI)));
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(57, 8, 80, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(57, 27, 80, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(12, 52, 100, 14);
            }
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)(IiiiiiiiIIIII == 0 ? "sc/d/65.png" : "sc/d/17.png"), (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(14, 55, 96, 10);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(12, 53, 100, 14);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI(iiiiiiiiiIIII.ALLATORIxDEMO());
        this.IiiiiiiiIIIII.setBounds(15, 12, 30, 30);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiIIIiiiiIiiI = new IIiIiiiiIiIII("sc/e/6.png", 1, 0, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u4fee\u70bc", iiiiiiiiiIIII.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
        this.IiIIIiiiiIiiI.setBounds(116, 52, 34, 18);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(boolean xz, boolean v) {
        this.iIiIiiiiIiIii[2].setVisible(xz);
        this.ALLATORIxDEMO[0].setVisible(xz);
        this.ALLATORIxDEMO[1].setVisible(xz);
        this.IiIIIiiiiIiiI.iiiIiiiiiiIIi(v ? 95 : 96);
        this.IiIIIiiiiIiiI.setVisible(xz);
        if (xz) {
            this.setBounds(4, 135 + (v ? 0 : 82), 160, 80);
            return;
        }
        this.setBounds(4, 135 + (v ? 0 : 56), 160, 54);
    }

    public void ALLATORIxDEMO(int FMIndex, int sld, int max, boolean xz, boolean v) {
        Skill IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf((v ? 12000 : 12500) + FMIndex));
        BaseSkillData IiiiiiiiIIIII2 = new BaseSkillData(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.setSld(sld);
        IiiiiiiiIIIII2.setSldMax(max);
        this.iIiIiiiiIiIii[0].setText(IiiiiiiiIIIII.getSkillname());
        this.iIiIiiiiIiIii[1].setText(v ? "\u4e3b\u52a8\u6280\u80fd" : "\u88ab\u52a8\u6280\u80fd");
        this.iIiIiiiiIiIii[2].setText(String.valueOf(sld) + "/" + max);
        double IiiiiiiiIIIII3 = (double)sld / (double)max;
        if (IiiiiiiiIIIII3 <= 0.0) {
            this.ALLATORIxDEMO[0].setBounds(14, 55, 0, 10);
        } else if (IiiiiiiiIIIII3 >= 1.0) {
            this.ALLATORIxDEMO[0].setBounds(14, 55, 96, 10);
        } else {
            this.ALLATORIxDEMO[0].setBounds(14, 55, (int)(IiiiiiiiIIIII3 * 96.0), 10);
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO(12, (Object)IiiiiiiiIIIII2);
        this.ALLATORIxDEMO(xz, v);
    }
}
