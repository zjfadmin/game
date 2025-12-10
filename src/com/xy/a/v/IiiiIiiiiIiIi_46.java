/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IIIiiiiiIiIiI
 *  com.xy.a.v.iiIIiiiiIiiII
 *  com.xy.a.v.iiiiiiiiiiIiI
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.IIIiiiiiIiIiI;
import com.xy.a.v.iiIIiiiiIiiII;
import com.xy.a.v.iiiiiiiiiiIiI;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;

public class IiiiIiiiiIiIi
extends com.xy.q.IiiiIiiiiIiIi {
    private com.xy.w.IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private com.xy.q.IiiiIiiiiIiIi[] IiiiiiiiIIIII;
    private iiIiIiiiIIIiI[] ALLATORIxDEMO;

    public IiiiIiiiiIiIi(GameView gameView) {
        super(186, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 703, 542, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u9753 \u53f7 ");
        this.ALLATORIxDEMO = new iiIiIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiIIIiI("sc/e/38.png", 2, 171 + IiiiiiiiIIIII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiiIIIi, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u9009\u9753\u53f7" : (IiiiiiiiIIIII == 1 ? "\u62a2\u9753\u53f7" : (IiiiiiiiIIIII == 2 ? "\u9753\u53f7\u4fe1\u7b4f" : "")), (com.xy.q.IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setOffsetTexts(com.xy.q.iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(60 + 102 * IiiiiiiiIIIII, 18, 95, 33);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(36, 33, 638, 20);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiiiiiiiIIIII = new com.xy.q.IiiiIiiiiIiIi[this.ALLATORIxDEMO.length];
    }

    public void iIiIiiiiIIiii(int type) {
        if (type == 2) {
            this.ALLATORIxDEMO(type, null);
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("V" + type));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(int type, Object data) {
        this.iiIiiiiiiiIii = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setKeep(type == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            if (this.IiiiiiiiIIIII[0] == null) {
                this.IiiiiiiiIIIII[0] = new iiIIiiiiIiiII(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiiiiiiiIIIII[0], 0);
            }
            ((iiIIiiiiIiiII)this.IiiiiiiiIIIII[0]).ALLATORIxDEMO((int[])data);
        } else if (type == 1) {
            if (this.IiiiiiiiIIIII[1] == null) {
                this.IiiiiiiiIIIII[1] = new iiiiiiiiiiIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiiiiiiiIIIII[1], 0);
            }
            ((iiiiiiiiiiIiI)this.IiiiiiiiIIIII[1]).ALLATORIxDEMO((int[])data);
        } else if (type == 2) {
            if (this.IiiiiiiiIIIII[2] == null) {
                this.IiiiiiiiIIIII[2] = new IIIiiiiiIiIiI(this.iiIIiiiiIiIIi);
                this.add((Component)this.IiiiiiiiIIIII[2], 0);
            }
            ((IIIiiiiiIiIiI)this.IiiiiiiiIIIII[2]).iiiIiiiiiiIIi();
        }
        if (this.IiiiiiiiIIIII[type] != null) {
            this.IiiiiiiiIIIII[type].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII] != null && type != IiiiiiiiIIIII) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIiiiiiiiIii != 1) return;
        if (this.IiiiiiiiIIIII[1] == null) {
            return;
        }
        ((iiiiiiiiiiIiI)this.IiiiiiiiIIIII[1]).iiiIiiiiiiIIi();
    }
}
