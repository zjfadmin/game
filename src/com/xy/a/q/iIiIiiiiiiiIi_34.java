/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.QualityClBean
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.GoodType
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.QualityClBean;
import com.xy.formula.ExpUtil;
import com.xy.formula.GoodType;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iIiIiiiiiiiIi
extends IiiiIiiiiIiIi {
    private JLabel[] iiiIiiiiiiiIi;
    private QualityClBean iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IiiiiiiiiIIII[] iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int id) {
        if (id == 188) {
            this.iIiiIiiiiiiII = null;
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (id != 189) return;
        if (this.iIiiIiiiiiiII == null) {
            return;
        }
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iIiiIiiiiiiII.getRgid());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)5, (String)this.iIiiIiiiiiiII.getNewAttr()));
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"extrattroper", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iIiiIiiiiiiII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.iIiiIiiiiiiII = null;
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(QualityClBean qualityClBean) {
        this.iIiiIiiiiiiII = qualityClBean;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String valueMessage, int type) {
        block12: {
            IiiiiiiiIIIII = valueMessage.split("&");
            IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[2]);
            IiiiiiiiIIIII = (int)IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII - (double)IiiiiiiiIIIII;
            IiiiiiiiIIIII = ExpUtil.ALLATORIxDEMO((long)Long.parseLong(IiiiiiiiIIIII[3]));
            IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[1]);
            if (type != 0) break block12;
            this.iiiIiiiiiiiIi[2].setText(String.valueOf(IiiiiiiiIIIII.getSkillname()) + "(" + IiiiiiiiIIIII + ")");
            this.IIiiIiiiIIiIi.setTextSize(iiIiiiiiIIiiI.ALLATORIxDEMO((String)("#G" + IiiiiiiiIIIII.getRemark()), (Skill)IiiiiiiiIIIII, (String)IiiiiiiiIIIII[2], (String)String.valueOf(IiiiiiiiIIIII)), 145);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl23
        }
        this.iiiIiiiiiiiIi[3].setText(String.valueOf(IiiiiiiiIIIII.getSkillname()) + "(" + IiiiiiiiIIIII + ")");
        this.iIiIiiiiIiIii.setTextSize(iiIiiiiiIIiiI.ALLATORIxDEMO((String)("#G" + IiiiiiiiIIIII.getRemark()), (Skill)IiiiiiiiIIIII, (String)IiiiiiiiIIIII[2], (String)String.valueOf(IiiiiiiiIIIII)), 145);
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl40
        do {
            if (IiiiiiiiIIIII + 1 <= IiiiiiiiIIIII) {
                this.IiIIIiiiiIiiI[2 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/83");
            } else {
                this.IiIIIiiiiIiiI[2 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/84");
            }
            ++IiiiiiiiIIIII;
lbl23:
            // 2 sources

        } while (IiiiiiiiIIIII < 5);
        if (IiiiiiiiIIIII == 5) {
            return;
        }
        if (IiiiiiiiIIIII < 0.2) {
            this.IiIIIiiiiIiiI[2 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/84");
            return;
        }
        if (IiiiiiiiIIIII > 0.8) {
            this.IiIIIiiiiIiiI[2 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/83");
            return;
        }
        this.IiIIIiiiiIiiI[2 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/82");
        return;
        do {
            if (IiiiiiiiIIIII + 1 <= IiiiiiiiIIIII) {
                this.IiIIIiiiiIiiI[7 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/83");
            } else {
                this.IiIIIiiiiIiiI[7 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/84");
            }
            ++IiiiiiiiIIIII;
lbl40:
            // 2 sources

        } while (IiiiiiiiIIIII < 5);
        if (IiiiiiiiIIIII == 5) {
            return;
        }
        if (IiiiiiiiIIIII < 0.2) {
            this.IiIIIiiiiIiiI[7 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/84");
            return;
        }
        if (IiiiiiiiIIIII > 0.8) {
            this.IiIIIiiiiIiiI[7 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/83");
            return;
        }
        this.IiIIIiiiiIiiI[7 + IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/82");
    }

    public iIiIiiiiiiiIi(GameView gameView) {
        super(94, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 478, 320, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6280\u80fd\u89c9\u9192");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 0, 37));
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/26.png", 1, 188 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4fdd\u7559\u539f\u6280\u80fd" : (IiiiiiiiIIIII == 1 ? "\u66ff\u6362\u65b0\u6280\u80fd" : ""), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(99 + 202 * IiiiiiiiIIIII, 238, 99, 25);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new JLabel[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(63 + (IiiiiiiiIIIII - 2) % 2 * 202), (int)(62 + (IiiiiiiiIIIII - 2) / 2 * 27), (int)170, (int)28, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u539f\u89c9\u9192\u6280" : (IiiiiiiiIIIII == 1 ? "\u65b0\u89c9\u9192\u6280" : (IiiiiiiiIIIII == 2 ? "\u6280\u80fd\u540d(4.9)" : (IiiiiiiiIIIII == 3 ? "\u6280\u80fd\u540d(5.0)" : (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5 ? "\u89c9\u9192\u5ea6" : "")))));
            this.add(this.iiiIiiiiiiiIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.white);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(72, 32, 110, 23);
            }
            if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.green);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiIiiiiiIiII);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(274, 32, 110, 23);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)59, (int)118, (int)181, (int)100, (Component)this.IIiiIiiiIIiIi, (int)30);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)261, (int)118, (int)181, (int)100, (Component)this.iIiIiiiiIiIii, (int)30);
        this.add(this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[20];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(57 + 202 * IiiiiiiiIIIII, 32, 180, 23);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 11) {
                if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 6) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(115 + 22 * (IiiiiiiiIIIII - 2), 94, 15, 16);
                } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 11) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(317 + 22 * (IiiiiiiiIIIII - 7), 94, 15, 16);
                }
            } else if (IiiiiiiiIIIII >= 12 && IiiiiiiiIIIII <= 17) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII >= 12 && IiiiiiiiIIIII <= 15) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(57 + (IiiiiiiiIIIII - 12) % 2 * 202, 62 + (IiiiiiiiIIIII - 12) / 2 * 27, 180, 28);
                } else if (IiiiiiiiIIIII >= 16 && IiiiiiiiIIIII <= 17) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(57 + (IiiiiiiiIIIII - 16) * 202, 116, 180, 104);
                }
            } else if (IiiiiiiiIIIII >= 18 && IiiiiiiiIIIII <= 19) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)20, (int)20, (int)30, (int)30, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(47 + 202 * (IiiiiiiiIIIII - 18), 24, 203, 209);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
