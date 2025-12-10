/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Baby
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.game;

import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class HandleEquip {
    public static boolean ALLATORIxDEMO(RoleData roleData, int Equipmentid, Goodstable good) {
        StringBuffer IiiiiiiiIIIII;
        if (Equipmentid != -1 && good != null) {
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII.append("E");
            IiiiiiiiIIIII.append(Equipmentid);
            Goodstable IiiiiiiiIIIII2 = roleData.getEquipGood(Equipmentid);
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII2.setStatus(Integer.valueOf(0));
                IiiiiiiiIIIII.append("=A");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII2.getRgid());
            }
            IiiiiiiiIIIII.append("=B");
            IiiiiiiiIIIII.append(good.getRgid());
            good.setStatus(Integer.valueOf(1));
            roleData.ALLATORIxDEMO(good.getRgid());
            if (IiiiiiiiIIIII2 != null) {
                roleData.ALLATORIxDEMO(IiiiiiiiIIIII2);
            }
            roleData.goodChoses[Equipmentid] = good.getRgid();
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"rolechange", (String)IiiiiiiiIIIII.toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
            roleData.getPackRecord().setEquip(roleData.goodChoses);
        } else if (good == null) {
            IiiiiiiiIIIII = roleData.getEquipGood(Equipmentid);
            if (IiiiiiiiIIIII == null) {
                return false;
            }
            if (!roleData.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII)) {
                roleData.getGameView().iiiIiiiiiiIIi("\u80cc\u5305\u5df2\u6ee1");
                return false;
            }
            roleData.goodChoses[Equipmentid] = null;
            IiiiiiiiIIIII.setStatus(0);
            StringBuffer IiiiiiiiIIIII4 = new StringBuffer();
            IiiiiiiiIIIII4.append("E");
            IiiiiiiiIIIII4.append(Equipmentid);
            IiiiiiiiIIIII4.append("=A");
            IiiiiiiiIIIII4.append(IiiiiiiiIIIII.getRgid());
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"rolechange", (String)IiiiiiiiIIIII4.toString());
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
            roleData.getPackRecord().setEquip(roleData.goodChoses);
        }
        roleData.getRoleProperty().IIIIIiiiiIIii();
        try {
            Thread.sleep(5L);
        }
        catch (Exception IiiiiiiiIIIII6) {
            IiiiiiiiIIIII6.printStackTrace();
        }
        roleData.ALLATORIxDEMO(false);
        return true;
    }

    public static boolean ALLATORIxDEMO(RoleData roleData, String[] mes, double xs) {
        switch (mes[0]) {
            case "\u88c5\u5907\u89d2\u8272": {
                if (mes[1].indexOf(roleData.getLoginResult().getLocalname()) == -1) return false;
                return true;
            }
            case "\u529b\u91cf\u8981\u6c42": {
                if (!((double)roleData.getRoleProperty().getPower() >= (double)Integer.valueOf(mes[1]).intValue() * xs)) return false;
                return true;
            }
            case "\u7075\u6027\u8981\u6c42": {
                if (!((double)roleData.getRoleProperty().getSpir() >= (double)Integer.valueOf(mes[1]).intValue() * xs)) return false;
                return true;
            }
            case "\u6839\u9aa8\u8981\u6c42": {
                if (!((double)roleData.getRoleProperty().getBone() >= (double)Integer.valueOf(mes[1]).intValue() * xs)) return false;
                return true;
            }
            case "\u654f\u6377\u8981\u6c42": {
                if (!((double)roleData.getRoleProperty().getSpeed() >= (double)Integer.valueOf(mes[1]).intValue() * xs)) return false;
                return true;
            }
            case "\u58f0\u671b\u8981\u6c42": {
                if (roleData.getLoginResult().getPrestige().intValue() < Integer.valueOf(mes[1])) return false;
                return true;
            }
            case "\u7b49\u7ea7\u8981\u6c42": {
                return IiiiIiiiiIIII.iIiIiiiiIIiii((int)roleData.getLoginResult().getGrade(), (String)mes[1]);
            }
            case "\u6700\u9ad8\u643a\u5e26\u7b49\u7ea7": {
                return IiiiIiiiiIIII.ALLATORIxDEMO((int)roleData.getLoginResult().getGrade(), (String)mes[1]);
            }
            case "\u6027\u522b": 
            case "\u6027\u522b\u8981\u6c42": {
                if (mes[1].equals("2")) {
                    return true;
                }
                if (IiiiIiiiiIiIi.ALLATORIxDEMO((BigDecimal)roleData.getLoginResult().getSpecies_id()) != Integer.valueOf(mes[1])) return false;
                return true;
            }
        }
        return false;
    }

    public static boolean ALLATORIxDEMO(RoleData roleData, Baby baby, Goodstable good, int type) {
        if (good != null) {
            BigDecimal IiiiiiiiIIIII = baby.ALLATORIxDEMO(good.getRgid(), type);
            roleData.ALLATORIxDEMO(good.getRgid());
            good.setStatus(Integer.valueOf(1));
            ParamTool.ALLATORIxDEMO((Goodstable)good, (int)0, (GameClient)roleData.getGameView().getClient());
            Goodstable IiiiiiiiIIIII2 = roleData.getGoodEquip(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2 != null) {
                roleData.ALLATORIxDEMO(IiiiiiiiIIIII2);
                IiiiiiiiIIIII2.setStatus(Integer.valueOf(0));
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)0, (GameClient)roleData.getGameView().getClient());
            }
            ParamTool.ALLATORIxDEMO((Baby)baby, (GameClient)roleData.getGameView().getClient());
            return true;
        }
        BigDecimal IiiiiiiiIIIII = baby.ALLATORIxDEMO(new BigDecimal(-1), type);
        good = roleData.getGoodEquip(IiiiiiiiIIIII);
        if (good != null && roleData.ALLATORIxDEMO(good)) {
            good.setStatus(Integer.valueOf(0));
            ParamTool.ALLATORIxDEMO((Goodstable)good, (int)0, (GameClient)roleData.getGameView().getClient());
            ParamTool.ALLATORIxDEMO((Baby)baby, (GameClient)roleData.getGameView().getClient());
            return true;
        }
        baby.ALLATORIxDEMO(good.getRgid(), type);
        roleData.getGameView().iIiIiiiiIIiii("\u80cc\u5305\u5df2\u6ee1");
        return false;
    }

    public static void ALLATORIxDEMO(RoleData roleData, int EquipmentType, Goodstable goodstable) throws Exception {
        if (roleData.getGameView().getClient().ALLATORIxDEMO(2, 3) && EquipmentType != 0 && EquipmentType != 1 && EquipmentType != 2 && EquipmentType != 3 && EquipmentType != 5) {
            return;
        }
        int IiiiiiiiIIIII = HandleEquip.getEquiptmentOrNo(roleData, goodstable);
        if (IiiiiiiiIIIII == -2) {
            roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u8fbe\u4e0d\u5230\u88c5\u5907\u8981\u6c42");
            return;
        }
        if (IiiiiiiiIIIII != -1) {
            EquipmentType = IiiiiiiiIIIII;
        } else if (EquipmentType == 10 && roleData.getEquipGood(EquipmentType) != null) {
            EquipmentType = 11;
        }
        HandleEquip.ALLATORIxDEMO(roleData, EquipmentType, goodstable);
    }

    /*
     * Unable to fully structure code
     */
    public static int getEquiptmentOrNo(RoleData roleData, Goodstable good) {
        IiiiiiiiIIIII = -1;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = 1.0;
        IiiiiiiiIIIII = good.getValue().split("\\|");
        IiiiiiiiIIIII = IiiiiiiiIIIII.length - 1;
        while (IiiiiiiiIIIII >= 0) {
            block23: {
                block22: {
                    block21: {
                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block21;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("\\&");
                        IiiiiiiiIIIII = 1;
                        if (true) ** GOTO lbl50
                    }
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(GoodType.Extras[2])) break block22;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("\\&");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl57
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                if (IiiiiiiiIIIII[0].equals("\u88c5\u5907\u89d2\u8272") || IiiiiiiiIIIII[0].equals("\u6027\u522b\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u6027\u522b")) {
                    if (!HandleEquip.ALLATORIxDEMO(roleData, IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                        return -2;
                    }
                } else if (IiiiiiiiIIIII[0].equals("\u7b49\u7ea7\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u6700\u9ad8\u643a\u5e26\u7b49\u7ea7")) {
                    if (!IiiiiiiiIIIII && !HandleEquip.ALLATORIxDEMO(roleData, IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                        return -2;
                    }
                } else if (IiiiiiiiIIIII[0].equals("\u529b\u91cf\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u7075\u6027\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u6839\u9aa8\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u654f\u6377\u8981\u6c42") || IiiiiiiiIIIII[0].equals("\u58f0\u671b\u8981\u6c42")) {
                    if (!IiiiiiiiIIIII && !HandleEquip.ALLATORIxDEMO(roleData, IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                        return -2;
                    }
                } else if (IiiiiiiiIIIII[0].equals("\u88c5\u5907\u90e8\u4f4d")) {
                    try {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                    }
                    catch (Exception var10_11) {
                        // empty catch block
                    }
                }
                break block23;
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u7279\u6280")) {
                        IiiiiiiiIIIII = 1;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                            if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals("8016")) {
                                IiiiiiiiIIIII = true;
                            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals("8017")) {
                                IiiiiiiiIIIII = true;
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl50:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block23;
                do {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u5c5e\u6027\u9700\u6c42") && (IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) != -1) {
                        IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1)) / 100.0;
                        IiiiiiiiIIIII += IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u5c5e\u6027\u9700\u6c42\u51cf\u5c11") != false ? -IiiiiiiiIIIII : IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
lbl57:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            --IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }
}
