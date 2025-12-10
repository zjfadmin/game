/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIiiiiiIiIii
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.q.IiIiiiiiIiIii;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.text.GameView;
import java.awt.Component;

public class IiiiIiiiiIiIi
extends com.xy.q.IiiiIiiiiIiIi {
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private IIIIIiiiIIIiI IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int id) {
        if (id == 141) {
            IiIiiiiiIiIii IiiiiiiiIIIII = (IiIiiiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(103);
            IiiiiiiiIIIII.iIiIiiiiIIiii(1);
            return;
        }
        if (id == 142) {
            IiIiiiiiIiIii IiiiiiiiIIIII = (IiIiiiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(103);
            IiiiiiiiIIIII.iIiIiiiiIIiii(2);
            return;
        }
        if (id != 143) return;
        IiiIiiiiIIIii.ALLATORIxDEMO((int)130, (GameView)this.iiIIiiiiIiIIi);
    }

    public IiiiIiiiiIiIi(GameView gameView) {
        super(129, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 709, 425, com.xy.q.IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S307.png");
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI("sc/b/B396.png", 1, 141, (com.xy.q.IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/b/B397.png", 1, 142, (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/b/B398.png", 1, 143, (com.xy.q.IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(224, 295, 88, 20);
        this.iiIiiiiiiiIii.setBounds(345, 295, 88, 20);
        this.ALLATORIxDEMO.setBounds(466, 295, 88, 20);
        this.add((Component)this.IiiiiiiiIIIII);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
    }
}
