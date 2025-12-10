/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiIiiiiIiIIi
 *  com.xy.a.a.iiIIIiiiiiIII
 *  com.xy.a.i.IiiiIiiiiIiII
 *  com.xy.bean.ConfirmBean
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiiiIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiiIiiiiIiIIi;
import com.xy.a.a.iiIIIiiiiiIII;
import com.xy.a.i.IiiiIiiiiIiII;
import com.xy.bean.ConfirmBean;
import com.xy.formula.BaseMountSH;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIiiiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.iiiiiiiiiiIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.plaf.ScrollBarUI;

public class iIIiIiiiIiiIi
extends iIiIIiiiIiiiI {
    private iiIiIiiiiIiIi iiIIIiiiiiiiI;
    private RichLabel IiIiiiiiIIIII;
    private MoneyType iiIiIiiiiIIIi;
    private iiIIIiiiiiIII iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private IiiiIiiiiIiII iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private RichLabel iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IiIiIiiiiIIiI[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private IiiIiiiiIiIIi[] ALLATORIxDEMO;

    static /* synthetic */ iiIIIiiiiiIII ALLATORIxDEMO(iIIiIiiiIiiIi arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    public void ALLATORIxDEMO(boolean is) {
        if (this.iIiiIiiiiiiII == null) {
            return;
        }
        if (is) {
            this.iIiiIiiiiiiII.setBounds(312, 85, 330, 150);
        }
        this.iIiiIiiiiiiII.setVisible(is);
    }

    public void ALLATORIxDEMO(int index) {
        if (this.iIiiIiiiiiiII == null) {
            this.iIiiIiiiiiiII = new IiiiIiiiiIiII((IiiiIiiiiIiIi)this.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII.IiiiiiiiIIIII.ALLATORIxDEMO(new long[]{108L});
            this.iIiiIiiiiiiII.iiIiiiiiiiIii = index;
            this.add((Component)this.iIiiIiiiiiiII, 0);
            this.ALLATORIxDEMO(true);
            return;
        }
        this.iIiiIiiiiiiII.iiIiiiiiiiIii = index;
        this.ALLATORIxDEMO(!this.iIiiIiiiiiiII.isVisible());
    }

    public void ALLATORIxDEMO(RoleData roleData) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        PropertyUtil.getMountSHZTString((RoleData)roleData, (StringBuffer)IiiiiiiiIIIII, (boolean)false);
        this.IiIiiiiiIIIII.setTextSize(IiiiiiiiIIIII.toString(), 200);
        this.iiiIiiiiiiiIi.getVerticalScrollBar().setMaximum(this.IiIiiiiiIIIII.getHeight());
        this.iiiIiiiiiiiIi.getVerticalScrollBar().setValue(2 + 18 * Math.max(0, roleData.getMountSHByindex(0).getLvl() - 1));
        IiiiiiiiIIIII.setLength(0);
        PropertyUtil.getMountSHZTString((RoleData)roleData, (StringBuffer)IiiiiiiiIIIII, (boolean)true);
        this.iIiIiiiiIiIii.setTextSize(IiiiiiiiIIIII.toString(), 200);
        this.IiIIIiiiiIiiI.getVerticalScrollBar().setMaximum(this.iIiIiiiiIiIii.getHeight());
        this.IiIIIiiiiIiiI.getVerticalScrollBar().setValue(0);
        BaseMountSH IiiiiiiiIIIII2 = roleData.getMountSHByindex(0);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.ALLATORIxDEMO.length) {
            IiiIiiiiIiIIi iiiIiiiiIiIIi = this.ALLATORIxDEMO[IiiiiiiiIIIII3];
            boolean bl = IiiiiiiiIIIII3 < IiiiiiiiIIIII2.getUnlock();
            ++IiiiiiiiIIIII3;
            iiiIiiiiIiIIi.ALLATORIxDEMO(bl, IiiiiiiiIIIII2, roleData);
        }
    }

    public iIIiIiiiIiiIi(iiIIIiiiiiIII form) {
        this.iiiiIiiiIiiII = form;
        this.IIiiIiiiIIiIi = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)545, (int)25, (int)72, (int)19, (Color)(IiiiiiiiIIIII == 0 ? Color.black : iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCCC09F")), (Font)(IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiiiIiiiIiiII : iiIIiiiiIiiII.IiIiiiiiIiIiI));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5b88\u62a4\u4e4b\u5c18" : (IiiiiiiiIIIII == 1 ? "\u7b49\u7ea7\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u52a0\u6210\u603b\u89c8" : "")));
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 2) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(330 + 230 * (IiiiiiiiIIIII - 1), 323, 76, 19);
            }
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new MoneyType();
        this.iiIiIiiiiIIIi.setIdAndKey(0, "\u5b88\u62a4\u4e4b\u5c18");
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)622, (int)25, (int)74, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiIiiiiIIIi, (GameView)form.iiIIiiiiIiIIi);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.iiIIIiiiiiiiI);
        this.IiIiiiiiIIIII = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)270, (int)343, (int)205, (int)74, (Component)this.IiIiiiiiIIIII, (int)-1);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)500, (int)343, (int)205, (int)74, (Component)this.iIiIiiiiIiIii, (int)-1);
        this.iiiIiiiiiiiIi.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/168.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 6));
        this.IiIIIiiiiIiiI.getVerticalScrollBar().setUI((ScrollBarUI)new iiiiiiiiiiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/168.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), 6));
        this.add(this.iiiIiiiiiiiIi);
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiiiiiiiIii = new IiIiIiiiiIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiIiIiiiiIIiI(IiiiiiiiIIIII == 0 ? "sc/e/175.png" : "sc/e/176.png", 1, 192 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)form);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(258, 281, 81, 26);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(615, 281, 81, 26);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IiiIiiiiIiIIi[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IiiIiiiiIiIIi(this, IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(420, 66, 115, 92);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(320, 82, 115, 92);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(238, 138, 115, 92);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(363, 199, 115, 92);
            } else if (IiiiiiiiIIIII == 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(482, 199, 115, 92);
            } else if (IiiiiiiiIIIII == 5) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(606, 138, 115, 92);
            } else if (IiiiiiiiIIIII == 6) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(520, 82, 115, 92);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/167.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(267 + IiiiiiiiIIIII * 230, 330, 195, 5);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/164.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(258 + (IiiiiiiiIIIII - 2) * 230, 317, 221, 123);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.setBounds(0, 0, 743, 519);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (this.iIiiIiiiiiiII == null) {
            return;
        }
        this.ALLATORIxDEMO(false);
        int IiiiiiiiIIIII = (Integer)this.iIiiIiiiiiiII.iiIiiiiiiiIii;
        this.iiiiIiiiIiiII.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(32, "SHXQ" + IiiiiiiiIIIII + "|" + good.getRgid(), "#W\u786e\u5b9a\u5c06\u5b88\u62a4\u77f3\u79fb\u5165\u5b88\u62a4\u69fd\uff1f"));
    }
}
