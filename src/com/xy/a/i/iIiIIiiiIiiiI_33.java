/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIIIiiiIiIii
 *  com.xy.a.i.IIiiIiiiiIIiI
 *  com.xy.a.i.iiIIiiiiIiiII
 *  com.xy.a.i.iiIiIiiiiIiii
 *  com.xy.a.i.iiiiiiiiiiIiI
 *  com.xy.entity.PartJade
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.i;

import com.xy.a.i.IIIIIiiiIiIii;
import com.xy.a.i.IIiiIiiiiIIiI;
import com.xy.a.i.iiIIiiiiIiiII;
import com.xy.a.i.iiIiIiiiiIiii;
import com.xy.a.i.iiiiiiiiiiIiI;
import com.xy.entity.PartJade;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;

public class iIiIIiiiIiiiI
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IiiiIiiiiIiIi[] ALLATORIxDEMO;

    public iIiIIiiiIiiiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 562, 520, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)2, (int)2, (int)2, (int)2, (boolean)false), this.iiiiIiiiIIiii);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(46, 74, 26, 18));
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/61.png", 2, 116 + IiiiiiiiIIIII, com.xy.q.iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u5408 \u6210" : (IiiiiiiiIIIII == 1 ? "\u6d17 \u7ec3" : (IiiiiiiiIIIII == 2 ? "\u5957\u88c5\u5347\u7ea7" : (IiiiiiiiIIIII == 3 ? "\u7389\u7b26\u5347\u7ea7" : (IiiiiiiiIIIII == 4 ? "\u62c6\u89e3\u8f6c\u79fb" : "")))), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setOffsetTexts(com.xy.q.iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(55 + 92 * IiiiiiiiIIIII, 50, 90, 24);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IiiiIiiiiIiIi[5];
    }

    public int iiiIiiiiiiIIi() {
        return this.IiiiiiiiIIIII;
    }

    public iiIIiiiiIiiII ALLATORIxDEMO() {
        return (iiIIiiiiIiiII)this.ALLATORIxDEMO[1];
    }

    public void ALLATORIxDEMO(PartJade jade) {
        if (this.IiiiiiiiIIIII == 0 && this.ALLATORIxDEMO[0] != null) {
            iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)this.ALLATORIxDEMO[0];
            IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(jade);
            return;
        }
        if (this.IiiiiiiiIIIII != 3) return;
        if (this.ALLATORIxDEMO[3] == null) return;
        iiiiiiiiiiIiI IiiiiiiiIIIII = (iiiiiiiiiiIiI)this.ALLATORIxDEMO[3];
        IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(jade);
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiiiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            if (this.ALLATORIxDEMO[type] == null) {
                this.ALLATORIxDEMO[type] = new iiIiIiiiiIiii(this.iiIIiiiiIiIIi);
                this.add((Component)this.ALLATORIxDEMO[type]);
            }
            ((iiIiIiiiiIiii)this.ALLATORIxDEMO[type]).iiiIiiiiiiIIi();
        } else if (type == 1) {
            if (this.ALLATORIxDEMO[type] == null) {
                this.ALLATORIxDEMO[type] = new iiIIiiiiIiiII(this.iiIIiiiiIiIIi);
                this.add((Component)this.ALLATORIxDEMO[type]);
            }
            ((iiIIiiiiIiiII)this.ALLATORIxDEMO[type]).iiiIiiiiiiIIi();
        } else if (type == 2) {
            if (this.ALLATORIxDEMO[type] == null) {
                this.ALLATORIxDEMO[type] = new IIIIIiiiIiIii(this.iiIIiiiiIiIIi);
                this.add((Component)this.ALLATORIxDEMO[type]);
            }
            ((IIIIIiiiIiIii)this.ALLATORIxDEMO[type]).iiiIiiiiiiIIi();
        } else if (type == 3) {
            if (this.ALLATORIxDEMO[type] == null) {
                this.ALLATORIxDEMO[type] = new iiiiiiiiiiIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.ALLATORIxDEMO[type]);
            }
            ((iiiiiiiiiiIiI)this.ALLATORIxDEMO[type]).IiiIiiiiiiIiI();
        } else if (type == 4) {
            if (this.ALLATORIxDEMO[type] == null) {
                this.ALLATORIxDEMO[type] = new IIiiIiiiiIIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.ALLATORIxDEMO[type]);
            }
            ((IIiiIiiiiIIiI)this.ALLATORIxDEMO[type]).iIiIiiiiIIiIi();
        }
        if (this.ALLATORIxDEMO[type] != null) {
            this.ALLATORIxDEMO[type].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (this.ALLATORIxDEMO[IiiiiiiiIIIII] != null && type != IiiiiiiiIIIII) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
