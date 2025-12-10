/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIIIiiiIIiII
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiIiIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiIIIiiiIIiII;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIiIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    private BigDecimal iiiiIiiiIiiII = new BigDecimal(100000);
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private com.xy.q.IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private IiIIIiiiIIiII IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private IiIiIiiiiIiii iiIiiiiiiiIii;
    private com.xy.i.iiIiIiiiiIiii IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public IiIIIiiiIIiII ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiIi() {
        void IiiiiiiiIIIII;
        void IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.iIiiIiiiiiiII[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII4.getRgid());
        }
        PartJade IiiiiiiiIIIII5 = (PartJade)this.iIiiIiiiiiiII[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 == null || IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u51c6\u5907\u8981\u5408\u6210\u7684\u88c5\u5907\u548c\u7389\u7b26\u3002");
            return;
        }
        int IiiiiiiiIIIII6 = (int)this.iIiiIiiiiiiII[1].ALLATORIxDEMO();
        if (this.iiiiIiiiIiiII.compareTo(IiiiiiiiIIIII3.getLoginResult().getGold()) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3..");
            return;
        }
        if (IiiiiiiiIIIII4.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        int IiiiiiiiIIIII7 = GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII4.getType());
        if (IiiiiiiiIIIII5.getPartId() == 11) {
            if (IiiiiiiiIIIII7 != 10) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u88c5\u5907\u7c7b\u578b\u548c\u7389\u7b26\u4e0d\u4e00\u81f4..");
                return;
            }
        } else if (IiiiiiiiIIIII7 != IiiiiiiiIIIII5.getPartId()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u88c5\u5907\u7c7b\u578b\u548c\u7389\u7b26\u4e0d\u4e00\u81f4..");
            return;
        }
        SuitOperBean IiiiiiiiIIIII8 = new SuitOperBean();
        ArrayList<BigDecimal> IiiiiiiiIIIII9 = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII9.add(IiiiiiiiIIIII4.getRgid());
        PartJade partJade = new PartJade(IiiiiiiiIIIII5.getSuitid(), IiiiiiiiIIIII5.getPartId());
        IiiiiiiiIIIII2.setJade(IiiiiiiiIIIII6, 1);
        IiiiiiiiIIIII8.setType(0);
        IiiiiiiiIIIII8.setGoods(IiiiiiiiIIIII9);
        IiiiiiiiIIIII8.setJade((PartJade)IiiiiiiiIIIII2);
        String string = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
        IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII6, 1);
        IiiiiiiiIIIII3.getLoginResult().setGold(IiiiiiiiIIIII3.getLoginResult().getGold().subtract(this.iiiiIiiiIiiII));
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < this.iIiiIiiiiiiII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiiIiiiiiiII[IiiiiiiiIIIII10];
            ++IiiiiiiiIIIII10;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86\u4e00\u4e2a" + MsgUntil.ALLATORIxDEMO((int)IiiiiiiiIIIII6) + "\u7389\u7b26..");
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e8610W\u91d1\u5e01..");
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIiiIiiiiiiII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.IIiiIiiiIIiIi.iiiIiiiiiiIIi();
    }

    public com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    /*
     * Unable to fully structure code
     */
    public iiIiIiiiiIiii(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(46, 74, 490, 428, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI();
        this.iIiIiiiiIiIii.setBounds(10, 229, 17, 17);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiiiiiiiIIIII = new com.xy.i.iiIiIiiiiIiii("sc/e/31.png", 1, 1, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5408 \u6210", (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(48, 385, 79, 25);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IIiiIiiiIIiIi = new IiIIIiiiIIiII((IiiiIiiiiIiIi)this, this.iIiIiiiiIiIii);
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii().setBounds(12, 30, 152, 195);
        this.add(this.IIiiIiiiIIiIi.iIiIiiiiIIiii());
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().setBounds(174, 30, 305, 198);
        this.add(this.IIiiIiiiIIiIi.ALLATORIxDEMO());
        this.ALLATORIxDEMO = new JLabel[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)83, (int)155, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u9009\u62e9\u7389\u7b26" : (IiiiiiiiIIIII == 2 ? "\u9009\u62e9\u88c5\u5907" : (IiiiiiiiIIIII == 3 ? "\u53ea\u663e\u793a\u5df2\u6709\u7389\u7b26" : (IiiiiiiiIIIII == 4 ? "\u6d88\u8017\u91d1\u94b1" : "")))));
            if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(218, 83, 307, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(218, 306, 307, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiiiIIi);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(74, 303, 136, 17);
            } else if (IiiiiiiiIIIII == 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(51, 404, 79, 19);
            }
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(this.ALLATORIxDEMO[IiiiiiiiIIIII].getX() - 46, this.ALLATORIxDEMO[IiiiiiiiIIIII].getY() - 74, this.ALLATORIxDEMO[IiiiiiiiIIIII].getWidth(), this.ALLATORIxDEMO[IiiiiiiiIIIII].getHeight());
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)83, (int)330, (int)79, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(68 + IiiiiiiiIIIII * 79 - 46, 263, 50, 50);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            block15: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                                            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
                                            if (IiiiiiiiIIIII != 0) break block14;
                                            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                                            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(55, 83, 155, 21);
                                            break block15;
                                        }
                                        if (IiiiiiiiIIIII != 1) break block16;
                                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(55, 83, 155, 218);
                                        break block15;
                                    }
                                    if (IiiiiiiiIIIII < 2 || IiiiiiiiIIIII > 3) break block17;
                                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(64 + (IiiiiiiiIIIII - 2) * 79, 333, 59, 57);
                                    break block15;
                                }
                                if (IiiiiiiiIIIII < 4 || IiiiiiiiIIIII > 5) break block18;
                                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(65 + (IiiiiiiiIIIII - 4) * 79, 390, 58, 1);
                                break block15;
                            }
                            if (IiiiiiiiIIIII != 6) break block19;
                            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(218, 83, 307, 21);
                            break block15;
                        }
                        if (IiiiiiiiIIIII != 7) break block20;
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(218, 83, 307, 219);
                        break block15;
                    }
                    if (IiiiiiiiIIIII != 8) break block21;
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(217, 326, 309, 156);
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl110
                }
                if (IiiiiiiiIIIII == 9) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(218, 306, 307, 21);
                }
                break block15;
                do {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new IIiiIiiiIiiiI("sc/e/42.png", 1, 0, (IiiiIiiiiIiIi)this) : new IIiiIiiiIiiiI("sc/e/43.png", 1, 1, (IiiiIiiiiIiIi)this);
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(422, 408, 18, 18);
                    } else {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(452, 408, 18, 18);
                    }
                    this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl110:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.iiIiiiiiiiIii = new IiIiIiiiiIiii(1, (IiiiIiiiiIiIi)this, 6, 3, 51, 51, 0, 0, 172, 254);
                this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.iiIiiiiiiiIii.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                this.add((Component)this.iiIiiiiiiiIii);
            }
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getX() - 46, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getY() - 74, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getWidth(), this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].getHeight());
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)this.iiiiIiiiIiiII.longValue());
    }
}
