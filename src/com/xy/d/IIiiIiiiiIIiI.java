/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.d.iIiIIiiiIiiiI
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.text.GameView
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.d;

import com.xy.d.iIiIIiiiIiiiI;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.text.GameView;
import com.xy.w.IiiiIiiiiIiIi;
import java.awt.Graphics;
import java.awt.Point;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiIiiiiIIiI {
    private int iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private iIiIIiiiIiiiI iiIiiiiiiiIii;
    private iIiIIiiiIiiiI IiiiiiiiIIIII;
    private iIiIIiiiIiiiI ALLATORIxDEMO;

    public void ALLATORIxDEMO(Graphics g, GameView view) {
        iIiIIiiiIiiiI IiiiiiiiIIIII = this.iiIiiiiiiiIii;
        while (IiiiiiiiIIIII != null) {
            Point IiiiiiiiIIIII2 = view.mapCamera.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)IiiiiiiiIIIII), iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)IiiiiiiiIIIII));
            if (IiiiiiiiIIIII2 != null) {
                this.IiIIIiiiiIiiI.IiiIiiiiiiIiI(g, IiiiiiiiIIIII2.x, IiiiiiiiIIIII2.y, iIiIIiiiIiiiI.iiiIiiiiiiIIi((iIiIIiiiIiiiI)IiiiiiiiIIIII), iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)IiiiiiiiIIIII), iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)IiiiiiiiIIIII));
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO;
        }
    }

    public void ALLATORIxDEMO() {
        iIiIIiiiIiiiI IiiiiiiiIIIII = this.iiIiiiiiiiIii;
        while (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.ALLATORIxDEMO()) {
                if (IiiiiiiiIIIII == this.iiIiiiiiiiIii) {
                    this.iiIiiiiiiiIii = IiiiiiiiIIIII.ALLATORIxDEMO;
                }
                if (IiiiiiiiIIIII == this.IiiiiiiiIIIII) {
                    this.IiiiiiiiIIIII = null;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO;
        }
    }

    public void ALLATORIxDEMO(iiiiiiiiiiIiI unit, boolean add) {
        this.ALLATORIxDEMO();
        if (!add) return;
        if (++this.iIiIiiiiIiIii % 25 != 0) return;
        this.iIiIiiiiIiIii = 0;
        iIiIIiiiIiiiI IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII.ALLATORIxDEMO = null;
        iIiIIiiiIiiiI.iIiIiiiiIIiIi((iIiIIiiiIiiiI)IiiiiiiiIIIII, (int)unit.iiIiIiiiiIIIi);
        iIiIIiiiIiiiI.iIiIiiiiIIiii((iIiIIiiiIiiiI)IiiiiiiiIIIII, (int)unit.IIiiiiiiiIIIi);
        iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)IiiiiiiiIIIII, (int)unit.iiIiiiiiiiIii);
        iIiIIiiiIiiiI.ALLATORIxDEMO((iIiIIiiiIiiiI)IiiiiiiiIIIII, (long)unit.iiiiIiiiIIiii);
        iIiIIiiiIiiiI.iiiIiiiiiiIIi((iIiIIiiiIiiiI)IiiiiiiiIIIII, (int)-1);
        IiiiiiiiIIIII.ALLATORIxDEMO();
        if (this.IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO = IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = IiiiiiiiIIIII;
        if (this.iiIiiiiiiiIii != null) return;
        this.iiIiiiiiiiIii = IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(iIiIIiiiIiiiI shadowUnitReserve) {
        this.ALLATORIxDEMO = shadowUnitReserve;
    }

    public IIiiIiiiiIIiI(iiiiiiiiiiIiI unit) {
        this.IiIIIiiiiIiiI = unit.iiIIIiiiiiiiI.iIiIiiiiIIiii();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(1);
    }

    public iIiIIiiiIiiiI ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO == null) {
            return new iIiIIiiiIiiiI(this);
        }
        iIiIIiiiIiiiI IiiiiiiiIIIII = this.ALLATORIxDEMO;
        this.ALLATORIxDEMO = null;
        return IiiiiiiiIIIII;
    }
}
