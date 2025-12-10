/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IIIiiiiiiiiIi
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.game.RoleData
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.StarSoul
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.i;

import com.xy.a.i.IIIiiiiiiiiIi;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StarSoul;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiiiiiIIiiI
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] IIIIiiiiiiiII;
    private JLabel[] iiIIIiiiiiiiI;
    private MoneyType IiIiiiiiIIIII;
    private IiiiIiiiiIiII iiIiIiiiiIIIi;
    private IIiIIiiiIIIiI iiiiIiiiIiiII;
    private iiIiIiiiiIiii iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi = new BigDecimal(1000000);
    private int iIiIiiiiIiIii;
    private IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private MoneyType iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = 50;
    private iiIiIiiiiIiIi[] ALLATORIxDEMO;

    public void ALLATORIxDEMO(long number, JTextField textField) {
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII[1], (long)(number * (long)this.IiiiiiiiIIIII));
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII[2], (long)(number * this.IIiiIiiiIIiIi.longValue()));
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number == 0L) {
            return null;
        }
        if (number < 0L) {
            return 0L;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = (8000L - IiiiiiiiIIIII.getPackRecord().getStarSoulType(this.iIiIiiiiIiIii) % 10000L) / (long)this.IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2 * this.IIiiIiiiIIiIi.longValue() > IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult().getGold().longValue() / this.IIiiIiiiIIiIi.longValue();
        }
        if (IiiiiiiiIIIII2 > IiiiiiiiIIIII.getLoginResult().getScoretype("\u9b42\u503c").longValue()) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult().getScoretype("\u9b42\u503c").longValue();
        }
        if (number <= IiiiiiiiIIIII2) return null;
        return IiiiiiiiIIIII2;
    }

    public void iIiIiiiiIIiii(int id) {
        StarSoul IiiiiiiiIIIII;
        this.iIiIiiiiIiIii = id;
        this.IiIIIiiiiIiiI[0].ALLATORIxDEMO(IIIiiiiiiiiIi.IiiiiiiiIIIII);
        StarSoul starSoul = IiiiiiiiIIIII = id != 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(id) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("<html>");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.getName().length()) {
            if (IiiiiiiiIIIII3 != 0) {
                IiiiiiiiIIIII2.append("<br/>");
            }
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getName().charAt(IiiiiiiiIIIII3++));
        }
        IiiiiiiiIIIII2.append("</div></html>");
        this.iiIIIiiiiiiiI[7].setText(IiiiiiiiIIIII2.toString());
        this.iiIiIiiiiIIIi.setText("0");
        this.iiiIiiiiiiIIi();
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII3++].iIiIiiiiIIiii();
        }
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiIi() {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = (int)this.iiiiIiiiIiiII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 <= 0) {
            return;
        }
        SuitOperBean suitOperBean = new SuitOperBean();
        suitOperBean.setType(117);
        suitOperBean.setJade(new PartJade((long)this.iIiIiiiiIiIii, IiiiiiiiIIIII2));
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void iiiIiiiiiiIIi() {
        this.IIIIiiiiiiiII[0].setText(String.valueOf(this.ALLATORIxDEMO().getPackRecord().getStarSoulType(this.iIiIiiiiIiIii) % 10000L) + "/8000");
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public iiIiiiiiIIiiI(GameView gameView) {
        super(141, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 404, 413, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u661f\u9b42\u8010\u4e45");
        this.iIiiIiiiiiiII = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiiIiiiiiiII.setTextSize("#cFF0000\u6218\u6597\u5c06\u6d88\u8017\u661f\u9b42\u8010\u4e45\u3002\u8010\u4e45\u4e3a\u96f6\u65f6\uff0c\u661f\u9b42\u4e0d\u6389\u843d\uff0c\u4f46\u6280\u80fd\u65e0\u6cd5\u751f\u6548\u3002\u53ef\u6d88\u8017\u9b42\u503c\u4fee\u590d\u8010\u4e45\u3002", 308);
        this.iIiiIiiiiiiII.setBounds(58, 28, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new iiIiIiiiiIiii("sc/e/26.png", 1, 31, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u4fee\u590d\u8010\u4e45", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(162, 362, 99, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiIIIiiiiiiiI = new JLabel[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.length) {
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)107, (int)(157 + 29 * IiiiiiiiIIIII), (int)111, (int)19, (int)10, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u8010\u4e45" : (IiiiiiiiIIIII == 1 ? "\u4fee\u590d\u8010\u4e45" : (IiiiiiiiIIIII == 2 ? "\u6d88\u8017\u9b42\u503c" : (IiiiiiiiIIIII == 3 ? "\u62e5\u6709\u9b42\u503c" : (IiiiiiiiIIIII == 4 ? "\u6d88\u8017\u91d1\u94b1" : (IiiiiiiiIIIII == 5 ? "\u62e5\u6709\u91d1\u94b1" : (IiiiiiiiIIIII == 6 ? "\u4e00\u70b9\u9b42\u503c\u53ef\u4fee\u590d50\u8010\u4e45" : "")))))));
            this.add(this.iiIIIiiiiiiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(107, 172 + 29 * IiiiiiiiIIIII, 111, 19);
            } else if (IiiiiiiiIIIII == 4 || IiiiiiiiIIIII == 5) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(107, 186 + 29 * IiiiiiiiIIIII, 111, 19);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(184, 213, 150, 15);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(185, 83, 49, 49);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIiiiiiiiIii = new MoneyType();
        this.IiIiiiiiIIIII = new MoneyType();
        this.iiIiiiiiiiIii.setIdAndKey(0, "\u9b42\u503c");
        this.IiIiiiiiIIIII.setIdAndKey(1, "\u91d1\u94b1");
        this.IIIIiiiiiiiII = new iIIiIiiiIiiIi[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)185, (int)(157 + 29 * IiiiiiiiIIIII), (int)111, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            if (IiiiiiiiIIIII == 2) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(185, 302, 111, 19);
            }
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iiIiIiiiiIIIi.setBounds(185, 230, 111, 19);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.ALLATORIxDEMO = new iiIiIiiiiIiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            iiIiiiiiIIiiI iiIiiiiiIIiiI2 = this;
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)(IiiiiiiiIIIII == 0 ? iiIiiiiiIIiiI2.iiIiiiiiiiIii : iiIiiiiiIIiiI2.IiIiiiiiIIIII), (GameView)gameView);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(2);
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(185, 256, 111, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(185, 331, 111, 19);
            }
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new IIiIIiiiIIIiI(15, (JTextField)this.iiIiIiiiiIIIi, (IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(184, 83, 50, 50);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(180, 79, 59, 57);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)30, (int)1, (int)30, (int)1, (boolean)false));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(71, 287, 273, 2);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
