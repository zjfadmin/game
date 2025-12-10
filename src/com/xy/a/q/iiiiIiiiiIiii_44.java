/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.PawnGoodsMessBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.bean.PawnGoodsMessBean;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
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
public class iiiiIiiiiIiii
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIiIIiiiIIIiI[] iIiIiiiiIiIii;
    private IIiiIiiiIiiiI[] IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private iiiiiiiiiiIiI ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI() {
        void IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = this.iiIiiiiiiiIii != null ? IiiiiiiiIIIII2.getGood(this.iiIiiiiiiiIii) : null;
        int IiiiiiiiIIIII4 = Math.min((int)this.iIiIiiiiIiIii[0].ALLATORIxDEMO(), IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getUsetime() : 0);
        if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7684\u7269\u54c1");
            return;
        }
        if (IiiiiiiiIIIII3.getGoodlock() == 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u88ab\u52a0\u9501");
            return;
        }
        PawnGoodsMessBean pawnGoodsMessBean = new PawnGoodsMessBean();
        IiiiiiiiIIIII.setRgid(IiiiiiiiIIIII3.getRgid());
        IiiiiiiiIIIII.setNumber(IiiiiiiiIIIII4);
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"pawn", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII3.getUsetime() <= 0) {
            IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII3.getRgid());
        }
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.IiIIIiiiiIiiI != null) {
            if (this.IiIIIiiiiIiiI.length == IiiiiiiiIIIII) return;
        }
        this.IiIIIiiiiIiiI = this.ALLATORIxDEMO(this.IiIIIiiiiIiiI, IiiiiiiiIIIII, this.ALLATORIxDEMO.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 357;
        int IiiiiiiiIIIII3 = 32;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIIIiiiiIiiI.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.IiIIIiiiiIiiI[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(this.IiIIIiiiiIiiI, 0);
    }

    /*
     * WARNING - void declaration
     */
    public iiiiIiiiiIiii(GameView gameView) {
        super(29, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 393, 383, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5178\u5f53");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 0, 11, 0));
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII("sc/e/26.png", 1, 74, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u8ba4\u5178\u5f53", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(153, 328, 99, 25);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iIiIiiiiIiIii = new IIiIIiiiIIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            void IiiiiiiiIIIII2;
            IiiiIiiiiIiII iiiiIiiiiIiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            IiiiiiiiIIIII2.setBounds(143, 264 + IiiiiiiiIIIII * 26, 154, 19);
            IiiiiiiiIIIII2.setHorizontalAlignment(10);
            this.add((Component)IiiiiiiiIIIII2);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++] = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        }
        this.IiiiiiiiIIIII = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)87, (int)(264 + 26 * IiiiiiiiIIIII), (int)56, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6570\u91cf" : (IiiiiiiiIIIII == 1 ? "\u603b\u989d" : ""));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(48, 32, 309, 207);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 49, 34);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.ALLATORIxDEMO.ALLATORIxDEMO(true);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        Goodstable IiiiiiiiIIIII;
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        if (textField != this.iIiIiiiiIiIii[0].ALLATORIxDEMO()) return 0L;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable goodstable = IiiiiiiiIIIII = this.iiIiiiiiiiIii != null ? IiiiiiiiIIIII2.getGood(this.iiIiiiiiiiIii) : null;
        if (IiiiiiiiIIIII == null) {
            return 0L;
        }
        if (number <= (long)IiiiiiiiIIIII.getUsetime().intValue()) return null;
        return IiiiiiiiIIIII.getUsetime().longValue();
    }

    public void ALLATORIxDEMO(Goodstable goodTable, boolean type) {
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.iiIiiiiiiiIii, (BigDecimal)goodTable.getRgid())) {
            this.iiIiiiiiiiIii = goodTable.getRgid();
            this.iIiIiiiiIiIii[0].ALLATORIxDEMO().setText(String.valueOf(0));
        }
        long IiiiiiiiIIIII = type ? (long)goodTable.getUsetime().intValue() : this.iIiIiiiiIiIii[0].ALLATORIxDEMO() + 1L;
        this.iIiIiiiiIiIii[0].ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIiIii[0].ALLATORIxDEMO().setText("0");
        this.iIiIiiiiIiIii[1].ALLATORIxDEMO().setText("0");
        this.iiIiiiiiiiIii = null;
        this.ALLATORIxDEMO.ALLATORIxDEMO(-1);
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }
}
