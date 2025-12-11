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
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.iiiiiiiiiiIiI;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiIiiiiIIiI
extends iIiIIiiiIiiiI {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private iiIiIiiiIIIiI iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    final /* synthetic */ iiiiiiiiiiIiI IiiiiiiiIIIII;
    private iiIiIiiiIIIiI ALLATORIxDEMO;

    public IIiiIiiiiIIiI(iiiiiiiiiiIiI iiiiiiiiiiIiI2, int index, iiiiiiiiiiIiI beauBuy2View) {
        this.IiiiiiiiIIIII = iiiiiiiiiiIiI2;
        this.iIiIiiiiIiIii = new iiIiIiiiIIIiI("sc/e/190.png", 1, 194, iiIIiiiiIiiII.IIiiiiiiiIIIi, null, "预览", (IiiiIiiiiIiIi)beauBuy2View);
        this.ALLATORIxDEMO = new iiIiIiiiIIIiI("sc/e/187.png", 1, 195, iiIIiiiiIiiII.IIiiiiiiiIIIi, null, "竞拍", (IiiiIiiiiIiIi)beauBuy2View);
        this.iIiIiiiiIiIii.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cB58754"));
        this.iIiIiiiiIiIii.setBounds(170, 43, 49, 24);
        this.ALLATORIxDEMO.setBounds(228, 38, 67, 35);
        this.iIiIiiiiIiIii.iIiIiiiiIIiii(index);
        this.ALLATORIxDEMO.iIiIiiiiIIiii(index);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new JLabel[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)22, (int)18, (int)200, (int)24, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c484333"), (Font)iiIIiiiiIiiII.IIiiIiiiIiiii);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)23, (int)56, (int)70, (int)16, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)23, (int)79, (int)70, (int)16, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)86, (int)56, (int)80, (int)16, (Color)Color.red, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)86, (int)79, (int)80, (int)16, (Color)Color.red, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            }
            this.IiLIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 1 ? "预购数:" : (IiiiiiiiIIIII == 2 ? "竞拍价:" : ""));
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI("sc/d/199.png");
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/197.png", (int)10, (int)10, (int)10, (int)10, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(288, 20, 24, 70);
        this.IIiiIiiiIIiIi.setBounds(0, 0, 312, 110);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.IIiiIiiiIIiIi);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int n, int n2, int n3) {
        void money;
        void num;
        void beau;
        this.iIiIiiiiIiIii.iIiIiiiiIIiii((int)beau);
        this.ALLATORIxDEMO.iIiIiiiiIIiii((int)beau);
        this.IiIIIiiiiIiiI[0].setText(String.valueOf((int)beau));
        this.IiIIIiiiiIiiI[3].setText(String.valueOf((int)num));
        this.IiIIIiiiiIiiI[4].setText(String.valueOf((int)money));
        this.setVisible(beau != false);
    }
}
