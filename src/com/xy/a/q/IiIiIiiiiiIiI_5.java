/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BuyShopBean
 *  com.xy.game.HandleOption
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiiIIi
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.Shop
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.bean.BuyShopBean;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiiIIi;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiiiIiI
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private iiIiIiiiiiIIi IIiiIiiiIIiIi;
    private IIiIIiiiIIIiI iIiIiiiiIiIii;
    private Shop IiIIIiiiiIiiI;
    private BigDecimal iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.IiIIIiiiiIiiI == null) {
            this.IiiiiiiiIIIII[3].setText(null);
            return;
        }
        this.IiiiiiiiIIIII[3].setText(String.valueOf(this.ALLATORIxDEMO.getKey()) + "\uff1a" + this.iiIiiiiiiiIii.longValue() + "/" + IiiiiiiiIIIII.getMoney(this.ALLATORIxDEMO));
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        this.iiIiiiiiiiIii = number <= 0L ? new BigDecimal(0) : (this.IiIIIiiiiIiiI != null ? new BigDecimal(this.IiIIIiiiiIiiI.getShopprice() * number) : new BigDecimal(0));
        this.IiiIiiiiiiIiI();
    }

    public IiIiIiiiiiIiI(GameView gameView) {
        super(92, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 325, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5151\u6362");
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII("sc/e/31.png", 1, 104, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5151 \u6362", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(164, 255, 79, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)45, (int)23, (int)114, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ef\u5151\u6362\u7269\u54c1" : (IiiiiiiiIIIII == 1 ? "\u6570\u91cf" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017" : (IiiiiiiiIIIII == 3 ? "\u661f\u8292\uff1a30/50" : ""))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(165, 176 + 24 * (IiiiiiiiIIIII - 1), 36, 19);
            }
            if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(208 + 39 * (IiiiiiiiIIIII - 3), 200, 200, 21);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiIiiiiIiII IiiiiiiiIIIII2 = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        IiiiiiiiIIIII2.setBounds(208, 176, 54, 19);
        IiiiiiiiIIIII2.setHorizontalAlignment(10);
        this.iIiIiiiiIiIii = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        this.add((Component)IiiiiiiiIIIII2);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(44, 43, 309, 105);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(86, 172, 50, 50);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIiIiiiiIIiii("sc/d/4.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(82, 168, 59, 57);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(44, 148, 310, 150);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII3++]);
        }
        this.IIiiIiiiIIiIi = new iiIiIiiiiiIIi((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 45, 45);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(true);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = new MoneyType();
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) return 0L;
        if (this.IiIIIiiiiIiiI == null) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.ALLATORIxDEMO) / this.IiIIIiiiiIiiI.getShopprice();
        if ((IiiiiiiiIIIII = Math.max(1L, IiiiiiiiIIIII)) < number && IiiiiiiiIIIII <= 999L) {
            return IiiiiiiiIIIII;
        }
        if (number <= 999L) return null;
        return 999L;
    }

    public void ALLATORIxDEMO(Shop shop, boolean type) {
        if (this.IiIIIiiiiIiiI != null && this.IiIIIiiiiIiiI == shop) {
            long IiiiiiiiIIIII = this.iIiIiiiiIiIii.ALLATORIxDEMO() + (long)(type ? 99 : 1);
            this.iIiIiiiiIiIii.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
            return;
        }
        this.IiIIIiiiiIiiI = shop;
        if (this.IiIIIiiiiIiiI == null) {
            this.iIiiIiiiiiiII[1].iIiIiiiiIIiii();
            this.iiIiiiiiiiIii = new BigDecimal(0);
            this.iIiIiiiiIiIii.ALLATORIxDEMO().setText("0");
            return;
        }
        int IiiiiiiiIIIII = type ? 99 : 1;
        this.iIiiIiiiiiiII[1].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)this.IiIIIiiiiIiiI.getShopskin()));
        this.iIiIiiiiIiIii.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IiIIIiiiiIiiI == null) return false;
        return true;
    }

    public void iIiIiiiiIIiIi() {
        this.IiIIIiiiiIiiI = null;
        this.iIiiIiiiiiiII[1].iIiIiiiiIIiii();
        this.iiIiiiiiiiIii = new BigDecimal(0);
        this.iIiIiiiiIiIii.ALLATORIxDEMO().setText("0");
    }

    public void iiiIiiiiiiIIi() {
        if (this.IiIIIiiiiIiiI == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6ca1\u6709\u9009\u4e2d\u7684\u5546\u54c1");
            return;
        }
        int IiiiiiiiIIIII = (int)this.iIiIiiiiIiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8d2d\u4e70\u6570\u91cf\u4e0d\u80fd\u4e3a0");
            return;
        }
        BuyShopBean IiiiiiiiIIIII2 = new BuyShopBean();
        IiiiiiiiIIIII2.setAte(1);
        HandleOption.ALLATORIxDEMO((BuyShopBean)IiiiiiiiIIIII2, (Shop)this.IiIIIiiiiIiiI, (int)IiiiiiiiIIIII, (MoneyType)this.ALLATORIxDEMO, (GameView)this.iiIIiiiiIiIIi);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiii(int type) {
        this.iIiIiiiiIIiIi();
        List IiiiiiiiIIIII = (List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get(String.valueOf(type));
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII);
        if (type == 600) {
            this.ALLATORIxDEMO.setIdAndKey(0, "\u6bd4\u6597\u5956\u7ae0");
        } else {
            if (type != 601) return;
            this.ALLATORIxDEMO.setIdAndKey(0, "\u661f\u8292");
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
