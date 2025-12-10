/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BabyListBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.bean.BabyListBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;

public class iiiiiiiiIIIII
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        BabyListBean IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, BabyListBean.class);
        IiiiiiiiIIIII.roleData.setBabys(IiiiiiiiIIIII2.getBabyList());
        IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiIi(1);
    }
}
