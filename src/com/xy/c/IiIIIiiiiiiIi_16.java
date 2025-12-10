/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.NPCDialog
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.NPCDialog;
import com.xy.readbean.NpcInfoBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;

public class IiIIIiiiiiiIi
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        if (head.equals("npc")) {
            NPCDialog IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, NPCDialog.class);
            iIIiiiiiIIIIi IiiiiiiiIIIII3 = (iIIiiiiiIIIIi)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (!head.equals("npcdialog")) return;
        NpcInfoBean IiiiiiiiIIIII4 = IiiiiiiiIIIII.getObjectArea().ALLATORIxDEMO(mes);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        iIIiiiiiIIIIi IiiiiiiiIIIII5 = (iIIiiiiiIIIIi)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(27);
        IiiiiiiiIIIII5.iIiIiiiiIIiii(null, IiiiiiiiIIIII4, Integer.parseInt(IiiiiiiiIIIII4.getNpctable().getNpctype()));
    }
}
