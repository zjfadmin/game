/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIiiiiiIiIiI
 *  com.xy.bean.RoleShow
 *  com.xy.bean.TitleBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.w.IIIiiiiiIiIiI;
import com.xy.bean.RoleShow;
import com.xy.bean.TitleBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;

public class iIiIIiiiIiiiI
implements ServerAction {
    public void iIiIiiiiIIiii(String mes, GameView gameView) {
        RoleShow IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, RoleShow.class);
        if (gameView.roleUnit.iIiIiiiiIiIii.getRole_id().compareTo(IiiiiiiiIIIII.getRole_id()) == 0) {
            gameView.roleUnit.iIiIiiiiIIiii(IiiiiiiiIIIII.getTitle());
        } else {
            iiIiIiiiiIiii IiiiiiiiIIIII2 = gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.getRolename());
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII.getTitle());
            }
        }
        gameView.getFormManagement().iiiIiiiiiiIIi(10);
    }

    public void ALLATORIxDEMO(String mes, GameView gameView) {
        TitleBean IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TitleBean.class);
        ((IIIiiiiiIiIiI)gameView.getFormManagement().iiiIiiiiiiIIi(10)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (head.equals("titlelist")) {
            this.ALLATORIxDEMO(mes, gameClient.gameView);
            return;
        }
        if (!head.equals("titlechange")) return;
        this.iIiIiiiiIIiii(mes, gameClient.gameView);
    }
}
