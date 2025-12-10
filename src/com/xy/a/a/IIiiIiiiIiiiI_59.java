/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiIiiiiIiiIi
 *  com.xy.a.a.IiIiIiiiiIIiI
 *  com.xy.bean.ConfirmBean
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseValue
 *  com.xy.formula.CustomFunction
 *  com.xy.formula.FBUtil
 *  com.xy.formula.Formula
 *  com.xy.formula.PetProperty
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIiIiiiiIiiIi;
import com.xy.a.a.IiIiIiiiiIIiI;
import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.CustomFunction;
import com.xy.formula.FBUtil;
import com.xy.formula.Formula;
import com.xy.formula.PetProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IIiiIiiiIiiiI
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiiIi[] iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private com.xy.i.IiIiIiiiiIIiI[] iIiIiiiiIiIii;
    private IiIiIiiiiIIiI IiIIIiiiiIiiI;
    private List<IIiIiiiiIiiIi> iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO(RoleSummoning pet, int id, int slvl, Skill skill, boolean is) {
        block39: {
            block40: {
                block41: {
                    block38: {
                        block33: {
                            block37: {
                                block35: {
                                    block36: {
                                        block34: {
                                            block32: {
                                                block31: {
                                                    IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI, (Skill)skill);
                                                    this.IiIIIiiiiIiiI.ALLATORIxDEMO();
                                                    if (skill != null) break block31;
                                                    IiiiiiiiIIIII = 0;
                                                    if (true) ** GOTO lbl11
                                                }
                                                IiiiiiiiIIIII = 0;
                                                if (true) ** GOTO lbl19
                                                do {
                                                    this.iIiiIiiiiiiII[IiiiiiiiIIIII++].setBorder(null);
lbl11:
                                                    // 2 sources

                                                } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
                                                return;
                                                do {
                                                    if (IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) == id) {
                                                        this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBorder(BorderFactory.createLineBorder(Color.red, 2));
                                                    } else {
                                                        this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBorder(null);
                                                    }
                                                    ++IiiiiiiiIIIII;
lbl19:
                                                    // 2 sources

                                                } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
                                                if (!is) {
                                                    IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI, null);
                                                }
                                                if (id != 3036) break block32;
                                                IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).addText(skill.getSkillname());
                                                break block33;
                                            }
                                            if (id > 1100) break block34;
                                            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO(id, skill, 1.0, 200, 3);
                                            if (IiiiiiiiIIIII != null) {
                                                IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).addText(IiiiiiiiIIIII);
                                            }
                                            break block33;
                                        }
                                        v0 = IiiiiiiiIIIII = this.ALLATORIxDEMO().gameBattle != false || id == 1282 ? skill.getRemark() : IIiiIiiiIiiiI.ALLATORIxDEMO(skill.getRemark());
                                        if (id == 1267) {
                                            IiiiiiiiIIIII = Math.pow(pet.getFriendliness().longValue(), 0.16666666666666666);
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c1}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(5.0 + 0.3 * IiiiiiiiIIIII + 0.4 * Math.pow(pet.getZBone(this.iiIIiiiiIiIIi).intValue(), 0.5)), (int)1));
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c2}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(3.0 + 0.4 * IiiiiiiiIIIII + 0.6 * Math.pow(pet.getZBone(this.iiIIiiiiIiIIi).intValue(), 0.5)), (int)1));
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c3}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(2.0 + 0.2 * IiiiiiiiIIIII + 0.2 * Math.pow(pet.getZSpeed(this.iiIIiiiiIiIIi).intValue(), 0.5)), (int)1));
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c4}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(3.5 + 0.2 * IiiiiiiiIIIII + 0.3 * Math.pow(pet.getZSpeed(this.iiIIiiiiIiIIi).intValue(), 0.5)), (int)1));
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c5}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)(4.5 + 0.2 * IiiiiiiiIIIII + 0.3 * Math.pow(pet.getZPower(this.iiIIiiiiIiIIi).intValue(), 0.5)), (int)1));
                                        } else if (id == 1282) {
                                            IiiiiiiiIIIII = 20.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.6);
                                            IiiiiiiiIIIII = new StringBuffer();
                                            IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)1));
                                            IiiiiiiiIIIII.append("#G/#R");
                                            IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 1.1), (int)1));
                                            IiiiiiiiIIIII.append("#G/#R");
                                            IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 1.2), (int)1));
                                            IiiiiiiiIIIII.append("#G/#R");
                                            IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 1.85), (int)1));
                                            IiiiiiiiIIIII = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.ALLATORIxDEMO());
                                            IiiiiiiiIIIII = 12.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.2);
                                            IiiiiiiiIIIII = 1000.0 + IiiiiiiiIIIII / 100.0 * (double)IiiiiiiiIIIII[1];
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c1}", IiiiiiiiIIIII.toString());
                                            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c2}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)0));
                                        }
                                        if (!this.ALLATORIxDEMO().gameBattle && id != 1282) break block35;
                                        if (!skill.getSkilltype().equals("4")) break block36;
                                        IiiiiiiiIIIII = 0;
                                        IiiiiiiiIIIII = 0;
                                        if (true) ** GOTO lbl104
                                    }
                                    if (id == 1288) {
                                        IiiiiiiiIIIII = 20.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.7);
                                        IiiiiiiiIIIII = new StringBuffer();
                                        IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)1));
                                        IiiiiiiiIIIII.append("#G/#R");
                                        IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 1.2), (int)1));
                                        IiiiiiiiIIIII.append("#G/#R");
                                        IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 1.4), (int)1));
                                        IiiiiiiiIIIII.append("#G/#R");
                                        IiiiiiiiIIIII.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII * 2.0), (int)1));
                                        IiiiiiiiIIIII = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.ALLATORIxDEMO());
                                        IiiiiiiiIIIII = 20.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.3);
                                        IiiiiiiiIIIII = 1000.0 + IiiiiiiiIIIII / 100.0 * (double)IiiiiiiiIIIII[1];
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c1}", IiiiiiiiIIIII.toString());
                                        IiiiiiiiIIIII = IiiiiiiiIIIII.replace("{\u6570\u503c2}", IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)0));
                                    } else if (id != 1267 && id != 1282) {
                                        IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO(id, skill, pet);
                                    }
                                    break block37;
                                }
                                IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl142
                                do {
                                    v1 /* !! */  = IiiiiiiiIIIII = IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) > 0 ? this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]))) : null;
                                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getSkilltype().equals("3")) {
                                        ++IiiiiiiiIIIII;
                                    }
                                    ++IiiiiiiiIIIII;
