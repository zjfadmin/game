/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.iiiiiiiiiiIiI
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.iiiiiiiiiiIiI;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIiIIiiiIiiiI
extends com.xy.q.iIiIIiiiIiiiI {
    private iiIiIiiiIIIiI iiIiiiiiiiIii;
    final /* synthetic */ iiiiiiiiiiIiI IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(int beau, int zhi, int money) {
        this.ALLATORIxDEMO[0].setText(String.valueOf(Math.abs(beau)));
        this.ALLATORIxDEMO[1].setText(String.valueOf(money));
        if (zhi == 2) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(198);
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(beau);
            this.iiIiiiiiiiIii.setText("\u9886\u53d6");
            this.ALLATORIxDEMO[2].setText(String.valueOf("\u4e2d\u6807"));
        } else if (zhi == 1 && (beau < 0 || iiiiiiiiiiIiI.ALLATORIxDEMO((iiiiiiiiiiIiI)this.IiiiiiiiIIIII) == 2)) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(197);
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(beau);
            this.iiIiiiiiiiIii.setText("\u9000\u6b3e");
            this.ALLATORIxDEMO[2].setText(String.valueOf("\u672a\u4e2d\u6807"));
        } else {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(196);
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(beau);
            this.iiIiiiiiiiIii.setText("\u6094\u62cd");
            this.ALLATORIxDEMO[2].setText(String.valueOf("\u7ade\u62cd\u4e2d"));
        }
        this.setVisible(beau != 0);
    }

    public iIiIIiiiIiiiI(iiiiiiiiiiIiI iiiiiiiiiiIiI2, int index, iiiiiiiiiiIiI beauBuy2View) {
        this.IiiiiiiiIIIII = iiiiiiiiiiIiI2;
        this.iiIiiiiiiiIii = new iiIiIiiiIIIiI("sc/e/191.png", 1, 196, iiIIiiiiIiiII.IIiiiiiiiIIIi, null, "\u6094\u62cd", (IiiiIiiiiIiIi)beauBuy2View);
        this.iiIiiiiiiiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cB58754"));
        this.iiIiiiiiiiIii.setBounds(512, 0, 79, 24);
        this.add((Component)this.iiIiiiiiiiIii);
        this.ALLATORIxDEMO = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)7, (int)0, (int)150, (int)24, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c86745C"), (Font)iiIIiiiiIiiII.IIiiIiiiIiiii);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)170, (int)0, (int)150, (int)24, (Color)Color.red, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)326, (int)0, (int)150, (int)24, (Color)Color.red, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            }
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
