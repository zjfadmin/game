/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIIIiiiIiiII
 *  com.xy.bean.RoleShow
 *  com.xy.formula.SkillUtil
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIIIIiiiIiiII;
import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiIII
extends iIiIIiiiIiiiI {
    final /* synthetic */ IIIIIiiiIiiII IIiiIiiiIIiIi;
    private IiiiIiiiiIiIi iIiIiiiiIiIii;
    private RoleShow IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)39, (int)171, (int)77, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(RoleShow roleShow) {
        this.IiIIIiiiiIiiI = roleShow;
        if (roleShow == null) {
            this.iIiIiiiiIiIii = null;
            this.setVisible(false);
            return;
        }
        this.IiiiiiiiIIIII.setText(roleShow.getRolename());
        this.iiIiiiiiiiIii.iIiIiiiiIIiii("sc/d/" + (134 + (SkillUtil.getSepciesIndex((BigDecimal)roleShow.getSpecies_id()) - 1) / 2) + ".png");
        this.iIiIiiiiIiIii = null;
        this.setVisible(true);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IiIIIiiiiIiiI == null) {
            return;
        }
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IIiiIiiiIIiIi) == null) {
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IIiiIiiiIIiIi, (IIIIIiiiIiIii)iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"long")));
        }
        if (IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IIiiIiiiIIiIi) != null) {
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IIiiIiiiIIiIi).ALLATORIxDEMO(com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IIiiIiiiIIiIi).ALLATORIxDEMO(g, 68, 138);
        }
        if (this.iIiIiiiiIiIii == null) {
            this.iIiIiiiiIiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((long)this.IiIIIiiiiIiiI.getSpecies_id().longValue(), (int)2, (int)1, null);
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO(g, 68, 138, 4, com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public IIiIiiiiIiIII(IIIIIiiiIiiII iIIIIiiiIiiII) {
        this.IIiiIiiiIIiIi = iIIIIiiiIiiII;
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI("sc/d/139.png");
        this.iiIiiiiiiiIii.setBounds(9, 167, 29, 29);
        this.ALLATORIxDEMO.setBounds(0, 172, 135, 20);
        this.add(this.IiiiiiiiIIIII);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
    }
}
