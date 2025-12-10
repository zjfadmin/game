/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIiiIiiiIiiiI
 *  com.xy.a.w.IiiiiiiiiIIII
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.SkillUtil
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.w;

import com.xy.a.w.IIiiIiiiIiiiI;
import com.xy.a.w.IiiiiiiiiIIII;
import com.xy.formula.BaseMeridians;
import com.xy.formula.SkillUtil;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIIiii
extends IIIiiiiiIiIiI {
    private IIiIiiiiIiIII iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private IIiiIiiiIiiiI[] IIiiIiiiIIiIi;
    private boolean iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    final /* synthetic */ IiiiiiiiiIIII iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public IIiIiiiiIIiii(IiiiiiiiiIIII iiiiiiiiiIIII, int index) {
        this.iiIiiiiiiiIii = iiiiiiiiiIIII;
        this.IiiiiiiiIIIII = index;
        this.IiIIIiiiiIiiI = new RichLabel(null, iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiiIiiiiiiII = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)(IiiiiiiiIIIII == 0 ? "#cFBD833" : "#c000000")), (Font)iiIIiiiiIiiII.IiiIIiiiiiiiI);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(0, 13, 170, 26);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(-1, 12, 170, 26);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(1, 14, 170, 26);
            }
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/60.png", (int)76, (int)2, (int)76, (int)2, (boolean)false));
        this.ALLATORIxDEMO.setBounds(4, 43, 160, 7);
        this.add((Component)this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new IIiiIiiiIiiiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIiiIiiiIiiiI(iiiiiiiiiIIII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIiIiiiiIiIII("sc/e/31.png", 1, 92 + index, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u9009 \u5b9a", iiiiiiiiiIIII.ALLATORIxDEMO());
        this.iiiIiiiiiiiIi.setForeground(Color.black);
        this.iiiIiiiiiiiIi.setBounds(45, 260, 79, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
    }

    public void ALLATORIxDEMO(int index, int raceAndSex, int max, BaseMeridians baseMeridians) {
        this.iIiIiiiiIiIii = this.IiiiiiiiIIIII != index && index != -1;
        this.iiiIiiiiiiiIi.setVisible(index == -1);
        int IiiiiiiiIIIII = SkillUtil.getFMIndex((int)raceAndSex, (int)this.IiiiiiiiIIIII);
        this.iIiiIiiiiiiII[0].setText(SkillUtil.getFMType((int)IiiiiiiiIIIII));
        this.iIiiIiiiiiiII[1].setText(this.iIiiIiiiiiiII[0].getText());
        this.iIiiIiiiiiiII[2].setText(this.iIiiIiiiiiiII[0].getText());
        this.IiIIIiiiiIiiI.setTextSize(SkillUtil.getFMMsg((int)IiiiiiiiIIIII), 150);
        this.IiIIIiiiiIiiI.setBounds(14, 52, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
        this.IIiiIiiiIIiIi[0].ALLATORIxDEMO(IiiiiiiiIIIII, baseMeridians != null ? baseMeridians.getExp() : 0, max, this.IiiiiiiiIIIII == index, true);
        this.IIiiIiiiIIiIi[1].ALLATORIxDEMO(IiiiiiiiIIIII, baseMeridians != null ? baseMeridians.getXs() : 0, max, this.IiiiiiiiIIIII == index, false);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (!this.iIiIiiiiIiIii) {
            return;
        }
        if (IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii) == null) {
            IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii, (com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.ALLATORIxDEMO);
        IiiiiiiiIIIII.setColor(Color.BLACK);
        IiiiiiiiiIIII.ALLATORIxDEMO((IiiiiiiiiIIII)this.iiIiiiiiiiIii).ALLATORIxDEMO((Graphics)IiiiiiiiIIIII, this.getWidth(), this.getHeight());
        IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.iIiiIiiiIiIIi);
    }
}
