/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiIiiiiIIiI
 *  com.xy.a.q.IiIIIiiiiiiII
 *  com.xy.a.q.iIiIIiiiIIiIi
 *  com.xy.bean.ChongjipackBean
 *  com.xy.game.RoleData
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIIiIiiiiIIiI;
import com.xy.a.q.IiIIIiiiiiiII;
import com.xy.a.q.iIiIIiiiIIiIi;
import com.xy.bean.ChongjipackBean;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IiIiIiiiiIiii
extends IiiiIiiiiIiIi {
    private JLabel iIiIiiiiIiIii;
    private JComponent IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private List<ChongjipackBean> ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO(this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(Object data) {
        iIiIIiiiIIiIi IiiiiiiiIIIII = (iIiIIiiiIIiIi)data;
        if (IiiiiiiiIIIII == null) return;
        if (iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)IiiiiiiiIIIII) == null) {
            return;
        }
        if (this.ALLATORIxDEMO().getGoodPackSum(-1L, new BigDecimal(-1), iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)IiiiiiiiIIIII)) < iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)IiiiiiiiIIIII)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7684\u80cc\u5305\u4e0d\u591f");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"Paydaygradesure", (String)("v" + iIiIIiiiIIiIi.ALLATORIxDEMO((iIiIIiiiIIiIi)IiiiiiiiIIIII).getPackgradetype()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public IiIiIiiiiIiii(GameView gameView) {
        super(100, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 684, 406, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6bcf\u65e5\u5145\u503c");
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)56, (int)155, (int)594, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.iIiIiiiiIiIii.setText("\u9886\u53d6\u5956\u52b1");
        this.add(this.iIiIiiiiIiIii);
        this.IiIIIiiiiIiiI = new IIIiIiiiiIIiI(this);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)56, (int)176, (int)594, (int)208, (Component)this.IiIIIiiiiIiiI, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/70.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(59, 27, 583, 110);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)15, (int)15, (int)15, (int)15, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(55, 23, 591, 118);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(56, 155, 594, 21);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(56, 155, 594, 229);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(List<ChongjipackBean> list) {
        String[] IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < list.size() - 1) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2 + 1;
            while (IiiiiiiiIIIII3 < list.size()) {
                IiiiiiiiIIIII = list.get(IiiiiiiiIIIII2);
                ChongjipackBean IiiiiiiiIIIII4 = list.get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII.getCanpaymoney() > IiiiiiiiIIIII4.getCanpaymoney()) {
                    list.set(IiiiiiiiIIIII2, IiiiiiiiIIIII4);
                    list.set(IiiiiiiiIIIII3, (ChongjipackBean)IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO = list;
        RoleData IiiiiiiiIIIII22 = this.ALLATORIxDEMO();
        String IiiiiiiiIIIII5 = IiiiiiiiIIIII22.getLoginResult().getVipget();
        IiiiiiiiIIIII = null;
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII = IiiiiiiiIIIII5.split("&&");
        }
        int IiiiiiiiIIIII6 = this.IiIIIiiiiIiiI.getComponentCount();
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = list.size();
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
            iIiIIiiiIIiIi IiiiiiiiIIIII9;
            ChongjipackBean IiiiiiiiIIIII10 = list.get(IiiiiiiiIIIII7);
            if (IiiiiiiiIIIII6 < list.size()) {
                iIiIIiiiIIiIi iIiIIiiiIIiIi2 = new iIiIIiiiIIiIi(this);
                IiiiiiiiIIIII9.setBounds(4, 2 + 62 * IiiiiiiiIIIII7, 570, 60);
                ++IiiiiiiiIIIII6;
                this.IiIIIiiiiIiiI.add((Component)IiiiiiiiIIIII9);
            }
            IiiiiiiiIIIII9 = (iIiIIiiiIIiIi)this.IiIIIiiiiIiiI.getComponent(IiiiiiiiIIIII7);
            boolean IiiiiiiiIIIII11 = IiIIIiiiiiiII.ALLATORIxDEMO((String[])IiiiiiiiIIIII, (int)2, (int)IiiiiiiiIIIII10.getPackgradetype());
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII10, IiiiiiiiIIIII11);
        }
        IiiiiiiiIIIII7 = list.size();
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6) {
            iIiIIiiiIIiIi iIiIIiiiIIiIi3 = (iIiIIiiiIIiIi)this.IiIIIiiiiIiiI.getComponent(IiiiiiiiIIIII7);
            ++IiiiiiiiIIIII7;
            iIiIIiiiIIiIi3.ALLATORIxDEMO(null, false);
        }
        this.IiIIIiiiiIiiI.setPreferredSize(new Dimension(this.IiIIIiiiiIiiI.getWidth(), list.size() * 62));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
