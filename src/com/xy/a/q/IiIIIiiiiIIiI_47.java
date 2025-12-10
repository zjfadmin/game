/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BuyShopBean
 *  com.xy.game.HandleOption
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.i.iIIIIiiiIiiIi
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Eshop
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
import com.xy.i.IiiiiiiiiIIII;
import com.xy.i.iIIIIiiiIiiIi;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Eshop;
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
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiIIiI
extends IiiiIiiiiIiIi {
    private Eshop IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private MoneyType iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private IIiIIiiiIIIiI iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private iIIiIiiiIiiIi IiIIIiiiiIiiI;
    private Shop iiIiiiiiiiIii;
    private IiiiiiiiiIIII[] IiiiiiiiIIIII;
    private iiIiIiiiiIiIi ALLATORIxDEMO;

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        if (this.IiIiiiiiIIIII != null) {
            long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.iiiiIiiiIiiII) / Long.parseLong(this.IiIiiiiiIIIII.getEshopprice());
            if (IiiiiiiiIIIII < number && IiiiiiiiIIIII <= 999L) {
                return IiiiiiiiIIIII;
            }
        } else {
            if (this.iiIiiiiiiiIii == null) return 0L;
            long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.iiiiIiiiIiiII) / this.iiIiiiiiiiIii.getShopprice();
            if (IiiiiiiiIIIII < number && IiiiiiiiIIIII <= 999L) {
                return IiiiiiiiIIIII;
            }
        }
        if (number <= 999L) return null;
        return 999L;
    }

    public void ALLATORIxDEMO(Eshop eshop, Shop shop) {
        this.iiIiiiiiiiIii = shop;
        this.IiIiiiiiIIIII = eshop;
        if (eshop == null && shop == null) {
            return;
        }
        this.iiIiIiiiiIIIi.setText("<html><body><font color='#FFFF00'>\u4f60\u786e\u5b9a\u8981\u8d2d\u4e70</font><font color='#00FF00'>" + (eshop != null ? eshop.getEshopname() : shop.getShopname()) + "</font><font color='#FFFF00'>\u5417?</font></body></html>");
        this.iIiIiiiiIiIii[0].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiiiiiiIIiii((String)(eshop != null ? eshop.getEshopskin() : shop.getShopskin())));
        if (eshop != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIIIiiiiIiiI, (long)Long.parseLong(eshop.getEshopprice()));
            if (eshop.getEshoptype().equals("5")) {
                this.IIiiIiiiIIiIi[5].setText(String.valueOf(eshop.getEshopprice()) + "\u79ef\u5206");
                this.iiiiIiiiIiiII.setIdAndKey(4, "\u79ef \u5206");
            } else {
                this.IIiiIiiiIIiIi[5].setText(String.valueOf(eshop.getEshopprice()) + "\u4ed9\u7389");
                this.iiiiIiiiIiiII.setIdAndKey(3, "\u4ed9 \u7389");
            }
        } else {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIIIiiiiIiiI, (long)shop.getShopprice());
            String IiiiiiiiIIIII = iIIIIiiiIiiIi.ALLATORIxDEMO((Shop)shop, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII.equals("\u91d1\u94b1")) {
                this.iiiiIiiiIiiII.setIdAndKey(1, "\u91d1 \u94b1");
            } else if (IiiiiiiiIIIII.equals("\u7ed1\u7389")) {
                this.iiiiIiiiIiiII.setIdAndKey(2, "\u7ed1 \u7389");
            } else {
                this.iiiiIiiiIiiII.setIdAndKey(0, IiiiiiiiIIIII);
            }
            this.IIiiIiiiIIiIi[5].setText(String.valueOf(shop.getShopprice()) + IiiiiiiiIIIII);
        }
        this.IIiiIiiiIIiIi[3].setText(this.iiiiIiiiIiiII.getKey());
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText("1");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 0L) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)0L);
            return;
        }
        if (this.IiIiiiiiIIIII != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)(Long.parseLong(this.IiIiiiiiIIIII.getEshopprice()) * number));
            return;
        }
        if (this.iiIiiiiiiiIii != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)(this.iiIiiiiiiiIii.getShopprice() * number));
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi, (long)0L);
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IiIiiiiiIIIII != null) return true;
        if (this.iiIiiiiiiiIii != null) return true;
        return false;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 101) {
            int IiiiiiiiIIIII = (int)this.iIiiIiiiiiiII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8d2d\u4e70\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                return;
            }
            if (this.IiIiiiiiIIIII != null) {
                BuyShopBean IiiiiiiiIIIII2 = new BuyShopBean();
                IiiiiiiiIIIII2.setAte(0);
                HandleOption.ALLATORIxDEMO((BuyShopBean)IiiiiiiiIIIII2, (Eshop)this.IiIiiiiiIIIII, (int)IiiiiiiiIIIII, (MoneyType)this.iiiiIiiiIiiII, (GameView)this.iiIIiiiiIiIIi);
                return;
            }
            if (this.iiIiiiiiiiIii == null) return;
            BuyShopBean IiiiiiiiIIIII3 = new BuyShopBean();
            IiiiiiiiIIIII3.setAte(1);
            HandleOption.ALLATORIxDEMO((BuyShopBean)IiiiiiiiIIIII3, (Shop)this.iiIiiiiiiiIii, (int)IiiiiiiiIIIII, (MoneyType)this.iiiiIiiiIiiII, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id == 102) {
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(this.iIiiIiiiiiiII.ALLATORIxDEMO() - 1L));
            return;
        }
        if (id != 103) return;
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(this.iIiiIiiiiiiII.ALLATORIxDEMO() + 1L));
    }

    public IiIIIiiiiIIiI(GameView gameView) {
        super(44, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 383, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u8d2d \u4e70 ");
        this.iiIiIiiiiIIIi = new JLabel();
        this.iiIiIiiiiIIIi.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
        this.iiIiIiiiiIIIi.setBounds(44, 48, 310, 40);
        this.iiIiIiiiiIIIi.setOpaque(false);
        this.iiIiIiiiiIIIi.setHorizontalAlignment(0);
        this.add(this.iiIiIiiiiIIIi);
        this.IiiiiiiiIIIII = new IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IiiiiiiiiIIII(IiiiiiiiIIIII == 0 ? "sc/e/26.png" : (IiiiiiiiIIIII == 1 ? "sc/e/32.png" : "sc/e/34.png"), 1, 101 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u786e\u8ba4\u8d2d\u4e70" : "", (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(260, 335, 99, 25);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(215 + 14 * (IiiiiiiiIIIII - 1), 292, 11, 15);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)90, (int)265, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        IiiiIiiiiIiII IiiiiiiiIIIII2 = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        IiiiiiiiIIIII2.setBounds(90, 290, 154, 19);
        IiiiiiiiIIIII2.setHorizontalAlignment(10);
        this.iIiiIiiiiiiII = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)90, (int)315, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiiIiiiIiiII = new MoneyType();
        this.iiiiIiiiIiiII.setIdAndKey(3, "\u4ed9 \u7389");
        this.ALLATORIxDEMO = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)90, (int)340, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiiiIiiiIiiII, (GameView)gameView);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)IiiiiiiiIIIII2);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.ALLATORIxDEMO);
        this.IIiiIiiiIIiIi = new JLabel[6];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3] = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)(265 + 25 * IiiiiiiiIIIII3), (int)48, (int)19, (int)4, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u5355 \u4ef7" : (IiiiiiiiIIIII3 == 1 ? "\u6570 \u91cf" : (IiiiiiiiIIIII3 == 2 ? "\u603b \u989d" : (IiiiiiiiIIIII3 == 3 ? "\u4ed9 \u7389" : (IiiiiiiiIIIII3 == 4 ? "\u552e\u4ef7\uff1a" : (IiiiiiiiIIIII3 == 5 ? "50000\u4ed9\u7389" : ""))))));
            if (IiiiiiiiIIIII3 == 4) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setHorizontalAlignment(0);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(139, 217, 54, 18);
            }
            if (IiiiiiiiIIIII3 == 5) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setHorizontalAlignment(10);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFF0000"));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setFont(iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(193, 217, 160, 18);
            }
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII3++]);
        }
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(139, 86, 120, 120);
            }
            if (IiiiiiiiIIIII3 == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(44, 36, 309, 207);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII3++]);
        }
    }
}