lbl104:
                                    // 2 sources

                                } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
                                IiiiiiiiIIIII = 999;
                                if (IiiiiiiiIIIII > 0) {
                                    if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                                        if (IiiiiiiiIIIII == 1) {
                                            IiiiiiiiIIIII = 4999;
                                        } else if (IiiiiiiiIIIII == 2) {
                                            IiiiiiiiIIIII = 9999;
                                        } else if (IiiiiiiiIIIII >= 3) {
                                            IiiiiiiiIIIII = 12999;
                                        }
                                    } else {
                                        IiiiiiiiIIIII = this.ALLATORIxDEMO().gameType == 2 ? (IiiiiiiiIIIII += IiiiiiiiIIIII * 2000) : (IiiiiiiiIIIII += IiiiiiiiIIIII * 200);
                                    }
                                }
                                IiiiiiiiIIIII = IiiiiiiiIIIII.replace("0/999", String.valueOf(pet.getTrainNum()) + "/" + IiiiiiiiIIIII);
                            }
                            IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).addText(IiiiiiiiIIIII);
                            break block33;
                            do {
                                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                if (skill.getSkilltype().equals("4") && IiiiiiiiIIIII[1].equals("0/999")) {
                                    IiiiiiiiIIIII = 0;
                                    IiiiiiiiIIIII = 0;
                                    while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
                                        v2 = IiiiiiiiIIIII = IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) > 0 ? this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]))) : null;
                                        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getSkilltype().equals("3")) {
                                            ++IiiiiiiiIIIII;
                                        }
                                        ++IiiiiiiiIIIII;
                                    }
                                    IiiiiiiiIIIII = 999;
                                    if (IiiiiiiiIIIII > 0) {
                                        IiiiiiiiIIIII = this.ALLATORIxDEMO().gameType == 2 ? (IiiiiiiiIIIII += 2000 * IiiiiiiiIIIII) : (IiiiiiiiIIIII += 200 * IiiiiiiiIIIII);
                                    }
                                    IiiiiiiiIIIII[1] = String.valueOf(pet.getTrainNum()) + "/" + IiiiiiiiIIIII;
                                }
                                if ((IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) != null) {
                                    IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).addText("#c" + (String)IiiiiiiiIIIII[0] + " " + (String)IiiiiiiiIIIII[1] + "#c" + IiiiiiiiIIIII[++IiiiiiiiIIIII].split("=")[0] + (String)IiiiiiiiIIIII + "#r");
                                } else {
                                    IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).addText("#c" + (String)IiiiiiiiIIIII[0] + " " + (String)IiiiiiiiIIIII[1] + "#r");
                                }
                                ++IiiiiiiiIIIII;
