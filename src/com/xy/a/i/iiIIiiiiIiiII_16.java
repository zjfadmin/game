/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiiiiiIiIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiIiIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IIIiiiiiIiIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIiIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iiIIiiiiIiiII
extends IiiiIiiiiIiIi {
    private com.xy.w.IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IiIiIiiiiIiii IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI IiiiiiiiIIIII;
    private iiIiIiiiiIiii ALLATORIxDEMO;

    public com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < 6) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].setText("");
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        String IiiiiiiiIIIII4 = GoodType.getExtra((String)IiiiiiiiIIIII3.getValue(), (String)GoodType.Extras[3]);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.split("\\&");
        int IiiiiiiiIIIII6 = 4;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII5.length) {
            void IiiiiiiiIIIII7;
            String[] stringArray = IiiiiiiiIIIII5[IiiiiiiiIIIII6].split("\\=");
            this.iiIiiiiiiiIii[2 + 2 * (IiiiiiiiIIIII6 - 4)].setText((String)IiiiiiiiIIIII7[0]);
            this.iiIiiiiiiiIii[2 + 2 * (IiiiiiiiIIIII6 - 4) + 1].setText(String.valueOf(IiiiiiiiIIIII7[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII7[0]));
            if (IiiiiiiiIIIII6 == 1) {
                return;
            }
            ++IiiiiiiiIIIII6;
        }
    }

    /*
     * Unable to fully structure code
     */
    public iiIIiiiiIiiII(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(46, 74, 490, 428, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = new iiIiIiiiiIiii("sc/e/31.png", 1, 2, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, com.xy.q.iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6d17 \u7ec3", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(289, 292, 79, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)57, (int)88, (int)37, (int)17, (int)0, (Color)com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5" : (IiiiiiiiIIIII == 1 ? "\u73b0\u6709\u5957\u88c5\u5c5e\u6027" : ""));
            if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(276, 253, 191, 20);
            }
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(com.xy.q.iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                if (IiiiiiiiIIIII == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(276, 273, 135, 27);
                } else if (IiiiiiiiIIIII == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(411, 273, 56, 27);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(276, 300, 135, 27);
                } else if (IiiiiiiiIIIII == 5) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(411, 300, 56, 27);
                }
            }
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(this.iiIiiiiiiiIii[IiiiiiiiIIIII].getX() - 46, this.iiIiiiiiiiIii[IiiiiiiiIIIII].getY() - 74, this.iiIiiiiiiiIii[IiiiiiiiIIIII].getWidth(), this.iiIiiiiiiiIii[IiiiiiiiIIIII].getHeight());
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(302, 104, 50, 50);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new com.xy.w.IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            block29: {
                block28: {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
                    this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != 0) break block28;
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(59, 109, 156, 360);
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl83
                }
                if (IiiiiiiiIIIII == 1) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(344, 174, 59, 57);
                } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 6) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    if (IiiiiiiiIIIII == 2) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(276, 253, 191, 20);
                    } else if (IiiiiiiiIIIII == 3) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(276, 273, 135, 27);
                    } else if (IiiiiiiiIIIII == 4) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(411, 273, 56, 27);
                    } else if (IiiiiiiiIIIII == 5) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(276, 300, 135, 27);
                    } else if (IiiiiiiiIIIII == 6) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(411, 300, 56, 27);
                    }
                } else if (IiiiiiiiIIIII == 9) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(229, 111, 289, 358);
                }
                break block29;
                do {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new IIiiIiiiIiiiI("sc/e/42.png", 1, 0, (IiiiIiiiiIiIi)this) : new IIiiIiiiIiiiI("sc/e/43.png", 1, 1, (IiiiIiiiiIiIi)this);
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(111, 395, 18, 18);
                    } else {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(140, 395, 18, 18);
                    }
                    this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl83:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.IiIIIiiiiIiiI = new IiIiIiiiiIiii(2, (IiiiIiiiiIiIi)this, 3, 7, 51, 51, 0, 0, 14, 37);
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.IiIIIiiiiIiiI.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                this.add((Component)this.IiIIIiiiiIiiI);
            }
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(this.iIiIiiiiIiIii[IiiiiiiiIIIII].getX() - 46, this.iIiIiiiiIiIii[IiiiiiiiIIIII].getY() - 74, this.iIiIiiiiIiIii[IiiiiiiiIIIII].getWidth(), this.iIiIiiiiIiIii[IiiiiiiiIIIII++].getHeight());
        }
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4f60\u8981\u6d17\u70bc\u7684\u5957\u88c5..");
            return;
        }
        if (IiiiiiiiIIIII2.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        ((IIIiiiiiIiIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(74)).iIiIiiiiIIiii(IiiiiiiiIIIII2);
    }

    public void iiiIiiiiiiIIi() {
        this.IiiiiiiiIIIII.ALLATORIxDEMO(0, null);
        this.IiiIiiiiiiIiI();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
    }
}
