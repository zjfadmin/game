/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IIIIIiiiIiiII
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.formula.SkillUtil
 *  com.xy.readbean.Skill
 */
package com.xy.a.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IIIIIiiiIiiII;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.formula.SkillUtil;
import com.xy.readbean.Skill;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIiiIi
implements MouseListener {
    IIIIIiiiIiiII IiiiiiiiIIIII;
    final /* synthetic */ IiIiIiiiiIIiI ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Skill IiiiiiiiIIIII;
        Skill skill = IiiiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IiiiiiiiIIIII) > 0 ? this.ALLATORIxDEMO.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IiiiiiiiIIIII))) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        iiIiiiiiIIiiI iiIiiiiiIIiiI2 = (iiIiiiiiIIiiI)this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        iiIiiiiiIIiiI2.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII.getSkillname()) + "(" + (int)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IiiiiiiiIIIII) + "\u7ea7)", SkillUtil.ALLATORIxDEMO((Skill)IiiiiiiiIIIII, (int)((int)IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)this.IiiiiiiiIIIII))));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public IIiIiiiiIiiIi(IiIiIiiiiIIiI iiIiIiiiiIIiI, IIIIIiiiIiiII unitView) {
        this.ALLATORIxDEMO = iiIiIiiiiIIiI;
        this.IiiiiiiiIIIII = unitView;
    }
}
