/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiIIIii
 *  com.xy.a.IiiiIiiiiIiII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.IIiiiiiiIIIii;
import com.xy.a.IiiiIiiiiIiII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iiIiiiiiIIiii;

public class IIiIiiiiIiIII
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        if (mes.startsWith("2")) {
            mes = mes.substring(1);
            Goodstable IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Goodstable.class);
            iiIiiiiiIIiiI IiiiiiiiIIIII2 = (iiIiiiiiIIiiI)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(46);
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, true);
            return;
        }
        if (mes.startsWith("3")) {
            mes = mes.substring(1);
            RoleSummoning IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, RoleSummoning.class);
            IiiiIiiiiIiII IiiiiiiiIIIII3 = (IiiiIiiiiIiII)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(42);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII, null, true);
            return;
        }
        if (!mes.startsWith("4")) return;
        mes = mes.substring(1);
        Lingbao IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Lingbao.class);
        IIiiiiiiIIIii IiiiiiiiIIIII4 = (IIiiiiiiIIIii)gameClient.gameView.getFormManagement().iiiIiiiiiiIIi(45);
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII, true);
    }
}
