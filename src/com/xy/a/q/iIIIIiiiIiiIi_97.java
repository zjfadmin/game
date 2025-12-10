/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiIiIiiiiiIIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
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
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiIiIiiiiiIIi;
import com.xy.bean.ConfirmBean;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
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
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIIiiiIiiIi
extends IiiiIiiiiIiIi {
    private JLabel[] iIIiIiiiiiiIi;
    private IiiiiiiiiIIII[] IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private iiIiIiiiiiIIi IiIiiiiiIIIII;
    private MoneyType iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private iiIiIiiiiIiIi iIiiIiiiiiiII;
    private IiiiiiiiiIIII IIiiIiiiIIiIi;
    private com.xy.q.IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private static Image IiIIIiiiiIiiI = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png");
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    private IIIiIiiiiIIiI IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public void iIiIiiiiIIiIi(Goodstable good) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iIiIiiiiIiIii[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.iIiIiiiiIiIii[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (good.getType() != 744L && (IiiiiiiiIIIII3 != null && good.getRgid().compareTo(IiiiiiiiIIIII3.getRgid()) == 0 || IiiiiiiiIIIII4 != null && good.getRgid().compareTo(IiiiiiiiIIIII4.getRgid()) == 0)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u5b9d\u77f3\u5df2\u88ab\u9009\u4e2d");
            return;
        }
        int n = IiiiiiiiIIIII2 = good.getType() != 744L ? MsgUntil.getGoodLvl((String)good.getValue()) : 1;
        if (IiiiiiiiIIIII2 <= 4 && IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e3b\u5b9d\u77f3\u6700\u5c115\u7ea7");
            return;
        }
        if (IiiiiiiiIIIII4 == null && IiiiiiiiIIIII3 == null) {
            this.iIiIiiiiIiIii[0].ALLATORIxDEMO(1, (Object)good);
            this.iiiIiiiiiiIIi();
            return;
        }
        int n2 = (IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getType() : IiiiiiiiIIIII3.getType()) != 744L ? MsgUntil.getGoodLvl((String)(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getValue() : IiiiiiiiIIIII3.getValue())) : (IiiiiiiiIIIII = 1);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4 != null ? (IiiiiiiiIIIII2 -= 4) : (IiiiiiiiIIIII2 += 4);
        if (IiiiiiiiIIIII2 != IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7528\u5c0f4\u7ea7\u7684\u5b9d\u77f3\u91cd\u94f8");
            return;
        }
        this.iIiIiiiiIiIii[IiiiiiiiIIIII4 != null ? 0 : 1].ALLATORIxDEMO(1, (Object)good);
        this.iiiIiiiiiiIIi();
    }

    public void iiiIiiiiiiIIi(Goodstable good) {
        int IiiiiiiiIIIII = good.getType() == 744L ? 1 : MsgUntil.getGoodLvl((String)good.getValue());
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.iIiIiiiiIiIii[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iIiIiiiiIiIii[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII2 != null && good.getRgid().compareTo(IiiiiiiiIIIII2.getRgid()) == 0 || IiiiiiiiIIIII3 != null && good.getRgid().compareTo(IiiiiiiiIIIII3.getRgid()) == 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u5b9d\u77f3\u5df2\u88ab\u9009\u4e2d");
            return;
        }
        if (GoodType.iiIIiiiiiIIIi((long)good.getType()) || good.getType() == 744L) {
            int IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII + 3 != (IiiiiiiiIIIII4 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII2.getValue())) && (this.ALLATORIxDEMO().gameType != 2 || IiiiiiiiIIIII != IiiiiiiiIIIII4)) {
                if (this.ALLATORIxDEMO().gameType == 2) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5b9d\u77f3\u8981\u6bd4\u5947\u5f02\u77f3\u5c0f3\u7ea7\u8fdb\u884c\u666e\u901a\u9274\u5b9a,\u4f7f\u7528\u540c\u7b49\u7ea7\u5b9d\u77f3\u8fdb\u884c\u9ad8\u54c1\u8d28\u9274\u5b9a");
                    return;
                }
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5b9d\u77f3\u8981\u6bd4\u5947\u5f02\u77f3\u5c0f3\u7ea7");
                return;
            }
            this.iIiIiiiiIiIii[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (good.getType() != 770L) return;
        if (IiiiiiiiIIIII3 != null) {
            int IiiiiiiiIIIII5;
            int n = IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getType() != 744L ? MsgUntil.getGoodLvl((String)IiiiiiiiIIIII3.getValue()) : 1;
            if (IiiiiiiiIIIII - 3 != IiiiiiiiIIIII5 && (this.ALLATORIxDEMO().gameType != 2 || IiiiiiiiIIIII != IiiiiiiiIIIII5)) {
                if (this.ALLATORIxDEMO().gameType == 2) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6750\u6599\u5b9d\u77f3\u4f7f\u7528\u6bd4\u5947\u5f02\u77f3\u5c0f3\u7ea7\u8fdb\u884c\u666e\u901a\u9274\u5b9a,\u4f7f\u7528\u540c\u7b49\u7ea7\u5b9d\u77f3\u8fdb\u884c\u9ad8\u54c1\u8d28\u9274\u5b9a");
                    return;
                }
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6750\u6599\u5b9d\u77f3\u4f7f\u7528\u6bd4\u5947\u5f02\u77f3\u5c0f3\u7ea7\u8fdb\u884c\u666e\u901a\u9274\u5b9a");
                return;
            }
        }
        this.iIiIiiiiIiIii[0].ALLATORIxDEMO(1, (Object)good);
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        int n = IiiiiiiiIIIII2 = good.getType() != 744L ? MsgUntil.getGoodLvl((String)good.getValue()) : 1;
        if (IiiiiiiiIIIII2 >= 10) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5b9d\u77f3\u6700\u9ad8\u7b49\u7ea710\u7ea7");
            return;
        }
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iIiIiiiiIiIii[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII4 = (Goodstable)this.iIiIiiiiIiIii[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII4.getRgid());
        }
        if (good.getType() != 744L && (IiiiiiiiIIIII3 != null && good.getRgid().compareTo(IiiiiiiiIIIII3.getRgid()) == 0 || IiiiiiiiIIIII4 != null && good.getRgid().compareTo(IiiiiiiiIIIII4.getRgid()) == 0)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u5b9d\u77f3\u5df2\u88ab\u9009\u4e2d");
            return;
        }
        if (IiiiiiiiIIIII4 == null && IiiiiiiiIIIII3 == null) {
            this.iIiIiiiiIiIii[0].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        int n2 = (IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getType() : IiiiiiiiIIIII4.getType()) != 744L ? MsgUntil.getGoodLvl((String)(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getValue() : IiiiiiiiIIIII4.getValue())) : (IiiiiiiiIIIII = 1);
        if (IiiiiiiiIIIII2 != IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5b9d\u77f3\u7b49\u7ea7\u4e0d\u76f8\u540c");
            return;
        }
        this.iIiIiiiiIiIii[IiiiiiiiIIIII4 != null ? 0 : 1].ALLATORIxDEMO(1, (Object)good);
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiIi() {
        if (this.IiIiiiiiIIIII == null) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        this.iiiIiiiiiiIIi(!this.IiIiiiiiIIIII.isVisible());
    }

    static /* synthetic */ Image ALLATORIxDEMO() {
        return IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI imgGrid) {
        imgGrid.ALLATORIxDEMO(0, null);
        imgGrid.setVisible(true);
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(int type) {
        this.iiIIIiiiiiiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIIIiiiiiiiI);
            ++IiiiiiiiIIIII;
        }
        this.iiiIiiiiiiIIi(false);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++].setVisible(true);
        }
        this.IIiiIiiiIIiIi.setVisible(false);
        this.iIIiIiiiiiiIi[3].setVisible(false);
        this.iIIiIiiiiiiIi[4].setVisible(false);
        this.iiiIiiiiiiiIi.setVisible(false);
        this.iIiiIiiiiiiII.setVisible(false);
        if (this.iiIIIiiiiiiiI == 0) {
            this.iIIiIiiiiiiIi[0].setText("\u540c\u7b49\u7ea7\u5b9d\u77f3\u00d72");
            this.iIIiIiiiiiiIi[1].setText("\u51e0\u7387\u83b7\u5f97");
            this.iIIiIiiiiiiIi[0].setBounds(147, 62, 100, 14);
            this.iIIiIiiiiiiIi[0].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
            this.iIIiIiiiiiiIi[1].setBounds(158, 140, 80, 14);
            this.iIIiIiiiiiiIi[1].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFE981"));
            this.iIIiIiiiiiiIi[2].setBounds(186, 100, 20, 20);
            this.iiIiiiiiiiIii.setText("\u5408\u6210");
            this.iiIiiiiiiiIii.setBounds(168, 274, 59, 25);
            this.iIiIiiiiIiIii[0].setBounds(128, 81, 59, 57);
            this.iIiIiiiiIiIii[1].setBounds(207, 81, 59, 57);
            this.iIiIiiiiIiIii[2].setBounds(168, 156, 59, 57);
            this.iIIiIiiiiiiIi[3].setVisible(true);
            this.iIIiIiiiiiiIi[4].setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(true);
            this.iIiiIiiiiiiII.setVisible(true);
            this.iIiiIiiiiiiII.iIiIiiiiIIiii();
            return;
        }
        if (this.iiIIIiiiiiiiI == 1) {
            this.iIIiIiiiiiiIi[0].setText("\u4e3b\u5b9d\u77f3");
            this.iIIiIiiiiiiIi[1].setText("\u6750\u6599\u5b9d\u77f3");
            this.iIIiIiiiiiiIi[0].setBounds(107, 85, 99, 14);
            this.iIIiIiiiiiiIi[0].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
            this.iIIiIiiiiiiIi[1].setBounds(190, 85, 99, 14);
            this.iIIiIiiiiiiIi[1].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
            this.iIIiIiiiiiiIi[2].setBounds(188, 121, 20, 20);
            this.iIiIiiiiIiIii[0].setBounds(127, 102, 59, 57);
            this.iIiIiiiiIiIii[1].setBounds(210, 102, 59, 57);
            this.iIiIiiiiIiIii[2].setBounds(170, 191, 59, 57);
            this.iiIiiiiiiiIii.setText("\u91cd\u94f8");
            this.iiIiiiiiiiIii.setBounds(171, 264, 59, 25);
            this.IIiiIiiiIIiIi.setBtn(-1, "sc/e/57.png");
            this.IIiiIiiiIIiIi.setVisible(true);
            return;
        }
        if (this.iiIIIiiiiiiiI != 2) return;
        this.iIIiIiiiiiiIi[0].setText("\u5947\u5f02\u77f3");
        this.iIIiIiiiiiiIi[1].setText("\u6750\u6599\u5b9d\u77f3");
        this.iIIiIiiiiiiIi[0].setBounds(107, 85, 99, 14);
        this.iIIiIiiiiiiIi[0].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
        this.iIIiIiiiiiiIi[1].setBounds(190, 85, 99, 14);
        this.iIIiIiiiiiiIi[1].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
        this.iIIiIiiiiiiIi[2].setBounds(188, 121, 20, 20);
        this.iIiIiiiiIiIii[0].setBounds(127, 102, 59, 57);
        this.iIiIiiiiIiIii[1].setBounds(210, 102, 59, 57);
        this.iIiIiiiiIiIii[2].setBounds(170, 191, 59, 57);
        this.iiIiiiiiiiIii.setText("\u9274\u5b9a");
        this.iiIiiiiiiiIii.setBounds(171, 264, 59, 25);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (this.iiIIIiiiiiiiI == 0) {
            if (!GoodType.iiIIiiiiiIIIi((long)good.getType()) && good.getType() != 744L) {
                return;
            }
            this.iIiIiiiiIIiii(good);
            return;
        }
        if (this.iiIIIiiiiiiiI != 1) {
            if (this.iiIIIiiiiiiiI != 2) return;
            this.iiiIiiiiiiIIi(good);
            return;
        }
        if (!GoodType.iiIIiiiiiIIIi((long)good.getType()) && good.getType() != 744L) {
            return;
        }
        this.iIiIiiiiIIiIi(good);
    }

    /*
     * WARNING - void declaration
     */
    public iIIIIiiiIiiIi(GameView gameView) {
        super(85, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        void gameView2;
        this.ALLATORIxDEMO = new BigDecimal(this.ALLATORIxDEMO().gameType == 2 ? "500000" : "5000000");
        this.ALLATORIxDEMO(-1, 0, 382, 445, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u5b9d\u77f3 ");
        this.IIIIiiiiiiiII = new IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 151 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u5408\u6210" : (IiiiiiiiIIIII == 1 ? "\u91cd\u94f8" : (IiiiiiiiIIIII == 2 ? "\u9274\u5b9a" : "")), (IiiiIiiiiIiIi)this);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(52 + 65 * IiiiiiiiIIIII, 22, 63, 24);
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/e/7.png", 1, 161, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5408\u6210", (IiiiIiiiiIiIi)this);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IIiiIiiiIIiIi = new IiiiiiiiiIIII("sc/e/28.png", 1, 162, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u91cd\u9009\u7c7b\u578b", (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(165, 174, 68, 18);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIIiIiiiiiiIi = new JLabel[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)157, (int)62, (int)80, (int)14, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            if (IiiiiiiiIIIII == 2) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setText("+");
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFE981"));
            } else if (IiiiiiiiIIIII == 3) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setText("\u6d88\u8017\u91d1\u94b1");
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(98, 227, 72, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setText("\u62e5\u6709\u91d1\u94b1");
                this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(98, 250, 72, 19);
            }
            this.add(this.iIIiIiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new MoneyType();
        this.iiIiIiiiiIIIi.setIdAndKey(1, "\u91d1\u94b1");
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)168, (int)227, (int)119, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiIiiiiIIIi, (GameView)gameView2);
        this.iIiiIiiiiiiII.setBounds(168, 250, 119, 19);
        this.iIiiIiiiiiiII.ALLATORIxDEMO(2);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)this.ALLATORIxDEMO.longValue());
        this.iIiIiiiiIiIii = new com.xy.q.IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.ALLATORIxDEMO);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(47, 305, 309, 105);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(46, 46, 310, 260);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 48, 307);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(new long[]{746L, 749L, 752L, 755L, 758L, 761L, 764L, 767L, 770L, 744L});
        this.add((Component)this.IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiIi(boolean confirm) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Goodstable IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4;
        RoleData IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        SuitOperBean suitOperBean = new SuitOperBean();
        suitOperBean.setGoods(new ArrayList());
        BigDecimal IiiiiiiiIIIII6 = null;
        int n = this.iiIIIiiiiiiiI == 0 ? 17 : (IiiiiiiiIIIII4 = this.iiIIIiiiiiiiI == 1 ? 18 : 19);
        if (IiiiiiiiIIIII4 == 17 && this.ALLATORIxDEMO().gameType == 2) {
            IiiiiiiiIIIII6 = new BigDecimal("500000");
        } else if (IiiiiiiiIIIII4 == 19 && this.ALLATORIxDEMO().gameType == 2) {
            int IiiiiiiiIIIII7;
            IiiiiiiiIIIII6 = new BigDecimal("5000000");
            Goodstable IiiiiiiiIIIII8 = (Goodstable)this.iIiIiiiiIiIii[0].ALLATORIxDEMO();
            IiiiiiiiIIIII3 = (Goodstable)this.iIiIiiiiIiIii[1].ALLATORIxDEMO();
            if (IiiiiiiiIIIII8 != null) {
                IiiiiiiiIIIII8 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII8.getRgid());
            }
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII3 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII3.getRgid());
            }
            if (IiiiiiiiIIIII8 == null || IiiiiiiiIIIII3 == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                return;
            }
            IiiiiiiiIIIII2 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII8.getValue());
            if (IiiiiiiiIIIII2 == (IiiiiiiiIIIII7 = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII3.getValue()))) {
                IiiiiiiiIIIII6 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? new BigDecimal(100000L * (long)IiiiiiiiIIIII2 * (long)IiiiiiiiIIIII2 * (long)IiiiiiiiIIIII2) : new BigDecimal(10000000L * (long)IiiiiiiiIIIII2 * (long)IiiiiiiiIIIII2 * (long)IiiiiiiiIIIII2);
                if (!confirm) {
                    StringBuffer IiiiiiiiIIIII9 = new StringBuffer();
                    IiiiiiiiIIIII9.append("#W\u4f60\u662f\u5426\u8981\u6d88\u8017#R");
                    if (IiiiiiiiIIIII6.longValue() >= 100000000L) {
                        IiiiiiiiIIIII9.append(IiiiiiiiIIIII6.longValue() / 100000000L);
                        IiiiiiiiIIIII9.append("\u4ebf");
                    } else {
                        IiiiiiiiIIIII9.append(IiiiiiiiIIIII6.longValue() / 10000L);
                        IiiiiiiiIIIII9.append("\u4e07");
                    }
                    IiiiiiiiIIIII9.append("#W\u5927\u8bdd\u5e01\u8fdb\u884c\u9ad8\u54c1\u8d28\u9274\u5b9a");
                    this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(18, null, IiiiiiiiIIIII9.toString()));
                    return;
                }
            }
        } else {
            IiiiiiiiIIIII6 = new BigDecimal("5000000");
        }
        if (IiiiiiiiIIIII5.getLoginResult().getGold().compareTo(IiiiiiiiIIIII6) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u989d\u4e0d\u8db3");
            return;
        }
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < 2) {
            IiiiiiiiIIIII3 = (Goodstable)this.iIiIiiiiIiIii[IiiiiiiiIIIII10].ALLATORIxDEMO();
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII5.getGood(IiiiiiiiIIIII3.getRgid());
            }
            if (IiiiiiiiIIIII3 == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                return;
            }
            if (IiiiiiiiIIIII3.getGoodlock() == 1) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                return;
            }
            IiiiiiiiIIIII2 = 1;
            for (BigDecimal IiiiiiiiIIIII11 : IiiiiiiiIIIII.getGoods()) {
                if (IiiiiiiiIIIII11.compareTo(IiiiiiiiIIIII3.getRgid()) != 0) continue;
                ++IiiiiiiiIIIII2;
            }
            if (IiiiiiiiIIIII2 > IiiiiiiiIIIII3.getUsetime()) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII3.getGoodsname()) + "\u6570\u91cf\u4e0d\u8db3");
                return;
            }
            ++IiiiiiiiIIIII10;
            IiiiiiiiIIIII.getGoods().add(IiiiiiiiIIIII3.getRgid());
        }
        IiiiiiiiIIIII.setType(IiiiiiiiIIIII4);
        if (IiiiiiiiIIIII4 == 18) {
            IiiiiiiiIIIII10 = (int)this.iIiIiiiiIiIii[2].ALLATORIxDEMO();
            if (IiiiiiiiIIIII10 == 0) {
                IiiiiiiiIIIII10 = 746;
            }
            IiiiiiiiIIIII.setJade(new PartJade((long)IiiiiiiiIIIII10, 0));
        }
        if (IiiiiiiiIIIII5.getGoodPackSum(-1L, new BigDecimal(-1), 1) <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u80cc\u5305\u7a7a\u95f4\u4e0d\u8db3");
            return;
        }
        String IiiiiiiiIIIII22 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII22);
        this.iiiIiiiiiiIIi(false);
        int IiiiiiiiIIIII12 = 0;
        while (IiiiiiiiIIIII12 < 2) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII12].ALLATORIxDEMO(0, null);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII12++].setVisible(true);
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(iIIIIiiiIiiIi arg0, boolean arg1) {
        arg0.iiiIiiiiiiIIi(arg1);
    }

    static /* synthetic */ com.xy.q.IIIiiiiiIiIiI[] ALLATORIxDEMO(iIIIIiiiIiiIi arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    private /* synthetic */ void iiiIiiiiiiIIi(boolean is) {
        if (this.IiIiiiiiIIIII == null && !is) {
            return;
        }
        if (is) {
            if (this.IiIiiiiiIIIII == null) {
                this.IiIiiiiiIIIII = new iiIiIiiiiiIIi(this);
                this.add((Component)this.IiIiiiiiIIIII, 0);
            }
            this.IiIiiiiiIIIII.setBounds(87, 134, 224, 122);
        }
        this.IiIiiiiiIIIII.setVisible(is);
    }

    public int iiiIiiiiiiIIi() {
        return this.iiIIIiiiiiiiI;
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIIIiiiiiiiI != 1) return;
        Goodstable IiiiiiiiIIIII = (Goodstable)this.iIiIiiiiIiIii[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.iIiIiiiiIiIii[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
        }
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII2 != null) {
            this.IIiiIiiiIIiIi.setBtn(1, "sc/e/28.png");
            if (this.iIiIiiiiIiIii[2].ALLATORIxDEMO() != 0) return;
            this.iIiIiiiiIiIii[2].ALLATORIxDEMO(16, (Object)IiiiiiiiIIIII.getType().intValue());
            return;
        }
        this.IIiiIiiiIIiIi.setBtn(-1, "sc/e/57.png");
        if (this.iIiIiiiiIiIii[2].ALLATORIxDEMO() != 0) {
            this.iIiIiiiiIiIii[2].ALLATORIxDEMO(0, null);
            this.iIiIiiiiIiIii[2].setVisible(true);
        }
        this.iiiIiiiiiiIIi(false);
    }
}
