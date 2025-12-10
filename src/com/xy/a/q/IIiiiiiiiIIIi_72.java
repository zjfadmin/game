/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiiiIii
 *  com.xy.a.q.IiIIIiiiIIiIi
 *  com.xy.a.q.iiiIiiiiIiIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RolePet
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Buff
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiiiIii;
import com.xy.a.q.IiIIIiiiIIiIi;
import com.xy.a.q.iiiIiiiiIiIiI;
import com.xy.entity.RoleSummoning;
import com.xy.game.RolePet;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Buff;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiiiiiiIIIi
extends JComponent {
    final /* synthetic */ IIiiiiiiiiIii iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private IIiiiiiiiIIIi IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(RolePet rolePet) {
        RoleSummoning IiiiiiiiIIIII = rolePet != null ? rolePet.getPet() : null;
        Buff IiiiiiiiIIIII2 = rolePet != null && rolePet.getBb1() != 0 ? this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(rolePet.getBb1()) : null;
        Buff IiiiiiiiIIIII3 = rolePet != null && rolePet.getBb2() != 0 ? this.iIiIiiiiIiIii.ALLATORIxDEMO().ALLATORIxDEMO(rolePet.getBb2()) : null;
        this.ALLATORIxDEMO[0].ALLATORIxDEMO(IiiiiiiiIIIII != null ? 21 : 0, (Object)IiiiiiiiIIIII);
        this.ALLATORIxDEMO[1].ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? 17 : 0, (Object)IiiiiiiiIIIII2);
        this.ALLATORIxDEMO[2].ALLATORIxDEMO(IiiiiiiiIIIII3 != null ? 17 : 0, (Object)IiiiiiiiIIIII3);
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII4++].setVisible(true);
        }
        this.iiIiiiiiiiIii[1].setText(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getbName() : "\u9526\u56ca1");
        this.iiIiiiiiiiIii[2].setText(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getbName() : "\u9526\u56ca2");
        this.iiIiiiiiiiIii[3].setVisible(IiiiiiiiIIIII2 == null);
        this.iiIiiiiiiiIii[4].setVisible(IiiiiiiiIIIII2 == null);
    }

    static /* synthetic */ IIiiiiiiiIIIi ALLATORIxDEMO(IIiiiiiiiIIIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ IIiiiiiiiiIii ALLATORIxDEMO(IIiiiiiiiIIIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiiiiiiiIIIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(IIiiiiiiiIIIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public IIiiiiiiiIIIi(IIiiiiiiiiIii iIiiiiiiiiIii, int index) {
        this.iIiIiiiiIiIii = iIiiiiiiiiIii;
        this.IiIIIiiiiIiiI = index;
        this.IiiiiiiiIIIII = this;
        this.iiIiiiiiiiIii = new JLabel[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Color)Color.black, (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.iIIiiiiiiIIII));
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(index == 0 ? "\u7b2c1\u51fa\u573a" : (index == 1 ? "\u7b2c2\u51fa\u573a" : (index == 2 ? "\u7b2c3\u51fa\u573a" : "\u652f\u63f4\u4e0a\u9635")));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(0, 0, 140, 17);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText("\u9526\u56ca" + IiiiiiiiIIIII);
                if (IiiiiiiiIIIII == 1) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(62, 17, 41, 16);
                } else {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(102, 17, 41, 16);
                }
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.gray);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 3 ? "\u6dfb \u52a0" : "\u9526 \u56ca");
                if (IiiiiiiiIIIII == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(62, 36, 41, 16);
                } else {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(62, 56, 41, 16);
                }
            }
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI(iIiiiiiiiiIii.ALLATORIxDEMO());
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIiiiiiIiIiI.ALLATORIxDEMO);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(4, 18, 59, 57);
            } else {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiiiiiiiIIIII == 1 ? new iiiIiiiiIiIiI(this, iIiiiiiiiiIii.ALLATORIxDEMO()) : new IiIIIiiiIIiIi(this, iIiiiiiiiiIii.ALLATORIxDEMO());
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIiiiiiIiIiI.IiiiIiiiIiIII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                if (IiiiiiiiIIIII == 1) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(62, 34, 41, 41);
                } else {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(102, 34, 41, 41);
                }
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }
}
