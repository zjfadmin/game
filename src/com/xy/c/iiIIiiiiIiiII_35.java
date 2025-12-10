/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IiIIiiiiiIiiI
 *  com.xy.a.q.iiiIiiiiIiiiI
 *  com.xy.bean.ShopGoodsBean
 *  com.xy.readbean.Shop
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IiIIiiiiiIiiI;
import com.xy.a.q.iiiIiiiiIiiiI;
import com.xy.bean.ShopGoodsBean;
import com.xy.readbean.Shop;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.List;

public class iiIIiiiiIiiII
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        if (head.equals("shop")) {
            String[] IiiiiiiiIIIII2 = mes.split("\\|");
            List IiiiiiiiIIIII3 = (List)IiiiiiiiIIIII.getObjectArea().ALLATORIxDEMO().getNpcShopMap().get(IiiiiiiiIIIII2[0]);
            iiiIiiiiIiiiI IiiiiiiiIIIII4 = (iiiIiiiiIiiiI)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(23);
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII3, Integer.parseInt(IiiiiiiiIIIII2[0]), new BigDecimal(IiiiiiiiIIIII2[1]));
            IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiIi(23);
            return;
        }
        if (head.equals("shopGood")) {
            ShopGoodsBean IiiiiiiiIIIII5 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, ShopGoodsBean.class);
            iiiIiiiiIiiiI IiiiiiiiIIIII6 = (iiiIiiiiIiiiI)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(23);
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII5);
            IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiIi(23);
            return;
        }
        if (!head.equals("shopPrice")) return;
        IiiiiiiiiIIII IiiiiiiiIIIII7 = IiiiiiiiIIIII.getObjectArea();
        int IiiiiiiiIIIII8 = mes.indexOf("|");
        if (IiiiiiiiIIIII8 == -1) {
            return;
        }
        String IiiiiiiiIIIII9 = mes.substring(0, IiiiiiiiIIIII8);
        if ((IiiiiiiiIIIII8 = mes.indexOf("|", IiiiiiiiIIIII8 + 1)) == -1) {
            return;
        }
        String IiiiiiiiIIIII10 = mes.substring(IiiiiiiiIIIII9.length() + 1, IiiiiiiiIIIII8);
        long IiiiiiiiIIIII11 = Long.parseLong(mes.substring(IiiiiiiiIIIII8 + 1));
        if (IiiiiiiiIIIII9.equals("1")) {
            Shop IiiiiiiiIIIII12 = IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII10);
            if (IiiiiiiiIIIII12 == null) {
                return;
            }
            if (IiiiiiiiIIIII12.getShoptype() >= 5001 && IiiiiiiiIIIII12.getShoptype() <= 5006) {
                IiIIiiiiiIiiI IiiiiiiiIIIII13 = (IiIIiiiiiIiiI)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(133);
                if (IiiiiiiiIIIII13 == null) return;
                if (!IiiiiiiiIIIII13.ALLATORIxDEMO().isVisible()) return;
                IiiiiiiiIIIII13.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII10, IiiiiiiiIIIII11);
                return;
            }
            iiiIiiiiIiiiI IiiiiiiiIIIII14 = (iiiIiiiiIiiiI)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(23);
            IiiiiiiiIIIII14.ALLATORIxDEMO(IiiiiiiiIIIII10, IiiiiiiiIIIII11);
            return;
        }
        if (!IiiiiiiiIIIII9.equals("2")) return;
        Shop IiiiiiiiIIIII15 = IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII10);
        if (IiiiiiiiIIIII15 == null) {
            return;
        }
        IiiiiiiiIIIII15.setShopprice(IiiiiiiiIIIII11);
        iiIiiiiiIIiiI IiiiiiiiIIIII16 = (iiIiiiiiIIiiI)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(46);
        IiiiiiiiIIIII16.ALLATORIxDEMO(IiiiiiiiIIIII15);
    }
}
