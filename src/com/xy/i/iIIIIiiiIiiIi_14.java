/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiIIiI
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.q.iIIiiiiiIIIIi
 *  com.xy.a.q.iiIiIiiiiIiIi
 *  com.xy.a.q.iiIiiiiiIIiii
 *  com.xy.bean.BuyShopBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Eshop
 *  com.xy.readbean.Shop
 *  com.xy.socket.Agreement
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.i;

import com.xy.a.q.IiIIIiiiiIIiI;
import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.q.iIIiiiiiIIIIi;
import com.xy.a.q.iiIiIiiiiIiIi;
import com.xy.a.q.iiIiiiiiIIiii;
import com.xy.bean.BuyShopBean;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Eshop;
import com.xy.readbean.Shop;
import com.xy.socket.Agreement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.JComponent;

public class iIIIIiiiIiiIi
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;
    private JComponent ALLATORIxDEMO;

    public void ALLATORIxDEMO(int id) {
        this.IiiiiiiiIIIII = id;
    }

    public void ALLATORIxDEMO(JComponent view) {
        this.ALLATORIxDEMO = view;
    }

    public void iIiIiiiiIIiIi(MouseEvent e) {
        if (this.ALLATORIxDEMO instanceof iiIiiiiiIIiii) {
            if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            iiIiiiiiIIiii IiiiiiiiIIIII = (iiIiiiiiIIiii)this.ALLATORIxDEMO;
            IiIIIiiiiIIiI IiiiiiiiIIIII2 = (IiIIIiiiiIIiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(44);
            IiiiiiiiIIIII2.ALLATORIxDEMO(null, IiiiiiiiIIIII.ALLATORIxDEMO());
            return;
        }
        if (this.ALLATORIxDEMO instanceof IiIIIiiiiiiII) {
            ((IiIIIiiiiiiII)this.ALLATORIxDEMO).ALLATORIxDEMO();
            return;
        }
        if (!(this.ALLATORIxDEMO instanceof iiIiIiiiiIiIi)) {
            if (!(this.form instanceof iIIiiiiiIIIIi)) return;
            ((iIIiiiiiIIIIi)this.form).ALLATORIxDEMO(this.ALLATORIxDEMO);
            return;
        }
        if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        iiIiIiiiiIiIi IiiiiiiiIIIII = (iiIiIiiiiIiIi)this.ALLATORIxDEMO;
        if (IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO() instanceof Shop) {
            Shop IiiiiiiiIIIII3 = (Shop)IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            IiIIIiiiiIIiI IiiiiiiiIIIII4 = (IiIIIiiiiIIiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(44);
            IiiiiiiiIIIII4.ALLATORIxDEMO(null, IiiiiiiiIIIII3);
            return;
        }
        if (!(IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO() instanceof Eshop)) return;
        Eshop IiiiiiiiIIIII5 = (Eshop)IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO();
        if (IiiiiiiiIIIII5 == null) {
            return;
        }
        int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5.getEshopiid());
        if (IiiiiiiiIIIII6 < 0) {
            this.ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        ((IiIIIiiiiIIiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(44)).ALLATORIxDEMO(IiiiiiiiIIIII5, null);
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(Shop shop, IiiiIiiiiIiIi form) {
        String IiiiiiiiIIIII = "\u91d1\u94b1";
        if (shop.getShoptype() == 45) {
            IiiiiiiiIIIII = "\u5e08\u5f92\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 89) {
            IiiiiiiiIIIII = "\u7ed1\u7389";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 10) {
            IiiiiiiiIIIII = "\u5929\u5ead\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 61) {
            IiiiiiiiIIIII = "\u5e2e\u6218\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 120) {
            IiiiiiiiIIIII = "\u5927\u96c1\u5854\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 121) {
            IiiiiiiiIIIII = "\u5730\u5bab\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 123) {
            IiiiiiiiIIIII = "\u5bfb\u82b3\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 124) {
            IiiiiiiiIIIII = form.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) ? "\u526f\u672c\u79ef\u5206" : "\u6728\u9b41\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 126) {
            IiiiiiiiIIIII = "\u6c34\u9646\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 127) {
            IiiiiiiiIIIII = "\u526f\u672c\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 1106) {
            IiiiiiiiIIIII = "\u79cd\u65cf\u8d5b\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 600) {
            IiiiiiiiIIIII = "\u6bd4\u6597\u5956\u7ae0";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 601) {
            IiiiiiiiIIIII = "\u661f\u8292";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 605) {
            IiiiiiiiIIIII = "\u5927\u95f9\u5929\u5bab\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 2027) {
            IiiiiiiiIIIII = "\u7ade\u6280\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 1100) {
            IiiiiiiiIIIII = "\u63a8\u5e7f\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 505) {
            IiiiiiiiIIIII = "\u64c2\u53f0\u8d5b\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 3000) {
            IiiiiiiiIIIII = "\u7948\u798f\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() == 3001) {
            IiiiiiiiIIIII = "\u65a9\u5996\u79ef\u5206";
            return IiiiiiiiIIIII;
        }
        if (shop.getShoptype() != 500) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = "\u5e78\u8fd0\u5956\u6c60\u79ef\u5206";
        return IiiiiiiiIIIII;
    }

    public iIIIIiiiIiiIi(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.IiiiiiiiIIIII = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public iIIIIiiiIiiIi(String path, int type, int btn, String text, IiiiIiiiiIiIi form) {
        this(path, type, btn, null, null, text, form);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Eshop eshop) {
        void IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.form.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2.getPackRecord().ALLATORIxDEMO(String.valueOf(-Integer.parseInt(eshop.getEshopiid())))) {
            this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u5df2\u62e5\u6709\u8be5\u7279\u6548");
            return;
        }
        if (IiiiiiiiIIIII2.getLoginResult().getCodecard().compareTo(new BigDecimal(eshop.getEshopprice())) < 0) {
            this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6ca1\u6709\u8db3\u591f\u7684\u4ed9\u7389!");
            return;
        }
        BuyShopBean buyShopBean = new BuyShopBean();
        IiiiiiiiIIIII.setAte(0);
        IiiiiiiiIIIII.setCd(eshop.getEshopid());
        IiiiiiiiIIIII.setSum(1);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"nbuy", (String)com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.ALLATORIxDEMO == null) return;
        this.iIiIiiiiIIiIi(e);
    }

    public iIIIIiiiIiiIi(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.IiiiiiiiIIIII = id;
    }
}
