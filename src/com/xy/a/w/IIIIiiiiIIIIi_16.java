/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.w.IiiIIiiiiIiii
 *  com.xy.bean.LoginResult
 *  com.xy.formula.BaseMeridians
 *  com.xy.game.NpcOption
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.a.w.IiiIIiiiiIiii;
import com.xy.bean.LoginResult;
import com.xy.formula.BaseMeridians;
import com.xy.game.NpcOption;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
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
import javax.swing.JLabel;

public class IIIIiiiiIIIIi
extends IiiiIiiiiIiIi {
    private int iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private IIiIiiiiIiIII IIiiIiiiIIiIi;
    private List<NpcOption> iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIiIiiiiIiIII[] iiIiiiiiiiIii;
    private IiiIIiiiiIiii IiiiiiiiIIIII;
    private IiiIIiiiiIiii ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public void iiiiiiiiIIiii() {
        IiiiiiiiIIIII = this.ALLATORIxDEMO().getPrivateData().getBorn();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.equals("")) {
            return;
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                block5: {
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u53cc\u5c5e\u6027")) break block5;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl35
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                if (IiiiiiiiIIIII.equals("HP\u6210\u957f") || IiiiiiiiIIIII.equals("MP\u6210\u957f") || IiiiiiiiIIIII.equals("AP\u6210\u957f") || IiiiiiiiIIIII.equals("SP\u6210\u957f")) {
                    IiiiiiiiIIIII = IiiiIiiiiIIII.iiiIiiiiiiIIi((double)IiiiiiiiIIIII.doubleValue(), (double)100.0);
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.setTextSize(String.valueOf(IiiiiiiiIIIII) + ":" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII.doubleValue(), (int)1), 130);
                this.ALLATORIxDEMO.ALLATORIxDEMO((NpcOption)IiiiiiiiIIIII);
                break block6;
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                    IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                    if (IiiiiiiiIIIII.equals("HP\u6210\u957f") || IiiiiiiiIIIII.equals("MP\u6210\u957f") || IiiiiiiiIIIII.equals("AP\u6210\u957f") || IiiiiiiiIIIII.equals("SP\u6210\u957f")) {
                        IiiiiiiiIIIII = IiiiIiiiiIIII.iiiIiiiiiiIIi((double)IiiiiiiiIIIII.doubleValue(), (double)100.0);
                    }
                    var12_13 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                    ++IiiiiiiiIIIII;
                    var12_13.setTextSize(String.valueOf(IiiiiiiiIIIII) + ":" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII.doubleValue(), (int)1), 130);
                    ++IiiiiiiiIIIII;
                    this.IiiiiiiiIIIII.ALLATORIxDEMO((NpcOption)IiiiiiiiIIIII);
lbl35:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI() {
        block42: {
            block41: {
                block40: {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                    if (this.iiiIiiiiiiiIi != 0) break block40;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
                    IiiiiiiiIIIII = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII.getGrade());
                    IiiiiiiiIIIII = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade());
                    IiiiiiiiIIIII = new StringBuffer();
                    IiiiiiiiIIIII.append("B");
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl55
                }
                if (this.iiiIiiiiiiiIi != 1) break block41;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getPrivateData();
                IiiiiiiiIIIII = IiiiiiiiIIIII.getBorn();
                if (IiiiiiiiIIIII == null) return;
                if (IiiiiiiiIIIII.equals("")) {
                    return;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII = null;
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl93
            }
            if (this.iiiIiiiiiiiIi != 2) break block42;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getRoleProperty().meridiansVector;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl114
            do {
                if (IiiiiiiiIIIII != 4 || IiiiiiiiIIIII == 4) {
                    if (IiiiiiiiIIIII != 0) {
                        IiiiiiiiIIIII.append("=");
                    }
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getBone() - IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII == 1) {
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSpir() - IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII == 2) {
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getPower() - IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII == 3) {
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSpeed() - IiiiiiiiIIIII);
                    } else {
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getCalm() - IiiiiiiiIIIII);
                    }
                }
                ++IiiiiiiiIIIII;
lbl55:
                // 2 sources

            } while (IiiiiiiiIIIII < 5);
            IiiiiiiiIIIII = IiiiiiiiIIIII.getPackRecord().getBaseValue(5, "B");
            IiiiiiiiIIIII.getPackRecord().setEquip("B", IiiiiiiiIIIII.toString());
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                if (IiiiiiiiIIIII == 4 && IiiiiiiiIIIII != 4) {
                    IiiiiiiiIIIII.setCalm(Integer.valueOf(0));
                } else {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII] != null ? IiiiiiiiIIIII[IiiiiiiiIIIII].intValue() : 0;
                    IiiiiiiiIIIII += IiiiiiiiIIIII;
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII.setBone(Integer.valueOf(IiiiiiiiIIIII));
                    } else if (IiiiiiiiIIIII == 1) {
                        IiiiiiiiIIIII.setSpir(Integer.valueOf(IiiiiiiiIIIII));
                    } else if (IiiiiiiiIIIII == 2) {
                        IiiiiiiiIIIII.setPower(Integer.valueOf(IiiiiiiiIIIII));
                    } else if (IiiiiiiiIIIII == 3) {
                        IiiiiiiiIIIII.setSpeed(Integer.valueOf(IiiiiiiiIIIII));
                    } else {
                        IiiiiiiiIIIII.setCalm(Integer.valueOf(IiiiiiiiIIIII));
                    }
                }
                ++IiiiiiiiIIIII;
            }
            break block42;
            do {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u53cc\u5c5e\u6027")) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(4).replace("&", "|");
                } else {
                    if (IiiiiiiiIIIII.length() == 0) {
                        IiiiiiiiIIIII.append("\u53cc\u5c5e\u6027");
                    }
                    IiiiiiiiIIIII.append("&");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                }
                ++IiiiiiiiIIIII;
