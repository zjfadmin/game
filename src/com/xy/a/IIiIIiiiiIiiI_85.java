/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIiiI
 *  com.xy.a.iIiiIiiiiiIIi
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIiiI;
import com.xy.a.iIiiIiiiiiIIi;
import com.xy.a.iiIIiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIIiiiiIiiI
extends JComponent {
    private IIIiiiiiIiIiI[] IiIiiiiiIIIII;
    private IIiIIiiiIIIiI[] iiIiIiiiiIIIi;
    private MoneyType iiiiIiiiIiiII;
    private iIIiIiiiIiiIi[] iiiIiiiiiiiIi;
    private long iIiiIiiiiiiII = 100000L;
    private MoneyType IIiiIiiiIIiIi;
    final /* synthetic */ iiIIiiiiiIIII iIiIiiiiIiIii;
    private iiIiIiiiiIiIi[] IiIIIiiiiIiiI;
    private IiiiIiiiiIiII[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII = new JLabel[12];
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.iiiIiiiiiiiIi;
    }

    static /* synthetic */ IiiiIiiiiIiII[] ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String mes) {
        block4: {
            int IiiiiiiiIIIII;
            String[] IiiiiiiiIIIII2;
            block3: {
                this.iiIiiiiiiiIii[0].setText("0");
                this.iiIiiiiiiiIii[1].setText("0");
                int IiiiiiiiIIIII3 = 0;
                while (IiiiiiiiIIIII3 < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii)).length) {
                    iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii))[IiiiiiiiIIIII3++].setVisible(false);
                }
                IiiiiiiiIIIII2 = mes.split("\\|");
                iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii).iiIIIiiiiiiiI = Integer.parseInt(IiiiiiiiIIIII2[0].substring(2));
                iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii).iiiIiiiiiiiIi = (Integer.parseInt(IiiiiiiiIIIII2[1]) - 1) / 6 + 1;
                this.iiiIiiiiiiiIi[0].setText(String.valueOf(iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii).iiIIIiiiiiiiI) + "/" + iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii).iiiIiiiiiiiIi);
                IiiiiiiiIIIII = 2;
                if (!true) break block3;
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII2.length) return;
                if (IiiiiiiiIIIII >= 8) break block4;
            }
            do {
                void IiiiiiiiIIIII4;
                int IiiiiiiiIIIII5 = IiiiiiiiIIIII - 2;
                IiIIiiiiiIiiI iiIIiiiiiIiiI = iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)iiIIiiiiiIIII.ALLATORIxDEMO((iiIIiiiiiIIII)this.iIiIiiiiIiIii))[IiiiiiiiIIIII5];
                String string = IiiiiiiiIIIII2[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII4.ALLATORIxDEMO(string.split("="));
                IiiiiiiiIIIII4.setVisible(true);
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII2.length) return;
            } while (IiiiiiiiIIIII < 8);
        }
    }

    static /* synthetic */ iiIiIiiiiIiIi[] ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ IIiIIiiiIIIiI[] ALLATORIxDEMO(IIiIIiiiiIiiI arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    public IIiIIiiiiIiiI(iiIIiiiiiIIII iiIIiiiiiIIII2) {
        this.iIiIiiiiIiIii = iiIIiiiiiIIII2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(47 + 137 * IiiiiiiiIIIII), (int)57, (int)150, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6211\u6b63\u5728\u5bc4\u552e\u7684\u4ed9\u7389" : (IiiiiiiiIIIII == 1 ? "(\u5151\u6362\u5927\u8bdd\u5e01)" : (IiiiiiiiIIIII == 2 ? "\u4ed9\u7389" : (IiiiiiiiIIIII == 3 ? "\u6bcf\u70b9\u552e\u4ef7" : (IiiiiiiiIIIII == 4 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 5 ? "\u5df2\u4ea4\u6613" : (IiiiiiiiIIIII == 6 ? "\u5bc4\u552e\u4ed9\u7389" : (IiiiiiiiIIIII == 7 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 8 ? "\u6bcf\u70b9\u552e\u4ef7" : (IiiiiiiiIIIII == 9 ? "\u62bc\u91d1" : (IiiiiiiiIIIII == 10 ? "\u6211\u7684\u4ed9\u7389" : (IiiiiiiiIIIII == 11 ? "\u73b0\u91d1" : ""))))))))))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.red);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
                if (IiiiiiiiIIIII == 2) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(91, 78, 72, 21);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(151, 78, 72, 21);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(262, 78, 72, 21);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(346, 78, 72, 21);
                }
            } else if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 11) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(116 + (IiiiiiiiIIIII - 6) % 2 * 177, 361 + (IiiiiiiiIIIII - 6) / 2 * 25, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.ALLATORIxDEMO.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a\u5982\u4e0b\u67b6\u4ed9\u7389\uff0c\u62bc\u91d1#cFF0000\u4e0d\u4e88\u9000\u8fd8#c000000\u3002", 410);
        this.ALLATORIxDEMO.setBounds(48, 436, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.add((Component)this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new MoneyType();
        this.IIiiIiiiIIiIi.setIdAndKey(3, "\u4ed9\u7389");
        this.iiiiIiiiIiiII = new MoneyType();
        this.iiiiIiiiIiiII.setIdAndKey(1, "\u91d1\u94b1");
        IIiIiiiiIIiii IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
        this.iiiIiiiiiiiIi = new iIIiIiiiIiiIi[3];
        this.IiIIIiiiiIiiI = new iiIiIiiiiIiIi[2];
        this.iiIiiiiiiiIii = new IiiiIiiiiIiII[2];
        this.iiIiIiiiiIIIi = new IIiIIiiiIIIiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            if (IiiiiiiiIIIII3 == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII3].setBounds(188, 387, 89, 19);
            } else {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII3].setBounds(188, 362, 89, 19);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII3]);
            int n = IiiiiiiiIIIII3;
            IIiIIiiiIIIiI iIiIIiiiIIIiI = new IIiIIiiiIIIiI(15, (JTextField)this.iiIiiiiiiiIii[IiiiiiiiIIIII3], iiIIiiiiiIIII2.ALLATORIxDEMO());
            ++IiiiiiiiIIIII3;
            this.iiIiIiiiiIIIi[n] = iIiIIiiiIIIiI;
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)222, (int)321, (int)58, (int)18, (int)(IiiiiiiiIIIII3 == 0 ? 0 : 10), (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(332, 362, 124, 19);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].setBounds(332, 387, 124, 19);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII3++]);
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi[2], (long)this.iIiiIiiiiiiII);
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            IIiIIiiiiIiiI iIiIIiiiiIiiI = this;
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(IiiiiiiiIIIII3 == 0 ? 188 : 332), (int)412, (int)(IiiiiiiiIIIII3 == 0 ? 89 : 124), (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)(IiiiiiiiIIIII3 == 0 ? iIiIIiiiiIiiI.IIiiIiiiIIiIi : iIiIIiiiiIiiI.iiiiIiiiIiiII), (GameView)iiIIiiiiiIIII2.iiIIiiiiIiIIi);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(2);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII2);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII3++]);
        }
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(47, 78, 408, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(47, 78, 408, 235);
            } else if (IiiiiiiiIIIII3 == 2) {
                if (iiIIiiiiiIIII2.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"yb500"));
                } else {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"236"));
                }
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(51, 372, 50, 50);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/4.png");
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(47, 368, 59, 57);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)60, (int)1, (int)60, (int)1, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(56, 346, 390, 2);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII3++]);
        }
    }
}
