/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Mount
 *  com.xy.entity.MountSkill
 *  com.xy.entity.Pal
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.readbean.PalData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.formula;

import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMountSH;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.PalData;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIiIiiiiiIiI;
import com.xy.v.IiiiIiiiiIIII;
import java.math.BigDecimal;
import java.util.Map;

public class PetProperty {
    static String[] evs = new String[]{"\u6839\u9aa8=", "\u7075\u6027=", "\u529b\u91cf=", "\u654f\u6377=", "\u70bc\u5316\u5c5e\u6027", "\u589e\u52a0\u6c14\u8840", "\u589e\u52a0\u6cd5\u529b", "\u589e\u52a0\u653b\u51fb", "\u9644\u52a0\u901f\u5ea6"};

    /*
     * Unable to fully structure code
     */
    public static int[] getPetHMASp(RoleSummoning pet, RoleData roleData) {
        block87: {
            block88: {
                block89: {
                    block86: {
                        IiiiiiiiIIIII = new int[10];
                        IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
                        var4_4 = Double.valueOf(pet.getGrowlevel());
                        IiiiiiiiIIIII[0] = pet.getHp();
                        IiiiiiiiIIIII[1] = pet.getMp();
                        IiiiiiiiIIIII[2] = pet.getAp();
                        IiiiiiiiIIIII[3] = pet.getSp();
                        IiiiiiiiIIIII[4] = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = 0;
                        if (IiiiiiiiIIIII >= 2.5 || IiiiiiiiIIIII[0] > 3500 || IiiiiiiiIIIII[1] > 3500 || IiiiiiiiIIIII[2] > 3500 || IiiiiiiiIIIII[3] > 2500) {
                            IiIiIiiiiiIiI.ALLATORIxDEMO();
                        }
                        if (pet.getStye() != null && pet.getStye().length() > 1) {
                            IiiiiiiiIIIII = pet.getStye().split("\\|");
                            IiiiiiiiIIIII = 1;
                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                                if (IiiiiiiiIIIII.length >= 2 && (IiiiiiiiIIIII = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[1]))) != null) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                                    IiiiiiiiIIIII = 0;
                                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[0])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII[1]);
                                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[1])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII[1]);
                                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[2])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII[1]);
                                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[3])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII[1]);
                                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[8])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII[1]);
                                        } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[4])) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("\\&");
                                            IiiiiiiiIIIII = 1;
                                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[5])) {
                                                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Double.parseDouble(IiiiiiiiIIIII[1]));
                                                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[6])) {
                                                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Double.parseDouble(IiiiiiiiIIIII[1]));
                                                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[7])) {
                                                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Double.parseDouble(IiiiiiiiIIIII[1]));
                                                } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(PetProperty.evs[8])) {
                                                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                                    IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Double.parseDouble(IiiiiiiiIIIII[1]));
                                                }
                                                ++IiiiiiiiIIIII;
                                            }
                                        }
                                        ++IiiiiiiiIIIII;
                                    }
                                }
                                ++IiiiiiiiIIIII;
                            }
                        }
                        IiiiiiiiIIIII = roleData.getPetMount(pet.getSid());
                        if (!roleData.getGameView().getClient().gameMount) break block86;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII[5] = pet.getBone();
                        IiiiiiiiIIIII[6] = pet.getSpir();
                        IiiiiiiiIIIII[7] = pet.getPower();
                        IiiiiiiiIIIII[8] = pet.getSpeed();
                        IiiiiiiiIIIII[9] = pet.getCalm();
                        IiiiiiiiIIIII[0] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[5], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[0], 0);
                        IiiiiiiiIIIII[1] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[6], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[1], 1);
                        IiiiiiiiIIIII[2] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[7], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[2], 2);
                        IiiiiiiiIIIII[3] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[8], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[3], 3);
                        IiiiiiiiIIIII[4] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[9], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[4], 4);
                        if (IiiiiiiiIIIII == null) break block87;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getDataValue("JN");
                        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) break block88;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getMountlvl();
                        if (IiiiiiiiIIIII > 100) {
                            IiiiiiiiIIIII -= 100;
                        }
                        var25_35 = (int)Math.floor((float)IiiiiiiiIIIII.getSpri().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getSpri().intValue() / 2.0f);
                        IiiiiiiiIIIII = (int)Math.floor((float)IiiiiiiiIIIII.getPower().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getPower().intValue() / 2.0f);
                        IiiiiiiiIIIII = (int)Math.floor((float)IiiiiiiiIIIII.getBone().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getBone().intValue() / 2.0f);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getMountCZ();
                        IiiiiiiiIIIII = IiiiiiiiIIIII >> 6;
                        if (IiiiiiiiIIIII <= 0) break block89;
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl136
                    }
                    IiiiiiiiIIIII[5] = pet.getBone() + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[6] = pet.getSpir() + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[7] = pet.getPower() + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[8] = pet.getSpeed() + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[9] = pet.getCalm();
                    IiiiiiiiIIIII[0] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[5], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[0], 0) + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[1] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[6], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[1], 1) + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[2] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[7], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[2], 2) + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[3] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[8], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[3], 3) + IiiiiiiiIIIII;
                    IiiiiiiiIIIII[4] = PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[9], (double)IiiiiiiiIIIII, IiiiiiiiIIIII[4], 4);
                    pet.getSI(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiIiiiiIIII.IIIIIiiiiIIii((int)pet.getGrade()), roleData.getObjectArea());
                    if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getMountskill();
                    if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
                    IiiiiiiiIIIII = 1.0;
                    IiiiiiiiIIIII = 1.0;
                    IiiiiiiiIIIII = 1.0;
                    IiiiiiiiIIIII = 1.0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl266
                    do {
                        if ((IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII & 1) != 0) {
                            v0 = IiiiiiiiIIIII = (IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII + 1 & 1) == 1 ? 1 : 0;
                            if (IiiiiiiiIIIII == 0) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            } else if (IiiiiiiiIIIII == 1) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            } else if (IiiiiiiiIIIII == 2) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            }
                        }
                        ++IiiiiiiiIIIII;
