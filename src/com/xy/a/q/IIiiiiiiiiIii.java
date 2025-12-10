/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiiIIIi
 *  com.xy.a.q.IiIiIiiiiIiiI
 *  com.xy.a.q.iIIIiiiiIiiII
 *  com.xy.a.q.iIiIiiiiIIIIi
 *  com.xy.a.q.iiiIIiiiiiiii
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Buff
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiiIIIi;
import com.xy.a.q.IiIiIiiiiIiiI;
import com.xy.a.q.iIIIiiiiIiiII;
import com.xy.a.q.iIiIiiiiIIIIi;
import com.xy.a.q.iiiIIiiiiiiii;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Buff;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IIiiiiiiiiIii
extends IiiiIiiiiIiIi {
    private iIiIiiiiIIIIi iiIiIiiiiIIIi;
    private IIIiiiiiIiIiI[] iiiiIiiiIiiII;
    private JLabel iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private JScrollPane IIiiIiiiIIiIi;
    private List<iiiIIiiiiiiii> iIiIiiiiIiIii;
    private IIiiiiiiiIIIi[] IiIIIiiiiIiiI;
    private JComponent iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private static IIiIiiiiIIiii ALLATORIxDEMO;

    public void ALLATORIxDEMO(IIiiiiiiiIIIi model, int index) {
        if (IIiiiiiiiIIIi.ALLATORIxDEMO((IIiiiiiiiIIIi)model)[0].ALLATORIxDEMO() != 21) {
            return;
        }
        if (this.iiIiIiiiiIIIi == null) {
            this.iiIiIiiiiIIIi = new iIiIiiiiIIIIi(this);
            this.add((Component)this.iiIiIiiiiIIIi, 0);
        }
        iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi, (long)IIiiiiiiiIIIi.ALLATORIxDEMO((IIiiiiiiiIIIi)model)[0].ALLATORIxDEMO());
        iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi, (int)index);
        Map IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO().getBuffMap();
        int IiiiiiiiIIIII2 = 0;
        for (Buff IiiiiiiiIIIII3 : IiiiiiiiIIIII.values()) {
            if (IiiiiiiiIIIII3.getbType() != 2) continue;
            iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi)[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII2 == 25) break;
        }
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2;
        while (IiiiiiiiIIIII4 < iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi).length) {
            iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi)[IiiiiiiiIIIII4++].ALLATORIxDEMO(null);
        }
        iIiIiiiiIIIIi.ALLATORIxDEMO((iIiIiiiiIIIIi)this.iiIiIiiiiIIIi)[1].setText(String.valueOf(IIiiiiiiiIIIi.ALLATORIxDEMO((IIiiiiiiiIIIi)model) + 1));
        this.iiIiIiiiiIIIi.setVisible(true);
    }

    static /* synthetic */ IIiIiiiiIIiii ALLATORIxDEMO() {
        return ALLATORIxDEMO;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIiIiiiiIIiii arg0) {
        ALLATORIxDEMO = arg0;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIiiiiiiiiIii arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(iiiIIiiiiiiii petModel, boolean is) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        RolePet IiiiiiiiIIIII2 = IiiiiiiiIIIII.getRolePet(iiiIIiiiiiiii.ALLATORIxDEMO((iiiIIiiiiiiii)petModel).ALLATORIxDEMO());
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (is) {
            if (IiiiiiiiIIIII2.getBb() > 0) {
                return;
            }
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getBBRolePet();
            if (IiiiiiiiIIIII3 == 0) {
                return;
            }
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3);
        } else {
            if (IiiiiiiiIIIII2.getBb() == 0) {
                return;
            }
            IiiiiiiiIIIII2.ALLATORIxDEMO(0);
        }
        IiiiiiiiIIIII.iIiIiiiiIIiii();
        this.iIiIiiiiIIiii(this.IiiiiiiiIIIII);
        iIIIiiiiIiiII IiiiiiiiIIIII4 = (iIIIiiiiIiiII)this.ALLATORIxDEMO().iIiIiiiiIIiii(135);
        if (IiiiiiiiIIIII4 == null) return;
        IiiiiiiiIIIII4.iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO(RolePet rolePet, int size) {
        iiiIIiiiiiiii IiiiiiiiIIIII;
        iiiIIiiiiiiii iiiIIiiiiiiii2 = IiiiiiiiIIIII = size < this.iIiIiiiiIiIii.size() ? this.iIiIiiiiIiIii.get(size) : null;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new iiiIIiiiiiiii(this);
            this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII);
            this.iIiIiiiiIiIii.add(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(rolePet);
        IiiiiiiiIIIII.setBounds(0, 45 * size, 320, 45);
        IiiiiiiiIIIII.setVisible(true);
    }

    public IIiiiiiiiiIii(GameView gameView) {
        super(136, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 592, 437, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8bbe\u7f6e\u53c2\u6218");
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)214, (int)29, (int)340, (int)21, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iiiIiiiiiiiIi.setText("\u8bbe\u7f6e\u53c2\u6218\u53ec\u5524\u517d");
        this.add(this.iiiIiiiiiiiIi);
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#cFF0000\u5de6\u952e#c000000\u70b9\u51fb\u51fa\u573a\uff0c#cFF0000\u53f3\u952e#c000000\u70b9\u51fb\u53d6\u6d88\u51fa\u573a\uff1b\u53ef\u90091\u4e2a\u53ec\u5524\u517d\u4f5c\u4e3a\u652f\u63f4\u4e0a\u9635\u3002", 500);
        this.iIiiIiiiiiiII.setBounds(50, 386, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIIIiiiiIiiI = new IIiiiiiiiIIIi[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIiiiiiiiIIIi(this, IiiiiiiiIIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(56, 42 + 85 * IiiiiiiiIIIII, 145, 76);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new ArrayList<iiiIIiiiiiiii>();
        this.iiIiiiiiiiIii = new IiIiIiiiiIiiI(this);
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)215, (int)49, (int)338, (int)335, (Component)this.iiIiiiiiiiIii, (int)-1);
        this.add(this.IIiiIiiiIIiIi);
        this.iiiiIiiiIiiII = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(47, 29, 166, 356);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(214, 29, 340, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(214, 29, 340, 356);
            }
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii(int menuType) {
        RolePet IiiiiiiiIIIII;
        this.IiiiiiiiIIIII = menuType;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        List IiiiiiiiIIIII3 = IiiiiiiiIIIII2.pets;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.IiIIIiiiiIiiI.length) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2.getBBRolePet(IiiiiiiiIIIII5 + 1);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != null) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII4++);
            }
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3.size()) {
            IiiiiiiiIIIII = (RolePet)IiiiiiiiIIIII3.get(IiiiiiiiIIIII5);
            if (IiiiiiiiIIIII.getBb() == 0) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII4++);
            }
            ++IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4;
        while (IiiiiiiiIIIII5 < this.iIiIiiiiIiIii.size()) {
            IiiiiiiiIIIII = this.iIiIiiiiIiIii.get(IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII.ALLATORIxDEMO(null);
            IiiiiiiiIIIII.setVisible(false);
        }
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(340, 45 * IiiiiiiiIIIII4));
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    static /* synthetic */ iIiIiiiiIIIIi ALLATORIxDEMO(IIiiiiiiiiIii arg0) {
        return arg0.iiIiIiiiiIIIi;
    }
}
