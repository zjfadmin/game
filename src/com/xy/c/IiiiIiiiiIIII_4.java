/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.a.a.IIIiIiiiiIIiI
 *  com.xy.a.a.IiiiiiiiiIIII
 *  com.xy.a.a.iIIIiiiiIiiII
 *  com.xy.a.a.iIIiiiiiIIIIi
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.a.i.IIIIIiiiIIIiI
 *  com.xy.a.i.IIiIIiiiIIIiI
 *  com.xy.a.i.IiIIIiiiiiiIi
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.i.iIiIIiiiIIIiI
 *  com.xy.a.i.iiIiIiiiiIiIi
 *  com.xy.a.i.iiIiiiiiIIiiI
 *  com.xy.a.i.iiIiiiiiIIiii
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.a.q.IIIIiiiiIIIIi
 *  com.xy.a.q.IIIiIiiiiIIii
 *  com.xy.a.q.IiIIiiiiiIiiI
 *  com.xy.a.q.IiIiIiiiiIiii
 *  com.xy.a.q.IiIiiiiiIiIii
 *  com.xy.a.q.iIIIiiiiIiIII
 *  com.xy.a.q.iIIiiiiiIiIII
 *  com.xy.a.q.iIiIIiiiIIIiI
 *  com.xy.a.v.IIIIiiiiIIIIi
 *  com.xy.a.w.IiiIiiiiIIIii
 *  com.xy.a.w.iIIIIiiiIiiIi
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiIiIiiiiIIiI
 *  com.xy.c.IiIiiiiiIIIiI
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.Pal
 *  com.xy.entity.PartJade
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.MsgUntil
 *  com.xy.formula.PetProperty
 *  com.xy.game.ExpIncreaseUntil
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.a.a.IIIiIiiiiIIiI;
import com.xy.a.a.IiiiiiiiiIIII;
import com.xy.a.a.iIIIiiiiIiiII;
import com.xy.a.a.iIIiiiiiIIIIi;
import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.a.i.IIIIIiiiIIIiI;
import com.xy.a.i.IIiIIiiiIIIiI;
import com.xy.a.i.IiIIIiiiiiiIi;
import com.xy.a.i.iIiIIiiiIIIiI;
import com.xy.a.i.iiIiiiiiIIiiI;
import com.xy.a.i.iiIiiiiiIIiii;
import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.a.q.IIIiIiiiiIIii;
import com.xy.a.q.IiIIiiiiiIiiI;
import com.xy.a.q.IiIiIiiiiIiii;
import com.xy.a.q.IiIiiiiiIiIii;
import com.xy.a.q.iIIIiiiiIiIII;
import com.xy.a.q.iIIiiiiiIiIII;
import com.xy.a.w.IiiIiiiiIIIii;
import com.xy.a.w.iIIIIiiiIiiIi;
import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiIiIiiiiIIiI;
import com.xy.c.IiIiiiiiIIIiI;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.Pal;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.game.ExpIncreaseUntil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IIIiiiiiIiIiI;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;

