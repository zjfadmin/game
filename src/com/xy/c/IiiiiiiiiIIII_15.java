/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiIIiiiiiiiI
 *  com.xy.bean.LoginResult
 *  com.xy.c.IIiIiiiiIIiii
 *  com.xy.c.IIiiIiiiIiiiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.q.iIiIIiiiiiiiI;
import com.xy.bean.LoginResult;
import com.xy.c.IIiIiiiiIIiii;
import com.xy.c.IIiiIiiiIiiiI;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.List;

public class IiiiiiiiiIIII
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        RolePet IiiiiiiiIIIII;
        GameView IiiiiiiiIIIII2 = gameClient.gameView;
        if (head.equals("pawn")) {
            Goodstable IiiiiiiiIIIII3 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Goodstable.class);
            IiiiiiiiIIIII2.roleData.ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (!head.equals("pawnpet")) {
            if (!head.equals("parcel")) return;
            List IiiiiiiiIIIII4 = (List)iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, new IIiiIiiiIiiiI(this).getType());
            IiiiiiiiIIIII2.roleData.iiiIiiiiiiIIi(IiiiiiiiIIIII4);
            IiiiiiiiIIIII2.getFormManagement().iIiIiiiiIIiIi(182);
            return;
        }
        if (mes.startsWith("S")) {
            List IiiiiiiiIIIII5 = (List)iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes.substring(1), new IIiIiiiiIIiii(this).getType());
            iIiIIiiiiiiiI IiiiiiiiIIIII6 = (iIiIIiiiiiiiI)IiiiiiiiIIIII2.getFormManagement().iiiIiiiiiiIIi(131);
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        if (!mes.startsWith("P")) {
            if (!mes.startsWith("R")) return;
        }
        RoleData IiiiiiiiIIIII7 = IiiiiiiiIIIII2.roleData;
        LoginResult IiiiiiiiIIIII6 = IiiiiiiiIIIII7.getLoginResult();
        IiiiiiiiIIIII6.setGold(new BigDecimal(IiiiiiiiIIIII6.getGold().longValue() - 1000000L));
        RoleSummoning IiiiiiiiIIIII8 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes.substring(1), RoleSummoning.class);
        if (mes.startsWith("P")) {
            IiiiiiiiIIIII = IiiiiiiiIIIII7.getRolePet(IiiiiiiiIIIII8.getSid().longValue());
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII7.pets.remove(IiiiiiiiIIIII);
            }
        } else {
            IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII8);
        }
        if ((IiiiiiiiIIIII = (iIiIIiiiiiiiI)IiiiiiiiIIIII2.getFormManagement().iIiIiiiiIIiii(131)) == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII8, mes.startsWith("P") ? 1 : 2);
    }
}
