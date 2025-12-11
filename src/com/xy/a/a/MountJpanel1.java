/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIIIiiiiIIiI
 *  com.xy.a.a.iiIIIiiiiiIII
 *  com.xy.entity.Mount
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiIIIiiiiIIiI;
import com.xy.a.a.iiIIIiiiiiIII;
import com.xy.entity.Mount;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MountJpanel1
extends IiiiIiiiiIiIi {
    private int IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private IiiiIiiiiIiIi[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public MountJpanel1(GameView gameView) {
        super(172, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 743, 519, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " 坐骑 ");
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/38.png", 2, 161 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "坐骑" : (IiiiiiiiIIIII == 1 ? "守护" : ""), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(60 + 102 * IiiiiiiiIIIII, 15, 95, 33);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.ALLATORIxDEMO.setBounds(50, 29, 665, 20);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new IiiiIiiiiIiIi[this.iiIiiiiiiiIii.length];
    }

    public void iiiIiiiiiiIIi() {
    }

    public boolean ALLATORIxDEMO() {
        if (this.IiIIIiiiiIiiI == 0) {
            ((IiIIIiiiiIIiI)this.IiiiiiiiIIIII[0]).IiiIiiiiiiIiI();
        } else {
            if (this.IiIIIiiiiIiiI != 1) return super.ALLATORIxDEMO();
            ((iiIIIiiiiiIII)this.IiiiiiiiIIIII[1]).iiiIiiiiiiIIi();
        }
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public boolean iIiIiiiiIIiii() {
        if (this.IiIIIiiiiIiiI == 0) {
            ((IiIIIiiiiIIiI)this.IiiiiiiiIIIII[0]).iiiIiiiiiiIIi();
            return true;
        }
        if (this.IiIIIiiiiIiiI != 1) return false;
        ((iiIIIiiiiiIII)this.IiiiiiiiIIIII[1]).iIiIiiiiIIiIi();
        return true;
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIIIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIIIiiiiIiiI);
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            if (this.IiiiiiiiIIIII[0] == null) {
                this.IiiiiiiiIIIII[0] = new IiIIIiiiiIIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiiiiiiiIIIII[0]);
            }
            ((IiIIIiiiiIIiI)this.IiiiiiiiIIIII[0]).iiiIiiiiiiIIi();
        } else if (type == 1) {
            if (this.IiiiiiiiIIIII[1] == null) {
                this.IiiiiiiiIIIII[1] = new iiIIIiiiiiIII(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiiiiiiiIIIII[1]);
            }
            ((iiIIIiiiiiIII)this.IiiiiiiiIIIII[1]).IiiIiiiiiiIiI();
        }
        if (this.IiiiiiiiIIIII[type] != null) {
            this.IiiiiiiiIIIII[type].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII] != null && type != IiiiiiiiIIIII) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setVisible(false);
                if (IiiiiiiiIIIII == 0) {
                    ((IiIIIiiiiIIiI)this.IiiiiiiiIIIII[0]).IiiIiiiiiiIiI();
                } else if (IiiiiiiiIIIII == 1) {
                    ((iiIIIiiiiiIII)this.IiiiiiiiIIIII[1]).iiiIiiiiiiIIi();
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean ALLATORIxDEMO(Mount mount) {
        if (this.IiIIIiiiiIiiI != 0) return false;
        ((IiIIIiiiiIIiI)this.IiiiiiiiIIIII[0]).ALLATORIxDEMO(mount);
        return true;
    }
}
