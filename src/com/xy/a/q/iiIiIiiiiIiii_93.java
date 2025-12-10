/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIii
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IIIIIiiiIIIiI
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.a.q.iiIIiiiiIiiII
 *  com.xy.bean.QualityClBean
 *  com.xy.bean.UseCardBean
 *  com.xy.formula.BaseEquip
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.IIIiIiiiIiIii;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IIIIIiiiIIIiI;
import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.a.q.iiIIiiiiIiiII;
import com.xy.bean.QualityClBean;
import com.xy.bean.UseCardBean;
import com.xy.formula.BaseEquip;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    private IiiiiiiiiIIII[] iiIiIiiiiIIIi;
    public QualityClBean iiiiIiiiIiiII;
    private IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private IIIiIiiiiIiII iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private iiIiIiiiiIiIi iIiIiiiiIiIii;
    private MoneyType IiIIIiiiiIiiI;
    private List<iiIIiiiiIiiII> iiIiiiiiiiIii;
    public int IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public String iIiIiiiiIIiii(boolean type) {
        this.iIiiIiiiiiiII.ALLATORIxDEMO(false);
        this.iIiiIiiiiiiII.setVisible(type);
        if (!type) return null;
        return this.ALLATORIxDEMO(false);
    }

    public iiIiIiiiiIiii(GameView gameView) {
        super(11, 3, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 470, 328, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.iIiIiiiiIIiii(true);
        this.iiIiiiiiiiIii = new ArrayList<iiIIiiiiIiiII>();
        this.iiIiIiiiiIIIi = new IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/46.png", 1, 224 + IiiiiiiiIIIII, com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u4fdd\u7559\u539f\u5c5e\u6027" : (IiiiiiiiIIIII == 1 ? "\u66ff\u6362\u65b0\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u518d\u6b21\u70bc\u5316" : "")), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(69 + 207 * IiiiiiiiIIIII, 279, 119, 25);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setImage("sc/e/28.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(365, 28, 68, 18);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IIIiIiiiiIiII();
        this.iIiiIiiiiiiII.iIiIiiiiIIiii(true);
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u521d\u5b66\u4e4d\u7ec3");
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u521d\u7aa5\u95e8\u5f84");
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u7565\u6709\u5c0f\u6210");
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u878d\u4f1a\u8d2f\u901a");
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u5fc3\u9886\u795e\u4f1a");
        this.iIiiIiiiiiiII.ALLATORIxDEMO("\u7089\u706b\u7eaf\u9752");
        this.iIiiIiiiiiiII.ALLATORIxDEMO(68, 28, 99, 19);
        this.iIiiIiiiiiiII.setVisible(false);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new MoneyType();
        this.IiIIIiiiiIiiI.setIdAndKey(3, "\u4ed9\u7389");
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)68, (int)28, (int)99, (int)19, (int)10, (Color)Color.white, (Font)com.xy.q.iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IiIIIiiiiIiiI, (GameView)gameView);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(2);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iIiIiiiiIiIii);
        this.IIiiIiiiIIiIi = new JLabel[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(57 + 210 * IiiiiiiiIIIII), (int)59, (int)183, (int)23, (Color)(IiiiiiiiIIIII == 0 ? Color.white : (IiiiiiiiIIIII == 1 ? Color.green : Color.black)), (Font)(IiiiiiiiIIIII == 4 ? com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI : (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 ? com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII : com.xy.q.iiIIiiiiIiiII.IIIiiiiiIIiII)));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u539f\u70bc\u5316\u5c5e\u6027" : (IiiiiiiiIIIII == 1 ? "\u65b0\u70bc\u5316\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u4ed9\u7389" : (IiiiiiiiIIIII == 3 ? "\u8ffd\u52a0\u7279\u6280" : ""))));
            if (IiiiiiiiIIIII == 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(28, 28, 36, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(293, 29, 68, 17);
            } else if (IiiiiiiiIIIII == 4) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(30, 10, 450, 17);
            }
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/29.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(276, 28, 17, 17);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(36 + (IiiiiiiiIIIII - 1) * 210, 59, 183, 23);
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(26 + (IiiiiiiiIIIII - 3) * 210, 50, 208, 218);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 7)) {
            this.iiiIiiiiiiiIi[0].setVisible(false);
            this.IIiiIiiiIIiIi[3].setVisible(false);
            return;
        }
        if (this.ALLATORIxDEMO().gameType != 2) return;
        this.iiiIiiiiiiiIi[0].setVisible(false);
        this.IIiiIiiiIIiIi[3].setVisible(false);
        this.IIiiIiiiIIiIi[2].setVisible(false);
        this.iIiIiiiiIiIii.setVisible(false);
    }

    public String ALLATORIxDEMO(boolean type) {
        int IiiiiiiiIIIII = this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == -1) {
            return null;
        }
        UseCardBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLimit("\u5355\u4eba\u7ade\u6280\u573a");
        if (IiiiiiiiIIIII2 == null) {
            if (!type) return null;
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u672a\u83b7\u5f97\u79f0\u53f7");
            return null;
        }
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getValue().split("\\|");
        iiiIIiiiIIIii IiiiiiiiIIIII4 = this.iIiiIiiiiiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII3.length < IiiiiiiiIIIII + 1) {
            if (!type) return null;
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u672a\u83b7\u5f97" + IiiiiiiiIIIII4.ALLATORIxDEMO() + "\u79f0\u53f7");
            return null;
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO().setText(IiiiiiiiIIIII4.ALLATORIxDEMO());
        return IiiiiiiiIIIII3[IiiiiiiiIIIII];
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String v, int type, boolean is) {
        block46: {
            block47: {
                block45: {
                    block44: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block39: {
                                            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 7)) {
                                                if (this.IiiiiiiiIIIII != 0) {
                                                    is = false;
                                                }
                                            } else if (this.ALLATORIxDEMO().gameType == 2) {
                                                is = false;
                                            }
                                            IiiiiiiiIIIII = true;
                                            if (type != 0) break block39;
                                            IiiiiiiiIIIII = 0;
                                            if (true) ** GOTO lbl19
                                        }
                                        if (type != 1) break block40;
                                        IiiiiiiiIIIII = 0;
                                        if (true) ** GOTO lbl35
                                        do {
                                            if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)(IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII)))) {
                                                iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII).setVisible(false);
                                            }
                                            ++IiiiiiiiIIIII;
