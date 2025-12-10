/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiiiIiiiiiIIi
 *  com.xy.bean.GiveGoodsBean
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Bbuy
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.q.IiiiIiiiiiIIi;
import com.xy.bean.GiveGoodsBean;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.IIiIiiiiIiIII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiIiii
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI iiiiIiiiIiiII;
    private IIiIIiiiIIIiI[] iiiIiiiiiiiIi;
    private com.xy.i.IiiiiiiiiIIII iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private iiiiiiiiiiIiI IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private com.xy.d.iiiiiiiiiiIiI IiiiiiiiIIIII;
    private IIiiIiiiIiiiI[] ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public IiIIIiiiiIiii(GameView gameView) {
        super(12, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 392, 375, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u7ed9\u4e88");
        this.iIiiIiiiiiiII = new com.xy.i.IiiiiiiiiIIII("sc/e/7.png", 1, 73, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u7ed9\u4e88", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(293, 274, 59, 25);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new IIiIIiiiIIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            void IiiiiiiiIIIII2;
            IiiiIiiiiIiII iiiiIiiiiIiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            IiiiiiiiIIIII2.setBounds(101, 266 + IiiiiiiiIIIII * 28, 154, 19);
            IiiiiiiiIIIII2.setHorizontalAlignment(10);
            this.add((Component)IiiiiiiiIIIII2);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII++] = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        }
        this.IIiiIiiiIIiIi = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)(266 + 28 * IiiiiiiiIIIII), (int)58, (int)19, (int)4, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6570 \u91cf" : (IiiiiiiiIIIII == 1 ? "\u94f6 \u4e24" : (IiiiiiiiIIIII == 2 ? "\u73a9\u5bb6\uff1a" : (IiiiiiiiIIIII == 3 ? "\u5b66\u4e60\u4ea4\u6d41" : ""))));
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFF0000"));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(52, 325, 58, 19);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            }
            if (IiiiiiiiIIIII == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(102, 325, 250, 19);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI();
        this.iiiiIiiiIiiII.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
        this.iiiiIiiiIiiII.setBounds(44, 46, 309, 207);
        this.add((Component)this.iiiiIiiiIiiII);
        this.IiIIIiiiiIiiI = new IiiiIiiiiiIIi(this, (IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 45, 48);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(true);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(true);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iiiiiiiiIIiii() {
        this.iIiIiiiiIiIii = 0;
        this.iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int type, Goodstable goodTable, int count, IIiIiiiiIiIII NpcUnit) {
        void IiiiiiiiIIIII;
        Bbuy IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(goodTable.getGoodsid());
        if (IiiiiiiiIIIII2 == null || IiiiiiiiIIIII2.getPrice1() == 0L && type == 1 || IiiiiiiiIIIII2.getPrice2() == 0L && type == 2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u5c5e\u4e8e\u56de\u6536\u8303\u56f4");
            return;
        }
        GiveGoodsBean giveGoodsBean = new GiveGoodsBean();
        IiiiiiiiIIIII.setType(type);
        IiiiiiiiIIIII.setRgid(goodTable.getRgid());
        IiiiiiiiIIIII.setSum(count);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"give", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO(goodTable.getRgid());
    }

    /*
     * Handled impossible loop by duplicating code
     */
    public void ALLATORIxDEMO(BigDecimal rgid) {
        block7: {
            int IiiiiiiiIIIII;
            int IiiiiiiiIIIII2;
            RoleData IiiiiiiiIIIII3;
            IiiiiiiiiIIII IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5;
            block6: {
                int n;
                if (this.iIiIiiiiIiIii == 1) {
                    n = 1;
                } else {
                    if (this.iIiIiiiiIiIii != 2) return;
                    n = 2;
                }
                IiiiiiiiIIIII5 = n;
                if (IiiiiiiiIIIII5 == 0) {
                    return;
                }
                IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
                IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
                IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.iiiIiiiiiiIIi() + this.IiIIIiiiiIiiI.ALLATORIxDEMO().length;
                IiiiiiiiIIIII = IiiiiiiiIIIII2 - 24;
                if (!true) break block6;
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII3.goodPacks.length) return;
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII2) break block7;
            }
            do {
                Bbuy IiiiiiiiIIIII6;
                Goodstable IiiiiiiiIIIII7;
                if ((IiiiiiiiIIIII7 = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII3.goodPacks[IiiiiiiiIIIII])) != null && (rgid == null || IiiiiiiiIIIII7.getRgid().compareTo(rgid) != 0) && IiiiiiiiIIIII7.getGoodlock() != 1 && (IiiiiiiiIIIII6 = IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII7.getGoodsid())) != null && (IiiiiiiiIIIII5 == 1 && IiiiiiiiIIIII6.getPrice1() != 0L || IiiiiiiiIIIII5 == 2 && IiiiiiiiIIIII6.getPrice2() != 0L)) {
                    this.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII);
                    this.ALLATORIxDEMO(IiiiiiiiIIIII7, true);
                    return;
                }
                ++IiiiiiiiIIIII;
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII3.goodPacks.length) return;
            } while (IiiiiiiiIIIII < IiiiiiiiIIIII2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Goodstable goodTable, int count, IIIIIiiiIiiII monsterUnit) {
        void IiiiiiiiIIIII;
        GiveGoodsBean giveGoodsBean = new GiveGoodsBean();
        IiiiiiiiIIIII.setOtherID(new BigDecimal(monsterUnit.IiiiiiiiIIIII.getI()));
        IiiiiiiiIIIII.setType(3);
        IiiiiiiiIIIII.setRgid(goodTable.getRgid());
        IiiiiiiiIIIII.setSum(count);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"give", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.iIiIiiiiIIiIi();
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void ALLATORIxDEMO(Goodstable goodTable, int count, IIiIiiiiIiIII NpcUnit) {
        Task IiiiiiiiIIIII = this.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO("\u7ed9\u4e88\u7269\u54c1", goodTable.getGoodsname());
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5bf9\u4f60\u7684\u7269\u54c1\u4e1d\u6beb\u4e0d\u611f\u5174\u8da3");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"taskN", (String)("G" + IiiiiiiiIIIII.getTaskId() + "|" + goodTable.getRgid() + "|" + count));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        this.iIiIiiiiIIiIi();
    }

    public void IiiIiiiiiiIiI() {
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) return;
        if (this.IiiiiiiiIIIII == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = this.iiIiiiiiiiIii != null ? IiiiiiiiIIIII.getGood(this.iiIiiiiiiiIii) : null;
        int IiiiiiiiIIIII3 = Math.min((int)this.iiiIiiiiiiiIi[0].ALLATORIxDEMO(), IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getUsetime() : 0);
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u88ab\u52a0\u9501");
            return;
        }
        if (this.IiiiiiiiIIIII instanceof iiIiIiiiiIiii) {
            if (IiiiiiiiIIIII2 != null && GoodType.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u65e0\u6cd5\u7ed9\u4e88");
                return;
            }
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, (iiIiIiiiiIiii)this.IiiiiiiiIIIII);
            return;
        }
        if (IiiiiiiiIIIII2 == null || IiiiiiiiIIIII3 <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7684\u7269\u54c1");
            return;
        }
        if (!(this.IiiiiiiiIIIII instanceof IIiIiiiiIiIII)) {
            if (!(this.IiiiiiiiIIIII instanceof IIIIIiiiIiiII)) return;
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, (IIIIIiiiIiiII)this.IiiiiiiiIIIII);
            return;
        }
        IIiIiiiiIiIII IiiiiiiiIIIII4 = (IIiIiiiiIiIII)this.IiiiiiiiIIIII;
        if (IiiiiiiiIIIII.getTaskSystem().getTaskGive(Integer.parseInt(IiiiiiiiIIIII4.iiiIiiiiiiiIi.getNpcid()))) {
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3, (IIiIiiiiIiIII)this.IiiiiiiiIIIII);
            return;
        }
        if (IiiiiiiiIIIII4.iiiIiiiiiiiIi.getNpctype().equals("71")) {
            this.ALLATORIxDEMO(1, IiiiiiiiIIIII2, IiiiiiiiIIIII3, (IIiIiiiiIiIII)this.IiiiiiiiIIIII);
            return;
        }
        if (IiiiiiiiIIIII4.iiiIiiiiiiiIi.getNpctype().equals("89")) {
            this.ALLATORIxDEMO(2, IiiiiiiiIIIII2, IiiiiiiiIIIII3, (IIiIiiiiIiIII)this.IiiiiiiiIIIII);
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5bf9\u4f60\u7684\u7269\u54c1\u4e1d\u6beb\u4e0d\u611f\u5174\u8da3");
    }

    public void iIiIiiiiIIiIi() {
        this.iiiIiiiiiiiIi[0].ALLATORIxDEMO().setText("0");
        this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setText("0");
        this.iiIiiiiiiiIii = null;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(-1);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Goodstable goodTable, int count, iiIiIiiiiIiii roleUnit) {
        void IiiiiiiiIIIII;
        BigDecimal IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        if (goodTable == null && IiiiiiiiIIIII2.longValue() <= 0L) {
            return;
        }
        GiveGoodsBean giveGoodsBean = new GiveGoodsBean();
        IiiiiiiiIIIII.setType(0);
        IiiiiiiiIIIII.setOtherID(roleUnit.iIiIiiiiIiIii.getRole_id());
        IiiiiiiiIIIII.setOtherName(roleUnit.iIiIiiiiIiIii.getRolename());
        IiiiiiiiIIIII.setRgid(goodTable != null ? goodTable.getRgid() : null);
        IiiiiiiiIIIII.setSum(count);
        IiiiiiiiIIIII.setGold(IiiiiiiiIIIII2);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"give", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
        this.iIiIiiiiIIiIi();
    }

    public BigDecimal ALLATORIxDEMO() {
        try {
            long IiiiiiiiIIIII = this.iiiIiiiiiiiIi[1].ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0L) {
                return new BigDecimal(0);
            }
            if (this.ALLATORIxDEMO().getLoginResult().getGold().longValue() >= IiiiiiiiIIIII) return new BigDecimal(IiiiiiiiIIIII);
            return null;
        }
        catch (Exception IiiiiiiiIIIII) {
            return null;
        }
    }

    static /* synthetic */ int ALLATORIxDEMO(IiIIIiiiiIiii arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public com.xy.d.iiiiiiiiiiIiI ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(com.xy.d.iiiiiiiiiiIiI unit) {
        this.iiiiiiiiIIiii();
        if (unit instanceof iiIiIiiiiIiii) {
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setEditable(true);
            this.IIiiIiiiIIiIi[2].setText("\u73a9\u5bb6:");
        } else if (unit instanceof IIiIiiiiIiIII) {
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
            IIiIiiiiIiIII IiiiiiiiIIIII2 = (IIiIiiiiIiIII)unit;
            if (!IiiiiiiiIIIII.getTaskSystem().getTaskGive(Integer.parseInt(IiiiiiiiIIIII2.iiiIiiiiiiiIi.getNpcid()))) {
                if (IiiiiiiiIIIII2.iiiIiiiiiiiIi.getNpctype().equals("71")) {
                    this.iIiIiiiiIiIii = 1;
                } else {
                    if (!IiiiiiiiIIIII2.iiiIiiiiiiiIi.getNpctype().equals("89")) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ed6\u597d\u50cf\u4e0d\u60f3\u7406\u4f60");
                        return;
                    }
                    this.iIiIiiiiIiIii = 2;
                }
            }
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setEditable(false);
            this.IIiiIiiiIIiIi[2].setText("NPC:");
        } else if (unit instanceof IIIIIiiiIiiII) {
            this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setEditable(false);
            this.IIiiIiiiIIiIi[2].setText("\u9650\u65f6\u6536\u8d2d:");
        }
        this.IIiiIiiiIIiIi[3].setText(unit.ALLATORIxDEMO());
        this.IiiiiiiiIIIII = unit;
        if (this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 2) {
            this.ALLATORIxDEMO((BigDecimal)null);
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.ALLATORIxDEMO != null) {
            if (this.ALLATORIxDEMO.length == IiiiiiiiIIIII) return;
        }
        this.ALLATORIxDEMO = this.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII, this.IiIIIiiiiIiiI.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 353;
        int IiiiiiiiIIIII3 = 46;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.ALLATORIxDEMO.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.ALLATORIxDEMO[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.ALLATORIxDEMO, 0);
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        if (textField == this.iiiIiiiiiiiIi[0].ALLATORIxDEMO()) {
            Goodstable IiiiiiiiIIIII;
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            Goodstable goodstable = IiiiiiiiIIIII = this.iiIiiiiiiiIii != null ? IiiiiiiiIIIII2.getGood(this.iiIiiiiiiiIii) : null;
            if (this.iIiIiiiiIiIii == 1 || this.iIiIiiiiIiIii == 2) {
                if (IiiiiiiiIIIII == null) {
                    this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setText("0");
                    return 0L;
                }
                Bbuy IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getGoodsid());
                if (IiiiiiiiIIIII3 != null) {
                    long IiiiiiiiIIIII4 = number > (long)IiiiiiiiIIIII.getUsetime().intValue() ? IiiiiiiiIIIII.getUsetime().longValue() : number;
                    this.iiiIiiiiiiiIi[1].ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII4 *= this.iIiIiiiiIiIii == 1 ? IiiiiiiiIIIII3.getPrice1() : IiiiiiiiIIIII3.getPrice2()));
                }
                if (number <= (long)IiiiiiiiIIIII.getUsetime().intValue()) return null;
                return IiiiiiiiIIIII.getUsetime().longValue();
            }
            if (IiiiiiiiIIIII == null) {
                return 0L;
            }
            if (number <= (long)IiiiiiiiIIIII.getUsetime().intValue()) return null;
            return IiiiiiiiIIIII.getUsetime().longValue();
        }
        if (textField != this.iiiIiiiiiiiIi[1].ALLATORIxDEMO()) return 0L;
        if (this.iIiIiiiiIiIii == 1) return null;
        if (this.iIiIiiiiIiIii == 2) {
            return null;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getGold().longValue();
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable goodTable, boolean type) {
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.iiIiiiiiiiIii, (BigDecimal)goodTable.getRgid())) {
            this.iiIiiiiiiiIii = goodTable.getRgid();
            this.iiiIiiiiiiiIi[0].ALLATORIxDEMO().setText(String.valueOf(0));
        }
        long IiiiiiiiIIIII = type ? (long)goodTable.getUsetime().intValue() : this.iiiIiiiiiiiIi[0].ALLATORIxDEMO() + 1L;
        this.iiiIiiiiiiiIi[0].ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
    }
}
