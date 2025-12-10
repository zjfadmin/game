/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiIiIiiiiIIiI
 *  com.xy.formula.BaseSkillData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiIiIiiiiIIiI;
import com.xy.formula.BaseSkillData;
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
static class IIiIiiiiIiiIi
extends IIIiiiiiIiIiI {
    final /* synthetic */ IiIiIiiiiIIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII = new JLabel[2];
    private com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO;

    public IIiIiiiiIiiIi(IiIiIiiiiIIiI iiIiIiiiiIIiI) {
        this.IiIIIiiiiIiiI = iiIiIiiiiIIiI;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 0 ? 10 : 0), (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iIiIiiiiiiIIi : iiIIiiiiIiiII.iiIiiiiiiIIiI));
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(50, 5, 110, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(50, 23, 106, 12);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)(IiiiiiiiIIIII == 0 ? "sc/d/65.png" : "sc/d/17.png"), (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(50, 25, 106, 10);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(48, 23, 110, 14);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new com.xy.q.IIIiiiiiIiIiI(iiIiIiiiiIIiI.ALLATORIxDEMO());
        this.ALLATORIxDEMO.setBounds(10, 7, 30, 30);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(Skill skill, int sld, int max) {
        if (skill == null) {
            this.IiiiiiiiIIIII[0].setText(null);
            this.IiiiiiiiIIIII[1].setText(null);
            this.iiIiiiiiiiIii[0].setBounds(50, 25, 0, 10);
            this.ALLATORIxDEMO.ALLATORIxDEMO(0, null);
            return;
        }
        this.IiiiiiiiIIIII[0].setText(skill.getSkillname());
        this.IiiiiiiiIIIII[1].setText(String.valueOf(sld) + "/" + max);
        this.IiiiiiiiIIIII[1].setForeground(max > 25000 ? Color.red : Color.white);
        double IiiiiiiiIIIII = (double)sld / (double)max;
        if (IiiiiiiiIIIII <= 0.0) {
            this.iiIiiiiiiiIii[0].setBounds(50, 25, 0, 10);
        } else if (IiiiiiiiIIIII >= 1.0) {
            this.iiIiiiiiiiIii[0].setBounds(50, 25, 106, 10);
        } else {
            this.iiIiiiiiiiIii[0].setBounds(50, 25, (int)(IiiiiiiiIIIII * 106.0), 10);
        }
        BaseSkillData IiiiiiiiIIIII2 = new BaseSkillData(skill);
        IiiiiiiiIIIII2.setSld(sld);
        IiiiiiiiIIIII2.setSldMax(max);
        this.ALLATORIxDEMO.ALLATORIxDEMO(12, (Object)IiiiiiiiIIIII2);
    }
}
