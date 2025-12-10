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
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
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
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iIIIIiiiIiiIi
extends IiiiIiiiiIiIi {
    private iiIiIiiiiIiIi[] iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi = new BigDecimal(100000);
    private IIiIiiiiIiIII iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = -1;
    private JLabel[] iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.IiiIiiiiiiIiI();
    }

    public void IiiIiiiiiiIiI() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.iIiiIiiiiiiII[0].ALLATORIxDEMO(IiiiiiiiIIIII.getExperience().longValue());
        this.iIiiIiiiiiiII[1].ALLATORIxDEMO(IiiiiiiiIIIII.getContribution().longValue());
        this.iIiiIiiiiiiII[2].ALLATORIxDEMO(IiiiiiiiIIIII.getGold().longValue());
    }

    public iIIIIiiiIiiIi(GameView gameView) {
        super(106, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 362, 315, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4fee\u70bc");
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII("sc/e/26.png", 1, 349, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5c0f\u6210\u4fee\u70bc", (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setBounds(142, 265, 99, 25);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[5];
        this.iIiiIiiiiiiII = new iiIiIiiiiIiIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(157, 40, 44, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(285, 40, 44, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(170, 101, 144, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(170, 153, 144, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(170, 205, 144, 19);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(170, 127, 144, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(170, 179, 144, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(170, 231, 144, 19);
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText("0");
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new JLabel[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)56, (int)(101 + (IiiiiiiiIIIII - 3) * 26), (int)120, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u4fee\u70bc\u7b49\u7ea7" : (IiiiiiiiIIIII == 1 ? "\u8fd8\u53ef\u4fee\u70bc" : (IiiiiiiiIIIII == 2 ? "\u63d0\u5347\u4fee\u70bc\u7b49\u7ea7\u6240\u9700" : (IiiiiiiiIIIII == 3 ? "\u4fee\u70bc\u6240\u9700\u7ecf\u9a8c" : (IiiiiiiiIIIII == 4 ? "\u5f53\u524d\u62e5\u6709\u7ecf\u9a8c" : (IiiiiiiiIIIII == 5 ? "\u4fee\u70bc\u6240\u9700\u5e2e\u8d21" : (IiiiiiiiIIIII == 6 ? "\u5f53\u524d\u62e5\u6709\u5e2e\u8d21" : (IiiiiiiiIIIII == 7 ? "\u4fee\u70bc\u6240\u9700\u91d1\u94b1" : (IiiiiiiiIIIII == 8 ? "\u5f53\u524d\u62e5\u6709\u91d1\u94b1" : "")))))))));
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(56, 40, 102, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(215, 40, 72, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(56, 69, 138, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)30, (int)1, (int)30, (int)1, (boolean)false));
        this.ALLATORIxDEMO.setBounds(188, 78, 150, 2);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIIIiiiiIiiI = type;
        if (this.IiIIIiiiiIiiI == 1) {
            this.iIiIiiiiIiIii.setText("\u5c0f\u6210\u4fee\u70bc");
            this.IIiiIiiiIIiIi = new BigDecimal(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 1000000 : 2000000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[2], (long)2000000L);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[3], (long)300L);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[4], (long)this.IIiiIiiiIIiIi.longValue());
        } else if (this.IiIIIiiiiIiiI == 2) {
            this.iIiIiiiiIiIii.setText("\u5927\u6210\u4fee\u70bc");
            this.IIiiIiiiIIiIi = new BigDecimal(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 2000000 : 5000000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[2], (long)5000000L);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[3], (long)1500L);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[4], (long)this.IIiiIiiiIIiIi.longValue());
        }
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        if (this.IiIIIiiiiIiiI == 1) {
            int IiiiiiiiIIIII2 = IiiiiiiiIIIII.getExtraPointInt("X");
            this.IiiiiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII2));
            this.IiiiiiiiIIIII[1].setText(String.valueOf(30 - IiiiiiiiIIIII2));
        } else if (this.IiIIIiiiiIiiI == 2) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getExtraPointInt("D");
            this.IiiiiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII3));
            this.IiiiiiiiIIIII[1].setText(String.valueOf(60 - IiiiiiiiIIIII3));
        }
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiIi() {
        this.iIiIiiiiIIiii(this.IiIIIiiiiIiiI);
    }

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        if (this.IiIIIiiiiIiiI == 2) {
            int IiiiiiiiIIIII2 = IiiiiiiiIIIII.getExtraPointInt("X");
            if (IiiiiiiiIIIII2 < 30) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5c0f\u6210\u4fee\u70bc\u5c1a\u672a\u7ed3\u675f");
                return;
            }
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getExtraPointInt("D");
            if (IiiiiiiiIIIII3 >= 60) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u6210\u4fee\u70bc\u5df2\u7ecf\u7ed3\u675f");
                return;
            }
            if (IiiiiiiiIIIII.getExperience().compareTo(new BigDecimal(5000000)) < 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7ecf\u9a8c\u4e0d\u8db3");
                return;
            }
            if (IiiiiiiiIIIII.getContribution().compareTo(new BigDecimal(1500)) < 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5e2e\u8d21\u4e0d\u8db3");
                return;
            }
            if (IiiiiiiiIIIII.getGold().compareTo(this.IIiiIiiiIIiIi) < 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
                return;
            }
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)"6D");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (this.IiIIIiiiiIiiI != 1) return;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII.getExtraPointInt("X");
        if (IiiiiiiiIIIII5 >= 30) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5c0f\u6210\u4fee\u70bc\u5df2\u7ecf\u4fee\u70bc\u5b8c\u6bd5");
            return;
        }
        if (IiiiiiiiIIIII.getExperience().compareTo(new BigDecimal(2000000)) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7ecf\u9a8c\u4e0d\u8db3");
            return;
        }
        if (IiiiiiiiIIIII.getContribution().compareTo(new BigDecimal(300)) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5e2e\u8d21\u4e0d\u8db3");
            return;
        }
        if (IiiiiiiiIIIII.getGold().compareTo(this.IIiiIiiiIIiIi) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)"6X");
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }
}
