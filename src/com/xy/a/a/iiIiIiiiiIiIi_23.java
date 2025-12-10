/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiIIiiiIIIiI
 *  com.xy.a.a.IiIIIiiiIIiII
 *  com.xy.a.a.IiIiIiiiiiIiI
 *  com.xy.a.a.iiIiIiiiIIIiI
 *  com.xy.a.a.iiiIiiiiIiiiI
 *  com.xy.a.w.IIIiiiiiiiiIi
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.LoginResult
 *  com.xy.entity.Pal
 *  com.xy.formula.BaseValue
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AllPal
 *  com.xy.readbean.PalData
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IIiIIiiiIIIiI;
import com.xy.a.a.IiIIIiiiIIiII;
import com.xy.a.a.IiIiIiiiiiIiI;
import com.xy.a.a.iiIiIiiiIIIiI;
import com.xy.a.a.iiiIiiiiIiiiI;
import com.xy.a.w.IIIiiiiiiiiIi;
import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.AllPal;
import com.xy.readbean.PalData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class iiIiIiiiiIiIi
extends IiiiIiiiiIiIi {
    public int IiIiiiiiIIIII = -1;
    public IiIiIiiiiiIiI iiIiIiiiiIIIi;
    public IiIIIiiiIIiII iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private static Image IIiiIiiiIIiIi;
    public iiIiIiiiIIIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private JComponent IiiiiiiiIIIII;
    private IIIiiiiiIiIiI[] ALLATORIxDEMO;

    public int ALLATORIxDEMO(BigDecimal id, String[] vs) {
        if (id == null) {
            return -1;
        }
        if (vs == null) {
            return 0;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < vs.length) {
            if (id.toString().equals(vs[IiiiiiiiIIIII])) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public void IiiIiiiiiiIiI() {
        String IiiiiiiiIIIII = IiiiIiiiiIIII.iIiIiiiiIIiii((int)this.ALLATORIxDEMO().getLoginResult().getGrade());
        String IiiiiiiiIIIII2 = String.valueOf(IiiiiiiiIIIII) + "\u7ea7";
        int IiiiiiiiIIIII3 = this.IiiiiiiiIIIII.getComponentCount();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = this.IiiiiiiiIIIII.getComponentCount();
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            iiiIiiiiIiiiI iiiIiiiiIiiiI2 = (iiiIiiiiIiiiI)this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII4;
            iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)iiiIiiiiIiiiI2).setText(IiiiiiiiIIIII2);
        }
        if (this.IiIiiiiiIIIII == 0) return;
        IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiiiIiiiIiiII)[2].setText(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiIi(int type) {
        this.IiIIIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIIIiiiiIiiI);
            ++IiiiiiiiIIIII;
        }
        this.iiiiIiiiIiiII.setVisible(this.IiIIIiiiiIiiI == 0);
        this.iIiIiiiiIiIii.setVisible(this.IiIIIiiiiIiiI == 1);
        this.iiIiIiiiiIIIi.setVisible(this.IiIIIiiiiIiiI == 2);
    }

    public int ALLATORIxDEMO(BigDecimal id, String pal) {
        return this.ALLATORIxDEMO(id, pal != null && !pal.equals("") ? pal.split("\\|") : null);
    }

    /*
     * WARNING - void declaration
     */
    public synchronized void iIiIiiiiIIiIi() {
        iiiIiiiiIiiiI IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult();
        String IiiiiiiiIIIII4 = IiiiIiiiiIIII.iIiIiiiiIIiii((int)IiiiiiiiIIIII3.getGrade());
        String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getPals() != null && !IiiiiiiiIIIII3.getPals().equals("") ? IiiiiiiiIIIII3.getPals().split("\\|") : null;
        AllPal IiiiiiiiIIIII6 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        ArrayList<iiiIiiiiIiiiI> IiiiiiiiIIIII7 = new ArrayList<iiiIiiiiIiiiI>();
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = this.IiiiiiiiIIIII.getComponentCount();
        block0: for (PalData IiiiiiiiIIIII10 : IiiiiiiiIIIII6.getAllPalData().values()) {
            IiiiiiiiIIIII = null;
            if (IiiiiiiiIIIII8 < IiiiiiiiIIIII9) {
                IiiiiiiiIIIII = (iiiIiiiiIiiiI)this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII8);
            } else {
                IiiiiiiiIIIII = new iiiIiiiiIiiiI(this);
                this.IiiiiiiiIIIII.add((Component)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII8;
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII10, IiiiiiiiIIIII2.getPal(IiiiiiiiIIIII10.getPalId()), IiiiiiiiIIIII5, IiiiiiiiIIIII4);
            int IiiiiiiiIIIII11 = 0;
            while (IiiiiiiiIIIII11 < IiiiiiiiIIIII7.size()) {
                int IiiiiiiiIIIII12 = iiiIiiiiIiiiI.iIiIiiiiIIiii((iiiIiiiiIiiiI)((iiiIiiiiIiiiI)IiiiiiiiIIIII7.get(IiiiiiiiIIIII11)));
                int IiiiiiiiIIIII13 = iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)((iiiIiiiiIiiiI)IiiiiiiiIIIII7.get(IiiiiiiiIIIII11)));
                if (!(iiiIiiiiIiiiI.iIiIiiiiIIiii((iiiIiiiiIiiiI)IiiiiiiiIIIII) == -1 ? IiiiiiiiIIIII12 != -1 || iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)IiiiiiiiIIIII) >= IiiiiiiiIIIII13 : (iiiIiiiiIiiiI.iIiIiiiiIIiii((iiiIiiiiIiiiI)IiiiiiiiIIIII) == 0 ? IiiiiiiiIIIII12 > 0 || IiiiiiiiIIIII12 != -1 && iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)IiiiiiiiIIIII) >= IiiiiiiiIIIII13 : IiiiiiiiIIIII12 > 0 && iiiIiiiiIiiiI.iIiIiiiiIIiii((iiiIiiiiIiiiI)IiiiiiiiIIIII) >= IiiiiiiiIIIII12 || IiiiiiiiIIIII12 <= 0 && iiiIiiiiIiiiI.iIiIiiiiIIiii((iiiIiiiiIiiiI)IiiiiiiiIIIII) <= IiiiiiiiIIIII12))) {
                    IiiiiiiiIIIII7.add(IiiiiiiiIIIII11, IiiiiiiiIIIII);
                    continue block0;
                }
                ++IiiiiiiiIIIII11;
            }
            IiiiiiiiIIIII7.add(IiiiiiiiIIIII);
        }
        int IiiiiiiiIIIII14 = 0;
        while (IiiiiiiiIIIII14 < IiiiiiiiIIIII7.size()) {
            void IiiiiiiiIIIII15;
            iiiIiiiiIiiiI iiiIiiiiIiiiI2 = (iiiIiiiiIiiiI)IiiiiiiiIIIII7.get(IiiiiiiiIIIII14);
            int n = IiiiiiiiIIIII14 * 50;
            ++IiiiiiiiIIIII14;
            IiiiiiiiIIIII15.setBounds(0, n, 137, 50);
            IiiiiiiiIIIII15.setVisible(true);
        }
        IiiiiiiiIIIII14 = IiiiiiiiIIIII7.size();
        int IiiiiiiiIIIII16 = this.IiiiiiiiIIIII.getComponentCount();
        while (IiiiiiiiIIIII14 < IiiiiiiiIIIII16) {
            iiiIiiiiIiiiI iiiIiiiiIiiiI3 = (iiiIiiiiIiiiI)this.IiiiiiiiIIIII.getComponent(IiiiiiiiIIIII14);
            ++IiiiiiiiIIIII14;
            IiiiiiiiIIIII = iiiIiiiiIiiiI3;
            iiiIiiiiIiiiI3.setVisible(false);
        }
        this.IiiiiiiiIIIII.setPreferredSize(new Dimension(137, 50 * IiiiiiiiIIIII7.size()));
    }

    static /* synthetic */ Image ALLATORIxDEMO() {
        return IIiiIiiiIIiIi;
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getChosePal() != null) {
            this.iIiIiiiiIIiii(IiiiiiiiIIIII.getChosePal().getpId());
        } else if (this.IiiiiiiiIIIII.getComponentCount() != 0) {
            iiiIiiiiIiiiI IiiiiiiiIIIII2 = (iiiIiiiiIiiiI)this.IiiiiiiiIIIII.getComponent(0);
            this.iIiIiiiiIIiii(iiiIiiiiIiiiI.ALLATORIxDEMO((iiiIiiiiIiiiI)IiiiiiiiIIIII2));
        }
        this.iIiIiiiiIIiIi(0);
        super.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO() {
        this.iiiiIiiiIiiII.IiIIIiiiiIiiI = null;
        return super.ALLATORIxDEMO();
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(int id) {
        block21: {
            block20: {
                block19: {
                    if (id != 123) break block19;
                    if (IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiiiIiiiIiiII)[0].getText().equals("\u6fc0\u6d3b")) {
                        this.iiiIiiiiiiIIi();
                        return;
                    }
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getPal(this.IiIiiiiiIIIII);
                    if (IiiiiiiiIIIII == null) {
                        return;
                    }
                    if (this.iiiiIiiiIiiII.ALLATORIxDEMO()) {
                        return;
                    }
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getPals();
                    IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII.getId(), IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == -1) {
                        return;
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl55
                }
                if (id == 124) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getPal(this.IiIiiiiiIIIII);
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u8fd8\u6ca1\u6709\u6fc0\u6d3b\u5f53\u524d\u4f19\u4f34");
                        return;
                    }
                    IiiiiiiiIIIII = (IIIiiiiiiiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(8);
                    IiiiiiiiIIIII.ALLATORIxDEMO(PropertyUtil.getPalQl((Pal)IiiiiiiiIIIII, (RoleData)this.ALLATORIxDEMO()), 2, IiiiiiiiIIIII.getId());
                    return;
                }
                if (id < 125 || id > 128) break block20;
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getPal(this.IiIiiiiiIIIII);
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getPals();
                IiiiiiiiIIIII = IiiiiiiiIIIII != null && IiiiiiiiIIIII.equals("") == false ? IiiiiiiiIIIII.split("\\|") : null;
                IiiiiiiiIIIII = BaseValue.getPalBtnArrStr((String)IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)this.iiiiIiiiIiiII)[2 + id - 125].getText());
                IiiiiiiiIIIII = true;
                IiiiiiiiIIIII = 1;
                IiiiiiiiIIIII = new StringBuffer();
                if (IiiiiiiiIIIII == null) break block21;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl76
            }
            if (id != 130) return;
            IiiIiiiiIIIii.ALLATORIxDEMO((int)2, (GameView)this.iiIIiiiiIiIIi);
            return;
            do {
                if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                    v0 = this;
                    if (IiiiiiiiIIIII == 0) {
                        v1 = 2 + IiiiiiiiIIIII;
                        ++IiiiiiiiIIIII;
                        IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)v0.iiiiIiiiIiiII)[v1].setText("\u4f11\u606f");
                    } else {
                        v2 = 2 + IiiiiiiiIIIII;
                        ++IiiiiiiiIIIII;
                        IiIIIiiiIIiII.ALLATORIxDEMO((IiIIIiiiIIiII)v0.iiiiIiiiIiiII)[v2].setText(BaseValue.getPalBtnArrStr((int)(IiiiiiiiIIIII - 1)));
                    }
                }
                ++IiiiiiiiIIIII;
