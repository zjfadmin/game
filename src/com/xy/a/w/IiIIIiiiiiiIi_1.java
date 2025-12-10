/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.BaseValue
 *  com.xy.formula.SkillUtil
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Skill
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseValue;
import com.xy.formula.SkillUtil;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Skill;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiiiIi
extends IiiiIiiiiIiIi {
    private BigDecimal iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI iiiiIiiiIiiII;
    private BigDecimal iiiIiiiiiiiIi;
    private iiIiIiiiiIiIi iIiiIiiiiiiII;
    private IIiIiiiiIiIII[] IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private iiIiIiiiiIiIi IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public IiIIIiiiiiiIi(GameView gameView) {
        super(123, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 371, 357, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6cd5\u672f\u4fee\u70bc");
        this.IIiiIiiiIIiIi = new IIiIiiiiIiIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIiIiiiiIiIII(IiiiiiiiIIIII == 0 ? "sc/e/31.png" : "sc/e/26.png", 1, 333 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4fee \u70bc" : (IiiiiiiiIIIII == 1 ? "\u4e00\u952e\u4fee\u70bc" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(91, 306, 79, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(200, 306, 99, 25);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(184, 49 + 30 * IiiiiiiiIIIII, 154, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(184, 179, 154, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(184, 241, 154, 19);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiIIIiiiiIiiI.setBounds(184, 210, 154, 19);
        this.iIiiIiiiiiiII.setBounds(184, 272, 154, 19);
        this.IiIIIiiiiIiiI.setText("0");
        this.iIiiIiiiiiiII.setText("0");
        this.add((Component)this.IiIIIiiiiIiiI);
        this.add((Component)this.iIiiIiiiiiiII);
        this.ALLATORIxDEMO = new JLabel[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)(49 + IiiiiiiiIIIII * 30), (int)120, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u6cd5\u672f" : (IiiiiiiiIIIII == 1 ? "\u5f53\u524d\u719f\u7ec3" : (IiiiiiiiIIIII == 2 ? "\u672c\u5468\u4fee\u70bc\u6b21\u6570" : (IiiiiiiiIIIII == 3 ? "\u63d0\u5347\u719f\u7ec3\u5ea6\u6240\u9700" : (IiiiiiiiIIIII == 4 ? "\u6240\u9700\u7ecf\u9a8c" : (IiiiiiiiIIIII == 5 ? "\u62e5\u6709\u7ecf\u9a8c" : (IiiiiiiiIIIII == 6 ? "\u6240\u9700\u91d1\u94b1" : (IiiiiiiiIIIII == 7 ? "\u62e5\u6709\u91d1\u94b1" : ""))))))));
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 143, 120, 19);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 7) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 179 + (IiiiiiiiIIIII - 4) * 31, 72, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI("sc/d/30.png");
        this.iiiiIiiiIiiII.setBounds(56, 164, 280, 1);
        this.add((Component)this.iiiiIiiiIiiII);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII.getExperience().longValue());
        if (this.iiIiiiiiiiIii == 0) {
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII.getGold().longValue());
            return;
        }
        if (this.iiIiiiiiiiIii == 1) {
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII.getCodecard().longValue());
            return;
        }
        if (this.iiIiiiiiiiIii == 2) {
            this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII.getScoretype("\u6cd5\u95e8\u79ef\u5206").longValue());
            return;
        }
        if (this.iiIiiiiiiiIii != 3) return;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII.getScoretype("\u5e08\u95e8\u8d21\u732e").longValue());
    }

    public synchronized void iIiIiiiiIIiii(BaseMeridians baseMeridians, int key) {
        if (baseMeridians == null) {
            return;
        }
        if (key != -1) {
            this.iIiIiiiiIiIii = key;
        }
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        int IiiiiiiiIIIII2 = baseMeridians != null && baseMeridians.getKey() != null ? Integer.parseInt(baseMeridians.getKey()) - 1 : -1;
        int IiiiiiiiIIIII3 = SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII.getSpecies_id());
        int IiiiiiiiIIIII4 = SkillUtil.getFMMax((int)IiiiiiiiIIIII.getGrade(), (GameClient)this.ALLATORIxDEMO());
        IiiiiiiiIIIII2 = SkillUtil.getFMIndex((int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII2);
        int IiiiiiiiIIIII5 = (this.iIiIiiiiIiIii == 0 ? 12000 : 12500) + IiiiiiiiIIIII2;
        Skill IiiiiiiiIIIII6 = this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII5));
        if (IiiiiiiiIIIII6 == null) {
            return;
        }
        int IiiiiiiiIIIII7 = this.iIiIiiiiIiIii == 0 ? baseMeridians.getExp() : baseMeridians.getXs();
        this.IiiiiiiiIIIII[0].setText(IiiiiiiiIIIII6.getSkillname());
        this.IiiiiiiiIIIII[1].setText(String.valueOf(IiiiiiiiIIIII7) + "/" + IiiiiiiiIIIII4);
        this.iiIiIiiiiIIIi = BaseValue.getFMXHExp((int)IiiiiiiiIIIII7, (GameClient)this.ALLATORIxDEMO());
        this.iiiIiiiiiiiIi = BaseValue.getFMXHMoney((int)IiiiiiiiIIIII7, (GameClient)this.ALLATORIxDEMO());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[3], (long)this.iiIiIiiiiIIIi.longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiiiiiiiIIIII[4], (long)this.iiiIiiiiiiiIi.longValue());
        this.iiIiiiiiiiIii = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? 3 : (this.ALLATORIxDEMO().gameType == 2 ? 0 : (this.ALLATORIxDEMO().gameType == 4 ? 0 : (this.ALLATORIxDEMO().gameType == 3 ? (IiiiiiiiIIIII7 < 6000 ? 0 : 2) : (this.ALLATORIxDEMO().gameType == 1 ? (IiiiiiiiIIIII7 < 5000 ? 0 : 2) : (IiiiiiiiIIIII7 < 2000 ? 0 : 1)))));
        this.ALLATORIxDEMO[6].setText(this.iiIiiiiiiiIii == 1 ? "\u6240\u9700\u4ed9\u7389" : (this.iiIiiiiiiiIii == 2 ? "\u6240\u9700\u6cd5\u95e8" : (this.iiIiiiiiiiIii == 3 ? "\u6240\u9700\u5e08\u8d21" : "\u6240\u9700\u91d1\u94b1")));
        this.ALLATORIxDEMO[7].setText(this.iiIiiiiiiiIii == 1 ? "\u62e5\u6709\u4ed9\u7389" : (this.iiIiiiiiiiIii == 2 ? "\u62e5\u6709\u6cd5\u95e8" : (this.iiIiiiiiiiIii == 3 ? "\u62e5\u6709\u5e08\u8d21" : "\u62e5\u6709\u91d1\u94b1")));
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(BaseMeridians baseMeridians, int id) {
        this.iIiIiiiiIIiii(baseMeridians, id);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public int iiiIiiiiiiIIi() {
        return this.iIiIiiiiIiIii;
    }
}
