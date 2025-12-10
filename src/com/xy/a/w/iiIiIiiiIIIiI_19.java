/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.bean.UseCardBean
 *  com.xy.game.RoleData
 *  com.xy.i.IIiIiiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.w;

import com.xy.bean.BeauBean;
import com.xy.bean.UseCardBean;
import com.xy.game.RoleData;
import com.xy.i.IIiIiiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIiIiiiiIiIII iiiiIiiiIiiII;
    private iiIiIiiiiIiIi iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private RichLabel IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private IIiIiiiiIiIII[] IiIIIiiiiIiiI;
    private iIIiIiiiIiiIi iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(int colorType) {
        this.ALLATORIxDEMO = colorType;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == colorType);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(IiiiiiiiIIIII == colorType ? Color.green : Color.white);
            ++IiiiiiiiIIIII;
        }
        UseCardBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getLimit("\u9753\u53f7");
        BeauBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.ALLATORIxDEMO() : null;
        iiIiIiiiIIIiI iiIiIiiiIIIiI2 = this;
        if (IiiiiiiiIIIII3 == null) {
            iiIiIiiiIIIiI2.IIiiIiiiIIiIi.setTextSize("", 260);
        } else {
            iiIiIiiiIIIiI2.IIiiIiiiIIiIi.setTextSize("#VBEAU" + IiiiiiiiIIIII3.getLvl() + "," + IiiiiiiiIIIII3.getBeau() + "," + (colorType + 1) + "#L", 260);
        }
        this.IIiiIiiiIIiIi.setBounds(50 + (260 - this.IIiiIiiiIIiIi.getWidth()) / 2, 82, this.IIiiIiiiIIiIi.getWidth(), this.IIiiIiiiIIiIi.getHeight());
    }

    public iiIiIiiiIIIiI(GameView gameView) {
        super(184, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 342, 355, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u9753\u53f7\u67d3\u8272");
        this.IiIIIiiiiIiiI = new IIiIiiiiIiIII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIiIiiiiIiIII("sc/e/185.png", 2, 391 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u6c34\u6ce2\u84dd\u7389" : (IiiiiiiiIIIII == 1 ? "\u9752\u7389\u7ea2\u6c81" : (IiiiiiiiIIIII == 2 ? "\u6885\u679d\u767d\u7389" : (IiiiiiiiIIIII == 3 ? "\u6ea2\u5f69\u6d41\u5149" : ""))), (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(47 + 66 * IiiiiiiiIIIII, 201, 60, 22);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IIiIiiiiIiIII("sc/e/26.png", 1, 390, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u786e\u5b9a\u67d3\u8272", (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII.setBounds(129, 311, 99, 25);
        this.iiiiIiiiIiiII.setForeground(Color.black);
        this.add((Component)this.iiiiIiiiIiiII);
        this.IiiiiiiiIIIII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)32, (int)260, (int)21, (Color)(IiiiiiiiIIIII == 0 ? Color.white : Color.black), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u67d3\u8272\u6548\u679c" : (IiiiiiiiIIIII == 1 ? "\u67d3\u8272\u65b9\u6848" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u79ef\u5206" : (IiiiiiiiIIIII == 3 ? "\u62e5\u6709\u79ef\u5206" : ""))));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(IiiiiiiiIIIII == 0 ? 0 : 10);
            if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(48, 157, 72, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(70, 243, 72, 19);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(70, 271, 72, 19);
            }
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#c000000\u67d3\u8272\u540e#cFF0000\u5f00\u901a\u9891\u9053\u663e\u793a#c000000\u53ef\u7c7b\u4f3c\u571f\u8c6a\u91d1\u663e\u793a", 260);
        this.iIiiIiiiiiiII.setBounds(50, 177, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)154, (int)243, (int)134, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiIiiiiiiiIii);
        MoneyType IiiiiiiiIIIII2 = new MoneyType();
        IiiiiiiiIIIII2.setIdAndKey(4, "\u79ef\u5206");
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)154, (int)271, (int)134, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)IiiiiiiiIIIII2, (GameView)gameView);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IIiiIiiiIIiIi = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[3];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)100, (int)1, (int)100, (int)1, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(50, 232, 260, 2);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(50, 32, 260, 21);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII3].setBounds(50, 32, 260, 120);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII3++]);
        }
    }

    public boolean iIiIiiiiIIiii() {
        BeauBean IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        UseCardBean IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLimit("\u9753\u53f7");
        BeauBean beauBean = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiIiiiiiiiIii, (long)30L);
        this.iiiIiiiiiiIIi(Math.max(0, IiiiiiiiIIIII.getSkin() - 1));
        return true;
    }

    public void iIiIiiiiIIiii(int id) {
        if (id != 390) return;
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("C" + (this.ALLATORIxDEMO + 1)));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiii() {
        if (!this.iIiIiiiiIIiii()) {
            return;
        }
        super.iIiIiiiiIIiii();
    }
}
