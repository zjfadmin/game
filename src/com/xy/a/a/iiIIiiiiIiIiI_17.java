/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiIiiiiiiiII
 *  com.xy.a.a.iiIIIiiiiiIII
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIiIiiiiiiiII;
import com.xy.a.a.iiIIIiiiiiIII;
import com.xy.formula.BaseMountSH;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.plaf.ScrollBarUI;

public class iiIIiiiiIiIiI
extends iIiIIiiiIiiiI {
    private RichLabel iiiiIiiiIiiII;
    private RichLabel iiiIiiiiiiiIi;
    private JScrollPane iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private iiIIIiiiiiIII iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIiIiiiiiiiII[] iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public iiIIiiiiIiIiI(iiIIIiiiiiIII form) {
        this.iIiIiiiiIiIii = form;
        this.IiIIIiiiiIiiI = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(328 + 229 * IiiiiiiiIIIII), (int)260, (int)76, (int)19, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCCC09F"), (Font)iiIIiiiiIiiII.IiIiiiiiIiIiI);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7b49\u7ea7\u5c5e\u6027" : (IiiiiiiiIIIII == 1 ? "\u52a0\u6210\u603b\u89c8" : ""));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiiIiiiIiiII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)270, (int)281, (int)205, (int)128, (Component)this.iiiIiiiiiiiIi, (int)-1);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)500, (int)281, (int)205, (int)128, (Component)this.iiiiIiiiIiiII, (int)-1);
        this.IiiiiiiiIIIII.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/168.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 6));
        this.iIiiIiiiiiiII.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/168.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 6));
        this.add(this.IiiiiiiiIIIII);
        this.add(this.iIiiIiiiiiiII);
        this.iiIiiiiiiiIii = new IIiIiiiiiiiII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIiIiiiiiiiII(this, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(310, 121, 115, 115);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(531, 121, 115, 115);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            this.add((Component)IIiIiiiiiiiII.ALLATORIxDEMO((IIiIiiiiiiiII)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]));
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/167.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(264 + IiiiiiiiIIIII * 229, 267, 195, 5);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/164.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(259 + 229 * (IiiiiiiiIIIII - 2), 255, 220, 172);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.setBounds(0, 0, 743, 519);
    }

    static /* synthetic */ iiIIIiiiiiIII ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ int ALLATORIxDEMO(iiIIiiiiIiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int id, RoleData roleData) {
        this.ALLATORIxDEMO = id;
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        PropertyUtil.getMountSHSXString((int)id, (RoleData)roleData, (StringBuffer)IiiiiiiiIIIII, (boolean)false);
        this.iiiIiiiiiiiIi.setTextSize(IiiiiiiiIIIII.toString(), 200);
        this.IiiiiiiiIIIII.getVerticalScrollBar().setMaximum(this.iiiIiiiiiiiIi.getHeight());
        this.IiiiiiiiIIIII.getVerticalScrollBar().setValue(2 + 18 * Math.max(0, roleData.getMountSHByindex(id).getLvl() - 1));
        IiiiiiiiIIIII.setLength(0);
        PropertyUtil.getMountSHSXString((int)id, (RoleData)roleData, (StringBuffer)IiiiiiiiIIIII, (boolean)true);
        this.iiiiIiiiIiiII.setTextSize(IiiiiiiiIIIII.toString(), 200);
        this.iIiiIiiiiiiII.getVerticalScrollBar().setMaximum(this.iiiiIiiiIiiII.getHeight());
        this.iIiiIiiiiiiII.getVerticalScrollBar().setValue(0);
        BaseMountSH IiiiiiiiIIIII2 = roleData.getMountSHByindex(id);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIiiiiiiiIii.length) {
            IIiIiiiiiiiII iIiIiiiiiiiII = this.iiIiiiiiiiIii[IiiiiiiiIIIII3];
            boolean bl = IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getUnlock();
            ++IiiiiiiiIIIII3;
            iIiIiiiiiiiII.ALLATORIxDEMO(bl, IiiiiiiiIIIII2, roleData);
        }
    }
}
