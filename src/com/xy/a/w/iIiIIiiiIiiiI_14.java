/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.LoginResult
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.LoginResult;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iIiIIiiiIiiiI
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private IIiIiiiiIiIII[] iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IIiIiiiiIiIII[] ALLATORIxDEMO;

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(int type, int point) {
        try {
            if (type == 0) {
                type = Integer.parseInt(this.iIiiIiiiiiiII[13].getText());
                this.iIiiIiiiiiiII[13].setText(String.valueOf(type + point));
            } else if (type == 1) {
                type = Integer.parseInt(this.iIiiIiiiiiiII[14].getText());
                this.iIiiIiiiiiiII[14].setText(String.valueOf(type + point));
            } else if (type == 2) {
                type = Integer.parseInt(this.iIiiIiiiiiiII[15].getText());
                this.iIiiIiiiiiiII[15].setText(String.valueOf(type + point));
            } else if (type == 3) {
                type = Integer.parseInt(this.iIiiIiiiiiiII[16].getText());
                this.iIiiIiiiiiiII[16].setText(String.valueOf(type + point));
            } else if (type == 4) {
                type = Integer.parseInt(this.iIiiIiiiiiiII[18].getText());
                this.iIiiIiiiiiiII[18].setText(String.valueOf(type + point));
            }
            type = Integer.parseInt(this.iIiiIiiiiiiII[12].getText());
            this.iIiiIiiiiiiII[12].setText(String.valueOf(type - point));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        LoginResult IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult();
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII2.getGrade());
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getGrade());
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)IiiiiiiiIIIII2.getSpecies_id().toString()));
        this.iIiiIiiiiiiII[6].setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII2.getGrade())) + "\u7ea7");
        this.IiiiiiiiIIIII[0].setText(String.valueOf(IiiiiiiiIIIII2.getRace_name()) + "\u00b7" + IiiiiiiiIIIII2.getLocalname());
        this.iIiiIiiiiiiII[2].setText(IiiiiiiiIIIII2.getGangname());
        this.iIiiIiiiiiiII[5].setText(IiiiiiiiIIIII2.getTitle());
        this.iIiiIiiiiiiII[0].setText(IiiiiiiiIIIII2.getRolename());
        BeauBean IiiiiiiiIIIII5 = IiiiiiiiIIIII.getBeau();
        if (IiiiiiiiIIIII5 == null) {
            this.IiIIIiiiiIiiI.setText("#W" + IiiiiiiiIIIII2.getRole_id());
        } else if (IiiiiiiiIIIII5.ALLATORIxDEMO()) {
            this.IiIIIiiiiIiiI.setText("#VBEAU" + IiiiiiiiIIIII5.toString() + "#L");
        } else {
            this.IiIIIiiiiIiiI.setText("#cFF00FF" + IiiiiiiiIIIII5.getBeau());
        }
        this.iIiiIiiiiiiII[3].setText(IiiiiiiiIIIII2.getPrestige().toString());
        this.iIiiIiiiiiiII[4].setText(IiiiiiiiIIIII2.getPkrecord().toString());
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3);
        this.iIiiIiiiiiiII[11].setText(IiiiiiiiIIIII2.getExperience().toString());
        this.iIiiIiiiiiiII[12].setText(IiiiiiiiIIIII2.getCanpoint().toString());
        this.iIiiIiiiiiiII[13].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getBone()));
        this.iIiiIiiiiiiII[14].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getSpir()));
        this.iIiiIiiiiiiII[15].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getPower()));
        this.iIiiIiiiiiiII[16].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getSpeed()));
        this.iIiiIiiiiiiII[18].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getCalm()));
        IiIiIiiiiIIiI IiiiiiiiIIIII6 = this.iiIIiiiiIiIIi.getBattleScene() != null ? this.iiIIiiiiIiIIi.getBattleScene().getBattleUnit(0, this.iiIIiiiiIiIIi.roleData.getRoleId()) : null;
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        if (IiiiiiiiIIIII6 != null) {
            iIiIIiiiIiiiI2.iIiiIiiiiiiII[7].setText(String.valueOf(IiiiiiiiIIIII6.ALLATORIxDEMO().getHp_Current()) + "/" + IiiiiiiiIIIII6.ALLATORIxDEMO().getHp_Total());
            this.iIiiIiiiiiiII[8].setText(String.valueOf(IiiiiiiiIIIII6.ALLATORIxDEMO().getMp_Current()) + "/" + IiiiiiiiIIIII6.ALLATORIxDEMO().getMp_Total());
            this.iIiiIiiiiiiII[9].setText(String.valueOf(IiiiiiiiIIIII6.ALLATORIxDEMO().getBap()));
            this.iIiiIiiiiiiII[10].setText(String.valueOf(IiiiiiiiIIIII6.ALLATORIxDEMO().getBsp()));
        } else {
            iIiIIiiiIiiiI2.iIiiIiiiiiiII[7].setText(String.valueOf(IiiiiiiiIIIII2.getHp().intValue()) + "/" + IiiiiiiiIIIII.getRoleProperty().getHp());
            this.iIiiIiiiiiiII[8].setText(String.valueOf(IiiiiiiiIIIII2.getMp().intValue()) + "/" + IiiiiiiiIIIII.getRoleProperty().getMp());
            this.iIiiIiiiiiiII[9].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getAp()));
            this.iIiiIiiiiiiII[10].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getSp()));
        }
        this.iIiiIiiiiiiII[17].setText(String.valueOf(IiiiiiiiIIIII.getRoleProperty().getCdz()));
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public iIiIIiiiIiiiI(GameView gameView) {
        super(0, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-3, 0, 362, 455, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "人物属性");
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.iiIiiiiiiiIii.setBounds(67, 41, 75, 100);
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii("sc/d/27.png");
        this.IIiiIiiiIIiIi.setBounds(61, 35, 87, 112);
        this.add((Component)this.iiIiiiiiiiIii);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiiiiiiiIIIII = new JLabel[17];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)40, (int)146, (int)130, (int)18, (int)0, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "学习交流·自学" : (IiiiiiiiIIIII == 1 ? "帮派" : (IiiiiiiiIIIII == 2 ? "声望" : (IiiiiiiiIIIII == 3 ? "战绩" : (IiiiiiiiIIIII == 4 ? "等级" : (IiiiiiiiIIIII == 5 ? "气血" : (IiiiiiiiIIIII == 6 ? "法力" : (IiiiiiiiIIIII == 7 ? "攻击" : (IiiiiiiiIIIII == 8 ? "速度" : (IiiiiiiiIIIII == 9 ? "经验" : (IiiiiiiiIIIII == 10 ? "可分配点" : (IiiiiiiiIIIII == 11 ? "根骨" : (IiiiiiiiIIIII == 12 ? "灵性" : (IiiiiiiiIIIII == 13 ? "力量" : (IiiiiiiiIIIII == 14 ? "敏捷" : (IiiiiiiiIIIII == 15 ? "禅定" : (IiiiiiiiIIIII == 16 ? "定力" : "")))))))))))))));
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(167, 80 + (IiiiiiiiIIIII - 1) * 24, 40, 19);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 9) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(40, 187 + (IiiiiiiiIIIII - 4) * 24, 40, 20);
            } else if (IiiiiiiiIIIII == 10) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(216, 187, 70, 20);
            } else if (IiiiiiiiIIIII >= 11 && IiiiiiiiIIIII <= 14) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(220, 209 + (IiiiiiiiIIIII - 11) * 24, 40, 20);
            } else if (IiiiiiiiIIIII == 15) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(40, 307, 40, 20);
            } else if (IiiiiiiiIIIII == 16) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(220, 305, 40, 20);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new IIiIiiiiIiIII[13];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIiIiiiiIiIII(null, 1, 1 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u540d\u5b57" : (IiiiiiiiIIIII == 1 ? "I D" : (IiiiiiiiIIIII == 2 ? "\u79f0\u8c13" : (IiiiiiiiIIIII == 3 ? "\u5207\u5c5e\u6027" : (IiiiiiiiIIIII == 4 ? "\u63a8\u8350\u52a0\u70b9" : (IiiiiiiiIIIII == 5 ? "\u786e\u8ba4\u52a0\u70b9" : (IiiiiiiiIIIII == 6 ? "\u4e03\u5341\u4e8c\u53d8" : (IiiiiiiiIIIII == 7 ? "\u7075 \u5b9d" : (IiiiiiiiIIIII == 8 ? "\u6297 \u6027" : (IiiiiiiiIIIII == 9 ? "\u4eba\u7269\u6280\u80fd" : (IiiiiiiiIIIII == 10 ? "\u5750 \u9a91" : (IiiiiiiiIIIII == 11 ? "\u4f5c \u574a" : (IiiiiiiiIIIII == 12 ? "\u8f6c\u6362" : "")))))))))))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/5.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(170, 33 + 24 * IiiiiiiiIIIII, 34, 17);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/5.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(170, 153, 34, 17);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/27.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(165, 188, 51, 17);
            } else if (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/27.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(225 + (IiiiiiiiIIIII - 4) * 57, 307, 51, 17);
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 368, 99, 25);
            } else if (IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 8) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/31.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(161 + (IiiiiiiiIIIII - 7) * 94, 368, 79, 25);
            } else if (IiiiiiiiIIIII == 9) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 403, 99, 25);
            } else if (IiiiiiiiIIIII == 10 || IiiiiiiiIIIII == 11) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/31.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(161 + (IiiiiiiiIIIII - 10) * 94, 403, 79, 25);
            } else if (IiiiiiiiIIIII == 12) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setImage("sc/e/5.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(179, 333, 34, 17);
            }
            if (IiiiiiiiIIIII >= 6 && IiiiiiiiIIIII <= 11) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIiIiiiiIiIII[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII % 2 == 0 ? "sc/e/32.png" : "sc/e/34.png", 1, 100 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(312 + 11 * (IiiiiiiiIIIII % 2), 211 + 24 * (IiiiiiiiIIIII / 2), 11, 15);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new iIIiIiiiIiiIi[19];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.IiIIIiiiiIiiI.setBounds(213, 29 + IiiiiiiiIIIII * 24, 124, 19);
                this.add((Component)this.IiIIIiiiiIiiI);
            }
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)(IiiiiiiiIIIII == 6 ? iiIIiiiiIiiII.ALLATORIxDEMO : (IiiiiiiiIIIII >= 7 ? iiIIiiiiIiiII.iIiIiiiiIiiii : iiIIiiiiIiiII.iIiIIiiiiIIiI)));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(211, 32 + IiiiiiiiIIIII * 24, 124, 19);
            } else if (IiiiiiiiIIIII == 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(79, 187, 86, 20);
            } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 11) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(79, 211 + (IiiiiiiiIIIII - 7) * 24, 134, 20);
            } else if (IiiiiiiiIIIII == 12) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(290, 187, 44, 20);
            } else if (IiiiiiiiIIIII >= 13 && IiiiiiiiIIIII <= 16) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(262, 209 + (IiiiiiiiIIIII - 13) * 24, 74, 20);
            } else if (IiiiiiiiIIIII == 17) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(79, 307, 134, 20);
            } else if (IiiiiiiiIIIII == 18) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(262, 305, 74, 20);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public int ALLATORIxDEMO(int type) {
        try {
            if (type == 0) {
                return Integer.parseInt(this.iIiiIiiiiiiII[13].getText());
            }
            if (type == 1) {
                return Integer.parseInt(this.iIiiIiiiiiiII[14].getText());
            }
            if (type == 2) {
                return Integer.parseInt(this.iIiiIiiiiiiII[15].getText());
            }
            if (type == 3) {
                return Integer.parseInt(this.iIiiIiiiiiiII[16].getText());
            }
            if (type == 4) {
                return Integer.parseInt(this.iIiiIiiiiiiII[18].getText());
            }
            if (type != 5) return type;
            return Integer.parseInt(this.iIiiIiiiiiiII[12].getText());
        }
        catch (Exception IiiiiiiiIIIII) {
            return 0;
        }
    }

    public void iIiIiiiiIIiii(int lvltrue) {
        if (lvltrue <= 3) {
            this.ALLATORIxDEMO[8].setVisible(false);
            this.ALLATORIxDEMO[9].setVisible(false);
            this.IiiiiiiiIIIII[15].setVisible(false);
            this.IiiiiiiiIIIII[16].setVisible(false);
            this.iIiiIiiiiiiII[17].setVisible(false);
            this.iIiiIiiiiiiII[18].setVisible(false);
            this.iIiIiiiiIiIii[12].setVisible(false);
            this.IiiiiiiiIIIII[9].setBounds(40, 307, 40, 20);
            this.iIiiIiiiiiiII[11].setBounds(79, 307, 134, 20);
            this.iIiIiiiiIiIii[4].setBounds(225, 307, 51, 17);
            this.iIiIiiiiIiIii[5].setBounds(282, 307, 51, 17);
            return;
        }
        this.ALLATORIxDEMO[8].setVisible(true);
        this.ALLATORIxDEMO[9].setVisible(true);
        this.IiiiiiiiIIIII[15].setVisible(true);
        this.IiiiiiiiIIIII[16].setVisible(true);
        this.iIiiIiiiiiiII[17].setVisible(true);
        this.iIiiIiiiiiiII[18].setVisible(true);
        this.iIiIiiiiIiIii[12].setVisible(true);
        this.IiiiiiiiIIIII[9].setBounds(40, 331, 40, 20);
        this.iIiiIiiiiiiII[11].setBounds(79, 331, 134, 20);
        this.iIiIiiiiIiIii[4].setBounds(225, 331, 51, 17);
        this.iIiIiiiiIiIii[5].setBounds(282, 331, 51, 17);
    }
}
