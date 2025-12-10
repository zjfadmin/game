/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIIIiiiiiIiIi
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 */
package com.xy.c;

import com.xy.a.q.iIIIiiiiiIiIi;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;

public class iiiiiiiiiiIiI
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        if (mes.startsWith("G7")) {
            ((iIIIiiiiiIiIi)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(125)).iIiIiiiiIIiIi(mes.substring(2));
            return;
        }
        IiiiiiiiIIIII.roleData.getTaskSystem().ALLATORIxDEMO(mes);
    }
}
