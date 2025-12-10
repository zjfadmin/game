/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIiiiiIiIiI
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.a.iIiiiiiiiiiii
 *  com.xy.bean.ChatFriendBean
 *  com.xy.bean.FriendBean
 *  com.xy.bean.FriendResultBean
 *  com.xy.bean.Role_bean
 *  com.xy.entity.Friendtable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iIiIiiiiIiIiI;
import com.xy.a.iIiiIiiiIiIIi;
import com.xy.a.iIiiiiiiiiiii;
import com.xy.bean.ChatFriendBean;
import com.xy.bean.FriendBean;
import com.xy.bean.FriendResultBean;
import com.xy.bean.Role_bean;
import com.xy.entity.Friendtable;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;

public class IIiIIiiiIIIiI
implements ServerAction {
    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        block9: {
            IiiiiiiiIIIII = gameClient.gameView;
            IiiiiiiiIIIII = IiiiiiiiIIIII.roleData;
            if (!head.equals("friend")) break block9;
            IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, FriendResultBean.class);
            IiiiiiiiIIIII = IiiiiiiiIIIII.getFriendtables();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
            if (true) ** GOTO lbl63
        }
        if (head.equals("friendchat")) {
            IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, ChatFriendBean.class);
            v0 = IiiiiiiiIIIII = IiiiiiiiIIIII.getSendRoleId() != null ? IiiiiiiiIIIII.getSendRoleId().longValue() : 0L;
            if (IiiiiiiiIIIII == 0L) {
                IiiiiiiiIIIII.setRolename("\u5927\u8bdd\u7cbe\u7075");
            }
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getFriend(IiiiiiiiIIIII)) == null) {
                IiiiiiiiIIIII = new FriendBean();
                IiiiiiiiIIIII.setFid(IiiiiiiiIIIII);
                IiiiiiiiIIIII.setRoleName(IiiiiiiiIIIII.getRolename());
                IiiiiiiiIIIII = IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.getRolename());
                v1 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.iIiIiiiiIiIii : null;
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII.setSpeciesId(IiiiiiiiIIIII.getSpecies_id().intValue());
                    IiiiiiiiIIIII.setLvl(IiiiiiiiIIIII.getGrade().intValue());
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            } else {
                IiiiiiiiIIIII.setRoleName(IiiiiiiiIIIII.getRolename());
            }
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append("#r#R");
            IiiiiiiiIIIII.append(iIiIIiiiIiiiI.iIiIiiiiIIiii((long)iIiIIiiiIiiiI.ALLATORIxDEMO()));
            IiiiiiiiIIIII.append(" ");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getRoleName());
            IiiiiiiiIIIII.append("#r#W");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getMessage());
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.toString());
            IiiiiiiiIIIII = IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(56);
            if (IiiiiiiiIIIII != null && ((iIiiIiiiIiIIi)IiiiiiiiIIIII).ALLATORIxDEMO(IiiiiiiiIIIII.getFid(), IiiiiiiiIIIII.toString())) {
                return;
            }
            IiiiiiiiIIIII.setChat(true);
            IiiiiiiiIIIII.baseView.ALLATORIxDEMO(9, true);
            IiiiiiiiIIIII.iIiIiiiiIIiii(false, "\u597d\u53cb\u4fe1\u4ef6\u63d0\u793a\u97f3.mp3");
            return;
        }
        if (!head.equals("searcahChatRoleId") && !head.equals("searcahChatRoleName")) {
            head.equals("searchChatRecorde");
            return;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(75);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Role_bean.class);
        IiiiiiiiIIIII = (iIiIiiiiIiIiI)IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
        return;
        do {
            var10_18 = (Friendtable)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.ALLATORIxDEMO((Friendtable)IiiiiiiiIIIII);
lbl63:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        IiiiiiiiIIIII = IiiiiiiiIIIII.getFormManagement().ALLATORIxDEMO(4);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII = (iIiiiiiiiiiii)IiiiiiiiIIIII.getFormManagement().ALLATORIxDEMO(4);
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getFriendList(), true);
    }
}
