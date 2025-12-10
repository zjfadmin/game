/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIiiiiiIIIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.readbean.Skill;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
static class IiiIIiiiiIiii
extends JComponent
implements MouseListener {
    private IIIIIiiiIiIii iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private IIIIIiiiIiIii IiiiiiiiIIIII;
    final /* synthetic */ IiIiiiiiIIIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int dLSize) {
        if (this.IiIIIiiiiIiiI == dLSize) {
            return;
        }
        this.IiIIIiiiiIiiI = dLSize;
        this.iIiIiiiiIiIii = this.IiIIIiiiiIiiI != 0 ? iiiiiiiiiiIiI.ALLATORIxDEMO((String)("sc/bang/XPJD" + this.IiIIIiiiiIiiI + ".tcp"), null) : null;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        IiiiiiiiiIIII iiiiiiiiiIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        Skill IiiiiiiiIIIII = iiiiiiiiiIIII.iIiIiiiiIIiii(String.valueOf(iiiiiiiiiIIII.ALLATORIxDEMO().getSkillId()));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.ALLATORIxDEMO.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(1, IiiiiiiiIIIII, this.IiIIIiiiiIiiI);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public IiiIIiiiiIiii(IiIiiiiiIIIiI iiIiiiiiIIIiI) {
        this.ALLATORIxDEMO = iiIiiiiiIIIiI;
        this.addMouseListener(this);
    }

    public IIIIIiiiIiIii ALLATORIxDEMO(int index) {
        if (index != this.iiIiiiiiiiIii) return null;
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(int jHIndex) {
        if (this.iiIiiiiiiiIii == jHIndex) {
            return;
        }
        this.iiIiiiiiiiIii = jHIndex;
        this.IiiiiiiiIIIII = this.iiIiiiiiiiIii != 0 ? iiiiiiiiiiIiI.ALLATORIxDEMO((String)("sc/bang/XPJH" + this.iiIiiiiiiiIii + ".tcp"), null) : null;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
    }

    static /* synthetic */ int ALLATORIxDEMO(IiiIIiiiiIiii arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(g, 57, 65);
    }
}
