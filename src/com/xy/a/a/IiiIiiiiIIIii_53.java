/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleSummoning
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IiiIiiiiIIIii
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private BigDecimal IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private IiIiIiiiiIIiI[] ALLATORIxDEMO;

    public IiiIiiiiIIIii(GameView gameView) {
        super(47, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 282, 335, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5185\u4e39\u680f");
        this.iiIiiiiiiiIii = new JLabel[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)(53 + IiiiiiiiIIIII * 23), (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5185\u4e39\u540d\u79f0" : (IiiiiiiiIIIII == 1 ? "\u7b49  \u7ea7" : (IiiiiiiiIIIII == 2 ? "\u8f6c\u751f\u6b21\u6570" : (IiiiiiiiIIIII == 3 ? "\u5f53\u524d\u7ecf\u9a8c" : (IiiiiiiiIIIII == 4 ? "\u5347\u7ea7\u7ecf\u9a8c" : "")))));
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(52, 233 + (IiiiiiiiIIIII - 3) * 23, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII.setTextSize("#cFFFFFF\u5b66\u4e60\u4ea4\u6d41#cFF0000\u7ec3\u4e60\u81ea\u5b66#cFFFFFF\u7ec3\u4e60\u81ea\u5b66\u3010\u5b66\u4e60\u4ea4\u6d41\u3011\uff0c\u7ec3\u4e60\u81ea\u5b66\uff1a\u5b66\u4e60\u4ea4\u6d41#c00FF00\u7ec3\u4e60\u81ea\u5b66#cFFFFFF\uff0c\u5b66\u4e60\u4ea4\u6d41#c00FF00\u7ec3\u4e60\u81ea\u5b66\u3001%#cFFFFFF\u5b66\u4e60\u4ea4\u6d41\u3002", 188);
        this.iIiiIiiiiiiII.setBounds(58, 128, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiiiiiiiIIIII < 3 ? new IiIiIiiiiIIiI("sc/e/49.png", 1, 23 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this) : new IiIiIiiiiIIiI("sc/e/26.png", 1, 49 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 3 ? "\u8f6c\u6362\u7ecf\u9a8c" : (IiiiiiiiIIIII == 4 ? "\u5410\u51fa\u5185\u4e39" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII < 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(110 + 30 * IiiiiiiiIIIII, 19, 17, 17);
            } else {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(43 + 112 * (IiiiiiiiIIIII - 3), 285, 99, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new iIIiIiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)132, (int)(53 + IiiiiiiiIIIII * 23), (int)119, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(132, 233 + (IiiiiiiiIIIII - 3) * 23, 119, 19);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/37.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(109 + 31 * IiiiiiiiIIIII, 18, 19, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/60.png", (int)76, (int)2, (int)76, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(46, 36, 210, 7);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(55, 127, 195, 100);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(RoleSummoning roleSummoning) {
        void pet;
        this.ALLATORIxDEMO((RoleSummoning)pet, this.iIiIiiiiIiIii);
    }

    public BigDecimal iIiIiiiiIIiii() {
        return this.IiIIIiiiiIiiI;
    }

    public BigDecimal ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIiIii = 0;
        this.IIiiIiiiIIiIi = null;
        this.IiIIIiiiiIiiI = null;
        this.iIiiIiiiiiiII.setTextSize(null, 188);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII++].setText(null);
        }
    }

    public void ALLATORIxDEMO(RoleSummoning pet, int path) {
        if (pet == null) {
            this.iiiIiiiiiiIIi();
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        BigDecimal IiiiiiiiIIIII = null;
        this.IiiiiiiiIIIII[0].setBounds(109 + 30 * path, 18, 19, 19);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 3) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII2++].setVisible(false);
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)pet.getInnerGoods())) {
            this.iiiIiiiiiiIIi();
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        Goodstable IiiiiiiiIIIII22 = pet.getInnerGoods().split("\\|");
        path = Math.min(path, ((String[])IiiiiiiiIIIII22).length - 1);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < ((String[])IiiiiiiiIIIII22).length && IiiiiiiiIIIII3 < 3) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII3].setVisible(true);
            if (IiiiiiiiIIIII3 == path) {
                IiiiiiiiIIIII = new BigDecimal((String)IiiiiiiiIIIII22[IiiiiiiiIIIII3]);
            }
            ++IiiiiiiiIIIII3;
        }
        this.iIiIiiiiIiIii = path;
        this.IIiiIiiiIIiIi = pet.getSid();
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII;
        IiiiiiiiIIIII22 = this.ALLATORIxDEMO().getGoodEquip(IiiiiiiiIIIII);
        IiiIiiiiIIIii iiiIiiiiIIIii = this;
        if (IiiiiiiiIIIII22 != null) {
            iiiIiiiiIIIii.iiiIiiiiiiiIi[0].setText(IiiiiiiiIIIII22.getGoodsname());
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII22.getValue().split("\\|");
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4[2].split("\\=");
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5[1].split("\\\u8f6c");
            String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII4[3].split("\\=");
            this.iiiIiiiiiiiIi[1].setText(String.valueOf(IiiiiiiiIIIII5[1]) + "\u7ea7");
            this.iiiIiiiiiiiIi[2].setText(IiiiiiiiIIIII6[0]);
            this.iiiIiiiiiiiIi[3].setText(IiiiiiiiIIIII7[1]);
            this.iiiIiiiiiiiIi[4].setText(String.valueOf(this.ALLATORIxDEMO().iIiIiiiiIIiii(Integer.parseInt(IiiiiiiiIIIII6[0]), Integer.parseInt(IiiiiiiiIIIII6[1]) + 1)));
            String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII4[0].split("\\=")[1].split("\\:");
            this.iIiiIiiiiiiII.setTextSize(IiiiiiiiIIIII8[1], 188);
            if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
            this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
            return;
        }
        iiiIiiiiIIIii.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }
}
