/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiiIiiiiIiIiI
 *  com.xy.bean.GangReward
 *  com.xy.c.IIIIIiiiIiiII
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iiiIiiiiIiIiI;
import com.xy.bean.GangReward;
import com.xy.c.IIIIIiiiIiiII;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iiIiiiiiIIiii;
import java.util.List;

public class IIiIiiiiIiiIi
implements ServerAction {
    public void iIiIiiiiIIiii(String mes, GameClient gameClient) {
        List IiiiiiiiIIIII = (List)iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, new IIIIIiiiIiiII(this).getType());
        ((iiiIiiiiIiIiI)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(59)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (head.equals("obtainarticle")) {
            this.iIiIiiiiIIiii(mes, gameClient);
            return;
        }
        if (!head.equals("drawnitems")) return;
        this.ALLATORIxDEMO(mes, gameClient);
    }

    public void ALLATORIxDEMO(String mes, GameClient gameClient) {
        iiiIiiiiIiIiI IiiiiiiiIIIII = (iiiIiiiiIiIiI)gameClient.gameView.getFormManagement().iIiIiiiiIIiii(59);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        GangReward IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, GangReward.class);
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }
}
