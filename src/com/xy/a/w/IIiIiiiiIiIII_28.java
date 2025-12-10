/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.formula.ExpUtil
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.formula.ExpUtil;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIiIiiiiIiIII
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] iiiiIiiiIiiII;
    private static BigDecimal iiiIiiiiiiiIi = new BigDecimal(0);
    private BigDecimal iIiiIiiiiiiII;
    private iiIiIiiiiIiIi IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private BigDecimal IiIIIiiiiIiiI;
    private com.xy.i.IIiIiiiiIiIII[] iiIiiiiiiiIii;
    private iiIiIiiiiIiIi IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public void iiiiiiiiIIiii() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        BigDecimal IiiiiiiiIIIII2 = IiiiiiiiIIIII.getExperience();
        BigDecimal IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? IiiiiiiiIIIII.getScoretype("\u5e08\u95e8\u8d21\u732e") : IiiiiiiiIIIII.getGold();
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII.getExtraPointInt("T");
        int IiiiiiiiIIIII5 = ExpUtil.getTSP((int)IiiiiiiiIIIII4);
        int IiiiiiiiIIIII6 = ExpUtil.getTSX((int)IiiiiiiiIIIII4);
        int IiiiiiiiIIIII7 = ExpUtil.getTSExp((int)(IiiiiiiiIIIII5 + 1)) - IiiiiiiiIIIII6;
        String IiiiiiiiIIIII8 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade());
        int IiiiiiiiIIIII9 = ExpUtil.ALLATORIxDEMO((int)ExpUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()), (GameClient)this.ALLATORIxDEMO());
        if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII9) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u5151\u6362\u81f3\u5f53\u524d\u5883\u754c\u4e0a\u9650");
            return;
        }
        if (IiiiiiiiIIIII7 <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u5151\u6362\u81f3\u5f53\u524d\u5883\u754c\u4e0a\u9650");
            return;
        }
        BigDecimal IiiiiiiiIIIII10 = IiiiiiiiIIIII2.divide(this.iIiiIiiiiiiII, 0, 1);
        BigDecimal IiiiiiiiIIIII11 = IiiiiiiiIIIII3.divide(this.IiIIIiiiiIiiI, 0, 1);
        switch (IiiiiiiiIIIII10.compareTo(IiiiiiiiIIIII11)) {
            case -1: {
                if (IiiiiiiiIIIII10.compareTo(iiiIiiiiiiiIi) <= 0) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u7ecf\u9a8c\u4e0d\u8db3");
                    return;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII2, IiiiiiiiIIIII10, IiiiiiiiIIIII7);
                return;
            }
            case 0: {
                if (IiiiiiiiIIIII11.compareTo(iiiIiiiiiiiIi) > 0) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII2, IiiiiiiiIIIII10, IiiiiiiiIIIII7);
                    return;
                }
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? "\u5f53\u524d\u5e08\u95e8\u8d21\u732e\u4e0d\u8db3\u548c\u7ecf\u9a8c\u90fd\u4e0d\u8db3" : "\u5f53\u524d\u5927\u8bdd\u5e01\u548c\u7ecf\u9a8c\u90fd\u4e0d\u8db3");
                return;
            }
            case 1: {
                if (IiiiiiiiIIIII11.compareTo(iiiIiiiiiiiIi) > 0) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII2, IiiiiiiiIIIII11, IiiiiiiiIIIII7);
                    return;
                }
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? "\u5f53\u524d\u5e08\u95e8\u8d21\u732e\u4e0d\u8db3" : "\u5f53\u524d\u5927\u8bdd\u5e01\u4e0d\u8db3");
                return;
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.IiiIiiiiiiIiI();
    }

    public void IiiIiiiiiiIiI() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII.getExperience().longValue());
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5)) {
            this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getScoretype("\u5e08\u95e8\u8d21\u732e").longValue());
            return;
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getGold().longValue());
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiiIiIII(GameView gameView) {
        super(83, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        void gameView2;
        this.IiIIIiiiiIiiI = new BigDecimal(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) ? "50000" : (this.ALLATORIxDEMO().gameType == 2 ? "4000000" : (this.ALLATORIxDEMO().gameType == 1 ? "20000000" : "400000")));
        this.iIiiIiiiiiiII = new BigDecimal(this.ALLATORIxDEMO().gameType == 2 ? "10000000" : "5000000");
        this.ALLATORIxDEMO(-1, 0, 402, 437, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u63d0\u5347\u4fee\u70bc\u70b9");
        this.iiIiiiiiiiIii = new com.xy.i.IIiIiiiiIiIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.i.IIiIiiiiIiIII("sc/e/26.png", 1, 331 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4e00\u952e\u5151\u6362" : (IiiiiiiiIIIII == 1 ? "\u63d0\u5347\u4fee\u70bc\u70b9" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(91, 386, 99, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setImage("sc/e/46.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(200, 386, 119, 25);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new iIIiIiiiIiiIi[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            if (IiiiiiiiIIIII != 6 && IiiiiiiiIIIII != 8) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(145, 49, 39, 19);
                } else if (IiiiiiiiIIIII == 1) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(330, 49, 39, 19);
                } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(184, 126 + (IiiiiiiiIIIII - 2) * 30, 154, 19);
                } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 8) {
                    this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(184, 256 + (IiiiiiiiIIIII - 5) * 31, 154, 19);
                }
                this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView2);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView2);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(184, 287, 154, 19);
        this.IiiiiiiiIIIII.setBounds(184, 349, 154, 19);
        this.IIiiIiiiIIiIi.setText("0");
        this.IiiiiiiiIIIII.setText("0");
        this.add((Component)this.IIiiIiiiIIiIi);
        this.add((Component)this.IiiiiiiiIIIII);
        this.ALLATORIxDEMO = new JLabel[11];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)49, (int)88, (int)19, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u5929\u67a2\u70b9" : (IiiiiiiiIIIII == 1 ? "\u5269\u4f59\u53ef\u5151\u6362\u5929\u67a2\u70b9" : (IiiiiiiiIIIII == 2 ? "\u5151\u6362\u5929\u67a2\u70b9\u6240\u9700" : (IiiiiiiiIIIII == 3 ? "\u5f53\u524d\u4eba\u7269\u7b49\u7ea7" : (IiiiiiiiIIIII == 4 ? "\u5f53\u524d\u4eba\u7269\u5883\u754c" : (IiiiiiiiIIIII == 5 ? "\u5f53\u524d\u4fee\u70bc\u8fdb\u5ea6" : (IiiiiiiiIIIII == 6 ? "\u5151\u6362\u4fee\u70bc\u70b9\u6240\u9700" : (IiiiiiiiIIIII == 7 ? "\u6240\u9700\u7ecf\u9a8c" : (IiiiiiiiIIIII == 8 ? "\u5f53\u524d\u7ecf\u9a8c" : (IiiiiiiiIIIII == 9 ? "\u6240\u9700\u91d1\u94b1" : (IiiiiiiiIIIII == 10 ? "\u5f53\u524d\u91d1\u94b1" : "")))))))))));
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 49, 88, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(191, 49, 138, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 85, 120, 19);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 126 + (IiiiiiiiIIIII - 3) * 30, 120, 19);
            } else if (IiiiiiiiIIIII == 6) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 220, 120, 19);
            } else if (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 10) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(55, 256 + (IiiiiiiiIIIII - 7) * 31, 172, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI("sc/d/30.png");
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(56, 106 + 135 * IiiiiiiiIIIII, 280, 1);
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIiiII[5], (long)this.iIiiIiiiiiiII.longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIiiII[7], (long)this.IiIIIiiiiIiiI.longValue());
        if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5)) return;
        this.ALLATORIxDEMO[9].setText("\u6240\u9700\u5e08\u8d21");
        this.ALLATORIxDEMO[10].setText("\u5f53\u524d\u5e08\u8d21");
    }

    public void iIiIiiiiIIiIi() {
        LoginResult loginResult = this.ALLATORIxDEMO().getLoginResult();
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        int IiiiiiiiIIIII = iIiIiiiiIiIII.getExtraPointInt("T");
        BigDecimal IiiiiiiiIIIII2 = loginResult.getExperience();
        int IiiiiiiiIIIII3 = ExpUtil.getTSP((int)IiiiiiiiIIIII);
        int IiiiiiiiIIIII4 = ExpUtil.getTSX((int)IiiiiiiiIIIII);
        int IiiiiiiiIIIII5 = ExpUtil.getTSExp((int)(IiiiiiiiIIIII3 + 1));
        String IiiiiiiiIIIII6 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)iIiIiiiiIiIII.getGrade());
        int IiiiiiiiIIIII7 = ExpUtil.ALLATORIxDEMO((int)loginResult.getGrade());
        int IiiiiiiiIIIII8 = ExpUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII7, (GameClient)this.ALLATORIxDEMO());
        String IiiiiiiiIIIII9 = ExpUtil.ALLATORIxDEMO((BigDecimal)this.getRace_id(), (int)IiiiiiiiIIIII7);
        loginResult.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII9, IiiiiiiiIIIII3, IiiiiiiiIIIII8);
        this.IiiIiiiiiiIiI();
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi() {
        BigDecimal IiiiiiiiIIIII;
        LoginResult IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLoginResult();
        BigDecimal IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getExperience();
        BigDecimal bigDecimal = IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? IiiiiiiiIIIII2.getScoretype("\u5e08\u95e8\u8d21\u732e") : IiiiiiiiIIIII2.getGold();
        if (IiiiiiiiIIIII3.compareTo(this.iIiiIiiiiiiII) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u7ecf\u9a8c\u4e0d\u8db3");
            return;
        }
        if (IiiiiiiiIIIII.compareTo(this.IiIIIiiiiIiiI) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5) ? "\u5f53\u524d\u5e08\u95e8\u8d21\u732e\u4e0d\u8db3" : "\u5f53\u524d\u5927\u8bdd\u5e01\u4e0d\u8db3");
            return;
        }
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getExtraPointInt("T");
        int IiiiiiiiIIIII5 = ExpUtil.getTSP((int)IiiiiiiiIIIII4);
        int IiiiiiiiIIIII6 = ExpUtil.getTSX((int)IiiiiiiiIIIII4);
        int IiiiiiiiIIIII7 = ExpUtil.getTSExp((int)(IiiiiiiiIIIII5 + 1));
        String IiiiiiiiIIIII8 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII2.getGrade());
        int IiiiiiiiIIIII9 = ExpUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getGrade());
        int IiiiiiiiIIIII10 = ExpUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII9, (GameClient)this.ALLATORIxDEMO());
        String IiiiiiiiIIIII11 = ExpUtil.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII2.getRace_id(), (int)IiiiiiiiIIIII9);
        if (IiiiiiiiIIIII5 >= IiiiiiiiIIIII10) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u5151\u6362\u81f3\u5f53\u524d\u5883\u754c\u4e0a\u9650");
            return;
        }
        IiiiiiiiIIIII3 = IiiiiiiiIIIII3.subtract(this.iIiiIiiiiiiII);
        IiiiiiiiIIIII = IiiiiiiiIIIII.subtract(this.IiIIIiiiiIiiI);
        IiiiiiiiIIIII2.setExperience(IiiiiiiiIIIII3);
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5)) {
            IiiiiiiiIIIII2.setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII2.getScore(), (String)("\u5e08\u95e8\u8d21\u732e=" + IiiiiiiiIIIII), (int)1));
        } else {
            IiiiiiiiIIIII2.setGold(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII2.setExtraPoint("T", 1);
        String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"rolechange", (String)"T1");
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u4fee\u70bc\u70b9\u52a01");
        IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getExtraPointInt("T");
        IiiiiiiiIIIII5 = ExpUtil.getTSP((int)IiiiiiiiIIIII4);
        IiiiiiiiIIIII6 = ExpUtil.getTSX((int)IiiiiiiiIIIII4);
        IiiiiiiiIIIII7 = ExpUtil.getTSExp((int)(IiiiiiiiIIIII5 + 1));
        this.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII8, IiiiiiiiIIIII11, IiiiiiiiIIIII5, IiiiiiiiIIIII10);
        this.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(BigDecimal experience, int tsx, int tsExp, String lvl, String raceConfirm, int tsp, int realmMaxTSP) {
        this.iiiiIiiiIiiII[0].setText(String.valueOf(tsp));
        this.iiiiIiiiIiiII[1].setText(String.valueOf(realmMaxTSP - tsp));
        this.iiiiIiiiIiiII[2].setText(lvl);
        this.iiiiIiiiIiiII[3].setText(raceConfirm == null ? "- -" : raceConfirm);
        this.iiiiIiiiIiiII[4].setText(String.valueOf(tsx) + "/" + tsExp);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(LoginResult loginResult, BigDecimal gold, BigDecimal experience, BigDecimal value, int tsD) {
        void IiiiiiiiIIIII;
        void IiiiiiiiIIIII2;
        int n = tsD >= value.intValue() ? value.intValue() : tsD;
        gold = gold.subtract(new BigDecimal((int)IiiiiiiiIIIII2).multiply(this.IiIIIiiiiIiiI));
        experience = experience.subtract(new BigDecimal((int)IiiiiiiiIIIII2).multiply(this.iIiiIiiiiiiII));
        loginResult.setExperience(experience);
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 5)) {
            loginResult.setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)loginResult.getScore(), (String)("\u5e08\u95e8\u8d21\u732e=" + gold), (int)1));
        } else {
            loginResult.setGold(gold);
        }
        loginResult.setExtraPoint("T", (int)IiiiiiiiIIIII2);
        String string = Agreement.getSendTextAES((String)"rolechange", (String)("T" + (int)IiiiiiiiIIIII2));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u4fee\u70bc\u70b9\u52a0" + (int)IiiiiiiiIIIII2);
        int IiiiiiiiIIIII3 = loginResult.getExtraPointInt("T");
        int IiiiiiiiIIIII4 = ExpUtil.getTSP((int)IiiiiiiiIIIII3);
        int IiiiiiiiIIIII5 = ExpUtil.getTSX((int)IiiiiiiiIIIII3);
        int IiiiiiiiIIIII6 = ExpUtil.getTSExp((int)(IiiiiiiiIIIII4 + 1));
        String IiiiiiiiIIIII7 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)loginResult.getGrade());
        int IiiiiiiiIIIII8 = ExpUtil.ALLATORIxDEMO((int)loginResult.getGrade());
        int IiiiiiiiIIIII9 = ExpUtil.ALLATORIxDEMO((int)IiiiiiiiIIIII8, (GameClient)this.ALLATORIxDEMO());
        String IiiiiiiiIIIII10 = ExpUtil.ALLATORIxDEMO((BigDecimal)loginResult.getRace_id(), (int)IiiiiiiiIIIII8);
        this.ALLATORIxDEMO(experience, IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII4, IiiiiiiiIIIII9);
        this.IiiIiiiiiiIiI();
    }
}
