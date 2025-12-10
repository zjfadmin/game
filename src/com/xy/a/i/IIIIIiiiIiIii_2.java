/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.RoleSuitBean
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
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
import com.xy.readbean.RoleSuitBean;
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

public class IIIIIiiiIiIii
extends IiiiIiiiiIiIi {
    private com.xy.q.IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private iiIiIiiiiIiii iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private MoneyType iIiIiiiiIiIii;
    private BigDecimal IiIIIiiiiIiiI;
    private IiIiIiiiiIiii iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private iiIiIiiiiIiIi ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI() {
        void IiiiiiiiIIIII;
        void IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.iiiiIiiiIiiII[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII4.getRgid());
        }
        PartJade IiiiiiiiIIIII5 = (PartJade)this.iiiiIiiiIiiII[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 == null || IiiiiiiiIIIII5 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u51c6\u5907\u8981\u5347\u7ea7\u7684\u88c5\u5907\u548c\u7389\u7b26\u3002");
            return;
        }
        int IiiiiiiiIIIII6 = (int)this.iiiiIiiiIiiII[1].ALLATORIxDEMO();
        if (this.IiIIIiiiiIiiI.compareTo(IiiiiiiiIIIII3.getLoginResult().getGold()) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3..");
            return;
        }
        if (IiiiiiiiIIIII4.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        SuitOperBean IiiiiiiiIIIII7 = new SuitOperBean();
        ArrayList<BigDecimal> IiiiiiiiIIIII8 = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII8.add(IiiiiiiiIIIII4.getRgid());
        PartJade partJade = new PartJade(IiiiiiiiIIIII5.getSuitid(), IiiiiiiiIIIII5.getPartId());
        IiiiiiiiIIIII2.setJade(IiiiiiiiIIIII6, 1);
        IiiiiiiiIIIII7.setType(3);
        IiiiiiiiIIIII7.setGoods(IiiiiiiiIIIII8);
        IiiiiiiiIIIII7.setJade((PartJade)IiiiiiiiIIIII2);
        String IiiiiiiiIIIII9 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII7));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII9);
        String IiiiiiiiIIIII10 = GoodType.getExtra((String)IiiiiiiiIIIII4.getValue(), (String)"\u5957\u88c5\u5c5e\u6027");
        String[] IiiiiiiiIIIII11 = IiiiiiiiIIIII4.getValue().split("\\|");
        String string = MsgUntil.ALLATORIxDEMO((int)1, (String)IiiiiiiiIIIII10);
        IiiiiiiiIIIII11[0] = "\u5957\u88c5\u54c1\u8d28=" + MsgUntil.ALLATORIxDEMO((int)3, (String)IiiiiiiiIIIII10);
        IiiiiiiiIIIII4.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII11, (int)3, (String)IiiiiiiiIIIII));
        IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII6, 1);
        IiiiiiiiIIIII3.getLoginResult().setGold(IiiiiiiiIIIII3.getLoginResult().getGold().subtract(this.IiIIIiiiiIiiI));
        int IiiiiiiiIIIII12 = 0;
        while (IiiiiiiiIIIII12 < this.iiiiIiiiIiiII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiiiIiiiIiiII[IiiiiiiiIIIII12];
            ++IiiiiiiiIIIII12;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86\u4e00\u4e2a" + MsgUntil.ALLATORIxDEMO((int)IiiiiiiiIIIII6) + "\u7389\u7b26..");
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86" + this.IiIIIiiiiIiiI.longValue() / 10000L + "W\u91d1\u5e01..");
    }

    public void iIiIiiiiIIiIi() {
        this.iiiiIiiiIiiII[1].ALLATORIxDEMO(0, null);
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.iiiiIiiiIiiII[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGoodsname().split("\\\u00b7")[0];
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII2.getValue().split("\\|")[1].split("=")[1]);
        RoleSuitBean IiiiiiiiIIIII5 = this.ALLATORIxDEMO().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        PartJade IiiiiiiiIIIII6 = this.ALLATORIxDEMO().getPackRecord().getPartJade(IiiiiiiiIIIII5.getSuitID(), IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII6.ALLATORIxDEMO()) return;
        int IiiiiiiiIIIII7 = MsgUntil.ALLATORIxDEMO((String)MsgUntil.ALLATORIxDEMO((int)0, (String)GoodType.getExtra((String)IiiiiiiiIIIII2.getValue(), (String)"\u5957\u88c5\u5c5e\u6027")));
        if (IiiiiiiiIIIII7 >= 5) return;
        if (IiiiiiiiIIIII6.getJade(IiiiiiiiIIIII7 + 1) <= 0) return;
        this.iiiiIiiiIiiII[1].ALLATORIxDEMO(100 + IiiiiiiiIIIII7 + 1, (Object)IiiiiiiiIIIII6);
    }

    public com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    /*
     * Unable to fully structure code
     */
    public IIIIIiiiIiIii(GameView var1_1) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, var1_1);
        this.IiIIIiiiiIiiI = new BigDecimal(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) != false ? 1000000 : (this.ALLATORIxDEMO().gameType == 2 ? 5000000 : 10000000));
        this.ALLATORIxDEMO(46, 74, 490, 428, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiiIiiiiiiII = new iiIiIiiiiIiii("sc/e/31.png", 1, 3, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5347 \u7ea7", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(289, 337, 79, 25);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)57, (int)88, (int)37, (int)17, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5" : (IiiiiiiiIIIII == 1 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 2 ? "\u62e5\u6709\u91d1\u94b1" : "")));
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(279, 345 + (IiiiiiiiIIIII - 1) * 26, 72, 19);
            }
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(this.IiiiiiiiIIIII[IiiiiiiiIIIII].getX() - 46, this.IiiiiiiiIIIII[IiiiiiiiIIIII].getY() - 74, this.IiiiiiiiIIIII[IiiiiiiiIIIII].getWidth(), this.IiiiiiiiIIIII[IiiiiiiiIIIII].getHeight());
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new MoneyType();
        this.iIiIiiiiIiIii.setIdAndKey(1, "\u73b0 \u91d1");
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)308, (int)297, (int)118, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iIiIiiiiIiIii, (GameView)gameView);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(2);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)308, (int)271, (int)118, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiiiIiiiIiiII = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(241 + IiiiiiiiIIIII * 120, 84, 50, 50);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            block16: {
                block15: {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                    this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != 0) break block15;
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(59, 109, 156, 360);
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl75
                }
                if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 3) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                    if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                        this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(283 + (IiiiiiiiIIIII - 1) * 120, 154, 59, 57);
                    } else if (IiiiiiiiIIIII == 3) {
                        this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(343, 254, 59, 57);
                    }
                } else if (IiiiiiiiIIIII == 4) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/71.png");
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(345, 221, 56, 30);
                } else if (IiiiiiiiIIIII == 5) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(229, 111, 289, 358);
                }
                break block16;
                do {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new IIiiIiiiIiiiI("sc/e/42.png", 1, 0, (IiiiIiiiiIiIi)this) : new IIiiIiiiIiiiI("sc/e/43.png", 1, 1, (IiiiIiiiiIiIi)this);
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(111, 395, 18, 18);
                    } else {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(140, 395, 18, 18);
                    }
                    this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl75:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.iiIiiiiiiiIii = new IiIiIiiiiIiii(2, (IiiiIiiiiIiIi)this, 3, 7, 51, 51, 0, 0, 14, 37);
                this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.iiIiiiiiiiIii.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                this.add((Component)this.iiIiiiiiiiIii);
            }
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getX() - 46, this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getY() - 74, this.IIiiIiiiIIiIi[IiiiiiiiIIIII].getWidth(), this.IIiiIiiiIIiIi[IiiiiiiiIIIII++].getHeight());
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)this.IiIIIiiiiIiiI.longValue());
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiiiIiiiIiiII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
    }
}
