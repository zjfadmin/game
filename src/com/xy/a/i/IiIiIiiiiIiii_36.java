/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiIiiiiIIiI
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.LaborShop
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.i;

import com.xy.a.i.IIIiIiiiiIIiI;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.LaborShop;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class IiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private LaborShop iiiiIiiiIiiII;
    private iiIiIiiiiIiii iiiIiiiiiiiIi;
    private List<IIIiIiiiiIIiI> iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private JLabel iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    static /* synthetic */ void ALLATORIxDEMO(IiIiIiiiiIiii arg0, int arg1) {
        arg0.IiiiiiiiIIIII = arg1;
    }

    public LaborShop ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    static /* synthetic */ LaborShop ALLATORIxDEMO(IiIiIiiiiIiii arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    public void ALLATORIxDEMO(LaborShop laborShop) {
        this.iiiiIiiiIiiII = laborShop;
        this.iIiIiiiiIiIii.setTextSize("#cD8C07A" + (laborShop.getChoice() != null ? String.valueOf(MsgUntil.iIiIiiiiIIiii((int)laborShop.getGoods().length)) + "#r\u9009#r\u4e00#r\u793c#r\u5305" : "\u793c#r\u76d2"), 20);
        this.iIiIiiiiIiIii.setBounds(8, 50, this.iIiIiiiiIiIii.getWidth(), this.iIiIiiiiIiIii.getHeight());
        this.IiIIIiiiiIiiI.setText(laborShop.getName());
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)laborShop.getSkin()));
        this.ALLATORIxDEMO.setTextSize(laborShop.getText(), 250);
        this.ALLATORIxDEMO.setBounds(36, 220, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
        this.iiIiiiiiiiIii.setText(laborShop.getMoneyString(laborShop.getZk() != null ? iiIiIiiiiIiii.ALLATORIxDEMO((RoleData)this.ALLATORIxDEMO()) : 1.0));
        this.IiiiiiiiIIIII = -1;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < laborShop.getGoods().length) {
            IIIiIiiiiIIiI IiiiiiiiIIIII2;
            IIIiIiiiiIIiI iIIiIiiiiIIiI = IiiiiiiiIIIII2 = IiiiiiiiIIIII < this.iIiiIiiiiiiII.size() ? this.iIiiIiiiiiiII.get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new IIIiIiiiiIIiI(this, IiiiiiiiIIIII);
                IiiiiiiiIIIII2.setBounds(317 + IiiiiiiiIIIII % 3 * 52, 36 + IiiiiiiiIIIII / 3 * 56, 52, 52);
                this.iIiiIiiiiiiII.add(IiiiiiiiIIIII2);
                this.add((Component)IiiiiiiiIIIII2);
            }
            Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(laborShop.getGoods()[IiiiiiiiIIIII]));
            IIIiIiiiiIIiI iIIiIiiiiIIiI2 = IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII3 != null) {
                iIIiIiiiiIIiI2.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII3);
            } else {
                iIIiIiiiiIIiI2.ALLATORIxDEMO(0, null);
                IiiiiiiiIIIII2.setVisible(true);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = this.iIiiIiiiiiiII.size() - 1;
        while (IiiiiiiiIIIII >= laborShop.getGoods().length) {
            this.remove((Component)this.iIiiIiiiiiiII.remove(IiiiiiiiIIIII--));
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    protected void paintChildren(Graphics g) {
        IIIiIiiiiIIiI IiiiiiiiIIIII;
        super.paintChildren(g);
        if (this.IiiiiiiiIIIII == -1) {
            return;
        }
        IIIiIiiiiIIiI iIIiIiiiiIIiI = IiiiiiiiIIIII = this.IiiiiiiiIIIII < this.iIiiIiiiiiiII.size() ? this.iIiiIiiiiiiII.get(this.IiiiiiiiIIIII) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S340.png");
        }
        g.drawImage(this.IIiiIiiiIIiIi, IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY(), null);
    }

    public IiIiIiiiiIiii(GameView gameView) {
        super(143, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 507, 372, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S334.png");
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)84, (int)58, (int)160, (int)20, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cF7C16A"), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI();
        this.iiIiIiiiiIIIi.setBounds(114, 106, 88, 88);
        this.ALLATORIxDEMO = new RichLabel();
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)212, (int)338, (int)160, (int)20, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c634424"), (Font)iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.iiiIiiiiiiiIi = new iiIiIiiiiIiii("sc/b/B457.png", 1, 54, (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(428, 329, 68, 36);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add(this.IiIIIiiiiIiiI);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.add(this.iiIiiiiiiiIii);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII = new ArrayList<IIIiIiiiiIIiI>();
    }

    public int iiiIiiiiiiIIi() {
        return this.IiiiiiiiIIIII;
    }
}
