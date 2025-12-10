/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIiiiiiIiiI
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.IiIIiiiiiIiiI;
import com.xy.a.iiIIiiiiiIIII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
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
static class iIiiIiiiiiIIi
extends JComponent {
    private iIIiIiiiIiiIi[] iiiiIiiiIIiii;
    private IIiIIiiiIIIiI[] iIIiIiiiiiiIi;
    private iiIiIiiiiIiIi IIIIiiiiiiiII;
    public int iiIIIiiiiiiiI = 1;
    private IiiiIiiiiIiII[] IiIiiiiiIIIII;
    private MoneyType iiIiIiiiiIIIi;
    public long iiiiIiiiIiiII;
    public int iiiIiiiiiiiIi = 1;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private IiIIiiiiiIiiI[] IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private IIIIIiiiIIIiI[] IiIIIiiiiIiiI = new IIIIIiiiIIIiI[5];
    private RichLabel iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    final /* synthetic */ iiIIiiiiiIIII ALLATORIxDEMO;

    static /* synthetic */ IIiIIiiiIIIiI[] ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.iIIiIiiiiiiIi;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.iiiiIiiiIIiii;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String mes) {
        this.iiiiIiiiIiiII = 0L;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII++].setText("0");
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII++].setVisible(false);
        }
        String[] IiiiiiiiIIIII2 = mes.split("\\|");
        this.iiIIIiiiiiiiI = Integer.parseInt(IiiiiiiiIIIII2[0].substring(2));
        this.iiiIiiiiiiiIi = (Integer.parseInt(IiiiiiiiIIIII2[1]) - 1) / 6 + 1;
        this.iiiiIiiiIIiii[0].setText(String.valueOf(this.iiIIIiiiiiiiI) + "/" + this.iiiIiiiiiiiIi);
        int IiiiiiiiIIIII3 = 2;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length && IiiiiiiiIIIII3 < 8) {
            void IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII3 - 2;
            IiIIiiiiiIiiI IiiiiiiiIIIII6 = this.IIiiIiiiIIiIi[IiiiiiiiIIIII5];
            IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].indexOf("=");
            long IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2[IiiiiiiiIIIII3], (int)0, (int)IiiiiiiiIIIII5);
            long l = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2[IiiiiiiiIIIII3], (int)(IiiiiiiiIIIII5 + 1), (int)IiiiiiiiIIIII2[IiiiiiiiIIIII3].length());
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII7, (long)IiiiiiiiIIIII4);
            IiiiiiiiIIIII6.setVisible(true);
            if (IiiiiiiiIIIII3 == 2) {
                this.iiiiIiiiIiiII = IiiiiiiiIIIII7;
            }
            ++IiiiiiiiIIIII3;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii[1], (long)this.iiiiIiiiIiiII);
    }

    public iIiiIiiiiiIIi(iiIIiiiiiIIII iiIIiiiiiIIII2) {
        this.ALLATORIxDEMO = iiIIiiiiiIIII2;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/6.png", 1, 185 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", iiIIiiiiiIIII2.ALLATORIxDEMO());
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(164 + IiiiiiiiIIIII * 140, 321, 34, 18);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u9996\u9875" : (IiiiiiiiIIIII == 1 ? "\u672b\u9875" : (IiiiiiiiIIIII == 4 ? "\u786e\u5b9a\u8d2d\u4e70" : "")));
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setImage("sc/e/42.png");
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setImage("sc/e/43.png");
                }
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(201 + (IiiiiiiiIIIII - 2) * 82, 321, 18, 18);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.black);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(202, 464, 99, 25);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new JLabel[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(47 + 120 * IiiiiiiiIIIII), (int)57, (int)150, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6b63\u5728\u552e\u5356\u7684\u4ed9\u7389" : (IiiiiiiiIIIII == 1 ? "(\u5927\u8bdd\u5e01\u8d2d\u4e70)" : (IiiiiiiiIIIII == 2 ? "\u4ed9\u7389" : (IiiiiiiiIIIII == 3 ? "\u6bcf\u70b9\u552e\u4ef7" : (IiiiiiiiIIIII == 4 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 5 ? "\u8d2d\u4e70\u4ed9\u7389" : (IiiiiiiiIIIII == 6 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 7 ? "\u6bcf\u70b9\u552e\u4ef7" : (IiiiiiiiIIIII == 8 ? "\u73b0\u91d1" : "")))))))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.red);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
                if (IiiiiiiiIIIII == 2) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(85, 78, 72, 21);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(196, 78, 72, 21);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(366, 78, 72, 21);
                }
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(116 + (IiiiiiiiIIIII - 5) % 2 * 177, 361 + (IiiiiiiiIIIII - 5) / 2 * 25, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new IiIIiiiiiIiiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IiIIiiiiiIiiI(iiIIiiiiiIIII2);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(51, 99 + IiiiiiiiIIIII * 36, 402, 36);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iiIiiiiiiiIii.setTextSize("#c000000\u6e29\u99a8\u63d0\u793a\uff1a\u7531\u4e8e\u7cfb\u7edf\u65f6#cFF0000\u81ea\u52a8\u5e2e\u4f60\u6309\u7167\u6700\u4f4e\u7684\u5355\u4ef7\u4f18\u5148\u8d2d\u4e70\uff0c\u5f53\u591a\u4eba\u540c\u65f6", 410);
        this.iiIiiiiiiiIii.setBounds(41, 418, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.iIiIiiiiIiIii.setTextSize("#cFF0000\u8d2d\u4e70\u65f6\u53ef\u80fd\u4f1a\u53d1\u751f\u4ef7\u683c\u53d8\u5316\uff0c#c000000\u4f60\u80fd\u63a5\u53d7\u6bd4\u5f53\u524d\u5355\u4ef7\u6700\u591a\u9ad8           \u5927\u8bdd\u5e01", 410);
        this.iIiIiiiiIiIii.setBounds(42, 437, this.iIiIiiiiIiIii.getWidth(), this.iIiIiiiiIiIii.getHeight());
        this.add((Component)this.iIiIiiiiIiIii);
        IIiIiiiiIIiii IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false);
        this.iiIiIiiiiIIIi = new MoneyType();
        this.iiIiIiiiiIIIi.setIdAndKey(1, "\u91d1\u94b1");
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)332, (int)387, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiIiiiiIIIi, (GameView)iiIIiiiiiIIII2.iiIIiiiiIiIIi);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(2);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iiiiIiiiIIiii = new iIIiIiiiIiiIi[3];
        this.IiIiiiiiIIIII = new IiiiIiiiiIiII[2];
        this.iIIiIiiiiiiIi = new IIiIIiiiIIIiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)222, (int)321, (int)58, (int)18, (int)(IiiiiiiiIIIII3 == 0 ? 0 : 10), (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiiiIiiiIIiii[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 == 1) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(188, 387, 89, 19);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII3].setBounds(332, 362, 124, 19);
            }
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII3++]);
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            if (IiiiiiiiIIIII3 == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(188, 362, 89, 19);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(345, 439, 59, 19);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII3]);
            int n = IiiiiiiiIIIII3;
            IIiIIiiiIIIiI iIiIIiiiIIIiI = new IIiIIiiiIIIiI(15, (JTextField)this.IiIiiiiiIIIII[IiiiiiiiIIIII3], iiIIiiiiiIIII2.ALLATORIxDEMO());
            ++IiiiiiiiIIIII3;
            this.iIIiIiiiiiiIi[n] = iIiIIiiiIIIiI;
        }
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(47, 78, 408, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(47, 78, 408, 235);
            } else if (IiiiiiiiIIIII3 == 2) {
                if (iiIIiiiiiIIII2.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"yb500"));
                } else {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"236"));
                }
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(51, 360, 50, 50);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/4.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(47, 356, 59, 57);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)60, (int)1, (int)60, (int)1, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(56, 346, 390, 2);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII3++]);
        }
    }

    static /* synthetic */ IIIIIiiiIIIiI[] ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ iiIiIiiiiIiIi ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.IIIIiiiiiiiII;
    }

    static /* synthetic */ IiiiIiiiiIiII[] ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    static /* synthetic */ IiIIiiiiiIiiI[] ALLATORIxDEMO(iIiiIiiiiiIIi arg0) {
        return arg0.IIiiIiiiIIiIi;
    }
}
