/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiiiiiIIiii
 *  com.xy.formula.MsgUntil
 *  com.xy.game.GameUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIIiii
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiIiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.a.a.iiIiiiiiIIiii;
import com.xy.formula.MsgUntil;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIIiii;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiiiiiiIi
extends IiiiIiiiiIiIi {
    private com.xy.w.IiiiIiiiiIiIi iiIIIiiiiiiiI;
    private IIIiiiiiIiIiI IiIiiiiiIIIII;
    private iiIiiiiiIIiii[] iiIiIiiiiIIIi;
    private IIiIiiiiIIiii[] iiiiIiiiIiiII;
    private IIiIiiiiIIiii[] iiiIiiiiiiiIi;
    private IIiIiiiiIIiii[] iIiiIiiiiiiII;
    private IIiiIiiiIiiiI[] IIiiIiiiIIiIi;
    private IIiIiiiiIIiii[] iIiIiiiiIiIii;
    private iiiiiiiiiiIiI IiIIIiiiiIiiI;
    private IIiIiiiiIIiii[] iiIiiiiiiiIii;
    private IiIiIiiiiIIiI[] IiiiiiiiIIIII;
    private IIIiiiiiIiIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        this.IiiIiiiiiiIiI();
        super.iIiIiiiiIIiii();
    }

    public void IiiIiiiiiiIiI() {
        long IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult().getSpecies_id().longValue();
        Goodstable IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGoodEquip(IiiiiiiiIIIII2.goodChoses[0]);
        if (IiiiiiiiIIIII4 != null && (IiiiiiiiIIIII = (long)GameUtil.ALLATORIxDEMO((int)Integer.parseInt(IiiiiiiiIIIII4.getSkin()))) != 0L) {
            IiiiiiiiIIIII3 = (IiiiiiiiIIIII += 18L) << 32 | IiiiiiiiIIIII3;
        }
        this.iiIIIiiiiiiiI = this.iiIIIiiiiiiiI == null ? com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII3, (int)2, (int)1, null) : com.xy.w.iiiiiiiiiiIiI.ALLATORIxDEMO((com.xy.w.IiiiIiiiiIiIi)this.iiIIIiiiiiiiI, (int)1, (String)String.valueOf(IiiiiiiiIIIII3));
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2.getPackRecord().getEquipType());
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiIIIiiiiiiiI == null) return;
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, 219, 160, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    /*
     * Unable to fully structure code
     */
    public IIIiiiiiiiiIi(GameView gameView) {
        block11: {
            block10: {
                super(2, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
                this.ALLATORIxDEMO(-1, 0, 412, 485, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
                this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u7269\u54c1\u680f");
                this.iiIiIiiiiIIIi = new iiIiiiiiIIiii[12];
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new iiIiiiiiIIiii(this, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
                    this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIII);
                    this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
                }
                this.ALLATORIxDEMO = new IIIiiiiiIiIiI();
                this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO.setBounds(163, 31, 108, 149);
                this.add((Component)this.ALLATORIxDEMO);
                this.iiIiiiiiiiIii = new IIiIiiiiIIiii[4];
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIiIiiiiIIiii(IiiiiiiiIIIII == 0 ? "sc/e/1.png" : (IiiiiiiiIIIII == 1 ? "sc/e/2.png" : (IiiiiiiiIIIII == 2 ? "sc/e/3.png" : (IiiiiiiiIIIII == 3 ? "sc/e/4.png" : ""))), 1, 1 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(179 + 20 * IiiiiiiiIIIII, 183, 18, 18);
                    this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
                }
                this.iiiIiiiiiiiIi = new IIiIiiiiIIiii[5];
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIiIiiiiIIiii("sc/e/6.png", 1, IiiiiiiiIIIII == 4 ? 24 : 5 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u5b58\u6b3e" : (IiiiiiiiIIIII == 1 ? "\u6446\u644a" : (IiiiiiiiIIIII == 2 ? "\u88c5\u626e" : (IiiiiiiiIIIII == 3 ? "\u68c0\u67e5" : (IiiiiiiiIIIII == 4 ? "\u6e05\u5305" : "")))), (IiiiIiiiiIiIi)this);
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
                    if (IiiiiiiiIIIII == 0) {
                        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(189, 210, 34, 18);
                    } else {
                        this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(190 + 50 * IiiiiiiiIIIII, 206, 34, 18);
                    }
                    this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
                }
                if (!this.ALLATORIxDEMO().iIiIiiiiIIiIi()) break block10;
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl49
            }
            this.iiiIiiiiiiiIi[4].setVisible(false);
            break block11;
            do {
                v0 = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
                v1 = 190 + 40 * IiiiiiiiIIIII;
                ++IiiiiiiiIIIII;
                v0.setBounds(v1, 206, 34, 18);
lbl49:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length);
        }
        if (this.ALLATORIxDEMO().gamePawn) {
            this.iiiIiiiiiiiIi[3].setText("\u5305\u88f9");
        }
        this.iiiiIiiiIiiII = new IIiIiiiiIIiii[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIiIiiiiIIiii("sc/e/28.png", 1, 11 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u88c5\u5907" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII + 1)), (IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(310, 255 + IiiiiiiiIIIII * 17, 68, 17);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setVisible(false);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IiIiIiiiiIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)43, (int)(209 + IiiiiiiiIIIII * 24), (int)36, (int)19, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            var4_4 = IiIIIiiiiIIiI.ALLATORIxDEMO((int)79, (int)(209 + IiiiiiiiIIIII * 24), (int)144, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, null, (GameView)gameView);
            IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add(IiiiiiiiIIIII);
            this.add((Component)IiiiiiiiIIIII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII, (JLabel)IiiiiiiiIIIII);
            IiiiiiiiIIIII = new MoneyType();
            IiiiiiiiIIIII.setId(IiiiiiiiIIIII == 0 ? 1 : (IiiiiiiiIIIII == 1 ? 2 : 0));
            IiiiiiiiIIIII.setKey(IiiiiiiiIIIII == 0 ? "\u73b0\u91d1" : (IiiiiiiiIIIII == 1 ? "\u5e08\u8d21" : ""));
            IiiiiiiiIIIII.setText(IiiiiiiiIIIII.getKey());
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            IiiiiiiiIIIII.ALLATORIxDEMO(3);
        }
        this.iIiIiiiiIiIii = new IIiIiiiiIIiii[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIIiii("sc/e/7.png", 1, 9 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u6574\u7406" : (IiiiiiiiIIIII == 1 ? "\u6362\u88c5" : ""), (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(240 + 75 * IiiiiiiiIIIII, 230, 59, 25);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IiIiiiiiIIIII = new IIIiiiiiIiIiI();
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IiIiiiiiIIIII.setBounds(45, 260, 309, 207);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiIIIiiiiIiiI = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 46, 262);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(true);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void iIiIiiiiIIiIi() {
        boolean IiiiiiiiIIIII = !this.iiiiIiiiIiiII[0].isVisible();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII2++].setVisible(IiiiiiiiIIIII);
        }
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.IIiiIiiiIIiIi != null) {
            if (this.IIiiIiiiIIiIi.length == IiiiiiiiIIIII) return;
        }
        this.IIiiIiiiIIiIi = this.ALLATORIxDEMO(this.IIiiIiiiIIiIi, IiiiiiiiIIIII, this.IiIIIiiiiIiiI.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 354;
        int IiiiiiiiIIIII3 = 260;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IIiiIiiiIIiIi.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.IIiiIiiiIIiIi[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.IIiiIiiiIIiIi, 0);
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO().IIiiIiiiiIiII();
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(int index) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setForeground(IiiiiiiiIIIII == index ? Color.red : Color.white);
            ++IiiiiiiiIIIII;
        }
    }

    public iiiiiiiiiiIiI ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }
}
