/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIIiiiIiiIi
extends iIiIIiiiIiiiI {
    private JLabel iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)0, (int)179, (int)30, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c7D6120"), (Font)iiIIiiiiIiiII.iiiIIiiiIiiII);
    private IIIiiiiiIiIiI IiiiiiiiIIIII;
    final /* synthetic */ iIiIiiiiIiIII ALLATORIxDEMO;

    public void ALLATORIxDEMO(int place, int height) {
        this.iiIiiiiiiiIii.setText(place == 8 ? "冠军" : (place == 7 ? "亚军" : (place == 6 ? "季军" : (place == 5 ? "殿军" : (place == 4 ? "四强晋级名单" : (place == 3 ? "八强晋级名单" : (place == 2 ? "十六强晋级名单" : "三十二强晋级名单")))))));
        this.setBounds(123, height, 289, 30);
    }

    public iIIIIiiiIiiIi(iIiIiiiiIiIII iIiIiiiiIiIII2) {
        this.ALLATORIxDEMO = iIiIiiiiIiIII2;
        this.iiIiiiiiiiIii.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI("sc/d/103.png");
        this.IiiiiiiiIIIII.setBounds(0, 10, 289, 11);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.IiiiiiiiIIIII);
    }
}
