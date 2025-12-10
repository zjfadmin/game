/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.UseCardBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.ConfirmBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class IiIIIiiiIIiII
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiIII[] IiIIIiiiiIiiI;
    private RichLabel iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public IiIIIiiiIIiII(GameView gameView) {
        super(183, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 402, 400, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6211\u7684\u9753\u53f7");
        this.IiIIIiiiiIiiI = new IIiIiiiiIiIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII == 0 ? "sc/e/6.png" : (IiiiiiiiIIIII == 1 ? "sc/e/7.png" : "sc/e/26.png"), 1, 381 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u6350\u732e" : (IiiiiiiiIIIII == 1 ? "\u7eed\u8d39" : (IiiiiiiiIIIII == 2 ? "\u5f00\u901a\u9753\u53f7" : (IiiiiiiiIIIII == 3 ? "\u9753\u53f7\u67d3\u8272" : (IiiiiiiiIIIII == 4 ? "\u9891\u9053\u663e\u793a" : "")))), (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(323, 191, 34, 18);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.white);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(256, 188, 59, 25);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.black);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(256, 253 + (IiiiiiiiIIIII - 2) * 42, 99, 25);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiiiiiiIIIII = new JLabel[12];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)32, (int)320, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u6548\u679c" : (IiiiiiiiIIIII == 1 ? "\u539f\u59cbID\uff1a" : (IiiiiiiiIIIII == 2 ? "\u5b66\u4e60\u4ea4\u6d41\u7ec3\u4e60\u81ea\u5b6610086" : (IiiiiiiiIIIII == 3 ? "\u9753\u53f7\u5230\u671f\u65f6\u95f4\uff1a" : (IiiiiiiiIIIII == 4 ? "2020\u5e745\u670815\u53f7" : (IiiiiiiiIIIII == 5 ? "\u5230\u671f\u672a\u7eed\u8d39\u5219\u4f1a\u56de\u6536\u9753\u53f7\uff0c\u9700\u91cd\u65b0\u8d2d\u4e70\u6216\u7ade\u62cd" : (IiiiiiiiIIIII == 6 ? "\u6781\u54c1\u9753\u53f7\uff0c" : (IiiiiiiiIIIII == 7 ? "\u5c3d\u4eab\u5c0a\u8d35" : (IiiiiiiiIIIII == 8 ? "\u9753\u53f7\u67d3\u8272\uff0c" : (IiiiiiiiIIIII == 9 ? "\u5f70\u663e\u4e2a\u6027" : (IiiiiiiiIIIII == 10 ? "\u9891\u9053\u663e\u793a\uff0c" : (IiiiiiiiIIIII == 11 ? "\u4e07\u4eba\u77a9\u76ee" : ""))))))))))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                if (IiiiiiiiIIIII == 1) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(60, 60, 54, 14);
                } else if (IiiiiiiiIIIII == 2) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(114, 60, 200, 14);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(60, 193, 91, 14);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(151, 193, 100, 14);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(81, 225, 280, 14);
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.black);
                }
            } else if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 11) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiIIIi);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(77 + (IiiiiiiiIIIII - 6) % 2 * 85, 254 + (IiiiiiiiIIIII - 6) / 2 * 42, 100, 19);
                if (IiiiiiiiIIIII == 6 || IiiiiiiiIIIII == 8 || IiiiiiiiIIIII == 10) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.yellow);
                }
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)100, (int)1, (int)100, (int)1, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(60, 180, 300, 2);
                } else if (IiiiiiiiIIIII == 1) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(60, 283, 300, 2);
                } else if (IiiiiiiiIIIII == 2) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(60, 325, 300, 2);
                }
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(50, 32, 320, 21);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 4) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(50, 32, 320, 190);
                } else if (IiiiiiiiIIIII == 5) {
                    this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(50, 241, 320, 132);
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iiiIiiiiiiIIi() {
        BeauBean IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        UseCardBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLimit("\u9753\u53f7");
        BeauBean beauBean = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIiiiiiiiIii.setTextSize("", 320);
        } else if (IiiiiiiiIIIII.ALLATORIxDEMO()) {
            this.iiIiiiiiiiIii.setTextSize("#VBEAU" + IiiiiiiiIIIII.toString() + "#L", 320);
        } else {
            this.iiIiiiiiiiIii.setTextSize("#cFF00FF" + IiiiiiiiIIIII.getBeau(), 320);
        }
        this.iiIiiiiiiiIii.setBounds(50 + (320 - this.iiIiiiiiiiIii.getWidth()) / 2, 116, this.iiIiiiiiiiIii.getWidth(), this.iiIiiiiiiiIii.getHeight());
        this.IiiiiiiiIIIII[2].setText(String.valueOf(IiiiiiiiIIIII2.getRoleId()));
        if (IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII[4].setText(iIiIIiiiIiiiI.ALLATORIxDEMO((long)IiiiiiiiIIIII3.getTime(), (String)"yyyy\u5e74MM\u6708dd\u65e5"));
            this.IiiiiiiiIIIII[3].setVisible(true);
            this.IiiiiiiiIIIII[4].setVisible(true);
            this.IiIIIiiiiIiiI[0].setVisible(true);
            this.IiIIIiiiiIiiI[1].setVisible(true);
            return;
        }
        this.IiiiiiiiIIIII[3].setVisible(false);
        this.IiiiiiiiIIIII[4].setVisible(false);
        this.IiIIIiiiiIiiI[0].setVisible(false);
        this.IiIIIiiiiIiiI[1].setVisible(false);
    }

    public void iIiIiiiiIIiii(int id) {
        BeauBean IiiiiiiiIIIII;
        if (id == 383) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"BEAU", (String)"V0");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        UseCardBean IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getLimit("\u9753\u53f7");
        BeauBean beauBean = IiiiiiiiIIIII = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (id == 381) {
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(34, null, "\u4f60\u786e\u5b9a\u8981\u653e\u5f03\u8be5\u9753\u53f7\u5417\uff1f"));
            return;
        }
        if (id == 382) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)185, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id != 384) return;
        if (IiiiiiiiIIIII.getLvl() != 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u9753\u53f7\u65e0\u9700\u67d3\u8272");
            return;
        }
        IiiIiiiiIIIii.ALLATORIxDEMO((int)184, (GameView)this.iiIIiiiiIiIIi);
    }
}
