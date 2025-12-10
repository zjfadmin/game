/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.GoodTrans2
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.bean.ConfirmBean;
import com.xy.bean.GoodTrans2;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;

public class IIIiiiiiIiIiI
implements ServerAction {
    public void iIiIiiiiIIiii(String mes, GameView gameView) {
        GoodTrans2 IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, GoodTrans2.class);
        ((iIiIIiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(14)).iIiIiiiiIIiii(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(String mes, GameView gameView) {
        String[] IiiiiiiiIIIII = mes.split("\\|");
        int IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII[0]);
        if (IiiiiiiiIIIII2 == 0) {
            gameView.ALLATORIxDEMO(new ConfirmBean(21, IiiiiiiiIIIII[1], "#G\u73a9\u5bb6#R" + IiiiiiiiIIIII[1] + "#G\u8bf7\u6c42\u4ea4\u6613"));
            return;
        }
        if (IiiiiiiiIIIII2 == 1) {
            iIiIIiiiIiiiI IiiiiiiiIIIII3 = (iIiIIiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(14);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII.length > 2 ? new BigDecimal(IiiiiiiiIIIII[2]) : null, IiiiiiiiIIIII[1]);
            return;
        }
        if (IiiiiiiiIIIII2 == 2) {
            iIiIIiiiIiiiI IiiiiiiiIIIII4 = (iIiIIiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(14);
            IiiiiiiiIIIII4.iiiIiiiiiiIIi(false);
            return;
        }
        if (IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 4 || IiiiiiiiIIIII2 == 5 && IiiiiiiiIIIII.length == 2) {
            iIiIIiiiIiiiI IiiiiiiiIIIII5 = (iIiIIiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(14);
            IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII[1]);
            return;
        }
        if (IiiiiiiiIIIII2 != 5) return;
        iIiIIiiiIiiiI IiiiiiiiIIIII6 = (iIiIIiiiIiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(14);
        IiiiiiiiIIIII6.iiiIiiiiiiIIi(true);
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (head.equals("TransGood")) {
            this.iIiIiiiiIIiii(mes, gameClient.gameView);
            return;
        }
        if (!head.equals("TransState")) return;
        this.ALLATORIxDEMO(mes, gameClient.gameView);
    }
}
