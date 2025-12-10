/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.StallBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.bean.StallBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iiIiiiiiIIiii;

public class IIIIIiiiIiIii
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (!head.equals("stallstate")) return;
        StallBean IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, StallBean.class);
        gameClient.gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII, gameClient.gameView);
    }
}
