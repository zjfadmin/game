/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.bean.FriendBean
 *  com.xy.bean.RoleShow
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.formula.SkillUtil
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.a.iIiiIiiiIiIIi;
import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.formula.SkillUtil;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IiIIIiiiiIIiI
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private RoleShow iiIiiiiiiiIii;
    private IIIIIiiiIIIiI[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public IiIIIiiiiIIiI(GameView gameView) {
        super(154, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(0, 80, 160, 177, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI[10];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/6.png", 1, 261 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u56e2\u961f" : (IiiiiiiiIIIII == 1 ? "\u4ea4\u8c08" : (IiiiiiiiIIIII == 2 ? "\u7ed9\u4e88" : (IiiiiiiiIIIII == 3 ? "\u67e5\u770b" : (IiiiiiiiIIIII == 4 ? "\u88c5\u626e" : (IiiiiiiiIIIII == 5 ? "\u7ec4\u961f" : (IiiiiiiiIIIII == 6 ? "\u597d\u53cb" : (IiiiiiiiIIIII == 7 ? "\u4ea4\u6613" : (IiiiiiiiIIIII == 8 ? "\u4e3e\u62a5" : (IiiiiiiiIIIII == 9 ? "\u9501\u5b9a" : ""))))))))), (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(64 + IiiiiiiiIIIII / 5 * 50, 67 + IiiiiiiiIIIII % 5 * 21, 34, 18);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)61, (int)5, (int)96, (int)14, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b66\u4e60\u4ea4\u6d41" : (IiiiiiiiIIIII == 1 ? "9\u8f6c886\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u51e1\u4eba" : (IiiiiiiiIIIII == 3 ? "\u7ec3\u4e60\u4e34\u6479" : ""))));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c30EEFF"));
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(61, 20, 65, 14);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(125, 20, 37, 14);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(61, 36, 96, 14);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c999999"));
            }
            ++IiiiiiiiIIIII;
        }
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(11, 11, 40, 40);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/28.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(5, 5, 52, 52);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
                if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(0, 0, 160, 62);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(58, 62, 46, 115);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(108, 62, 46, 115);
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(RoleShow roleShow) {
        this.iiIiiiiiiiIii = roleShow;
        this.ALLATORIxDEMO[0].setText(roleShow.getRolename());
        this.ALLATORIxDEMO[1].setText(String.valueOf(IiiiIiiiiIIII.iIiIiiiiIIiii((int)roleShow.getGrade())) + "\u7ea7");
        this.ALLATORIxDEMO[2].setText(SkillUtil.getSepciesN((BigDecimal)roleShow.getSpecies_id()));
        this.ALLATORIxDEMO[3].setText(roleShow.getTitle());
        this.IiIIIiiiiIiiI[0].iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + roleShow.getSpecies_id())));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 261) return;
        if (id == 262) {
            FriendBean IiiiiiiiIIIII = this.ALLATORIxDEMO().getFriend(this.iiIiiiiiiiIii.getRole_id().longValue());
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new FriendBean();
                IiiiiiiiIIIII.setFid(this.iiIiiiiiiiIii.getRole_id().longValue());
                IiiiiiiiIIIII.setRoleName(this.iiIiiiiiiiIii.getRolename());
                IiiiiiiiIIIII.setSpeciesId(this.iiIiiiiiiiIii.getSpecies_id().intValue());
                IiiiiiiiIIIII.setLvl(this.iiIiiiiiiiIii.getGrade().intValue());
                IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            ((iIiiIiiiIiIIi)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(56)).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id == 263) {
            iiIiIiiiiIiii IiiiiiiiIIIII = this.iiIIiiiiIiIIi.mapScene.ALLATORIxDEMO(this.iiIiiiiiiiIii.getRole_id());
            if (IiiiiiiiIIIII == null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u73a9\u5bb6\u79bb\u4f60\u592a\u8fdc\u4e86");
                return;
            }
            iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id == 264) return;
        if (id == 265) return;
        if (id == 266) {
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)this.iiIiiiiiiiIii.getRole_id(), (GameView)this.ALLATORIxDEMO());
            return;
        }
        if (id == 267) {
            iiIiIiiiiIiii.ALLATORIxDEMO((BigDecimal)this.iiIiiiiiiiIii.getRole_id(), (String)this.iiIiiiiiiiIii.getRolename(), (GameView)this.ALLATORIxDEMO());
            return;
        }
        if (id != 268) {
            if (id == 269) return;
            return;
        }
        iiIiIiiiiIiii IiiiiiiiIIIII = this.iiIIiiiiIiIIi.mapScene.ALLATORIxDEMO(this.iiIiiiiiiiIii.getRole_id());
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u73a9\u5bb6\u79bb\u4f60\u592a\u8fdc\u4e86");
            return;
        }
        iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)IiiiiiiiIIIII, (GameView)this.iiIIiiiiIiIIi);
    }
}
