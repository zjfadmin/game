/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiiiiiiIIii
 *  com.xy.formula.BaseSkillData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIiiiiiiIIii;
import com.xy.formula.BaseSkillData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
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
public static class iiiIIiiiIiIII
extends IIIiiiiiIiIiI {
    private JLabel iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII;
    private IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private IiiiiiiiiIIII iiiiIiiiIiiII;
    final /* synthetic */ iiIiiiiiiIIii iiiIiiiiiiiIi;
    private BaseSkillData iIiiIiiiiiiII;
    private Skill IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private com.xy.q.IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public iiiIIiiiIiIII(iiIiiiiiiIIii iiIiiiiiiIIii2) {
        this.iiiIiiiiiiiIi = iiIiiiiiiIIii2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII("sc/e/6.png", 1, 205, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u5347\u7ea7", iiIiiiiiiIIii2.ALLATORIxDEMO());
        this.iiiiIiiiIiiII.ALLATORIxDEMO((Object)this);
        this.iiiiIiiiIiiII.setBounds(179, 42, 34, 18);
        this.add((Component)this.iiiiIiiiIiiII);
        this.IiIIIiiiiIiiI = new com.xy.q.IIIiiiiiIiIiI(iiIiiiiiiIIii2.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI.ALLATORIxDEMO("sc/d/4.png");
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI.setBounds(6, 5, 59, 57);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)19, (int)90, (int)16, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)143, (int)19, (int)70, (int)16, (int)4, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)73, (int)43, (int)102, (int)16, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.add(this.IiiiiiiiIIIII);
        this.add(this.iiIIIiiiiiiiI);
        this.add(this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/67.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiIiiiiIiIii.setBounds(74, 44, 100, 14);
        this.iiIiIiiiiIIIi.setBounds(73, 43, 102, 16);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iIiiIiiiiiiII = new BaseSkillData(null);
    }

    public void ALLATORIxDEMO(int level) {
        if (this.IIiiIiiiIIiIi == null) {
            return;
        }
        this.IiIiiiiiIIIII = level;
        this.iIiiIiiiiiiII.setSld(level);
        this.iiIiiiiiiiIii.setText(String.valueOf(level) + "/" + this.IIiiIiiiIIiIi.getSkilllevel());
        this.iiIIIiiiiiiiI.setText(String.valueOf((level + 1) * this.ALLATORIxDEMO) + "\u91d1\u5e01");
        int IiiiiiiiIIIII = new BigDecimal(level).divide(new BigDecimal(this.IIiiIiiiIIiIi.getSkilllevel()), 3, 1).multiply(new BigDecimal(100)).intValue();
        this.iIiIiiiiIiIii.setBounds(74, 44, IiiiiiiiIIIII > 100 ? 100 : IiiiiiiiIIIII, 14);
    }

    public void ALLATORIxDEMO(Skill skill) {
        this.IIiiIiiiIIiIi = skill;
        this.iIiiIiiiiiiII.setSkill(skill);
        if (skill == null) {
            this.setVisible(false);
            return;
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(12, (Object)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = (int)Double.parseDouble(skill.getDielectric());
        this.IiiiiiiiIIIII.setText(skill.getSkillname());
        this.ALLATORIxDEMO(0);
        this.setVisible(true);
    }

    static /* synthetic */ Skill ALLATORIxDEMO(iiiIIiiiIiIII arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ int iIiIiiiiIIiii(iiiIIiiiIiIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiIIiiiIiIII arg0) {
        return arg0.IiIiiiiiIIIII;
    }
}
