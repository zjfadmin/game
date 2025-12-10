/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.NpcComposeBean
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.bean.NpcComposeBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iIiIIiiiIIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class IIIiIiiiIiIII
extends IiiiIiiiiIiIi {
    private iiiiiiiiiiIiI iiIIIiiiiiiiI;
    private iIIiIiiiIiiIi IiIiiiiiIIIII;
    private JLabel[] iiIiIiiiiIIIi;
    private MoneyType iiiiIiiiIiiII;
    private iIiIIiiiIIIiI[] iiiIiiiiiiiIi;
    private IiiiiiiiiIIII[] iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private IiiiiiiiiIIII[] iIiIiiiiIiIii;
    private iiIiIiiiiIiIi IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private IIiiIiiiIiiiI[] IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.IiiiiiiiIIIII = this.ALLATORIxDEMO(this.iiIIIiiiiiiiI, this.IiiiiiiiIIIII, 356, 281);
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi() {
        block28: {
            block29: {
                block27: {
                    if (this.iiIIiiiiIiIIi.ALLATORIxDEMO() != false) return;
                    if (this.ALLATORIxDEMO == null) {
                        return;
                    }
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    if (IiiiiiiiIIIII.getLoginResult().getGold().longValue() < this.ALLATORIxDEMO.longValue()) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
                        return;
                    }
                    IiiiiiiiIIIII = this.IIiiIiiiIIiIi == 1 ? 5 : (this.IIiiIiiiIIiIi == 3 ? 1 : 2);
                    IiiiiiiiIIIII = new Goodstable[IiiiiiiiIIIII];
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO().ALLATORIxDEMO();
                        if (IiiiiiiiIIIII != null) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                        }
                        if (IiiiiiiiIIIII == null) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                            return;
                        }
                        if (IiiiiiiiIIIII.getGoodlock() == 1) {
                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                            return;
                        }
                        if (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()) != -1) {
                            if (GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[3]) != null) {
                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5957\u88c5\u65e0\u6cd5\u7528\u4e8e\u6253\u9020\u7cfb\u5217");
                                return;
                            }
                            if (GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[4]) != null || IiiiiiiiIIIII.getQhv() != null && IiiiiiiiIIIII.getQhv() > 0) {
                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u9576\u5d4c\u5b9d\u77f3\u65e0\u6cd5\u7528\u4e8e\u6253\u9020\u7cfb\u5217");
                                return;
                            }
                        }
                        IiiiiiiiIIIII[IiiiiiiiIIIII++] = IiiiiiiiIIIII;
                    }
                    v0 = this.IIiiIiiiIIiIi == 0 ? "\u6211\u8981\u6d17\u7ec3\u7b26\u77f3" : (this.IIiiIiiiIIiIi == 1 ? "\u6211\u8981\u5408\u6210\u7b26\u77f3" : (this.IIiiIiiiIIiIi == 2 ? "\u5206\u89e3\u7b26\u77f3" : (IiiiiiiiIIIII = this.IIiiIiiiIIiIi == 3 ? "\u5f3a\u5316\u7b26\u77f3" : null)));
                    if (IiiiiiiiIIIII == null) {
                        return;
                    }
                    if (this.IIiiIiiiIIiIi != 0) break block27;
                    if (IiiiiiiiIIIII[0].getType().longValue() != IiiiiiiiIIIII[1].getType().longValue()) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f8\u9700\u89812\u4e2a\u7b26\u77f3\u6216\u80052\u4e2a\u7b26\u77f3\u5f3a\u5316\u77f3");
                        return;
                    }
                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[0].getValue());
                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[1].getValue());
                    v1 = IiiiiiiiIIIII = this.ALLATORIxDEMO().gameType == 2 ? 2 : 3;
                    if (IiiiiiiiIIIII <= IiiiiiiiIIIII) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5c0f\u4e8e\u7b49\u4e8e" + IiiiiiiiIIIII + "\u7ea7\u7b26\u77f3\u4e0d\u80fd\u6d17\u7ec3");
                        return;
                    }
                    if (IiiiiiiiIIIII - IiiiiiiiIIIII != IiiiiiiiIIIII) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII) + "\u7ea7\u7b26\u77f3\u7528" + (IiiiiiiiIIIII - IiiiiiiiIIIII) + "\u7b26\u77f3\u6d17\u7ec3");
                        return;
                    }
                    if (GoodType.getExtra((String)IiiiiiiiIIIII[0].getValue(), (String)GoodType.Extras[1]) != null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7b26\u77f3\u5f3a\u5316\u540e\u65e0\u6cd5\u91cd\u94f8");
                    }
                    break block28;
                }
                if (this.IIiiIiiiIIiIi != 1) break block29;
                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[0].getValue());
                if (IiiiiiiiIIIII >= 5) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u652f\u63015\u7ea7\u4ee5\u4e0a\u5408\u6210");
                    return;
                }
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl79
            }
            if (this.IIiiIiiiIIiIi == 2) {
                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[0].getValue());
                if (IiiiiiiiIIIII != 5) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("5\u7ea7\u7b26\u77f3\u624d\u80fd\u5206\u89e3");
                    return;
                }
            } else {
                if (this.IIiiIiiiIIiIi != 3) return;
                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[0].getValue());
                if (IiiiiiiiIIIII != 5) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("5\u7ea7\u7b26\u77f3\u624d\u80fd\u5f3a\u5316");
                    return;
                }
                IiiiiiiiIIIII = GoodType.getExtra((String)IiiiiiiiIIIII[0].getValue(), (String)GoodType.Extras[1]);
                if (IiiiiiiiIIIII != null && Integer.parseInt((IiiiiiiiIIIII = IiiiiiiiIIIII.split("&"))[1]) >= 10) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u591a\u53ea\u80fd\u5f3a\u531610\u6b21");
                    return;
                }
            }
            break block28;
            do {
                if (MsgUntil.getGoodLvl((String)IiiiiiiiIIIII[0].getValue()) != IiiiiiiiIIIII) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5408\u6210\u7269\u54c1\u9700\u8981\u540c\u7b49\u7ea7");
                    return;
                }
                ++IiiiiiiiIIIII;
