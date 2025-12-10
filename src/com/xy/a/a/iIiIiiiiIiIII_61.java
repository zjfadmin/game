/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseValue
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.socket.Agreement;
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

public class iIiIiiiiIiIII
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private BigDecimal iIiIiiiiIiIii;
    private iiIiIiiiiIiIi[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi[] iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private IiIiIiiiiIIiI[] ALLATORIxDEMO;

    public iIiIiiiiIiIII(GameView gameView) {
        super(116, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 406, 391, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u7075\u7280\u4fee\u70bc");
        this.ALLATORIxDEMO = new IiIiIiiiiIIiI[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 0 ? "sc/e/26.png" : "sc/e/46.png", 1, 101 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4e00\u952e\u5151\u6362" : (IiiiiiiiIIIII == 1 ? "\u63d0\u5347\u7075\u7280\u70b9" : ""), (IiiiIiiiiIiIi)this);
            iIiIiiiiIiIII iIiIiiiiIiIII2 = this;
            if (IiiiiiiiIIIII == 0) {
                iIiIiiiiIiIII2.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(91, 340, 99, 25);
            } else {
                iIiIiiiiIiIII2.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(200, 340, 119, 25);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iIIiIiiiIiiIi[6];
        this.IiIIIiiiiIiiI = new iiIiIiiiiIiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 2 ? 0 : 10), (Color)(IiiiiiiiIIIII == 0 ? Color.red : Color.white), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(124, 49, 100, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(330, 49, 39, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(204, 79, 165, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(184, 153, 154, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(184, 213, 154, 19);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(184, 273, 154, 19);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(184, 183, 154, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(184, 243, 154, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(184, 303, 154, 19);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new JLabel[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)49, (int)88, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ec\u5524\u517d\uff1a" : (IiiiiiiiIIIII == 1 ? "\u7075\u7280\u7b49\u7ea7" : (IiiiiiiiIIIII == 2 ? "\u5f53\u524d\u7075\u7280\u4fee\u70bc\u8fdb\u5ea6" : (IiiiiiiiIIIII == 3 ? "\u5151\u6362\u7075\u7280\u6240\u9700" : (IiiiiiiiIIIII == 4 ? "\u6240\u9700\u7ecf\u9a8c" : (IiiiiiiiIIIII == 5 ? "\u5f53\u524d\u7ecf\u9a8c" : (IiiiiiiiIIIII == 6 ? "\u6240\u9700\u91d1\u94b1" : (IiiiiiiiIIIII == 7 ? "\u5f53\u524d\u91d1\u94b1" : (IiiiiiiiIIIII == 8 ? "\u6240\u9700\u4eb2\u5bc6" : (IiiiiiiiIIIII == 9 ? "\u5f53\u524d\u4eb2\u5bc6" : ""))))))))));
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(55, 49, 88, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(250, 49, 72, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(55, 79, 138, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(55, 113, 138, 19);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 9) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(55, 153 + (IiiiiiiiIIIII - 4) * 30, 120, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI("sc/d/30.png");
        this.IIiiIiiiIIiIi.setBounds(56, 134, 280, 1);
        this.add((Component)this.IIiiIiiiIIiIi);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiIi() {
        RoleData roleData = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII = roleData.getLoginResult();
        RoleSummoning IiiiiiiiIIIII2 = roleData.getPet(this.iIiIiiiiIiIii);
        if (IiiiiiiiIIIII2 == null) {
            this.iiiIiiiiiiIIi();
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        GameClient IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getLxValue();
        int IiiiiiiiIIIII5 = BaseValue.getLxLvl((int)IiiiiiiiIIIII4);
        this.iiIiiiiiiiIii[0].setText(IiiiiiiiIIIII2.getSummoningname());
        this.iiIiiiiiiiIii[1].setText(String.valueOf(IiiiiiiiIIIII5));
        this.iiIiiiiiiiIii[2].setText(String.valueOf(IiiiiiiiIIIII4 - BaseValue.getLxTotalExp((int)IiiiiiiiIIIII5)) + "/" + BaseValue.getLxExp((int)(IiiiiiiiIIIII5 + 1)));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii[3], (long)BaseValue.getLxXHExp((int)IiiiiiiiIIIII5, (GameClient)IiiiiiiiIIIII3).longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii[4], (long)BaseValue.getLxXHMoney((int)IiiiiiiiIIIII5, (GameClient)IiiiiiiiIIIII3).longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii[5], (long)BaseValue.getLxXHQm((int)IiiiiiiiIIIII5, (GameClient)IiiiiiiiIIIII3).longValue());
        this.IiIIIiiiiIiiI[0].ALLATORIxDEMO(IiiiiiiiIIIII2.getExp().longValue());
        if (IiiiiiiiIIIII3.gameType == 2 || IiiiiiiiIIIII5 <= 49) {
            this.IiIIIiiiiIiiI[1].ALLATORIxDEMO(IiiiiiiiIIIII.getGold().longValue());
            this.IiiiiiiiIIIII[6].setText("\u6240\u9700\u91d1\u94b1");
            this.IiiiiiiiIIIII[7].setText("\u5f53\u524d\u91d1\u94b1");
        } else {
            this.IiIIIiiiiIiiI[1].ALLATORIxDEMO(IiiiiiiiIIIII.getCodecard().longValue());
            this.IiiiiiiiIIIII[6].setText("\u6240\u9700\u4ed9\u7389");
            this.IiiiiiiiIIIII[7].setText("\u5f53\u524d\u4ed9\u7389");
        }
        this.IiIIIiiiiIiiI[2].ALLATORIxDEMO(IiiiiiiiIIIII2.getFriendliness().longValue());
    }

    public void iIiIiiiiIIiii(int id) {
        RoleSummoning IiiiiiiiIIIII = this.ALLATORIxDEMO().getPet(this.iIiIiiiiIiIii);
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4e00\u53ea\u53ec\u5524\u517d");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"userpet", (String)("LXXL|" + IiiiiiiiIIIII.getSid() + (id == 102 ? "" : "|MAX")));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++].setText(null);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].setText(null);
        }
    }

    public void ALLATORIxDEMO(BigDecimal id) {
        this.iIiIiiiiIiIii = id;
        this.iIiIiiiiIIiIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
