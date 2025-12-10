/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiIiiiiiiiii
 *  com.xy.a.q.IiIiiiiiIIIII
 *  com.xy.a.q.iIIIIiiiiIIII
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.IIiIiiiiiiiii;
import com.xy.a.q.IiIiiiiiIIIII;
import com.xy.a.q.iIIIIiiiiIIII;
import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class iiiiIiiiiiIiI
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII[] iiiiIiiiIIiii;
    private static Border iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII;
    private JScrollPane iiIIIiiiiiiiI;
    private BigDecimal IiIiiiiiIIIII;
    private JComponent iiIiIiiiiIIIi;
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    private com.xy.q.IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private iiIiIiiiiIiIi iIiiIiiiiiiII;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private IiIiiiiiIIIII[] iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIIiIiiiiIIiI iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    public Goodstable ALLATORIxDEMO(int type) {
        if (type == 0) {
            return (Goodstable)this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII]) != 1) {
                if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII]).ALLATORIxDEMO() == 1) return (Goodstable)com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII]).ALLATORIxDEMO();
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(int type) {
        block7: {
            block6: {
                if (type != -2) break block6;
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl11
            }
            this.iiiiIiiiIiiII[1].setText(type == -1 ? "\u5168\u90e8" : (type == 0 ? "\u6b66\u5668" : (type == 3 ? "\u8863\u670d" : (type == 1 ? "\u5e3d\u5b50" : (type == 2 ? "\u9879\u94fe" : (type == 5 ? "\u978b\u5b50" : ""))))));
            this.iiiiIiiiIiiII[1].setVisible(true);
            IiiiiiiiIIIII = 2;
            if (true) ** GOTO lbl15
            do {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII++].setVisible(false);
lbl11:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length);
            break block7;
            do {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII++].setVisible(false);
lbl15:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length);
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = type == -2 ? IiiiiiiiIIIII.goodChoses : IiiiiiiiIIIII.goodPacks;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII != null && (type < 0 && GoodType.iiiiiiiiIiIiI((long)IiiiiiiiIIIII.getType()) || type >= 0 && type == GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()))) {
                IiiiiiiiIIIII = (iIIIIiiiiIIII)(IiiiiiiiIIIII < this.iiIiIiiiiIIIi.getComponentCount() ? this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII) : null);
                if (IiiiiiiiIIIII == null) {
                    IiiiiiiiIIIII = new iIIIIiiiiIIII(this);
                    IiiiiiiiIIIII.setBounds(0, IiiiiiiiIIIII * 69, 159, 68);
                    this.iiIiIiiiiIIIi.add((Component)IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        IiiiiiiiIIIII = this.iiIiIiiiiIIIi.getComponentCount();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            v0 = (iIIIIiiiiIIII)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = v0;
            v0.ALLATORIxDEMO(null);
        }
        this.iiIiIiiiiIIIi.setPreferredSize(new Dimension(160, 69 * IiiiiiiiIIIII));
        this.ALLATORIxDEMO((iIIIIiiiiIIII)null);
    }

    public void iiiIiiiiiiIIi(int type) {
        this.IIIIiiiiiiiII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IIIIiiiiiiiII);
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiIi(this.IIIIiiiiiiiII == 0 ? -2 : -1);
    }

    public void iIiIiiiiIIiii(int id) {
        if (this.iiiiIiiiIiiII[2].isVisible()) {
            this.iIiIiiiiIIiIi(id == 182 ? 0 : (id == 183 ? 3 : (id == 184 ? 1 : (id == 185 ? 2 : (id == 186 ? 5 : -1)))));
            return;
        }
        this.iiiiIiiiIiiII[1].setText("\u5168\u90e8");
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII++].setVisible(true);
        }
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi(0);
        this.iIiiIiiiiiiII.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getRgid() : null), (BigDecimal)good.getRgid())) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        this.IiIiiiiiIIIII = null;
        this.IIiiIiiiIIiIi.setText(null);
        this.IiIIIiiiiIiiI[1].setText(null);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(0, null);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            IiIiiiiiIIIII iiIiiiiiIIIII = this.iIiIiiiiIiIii[IiiiiiiiIIIII3];
            ++IiiiiiiiIIIII3;
            iiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        }
        this.iIiIiiiiIiIii[2].setVisible(false);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(1, (Object)good);
        IiiiiiiiIIIII3 = GoodType.ALLATORIxDEMO((long)good.getType());
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII3 == 0 ? 3 : 2;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            if (IiiiiiiiIIIII3 == 0) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII4]).setText(IiiiiiiiIIIII4 == 0 ? "\u8d64\u708e\u77f3" : (IiiiiiiiIIIII4 == 1 ? "\u7d2b\u70df\u77f3" : "\u5b54\u96c0\u77f3"));
            } else if (IiiiiiiiIIIII3 == 1) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII4]).setText(IiiiiiiiIIIII4 == 0 ? "\u843d\u661f\u77f3" : "\u8299\u84c9\u77f3");
            } else if (IiiiiiiiIIIII3 == 2) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII4]).setText(IiiiiiiiIIIII4 == 0 ? "\u6c90\u9633\u77f3" : "\u8299\u84c9\u77f3");
            } else if (IiiiiiiiIIIII3 == 3) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII4]).setText(IiiiiiiiIIIII4 == 0 ? "\u843d\u661f\u77f3" : "\u6c90\u9633\u77f3");
            } else if (IiiiiiiiIIIII3 == 5) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII4]).setText(IiiiiiiiIIIII4 == 0 ? "\u7409\u7483\u77f3" : "\u5bd2\u5c71\u77f3");
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 == 0) {
            this.iIiIiiiiIiIii[2].setVisible(true);
        }
        if (IiiiiiiiIIIII3 == 0) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{746L, 755L, 767L});
        } else if (IiiiiiiiIIIII3 == 1) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{749L, 761L});
        } else if (IiiiiiiiIIIII3 == 2) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{749L, 764L});
        } else if (IiiiiiiiIIIII3 == 3) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{761L, 764L});
        } else if (IiiiiiiiIIIII3 == 5) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{752L, 758L});
        }
        String IiiiiiiiIIIII22 = GoodType.getExtra((String)good.getValue(), (String)"\u5b9d\u77f3\u5c5e\u6027");
        if (IiiiiiiiIIIII22 == null) {
            return;
        }
        String[] IiiiiiiiIIIII32 = IiiiiiiiIIIII22.split("&");
        int IiiiiiiiIIIII6 = 1;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII32.length) {
            int IiiiiiiiIIIII7;
            BigDecimal IiiiiiiiIIIII8 = new BigDecimal(IiiiiiiiIIIII32[IiiiiiiiIIIII6]);
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getGoodEquip(IiiiiiiiIIIII8);
            if (IiiiiiiiIIIII != null && (IiiiiiiiIIIII7 = GoodType.ALLATORIxDEMO((int)IiiiiiiiIIIII3, (long)IiiiiiiiIIIII.getType())) != 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII7 - 1].ALLATORIxDEMO(1, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII6;
        }
        IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII9 = this.iiIiIiiiiIIIi.getComponentCount();
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII9) {
            iIIIIiiiiIIII IiiiiiiiIIIII10 = (iIIIIiiiiIIII)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII6);
            if (!IiiiiiiiIIIII10.isVisible()) {
                return;
            }
            if (iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)IiiiiiiiIIIII10)[0].ALLATORIxDEMO() == good.getRgid().longValue()) {
                IiiiiiiiIIIII10.ALLATORIxDEMO(good);
                return;
            }
            ++IiiiiiiiIIIII6;
        }
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII]) != imgGrid) {
                ++IiiiiiiiIIIII;
                continue;
            }
            if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII]) != 0) {
                return;
            }
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.IiIiiiiiIIIII = null;
            this.IIiiIiiiIIiIi.setText(null);
            this.IiIIIiiiiIiiI[1].setText(null);
            return;
        }
    }

    public void iiiIiiiiiiIIi() {
        com.xy.v.iiIIiiiiIiiII IiiiiiiiIIIII9;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO(0);
        Goodstable IiiiiiiiIIIII4 = this.ALLATORIxDEMO(1);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII4 == null) return;
        if (IiiiiiiiIIIII3.getRgid().compareTo(IiiiiiiiIIIII4.getRgid()) == 0) {
            return;
        }
        if (IiiiiiiiIIIII3.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        if (IiiiiiiiIIIII4.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
            return;
        }
        if (IiiiiiiiIIIII4.getStatus() == 1) {
            return;
        }
        int IiiiiiiiIIIII5 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII4.getValue());
        BigDecimal IiiiiiiiIIIII6 = new BigDecimal(5000000 + IiiiiiiiIIIII5 * 1000000);
        if (IiiiiiiiIIIII2.getLoginResult().getGold().longValue() < IiiiiiiiIIIII6.longValue()) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        List IiiiiiiiIIIII7 = IiiiiiiiIIIII2.ALLATORIxDEMO(new com.xy.v.iiIIiiiiIiiII[]{new com.xy.v.iiIIiiiiIiiII(81095L, (long)(IiiiiiiiIIIII5 <= 4 ? 1 : IiiiiiiiIIIII5 - 3))});
        if (IiiiiiiiIIIII7 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u591f" + (IiiiiiiiIIIII5 <= 4 ? 1 : IiiiiiiiIIIII5 - 3) + "\u4e2a\u5b9d\u77f3\u7cbe\u534e");
            return;
        }
        ArrayList<BigDecimal> IiiiiiiiIIIII8 = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII8.add(IiiiiiiiIIIII3.getRgid());
        IiiiiiiiIIIII8.add(IiiiiiiiIIIII4.getRgid());
        for (com.xy.v.iiIIiiiiIiiII IiiiiiiiIIIII9 : IiiiiiiiIIIII7) {
            BigDecimal IiiiiiiiIIIII10 = new BigDecimal(IiiiiiiiIIIII9.ALLATORIxDEMO);
            int IiiiiiiiIIIII11 = 0;
            while ((long)IiiiiiiiIIIII11 < IiiiiiiiIIIII9.IiiiiiiiIIIII) {
                ++IiiiiiiiIIIII11;
                IiiiiiiiIIIII8.add(IiiiiiiiIIIII10);
            }
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII7);
        IiiiiiiiIIIII4.setStatus(Integer.valueOf(1));
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII4.getRgid());
        IiiiiiiiIIIII2.getLoginResult().setGold(IiiiiiiiIIIII2.getLoginResult().getGold().subtract(IiiiiiiiIIIII6));
        IiiiiiiiIIIII9 = new SuitOperBean();
        IiiiiiiiIIIII9.setType(20);
        IiiiiiiiIIIII9.setGoods(IiiiiiiiIIIII8);
        String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII9));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
    }

    public iiiiIiiiiiIiI(GameView gameView) {
        super(84, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 552, 375, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5b9d\u77f3\u6253\u9020");
        this.iiiiIiiiIIiii = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 171 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u5df2\u88c5\u5907" : (IiiiiiiiIIIII == 1 ? "\u5176\u4ed6" : ""), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIIiii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(49 + 65 * IiiiiiiiIIIII, 22, 63, 24);
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            iiiiIiiiiiIiI iiiiIiiiiiIiI2 = this;
            if (IiiiiiiiIIIII == 0) {
                iiiiIiiiiiIiI2.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/7.png", 1, 180, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6253\u9020", (IiiiIiiiiIiIi)this);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(349, 241, 59, 25);
                this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII]);
            } else {
                iiiiIiiiiiIiI2.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/28.png", 1, 180 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", (IiiiIiiiiIiIi)this);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 1 ? "\u5168\u90e8" : (IiiiiiiiIIIII == 2 ? "\u6b66\u5668" : (IiiiiiiiIIIII == 3 ? "\u8863\u670d" : (IiiiiiiiIIIII == 4 ? "\u5e3d\u5b50" : (IiiiiiiiIIIII == 5 ? "\u9879\u94fe" : (IiiiiiiiIIIII == 6 ? "\u978b\u5b50" : ""))))));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(156, 48 + (IiiiiiiiIIIII - 1) * 18, 68, 18);
                this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new MoneyType();
        this.ALLATORIxDEMO.setIdAndKey(1, "\u91d1\u94b1");
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)363, (int)188, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)363, (int)211, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.ALLATORIxDEMO, (GameView)gameView);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6d88\u8017\u7cbe\u534e" : (IiiiiiiiIIIII == 1 ? "99/9999" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 3 ? "\u62e5\u6709\u91d1\u94b1" : ""))));
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(298, 159, 58, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(400, 159, 80, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(298, 188, 58, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(298, 211, 58, 19);
            }
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new IIiIiiiiiiiii(this);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)68, (int)180, (int)277, (Component)this.iiIiIiiiiIIIi, (int)20);
        this.add(this.iiIIIiiiiiiiI);
        this.iiiIiiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        IIIiiiiiIiIiI IiiiiiiiIIIII2 = new IIIiiiiiIiIiI("sc/d/4.png");
        this.iiiIiiiiiiiIi.setBounds(260, 71, 50, 50);
        IiiiiiiiIIIII2.setBounds(256, 67, 59, 57);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)IiiiiiiiIIIII2);
        this.iIiIiiiiIiIii = new IiIiiiiiIIIII[3];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3] = new IiIiiiiiIIIII(this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(329 + 57 * IiiiiiiiIIIII3, 67, 52, 70);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII3++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII3 == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(49, 46, 180, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(49, 46, 180, 300);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(246, 58, 260, 80);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)"744"));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(366, 157, 23, 23);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(362, 153, 31, 31);
            } else if (IiiiiiiiIIIII3 == 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(245, 282, 258, 54);
                this.iiIiiiiiiiIii = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this, 5, 1, 51, 51, 0, 0, 246, 284);
                this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.add((Component)this.iiIiiiiiiiIii);
            } else if (IiiiiiiiIIIII3 == 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/74.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(228, 46, 300, 300);
            } else if (IiiiiiiiIIIII3 == 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)290, (int)290, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII3].setBounds(231, 49, 294, 294);
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public void ALLATORIxDEMO(Goodstable good) {
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        int IiiiiiiiIIIII2 = GoodType.ALLATORIxDEMO((int)GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()), (long)good.getType()) - 1;
        if (IiiiiiiiIIIII2 == -1) {
            return;
        }
        if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII2]) == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5df2\u6253\u9020\u8be5\u7c7b\u578b\u5b9d\u77f3");
            return;
        }
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII3]) != 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].ALLATORIxDEMO(0, null);
            }
            ++IiiiiiiiIIIII3;
        }
        this.iIiIiiiiIiIii[IiiiiiiiIIIII2].ALLATORIxDEMO(0, good);
        IiiiiiiiIIIII3 = MsgUntil.getGoodLvl((String)good.getValue());
        this.IiIIIiiiiIiiI[1].setText(String.valueOf(IiiiiiiiIIIII3 <= 4 ? 1 : IiiiiiiiIIIII3 - 3) + "/" + this.ALLATORIxDEMO().getGoodNum(new BigDecimal(81095)));
        this.IiIiiiiiIIIII = new BigDecimal(5000000 + IiiiiiiiIIIII3 * 1000000);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIiiIiiiIIiIi, (long)this.IiIiiiiiIIIII.longValue());
    }

    public void ALLATORIxDEMO(Object data) {
        IiIiiiiiIIIII IiiiiiiiIIIII = (IiIiiiiiIIIII)data;
        if (com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)IiiiiiiiIIIII) != 1) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iiiIiiiiiiiIi.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)IiiiiiiiIIIII).ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) return;
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
        IiiiiiiiIIIII5.append("#Y\u4f60\u786e\u5b9a\u82b1\u8d39#R ");
        IiiiiiiiIIIII5.append(MsgUntil.getGoodLvl((String)IiiiiiiiIIIII4.getValue()) * 3200000);
        IiiiiiiiIIIII5.append(" #Y\u91d1\u94b1\u62c6\u5378\u8be5\u5b9d\u77f3\u5417?");
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(19, IiiiiiiiIIIII3.getRgid() + "|" + IiiiiiiiIIIII4.getRgid(), IiiiiiiiIIIII5.toString()));
    }

    public void ALLATORIxDEMO(iIIIIiiiiIIII view) {
        Goodstable IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = this.iiIiIiiiiIIIi.getComponentCount();
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII3) {
            iIIIIiiiiIIII IiiiiiiiIIIII4 = (iIIIIiiiiIIII)this.iiIiIiiiiIIIi.getComponent(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII4.isVisible()) {
                if (IiiiiiiiIIIII4 == view) {
                    if (iIIiIiiiiiiIi == null) {
                        iIIiIiiiiiiIi = BorderFactory.createLineBorder(Color.YELLOW, 2);
                    }
                    IiiiiiiiIIIII4.setBorder(iIIiIiiiiiiIi);
                } else {
                    IiiiiiiiIIIII4.setBorder(BorderFactory.createEmptyBorder());
                }
            }
            ++IiiiiiiiIIIII2;
        }
        iiiiIiiiiiIiI iiiiIiiiiiIiI2 = this;
        this.IiIiiiiiIIIII = null;
        iiiiIiiiiiIiI2.IIiiIiiiIIiIi.setText(null);
        this.IiIIIiiiiIiiI[1].setText(null);
        iiiiIiiiiiIiI2.iiiIiiiiiiiIi.ALLATORIxDEMO(0, null);
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiIiiiiIiIii.length) {
            IiIiiiiiIIIII iiIiiiiiIIIII = this.iIiIiiiiIiIii[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            iiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        }
        this.iIiIiiiiIiIii[2].setVisible(false);
        RoleData IiiiiiiiIIIII22 = this.ALLATORIxDEMO();
        Goodstable goodstable = IiiiiiiiIIIII = view != null ? (Goodstable)iIIIIiiiiIIII.ALLATORIxDEMO((iIIIIiiiiIIII)view)[0].ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII22.getGood(IiiiiiiiIIIII.getRgid());
        }
        if (IiiiiiiiIIIII == null) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{-1L});
            return;
        }
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
        int IiiiiiiiIIIII5 = GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType());
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII5 == 0 ? 3 : 2;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII7) {
            if (IiiiiiiiIIIII5 == 0) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII6]).setText(IiiiiiiiIIIII6 == 0 ? "\u8d64\u708e\u77f3" : (IiiiiiiiIIIII6 == 1 ? "\u7d2b\u70df\u77f3" : "\u5b54\u96c0\u77f3"));
            } else if (IiiiiiiiIIIII5 == 1) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII6]).setText(IiiiiiiiIIIII6 == 0 ? "\u843d\u661f\u77f3" : "\u8299\u84c9\u77f3");
            } else if (IiiiiiiiIIIII5 == 2) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII6]).setText(IiiiiiiiIIIII6 == 0 ? "\u6c90\u9633\u77f3" : "\u8299\u84c9\u77f3");
            } else if (IiiiiiiiIIIII5 == 3) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII6]).setText(IiiiiiiiIIIII6 == 0 ? "\u843d\u661f\u77f3" : "\u6c90\u9633\u77f3");
            } else if (IiiiiiiiIIIII5 == 5) {
                com.xy.a.q.IiIiiiiiIIIII.ALLATORIxDEMO((IiIiiiiiIIIII)this.iIiIiiiiIiIii[IiiiiiiiIIIII6]).setText(IiiiiiiiIIIII6 == 0 ? "\u7409\u7483\u77f3" : "\u5bd2\u5c71\u77f3");
            }
            ++IiiiiiiiIIIII6;
        }
        if (IiiiiiiiIIIII5 == 0) {
            this.iIiIiiiiIiIii[2].setVisible(true);
        }
        if (IiiiiiiiIIIII5 == 0) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{746L, 755L, 767L});
        } else if (IiiiiiiiIIIII5 == 1) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{749L, 761L});
        } else if (IiiiiiiiIIIII5 == 2) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{749L, 764L});
        } else if (IiiiiiiiIIIII5 == 3) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{761L, 764L});
        } else if (IiiiiiiiIIIII5 == 5) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(new long[]{752L, 758L});
        }
        String IiiiiiiiIIIII32 = GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)"\u5b9d\u77f3\u5c5e\u6027");
        if (IiiiiiiiIIIII32 == null) {
            return;
        }
        String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII32.split("&");
        int IiiiiiiiIIIII8 = 1;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII4.length) {
            int IiiiiiiiIIIII9;
            BigDecimal IiiiiiiiIIIII10 = new BigDecimal(IiiiiiiiIIIII4[IiiiiiiiIIIII8]);
            Goodstable IiiiiiiiIIIII11 = IiiiiiiiIIIII22.getGoodEquip(IiiiiiiiIIIII10);
            if (IiiiiiiiIIIII11 != null && (IiiiiiiiIIIII9 = GoodType.ALLATORIxDEMO((int)IiiiiiiiIIIII5, (long)IiiiiiiiIIIII11.getType())) != 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII9 - 1].ALLATORIxDEMO(1, IiiiiiiiIIIII11);
            }
            ++IiiiiiiiIIIII8;
        }
    }
}