lbl19:
                                            // 2 sources

                                        } while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size());
                                        if (this.IiiiiiiiIIIII == 0) {
                                            this.IIiiIiiiIIiIi[4].setText(null);
                                        }
                                        this.iiiiIiiiIiiII = null;
                                        IiiiiiiiIIIII = 0;
                                        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
                                            v0 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
                                            ++IiiiiiiiIIIII;
                                            v0.setVisible(false);
                                        }
                                        IiiiiiiiIIIII = true;
                                        break block40;
                                        do {
                                            if (!iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)(IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII)))) {
                                                IiiiiiiiIIIII.setVisible(false);
                                            }
                                            ++IiiiiiiiIIIII;
lbl35:
                                            // 2 sources

                                        } while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size());
                                        IiiiiiiiIIIII = false;
                                    }
                                    if (v == null || v.equals("")) {
                                        if (type != 0) return;
                                        if (this.IiiiiiiiIIIII != 6) return;
                                        this.IIiiIiiiIIiIi[4].setText("\u7cb9\u70bc\u9700\u8981\u6d88\u80171\u4efd\u6750\u6599");
                                        return;
                                    }
                                    IiiiiiiiIIIII = v.split(this.IiiiiiiiIIIII == 7 ? "\\|" : "&");
                                    IiiiiiiiIIIII = 0;
                                    if (this.IiiiiiiiIIIII != 0 && this.IiiiiiiiIIIII != 1 && this.IiiiiiiiIIIII != 8) break block41;
                                    IiiiiiiiIIIII = this.IiiiiiiiIIIII == 0 ? 1 : 2;
                                    if (true) ** GOTO lbl89
                                }
                                if (this.IiiiiiiiIIIII != 2 && this.IiiiiiiiIIIII != 3) break block42;
                                IiiiiiiiIIIII = 1;
                                if (true) ** GOTO lbl101
                            }
                            if (this.IiiiiiiiIIIII != 4) break block43;
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl109
                        }
                        if (this.IiiiiiiiIIIII != 5 && this.IiiiiiiiIIIII != 6) break block44;
                        IiiiiiiiIIIII = 1.0;
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII = IiiiiiiiIIIII >> 5 & 31;
                        IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                        if (type == 0 && this.IiiiiiiiIIIII == 6) {
                            this.IIiiIiiiIIiIi[4].setText("\u7cb9\u70bc\u9700\u8981\u6d88\u8017" + (1 + IiiiiiiiIIIII / 8 + IiiiiiiiIIIII / 8) + "\u4efd\u6750\u6599");
                        }
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.ALLATORIxDEMO("\u603b\u70b9\u7cb9\u503c", String.valueOf(IiiiiiiiIIIII + IiiiiiiiIIIII));
                        IiiiiiiiIIIII = 4;
                        if (true) ** GOTO lbl120
                    }
                    if (this.IiiiiiiiIIIII != 7) break block45;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl151
                    do {
                        if (!(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u7279\u6280")) {
                            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[0], String.valueOf(IiiiiiiiIIIII[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII[0]));
                        } else {
                            IiiiiiiiIIIII = 1;
                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                                if (IiiiiiiiIIIII != null) {
                                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                                    ++IiiiiiiiIIIII;
                                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[0], IiiiiiiiIIIII.getSkillname());
                                }
                                ++IiiiiiiiIIIII;
                            }
                        }
                        ++IiiiiiiiIIIII;
