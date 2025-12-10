/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiiIiiiiIiiiI
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiiIiiiiIiiiI;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;

public class iIiIiiiiIiIiI
extends IiiiIiiiiIiIi {
    private iiiIiiiiIiiiI IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public iIiIiiiiIiIiI(GameView gameView) {
        super(55, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 411, 401, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5178\u5f53");
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.ALLATORIxDEMO.setBounds(51, 22, 310, 359);
        this.add((Component)this.ALLATORIxDEMO);
        IIiiIiiiIiiiI[] IiiiiiiiIIIII = new IIiiIiiiIiiiI[10];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII[IiiiiiiiIIIII2] = new IIiiIiiiIiiiI(null, 2, IiiiiiiiIIIII2);
            IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(360, 28 + IiiiiiiiIIIII2 * 35, 36, 33);
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/e/8.png");
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/e/9.png");
            } else if (IiiiiiiiIIIII2 == 2) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/e/10.png");
            } else if (IiiiiiiiIIIII2 == 3) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/e/11.png");
            } else if (IiiiiiiiIIIII2 == 4) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/e/12.png");
            } else if (IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/b/6.png");
            } else if (IiiiiiiiIIIII2 == 6) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/b/7.png");
            } else if (IiiiiiiiIIIII2 == 7) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/b/8.png");
            } else if (IiiiiiiiIIIII2 == 8) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/b/9.png");
            } else if (IiiiiiiiIIIII2 == 9) {
                IiiiiiiiIIIII[IiiiiiiiIIIII2].setImage("sc/b/10.png");
            }
            this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII2++]);
        }
        this.IiiiiiiiIIIII = new iiiIiiiiIiiiI((IiiiIiiiiIiIi)this, 6, 7, 51, 51, 0, 0, 52, 24);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII, 0);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
