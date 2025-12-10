/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseGemOld
 *  com.xy.formula.BaseLimit
 *  com.xy.formula.BaseQl
 *  com.xy.formula.BaseSkill
 *  com.xy.formula.BaseStar
 *  com.xy.formula.BaseSuit
 *  com.xy.formula.BaseValue
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.formula.BaseGemOld;
import com.xy.formula.BaseLimit;
import com.xy.formula.BaseQl;
import com.xy.formula.BaseSkill;
import com.xy.formula.BaseStar;
import com.xy.formula.BaseSuit;
import com.xy.formula.BaseValue;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.v.IiiiiiiiiIIII;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BaseEquip {
    String GL3 = "\u54c1\u8d28=";
    private List<BaseQl> qlews;
    private BaseSuit baseSuit;
    private BaseStar baseStar;
    private List<BaseQl> qls;
    String GL1 = "\u5957\u88c5\u54c1\u8d28=";
    private List<BaseSkill> baseSkills;
    private BaseLimit baseLimit;
    private static String[] BaseLimits = new String[]{"\u529b\u91cf\u8981\u6c42", "\u7075\u6027\u8981\u6c42", "\u6839\u9aa8\u8981\u6c42", "\u654f\u6377\u8981\u6c42", "\u5c5e\u6027\u9700\u6c42", "\u88c5\u5907\u89d2\u8272", "\u7b49\u7ea7\u8981\u6c42", "\u6700\u9ad8\u643a\u5e26\u7b49\u7ea7", "\u6027\u522b", "\u58f0\u671b\u8981\u6c42"};
    private Integer NJ;
    String GL2 = "\u57f9\u517b=";
    private Integer qhv;
    private int equipPart = -1;

    public BaseLimit getBaseLimit() {
        return this.baseLimit;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String[] vs, IiiiiiiiiIIII objectArea, RoleData roleData) {
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < vs.length) {
            block33: {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                block28: {
                                    block27: {
                                        block26: {
                                            if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block26;
                                            IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                                            IiiiiiiiIIIII = 1;
                                            if (true) ** GOTO lbl64
                                        }
                                        if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[1])) break block27;
                                        IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                                        IiiiiiiiIIIII = 2;
                                        if (true) ** GOTO lbl68
                                    }
                                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[2])) break block28;
                                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                                    IiiiiiiiIIIII = 1;
                                    if (true) ** GOTO lbl72
                                }
                                if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[3])) break block29;
                                IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                                IiiiiiiiIIIII = 4;
                                if (true) ** GOTO lbl76
                            }
                            if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[4])) break block30;
                            IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                            IiiiiiiiIIIII = 1;
                            if (true) ** GOTO lbl87
                        }
                        if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[8])) break block31;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII = 4;
                        if (true) ** GOTO lbl101
                    }
                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[9])) break block32;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl123
                }
                if (!(vs[IiiiiiiiIIIII].startsWith(this.GL1) || vs[IiiiiiiiIIIII].startsWith(this.GL2) || vs[IiiiiiiiIIIII].startsWith(this.GL3))) {
                    this.iIiIiiiiIIiii(vs[IiiiiiiiIIIII]);
                }
                break block33;
                do {
                    block35: {
                        block34: {
                            if (!(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u7279\u6280")) break block34;
                            IiiiiiiiIIIII = 1;
                            if (true) ** GOTO lbl61
                        }
                        if (IiiiiiiiIIIII.length == 2) {
                            this.ALLATORIxDEMO(IiiiiiiiIIIII[0], BaseEquip.getDouble(IiiiiiiiIIIII[1]));
                        }
                        break block35;
                        do {
                            if ((IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null) {
                                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                                if (IiiiiiiiIIIII == 8016 || IiiiiiiiIIIII == 8017) {
                                    this.ALLATORIxDEMO(IiiiiiiiIIIII, null);
                                } else {
                                    IiiiiiiiIIIII = new BaseSkill(IiiiiiiiIIIII, 1, IiiiiiiiIIIII, null);
                                    this.ALLATORIxDEMO(IiiiiiiiIIIII);
                                }
                            }
                            ++IiiiiiiiIIIII;
lbl61:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    }
                    ++IiiiiiiiIIIII;
lbl64:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block33;
                do {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl68:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block33;
                do {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl72:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block33;
                do {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl76:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.baseSuit = new BaseSuit(Integer.parseInt(IiiiiiiiIIIII[1]), BaseValue.getQv((String)IiiiiiiiIIIII[3]) / 10);
                break block33;
                do {
                    if ((IiiiiiiiIIIII = roleData.getGood(new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]))) != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                        IiiiiiiiIIIII = 1;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                            this.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl87:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block33;
                do {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3))) != null) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                        if (IiiiiiiiIIIII == 8121) {
                            IiiiiiiiIIIII += 0.15;
                        } else if (IiiiiiiiIIIII == 8122) {
                            IiiiiiiiIIIII += 0.25;
                        } else {
                            IiiiiiiiIIIII = new BaseSkill(IiiiiiiiIIIII, 1, IiiiiiiiIIIII, null);
                            this.ALLATORIxDEMO(IiiiiiiiIIIII);
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl101:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                IiiiiiiiIIIII = 2;
                while (IiiiiiiiIIIII < 4 && IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) != -1) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("#", IiiiiiiiIIIII.length() + 1);
                        IiiiiiiiIIIII = BaseEquip.getDouble(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII.length() + 1, IiiiiiiiIIIII));
                        IiiiiiiiIIIII *= (double)(IiiiiiiiIIIII == 2 ? IiiiiiiiIIIII >> 5 & 31 : IiiiiiiiIIIII & 31);
                        IiiiiiiiIIIII += BaseEquip.getDouble(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                        if (IiiiiiiiIIIII != 1.0) {
                            IiiiiiiiIIIII *= IiiiiiiiIIIII;
                        }
                        this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
                }
                break block33;
                do {
                    if ((IiiiiiiiIIIII = vs[IiiiiiiiIIIII].indexOf("&", IiiiiiiiIIIII + 1)) == -1) {
                        IiiiiiiiIIIII = vs[IiiiiiiiIIIII].length();
                    }
                    if (IiiiiiiiIIIII != 0 && (IiiiiiiiIIIII = (IiiiiiiiIIIII = new BaseGemOld(vs[IiiiiiiiIIIII].substring(IiiiiiiiIIIII, IiiiiiiiIIIII))).getGemOld(objectArea)) != null) {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII.getKey(), (double)(IiiiiiiiIIIII.getLvl() * IiiiiiiiIIIII.getValue()) / 100.0 * IiiiiiiiIIIII.getValue());
                    }
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl123:
                    // 2 sources

                } while (IiiiiiiiIIIII != vs[IiiiiiiiIIIII].length());
            }
            ++IiiiiiiiIIIII;
        }
    }

    public List<BaseQl> getQls() {
        return this.qls;
    }

    public static String[] getBaseLimits() {
        return BaseLimits;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(String[] vs) {
        IiiiiiiiIIIII = BaseValue.getQv((String)vs[0].split("=")[1]) / 10;
        IiiiiiiiIIIII = Integer.parseInt(vs[1].split("=")[1]);
        IiiiiiiiIIIII = 4;
        while (IiiiiiiiIIIII < vs.length) {
            block4: {
                block3: {
                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block3;
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl19
                }
                IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("=");
                if (IiiiiiiiIIIII.length == 2 && (IiiiiiiiIIIII[0].equals("\u6839\u9aa8") || IiiiiiiiIIIII[0].equals("\u7075\u6027") || IiiiiiiiIIIII[0].equals("\u529b\u91cf") || IiiiiiiiIIIII[0].equals("\u654f\u6377") || IiiiiiiiIIIII[0].equals("\u5b9a\u529b"))) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (1.0 + (double)IiiiiiiiIIIII * 0.1));
                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (1.0 + (IiiiiiiiIIIII == 6 ? 3.2 : (IiiiiiiiIIIII == 5 ? 1.6 : (IiiiiiiiIIIII == 4 ? 0.8 : (IiiiiiiiIIIII == 3 ? 0.4 : (IiiiiiiiIIIII == 2 ? 0.2 : 0.0)))))));
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], IiiiiiiiIIIII);
                }
                break block4;
                do {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl19:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public int getEquipPart() {
        return this.equipPart;
    }

    public void setBaseLimit(BaseLimit baseLimit) {
        this.baseLimit = baseLimit;
    }

    public static double getQHGemXS(int lvl) {
        double IiiiiiiiIIIII = 0.0;
        int IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 <= lvl) {
            double d = (IiiiiiiiIIIII2 - 1) / 3 + 1;
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII += d * 0.8;
        }
        return IiiiiiiiIIIII;
    }

    public BaseStar getBaseStar() {
        return this.baseStar;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String[] vs) {
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        this.NJ = Integer.parseInt(vs[2].split("=")[1]);
        IiiiiiiiIIIII = 3;
        while (IiiiiiiiIIIII < vs.length) {
            block6: {
                block5: {
                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block5;
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 2;
                    if (true) ** GOTO lbl20
                }
                if (vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[6])) {
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII];
                }
                break block6;
                do {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(GoodType.Extras[7])) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII];
                    } else {
                        this.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    }
                    ++IiiiiiiiIIIII;