lbl89:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    break block45;
                    do {
                        if (!(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u661f\u9635 ")) {
                            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[0], String.valueOf(IiiiiiiiIIIII[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII[0]));
                        } else {
                            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[1], IiiiiiiiIIIII[2]);
                        }
                        ++IiiiiiiiIIIII;
lbl101:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    break block45;
                    do {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[0], String.valueOf(IiiiiiiiIIIII[1]) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII[0]));
                        ++IiiiiiiiIIIII;
lbl109:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    break block45;
                    do {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3))) != null) {
                            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                            if (IiiiiiiiIIIII == 8121) {
                                IiiiiiiiIIIII += 0.15;
                            } else if (IiiiiiiiIIIII == 8122) {
                                IiiiiiiiIIIII += 0.25;
                            }
                        }
                        ++IiiiiiiiIIIII;
lbl120:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    IiiiiiiiIIIII = 2;
                    while (IiiiiiiiIIIII < 4 && IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) != -1) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("#", IiiiiiiiIIIII.length() + 1);
                            IiiiiiiiIIIII = BaseEquip.getDouble((String)IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII.length() + 1, IiiiiiiiIIIII));
                            IiiiiiiiIIIII *= (double)(IiiiiiiiIIIII == 2 ? IiiiiiiiIIIII : IiiiiiiiIIIII);
                            IiiiiiiiIIIII += BaseEquip.getDouble((String)IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                            if (IiiiiiiiIIIII != 1.0) {
                                IiiiiiiiIIIII *= IiiiiiiiIIIII;
                            }
                            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, String.valueOf(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((double)IiiiiiiiIIIII)) + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII));
                        }
                        ++IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII = 4;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3))) != null) {
                            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.ALLATORIxDEMO("\u7279\u6280", IiiiiiiiIIIII.getSkillname());
                        }
                        ++IiiiiiiiIIIII;
                    }
                    break block45;
                    do {
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, is);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII[0], IiiiiiiiIIIII[1]);
                        ++IiiiiiiiIIIII;
lbl151:
                        // 2 sources

                    } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                }
                IiiiiiiiIIIII = false;
                if (type != 0) break block46;
                if (this.IiiiiiiiIIIII != 1) break block47;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl170
            }
            IiiiiiiiIIIII = true;
            break block46;
            do {
                if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)(IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII)))) {
                    if (IiiiiiiiIIIII.isVisible()) {
                        ++IiiiiiiiIIIII;
                    }
                    if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII) && iiIIiiiiIiiII.iIiIiiiiIIiii((iiIIiiiiIiiII)IiiiiiiiIIIII)) {
                        ++IiiiiiiiIIIII;
                    }
                }
                ++IiiiiiiiIIIII;
