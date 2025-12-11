/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.TestChildJpanel
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Pal
 *  com.xy.formula.BaseValue
 *  com.xy.game.HandleEquip
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.BabyResult
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.game;

import com.xy.a.a.TestChildJpanel;
import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.bean.ConfirmBean;
import com.xy.entity.Baby;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.game.HandleEquip;
import com.xy.game.RoleData;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;

public class HandleBabyAndPal {
    public static void ALLATORIxDEMO(Goodstable good, boolean isShiftDown, RoleData roleData) {
        Baby IiiiiiiiIIIII = roleData.getChoseBaby();
        if (IiiiiiiiIIIII == null) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u5b69\u5b50");
            return;
        }
        int IiiiiiiiIIIII2 = good.getType().intValue();
        if (roleData.getGameView().getClient().gameBaby) {
            if (isShiftDown && roleData.getGameView().getClient().ALLATORIxDEMO(2, 12) && (IiiiiiiiIIIII2 == 133 || IiiiiiiiIIIII2 == 134)) {
                iIiIiiiiiiiIi IiiiiiiiIIIII3 = (iIiIiiiiiiiIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(162);
                IiiiiiiiIIIII3.ALLATORIxDEMO(3, IiiiiiiiIIIII.getBabyid(), good);
                return;
            }
            if (IiiiiiiiIIIII2 == 133 || IiiiiiiiIIIII2 == 134) {
                String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"userbaby", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getBabyid()));
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII4);
                return;
            }
            if (IiiiiiiiIIIII2 == 51) {
                String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"userbaby", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getBabyid()));
                roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
                return;
            }
            if (IiiiiiiiIIIII2 == 53) {
                roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(30, IiiiiiiiIIIII.getBabyid() + "|" + good.getRgid(), "#W\u4f60\u786e\u5b9a\u5c06\u4f60\u7684\u5b69\u5b50#Y" + IiiiiiiiIIIII.getBabyname() + "#W\u8fdb\u884c\u91cd\u7f6e?"));
                return;
            }
            if (IiiiiiiiIIIII2 != 139) return;
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"userbaby", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getBabyid()));
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
            return;
        }
        if (IiiiiiiiIIIII2 == 50) {
            HandleBabyAndPal.iIiIiiiiIIiii(IiiiiiiiIIIII, good, roleData);
            return;
        }
        if (IiiiiiiiIIIII2 == 51) {
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"userbaby", (String)(good.getRgid() + "|" + IiiiiiiiIIIII.getBabyid()));
            roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        if (IiiiiiiiIIIII2 >= 54 && IiiiiiiiIIIII2 <= 61) {
            HandleBabyAndPal.ALLATORIxDEMO(IiiiiiiiIIIII, good, roleData);
            return;
        }
        if (IiiiiiiiIIIII2 != 53) return;
        HandleBabyAndPal.iiiIiiiiiiIIi(IiiiiiiiIIIII, good, roleData);
    }

    /*
     * WARNING - void declaration
     */
    public static void iiiIiiiiiiIIi(Baby baby, Goodstable goodstable, RoleData roleData) {
        void IiiiiiiiIIIII;
        if (baby.getBabyage() < 360) {
            roleData.getGameView().iIiIiiiiIIiii("\u5b69\u5b50\u592a\u5c0f\u4e0d\u80fd\u4f7f\u7528");
            return;
        }
        if (baby.getBabyage() >= 6480) {
            roleData.getGameView().iIiIiiiiIIiii("\u56de\u4e0d\u53bb\u4e86#15");
            return;
        }
        String[] stringArray = goodstable.getValue().split("-");
        int IiiiiiiiIIIII2 = Integer.parseInt(stringArray[0]);
        int IiiiiiiiIIIII3 = Integer.parseInt(stringArray[1]) - IiiiiiiiIIIII2 + 1;
        int IiiiiiiiIIIII4 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII3) + IiiiiiiiIIIII2;
        int[] nArray = new int[9];
        IiiiiiiiIIIII[0] = baby.getQizhi();
        IiiiiiiiIIIII[1] = baby.getNeili();
        IiiiiiiiIIIII[2] = baby.getZhili();
        IiiiiiiiIIIII[3] = baby.getNaili();
        IiiiiiiiIIIII[4] = baby.getMingqi();
        IiiiiiiiIIIII[5] = baby.getDaode();
        IiiiiiiiIIIII[6] = baby.getPanni();
        IiiiiiiiIIIII[7] = baby.getWanxing();
        nArray[8] = baby.getXiaoxin();
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII4 / 5;
        while (IiiiiiiiIIIII4 > 0) {
            int IiiiiiiiIIIII6 = 0;
            int IiiiiiiiIIIII7 = 0;
            while (IiiiiiiiIIIII7 < ((void)IiiiiiiiIIIII).length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII7] <= 0) {
                    ++IiiiiiiiIIIII6;
                }
                ++IiiiiiiiIIIII7;
            }
            if (IiiiiiiiIIIII6 >= 9) break;
            IiiiiiiiIIIII7 = IiiiiiiiIIIII5;
            if (IiiiiiiiIIIII7 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII4;
            }
            int IiiiiiiiIIIII8 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(9);
            while (IiiiiiiiIIIII[IiiiiiiiIIIII8] == false) {
                IiiiiiiiIIIII8 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(9);
            }
            if (IiiiiiiiIIIII7 > IiiiiiiiIIIII[IiiiiiiiIIIII8]) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII[IiiiiiiiIIIII8];
            }
            IiiiiiiiIIIII[IiiiiiiiIIIII8] = IiiiiiiiIIIII[IiiiiiiiIIIII8] - IiiiiiiiIIIII7;
            IiiiiiiiIIIII4 -= IiiiiiiiIIIII7;
        }
        baby.setQizhi(Integer.valueOf((int)IiiiiiiiIIIII[0]));
        baby.setNeili(Integer.valueOf((int)IiiiiiiiIIIII[1]));
        baby.setZhili(Integer.valueOf((int)IiiiiiiiIIIII[2]));
        baby.setNaili(Integer.valueOf((int)IiiiiiiiIIIII[3]));
        baby.setMingqi(Integer.valueOf((int)IiiiiiiiIIIII[4]));
        baby.setDaode(Integer.valueOf((int)IiiiiiiiIIIII[5]));
        baby.setPanni(Integer.valueOf((int)IiiiiiiiIIIII[6]));
        baby.setWanxing(Integer.valueOf((int)IiiiiiiiIIIII[7]));
        baby.setXiaoxin(Integer.valueOf((int)IiiiiiiiIIIII[8]));
        baby.setBabyage(Integer.valueOf(baby.getBabyage() - 360));
        goodstable.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)1, (GameClient)roleData.getGameView().getClient());
        ParamTool.ALLATORIxDEMO((Baby)baby, (GameClient)roleData.getGameView().getClient());
        com.xy.q.IiiiIiiiiIiIi IiiiiiiiIIIII9 = roleData.getGameView().getFormManagement().iIiIiiiiIIiii(1);
        if (IiiiiiiiIIIII9 != null) {
            ((iIIIiiiiIiiII)IiiiiiiiIIIII9).ALLATORIxDEMO(baby);
        }
        roleData.getGameView().iIiIiiiiIIiii("\u5b69\u5b50\u56de\u5230\u4e86\u4e00\u5e74\u524d");
    }

    public static void iIiIiiiiIIiii(Baby baby, Goodstable goodstable, RoleData roleData) {
        String[] IiiiiiiiIIIII;
        String[] stringArray = goodstable.getValue().split("\\|");
        IiiiiiiiIIIII = stringArray[IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII.length)].split("=");
        String IiiiiiiiIIIII2 = IiiiiiiiIIIII[0];
        IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("-");
        int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[0]);
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII[1]);
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII4 - IiiiiiiiIIIII3 + 1;
        int IiiiiiiiIIIII6 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII5) + IiiiiiiiIIIII3;
        if (IiiiiiiiIIIII6 <= IiiiiiiiIIIII3 + 1 || IiiiiiiiIIIII6 >= IiiiiiiiIIIII4 - 1) {
            IiiiiiiiIIIII6 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII5) + IiiiiiiiIIIII3;
        }
        switch (IiiiiiiiIIIII2) {
            case "\u6c14\u8d28": {
                baby.setQizhi(Integer.valueOf(baby.getQizhi() + IiiiiiiiIIIII6));
                break;
            }
            case "\u5185\u529b": {
                baby.setNeili(Integer.valueOf(baby.getNeili() + IiiiiiiiIIIII6));
                break;
            }
            case "\u667a\u529b": {
                baby.setZhili(Integer.valueOf(baby.getZhili() + IiiiiiiiIIIII6));
                break;
            }
            case "\u8010\u529b": {
                baby.setNaili(Integer.valueOf(baby.getNaili() + IiiiiiiiIIIII6));
                break;
            }
            case "\u540d\u6c14": {
                baby.setMingqi(Integer.valueOf(baby.getMingqi() + IiiiiiiiIIIII6));
                break;
            }
            case "\u9053\u5fb7": {
                baby.setDaode(Integer.valueOf(baby.getDaode() + IiiiiiiiIIIII6));
                break;
            }
            case "\u53db\u9006": {
                baby.setPanni(Integer.valueOf(baby.getPanni() + IiiiiiiiIIIII6));
                break;
            }
            case "\u73a9\u6027": {
                baby.setWanxing(Integer.valueOf(baby.getWanxing() + IiiiiiiiIIIII6));
                break;
            }
            case "\u5b5d\u5fc3": {
                baby.setXiaoxin(Integer.valueOf(baby.getXiaoxin() + IiiiiiiiIIIII6));
                break;
            }
        }
        baby.setBabyage(Integer.valueOf(baby.getBabyage() + 10));
        HandleBabyAndPal.ALLATORIxDEMO(baby, roleData);
        goodstable.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)1, (GameClient)roleData.getGameView().getClient());
        ParamTool.ALLATORIxDEMO((Baby)baby, (GameClient)roleData.getGameView().getClient());
        com.xy.q.IiiiIiiiiIiIi IiiiiiiiIIIII7 = roleData.getGameView().getFormManagement().iIiIiiiiIIiii(1);
        if (IiiiiiiiIIIII7 != null) {
            ((iIIIiiiiIiiII)IiiiiiiiIIIII7).ALLATORIxDEMO(baby);
        }
        roleData.getGameView().iIiIiiiiIIiii("\u5b69\u5b50\u5728#G " + IiiiiiiiIIIII2 + " #Y\u4e0a\u589e\u52a0\u4e86#G " + IiiiiiiiIIIII6 + " #Y\u70b9\u5c5e\u6027");
    }

    public static void ALLATORIxDEMO(Goodstable good, RoleData roleData) {
        Pal IiiiiiiiIIIII = roleData.getChosePal();
        if (IiiiiiiiIIIII == null) {
            roleData.getGameView().iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u4f19\u4f34");
            return;
        }
        if (good.getType() == 7500L) {
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpal", (String)(IiiiiiiiIIIII.getId() + "|" + good.getRgid()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(Baby baby, Goodstable good, RoleData roleData) {
        int IiiiiiiiIIIII = (int)(good.getType() - 54L) / 2;
        if (IiiiiiiiIIIII < 0) {
            IiiiiiiiIIIII = 0;
        } else if (IiiiiiiiIIIII > 3) {
            IiiiiiiiIIIII = 3;
        }
        if (baby.getChildSex() == 0 && good.getType() % 2L != 0L) {
            roleData.getGameView().iIiIiiiiIIiii("\u8fd9\u662f\u5973\u5b69\u5b50\u7528\u7684");
            return;
        }
        if (baby.getChildSex() == 1 && good.getType() % 2L == 0L) {
            roleData.getGameView().iIiIiiiiIIiii("\u8fd9\u662f\u7537\u5b69\u5b50\u7528\u7684");
            return;
        }
        if (!HandleEquip.ALLATORIxDEMO((RoleData)roleData, (Baby)baby, (Goodstable)good, (int)IiiiiiiiIIIII)) return;
        com.xy.q.IiiiIiiiiIiIi IiiiiiiiIIIII2 = roleData.getGameView().getFormManagement().iIiIiiiiIIiii(1);
        if (IiiiiiiiIIIII2 == null) return;
        ((iIIIiiiiIiiII)IiiiiiiiIIIII2).ALLATORIxDEMO(baby);
    }

    /*
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(Baby baby, RoleData roleData) {
        if (baby.getBabyage() < 6480) {
            return;
        }
        if (baby.getOutcome() != null && !baby.getOutcome().equals("")) {
            return;
        }
        IiiiiiiiIIIII = roleData.getObjectArea().ALLATORIxDEMO().getAllBabyResults();
        IiiiiiiiIIIII = BaseValue.getProperty((Baby)baby, (BigDecimal[])(baby != null ? baby.getpartAll() : null), (RoleData)roleData);
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = "";
        for (String IiiiiiiiIIIII : IiiiiiiiIIIII.keySet()) {
            IiiiiiiiIIIII = (Integer)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII += IiiiiiiiIIIII;
            if (IiiiiiiiIIIII < IiiiiiiiIIIII) continue;
            IiiiiiiiIIIII = IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
        block1: while (IiiiiiiiIIIII >= 0) {
            IiiiiiiiIIIII = (BabyResult)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            if (!IiiiiiiiIIIII.getT1().equals("\u65e0") && !IiiiiiiiIIIII.getT1().equals(IiiiiiiiIIIII)) ** GOTO lbl35
            IiiiiiiiIIIII = IiiiiiiiIIIII.getT2().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                if (!IiiiiiiiIIIII[0].equals("\u603b")) {
                    IiiiiiiiIIIII = (Integer)IiiiiiiiIIIII.get(IiiiiiiiIIIII[0]);
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("\\-");
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII && IiiiiiiiIIIII <= IiiiiiiiIIIII) {
                    ++IiiiiiiiIIIII;
                    continue;
                }
lbl35:
                // 3 sources

                --IiiiiiiiIIIII;
                continue block1;
            }
            break block1;
        }
        baby.setOutcome(baby.getChildSex() == 0 ? IiiiiiiiIIIII.getNan() : IiiiiiiiIIIII.getNv());
        roleData.getGameView().iIiIiiiiIIiii("\u5b69\u5b50\u83b7\u5f97#G" + baby.getOutcome() + "\u7ed3\u5c40");
    }
}
