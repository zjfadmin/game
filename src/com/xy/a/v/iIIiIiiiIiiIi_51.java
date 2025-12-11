/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIiIiiiiIIiI
 *  com.xy.a.v.iiIIiiiiIiIiI
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIIiIiiiiIIiI;
import com.xy.a.v.iiIIiiiiIiIiI;
import com.xy.formula.ActivityMenuSet2;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Graphics;

public class iIIiIiiiIiiIi
extends IiiiIiiiiIiIi {
    private iiIIiiiiIiIiI IIiiIiiiIIiIi;
    private iiIiIiiiIIIiI[] iIiIiiiiIiIii;
    private Activity IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiIiiiiIIiI ALLATORIxDEMO;

    private /* synthetic */ void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.iIiIiiiiIiIii != null ? this.iIiIiiiiIiIii.length : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            this.remove((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        ActivityMenuSet2[] IiiiiiiiIIIII22 = this.IiIIIiiiiIiiI.getMenuSet2s();
        this.iIiIiiiiIiIii = new iiIiIiiiIIIiI[IiiiiiiiIIIII22.length];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            ActivityMenuSet2 IiiiiiiiIIIII3 = IiiiiiiiIIIII22[IiiiiiiiIIIII2];
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2] = new iiIiIiiiIIIiI("sc/e/38.png", 2, 32, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII3.getKey(), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2].iIiIiiiiIIiii(IiiiiiiiIIIII2);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII2].setBounds(67 + 97 * IiiiiiiiIIIII2, 31, 95, 33);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII2++]);
        }
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public iIIiIiiiIiiIi(GameView gameView) {
        super(168, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 483, 526, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "限时活动");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 8, 0, 0));
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(34, 46, 428, 20);
    }

    public void ALLATORIxDEMO(Activity activity) {
        if (activity == null) {
            return;
        }
        boolean IiiiiiiiIIIII = this.IiIIIiiiiIiiI != activity;
        this.IiIIIiiiiIiiI = activity;
        if (IiiiiiiiIIIII) {
            this.IiiIiiiiiiIiI();
        }
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        if (this.ALLATORIxDEMO == null) return;
        if (!this.ALLATORIxDEMO.isVisible()) return;
        this.ALLATORIxDEMO.ALLATORIxDEMO((int)imgGrid.ALLATORIxDEMO());
    }

    public void iIiIiiiiIIiIi() {
        this.iiiiIiiiIiiII = true;
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiii(int key) {
        this.IiiiiiiiIIIII = key;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setKeep(key == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        ActivityMenuSet2 IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.getMenuSet2s()[key];
        if (IiiiiiiiIIIII2.getId() == 1) {
            if (this.IIiiIiiiIIiIi == null) {
                this.IIiiIiiiIIiIi = new iiIIiiiiIiIiI((IiiiIiiiiIiIi)this);
                this.add((Component)this.IIiiIiiiIIiIi, 0);
            }
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(this.IiIIIiiiiIiiI, IiiiiiiiIIIII2);
            this.IIiiIiiiIIiIi.setVisible(true);
            if (this.ALLATORIxDEMO == null) return;
            this.ALLATORIxDEMO.setVisible(false);
            return;
        }
        if (IiiiiiiiIIIII2.getId() != 2) return;
        if (this.ALLATORIxDEMO == null) {
            this.ALLATORIxDEMO = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this);
            this.add((Component)this.ALLATORIxDEMO, 0);
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(this.IiIIIiiiiIiiI, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO.setVisible(true);
        if (this.IIiiIiiiIIiIi == null) return;
        this.IIiiIiiiIIiIi.setVisible(false);
    }

    public void paint(Graphics g) {
        if (this.iiiiIiiiIiiII) {
            this.iIiIiiiiIIiii(this.IiiiiiiiIIIII);
        }
        super.paint(g);
    }
}
