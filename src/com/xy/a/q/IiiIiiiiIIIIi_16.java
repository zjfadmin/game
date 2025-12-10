/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiIiiiiIiIi
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.q;

import com.xy.a.q.iiIiIiiiiIiIi;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Eshop;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;

public class IiiIiiiiIIIIi
extends IiiiIiiiiIiIi {
    private int iiiiIiiiIiiII;
    private IiiiiiiiiIIII[] iiiIiiiiiiiIi;
    private IiiiiiiiiIIII[] iIiiIiiiiiiII;
    private com.xy.q.iiIiIiiiiIiIi[] IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 1;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = 1;
    private iiIiIiiiiIiIi[] ALLATORIxDEMO;

    public int iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        String IiiiiiiiIIIII2 = String.valueOf(this.iiiiIiiiIiiII);
        List IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.size()) {
            if (((Eshop)IiiiiiiiIIIII3.get(IiiiiiiiIIIII4)).getEshoptype().equals(IiiiiiiiIIIII2)) {
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi(int page) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO();
            this.ALLATORIxDEMO[IiiiiiiiIIIII++].setVisible(false);
        }
        if (page <= 0) {
            page = 1;
        } else if (page >= this.IiIIIiiiiIiiI) {
            page = this.IiIIIiiiiIiiI;
        }
        this.IiiiiiiiIIIII = page;
        this.iiIiiiiiiiIii.setText(String.valueOf(this.IiiiiiiiIIIII) + "/" + this.IiIIIiiiiIiiI);
        IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = (page - 1) * 10;
        String IiiiiiiiIIIII4 = String.valueOf(this.iiiiIiiiIiiII);
        String IiiiiiiiIIIII5 = this.iiiiIiiiIiiII == 5 ? "\u79ef\u5206" : "\u4ed9\u7389";
        List IiiiiiiiIIIII6 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.size()) {
            Eshop IiiiiiiiIIIII8 = (Eshop)IiiiiiiiIIIII6.get(IiiiiiiiIIIII7);
            if (IiiiiiiiIIIII8.getEshoptype().equals(IiiiiiiiIIIII4)) {
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII3) {
                    iiIiIiiiiIiIi iiIiIiiiiIiIi2 = this.ALLATORIxDEMO[IiiiiiiiIIIII2];
                    iiIiIiiiiIiIi2.ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII5);
                    if (++IiiiiiiiIIIII2 >= this.ALLATORIxDEMO.length) {
                        return;
                    }
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII7;
        }
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id == 261) {
            this.iIiIiiiiIIiIi(1);
            return;
        }
        if (id == 262) {
            this.iIiIiiiiIIiIi(this.IiIIIiiiiIiiI);
            return;
        }
        if (id == 263) {
            this.iIiIiiiiIIiIi(this.IiiiiiiiIIIII - 1);
            return;
        }
        if (id != 264) return;
        this.iIiIiiiiIIiIi(this.IiiiiiiiIIIII + 1);
    }

    public IiiIiiiiIIIIi(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 682, 475, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII[6];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 251 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u6750\u6599" : (IiiiiiiiIIIII == 1 ? "\u5fbd\u7ae0" : (IiiiiiiiIIIII == 2 ? "\u795e\u517d" : (IiiiiiiiIIIII == 3 ? "\u7b26\u77f3" : (IiiiiiiiIIIII == 4 ? "\u914d\u9970" : (IiiiiiiiIIIII == 5 ? "\u79ef\u5206" : ""))))), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(54 + 65 * IiiiiiiiIIIII, 73, 63, 24);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new iiIiIiiiiIiIi[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new iiIiIiiiiIiIi((IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(54 + IiiiiiiiIIIII % 5 * 120, 97 + IiiiiiiiIIIII / 5 * 165, 115, 150);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII(IiiiiiiiIIIII == 2 ? "sc/e/42.png" : (IiiiiiiiIIIII == 3 ? "sc/e/43.png" : "sc/e/6.png"), 1, 261 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u9996\u9875" : (IiiiiiiiIIIII == 1 ? "\u672b\u9875" : ""), (IiiiIiiiiIiIi)this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(264 + 140 * IiiiiiiiIIIII, 435, 34, 18);
            if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(301 + 82 * (IiiiiiiiIIIII - 2), 435, 18, 18);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)480, (int)(34 + (IiiiiiiiIIIII + 1) * 19), (int)72, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7d2f\u8ba1\u5145\u503c" : (IiiiiiiiIIIII == 1 ? "\u5f53\u524d\u79ef\u5206" : (IiiiiiiiIIIII == 2 ? "\u5143" : (IiiiiiiiIIIII == 3 ? "\u79ef\u5206" : ""))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.white);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(627, 53 + (IiiiiiiiIIIII - 2) * 19, 30, 18);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(4);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new com.xy.q.iiIiIiiiiIiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            MoneyType IiiiiiiiIIIII2 = new MoneyType();
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII2.setIdAndKey(5, "\u7d2f\u8ba1");
            } else if (IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII2.setIdAndKey(4, "\u79ef\u5206");
            }
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII2, (GameView)gameView);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(552, 34 + (IiiiiiiiIIIII + 1) * 19, 110, 18);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)322, (int)435, (int)58, (int)18, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public com.xy.q.iiIiIiiiiIiIi[] ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii(int type) {
        this.iiiiIiiiIiiII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiiiIiiiIiiII);
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII % 10 == 0 ? IiiiiiiiIIIII / 10 : IiiiiiiiIIIII / 10 + 1;
        this.iIiIiiiiIIiIi(1);
    }
}
