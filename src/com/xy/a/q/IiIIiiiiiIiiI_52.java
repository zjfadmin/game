/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIIiiiiIiiI
 *  com.xy.a.q.IiIIiiiiiiiII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiIIiiiiIiiI;
import com.xy.a.q.IiIIiiiiiiiII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiiiiiIiiI
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIiIIiiiiIiiI iIiIiiiiIiIii;
    private IiIIiiiiiiiII IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private IIIIIiiiIIIiI[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO = -1;

    public IiIIiiiiiIiiI(GameView gameView) {
        super(133, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 622, 462, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u804c\u4e1a");
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/38.png", 2, 301 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(66 + 82 * IiiiiiiiIIIII, 16, 79, 33);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u751f \u4ea7" : (IiiiiiiiIIIII == 1 ? "\u6211\u8981\u4e70" : (IiiiiiiiIIIII == 2 ? "\u6211\u8981\u5356" : "")));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/e/28.png", 1, 304, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u5207\u6362\u526f\u804c\u4e1a", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(508, 26, 68, 18);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(32, 30, 574, 20);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIiIIiiiiIiiI(gameView);
        this.add((Component)this.iIiIiiiiIiIii, 0);
        this.IiIIIiiiiIiiI = new IiIIiiiiiiiII(gameView);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi(0);
        super.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(IiIIiiiiiiiII view2) {
        this.IiIIIiiiiIiiI = view2;
    }

    public void ALLATORIxDEMO(IIiIIiiiiIiiI view1) {
        this.iIiIiiiiIiIii = view1;
    }

    public void iIiIiiiiIIiIi(int menuType) {
        this.ALLATORIxDEMO = menuType;
    }

    public void iiiIiiiiiiIIi(int type) {
        this.ALLATORIxDEMO = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.ALLATORIxDEMO);
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiii(type);
        this.iIiIiiiiIiIii.setVisible(type == 0);
        this.IiIIIiiiiIiiI.setVisible(type == 1 || type == 2);
    }

    public int iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO != 0) return super.ALLATORIxDEMO();
        if (this.iIiIiiiiIiIii.iiiIiiiiiiIIi()) return super.ALLATORIxDEMO();
        return false;
    }

    public void iIiIiiiiIIiii(int type) {
        if (type == -1) {
            type = this.ALLATORIxDEMO;
        }
        if (type != this.ALLATORIxDEMO) {
            return;
        }
        if (this.ALLATORIxDEMO == 0) {
            this.iIiIiiiiIiIii.iiiIiiiiiiIIi(0);
            return;
        }
        if (this.ALLATORIxDEMO != 1) {
            if (this.ALLATORIxDEMO != 2) return;
        }
        this.IiIIIiiiiIiiI.iIiIiiiiIIiIi(this.ALLATORIxDEMO);
    }

    public IIiIIiiiiIiiI ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public IiIIiiiiiiiII ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }
}
