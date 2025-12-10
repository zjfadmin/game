/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiiiiiiiIIII
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.formula.PetProperty
 *  com.xy.game.HandleGood
 *  com.xy.game.RoleData
 *  com.xy.readbean.ColorScheme
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.game;

import com.xy.a.a.IiiiiiiiiIIII;
import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.formula.PetProperty;
import com.xy.game.HandleGood;
import com.xy.game.RoleData;
import com.xy.readbean.ColorScheme;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import java.math.BigDecimal;

public class HandlePet {
    public static boolean ALLATORIxDEMO(int petid, String skin, Integer id) {
        if (id == 200055) {
            if (skin.equals("400050")) return true;
            if (skin.equals("400066")) return true;
            if (skin.equals("400024")) return true;
            if (skin.equals("400073")) return true;
            if (skin.equals("400081")) {
                return true;
            }
        }
        if (!(petid >= 200102 && petid <= 200107 || petid >= 200092 && petid <= 200096 || petid == 200076 || petid == 200068 || petid == 200060 || petid == 200075 || petid == 200065)) {
            if (petid != 200043) return String.valueOf(HandlePet.getIDSKIN(id)).equals(skin);
        }
        if (id == 200095 && skin.equals("400105")) {
            return true;
        }
        if (id == 200093 && skin.equals("400103")) {
            return true;
        }
        if (id == 200092 && skin.equals("400102")) {
            return true;
        }
        if (id == 200065 && skin.equals("400079")) {
            return true;
        }
        if (id != 200076) return String.valueOf(HandlePet.getIDSKIN(id)).equals(skin);
        if (!skin.equals("400078")) return String.valueOf(HandlePet.getIDSKIN(id)).equals(skin);
        return true;
    }

    public static int getIDSKIN(int id) {
        switch (id) {
            case 200095: {
                return 400105;
            }
            case 200124: {
                return 400135;
            }
            case 200126: {
                return 400142;
            }
            case 200127: {
                return 400145;
            }
            case 200156: {
                return 400147;
            }
            case 200134: {
                return 400151;
            }
            case 200154: {
                return 400311;
            }
            case 200092: {
                return 400102;
            }
            case 200141: {
                return 400181;
            }
            case 200132: {
                return 400148;
            }
            case 200138: {
                return 400140;
            }
            case 200135: {
                return 400138;
            }
            case 200093: {
                return 400103;
            }
            case 200085: {
                return 400095;
            }
            case 200087: {
                return 400092;
            }
            case 200090: {
                return 400091;
            }
            case 200065: {
                return 400079;
            }
            case 200076: {
                return 400078;
            }
            case 200061: {
                return 400077;
            }
            case 200009: {
                return 400051;
            }
            case 200055: {
                return 400024;
            }
            case 200182: {
                return 400509;
            }
            case 200147: {
                return 400316;
            }
            case 200077: {
                return 400088;
            }
            case 200149: {
                return 400134;
            }
            case 200148: {
                return 400150;
            }
            case 200155: {
                return 400304;
            }
            case 200158: {
                return 400506;
            }
            case 200183: {
                return 400558;
            }
            case 200184: {
                return 400575;
            }
            case 200185: {
                return 400556;
            }
            case 506: {
                return 500012;
            }
            case 508: {
                return 400318;
            }
            case 512: {
                return 500104;
            }
        }
        return -1;
    }

