/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.SuitOperBean
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
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIiIiiiiIiii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class IIiiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private iiIiIiiiiIiIi[] IIIIiiiiiiiII;
    private IIIiiiiiIiIiI[] iiIIIiiiiiiiI;
    private com.xy.q.IIIiiiiiIiIiI[] IiIiiiiiIIIII;
    private iiIiIiiiiIiii[] iiIiIiiiiIIIi;
    private BigDecimal iiiiIiiiIiiII;
    private BigDecimal iiiIiiiiiiiIi;
    private MoneyType iIiiIiiiiiiII;
    private iIIiIiiiIiiIi[] IIiiIiiiIIiIi;
    private IiIiIiiiiIiii iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private MoneyType iiIiiiiiiiIii;
    private IiIiIiiiiIiii IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        this.iiiiIiiiIiiII = null;
        this.iiiIiiiiiiiIi = null;
        this.ALLATORIxDEMO = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII++].setText(null);
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiIiiiiiIIIII[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.IiIiiiiiIIIII[2].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) return;
        this.iiiiIiiiIiiII = new BigDecimal(100000);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[0], (long)this.iiiiIiiiIiiII.longValue());
        if (IiiiiiiiIIIII4 == null) return;
        this.iiiIiiiiiiiIi = new BigDecimal(10000000);
        this.ALLATORIxDEMO = new BigDecimal(MsgUntil.getSxlxz((String)IiiiiiiiIIIII3.getValue()));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[1], (long)this.iiiIiiiiiiiIi.longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi[3], (long)this.ALLATORIxDEMO.longValue());
    }

    public void iIiIiiiiIIiIi() {
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.iIiIiiiiIiIii.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.IiIiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.IiiIiiiiiiIiI();
        this.iiiIiiiiiiIIi();
    }

    public com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMoney(this.iiIiiiiiiiIii);
        this.IIIIiiiiiiiII[0].ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.IIIIiiiiiiiII[1].ALLATORIxDEMO(IiiiiiiiIIIII2);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII.getMoney(this.iIiiIiiiiiiII);
        this.IIIIiiiiiiiII[2].ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.IIIIiiiiiiiII[3].ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiii(int id) {
        SuitOperBean IiiiiiiiIIIII;
        ArrayList<BigDecimal> IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.IiIiiiiiIIIII[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII5 = (Goodstable)this.IiIiiiiiIIIII[2].ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII5.getRgid());
        }
        if (id == 5) {
            if (IiiiiiiiIIIII4 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4f60\u8981\u62c6\u89e3\u7684\u5957\u88c5..");
                return;
            }
            if (IiiiiiiiIIIII4.getGoodlock() == 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                return;
            }
            if (IiiiiiiiIIIII3.getLoginResult().getGold().compareTo(this.iiiiIiiiIiiII) < 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3..");
                return;
            }
            IiiiiiiiIIIII2 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII4.getRgid());
            SuitOperBean suitOperBean = new SuitOperBean();
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.setType(5);
            String string = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(string);
            IiiiiiiiIIIII3.getLoginResult().setGold(IiiiiiiiIIIII3.getLoginResult().getGold().subtract(this.iiiiIiiiIiiII));
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e8610W\u91d1\u5e01..");
        } else if (id == 6) {
            if (IiiiiiiiIIIII4 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u542b\u6709\u5957\u88c5\u5c5e\u6027\u7684\u88c5\u5907..");
                return;
            }
            if (IiiiiiiiIIIII5 == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4f60\u8981\u8f6c\u79fb\u5c5e\u6027\u7684\u88c5\u5907..");
                return;
            }
            if (IiiiiiiiIIIII4.getGoodlock() == 1 || IiiiiiiiIIIII5.getGoodlock() == 1) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                return;
            }
            if (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII4.getType()) != GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII5.getType())) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u88c5\u5907\u7c7b\u578b\u4e0d\u4e00\u81f4..");
                return;
            }
            if (IiiiiiiiIIIII3.getLoginResult().getGold().compareTo(this.iiiIiiiiiiiIi) < 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3..");
                return;
            }
            if (IiiiiiiiIIIII3.getLoginResult().getScoretype("\u7075\u4fee\u503c").longValue() < this.ALLATORIxDEMO.longValue()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7075\u4fee\u503c\u4e0d\u8db3..");
                return;
            }
            IiiiiiiiIIIII2 = new ArrayList();
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII4.getRgid());
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII5.getRgid());
            IiiiiiiiIIIII = new SuitOperBean();
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII2);
            IiiiiiiiIIIII.setType(6);
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            IiiiiiiiIIIII3.getLoginResult().setGold(IiiiiiiiIIIII3.getLoginResult().getGold().subtract(this.iiiIiiiiiiiIi));
            IiiiiiiiIIIII3.getLoginResult().setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII3.getLoginResult().getScore(), (String)("\u7075\u4fee\u503c=" + this.ALLATORIxDEMO.toString()), (int)3));
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e861000W\u91d1\u5e01..");
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86" + this.ALLATORIxDEMO + "\u70b9\u7075\u4fee\u503c..");
        }
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.IiIiiiiiIIIII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.IiIiiiiiIIIII[IiiiiiiiIIIII7];
            ++IiiiiiiiIIIII7;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.IiiIiiiiiiIiI();
    }

    /*
     * Unable to fully structure code
     */
    public IIiiIiiiiIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(46, 74, 490, 428, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiIiIiiiiIIIi = new iiIiIiiiiIiii[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/31.png", 1, 5 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u62c6 \u89e3" : (IiiiiiiiIIIII == 1 ? "\u8f6c \u79fb" : ""), (IiiiIiiiiIiIi)this);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(89 + 244 * IiiiiiiiIIIII, 385, 79, 25);
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new JLabel[12];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(66 + 241 * IiiiiiiiIIIII), (int)88, (int)180, (int)17, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5" : (IiiiiiiiIIIII == 1 ? "\u672a\u5408\u6210\u7389\u7b26\u88c5\u5907" : (IiiiiiiiIIIII == 2 ? "\u62c6\u89e3\u7389\u7b26" : (IiiiiiiiIIIII == 3 ? "\u8f6c\u79fb\u7389\u7b26" : (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 6 || IiiiiiiiIIIII == 7 ? "\u62e5\u6709\u91d1\u94b1" : (IiiiiiiiIIIII == 8 || IiiiiiiiIIIII == 9 ? "\u6d88\u8017\u7075\u4fee\u503c" : (IiiiiiiiIIIII == 10 || IiiiiiiiIIIII == 11 ? "\u62e5\u6709\u7075\u4fee\u503c" : ""))))))));
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiIiiiIIiIi);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(78 + (IiiiiiiiIIIII - 2) * 244, 249, 100, 23);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 11) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(62 + (IiiiiiiiIIIII - 4) % 2 * 244, 349 + (IiiiiiiiIIIII - 4) / 2 * 26, 90, 19);
            }
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getX() - 46, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getY() - 74, this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getWidth(), this.IiIIIiiiiIiiI[IiiiiiiiIIIII].getHeight());
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iIIiIiiiIiiIi[4];
        this.IIIIiiiiiiiII = new iiIiIiiiiIiIi[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(154, 349, 118, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(398, 349, 118, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(154, 401, 118, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(398, 401, 118, 19);
            }
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getX() - 46, this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getY() - 74, this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getWidth(), this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getHeight());
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new MoneyType();
        this.iIiiIiiiiiiII = new MoneyType();
        this.iiIiiiiiiiIii.setIdAndKey(1, "\u91d1\u94b1");
        this.iIiiIiiiiiiII.setIdAndKey(0, "\u7075\u4fee\u503c");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(154, 375, 118, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(398, 375, 118, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(154, 427, 118, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(398, 427, 118, 19);
            }
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(this.IIIIiiiiiiiII[IiiiiiiiIIIII].getX() - 46, this.IIIIiiiiiiiII[IiiiiiiiIIIII].getY() - 74, this.IIIIiiiiiiiII[IiiiiiiiIIIII].getWidth(), this.IIIIiiiiiiiII[IiiiiiiiIIIII].getHeight());
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IiIiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(95, 207, 50, 50);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(287 + (IiiiiiiiIIIII - 1) * 115, 207, 50, 50);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new IIIiiiiiIiIiI[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            block36: {
                block41: {
                    block40: {
                        block39: {
                            block38: {
                                block37: {
                                    block35: {
                                        this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                                        this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII]);
                                        if (IiiiiiiiIIIII < 0 || IiiiiiiiIIIII > 1) break block35;
                                        this.iiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                                        this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(63 + IiiiiiiiIIIII * 241, 108, 207, 105);
                                        break block36;
                                    }
                                    if (IiiiiiiiIIIII < 2 || IiiiiiiiIIIII > 3) break block37;
                                    this.iiIIIiiiiiiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                                    this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(58 + (IiiiiiiiIIIII - 2) * 244, 249, 190, 23);
                                    break block36;
                                }
                                if (IiiiiiiiIIIII < 4 || IiiiiiiiIIIII > 6) break block38;
                                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                                if (IiiiiiiiIIIII == 4) {
                                    this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(137, 277, 59, 57);
                                } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 6) {
                                    this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(329 + (IiiiiiiiIIIII - 5) * 115, 277, 59, 57);
                                }
                                break block36;
                            }
                            if (IiiiiiiiIIIII != 7) break block39;
                            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/69.png");
                            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(401, 278, 30, 56);
                            break block36;
                        }
                        if (IiiiiiiiIIIII < 8 || IiiiiiiiIIIII > 9) break block36;
                        if (IiiiiiiiIIIII != 8) break block40;
                        IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl131
                    }
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl146
                    do {
                        IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new IIiiIiiiIiiiI("sc/e/42.png", 1, 0, (IiiiIiiiiIiIi)this) : new IIiiIiiiIiiiI("sc/e/43.png", 1, 1, (IiiiIiiiiIiIi)this);
                        if (IiiiiiiiIIIII == 0) {
                            IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(160, 140, 18, 18);
                        } else {
                            IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(189, 140, 18, 18);
                        }
                        this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl131:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    this.IiiiiiiiIIIII = new IiIiIiiiiIiii(2, (IiiiIiiiiIiIi)this, 4, 2, 51, 51, 0, 0, 18, 36);
                    this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                    this.IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                    this.add((Component)this.IiiiiiiiIIIII);
                    break block41;
                    do {
                        IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new IIiiIiiiIiiiI("sc/e/42.png", 1, 0, (IiiiIiiiiIiIi)this) : new IIiiIiiiIiiiI("sc/e/43.png", 1, 1, (IiiiIiiiiIiIi)this);
                        if (IiiiiiiiIIIII == 0) {
                            IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(401, 140, 18, 18);
                        } else {
                            IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(430, 140, 18, 18);
                        }
                        this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl146:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    this.iIiIiiiiIiIii = new IiIiIiiiiIiii(1, (IiiiIiiiiIiIi)this, 4, 2, 51, 51, 0, 0, 259, 36);
                    this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                    this.iIiIiiiiIiIii.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                    this.add((Component)this.iIiIiiiiIiIii);
                }
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(52 + (IiiiiiiiIIIII - 8) * 244, 243, 229, 248);
            }
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(this.iiIIIiiiiiiiI[IiiiiiiiIIIII].getX() - 46, this.iiIIIiiiiiiiI[IiiiiiiiIIIII].getY() - 74, this.iiIIIiiiiiiiI[IiiiiiiiIIIII].getWidth(), this.iiIIIiiiiiiiI[IiiiiiiiIIIII++].getHeight());
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }
}
