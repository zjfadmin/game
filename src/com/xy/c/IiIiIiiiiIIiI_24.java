/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiIiIii
 *  com.xy.a.q.IIiiIiiiIiIii
 *  com.xy.a.q.iIiIIiiiiiiii
 *  com.xy.a.q.iiIIIiiiIIiII
 *  com.xy.a.q.iiIIiiiiiiiIi
 *  com.xy.a.q.iiIiIiiiiiiiI
 *  com.xy.a.q.iiiiIiiiiiIII
 *  com.xy.a.q.iiiiiiiiiIiII
 *  com.xy.bean.QuackGameBean
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.q.IIIiIiiiIiIii;
import com.xy.a.q.IIiiIiiiIiIii;
import com.xy.a.q.iIiIIiiiiiiii;
import com.xy.a.q.iiIIIiiiIIiII;
import com.xy.a.q.iiIIiiiiiiiIi;
import com.xy.a.q.iiIiIiiiiiiiI;
import com.xy.a.q.iiiiIiiiiiIII;
import com.xy.a.q.iiiiiiiiiIiII;
import com.xy.bean.QuackGameBean;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;

public class IiIiIiiiiIIiI
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        IiIiIiiiiIIiI.ALLATORIxDEMO(iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, QuackGameBean.class), gameClient.gameView);
    }

    /*
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(QuackGameBean gameBean, GameView gameView) {
        block14: {
            if (gameBean.getType() == 1) {
                IiiiiiiiIIIII = gameBean.getPetmsg().split("\\|");
                IiiiiiiiIIIII = (iiIiIiiiiiiiI)gameView.getFormManagement().iiiIiiiiiiIIi(71);
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (gameBean.getType() == 2) {
                if (gameBean.getMoney() != null) {
                    gameView.roleData.getLoginResult().setGold(gameView.roleData.getLoginResult().getGold().add(gameBean.getMoney()));
                }
                if ((IiiiiiiiIIIII = (iiIiIiiiiiiiI)gameView.getFormManagement().iIiIiiiiIIiii(71)) == null) return;
                IiiiiiiiIIIII = gameBean.getPetmsg().split("\\|");
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, gameBean.getMoney());
                return;
            }
            if (gameBean.getType() == 3) {
                IiiiiiiiIIIII = (IIIiIiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(87);
                IiiiiiiiIIIII.ALLATORIxDEMO(gameBean);
                return;
            }
            if (gameBean.getType() == 4) {
                IiiiiiiiIIIII = gameBean.getPetmsg().split("\\|");
                IiiiiiiiIIIII = (IIIiIiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(87);
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (gameBean.getType() != 6) break block14;
            IiiiiiiiIIIII = gameBean.getPetmsg().split("\\|");
            IiiiiiiiIIIII = new BigDecimal[IiiiiiiiIIIII.length];
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl69
        }
        if (gameBean.getType() == 7) {
            IiiiiiiiIIIII = (iiiiiiiiiIiII)gameView.getFormManagement().iiiIiiiiiiIIi(118);
            IiiiiiiiIIIII.ALLATORIxDEMO(gameBean);
            return;
        }
        if (gameBean.getType() == 10) {
            if (gameBean.getMoney().intValue() <= 100) {
                IiiiiiiiIIIII = (iiIIIiiiIIiII)gameView.getFormManagement().iiiIiiiiiiIIi(119);
                IiiiiiiiIIIII.iiiIiiiiiiIIi(gameBean);
                return;
            }
            if (gameBean.getMoney().intValue() <= 1000) {
                IiiiiiiiIIIII = (IIiiIiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(126);
                IiiiiiiiIIIII.iIiIiiiiIIiii(gameBean);
                return;
            }
            if (gameBean.getMoney().intValue() > 2000 && gameBean.getMoney().intValue() <= 3000) {
                IiiiiiiiIIIII = (iiiiIiiiiiIII)gameView.getFormManagement().iiiIiiiiiiIIi(128);
                IiiiiiiiIIIII.ALLATORIxDEMO(gameBean);
                return;
            }
            IiiiiiiiIIIII = (iIiIIiiiiiiii)gameView.getFormManagement().iiiIiiiiiiIIi(127);
            IiiiiiiiIIIII.iiiIiiiiiiIIi(gameBean);
            return;
        }
        if (gameBean.getType() != 11) return;
        if (gameBean.getMoney().intValue() <= 100) {
            IiiiiiiiIIIII = (iiIIIiiiIIiII)gameView.getFormManagement().iiiIiiiiiiIIi(119);
            IiiiiiiiIIIII.iIiIiiiiIIiii(gameBean);
            return;
        }
        if (gameBean.getMoney().intValue() <= 1000) {
            IiiiiiiiIIIII = (IIiiIiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(126);
            IiiiiiiiIIIII.iiiIiiiiiiIIi(gameBean);
            return;
        }
        if (gameBean.getMoney().intValue() > 2000 && gameBean.getMoney().intValue() <= 3000) {
            IiiiiiiiIIIII = (iiiiIiiiiiIII)gameView.getFormManagement().iiiIiiiiiiIIi(128);
            IiiiiiiiIIIII.iIiIiiiiIIiii(gameBean);
            return;
        }
        IiiiiiiiIIIII = (iIiIIiiiiiiii)gameView.getFormManagement().iiiIiiiiiiIIi(127);
        IiiiiiiiIIIII.iIiIiiiiIIiii(gameBean);
        return;
        do {
            v0 = IiiiiiiiIIIII;
            v1 = new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII[v0] = v1;
lbl69:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        IiiiiiiiIIIII = (iiIIiiiiiiiIi)gameView.getFormManagement().iiiIiiiiiiIIi(112);
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
