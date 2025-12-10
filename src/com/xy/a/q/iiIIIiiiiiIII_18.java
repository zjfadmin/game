/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiIiiiiIiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Eshop
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iiIiIiiiiIiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Eshop;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iiIIIiiiiiIII
extends IiiiIiiiiIiIi {
    private iiIiIiiiiIiIi[] IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public iiIIIiiiiiIII(GameView gameView) {
        super(51, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 385, 395, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false), null);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)20, (int)9, (int)150, (int)17, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.ALLATORIxDEMO.setHorizontalAlignment(10);
        this.ALLATORIxDEMO.setText("\u5f53\u524d\u5df2\u8bd5\u7a7f\u7269\u54c1");
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = new iiIiIiiiiIiIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiiIiIi((IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(8 + IiiiiiiiIIIII * 125, 27, 115, 150);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(Eshop[] eshops) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO();
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setVisible(false);
        }
        IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < eshops.length) {
            if (eshops[IiiiiiiiIIIII2] != null) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII2].ALLATORIxDEMO(eshops[IiiiiiiiIIIII2], "\u4ed9\u7389");
                if (++IiiiiiiiIIIII >= this.IiiiiiiiIIIII.length) break;
            }
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
