/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiIIIIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.text.GameView
 */
package com.xy.a;

import com.xy.a.IIIIiiiiIIIIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.text.GameView;
import java.awt.Component;

public class iiiiiiiiIIIII
extends IiiiIiiiiIiIi {
    private IIIIiiiiIIIIi[] ALLATORIxDEMO;

    public iiiiiiiiIIIII(GameView gameView) {
        super(120, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 684, 455, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/b/S277.png");
        this.ALLATORIxDEMO = new IIIIiiiiIIIIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIIiiiiIIIIi(this, IiiiiiiiIIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(29 + 216 * IiiiiiiiIIIII, 38, 192, 378);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
