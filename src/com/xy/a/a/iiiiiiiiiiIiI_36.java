/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiIiiiiIIiI
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIiiiiIIiii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIiiIiiiiIIiI;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIiIiiiiIIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JLabel;

public class iiiiiiiiiiIiI
extends IiiiIiiiiIiIi {
    private JLabel[] iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi = -1;
    private IIiIiiiiIIiii iIiIiiiiIiIii;
    private IiIiIiiiiIIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO = -1;

    public iiiiiiiiiiIiI(GameView gameView) {
        super(97, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 562, 435, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6597\u8f6c\u661f\u79fb");
        this.IiIIIiiiiIiiI = new IiIiIiiiiIIiI("sc/e/26.png", 1, 118, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u8ba4\u8f6c\u79fb", (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(242, 304, 99, 25);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiiIiiiiiiII = new JLabel[13];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(194 + IiiiiiiiIIIII * 248), (int)111, (int)80, (int)16, (Color)Color.black, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u9752\u9f99" : (IiiiiiiiIIIII == 1 ? "\u767d\u864e" : (IiiiiiiiIIIII == 10 ? "\u53ef\u5c06\u526f\u5730\u715e\u661f\u661f\u9635\u4e2d\u7684\u9752\u9ec4\u767d\u9ed1\u5bab\u5176\u4e2d\u4e00\u4e2a\u8f6c\u79fb\u5230\u4e3b\u5730\u715e\u661f\u4e0a" : (IiiiiiiiIIIII == 11 ? "\u53bb\uff0c\u8f6c\u79fb\u540e\u526f\u5730\u715e\u661f\u5c06\u6d88\u5931\u3002" : (IiiiiiiiIIIII == 12 ? "\u6e29\u99a8\u63d0\u793a\uff1a\u5e26\u6709\u6731\u96c0\u3001\u7384\u6b66\u3001\u767d\u864e\u3001\u9752\u9f99\u56db\u79cd\u661f\u9635\u7684\u5730\u715e\u661f\u624d\u53ef\u4ee5\u6597\u8f6c\u661f\u79fb\u3002" : "\u5b66\u4e60\u4ea4\u6d41 \u5b66\u4e60\u7ec3\u4e60\u4e34\u6479\u81ea\u5b66")))));
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 9) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setForeground(Color.white);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(83 + 248 * ((IiiiiiiiIIIII - 2) / 4), 138 + 39 * ((IiiiiiiiIIIII - 2) % 4), 200, 40);
            } else if (IiiiiiiiIIIII >= 10 && IiiiiiiiIIIII <= 11) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(52, 20 + (IiiiiiiiIIIII - 10) * 16, 480, 16);
            } else if (IiiiiiiiIIIII == 12) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(52, 399, 480, 16);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(134 + 248 * IiiiiiiiIIIII, 76, 50, 50);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[22];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(130 + 248 * IiiiiiiiIIIII, 72, 59, 57);
            } else if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(193 + 248 * (IiiiiiiiIIIII - 2), 74, 30, 30);
            } else if (IiiiiiiiIIIII >= 4 && IiiiiiiiIIIII <= 11) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(61 + 248 * ((IiiiiiiiIIIII - 4) / 4), 149 + 39 * ((IiiiiiiiIIIII - 4) % 4), 18, 18);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIiiIiiiiIIiI(this, IiiiiiiiIIIII - 4));
            } else if (IiiiiiiiIIIII >= 12 && IiiiiiiiIIIII <= 19) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(57 + 248 * ((IiiiiiiiIIIII - 12) % 2), 138 + 39 * ((IiiiiiiiIIIII - 12) / 2), 220, 40);
            } else if (IiiiiiiiIIIII == 20) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(53, 343, 462, 54);
            } else if (IiiiiiiiIIIII == 21) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 59, 490, 284);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIiIii = new IIiIiiiiIIiii((IiiiIiiiiIiIi)this, 9, 1, 51, 51, 0, 0, 54, 345);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.add((Component)this.iIiIiiiiIiIii);
    }

    static /* synthetic */ void iIiIiiiiIIiii(iiiiiiiiiiIiI arg0, int arg1) {
        arg0.ALLATORIxDEMO = arg1;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int type, String[] values, Goodstable good) {
        block13: {
            block12: {
                block11: {
                    if (good == null) {
                        this.iIiIiiiiIIiii(type);
                        return;
                    }
                    if (type != 0) break block11;
                    if (values != null || (IiiiiiiiIIIII = good.getValue().split("\\|")).length < 4) break block12;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[3].split("&");
                    IiiiiiiiIIIII = IiiiiiiiIIIII.length - 1;
                    if (true) ** GOTO lbl27
                }
                IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
                }
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                if (good.getRgid().compareTo(IiiiiiiiIIIII.getRgid()) == 0) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u80fd\u9009\u62e9\u4e3b\u5361");
                    return;
                }
                if (values != null || (IiiiiiiiIIIII = good.getValue().split("\\|")).length < 4) break block13;
                IiiiiiiiIIIII = IiiiiiiiIIIII[3].split("&");
                IiiiiiiiIIIII = IiiiiiiiIIIII.length - 1;
                if (true) ** GOTO lbl50
                do {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u661f\u9635\u5c5e\u6027")) {
                        values = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                        break;
                    }
                    --IiiiiiiiIIIII;
lbl27:
                    // 2 sources

                } while (IiiiiiiiIIIII >= 1);
            }
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
            this.iiIiiiiiiiIii[2].ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/skill/" + values[1] + ".png")));
            this.iIiiIiiiiiiII[0].setText(values[1]);
            this.ALLATORIxDEMO = -1;
            IiiiiiiiIIIII = 4;
            while (IiiiiiiiIIIII < values.length) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/68.png");
                v0 = this.iIiiIiiiiiiII[IiiiiiiiIIIII - 2];
                v1 = new StringBuilder(String.valueOf(MsgUntil.getStarName((int)(IiiiiiiiIIIII - 3))));
                v2 = values[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                v0.setText(v1.append(" ").append(v2).toString());
            }
            this.iIiIiiiiIIiii(1);
            this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
            return;
            do {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u661f\u9635\u5c5e\u6027")) {
                    values = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    break;
                }
                --IiiiiiiiIIIII;
