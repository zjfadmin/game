/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseValue
 *  com.xy.formula.MsgUntil
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 */
package com.xy.a;

import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class IiiiIiiiiIiII
extends IiiiIiiiiIiIi {
    private List<Goodstable> IIIIiiiiiiiII;
    private Image iiIIIiiiiiiiI;
    private boolean IiIiiiiiIIIII = false;
    private boolean iiIiIiiiiIIIi = false;
    private RichLabel iiiiIiiiIiiII;
    private com.xy.q.IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private String iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private com.xy.w.IiiiIiiiiIiIi iiIiiiiiiiIii;
    private Image IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public String ALLATORIxDEMO(String jx1, String jx2, String jx3) {
        Object IiiiiiiiIIIII;
        if (jx1 == null) return null;
        if (jx2 == null) return null;
        if (jx3 == null) {
            return null;
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 3) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2 == 0 ? jx1 : (IiiiiiiiIIIII2 == 1 ? jx2 : jx3);
            int IiiiiiiiIIIII3 = ((String)IiiiiiiiIIIII).indexOf("\u89c9\u9192\u6280");
            if (IiiiiiiiIIIII3 == -1) {
                return null;
            }
            int IiiiiiiiIIIII4 = ((String)(IiiiiiiiIIIII = ((String)IiiiiiiiIIIII).substring(IiiiiiiiIIIII3))).indexOf("|");
            if (IiiiiiiiIIIII4 != -1) {
                IiiiiiiiIIIII = ((String)IiiiiiiiIIIII).substring(0, IiiiiiiiIIIII4);
            }
            if (IiiiiiiiIIIII2 == 0) {
                jx1 = IiiiiiiiIIIII;
            } else if (IiiiiiiiIIIII2 == 1) {
                jx2 = IiiiiiiiIIIII;
            } else {
                jx3 = IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII2;
        }
        String[] IiiiiiiiIIIII22 = jx1.split("\\&");
        IiiiiiiiIIIII = ((String)jx2).split("\\&");
        String[] IiiiiiiiIIIII5 = ((String)jx3).split("\\&");
        if (!IiiiiiiiIIIII22[1].equals(IiiiiiiiIIIII[1])) return null;
        if (!IiiiiiiiIIIII22[1].equals(IiiiiiiiIIIII5[1])) {
            return null;
        }
        Skill IiiiiiiiIIIII6 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII22[1]);
        double IiiiiiiiIIIII7 = MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII22[2], (String)IiiiiiiiIIIII[2], (String)IiiiiiiiIIIII5[2]).doubleValue();
        return String.valueOf(IiiiiiiiIIIII6.getSkillname()) + "(" + IiiiiiiiIIIII7 + ")";
    }

    public IiiiIiiiiIiII(GameView gameView) {
        super(42, 4, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 400, 310, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/80", (int)20, (int)20, (int)20, (int)20, (boolean)false), null);
        this.iiiiIiiiIiiII = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI, 255);
        this.iiiiIiiiIiiII.setBounds(155, 10, this.iiiiIiiiIiiII.getWidth(), this.iiiiIiiiIiiII.getHeight());
        this.add((Component)this.iiiiIiiiIiiII);
        Color IiiiiiiiIIIII = Color.decode("0xA49BC8");
        this.ALLATORIxDEMO = new JLabel[5];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII2] = new JLabel();
            this.ALLATORIxDEMO[IiiiiiiiIIIII2].setForeground(IiiiiiiiIIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII2].setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII2++]);
        }
        iiiiiiiiIIIII IiiiiiiiIIIII22 = new iiiiiiiiIIIII(2, 2, 24, 24);
        this.iiiIiiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII22);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII3].ALLATORIxDEMO("sc/c/85");
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII3++]);
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[9];
        this.IIiiIiiiIIiIi = new JLabel[9];
        IiiiiiiiIIIII = Color.decode("0xA5B4F3");
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setOpaque(true);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].setBounds(10, 180 + IiiiiiiiIIIII3 * 20, 20, 20);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII3]);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3] = new JLabel();
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setForeground(IiiiiiiiIIIII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII3].setBounds(35, 180 + IiiiiiiiIIIII3 * 20, 105, 20);
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII3++]);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ALLATORIxDEMO(RoleSummoning pet, List<Goodstable> goods, boolean center) {
        block90: {
            block89: {
                block88: {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    IiiiiiiiIIIII = Integer.parseInt(pet.getSummoningid());
                    this.iiIiIiiiiIIIi = (pet.getPetlock() >>> 0 & 1) == 1;
                    this.IiIiiiiiIIIII = (pet.getPetlock() >>> 1 & 1) == 1 || IiiiiiiiIIIII >= 100000 && IiiiiiiiIIIII <= 200000;
                    this.iiIiiiiiiiIii = pet.getPart(this.iiIIiiiiIiIIi);
                    if (this.IIIIiiiiiiiII == null) {
                        this.IIIIiiiiiiiII = new ArrayList<Goodstable>();
                    } else {
                        this.IIIIiiiiiiiII.clear();
                    }
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = null;
                    if (goods == null) break block88;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl39
                }
                if (pet.getStye() == null || pet.getStye().length() <= 1) break block89;
                IiiiiiiiIIIII = pet.getStye().split("\\|");
                IiiiiiiiIIIII = 1;
                if (true) ** GOTO lbl55
                do {
                    if ((IiiiiiiiIIIII = goods.get(IiiiiiiiIIIII)).getType() == 750L) {
                        this.IIIIiiiiiiiII.add(IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.getType() == 729L) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    } else if (IiiiiiiiIIIII.getType() == 510L) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    } else if (IiiiiiiiIIIII.getType() == 511L) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    } else if (IiiiiiiiIIIII.getType() == 512L) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
lbl39:
                    // 2 sources

                } while (IiiiiiiiIIIII < goods.size());
                break block90;
                do {
                    if (((String[])(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-"))).length >= 2 && (IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodEquip(new BigDecimal((String)IiiiiiiiIIIII[1]))) != null) {
                        if (IiiiiiiiIIIII.getType() == 729L) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                        } else if (IiiiiiiiIIIII.getType() == 510L) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                        } else if (IiiiiiiiIIIII.getType() == 511L) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                        } else if (IiiiiiiiIIIII.getType() == 512L) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl55:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            if (pet.getInnerGoods() != null && !pet.getInnerGoods().equals("")) {
                IiiiiiiiIIIII = pet.getInnerGoods().split("\\|");
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]));
                    if (IiiiiiiiIIIII != null) {
                        this.IIIIiiiiiiiII.add(IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
                }
            }
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = new ArrayList();
        if (pet.getPetSkills() != null && !pet.getPetSkills().equals("")) {
            IiiiiiiiIIIII = pet.getPetSkills().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < ((String[])IiiiiiiiIIIII).length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("L")) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII];
                } else if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("X")) {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("Q")) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                    } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("T")) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(1));
                    } else {
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                    }
                }
                ++IiiiiiiiIIIII;
            }
        }
        this.iIiIiiiiIiIii = IiiiiiiiIIIII != 0 ? String.valueOf(IiiiiiiiIIIII) + "\u9636" : null;
        this.iIiiIiiiiiiII = IiiiiiiiIIIII != 0 ? String.valueOf(IiiiiiiiIIIII) + "\u6b21" : null;
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#W");
        IiiiiiiiIIIII.append(pet.getSummoningname());
        IiiiiiiiIIIII.append("#R  ");
        IiiiiiiiIIIII.append(IiiiIiiiiIIII.ALLATORIxDEMO((int)pet.getGrade()));
        IiiiiiiiIIIII.append("#r#cFBFFC1\u6210\u957f\u7387 ");
        IiiiiiiiIIIII.append(pet.getGrowlevel());
        IiiiiiiiIIIII.append("\t \u9f99\u9aa8x");
        IiiiiiiiIIIII.append(pet.getDragon());
        if (pet.getSsn().equals("5") || pet.getSummoningid().equals("200125")) {
            IiiiiiiiIIIII.append("  \u9f99\u6d8e\u4e38\u00d7");
            IiiiiiiiIIIII.append(pet.getDraC());
        }
        IiiiiiiiIIIII = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.ALLATORIxDEMO());
        IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII[0]).length() + String.valueOf(pet.getHp()).length();
        IiiiiiiiIIIII.append("#r#c7DDE8C\u6c14\u8840 ");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
        IiiiiiiiIIIII.append("#W(" + pet.getHp() + ") ");
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII < 10) {
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.append(" ");
        }
        IiiiiiiiIIIII.append("#c7DDE8C\u653b\u51fb ");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII[2]);
        IiiiiiiiIIIII.append("#W(" + pet.getAp() + ") ");
        IiiiiiiiIIIII.append("#r#c7DDE8C\u6cd5\u529b ");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII[1]);
        IiiiiiiiIIIII.append("#W(" + pet.getMp() + ") ");
        IiiiiiiiIIIII = IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII[1]).length() + String.valueOf(pet.getMp()).length();
        while (IiiiiiiiIIIII < 10) {
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.append(" ");
        }
        IiiiiiiiIIIII.append("#c7DDE8C\u901f\u5ea6 ");
        IiiiiiiiIIIII.append(IiiiiiiiIIIII[3]);
        IiiiiiiiIIIII.append("#W(" + pet.getSp() + ") ");
        if (pet.getTurnRount() == 4) {
            IiiiiiiiIIIII.append("#r#c7DDE8C\u7985\u5b9a ");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII[4]);
            IiiiiiiiIIIII.append("#W(0)");
        }
        IiiiiiiiIIIII.append("#r#cD8AB6C\u5185   \u4e39 ");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.size()) {
            if (IiiiiiiiIIIII != 0) {
                IiiiiiiiIIIII.append("#r        ");
            }
            IiiiiiiiIIIII = this.IIIIiiiiiiiII.get(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getGoodsname());
            IiiiiiiiIIIII.append("  ");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getValue().split("\\|")[2].split("=")[1]);
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.append("\u7ea7");
        }
        if (pet.getTurnRount() >= 4) {
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 9;
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.split("=");
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII /* !! */ [0].substring(1));
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII /* !! */ [1]);
                IiiiiiiiIIIII = BaseValue.getLxLvl((int)IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII.append("#r#Y\u7075\u7280\u6280\u80fd:");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append(" \u5f00\u542f\u6280\u80fd\u683c:");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("/16");
        }
        IiiiiiiiIIIII.append("#r #r#c8EDEFF\u70bc\u5996\u6b21\u6570    ");
        IiiiiiiiIIIII.append(pet.getAlchemynum());
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        if (pet.getResistance() != null && !pet.getResistance().equals("")) {
            IiiiiiiiIIIII = pet.getResistance().split("\\|");
        }
        if (pet.getLyk() != null && !pet.getLyk().equals("")) {
            IiiiiiiiIIIII = pet.getLyk().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7269\u54c1\u4eb2\u5bc6=")) {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = null;
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = 0.0;
            IiiiiiiiIIIII = 0.0;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[1]);
                IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII[0]) + "=";
                IiiiiiiiIIIII = 0.0;
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII] != null && IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(IiiiiiiiIIIII)) {
                            IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")[1]);
                            IiiiiiiiIIIII[IiiiiiiiIIIII] = null;
                            break;
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
                IiiiiiiiIIIII.append("#r");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII[0]);
                IiiiiiiiIIIII.append(": ");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII + IiiiiiiiIIIII);
                IiiiiiiiIIIII.append("(#W");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                IiiiiiiiIIIII.append("#c8EDEFF+");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.append(")");
            }
        }
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII] != null) {
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII % 2 == 0 ? "#r" : " ");
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII].replaceAll("=", ": "));
                }
                ++IiiiiiiiIIIII;
            }
        }
        IiiiiiiiIIIII.append("#r#Y\u88c5\u5907:#r #r#Y\u89c9\u9192\u6280:");
        IiiiiiiiIIIII /* !! */  = this.ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValue() : null, IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValue() : null, IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getValue() : null);
        v0 = IiiiiiiiIIIII;
        if (IiiiiiiiIIIII /* !! */  != null) {
            v0.append((String)IiiiiiiiIIIII /* !! */ );
        } else {
            v0.append("\u672a\u89c9\u9192");
        }
        this.iiiiIiiiIiiII.setTextSize(IiiiiiiiIIIII.toString(), 255);
        this.iiiiIiiiIiiII.setBounds(155, 10, this.iiiiIiiiIiiII.getWidth(), this.iiiiIiiiIiiII.getHeight());
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(195 + 30 * IiiiiiiiIIIII, this.iiiiIiiiIiiII.getHeight() - 35, 26, 26);
            if (IiiiiiiiIIIII == 3) {
                v1 = this;
                if (IiiiiiiiIIIII != null) {
                    v1.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
                } else {
                    v1.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setVisible(true);
                }
            } else {
                IiiiiiiiIIIII = IiiiiiiiIIIII == 0 ? IiiiiiiiIIIII : (IiiiiiiiIIIII == 1 ? IiiiiiiiIIIII : IiiiiiiiIIIII);
                v2 = this;
                if (IiiiiiiiIIIII != null) {
                    v2.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
                } else {
                    v2.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                    this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setVisible(true);
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            IiiiiiiiIIIII[IiiiiiiiIIIII++] = 0;
        }
        IiiiiiiiIIIII = pet.getOpenSealByType(0);
        if (IiiiiiiiIIIII > 9) {
            IiiiiiiiIIIII = 9;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII < 9) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(false);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII++].setVisible(false);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = -1;
            if (IiiiiiiiIIIII == 6 && pet.getBeastSkills() != null && !pet.getBeastSkills().equals("")) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(pet.getBeastSkills());
            } else if (IiiiiiiiIIIII < 6 && IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.size() || IiiiiiiiIIIII > 6 && IiiiiiiiIIIII != null && IiiiiiiiIIIII - 1 < IiiiiiiiIIIII.size()) {
                IiiiiiiiIIIII = (String)IiiiiiiiIIIII.get(IiiiiiiiIIIII < 6 ? IiiiiiiiIIIII : IiiiiiiiIIIII - 1);
                IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=");
                if (IiiiiiiiIIIII != -1) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1));
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii((String)(IiiiiiiiIIIII == -1 ? IiiiiiiiIIIII : IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII)));
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII;
            if (IiiiiiiiIIIII == 6) {
                IiiiiiiiIIIII = IiiiiiiiIIIII - 1;
            } else if (IiiiiiiiIIIII > 6) {
                IiiiiiiiIIIII = IiiiiiiiIIIII - 1;
            }
            if (IiiiiiiiIIIII != null) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII.getSkillid()));
                if (IiiiiiiiIIIII != -1) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(String.valueOf(IiiiiiiiIIIII.getSkillname()) + "(" + IiiiiiiiIIIII + ")");
                } else {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII.getSkillname());
                }
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                if (IiiiiiiiIIIII == 1815) {
                    IiiiiiiiIIIII[0] = 50;
                } else if (IiiiiiiiIIIII == 1816) {
                    IiiiiiiiIIIII[1] = 50;
                } else if (IiiiiiiiIIIII == 1817) {
                    IiiiiiiiIIIII[4] = 50;
                } else if (IiiiiiiiIIIII == 1818) {
                    IiiiiiiiIIIII[3] = 50;
                } else if (IiiiiiiiIIIII == 1819) {
                    IiiiiiiiIIIII[2] = 50;
                }
            } else {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/c/85");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText("\u5df2\u5f00\u542f");
            }
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setVisible(true);
            ++IiiiiiiiIIIII;
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setVisible(true);
        }
        IiiiiiiiIIIII = 10 + this.iiiiIiiiIiiII.getHeight();
        if (180 + IiiiiiiiIIIII * 20 > IiiiiiiiIIIII) {
            IiiiiiiiIIIII = 180 + IiiiiiiiIIIII * 20;
        }
        IiiiiiiiIIIII += 30;
        IiiiiiiiIIIII = IiiiiiiiIIIII[0] != 0 || IiiiiiiiIIIII[1] != 0 || IiiiiiiiIIIII[2] != 0 || IiiiiiiiIIIII[3] != 0 || IiiiiiiiIIIII[4] != 0 ? 2 : 1;
        IiiiiiiiIIIII[0] = IiiiiiiiIIIII[0] + Integer.parseInt(pet.getGold()) / IiiiiiiiIIIII;
        IiiiiiiiIIIII[1] = IiiiiiiiIIIII[1] + Integer.parseInt(pet.getWood()) / IiiiiiiiIIIII;
        IiiiiiiiIIIII[2] = IiiiiiiiIIIII[2] + Integer.parseInt(pet.getSoil()) / IiiiiiiiIIIII;
        IiiiiiiiIIIII[3] = IiiiiiiiIIIII[3] + Integer.parseInt(pet.getFire()) / IiiiiiiiIIIII;
        IiiiiiiiIIIII[4] = IiiiiiiiIIIII[4] + Integer.parseInt(pet.getWater()) / IiiiiiiiIIIII;
        this.ALLATORIxDEMO[0].setText("\u91d1:" + IiiiiiiiIIIII[0]);
        this.ALLATORIxDEMO[1].setText("\u6728:" + IiiiiiiiIIIII[1]);
        this.ALLATORIxDEMO[2].setText("\u571f:" + IiiiiiiiIIIII[2]);
        this.ALLATORIxDEMO[3].setText("\u6c34:" + IiiiiiiiIIIII[4]);
        this.ALLATORIxDEMO[4].setText("\u706b:" + IiiiiiiiIIIII[3]);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            v3 = this.ALLATORIxDEMO[IiiiiiiiIIIII];
            v4 = 130 + IiiiiiiiIIIII * 52;
            ++IiiiiiiiIIIII;
            v3.setBounds(v4, IiiiiiiiIIIII - 20, 52, 30);
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII += 15, center);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (this.iiIiIiiiiIIIi) {
            g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, 120, 15, 10, 12, (ImageObserver)((Object)this));
        }
        if (this.IiIiiiiiIIIII) {
            g.drawImage(IIiIiiiiIiiIi.IiiIIiiiiiiiI, 351, 0, (ImageObserver)((Object)this));
        }
        if (this.iiIiiiiiiiIii != null) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO(g, 85, 135, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
        }
        if (this.iIiIiiiiIiIii != null) {
            if (this.IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/86");
            }
            g.drawImage(this.IiiiiiiiIIIII, 15, 130, (ImageObserver)((Object)this));
            g.setColor(Color.white);
            g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
            g.drawString(this.iIiIiiiiIiIii, 57, 145);
        }
        if (this.iIiiIiiiiiiII == null) return;
        if (this.iiIIIiiiiiiiI == null) {
            this.iiIIIiiiiiiiI = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/87");
        }
        g.drawImage(this.iiIIIiiiiiiiI, 15, 150, (ImageObserver)((Object)this));
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.drawString(this.iIiiIiiiiiiII, 57, 165);
    }

    public void ALLATORIxDEMO(int gheight, boolean center) {
        int IiiiiiiiIIIII = this.getWidth();
        int IiiiiiiiIIIII2 = gheight;
        Point IiiiiiiiIIIII3 = center ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3.x, IiiiiiiiIIIII3.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