lbl20:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII == null) return;
        this.baseStar = new BaseStar(IiiiiiiiIIIII, IiiiiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(String[] vs, IiiiiiiiiIIII objectArea) {
        IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < vs.length) {
            block6: {
                block5: {
                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[1])) break block5;
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 2;
                    if (true) ** GOTO lbl30
                }
                IiiiiiiiIIIII = vs[IiiiiiiiIIIII].indexOf("=");
                IiiiiiiiIIIII = vs[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                if (!IiiiiiiiIIIII.equals("\u6027\u522b\u8981\u6c42")) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII, Double.parseDouble(vs[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1)));
                }
                break block6;
                do {
                    block8: {
                        block7: {
                            if (!(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("="))).equals("\u7279\u6280")) break block7;
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                            IiiiiiiiIIIII = 1;
                            if (true) ** GOTO lbl27
                        }
                        this.iIiIiiiiIIiii(IiiiiiiiIIIII, Double.parseDouble(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1)));
                        break block8;
                        do {
                            if ((IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null) {
                                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                                IiiiiiiiIIIII = new BaseSkill(IiiiiiiiIIIII, 0, 0.0, IiiiiiiiIIIII);
                                this.ALLATORIxDEMO(IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
lbl27:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    }
                    ++IiiiiiiiIIIII;
lbl30:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(int i, String value) {
        if (this.baseLimit == null) {
            this.baseLimit = new BaseLimit();
        }
        if (i < 4) {
            int IiiiiiiiIIIII = Integer.parseInt(value);
            if (i == 0) {
                this.baseLimit.setLm(this.baseLimit.getLm() + IiiiiiiiIIIII);
                return;
            }
            if (i == 1) {
                this.baseLimit.setLx(this.baseLimit.getLx() + IiiiiiiiIIIII);
                return;
            }
            if (i == 2) {
                this.baseLimit.setGg(this.baseLimit.getGg() + IiiiiiiiIIIII);
                return;
            }
            this.baseLimit.setMj(this.baseLimit.getMj() + IiiiiiiiIIIII);
            return;
        }
        if (i == 4) {
            if (this.baseLimit.getXs() == -999.0) return;
            double IiiiiiiiIIIII = Double.parseDouble(value);
            this.baseLimit.setXs(this.baseLimit.getXs() + IiiiiiiiIIIII);
            return;
        }
        if (i == 5) {
            this.baseLimit.setRole(value);
            return;
        }
        if (i == 6) {
            boolean IiiiiiiiIIIII = value.endsWith("\u7ea7");
            if (value.startsWith("\u98de\u5347")) {
                this.baseLimit.setZs(4);
                this.baseLimit.setLvl(Integer.parseInt(value.substring(2, IiiiiiiiIIIII ? value.length() - 1 : value.length())));
                return;
            }
            int IiiiiiiiIIIII2 = value.indexOf("\u8f6c");
            if (IiiiiiiiIIIII2 != -1) {
                this.baseLimit.setZs(Integer.parseInt(value.substring(0, IiiiiiiiIIIII2)));
                this.baseLimit.setLvl(Integer.parseInt(value.substring(IiiiiiiiIIIII2 + 1, IiiiiiiiIIIII ? value.length() - 1 : value.length())));
                return;
            }
            this.baseLimit.setLvl(Integer.parseInt(IiiiiiiiIIIII ? value.substring(0, value.length() - 1) : value));
            return;
        }
        if (i == 7) {
            String[] IiiiiiiiIIIII = value.split("\u8f6c");
            if (IiiiiiiiIIIII.length == 1) {
                this.baseLimit.setLvlMax(Integer.parseInt(IiiiiiiiIIIII[0]));
                return;
            }
            if (IiiiiiiiIIIII[0].equals("\u98de\u5347")) {
                this.baseLimit.setZsMax(4);
            } else {
                this.baseLimit.setZsMax(Integer.parseInt(IiiiiiiiIIIII[0]));
            }
            this.baseLimit.setLvlMax(Integer.parseInt(IiiiiiiiIIIII[1]));
            return;
        }
        if (i == 8) {
            if (value.equals("1") || value.equals("\u7537")) {
                this.baseLimit.setSex(1);
                return;
            }
            if (!value.equals("0") && !value.equals("\u5973")) {
                this.baseLimit.setSex(2);
                return;
            }
            this.baseLimit.setSex(0);
            return;
        }
        if (i == 9) {
            int IiiiiiiiIIIII = Integer.parseInt(value);
            this.baseLimit.setSw(this.baseLimit.getSw() + IiiiiiiiIIIII);
            return;
        }
        if (i == 8016) {
            this.baseLimit.setXs(-999.0);
            return;
        }
        if (i != 8017) return;
        this.baseLimit.setL(true);
    }

    public void ALLATORIxDEMO(BaseSkill baseSkill) {
        if (this.baseSkills == null) {
            this.baseSkills = new ArrayList<BaseSkill>();
        }
        this.baseSkills.add(baseSkill);
    }

    public void setQhv(Integer qhv) {
        this.qhv = qhv;
    }

    public static double getDouble(String value) {
        if (value == null) return 0.0;
        if (value.equals("")) return 0.0;
        if (value.indexOf("/") != -1) {
            return 0.0;
        }
        try {
            return Double.parseDouble(value);
        }
        catch (Exception IiiiiiiiIIIII) {
            System.err.println("Double:" + value);
            return 0.0;
        }
    }

    public void iIiIiiiiIIiii(String v) {
        int IiiiiiiiIIIII = this.getDYIndex(v);
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        String IiiiiiiiIIIII2 = v.substring(0, IiiiiiiiIIIII);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < BaseLimits.length) {
            if (IiiiiiiiIIIII2.startsWith(BaseLimits[IiiiiiiiIIIII3])) {
                if (IiiiiiiiIIIII3 == 4 && IiiiiiiiIIIII2.indexOf("\u51cf\u5c11") != -1) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII3, "-" + v.substring(IiiiiiiiIIIII + 1));
                    return;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII3, v.substring(IiiiiiiiIIIII + 1));
                return;
            }
            ++IiiiiiiiIIIII3;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, BaseEquip.getDouble(v.substring(IiiiiiiiIIIII + 1)));
    }

    public void setQlews(List<BaseQl> qlews) {
        this.qlews = qlews;
    }

    public void iiiIiiiiiiIIi(String key, double xs) {
        this.ALLATORIxDEMO(this.qls, key, xs);
        this.ALLATORIxDEMO(this.qlews, key, xs);
    }

    public List<BaseQl> getQlews() {
        return this.qlews;
    }

    public Integer getQhv() {
        return this.qhv;
    }

    public void setNJ(Integer nJ) {
        this.NJ = nJ;
    }

    public int getDYIndex(String v) {
        int IiiiiiiiIIIII = -1;
        char IiiiiiiiIIIII2 = '=';
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < v.length()) {
            if (v.charAt(IiiiiiiiIIIII3) == IiiiiiiiIIIII2) {
                if (IiiiiiiiIIIII != -1) return -1;
                IiiiiiiiIIIII = IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public void setBaseSuit(BaseSuit baseSuit) {
        this.baseSuit = baseSuit;
    }

    public void iIiIiiiiIIiii(String key, double value) {
        if (this.qls == null) {
            this.qls = new ArrayList<BaseQl>();
        }
        this.iIiIiiiiIIiii(this.qls, key, value);
    }

    public void setEquipPart(int equipPart) {
        this.equipPart = equipPart;
    }

    public BaseQl getQlew(String key) {
        if (this.qlews == null) {
            return null;
        }
        int IiiiiiiiIIIII = this.qlews.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            BaseQl IiiiiiiiIIIII2 = this.qlews.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getKey().equals(key)) {
                return IiiiiiiiIIIII2;
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    public List<BaseSkill> getBaseSkills() {
        return this.baseSkills;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String[] vs, IiiiiiiiiIIII objectArea) {
        IiiiiiiiIIIII = 3;
        while (IiiiiiiiIIIII < vs.length) {
            block7: {
                block6: {
                    if (!vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block6;
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl26
                }
                if (vs[IiiiiiiiIIIII].startsWith(GoodType.Extras[5])) {
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[1]);
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                        IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[2]);
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[3]);
                        IiiiiiiiIIIII = new BaseSkill(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                        this.ALLATORIxDEMO(IiiiiiiiIIIII);
                    }
                } else {
                    IiiiiiiiIIIII = vs[IiiiiiiiIIIII].split("=");
                    if (IiiiiiiiIIIII.length == 2 && (IiiiiiiiIIIII[0].equals("\u6839\u9aa8") || IiiiiiiiIIIII[0].equals("\u7075\u6027") || IiiiiiiiIIIII[0].equals("\u529b\u91cf") || IiiiiiiiIIIII[0].equals("\u654f\u6377") || IiiiiiiiIIIII[0].equals("\u5b9a\u529b"))) {
                        this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], BaseEquip.getDouble(IiiiiiiiIIIII[1]));
                    }
                }
                break block7;
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    ++IiiiiiiiIIIII;
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII[0], Double.parseDouble(IiiiiiiiIIIII[1]));
lbl26:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(String v) {
        int IiiiiiiiIIIII = this.getDYIndex(v);
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        String IiiiiiiiIIIII2 = v.substring(0, IiiiiiiiIIIII);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < BaseLimits.length) {
            if (IiiiiiiiIIIII2.startsWith(BaseLimits[IiiiiiiiIIIII3])) {
                if (IiiiiiiiIIIII3 == 4 && IiiiiiiiIIIII2.indexOf("\u51cf\u5c11") != -1) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII3, "-" + v.substring(IiiiiiiiIIIII + 1));
                    return;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII3, v.substring(IiiiiiiiIIIII + 1));
                return;
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, BaseEquip.getDouble(v.substring(IiiiiiiiIIIII + 1)));
    }

    public boolean ALLATORIxDEMO(int id) {
        if (id < 8056) return false;
        if (id > 8061) return false;
        return true;
    }

    public Integer getNJ() {
        return this.NJ;
    }

    public void setQls(List<BaseQl> qls) {
        this.qls = qls;
    }

    public static void setBaseLimits(String[] baseLimits) {
        BaseLimits = baseLimits;
    }

    public void ALLATORIxDEMO() {
        if (this.baseSkills == null) return;
        for (BaseSkill IiiiiiiiIIIII : this.baseSkills) {
            if (IiiiiiiiIIIII.getSkillId() == 8056) {
                this.iiiIiiiiiiIIi("\u6297\u6d69\u7136\u6b63\u6c14", 1.1);
                continue;
            }
            if (IiiiiiiiIIIII.getSkillId() == 8057) {
                this.iiiIiiiiiiIIi("\u6297\u9694\u5c71\u6253\u725b", 1.1);
                continue;
            }
            if (IiiiiiiiIIIII.getSkillId() == 8058) {
                this.iiiIiiiiiiIIi("\u6297\u5c0f\u697c\u591c\u54ed", 1.1);
                continue;
            }
            if (IiiiiiiiIIIII.getSkillId() == 8059) {
                this.iiiIiiiiiiIIi("\u6297\u5206\u5149\u5316\u5f71", 1.1);
                continue;
            }
            if (IiiiiiiiIIIII.getSkillId() == 8060) {
                this.iiiIiiiiiiIIi("\u6297\u5929\u9b54\u89e3\u4f53", 1.1);
                continue;
            }
            if (IiiiiiiiIIIII.getSkillId() != 8061) continue;
            this.iiiIiiiiiiIIi("\u6297\u9752\u9762\u7360\u7259", 1.1);
        }
    }

    public void ALLATORIxDEMO(String key, double value) {
        if (this.qlews == null) {
            this.qlews = new ArrayList<BaseQl>();
        }
        this.iIiIiiiiIIiii(this.qlews, key, value);
    }

    public void setBaseStar(BaseStar baseStar) {
        this.baseStar = baseStar;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public BaseEquip(String value, long type, IiiiiiiiiIIII objectArea, RoleData roleData) {
        try {
            String[] IiiiiiiiIIIII = value.split("\\|");
            if (type == 8888L) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII);
            } else if (type == 520L) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII);
            } else if (type == 510L || type == 511L || type == 512L) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, objectArea);
            } else if (type == 139L) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII, objectArea);
            } else {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, objectArea, roleData);
            }
            this.ALLATORIxDEMO();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public BaseSuit getBaseSuit() {
        return this.baseSuit;
    }

    public void setBaseSkills(List<BaseSkill> baseSkills) {
        this.baseSkills = baseSkills;
    }

    private /* synthetic */ void iIiIiiiiIIiii(List<BaseQl> list, String key, double value) {
        if (list == null) {
            return;
        }
        for (BaseQl IiiiiiiiIIIII : list) {
            if (!IiiiiiiiIIIII.getKey().equals(key)) continue;
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII.getValue() + value);
            return;
        }
        list.add(new BaseQl(key, value));
    }

    public void ALLATORIxDEMO(List<BaseQl> list, String key, double xs) {
        if (list == null) {
            return;
        }
        for (BaseQl IiiiiiiiIIIII : list) {
            if (key != null && !IiiiiiiiIIIII.getKey().equals(key)) continue;
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII.getValue() * xs);
        }
    }
}
