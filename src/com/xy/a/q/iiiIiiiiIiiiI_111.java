/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BuyShopBean
 *  com.xy.bean.ShopGoodsBean
 *  com.xy.game.HandleOption
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiIiIiiiiiIIi
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.Shop
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.bean.BuyShopBean;
import com.xy.bean.ShopGoodsBean;
import com.xy.game.HandleOption;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiIiIiiiiiIIi;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiIiiiiIiiiI
extends IiiiIiiiiIiIi {
    private iiIiIiiiiiIIi iiiiIiiiIIiii;
    private IiiiiiiiiIIII iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII;
    private iIIiIiiiIiiIi iiIIIiiiiiiiI;
    private IiiiiiiiiIIII[] IiIiiiiiIIIII;
    private IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private List<Shop> iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private IIiIIiiiIIIiI iIiiIiiiiiiII;
    private Integer IIiiIiiiIIiIi;
    private MoneyType iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private Shop IiiiiiiiIIIII;
    private iiIiIiiiiIiIi ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(int typeShop) {
        block2: {
            this.IIIIiiiiiiiII = typeShop;
            if (typeShop != 1) break block2;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl10
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl14
        do {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII++].setVisible(true);
lbl10:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length);
        return;
        do {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII++].setVisible(false);
lbl14:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length);
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 0L) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)0L);
            return;
        }
        if (this.IiiiiiiiIIIII != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)(this.IiiiiiiiIIIII.getShopprice() * number));
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)0L);
    }

    public void ALLATORIxDEMO(Shop shop, boolean type) {
        if (this.IiiiiiiiIIIII != null && this.IiiiiiiiIIIII == shop) {
            long IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO() + (long)(type ? 99 : 1);
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
            return;
        }
        this.IiiiiiiiIIIII = shop;
        if (this.IiiiiiiiIIIII == null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)0L);
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText("0");
            return;
        }
        int IiiiiiiiIIIII = type ? 99 : 1;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)shop.getShopprice());
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
        if (shop.getIsPrice() == null) return;
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"shopPrice", (String)("1|" + shop.getShopid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(String shopId, long price) {
        if (this.IiiiiiiiIIIII == null) return;
        if (!this.IiiiiiiiIIIII.getShopid().equals(shopId)) return;
        this.IiiiiiiiIIIII.setShopprice(price);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIIIiiiiiiiI, (long)this.IiiiiiiiIIIII.getShopprice());
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(this.iIiiIiiiiiiII.ALLATORIxDEMO()));
    }

    public void iiiIiiiiiiIIi() {
        if (this.IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6ca1\u6709\u9009\u4e2d\u7684\u5546\u54c1");
            return;
        }
        int IiiiiiiiIIIII = (int)this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8d2d\u4e70\u6570\u91cf\u4e0d\u80fd\u4e3a0");
            return;
        }
        BuyShopBean IiiiiiiiIIIII2 = new BuyShopBean();
        if (this.IIIIiiiiiiiII == 1) {
            IiiiiiiiIIIII2.setAte(3);
            IiiiiiiiIIIII2.setnId(this.IIiiIiiiIIiIi);
        } else {
            IiiiiiiiIIIII2.setAte(1);
        }
        HandleOption.ALLATORIxDEMO((BuyShopBean)IiiiiiiiIIIII2, (Shop)this.IiiiiiiiIIIII, (int)IiiiiiiiIIIII, (MoneyType)this.iIiIiiiiIiIii, (GameView)this.iiIIiiiiIiIIi);
    }

    /*
     * WARNING - void declaration
     */
    public iiiIiiiiIiiiI(GameView gameView) {
        super(23, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 391, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u8d2d \u4e70 ");
        this.IiIiiiiiIIIII = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 81 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u4ed9\u7389" : (IiiiiiiiIIIII == 1 ? "\u91d1\u94b1" : ""), (IiiiIiiiiIiIi)this);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setBounds(48 + 65 * IiiiiiiiIIIII, 12, 63, 24);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIIiIiiiiiiIi = new IiiiiiiiiIIII("sc/e/31.png", 1, 91, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8d2d \u4e70", (IiiiIiiiiIiIi)this);
        this.iIIiIiiiiiiIi.setBounds(270, 343, 79, 25);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)96, (int)273, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        IiiiIiiiiIiII IiiiiiiiIIIII2 = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        IiiiiiiiIIIII2.setBounds(96, 298, 154, 19);
        IiiiiiiiIIIII2.setHorizontalAlignment(10);
        this.iIiiIiiiiiiII = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII2, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)96, (int)323, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiIiiiiIiIii = new MoneyType();
        this.iIiIiiiiIiIii.setIdAndKey(1, "\u73b0 \u91d1");
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)96, (int)348, (int)154, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iIiIiiiiIiIii, (GameView)gameView);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iiIIIiiiiiiiI);
        this.add((Component)IiiiiiiiIIIII2);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI = new JLabel[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)5, (int)(273 + 25 * IiiiiiiiIIIII3), (int)90, (int)19, (int)4, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u5355 \u4ef7" : (IiiiiiiiIIIII3 == 1 ? "\u6570 \u91cf" : (IiiiiiiiIIIII3 == 2 ? "\u603b \u989d" : (IiiiiiiiIIIII3 == 3 ? "\u73b0 \u91d1" : ""))));
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII3++]);
        }
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI();
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
        this.iiIiIiiiiIIIi.setBounds(44, 36, 309, 207);
        this.add((Component)this.iiIiIiiiiIIIi);
        IIiiIiiiIiiiI[] IiiiiiiiIIIII32 = new IIiiIiiiIiiiI[4];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII32.length) {
            void IiiiiiiiIIIII5;
            String IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7 = -1 + IiiiiiiiIIIII4;
            String string = IiiiiiiiIIIII4 == 0 ? "\u9996\u9875" : (IiiiiiiiIIIII4 == 1 ? "\u4e0a\u9875" : (IiiiiiiiIIIII6 = IiiiiiiiIIIII4 == 2 ? "\u4e0b\u9875" : "\u5c3e\u9875"));
            int n = IiiiiiiiIIIII4 == 0 ? 260 : (IiiiiiiiIIIII4 == 1 ? 294 : (IiiiiiiiIIIII4 == 2 ? 374 : 408));
            IiiiiiiiIIIII32[IiiiiiiiIIIII4] = new IIiiIiiiIiiiI("sc/e/6.png", 1, IiiiiiiiIIIII6, IiiiiiiiIIIII7, (IiiiIiiiiIiIi)this);
            IiiiiiiiIIIII32[IiiiiiiiIIIII4].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
            IiiiiiiiIIIII32[IiiiiiiiIIIII4].setBounds((int)(IiiiiiiiIIIII5 - 152), 247, 34, 18);
            this.add((Component)IiiiiiiiIIIII32[IiiiiiiiIIIII4++]);
        }
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)176, (int)247, (int)46, (int)18, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiiiIiiiIIiii = new iiIiIiiiiiIIi((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 45, 38);
        this.iiiiIiiiIIiii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiiiIiiiIIiii.iIiIiiiiIIiii(IiiiiiiiIIIII32, 1);
        this.iiiiIiiiIIiii.ALLATORIxDEMO(true);
        this.add((Component)this.iiiiIiiiIIiii);
        this.iiiiIiiiIIiii.ALLATORIxDEMO().ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi);
    }

    public void ALLATORIxDEMO(List<Shop> npcshop, int npcType, BigDecimal money) {
        if (npcType == 45) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5e08\u5f92\u79ef\u5206");
        } else if (npcType == 10) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5929\u5ead\u79ef\u5206");
        } else if (npcType == 61) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5e2e\u6218\u79ef\u5206");
        } else if (npcType == 120) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5927\u96c1\u5854\u79ef\u5206");
        } else if (npcType == 121) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5730\u5bab\u79ef\u5206");
        } else if (npcType == 123) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5bfb\u82b3\u79ef\u5206");
        } else if (npcType == 124) {
            this.iIiIiiiiIiIii.setIdAndKey(0, this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) ? "\u526f\u672c\u79ef\u5206" : "\u6728\u9b41\u79ef\u5206");
        } else if (npcType == 126) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u6c34\u9646\u79ef\u5206");
        } else if (npcType == 127) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u526f\u672c\u79ef\u5206");
        } else if (npcType == 1106) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u79cd\u65cf\u8d5b\u79ef\u5206");
        } else if (npcType == 500) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5e78\u8fd0\u5956\u6c60\u79ef\u5206");
        } else if (npcType == 515) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u64c2\u53f0\u8d5b\u79ef\u5206");
        } else if (npcType == 605) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u5927\u95f9\u5929\u5bab\u79ef\u5206");
        } else if (npcType == 89) {
            this.iIiIiiiiIiIii.setIdAndKey(2, "\u7ed1 \u7389");
        } else if (npcType == 2027) {
            this.iIiIiiiiIiIii.setIdAndKey(0, "\u7ade\u6280\u79ef\u5206");
        } else {
            this.iIiIiiiiIiIii.setIdAndKey(1, "\u73b0 \u91d1");
        }
        if (money != null) {
            this.iIiIiiiiIiIii.setIdAndMax(-1, money.longValue());
        }
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
        this.IIiiIiiiIIiIi = null;
        this.IiIIIiiiiIiiI[3].setText(this.iIiIiiiiIiIii.getKey());
        this.iiiIiiiiiiIIi(0);
        this.iiiiIiiiIIiii.ALLATORIxDEMO(npcshop);
        this.ALLATORIxDEMO(null, false);
    }

    public void iIiIiiiiIIiii(int menuType) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII].setKeep(menuType == IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (menuType == 0) {
            this.iIiIiiiiIiIii.setIdAndKey(3, "\u4ed9 \u7389");
        } else if (menuType == 1) {
            this.iIiIiiiiIiIii.setIdAndKey(1, "\u73b0 \u91d1");
        }
        this.IiIIIiiiiIiiI[3].setText(this.iIiIiiiiIiIii.getKey());
        ArrayList<Shop> IiiiiiiiIIIII2 = new ArrayList<Shop>();
        int IiiiiiiiIIIII3 = menuType == 0 ? 1 : 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiiiIiiiIiiII.size()) {
            if (this.iiiiIiiiIiiII.get(IiiiiiiiIIIII4).getShoptype() == IiiiiiiiIIIII3) {
                IiiiiiiiIIIII2.add(this.iiiiIiiiIiiII.get(IiiiiiiiIIIII4));
            }
            ++IiiiiiiiIIIII4;
        }
        this.iiiiIiiiIIiii.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(ShopGoodsBean shopGoodsBean) {
        if (shopGoodsBean.getType() == 0) {
            this.IIiiIiiiIIiIi = shopGoodsBean.getnId();
            this.iiiiIiiiIiiII = shopGoodsBean.getShopList();
            this.iIiIiiiiIIiii(0);
        }
        this.ALLATORIxDEMO(null, false);
        this.ALLATORIxDEMO.iIiIiiiiIIiii();
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) return 0L;
        if (this.IiiiiiiiIIIII == null) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.iIiIiiiiIiIii) / this.IiiiiiiiIIIII.getShopprice();
        if (IiiiiiiiIIIII < number && IiiiiiiiIIIII <= 999L) {
            return IiiiiiiiIIIII;
        }
        if (number <= 999L) return null;
        return 999L;
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IiiiiiiiIIIII == null) return false;
        return true;
    }
}
