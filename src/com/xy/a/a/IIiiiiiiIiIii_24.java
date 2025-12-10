/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ConfirmBean
 *  com.xy.formula.BaseFly
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIIiiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Fly
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseFly;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIIiiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Fly;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIiiiiiiIiIii
extends IiiiIiiiiIiIi {
    BigDecimal iiiIiiiiiiiIi;
    private iIIiIiiiIiiIi[] iIiiIiiiiiiII;
    private iIIIiiiiiIiIi IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private com.xy.q.IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private com.xy.w.IiiiIiiiiIiIi iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IiIiIiiiiIIiI[] ALLATORIxDEMO;

    public void iiiiiiiiIIiii() {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.iiiIiiiiiiiIi);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IiiiiiiiIIIII.getStatus() != 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u88c5\u5907\u7684\u98de\u884c\u5668\u65e0\u6cd5\u4e22\u5f03");
            return;
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(1, IiiiiiiiIIIII.getRgid().toString(), "#W\u786e\u5b9a\u8981\u5c06#G" + IiiiiiiiIIIII.getGoodsname() + "#W\u7269\u54c1\u4e22\u5f03\u5417?"));
    }

    private synchronized /* synthetic */ void IiiIiiiiiiIiI() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(this.iiiIiiiiiiiIi);
        this.ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2 : IiiiiiiiIIIII.getFlyGood(0));
        if (this.iiiIiiiiiiiIi != null) {
            this.iIiiIiiiiiiII[2].setText(String.valueOf(IiiiiiiiIIIII.getGoodTypeNum(8903)));
            return;
        }
        this.iIiiIiiiiiiII[2].setText(null);
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(this.iiiIiiiiiiiIi);
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        BaseFly baseFly = IiiiiiiiIIIII3.getBaseFly();
        Fly IiiiiiiiIIIII4 = baseFly.getFly(IiiiiiiiIIIII2);
        Fly IiiiiiiiIIIII5 = IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII4.getNext());
        if (baseFly.getLvl() >= IiiiiiiiIIIII4.getLvlMax()) {
            if (IiiiiiiiIIIII5 == null) return;
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)("FJ" + IiiiiiiiIIIII3.getRgid()));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            return;
        }
        Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII.ALLATORIxDEMO(8903L);
        if (IiiiiiiiIIIII7 == null) {
            return;
        }
        String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"rolechange", (String)("FL" + IiiiiiiiIIIII3.getRgid() + "|" + IiiiiiiiIIIII7.getRgid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Goodstable good) {
        block1: {
            if (good != null) break block1;
            this.iiiIiiiiiiiIi = null;
            this.ALLATORIxDEMO[0].setVisible(false);
            this.IiiiiiiiIIIII[0].setText(null);
            this.IiiiiiiiIIIII[4].setText(null);
            this.IiiiiiiiIIIII[5].setText(null);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl30
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        this.iiiIiiiiiiiIi = good.getRgid();
        IiiiiiiiIIIII = good.getBaseFly();
        IiiiiiiiIIIII = IiiiiiiiIIIII.getFly(IiiiiiiiIIIII);
        this.IiiiiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII.getName()) + "(" + MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getLvl()) + ")");
        this.iIiiIiiiiiiII[0].setText(String.valueOf(IiiiiiiiIIIII.getLvl()) + "/" + IiiiiiiiIIIII.getLvlMax());
        this.iIiiIiiiiiiII[1].setText(String.valueOf(IiiiiiiiIIIII.getExp()) + "/" + IiiiiiiiIIIII.getTotalExp(IiiiiiiiIIIII.getLvl() + 1));
        this.iIiiIiiiiiiII[2].setText(String.valueOf(IiiiiiiiIIIII.getGoodTypeNum(8903)));
        this.iIiiIiiiiiiII[3].setText(String.valueOf(IiiiiiiiIIIII.getRl()) + "/" + IiiiiiiiIIIII.getRlMax());
        this.iIiiIiiiiiiII[4].setText(String.valueOf(IiiiiiiiIIIII.getRlUse()));
        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getNext());
        this.IiiiiiiiIIIII[4].setText(String.valueOf(IiiiiiiiIIIII.getSp()));
        this.IiiiiiiiIIIII[5].setText(IiiiiiiiIIIII != null ? String.valueOf(IiiiiiiiIIIII.getSp()) : null);
        this.ALLATORIxDEMO[0].setText(IiiiiiiiIIIII.getLvl() < IiiiiiiiIIIII.getLvlMax() ? "\u4e00\u952e\u5347\u7ea7" : "\u5347\u9636");
        this.ALLATORIxDEMO[0].setVisible(IiiiiiiiIIIII != null || IiiiiiiiIIIII.getLvl() < IiiiiiiiIIIII.getLvlMax());
        this.iiIiiiiiiiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getSn2(), (int)2, (int)1, null);
        return;
        do {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII++].setText(null);