lbl50:
                // 2 sources

            } while (IiiiiiiiIIIII >= 1);
        }
        if (values == null || !MsgUntil.ALLATORIxDEMO((String)values[1])) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u661f\u5361\u6ca1\u6709\u56db\u795e\u517d\u661f\u9635");
            return;
        }
        this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
        this.iiIiiiiiiiIii[3].ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/skill/" + values[1] + ".png")));
        this.iIiiIiiiiiiII[1].setText(values[1]);
        this.IIiiIiiiIIiIi = -1;
        IiiiiiiiIIIII = 4;
        while (IiiiiiiiIIIII < values.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII + 4].iIiIiiiiIIiii("sc/e/68.png");
            v3 = this.iIiiIiiiiiiII[IiiiiiiiIIIII + 2];
            v4 = new StringBuilder(String.valueOf(MsgUntil.getStarName((int)(IiiiiiiiIIIII - 3))));
            v5 = values[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            v3.setText(v4.append(" ").append(v5).toString());
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(iiiiiiiiiiIiI arg0, int arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    static /* synthetic */ int iIiIiiiiIIiii(iiiiiiiiiiIiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiiiiiiiIIIII[1].ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII2.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII2 == null || IiiiiiiiIIIII3 == null || IiiiiiiiIIIII2.getRgid().compareTo(IiiiiiiiIIIII3.getRgid()) == 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u597d\u4e3b\u5361\u548c\u526f\u5361");
            return;
        }
        if (IiiiiiiiIIIII3.getStatus() == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u526f\u5361\u5904\u4e8e\u53c2\u6218\u72b6\u6001");
            return;
        }
        int IiiiiiiiIIIII4 = this.ALLATORIxDEMO;
        int IiiiiiiiIIIII5 = this.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII4 != -1 && IiiiiiiiIIIII5 != -1) {
            PartJade IiiiiiiiIIIII6 = new PartJade((long)IiiiiiiiIIIII4, IiiiiiiiIIIII5);
            SuitOperBean IiiiiiiiIIIII7 = new SuitOperBean();
            ArrayList<BigDecimal> IiiiiiiiIIIII8 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII8.add(IiiiiiiiIIIII2.getRgid());
            IiiiiiiiIIIII8.add(IiiiiiiiIIIII3.getRgid());
            IiiiiiiiIIIII7.setGoods(IiiiiiiiIIIII8);
            IiiiiiiiIIIII7.setType(56);
            IiiiiiiiIIIII7.setJade(IiiiiiiiIIIII6);
            String IiiiiiiiIIIII9 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII7));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII9);
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII3.getRgid());
            iIiIIiiiIiiiI IiiiiiiiIIIII10 = (iIiIIiiiIiiiI)this.ALLATORIxDEMO().iIiIiiiiIIiii(95);
            if (IiiiiiiiIIIII10 == null) return;
            IiiiiiiiIIIII10.iiiIiiiiiiIIi(IiiiiiiiIIIII3);
            return;
        }
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4e3b\u5361\u6216\u8005\u526f\u5361\u8981\u66ff\u6362\u7684\u661f\u9635\u5bab");
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(iiiiiiiiiiIiI arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int type) {
        block2: {
            if (type != 0) break block2;
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(0, null);
            this.iiIiiiiiiiIii[2].iIiIiiiiIIiii();
            this.iIiiIiiiiiiII[0].setText(null);
            this.ALLATORIxDEMO = -1;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl20
        }
        this.IiiiiiiiIIIII[1].ALLATORIxDEMO(0, null);
        this.iiIiiiiiiiIii[3].iIiIiiiiIIiii();
        this.iIiiIiiiiiiII[1].setText(null);
        this.IIiiIiiiIIiIi = -1;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl27
        do {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII + 4].iIiIiiiiIIiii("sc/e/68.png");
            v0 = IiiiiiiiIIIII + 2;
            ++IiiiiiiiIIIII;
            this.iIiiIiiiiiiII[v0].setText(null);
lbl20:
            // 2 sources

        } while (IiiiiiiiIIIII < 4);
        return;
        do {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII + 8].iIiIiiiiIIiii("sc/e/68.png");
            v1 = IiiiiiiiIIIII + 6;
            ++IiiiiiiiIIIII;
            this.iIiiIiiiiiiII[v1].setText(null);
lbl27:
            // 2 sources

        } while (IiiiiiiiIIIII < 4);
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiiiiiiiiIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }
}
