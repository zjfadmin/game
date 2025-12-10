/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JLabel;

public class IIiiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private BigDecimal IIiiIiiiIIiIi = new BigDecimal("10000000000");
    private IIiIiiiiIiIII[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIiIiiiiIiIII ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.ALLATORIxDEMO(IiiiiiiiIIIII.getExperience());
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade());
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getExtraPointInt("F");
        this.iiIiiiiiiiIii[1].setText(String.valueOf(IiiiiiiiIIIII2) + "\u7ea7");
        int IiiiiiiiIIIII4 = 0;
        if (IiiiiiiiIIIII2 < 150) {
            IiiiiiiiIIIII2 = 30;
            IiiiiiiiIIIII4 = 6;
        } else {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII2 - 144;
            IiiiiiiiIIIII2 = (IiiiiiiiIIIII2 - 144) * 5;
        }
        this.iiIiiiiiiiIii[2].setText(String.valueOf(IiiiiiiiIIIII4));
        this.iiIiiiiiiiIii[0].setText(IiiiiiiiIIIII.getXiuwei() + "/" + IiiiiiiiIIIII2);
        this.iiIiiiiiiiIii[3].setText(String.valueOf(IiiiiiiiIIIII3) + "/40");
        this.iiIiiiiiiiIii[4].setText(String.valueOf(IiiiiiiiIIIII3 + 1));
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(BigDecimal decimal) {
        void IiiiiiiiIIIII;
        BigDecimal bigDecimal = decimal.divide(this.IIiiIiiiIIiIi, 2, RoundingMode.HALF_DOWN);
        BigDecimal IiiiiiiiIIIII2 = bigDecimal.multiply(new BigDecimal("152"));
        if (IiiiiiiiIIIII.compareTo(new BigDecimal(0)) <= 0) {
            this.IiIIIiiiiIiiI[0].setSize(1, 15);
        } else if (IiiiiiiiIIIII.compareTo(new BigDecimal(1)) <= 0) {
            this.IiIIIiiiiIiiI[0].setSize(IiiiiiiiIIIII2.intValue(), 15);
        } else {
            this.IiIIIiiiiIiiI[0].setSize(152, 15);
        }
        this.IiiiiiiiIIIII[8].setText(decimal.toString());
    }

    public IIiiIiiiiIIiI(GameView gameView) {
        super(81, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 332, 407, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8f6c\u6362\u7ecf\u9a8c");
        this.ALLATORIxDEMO = new IIiIiiiiIiIII("sc/e/53.png", 2, 0, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, "\u5c5e\u6027\u70b9", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(53, 249, 109, 24);
        this.ALLATORIxDEMO.setKeep(true);
        this.add((Component)this.ALLATORIxDEMO);
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/7.png", 1, 321 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u8f6c\u6362" : (IiiiiiiiIIIII == 1 ? "\u5347\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u5151\u6362" : "")), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(230, 62, 59, 25);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(147, 184 + (IiiiiiiiIIIII - 1) * 158, 59, 25);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iIIiIiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(148, 66, 74, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(194, 131, 84, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(194, 155, 84, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(201, 286, 68, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(201, 311, 68, 19);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)56, (int)34, (int)72, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u7ecf\u9a8c" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u4fee\u4e3a\u70b9" : (IiiiiiiiIIIII == 2 ? "\u4eba\u7269\u5347\u7ea7" : (IiiiiiiiIIIII == 3 ? "\u5f53\u524d\u4eba\u7269\u7b49\u7ea7" : (IiiiiiiiIIIII == 4 ? "\u5347\u7ea7\u6240\u9700\u4fee\u4e3a\u70b9" : (IiiiiiiiIIIII == 5 ? "\u5151\u6362\u5c5e\u6027\u70b9\u53ca\u6f5c\u80fd\u5c5e\u6027\u70b9" : (IiiiiiiiIIIII == 6 ? "\u5df2\u5151\u6362\u5c5e\u6027\u70b9" : (IiiiiiiiIIIII == 7 ? "\u5151\u6362\u6240\u9700\u4fee\u4e3a\u70b9" : ""))))))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(56, 34, 72, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(56, 66, 87, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(56, 94, 72, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(88, 131, 103, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(69, 155, 122, 19);
            } else if (IiiiiiiiIIIII == 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(56, 230, 190, 19);
            } else if (IiiiiiiiIIIII == 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(61, 286, 103, 19);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(59, 311, 120, 19);
            } else if (IiiiiiiiIIIII == 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.white);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(138, 34, 150, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/67.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(135, 36, 156, 15);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(133, 34, 160, 19);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)30, (int)1, (int)30, (int)1, (boolean)false));
                if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(132, 102, 169, 2);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(246, 237, 65, 2);
                }
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 5) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(51, 115 + (IiiiiiiiIIIII - 4) * 158, 250, 110);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }
}