lbl30:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(this.iiiIiiiiiiiIi);
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        BaseFly baseFly = IiiiiiiiIIIII3.getBaseFly();
        Fly IiiiiiiiIIIII4 = baseFly.getFly(IiiiiiiiIIIII2);
        if (baseFly.getRl() >= IiiiiiiiIIIII4.getRlMax()) {
            return;
        }
        Goodstable IiiiiiiiIIIII5 = IiiiiiiiIIIII.ALLATORIxDEMO(8902L);
        if (IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u80cc\u5305\u6ca1\u6709\u76f8\u5e94\u7684\u9053\u5177");
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"rolechange", (String)("FR" + IiiiiiiiIIIII3.getRgid() + "|" + IiiiiiiiIIIII5.getRgid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public IIiiiiiiIiIii(GameView gameView) {
        super(147, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 517, 420, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u98de \u884c ");
        this.IiiiiiiiIIIII = new JLabel[9];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)291, (int)(79 + (IiiiiiiiIIIII - 1) * 24), (int)72, (int)19, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b66\u4e60(\u4ea4\u6d41)" : (IiiiiiiiIIIII == 1 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u7075\u52a8\u503c" : (IiiiiiiiIIIII == 3 ? "\u98de\u884c\u901f\u5ea6" : (IiiiiiiiIIIII == 4 ? "36%" : (IiiiiiiiIIIII == 5 ? "72%" : (IiiiiiiiIIIII == 6 ? "\u71c3\u7075\u503c" : (IiiiiiiiIIIII == 7 ? "\u6bcf\u5206\u6d88\u8017\u71c3\u7075\u503c" : (IiiiiiiiIIIII == 8 ? "1/10" : "")))))))));
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(283, 44, 200, 18);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(4);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(291, 233, 72, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(363, 233, 38, 19);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII == 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(434, 233, 38, 19);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII == 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(69, 241, 52, 19);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(67, 265, 122, 19);
            } else if (IiiiiiiiIIIII == 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(219, 374, 60, 19);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 0 ? "sc/e/26.png" : (IiiiiiiiIIIII == 1 ? "sc/e/6.png" : "sc/e/7.png"), 1, 71 + IiiiiiiiIIIII, IiiiiiiiIIIII == 1 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u4e00\u952e\u5347\u7ea7" : (IiiiiiiiIIIII == 1 ? "\u8865\u5145" : (IiiiiiiiIIIII == 2 ? "\u4e22\u5f03" : "")), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(334, 262, 99, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(238, 242, 34, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(Color.black);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(405, 372, 59, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new iIIiIiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)(IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 2 ? Color.green : (IiiiiiiiIIIII == 1 ? Color.red : Color.white)), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(366, 79 + IiiiiiiiIIIII * 24, 104, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(355, 197, 57, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(131, 241, 142, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(199, 265, 74, 19);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO("sc/d/4.png");
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/item/99102.png");
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(new iiiiiiiiIIIII(4, 4, 50, 50));
        this.IiIIIiiiiIiiI.setBounds(353, 132, 59, 57);
        Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(66721));
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.getType() == 8903L) {
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII2);
        } else {
            this.IiIIIiiiiIiiI.removeMouseListener((MouseListener)this.IiIIIiiiiIiiI);
        }
        this.add((Component)this.IiIIIiiiiIiiI);
        IIiiIiiiIiiiI[] IiiiiiiiIIIII3 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
            IiiiiiiiIIIII3[IiiiiiiiIIIII4] = new IIiiIiiiIiiiI(IiiiiiiiIIIII4 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII4, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII3[IiiiiiiiIIIII4].setBounds(49, 321, 18, 18);
            } else {
                IiiiiiiiIIIII3[IiiiiiiiIIIII4].setBounds(470, 321, 18, 18);
            }
            this.add((Component)IiiiiiiiIIIII3[IiiiiiiiIIIII4++]);
        }
        this.IIiiIiiiIIiIi = new iIIIiiiiiIiIi((IiiiIiiiiIiIi)this, 6, 1, 59, 57, 7, 0, 74, 301);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/4.png"));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII3, 1);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[13];
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII4 == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(63, 45, 210, 190);
            } else if (IiiiiiiiIIIII4 == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/63.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(401, 232, 27, 20);
            } else if (IiiiiiiiIIIII4 == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setVisible(false);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/64.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            } else if (IiiiiiiiIIIII4 == 3 || IiiiiiiiIIIII4 == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/30.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(298, 68 + 157 * (IiiiiiiiIIIII4 - 3), 170, 1);
            } else if (IiiiiiiiIIIII4 >= 5 && IiiiiiiiIIIII4 <= 11) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/30.png");
                if (IiiiiiiiIIIII4 == 11) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(354, 189, 58, 1);
                } else {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(75 + 66 * (IiiiiiiiIIIII4 - 5), 358, 58, 1);
                }
            } else if (IiiiiiiiIIIII4 == 12) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII4].setBounds(46, 32, 440, 264);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII4++]);
        }
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 168, 150, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.IiiIiiiiiiIiI();
        super.iIiIiiiiIIiii();
    }
}
