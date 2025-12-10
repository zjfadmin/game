/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.entity.Lingbao
 *  com.xy.formula.BaseValue
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.game;

import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.entity.Lingbao;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;

public class HandleLingbao {
    public static void ALLATORIxDEMO(Goodstable good, RoleData roleData) {
        GameView IiiiiiiiIIIII = roleData.getGameView();
        Lingbao IiiiiiiiIIIII2 = roleData.getChoseBao();
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u7075\u5b9d");
            return;
        }
        if (IiiiiiiiIIIII2.getBaotype().equals("\u6cd5\u5b9d")) {
            IiiiiiiiIIIII.iIiIiiiiIIiii("\u6cd5\u5b9d\u4e0d\u80fd\u6253\u7b26\u77f3");
            return;
        }
        String[] IiiiiiiiIIIII3 = null;
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2.getFushis())) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getFushis().split("\\|");
        }
        if ((IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.length : 0) >= IiiiiiiiIIIII2.getFusum()) {
            return;
        }
        if (IiiiiiiiIIIII3 != null) {
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
                Goodstable IiiiiiiiIIIII5 = roleData.getGood(new BigDecimal(IiiiiiiiIIIII3[IiiiiiiiIIIII4]));
                if (IiiiiiiiIIIII5 == null) {
                    return;
                }
                if (IiiiiiiiIIIII5.getGoodsname().equals(good.getGoodsname())) {
                    IiiiiiiiIIIII.iIiIiiiiIIiii("\u4f60\u5df2\u7ecf\u7a7f\u6234\u4e86\u540c\u7c7b\u578b\u7684\u7b26\u77f3");
                    return;
                }
                ++IiiiiiiiIIIII4;
            }
        }
        roleData.ALLATORIxDEMO(good.getRgid());
        good.setStatus(Integer.valueOf(1));
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)0, (GameClient)IiiiiiiiIIIII.getClient());
        IiiiiiiiIIIII2.ALLATORIxDEMO("" + good.getRgid());
        ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII2, (GameClient)IiiiiiiiIIIII.getClient());
        roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(Goodstable good, boolean isShiftDown, RoleData roleData) {
        Lingbao IiiiiiiiIIIII = roleData.getChoseBao();
        if (IiiiiiiiIIIII == null) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u7075\u5b9d");
            return;
        }
        long IiiiiiiiIIIII2 = good.getType();
        if (isShiftDown && roleData.getGameView().getClient().ALLATORIxDEMO(2, 12) && IiiiiiiiIIIII2 == 1002L) {
            iIiIiiiiiiiIi IiiiiiiiIIIII3 = (iIiIiiiiiiiIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII3.ALLATORIxDEMO(4, IiiiiiiiIIIII.getBaoid(), good);
            return;
        }
        if (IiiiiiiiIIIII2 == 190L) {
            if (IiiiiiiiIIIII.getBaotype().equals("\u6cd5\u5b9d")) {
                roleData.getGameView().iIiIiiiiIIiii("\u6cd5\u5b9d\u4e0d\u80fd\u6253\u6280\u80fd");
                return;
            }
        } else if (IiiiiiiiIIIII2 == 891L) {
            int IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5 = BaseValue.getQv((String)IiiiiiiiIIIII.getBaoquality());
            if (IiiiiiiiIIIII5 >= 50) {
                roleData.getGameView().iIiIiiiiIIiii("\u5df2\u7ecf\u8fbe\u5230\u6700\u9ad8\u54c1\u8d28\u4e86");
                return;
            }
            IiiiiiiiIIIII5 /= 10;
            boolean bl = true;
            switch (++IiiiiiiiIIIII5) {
                case 2: {
                    IiiiiiiiIIIII4 = 1;
                    break;
                }
                case 3: {
                    IiiiiiiiIIIII4 = 2;
                    break;
                }
                case 4: {
                    IiiiiiiiIIIII4 = 4;
                    break;
                }
                case 5: {
                    IiiiiiiiIIIII4 = 10;
                    break;
                }
            }
            if (good.getUsetime() < IiiiiiiiIIIII4) {
                roleData.getGameView().iIiIiiiiIIiii("\u8be5\u54c1\u8d28\u63d0\u5347\u9700\u8981\u6d88\u8017" + IiiiiiiiIIIII4 + "\u4e2a\u7075\u5b9d\u8bf8\u5929\u5370");
                return;
            }
        } else if (IiiiiiiiIIIII2 != 1002L) {
            return;
        }
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"userling", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getBaoid()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
    }

    public static void ALLATORIxDEMO(BigDecimal id, Lingbao lingbao, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getGoodEquip(id);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getType() != 188L) {
            return;
        }
        String IiiiiiiiIIIII2 = lingbao.getFushis();
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII2 = "";
        }
        lingbao.ALLATORIxDEMO(IiiiiiiiIIIII.getRgid().toString());
        if (IiiiiiiiIIIII2.length() > lingbao.getFushis().length() && roleData.ALLATORIxDEMO(IiiiiiiiIIIII)) {
            IiiiiiiiIIIII.setStatus(Integer.valueOf(0));
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)roleData.getGameView().getClient());
            ParamTool.ALLATORIxDEMO((Lingbao)lingbao, (GameClient)roleData.getGameView().getClient());
            roleData.getRoleProperty().ALLATORIxDEMO(lingbao);
            return;
        }
        lingbao.ALLATORIxDEMO(IiiiiiiiIIIII.getRgid().toString());
        roleData.getGameView().iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1");
    }
}
