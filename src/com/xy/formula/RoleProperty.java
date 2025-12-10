/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIiiiiIIIIi
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.a.a.IiiIiiiiIIIii
 *  com.xy.a.a.IiiiIiiiiIIII
 *  com.xy.a.a.iIIIiiiiIiiII
 *  com.xy.a.a.iIIiiiiiIIIIi
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.a.a.iiIiIiiiiiIIi
 *  com.xy.a.a.iiIiIiiiiiiiI
 *  com.xy.a.a.iiiIIiiiIIIii
 *  com.xy.a.w.IIIIIiiiIIIiI
 *  com.xy.a.w.IIIiiiiiiiiIi
 *  com.xy.a.w.IiIIIiiiIIiII
 *  com.xy.a.w.iIiIIiiiIiiiI
 *  com.xy.a.w.iiIiIiiiIIIiI
 *  com.xy.bean.BeauBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.UseCardBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.Pal
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseEquip
 *  com.xy.formula.BaseLimit
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.BaseQl
 *  com.xy.formula.BaseSkill
 *  com.xy.formula.BaseSuit
 *  com.xy.formula.BaseValue
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.PetProperty
 *  com.xy.formula.PropertyUtil
 *  com.xy.formula.Ql
 *  com.xy.formula.QualityZW
 *  com.xy.formula.RoleGradeBorn
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.TYCModel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.a.a.IIIIiiiiIIIIi;
import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.a.a.IiiIiiiiIIIii;
import com.xy.a.a.iIIIiiiiIiiII;
import com.xy.a.a.iIIiiiiiIIIIi;
import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.a.a.iiIiIiiiiiIIi;
import com.xy.a.a.iiIiIiiiiiiiI;
import com.xy.a.a.iiiIIiiiIIIii;
import com.xy.a.w.IIIIIiiiIIIiI;
import com.xy.a.w.IIIiiiiiiiiIi;
import com.xy.a.w.IiIIIiiiIIiII;
import com.xy.a.w.iIiIIiiiIiiiI;
import com.xy.a.w.iiIiIiiiIIIiI;
import com.xy.bean.BeauBean;
import com.xy.bean.LoginResult;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseEquip;
import com.xy.formula.BaseLimit;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseSkill;
import com.xy.formula.BaseSuit;
import com.xy.formula.BaseValue;
import com.xy.formula.ExpUtil;
import com.xy.formula.PetProperty;
import com.xy.formula.PropertyUtil;
import com.xy.formula.Ql;
import com.xy.formula.QualityZW;
import com.xy.formula.RoleGradeBorn;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TYCModel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIiIiiiiiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.IiiiiiiiiIIII;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class RoleProperty {
    Ql quality;
    double hp = 0.0;
    public int sm2 = 0;
    double mp = 0.0;
    public int qhv;
    List<BaseSkill> baseSkills;
    Map<String, Double> equip;
    public int sm1 = 0;
    private RoleData roleData;
    public boolean isReset = true;
    Map<String, Double> born;
    Map<String, Double> additional;
    public Vector<BaseMeridians> meridiansVector;
    Map<Integer, BaseSuit> suitMap;
    public int sld1 = 0;
    public int sld2 = 0;
    Map<String, Double> grade;
    double ap = 0.0;

    public RoleProperty(RoleData roleData) {
        this.roleData = roleData;
    }

    public void ALLATORIxDEMO(Mount mount) {
        if (mount == null) {
            return;
        }
        GameView IiiiiiiiIIIII = this.roleData.getGameView();
        if (IiiiiiiiIIIII.getClient().gameMount) {
            com.xy.a.a.IiiiIiiiiIIII IiiiiiiiIIIII2;
            iiIiIiiiiiiiI IiiiiiiiIIIII3 = (iiIiIiiiiiiiI)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(171);
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII3.ALLATORIxDEMO(mount);
            }
            if (!this.roleData.iiiIiiiiiiIIi(mount.getMid())) {
                return;
            }
            iIIiiiiiIIIIi IiiiiiiiIIIII4 = (iIIiiiiiIIIIi)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(172);
            if (IiiiiiiiIIIII4 != null) {
                if (IiiiiiiiIIIII4.ALLATORIxDEMO(mount)) return;
            }
            if ((IiiiiiiiIIIII2 = (com.xy.a.a.IiiiIiiiiIIII)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(20)) == null) return;
            IiiiiiiiIIIII2.ALLATORIxDEMO(mount);
            return;
        }
        if (!this.roleData.iiiIiiiiiiIIi(mount.getMid())) {
            return;
        }
        IIIIiiiiIIIIi IiiiiiiiIIIII5 = (IIIIiiiiIIIIi)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(7);
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5.ALLATORIxDEMO(mount);
            return;
        }
        com.xy.a.a.IiiiIiiiiIIII IiiiiiiiIIIII6 = (com.xy.a.a.IiiiIiiiiIIII)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(20);
        if (IiiiiiiiIIIII6 == null) return;
        IiiiiiiiIIIII6.ALLATORIxDEMO(mount);
    }

    /*
     * Unable to fully structure code
     */
    public BaseMeridians iIiIiiiiIIiii(String meridians) {
        if (meridians == null) return null;
        if (meridians.equals("")) {
            return null;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = meridians.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                block7: {
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("99=")) break block7;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl22
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_");
                if (IiiiiiiiIIIII.length != 5 && IiiiiiiiIIIII.length != 3) break block6;
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl34
                do {
                    if (this.meridiansVector.get(IiiiiiiiIIIII).getBh() == 99) {
                        this.meridiansVector.get(IiiiiiiiIIIII).ALLATORIxDEMO(0, IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3), 0.0);
                        break block6;
                    }
                    ++IiiiiiiiIIIII;
lbl22:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.meridiansVector.size());
                IiiiiiiiIIIII = new BaseMeridians(99, 0, 0, IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3), 0.0);
                this.meridiansVector.add(IiiiiiiiIIIII);
                break block6;
                do {
                    if (this.meridiansVector.get(IiiiiiiiIIIII).getBh() == IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = this.meridiansVector.get(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.setExp(Integer.parseInt(IiiiiiiiIIIII[1]));
                        IiiiiiiiIIIII.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII[2]), IiiiiiiiIIIII.length == 5 ? IiiiiiiiIIIII[3] : null, IiiiiiiiIIIII.length == 5 ? Double.parseDouble(IiiiiiiiIIIII[4]) : 0.0);
                        break block6;
                    }
                    ++IiiiiiiiIIIII;