lbl79:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        }
        if (!ParamTool.ALLATORIxDEMO((long)this.ALLATORIxDEMO.longValue(), (GameView)this.iiIIiiiiIiIIi)) {
            return;
        }
        IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII[IiiiiiiiIIIII].setUsetime(Integer.valueOf(0));
            } else {
                IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(1);
            }
            IiiiiiiiIIIII.add(IiiiiiiiIIIII[IiiiiiiiIIIII].getRgid());
            if (IiiiiiiiIIIII[IiiiiiiiIIIII].getUsetime() <= 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].getRgid());
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = new NpcComposeBean();
        IiiiiiiiIIIII.setComposetype(IiiiiiiiIIIII);
        IiiiiiiiIIIII.setGoodstables(IiiiiiiiIIIII);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"npccompose", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int type) {
        block5: {
            this.IIiiIiiiIIiIi = type;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IIiiIiiiIIiIi);
                ++IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII++].setVisible(false);
            }
            if (this.IIiiIiiiIIiIi == 0) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().gameType == 2 ? 2 : 3;
                this.iiIiIiiiiIIIi[2].setText("\u4f7f\u7528\u5c0f\u4e8e\u4e3b\u7b26\u77f3" + IiiiiiiiIIIII + "\u4e2a\u7b49\u7ea7\u7684\u7b26\u77f3\u91cd\u94f8");
                this.iiIiIiiiiIIIi[2].setVisible(true);
                this.iIiiIiiiiiiII[0].setText("\u91cd\u94f8");
                this.iIiiIiiiiiiII[1].setText("\u91cd\u94f8\u89c4\u5219");
                this.iiiIiiiiiiiIi[0].setBounds(174, 95, 59, 58);
                this.iiiIiiiiiiiIi[1].setBounds(174, 167, 59, 58);
                this.iiiIiiiiiiiIi[0].setVisible(true);
                this.iiiIiiiiiiiIi[1].setVisible(true);
                return;
            }
            if (this.IIiiIiiiIIiIi != 1) break block5;
            this.iiIiIiiiiIIIi[2].setText("5\u4e2a\u96645\u7ea7\u7b26\u77f3\u5916\u4efb\u610f\u540c\u7ea7\u7b26\u77f3\u53ef\u5347\u7ea7\u9ad8\u4e00\u7ea7\u7684\u7b26\u77f3");
            this.iiIiIiiiiIIIi[2].setVisible(true);
            this.iIiiIiiiiiiII[0].setText("\u5347\u7ea7");
            this.iIiiIiiiiiiII[1].setText("\u5347\u7ea7\u89c4\u5219");
            this.iiiIiiiiiiiIi[0].setBounds(60, 95, 59, 58);
            this.iiiIiiiiiiiIi[1].setBounds(117, 95, 59, 58);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl51
        }
        if (this.IIiiIiiiIIiIi == 2) {
            this.iiIiIiiiiIIIi[2].setVisible(false);
            this.iIiiIiiiiiiII[0].setText("\u5206\u89e3");
            this.iIiiIiiiiiiII[1].setText("\u5206\u89e3\u89c4\u5219");
            this.iiiIiiiiiiiIi[0].setBounds(174, 95, 59, 58);
            this.iiiIiiiiiiiIi[0].setVisible(true);
            return;
        }
        if (this.IIiiIiiiIIiIi != 3) return;
        this.iiIiIiiiiIIIi[2].setVisible(false);
        this.iIiiIiiiiiiII[0].setText("\u5f3a\u5316");
        this.iIiiIiiiiiiII[1].setText("\u5f3a\u5316\u89c4\u5219");
        this.iiiIiiiiiiiIi[0].setBounds(174, 95, 59, 58);
        this.iiiIiiiiiiiIi[1].setBounds(174, 167, 59, 58);
        this.iiiIiiiiiiiIi[0].setVisible(true);
        this.iiiIiiiiiiiIi[1].setVisible(true);
        return;
        do {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII++].setVisible(true);
