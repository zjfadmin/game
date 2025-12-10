/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.RoleMoveBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.bean.RoleMoveBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;

public class iiIiIiiiiiIIi
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        RoleMoveBean IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, RoleMoveBean.class);
        iiIiIiiiiIiii IiiiiiiiIIIII2 = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getRole()) ? gameClient.gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.getRole()) : null;
        if (IiiiiiiiIIIII2 == null) return;
        if (gameClient.getRoleId() == IiiiiiiiIIIII2.iIiIiiiiIiIii.getRole_id().longValue()) {
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII.getPaths(), IiiiiiiiIIIII2.iIiIiiiiIiIii.getSp());
    }
}
