/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BuyShopBean
 *  com.xy.game.HandleOption
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
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
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.bean.BuyShopBean;
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
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIiiiiiiiII
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII iIIiIiiiiiiIi;
    private JLabel[] IIIIiiiiiiiII;
    private IiiiiiiiiIIII[] iiIIIiiiiiiiI;
    private iiIiIiiiiIiIi IiIiiiiiIIIII;
    private iiIiIiiiiiIIi iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private iIIiIiiiIiiIi[] iiiIiiiiiiiIi;
    private IIiIIiiiIIIiI iIiiIiiiiiiII;
    private IiiiIiiiiIiII IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI iiIiiiiiiiIii;
    private MoneyType IiiiiiiiIIIII;
    private Shop ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void ALLATORIxDEMO(String shopId, long price) {
        if (this.ALLATORIxDEMO == null) return;
        if (!this.ALLATORIxDEMO.getShopid().equals(shopId)) return;
        this.ALLATORIxDEMO.setShopprice(price);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi[0], (long)this.ALLATORIxDEMO.getShopprice());
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(this.iIiiIiiiiiiII.ALLATORIxDEMO()));
    }

    public void iIiIiiiiIIiIi(int type) {
        this.IiIiiiiiIIIII.iIiIiiiiIIiii();
        this.iIIiIiiiiiiIi.setText(type == 1 ? "\u8d2d\u4e70" : "\u51fa\u552e");
        this.ALLATORIxDEMO(null, false);
        this.iiiiIiiiIiiII = type;
        this.iIiIiiiiIIiii(0);
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.ALLATORIxDEMO == null) {
            this.iiiIiiiiiiiIi[1].setText(null);
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi[1], (long)(this.ALLATORIxDEMO.getShopprice() * number));
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(int id) {
        if (id != 307) return;
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(14) != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ea4\u6613\u65f6\u4e0d\u80fd\u64cd\u4f5c");
            return;
        }
        Shop IiiiiiiiIIIII = this.ALLATORIxDEMO;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7684\u7269\u54c1");
            return;
        }
        int IiiiiiiiIIIII2 = (int)this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8f93\u5165\u6570\u91cf\u4e3a\u96f6");
            return;
        }
        if (this.iiiiIiiiIiiII == 1) {
            void IiiiiiiiIIIII3;
            BuyShopBean buyShopBean = new BuyShopBean();
            IiiiiiiiIIIII3.setAte(1);
            HandleOption.ALLATORIxDEMO((BuyShopBean)buyShopBean, (Shop)IiiiiiiiIIIII, (int)IiiiiiiiIIIII2, (MoneyType)this.IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi);
        } else {
            void IiiiiiiiIIIII4;
            StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
            IiiiiiiiIIIII5.append(IiiiiiiiIIIII.getShopid());
            String IiiiiiiiIIIII6 = this.ALLATORIxDEMO().getGoodNum(IiiiiiiiIIIII.getShopiid(), IiiiiiiiIIIII5, IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII6 != null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(IiiiiiiiIIIII6);
                return;
            }
            BuyShopBean buyShopBean = new BuyShopBean();
            IiiiiiiiIIIII4.setAte(11);
            IiiiiiiiIIIII4.setCd(IiiiiiiiIIIII5.toString());
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"nbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
            this.iiIIiiiiIiIIi.getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
        }
        this.IIiiIiiiIIiIi.setText("0");
    }

    /*
     * Unable to fully structure code
     */
    public IiIIiiiiiiiII(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 622, 462, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiIIIiiiiiiiI = new IiiiiiiiiIIII[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 301 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u755c\u7267" : (IiiiiiiiIIIII == 1 ? "\u79cd\u690d" : (IiiiiiiiIIIII == 2 ? "\u91c7\u77ff" : (IiiiiiiiIIIII == 3 ? "\u5bb6\u5177" : (IiiiiiiiIIIII == 4 ? "\u5236\u836f" : (IiiiiiiiIIIII == 5 ? "\u7b26\u6587" : ""))))), (IiiiIiiiiIiIi)this);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(58 + 65 * IiiiiiiiIIIII, 53, 63, 24);
            this.add((Component)this.iiIIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        this.iIIiIiiiiiiIi = new IiiiiiiiiIIII("sc/e/31.png", 1, 307, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u8d2d \u4e70", (IiiiIiiiiIiIi)this);
        this.iIIiIiiiiiiIi.setBounds(506, 373, 79, 25);
        this.iIIiIiiiiiiIi.setForeground(Color.black);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.IIIIiiiiiiiII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)472, (int)(88 + 61 * IiiiiiiiIIIII), (int)58, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5355  \u4ef7" : (IiiiiiiiIIIII == 1 ? "\u603b  \u989d" : (IiiiiiiiIIIII == 2 ? "\u6570\u91cf" : (IiiiiiiiIIIII == 3 ? "\u73b0 \u91d1" : ""))));
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IIIIiiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 2) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(485, 345, 36, 19);
            }
            if (IiiiiiiiIIIII == 3) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(58, 410, 58, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiiIiiiiiiiIi = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)472, (int)(111 + 61 * IiiiiiiiIIIII), (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(397, 407, 55, 19);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setHorizontalAlignment(0);
            }
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        IiiiiiiiIIIII.setBounds(526, 345, 60, 19);
        IiiiiiiiIIIII.setHorizontalAlignment(10);
        this.iIiiIiiiiiiII = new IIiIIiiiIIIiI(15, (JTextField)IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII = new MoneyType();
        this.IiiiiiiiIIIII.setIdAndKey(1, "\u73b0 \u91d1");
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)109, (int)410, (int)169, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IiiiiiiiIIIII, (GameView)gameView);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiIiiiiiIIIII.ALLATORIxDEMO(2);
        this.add((Component)IiiiiiiiIIIII);
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(530, 284, 50, 50);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            block13: {
                block14: {
                    block12: {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
                        this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
                        if (IiiiiiiiIIIII != 0) break block12;
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(526, 280, 59, 57);
                        break block13;
                    }
                    if (IiiiiiiiIIIII != 1) break block14;
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(58, 90, 411, 309);
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl90
                }
                if (IiiiiiiiIIIII == 2) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)16, (int)16, (int)16, (int)16, (boolean)false));
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(45, 77, 549, 360);
                }
                break block13;
                do {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiiIiiiIiiiI(IiiiiiiiIIIII == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(378, 408, 18, 18);
                    } else if (IiiiiiiiIIIII == 1) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(453, 408, 18, 18);
                    }
                    this.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl90:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.iiIiIiiiiIIIi = new iiIiIiiiiiIIi((IiiiIiiiiIiIi)this, 8, 6, 51, 51, 0, 0, 59, 92);
                this.iiIiIiiiiIIIi.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.iiIiIiiiiIIIi.iIiIiiiiIIiii(IiiiiiiiIIIII, 1);
                this.iiIiIiiiiIIIi.ALLATORIxDEMO(true);
                this.add((Component)this.iiIiIiiiiIIIi);
                this.iiIiIiiiiIIIi.ALLATORIxDEMO().ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi[2]);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(Shop shop, boolean type) {
        if (this.ALLATORIxDEMO != null && this.ALLATORIxDEMO == shop) {
            if (this.iiiiIiiiIiiII == 1) {
                long IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO() + (long)(type ? 99 : 1);
                this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
                return;
            }
            long IiiiiiiiIIIII = this.ALLATORIxDEMO().getGoodNum(this.ALLATORIxDEMO.getShopiid());
            long IiiiiiiiIIIII2 = type ? IiiiiiiiIIIII : this.iIiiIiiiiiiII.ALLATORIxDEMO() + 1L;
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII2));
            return;
        }
        this.ALLATORIxDEMO = shop;
        if (this.ALLATORIxDEMO == null) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(0, null);
            this.iiiIiiiiiiiIi[0].setText(null);
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText("0");
            return;
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(13, (Object)shop);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiIiiiiiiiIi[0], (long)this.ALLATORIxDEMO.getShopprice());
        if (this.iiiiIiiiIiiII == 1) {
            int IiiiiiiiIIIII = type ? 99 : 1;
            this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII));
            return;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getGoodNum(this.ALLATORIxDEMO.getShopiid());
        long IiiiiiiiIIIII3 = type ? IiiiiiiiIIIII : 1L;
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(String.valueOf(IiiiiiiiIIIII3));
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiIIIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIIIiiiiIiiI);
            ++IiiiiiiiIIIII;
        }
        List IiiiiiiiIIIII2 = (List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get(String.valueOf(5001 + this.IiIIIiiiiIiiI));
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 0L) return 0L;
        if (this.ALLATORIxDEMO == null) {
            return 0L;
        }
        if (this.iiiiIiiiIiiII == 1) {
            long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.IiiiiiiiIIIII) / this.ALLATORIxDEMO.getShopprice();
            if (number <= IiiiiiiiIIIII) return null;
            return IiiiiiiiIIIII;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getGoodNum(this.ALLATORIxDEMO.getShopiid());
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }
}