    public static void IiiIiiiiiiIiI(RoleSummoning pet, Goodstable good, RoleData roleData) {
        String IiiiiiiiIIIII = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)good.getValue(), (String)"\u53ec\u5524\u517d=", (String)"|");
        if (IiiiiiiiIIIII != null && !pet.getSummoningid().equals(IiiiiiiiIIIII) && !HandlePet.ALLATORIxDEMO(Integer.parseInt(pet.getSummoningid()), pet.getSummoningskin(), Integer.parseInt(IiiiiiiiIIIII))) {
            roleData.getGameView().iiiIiiiiiiIIi("\u53ec\u5524\u517d\u65e0\u6cd5\u4f69\u6234\u8be5\u53ec\u5524\u517d\u88c5\u5907");
            return;
        }
        HandlePet.ALLATORIxDEMO(pet, good, -1, roleData);
    }

    public static int getPetId(String pet) {
        switch (pet) {
            case "\u7f57\u5239\u9b3c\u59ec": {
                return 200095;
            }
            case "\u9f99\u9a6c": {
                return 200124;
            }
            case "\u51a5\u96f7": {
                return 200126;
            }
            case "\u897f\u57df\u54cd\u9a6c": {
                return 200127;
            }
            case "\u91d1\u4e0d\u6362": {
                return 200156;
            }
            case "\u677e\u9f20": {
                return 200134;
            }
            case "\u62e8\u6d6a\u9f13": {
                return 200154;
            }
            case "\u54e5\u4fe9\u597d": {
                return 200092;
            }
            case "\u5b54\u96c0\u660e\u738b": {
                return 200141;
            }
            case "\u8d6d\u708e": {
                return 200132;
            }
            case "\u753b\u76ae\u5a18\u5b50": {
                return 200138;
            }
            case "\u51a5\u7075\u5983\u5b50": {
                return 200135;
            }
            case "\u9ec4\u91d1\u517d": {
                return 200085;
            }
            case "\u5251\u7cbe\u7075": {
                return 200093;
            }
            case "\u6ce5\u77f3\u602a": {
                return 200087;
            }
            case "\u51b0\u96ea\u9b54": {
                return 200090;
            }
            case "\u8774\u8776\u4ed9\u5b50": {
                return 200065;
            }
            case "\u51e4\u51f0": {
                return 200076;
            }
            case "\u51b2\u51b2\u866b": {
                return 200061;
            }
            case "\u732a\u602a": {
                return 200009;
            }
            case "\u7b26\u5492\u5973\u5a32": {
                return 200055;
            }
            case "\u68d5\u5c0f\u4ed9": {
                return 200182;
            }
            case "\u7cbe\u536b": {
                return 200147;
            }
            case "\u7334\u7cbe": {
                return 200077;
            }
            case "\u5929\u9f99\u5973": {
                return 200149;
            }
            case "\u5409\u7965\u679c": {
                return 200148;
            }
            case "\u72ee\u864e\u517d": {
                return 200155;
            }
            case "\u5999\u97f3\u9e3e\u5973": {
                return 200158;
            }
            case "\u78a7\u6c34\u7cbe\u9b44": {
                return 200183;
            }
            case "\u4fcf\u5a18\u5b50": {
                return 200184;
            }
            case "\u6728\u7532\u4eba": {
                return 200185;
            }
            case "\u701a\u5a01\u732b\u5c06\u7684": {
                return 506;
            }
            case "\u5b59\u5c0f\u5723": {
                return 508;
            }
            case "\u767d\u9f99\u5e1d": {
                return 512;
            }
        }
        return -1;
    }

    public static void iIiIiiiiIIiIi(RoleSummoning pet, Goodstable good, RoleData roleData) {
        int[] IiiiiiiiIIIII = IiiiIiiiiIIII.ALLATORIxDEMO((String)good.getValue());
        if (!HandlePet.ALLATORIxDEMO(pet, PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)roleData), IiiiiiiiIIIII, roleData)) {
            return;
        }
        good.ALLATORIxDEMO(1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(RoleSummoning roleSummoning, int[] nArray, int[] nArray2, RoleData roleData) {
        void yao;
        void roleData2;
        double IiiiiiiiIIIII;
        RoleSummoning pet;
        void pets;
        double IiiiiiiiIIIII2 = (double)pets[0];
        double IiiiiiiiIIIII3 = (double)pets[1];
        double IiiiiiiiIIIII4 = pet.getBasishp((int)pets[0]);
        if (!HandleGood.ALLATORIxDEMO((int[])nArray2, (double)IiiiiiiiIIIII2, (double)IiiiiiiiIIIII4, (double)IiiiiiiiIIIII3, (double)(IiiiiiiiIIIII = (double)pet.getBasismp((int)pets[1])), (RoleData)roleData2)) {
            return false;
        }
        if (yao[0] != false || yao[2] != false) {
            if ((IiiiiiiiIIIII4 = IiiiiiiiIIIII4 + (double)yao[0] + (double)yao[2] * IiiiiiiiIIIII2 / 100.0) > IiiiiiiiIIIII2) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII2;
            }
            pet.setBasishp((int)IiiiiiiiIIIII4);
        }
        if (yao[1] == false) {
            if (yao[3] == false) return true;
        }
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII + (double)yao[1] + (double)yao[3] * IiiiiiiiIIIII3 / 100.0) > IiiiiiiiIIIII3) {
            IiiiiiiiIIIII = IiiiiiiiIIIII3;
        }
        pet.setBasismp((int)IiiiiiiiIIIII);
        return true;
    }

    public static void ALLATORIxDEMO(RoleSummoning pet, Goodstable good, int type, RoleData roleData) {
        String IiiiiiiiIIIII = pet.getStye();
        BigDecimal IiiiiiiiIIIII2 = null;
        if (type != -1) {
            if (roleData.getGoodPackSum(-1L, new BigDecimal(-1), 1) == 0) {
                roleData.getGameView().iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u5df2\u6ee1");
                return;
            }
            IiiiiiiiIIIII2 = pet.ALLATORIxDEMO(null, type, roleData.getGameView());
        } else {
            type = GoodType.getPetGoodType((Long)good.getType());
            roleData.ALLATORIxDEMO(good.getRgid());
            good.setStatus(Integer.valueOf(1));
            ParamTool.ALLATORIxDEMO((Goodstable)good, (int)0, (GameClient)roleData.getGameView().getClient());
            IiiiiiiiIIIII2 = pet.ALLATORIxDEMO(good, type, roleData.getGameView());
        }
        Goodstable IiiiiiiiIIIII3 = roleData.getGoodEquip(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3.setStatus(Integer.valueOf(0));
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII3, (int)0, (GameClient)roleData.getGameView().getClient());
            roleData.ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
        int[] IiiiiiiiIIIII4 = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)roleData);
        pet.setBasishp(IiiiiiiiIIIII4[0]);
        pet.setBasismp(IiiiiiiiIIIII4[1]);
        if (!IiiiiiiiIIIII.equals(pet.getStye())) {
            ParamTool.ALLATORIxDEMO((RoleSummoning)pet, (GameClient)roleData.getGameView().getClient());
        }
        roleData.getRoleProperty().ALLATORIxDEMO(pet);
    }

    public static void ALLATORIxDEMO(RoleSummoning pet, Goodstable good, boolean isShiftDown, RoleData roleData) {
        long IiiiiiiiIIIII = good.getType();
        if (isShiftDown && roleData.getGameView().getClient().ALLATORIxDEMO(2, 12) && (IiiiiiiiIIIII == 715L || IiiiiiiiIIIII == 1005L || IiiiiiiiIIIII == 2040L || IiiiiiiiIIIII == 2323L)) {
            iIiIiiiiiiiIi IiiiiiiiIIIII2 = (iIiIiiiiiiiIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII2.ALLATORIxDEMO(1, pet.getSid(), good);
            return;
        }
        if (IiiiiiiiIIIII == 0L) {
            int IiiiiiiiIIIII3 = good.getUsetime();
            HandlePet.iIiIiiiiIIiIi(pet, good, roleData);
            if (IiiiiiiiIIIII3 != good.getUsetime()) {
                ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
                ParamTool.ALLATORIxDEMO((RoleSummoning)pet, (GameClient)roleData.getGameView().getClient());
                roleData.getRoleProperty().ALLATORIxDEMO(pet);
                roleData.getGameView().iIiIiiiiIIiii(false, "\u6218\u6597\u3001\u7ad9\u7acb\u3001\u884c\u8d70\u4f7f\u7528\u836f\u54c1.mp3");
            }
        } else if (IiiiiiiiIIIII == 750L) {
            HandlePet.iiiIiiiiiiIIi(pet, good, roleData);
        } else if (IiiiiiiiIIIII == 2115L) {
            HandlePet.iIiIiiiiIIiii(pet, good, roleData);
        } else if (IiiiiiiiIIIII == 729L || IiiiiiiiIIIII == 510L || IiiiiiiiIIIII == 511L || IiiiiiiiIIIII == 512L) {
            HandlePet.IiiIiiiiiiIiI(pet, good, roleData);
        } else if (IiiiiiiiIIIII == 117L) {
            iIIiiiiiIIIIi IiiiiiiiIIIII4 = (iIIiiiiiIIIIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII4.iIiIiiiiIIiii(pet, good);
        } else {
            HandlePet.ALLATORIxDEMO(pet, good, roleData);
        }
        if (good.getUsetime() > 0) return;
        roleData.iIiIiiiiIIiii(good.getRgid());
    }

    public static int getSkillNum(int openSeal) {
        if (openSeal <= 6) {
            return openSeal;
        }
        if (openSeal - 1 <= 8) return openSeal - 1;
        return 8;
    }

    public static void iiiIiiiiiiIIi(RoleSummoning pet, Goodstable good, RoleData roleData) {
        String[] IiiiiiiiIIIII = good.getValue().split("\\|")[2].split("=")[1].split("\u8f6c");
        int IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII[0]);
        int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[1]);
        int IiiiiiiiIIIII4 = pet.getTurnRount();
        int IiiiiiiiIIIII5 = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
        if (IiiiiiiiIIIII4 < IiiiiiiiIIIII2 || IiiiiiiiIIIII4 == IiiiiiiiIIIII2 && IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
            roleData.getGameView().iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u7b49\u7ea7\u4f4e\u4e8e\u5185\u4e39\u7b49\u7ea7\uff01\uff01\uff01");
            return;
        }
        String[] IiiiiiiiIIIII6 = null;
        if (pet.getInnerGoods() != null && !pet.getInnerGoods().equals("")) {
            IiiiiiiiIIIII6 = pet.getInnerGoods().split("\\|");
        }
        StringBuffer IiiiiiiiIIIII7 = new StringBuffer();
        if (IiiiiiiiIIIII6 != null) {
            if (IiiiiiiiIIIII6.length >= 3) {
                roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u7684\u5185\u4e39\u5df2\u8d85\u8fc7\u4e0a\u9650\uff01");
                return;
            }
            if (IiiiiiiiIIIII4 == 0 && IiiiiiiiIIIII6.length >= 1) {
                roleData.getGameView().iiiIiiiiiiIIi("\u672a\u8f6c\u53ec\u5524\u517d\u53ea\u53ef\u4ee5\u4f7f\u75281\u4e2a\u5185\u4e39");
                return;
            }
            if (IiiiiiiiIIIII4 == 1 && IiiiiiiiIIIII6.length >= 2) {
                roleData.getGameView().iiiIiiiiiiIIi("1\u8f6c\u53ec\u5524\u517d\u53ea\u53ef\u4ee5\u4f7f\u75282\u4e2a\u5185\u4e39");
                return;
            }
            int IiiiiiiiIIIII8 = 0;
            while (IiiiiiiiIIIII8 < IiiiiiiiIIIII6.length) {
                Goodstable IiiiiiiiIIIII9 = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII6[IiiiiiiiIIIII8]));
                if (IiiiiiiiIIIII9 != null) {
                    if (IiiiiiiiIIIII9.getGoodsname().equals(good.getGoodsname())) {
                        roleData.getGameView().iIiIiiiiIIiii("\u4f60\u5df2\u6709\u8fd9\u79cd\u7c7b\u578b\u7684\u5185\u4e39\u4e86\uff01");
                        return;
                    }
                    if (IiiiiiiiIIIII7.length() != 0) {
                        IiiiiiiiIIIII7.append("|");
                    }
                    IiiiiiiiIIIII7.append(IiiiiiiiIIIII6[IiiiiiiiIIIII8]);
                }
                ++IiiiiiiiIIIII8;
            }
        }
        if (IiiiiiiiIIIII7.length() != 0) {
            IiiiiiiiIIIII7.append("|");
        }
        IiiiiiiiIIIII7.append(good.getRgid());
        pet.setInnerGoods(IiiiiiiiIIIII7.toString());
        roleData.ALLATORIxDEMO(good.getRgid());
        good.setStatus(Integer.valueOf(1));
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)0, (GameClient)roleData.getGameView().getClient());
        ParamTool.ALLATORIxDEMO((RoleSummoning)pet, (GameClient)roleData.getGameView().getClient());
        roleData.getGameView().iIiIiiiiIIiii("\u4f60\u83b7\u5f97\u4e86\u5185\u4e39\u6280\u80fd " + good.getGoodsname());
        roleData.getRoleProperty().ALLATORIxDEMO(pet);
    }

    public static void iIiIiiiiIIiii(RoleSummoning pet, Goodstable good, RoleData roleData) {
        int IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
        pet.setBone(Integer.valueOf(IiiiiiiiIIIII));
        pet.setSpir(Integer.valueOf(IiiiiiiiIIIII));
        pet.setPower(Integer.valueOf(IiiiiiiiIIIII));
        pet.setSpeed(Integer.valueOf(IiiiiiiiIIIII));
        if (pet.getTurnRount() >= 4) {
            pet.setCalm(Integer.valueOf(IiiiiiiiIIIII));
        }
        roleData.getGameView().iiiIiiiiiiIIi("\u4f60\u7684\u4f7f\u7528\u4e86" + good.getGoodsname());
        good.ALLATORIxDEMO(1);
        ParamTool.ALLATORIxDEMO((Goodstable)good, (int)1, (GameClient)roleData.getGameView().getClient());
        ParamTool.ALLATORIxDEMO((RoleSummoning)pet, (GameClient)roleData.getGameView().getClient());
        roleData.getRoleProperty().ALLATORIxDEMO(pet);
    }

    public static void ALLATORIxDEMO(Goodstable goodstable, RoleData roleData) {
        if (goodstable.getGoodsname().equals("\u5f69\u6676\u77f3")) {
            int IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)goodstable.getValue(), (String)"\u54c1\u8d28=", (String)"|");
            if (IiiiiiiiIIIII < 250) {
                roleData.getGameView().iIiIiiiiIIiii("\u54c1\u8d28\u8d85\u8fc7250\u65f6\u53ef\u4ee5\u8f6c\u4e3a\u6307\u5b9a\u53ec\u5524\u517d\u9970\u54c1");
                return;
            }
            iIIiiiiiIIIIi IiiiiiiiIIIII2 = (iIIiiiiiIIIIi)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(27);
            IiiiiiiiIIIII2.iIiIiiiiIIiIi(goodstable);
            return;
        }
        int IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)goodstable.getValue(), (String)"\u54c1\u8d28=", (String)"|");
        if (IiiiiiiiIIIII < 1200) return;
        String IiiiiiiiIIIII3 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)goodstable.getValue(), (String)"\u989c\u8272=", (String)"|");
        if (!IiiiiiiiIIIII3.equals("\u65e0")) return;
        ColorScheme IiiiiiiiIIIII4 = roleData.getObjectArea().ALLATORIxDEMO(0);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        IIiiIiiiiIIiI.ALLATORIxDEMO((String)goodstable.getValue(), (String)"\u989c\u8272=", (String)"|", (String)("\u989c\u8272=" + IiiiiiiiIIIII4.getName()));
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)2, (GameClient)roleData.getGameView().getClient());
    }

    public static int getCJSID(int id) {
        switch (id) {
            case 200095: {
                return 400527;
            }
            case 200124: {
                return 400528;
            }
            case 200126: {
                return 400529;
            }
            case 200127: {
                return 400530;
            }
            case 200156: {
                return 400531;
            }
            case 200134: {
                return 400532;
            }
            case 200154: {
                return 400533;
            }
            case 200092: {
                return 400526;
            }
            case 200141: {
                return 400548;
            }
            case 200132: {
                return 400547;
            }
            case 200138: {
                return 400546;
            }
            case 200135: {
                return 400545;
            }
            case 200093: {
                return 400544;
            }
            case 200085: {
                return 400543;
            }
            case 200087: {
                return 400542;
            }
            case 200090: {
                return 400541;
            }
            case 200065: {
                return 400540;
            }
            case 200076: {
                return 400539;
            }
            case 200061: {
                return 400538;
            }
            case 200009: {
                return 400537;
            }
            case 200055: {
                return 400536;
            }
            case 200182: {
                return 400535;
            }
            case 200147: {
                return 400534;
            }
            case 200077: {
                return 400549;
            }
            case 200149: {
                return 400550;
            }
            case 200148: {
                return 400551;
            }
            case 200155: {
                return 400552;
            }
            case 200158: {
                return 400553;
            }
            case 200183: {
                return 400559;
            }
            case 200184: {
                return 400576;
            }
            case 200185: {
                return 400557;
            }
            case 506: {
                return 500013;
            }
            case 508: {
                return 400319;
            }
            case 512: {
                return 500105;
            }
        }
        return -1;
    }

    public static void getChangeCJS(Goodstable goodstable, String pet, RoleData roleData) {
        Object IiiiiiiiIIIII;
        if (!goodstable.getGoodsname().equals("\u5f69\u6676\u77f3")) {
            return;
        }
        String[] IiiiiiiiIIIII2 = goodstable.getValue().split("\\|");
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII4].split("=");
            if (IiiiiiiiIIIII[0].equals("\u54c1\u8d28")) {
                IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[1]);
            }
            ++IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII3 < 250) {
            return;
        }
        IiiiiiiiIIIII4 = HandlePet.getPetId(pet.substring(0, pet.length() - 2));
        IiiiiiiiIIIII = new StringBuffer();
        ((StringBuffer)IiiiiiiiIIIII).append("\u53ec\u5524\u517d=");
        ((StringBuffer)IiiiiiiiIIIII).append(IiiiiiiiIIIII4);
        ((StringBuffer)IiiiiiiiIIIII).append("|\u76ae\u80a4=");
        ((StringBuffer)IiiiiiiiIIIII).append(HandlePet.getCJSID(IiiiiiiiIIIII4));
        ((StringBuffer)IiiiiiiiIIIII).append("|\u989c\u8272=\u65e0|");
        ((StringBuffer)IiiiiiiiIIIII).append(goodstable.getValue());
        goodstable.setValue(((StringBuffer)IiiiiiiiIIIII).toString());
        goodstable.setGoodsname(pet);
        goodstable.setSkin("pets" + IiiiiiiiIIIII4);
        ParamTool.ALLATORIxDEMO((Goodstable)goodstable, (int)2, (GameClient)roleData.getGameView().getClient());
        goodstable.setRgid(new BigDecimal(goodstable.getRgid().longValue()));
    }

    public static void ALLATORIxDEMO(RoleSummoning pet, Goodstable good, RoleData roleData) {
        long IiiiiiiiIIIII = good.getType();
        if (IiiiiiiiIIIII == 715L) {
            if (pet.getFriendliness() >= 20000000L) {
                roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u7684\u4eb2\u5bc6\u503c\u5df2\u6ee1\uff01");
                return;
            }
        } else if (IiiiiiiiIIIII == 503L || IiiiiiiiIIIII == 2326L) {
            if (IiiiiiiiIIIII == 2326L && roleData.getGameView().getClient().gamePetSkill) {
                IiiiiiiiiIIII IiiiiiiiIIIII2 = (IiiiiiiiiIIII)roleData.getGameView().getFormManagement().iiiIiiiiiiIIi(163);
                IiiiiiiiIIIII2.ALLATORIxDEMO(good, pet);
                return;
            }
            String IiiiiiiiIIIII3 = pet.getPetSkills();
            int IiiiiiiiIIIII4 = pet.getOpenSealByType(0);
            if (IiiiiiiiIIIII4 > 0 && IiiiiiiiIIIII3 != null && !IiiiiiiiIIIII3.equals("")) {
                String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3.split("\\|");
                int IiiiiiiiIIIII6 = IiiiiiiiIIIII5.length;
                if (IiiiiiiiIIIII3.indexOf("L") != -1) {
                    --IiiiiiiiIIIII6;
                }
                if (IiiiiiiiIIIII3.indexOf("Q") != -1) {
                    --IiiiiiiiIIIII6;
                }
                if (IiiiiiiiIIIII3.indexOf("X") != -1) {
                    --IiiiiiiiIIIII6;
                }
                if (IiiiiiiiIIIII3.indexOf("T") != -1) {
                    --IiiiiiiiIIIII6;
                }
                if (HandlePet.getSkillNum(IiiiiiiiIIIII4) <= IiiiiiiiIIIII6) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u53ec\u5524\u517d\u6280\u80fd\u683c\u5b50\u5df2\u7ecf\u6ee1\u4e86");
                    return;
                }
            }
        } else if (IiiiiiiiIIIII == 504L) {
            int IiiiiiiiIIIII7;
            int n = IiiiiiiiIIIII7 = pet.getSsn().equals("2") || pet.getSsn().equals("3") || pet.getSsn().equals("4") ? 9 : 6;
            if (pet.getOpenSealByType(0) >= IiiiiiiiIIIII7) {
                roleData.getGameView().iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u7684\u6280\u80fd\u683c\u5b50\u90fd\u5df2\u89e3\u5f00\uff01");
                return;
            }
        } else if (IiiiiiiiIIIII != 2040L) {
            if (IiiiiiiiIIIII == 2043L) {
                if (pet.getGrade() > 100) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u7b49\u7ea7\u8fc7\u9ad8\uff01");
                    return;
                }
            } else if (IiiiiiiiIIIII == 2113L) {
                int IiiiiiiiIIIII8;
                int n = IiiiiiiiIIIII8 = roleData.getGameView().getClient().gameType == 2 ? 5 : 3;
                if (pet.getDragon() >= IiiiiiiiIIIII8) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u9f99\u9aa8\u6570\u91cf\u5df2\u8fbe\u5230\u4e0a\u9650\uff01");
                    return;
                }
            } else if (IiiiiiiiIIIII == 716L) {
                String[] IiiiiiiiIIIII9;
                String IiiiiiiiIIIII10 = good.getValue();
                if (IiiiiiiiIIIII10 == null || IiiiiiiiIIIII10.equals("")) {
                    IiiiiiiiIIIII10 = "100|0";
                }
                if (!(IiiiiiiiIIIII9 = IiiiiiiiIIIII10.split("\\|"))[1].equals("0") && !IiiiiiiiIIIII9[1].equals(pet.getSummoningid())) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u53ec\u5524\u517d\u65e0\u6cd5\u4f7f\u7528\u8be5\u7c7b\u578b\u7684\u5143\u6c14\u4e39");
                    return;
                }
                if (good.getGoodsname().indexOf("\u5143\u6c14") == -1 && pet.getSsn().equals("6")) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u4e0d\u80fd\u5403\u53d8\u8272\u4e39");
                    return;
                }
            } else if (IiiiiiiiIIIII == 192L) {
                if (!pet.getSsn().equals("5") && !pet.getSummoningid().equals("200125")) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u4e0d\u662f\u9f99\u6d8e\u4e38\u5b9d\u5b9d");
                    return;
                }
                int IiiiiiiiIIIII11 = pet.getDraC();
                if (IiiiiiiiIIIII11 >= 9) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u5df2\u7ecf\u8fbe\u5230\u6700\u5927\u4f7f\u7528\u6b21\u6570");
                    return;
                }
                int IiiiiiiiIIIII12 = 0;
                if (pet.getGrade() >= 433) {
                    IiiiiiiiIIIII12 = 9;
                } else if (pet.getGrade() >= 362) {
                    IiiiiiiiIIIII12 = 8;
                } else if (pet.getGrade() >= 322) {
                    IiiiiiiiIIIII12 = 7;
                } else if (pet.getGrade() >= 272) {
                    IiiiiiiiIIIII12 = 6;
                } else if (pet.getGrade() >= 221) {
                    IiiiiiiiIIIII12 = 5;
                } else if (pet.getGrade() >= 191) {
                    IiiiiiiiIIIII12 = 4;
                } else if (pet.getGrade() >= 151) {
                    IiiiiiiiIIIII12 = 3;
                } else if (pet.getGrade() >= 90) {
                    IiiiiiiiIIIII12 = 2;
                } else if (pet.getGrade() >= 50) {
                    IiiiiiiiIIIII12 = 1;
                }
                if (IiiiiiiiIIIII11 >= IiiiiiiiIIIII12) {
                    String IiiiiiiiIIIII13 = "\u53ec\u5524\u517d\u5f53\u524d\u7b49\u7ea7\u6700\u591a\u4f7f\u7528" + IiiiiiiiIIIII12 + "\u4e2a";
                    roleData.getGameView().iiiIiiiiiiIIi(IiiiiiiiIIIII13);
                    return;
                }
            } else if (IiiiiiiiIIIII == 667L) {
                if (pet.getDragon() <= 0) {
                    roleData.getGameView().iIiIiiiiIIiii("\u53ec\u5524\u517d\u6ca1\u6709\u670d\u7528\u8fc7\u9f99\u9aa8\uff01\uff01");
                    return;
                }
            } else if (IiiiiiiiIIIII == 2323L) {
                if (pet.getPetSkills().indexOf("3034") == -1) {
                    roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u6ca1\u6709???");
                    return;
                }
            } else {
                if (IiiiiiiiIIIII == 2325L) {
                    if (pet.getTurnRount() < 3) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u672a3\u8f6c\uff01");
                        return;
                    }
                    if (pet.getPetSkills() == null || pet.getPetSkills().equals("")) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u53ec\u5524\u517d\u6ca1\u6709\u6280\u80fd");
                        return;
                    }
                    if (pet.getGoods() != null) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u8be5\u53ec\u5524\u517d\u643a\u5e26\u7740\u88c5\u5907\u6216\u5185\u4e39");
                        return;
                    }
                    if (roleData.getPetMount(pet.getSid()) != null) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff01\uff01\uff01");
                        return;
                    }
                    if (roleData.getLoginResult().getSummoning_id() != null && roleData.getLoginResult().getSummoning_id().compareTo(pet.getSid()) == 0) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u5df2\u5728\u53c2\u6218\u4e2d\uff01\uff01\uff01");
                        return;
                    }
                    roleData.getGameView().ALLATORIxDEMO(new ConfirmBean(31, String.valueOf(good.getRgid().toString()) + "|" + pet.getSid(), "\u4f60\u662f\u5426\u5c06\u53ec\u5524\u517d#R" + pet.getSummoningname() + "#W\u8fdb\u884c\u63d0\u70bc?"));
                    return;
                }
                if (IiiiiiiiIIIII == 727L) {
                    int IiiiiiiiIIIII14 = Integer.parseInt(pet.getSummoningid());
                    if (IiiiiiiiIIIII14 != 200123 && IiiiiiiiIIIII14 != 200116 && IiiiiiiiIIIII14 != 200117 && IiiiiiiiIIIII14 != 200097 && IiiiiiiiIIIII14 != 200098 && IiiiiiiiIIIII14 != 200099 && IiiiiiiiIIIII14 != 200100 && IiiiiiiiIIIII14 != 200101) {
                        String IiiiiiiiIIIII15 = "\u767d\u6cfd \u5e74\u00a0\u753b\u4e2d\u4ed9\u00a0\u989c\u5982\u7389\u00a0\u5782\u4e91\u53df\u00a0\u4e94\u53f6\u00a0\u8303\u5f0f\u4e4b\u9b42\u624d\u80fd\u4f7f\u7528\u5316\u5f62\u4e39";
                        roleData.getGameView().iiiIiiiiiiIIi(IiiiiiiiIIIII15);
                        return;
                    }
                } else if (IiiiiiiiIIIII == 2116L) {
                    if (!pet.getSsn().equals("2")) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u4e0d\u80fd\u4f7f\u7528\u795e\u517d\u98de\u5347\u4e39!!!");
                        return;
                    }
                    if (pet.getFlyupNum() >= 3) {
                        roleData.getGameView().iiiIiiiiiiIIi("\u795e\u517d " + pet.getSummoningname() + "\u7684\u98de\u5347\u6b21\u6570\u5df2\u8fbe\u5230\u4e0a\u9650\uff01");
                        return;
                    }
                } else if (IiiiiiiiIIIII != 1005L && IiiiiiiiIIIII != 116L && IiiiiiiiIIIII != 114L && IiiiiiiiIIIII != 130L && IiiiiiiiIIIII != 131L) {
                    return;
                }
            }
        }
        String IiiiiiiiIIIII16 = Agreement.getSendTextAES((String)"userpet", (String)(String.valueOf(good.getRgid().toString()) + "|" + pet.getSid()));
        roleData.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII16);
    }
}
