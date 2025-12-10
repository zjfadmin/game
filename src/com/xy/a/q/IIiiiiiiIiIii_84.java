/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.bean.SummonPetBean
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIiiiiIiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.petExchange
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.bean.LoginResult;
import com.xy.bean.SummonPetBean;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIiIiiiiIiiIi;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.petExchange;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class IIiiiiiiIiIii
extends IiiiIiiiiIiIi {
    private iiIiIiiiiIiIi iIIIIiiiiiIIi;
    private JLabel[] IiiIIiiiiiiiI;
    private IiiiiiiiiIIII IIiiiiiiIiiII;
    private int IiiiIiiiIiIII;
    private BigDecimal IIiiiiiiiIIIi;
    private JScrollPane IIIiiiiiIIiII;
    private RichLabel iiIiiiiiiIIiI;
    private int iIiiIiiiIiIIi;
    private com.xy.w.IiiiIiiiiIiIi iiiiIiiiIIiii;
    private com.xy.q.IIIiiiiiIiIiI[] iIIiIiiiiiiIi;
    private com.xy.q.IIIIIiiiIiiII IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private RichLabel IiIiiiiiIIIII;
    private BigDecimal iiIiIiiiiIIIi;
    private petExchange iiiiIiiiIiiII;
    private RichLabel iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi = -1;
    private iIIiIiiiIiiIi iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private BigDecimal ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        this.iiiIiiiiiiIIi();
        return super.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(petExchange exchange, int button) {
        this.iiiiIiiiIiiII = exchange;
        this.iiiiIiiiIIiii = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)exchange.getSkin()) ? iiiiiiiiiiIiI.ALLATORIxDEMO((String)exchange.getSkin(), (int)7, (int)1, null) : null;
        this.ALLATORIxDEMO(exchange);
        this.iiiIiiiiiiIIi(exchange);
        this.iIiIiiiiIIiii(exchange);
    }

    public void ALLATORIxDEMO(Map<Integer, petExchange> map) {
        petExchange IiiiiiiiIIIII;
        this.IIIIiiiiiiiII.ALLATORIxDEMO().removeAllChildren();
        ArrayList<petExchange> IiiiiiiiIIIII2 = new ArrayList<petExchange>();
        block0: for (Map.Entry<Integer, petExchange> IiiiiiiiIIIII3 : map.entrySet()) {
            IiiiiiiiIIIII = IiiiiiiiIIIII3.getValue();
            if ((this.IIiiIiiiIIiIi != 0 || IiiiiiiiIIIII.geteType() != 2 && IiiiiiiiIIIII.geteType() != 22) && (this.IIiiIiiiIIiIi != 1 || IiiiiiiiIIIII.geteType() < 10 || IiiiiiiiIIIII.geteType() > 15)) continue;
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.size()) {
                if (((petExchange)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).geteId() > IiiiiiiiIIIII.geteId()) {
                    IiiiiiiiIIIII2.add(IiiiiiiiIIIII4, IiiiiiiiIIIII);
                    continue block0;
                }
                ++IiiiiiiiIIIII4;
            }
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII);
        }
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII2.size()) {
            block8: {
                petExchange IiiiiiiiIIIII6 = (petExchange)IiiiiiiiIIIII2.get(IiiiiiiiIIIII5);
                if (IiiiiiiiIIIII6.geteType() == 22) {
                    IiiiiiiiIIIII = new IIiIiiiiIiiIi(IiiiiiiiIIIII6.getType(), (Object)IiiiiiiiIIIII6);
                    IiiiiiiiIIIII.ALLATORIxDEMO(Color.white);
                    IiiiiiiiIIIII.ALLATORIxDEMO(iiIIiiiiIiiII.iIiIIiiiiIIiI);
                    this.IIIIiiiiiiiII.ALLATORIxDEMO().add(new DefaultMutableTreeNode(IiiiiiiiIIIII));
                } else {
                    IiiiiiiiIIIII = new IIiIiiiiIiiIi(IiiiiiiiIIIII6.getName(), (Object)IiiiiiiiIIIII6);
                    IiiiiiiiIIIII.ALLATORIxDEMO(Color.white);
                    IiiiiiiiIIIII.ALLATORIxDEMO(iiIIiiiiIiiII.iIiIIiiiiIIiI);
                    DefaultMutableTreeNode IiiiiiiiIIIII7 = new DefaultMutableTreeNode(IiiiiiiiIIIII);
                    int IiiiiiiiIIIII8 = this.IIIIiiiiiiiII.ALLATORIxDEMO().getChildCount();
                    int IiiiiiiiIIIII222 = 0;
                    while (IiiiiiiiIIIII222 < IiiiiiiiIIIII8) {
                        DefaultMutableTreeNode IiiiiiiiIIIII9 = (DefaultMutableTreeNode)this.IIIIiiiiiiiII.ALLATORIxDEMO().getChildAt(IiiiiiiiIIIII222);
                        if (IiiiiiiiIIIII6.getType().equals(IiiiiiiiIIIII9.toString())) {
                            IiiiiiiiIIIII9.add(IiiiiiiiIIIII7);
                            break block8;
                        }
                        ++IiiiiiiiIIIII222;
                    }
                    DefaultMutableTreeNode IiiiiiiiIIIII222 = new DefaultMutableTreeNode(IiiiiiiiIIIII6.getType());
                    IiiiiiiiIIIII222.add(IiiiiiiiIIIII7);
                    this.IIIIiiiiiiiII.ALLATORIxDEMO().add(IiiiiiiiIIIII222);
                }
            }
            ++IiiiiiiiIIIII5;
        }
        this.IIIIiiiiiiiII.ALLATORIxDEMO();
    }

    public IIiiiiiiIiIii(GameView gameView) {
        super(36, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 527, 410, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5408\u6210");
        this.IIiiiiiiIiiII = new IiiiiiiiiIIII("sc/e/7.png", 1, 71, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5408\u6210", (IiiiIiiiiIiIi)this);
        this.IIiiiiiiIiiII.setBounds(396, 199, 59, 25);
        this.add((Component)this.IIiiiiiiIiiII);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)395, (int)146, (int)101, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iIiIiiiiIiIii);
        this.iIIIIiiiiiIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, null, (GameView)gameView);
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(2);
        this.iIIIIiiiiiIIi.setText("0");
        this.iIIIIiiiiiIIi.setBounds(395, 172, 101, 19);
        this.add((Component)this.iIIIIiiiiiIIi);
        this.IiiIIiiiiiiiI = new JLabel[7];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiIIiiiiiiiI.length) {
            this.IiiIIiiiiiiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)(32 + 26 * IiiiiiiiIIIII), (int)36, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u53ef\u5408\u6210\u53ec\u5524\u517d" : (IiiiiiiiIIIII == 1 ? "\u521d\u503c\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u5929\u751f\u6280\u80fd" : (IiiiiiiiIIIII == 3 ? "\u643a\u5e26\u8981\u6c42\uff1a" : (IiiiiiiiIIIII == 4 ? "0\u8f6c30\u7ea7" : (IiiiiiiiIIIII == 5 ? "\u6d88\u8017" : (IiiiiiiiIIIII == 6 ? "\u73b0\u91d1" : "")))))));
            if (IiiiiiiiIIIII == 0) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(48, 32, 163, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(220, 246, 137, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(365, 246, 137, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(359, 43, 90, 19);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(438, 43, 70, 19);
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 6) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(359, 146 + 26 * (IiiiiiiiIIIII - 5), 72, 19);
            }
            this.add(this.IiiIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        this.IIIIiiiiiiiII = new com.xy.q.IIIIIiiiIiiII((IiiiIiiiiIiIi)this, 30);
        this.IIIIiiiiiiiII.ALLATORIxDEMO(true);
        this.IIIIiiiiiiiII.setBounds(49, 53, 164, 335);
        this.IIIIiiiiiiiII.ALLATORIxDEMO().setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add((Component)this.IIIIiiiiiiiII);
        this.IIIIiiiiiiiII.ALLATORIxDEMO().removeAllChildren();
        this.IIIIiiiiiiiII.ALLATORIxDEMO();
        this.iiiIiiiiiiiIi = new RichLabel();
        this.iIiiIiiiiiiII = new RichLabel();
        this.iiiIiiiiiiiIi.setText("#R1000#c228B22/9999");
        this.iIiiIiiiiiiII.setText("#R1000#c228B22/9999");
        this.iiiIiiiiiiiIi.setBounds(359, 122, 60, 16);
        this.iIiiIiiiiiiII.setBounds(432, 122, 60, 16);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIiiiiiIIIII = new RichLabel();
        this.iiIiiiiiiIIiI = new RichLabel();
        this.IiIiiiiiIIIII.setTextSize("", 123);
        this.iiIiiiiiiIIiI.setTextSize("", 123);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)221, (int)265, (int)138, (int)119, (Component)this.IiIiiiiiIIIII, (int)20);
        this.IIIiiiiiIIiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)366, (int)265, (int)138, (int)119, (Component)this.iiIiiiiiiIIiI, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.add(this.IIIiiiiiIIiII);
        this.iIIiIiiiiiiIi = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIII);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].setBounds(359 + 73 * IiiiiiiiIIIII, 66, 59, 57);
            this.add((Component)this.iIIiIiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[8];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(48, 32, 163, 21);
                } else if (IiiiiiiiIIIII == 1) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(220, 246, 137, 21);
                } else if (IiiiiiiiIIIII == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(365, 246, 137, 21);
                }
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(48, 32, 163, 355);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(220, 246, 137, 141);
                } else if (IiiiiiiiIIIII == 5) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(365, 246, 137, 141);
                }
            } else if (IiiiiiiiIIIII == 6) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/16.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(226, 43, 127, 180);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(219, 32, 284, 205);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void iiiiiiiiIIiii() {
        int IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(IiiiiiiiIIIII3.getGold().longValue());
        if (this.ALLATORIxDEMO != null && (IiiiiiiiIIIII = IiiiiiiiIIIII2.getGoodNum(this.ALLATORIxDEMO)) != this.IiIIIiiiiIiiI) {
            if (this.IiiiIiiiIiIII > IiiiiiiiIIIII) {
                this.iiiIiiiiiiiIi.setText("#R" + IiiiiiiiIIIII + "#c228B22/" + this.IiiiIiiiIiIII);
            } else {
                this.iiiIiiiiiiiIi.setText("#c228B22" + IiiiiiiiIIIII + "/" + this.IiiiIiiiIiIII);
            }
        }
        if (this.IIiiiiiiiIIIi == null) return;
        IiiiiiiiIIIII = IiiiiiiiIIIII2.getGoodNum(this.IIiiiiiiiIIIi);
        if (IiiiiiiiIIIII == this.iIiiIiiiIiIIi) return;
        if (this.iiIIIiiiiiiiI > IiiiiiiiIIIII) {
            this.iIiiIiiiiiiII.setText("#R" + IiiiiiiiIIIII + "#c228B22/" + this.iiIIIiiiiiiiI);
            return;
        }
        this.iIiiIiiiiiiII.setText("#c228B22" + IiiiiiiiIIIII + "/" + this.iiIIIiiiiiiiI);
    }

    public void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII++].setVisible(true);
        }
        this.iiiIiiiiiiiIi.setText("");
        this.iIiiIiiiiiiII.setText("");
        this.ALLATORIxDEMO = null;
        this.IIiiiiiiiIIIi = null;
        this.IiiiIiiiIiIII = 0;
        this.IiIIIiiiiIiiI = 0;
        this.iiIIIiiiiiiiI = 0;
        this.iIiiIiiiIiIIi = 0;
        this.iIiIiiiiIiIii.setText(null);
        this.iiIiIiiiiIIIi = null;
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(petExchange exchange) {
        block1: {
            IiiiiiiiIIIII = new StringBuffer();
            if (exchange == null || this.IIiiIiiiIIiIi != 0 || exchange.geteType() != 2 || (IiiiiiiiIIIII = exchange.getSkill()) == null || "".equals(IiiiiiiiIIIII)) break block1;
            IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl20
        }
        this.iiIiiiiiiIIiI.setTextSize(IiiiiiiiIIIII.toString(), 123);
        return;
        do {
            IiiiiiiiIIIII = this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII]);
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getSkillname());
            IiiiiiiiIIIII.append("#r");
            this.iiIiiiiiiIIiI.setText(IiiiiiiiIIIII.toString());
            IiiiiiiiIIIII = this.iiIiiiiiiIIiI.computeSize(123);
            this.iiIiiiiiiIIiI.setSize(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            this.iiIiiiiiiIIiI.setPreferredSize(IiiiiiiiIIIII);
lbl20:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.IIiiIiiiIIiIi != type) {
            this.IIiiIiiiIIiIi = type;
            this.IIiiiiiiIiiII.setText(this.IIiiIiiiIIiIi == 0 ? "\u5408\u6210" : "\u5e7b\u5316");
            this.iiiIiiiiiiIIi();
            this.ALLATORIxDEMO(this.ALLATORIxDEMO().ALLATORIxDEMO().getAllPetExchange());
        }
        this.iiiiiiiiIIiii();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiiiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiIi() {
        String[] IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (this.IIiiIiiiIIiIi == 0 && IiiiiiiiIIIII2.pets.size() >= 21) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1\uff01\uff01\uff01");
            return;
        }
        petExchange IiiiiiiiIIIII3 = this.iiiiIiiiIiiII;
        if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u53ec\u5524\u517d");
            return;
        }
        if (this.iiIiIiiiiIIIi != null && IiiiiiiiIIIII2.getLoginResult().getGold().compareTo(this.iiIiIiiiiIIIi) < 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u989d\u4e0d\u8db3");
            return;
        }
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getConsume();
        if (IiiiiiiiIIIII4 != null && !"".equals(IiiiiiiiIIIII4)) {
            IiiiiiiiIIIII = IiiiiiiiIIIII4.split("\\|");
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.length) {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII5].startsWith("G")) {
                    void IiiiiiiiIIIII6;
                    int IiiiiiiiIIIII7;
                    String[] IiiiiiiiIIIII8 = IiiiiiiiIIIII[IiiiiiiiIIIII5].split("=");
                    Goodstable goodstable = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII8[1]));
                    int IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII8[2]);
                    if (IiiiiiiiIIIII9 > (IiiiiiiiIIIII7 = IiiiiiiiIIIII2.getGoodNum(IiiiiiiiIIIII6.getGoodsid()))) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5408\u6210\u6750\u6599\u4e0d\u8db3");
                        return;
                    }
                }
                ++IiiiiiiiIIIII5;
            }
        }
        IiiiiiiiIIIII = new SummonPetBean();
        IiiiiiiiIIIII.setOpertype(2);
        IiiiiiiiIIIII.setPetid(new BigDecimal(IiiiiiiiIIIII3.geteId()));
        String IiiiiiiiIIIII10 = Agreement.getSendTextAES((String)"summonpet", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII10);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.iiiiIiiiIIiii == null) return;
        this.iiiiIiiiIIiii.ALLATORIxDEMO(g, 300, 201, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public void iIiIiiiiIIiii(petExchange exchange) {
        this.IiiIiiiiiiIiI();
        if (exchange == null) {
            return;
        }
        String IiiiiiiiIIIII = exchange.getConsume();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            return;
        }
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
            String[] IiiiiiiiIIIII5;
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII4].startsWith("D")) {
                String[] stringArray = IiiiiiiiIIIII2[IiiiiiiiIIIII4].split("=");
                this.iiIiIiiiiIIIi = new BigDecimal((String)IiiiiiiiIIIII5[1]);
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiIiiiiIiIii, (long)this.iiIiIiiiiIIIi.longValue());
            } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII4].startsWith("G")) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII4].split("=");
                BigDecimal IiiiiiiiIIIII6 = new BigDecimal(IiiiiiiiIIIII5[1]);
                IIiiiiiiIiIii iIiiiiiiIiIii = this;
                if (IiiiiiiiIIIII3 == 0) {
                    iIiiiiiiIiIii.ALLATORIxDEMO = IiiiiiiiIIIII6;
                    this.IiiiIiiiIiIII = Integer.parseInt(IiiiiiiiIIIII5[2]);
                    this.IiIIIiiiiIiiI = -1;
                } else {
                    iIiiiiiiIiIii.IIiiiiiiiIIIi = IiiiiiiiIIIII6;
                    this.iiIIIiiiiiiiI = Integer.parseInt(IiiiiiiiIIIII5[2]);
                    this.iIiiIiiiIiIIi = -1;
                }
                Goodstable IiiiiiiiIIIII7 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
                com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iIIiIiiiiiiIi[IiiiiiiiIIIII3];
                ++IiiiiiiiIIIII3;
                iIIiiiiiIiIiI.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII7);
            }
            ++IiiiiiiiIIIII4;
        }
        this.iiiiiiiiIIiii();
    }

    public void ALLATORIxDEMO(petExchange exchange) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (exchange != null && this.IIiiIiiiIIiIi == 0 && exchange.geteType() == 2) {
            IiiiiiiiIIIII.append("\u6210\u957f\u7387:");
            IiiiiiiiIIIII.append(exchange.getGrow());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append("\u8840\u521d\u503c:");
            IiiiiiiiIIIII.append(exchange.getHp());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append("\u6cd5\u521d\u503c:");
            IiiiiiiiIIIII.append(exchange.getMp());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append("\u529f\u521d\u503c:");
            IiiiiiiiIIIII.append(exchange.getAp());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append("\u654f\u521d\u503c:");
            IiiiiiiiIIIII.append(exchange.getSp());
            IiiiiiiiIIIII.append("#r");
            IiiiiiiiIIIII.append("\u4e94\u884c:");
            IiiiiiiiIIIII.append(exchange.getFive());
            IiiiiiiiIIIII.append("#r");
        }
        this.IiIiiiiiIIIII.setTextSize(IiiiiiiiIIIII.toString(), 123);
    }

    public void iiiIiiiiiiIIi() {
        this.iiiiIiiiIiiII = null;
        this.iiiiIiiiIIiii = null;
        this.ALLATORIxDEMO((petExchange)null);
        this.iiiIiiiiiiIIi(null);
        this.IiiIiiiiiiIiI();
    }
}
