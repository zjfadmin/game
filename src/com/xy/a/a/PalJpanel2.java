/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.PalJpanel1
 *  com.xy.entity.Pal
 *  com.xy.formula.BaseValue
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.PalData
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.a.a.PalJpanel1;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.PalData;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
public static class IiIIIiiiIIiII
extends JComponent {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private iIIiIiiiIiiIi[] iIiIiiiiIiIii;
    public IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii = new IiIiIiiiiIIiI[6];
    private JLabel[] IiiiiiiiIIIII;
    final /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO;

    public void ALLATORIxDEMO(Pal pal, PalData palData) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO.ALLATORIxDEMO();
        String IiiiiiiiIIIII2 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getLoginResult().getGrade());
        int[] IiiiiiiiIIIII3 = PetProperty.getPalHMASp((Pal)pal, (PalData)palData, (RoleData)IiiiiiiiIIIII);
        this.iIiIiiiiIiIii[0].setText(palData.getName());
        this.iIiIiiiiIiIii[1].setText(palData.getTrait());
        this.iIiIiiiiIiIii[2].setText(String.valueOf(IiiiiiiiIIIII2) + "\u7ea7");
        this.iIiIiiiiIiIii[3].setForeground(BaseValue.getPalLvlColor((double)(pal == null ? 0.0 : pal.getGrow())));
        this.iIiIiiiiIiIii[3].setText(BaseValue.getPalLvl((double)(pal == null ? 0.0 : pal.getGrow())));
        this.iIiIiiiiIiIii[4].setText(String.valueOf(IiiiiiiiIIIII3[0]));
        this.iIiIiiiiIiIii[5].setText(String.valueOf(IiiiiiiiIIIII3[1]));
        this.iIiIiiiiIiIii[6].setText(String.valueOf(IiiiiiiiIIIII3[2]));
        this.iIiIiiiiIiIii[7].setText(String.valueOf(IiiiiiiiIIIII3[3]));
        this.IiIIIiiiiIiiI = this.IiIIIiiiiIiiI == null ? iiiiiiiiiiIiI.ALLATORIxDEMO((String)palData.getSkin(), (int)7, (int)1, null) : iiiiiiiiiiIiI.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI, (int)1, (String)palData.getSkin());
        int IiiiiiiiIIIII4 = this.ALLATORIxDEMO.ALLATORIxDEMO(pal != null ? pal.getId() : null, IiiiiiiiIIIII.getLoginResult().getPals());
        this.ALLATORIxDEMO(IiiiiiiiIIIII4);
        this.ALLATORIxDEMO(false);
    }

    static /* synthetic */ IiIiIiiiiIIiI[] ALLATORIxDEMO(PalJpanel2 arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public boolean ALLATORIxDEMO() {
        if (!this.iiIiiiiiiiIii[2].isVisible()) return false;
        this.ALLATORIxDEMO(false);
        return true;
    }

    public IiIIIiiiIIiII(iiIiIiiiiIiIi iiIiIiiiiIiIi2) {
        this.ALLATORIxDEMO = iiIiIiiiiIiIi2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/7.png", 1, 123 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u8c03\u6574" : (IiiiiiiiIIIII == 1 ? "\u6297\u6027" : ""), iiIiIiiiiIiIi2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(224 + IiiiiiiiIIIII * 79, 325, 59, 25);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(224, 225 + (IiiiiiiiIIIII - 2) * 25, 59, 25);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)380, (int)(82 + 28 * IiiiiiiiIIIII), (int)45, (int)19, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u540d\u5b57" : (IiiiiiiiIIIII == 1 ? "\u95e8\u6d3e" : (IiiiiiiiIIIII == 2 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 3 ? "\u8d44\u8d28" : (IiiiiiiiIIIII == 4 ? "\u6c14\u8840" : (IiiiiiiiIIIII == 5 ? "\u6cd5\u529b" : (IiiiiiiiIIIII == 6 ? "\u653b\u51fb" : (IiiiiiiiIIIII == 7 ? "\u901f\u5ea6" : ""))))))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new iIIiIiiiIiiIi[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)425, (int)(82 + 28 * IiiiiiiiIIIII), (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(205, 70, 175, 244);
        this.add((Component)this.IIiiIiiiIIiIi);
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(IiIIIiiiIIiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, 285, 270, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void ALLATORIxDEMO(int state) {
        if (state == 0) {
            this.iiIiiiiiiiIii[0].setText("\u53c2\u6218");
            return;
        }
        if (state > 0) {
            this.iiIiiiiiiiIii[0].setText("\u8c03\u6574");
            return;
        }
        this.iiIiiiiiiiIii[0].setText("\u6fc0\u6d3b");
    }

    public void ALLATORIxDEMO(boolean type) {
        int IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].setVisible(type);
        }
    }
}
