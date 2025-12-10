/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.iIiIIiiiIiiiI
 *  com.xy.a.q.IIIIIiiiIIIiI
 *  com.xy.entity.PartJade
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.i.iIiIIiiiIiiiI;
import com.xy.a.q.IIIIIiiiIIIiI;
import com.xy.entity.PartJade;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiIii
extends IiiiIiiiiIiIi {
    private IIIIIiiiIIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private iIiIIiiiIiiiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    private IiiiiiiiiIIII[] ALLATORIxDEMO;

    public IIIIIiiiIIIiI ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public iIiIIiiiIiiiI ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIIIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIIIiiiiIiiI);
            ++IiiiiiiiIIIII;
        }
        if (type == 0 || type == 1 || type == 2) {
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = new IIIIIiiiIIIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.iIiIiiiiIiIii);
            }
            this.iIiIiiiiIiIii.iIiIiiiiIIiii(type);
            this.iIiIiiiiIiIii.setVisible(true);
            if (this.iiIiiiiiiiIii == null) return;
            this.iiIiiiiiiiIii.setVisible(false);
            return;
        }
        if (type != 3) return;
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new iIiIIiiiIiiiI(this.iiIIiiiiIiIIi);
            this.add((Component)this.iiIiiiiiiiIii);
        }
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(0);
        this.iiIiiiiiiiIii.setVisible(true);
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.setVisible(false);
    }

    public int iiiIiiiiiiIIi() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(PartJade jade) {
        if (this.IiIIIiiiiIiiI != 3) return;
        if (this.iiIiiiiiiiIii == null) {
            return;
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(jade);
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public IIIIIiiiIiIii(GameView gameView) {
        super(61, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 562, 520, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4f5c\u574a\u70bc\u5316");
        this.ALLATORIxDEMO = new IiiiiiiiiIIII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/38.png", 2, 111 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u70bc\u5316\u88c5\u5907" : (IiiiiiiiIIIII == 1 ? "\u70bc\u5316\u914d\u9970" : (IiiiiiiiIIIII == 2 ? "\u70bc \u5668" : (IiiiiiiiIIIII == 3 ? "\u5957\u88c5\u5408\u6210" : ""))), (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(58 + 102 * IiiiiiiiIIIII, 16, 95, 33);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IiiiiiiiIIIII.setBounds(38, 30, 500, 20);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
