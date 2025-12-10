/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIIIiiiIIIiI
 *  com.xy.a.i.IiIIIiiiiiiIi
 *  com.xy.a.i.IiiIiiiiIIIii
 *  com.xy.a.i.iiIiIiiiiIiii
 *  com.xy.a.i.iiiiiiiiiiIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.PartJade
 */
package com.xy.a.i;

import com.xy.a.i.IIIIIiiiIIIiI;
import com.xy.a.i.IiIIIiiiiiiIi;
import com.xy.a.i.IiiIiiiiIIIii;
import com.xy.a.i.iiIiIiiiiIiii;
import com.xy.a.i.iiiiiiiiiiIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.PartJade;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiIiIiiiiiIIi
implements MouseListener {
    final /* synthetic */ IiiIiiiiIIIii IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseEntered(MouseEvent e) {
        ((iiIiiiiiIIiiI)IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII).ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiIiiiiIIIii.ALLATORIxDEMO((PartJade)this.IiiiiiiiIIIII.IiIIIiiiiIiiI, (int)this.ALLATORIxDEMO), false);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII).ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII) instanceof iiIiIiiiiIiii) {
            if (this.IiiiiiiiIIIII.IiIIIiiiiIiiI.getJade(this.ALLATORIxDEMO) <= 0) {
                return;
            }
            iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII);
            IiiiiiiiIIIII.ALLATORIxDEMO()[1].ALLATORIxDEMO(100 + this.ALLATORIxDEMO, (Object)this.IiiiiiiiIIIII.IiIIIiiiiIiiI);
            return;
        }
        if (IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII) instanceof iiiiiiiiiiIiI) {
            iiiiiiiiiiIiI IiiiiiiiIIIII = (iiiiiiiiiiIiI)IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII);
            IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(100 + this.ALLATORIxDEMO, (Object)this.IiiiiiiiIIIII.IiIIIiiiiIiiI);
            IiiiiiiiIIIII.iiiIiiiiiiIIi();
            return;
        }
        if (IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII) instanceof IiIIIiiiiiiIi) {
            if (this.IiiiiiiiIIIII.IiIIIiiiiIiiI.getJade(this.ALLATORIxDEMO) <= 0) {
                return;
            }
            IiIIIiiiiiiIi IiiiiiiiIIIII = (IiIIIiiiiiiIi)IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII);
            IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(100 + this.ALLATORIxDEMO, (Object)this.IiiiiiiiIIIII.IiIIIiiiiIiiI);
            IiiiiiiiIIIII.ALLATORIxDEMO()[1].setText("1");
            return;
        }
        if (!(IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII) instanceof IIIIIiiiIIIiI)) return;
        if (this.IiiiiiiiIIIII.IiIIIiiiiIiiI.getJade(this.ALLATORIxDEMO) <= 0) {
            return;
        }
        IIIIIiiiIIIiI IiiiiiiiIIIII = (IIIIIiiiIIIiI)IiiIiiiiIIIii.ALLATORIxDEMO((IiiIiiiiIIIii)this.IiiiiiiiIIIII);
        IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(100 + this.ALLATORIxDEMO, (Object)this.IiiiiiiiIIIII.IiIIIiiiiIiiI);
        IiiiiiiiIIIII.iIiIiiiiIIiIi();
    }

    public iiIiIiiiiiIIi(IiiIiiiiIIIii iiiIiiiiIIIii, int index) {
        this.IiiiiiiiIIIII = iiiIiiiiIIIii;
        this.ALLATORIxDEMO = index;
    }
}