lbl170:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size());
            if (IiiiiiiiIIIII > IiiiiiiiIIIII) {
                IiiiiiiiIIIII = true;
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u91cd\u65b0\u9501\u5b9a");
            }
        }
        if (IiiiiiiiIIIII == false) return;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII)) {
                IiiiiiiiIIIII.ALLATORIxDEMO(false);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(BigDecimal rgid, String value, int leixing, boolean is) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            iiIIiiiiIiiII IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII2)) {
                IiiiiiiiIIIII2.ALLATORIxDEMO(false);
                iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII2).setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
        this.IIiiIiiiIIiIi[4].setText(null);
        this.IiiiiiiiIIIII = leixing;
        this.ALLATORIxDEMO = rgid;
        String IiiiiiiiIIIII2 = this.iIiIiiiiIIiii(leixing == 4);
        if (leixing == 4) {
            value = IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO(value, 0, is);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public int iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        return IiiiiiiiIIIII * 10 + IiiiiiiiIIIII2;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 224) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            return;
        }
        if (id != 225) {
            if (id != 226) return;
            this.iiiIiiiiiiIIi();
            return;
        }
        if (this.iiiiIiiiIiiII != null) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"extrattroper", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iiiiIiiiIiiII));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iIiIiiiiIIiii(this.iiiiIiiiIiiII);
            return;
        }
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public int iiiIiiiiiiIIi() {
        return 0;
    }

    public boolean ALLATORIxDEMO(int leixing, BigDecimal goodRgid) {
        if (this.IiiiiiiiIIIII != leixing) return false;
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO, (BigDecimal)goodRgid)) return false;
        return true;
    }

    public iiIIiiiiIiiII ALLATORIxDEMO(boolean left, int index, boolean is) {
        iiIIiiiiIiiII IiiiiiiiIIIII;
        block4: {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.size()) {
                IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII2);
                if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII) != left || iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII) != index) {
                    ++IiiiiiiiIIIII2;
                    continue;
                }
                break block4;
            }
            iiIIiiiiIiiII IiiiiiiiIIIII22 = new iiIIiiiiIiiII(this, left, index);
            IiiiiiiiIIIII22.setBounds(left ? 34 : 244, 85 + 30 * index, 220, 28);
            this.iiIiiiiiiiIii.add(IiiiiiiiIIIII22);
            this.add((Component)IiiiiiiiIIIII22, 5);
            if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII22) != null) {
                iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII22).setVisible(is);
            }
            IiiiiiiiIIIII22.setVisible(true);
            return IiiiiiiiIIIII22;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(null, null);
        if (iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII) != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII).setVisible(is);
        }
        IiiiiiiiIIIII.setVisible(true);
        return IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        if (this.IiiiiiiiIIIII == 0) {
            String IiiiiiiiIIIII;
            IIIIIiiiIiIii IiiiiiiiIIIII2 = (IIIIIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(61);
            IIIIIiiiIIIiI IiiiiiiiIIIII3 = IiiiiiiiIIIII2.iiiIiiiiiiIIi() == 0 ? IiiiiiiiIIIII2.ALLATORIxDEMO() : null;
            String string = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : null;
            if (IiiiiiiiIIIII != null && (IiiiiiiiIIIII.equals("\u70bc\u5316\u88c5\u5907") || IiiiiiiiIIIII.equals("\u70bc\u5316\u4ed9\u5668") || IiiiiiiiIIIII.equals("\u70bc\u5316\u795e\u5175"))) {
                IiiiiiiiIIIII3.ALLATORIxDEMO(false);
                return;
            }
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u6750\u6599");
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            String IiiiiiiiIIIII;
            IIIIIiiiIiIii IiiiiiiiIIIII4 = (IIIIIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(61);
            IIIIIiiiIIIiI IiiiiiiiIIIII5 = IiiiiiiiIIIII4.iiiIiiiiiiIIi() == 2 ? IiiiiiiiIIIII4.ALLATORIxDEMO() : null;
            String string = IiiiiiiiIIIII = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.ALLATORIxDEMO() : null;
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("\u70bc\u5668")) {
                IiiiiiiiIIIII5.ALLATORIxDEMO(false);
                return;
            }
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u6750\u6599");
            return;
        }
        if (this.IiiiiiiiIIIII == 2 || this.IiiiiiiiIIIII == 3) {
            iIiIIiiiIiiiI IiiiiiiiIIIII = (iIiIIiiiIiiiI)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(95);
            IiiiiiiiIIIII.iIiIiiiiIIiii();
            return;
        }
        if (this.IiiiiiiiIIIII == 4) return;
        if (this.IiiiiiiiIIIII == 5) {
            String IiiiiiiiIIIII;
            IIIIIiiiIiIii IiiiiiiiIIIII6 = (IIIIIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(61);
            IIIIIiiiIIIiI IiiiiiiiIIIII7 = IiiiiiiiIIIII6.iiiIiiiiiiIIi() == 1 ? IiiiiiiiIIIII6.ALLATORIxDEMO() : null;
            String string = IiiiiiiiIIIII = IiiiiiiiIIIII7 != null ? IiiiiiiiIIIII7.ALLATORIxDEMO() : null;
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("\u914d\u9970\u70b9\u7cb9")) {
                IiiiiiiiIIIII7.ALLATORIxDEMO(false);
                return;
            }
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u6750\u6599");
            return;
        }
        if (this.IiiiiiiiIIIII == 6) {
            String IiiiiiiiIIIII;
            IIIIIiiiIiIii IiiiiiiiIIIII8 = (IIIIIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(61);
            IIIIIiiiIIIiI IiiiiiiiIIIII9 = IiiiiiiiIIIII8.iiiIiiiiiiIIi() == 1 ? IiiiiiiiIIIII8.ALLATORIxDEMO() : null;
            String string = IiiiiiiiIIIII = IiiiiiiiIIIII9 != null ? IiiiiiiiIIIII9.ALLATORIxDEMO() : null;
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("\u914d\u9970\u7cb9\u70bc")) {
                IiiiiiiiIIIII9.ALLATORIxDEMO(false);
                return;
            }
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u6750\u6599");
            return;
        }
        if (this.IiiiiiiiIIIII == 7) {
            IIiIiiiiIiIII IiiiiiiiIIIII = (IIiIiiiiIiIII)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(166);
            if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) return;
            IiiiiiiiIIIII.iIiIiiiiIIiii();
            return;
        }
        if (this.IiiiiiiiIIIII != 8) return;
        IIiIiiiiIiIII IiiiiiiiIIIII = (IIiIiiiiIiIII)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(166);
        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(QualityClBean clBean) {
        if (clBean.getType() >= 71 && clBean.getType() <= 76) {
            this.IiiiiiiiIIIII = 4;
            this.ALLATORIxDEMO(clBean.getNewAttr(), 0, false);
        } else {
            Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(clBean.getRgid());
            if (IiiiiiiiIIIII != null) {
                if (clBean.getType() == 2 || clBean.getType() == -2) {
                    this.IiiiiiiiIIIII = 1;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)1, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, true);
                } else if (clBean.getType() == 1) {
                    this.IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)0, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, true);
                } else if (clBean.getType() == 53) {
                    this.IiiiiiiiIIIII = 2;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)0, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, false);
                } else if (clBean.getType() == 54) {
                    this.IiiiiiiiIIIII = 3;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)6, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, false);
                } else if (clBean.getType() == -81 || clBean.getType() == -82 || clBean.getType() == 82) {
                    this.IiiiiiiiIIIII = clBean.getType() == -81 ? 5 : 6;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)8, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, false);
                } else if (clBean.getType() == 133) {
                    void IiiiiiiiIIIII2;
                    this.IiiiiiiiIIIII = 7;
                    String IiiiiiiiIIIII3 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getValue(), (String)"\u7b49\u7ea7=", (String)"|");
                    String IiiiiiiiIIIII4 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getValue(), (String)"\u88c5\u5907\u7c7b\u578b=", (String)"|");
                    String IiiiiiiiIIIII5 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getValue(), (String)"\u6027\u522b\u8981\u6c42=", (String)"|");
                    String IiiiiiiiIIIII6 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getValue(), (String)"\u70bc\u5668\u5c5e\u6027&", (String)"|");
                    StringBuffer stringBuffer = new StringBuffer();
                    IiiiiiiiIIIII2.append("\u7b49\u7ea7=");
                    IiiiiiiiIIIII2.append(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3 : "0");
                    IiiiiiiiIIIII2.append("|\u88c5\u5907\u7c7b\u578b=");
                    IiiiiiiiIIIII2.append(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4 : "\u672a\u77e5");
                    if (IiiiiiiiIIIII5 != null && (IiiiiiiiIIIII5.equals("\u7537") || IiiiiiiiIIIII5.equals("\u5973"))) {
                        IiiiiiiiIIIII2.append("|\u6027\u522b\u8981\u6c42=");
                        IiiiiiiiIIIII2.append(IiiiiiiiIIIII5);
                    }
                    if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)clBean.getNewAttr())) {
                        IiiiiiiiIIIII2.append("|");
                        IiiiiiiiIIIII2.append(clBean.getNewAttr());
                    }
                    if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII6)) {
                        IiiiiiiiIIIII2.append("|\u70bc\u5668\u5c5e\u6027&");
                        IiiiiiiiIIIII2.append(IiiiiiiiIIIII6);
                    }
                    IiiiiiiiIIIII.setValue(IiiiiiiiIIIII2.toString());
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, true);
                } else if (clBean.getType() == 135) {
                    this.IiiiiiiiIIIII = 8;
                    IiiiiiiiIIIII.setValue(GoodType.ALLATORIxDEMO((String[])IiiiiiiiIIIII.getValue().split("\\|"), (int)1, (String)clBean.getNewAttr()));
                    this.ALLATORIxDEMO(clBean.getNewAttr(), 0, true);
                }
            } else {
                this.ALLATORIxDEMO(null, 0, false);
            }
        }
        this.iiiiIiiiIiiII = null;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(QualityClBean clBean) {
        block13: {
            if (clBean.getType() == -2) {
                this.iIiIiiiiIIiii(clBean);
                IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII.IIIIIiiiiIIii(clBean.getNewAttr());
                return;
            }
            if (clBean.getType() == 1) {
                this.iiiiIiiiIiiII = clBean;
                this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
                IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII.IIIiIiiiIiIii(clBean.getNewAttr());
                return;
            }
            if (clBean.getType() == 53) {
                this.iiiiIiiiIiiII = clBean;
                this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
                IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII.IIIiiiiiiIIiI(clBean.getNewAttr());
                return;
            }
            if (clBean.getType() != 54) break block13;
            this.iiiiIiiiIiiII = clBean;
            IiiiiiiiIIIII = clBean.getNewAttr();
            IiiiiiiiIIIII = 0.0;
            IiiiiiiiIIIII = ((iIiIIiiiIiiiI)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(95)).ALLATORIxDEMO();
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII) : null;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)"\u70bc\u5316\u5c5e\u6027") : null;
            IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.split("&") : null;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = true;
            if (true) ** GOTO lbl69
        }
        if (clBean.getType() >= 71 && clBean.getType() <= 76) {
            this.iiiiIiiiIiiII = clBean;
            this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
            return;
        }
        if (clBean.getType() == -81 || clBean.getType() == -82) {
            this.iIiIiiiiIIiii(clBean);
            IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(clBean.getNewAttr(), clBean.getType() == -81);
            return;
        }
        if (clBean.getType() == 82) {
            this.iiiiIiiiIiiII = clBean;
            this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
            IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.ALLATORIxDEMO(clBean.getNewAttr(), false);
            return;
        }
        if (clBean.getType() == 133) {
            this.iiiiIiiiIiiII = clBean;
            this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
            IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.IIiIIiiiIiIIi(clBean.getNewAttr());
            return;
        }
        if (clBean.getType() != 135) return;
        this.iiiiIiiiIiiII = clBean;
        this.ALLATORIxDEMO(clBean.getNewAttr(), 1, false);
        IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.IiiIiiiiiiIiI(clBean.getNewAttr());
        return;
        do {
            if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) != -1 && (IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII)).equals("\u661f\u9635\u5c5e\u6027")) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                break;
            }
            IiiiiiiiIIIII += 1;
lbl69:
            // 2 sources

        } while (IiiiiiiiIIIII < (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.length : false));
        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.split("&") : null;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            IiiiiiiiIIIII = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (!iiIIiiiiIiiII.ALLATORIxDEMO((iiIIiiiiIiiII)IiiiiiiiIIIII)) {
                IiiiiiiiIIIII.setVisible(false);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < (IiiiiiiiIIIII != null ? IiiiiiiiIIIII.length : 0)) {
            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
            if (IiiiiiiiIIIII != -1) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1);
                IiiiiiiiIIIII += MsgUntil.ALLATORIxDEMO((String)IiiiiiiiIIIII[2], (String)IiiiiiiiIIIII, (String)IiiiiiiiIIIII);
                v0 = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, false);
                ++IiiiiiiiIIIII;
                v0.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, false);
        ++IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO("\u4e94\u884c\u52a0\u6210", String.valueOf(String.format("%.1f", new Object[]{IiiiiiiiIIIII})) + "%");
        IiiiiiiiIIIII = (IIIiIiiiIiIii)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(121);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(clBean.getNewAttr(), IiiiiiiiIIIII == null ? -1.0 : IiiiiiiiIIIII);
    }
}
