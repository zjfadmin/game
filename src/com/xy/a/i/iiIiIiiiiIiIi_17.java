/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiiiiiiiiIi
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIIiiiiiiiiIi;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iiIiIiiiiIiIi
extends IiiiIiiiiIiIi {
    private JLabel[] iIiiIiiiiiiII;
    private com.xy.q.iiIiIiiiiIiIi IIiiIiiiIIiIi;
    private iiIiIiiiiIiii[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private MoneyType iiIiiiiiiiIii;
    private IIIiiiiiiiiIi[] IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            long IiiiiiiiIIIII3 = IiiiiiiiIIIII.getPackRecord().getStarSoulType(this.IiiiiiiiIIIII[IiiiiiiiIIIII2].iIiIiiiiIIiii()) / 10000L;
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     */
    public iiIiIiiiiIiIi(GameView gameView) {
        super(138, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 462, 445, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u661f\u76d8");
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.ALLATORIxDEMO.setTextSize("#c000000\u63d0\u793a\uff1a\u661f\u9b42\u8fd8\u53ef\u8d60\u4e0eNPC:\u201c#cFF0000\u4e9a\u514b\u897f#c000000\u201d\u201c#cFF0000\u963f\u62c9\u6728\u6c57#c000000\u201d\u83b7\u5f97\u53cb\u597d\u5ea6\u3002", 380);
        this.ALLATORIxDEMO.setBounds(51, 38, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new iiIiIiiiiIiii[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/7.png", 1, 32 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u8f6c\u5316" : (IiiiiiiiIIIII == 1 ? "\u91cd\u70bc" : ""), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(218 + 103 * IiiiiiiiIIIII, 392, 59, 25);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new JLabel[87];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)(85 + 51 * IiiiiiiiIIIII), (int)36, (int)18, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cA29577"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 42 || IiiiiiiiIIIII == 48 || IiiiiiiiIIIII == 54 || IiiiiiiiIIIII == 60 || IiiiiiiiIIIII == 66 || IiiiiiiiIIIII == 72 || IiiiiiiiIIIII == 78 ? "1" : (IiiiiiiiIIIII == 43 || IiiiiiiiIIIII == 49 || IiiiiiiiIIIII == 55 || IiiiiiiiIIIII == 61 || IiiiiiiiIIIII == 67 || IiiiiiiiIIIII == 73 || IiiiiiiiIIIII == 79 ? "2" : (IiiiiiiiIIIII == 44 || IiiiiiiiIIIII == 50 || IiiiiiiiIIIII == 56 || IiiiiiiiIIIII == 62 || IiiiiiiiIIIII == 68 || IiiiiiiiIIIII == 74 || IiiiiiiiIIIII == 80 ? "3" : (IiiiiiiiIIIII == 45 || IiiiiiiiIIIII == 51 || IiiiiiiiIIIII == 57 || IiiiiiiiIIIII == 63 || IiiiiiiiIIIII == 69 || IiiiiiiiIIIII == 75 || IiiiiiiiIIIII == 81 ? "4" : (IiiiiiiiIIIII == 46 || IiiiiiiiIIIII == 52 || IiiiiiiiIIIII == 58 || IiiiiiiiIIIII == 64 || IiiiiiiiIIIII == 70 || IiiiiiiiIIIII == 76 || IiiiiiiiIIIII == 82 ? "5" : (IiiiiiiiIIIII == 47 || IiiiiiiiIIIII == 53 || IiiiiiiiIIIII == 59 || IiiiiiiiIIIII == 65 || IiiiiiiiIIIII == 71 || IiiiiiiiIIIII == 77 || IiiiiiiiIIIII == 83 ? "6" : (IiiiiiiiIIIII == 84 ? "\u9b42\u503c" : (IiiiiiiiIIIII == 85 ? "\u83b7\u5f97\u8fc7\u7684\u661f\u9b42    \u70b9\u51fb\u53ef\u6536\u5f55\uff0c\u6536\u5f55\u540e\u53ef\u518d\u751f\u6210\u3002" : (IiiiiiiiIIIII == 86 ? "\u5de6\u952e" : "\u7b49\u7ea7")))))))));
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cEFE2CD"));
            } else if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 11) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(54, 85 + 51 * (IiiiiiiiIIIII - 6), 36, 18);
            } else if (IiiiiiiiIIIII >= 12 && IiiiiiiiIIIII <= 17) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(56, 85 + 51 * (IiiiiiiiIIIII - 12), 36, 18);
            } else if (IiiiiiiiIIIII >= 18 && IiiiiiiiIIIII <= 23) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(54, 84 + 51 * (IiiiiiiiIIIII - 18), 36, 18);
            } else if (IiiiiiiiIIIII >= 24 && IiiiiiiiIIIII <= 29) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(56, 84 + 51 * (IiiiiiiiIIIII - 24), 36, 18);
            } else if (IiiiiiiiIIIII >= 30 && IiiiiiiiIIIII <= 35) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(54, 86 + 51 * (IiiiiiiiIIIII - 30), 36, 18);
            } else if (IiiiiiiiIIIII >= 36 && IiiiiiiiIIIII <= 41) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(56, 86 + 51 * (IiiiiiiiIIIII - 36), 36, 18);
            } else if (IiiiiiiiIIIII >= 42 && IiiiiiiiIIIII <= 47) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cF0EB3C"));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(94, 85 + 51 * (IiiiiiiiIIIII - 42), 18, 18);
            } else if (IiiiiiiiIIIII >= 48 && IiiiiiiiIIIII <= 83) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cA29475"));
                if (IiiiiiiiIIIII >= 48 && IiiiiiiiIIIII <= 53) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(93, 85 + 51 * (IiiiiiiiIIIII - 48), 18, 18);
                } else if (IiiiiiiiIIIII >= 54 && IiiiiiiiIIIII <= 59) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(95, 85 + 51 * (IiiiiiiiIIIII - 54), 18, 18);
                } else if (IiiiiiiiIIIII >= 60 && IiiiiiiiIIIII <= 65) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(93, 84 + 51 * (IiiiiiiiIIIII - 60), 18, 18);
                } else if (IiiiiiiiIIIII >= 66 && IiiiiiiiIIIII <= 71) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(95, 84 + 51 * (IiiiiiiiIIIII - 66), 18, 18);
                } else if (IiiiiiiiIIIII >= 72 && IiiiiiiiIIIII <= 77) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(93, 86 + 51 * (IiiiiiiiIIIII - 72), 18, 18);
                } else if (IiiiiiiiIIIII >= 78 && IiiiiiiiIIIII <= 83) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(95, 86 + 51 * (IiiiiiiiIIIII - 78), 18, 18);
                }
            } else if (IiiiiiiiIIIII == 84) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(45, 394, 36, 19);
            } else if (IiiiiiiiIIIII == 85) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(50, 20, 380, 20);
            } else if (IiiiiiiiIIIII == 86) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFF0000"));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(154, 20, 36, 20);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIiiiiiiiIii = new MoneyType();
        this.iiIiiiiiiiIii.setIdAndKey(0, "\u9b42\u503c");
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)87, (int)394, (int)84, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiiiiiiiIii, (GameView)gameView);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            block40: {
                block39: {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                    this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != 0) break block39;
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(114, 67, 309, 309);
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png");
                    this.IiiiiiiiIIIII = new IIIiiiiiiiiIi[36];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl115
                }
                if (IiiiiiiiIIIII == 1) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(46, 57, 390, 330);
                }
                break block40;
                do {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiiiiIi(IiiiiiiiIIIII + 1, IiiiiiiiIIIII, true, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(115 + IiiiiiiiIIIII % 6 * 51, 69 + IiiiiiiiIIIII / 6 * 51, 51, 51);
                    this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl115:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
