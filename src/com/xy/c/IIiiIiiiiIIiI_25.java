/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiIiiiI
 *  com.xy.a.iiiiiiiiiiIiI
 *  com.xy.bean.TeamBean
 *  com.xy.bean.TeamRoleList
 *  com.xy.bean.TeanBeanList
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.entity.TeamRole
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iIiIIiiiIiiiI;
import com.xy.a.iiiiiiiiiiIiI;
import com.xy.bean.TeamBean;
import com.xy.bean.TeamRoleList;
import com.xy.bean.TeanBeanList;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.entity.TeamRole;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;

public class IIiiIiiiiIIiI
implements ServerAction {
    public void iIiIiiiiIIiii(String mes, GameView gameView) {
        iiIiIiiiiIiii IiiiiiiiIIIII;
        String[] IiiiiiiiIIIII2 = mes.split("#");
        BigDecimal IiiiiiiiIIIII3 = new BigDecimal(IiiiiiiiIIIII2[0]);
        if (!IiiiiiiiIIIII2[1].equals("null")) {
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[1].split("\\|");
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                IiiiiiiiIIIII = gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII4[IiiiiiiiIIIII5]);
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII.iIiIiiiiIiIii.setTroop_id(IiiiiiiiIIIII3);
                    IiiiiiiiIIIII.iIiIiiiiIiIii.setTeamInfo(IiiiiiiiIIIII2[1]);
                    IiiiiiiiIIIII.IiiIiiiiiiIiI();
                }
                ++IiiiiiiiIIIII5;
            }
        }
        int IiiiiiiiIIIII6 = 2;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII2[IiiiiiiiIIIII6].split("&");
            IiiiiiiiIIIII = gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII7[0]);
            if (IiiiiiiiIIIII != null) {
                if (Integer.parseInt(IiiiiiiiIIIII7[1]) == -3) {
                    IiiiiiiiIIIII.iIiIiiiiIiIii.setTroop_id(null);
                    if (IiiiiiiiIIIII == gameView.roleUnit) {
                        gameView.roleData.teamBean = null;
                        this.ALLATORIxDEMO(gameView);
                    }
                } else {
                    IiiiiiiiIIIII.iIiIiiiiIiIii.setTroop_id(IiiiiiiiIIIII3);
                }
                IiiiiiiiIIIII.iIiIiiiiIiIii.setTeamInfo(null);
                IiiiiiiiIIIII.IiiIiiiiiiIiI();
            }
            ++IiiiiiiiIIIII6;
        }
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        GameView IiiiiiiiIIIII = gameClient.gameView;
        if (head.equals("team1")) {
            TeamBean IiiiiiiiIIIII2;
            IiiiiiiiIIIII.roleData.teamBean = IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TeamBean.class);
            this.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (head.equals("team2")) {
            IiiiIiiiiIiIi IiiiiiiiIIIII3 = IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(30);
            if (IiiiiiiiIIIII3 != null) {
                TeamRole IiiiiiiiIIIII4 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TeamRole.class);
                ((iiiiiiiiiiIiI)IiiiiiiiIIIII3).ALLATORIxDEMO(IiiiiiiiIIIII4);
                return;
            }
            IiiiiiiiIIIII.baseView.ALLATORIxDEMO(3, true);
            return;
        }
        if (head.equals("team3")) {
            this.iIiIiiiiIIiii(mes, IiiiiiiiIIIII);
            return;
        }
        if (head.equals("team4")) {
            this.ALLATORIxDEMO(mes, IiiiiiiiIIIII);
            return;
        }
        if (head.equals("team6")) {
            TeamRoleList IiiiiiiiIIIII5 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TeamRoleList.class);
            iiiiiiiiiiIiI IiiiiiiiIIIII6 = (iiiiiiiiiiIiI)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(30);
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII5.getT());
            return;
        }
        if (!head.equals("enlist")) return;
        TeanBeanList teanBeanList = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TeanBeanList.class);
    }

    public void ALLATORIxDEMO(String mes, GameView gameView) {
        TeamBean IiiiiiiiIIIII = gameView.roleData.teamBean;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        TeamRole IiiiiiiiIIIII2 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, TeamRole.class);
        int IiiiiiiiIIIII3 = 0;
        if (IiiiiiiiIIIII2.getState() == -3) {
            IiiiiiiiIIIII3 = 1;
        } else if (IiiiiiiiIIIII2.getState() == 1 && ((TeamRole)IiiiiiiiIIIII.getTeams().get(0)).getRoleId().compareTo(IiiiiiiiIIIII2.getRoleId()) != 0) {
            IiiiiiiiIIIII3 = 2;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        this.ALLATORIxDEMO(gameView);
    }

    public void ALLATORIxDEMO(GameView gameView) {
        IiiiIiiiiIiIi IiiiiiiiIIIII = gameView.getFormManagement().iIiIiiiiIIiii(13);
        if (IiiiiiiiIIIII != null) {
            ((iIiIIiiiIiiiI)IiiiiiiiIIIII).iiiIiiiiiiIIi();
        }
        gameView.baseView.ALLATORIxDEMO(gameView.roleUnit.iIiIiiiiIiIii, gameView.roleData.teamBean);
    }
}