lbl93:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII = IiiiiiiiIIIII == null || IiiiiiiiIIIII.equals("") != false ? IiiiiiiiIIIII.toString() : String.valueOf(IiiiiiiiIIIII) + "|" + IiiiiiiiIIIII.toString();
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(null, IiiiiiiiIIIII);
            IiiiiiiiIIIII.setBorn(IiiiiiiiIIIII);
            break block42;
            do {
                if ((IiiiiiiiIIIII = (BaseMeridians)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getBh() == 0) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                } else if (IiiiiiiiIIIII.getBh() == 99) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                } else {
                    if (IiiiiiiiIIIII.length() == 0) {
                        IiiiiiiiIIIII.append("99=");
                    } else {
                        IiiiiiiiIIIII.append("&");
                    }
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl114:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
            if (IiiiiiiiIIIII.length() == 0) {
                return;
            }
            if (IiiiiiiiIIIII != null) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey().replace("&", "|"));
            }
            if (IiiiiiiiIIIII != null) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getLoginResult();
            IiiiiiiiIIIII.setMeridians(IiiiiiiiIIIII.toString());
            IiiiiiiiIIIII.getRoleProperty().meridiansVector.clear();
            IiiiiiiiIIIII.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII.getMeridians());
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("EP" + this.iiiIiiiiiiiIi));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
        IiiiiiiiIIIII.getRoleProperty().IIIiiiiiiIIiI();
        IiiiiiiiIIIII = IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.IiiiiiiiIIIII));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public NpcOption ALLATORIxDEMO(int index) {
        NpcOption IiiiiiiiIIIII = index < this.iIiIiiiiIiIii.size() ? this.iIiIiiiiIiIii.get(index) : null;
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new NpcOption((IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.add(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi() {
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = this.ALLATORIxDEMO().getRoleProperty().meridiansVector;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
            block3: {
                block4: {
                    IiiiiiiiIIIII = (BaseMeridians)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.getBh() == 0) break block3;
                    if (IiiiiiiiIIIII.getBh() != 99) break block4;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getKey().split("&");
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl26
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.setTextSize(String.valueOf(IiiiiiiiIIIII.getKey()) + ":" + String.format("%.1f", new Object[]{IiiiiiiiIIIII.getKeyValue()}), 130);
                this.ALLATORIxDEMO.ALLATORIxDEMO((NpcOption)IiiiiiiiIIIII);
                break block3;
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("_")).length == 5) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII = new BaseMeridians(IiiiiiiiIIIII, Integer.parseInt(IiiiiiiiIIIII[1]), Integer.parseInt(IiiiiiiiIIIII[2]), IiiiiiiiIIIII.length == 5 ? IiiiiiiiIIIII[3] : null, IiiiiiiiIIIII.length == 5 ? Double.parseDouble(IiiiiiiiIIIII[4]) : 0.0);
                        var11_10 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
                        ++IiiiiiiiIIIII;
                        var11_10.setTextSize(String.valueOf(IiiiiiiiIIIII.getKey()) + ":" + String.format("%.1f", new Object[]{IiiiiiiiIIIII.getKeyValue()}), 130);
                        this.IiiiiiiiIIIII.ALLATORIxDEMO((NpcOption)IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
lbl26:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void iIiIiiiiIIiii(int typeBtn) {
        this.iiiIiiiiiiiIi = typeBtn;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == typeBtn);
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO();
        this.IiiiiiiiIIIII.ALLATORIxDEMO();
        if (this.iiiIiiiiiiiIi == 0) {
            this.iiiIiiiiiiIIi();
        } else if (this.iiiIiiiiiiiIi == 1) {
            this.iiiiiiiiIIiii();
        } else if (this.iiiIiiiiiiiIi == 2) {
            this.iIiIiiiiIIiIi();
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.ALLATORIxDEMO));
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiIIiiiiIiii.ALLATORIxDEMO((IiiIIiiiiIiii)this.IiiiiiiiIIIII));
    }

    public IIIIiiiiIIIIi(GameView gameView) {
        super(132, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 422, 320, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5207\u6362\u5c5e\u6027");
        this.iiIiiiiiiiIii = new IIiIiiiiIiIII[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/38.png", 2, 51 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5c5e \u6027" : (IiiiiiiiIIIII == 1 ? "\u4fee\u6b63" : (IiiiiiiiIIIII == 2 ? "\u7ecf\u8109" : "")), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(58 + 102 * IiiiiiiiIIIII, 22, 95, 33);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new ArrayList<NpcOption>();
        this.ALLATORIxDEMO = new IiiIIiiiiIiii(this, 0, this);
        this.IiiiiiiiIIIII = new IiiIIiiiiIiii(this, 1, this);
        if (this.ALLATORIxDEMO().VALUE.indexOf(67) == -1) {
            this.iiIiiiiiiiIii[2].setVisible(false);
        }
        this.IIiiIiiiIIiIi = new IIiIiiiiIiIII("sc/e/7.png", 1, 54, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5207\u6362", (IiiiIiiiiIiIi)this);
        this.IIiiIiiiIIiIi.setBounds(192, 276, 59, 25);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new JLabel[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(67 + IiiiiiiiIIIII % 2 * 176), (int)(99 + IiiiiiiiIIIII / 2 * 24), (int)36, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText("\u5f53\u524d\u542f\u7528");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.green);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.IIiiiiiiiiIii);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(75, 65, 72, 23);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText("\u672a\u542f\u7528");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.white);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIIiiiiIiiiI);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(251, 65, 72, 23);
            }
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(38, 36, 351, 20);
            } else if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/34.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(54 + (IiiiiiiiIIIII - 1) * 176, 65, 161, 23);
            } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(58 + (IiiiiiiiIIIII - 3) * 176, 88, 151, 21);
            } else if (IiiiiiiiIIIII == 5 || IiiiiiiiIIIII == 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(58 + (IiiiiiiiIIIII - 5) * 176, 88, 151, 177);
            } else if (IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 8) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/33.png", (int)38, (int)38, (int)38, (int)38, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(53 + (IiiiiiiiIIIII - 7) * 176, 64, 166, 210);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult();
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII2.getGrade());
        int IiiiiiiiIIIII4 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII2.getGrade());
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < 5) {
            NpcOption IiiiiiiiIIIII7 = this.ALLATORIxDEMO(IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII5;
            if (IiiiiiiiIIIII6 == 0) {
                IiiiiiiiIIIII7.setTextSize("\u6839\u9aa8:" + (IiiiiiiiIIIII2.getBone() - IiiiiiiiIIIII4), 130);
            } else if (IiiiiiiiIIIII6 == 1) {
                IiiiiiiiIIIII7.setTextSize("\u7075\u6027:" + (IiiiiiiiIIIII2.getSpir() - IiiiiiiiIIIII4), 130);
            } else if (IiiiiiiiIIIII6 == 2) {
                IiiiiiiiIIIII7.setTextSize("\u529b\u91cf:" + (IiiiiiiiIIIII2.getPower() - IiiiiiiiIIIII4), 130);
            } else if (IiiiiiiiIIIII6 == 3) {
                IiiiiiiiIIIII7.setTextSize("\u654f\u6377:" + (IiiiiiiiIIIII2.getSpeed() - IiiiiiiiIIIII4), 130);
            } else if (IiiiiiiiIIIII3 == 4) {
                IiiiiiiiIIIII7.setTextSize("\u5b9a\u529b:" + (IiiiiiiiIIIII2.getCalm() - IiiiiiiiIIIII4), 130);
            } else {
                IiiiiiiiIIIII7.setTextSize("\u5b9a\u529b:0", 130);
            }
            ++IiiiiiiiIIIII6;
            this.ALLATORIxDEMO.ALLATORIxDEMO(IiiiiiiiIIIII7);
        }
        BigDecimal[] IiiiiiiiIIIII22 = IiiiiiiiIIIII.getPackRecord().getBaseValue(5, "B");
        int IiiiiiiiIIIII8 = 0;
        while (IiiiiiiiIIIII8 < IiiiiiiiIIIII22.length) {
            int IiiiiiiiIIIII9 = IiiiiiiiIIIII22[IiiiiiiiIIIII8] != null ? IiiiiiiiIIIII22[IiiiiiiiIIIII8].intValue() : 0;
            NpcOption IiiiiiiiIIIII10 = this.ALLATORIxDEMO(IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII5;
            if (IiiiiiiiIIIII8 == 0) {
                IiiiiiiiIIIII10.setTextSize("\u6839\u9aa8:" + IiiiiiiiIIIII9, 130);
            } else if (IiiiiiiiIIIII8 == 1) {
                IiiiiiiiIIIII10.setTextSize("\u7075\u6027:" + IiiiiiiiIIIII9, 130);
            } else if (IiiiiiiiIIIII8 == 2) {
                IiiiiiiiIIIII10.setTextSize("\u529b\u91cf:" + IiiiiiiiIIIII9, 130);
            } else if (IiiiiiiiIIIII8 == 3) {
                IiiiiiiiIIIII10.setTextSize("\u654f\u6377:" + IiiiiiiiIIIII9, 130);
            } else {
                IiiiiiiiIIIII10.setTextSize("\u5b9a\u529b:" + IiiiiiiiIIIII9, 130);
            }
            ++IiiiiiiiIIIII8;
            this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII10);
        }
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }
}
