/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiIiIiiiiiIIi
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

import com.xy.a.v.iiIiIiiiiiIIi;
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
static class IiIiIiiiiIIiI
extends iIiIIiiiIiiiI {
    private IiiiIiiiiIiIi IIiiIiiiIIiIi;
    private RoleShow iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    final /* synthetic */ iiIiIiiiiiIIi iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)39, (int)171, (int)77, (int)20, (Color)Color.white, (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);

    public void ALLATORIxDEMO(RoleShow roleShow) {
        this.iIiIiiiiIiIii = roleShow;
        if (roleShow == null) {
            this.IIiiIiiiIIiIi = null;
            this.setVisible(false);
            return;
        }
        this.ALLATORIxDEMO.setText(roleShow.getRolename());
        this.IiiiiiiiIIIII.iIiIiiiiIIiii("sc/d/" + (134 + (SkillUtil.getSepciesIndex((BigDecimal)roleShow.getSpecies_id()) - 1) / 2) + ".png");
        this.IIiiIiiiIIiIi = null;
        this.setVisible(true);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iIiIiiiiIiIii == null) {
            return;
        }
        if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiIiiiiiiiIii) == null) {
            iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiIiiiiiiiIii, (IIIIIiiiIiIii)iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)"long")));
        }
        if (iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiIiiiiiiiIii) != null) {
            iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            iiIiIiiiiiIIi.ALLATORIxDEMO((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(g, 68, 138);
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((long)this.iIiIiiiiIiIii.getSpecies_id().longValue(), (int)2, (int)1, null);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, 68, 138, 4, com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public IiIiIiiiiIIiI(iiIiIiiiiiIIi iiIiIiiiiiIIi2) {
        this.iiIiiiiiiiIii = iiIiIiiiiiIIi2;
        this.ALLATORIxDEMO.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI();
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI("sc/d/139.png");
        this.IiiiiiiiIIIII.setBounds(9, 167, 29, 29);
        this.IiIIIiiiiIiiI.setBounds(0, 172, 135, 20);
        this.add(this.ALLATORIxDEMO);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
    }
}