lbl51:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length);
    }

    public IIIiIiiiIiIII(GameView gameView) {
        super(70, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 392, 505, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u7b26\u77f3\u91cd\u94f8");
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/66.png", 2, 123 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u91cd\u94f8" : (IiiiiiiiIIIII == 1 ? "\u5347\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u5206\u89e3" : (IiiiiiiiIIIII == 3 ? "\u5f3a\u5316" : ""))), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(59 + 65 * IiiiiiiiIIIII, 18, 58, 33);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/7.png", 1, 131 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u5347\u7ea7" : (IiiiiiiiIIIII == 1 ? "\u5347\u7ea7\u89c4\u5219" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(Color.black);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setImage("sc/e/28.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(275, 203, 68, 18);
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(277, 241, 59, 25);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)71, (int)(235 + 20 * IiiiiiiiIIIII), (int)72, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u91d1\u94b1" : (IiiiiiiiIIIII == 2 ? "5\u4e2a\u96645\u7ea7\u7b26\u77f3\u5916\u4efb\u610f\u540c\u7ea7\u7b26\u77f3\u53ef\u5347\u7ea7\u9ad8\u4e00\u7ea7\u7684\u7b26\u77f3" : "")));
            if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(53, 63, 300, 15);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFF00"));
            }
            this.add(this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new MoneyType();
        this.iiiiIiiiIiiII.setIdAndKey(1, "\u91d1\u94b1");
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)143, (int)235, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)143, (int)255, (int)124, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiiiIiiiIiiII, (GameView)gameView);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IiIiiiiiIIIII);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iiiIiiiiiiiIi = new iIiIIiiiIIIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new iIiIIiiiIIIiI((IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII < 5) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(60 + IiiiiiiiIIIII * 57, 95, 59, 58);
            } else {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(174, 167, 59, 58);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 32, 310, 20);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 51, 310, 230);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 281, 309, 207);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIIIiiiiiiiI = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 48, 283);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiIIIiiiiiiiI.iIiIiiiiIIiii(true);
        this.add((Component)this.iiIIIiiiiiiiI);
        if (this.ALLATORIxDEMO().VALUE.indexOf(73) != -1) return;
        this.iIiIiiiiIiIii[2].setVisible(false);
        this.iIiIiiiiIiIii[3].setVisible(false);
    }

    public void iiiIiiiiiiIIi() {
        if (this.IIiiIiiiIIiIi == 0 || this.IIiiIiiiIIiIi == 2 || this.IIiiIiiiIIiIi == 3) {
            if (this.iiiIiiiiiiiIi[0].ALLATORIxDEMO().ALLATORIxDEMO() != 1) {
                this.ALLATORIxDEMO = null;
                this.IiIiiiiiIIIII.setText(null);
                return;
            }
            this.ALLATORIxDEMO = new BigDecimal(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? 100000 : 1000000);
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiIIIII, (long)this.ALLATORIxDEMO.longValue());
            return;
        }
        if (this.IIiiIiiiIIiIi != 1) return;
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.ALLATORIxDEMO = null;
            this.IiIiiiiiIIIII.setText(null);
            return;
        }
        int IiiiiiiiIIIII2 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
        this.ALLATORIxDEMO = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? new BigDecimal(100000 * IiiiiiiiIIIII2) : new BigDecimal(1000000 * IiiiiiiiIIIII2);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiIIIII, (long)this.ALLATORIxDEMO.longValue());
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Goodstable goodTable) {
        block18: {
            block17: {
                block16: {
                    if (this.IIiiIiiiIIiIi != 0) break block16;
                    IiiiiiiiIIIII = goodTable.getType();
                    if (IiiiiiiiIIIII != 188L && IiiiiiiiIIIII != 187L) {
                        return;
                    }
                    IiiiiiiiIIIII = -1;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl39
                }
                if (this.IIiiIiiiIIiIi != 1) break block17;
                IiiiiiiiIIIII = goodTable.getType();
                if (IiiiiiiiIIIII != 188L) {
                    return;
                }
                IiiiiiiiIIIII = -1;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl51
            }
            if (this.IIiiIiiiIIiIi != 2) break block18;
            IiiiiiiiIIIII = goodTable.getType();
            if (IiiiiiiiIIIII != 188L) {
                return;
            }
            IiiiiiiiIIIII = -1;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl63
        }
        if (this.IIiiIiiiIIiIi != 3) return;
        IiiiiiiiIIIII = goodTable.getType();
        if (IiiiiiiiIIIII != 188L && IiiiiiiiIIIII != 187L) {
            return;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII == 188L ? 0 : 1;
        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)goodTable);
        this.iiiIiiiiiiIIi();
        return;
        do {
            if ((IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO().ALLATORIxDEMO()) != null && IiiiiiiiIIIII.getRgid().compareTo(goodTable.getRgid()) == 0) {
                return;
            }
            if (IiiiiiiiIIIII == null && IiiiiiiiIIIII == -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
lbl39:
            // 2 sources

        } while (IiiiiiiiIIIII < 2);
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = 0;
        }
        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)goodTable);
        this.iiiIiiiiiiIIi();
        return;
        do {
            if ((IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO().ALLATORIxDEMO()) != null && IiiiiiiiIIIII.getRgid().compareTo(goodTable.getRgid()) == 0) {
                return;
            }
            if (IiiiiiiiIIIII == null && IiiiiiiiIIIII == -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
lbl51:
            // 2 sources

        } while (IiiiiiiiIIIII < 5);
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = 0;
        }
        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)goodTable);
        this.iiiIiiiiiiIIi();
        return;
        do {
            if ((IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO().ALLATORIxDEMO()) != null && IiiiiiiiIIIII.getRgid().compareTo(goodTable.getRgid()) == 0) {
                return;
            }
            if (IiiiiiiiIIIII == null && IiiiiiiiIIIII == -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
lbl63:
            // 2 sources

        } while (IiiiiiiiIIIII < true);
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = 0;
        }
        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)goodTable);
        this.iiiIiiiiiiIIi();
    }
}