lbl55:
                // 2 sources

            } while (IiiiiiiiIIIII < 5);
            this.iiiiIiiiIiiII.ALLATORIxDEMO(true);
            return;
            do {
                block22: {
                    block23: {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals(IiiiiiiiIIIII.getId().toString())) break block22;
                        if (IiiiiiiiIIIII++ != IiiiiiiiIIIII) break block23;
                        IiiiiiiiIIIII = false;
                        if (IiiiiiiiIIIII.length() != 0) {
                            IiiiiiiiIIIII.append("|");
                        }
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getId());
                        if (IiiiiiiiIIIII.length == 4) break block22;
                    }
                    if (IiiiiiiiIIIII.length() != 0) {
                        IiiiiiiiIIIII.append("|");
                    }
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                }
                ++IiiiiiiiIIIII;
lbl76:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        }
        if (IiiiiiiiIIIII && IiiiiiiiIIIII > 0) {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getId());
        }
        this.ALLATORIxDEMO().getLoginResult().setPals(IiiiiiiiIIIII.toString());
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"userpal", (String)("P" + IiiiiiiiIIIII.getId() + "|" + (IiiiiiiiIIIII == 0 ? -1 : IiiiiiiiIIIII - 1)));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiiiIiiiIiiII.ALLATORIxDEMO();
        this.iIiIiiiiIIiIi();
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    static /* synthetic */ void ALLATORIxDEMO(Image arg0) {
        IIiiIiiiIIiIi = arg0;
    }

    public void iiiIiiiiiiIIi() {
        PalData IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(this.IiIiiiiiIIIII);
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u5148\u9009\u4e2d\u4e00\u4e2a\u4f19\u4f34");
            return;
        }
        String IiiiiiiiIIIII2 = IiiiiiiiIIIII.getXh();
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append("#W\u786e\u5b9a\u8981\u6fc0\u6d3b#G");
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII.getName());
        if (IiiiiiiiIIIII2 != null && !"".equals(IiiiiiiiIIIII2)) {
            IiiiiiiiIIIII3.append("#W\u5417?\u6d88\u8017:#R");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII2.substring(1, IiiiiiiiIIIII2.length()));
            if (IiiiiiiiIIIII2.startsWith("D")) {
                IiiiiiiiIIIII3.append("\u5927\u8bdd\u5e01#W\u3002");
            } else if (IiiiiiiiIIIII2.startsWith("X")) {
                IiiiiiiiIIIII3.append("\u4ed9\u7389#W\u3002");
            }
        } else {
            IiiiiiiiIIIII3.append("\u5417?\u6d88\u8017:#R\u65e0\u6d88\u8017#W\u3002");
        }
        this.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(23, String.valueOf(this.IiIiiiiiIIIII), IiiiiiiiIIIII3.toString()));
    }

    public iiIiIiiiiIiIi(GameView gameView) {
        super(105, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 563, 383, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4f19\u4f34\u7cfb\u7edf");
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/38.png", 2, 120 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u961f\u4f0d" : (IiiiiiiiIIIII == 1 ? "\u6280\u80fd" : (IiiiiiiiIIIII == 2 ? "\u88c5\u5907" : "")), (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(214 + 82 * IiiiiiiiIIIII, 25, 79, 33);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)31, (int)155, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiiIiiiiiiII.setHorizontalAlignment(0);
        this.iIiiIiiiiiiII.setText("\u4f19\u4f34\u5217\u8868");
        this.add(this.iIiiIiiiiiiII);
        this.IiiiiiiiIIIII = new IIiIIiiiIIIiI(this);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)51, (int)153, (int)310, (Component)this.IiiiiiiiIIIII, (int)20);
        this.add(this.iiiIiiiiiiiIi);
        this.iiiiIiiiIiiII = new IiIIIiiiIIiII(this);
        this.iIiIiiiiIiIii = new iiIiIiiiIIIiI(this);
        this.iiIiIiiiiIIIi = new IiIiIiiiiiIiI(this);
        this.iiiiIiiiIiiII.setBounds(0, 0, 563, 383);
        this.iIiIiiiiIiIii.setBounds(0, 0, 563, 383);
        this.iiIiIiiiiIIIi.setBounds(0, 0, 563, 383);
        this.add((Component)this.iiiiIiiiIiiII);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.ALLATORIxDEMO = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(188, 39, 359, 20);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(46, 31, 155, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(46, 31, 155, 330);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
    }

    public synchronized void iIiIiiiiIIiii(int pId) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.IiIiiiiiIIIII = pId;
        PalData IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(pId);
        Pal IiiiiiiiIIIII3 = IiiiiiiiIIIII.getPal(pId);
        IiiiiiiiIIIII.setChosePalId(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getId() : null);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
    }
}