lbl34:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.meridiansVector.size());
                IiiiiiiiIIIII = new BaseMeridians(IiiiiiiiIIIII, Integer.parseInt(IiiiiiiiIIIII[1]), Integer.parseInt(IiiiiiiiIIIII[2]), IiiiiiiiIIIII.length == 5 ? IiiiiiiiIIIII[3] : null, IiiiiiiiIIIII.length == 5 ? Double.parseDouble(IiiiiiiiIIIII[4]) : 0.0);
                this.meridiansVector.add(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public void IIiIIiiiIiIIi() {
        iiIiIiiiIIIiI IiiiiiiiIIIII;
        UseCardBean IiiiiiiiIIIII2;
        BeauBean IiiiiiiiIIIII3;
        GameView IiiiiiiiIIIII4 = this.roleData.getGameView();
        iIiIIiiiIiiiI IiiiiiiiIIIII5 = (iIiIIiiiIiiiI)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(0);
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5.iiiIiiiiiiIIi();
        }
        BeauBean beauBean = IiiiiiiiIIIII3 = (IiiiiiiiIIIII2 = this.roleData.getLimit("\u9753\u53f7")) != null ? IiiiiiiiIIIII2.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII3 == null) {
            IiiiiiiiIIIII4.getFormManagement().iiiIiiiiiiIIi(183);
            IiiiiiiiIIIII4.getFormManagement().iiiIiiiiiiIIi(184);
            IiiiiiiiIIIII4.getFormManagement().iiiIiiiiiiIIi(185);
            return;
        }
        IiIIIiiiIIiII IiiiiiiiIIIII6 = (IiIIIiiiIIiII)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(183);
        if (IiiiiiiiIIIII6 != null) {
            IiiiiiiiIIIII6.iiiIiiiiiiIIi();
        }
        if (IiiiiiiiIIIII3.getLvl() == 1) {
            IiiiiiiiIIIII = (iiIiIiiiIIIiI)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(184);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.iIiIiiiiIIiii();
            }
        } else {
            IiiiiiiiIIIII4.getFormManagement().iiiIiiiiiiIIi(184);
        }
        if ((IiiiiiiiIIIII = (IIIIIiiiIIIiI)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(185)) == null) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii();
    }

    public void IIiiIiiiiIiII() {
        this.isReset = false;
        this.iiiIiiiiiiIIi();
        this.iiiiiiiiIIiii();
        this.IiiIiiiiiiIiI();
        this.ALLATORIxDEMO(null, this.roleData.getPrivateData().getBorn());
        this.ALLATORIxDEMO(this.roleData.getLoginResult().getMeridians());
        this.iIiIiiiiIIiii((Baby)null);
        this.ALLATORIxDEMO();
        this.IIIIIiiiiIIii();
        this.isReset = true;
        this.IIIiiiiiiIIiI();
    }

    public void IIIiiiiiiIIiI() {
        if (!this.isReset) {
            return;
        }
        GameView IiiiiiiiIIIII = this.roleData.getGameView();
        LoginResult IiiiiiiiIIIII2 = this.roleData.getLoginResult();
        int IiiiiiiiIIIII3 = this.getHp();
        int IiiiiiiiIIIII4 = this.getMp();
        if (IiiiiiiiIIIII2.getHp().intValue() == 0) {
            IiiiiiiiIIIII2.setHp(new BigDecimal(IiiiiiiiIIIII3));
            IiiiiiiiIIIII2.setMp(new BigDecimal(IiiiiiiiIIIII4));
        }
        if (IiiiiiiiIIIII2.getHp().intValue() > IiiiiiiiIIIII3) {
            IiiiiiiiIIIII2.setHp(new BigDecimal(IiiiiiiiIIIII3));
        }
        if (IiiiiiiiIIIII2.getMp().intValue() > IiiiiiiiIIIII4) {
            IiiiiiiiIIIII2.setMp(new BigDecimal(IiiiiiiiIIIII4));
        }
        IiiiiiiiIIIII.baseView.IIiIIiiiIiIIi();
        iIiIIiiiIiiiI IiiiiiiiIIIII5 = (iIiIIiiiIiiiI)IiiiiiiiIIIII.getFormManagement().iIiIiiiiIIiii(0);
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5.iiiIiiiiiiIIi();
        }
        this.iIiIiiiiIIiii();
    }

    public void IIIIIiiiiIIii() {
        BaseSkill IiiiiiiiIIIII;
        BaseEquip IiiiiiiiIIIII2;
        BaseLimit IiiiiiiiIIIII3;
        IiiiiiiiiIIII IiiiiiiiIIIII4 = this.roleData.getObjectArea();
        LoginResult IiiiiiiiIIIII5 = this.roleData.getLoginResult();
        BigDecimal[] IiiiiiiiIIIII6 = this.roleData.goodChoses;
        BaseEquip[] IiiiiiiiIIIII7 = new BaseEquip[14];
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII6.length) {
            if (IiiiiiiiIIIII8 != 14) {
                String IiiiiiiiIIIII9;
                Goodstable IiiiiiiiIIIII10 = this.roleData.getGood(IiiiiiiiIIIII6[IiiiiiiiIIIII8]);
                String string = IiiiiiiiIIIII9 = IiiiiiiiIIIII10 != null ? IiiiiiiiIIIII10.getValue() : null;
                if (IiiiiiiiIIIII9 != null && !IiiiiiiiIIIII9.equals("")) {
                    IiiiiiiiIIIII7[IiiiiiiiIIIII8] = new BaseEquip(IiiiiiiiIIIII9, IiiiiiiiIIIII10.getType().longValue(), IiiiiiiiIIIII4, this.roleData);
                    IiiiiiiiIIIII7[IiiiiiiiIIIII8].setQhv(IiiiiiiiIIIII10.getQhv());
                    IiiiiiiiIIIII7[IiiiiiiiIIIII8].setEquipPart(IiiiiiiiIIIII8);
                }
            }
            ++IiiiiiiiIIIII8;
        }
        IiiiiiiiIIIII8 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII5.getGrade());
        int IiiiiiiiIIIII11 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII5.getGrade());
        boolean IiiiiiiiIIIII12 = true;
        block1: while (IiiiiiiiIIIII12) {
            IiiiiiiiIIIII12 = false;
            this.equip.clear();
            this.baseSkills.clear();
            this.suitMap.clear();
            int IiiiiiiiIIIII13 = 0;
            this.qhv = 0;
            int IiiiiiiiIIIII14 = 0;
            while (IiiiiiiiIIIII14 < IiiiiiiiIIIII7.length) {
                if (IiiiiiiiIIIII7[IiiiiiiiIIIII14] != null && (IiiiiiiiIIIII3 = IiiiiiiiIIIII7[IiiiiiiiIIIII14]).getQhv() != null) {
                    ++IiiiiiiiIIIII13;
                    if (this.qhv == 0 || this.qhv > IiiiiiiiIIIII3.getQhv()) {
                        this.qhv = IiiiiiiiIIIII3.getQhv();
                    }
                }
                ++IiiiiiiiIIIII14;
            }
            if (IiiiiiiiIIIII13 == 5 && this.qhv != 0) {
                this.ALLATORIxDEMO("\u56db\u6297\u4e0a\u9650", (double)this.qhv * 0.4);
                this.ALLATORIxDEMO("\u88c5\u5907\u6297\u6027\u4e0a\u9650", (double)this.qhv * 1.5);
                this.ALLATORIxDEMO("HP", (double)(this.qhv * 2000));
                this.ALLATORIxDEMO("MP", (double)(this.qhv * 1000));
            } else {
                this.qhv = 0;
            }
            IiiiiiiiIIIII14 = 0;
            while (IiiiiiiiIIIII14 < IiiiiiiiIIIII7.length) {
                if (IiiiiiiiIIIII7[IiiiiiiiIIIII14] != null) {
                    boolean IiiiiiiiIIIII15 = this.roleData.getGameView().getClient().gameBattle && (IiiiiiiiIIIII7[IiiiiiiiIIIII14].getEquipPart() == 1 || IiiiiiiiIIIII7[IiiiiiiiIIIII14].getEquipPart() == 3);
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII7[IiiiiiiiIIIII14];
                    if (IiiiiiiiIIIII2.getQls() != null) {
                        double IiiiiiiiIIIII16 = 1.0;
                        if (IiiiiiiiIIIII2.getQhv() != null) {
                            IiiiiiiiIIIII16 += BaseEquip.getQHGemXS((int)IiiiiiiiIIIII2.getQhv()) / 100.0;
                        }
                        int IiiiiiiiIIIII17 = IiiiiiiiIIIII2.getQls().size() - 1;
                        while (IiiiiiiiIIIII17 >= 0) {
                            BaseQl IiiiiiiiIIIII18 = (BaseQl)IiiiiiiiIIIII2.getQls().get(IiiiiiiiIIIII17);
                            if (IiiiiiiiIIIII15 && QualityZW.ALLATORIxDEMO((String)IiiiiiiiIIIII18.getKey())) {
                                this.ALLATORIxDEMO(IiiiiiiiIIIII18.getKey(), IiiiiiiiIIIII18.getValue() * IiiiiiiiIIIII16 / 2.0);
                            } else {
                                this.ALLATORIxDEMO(IiiiiiiiIIIII18.getKey(), IiiiiiiiIIIII18.getValue() * IiiiiiiiIIIII16);
                            }
                            --IiiiiiiiIIIII17;
                        }
                    }
                    if (IiiiiiiiIIIII2.getQlews() != null) {
                        int IiiiiiiiIIIII19 = IiiiiiiiIIIII2.getQlews().size() - 1;
                        while (IiiiiiiiIIIII19 >= 0) {
                            IiiiiiiiIIIII = (BaseQl)IiiiiiiiIIIII2.getQlews().get(IiiiiiiiIIIII19);
                            if (IiiiiiiiIIIII15 && QualityZW.ALLATORIxDEMO((String)IiiiiiiiIIIII.getKey())) {
                                this.ALLATORIxDEMO(IiiiiiiiIIIII.getKey(), IiiiiiiiIIIII.getValue() / 2.0);
                            } else {
                                this.ALLATORIxDEMO(IiiiiiiiIIIII.getKey(), IiiiiiiiIIIII.getValue());
                            }
                            --IiiiiiiiIIIII19;
                        }
                    }
                    if (IiiiiiiiIIIII2.getBaseSkills() != null) {
                        int IiiiiiiiIIIII20 = IiiiiiiiIIIII2.getBaseSkills().size() - 1;
                        while (IiiiiiiiIIIII20 >= 0) {
                            this.baseSkills.add((BaseSkill)IiiiiiiiIIIII2.getBaseSkills().get(IiiiiiiiIIIII20--));
                        }
                    }
                    if (IiiiiiiiIIIII2.getBaseSuit() != null) {
                        BaseSuit IiiiiiiiIIIII21 = this.suitMap.get(IiiiiiiiIIIII2.getBaseSuit().getSuitId());
                        if (IiiiiiiiIIIII21 == null) {
                            IiiiiiiiIIIII21 = new BaseSuit(IiiiiiiiIIIII2.getBaseSuit().getSuitId(), IiiiiiiiIIIII2.getBaseSuit().getLvl(), 1);
                            this.suitMap.put(IiiiiiiiIIIII21.getSuitId(), IiiiiiiiIIIII21);
                        } else {
                            IiiiiiiiIIIII21.setSum(IiiiiiiiIIIII21.getSum() + 1);
                            if (IiiiiiiiIIIII21.getLvl() > IiiiiiiiIIIII2.getBaseSuit().getLvl()) {
                                IiiiiiiiIIIII21.setLvl(IiiiiiiiIIIII2.getBaseSuit().getLvl());
                            }
                        }
                    }
                }
                ++IiiiiiiiIIIII14;
            }
            IiiiiiiiIIIII14 = 0;
            while (IiiiiiiiIIIII14 < IiiiiiiiIIIII7.length) {
                if (IiiiiiiiIIIII7[IiiiiiiiIIIII14] != null && (IiiiiiiiIIIII3 = IiiiiiiiIIIII7[IiiiiiiiIIIII14].getBaseLimit()) != null) {
                    if (IiiiiiiiIIIII3.getXs() != -999.0) {
                        if (IiiiiiiiIIIII3.getGg() != 0 && IiiiiiiiIIIII3.getSXValue(0) > this.getBone()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII3.getLx() != 0 && IiiiiiiiIIIII3.getSXValue(1) > this.getSpir()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII3.getLm() != 0 && IiiiiiiiIIIII3.getSXValue(2) > this.getPower()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII3.getMj() != 0 && IiiiiiiiIIIII3.getSXValue(3) > this.getSpeed()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII3.getSw() != 0 && IiiiiiiiIIIII3.getSw() > IiiiiiiiIIIII5.getPrestige().intValue()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                    }
                    if (!IiiiiiiiIIIII3.ALLATORIxDEMO()) {
                        if (IiiiiiiiIIIII8 < IiiiiiiiIIIII3.getZs()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII8 == IiiiiiiiIIIII3.getZs() && IiiiiiiiIIIII11 < IiiiiiiiIIIII3.getLvl()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII8 > IiiiiiiiIIIII3.getZsMax()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                        if (IiiiiiiiIIIII8 == IiiiiiiiIIIII3.getZsMax() && IiiiiiiiIIIII11 > IiiiiiiiIIIII3.getLvlMax()) {
                            IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                            IiiiiiiiIIIII12 = true;
                            continue block1;
                        }
                    }
                    if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII3.getRole()) && IiiiiiiiIIIII3.getRole().indexOf(IiiiiiiiIIIII5.getLocalname()) == -1) {
                        IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                        IiiiiiiiIIIII12 = true;
                        continue block1;
                    }
                    if (IiiiiiiiIIIII3.getSex() != 2 && IiiiIiiiiIiIi.ALLATORIxDEMO((BigDecimal)this.roleData.getLoginResult().getSpecies_id()) != IiiiiiiiIIIII3.getSex()) {
                        IiiiiiiiIIIII7[IiiiiiiiIIIII14] = null;
                        IiiiiiiiIIIII12 = true;
                        continue block1;
                    }
                }
                ++IiiiiiiiIIIII14;
            }
        }
        for (BaseSkill IiiiiiiiIIIII22 : this.baseSkills) {
            if (IiiiiiiiIIIII22.getSkillId() == 8001) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u6df7", (double)(this.getBone() / 50) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8002) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u5c01", (double)(this.getBone() / 50) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8003) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u7761", (double)(this.getBone() / 50) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8004) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u9057\u5fd8", (double)(this.getBone() / 50) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8005) {
                this.ALLATORIxDEMO("\u52a0\u5f3a\u6bd2", (double)(this.getBone() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8006) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u6df7", (double)(this.getSpir() / 30) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8007) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u5c01", (double)(this.getSpir() / 30) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8008) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u7761", (double)(this.getSpir() / 30) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8009) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u9057\u5fd8", (double)(this.getSpir() / 30) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8010) {
                this.ALLATORIxDEMO("\u52a0\u5f3a\u6bd2", (double)(this.getSpir() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8011) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u96f7", (double)(this.getBone() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8012) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u706b", (double)(this.getBone() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8013) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u98ce", (double)(this.getBone() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8014) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u6c34", (double)(this.getBone() / 10) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8015) {
                this.ALLATORIxDEMO("\u5ffd\u89c6\u6297\u9b3c\u706b", (double)(this.getBone() / 20) * 0.1);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8018) {
                this.ALLATORIxDEMO("\u547d\u4e2d\u7387", 15.0);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() == 8019) {
                this.ALLATORIxDEMO("\u547d\u4e2d\u7387", 30.0);
                continue;
            }
            if (IiiiiiiiIIIII22.getSkillId() != 8022) continue;
        }
        for (BaseSuit IiiiiiiiIIIII23 : this.suitMap.values()) {
            IiiiiiiiIIIII3 = this.roleData.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII23.getSuitId());
            BaseEquip baseEquip = IiiiiiiiIIIII2 = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getSuits() : null;
            if (IiiiiiiiIIIII2 == null) continue;
            int IiiiiiiiIIIII24 = 0;
            while (IiiiiiiiIIIII24 < ((BaseSkill[])IiiiiiiiIIIII2).length) {
                String IiiiiiiiIIIII25;
                IiiiiiiiIIIII = IiiiiiiiIIIII2[IiiiiiiiIIIII24];
                if (IiiiiiiiIIIII23.getSum() >= IiiiiiiiIIIII.getLvl() && (IiiiiiiiIIIII25 = BaseSuit.getsuitSkill((int)IiiiiiiiIIIII.getSkillId())) != null) {
                    double IiiiiiiiIIIII26 = BaseSuit.getSuitValue((int)IiiiiiiiIIIII.getSkillId(), (int)IiiiiiiiIIIII23.getLvl());
                    if (IiiiiiiiIIIII25.equals("\u52a0\u5f3a\u6cd5\u672f")) {
                        this.ALLATORIxDEMO("\u52a0\u5f3a\u98ce", IiiiiiiiIIIII26);
                        this.ALLATORIxDEMO("\u52a0\u5f3a\u96f7", IiiiiiiiIIIII26);
                        this.ALLATORIxDEMO("\u52a0\u5f3a\u6c34", IiiiiiiiIIIII26);
                        this.ALLATORIxDEMO("\u52a0\u5f3a\u706b", IiiiiiiiIIIII26);
                        this.ALLATORIxDEMO("\u52a0\u5f3a\u9b3c\u706b", IiiiiiiiIIIII26);
                    } else if (IiiiiiiiIIIII25.equals("\u63d0\u6297\u4e0a\u9650")) {
                        this.ALLATORIxDEMO("\u56db\u6297", -IiiiiiiiIIIII26);
                        this.ALLATORIxDEMO("\u56db\u6297\u4e0a\u9650", IiiiiiiiIIIII26);
                    } else {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII25, IiiiiiiiIIIII26);
                    }
                }
                ++IiiiiiiiIIIII24;
            }
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.roleData.getLoginResult().getResistance())) {
            String[] IiiiiiiiIIIII27 = this.roleData.getLoginResult().getResistance().split("\\|");
            int IiiiiiiiIIIII28 = 0;
            while (IiiiiiiiIIIII28 < IiiiiiiiIIIII27.length) {
                if (IiiiiiiiIIIII27[IiiiiiiiIIIII28].startsWith("X")) {
                    BaseLimit baseLimit = IiiiiiiiIIIII3 = IiiiiiiiIIIII27[IiiiiiiiIIIII28].split("#");
                    baseLimit[0] = baseLimit[0].substring(1);
                    int IiiiiiiiIIIII29 = 0;
                    while (IiiiiiiiIIIII29 < ((BaseLimit)IiiiiiiiIIIII3).length) {
                        String[] IiiiiiiiIIIII30 = IiiiiiiiIIIII3[IiiiiiiiIIIII29].split("=");
                        ++IiiiiiiiIIIII29;
                        this.ALLATORIxDEMO(IiiiiiiiIIIII30[0], QualityZW.getDouble((String)IiiiiiiiIIIII30[1]));
                    }
                }
                ++IiiiiiiiIIIII28;
            }
        }
        this.IIIiiiiiiIIiI();
    }

    public String ALLATORIxDEMO(String[] skills, String yuben) {
        this.born.clear();
        String IiiiiiiiIIIII = RoleGradeBorn.ALLATORIxDEMO((String[])skills, (String)yuben);
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII.equals("")) {
            return IiiiiiiiIIIII;
        }
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (!IiiiiiiiIIIII2[IiiiiiiiIIIII3].startsWith("\u53cc\u5c5e\u6027")) {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
                this.iiiIiiiiiiIIi(IiiiiiiiIIIII4[0], QualityZW.getDouble((String)IiiiiiiiIIIII4[1]));
            }
            ++IiiiiiiiIIIII3;
        }
        this.IIIiiiiiiIIiI();
        return IiiiiiiiIIIII;
    }

    public double ALLATORIxDEMO(String key, double grade, double equip, double born, double additional) {
        double d;
        block7: {
            block5: {
                block8: {
                    block6: {
                        if (key.endsWith("\u4e0a\u9650")) {
                            return grade + equip + born + additional;
                        }
                        if (key.equals("\u6297\u6df7\u4e71") || key.equals("\u6297\u660f\u7761") || key.equals("\u6297\u5c01\u5370") || key.equals("\u6297\u9057\u5fd8") || key.equals("\u6297\u4e2d\u6bd2")) {
                            double d2;
                            double d3;
                            LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
                            double IiiiiiiiIIIII2 = BaseValue.ALLATORIxDEMO((String)key, (BigDecimal)IiiiiiiiIIIII.getRace_id());
                            double IiiiiiiiIIIII3 = grade + equip + born;
                            if (IiiiiiiiIIIII3 > (IiiiiiiiIIIII2 *= 1.0 + this.getValue(String.valueOf(key) + "\u4e0a\u9650") / 100.0)) {
                                d3 = IiiiiiiiIIIII2;
                                d2 = additional;
                            } else {
                                d3 = IiiiiiiiIIIII3;
                                d2 = additional;
                            }
                            return d3 + d2;
                        }
                        if (key.equals("\u6297\u4e09\u5c38\u866b") || key.equals("\u6297\u6bd2\u4f24") || key.equals("\u6297\u7075\u5b9d\u4f24\u5bb3")) break block5;
                        if (!key.equals("\u7269\u7406\u5438\u6536") && !key.startsWith("\u6297") && key.indexOf("\u8eb2\u95ea") == -1) break block6;
                        equip = equip > 75.0 + (double)this.qhv * 1.5 ? 75.0 + (double)this.qhv * 1.5 : equip;
                        d = grade;
                        break block7;
                    }
                    if (!this.roleData.getGameView().getClient().gameBattle) break block8;
                    if (!key.equals("\u8fde\u51fb\u7387") && !key.equals("\u547d\u4e2d\u7387") && !key.equals("\u72c2\u66b4\u7387") && !key.equals("\u81f4\u547d\u7387")) break block5;
                    equip = equip > 75.0 + (double)this.qhv * 1.5 ? 75.0 + (double)this.qhv * 1.5 : equip;
                    d = grade;
                    break block7;
                }
                if (key.equals("\u8fde\u51fb\u7387")) {
                    if (!(grade + equip + born + additional > 75.0)) return grade + equip + born + additional;
                    return 75.0;
                }
            }
            d = grade;
        }
        return d + equip + born + additional;
    }

    public double getBorn(String key) {
        Double IiiiiiiiIIIII = this.born.get(key);
        if (IiiiiiiiIIIII == null) return 0.0;
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        iiIiIiiiiiIIi IiiiiiiiIIIII;
        IIiiIiiiIiiiI IiiiiiiiIIIII2;
        if (pet == null) return;
        if (!this.roleData.ALLATORIxDEMO(pet.getSid())) {
            return;
        }
        RolePet IiiiiiiiIIIII3 = this.roleData.getRolePet(pet.getSid().longValue());
        GameView IiiiiiiiIIIII4 = this.roleData.getGameView();
        iiIiIiiiiIiii IiiiiiiiIIIII5 = (iiIiIiiiiIiii)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(6);
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII3);
        } else {
            IiiIiiiiIIIii IiiiiiiiIIIII6;
            IiiiiiiiIIIII2 = (IIiiIiiiIiiiI)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(18);
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII2.ALLATORIxDEMO(pet);
            }
            if ((IiiiiiiiIIIII = (iiIiIiiiiiIIi)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(67)) != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(pet);
            }
            if ((IiiiiiiiIIIII6 = (IiiIiiiiIIIii)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(47)) != null) {
                IiiiiiiiIIIII6.ALLATORIxDEMO(pet);
            }
        }
        IiiiiiiiIIIII2 = (IIIiiiiiiiiIi)IiiiiiiiIIIII4.getFormManagement().iIiIiiiiIIiii(8);
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.ALLATORIxDEMO(1, pet.getSid())) {
            IiiiiiiiIIIII2.ALLATORIxDEMO(PropertyUtil.getPetQl((RoleSummoning)pet, (RoleData)this.roleData), 1, pet.getSid());
        }
        IiiiiiiiIIIII = pet != null ? PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.roleData) : null;
        IiiiiiiiIIIII4.baseView.ALLATORIxDEMO((int[])IiiiiiiiIIIII, pet);
    }

    public double getAdditional(String key) {
        Double IiiiiiiiIIIII = this.additional.get(key);
        if (IiiiiiiiIIIII == null) return 0.0;
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi(String key, double value) {
        QualityZW.ALLATORIxDEMO((String)key, (double)value, this.grade);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void iiiiiiiiIIiii() {
        block12: {
            int n;
            int n2;
            int IiiiiiiiIIIII;
            int IiiiiiiiIIIII2;
            int IiiiiiiiIIIII3;
            this.sm1 = 0;
            this.sm2 = 0;
            this.sld1 = 0;
            this.sld2 = 0;
            String[] IiiiiiiiIIIII4 = this.roleData.getPrivateData().getSkill("N");
            if (IiiiiiiiIIIII4 == null) {
                return;
            }
            try {
                int IiiiiiiiIIIII5 = 0;
                RoleProperty roleProperty = this;
                int IiiiiiiiIIIII6 = ExpUtil.getTSP((int)this.roleData.getLoginResult().getExtraPointInt("T"));
                IiiiiiiiIIIII3 = 0;
                IiiiiiiiIIIII2 = SkillUtil.getSepciesIndex((BigDecimal)this.roleData.getLoginResult().getSpecies_id());
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII4[0]);
                n2 = IiiiiiiiIIIII2;
                n = IiiiiiiiIIIII == 2 ? 1 : 0;
            }
            catch (Exception IiiiiiiiIIIII7) {
                this.sm1 = 0;
                this.sm2 = 0;
                this.sld1 = 0;
                this.sld2 = 0;
                IiiiiiiiIIIII7.printStackTrace();
                break block12;
            }
            {
                roleProperty.sm1 = SkillUtil.getSmIndex((int)n2, (int)n);
                this.sm2 = SkillUtil.getSmIndex((int)IiiiiiiiIIIII2, (int)(IiiiiiiiIIIII == 0 ? 1 : 2));
                long IiiiiiiiIIIII8 = IiiiiiiiIIIII2;
                long IiiiiiiiIIIII9 = 0x100000000L | (long)this.sm1;
                long IiiiiiiiIIIII10 = 0x100000000L | (long)this.sm2;
                long IiiiiiiiIIIII11 = 0x200000000L | (long)(this.sm2 > this.sm1 ? this.sm2 << 8 | this.sm1 : this.sm1 << 8 | this.sm2);
                int IiiiiiiiIIIII12 = 1;
                int IiiiiiiiIIIII13 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.length : 0;
                while (IiiiiiiiIIIII12 < IiiiiiiiIIIII13) {
                    IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII4[IiiiiiiiIIIII12]);
                    int IiiiiiiiIIIII14 = IiiiiiiiIIIII3 >> 9 & 7;
                    int IiiiiiiiIIIII15 = IiiiiiiiIIIII3 >> 6 & 7;
                    int IiiiiiiiIIIII16 = IiiiiiiiIIIII3 >> 3 & 7;
                    int IiiiiiiiIIIII17 = IiiiiiiiIIIII3 & 7;
                    if (IiiiiiiiIIIII17 > 5) {
                        IiiiiiiiIIIII17 = 5;
                    }
                    IiiiiiiiIIIII5 += IiiiiiiiIIIII17;
                    if ((IiiiiiiiIIIII6 -= IiiiiiiiIIIII17) < 0) {
                        this.sm1 = 0;
                        this.sm2 = 0;
                        this.sld1 = 0;
                        this.sld2 = 0;
                        return;
                    }
                    long IiiiiiiiIIIII18 = IiiiiiiiIIIII14 == 0 ? IiiiiiiiIIIII8 : (IiiiiiiiIIIII14 == 1 ? IiiiiiiiIIIII9 : (IiiiiiiiIIIII14 == 2 ? IiiiiiiiIIIII10 : IiiiiiiiIIIII11));
                    IiiiiiiiIIIII18 |= (long)(IiiiiiiiIIIII15 << 16);
                    IiiiiiiiIIIII18 |= (long)(IiiiiiiiIIIII16 << 24);
                    if (IiiiiiiiIIIII14 == 1) {
                        this.sld1 += IiiiiiiiIIIII17 * 2;
                    } else if (IiiiiiiiIIIII14 == 2) {
                        this.sld2 += IiiiiiiiIIIII17 * 2;
                    } else if (IiiiiiiiIIIII14 != 0) {
                        this.sld1 += IiiiiiiiIIIII17;
                        this.sld2 += IiiiiiiiIIIII17;
                    }
                    ++IiiiiiiiIIIII12;
                }
            }
        }
        System.out.println(String.valueOf(this.sm1) + ":" + this.sm2 + ":" + this.sld1 + ":" + this.sld2);
    }

    public void ALLATORIxDEMO(int id, int lvl) {
        if (id == 9001) {
            this.iIiIiiiiIIiii("MP", lvl * 2000);
            return;
        }
        if (id == 9002) {
            this.iIiIiiiiIIiii("HP", lvl * 4000);
            return;
        }
        if (id == 9003) {
            this.iIiIiiiiIIiii("HP", lvl * 1000);
            return;
        }
        if (id == 9004) {
            this.iIiIiiiiIIiii("\u6839\u9aa8", lvl);
            return;
        }
        if (id == 9005) {
            this.iIiIiiiiIIiii("\u529b\u91cf", lvl);
            return;
        }
        if (id == 9006) {
            this.iIiIiiiiIIiii("AP", lvl * 100);
            return;
        }
        if (id == 9007) {
            this.iIiIiiiiIIiii("SP", lvl);
            return;
        }
        if (id == 9008) {
            this.iIiIiiiiIIiii("\u6297\u98ce", lvl);
            return;
        }
        if (id == 9009) {
            this.iIiIiiiiIIiii("\u6297\u706b", lvl);
            return;
        }
        if (id == 9010) {
            this.iIiIiiiiIIiii("\u6297\u6c34", lvl);
            return;
        }
        if (id == 9011) {
            this.iIiIiiiiIIiii("\u6297\u96f7", lvl);
            return;
        }
        if (id == 9012) {
            this.iIiIiiiiIIiii("\u6297\u9b3c\u706b", lvl);
            return;
        }
        if (id == 9013) {
            this.iIiIiiiiIIiii("\u6297\u4e09\u5c38", lvl * 100);
            return;
        }
        if (id == 9014) {
            this.iIiIiiiiIIiii("\u6297\u53cd\u9707", lvl * 500);
            return;
        }
        if (id == 9015) {
            this.iIiIiiiiIIiii("\u98ce\u6cd5\u72c2\u66b4", lvl);
            return;
        }
        if (id == 9016) {
            this.iIiIiiiiIIiii("\u706b\u6cd5\u72c2\u66b4", lvl);
            return;
        }
        if (id == 9017) {
            this.iIiIiiiiIIiii("\u6c34\u6cd5\u72c2\u66b4", lvl);
            return;
        }
        if (id == 9018) {
            this.iIiIiiiiIIiii("\u9b3c\u706b\u4f24\u5bb3", lvl * 100);
            return;
        }
        if (id == 9019) {
            this.iIiIiiiiIIiii("\u5f3a\u529b\u514b\u91d1", lvl);
            return;
        }
        if (id == 9020) {
            this.iIiIiiiiIIiii("\u5f3a\u529b\u514b\u6728", lvl);
            return;
        }
        if (id == 9021) {
            this.iIiIiiiiIIiii("\u5f3a\u529b\u514b\u706b", lvl);
            return;
        }
        if (id == 9022) {
            this.iIiIiiiiIIiii("\u5f3a\u529b\u514b\u571f", lvl);
            return;
        }
        if (id == 9023) {
            this.iIiIiiiiIIiii("\u7269\u7406\u5438\u6536", lvl);
            return;
        }
        if (id == 9024) {
            this.iIiIiiiiIIiii("\u8eb2\u95ea\u7387", lvl);
            return;
        }
        if (id == 9025) {
            this.iIiIiiiiIIiii("\u5f3a\u9707\u6151", lvl);
            return;
        }
        if (id == 9026) {
            this.iIiIiiiiIIiii("\u53cd\u51fb\u7387", lvl);
            return;
        }
        if (id == 9027) {
            this.iIiIiiiiIIiii("\u53cd\u51fb\u6b21\u6570", lvl);
            return;
        }
        if (id == 9028) {
            this.iIiIiiiiIIiii("\u72c2\u66b4\u7387", lvl);
            return;
        }
        if (id == 9029) {
            this.iIiIiiiiIIiii("\u53cd\u9707\u7387", lvl);
            return;
        }
        if (id == 9030) {
            this.iIiIiiiiIIiii("\u654f\u6377", lvl);
            return;
        }
        if (id == 9031) {
            this.iIiIiiiiIIiii("\u6062\u590d\u6c14\u8840", lvl * 400);
            return;
        }
        if (id == 9113) {
            this.iIiIiiiiIIiii("\u9644\u52a0\u6df7\u4e71\u653b\u51fb", lvl);
            return;
        }
        if (id != 9114) return;
        this.iIiIiiiiIIiii("\u9644\u52a0\u5c01\u5370\u653b\u51fb", lvl);
    }

    public int getCdz() {
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        return BaseValue.getRoleValue((BigDecimal)IiiiiiiiIIIII.getRace_id(), (int)this.getCalm(), (int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (int)4);
    }

    public void iiiIiiiiiiIIi(String key, double value) {
        QualityZW.ALLATORIxDEMO((String)key, (double)value, this.born);
    }

    public void IiiIiiiiiiIiI() {
        this.grade.clear();
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade());
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade());
        if (IiiiiiiiIIIII3 > 4 || IiiiiiiiIIIII2 > 200) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
            return;
        }
        String[] IiiiiiiiIIIII4 = RoleGradeBorn.getGradeKX().ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII.getRace_id()).split("\\|");
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4[IiiiiiiiIIIII5].split("=");
            ++IiiiiiiiIIIII5;
            this.iIiIiiiiIIiIi(IiiiiiiiIIIII6[0], Double.parseDouble(IiiiiiiiIIIII6[1]));
        }
        if (IiiiiiiiIIIII3 == 4) {
            IiiiiiiiIIIII2 -= 140;
            IiiiiiiiIIIII2 /= 10;
            if (IiiiiiiiIIIII.getRace_id().intValue() == 10001) {
                this.iIiIiiiiIIiIi("\u56db\u6297\u4e0a\u9650", (double)IiiiiiiiIIIII2 * 1.2);
            } else if (IiiiiiiiIIIII.getRace_id().intValue() == 10002) {
                this.iIiIiiiiIIiIi("\u56db\u6297\u4e0a\u9650", (double)IiiiiiiiIIIII2 * 1.1);
            } else if (IiiiiiiiIIIII.getRace_id().intValue() == 10003) {
                this.iIiIiiiiIIiIi("\u56db\u6297\u4e0a\u9650", (double)IiiiiiiiIIIII2 * 1.0);
            } else if (IiiiiiiiIIIII.getRace_id().intValue() == 10004) {
                this.iIiIiiiiIIiIi("\u56db\u6297\u4e0a\u9650", (double)IiiiiiiiIIIII2 * 0.9);
            }
        }
        this.IIIiiiiiiIIiI();
    }

    public int getAp() {
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = BaseValue.getRoleValue((BigDecimal)IiiiiiiiIIIII.getRace_id(), (int)this.getPower(), (int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (int)2);
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("ap"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("AP"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u653b\u51fb"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u52a0\u653b\u51fb"));
        double IiiiiiiiIIIII3 = 1.0;
        IiiiiiiiIIIII3 += this.ap;
        IiiiiiiiIIIII3 += this.getValue("AP\u6210\u957f");
        IiiiiiiiIIIII3 += this.getValue("\u52a0\u5f3a\u653b\u51fb") / 125.0;
        if (this.roleData.getGameView().getClient().gameBattle) {
            double IiiiiiiiIIIII4 = this.getValue("\u57fa\u7840\u653b\u51fb");
            double IiiiiiiiIIIII5 = this.getValue("\u52a0\u6210\u653b\u51fb");
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + (IiiiiiiiIIIII4 *= 1.0 + IiiiiiiiIIIII5 / 100.0));
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u9644\u52a0\u653b\u51fb"));
        } else {
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u57fa\u7840\u653b\u51fb"));
            IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u9644\u52a0\u653b\u51fb"));
            IiiiiiiiIIIII3 += this.getValue("\u52a0\u6210\u653b\u51fb") / 125.0;
        }
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * IiiiiiiiIIIII3);
        return IiiiiiiiIIIII2;
    }

    public void iIiIiiiiIIiii(String key, double value) {
        QualityZW.ALLATORIxDEMO((String)key, (double)value, this.additional);
    }

    public void iIiIiiiiIIiIi() {
        if (!this.isReset) {
            return;
        }
        iIiIIiiiIiiiI IiiiiiiiIIIII = (iIiIIiiiIiiiI)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(0);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.iiiIiiiiiiIIi();
    }

    public void iiiIiiiiiiIIi() {
        this.quality = new Ql();
        this.grade = new HashMap<String, Double>();
        this.born = new HashMap<String, Double>();
        this.equip = new HashMap<String, Double>();
        this.additional = new HashMap<String, Double>();
        this.meridiansVector = new Vector();
        this.baseSkills = new ArrayList<BaseSkill>();
        this.suitMap = new HashMap<Integer, BaseSuit>();
        this.hp = 0.0;
        this.mp = 0.0;
        this.ap = 0.0;
    }

    public void ALLATORIxDEMO(String kang, boolean is) {
        String[] IiiiiiiiIIIII = kang.split("=");
        double IiiiiiiiIIIII2 = Double.parseDouble(IiiiiiiiIIIII[1]);
        if (!IiiiiiiiIIIII[0].startsWith("\u6297") || IiiiiiiiIIIII2 > 10.1) {
            IiIiIiiiiiIiI.ALLATORIxDEMO();
            return;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], is ? IiiiiiiiIIIII2 : -IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii();
    }

    public int getHp() {
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = BaseValue.getRoleValue((BigDecimal)IiiiiiiiIIIII.getRace_id(), (int)this.getBone(), (int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (int)0);
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("hp"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("HP"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u52a0\u6c14\u8840"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u9644\u52a0\u6c14\u8840"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * (this.getValue("HP\u6210\u957f") + this.hp + 1.0));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * (this.getValue("\u52a0\u5f3a\u6c14\u8840") / 100.0 + 1.0));
        return IiiiiiiiIIIII2;
    }

    public void iIiIiiiiIIiii(Baby baby) {
        this.hp = 0.0;
        this.mp = 0.0;
        this.ap = 0.0;
        if (baby == null || IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)baby.getTalents())) {
            this.IIIiiiiiiIIiI();
            return;
        }
        String[] IiiiiiiiIIIII = baby.getTalents().split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=")[0]);
            if (IiiiiiiiIIIII3 == 1) {
                this.ap = 0.01;
            } else if (IiiiiiiiIIIII3 == 2) {
                this.hp = 0.01;
            } else if (IiiiiiiiIIIII3 == 3) {
                this.mp = 0.01;
            }
            ++IiiiiiiiIIIII2;
        }
        this.IIIiiiiiiIIiI();
    }

    public int getMp() {
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = BaseValue.getRoleValue((BigDecimal)IiiiiiiiIIIII.getRace_id(), (int)this.getSpir(), (int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (int)1);
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("mp"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("MP"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u52a0\u9b54\u6cd5"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u9644\u52a0\u9b54\u6cd5"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * (this.getValue("\u52a0\u5f3a\u9b54\u6cd5") / 100.0 + this.getValue("MP\u6210\u957f") + this.mp + 1.0));
        return IiiiiiiiIIIII2;
    }

    /*
     * Unable to fully structure code
     */
    public BaseMeridians ALLATORIxDEMO(String meridians) {
        if (meridians == null) return null;
        if (meridians.equals("")) {
            return null;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = meridians.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                block7: {
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("99=")) break block7;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl22
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_");
                if (IiiiiiiiIIIII.length != 5 && IiiiiiiiIIIII.length != 3) break block6;
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl34
                do {
                    if (this.meridiansVector.get(IiiiiiiiIIIII).getBh() == 99) {
                        this.meridiansVector.get(IiiiiiiiIIIII).ALLATORIxDEMO(0, IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3), 0.0);
                        break block6;
                    }
                    ++IiiiiiiiIIIII;
lbl22:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.meridiansVector.size());
                IiiiiiiiIIIII = new BaseMeridians(99, 0, 0, IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3), 0.0);
                this.meridiansVector.add(IiiiiiiiIIIII);
                break block6;
                do {
                    if (this.meridiansVector.get(IiiiiiiiIIIII).getBh() == IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = this.meridiansVector.get(IiiiiiiiIIIII);
                        IiiiiiiiIIIII.setExp(Integer.parseInt(IiiiiiiiIIIII[1]));
                        IiiiiiiiIIIII.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII[2]), IiiiiiiiIIIII.length == 5 ? IiiiiiiiIIIII[3] : null, IiiiiiiiIIIII.length == 5 ? Double.parseDouble(IiiiiiiiIIIII[4]) : 0.0);
                        break block6;
                    }
                    ++IiiiiiiiIIIII;
lbl34:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.meridiansVector.size());
                IiiiiiiiIIIII = new BaseMeridians(IiiiiiiiIIIII, Integer.parseInt(IiiiiiiiIIIII[1]), Integer.parseInt(IiiiiiiiIIIII[2]), IiiiiiiiIIIII.length == 5 ? IiiiiiiiIIIII[3] : null, IiiiiiiiIIIII.length == 5 ? Double.parseDouble(IiiiiiiiIIIII[4]) : 0.0);
                this.meridiansVector.add(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public double getValue(String string) {
        void key;
        return this.ALLATORIxDEMO((String)key, this.getGrade((String)key), this.getEquip((String)key), this.getBorn((String)key), this.getAdditional((String)key));
    }

    public void ALLATORIxDEMO(Pal pal) {
        if (pal == null) return;
        if (!this.roleData.iIiIiiiiIIiii(pal.getId())) {
            return;
        }
        iiIiIiiiiIiIi IiiiiiiiIIIII = (iiIiIiiiiIiIi)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(105);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii(pal.getpId());
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        if (lingbao == null) return;
        if (!this.roleData.iIiIiiiiIIiIi(lingbao.getBaoid())) {
            return;
        }
        iiiIIiiiIIIii IiiiiiiiIIIII = (iiiIIiiiIIIii)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(43);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(lingbao);
    }

    public double getEquip(String key) {
        Double IiiiiiiiIIIII = this.equip.get(key);
        if (IiiiiiiiIIIII == null) return 0.0;
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii() {
        if (!this.isReset) {
            return;
        }
        IIIiiiiiiiiIi IiiiiiiiIIIII = (IIIiiiiiiiiIi)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(8);
        if (IiiiiiiiIIIII == null) return;
        if (!IiiiiiiiIIIII.ALLATORIxDEMO(0, null)) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(this.getQuality(), 0, null);
    }

    public void ALLATORIxDEMO(Baby baby) {
        if (baby == null) return;
        if (!this.roleData.IiiIiiiiiiIiI(baby.getBabyid())) {
            return;
        }
        iIIIiiiiIiiII IiiiiiiiIIIII = (iIIIiiiiIiiII)this.roleData.getGameView().getFormManagement().iIiIiiiiIIiii(1);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(baby);
    }

    public int getSpir() {
        return (int)((double)this.roleData.getLoginResult().getSpir().intValue() + this.getValue("\u7075\u6027"));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO() {
        block24: {
            block23: {
                this.additional.clear();
                IiiiiiiiIIIII = this.roleData.lingbaoChoses;
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = this.roleData.getLingbao(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    if (IiiiiiiiIIIII != null) {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII.getKangxing(), true);
                    }
                    ++IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < 8) {
                    IiiiiiiiIIIII = this.roleData.getLimit(IiiiiiiiIIIII == 0 ? "\u53d8\u8eab\u5361" : (IiiiiiiiIIIII == 1 ? "\u5f3a\u6cd5\u578b" : (IiiiiiiiIIIII == 2 ? "\u52a0\u6297\u578b" : (IiiiiiiiIIIII == 3 ? "\u589e\u76ca\u578b" : (IiiiiiiiIIIII == 4 ? "VIP" : (IiiiiiiiIIIII == 5 ? "\u5e2e\u6d3e" : (IiiiiiiiIIIII == 6 ? "\u5355\u4eba\u7ade\u6280\u573a" : (IiiiiiiiIIIII == 7 ? "\u56de\u84dd\u7b26" : ""))))))));
                    if (!(IiiiiiiiIIIII == null || IiiiiiiiIIIII == 7 && IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)IiiiiiiiIIIII.getValue()))) {
                        IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.getQls();
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII /* !! */ .length) {
                            if (IiiiiiiiIIIII /* !! */ [IiiiiiiiIIIII] != null) {
                                this.iIiIiiiiIIiii(IiiiiiiiIIIII /* !! */ [IiiiiiiiIIIII].getKey(), IiiiiiiiIIIII /* !! */ [IiiiiiiiIIIII].getValue());
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
                if (!this.roleData.getGameView().getClient().gameNewTyc) break block23;
                IiiiiiiiIIIII = this.roleData.getPrivateData().getSkill("N");
                if (IiiiiiiiIIIII == null) break block24;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = SkillUtil.getSepciesIndex((BigDecimal)this.roleData.getLoginResult().getSpecies_id());
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII = SkillUtil.getSmIndex((int)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII == 2 ? 1 : 0));
                IiiiiiiiIIIII = SkillUtil.getSmIndex((int)IiiiiiiiIIIII, (int)(IiiiiiiiIIIII == 0 ? 1 : 2));
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                IiiiiiiiIIIII = 0x100000000L | (long)IiiiiiiiIIIII;
                IiiiiiiiIIIII = 0x100000000L | (long)IiiiiiiiIIIII;
                IiiiiiiiIIIII = 0x200000000L | (long)(IiiiiiiiIIIII > IiiiiiiiIIIII ? IiiiiiiiIIIII << 8 | IiiiiiiiIIIII : IiiiiiiiIIIII << 8 | IiiiiiiiIIIII);
                IiiiiiiiIIIII = 1;
                IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.length : 0;
                if (true) ** GOTO lbl57
            }
            IiiiiiiiIIIII = this.roleData.getPrivateData().getSkill("T");
            if (IiiiiiiiIIIII == null) break block24;
            IiiiiiiiIIIII = 1;
            if (true) ** GOTO lbl69
            do {
                IiiiiiiiIIIII = Integer.parseInt((String)IiiiiiiiIIIII[IiiiiiiiIIIII]);
                IiiiiiiiIIIII = IiiiiiiiIIIII >> 9 & 7;
                IiiiiiiiIIIII = IiiiiiiiIIIII >> 6 & 7;
                IiiiiiiiIIIII = IiiiiiiiIIIII >> 3 & 7;
                IiiiiiiiIIIII = this.roleData.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII == 0 ? IiiiiiiiIIIII : (IiiiiiiiIIIII == 1 ? IiiiiiiiIIIII : (IiiiiiiiIIIII == 2 ? IiiiiiiiIIIII : IiiiiiiiIIIII)));
                IiiiiiiiIIIII = null;
                for (TYCModel IiiiiiiiIIIII : IiiiiiiiIIIII) {
                    if (IiiiiiiiIIIII.getLvl() != IiiiiiiiIIIII || IiiiiiiiIIIII.getIndex() != IiiiiiiiIIIII) continue;
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                    break;
                }
                if (IiiiiiiiIIIII != null && (IiiiiiiiIIIII.getSkillId() <= 9100 || IiiiiiiiIIIII.getSkillId() == 9113 || IiiiiiiiIIIII.getSkillId() == 9114)) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII.getSkillId(), IiiiiiiiIIIII & 7);
                }
                ++IiiiiiiiIIIII;
lbl57:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            break block24;
            do {
                IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_");
                IiiiiiiiIIIII = Integer.parseInt((String)IiiiiiiiIIIII /* !! */ [0]);
                IiiiiiiiIIIII = Integer.parseInt((String)IiiiiiiiIIIII /* !! */ [1]);
                if (IiiiiiiiIIIII <= 9100 || IiiiiiiiIIIII == 9113 || IiiiiiiiIIIII == 9114) {
                    if (IiiiiiiiIIIII > 5) {
                        IiIiIiiiiiIiI.ALLATORIxDEMO();
                        return;
                    }
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl69:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.roleData.getLoginResult().getTitle()) && (IiiiiiiiIIIII = this.roleData.getObjectArea().ALLATORIxDEMO(this.roleData.getLoginResult().getTitle())) != null && IiiiiiiiIIIII.getValue() != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                if (IiiiiiiiIIIII.length > 1) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], QualityZW.getDouble((String)IiiiiiiiIIIII[1]));
                }
                ++IiiiiiiiIIIII;
            }
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.meridiansVector.size()) {
            IiiiiiiiIIIII = this.meridiansVector.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII.getBh() != 0 && IiiiiiiiIIIII.getBh() != 99) {
                if (IiiiiiiiIIIII.getKey().equals("\u6297\u4ed9\u6cd5")) {
                    this.iIiIiiiiIIiii("\u6297\u98ce", IiiiiiiiIIIII.getKeyValue());
                    this.iIiIiiiiIIiii("\u6297\u706b", IiiiiiiiIIIII.getKeyValue());
                    this.iIiIiiiiIIiii("\u6297\u6c34", IiiiiiiiIIIII.getKeyValue());
                    this.iIiIiiiiIIiii("\u6297\u96f7", IiiiiiiiIIIII.getKeyValue());
                } else {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII.getKey(), IiiiiiiiIIIII.getKeyValue());
                }
            }
            ++IiiiiiiiIIIII;
        }
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.roleData.getLoginResult().getResistance())) {
            IiiiiiiiIIIII = this.roleData.getLoginResult().getResistance().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("D")) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("#");
                    IiiiiiiiIIIII[0] = IiiiiiiiIIIII[0].substring(1);
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                        ++IiiiiiiiIIIII;
                        this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], QualityZW.getDouble((String)IiiiiiiiIIIII[1]));
                    }
                }
                ++IiiiiiiiIIIII;
            }
        }
        this.IIIiiiiiiIIiI();
    }

    public int getCalm() {
        return (int)((double)this.roleData.getLoginResult().getCalm().intValue() + this.getValue("\u5b9a\u529b"));
    }

    public double getGrade(String key) {
        Double IiiiiiiiIIIII = this.grade.get(key);
        if (IiiiiiiiIIIII == null) return 0.0;
        return IiiiiiiiIIIII;
    }

    public int getSpeed() {
        return (int)((double)this.roleData.getLoginResult().getSpeed().intValue() + this.getValue("\u654f\u6377"));
    }

    public void ALLATORIxDEMO(String key, double value) {
        QualityZW.ALLATORIxDEMO((String)key, (double)value, this.equip);
    }

    public int getPower() {
        return (int)((double)this.roleData.getLoginResult().getPower().intValue() + this.getValue("\u529b\u91cf"));
    }

    public int getBone() {
        return (int)((double)this.roleData.getLoginResult().getBone().intValue() + this.getValue("\u6839\u9aa8"));
    }

    public Ql getQuality() {
        this.quality.ALLATORIxDEMO();
        List<String> IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            QualityZW.iIiIiiiiIIiii((Ql)this.quality, (String)IiiiiiiiIIIII.get(++IiiiiiiiIIIII2), (double)this.getValue(IiiiiiiiIIIII.get(IiiiiiiiIIIII2)));
        }
        if (IiiiiiiiIIIII.contains("\u6c34\u9b54\u9644\u8eab") && (IiiiiiiiIIIII = this.getValue("\u6c34\u9b54\u9644\u8eab")) > 0.0) {
            this.quality.setRolewxj(0.0);
            this.quality.setRolewxm(0.0);
            this.quality.setRolewxh(0.0);
            this.quality.setRolewxt(0.0);
            this.quality.setRolewxs(100.0);
            this.quality.setRolewxqkh(this.quality.getRolewxqkh() + IiiiiiiiIIIII * 20.0);
        }
        if (!IiiiiiiiIIIII.contains("\u4e94\u884c\u5f52\u4e00")) return this.quality;
        this.quality.iiiIiiiiiiIIi(this.getValue("\u4e94\u884c\u5f52\u4e00"));
        return this.quality;
    }

    public BaseMeridians getMeridians(int bh) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.meridiansVector.size()) {
            if (this.meridiansVector.get(IiiiiiiiIIIII).getBh() == bh) {
                return this.meridiansVector.get(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public int getSp() {
        LoginResult IiiiiiiiIIIII = this.roleData.getLoginResult();
        int IiiiiiiiIIIII2 = BaseValue.getRoleValue((BigDecimal)IiiiiiiiIIIII.getRace_id(), (int)this.getSpeed(), (int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (int)3);
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("sp"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("SP"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u901f\u5ea6"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u52a0\u901f\u5ea6"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 + this.getValue("\u9644\u52a0\u901f\u5ea6"));
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * (this.getValue("\u52a0\u5f3a\u901f\u5ea6") / 100.0 + this.getValue("SP\u6210\u957f") + 1.0));
        return IiiiiiiiIIIII2;
    }

    public List<String> ALLATORIxDEMO() {
        ArrayList<String> IiiiiiiiIIIII = new ArrayList<String>();
        for (Map.Entry<String, Double> IiiiiiiiIIIII2 : this.born.entrySet()) {
            if (IiiiiiiiIIIII.contains(IiiiiiiiIIIII2.getKey())) continue;
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getKey());
        }
        for (Map.Entry<String, Double> IiiiiiiiIIIII2 : this.grade.entrySet()) {
            if (IiiiiiiiIIIII.contains(IiiiiiiiIIIII2.getKey())) continue;
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getKey());
        }
        for (Map.Entry<String, Double> IiiiiiiiIIIII2 : this.equip.entrySet()) {
            if (IiiiiiiiIIIII.contains(IiiiiiiiIIIII2.getKey())) continue;
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getKey());
        }
        for (Map.Entry<String, Double> IiiiiiiiIIIII2 : this.additional.entrySet()) {
            if (IiiiiiiiIIIII.contains(IiiiiiiiIIIII2.getKey())) continue;
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getKey());
        }
        return IiiiiiiiIIIII;
    }

    public int getSuitSum(String key) {
        int IiiiiiiiIIIII = Integer.parseInt(key);
        BaseSuit IiiiiiiiIIIII2 = this.suitMap.get(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII2 == null) return 0;
        return IiiiiiiiIIIII2.getSum();
    }
}
