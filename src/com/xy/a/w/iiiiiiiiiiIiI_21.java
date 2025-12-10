/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiIiIiiiiIIiI
 *  com.xy.a.w.IiiiiiiiiIIII
 *  com.xy.a.w.iiIiIiiiiIiii
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiIiIiiiiIIiI;
import com.xy.a.w.IiiiiiiiiIIII;
import com.xy.a.w.iiIiIiiiiIiii;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

public class iiiiiiiiiiIiI
extends IiiiIiiiiIiIi {
    private IiiiIiiiiIiIi[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIiIiiiiIiIII[] ALLATORIxDEMO;

    public iiiiiiiiiiIiI(GameView gameView) {
        super(82, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 602, 425, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6280\u80fd");
        this.ALLATORIxDEMO = new IIiIiiiiIiIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/38.png", 2, 81 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5e08 \u95e8" : (IiiiiiiiIIIII == 1 ? "\u6cd5 \u95e8" : (IiiiiiiiIIIII == 2 ? "\u5929\u6f14\u518c" : "")), (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(60 + 102 * IiiiiiiiIIIII, 26, 95, 33);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(38, 40, this.getWidth() - 62, 20);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiIIIiiiiIiiI = new IiiiIiiiiIiIi[3];
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi(int type) {
        if (this.IiiiiiiiIIIII != type) {
            return;
        }
        if (this.IiiiiiiiIIIII == 0) {
            ((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI[0]).iiiIiiiiiiIIi();
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            ((IiiiiiiiiIIII)this.IiIIIiiiiIiiI[1]).iiiIiiiiiiIIi();
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        ((iiIiIiiiiIiii)this.IiIIIiiiiIiiI[2]).iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(int width, int height) {
        if (width == this.getWidth() && height == this.getHeight()) {
            return;
        }
        int IiiiiiiiIIIII = width - this.getWidth();
        if (IiiiiiiiIIIII != 0) {
            this.IiIiiiiiIIIII.setBounds(this.IiIiiiiiIIIII.getX() + IiiiiiiiIIIII, this.IiIiiiiiIIIII.getY(), this.IiIiiiiiIIIII.getWidth(), this.IiIiiiiiIIIII.getHeight());
        }
        this.iiIiiiiiiiIii.setBounds(38, 40, width - 62, 20);
        this.setBounds(this.getX(), this.getY(), width, height);
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiiiiiiiIIIII = type;
        if (this.IiiiiiiiIIIII == 0) {
            if (this.IiIIIiiiiIiiI[0] == null) {
                this.IiIIIiiiiIiiI[0] = new IiIiIiiiiIIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiIIIiiiiIiiI[0]);
            }
            ((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI[0]).iiiIiiiiiiIIi();
        } else if (this.IiiiiiiiIIIII == 1) {
            if (this.IiIIIiiiiIiiI[1] == null) {
                this.IiIIIiiiiIiiI[1] = new IiiiiiiiiIIII(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiIIIiiiiIiiI[1]);
            }
            ((IiiiiiiiiIIII)this.IiIIIiiiiIiiI[1]).iiiIiiiiiiIIi();
        } else if (this.IiiiiiiiIIIII == 2) {
            if (this.IiIIIiiiiIiiI[2] == null) {
                this.IiIIIiiiiIiiI[2] = new iiIiIiiiiIiii(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiIIIiiiiIiiI[2]);
            }
            ((iiIiIiiiiIiii)this.IiIIIiiiiIiiI[2]).iiiIiiiiiiIIi();
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != this.IiiiiiiiIIIII && this.IiIIIiiiiIiiI[IiiiiiiiIIIII] != null) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
        if (this.IiIIIiiiiIiiI[this.IiiiiiiiIIIII] != null) {
            this.ALLATORIxDEMO(this.IiIIIiiiiIiiI[this.IiiiiiiiIIIII].getWidth(), this.IiIIIiiiiIiiI[this.IiiiiiiiIIIII].getHeight());
            this.IiIIIiiiiIiiI[this.IiiiiiiiIIIII].setVisible(true);
        }
        this.ALLATORIxDEMO(this.IiiiiiiiIIIII == 1 ? "\u6cd5\u95e8" : (this.IiiiiiiiIIIII == 2 ? "\u5929\u6f14\u7b56" : "\u6280\u80fd"));
    }
}
