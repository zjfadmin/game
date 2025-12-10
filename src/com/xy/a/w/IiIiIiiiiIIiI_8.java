/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IIIIIiiiIiiII
 *  com.xy.bean.LoginResult
 *  com.xy.formula.SkillUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.w;

import com.xy.a.w.IIIIIiiiIiiII;
import com.xy.bean.LoginResult;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiiiiiiIIII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IiIiIiiiiIIiI
extends IiiiIiiiiIiIi {
    private JLabel[] iiIiiiiiiiIii;
    private IIIIIiiiIiiII[] IiiiiiiiIIIII;
    private IIIIIiiiIIIiI ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        IiiiiiiiiIIII IiiiiiiiIIIII = this.ALLATORIxDEMO();
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII3.getGrade());
        String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getPrivateData().getSkill("S");
        if (IiiiiiiiIIIII5 == null || IiiiiiiiIIIII5.length == 0) {
            IiiiiiiiIIIII5 = null;
        }
        boolean IiiiiiiiIIIII6 = false;
        boolean IiiiiiiiIIIII7 = this.ALLATORIxDEMO().gameBattle && (IiiiiiiiIIIII2.getRoleProperty().sld1 > 0 || IiiiiiiiIIIII2.getRoleProperty().sld2 > 0);
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < this.IiiiiiiiIIIII.length) {
            int IiiiiiiiIIIII9;
            IIIIIiiiIiiII IiiiiiiiIIIII10 = this.IiiiiiiiIIIII[IiiiiiiiIIIII8];
            int IiiiiiiiIIIII11 = SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII3.getSpecies_id(), (int)IiiiiiiiIIIII8);
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII10)[0].setText(SkillUtil.getSkillMsg((int)IiiiiiiiIIIII11));
            IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII10)[2].setText(SkillUtil.getSkillBySM((int)IiiiiiiiIIIII11));
            int IiiiiiiiIIIII12 = IiiiiiiiIIIII4 == 0 ? 10000 : (IiiiiiiiIIIII4 == 1 ? 15000 : (IiiiiiiiIIIII4 == 2 ? 20000 : 25000));
            int IiiiiiiiIIIII13 = 0;
            if (IiiiiiiiIIIII7) {
                IiiiiiiiIIIII9 = IiiiiiiiIIIII11 + 1;
                if (IiiiiiiiIIIII9 == IiiiiiiiIIIII2.getRoleProperty().sm1) {
                    IiiiiiiiIIIII13 = (int)((double)IiiiiiiiIIIII13 + (double)IiiiiiiiIIIII2.getRoleProperty().sld1 * 67.5);
                } else if (IiiiiiiiIIIII9 == IiiiiiiiIIIII2.getRoleProperty().sm2) {
                    IiiiiiiiIIIII13 = (int)((double)IiiiiiiiIIIII13 + (double)IiiiiiiiIIIII2.getRoleProperty().sld2 * 67.5);
                }
                IiiiiiiiIIIII12 += IiiiiiiiIIIII13;
            }
            IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII10).length) {
                int IiiiiiiiIIIII14 = 1001 + IiiiiiiiIIIII11 * 5 + IiiiiiiiIIIII9;
                int IiiiiiiiIIIII15 = 0;
                Skill IiiiiiiiIIIII16 = IiiiiiiiIIIII.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII14));
                if (IiiiiiiiIIIII16 != null && IiiiiiiiIIIII5 != null) {
                    String IiiiiiiiIIIII17 = String.valueOf(IiiiiiiiIIIII14) + "_";
                    int IiiiiiiiIIIII18 = 0;
                    while (IiiiiiiiIIIII18 < IiiiiiiiIIIII5.length) {
                        if (!IiiiiiiiIIIII5[IiiiiiiiIIIII18].startsWith(IiiiiiiiIIIII17)) {
                            ++IiiiiiiiIIIII18;
                            continue;
                        }
                        IiiiiiiiIIIII15 = Integer.parseInt(IiiiiiiiIIIII5[IiiiiiiiIIIII18].substring(IiiiiiiiIIIII17.length()));
                        IiiiiiiiIIIII15 += IiiiiiiiIIIII13;
                        break;
                    }
                }
                if (IiiiiiiiIIIII15 == 0) {
                    IiiiiiiiIIIII6 = true;
                    IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII10)[IiiiiiiiIIIII9].ALLATORIxDEMO(null, 0, 0);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII10)[IiiiiiiiIIIII9].ALLATORIxDEMO(IiiiiiiiIIIII16, IiiiiiiiIIIII15, IiiiiiiiIIIII12);
                }
                ++IiiiiiiiIIIII9;
            }
            ++IiiiiiiiIIIII8;
        }
        this.ALLATORIxDEMO.setVisible(IiiiiiiiIIIII6);
    }

    public IiIiIiiiiIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 602, 425, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO = new IIIIIiiiIIIiI("sc/e/28.png", 1, 116, iiIIiiiiIiiII.iiIiiiiiiIIiI, iiIIiiiiIiiII.iIiiIiiiiiIIi, "\u4e00\u952e\u5b66\u4e60", (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO.setBounds(500, 372, 68, 17);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(48 + 80 * IiiiiiiiIIIII), (int)370, (int)520, (int)18, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)(IiiiiiiiIIIII == 0 ? "#c000000" : "#cFF0000")), (Font)iiIIiiiiIiiII.iIiIiiiiiiIIi);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6e29\u99a8\u63d0\u793a\uff1a" : (IiiiiiiiIIIII == 1 ? "\u70b9\u51fb\u6cd5\u672f\u5c0f\u56fe\u6807\u53ef\u62d6\u52a8\u5230\u6280\u80fd\u5feb\u6377\u680f" : "\u5b66\u4e60\u4ea4\u6d41"));
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIIIiiiIiiII[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIiiII(this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(48 + IiiiiiiiIIIII * 176, 63, 170, 300);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }
}
