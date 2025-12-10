/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiIiIiiiiiIiI
 *  com.xy.a.w.iiiIiiiiIiiiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.formula.UtilSkin
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiIiIiiiiiIiI;
import com.xy.a.w.iiiIiiiiIiiiI;
import com.xy.bean.ConfirmBean;
import com.xy.formula.UtilSkin;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIiIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private JLabel[] iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII = 0;
    private IIiIiiiiIiIII[] iiIIIiiiiiiiI;
    private IIIiiiiiIiIiI[] IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private iiiIiiiiIiiiI[] iiiiIiiiIiiII;
    private int iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private com.xy.w.IiiiIiiiiIiIi IIiiIiiiIIiIi;
    private com.xy.w.IiiiIiiiiIiIi iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private IIiIiiiiIiIII IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        if (this.iiIIiiiiIiIIi.getBattleScene() != null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.goodChoses.length) {
            if (IiiiiiiiIIIII.getEquipGood(IiiiiiiiIIIII2) != null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u5378\u4e0b\u6240\u6709\u88c5\u5907\u3001\u661f\u5361\u3001\u98de\u884c\u5668\uff01");
                return;
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.IIIIiiiiiiiII == 0 && this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
            IiiiiiiiIIIII3.append("\u4f60\u662f\u5426\u6d88\u8017500W\u5927\u8bdd\u5e01\u5c06\u89d2\u8272\u66f4\u6362\u4e3a:");
            IiiiiiiiIIIII3.append(UtilSkin.getLocalName((int)this.iiIiiiiiiiIii.intValue()));
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(89, String.valueOf(this.IIIIiiiiiiiII) + "|" + this.iiIiiiiiiiIii, IiiiiiiiIIIII3.toString()));
            return;
        }
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"racialtransformation", (String)(String.valueOf(this.IIIIiiiiiiiII) + "|" + this.iiIiiiiiiiIii));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public void iIiIiiiiIIiii(int id) {
        this.iiIiIiiiiIIIi = id;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setKeep(id == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        this.iIIiIiiiiiiIi[1].setText("\u7537" + (this.iiIiIiiiiIIIi == 0 ? "\u4eba" : (this.iiIiIiiiiIIIi == 1 ? "\u9b54" : (this.iiIiIiiiiIIIi == 2 ? "\u4ed9" : (this.iiIiIiiiiIIIi == 3 ? "\u9b3c" : "\u9f99")))));
        this.iIIiIiiiiiiIi[2].setText("\u5973" + (this.iiIiIiiiiIIIi == 0 ? "\u4eba" : (this.iiIiIiiiiIIIi == 1 ? "\u9b54" : (this.iiIiIiiiiIIIi == 2 ? "\u4ed9" : (this.iiIiIiiiiIIIi == 3 ? "\u9b3c" : "\u9f99")))));
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiIi() {
        this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII = 20000 + this.iiIiIiiiiIIIi * 1000;
        int IiiiiiiiIIIII2 = this.iiiIiiiiiiiIi / 2;
        if (!(this.ALLATORIxDEMO().gameType != 2 && this.ALLATORIxDEMO().gameType != 3 && this.ALLATORIxDEMO().gameType != 1 || this.ALLATORIxDEMO().ALLATORIxDEMO(2, 4) || this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11) || this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12))) {
            if (this.iiIiIiiiiIIIi == 4) {
                if (IiiiiiiiIIIII2 > 3) {
                    IiiiiiiiIIIII2 = 3;
                }
            } else if (this.iiIiIiiiiIIIi == 3) {
                if (IiiiiiiiIIIII2 > 3 && IiiiiiiiIIIII2 != 6) {
                    IiiiiiiiIIIII2 = 3;
                }
                if (IiiiiiiiIIIII2 > 4) {
                    IiiiiiiiIIIII2 = 4;
                }
            } else if (IiiiiiiiIIIII2 > 6) {
                IiiiiiiiIIIII2 = 6;
            }
        } else if (this.iiIiIiiiiIIIi == 4) {
            if (IiiiiiiiIIIII2 > 3) {
                IiiiiiiiIIIII2 = 3;
            }
        } else if (this.iiIiIiiiiIIIi == 3) {
            if (IiiiiiiiIIIII2 > 3 && IiiiiiiiIIIII2 != 6) {
                IiiiiiiiIIIII2 = 3;
            }
            if (IiiiiiiiIIIII2 > 3) {
                IiiiiiiiIIIII2 = 3;
            }
        } else if (IiiiiiiiIIIII2 > 5) {
            IiiiiiiiIIIII2 = 5;
        }
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
            int IiiiiiiiIIIII4 = 0;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3 < 3 ? IiiiiiiiIIIII + IiiiiiiiIIIII3 + (this.ALLATORIxDEMO ? 4 : 1) : IiiiiiiiIIIII + (this.ALLATORIxDEMO ? IiiiiiiiIIIII3 * 2 + 2 : IiiiiiiiIIIII3 * 2 + 1);
            iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)this.iiiiIiiiIiiII[IiiiiiiiIIIII3], (BigDecimal)new BigDecimal(IiiiiiiiIIIII4));
            iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)this.iiiiIiiiIiiII[IiiiiiiiIIIII3], (Image)IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)String.valueOf(IiiiiiiiIIIII4))));
            this.iiiiIiiiIiiII[IiiiiiiiIIIII3++].setVisible(true);
        }
        this.ALLATORIxDEMO(this.iiiiIiiiIiiII[0]);
    }

    public IIiIIiiiIIIiI(GameView gameView) {
        super(41, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 500, 420, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.iiIIIiiiiiiiI = new IIiIiiiiIiIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/64.png", 2, 351 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4eba\u65cf" : (IiiiiiiiIIIII == 1 ? "\u9b54\u65cf" : (IiiiiiiiIIIII == 2 ? "\u4ed9\u65cf" : (IiiiiiiiIIIII == 3 ? "\u9b3c\u65cf" : (IiiiiiiiIIIII == 4 ? "\u9f99\u65cf" : "")))), (IiiiIiiiiIiIi)this);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(38 + 86 * IiiiiiiiIIIII, 25, 79, 33);
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIiIiiiiIiIII("sc/e/31.png", 1, 361, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8f6c\u79cd\u65cf", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(304, 355, 79, 25);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIIiIiiiiiiIi = new JLabel[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)215, (int)67, (int)200, (int)17, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b66\u4e60\u7ec3\u4e60\u4ea4\u6d41" : (IiiiiiiiIIIII == 1 ? "\u7537\u4eba" : (IiiiiiiiIIIII == 2 ? "\u5973\u4eba" : (IiiiiiiiIIIII == 3 ? "\u6b66" : (IiiiiiiiIIIII == 4 ? "\u5668" : (IiiiiiiiIIIII == 5 ? "\u9884" : (IiiiiiiiIIIII == 6 ? "\u89c8" : "")))))));
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(61 + (IiiiiiiiIIIII - 1) * 79, 369, 36, 18);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 6) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(211, 234 + 17 * (IiiiiiiiIIIII - 3), 15, 16);
            }
            this.add(this.iIIiIiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setBounds(215, 82, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/37.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(41, 66, 68, 88);
        this.IiIIIiiiiIiiI.setVisible(false);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiiiIiiiIiiII = new iiiIiiiiIiiiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new iiiIiiiiIiiiI(this, IiiiiiiiIIIII);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(40 + IiiiiiiiIIIII % 2 * 78, 65 + IiiiiiiiIIIII / 2 * 100, 70, 90);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(30, 39, 445, 20);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                if (IiiiiiiiIIIII == 1) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/62.png");
                } else if (IiiiiiiiIIIII == 2) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/63.png");
                }
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].addMouseListener((MouseListener)new IiIiIiiiiiIiI(this, 1, IiiiiiiiIIIII - 1));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(41 + (IiiiiiiiIIIII - 1) * 79, 369, 18, 18);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/72.png");
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(184, 64, 34, 326);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 5) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(235 + (IiiiiiiiIIIII - 4) * 112, 205, 98, 132);
            } else if (IiiiiiiiIIIII == 6) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(30, 58, 445, 340);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII++].setVisible(false);
        }
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IIiIIiiiIIIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(iiiIiiiiIiiiI roleView) {
        this.iiIiiiiiiiIii = iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)roleView);
        this.IiIIIiiiiIiiI.setBounds(roleView.getX() + 1, roleView.getY() + 1, 68, 88);
        this.IIiiIiiiIIiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)roleView).toString(), (int)9, (int)1, null);
        this.iIiIiiiiIiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((String)iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)roleView).toString(), (int)5, (int)1, null);
        this.iIiiIiiiiiiII.setTextSize(UtilSkin.getRaceMsg((BigDecimal)iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)roleView)), 250);
        this.iIiiIiiiiiiII.setBounds(215, 82, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
    }

    public boolean ALLATORIxDEMO() {
        this.IIiiIiiiIIiIi = null;
        this.iIiIiiiiIiIii = null;
        return super.ALLATORIxDEMO();
    }

    static /* synthetic */ void ALLATORIxDEMO(IIiIIiiiIIIiI arg0, boolean arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    public void ALLATORIxDEMO(int leixing, int number) {
        this.IIIIiiiiiiiII = leixing;
        this.iiiIiiiiiiiIi = number;
        this.iIiIiiiiIIiii(0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(IIiIIiiiIIIiI arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IIiiIiiiIIiIi != null) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(g, 280, 325, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
        }
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(g, 400, 325, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }
}