public class IiiiIiiiiIIII
implements ServerAction {
    public static void ALLATORIxDEMO(int type, String data, RoleData roleData) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 5;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < data.length()) {
            IiiiiiiiIIIII6 = data.indexOf("#", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = data.length();
            }
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII4 == 2) {
                IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
        if (type == 0) {
            roleData.getMountSHByindex(IiiiiiiiIIIII).setUnlock(IiiiiiiiIIIII2);
            return;
        }
        if (type == 1) {
            roleData.getMountSHByindex(IiiiiiiiIIIII).setLvl(IiiiiiiiIIIII2);
            roleData.getMountSHByindex(IiiiiiiiIIIII).setExp(IiiiiiiiIIIII3);
            return;
        }
        if (type != 2) return;
        roleData.getMountSHByindex(0).getMounts()[IiiiiiiiIIIII].setB3(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII2 > 0) return;
        roleData.getGameView().iiiIiiiiiiIIi("\u4e2d\u5929\u7b2c" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII + 1)) + "\u4e2a\u5b88\u62a4\u69fd\u7684\u5b88\u62a4\u77f3\u8010\u4e45\u5df2\u7ecf\u8017\u5c3d\u4e86\uff0c\u8bf7\u5c3d\u5feb\u8865\u5145\u8010\u4e45");
    }

    public static void iIiIiiiiIIiii(String data, RoleData roleData) {
        int IiiiiiiiIIIII = data.indexOf(44, 6);
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = data.length();
        }
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)5, (int)IiiiiiiiIIIII);
        roleData.getMountSHByindex(0).getMounts()[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII < data.length() ? data.substring(IiiiiiiiIIIII + 1) : "");
    }

    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        AssetUpdate IiiiiiiiIIIII = com.xy.v.iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, AssetUpdate.class);
        if (gameClient.assetIndex != -111L && IiiiiiiiIIIII.getI() == gameClient.assetIndex) {
            return;
        }
        gameClient.assetIndex = IiiiiiiiIIIII.getI();
        IiiiIiiiiIIII.ALLATORIxDEMO(IiiiiiiiIIIII, gameClient.gameView);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void ALLATORIxDEMO(AssetUpdate assetUpdate, GameView gameView) {
        block154: {
            block152: {
                block153: {
                    block151: {
                        if (assetUpdate == null) {
                            return;
                        }
                        IiiiiiiiIIIII = gameView.roleData;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
                        IiiiiiiiIIIII = false;
                        IiiiiiiiIIIII = false;
                        IiiiiiiiIIIII = false;
                        IiiiiiiiIIIII = false;
                        if (assetUpdate.getData() != null) {
                            IiiiiiiiIIIII = assetUpdate.getData();
                            IiiiiiiiIIIII = 0;
                            IiiiiiiiIIIII = 0;
                            IiiiiiiiIIIII = 0;
                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length()) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1);
                                if (IiiiiiiiIIIII == -1) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                                }
                                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.charAt(IiiiiiiiIIIII)) == 'D') {
                                    var13_17 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.setGold(new BigDecimal(IiiiiiiiIIIII.getGold().longValue() + IiiiiiiiIIIII));
                                } else if (IiiiiiiiIIIII == 'X') {
                                    if (IiiiiiiiIIIII.charAt(IiiiiiiiIIIII + 1) == 'P') {
                                        IiiiiiiiIIIII.getPackRecord().setStarSoulType(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 2, IiiiiiiiIIIII));
                                        IiiiiiiiIIIII = true;
                                    } else {
                                        IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                        IiiiiiiiIIIII.setCodecard(new BigDecimal(IiiiiiiiIIIII.getCodecard().longValue() + IiiiiiiiIIIII));
                                    }
                                } else if (IiiiiiiiIIIII == 'S') {
                                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.setSavegold(new BigDecimal(IiiiiiiiIIIII.getSavegold().longValue() + IiiiiiiiIIIII));
                                } else if (IiiiiiiiIIIII == 'C') {
                                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.setMoney(Integer.valueOf((int)((long)IiiiiiiiIIIII.getMoney().intValue() + IiiiiiiiIIIII)));
                                } else if (IiiiiiiiIIIII == 'R') {
                                    ExpIncreaseUntil.iIiIiiiiIIiii((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII), (RoleData)IiiiiiiiIIIII);
                                } else if (IiiiiiiiIIIII == 'P') {
                                    ExpIncreaseUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII), (RoleData)IiiiiiiiIIIII);
                                } else if (IiiiiiiiIIIII == 'M') {
                                    ExpIncreaseUntil.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII), (RoleData)IiiiiiiiIIIII);
                                } else if (IiiiiiiiIIIII == 'L') {
                                    ExpIncreaseUntil.iiiIiiiiiiIIi((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII), (RoleData)IiiiiiiiIIIII);
                                } else if (IiiiiiiiIIIII == 'G') {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII);
                                    if (IiiiiiiiIIIII.startsWith("P")) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=");
                                        IiiiiiiiIIIII = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)1, (int)IiiiiiiiIIIII));
                                        IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII.length());
                                        if (IiiiiiiiIIIII.iiiIiiiiiiIIi()) {
                                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        }
                                    } else {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.split("=");
                                        if (IiiiiiiiIIIII.length == 2) {
                                            IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[0]);
                                            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                                            IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII);
                                            if (IiiiiiiiIIIII /* !! */  != null) {
                                                IiiiiiiiIIIII /* !! */ .setRgid(IiiiiiiiIIIII);
                                                IiiiiiiiIIIII /* !! */ .setUsetime(Integer.valueOf(IiiiiiiiIIIII));
                                                IiiiiiiiIIIII.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII /* !! */ );
                                                if (IiiiiiiiIIIII /* !! */ .getType() == 2326L) {
                                                    IiiiiiiiIIIII = true;
                                                }
                                            }
                                        } else if (IiiiiiiiIIIII.length == 4) {
                                            ExpIncreaseUntil.ALLATORIxDEMO((String[])IiiiiiiiIIIII, (RoleData)IiiiiiiiIIIII);
                                        }
                                    }
                                } else if (IiiiiiiiIIIII == 'T') {
                                    gameView.gameTXMask.ALLATORIxDEMO(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII), 0, null);
                                } else if (IiiiiiiiIIIII == 'B') {
                                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.setContribution(new BigDecimal(IiiiiiiiIIIII.getContribution().longValue() + IiiiiiiiIIIII));
                                } else if (IiiiiiiiIIIII == 'K') {
                                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII + 2), (int)IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.setPkrecord(new BigDecimal(IiiiiiiiIIIII.getPkrecord().longValue() + IiiiiiiiIIIII));
                                } else if (IiiiiiiiIIIII == 'E') {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII).split("=");
                                    IiiiiiiiIIIII.setFGExtraPoint(IiiiiiiiIIIII[0], Integer.parseInt(IiiiiiiiIIIII[1]));
                                    IiiiiiiiIIIII = (IiiIiiiiIIIii)gameView.getFormManagement().iIiIiiiiIIiii(54);
                                    if (IiiiiiiiIIIII != null) {
                                        IiiiiiiiIIIII.iiiIiiiiiiIIi();
                                    }
                                    if ((IiiiiiiiIIIII = (iIIIIiiiIiiIi)gameView.getFormManagement().iIiIiiiiIIiii(106)) != null) {
                                        IiiiiiiiIIIII.iIiIiiiiIIiIi();
                                    }
                                } else if (IiiiiiiiIIIII == 'N') {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                    if (IiiiiiiiIIIII.startsWith("NL")) {
                                        IiiiiiiiIIIII.getPackRecord().setLabortype(IiiiiiiiIIIII.substring(2));
                                        IiiiiiiiIIIII = true;
                                    } else {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.split("=");
                                        IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[0].substring(5));
                                        if (IiiiiiiiIIIII[0].startsWith("NSKIN")) {
                                            IiiiiiiiIIIII = (com.xy.a.iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
                                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                                        } else if (IiiiiiiiIIIII[0].startsWith("NBASE")) {
                                            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                                            IiiiiiiiIIIII /* !! */  = (com.xy.a.iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
                                            IiiiiiiiIIIII /* !! */ .ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        }
                                    }
                                } else if (IiiiiiiiIIIII == 'A') {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                    if (IiiiiiiiIIIII.startsWith("ATTReset")) {
                                        IiiiiiiiIIIII.setKillTypeTwo(IiiiiiiiIIIII.substring(8));
                                        IiiiiiiiIIIII.setKillTypeHead("D", 1, null);
                                        IiiiiiiiIIIII.setPkrecord(new BigDecimal(0));
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.getScoretype("\u7ade\u6280\u79ef\u5206");
                                        if (IiiiiiiiIIIII.longValue() != 0L) {
                                            IiiiiiiiIIIII.setScore(IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getScore(), (String)("\u7ade\u6280\u79ef\u5206=" + IiiiiiiiIIIII), (int)3));
                                        }
                                    } else if (IiiiiiiiIIIII.startsWith("AFZE")) {
                                        IiiiiiiiIIIII = (IiIIiiiiiIiiI)gameView.getFormManagement().iiiIiiiiiiIIi(133);
                                        IiiiiiiiIIIII.ALLATORIxDEMO().IiiIiiiiiiIiI(IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (int)4, (int)IiiiiiiiIIIII.length()));
                                    } else if (IiiiiiiiIIIII.startsWith("AFZ")) {
                                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(3));
                                        IiiiiiiiIIIII.getPackRecord().setEquip("FZ", "FZ" + IiiiiiiiIIIII);
                                        IiiiiiiiIIIII = (IiIIiiiiiIiiI)gameView.getFormManagement().iIiIiiiiIIiii(133);
                                        if (IiiiiiiiIIIII != null) {
                                            IiiiiiiiIIIII.iIiIiiiiIIiii(-1);
                                        }
                                    } else if (IiiiiiiiIIIII.startsWith("ASH")) {
                                        IiiiiiiiIIIII = true;
                                        if (IiiiiiiiIIIII.startsWith("ASHGZ")) {
                                            IiiiIiiiiIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        } else if (IiiiiiiiIIIII.startsWith("ASHUN")) {
                                            IiiiIiiiiIIII.ALLATORIxDEMO(0, IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        } else if (IiiiiiiiIIIII.startsWith("ASHXL")) {
                                            IiiiIiiiiIIII.ALLATORIxDEMO(1, IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        } else if (IiiiiiiiIIIII.startsWith("ASHNJ")) {
                                            IiiiIiiiiIIII.ALLATORIxDEMO(2, IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        } else if (IiiiiiiiIIIII.startsWith("ASHXQ")) {
                                            IiiiIiiiiIIII.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                        }
                                    } else {
                                        IiiiiiiiIIIII.setKillTypeTwo(IiiiiiiiIIIII.substring(1));
                                    }
                                } else {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                                    if (IiiiiiiiIIIII.startsWith("\u5077\u94b1")) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.split("=");
                                        IiiiiiiiIIIII = Long.parseLong(IiiiiiiiIIIII[1]);
                                        IiiiiiiiIIIII /* !! */  = (com.xy.a.iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
                                        IiiiiiiiIIIII /* !! */ .iiiiiiiiIIiii("\u548c\u4f60\u5f00\u4e2a\u5c0f\u5c0f\u7684\u73a9\u7b11\u800c\u5df2,\u4f55\u5fc5\u52a8\u6012,\u8fd9\u4efd\u793c\u7269\u9001\u4f60,\u4f60\u5f97\u5230\u4e86" + IiiiiiiiIIIII + "\u91d1\u94b1");
                                    } else if (IiiiiiiiIIIII.startsWith("\u51fb\u6740")) {
                                        IiiiiiiiIIIII.setKill(IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getKill(), (String)IiiiiiiiIIIII, (int)5));
                                    } else if (IiiiiiiiIIIII.startsWith("\u58f0\u671b=")) {
                                        IiiiiiiiIIIII = Long.parseLong(IiiiiiiiIIIII.substring(3));
                                        IiiiiiiiIIIII.setPrestige(new BigDecimal(IiiiiiiiIIIII.getPrestige().longValue() + IiiiiiiiIIIII));
                                        IiiiiiiiIIIII.getRoleProperty().iIiIiiiiIIiIi();
                                    } else {
                                        IiiiiiiiIIIII.setScore(IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getScore(), (String)IiiiiiiiIIIII, (int)2));
                                    }
                                }
                                ++IiiiiiiiIIIII;
                                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                            }
                        }
                        if (assetUpdate.getVip() != null) {
                            IiiiiiiiIIIII.setVipget(assetUpdate.getVip());
                        }
                        if (assetUpdate.getSceneMsg() != null) {
                            gameView.ALLATORIxDEMO(assetUpdate.getSceneMsg());
                        }
                        IiiiiiiiIIIII = assetUpdate.getGoods();
                        IiiiiiiiIIIII = assetUpdate.getPets();
                        IiiiiiiiIIIII = assetUpdate.getLingbaos();
                        IiiiiiiiIIIII = assetUpdate.getMounts();
                        IiiiiiiiIIIII = assetUpdate.getBabys();
                        IiiiiiiiIIIII = assetUpdate.getPals();
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII.get(IiiiiiiiIIIII++));
                        }
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (RoleSummoning)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.getRoleid() != null && IiiiiiiiIIIII.getBasishp() == 0) {
                                IiiiiiiiIIIII /* !! */  = (RolePet)PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII, (RoleData)IiiiiiiiIIIII);
                                IiiiiiiiIIIII.setBasishp((int)IiiiiiiiIIIII /* !! */ [0]);
                                IiiiiiiiIIIII.setBasismp((int)IiiiiiiiIIIII /* !! */ [1]);
                            }
                            IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getRolePet(IiiiiiiiIIIII.getSid().longValue());
                            if (IiiiiiiiIIIII.getRoleid() == null) {
                                if (IiiiiiiiIIIII /* !! */  != null) {
                                    IiiiiiiiIIIII.pets.remove(IiiiiiiiIIIII /* !! */ );
                                }
                                if (IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII /* !! */ .getId())) {
                                    IiiiiiiiIIIII.setChosePetId(null);
                                }
                            } else {
                                if (IiiiiiiiIIIII /* !! */  == null) {
                                    IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                                }
                                IiiiiiiiIIIII /* !! */ .setPet(IiiiiiiiIIIII);
                                IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII);
                                IiiiiiiiIIIII = true;
                            }
                            ++IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (Lingbao)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.getBaotype().equals("\u6cd5\u5b9d") && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII)) {
                                IiiiiiiiIIIII.setOperation("\u5220\u9664");
                                ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII, (GameClient)gameView.getClient());
                            } else {
                                IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getLingbao(IiiiiiiiIIIII.getBaoid());
                                if (IiiiiiiiIIIII /* !! */  == null) {
                                    if (!IiiiiiiiIIIII.getBaotype().equals("\u6cd5\u5b9d")) {
                                        IiiiiiiiIIIII.lingbaoList.add(IiiiiiiiIIIII.getBaoid());
                                        if (IiiiiiiiIIIII.getEquipment() == 1) {
                                            IiiiiiiiIIIII.lingbaoChoses[0] = IiiiiiiiIIIII.getBaoid();
                                        }
                                    } else {
                                        IiiiiiiiIIIII.fabaoList.add(IiiiiiiiIIIII.getBaoid());
                                        if (IiiiiiiiIIIII.getEquipment() == 1) {
                                            IiiiiiiiIIIII.lingbaoChoses[IiiiiiiiIIIII.lingbaoChoses[1] == null ? 1 : 2] = IiiiiiiiIIIII.getBaoid();
                                        }
                                    }
                                }
                                IiiiiiiiIIIII.lingbaoMap.put(IiiiiiiiIIIII.getBaoid(), IiiiiiiiIIIII);
                                IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (Mount)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getMount(IiiiiiiiIIIII.getMid());
                            if (IiiiiiiiIIIII /* !! */  == null) {
                                IiiiiiiiIIIII.mounts.add(IiiiiiiiIIIII);
                                if (gameView.getClient().gameMount) {
                                    IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(172);
                                    if (IiiiiiiiIIIII != null) {
                                        IiiiiiiiIIIII.iIiIiiiiIIiii();
                                    }
                                } else {
                                    IiiiiiiiIIIII = (IIIIiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(7);
                                    if (IiiiiiiiIIIII != null) {
                                        IiiiiiiiIIIII.IiiIiiiiiiIiI();
                                    }
                                }
                            } else {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.mounts.indexOf(IiiiiiiiIIIII /* !! */ );
                                IiiiiiiiIIIII.mounts.set(IiiiiiiiIIIII, IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII);
                        }
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (Baby)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getBaby(IiiiiiiiIIIII.getBabyid());
                            if (IiiiiiiiIIIII /* !! */  == null) {
                                IiiiiiiiIIIII.babys.add(IiiiiiiiIIIII);
                                IiiiiiiiIIIII = (iIIIiiiiIiiII)gameView.getFormManagement().iIiIiiiiIIiii(1);
                                if (IiiiiiiiIIIII != null) {
                                    IiiiiiiiIIIII.iiiIiiiiiiIIi();
                                }
                            } else {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.babys.indexOf(IiiiiiiiIIIII /* !! */ );
                                IiiiiiiiIIIII.babys.set(IiiiiiiiIIIII, IiiiiiiiIIIII);
                            }
                            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getBabyid(), (BigDecimal)IiiiiiiiIIIII.getBabyId())) {
                                IiiiiiiiIIIII.getRoleProperty().iIiIiiiiIIiii(IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII);
                        }
                        if (IiiiiiiiIIIII != null) {
                            IiiiiiiiIIIII = 0;
                            IiiiiiiiIIIII = 0;
                            IiiiiiiiIIIII = 0;
                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                                IiiiiiiiIIIII /* !! */  = (Pal)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                                IiiiiiiiIIIII = IiiiiiiiIIIII.getPal(IiiiiiiiIIIII /* !! */ .getId());
                                if (IiiiiiiiIIIII == null) {
                                    IiiiiiiiIIIII = 1;
                                    IiiiiiiiIIIII.pals.add(IiiiiiiiIIIII /* !! */ );
                                } else {
                                    if (IiiiiiiiIIIII == 0) {
                                        IiiiiiiiIIIII = (int)IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII /* !! */ .getId());
                                    }
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.pals.indexOf(IiiiiiiiIIIII);
                                    IiiiiiiiIIIII.pals.set(IiiiiiiiIIIII, IiiiiiiiIIIII /* !! */ );
                                }
                                ++IiiiiiiiIIIII;
                            }
                            IiiiiiiiIIIII = (iiIiIiiiiIiIi)gameView.getFormManagement().iIiIiiiiIIiii(105);
                            if (IiiiiiiiIIIII != null) {
                                if (IiiiiiiiIIIII != 0) {
                                    IiiiiiiiIIIII.iIiIiiiiIIiIi();
                                } else if (IiiiiiiiIIIII != 0 && IiiiiiiiIIIII.getChosePal() != null) {
                                    IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getChosePal().getpId());
                                }
                            }
                        }
                        IiiiiiiiIIIII = assetUpdate.getJades();
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII /* !! */  = (PartJade)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.getPackRecord().setPartJade((PartJade)IiiiiiiiIIIII /* !! */ );
                            IiiiIiiiiIIII.ALLATORIxDEMO((PartJade)IiiiiiiiIIIII /* !! */ , IiiiiiiiIIIII, gameView);
                        }
                        if (assetUpdate.getGameBean() != null) {
                            IiIiIiiiiIIiI.ALLATORIxDEMO((QuackGameBean)assetUpdate.getGameBean(), (GameView)gameView);
                        }
                        if (assetUpdate.getUseCard() != null) {
                            IiiiiiiiIIIII = assetUpdate.getUseCard();
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getName(), IiiiiiiiIIIII.getType(), IiiiiiiiIIIII.getSkin(), IiiiiiiiIIIII.getValue(), IiiiiiiiIIIII.getTime());
                            if (IiiiiiiiIIIII.getlCard() != null) {
                                if (gameView.getClient().gameMount) {
                                    IiiiiiiiIIIII.getPackRecord().setOtherValue("BS", IiiiiiiiIIIII.getlCard());
                                } else {
                                    IiiiiiiiIIIII.getPackRecord().setlCard(IiiiiiiiIIIII.getlCard());
                                }
                                IiiiiiiiIIIII = (IIIiIiiiiIIii)gameView.getFormManagement().iIiIiiiiIIiii(89);
                                if (IiiiiiiiIIIII != null) {
                                    IiiiiiiiIIIII.iIiIiiiiIIiIi(false);
                                }
                            }
                        }
                        if (assetUpdate.getResistance() != null) {
                            IiiiiiiiIIIII.setResistance(assetUpdate.getResistance().equals("") == false ? assetUpdate.getResistance() : null);
                            IiiiiiiiIIIII.getRoleProperty().IIIIIiiiiIIii();
                            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO();
                            IiiiiiiiIIIII = (IiiIiiiiIIIii)gameView.getFormManagement().iIiIiiiiIIiii(54);
                            if (IiiiiiiiIIIII != null) {
                                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                            }
                        }
                        if (assetUpdate.getTask() != null) {
                            IiiiiiiiIIIII.getTaskSystem().ALLATORIxDEMO(assetUpdate.getTask());
                        }
                        if (assetUpdate.getActivity() != null) {
                            IiIiiiiiIIIiI.ALLATORIxDEMO((String)assetUpdate.getActivity(), (GameView)gameView);
                        }
                        if (IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (com.xy.a.i.IiIiiiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(137);
                            if (IiiiiiiiIIIII != null) {
                                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                            }
                            if ((IiiiiiiiIIIII = (com.xy.a.i.iiIiIiiiiIiIi)gameView.getFormManagement().iIiIiiiiIIiii(138)) != null) {
                                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                            }
                            if ((IiiiiiiiIIIII /* !! */  = (iiIiiiiiIIiii)gameView.getFormManagement().iIiIiiiiIIiii(139)) != null) {
                                IiiiiiiiIIIII /* !! */ .iIiIiiiiIIiIi();
                            }
                            if ((IiiiiiiiIIIII = (IIiIIiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(140)) != null) {
                                IiiiiiiiIIIII.iiiiiiiiIIiii();
                            }
                            if ((IiiiiiiiIIIII = (iiIiiiiiIIiiI)gameView.getFormManagement().iIiIiiiiIIiii(141)) != null) {
                                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                            }
                        }
                        if (IiiiiiiiIIIII && (IiiiiiiiIIIII = (iIiIIiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(142)) != null) {
                            IiiiiiiiIIIII.iiiIiiiiiiIIi();
                        }
                        if (IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (IiiiiiiiiIIII)gameView.getFormManagement().iIiIiiiiIIiii(163);
                            if (IiiiiiiiIIIII != null) {
                                IiiiiiiiIIIII.iIiIiiiiIIiIi();
                            }
                            if ((IiiiiiiiIIIII = (iIIiiiiiIiIII)gameView.getFormManagement().iIiIiiiiIIiii(17)) != null) {
                                IiiiiiiiIIIII.IiiIiiiiiiIiI();
                            }
                        }
                        if (IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = (iIIiiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(172);
                            if (IiiiiiiiIIIII != null) {
                                IiiiiiiiIIIII.iIiIiiiiIIiii();
                            }
                            if ((IiiiiiiiIIIII = (IIIiIiiiiIIiI)gameView.getFormManagement().iIiIiiiiIIiii(174)) != null) {
                                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                            }
                        }
                        if (assetUpdate.getType() < 21 || assetUpdate.getType() >= 30) break block151;
                        IiiiiiiiIIIII = assetUpdate.getMsg();
                        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) break block152;
                        IiiiiiiiIIIII = (IIIiIiiiIiIii)gameView.getFormManagement().iIiIiiiiIIiii(121);
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl397
                    }
                    if (assetUpdate.getType() != 30 && assetUpdate.getType() != 31) break block153;
                    IiiiiiiiIIIII = assetUpdate.getMsg();
                    if (IiiiiiiiIIIII == null) break block154;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl420
                }
                if (assetUpdate.getType() != 41) {
                    IiiiiiiiIIIII = assetUpdate.ALLATORIxDEMO();
                    if (IiiiiiiiIIIII == null) return;
                    gameView.iiiIiiiiiiIIi(IiiiiiiiIIIII);
                    return;
                }
                IiiiiiiiIIIII = assetUpdate.getMsg();
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII) != false) return;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl439
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    gameView.iiiIiiiiiiIIi(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("\u91cd\u609f\u6280\u80fd\u5931\u8d25")) {
                        IiiiiiiiIIIII.iIiIiiiiIIiIi(null);
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl397:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length());
            }
            if (assetUpdate.getType() == 26) {
                IiiiiiiiIIIII = (com.xy.a.q.IIIIiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(39);
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII.iIiIiiiiIIiii(3);
                return;
            }
            if (assetUpdate.getType() == 27) {
                IiiiiiiiIIIII = (IiIiIiiiiIiii)gameView.getFormManagement().iIiIiiiiIIiii(100);
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                return;
            }
            if (assetUpdate.getType() != 28) return;
            IiiiiiiiIIIII = (iIIIiiiiIiIII)gameView.getFormManagement().iIiIiiiiIIiii(101);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.iiiIiiiiiiIIi();
            return;
            do {
                if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                gameView.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97\u4e86" + IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl420:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length());
        }
        if (assetUpdate.getType() != 30) {
            IiiiiiiiIIIII = (com.xy.a.q.iIiIIiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(134);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.iiiIiiiiiiIIi();
            return;
        }
        IiiiiiiiIIIII = (IiIiiiiiIiIii)gameView.getFormManagement().iIiIiiiiIIiii(103);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.IiiIiiiiiiIiI();
        }
        if ((IiiiiiiiIIIII = (com.xy.a.v.IIIIiiiiIIIIi)gameView.getFormManagement().iIiIiiiiIIiii(167)) == null) return;
        IiiiiiiiIIIII.iiiIiiiiiiIIi(1);
        return;
        do {
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.length();
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
            gameView.iIiIiiiiIIiii(IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl439:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length());
    }

    public static void ALLATORIxDEMO(String data, RoleData roleData) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 5;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < data.length()) {
            IiiiiiiiIIIII6 = data.indexOf("#", IiiiiiiiIIIII5 + 1);
            if (IiiiiiiiIIIII6 == -1) {
                IiiiiiiiIIIII6 = data.length();
            }
            if (IiiiiiiiIIIII4 == 0) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII4 == 1) {
                IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            } else if (IiiiiiiiIIIII4 == 2) {
                IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
        }
        roleData.getMountSHByindex(IiiiiiiiIIIII2).setGZ(IiiiiiiiIIIII3, IiiiiiiiIIIII);
        roleData.getRoleProperty().ALLATORIxDEMO(roleData.getChosePet());
    }

    public static void ALLATORIxDEMO(PartJade jade, RoleData roleData, GameView gameView) {
        IIIIIiiiIIIiI IiiiiiiiIIIII;
        IiIIIiiiiiiIi IiiiiiiiIIIII2;
        IIIIIiiiIiIii IiiiiiiiIIIII3 = (IIIIIiiiIiIii)gameView.getFormManagement().iIiIiiiiIIiii(61);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3.ALLATORIxDEMO(jade);
        }
        if ((IiiiiiiiIIIII2 = (IiIIIiiiiiiIi)gameView.getFormManagement().iIiIiiiiIIiii(63)) != null) {
            IiiiiiiiIIIII2.ALLATORIxDEMO().ALLATORIxDEMO(jade);
        }
        if ((IiiiiiiiIIIII = (IIIIIiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(64)) == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO(jade);
    }
}