lbl142:
                                // 2 sources

                            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                        }
                        IiiiiiiiIIIII = IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).computeSize(205);
                        IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).setBounds(3, 3, (int)IiiiiiiiIIIII.getWidth(), (int)IiiiiiiiIIIII.getHeight());
                        IiiiiiiiIIIII = 3 + (int)IiiiiiiiIIIII.getHeight();
                        if (id != 3036) break block38;
                        IiiiiiiiIIIII += this.IiIIIiiiiIiiI.iIiIiiiiIIiii(slvl, IiiiiiiiIIIII);
                        break block39;
                    }
                    if (!IIiiIiiiIiiiI.ALLATORIxDEMO(id, this.ALLATORIxDEMO())) break block40;
                    if (slvl != -1) break block41;
                    IiiiiiiiIIIII = pet.getQLNum();
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl166
                }
                IiiiiiiiIIIII += this.IiIIIiiiiIiiI.ALLATORIxDEMO(slvl, IiiiiiiiIIIII);
                break block39;
            }
            IiiiiiiiIIIII += this.IiIIIiiiiIiiI.ALLATORIxDEMO(-3, IiiiiiiiIIIII);
            break block39;
            do {
                if (IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) > 0 && IIiIiiiiIiiIi.ALLATORIxDEMO((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) != -1) {
                    --IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
lbl166:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length);
            IiiiiiiiIIIII += this.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII > 0 ? -1 : -2, IiiiiiiiIIIII);
        }
        this.IiIIIiiiiIiiI.setBounds(0, 0, 215, IiiiiiiiIIIII);
    }

    private static /* synthetic */ String iIiIiiiiIIiii(int id, Skill skill, double sld, int lvl, int zs) {
        String IiiiiiiiIIIII = skill.getRemark();
        int IiiiiiiiIIIII2 = Integer.parseInt(skill.getSkilllevel());
        double IiiiiiiiIIIII3 = Double.parseDouble(skill.getDielectric());
        String IiiiiiiiIIIII4 = id <= 1005 ? "\u6df7\u4e71" : (id <= 1010 ? "\u5c01\u5370" : (id <= 1015 ? "\u660f\u7761" : (id <= 1020 ? "\u4e2d\u6bd2" : (id <= 1025 ? "\u9707\u6151" : (id <= 1030 ? "\u529b\u91cf" : (id <= 1035 ? "\u6297\u6027" : (id <= 1040 ? "\u52a0\u901f" : (id <= 1045 ? "\u98ce" : (id <= 1050 ? "\u96f7" : (id <= 1055 ? "\u6c34" : (id <= 1060 ? "\u706b" : (id <= 1065 ? "\u9b3c\u706b" : (id <= 1070 ? "\u4e09\u5c38\u866b" : (id <= 1075 ? "\u9057\u5fd8" : (id <= 1080 ? "smmh" : (id <= 1085 ? "\u9739\u96f3" : (id <= 1090 ? "\u6ca7\u6ce2" : (id <= 1095 ? "\u7518\u9716" : "\u6276\u6447"))))))))))))))))));
        int IiiiiiiiIIIII5 = (id - 1001) / 5;
        StringBuffer IiiiiiiiIIIII6 = new StringBuffer();
        IiiiiiiiIIIII6.append("#W\u3010\u95e8\u6d3e\u3011");
        IiiiiiiiIIIII6.append(SkillUtil.getSkillBySM((int)IiiiiiiiIIIII5));
        IiiiiiiiIIIII6.append("#r\u3010\u5e08\u5085\u3011");
        IiiiiiiiIIIII6.append(SkillUtil.getSkillBySMSF((int)IiiiiiiiIIIII5));
        IiiiiiiiIIIII6.append("#r\u3010\u6cd5\u672f\u7cfb\u3011");
        IiiiiiiiIIIII6.append(SkillUtil.getSkillBySMText((int)IiiiiiiiIIIII5));
        IiiiiiiiIIIII6.append("#r\u3010\u719f\u7ec3\u5ea6\u3011");
        IiiiiiiiIIIII6.append((int)sld);
        IiiiiiiiIIIII6.append("#r\u3010\u6d88\u8017MP\u3011");
        IiiiiiiiIIIII6.append((int)(IiiiiiiiIIIII3 * (sld / 25000.0 + 1.0)));
        IiiiiiiiIIIII6.append("#r");
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        while ((IiiiiiiiIIIII7 = IiiiiiiiIIIII.indexOf("{", IiiiiiiiIIIII8)) != -1 && (IiiiiiiiIIIII8 = IiiiiiiiIIIII.indexOf("}", IiiiiiiiIIIII7 + 1)) != -1) {
            String IiiiiiiiIIIII9 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII7 + 1, IiiiiiiiIIIII8);
            if (IiiiiiiiIIIII9.indexOf("{") != -1) {
                ++IiiiiiiiIIIII7;
                continue;
            }
            int IiiiiiiiIIIII10 = IiiiiiiiIIIII.length();
            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII9, IiiiiiiiIIIII, id, skill, sld, lvl, zs, IiiiiiiiIIIII4, IiiiiiiiIIIII2);
            IiiiiiiiIIIII8 += IiiiiiiiIIIII.length() - IiiiiiiiIIIII10;
        }
        IiiiiiiiIIIII6.append(IiiiiiiiIIIII);
        return IiiiiiiiIIIII6.toString();
    }

    public static String ALLATORIxDEMO(String key, String text, int id, Skill skill, RoleSummoning pet) {
        double IiiiiiiiIIIII = Double.parseDouble(skill.getValue());
        double IiiiiiiiIIIII2 = Double.parseDouble(skill.getGrow());
        String IiiiiiiiIIIII3 = null;
        if (key.equals("\u6570\u503c") || key.equals("\u6574\u503c")) {
            int IiiiiiiiIIIII4 = key.equals("\u6570\u503c") ? 1 : 0;
            IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII + BaseValue.ALLATORIxDEMO((long)pet.getFriendliness(), (double)IiiiiiiiIIIII2)), (int)IiiiiiiiIIIII4);
        } else if (key.equals("\u6570\u503c\u7b49\u7ea7") || key.equals("\u6574\u503c\u7b49\u7ea7")) {
            int IiiiiiiiIIIII5 = key.equals("\u6570\u503c\u7b49\u7ea7") ? 1 : 0;
            int IiiiiiiiIIIII6 = IiiiIiiiiIIII.IIIIIiiiiIIii((int)pet.getGrade());
            int IiiiiiiiIIIII7 = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
            if (IiiiiiiiIIIII6 >= 4) {
                IiiiiiiiIIIII7 = Math.max(IiiiiiiiIIIII7, 180);
            }
            double IiiiiiiiIIIII8 = (double)IiiiiiiiIIIII7 / 200.0 * BaseValue.ALLATORIxDEMO((long)pet.getFriendliness(), (double)IiiiiiiiIIIII2);
            IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII + IiiiiiiiIIIII8), (int)IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII3 != null) return text.replace("{" + key + "}", IiiiiiiiIIIII3);
        return text;
    }

    static /* synthetic */ IiIiIiiiiIIiI ALLATORIxDEMO(IIiiIiiiIiiiI arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    public Skill ALLATORIxDEMO() {
        return IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI);
    }

    public static String ALLATORIxDEMO(String key, String text, int id, Skill skill, double sld, int lvl, int zs, String type, int level) {
        String IiiiiiiiIIIII = null;
        if (key.equals("\u4eba\u6570")) {
            IiiiiiiiIIIII = String.valueOf(FBUtil.ALLATORIxDEMO((int)level, (int)((int)sld), (String)type));
        } else if (key.equals("\u56de\u5408\u6570")) {
            int IiiiiiiiIIIII2 = 0;
            if (id <= 1015 || id >= 1071 && id <= 1075) {
                IiiiiiiiIIIII2 = 7;
            } else if (id <= 1020) {
                IiiiiiiiIIIII2 = 3;
            } else if (id <= 1040 || id >= 1076 && id <= 1080) {
                IiiiiiiiIIIII2 = 7;
            }
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII2);
        } else if (key.equals("\u6b21\u6570")) {
            IiiiiiiiIIIII = String.valueOf(level == 5 ? 3 : (level == 4 ? 5 : 2));
        } else if (key.startsWith("\u6570\u503c")) {
            int IiiiiiiiIIIII3 = key.length() > 2 ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)key, (int)2, (int)key.length()) - 1 : 0;
            Formula IiiiiiiiIIIII4 = skill.getFormulaByIndex(IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII4 == null) {
                return text;
            }
            int IiiiiiiiIIIII5 = (id - 1001) / 5;
            double IiiiiiiiIIIII6 = IiiiiiiiIIIII4.ALLATORIxDEMO(sld, lvl, zs);
            IiiiiiiiIIIII = IiiiiiiiIIIII3 == 0 && (IiiiiiiiIIIII5 >= 8 && IiiiiiiiIIIII5 <= 13 || IiiiiiiiIIIII5 == 17 || IiiiiiiiIIIII5 == 18 || IiiiiiiiIIIII5 == 19) ? String.valueOf((int)IiiiiiiiIIIII6) : (IiiiiiiiIIIII3 == 1 && IiiiiiiiIIIII5 == 3 ? String.valueOf((int)IiiiiiiiIIIII6) : (IiiiiiiiIIIII3 == 3 && IiiiiiiiIIIII5 == 15 ? String.valueOf((int)IiiiiiiiIIIII6) : (IiiiiiiiIIIII3 == 4 && IiiiiiiiIIIII5 == 15 ? String.valueOf((int)IiiiiiiiIIIII6) : String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII6, (int)1)) + "%")));
        }
        if (IiiiiiiiIIIII != null) return text.replace("{" + key + "}", IiiiiiiiIIIII);
        return text;
    }

    private static /* synthetic */ String ALLATORIxDEMO(int id, Skill skill, RoleSummoning pet) {
        String IiiiiiiiIIIII = skill.getRemark();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while ((IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf("{", IiiiiiiiIIIII3)) != -1) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.indexOf("}", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                return IiiiiiiiIIIII;
            }
            String IiiiiiiiIIIII4 = IiiiiiiiIIIII.substring(IiiiiiiiIIIII2 + 1, IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII4.indexOf("{") != -1) {
                ++IiiiiiiiIIIII2;
                continue;
            }
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII.length();
            IiiiiiiiIIIII = IIiiIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII, id, skill, pet);
            IiiiiiiiIIIII3 += IiiiiiiiIIIII.length() - IiiiiiiiIIIII5;
        }
        return IiiiiiiiIIIII;
    }

    public IIiiIiiiIiiiI(GameView gameView) {
        super(18, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 574, 451, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6280\u80fd");
        this.iIiIiiiiIiIii = new com.xy.i.IiIiIiiiiIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new com.xy.i.IiIiIiiiiIIiI("sc/e/28.png", 1, 42 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "", (IiiiIiiiiIiIi)this);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(68 + 164 * IiiiiiiiIIIII, 397, 68, 17);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u652f\u63f4\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u5220\u9664\u6280\u80fd" : ""));
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)52, (int)(28 + IiiiiiiiIIIII * 85), (int)487, (int)21, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5929\u751f\u6280\u80fd" : (IiiiiiiiIIIII == 1 ? "\u9886\u609f\u6280\u80fd" : ""));
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IIiIiiiiIiiIi[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIiIiiiiIiiIi(this, 1, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(159, 144, 50, 50);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(89, 184, 50, 50);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(63, 254, 50, 50);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(89, 324, 50, 50);
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(159, 364, 50, 50);
            } else if (IiiiiiiiIIIII == 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(229, 324, 50, 50);
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(159, 254, 50, 50);
            } else if (IiiiiiiiIIIII == 7) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(255, 254, 50, 50);
            } else if (IiiiiiiiIIIII == 8) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(229, 184, 50, 50);
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(this.iIiiIiiiiiiII[IiiiiiiiIIIII].getX() - 2, this.iIiiIiiiiiiII[IiiiiiiiIIIII].getY() - 2, 54, 54);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new ArrayList<IIiIiiiiIiiIi>();
        this.IiIIIiiiiIiiI = new IiIiIiiiiIIiI(this);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)318, (int)136, (int)233, (int)280, (Component)this.IiIIIiiiiIiiI, (int)30);
        this.add(this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(52, 28 + IiiiiiiiIIIII * 85, 487, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(52, 28, 487, 80);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/58.png");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(52, 133, 264, 291);
            } else if (IiiiiiiiIIIII == 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(316, 134, 223, 290);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    public static String ALLATORIxDEMO(String[] v, int i) {
        if (v.length <= i + 1) return null;
        String[] IiiiiiiiIIIII = v[i + 1].split("=");
        if (IiiiiiiiIIIII.length <= 1) return null;
        if (IiiiiiiiIIIII[1].equals("{\u516c\u5f0f\u4e00}")) return "1";
        if (IiiiiiiiIIIII[1].equals("{\u516c\u5f0f\u4e8c}")) return "1";
        if (IiiiiiiiIIIII[1].equals("{\u516c\u5f0f\u4e09}")) return "1";
        if (IiiiiiiiIIIII[1].equals("{\u516c\u5f0f\u56db}")) return "1";
        if (!IiiiiiiiIIIII[1].equals("{\u516c\u5f0f\u4e94}")) return null;
        return "1";
    }

    /*
     * Handled impossible loop by duplicating code
     */
    public static String ALLATORIxDEMO(String vs) {
        CharSequence IiiiiiiiIIIII;
        block8: {
            int IiiiiiiiIIIII2;
            String[] IiiiiiiiIIIII3;
            String[] IiiiiiiiIIIII4;
            block7: {
                CharSequence IiiiiiiiIIIII5;
                Matcher IiiiiiiiIIIII6 = Pattern.compile(">(.*?)<").matcher(vs);
                Matcher IiiiiiiiIIIII7 = Pattern.compile("'#(.*?)'").matcher(vs);
                StringBuffer IiiiiiiiIIIII8 = new StringBuffer();
                while (IiiiiiiiIIIII7.find()) {
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII7.group();
                    if (!IiiiiiiiIIIII8.toString().equals("")) {
                        IiiiiiiiIIIII8.append("|");
                    }
                    IiiiiiiiIIIII8.append(((String)IiiiiiiiIIIII5).split("'#")[1].split("'")[0]);
                }
                IiiiiiiiIIIII5 = new StringBuffer();
                while (IiiiiiiiIIIII6.find()) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII6.group();
                    if (((String)IiiiiiiiIIIII).equals("><")) continue;
                    if (!((StringBuffer)IiiiiiiiIIIII5).toString().equals("")) {
                        ((StringBuffer)IiiiiiiiIIIII5).append("|");
                    }
                    ((StringBuffer)IiiiiiiiIIIII5).append(((String)IiiiiiiiIIIII).split(">")[1].split("<")[0]);
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII4 = IiiiiiiiIIIII8.toString().split("\\|");
                IiiiiiiiIIIII3 = ((StringBuffer)IiiiiiiiIIIII5).toString().split("\\|");
                IiiiiiiiIIIII2 = 0;
                if (!true) break block7;
                if (IiiiiiiiIIIII2 >= IiiiiiiiIIIII4.length) return ((StringBuffer)IiiiiiiiIIIII).toString();
                if (IiiiiiiiIIIII2 >= IiiiiiiiIIIII3.length) break block8;
            }
            do {
                if (!((StringBuffer)IiiiiiiiIIIII).toString().equals("")) {
                    ((StringBuffer)IiiiiiiiIIIII).append("|");
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(IiiiiiiiIIIII4[IiiiiiiiIIIII2]));
                String string = IiiiiiiiIIIII3[IiiiiiiiIIIII2];
                ++IiiiiiiiIIIII2;
                ((StringBuffer)IiiiiiiiIIIII).append(stringBuilder.append("=").append(string).toString());
                if (IiiiiiiiIIIII2 >= IiiiiiiiIIIII4.length) return ((StringBuffer)IiiiiiiiIIIII).toString();
            } while (IiiiiiiiIIIII2 < IiiiiiiiIIIII3.length);
        }
        return ((StringBuffer)IiiiiiiiIIIII).toString();
    }

    public static String ALLATORIxDEMO(int id, int pz) {
        if (id == 1858) {
            return "\u56de\u5408\u524d\uff0c\u5df1\u65b9\u5904\u4e8e\u5012\u5730\u72b6\u6001\u7684\u4eba\u7269\u8d8a\u591a\uff0c\u89e6\u53d1\u51e0\u7387\u63d0\u5347\u8d8a\u591a\u3002\u6700\u591a\u63d0\u5347" + pz * 20 + "%\uff08\u6240\u6709\u4eba\u7269\u90fd\u5012\u5730\u65f6\uff09\u3002";
        }
        if (id == 1880) {
            return "\u53ec\u5524\u517d\u79bb\u573a\u65f6\uff0c\u5bf9\u65b9\u548c\u81ea\u5df1\u9020\u578b\u76f8\u540c\u7684\u53ec\u5524\u517d\u8d8a\u591a\uff0c\u89e6\u53d1\u51e0\u7387\u63d0\u5347\u8d8a\u591a\u3002\u6700\u591a\u63d0\u5347" + pz * 10 + "%\u3002";
        }
        if (id == 1839) {
            return "\u5931\u8d25\u65f6\uff0c" + pz * 10 + "%\u6982\u7387\u81ea\u5df1\u4e0d\u6b7b\u4ea1\u3002";
        }
        if (id == 1600) {
            return "\u76ee\u6807\u7684\u6297\u5f3a\u529b\u514b\u91d1\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 2 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1601) {
            return "\u76ee\u6807\u7684\u6297\u5f3a\u529b\u514b\u6728\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 2 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1602) {
            return "\u76ee\u6807\u7684\u6297\u5f3a\u529b\u514b\u571f\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 2 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1603) {
            return "\u76ee\u6807\u7684\u6297\u5f3a\u529b\u514b\u6c34\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 2 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1604) {
            return "\u76ee\u6807\u7684\u6297\u5f3a\u529b\u514b\u706b\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 2 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1605) {
            return "\u76ee\u6807\u7684\u6297\u65e0\u5c5e\u6027\u4f24\u5bb3\u6bcf\u56de\u5408\u51cf\u5c11" + pz * 1 + "%\u3002\u9996\u56de\u5408\u4e0d\u51cf\u5c11\u3002\uff08\u4ec5\u5728\u53d7\u5230\u4eba\u7269\u4f24\u5bb3\u65f6\u751f\u6548\u3002\uff09";
        }
        if (id == 1850) {
            return "\u5982\u679c\u56de\u5408\u672b\u5904\u4e8e\u88ab\u6df7\u72b6\u6001\u65f6\uff0c\u4e0b\u56de\u5408\u8131\u6df7\u6982\u7387\u63d0\u5347" + pz * 5 + "%\u3002\u6bcf\u6b21\u8131\u6df7\u65f6\uff0c" + pz * 3 + "%\u6982\u7387\u83b7\u5f97\u5f53\u56de\u5408\u7684\u514d\u75ab\u6297\u6df7\u6548\u679c\u3002\u6280\u80fd\u89e6\u53d1\u6216\u56de\u5408\u672b\u4e0d\u5904\u4e8e\u88ab\u6df7\u72b6\u6001\uff0c\u989d\u5916\u6982\u7387\u6e05\u96f6\u3002";
        }
        if (id == 1852) {
            return "\u5982\u679c\u56de\u5408\u672b\u5904\u4e8e\u88ab\u5c01\u72b6\u6001\u65f6\uff0c\u4e0b\u56de\u5408\u8131\u5c01\u6982\u7387\u63d0\u5347" + pz * 5 + "%\u3002\u6bcf\u6b21\u8131\u5c01\u65f6\uff0c" + pz * 3 + "%\u6982\u7387\u83b7\u5f97\u5f53\u56de\u5408\u7684\u514d\u75ab\u6297\u5c01\u6548\u679c\u3002\u6280\u80fd\u89e6\u53d1\u6216\u56de\u5408\u672b\u4e0d\u5904\u4e8e\u88ab\u5c01\u72b6\u6001\uff0c\u989d\u5916\u6982\u7387\u6e05\u96f6\u3002";
        }
        if (id == 1854) {
            return "\u5982\u679c\u56de\u5408\u672b\u5904\u4e8e\u88ab\u5fd8\u72b6\u6001\u65f6\uff0c\u4e0b\u56de\u5408\u8131\u5fd8\u6982\u7387\u63d0\u5347" + pz * 5 + "%\u3002\u6bcf\u6b21\u8131\u5fd8\u65f6\uff0c" + pz * 3 + "%\u6982\u7387\u83b7\u5f97\u5f53\u56de\u5408\u7684\u514d\u75ab\u6297\u5fd8\u6548\u679c\u3002\u6280\u80fd\u89e6\u53d1\u6216\u56de\u5408\u672b\u4e0d\u5904\u4e8e\u88ab\u5fd8\u72b6\u6001\uff0c\u989d\u5916\u6982\u7387\u6e05\u96f6\u3002";
        }
        if (id == 1820) {
            return "\u8fdb\u573a\u65f6\uff0c" + pz * 10 + "%\u6982\u7387\u81ea\u52a8\u653b\u51fb\u5f53\u524d\u8840\u91cf\u6700\u5c11\u5355\u4f4d\u3002";
        }
        if (id == 1822) {
            return "\u8fdb\u573a\u65f6\uff0c" + pz * 10 + "%\u6982\u7387\u81ea\u52a8\u653b\u51fb\u5f53\u524d\u8840\u91cf\u6700\u5c11\u5355\u4f4d\u3002";
        }
        if (id == 1833) {
            return "\u9ad8\u7ea7\u5206\u88c2\u653b\u51fb\u89e6\u53d1\u6982\u7387\u589e\u52a0" + pz * 1 + "%\u3002";
        }
        if (id == 1831) {
            return "\u5206\u82b1\u62c2\u67f3\u89e6\u53d1\u65f6\uff0c\u589e\u52a0" + (double)pz * 1.5 + "%\u547d\u4e2d\uff0c" + pz * 2000 + "\u653b\u51fb\u529b\u3002";
        }
        if (id == 1834) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u60ac\u5203\u53ef\u4ee5\u89e6\u53d1\u4e24\u6b21\u3002";
        }
        if (id == 1836) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u9057\u60a3\u53ef\u4ee5\u89e6\u53d1\u4e24\u6b21\u3002";
        }
        if (id == 1835) {
            return "\u5982\u679c\u4e00\u4e2a\u5355\u4f4d\u6ca1\u6709\u89e6\u53d1\uff0c\u4e0b\u4e00\u5355\u4f4d\u89e6\u53d1\u6982\u7387\u63d0\u5347" + pz * 2 + "%\u3002\u89e6\u53d1\u65f6\uff0c\u989d\u5916\u9020\u6210\u6700\u5927\u8840\u91cf" + (double)pz * 1.5 + "%\u7684\u4f24\u5bb3\u3002\u6bcf\u56de\u5408\u5f00\u59cb\u6216\u8005\u89e6\u53d1\u4e00\u6b21\u540e\uff0c\u989d\u5916\u6982\u7387\u5f52\u96f6\u3002";
        }
        if (id == 1865) {
            return "\u654c\u65b9\u4eba\u7269\u5355\u4f4d\u7684\u8fde\u51fb\u7387\u51cf\u5c11" + pz * 1 + "%\u3002";
        }
        if (id == 1611) {
            return String.valueOf(pz * 5) + "%\u6982\u7387\u589e\u52a01\u5355\u4f4d\uff0c\u56de\u590d\u8840\u6cd5\u6bd4\u4f8b\u589e\u52a0" + pz * 1 + "%\u3002";
        }
        if (id == 1871) {
            return String.valueOf(pz * 6) + "%\u6982\u7387\u589e\u52a01\u5355\u4f4d\u3002";
        }
        if (id == 1872) {
            return String.valueOf(pz * 6) + "%\u6982\u7387\u589e\u52a01\u5355\u4f4d\u3002";
        }
        if (id == 1612) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u589e\u52a01\u5355\u4f4d\u3002";
        }
        if (id == 1838) {
            return "\u89e6\u53d1\u5409\u4eba\u5929\u76f8\u65f6\uff0c" + pz * 10 + "%\u6982\u7387\u5c06\u6700\u5927\u8840\u91cf\u768430%\u8f6c\u5316\u4e3a\u62a4\u76fe\u3002";
        }
        if (id == 1873) {
            return "\u672c\u65b9\u6bcf\u6b7b\u4ea1\u4e00\u4e2a\u53ec\u5524\u517d\uff0c\u63d0\u5347" + (2.0 + (double)pz * 0.3) + "%\u4ed9\u6cd5\u9b3c\u706b\u6297\u6027\u3002\u4e0a\u9650\u589e\u52a0\u81f3" + (30 + pz) + "%\u3002\uff08\u66ff\u6362\u539f\u6548\u679c\uff09";
        }
        if (id == 1884) {
            return "\u89e6\u53d1\u6c89\u96fe\u6548\u679c\u540e\uff0c\u6b64\u6cd5\u672f\u7684\u76ee\u6807\u6570\u6709" + pz * 10 + "%\u6982\u7387\u51cf\u5c11\u539f\u672c\u76ee\u6807\u6570\u4e58\u4ee50.3(\u5c0f\u6570\u90e8\u5206\u6982\u7387\u51cf1\u4e2a\u5355\u4f4d \u4f8b5\u4e2a\u5355\u4f4d 50%\u51cf\u5c111\u4e2a 50%\u51cf\u5c112\u4e2a)\u3002";
        }
        if (id == 1885) {
            return "\u5931\u8d25\u65f6," + pz * 10 + "%\u6982\u7387\u81ea\u5df1\u4e0d\u6b7b\u4ea1\u3002";
        }
        if (id == 1891) {
            return "\u88ab\u81f4\u6b7b\u7684\u76ee\u6807,\u6263\u9664\u6cd5\u91cf\u6bd4\u4f8b\u63d0\u5347" + pz * 10 + "%";
        }
        if (id == 1881) {
            return String.valueOf(pz * 8) + "%\u6982\u7387\u53d6\u6d88\u654c\u65b9\u9996\u4e2a\u53ec\u5524\u517d\u6307\u4ee4";
        }
        if (id == 1882) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u8ffd\u52a0\u4e00\u56de\u5408";
        }
        if (id == 1883) {
            return "\u4f7f\u53d7\u5230\u4f24\u5bb3\u589e\u52a030%";
        }
        if (id == 1867) {
            return "\u6280\u80fd\u9644\u52a0" + pz + "\u9636\u542f\u7075\u6548\u679c";
        }
        if (id == 1868) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u4e0d\u7528\u8fdb\u5165\u51b7\u5374(\u53ea\u4f1a\u751f\u6548\u4e00\u6b21)";
        }
        if (id == 1869) {
            return "\u6280\u80fd\u751f\u6548\u6982\u7387\u63d0\u5347" + pz * 10 + "%\u3002";
        }
        if (id == 1841) {
            return "\u63d0\u9ad8\u53cc\u7ba1\u4f24\u5bb3" + pz * 2000;
        }
        if (id == 1842) {
            return String.valueOf(pz * 6) + "%\u6982\u7387\u989d\u5916\u56de\u590d\u53ec\u5524\u517d\u4e3b\u4eba10%\u6c14\u8840\u548c\u6cd5\u529b";
        }
        if (id == 1828) {
            return String.valueOf(pz * 6) + "%\u6982\u7387\u5316\u65e0\u53ef\u4ee5\u89e6\u53d1\u4e24\u6b21\u3002";
        }
        if (id == 1829) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u4e0d\u7528\u79bb\u573a";
        }
        if (id == 1830) {
            return String.valueOf(pz * 6) + "%\u6982\u7387\u989d\u5916\u56de\u590d\u53ec\u5524\u517d\u4e3b\u4eba10%\u6c14\u8840\u548c\u6cd5\u529b";
        }
        if (id == 1606) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u4e0d\u7528\u8fdb\u5165\u51b7\u5374(\u53ea\u4f1a\u751f\u6548\u4e00\u6b21)";
        }
        if (id == 1607) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u989d\u5916\u589e\u52a0\u4e00\u4e2a\u76ee\u6807";
        }
        if (id == 1608) {
            return String.valueOf(pz * 10) + "%\u6982\u7387\u4e0d\u7528\u8fdb\u5165\u51b7\u5374(\u53ea\u4f1a\u751f\u6548\u4e00\u6b21)";
        }
        if (id == 1890) {
            return String.valueOf(pz * 10) + "%\u7684\u6982\u7387\u589e\u52a0\u4e00\u4e2a\u5355\u4f4d";
        }
        if (id == 1895) {
            return "\u6280\u80fd\u751f\u6548\u6982\u7387\u63d0\u5347" + pz * 20 + "%";
        }
        if (id == 1900) {
            return "\u79bb\u573a\u65f6,\u6839\u636e\u652f\u63f4\u5217\u8868\u672a\u5165\u573a\u7684\u53ec\u5524\u517d\u4e0e\u5f53\u524d\u79bb\u573a\u53ec\u5524\u517d\u9020\u578b\u76f8\u540c\u7684\u4e2a\u6570,\u989d\u5916\u589e\u52a0\u95ea\u73b0\u6982\u7387\u3002\u6bcf\u4e2a\u589e\u52a0" + 0.2 * (double)pz + "%(\u6700\u591a\u589e\u52a0" + 1 * pz + "%)";
        }
        if (id != 3036) return null;
        if (pz == 1) {
            return "\u654c\u65b9\u53ec\u5524\u517d\u670918%\u4e0b\u56de\u5408\u4e0d\u80fd\u91ca\u653e\u81ea\u8eab\u643a\u5e26\u6280\u80fd\u3002\uff08\u4e0d\u5305\u542b\u53ec\u5524\u517d\u6280\u80fd\uff09\u67093%\u62b5\u6297\u654c\u65b9\u7684\u5929\u8d4b\u538b\u5236";
        }
        if (pz == 2) {
            return "\u654c\u65b9\u53ec\u5524\u517d\u670919%\u4e0b\u56de\u5408\u4e0d\u80fd\u91ca\u653e\u81ea\u8eab\u643a\u5e26\u6280\u80fd\u3001\u4e0d\u80fd\u89e6\u53d1\u5185\u4e39\u6548\u679c\u548c\u65bd\u653e\u5185\u4e39\u6280\u80fd\u3002\u67094.5%\u62b5\u6297\u654c\u65b9\u7684\u5929\u8d4b\u538b\u5236";
        }
        if (pz == 3) {
            return "\u654c\u65b9\u53ec\u5524\u517d\u670920%\u4e0b\u56de\u5408\u4e0d\u80fd\u91ca\u653e\u81ea\u8eab\u643a\u5e26\u6280\u80fd\u3001\u4e0d\u80fd\u89e6\u53d1\u5185\u4e39\u6548\u679c\u548c\u65bd\u653e\u5185\u4e39\u6280\u80fd\u3001\u4e0d\u80fd\u4fdd\u62a4\u5176\u4ed6\u76ee\u6807\u3002\u67096%\u62b5\u6297\u654c\u65b9\u7684\u5929\u8d4b\u538b\u5236";
        }
        if (pz == 4) {
            return "\u654c\u65b9\u53ec\u5524\u517d\u670921%\u4e0b\u56de\u5408\u4e0d\u80fd\u91ca\u653e\u81ea\u8eab\u643a\u5e26\u6280\u80fd\u3001\u4e0d\u80fd\u89e6\u53d1\u5185\u4e39\u6548\u679c\u548c\u65bd\u653e\u5185\u4e39\u6280\u80fd\u3001\u4e0d\u80fd\u4fdd\u62a4\u5176\u5b83\u76ee\u6807\u3001\u4e0d\u80fd\u8fdb\u884c\u7269\u7406\u653b\u51fb\u3002\u67097.5%\u62b5\u6297\u654c\u65b9\u7684\u5929\u8d4b\u538b\u5236";
        }
        if (pz != 5) return null;
        return "\u654c\u65b9\u53ec\u5524\u517d\u670922%\u4e0b\u56de\u5408\u4e0d\u80fd\u91ca\u653e\u81ea\u8eab\u643a\u5e26\u6280\u80fd\u3001\u4e0d\u80fd\u89e6\u53d1\u5185\u4e39\u6548\u679c\u548c\u65bd\u653e\u5185\u4e39\u6280\u80fd\u3001\u4e0d\u80fd\u9009\u62e9\u4fdd\u62a4\u3001\u4e0d\u80fd\u8fdb\u884c\u7269\u7406\u653b\u51fb\u3001\u4e0d\u80fd\u4f7f\u7528\u7269\u54c1\u680f\u3002\u67099%\u62b5\u6297\u654c\u65b9\u7684\u5929\u8d4b\u538b\u5236";
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(RoleSummoning pet) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII22;
        Object IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4;
        this.iiiIiiiiiiIIi();
        if (pet == null) {
            return;
        }
        ArrayList<String> IiiiiiiiIIIII5 = new ArrayList<String>();
        if (pet.getPetSkills() != null && !pet.getPetSkills().equals("")) {
            String[] IiiiiiiiIIIII6 = pet.getPetSkills().split("\\|");
            IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII6.length) {
                if (!(IiiiiiiiIIIII6[IiiiiiiiIIIII4].startsWith("L") || IiiiiiiiIIIII6[IiiiiiiiIIIII4].startsWith("Q") || IiiiiiiiIIIII6[IiiiiiiiIIIII4].startsWith("T") || IiiiiiiiIIIII6[IiiiiiiiIIIII4].startsWith("X"))) {
                    IiiiiiiiIIIII5.add(IiiiiiiiIIIII6[IiiiiiiiIIIII4]);
                }
                ++IiiiiiiiIIIII4;
            }
        }
        int IiiiiiiiIIIII7 = pet.getOpenSealByType(0);
        IiiiiiiiIIIII4 = pet.getOpenSealByType(1);
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < 9) {
            if (IiiiiiiiIIIII8 >= IiiiiiiiIIIII7) {
                if (this.ALLATORIxDEMO().gamePetSkill && IiiiiiiiIIIII8 >= IiiiiiiiIIIII4) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII8].ALLATORIxDEMO(-2, -1);
                } else {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII8].ALLATORIxDEMO(-1, -1);
                }
            } else if (IiiiiiiiIIIII8 == 6 && pet.getBeastSkills() != null && !pet.getBeastSkills().equals("")) {
                this.iIiiIiiiiiiII[6].ALLATORIxDEMO(Integer.parseInt(pet.getBeastSkills()), -1);
            } else if (IiiiiiiiIIIII8 < 6 && IiiiiiiiIIIII5 != null && IiiiiiiiIIIII8 < IiiiiiiiIIIII5.size() || IiiiiiiiIIIII8 > 6 && IiiiiiiiIIIII5 != null && IiiiiiiiIIIII8 - 1 < IiiiiiiiIIIII5.size()) {
                IiiiiiiiIIIII3 = (String)IiiiiiiiIIIII5.get(IiiiiiiiIIIII8 < 6 ? IiiiiiiiIIIII8 : IiiiiiiiIIIII8 - 1);
                IiiiiiiiIIIII22 = ((String)IiiiiiiiIIIII3).indexOf("=");
                IiiiiiiiIIIII = IiiiiiiiIIIII22 == -1 ? -1 : Integer.parseInt(((String)IiiiiiiiIIIII3).substring(IiiiiiiiIIIII22 + 1));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII8].ALLATORIxDEMO(Integer.parseInt((String)(IiiiiiiiIIIII22 == -1 ? IiiiiiiiIIIII3 : ((String)IiiiiiiiIIIII3).substring(0, IiiiiiiiIIIII22))), IiiiiiiiIIIII);
            } else {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII8].ALLATORIxDEMO(0, -1);
            }
            ++IiiiiiiiIIIII8;
        }
        IiiiiiiiIIIII8 = 0;
        if (pet.getSkill() != null && !pet.getSkill().equals("")) {
            IiiiiiiiIIIII3 = pet.getSkill().split("\\|");
            IiiiiiiiIIIII22 = 0;
            while (IiiiiiiiIIIII22 < ((String[])IiiiiiiiIIIII3).length) {
                Skill IiiiiiiiIIIII9 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII3[IiiiiiiiIIIII22]);
                if (IiiiiiiiIIIII9 != null) {
                    void IiiiiiiiIIIII10;
                    IIiIiiiiIiiIi iIiIiiiiIiiIi = this.ALLATORIxDEMO(IiiiiiiiIIIII8);
                    ++IiiiiiiiIIIII8;
                    IiiiiiiiIIIII10.setVisible(true);
                    iIiIiiiiIiiIi.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII9.getSkillid()), -1);
                }
                ++IiiiiiiiIIIII22;
            }
        }
        if ((IiiiiiiiIIIII3 = this.ALLATORIxDEMO().iIiIiiiiIIiii("3036")) == null) {
            return;
        }
        IIiIiiiiIiiIi IiiiiiiiIIIII22 = this.ALLATORIxDEMO(IiiiiiiiIIIII8);
        ++IiiiiiiiIIIII8;
        IiiiiiiiIIIII22.setVisible(true);
        IiiiiiiiIIIII = pet.getTFNum();
        IiiiiiiiIIIII22.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII3.getSkillid()), IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII : -1);
        IiiiiiiiIIIII22.setBounds(482, 50, 55, 55);
    }

    public static boolean ALLATORIxDEMO(int id, GameClient gameClient) {
        if (gameClient.gameType == 2) {
            if (id >= 1606) {
                if (id <= 1608) return false;
            }
            if (id >= 1828) {
                if (id <= 1830) return false;
            }
            if (id >= 1840) {
                if (id <= 1842) return false;
            }
            if (id >= 1867) {
                if (id <= 1869) return false;
            }
            if (id >= 1881 && id <= 1883) {
                return false;
            }
        }
        if (id >= 1600) {
            if (id <= 1605) return true;
        }
        if (id == 1611) return true;
        if (id == 1612) return true;
        if (id == 1820) return true;
        if (id == 1822) return true;
        if (id == 1831) return true;
        if (id == 1833) return true;
        if (id >= 1834) {
            if (id <= 1836) return true;
        }
        if (id == 1838) return true;
        if (id == 1839) return true;
        if (id == 1850) return true;
        if (id == 1852) return true;
        if (id == 1854) return true;
        if (id == 1858) return true;
        if (id == 1865) return true;
        if (id >= 1871) {
            if (id <= 1873) return true;
        }
        if (id == 1880) return true;
        if (id == 1884) return true;
        if (id == 1885) return true;
        if (id == 1606) return true;
        if (id == 1607) return true;
        if (id == 1608) return true;
        if (id == 1828) return true;
        if (id == 1829) return true;
        if (id == 1830) return true;
        if (id == 1841) return true;
        if (id == 1842) return true;
        if (id == 1867) return true;
        if (id == 1868) return true;
        if (id == 1869) return true;
        if (id == 1881) return true;
        if (id == 1882) return true;
        if (id == 1883) return true;
        if (id == 1890) return true;
        if (id == 1891) return true;
        if (id == 1895) return true;
        if (id == 1900) return true;
        return false;
    }

    public IIiIiiiiIiiIi ALLATORIxDEMO(int index) {
        if (index < this.iiIiiiiiiiIii.size()) {
            this.iiIiiiiiiiIii.get(index).setBounds(55 + 57 * index, 50, 55, 55);
            return this.iiIiiiiiiiIii.get(index);
        }
        IIiIiiiiIiiIi IiiiiiiiIIIII = new IIiIiiiiIiiIi(this, 0, this.iiIiiiiiiiIii.size());
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII;
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        RoleSummoning IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        Skill IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 == null) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u6280\u80fd");
            return;
        }
        boolean IiiiiiiiIIIII4 = false;
        String IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getBeastSkills();
        if (IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.equals(IiiiiiiiIIIII3.getSkillid())) {
            IiiiiiiiIIIII4 = true;
        }
        if (!IiiiiiiiIIIII4 && (IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getPetSkills()) != null && !IiiiiiiiIIIII5.equals("")) {
            String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII5.split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII6.length) {
                if (IiiiiiiiIIIII6[IiiiiiiiIIIII].indexOf("=") == -1) {
                    if (IiiiiiiiIIIII6[IiiiiiiiIIIII].equals(IiiiiiiiIIIII3.getSkillid())) {
                        IiiiiiiiIIIII4 = true;
                        break;
                    }
                } else if (IiiiiiiiIIIII6[IiiiiiiiIIIII].startsWith(String.valueOf(IiiiiiiiIIIII3.getSkillid()) + "=")) {
                    IiiiiiiiIIIII4 = true;
                    break;
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (!IiiiiiiiIIIII4) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u4e0d\u80fd\u5220\u9664\u5929\u751f\u6280\u80fd");
            return;
        }
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(12, IiiiiiiiIIIII2.getSid() + "|" + IiiiiiiiIIIII3.getSkillid(), "#Y\u4f60\u786e\u5b9a\u8981\u5220\u9664 #G" + IiiiiiiiIIIII3.getSkillname() + "#Y\u8fd9\u4e2a\u6280\u80fd\u5417?"));
            return;
        }
        if (IiiiiiiiIIIII3.getSkilltype().equals("3") && !IiiiiiiiIIIII3.getSkillid().equals("3034")) {
            int IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
                Skill IiiiiiiiIIIII8;
                Skill skill = IiiiiiiiIIIII8 = IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]) > 0 ? this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IIiIiiiiIiiIi.iIiIiiiiIIiii((IIiIiiiiIiiIi)this.iIiiIiiiiiiII[IiiiiiiiIIIII]))) : null;
                if (IiiiiiiiIIIII8 != null && IiiiiiiiIIIII8.getSkilltype().equals("3")) {
                    ++IiiiiiiiIIIII7;
                }
                ++IiiiiiiiIIIII;
            }
            if (IiiiiiiiIIIII7 >= 2) {
                int n = IiiiiiiiIIIII7 == 2 ? 100 : (IiiiiiiiIIIII = IiiiiiiiIIIII7 == 3 ? 500 : 3000);
                if (this.ALLATORIxDEMO().IiiIiiiiiiIiI()) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII7 == 2 ? 100 : (IiiiiiiiIIIII7 == 3 ? 200 : 500);
                }
                this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(12, IiiiiiiiIIIII2.getSid() + "|" + IiiiiiiiIIIII3.getSkillid(), "#Y\u4f60\u662f\u5426\u8981\u786e\u5b9a\u82b1\u8d39" + IiiiiiiiIIIII + "\u79ef\u5206,\u8fdb\u884c\u7ec8\u6781\u6280\u80fd\u91cd\u4fee"));
                return;
            }
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(12, IiiiiiiiIIIII2.getSid() + "|" + IiiiiiiiIIIII3.getSkillid(), "#Y\u4f60\u662f\u5426\u8981\u786e\u5b9a\u82b1\u8d3910W\u5927\u8bdd\u5e01,\u5220\u9664#G" + IiiiiiiiIIIII3.getSkillname() + "#Y\u8fd9\u4e2a\u6280\u80fd\u5417\uff1f(\u5982\u679c\u662f\u7ec8\u6781\u6280\u80fd\u4e14\u6ca1\u6709\u9886\u609f???\u4f1a\u91cd\u4fee\u6210???)"));
    }

    public void iIiIiiiiIIiii() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII.getChosePet());
        super.iIiIiiiiIIiii();
    }

    public static String ALLATORIxDEMO(int id, Skill skill, double sld, int lvl, int zs) {
        if (id < 1001) return null;
        if (id > 1100) {
            return null;
        }
        if (skill.getFormulas() != null) {
            return IIiiIiiiIiiiI.iIiIiiiiIIiii(id, skill, sld, lvl, zs);
        }
        String IiiiiiiiIIIII = skill.getRemark();
        int IiiiiiiiIIIII2 = Integer.parseInt(skill.getSkilllevel());
        double IiiiiiiiIIIII3 = Double.parseDouble(skill.getGrow());
        double IiiiiiiiIIIII4 = Double.parseDouble(skill.getDielectric());
        double IiiiiiiiIIIII5 = Double.parseDouble(skill.getValue());
        String IiiiiiiiIIIII6 = id <= 1005 ? "\u6df7\u4e71" : (id <= 1010 ? "\u5c01\u5370" : (id <= 1015 ? "\u660f\u7761" : (id <= 1020 ? "\u4e2d\u6bd2" : (id <= 1025 ? "\u9707\u6151" : (id <= 1030 ? "\u529b\u91cf" : (id <= 1035 ? "\u6297\u6027" : (id <= 1040 ? "\u52a0\u901f" : (id <= 1045 ? "\u98ce" : (id <= 1050 ? "\u96f7" : (id <= 1055 ? "\u6c34" : (id <= 1060 ? "\u706b" : (id <= 1065 ? "\u9b3c\u706b" : (id <= 1070 ? "\u4e09\u5c38\u866b" : (id <= 1075 ? "\u9057\u5fd8" : (id <= 1080 ? "smmh" : (id <= 1085 ? "\u9739\u96f3" : (id <= 1090 ? "\u6ca7\u6ce2" : (id <= 1095 ? "\u7518\u9716" : "\u6276\u6447"))))))))))))))))));
        IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u4e2a\u6570|", String.valueOf(FBUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII2, (int)((int)sld), (String)IiiiiiiiIIIII6)));
        if (id <= 1015 || id >= 1071 && id <= 1075) {
            BigDecimal IiiiiiiiIIIII7 = new BigDecimal(IiiiiiiiIIIII5 + IiiiiiiiIIIII3 * new BigDecimal(Math.pow(sld, 0.3)).setScale(2, 4).doubleValue());
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u51e0\u7387|", IiiiiiiiIIIII7.setScale(2, 4).toString());
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u56de\u5408|", "7");
        } else if (id <= 1020) {
            BigDecimal IiiiiiiiIIIII8 = new BigDecimal((double)((int)((IiiiiiiiIIIII5 + sld * IiiiiiiiIIIII3 / 1000.0) * 1000.0)) / 15.0 * 17.0);
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u4f24\u5bb3|", IiiiiiiiIIIII2 > 3 ? "15" : (IiiiiiiiIIIII2 > 1 ? "12.5" : "10"));
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u51e0\u7387|", IiiiiiiiIIIII8.setScale(2, 4).toString());
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u56de\u5408|", "3");
        } else if (id <= 1040 || id >= 1076 && id <= 1080) {
            BigDecimal IiiiiiiiIIIII9 = new BigDecimal((double)((int)((IiiiiiiiIIIII5 + sld * IiiiiiiiIIIII3 / 1000.0) * 1000.0)) / 10.0);
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u56de\u5408|", "7");
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u4f24\u5bb3|", IiiiiiiiIIIII9.setScale(2, 4).toString());
        } else if (id <= 1065 || id >= 1081) {
            BigDecimal IiiiiiiiIIIII10 = new BigDecimal((IiiiiiiiIIIII5 + IiiiiiiiIIIII3 * (1.0 + 5.0 * sld / 5000.0 * (10.0 - sld / 5000.0) / 2.0)) * (double)lvl);
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u4f24\u5bb3|", String.valueOf(IiiiiiiiIIIII10.intValue()));
        } else if (id <= 1070) {
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u4f24\u5bb3|", String.valueOf((int)((IiiiiiiiIIIII5 * (double)lvl + sld * IiiiiiiiIIIII3 / 1000.0) * 1000.0)));
            IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u51e0\u7387|", String.valueOf((int)(IiiiiiiiIIIII5 * 100.0 + (double)((int)(sld / 250.0)))));
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.replace("|\u84dd|", String.valueOf((int)(IiiiiiiiIIIII4 * (sld / 25000.0 + 1.0))));
        return IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(RoleSummoning pet, int id, int slvl, Skill skill, GameClient gameClient) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (id == 3036) {
            IiiiiiiiIIIII.append(skill.getSkillname());
        } else if (id < 1100) {
            String IiiiiiiiIIIII2 = IIiiIiiiIiiiI.ALLATORIxDEMO(id, skill, 1.0, 200, 4);
            if (IiiiiiiiIIIII2 == null) return IiiiiiiiIIIII.toString();
            IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        } else {
            String IiiiiiiiIIIII3;
            String string = IiiiiiiiIIIII3 = gameClient.gameBattle || id == 1282 ? skill.getRemark() : IIiiIiiiIiiiI.ALLATORIxDEMO(skill.getRemark());
            if (gameClient.gameBattle || id == 1282) {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII3);
            } else {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII3.split("\\|");
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                    String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4[IiiiiiiiIIIII5].split("=");
                    String IiiiiiiiIIIII7 = IIiiIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII4, IiiiiiiiIIIII5);
                    if (IiiiiiiiIIIII7 != null) {
                        IiiiiiiiIIIII.append("#c" + IiiiiiiiIIIII6[0] + " " + IiiiiiiiIIIII6[1] + "#c" + IiiiiiiiIIIII4[++IiiiiiiiIIIII5].split("=")[0] + IiiiiiiiIIIII7 + "#r");
                    } else {
                        IiiiiiiiIIIII.append("#c" + IiiiiiiiIIIII6[0] + " " + IiiiiiiiIIIII6[1] + "#r");
                    }
                    ++IiiiiiiiIIIII5;
                }
            }
        }
        return IiiiiiiiIIIII.toString();
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 45) return;
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI) == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4e00\u4e2a\u6280\u80fd");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("QL" + IiIiIiiiiIIiI.ALLATORIxDEMO((IiIiIiiiiIIiI)this.IiIIIiiiiIiiI).getSkillid() + "|" + IiiiiiiiIIIII.getSid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(IIiIiiiiIiiIi component) {
        component.setBounds(55 + 57 * this.iiIiiiiiiiIii.size(), 50, 55, 55);
        this.iiIiiiiiiiIii.add(component);
        this.add((Component)component, 0);
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            IIiIiiiiIiiIi iIiIiiiiIiiIi = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            iIiIiiiiIiiIi.setVisible(false);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            IIiIiiiiIiiIi iIiIiiiiIiiIi = this.iIiiIiiiiiiII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIiIiiiiIiiIi.ALLATORIxDEMO(-1, -1);
        }
        this.ALLATORIxDEMO(null, 0, 0, null, true);
    }
}
