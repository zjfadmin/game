/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.i.IIiIiiiiIIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.i.IIiIiiiiIIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class iIIIiiiiiIiIi
extends JComponent {
    private IIIiiiiiIiIiI iiiIiiiiiiiIi;
    final /* synthetic */ iiiIIiiiIIIii iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi = new RichLabel("", null, 200);
    private iIIiIiiiIiiIi[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IIiIiiiiIIiii[] iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public iIIIiiiiiIiIi(iiiIIiiiIIIii iiiIIiiiIIIii2) {
        this.iIiiIiiiiiiII = iiiIIiiiIIIii2;
        this.IIiiIiiiIIiIi.setBounds(230, 42, 200, 80);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new JLabel[9];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(50 + IiiiiiiiIIIII % 2 * 234), (int)(358 + IiiiiiiiIIIII / 2 * 29), (int)20, (int)20, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b66\u4e60\u4ea4\u6d41" : (IiiiiiiiIIIII == 1 ? "\u76ee\u524d\u7b49\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u5347\u7ea7\u9053\u884c" : (IiiiiiiiIIIII == 3 ? "\u5c5e \u6027" : (IiiiiiiiIIIII == 4 ? "\u7b26 \u77f3" : (IiiiiiiiIIIII == 5 ? "\u6280 \u80fd" : (IiiiiiiiIIIII == 6 ? "\u6297\u6027" : (IiiiiiiiIIIII == 7 ? "\u54c1\u8d28" : (IiiiiiiiIIIII == 8 ? "\u5b66\u4e60" : "")))))))));
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiIiiiiIiiii);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(40, 20, 140, 24);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(18, 214 + 24 * (IiiiiiiiIIIII - 1), 72, 19);
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIIiiiiiIIiII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                if (IiiiiiiiIIIII == 3) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(230, 16, 65, 23);
                } else if (IiiiiiiiIIIII == 4) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(230, 155, 65, 23);
                } else if (IiiiiiiiIIIII == 5) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(230, 219, 65, 23);
                }
            } else if (IiiiiiiiIIIII == 6) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiIiiiiiIiII);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(223, 128, 49, 19);
            } else if (IiiiiiiiIIIII == 7) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(75, 187, 30, 14);
            } else if (IiiiiiiiIIIII == 8) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFF00"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(104, 187, 40, 14);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIiIiiiiIIiii[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIiIiiiiIIiii(IiiiiiiiIIIII == 2 ? "sc/e/6.png" : "sc/e/7.png", 1, 21 + IiiiiiiiIIIII, IiiiiiiiIIIII == 2 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u5220\u9664" : (IiiiiiiiIIIII == 1 ? "\u7a81\u7834" : (IiiiiiiiIIIII == 2 ? "\u8f6c\u6362" : "")), iiiIIiiiIIIii2.ALLATORIxDEMO());
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.black);
            }
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(40, 264, 59, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(122, 264, 59, 25);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(392, 129, 34, 18);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.ALLATORIxDEMO : iiIIiiiiIiiII.iiIiiiiiiIIiI));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(94, 214, 104, 19);
            } else {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(274, 128, 154, 19);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI(iiiIIiiiIIIii2.ALLATORIxDEMO());
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(6, (Object)(IiiiiiiiIIIII < 5 ? 1 : 2));
            if (IiiiiiiiIIIII < 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(241 + IiiiiiiiIIIII * 37, 182, 26, 26);
            } else {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(238 + (IiiiiiiiIIIII - 5) * 38, 250, 30, 30);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI();
        this.iiiIiiiiiiiIi.setBounds(60, 65, 100, 100);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[18];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(40, 45, 140, 160);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/48.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(97, 246, 98, 5);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(96, 244, 100, 9);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(219, 16, 147, 23);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(218, 155, 147, 23);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(218, 219, 147, 23);
                }
            } else if (IiiiiiiiIIIII == 6) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(228, 43, 200, 80);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/45.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(213, 10, 7, 274);
            } else if (IiiiiiiiIIIII >= 8 && IiiiiiiiIIIII <= 12) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/43.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(241 + (IiiiiiiiIIIII - 8) * 37, 182, 27, 27);
            } else if (IiiiiiiiIIIII >= 13 && IiiiiiiiIIIII <= 17) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/46.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(236 + (IiiiiiiiIIIII - 13) * 38, 248, 34, 34);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ JLabel[] ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    static /* synthetic */ IIIiiiiiIiIiI ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(iIIIiiiiiIiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }
}
