/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiiiiiI
 *  com.xy.bean.GangListBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iIiIIiiiiiiiI;
import com.xy.bean.GangListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iiIiiiiiIIiii;

public class IiIiIiiiiiIiI
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (!head.equals("ganglist")) return;
        GangListBean IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, GangListBean.class);
        ((iIiIIiiiiiiiI)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(28)).ALLATORIxDEMO(IiiiiiiiIIIII.getGangs());
    }
}
