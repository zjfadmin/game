/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiIiiiIIiIi
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiiIiiiIIiIi;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iIIIiiiiiIiIi
extends IiiiIiiiiIiIi {
    private JLabel iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private IiiiiiiiiIIII[] IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private IIiiIiiiIIiIi[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    static /* synthetic */ int ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public iIIIiiiiiIiIi(GameView gameView) {
        super(125, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 662, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u65b0\u533a\u51b2\u7ea7\u793c");
        this.IiIIIiiiiIiiI = new IiiiiiiiiIIII[7];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IiiiiiiiiIIII(IiiiiiiiIIIII == 0 ? "sc/e/7.png" : "sc/e/31.png", 1, 191 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u7b7e\u5230" : "\u9886 \u53d6", (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(548, 47, 59, 25);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 6) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(71 + 94 * (IiiiiiiiIIIII - 1), 412, 79, 25);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel();
        this.iIiiIiiiiiiII.setBounds(475, 50, 30, 20);
        this.iIiiIiiiiiiII.setForeground(Color.red);
        this.iIiiIiiiiiiII.setHorizontalAlignment(0);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.IIiIiiiiiIiII);
        this.iIiiIiiiiiiII.setOpaque(false);
        this.add(this.iIiiIiiiiiiII);
        this.iIiIiiiiIiIii = new JLabel[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)69, (int)45, (int)240, (int)18, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ef\u901a\u8fc7\u70b9\u51fb\u6570\u5b57\u6d88\u8017\u4e00\u5b9a\u4ed9\u7389\u8fdb\u884c\u8865\u7b7e" : (IiiiiiiiIIIII == 1 ? "\u5df2\u7d2f\u8ba1\u7b7e\u5230\uff1a \u5929 " : (IiiiiiiiIIIII == 2 ? "1\u5929 " : (IiiiiiiiIIIII == 3 ? "3\u5929 " : (IiiiiiiiIIIII == 4 ? "7\u5929 " : (IiiiiiiiIIIII == 5 ? "12\u5929 " : (IiiiiiiiIIIII == 6 ? "18\u5929 " : (IiiiiiiiIIIII == 7 ? "25\u5929 " : ""))))))));
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiIiiiiiIiII);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(367, 50, 173, 21);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 7) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiIiiiIiiii);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(66 + 96 * (IiiiiiiiIIIII - 2), 251, 87, 28);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new IIiiIiiiIIiIi[30];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiiIiiiIIiIi(this, IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(367 + IiiiiiiiIIIII % 7 * 35, 88 + IiiiiiiiIIIII / 7 * 30, 35, 30);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[11];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/60.png", (int)76, (int)2, (int)76, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(365, 78, 248, 7);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(354, 39, 272, 204);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/74.png", (int)16, (int)16, (int)30, (int)30, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(56, 32, 575, 216);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)565, (int)206, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(59, 35, 569, 210);
            }
            if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 10) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/45.png", (int)2, (int)76, (int)2, (int)76, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(59 + 94 * (IiiiiiiiIIIII - 4), 251, 7, 191);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI[30];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIIIiiiIiIii);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            if (IiiiiiiiIIIII < 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(70 + 41 * ((IiiiiiiiIIIII - 0) % 2), 282 + 41 * ((IiiiiiiiIIIII - 0) / 2), 39, 39);
            } else if (IiiiiiiiIIIII < 10) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(164 + 41 * ((IiiiiiiiIIIII - 5) % 2), 282 + 41 * ((IiiiiiiiIIIII - 5) / 2), 39, 39);
            } else if (IiiiiiiiIIIII < 15) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(258 + 41 * ((IiiiiiiiIIIII - 10) % 2), 282 + 41 * ((IiiiiiiiIIIII - 10) / 2), 39, 39);
            } else if (IiiiiiiiIIIII < 20) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(352 + 41 * ((IiiiiiiiIIIII - 15) % 2), 282 + 41 * ((IiiiiiiiIIIII - 15) / 2), 39, 39);
            } else if (IiiiiiiiIIIII < 25) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(446 + 41 * ((IiiiiiiiIIIII - 20) % 2), 282 + 41 * ((IiiiiiiiIIIII - 20) / 2), 39, 39);
            } else if (IiiiiiiiIIIII < 30) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(540 + 41 * ((IiiiiiiiIIIII - 25) % 2), 282 + 41 * ((IiiiiiiiIIIII - 25) / 2), 39, 39);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 191) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)"R7=Q");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("R7=T" + (id - 192)));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void iiiIiiiiiiIIi() {
        ++this.IIiiIiiiIIiIi;
        if (this.IIiiIiiiIIiIi >= 30) {
            this.IIiiIiiiIIiIi = 0;
        }
        this.iIiIiiiiIIiIi(null);
    }

    public void iIiIiiiiIIiIi(String mes) {
        if (mes != null) {
            this.IIiiIiiiIIiIi = Integer.parseInt(mes);
        }
        com.xy.v.IiiiiiiiiIIII IiiiiiiiIIIII = this.ALLATORIxDEMO();
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getTaskSystem().ALLATORIxDEMO(7, 1);
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getTaskSystem().ALLATORIxDEMO(7, 2);
        String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII.ALLATORIxDEMO().getTotals();
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < 6) {
            String IiiiiiiiIIIII7 = IiiiiiiiIIIII5 != null && IiiiiiiiIIIII6 < IiiiiiiiIIIII5.length ? IiiiiiiiIIIII5[IiiiiiiiIIIII6] : null;
            String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII7 != null && !IiiiiiiiIIIII7.equals("") ? IiiiiiiiIIIII7.split("\\|") : null;
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < 5) {
                String IiiiiiiiIIIII10 = IiiiiiiiIIIII8 != null && IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length ? IiiiiiiiIIIII8[IiiiiiiiIIIII9] : null;
                Goodstable IiiiiiiiIIIII11 = IiiiiiiiIIIII10 != null ? IiiiiiiiIIIII.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII10)) : null;
                iIIIiiiiiIiIi iIIIiiiiiIiIi2 = this;
                if (IiiiiiiiIIIII11 != null) {
                    iIIIiiiiiIiIi2.iiIiiiiiiiIii[IiiiiiiiIIIII6 * 5 + IiiiiiiiIIIII9].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII11);
                } else {
                    iIIIiiiiiIiIi2.iiIiiiiiiiIii[IiiiiiiiIIIII6 * 5 + IiiiiiiiIIIII9].ALLATORIxDEMO(0, null);
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII6 * 5 + IiiiiiiiIIIII9].setVisible(true);
                }
                ++IiiiiiiiIIIII9;
            }
            if ((IiiiiiiiIIIII3 >>> IiiiiiiiIIIII6 & 1) == 0) {
                this.IiIIIiiiiIiiI[1 + IiiiiiiiIIIII6].setText("\u9886 \u53d6");
                this.IiIIIiiiiIiiI[1 + IiiiiiiiIIIII6].setBtn(1, "sc/e/31.png");
            } else {
                this.IiIIIiiiiIiiI[1 + IiiiiiiiIIIII6].setText("\u5df2\u9886\u53d6");
                this.IiIIIiiiiIiiI[1 + IiiiiiiiIIIII6].setBtn(-1, "sc/e/58.png");
            }
            ++IiiiiiiiIIIII6;
        }
        IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII12 = 0;
        while (IiiiiiiiIIIII12 < 30) {
            if ((IiiiiiiiIIIII4 >>> IiiiiiiiIIIII12 & 1) == 1) {
                ++IiiiiiiiIIIII6;
                this.IiiiiiiiIIIII[IiiiiiiiIIIII12].setBackground(iiIIiiiiIiiII.IiiIIiiiiIiII);
            } else {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII12].setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
            }
            ++IiiiiiiiIIIII12;
        }
        this.iIiiIiiiiiiII.setText(String.valueOf(IiiiiiiiIIIII6));
        this.IiIIIiiiiIiiI[0].setVisible((IiiiiiiiIIIII4 >>> this.IIiiIiiiIIiIi & 1) == 0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
