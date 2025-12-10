/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiIIIiiiiiiIi
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.a.a;

import com.xy.a.a.IiIIIiiiiiiIi;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class iiIiIiiiiiIIi
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private com.xy.q.IIIiiiiiIiIiI iIiiIiiiiiiII;
    private IIiiIiiiIiiiI[] IIiiIiiiIIiIi;
    private com.xy.w.IiiiIiiiiIiIi iIiIiiiiIiIii;
    private iiiiiiiiiiIiI IiIIIiiiiIiiI;
    private IiIIIiiiiiiIi[] iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private IiIiIiiiiIIiI ALLATORIxDEMO;

    public iiIiIiiiiiIIi(GameView gameView) {
        super(67, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 371, 500, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 0, 11, 0));
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)24, (int)33, (int)310, (int)18, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c00FF00"), (Font)iiIIiiiiIiiII.iIiIiiiiIiiii);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI("sc/e/7.png", 1, 41, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6d17\u7ec3", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(150, 231, 59, 25);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IiIIIiiiiiiIi[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIIIiiiiiiIi(this, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/51.png");
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iIiIIiiiIIiII);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(170, 202, 24, 24);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/57.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(170, 202, 24, 24);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(25, 265, 309, 207);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/50.png", (int)50, (int)50, (int)50, (int)50, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(24, 21, 310, 245);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 26, 267);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(true);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        Object IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2;
        String[] IiiiiiiiIIIII3;
        this.iiiIiiiiiiIIi();
        if (pet == null) {
            return;
        }
        RoleData IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        this.IiiiiiiiIIIII.setText(pet.getSummoningname());
        String IiiiiiiiIIIII5 = pet.getStye();
        this.iIiIiiiiIiIii = pet.getPart(this.iiIIiiiiIiIIi);
        if (IiiiiiiiIIIII5 == null) return;
        if (IiiiiiiiIIIII5.length() <= 1) {
            return;
        }
        boolean IiiiiiiiIIIII6 = true;
        String[] IiiiiiiiIIIII7 = null;
        String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII5.split("\\|");
        int IiiiiiiiIIIII9 = 1;
        while (IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII8[IiiiiiiiIIIII9].split("-");
            if (IiiiiiiiIIIII3.length >= 2 && (IiiiiiiiIIIII2 = IiiiiiiiIIIII4.getGoodEquip(new BigDecimal(IiiiiiiiIIIII3[1]))) != null) {
                int IiiiiiiiIIIII10 = Integer.parseInt(IiiiiiiiIIIII3[0]);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII10].ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2);
                if (IiiiiiiiIIIII10 != 3 && IiiiiiiiIIIII6) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII2.getValue().split("\\|");
                    String IiiiiiiiIIIII11 = MsgUntil.getValuesMessage((String[])IiiiiiiiIIIII, (String)GoodType.Extras[5]);
                    if (IiiiiiiiIIIII11 != null) {
                        if (IiiiiiiiIIIII7 == null) {
                            IiiiiiiiIIIII7 = new String[3];
                        }
                        IiiiiiiiIIIII7[IiiiiiiiIIIII10] = IiiiiiiiIIIII11;
                    } else {
                        IiiiiiiiIIIII6 = false;
                    }
                }
            }
            ++IiiiiiiiIIIII9;
        }
        if (!IiiiiiiiIIIII6) return;
        if (IiiiiiiiIIIII7 == null) return;
        if (IiiiiiiiIIIII7[0] == null) return;
        if (IiiiiiiiIIIII7[1] == null) return;
        if (IiiiiiiiIIIII7[2] == null) return;
        String[] IiiiiiiiIIIII22 = IiiiiiiiIIIII7[0].split("&");
        IiiiiiiiIIIII3 = IiiiiiiiIIIII7[1].split("&");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII7[2].split("&");
        if (!IiiiiiiiIIIII22[1].equals(IiiiiiiiIIIII3[1])) return;
        if (!IiiiiiiiIIIII22[1].equals(IiiiiiiiIIIII2[1])) return;
        BigDecimal IiiiiiiiIIIII12 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII22[2], (String)IiiiiiiiIIIII3[2], (String)IiiiiiiiIIIII2[2]);
        IiiiiiiiIIIII = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII22[3], (String)IiiiiiiiIIIII3[3], (String)IiiiiiiiIIIII2[3]);
        IiiiiiiiIIIII22[2] = IiiiiiiiIIIII12.toString();
        IiiiiiiiIIIII22[3] = ((BigDecimal)IiiiiiiiIIIII).toString();
        this.iIiiIiiiiiiII.ALLATORIxDEMO(9, (Object)IiiiiiiiIIIII22);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iIiIiiiiIiIii == null) return;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(g, 182, 184, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public boolean ALLATORIxDEMO() {
        this.iiiIiiiiiiIIi();
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        super.iIiIiiiiIIiii();
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.IIiiIiiiIIiIi != null) {
            if (this.IIiiIiiiIIiIi.length == IiiiiiiiIIIII) return;
        }
        this.IIiiIiiiIIiIi = this.ALLATORIxDEMO(this.IIiiIiiiIIiIi, IiiiiiiiIIIII, this.IiIIIiiiiIiiI.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 334;
        int IiiiiiiiIIIII3 = 265;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IIiiIiiiIIiIi.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.IIiiIiiiIIiIi[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(this.IIiiIiiiIIiIi, 0);
    }

    public void iiiIiiiiiiIIi() {
        this.IiiiiiiiIIIII.setText(null);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO(0, null);
        this.iIiiIiiiiiiII.iIiIiiiiIIiii("sc/d/56.png");
        this.iIiiIiiiiiiII.setVisible(true);
        this.iIiIiiiiIiIii = null;
    }
}
