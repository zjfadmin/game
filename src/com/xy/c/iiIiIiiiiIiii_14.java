/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ChangeRoleNameBean
 *  com.xy.bean.GetClientUserMesageBean
 *  com.xy.bean.RoleShow
 *  com.xy.bean.StallBean
 *  com.xy.game.HandleOption
 *  com.xy.scene.BangFightScene
 *  com.xy.scene.BangTZ
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.bean.ChangeRoleNameBean;
import com.xy.bean.GetClientUserMesageBean;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.game.HandleOption;
import com.xy.scene.BangFightScene;
import com.xy.scene.BangTZ;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;

public class iiIiIiiiiIiii
implements ServerAction {
    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        block41: {
            block40: {
                block39: {
                    IiiiiiiiIIIII = gameClient.gameView;
                    if (!head.equals("userretreat")) break block39;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.mapScene;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl129
                }
                if (!head.equals("intogame")) break block40;
                IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, GetClientUserMesageBean.class);
                IiiiiiiiIIIII = false;
                IiiiiiiiIIIII.isLoadMap = false;
                if (IiiiiiiiIIIII.getIsmap() == 1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.roleData.getRoleId());
                    IiiiiiiiIIIII.roleUnit.ALLATORIxDEMO((RoleShow)IiiiiiiiIIIII);
                    IiiiiiiiIIIII.roleUnit.iIIiIiiiiiiIi = 0;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.roleData.getLoginResult();
                    IiiiiiiiIIIII.setX(Long.valueOf(IiiiiiiiIIIII.getX()));
                    IiiiiiiiIIIII.setY(Long.valueOf(IiiiiiiiIIIII.getY()));
                    IiiiiiiiIIIII.setMapid(IiiiiiiiIIIII.getMapid());
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getMapid().longValue(), IiiiiiiiIIIII.getX().intValue(), IiiiiiiiIIIII.getY().intValue());
                    IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.roleUnit);
                }
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getRoleShows()) == null) break block41;
                IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
                if (true) ** GOTO lbl135
            }
            if (head.equals("monsterrefresh")) {
                IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(mes, false, IiiiiiiiIIIII);
                return;
            }
            if (head.equals("scene")) {
                IiiiiiiiIIIII.ALLATORIxDEMO(mes);
                return;
            }
            if (head.equals("gangstate")) {
                if (IiiiiiiiIIIII.scene != null) {
                    if (IiiiiiiiIIIII.scene instanceof BangFightScene == false) return;
                }
                v0 = IiiiiiiiIIIII = mes != null ? mes.split("\\|") : null;
                if (IiiiiiiiIIIII.scene == null) {
                    IiiiiiiiIIIII.scene = new BangFightScene(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    return;
                }
                ((BangFightScene)IiiiiiiiIIIII.scene).iIiIiiiiIIiii(IiiiiiiiIIIII);
                return;
            }
            if (head.equals("bangtz")) {
                if (IiiiiiiiIIIII.scene != null) {
                    if (IiiiiiiiIIIII.scene instanceof BangFightScene == false) return;
                }
                if ((IiiiiiiiIIIII = mes.split("\\|")).length <= 1) return;
                if (IiiiiiiiIIIII.getBattleScene() != null) return;
                ((BangFightScene)IiiiiiiiIIIII.scene).tz = new BangTZ(IiiiiiiiIIIII);
                return;
            }
            if (head.equals("clickmonsters")) {
                IiiiiiiiIIIII = mes.indexOf("|");
                if (IiiiiiiiIIIII == -1) {
                    return;
                }
                if (mes.startsWith("FZ")) {
                    IiiiiiiiIIIII = Integer.parseInt(mes.substring(3, IiiiiiiiIIIII));
                    IiiiiiiiIIIII = Integer.parseInt(mes.substring(IiiiiiiiIIIII + 1)) * 1000;
                    IiiiiiiiIIIII += 500L;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == null) {
                        return;
                    }
                    IiiiiiiiIIIII.getGameReadBar().setReadBar(IiiiiiiiIIIII, 2, "\u5236\u4f5c" + IiiiiiiiIIIII.getName(), (double)IiiiiiiiIIIII, iIiIIiiiIiiiI.ALLATORIxDEMO(), null);
                    return;
                }
                IiiiiiiiIIIII = Integer.parseInt(mes.substring(0, IiiiiiiiIIIII));
                if ((IiiiiiiiIIIII = (mes = mes.substring(IiiiiiiiIIIII + 1)).indexOf("|")) == -1) {
                    return;
                }
                IiiiiiiiIIIII = Integer.parseInt(mes.substring(0, IiiiiiiiIIIII)) * 1000;
                mes = mes.substring(IiiiiiiiIIIII + 1);
                IiiiiiiiIIIII.getGameReadBar().setReadBar(IiiiiiiiIIIII, 1, mes, (double)IiiiiiiiIIIII, iIiIIiiiIiiiI.ALLATORIxDEMO(), null);
                return;
            }
            if (head.equals("rolelevelup")) {
                IiiiiiiiIIIII = mes.indexOf("|");
                if (IiiiiiiiIIIII == -1) {
                    return;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(mes.substring(0, IiiiiiiiIIIII));
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                if (IiiiiiiiIIIII != IiiiiiiiIIIII.roleUnit) {
                    IiiiiiiiIIIII.iIiIiiiiIiIii.setGrade(Integer.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII + 1), (int)mes.length())));
                }
                IiiiiiiiIIIII.mapScene.ALLATORIxDEMO("\u5347\u7ea7", IiiiiiiiIIIII.iiIiIiiiiIIIi, IiiiiiiiIIIII.IIiiiiiiiIIIi);
                return;
            }
            if (head.equals("upRoleShow")) {
                IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, RoleShow.class);
                IiiiiiiiIIIII = IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.getRolename());
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                IiiiiiiiIIIII.setX(IiiiiiiiIIIII.iIiIiiiiIiIii.getX());
                IiiiiiiiIIIII.setY(IiiiiiiiIIIII.iIiIiiiiIiIii.getY());
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (head.equals("changerolename")) {
                IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, ChangeRoleNameBean.class);
                if (!IiiiiiiiIIIII.ALLATORIxDEMO()) {
                    IiiiiiiiIIIII.iiiIiiiiiiIIi("\u4f60\u4fee\u6539\u7684\u540d\u79f0\u5df2\u88ab\u5176\u4ed6\u73a9\u5bb6\u4f7f\u7528");
                    return;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.mapScene.iIiIiiiiIIiii(IiiiiiiiIIIII.getOldName());
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                IiiiiiiiIIIII.iIiIiiiiIiIii.setRolename(IiiiiiiiIIIII.getNewName());
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getNewName());
                IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII.roleData.getLoginResult();
                if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getOldName(), (String)IiiiiiiiIIIII.getRolename())) {
                    if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getOldName(), (String)IiiiiiiiIIIII.getMarryObject()) == false) return;
                    IiiiiiiiIIIII.setMarryObject(IiiiiiiiIIIII.getNewName());
                    return;
                }
                IiiiiiiiIIIII.setRolename(IiiiiiiiIIIII.getNewName());
                if (IiiiiiiiIIIII.getRgid() != null) {
                    IiiiiiiiIIIII.roleData.iiiIiiiiiiIIi(IiiiiiiiIIIII.getRgid());
                } else {
                    IiiiiiiiIIIII.setMoney(Integer.valueOf(IiiiiiiiIIIII.getMoney() - 30));
                }
                IiiiiiiiIIIII.setViewTitle();
                return;
            }
            if (head.equals("mapScene") == false) return;
            IiiiiiiiIIIII = mes.indexOf("|");
            if (IiiiiiiiIIIII == -1) {
                return;
            }
            if ((IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)0, (int)IiiiiiiiIIIII++)) != 1) return;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl165
            do {
                if ((IiiiiiiiIIIII = mes.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                    IiiiiiiiIIIII = mes.length();
                }
                IiiiiiiiIIIII.iIiIiiiiIIiii(mes.substring(IiiiiiiiIIIII, IiiiiiiiIIIII));
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl129:
                // 2 sources

            } while (IiiiiiiiIIIII != mes.length());
            return;
            do {
                if ((IiiiiiiiIIIII = (RoleShow)IiiiiiiiIIIII.get(IiiiiiiiIIIII)) != null) {
                    IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII);
                }
                --IiiiiiiiIIIII;
lbl135:
                // 2 sources

            } while (IiiiiiiiIIIII >= 0);
        }
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getStallBeans()) != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
            while (IiiiiiiiIIIII >= 0) {
                v1 = IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                --IiiiiiiiIIIII;
                IiiiiiiiIIIII.mapScene.ALLATORIxDEMO((StallBean)v1, IiiiiiiiIIIII);
            }
        }
        IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII.getMonster(), IiiiiiiiIIIII.getIsmap() == 1, IiiiiiiiIIIII);
        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getSceneMsg());
        IiiiiiiiIIIII.isLoadMap = true;
        if (IiiiiiiiIIIII == false) return;
        if (IiiiiiiiIIIII.roleData.getPkSys().getPk1() <= 4) return;
        if (IiiiiiiiIIIII.roleData.getPkSys().getPk2() != 0) return;
        if (IiiiiiiiIIIII.roleUnit.iIiIiiiiIIiIi() && !IiiiiiiiIIIII.mapScene.iiiiIiiiIiiII && IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(100) < 30) {
            HandleOption.iIiIiiiiIIiii((int)15, (GameView)IiiiiiiiIIIII);
            return;
        }
        IiiiiiiiIIIII.iiiIiiiiiiIIi("\u4f60\u5f53\u524d\u6709" + IiiiiiiiIIIII.roleData.getPkSys().getPk1() + "\u70b9PK\u6807\u5fd7,\u8fdb\u57ce\u6709\u60ca\u559c");
        return;
        do {
            if ((IiiiiiiiIIIII = mes.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                IiiiiiiiIIIII = mes.length();
            }
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII = mes.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII = mes.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl165:
            // 2 sources

        } while (IiiiiiiiIIIII < mes.length());
        v2 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.iiIiIiiiiIIIi - 80 + IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(160), IiiiiiiiIIIII.IIiiiiiiiIIIi - 60 + IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(120));
    }
}
