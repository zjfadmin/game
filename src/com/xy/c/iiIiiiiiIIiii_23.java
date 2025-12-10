/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIiiiiiIiIii
 *  com.xy.bean.EnterGameBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.RoleShow
 *  com.xy.bean.StallBean
 *  com.xy.bean.UseCardBean
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.BaseMountSkill
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.q.IiIiiiiiIiIii;
import com.xy.bean.EnterGameBean;
import com.xy.bean.LoginResult;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.bean.UseCardBean;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import com.xy.v.IIIiiiiiIiIiI;
import com.xy.v.iIiIIiiiIiiiI;
import java.math.BigDecimal;
import java.util.List;

public class iiIiiiiiIIiii
implements ServerAction {
    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        List IiiiiiiiIIIII;
        RoleShow IiiiiiiiIIIII2;
        void IiiiiiiiIIIII3;
        EnterGameBean IiiiiiiiIIIII4 = com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, EnterGameBean.class);
        iIiIIiiiIiiiI.ALLATORIxDEMO((long)(IiiiiiiiIIIII4.getServerTime() != 0L ? IiiiiiiiIIIII4.getServerTime() : Long.parseLong(IiiiiiiiIIIII4.getLoginResult().getUptime())));
        boolean IiiiiiiiIIIII5 = false;
        if (gameClient.gameView == null) {
            gameClient.gameView = new GameView(GameMain.ALLATORIxDEMO(), gameClient);
            IiiiiiiiIIIII5 = true;
        }
        GameView gameView = gameClient.gameView;
        IiiiiiiiIIIII3.isLoadMap = false;
        LoginResult IiiiiiiiIIIII6 = IiiiiiiiIIIII4.getLoginResult();
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII6.getMapid().longValue(), IiiiiiiiIIIII6.getX().intValue(), IiiiiiiiIIIII6.getY().intValue());
        RoleShow IiiiiiiiIIIII7 = new RoleShow(IiiiiiiiIIIII6);
        if (IiiiiiiiIIIII3.roleUnit == null) {
            IiiiiiiiIIIII3.roleUnit = new iiIiIiiiiIiii(IiiiiiiiIIIII7);
        } else {
            IiiiiiiiIIIII3.roleUnit.ALLATORIxDEMO(IiiiiiiiIIIII7);
        }
        IiiiiiiiIIIII3.roleUnit.iIIiIiiiiiiIi = 0;
        IiiiiiiiIIIII3.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII3.roleUnit);
        List IiiiiiiiIIIII8 = IiiiiiiiIIIII4.getRoleShows();
        if (IiiiiiiiIIIII8 != null) {
            int IiiiiiiiIIIII9 = IiiiiiiiIIIII8.size() - 1;
            while (IiiiiiiiIIIII9 >= 0) {
                IiiiiiiiIIIII2 = (RoleShow)IiiiiiiiIIIII8.get(IiiiiiiiIIIII9);
                if (IiiiiiiiIIIII2 != null) {
                    IiiiiiiiIIIII3.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII2);
                }
                --IiiiiiiiIIIII9;
            }
        }
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII4.getStallBeans()) != null) {
            int IiiiiiiiIIIII10 = IiiiiiiiIIIII.size() - 1;
            while (IiiiiiiiIIIII10 >= 0) {
                Object e = IiiiiiiiIIIII.get(IiiiiiiiIIIII10);
                --IiiiiiiiIIIII10;
                IiiiiiiiIIIII3.mapScene.ALLATORIxDEMO((StallBean)e, (GameView)IiiiiiiiIIIII3);
            }
        }
        IiiiiiiiIIIII3.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII4.getMonster(), true, (GameView)IiiiiiiiIIIII3);
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII4.getSceneMsg());
        IiiiiiiiIIIII2 = IiiiiiiiIIIII3.roleData;
        String IiiiiiiiIIIII11 = IIIiiiiiIiIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII6.getKill(), (String)"FLY=", (String)"|");
        if (IiiiiiiiIIIII11 != null && !IiiiiiiiIIIII11.equals("")) {
            IiiiiiiiIIIII2.lastFlyId = new BigDecimal(IiiiiiiiIIIII11);
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII4.getPackRecord(), IiiiiiiiIIIII4.getRoleSystem(), IiiiiiiiIIIII4.getPrivateData(), IiiiiiiiIIIII4.getLoginResult());
        IiiiiiiiIIIII2.IIiIIiiiIiIIi();
        IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII4.getList());
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII4.getRoleSummonings(), IiiiiiiiIIIII4.getMounts(), IiiiiiiiIIIII4.getLingbaos(), IiiiiiiiIIIII4.getBabys(), IiiiiiiiIIIII4.getPals());
        IiiiiiiiIIIII2.IIIiiiiiiIIiI();
        IiiiiiiiIIIII2.teamBean = IiiiiiiiIIIII4.getTeamBean();
        IiiiiiiiIIIII2.iiiiIiiiIiIiI();
        IiiiiiiiIIIII2.iIiIiiiiIIiIi();
        IiiiiiiiIIIII2.ALLATORIxDEMO();
        IiiiiiiiIIIII2.iiiIiiiiiiIIi(IiiiiiiiIIIII4.getActivity());
        IiiiiiiiIIIII2.iiiIiiiiiiIIi(null);
        IiiiiiiiIIIII3.baseView.iiiiiiiiIIiii();
        IiiiiiiiIIIII3.IiiIiiiiiiIiI();
        IiiiiiiiIIIII3.baseView.ALLATORIxDEMO(IiiiiiiiIIIII7, IiiiiiiiIIIII2.teamBean);
        IiiiiiiiIIIII3.baseView.iIiiIiiiiIiiI = true;
        IiiiiiiiIIIII2.getTaskSystem().ALLATORIxDEMO();
        IiiiiiiiIIIII2.iiiiiiiiIIiii();
        IiiiiiiiIIIII3.setViewTitleData();
        IiiiiiiiIIIII3.isDraw = true;
        IiiiiiiiIIIII3.isLoadMap = true;
        IiiiiiiiIIIII3.getBaseView().iIiIiiiiIIiIi(iIiIIiiiIiiiI.ALLATORIxDEMO());
        IiiiiiiiIIIII3.getGameReadBar().setCountDown();
        if (IiiiiiiiIIIII5) {
            gameClient.gameView.isDraw = true;
            gameClient.gameView.gameFrame.iiiIiiiiiiIIi(gameClient.gameView);
            if (!gameClient.ALLATORIxDEMO(2, 9) && !gameClient.ALLATORIxDEMO(2, 12)) {
                if (gameClient.gameType == 2) {
                    if (IiiiiiiiIIIII2.getLoginResult().getVipget() == null) {
                        ((IiIiiiiiIiIii)IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(103)).iIiIiiiiIIiii(1);
                    }
                } else if (gameClient.gameType == 4 || IiiiiiiiIIIII3.roleUnit.iIiIiiiiIiIii.getGrade() <= (gameClient.gameType == 1 ? 465 : 102)) {
                    IiiiiiiiIIIII3.getFormManagement().iIiIiiiiIIiIi(129);
                }
            }
            this.iIiIiiiiIIiii((GameView)IiiiiiiiIIIII3);
            this.ALLATORIxDEMO((GameView)IiiiiiiiIIIII3);
        }
        IiiiiiiiIIIII3.getFormManagement().iiiIiiiiiiIIi(182);
    }

    public void iIiIiiiiIIiii(GameView gameView) {
        if (!gameView.getClient().gameMount) {
            return;
        }
        BaseMountSH IiiiiiiiIIIII = gameView.roleData.getMountSHByindex(0);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.getMounts().length) {
            BaseMountSkill IiiiiiiiIIIII3 = IiiiiiiiIIIII.getMounts()[IiiiiiiiIIIII2];
            if (IiiiiiiiIIIII3.getB1() != 0 && IiiiiiiiIIIII3.getB2() != 0 && IiiiiiiiIIIII3.getB3() == 0) {
                gameView.iiiIiiiiiiIIi("\u4f60\u6709\u5b88\u62a4\u77f3\u8010\u4e45\u8017\u5c3d\uff0c\u8bf7\u5c3d\u5feb\u8865\u5145");
                return;
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        if (!gameView.getClient().gameBeau) {
            return;
        }
        UseCardBean IiiiiiiiIIIII = gameView.roleData.getLimit("\u9753\u53f7");
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IiiiiiiiIIIII.getUseTime() > 7200) {
            return;
        }
        gameView.iiiIiiiiiiIIi("\u8bf7\u6ce8\u610f\u4f60\u7684\u9753\u53f7\u5373\u5c06\u5230\u671f");
    }
}
