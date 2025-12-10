/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiIIiiiiIiii
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiiIIiiiiIiii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIiiiiiiiiIi
implements MouseListener {
    private boolean IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    final /* synthetic */ IiiIIiiiiIiii ALLATORIxDEMO;

    static /* synthetic */ boolean ALLATORIxDEMO(IIIiiiiiiiiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiiiiiiiiIi arg0, IIIiiiiiIiIiI arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.IiiiiiiiIIIII == 0) {
            if (IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) != 0) {
                if (IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) != 1) return;
            }
            if (this.IiIIIiiiiIiiI) {
                IiiIIiiiiIiii.iiiIiiiiiiIIi((IiiIIiiiiIiii)this.ALLATORIxDEMO, (long)0L);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO, (long)0L);
                IiiIIiiiiIiii.iIiIiiiiIIiii((IiiIIiiiiIiii)this.ALLATORIxDEMO, (long)0L);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[8].setText("\u6d88\u8017\u91d1\u94b1\uff1a0\u4e24");
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[9].setText("\u6d88\u8017\u4ed9\u7389\uff1a0\u4ed9\u7389");
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[10].setText("\u6d88\u8017\u7ecf\u9a8c\uff1a0\u7ecf\u9a8c");
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[3].ALLATORIxDEMO(false);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[4].ALLATORIxDEMO(false);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[5].ALLATORIxDEMO(false);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[7].setText(null);
                IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[1].setText(null);
            }
            this.ALLATORIxDEMO(!this.IiIIIiiiiIiiI);
            return;
        }
        if (this.IiiiiiiiIIIII == 1 || this.IiiiiiiiIIIII == 2) {
            this.ALLATORIxDEMO(!this.IiIIIiiiiIiiI);
            return;
        }
        if (this.IiiiiiiiIIIII != 3 && this.IiiiiiiiIIIII != 4) {
            if (this.IiiiiiiiIIIII != 5) return;
        }
        if (IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) != 0) {
            if (IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) != 1) return;
        }
        if (!IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[0].IiIIIiiiiIiiI) return;
        IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[3].ALLATORIxDEMO(this.IiiiiiiiIIIII == 3);
        IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[4].ALLATORIxDEMO(this.IiiiiiiiIIIII == 4);
        IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[5].ALLATORIxDEMO(this.IiiiiiiiIIIII == 5);
        IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[7].setText(this.IiiiiiiiIIIII == 3 ? "\u4e24" : (this.IiiiiiiiIIIII == 4 ? "\u4ed9\u7389" : "\u7ecf\u9a8c"));
        IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO)[1].setText(String.valueOf(this.IiiiiiiiIIIII == 3 ? IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO) : (this.IiiiiiiiIIIII == 4 ? IiiIIiiiiIiii.iIiIiiiiIIiii((IiiIIiiiiIiii)this.ALLATORIxDEMO) : IiiIIiiiiIiii.iiiIiiiiiiIIi((IiiIIiiiiIiii)this.ALLATORIxDEMO))));
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiiiiiiiiIi arg0, int arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    public void ALLATORIxDEMO(boolean put) {
        this.IiIIIiiiiIiiI = put;
        if (this.IiiiiiiiIIIII < 3) {
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(put ? "sc/e/30.png" : "sc/e/29.png");
            return;
        }
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(put ? "sc/e/62.png" : "sc/e/63.png");
    }

    IIIiiiiiiiiIi(IiiIIiiiiIiii iiiIIiiiiIiii) {
        this.ALLATORIxDEMO = iiiIIiiiiIiii;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
}
