/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iiIiiiiiIIiii;

public class iIIiiiiiIIIIi
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        Goodstable IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Goodstable.class);
        if (IiiiiiiiIIIII.getRole_id().longValue() != gameClient.getRoleId()) {
            return;
        }
        if (IiiiiiiiIIIII.getUsetime() == null) {
            IiiiiiiiIIIII.setUsetime(Integer.valueOf(1));
        }
        IiiiiiiiIIIII.setStatus(Integer.valueOf(0));
        gameClient.gameView.roleData.ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
