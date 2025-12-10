/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiIIIii
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.i.IIIiiiiiIiIiI
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.iIiIiiiiIIiIi
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.formula.BaseEquip
 *  com.xy.formula.QualityZW
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIiIiiiiIiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.Skill
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.IIIIiiiiIIIii;
import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.i.IIIiiiiiIiIiI;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.iIiIiiiiIIiIi;
import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.formula.BaseEquip;
import com.xy.formula.QualityZW;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IIIiIiiiiIiII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class IIIiIiiiIiIii
extends IiiiIiiiiIiIi {
    private List<IIIIiiiiIIIii> iIIiIiiiiiiIi;
    private BigDecimal IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private String[] IiIiiiiiIIIII;
    private String iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private JLabel iiiIiiiiiiiIi;
    private IIIIIiiiIIIiI iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private IIIiIiiiiIiII iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private Goodstable IiiiiiiiIIIII;
    private JComponent ALLATORIxDEMO;

    public void IIiIIiiiiiIII(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u5b88\u62a4\u77f3\u9644\u7075")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < value.length()) {
            String IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5;
            IiiiiiiiIIIII3 = value.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = value.length();
            }
            if ((IiiiiiiiIIIII5 = value.indexOf("=", IiiiiiiiIIIII2 + 1)) != -1 && IiiiiiiiIIIII5 <= IiiiiiiiIIIII3 && !(IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII5)).equals("\u7b49\u7ea7") && !IiiiiiiiIIIII4.equals("\u8010\u4e45")) {
                int IiiiiiiiIIIII6;
                if (IiiiiiiiIIIII4.equals("\u6280\u80fd")) {
                    int IiiiiiiiIIIII7;
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII5 + 1;
                    IiiiiiiiIIIII5 = value.indexOf("#", IiiiiiiiIIIII2 + 1);
                    IiiiiiiiIIIII6 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII5);
                    Skill IiiiiiiiIIIII8 = this.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII6));
                    if (IiiiiiiiIIIII8 != null && (IiiiiiiiIIIII7 = this.ALLATORIxDEMO(1, IiiiiiiiIIIII8.getSkillname(), 0.0, IiiiiiiiIIIII, 5, 7)) != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII7;
                    }
                } else {
                    IiiiiiiiIIIII6 = this.ALLATORIxDEMO(1, IiiiiiiiIIIII4, 0.0, IiiiiiiiIIIII, 0, 5);
                    if (IiiiiiiiIIIII6 != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII6;
                    }
                }
            }
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 7)) {
            this.iiiiiiiiIIiii("\u5b88\u62a4\u77f3\u9644\u7075\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u5b88\u62a4\u77f3\u9644\u7075";
    }

    public int ALLATORIxDEMO(int type, String key, double zhi, int v1, int min, int max) {
        int IiiiiiiiIIIII = -1;
        double IiiiiiiiIIIII2 = 0.0;
        int IiiiiiiiIIIII3 = min;
        while (IiiiiiiiIIIII3 < max) {
            IIIIiiiiIIIii IiiiiiiiIIIII4 = this.iIIiIiiiiiiIi.get(IiiiiiiiIIIII3);
            if (!IiiiiiiiIIIII4.ALLATORIxDEMO().equals("") && (v1 >>> IiiiiiiiIIIII3 & 1) != 1 && IiiiiiiiIIIII4.ALLATORIxDEMO(key)) {
                if (type == 1) {
                    return IiiiiiiiIIIII3;
                }
                double IiiiiiiiIIIII5 = IiiiiiiiIIIII4.ALLATORIxDEMO();
                if (!(IiiiiiiiIIIII5 > zhi || IiiiiiiiIIIII != -1 && IiiiiiiiIIIII2 > IiiiiiiiIIIII5)) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII3;
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII5;
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi() {
        if (this.iiIiiiiiiiIii != 0) {
            this.iiiiiiiiIIiii(null);
            return;
        }
        this.IiiiiiiiIIIII = null;
        this.IIIIiiiiiiiII = null;
        this.iiIiIiiiiIIIi = null;
        this.iiIIIiiiiiiiI = 0;
        this.iiIiiiiiiiIii = 1;
        this.iiiiIiiiIiiII = 0;
        this.iIiiIiiiiiiII.setText("\u505c\u6b62");
        if (this.iiIIiiiiIiIIi.isVisible() && this.iiIIiiiiIiIIi.gameFrame.isFocused()) {
            this.iIiiIiiiiiiII.requestFocus();
        }
        this.ALLATORIxDEMO.setVisible(true);
        this.IIiIIiiiiiIiI(null);
        String IiiiiiiiIIIII = this.ALLATORIxDEMO(true);
        if (IiiiiiiiIIIII == null) return;
        this.iiiiiiiiIIiii(IiiiiiiiIIIII);
    }

    public void iiiiIiiiIiIiI(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u5957\u88c5\u6d17\u7ec3")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < value.length()) {
            double IiiiiiiiIIIII5;
            String IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7;
            int IiiiiiiiIIIII8;
            IiiiiiiiIIIII4 = value.indexOf("&", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = value.length();
            }
            if (IiiiiiiiIIIII2 >= 4 && (IiiiiiiiIIIII8 = value.indexOf("=", IiiiiiiiIIIII3 + 1)) != -1 && IiiiiiiiIIIII8 <= IiiiiiiiIIIII4 && (IiiiiiiiIIIII7 = this.ALLATORIxDEMO(0, IiiiiiiiIIIII6 = value.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII8), IiiiiiiiIIIII5 = Double.parseDouble(value.substring(IiiiiiiiIIIII8 + 1, IiiiiiiiIIIII4)), IiiiiiiiIIIII, 0, 2)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII7;
            }
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 2)) {
            this.iiiiiiiiIIiii("\u5957\u88c5\u6d17\u7ec3\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u5957\u88c5\u6d17\u7ec3";
    }

    public void IIiIIiiiiiIiI(String text) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (text != null && !text.equals("")) {
            IiiiiiiiIIIII.append(text);
            IiiiiiiiIIIII.append("  ");
        }
        IiiiiiiiIIIII.append(this.iiIiiiiiiiIii == 1 ? "\u8fd0\u884c\u4e2d" : "\u5df2\u505c\u6b62");
        if (this.iiiiIiiiIiiII > 0) {
            IiiiiiiiIIIII.append("  \u7b2c" + this.iiiiIiiiIiiII + "\u6b21\u6267\u884c");
        }
        this.IiIIIiiiiIiiI.setText(IiiiiiiiIIIII.toString());
    }

    /*
     * Unable to fully structure code
     */
    public void IIIiIiiiIiIii(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u70bc\u5316")) {
            return;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = value.split("&");
        IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block8: {
                block9: {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                    if (IiiiiiiiIIIII == -1) break block8;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                    if (!IiiiiiiiIIIII.equals("\u7279\u6280")) break block9;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl29
                }
                IiiiiiiiIIIII = QualityZW.getDouble((String)IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                IiiiiiiiIIIII = this.ALLATORIxDEMO(0, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, 0, 4);
                if (IiiiiiiiIIIII != -1) {
                    IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                }
                break block8;
                do {
                    if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null && (IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII.getSkillname(), 0.0, IiiiiiiiIIIII, 4, 6)) != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
lbl29:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 6)) {
            this.iiiiiiiiIIiii("\u70bc\u5316\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u70bc\u5316";
    }

    public void iiiIiiiiiiIIi() {
        if (this.iiIIIiiiiiiiI == 0) {
            ++this.iiIIIiiiiiiiI;
            return;
        }
        if (this.iiIiIiiiiIIIi == null) return;
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (this.iiIiIiiiiIIIi.equals(this.IiIiiiiiIIIII[4])) {
            this.IIiiIiiiiIiII(this.IiIiiiiiIIIII[4]);
            return;
        }
        if (this.iiIiIiiiiIIIi.equals(this.IiIiiiiiIIIII[10])) {
            this.iiIiIiiiiIIIi = null;
            this.IIiiIiiiiIiII(this.IiIiiiiiIIIII[10]);
            return;
        }
        this.IIiiIiiiiIiII(this.iiIiIiiiiIIIi);
        this.iiIiIiiiiIIIi = null;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(Goodstable good) {
        if (good == null) {
            return false;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = good.getValue().split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block10: {
                block9: {
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u70bc\u5316\u5c5e\u6027&")) break block9;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl27
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                if (IiiiiiiiIIIII != -1 && !(IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII)).equals("\u57f9\u517b") && !IiiiiiiiIIIII.startsWith("\u7b49\u7ea7")) {
                    if (IiiiiiiiIIIII.equals("\u6839\u9aa8\u8981\u6c42") || IiiiiiiiIIIII.equals("\u7075\u6027\u8981\u6c42") || IiiiiiiiIIIII.equals("\u529b\u91cf\u8981\u6c42") || IiiiiiiiIIIII.equals("\u654f\u6377\u8981\u6c42")) {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII, 0.0, IiiiiiiiIIIII, 0, 1);
                        if (IiiiiiiiIIIII != -1) {
                            IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                        }
                    } else {
                        IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII, 0.0, IiiiiiiiIIIII, 1, 3);
                        if (IiiiiiiiIIIII != -1) {
                            IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                        }
                    }
                }
                break block10;
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=")) != -1 && (IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII), 0.0, IiiiiiiiIIIII, 3, 5)) != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
lbl27:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
        return this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 5);
    }

    public void IIiIIiiiIiIIi(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u5b69\u5b50\u91cd\u94f8")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        String[] IiiiiiiiIIIII2 = value.split("\\|");
        int IiiiiiiiIIIII3 = 2;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            double IiiiiiiiIIIII4;
            String IiiiiiiiIIIII5;
            int IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].indexOf("=");
            if (IiiiiiiiIIIII7 != -1 && (IiiiiiiiIIIII6 = this.ALLATORIxDEMO(0, IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII7), IiiiiiiiIIIII4 = QualityZW.getDouble((String)IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII7 + 1)), IiiiiiiiIIIII, 0, 4)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII6;
            }
            ++IiiiiiiiIIIII3;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 4)) {
            this.iiiiiiiiIIiii("\u91cd\u94f8\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u5b69\u5b50\u91cd\u94f8";
    }

    public IIIiIiiiIiIii(GameView gameView) {
        super(121, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 423, 475, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u81ea\u52a8\u70bc\u5316");
        this.iIiiIiiiiiiII = new IIIIIiiiIIIiI("sc/e/31.png", 1, 257, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8fd0\u884c", (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(171, 380, 79, 25);
        this.add((Component)this.iIiiIiiiiiiII, 0);
        this.ALLATORIxDEMO = new iIiIiiiiIIiIi(this);
        this.ALLATORIxDEMO.setBounds(0, 0, 423, 475);
        this.ALLATORIxDEMO.addMouseListener(IiIIIiiiiIIiI.IiiiiiiiIIIII);
        this.ALLATORIxDEMO.setVisible(false);
        this.add(this.ALLATORIxDEMO, 1);
        this.iIiIiiiiIiIii = new IIIiIiiiiIiII(0, 100, (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.iIiIiiiiIIiii(true);
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new JLabel();
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI.setBounds(52, 60, 360, 18);
        this.IiIIIiiiiIiiI.setForeground(Color.black);
        this.add(this.IiIIIiiiiIiiI);
        this.iiiIiiiiiiiIi = new JLabel("\u4f7f\u7528\u65f6\u8bf7\u4ed4\u7ec6\u68c0\u67e5\u662f\u5426\u6709\u9519\u522b\u5b57");
        this.iiiIiiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiIiiiiiiiIi.setBounds(185, 36, 210, 18);
        this.iiiIiiiiiiiIi.setForeground(Color.RED);
        this.add(this.iiiIiiiiiiiIi);
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iiIiiiiiiiiiI, 360);
        this.IIiiIiiiIIiIi.setBounds(44, 245, 360, 136);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIIiIiiiiiiIi = new ArrayList<IIIIiiiiIIIii>();
        this.IiIiiiiiIIIII = new String[]{"\u70bc\u5316", "\u70bc\u5668", "\u661f\u5361\u795e\u901a", "\u661f\u5361\u4e94\u884c", "\u914d\u9970\u91cd\u94f8", "\u89c9\u9192\u6280\u91cd\u6d17", "\u914d\u9970\u70b9\u7cb9", "\u914d\u9970\u7cb9\u70bc", "\u5b69\u5b50\u91cd\u94f8", "\u5b69\u5b50\u96d5\u7422", "\u5b88\u62a4\u77f3\u9644\u7075", "\u5957\u88c5\u6d17\u7ec3"};
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            if (!((this.IiIiiiiiIIIII[IiiiiiiiIIIII].equals("\u5b69\u5b50\u91cd\u94f8") || this.IiIiiiiiIIIII[IiiiiiiiIIIII].equals("\u5b69\u5b50\u96d5\u7422")) && !this.ALLATORIxDEMO().gameBaby || this.IiIiiiiiIIIII[IiiiiiiiIIIII].equals("\u5b88\u62a4\u77f3\u9644\u7075") && !this.ALLATORIxDEMO().gameMount)) {
                this.iIiIiiiiIiIii.ALLATORIxDEMO(this.IiIiiiiiIIIII[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIiIii.ALLATORIxDEMO(52, 36, 128, 80);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String value, boolean dc) {
        block17: {
            block16: {
                if (this.iiIiiiiiiiIii != 1) {
                    return;
                }
                if (value == null) return;
                if (value.equals("")) {
                    return;
                }
                v0 = IiiiiiiiIIIII = dc != false ? "\u914d\u9970\u70b9\u7cb9" : "\u914d\u9970\u7cb9\u70bc";
                if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals(IiiiiiiiIIIII)) {
                    return;
                }
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = value.split("&");
                IiiiiiiiIIIII = 1.0;
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                IiiiiiiiIIIII = IiiiiiiiIIIII >> 5 & 31;
                IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                if (!dc) break block16;
                IiiiiiiiIIIII = 4;
                if (true) ** GOTO lbl39
            }
            IiiiiiiiIIIII = this.ALLATORIxDEMO(0, "\u603b\u70b9\u7cb9\u503c", IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII, 0, 1);
            if (IiiiiiiiIIIII != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
            }
            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(0, "\u70b9\u7cb9\u503c", IiiiiiiiIIIII, IiiiiiiiIIIII, 1, 2)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
            }
            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(0, "\u70b9\u7cb9\u503c", IiiiiiiiIIIII, IiiiiiiiIIIII, 2, 3)) == -1) break block17;
            IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
            break block17;
            do {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u7279\u6280=") && (IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(3))) != null) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
                    if (IiiiiiiiIIIII == 8121) {
                        IiiiiiiiIIIII += 0.15;
                    } else if (IiiiiiiiIIIII == 8122) {
                        IiiiiiiiIIIII += 0.25;
                    }
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII.getSkillname(), 0.0, IiiiiiiiIIIII, 2, 3);
                    if (IiiiiiiiIIIII != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                    }
                }
                ++IiiiiiiiIIIII;
lbl39:
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
                    if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(0, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, 0, 2)) != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                    }
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 3)) {
            this.iiiiiiiiIIiii(String.valueOf(IiiiiiiiIIIII) + "\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = IiiiiiiiIIIII;
    }

    public void IIiiIiiiiIiII(String type) {
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals(type)) {
            return;
        }
        String IiiiiiiiIIIII = this.ALLATORIxDEMO(false);
        if (IiiiiiiiIIIII == null) return;
        this.iiiiiiiiIIiii(IiiiiiiiIIIII);
    }

    /*
     * Enabled force condition propagation
     */
    public boolean ALLATORIxDEMO(String type) {
        if (this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals(type)) {
            return false;
        }
        if (this.iiIiiiiiiiIii == 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5148\u505c\u6b62\u7a0b\u5e8f");
            return false;
        }
        if (type.equals(this.IiIiiiiiIIIII[0])) {
            this.iIiIiiiiIIiii(6);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e09", 0);
            this.ALLATORIxDEMO(3, "\u5c5e\u6027\u56db", 0);
            this.ALLATORIxDEMO(4, "\u7279\u6280\u4e00", 2);
            this.ALLATORIxDEMO(5, "\u7279\u6280\u4e8c", 2);
            this.IIiiIiiiIIiIi.setText("#K\u8c03\u51fa\u70bc\u5316\u9762\u677f\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u5982\u679c\u9700\u8981\u9501\u5b9a\u5c5e\u6027\u8bf7\u5728\u70bc\u5316\u9762\u677f\u8fdb\u884c\u9501\u5b9a#r\u7279\u6280\u5c5e\u6027\u53ea\u9700\u586b\u5199\u7279\u6280\u540d\u79f0#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[1])) {
            this.iIiIiiiiIIiii(5);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e09", 0);
            this.ALLATORIxDEMO(3, "\u5c5e\u6027\u56db", 0);
            this.ALLATORIxDEMO(4, "\u5c5e\u6027\u4e94", 0);
            this.IIiiIiiiIIiIi.setText("#K\u8c03\u51fa\u70bc\u5316\u9762\u677f\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5668#r\u5982\u679c\u9700\u8981\u9501\u5b9a\u5c5e\u6027\u8bf7\u5728\u70bc\u5316\u9762\u677f\u8fdb\u884c\u9501\u5b9a#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[2])) {
            this.iIiIiiiiIIiii(4);
            this.ALLATORIxDEMO(0, "\u8d44\u8d28", 1);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e00", 2);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e8c", 2);
            this.ALLATORIxDEMO(3, "\u661f\u9635", 2);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u53ea\u9700\u8981\u586b\u5199\u8d44\u8d28\u6700\u4f4e\u8981\u6c42(70\u6700\u4f4e)#r\u661f\u9635\u5c5e\u6027\u53ea\u9700\u586b\u5199\u661f\u9635\u540d\u79f0#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[3])) {
            this.iIiIiiiiIIiii(1);
            this.ALLATORIxDEMO(0, "\u4e94\u884c\u52a0\u6210", 1);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u4e94\u884c\u52a0\u6210\u9700\u8981\u6709\u661f\u9635\u624d\u80fd\u751f\u6548");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[4])) {
            this.iIiIiiiiIIiii(5);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u8981\u6c42", 2);
            this.ALLATORIxDEMO(1, "\u57fa\u7840\u5c5e\u6027", 2);
            this.ALLATORIxDEMO(2, "\u57fa\u7840\u5c5e\u6027", 2);
            this.ALLATORIxDEMO(3, "\u8fdb\u9636\u5c5e\u6027", 2);
            this.ALLATORIxDEMO(4, "\u8fdb\u9636\u5c5e\u6027", 2);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e#R\u4f5c\u574a#K\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u5c5e\u6027\u8981\u6c42\u586b\u5199(\u6839\u9aa8\u8981\u6c42/\u7075\u6027\u8981\u6c42/\u529b\u91cf\u8981\u6c42/\u654f\u6377\u8981\u6c42)\u4e0d\u586b\u5199\u5219\u65e0\u8981\u6c42#r\u5c5e\u6027\u53ea\u9700\u586b\u5199\u5b57\u6bb5\u540d(\u8fdb\u9636\u5c5e\u6027\u4e3a\u7eff\u5b57\u5c5e\u6027)#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[5])) {
            this.iIiIiiiiIIiii(2);
            this.ALLATORIxDEMO(0, "\u89c9\u9192\u6280", 2);
            this.ALLATORIxDEMO(1, "\u661f\u7ea7", 1);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u89c9\u9192\u6280\u5c5e\u6027\u53ea\u9700\u586b\u5199\u89c9\u9192\u6280\u540d\u79f0#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u89c9\u9192\u6280#r\u4f8b:\u6280\u80fd\u540d\u79f01|\u6280\u80fd\u540d\u79f02");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[6])) {
            this.iIiIiiiiIIiii(3);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            this.ALLATORIxDEMO(2, "\u7279\u6280", 2);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u7279\u6280\u5c5e\u6027\u53ea\u9700\u586b\u5199\u7279\u6280\u540d\u79f0#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[7])) {
            this.iIiIiiiiIIiii(3);
            this.ALLATORIxDEMO(0, "\u603b\u70b9\u7cb9\u503c", 1);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e00", 1);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e8c", 1);
            IIIIiiiiIIIii.ALLATORIxDEMO((IIIIiiiiIIIii)this.iIIiIiiiiiiIi.get(1)).setText("\u70b9\u7cb9\u503c");
            IIIIiiiiIIIii.ALLATORIxDEMO((IIIIiiiiIIIii)this.iIIiIiiiiiiIi.get(2)).setText("\u70b9\u7cb9\u503c");
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u4e0a\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u5c5e\u6027\u4e00\u6216\u8005\u5c5e\u6027\u4e8c\u586b\u7684\u662f\u70b9\u7cb9\u503c(#R1-20\u70b9\u7cb9\u503c\u8303\u56f4 \u975e\u5c55\u793a\u9762\u677f\u4e0a\u7684\u5c5e\u6027\u503c#K)");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[8])) {
            this.iIiIiiiiIIiii(4);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e09", 0);
            this.ALLATORIxDEMO(3, "\u5c5e\u6027\u56db", 0);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u91cd\u94f8#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (type.equals(this.IiIiiiiiIIIII[9])) {
            this.iIiIiiiiIIiii(6);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e09", 0);
            this.ALLATORIxDEMO(3, "\u5c5e\u6027\u56db", 0);
            this.ALLATORIxDEMO(4, "\u7279\u6280\u4e00", 2);
            this.ALLATORIxDEMO(5, "\u7279\u6280\u4e8c", 2);
            this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u7279\u6280\u5c5e\u6027\u53ea\u9700\u586b\u5199\u7279\u6280\u540d\u79f0#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
            return true;
        }
        if (!type.equals(this.IiIiiiiiIIIII[10])) {
            if (!type.equals(this.IiIiiiiiIIIII[11])) return false;
            this.iIiIiiiiIIiii(2);
            this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
            this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
            return true;
        }
        this.iIiIiiiiIIiii(7);
        this.ALLATORIxDEMO(0, "\u5c5e\u6027\u4e00", 0);
        this.ALLATORIxDEMO(1, "\u5c5e\u6027\u4e8c", 0);
        this.ALLATORIxDEMO(2, "\u5c5e\u6027\u4e09", 0);
        this.ALLATORIxDEMO(3, "\u5c5e\u6027\u56db", 0);
        this.ALLATORIxDEMO(4, "\u5c5e\u6027\u4e94", 0);
        this.ALLATORIxDEMO(5, "\u7279\u6280\u4e00", 2);
        this.ALLATORIxDEMO(6, "\u7279\u6280\u4e8c", 2);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 7) {
            IIIIiiiiIIIii.iIiIiiiiIIiii((IIIIiiiiIIIii)this.iIIiIiiiiiiIi.get(++IiiiiiiiIIIII)).setEditable(false);
        }
        this.IIiiIiiiIIiIi.setText("#K\u8bf7\u5c06\u6750\u6599\u653e\u7f6e\u9762\u677f\u5728\u70b9\u51fb\u8fd0\u884c\u5373\u53ef\u5f00\u59cb\u81ea\u52a8\u70bc\u5316#r\u7279\u6280\u5c5e\u6027\u53ea\u9700\u586b\u5199\u7279\u6280\u540d\u79f0#r\u65e0\u9700\u586b\u5199\u6700\u5c0f\u5c5e\u6027\u503c#r\u53ef\u901a\u8fc7#R | #K\u7b26\u53f7\u540c\u65f6\u5339\u914d\u591a\u4e2a\u5c5e\u6027#r\u4f8b:\u5c5e\u6027\u5b57\u6bb51|\u5c5e\u6027\u5b57\u6bb52");
        return true;
    }

    public void IIIiiiiiiIIiI(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u661f\u5361\u795e\u901a")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        String[] IiiiiiiiIIIII2 = value.split("&");
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].indexOf("=");
            if (IiiiiiiiIIIII4 != -1) {
                String IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII4);
                if (IiiiiiiiIIIII5.equals("\u661f\u9635\u5c5e\u6027")) {
                    String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=");
                    int IiiiiiiiIIIII7 = this.ALLATORIxDEMO(1, IiiiiiiiIIIII6[1], 0.0, IiiiiiiiIIIII, 3, 4);
                    if (IiiiiiiiIIIII7 != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII7;
                    }
                } else if (IiiiiiiiIIIII5.equals("\u8d44\u8d28")) {
                    double IiiiiiiiIIIII8 = QualityZW.getDouble((String)IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII4 + 1));
                    int IiiiiiiiIIIII9 = this.ALLATORIxDEMO(0, IiiiiiiiIIIII5, IiiiiiiiIIIII8, IiiiiiiiIIIII, 0, 1);
                    if (IiiiiiiiIIIII9 != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII9;
                    }
                } else {
                    int IiiiiiiiIIIII10 = this.ALLATORIxDEMO(1, IiiiiiiiIIIII5, 0.0, IiiiiiiiIIIII, 1, 3);
                    if (IiiiiiiiIIIII10 != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII10;
                    }
                }
            }
            ++IiiiiiiiIIIII3;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 4)) {
            this.iiiiiiiiIIiii("\u661f\u5361\u795e\u901a\u70bc\u5316\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u661f\u5361\u795e\u901a";
    }

    public void IIIIIiiiiIIii(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u70bc\u5668")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        String[] IiiiiiiiIIIII2 = value.split("&");
        int IiiiiiiiIIIII3 = 2;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            double IiiiiiiiIIIII4;
            String IiiiiiiiIIIII5;
            int IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].indexOf("=");
            if (IiiiiiiiIIIII7 != -1 && (IiiiiiiiIIIII6 = this.ALLATORIxDEMO(0, IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(0, IiiiiiiiIIIII7), IiiiiiiiIIIII4 = QualityZW.getDouble((String)IiiiiiiiIIIII2[IiiiiiiiIIIII3].substring(IiiiiiiiIIIII7 + 1)), IiiiiiiiIIIII, 0, 5)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII6;
            }
            ++IiiiiiiiIIIII3;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 5)) {
            this.iiiiiiiiIIiii("\u70bc\u5668\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u70bc\u5668";
    }

    public void ALLATORIxDEMO(String value, double num) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u661f\u5361\u4e94\u884c")) {
            return;
        }
        if (num == -1.0) {
            this.iiiiiiiiIIiii("\u6ca1\u6709\u661f\u9635\u4e94\u884c\u52a0\u6210\u65e0\u6548");
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.ALLATORIxDEMO(0, "\u4e94\u884c\u52a0\u6210", num, IiiiiiiiIIIII, 0, 1);
        if (IiiiiiiiIIIII2 != -1) {
            IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII2;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 1)) {
            this.iiiiiiiiIIiii("\u661f\u5361\u4e94\u884c\u70bc\u5316\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u661f\u5361\u4e94\u884c";
    }

    public void iiiiiiiiIIiii(String value) {
        this.iiIiiiiiiiIii = 0;
        this.IiiiiiiiIIIII = null;
        this.IIIIiiiiiiiII = null;
        this.iiIiIiiiiIIIi = null;
        this.iiIIIiiiiiiiI = 0;
        this.iIiiIiiiiiiII.setText("\u8fd0\u884c");
        this.ALLATORIxDEMO.setVisible(false);
        this.IIiIIiiiiiIiI(value);
    }

    public IIIIiiiiIIIii ALLATORIxDEMO(int index, String value, int type) {
        this.iIIiIiiiiiiIi.get(index).ALLATORIxDEMO(value, 52, 90 + index * 22, type);
        return null;
    }

    public void iIiIiiiiIIiii(int max) {
        max = Math.max(max, this.iIIiIiiiiiiIi.size());
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < max) {
            IIIIiiiiIIIii IiiiiiiiIIIII2;
            IIIIiiiiIIIii iIIIiiiiIIIii = IiiiiiiiIIIII2 = IiiiiiiiIIIII < this.iIIiIiiiiiiIi.size() ? this.iIIiIiiiiiiIi.get(IiiiiiiiIIIII) : null;
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new IIIIiiiiIIIii(this);
                this.iIIiIiiiiiiIi.add(IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2.ALLATORIxDEMO(null, 0, 0, 0);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (value == null) return;
        if (value.equals("")) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u5b69\u5b50\u96d5\u7422")) {
            return;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = value.split("&");
        IiiiiiiiIIIII = 2;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block8: {
                block9: {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                    if (IiiiiiiiIIIII == -1) break block8;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                    if (!IiiiiiiiIIIII.equals("\u7279\u6280")) break block9;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl29
                }
                IiiiiiiiIIIII = QualityZW.getDouble((String)IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                IiiiiiiiIIIII = this.ALLATORIxDEMO(0, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, 0, 4);
                if (IiiiiiiiIIIII != -1) {
                    IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                }
                break block8;
                do {
                    if ((IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null && (IiiiiiiiIIIII = this.ALLATORIxDEMO(1, IiiiiiiiIIIII.getSkillname(), 0.0, IiiiiiiiIIIII, 4, 6)) != -1) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
lbl29:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 6)) {
            this.iiiiiiiiIIiii("\u96d5\u7422\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u5b69\u5b50\u96d5\u7422";
    }

    public void iIiIiiiiIIiIi(String value) {
        if (this.iiIiiiiiiiIii != 1) {
            return;
        }
        if (!this.iIiIiiiiIiIii.ALLATORIxDEMO().getText().equals("\u89c9\u9192\u6280\u91cd\u6d17")) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        if (value != null && !value.equals("")) {
            int IiiiiiiiIIIII2;
            String[] IiiiiiiiIIIII3 = value.split("&");
            Skill IiiiiiiiIIIII4 = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII3[1]);
            if (IiiiiiiiIIIII4 != null && (IiiiiiiiIIIII2 = this.ALLATORIxDEMO(1, IiiiiiiiIIIII4.getSkillname(), 0.0, IiiiiiiiIIIII, 0, 1)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII2;
            }
            if ((IiiiiiiiIIIII2 = this.ALLATORIxDEMO(0, "\u661f\u7ea7", QualityZW.getDouble((String)IiiiiiiiIIIII3[2]), IiiiiiiiIIIII, 1, 2)) != -1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII2;
            }
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, 0, 2)) {
            this.iiiiiiiiIIiii("\u89c9\u9192\u6280\u91cd\u6d17\u6210\u529f");
            return;
        }
        this.iiIiIiiiiIIIi = "\u89c9\u9192\u6280\u91cd\u6d17";
    }

    /*
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO(boolean is) {
        block62: {
            block66: {
                block65: {
                    block67: {
                        block64: {
                            block63: {
                                block61: {
                                    IiiiiiiiIIIII = this.iIiIiiiiIiIii.ALLATORIxDEMO().getText();
                                    if (!IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[0])) break block61;
                                    IiiiiiiiIIIII = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
                                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) {
                                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                                    }
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                                    if (!(IiiiiiiiIIIII.equals("\u70bc\u5316\u88c5\u5907") || IiiiiiiiIIIII.equals("\u70bc\u5316\u4ed9\u5668") || IiiiiiiiIIIII.equals("\u70bc\u5316\u795e\u5175"))) {
                                        return "\u8bf7\u9009\u62e9\u6750\u6599";
                                    }
                                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                                    }
                                    if (is && this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                                    }
                                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                        return "\u64cd\u4f5c\u754c\u9762\u5df2\u5173\u95ed";
                                    }
                                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(false)) {
                                        return "\u6750\u6599\u4e0d\u8db3";
                                    }
                                    break block62;
                                }
                                if (!IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[1])) break block63;
                                IiiiiiiiIIIII = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
                                if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                                if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 2) {
                                    return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                                }
                                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                                if (!IiiiiiiiIIIII.equals("\u70bc\u5668")) {
                                    return "\u8bf7\u9009\u62e9\u6750\u6599";
                                }
                                if (is && this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                    return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                                }
                                if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                    return "\u64cd\u4f5c\u754c\u9762\u5df2\u5173\u95ed";
                                }
                                if (!IiiiiiiiIIIII.ALLATORIxDEMO(false)) {
                                    return "\u6750\u6599\u4e0d\u8db3";
                                }
                                break block62;
                            }
                            if (!IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[2]) && !IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[3])) break block64;
                            IiiiiiiiIIIII = (iIiIIiiiIiiiI)this.ALLATORIxDEMO().iIiIiiiiIIiii(95);
                            if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                            if (IiiiiiiiIIIII.IiiIiiiiiiIiI() != 1) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                            if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 2) {
                                return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                            }
                            if (IiiiiiiiIIIII.iIiIiiiiIIiIi() != (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[2]) != false ? 0 : 1)) {
                                return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                            }
                            if (!is && this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                                return "\u64cd\u4f5c\u754c\u9762\u5df2\u5173\u95ed";
                            }
                            if (!IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                                return "\u8bf7\u9009\u62e9\u6750\u6599";
                            }
                            break block62;
                        }
                        if (!IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[4])) break block65;
                        IiiiiiiiIIIII = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
                        if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                        if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
                            return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                        }
                        IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                        if (is) break block66;
                        if (this.ALLATORIxDEMO().gameType != 2) break block67;
                        if (this.IiiiiiiiIIIII == null) {
                            return "\u51fa\u73b0\u5f02\u5e38";
                        }
                        IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.IiiiiiiiIIIII.getRgid());
                        if (this.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII)) {
                            return "\u914d\u9970\u91cd\u94f8\u5b8c\u6210";
                        }
                        IiiiiiiiIIIII.iIiIiiiiIIiii((Goodstable)IiiiiiiiIIIII);
                        break block66;
                    }
                    if (this.IiiiiiiiIIIII == null) {
                        return "\u51fa\u73b0\u5f02\u5e38";
                    }
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(this.IiiiiiiiIIIII.getRgid());
                    if (IiiiiiiiIIIII == null) return null;
                    if (IiiiiiiiIIIII == this.IiiiiiiiIIIII) {
                        return null;
                    }
                    if (this.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII)) {
                        return "\u914d\u9970\u91cd\u94f8\u5b8c\u6210";
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl159
                }
                if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[5])) {
                    IiiiiiiiIIIII = (IiIIIiiiiiiIi)this.ALLATORIxDEMO().iIiIiiiiIIiii(91);
                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iIiIiiiiIIiIi() != 1) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    if (!IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                        return "\u8bf7\u9009\u62e9\u6750\u6599";
                    }
                } else if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[6])) {
                    IiiiiiiiIIIII = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    if (!IiiiiiiiIIIII.equals("\u914d\u9970\u70b9\u7cb9")) {
                        return "\u8bf7\u9009\u62e9\u6750\u6599";
                    }
                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                    }
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(false)) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                } else if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[7])) {
                    IiiiiiiiIIIII = (IIIIIiiiIiIii)this.ALLATORIxDEMO().iIiIiiiiIIiii(61);
                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    if (!IiiiiiiiIIIII.equals("\u914d\u9970\u7cb9\u70bc")) {
                        return "\u8bf7\u9009\u62e9\u6750\u6599";
                    }
                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                    }
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(false)) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                } else if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[8])) {
                    IiiiiiiiIIIII = (IIiIiiiiIiIII)this.ALLATORIxDEMO().iIiIiiiiIIiii(166);
                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 1) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                    }
                    if (!IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                } else if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[9])) {
                    IiiiiiiiIIIII = (IIiIiiiiIiIII)this.ALLATORIxDEMO().iIiIiiiiIIiii(166);
                    if (IiiiiiiiIIIII == null) return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    if (IiiiiiiiIIIII.iiiIiiiiiiIIi() != 0) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    if (this.ALLATORIxDEMO().iIiIiiiiIIiii(11) == null) {
                        return "\u5148\u6253\u5f00\u66ff\u6362\u754c\u9762\u8fdb\u884c\u5c5e\u6027\u9501\u5b9a";
                    }
                    if (!IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                } else if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[10])) {
                    IiiiiiiiIIIII = (IiIiIiiiiIIiI)this.ALLATORIxDEMO().iIiIiiiiIIiii(175);
                    if (IiiiiiiiIIIII == null) return "\u9700\u8981\u70b9\u51fb\u5f00\u59cb\u9644\u7075\u6309\u94ae\u5f39\u51fa\u9644\u7075\u9762\u677f";
                    if (IiiiiiiiIIIII.IiiIiiiiiiIiI() != 2) {
                        return "\u9700\u8981\u70b9\u51fb\u5f00\u59cb\u9644\u7075\u6309\u94ae\u5f39\u51fa\u9644\u7075\u9762\u677f";
                    }
                    if (IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                        this.iiIiIiiiiIIIi = this.IiIiiiiiIIIII[10];
                        return null;
                    }
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(323)) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                } else {
                    if (IiiiiiiiIIIII.equals(this.IiIiiiiiIIIII[11]) == false) return "\u5f02\u5e38\u516c\u5f0f";
                    IiiiiiiiIIIII = (IIIiiiiiIiIiI)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(74);
                    if (IiiiiiiiIIIII == null) {
                        return "\u64cd\u4f5c\u754c\u9762\u672a\u6253\u5f00";
                    }
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(20)) {
                        return "\u6750\u6599\u4e0d\u8db3";
                    }
                }
                break block62;
                do {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII] != null && (IiiiiiiiIIIII != 1 || this.IIIIiiiiiiiII.compareTo(IiiiiiiiIIIII[IiiiiiiiIIIII].getGoodsid()) != 0)) {
                        IiiiiiiiIIIII.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
lbl159:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                IiiiiiiiIIIII.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, 0);
                if (!IiiiiiiiIIIII.ALLATORIxDEMO(1) && (IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.IIIIiiiiiiiII)) != null) {
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, 1);
                }
            }
            if (!(IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO()).equals("\u4f69\u9970\u91cd\u94f8")) {
                return "\u8bf7\u9009\u62e9\u6750\u6599";
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = null;
            if (is) {
                IiiiiiiiIIIII = IiiiiiiiIIIII[0];
                IiiiiiiiIIIII = IiiiiiiiIIIII[1].getGoodsid();
            }
            if (!IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.ALLATORIxDEMO(), IiiiiiiiIIIII, false)) {
                return "\u6750\u6599\u4e0d\u8db3";
            }
            if (is) {
                this.IiiiiiiiIIIII = IiiiiiiiIIIII;
                this.IIIIiiiiiiiII = IiiiiiiiIIIII;
                this.iiIIIiiiiiiiI = 0;
                this.iiIiIiiiiIIIi = this.IiIiiiiiIIIII[4];
            }
        }
        ++this.iiiiIiiiIiiII;
        if (is != false) return null;
        this.IIiIIiiiiiIiI(null);
        return null;
    }

    public boolean ALLATORIxDEMO(int v1, int min, int max) {
        int IiiiiiiiIIIII = min;
        while (IiiiiiiiIIIII < max) {
            if (!this.iIIiIiiiiiiIi.get(IiiiiiiiIIIII).ALLATORIxDEMO().equals("") && (v1 >>> IiiiiiiiIIIII & 1) != 1) {
                return false;
            }
            ++IiiiiiiiIIIII;
        }
        return true;
    }
}
