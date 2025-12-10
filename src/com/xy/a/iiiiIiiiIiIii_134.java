/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.petExchange
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.iiIIiiiiiIIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Exception performing whole class analysis ignored.
 */
static class iiiiIiiiIiIii
extends JComponent {
    private IiiiIiiiiIiII[] IIIIiiiiiiiII;
    private iIIiIiiiIiiIi[] iiIIIiiiiiiiI;
    private IIIIIiiiIIIiI[] IiIiiiiiIIIII = new IIIIIiiiIIIiI[2];
    private petExchange iiIiIiiiiIIIi;
    private RichLabel iiiiIiiiIiiII;
    private iiIiIiiiiIiIi[] iiiIiiiiiiiIi;
    private petExchange iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    final /* synthetic */ iiIIiiiiiIIII iiIiiiiiiiIii;
    private IIiIIiiiIIIiI[] IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ IIiIIiiiIIIiI[] ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ petExchange iIiIiiiiIIiii(iiiiIiiiIiIii arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    static /* synthetic */ iiIiIiiiiIiIi[] ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ petExchange ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public iiiiIiiiIiIii(iiIIiiiiiIIII iiIIiiiiiIIII2) {
        this.iiIiiiiiiiIii = iiIIiiiiiIIII2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/7.png", 1, 191 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151\u6362", iiIIiiiiiIIII2.ALLATORIxDEMO());
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(378, 248 + IiiiiiiiIIIII * 141, 59, 25);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[17];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)57, (int)150, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6211\u6b63\u5728\u5151\u6362\u7ed1\u7389" : (IiiiiiiiIIIII == 1 ? "\u60a8\u5f53\u524d\u5171\u6709\uff1a" : (IiiiiiiiIIIII == 2 ? "\u7ed1\u7389" : (IiiiiiiiIIIII == 3 ? "\u4ed9\u7389\u5151\u6362" : (IiiiiiiiIIIII == 4 ? "\u5927\u8bdd\u5e01\u5151\u6362" : (IiiiiiiiIIIII == 5 || IiiiiiiiIIIII == 8 ? "\u62e5\u6709" : (IiiiiiiiIIIII == 6 || IiiiiiiiIIIII == 9 ? "\u5151\u6362" : (IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 10 ? "\u83b7\u5f97" : (IiiiiiiiIIIII == 11 || IiiiiiiiIIIII == 12 ? "\u3010\u4ed9\u7389\u3011" : (IiiiiiiiIIIII == 13 || IiiiiiiiIIIII == 16 ? "\u3010\u7ed1\u7389\u3011" : (IiiiiiiiIIIII == 14 || IiiiiiiiIIIII == 15 ? "\u3010\u5927\u8bdd\u5e01\u3011" : "")))))))))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(131 + 228 * (IiiiiiiiIIIII - 1), 95, 84, 19);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(37, 197 + 141 * (IiiiiiiiIIIII - 3), 119, 21);
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 7) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(147, 226 + 25 * (IiiiiiiiIIIII - 5), 36, 19);
            } else if (IiiiiiiiIIIII >= 8 && IiiiiiiiIIIII <= 10) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(147, 367 + 25 * (IiiiiiiiIIIII - 8), 36, 19);
            } else if (IiiiiiiiIIIII >= 11 && IiiiiiiiIIIII <= 13) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(312, 226 + 25 * (IiiiiiiiIIIII - 11), 72, 19);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII >= 14 && IiiiiiiiIIIII <= 16) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(312, 367 + 25 * (IiiiiiiiIIIII - 14), 72, 19);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.ALLATORIxDEMO.setTextSize("#c000000\u5c06\u4ed9\u7389\u5151\u6362\u6210\u7ed1\u7389\uff0c\u5151\u6362\u6bd4\u4f8b\u4e3a#cFF0000 1 \uff1a2", 360);
        this.ALLATORIxDEMO.setBounds(129, 124, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.add((Component)this.ALLATORIxDEMO);
        this.iiiiIiiiIiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiiiIiiiIiiII.setTextSize("#c000000\u5c06\u5927\u8bdd\u5e01\u5151\u6362\u6210\u7ed1\u7389\uff0c\u5151\u6362\u6bd4\u4f8b\u4e3a#cFF0000 100000 \uff1a1", 360);
        this.iiiiIiiiIiiII.setBounds(129, 142, this.iiiiIiiiIiiII.getWidth(), this.iiiiIiiiIiiII.getHeight());
        this.add((Component)this.iiiiIiiiIiiII);
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiiIiiiIIiIi.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a\u5927\u8bdd\u5e01\u5151\u6362\u7ed1\u7389\uff0c\u7cbe\u786e\u5230\u4e2a\u4f4d\u6570\uff0c#cFF0000\u6240\u6709\u5c0f\u6570\u6e05\u96f6#c000000\u3002", 360);
        this.IIiiIiiiIIiIi.setBounds(48, 467, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
        this.add((Component)this.IIiiIiiiIIiIi);
        IIiIiiiiIIiii IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
        this.iiIIIiiiiiiiI = new iIIiIiiiIiiIi[2];
        this.iiiIiiiiiiiIi = new iiIiIiiiiIiIi[3];
        this.IIIIiiiiiiiII = new IiiiIiiiiIiII[2];
        this.IiiiiiiiIIIII = new IIiIIiiiIIIiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            if (IiiiiiiiIIIII3 == 0) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII3].setBounds(187, 251, 124, 19);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII3].setBounds(187, 392, 124, 19);
            }
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII3]);
            int n = IiiiiiiiIIIII3;
            IIiIIiiiIIIiI iIiIIiiiIIIiI = new IIiIIiiiIIIiI(15, (JTextField)this.IIIIiiiiiiiII[IiiiiiiiIIIII3], iiIIiiiiiIIII2.ALLATORIxDEMO());
            ++IiiiiiiiIIIII3;
            this.IiiiiiiiIIIII[n] = iIiIIiiiIIIiI;
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 == 0) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII3].setBounds(187, 276, 124, 19);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII3].setBounds(187, 417, 124, 19);
            }
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII3++]);
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiIiiiiiiiIi.length) {
            MoneyType IiiiiiiiIIIII4 = new MoneyType();
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII4.setIdAndKey(2, "\u7ed1\u7389");
            } else if (IiiiiiiiIIIII3 == 1) {
                IiiiiiiiIIIII4.setIdAndKey(3, "\u4ed9\u7389");
            } else if (IiiiiiiiIIIII3 == 2) {
                IiiiiiiiIIIII4.setIdAndKey(1, "\u91d1\u94b1");
            }
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII4, (GameView)iiIIiiiiiIIII2.iiIIiiiiIiIIi);
            if (IiiiiiiiIIIII3 == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(214, 95, 139, 19);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(187, 226, 124, 19);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(187, 367, 124, 19);
            }
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(2);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII2);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII3++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            if (IiiiiiiiIIIII3 != 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
                this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII3]);
                if (IiiiiiiiIIIII3 == 0) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(47, 34, 408, 20);
                } else if (IiiiiiiiIIIII3 == 1) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/80.png");
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(64, 93, 50, 70);
                } else if (IiiiiiiiIIIII3 == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)60, (int)1, (int)60, (int)1, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(130, 120, 306, 2);
                } else if (IiiiiiiiIIIII3 == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(47, 78, 408, 100);
                } else if (IiiiiiiiIIIII3 == 4 || IiiiiiiiIIIII3 == 5) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(61, 226 + (IiiiiiiiIIIII3 - 4) * 141, 70, 70);
                } else if (IiiiiiiiIIIII3 == 6 || IiiiiiiiIIIII3 == 7) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(57, 222 + (IiiiiiiiIIIII3 - 6) * 141, 79, 77);
                } else if (IiiiiiiiIIIII3 == 8) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)60, (int)1, (int)60, (int)1, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(57, 321, 390, 2);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    static /* synthetic */ RichLabel iIiIiiiiIIiii(iiiiIiiiIiIii arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ void iIiIiiiiIIiii(iiiiIiiiIiIii arg0, petExchange arg1) {
        arg0.iiIiIiiiiIIIi = arg1;
    }

    static /* synthetic */ IiiiIiiiiIiII[] ALLATORIxDEMO(iiiiIiiiIiIii arg0) {
        return arg0.IIIIiiiiiiiII;
    }

    static /* synthetic */ void ALLATORIxDEMO(iiiiIiiiIiIii arg0, petExchange arg1) {
        arg0.iIiiIiiiiiiII = arg1;
    }
}