lbl136:
                        // 2 sources

                    } while (IiiiiiiiIIIII < 3);
                }
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length()) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("#", IiiiiiiiIIIII + 1);
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                    }
                    if ((IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill((String)(IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII)))) != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getXs((int)IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII.getProficiency().intValue(), IiiiiiiiIIIII.getMountid().intValue());
                        if (IiiiiiiiIIIII.getBt() == 0) {
                            IiiiiiiiIIIII += IiiiiiiiIIIII / IiiiiiiiIIIII.getBx() / 100.0;
                        } else if (IiiiiiiiIIIII.getBt() == 1) {
                            IiiiiiiiIIIII += IiiiiiiiIIIII / IiiiiiiiIIIII.getBx() / 100.0;
                        } else if (IiiiiiiiIIIII.getBt() == 2) {
                            IiiiiiiiIIIII += IiiiiiiiIIIII / IiiiiiiiIIIII.getBx() / 100.0;
                        } else if (IiiiiiiiIIIII.getBt() == 3) {
                            IiiiiiiiIIIII += IiiiiiiiIIIII / IiiiiiiiIIIII.getBx() / 100.0;
                        }
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                }
            }
            if ((IiiiiiiiIIIII = roleData.getMountSHByMountId(IiiiiiiiIIIII.getMountid().intValue())) != null && IiiiiiiiIIIII.getLvl() > 0) {
                IiiiiiiiIIIII = roleData.getMountSHByindex(0);
                IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill((String)BaseMountSH.SH_HEAD_NAME[IiiiiiiiIIIII.getId()]);
                IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill((String)BaseMountSH.SH_HEAD_NAME[0]);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getLvl() - 1;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getMountSHByZT(IiiiiiiiIIIII.getId(), IiiiiiiiIIIII.getLvl());
                IiiiiiiiIIIII = IiiiiiiiIIIII / IiiiiiiiIIIII.getBases().length;
                IiiiiiiiIIIII = 1 + IiiiiiiiIIIII % IiiiiiiiIIIII.getBases().length;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII.getBases().length : IiiiiiiiIIIII;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                    IiiiiiiiIIIII = (double)(IiiiiiiiIIIII + (IiiiiiiiIIIII < IiiiiiiiIIIII ? 1 : 0)) * IiiiiiiiIIIII.getValue() * IiiiiiiiIIIII;
                    if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[0])) {
                        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[1])) {
                        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[2])) {
                        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[3])) {
                        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + (pet.getSp() < 0 ? -IiiiiiiiIIIII : IiiiiiiiIIIII));
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[0])) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII / 100.0;
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[1])) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII / 100.0;
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[2])) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII / 100.0;
                    } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[3])) {
                        IiiiiiiiIIIII += IiiiiiiiIIIII / 100.0;
                    }
                    ++IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getMountid().intValue());
                if (IiiiiiiiIIIII > 0) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getMounts()[IiiiiiiiIIIII - 1];
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getBases() != null && IiiiiiiiIIIII.getB3() > 0 ? IiiiiiiiIIIII.getBases().length : 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                        if (IiiiiiiiIIIII.getKey().equals("\u6280\u80fd")) {
                            IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getValue();
                            IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getValue2();
                            if (IiiiiiiiIIIII == 2105) {
                                IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Math.min(0.002 * (double)IiiiiiiiIIIII * (double)IiiiiiiiIIIII[2], (double)(500 * IiiiiiiiIIIII)));
                            } else if (IiiiiiiiIIIII == 2106) {
                                IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + Math.min(0.004 * (double)IiiiiiiiIIIII * (double)IiiiiiiiIIIII[2], (double)(1000 * IiiiiiiiIIIII)));
                            }
                        } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE3[0])) {
                            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII.getValue());
                        } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE3[1])) {
                            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII.getValue());
                        } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE3[2])) {
                            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + IiiiiiiiIIIII.getValue());
                        } else if (IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE3[3])) {
                            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + (pet.getSp() < 0 ? -IiiiiiiiIIIII.getValue() : IiiiiiiiIIIII.getValue()));
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
            }
        }
        if (IiiiiiiiIIIII > 0) {
            IiiiiiiiIIIII[5] = IiiiiiiiIIIII[5] + IiiiiiiiIIIII;
            IiiiiiiiIIIII += PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[5], (double)IiiiiiiiIIIII, pet.getHp(), 0) - IiiiiiiiIIIII[0];
        }
        if (IiiiiiiiIIIII > 0) {
            IiiiiiiiIIIII[6] = IiiiiiiiIIIII[6] + IiiiiiiiIIIII;
            IiiiiiiiIIIII += PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[6], (double)IiiiiiiiIIIII, pet.getMp(), 1) - IiiiiiiiIIIII[1];
        }
        if (IiiiiiiiIIIII > 0) {
            IiiiiiiiIIIII[7] = IiiiiiiiIIIII[7] + IiiiiiiiIIIII;
            IiiiiiiiIIIII += PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[7], (double)IiiiiiiiIIIII, pet.getAp(), 2) - IiiiiiiiIIIII[2];
        }
        if (IiiiiiiiIIIII > 0) {
            IiiiiiiiIIIII[8] = IiiiiiiiIIIII[8] + IiiiiiiiIIIII;
            IiiiiiiiIIIII += PetProperty.getPetValue(IiiiiiiiIIIII, IiiiiiiiIIIII[8], (double)IiiiiiiiIIIII, pet.getSp(), 3) - IiiiiiiiIIIII[3];
        }
        IiiiiiiiIIIII[0] = (int)((double)IiiiiiiiIIIII[0] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[0] = IiiiiiiiIIIII[0] + IiiiiiiiIIIII;
        IiiiiiiiIIIII[1] = (int)((double)IiiiiiiiIIIII[1] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[1] = IiiiiiiiIIIII[1] + IiiiiiiiIIIII;
        IiiiiiiiIIIII[2] = (int)((double)IiiiiiiiIIIII[2] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[2] = IiiiiiiiIIIII[2] + IiiiiiiiIIIII;
        IiiiiiiiIIIII[3] = (int)((double)IiiiiiiiIIIII[3] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[3] = IiiiiiiiIIIII[3] + IiiiiiiiIIIII;
        pet.getSI(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiIiiiiIIII.IIIIIiiiiIIii((int)pet.getGrade()), roleData.getObjectArea());
        return IiiiiiiiIIIII;
        do {
            if ((IiiiiiiiIIIII = PropertyUtil.iIiIiiiiIIiii((Mount)IiiiiiiiIIIII, (String)((MountSkill)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getSkillname())) != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("=");
                if (IiiiiiiiIIIII[0].equals("HP")) {
                    IiiiiiiiIIIII += Double.parseDouble(IiiiiiiiIIIII[1]);
                } else if (IiiiiiiiIIIII[0].equals("MP")) {
                    IiiiiiiiIIIII += Double.parseDouble(IiiiiiiiIIIII[1]);
                } else if (IiiiiiiiIIIII[0].equals("AP")) {
                    IiiiiiiiIIIII += Double.parseDouble(IiiiiiiiIIIII[1]);
                } else if (IiiiiiiiIIIII[0].equals("SP")) {
                    IiiiiiiiIIIII += Double.parseDouble(IiiiiiiiIIIII[1]);
                }
            }
            ++IiiiiiiiIIIII;
lbl266:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        IiiiiiiiIIIII[0] = (int)((double)IiiiiiiiIIIII[0] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[1] = (int)((double)IiiiiiiiIIIII[1] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[2] = (int)((double)IiiiiiiiIIIII[2] * IiiiiiiiIIIII);
        IiiiiiiiIIIII[3] = (int)((double)IiiiiiiiIIIII[3] * IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public static int[] getPalHMASp(Pal pal, PalData palData, RoleData roleData) {
        int[] IiiiiiiiIIIII = new int[4];
        double IiiiiiiiIIIII2 = pal != null ? pal.getGrow() : 1.0;
        Integer IiiiiiiiIIIII3 = roleData.getLoginResult().getGrade();
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII3);
        int IiiiiiiiIIIII5 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII3);
        if (pal != null) {
            Map IiiiiiiiIIIII6 = PropertyUtil.getPalMap((Pal)pal, (boolean)true, (RoleData)roleData);
            IiiiiiiiIIIII[0] = PetProperty.getBase(IiiiiiiiIIIII4, (int)PropertyUtil.getMapValue((Map)IiiiiiiiIIIII6, (String)"\u6839\u9aa8"), IiiiiiiiIIIII2, palData.getHp(), 0, IiiiiiiiIIIII6);
            IiiiiiiiIIIII[1] = PetProperty.getBase(IiiiiiiiIIIII4, (int)PropertyUtil.getMapValue((Map)IiiiiiiiIIIII6, (String)"\u7075\u6027"), IiiiiiiiIIIII2, palData.getMp(), 1, IiiiiiiiIIIII6);
            IiiiiiiiIIIII[2] = PetProperty.getBase(IiiiiiiiIIIII4, (int)PropertyUtil.getMapValue((Map)IiiiiiiiIIIII6, (String)"\u529b\u91cf"), IiiiiiiiIIIII2, palData.getAp(), 2, IiiiiiiiIIIII6);
            IiiiiiiiIIIII[3] = PetProperty.getBase(IiiiiiiiIIIII4, (int)PropertyUtil.getMapValue((Map)IiiiiiiiIIIII6, (String)"\u654f\u6377"), IiiiiiiiIIIII2, palData.getSp(), 3, IiiiiiiiIIIII6);
            IiiiiiiiIIIII6.clear();
            return IiiiiiiiIIIII;
        }
        int[] IiiiiiiiIIIII7 = palData.getJds();
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII7[0] + IiiiiiiiIIIII7[1] + IiiiiiiiIIIII7[2] + IiiiiiiiIIIII7[3];
        int IiiiiiiiIIIII9 = IiiiiiiiIIIII4 + IiiiiiiiIIIII5 * 40;
        IiiiiiiiIIIII9 = IiiiiiiiIIIII4 % IiiiiiiiIIIII8;
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII[IiiiiiiiIIIII10] = IiiiiiiiIIIII[IiiiiiiiIIIII10] + (IiiiiiiiIIIII4 + IiiiiiiiIIIII9 / IiiiiiiiIIIII8 * IiiiiiiiIIIII7[IiiiiiiiIIIII10]);
            if (IiiiiiiiIIIII9 > 0 && IiiiiiiiIIIII7[IiiiiiiiIIIII10] > 0) {
                if (IiiiiiiiIIIII9 > palData.getJds()[IiiiiiiiIIIII10]) {
                    IiiiiiiiIIIII[IiiiiiiiIIIII10] = IiiiiiiiIIIII[IiiiiiiiIIIII10] + IiiiiiiiIIIII7[IiiiiiiiIIIII10];
                    IiiiiiiiIIIII9 -= IiiiiiiiIIIII7[IiiiiiiiIIIII10];
                } else {
                    IiiiiiiiIIIII[IiiiiiiiIIIII10] = IiiiiiiiIIIII[IiiiiiiiIIIII10] + IiiiiiiiIIIII9;
                    IiiiiiiiIIIII9 = 0;
                }
            }
            ++IiiiiiiiIIIII10;
        }
        IiiiiiiiIIIII[0] = PetProperty.getPetValue(IiiiiiiiIIIII4, IiiiiiiiIIIII[0], IiiiiiiiIIIII2, palData.getHp(), 0);
        IiiiiiiiIIIII[1] = PetProperty.getPetValue(IiiiiiiiIIIII4, IiiiiiiiIIIII[1], IiiiiiiiIIIII2, palData.getMp(), 1);
        IiiiiiiiIIIII[2] = PetProperty.getPetValue(IiiiiiiiIIIII4, IiiiiiiiIIIII[2], IiiiiiiiIIIII2, palData.getAp(), 2);
        IiiiiiiiIIIII[3] = PetProperty.getPetValue(IiiiiiiiIIIII4, IiiiiiiiIIIII[3], IiiiiiiiIIIII2, palData.getSp(), 3);
        return IiiiiiiiIIIII;
    }

    public static int getBase(int lvl, int P, double G, int base, int type, Map<String, Double> map) {
        int IiiiiiiiIIIII = PetProperty.getPetValue(lvl, P, G, base, type);
        if (type == 0) {
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"hp"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"HP"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u52a0\u6c14\u8840"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (PropertyUtil.getMapValue(map, (String)"HP\u6210\u957f") + 1.0));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (PropertyUtil.getMapValue(map, (String)"\u52a0\u5f3a\u6c14\u8840") / 100.0 + 1.0));
            return IiiiiiiiIIIII;
        }
        if (type == 1) {
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"mp"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"MP"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u52a0\u9b54\u6cd5"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (PropertyUtil.getMapValue(map, (String)"MP\u6210\u957f") + PropertyUtil.getMapValue(map, (String)"\u52a0\u5f3a\u9b54\u6cd5") / 100.0 + 1.0));
            return IiiiiiiiIIIII;
        }
        if (type == 2) {
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"ap"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"AP"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u653b\u51fb"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u52a0\u653b\u51fb"));
            IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (PropertyUtil.getMapValue(map, (String)"AP\u6210\u957f") + PropertyUtil.getMapValue(map, (String)"\u52a0\u5f3a\u653b\u51fb") / 100.0 + 1.0));
            return IiiiiiiiIIIII;
        }
        if (type != 3) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"sp"));
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"SP"));
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u901f\u5ea6"));
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII + PropertyUtil.getMapValue(map, (String)"\u52a0\u901f\u5ea6"));
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * (PropertyUtil.getMapValue(map, (String)"SP\u6210\u957f") + PropertyUtil.getMapValue(map, (String)"\u52a0\u5f3a\u901f\u5ea6") / 100.0 + 1.0));
        return IiiiiiiiIIIII;
    }

    public static int getPetValue(int lvl, int P, double G, int base, int type) {
        if (type == 0) return (int)((double)(lvl * P) * G) + (int)((0.7 * (double)lvl * G + 1.0) * (double)base);
        if (type == 1) {
            return (int)((double)(lvl * P) * G) + (int)((0.7 * (double)lvl * G + 1.0) * (double)base);
        }
        if (type == 2) {
            return (int)((double)(lvl * P) * G / 5.0) + (int)((0.14 * (double)lvl * G + 1.0) * (double)base);
        }
        if (type != 3) return P;
        return (int)((double)(base + P) * G);
    }
}
