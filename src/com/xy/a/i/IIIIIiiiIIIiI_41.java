/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIIIiiiIIiII
 *  com.xy.bean.LoginResult
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.i;

import com.xy.a.i.IiIIIiiiIIiII;
import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi[] iIIiIiiiiiiIi;
    private JLabel[] IIIIiiiiiiiII;
    private IiIIIiiiIIiII iiIIIiiiiiiiI;
    private com.xy.q.IIIiiiiiIiIiI IiIiiiiiIIIII;
    private iiIiIiiiiIiii[] iiIiIiiiiIIIi;
    private iiiiiiiiiiIiI iiiiIiiiIiiII;
    private BigDecimal iiiIiiiiiiiIi = null;
    private IiiiIiiiiIiII iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private BigDecimal iIiIiiiiIiIii = null;
    private iiIiIiiiiIiIi IiIIIiiiiIiiI;
    private IIiiIiiiIiiiI[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    public com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        this.iiIIIiiiiiiiI.iiiIiiiiiiIIi();
        this.IiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI() {
        void IiiiiiiiIIIII;
        PartJade IiiiiiiiIIIII2 = (PartJade)this.IiIiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4f60\u8981\u6536\u5f55\u7684\u7389\u7b26..");
            return;
        }
        int IiiiiiiiIIIII3 = (int)this.IiIiiiiiIIIII.ALLATORIxDEMO();
        RoleData IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getLoginResult();
        if (this.iIiIiiiiIiIii.compareTo(IiiiiiiiIIIII5.getScoretype("\u7075\u4fee\u503c")) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7075\u4fee\u503c\u70b9\u6570\u4e0d\u8db3\uff0c\u5feb\u53bb\u83b7\u53d6\u7075\u4fee\u503c\u5427..");
            return;
        }
        if (this.iiiIiiiiiiiIi.compareTo(IiiiiiiiIIIII5.getGold()) > 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u5e01\u4e0d\u8db3..");
            return;
        }
        if (IiiiiiiiIIIII4.getPackRecord().ALLATORIxDEMO((int)IiiiiiiiIIIII2.getSuitid(), IiiiiiiiIIIII2.getPartId()) != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5df2\u5230\u8fbe\u6536\u5f55\u4e0a\u9650..");
            return;
        }
        SuitOperBean IiiiiiiiIIIII6 = new SuitOperBean();
        PartJade partJade = new PartJade(IiiiiiiiIIIII2.getSuitid(), IiiiiiiiIIIII2.getPartId());
        IiiiiiiiIIIII.setJade(IiiiiiiiIIIII3, 1);
        IiiiiiiiIIIII6.setJade((PartJade)IiiiiiiiIIIII);
        IiiiiiiiIIIII6.setType(8);
        String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII6));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
        IiiiiiiiIIIII5.setScore(com.xy.v.IIIiiiiiIiIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII5.getScore(), (String)("\u7075\u4fee\u503c=" + this.iIiIiiiiIiIii), (int)3));
        IiiiiiiiIIIII5.setGold(IiiiiiiiIIIII5.getGold().subtract(this.iiiIiiiiiiiIi));
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6d88\u8017\u4e86" + this.iIiIiiiiIiIii + "\u70b9\u7075\u4fee\u503c       \u6263\u9664\u4e86" + this.iiiIiiiiiiiIi + "\u91d1\u5e01..");
        this.IiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        this.iIiIiiiiIIiIi();
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
    }

    public IiIIIiiiIIiII ALLATORIxDEMO() {
        return this.iiIIIiiiiiiiI;
    }

    public IIIIIiiiIIIiI(GameView gameView) {
        super(64, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 559, 495, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6536\u5f55\u7389\u7b26");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 7, 0));
        this.iiIiIiiiiIIIi = new iiIiIiiiiIiii[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/28.png", 1, 10 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u9ad8\u7ea7\u67e5\u8be2" : (IiiiiiiiIIIII == 2 ? "\u6536\u5f55" : (IiiiiiiiIIIII == 3 ? "\u83b7\u5f97" : "")), (IiiiIiiiiIiIi)this);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(323, 24, 68, 18);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setImage("sc/e/65.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(487, 24, 18, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(97, 445, 59, 25);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setImage("sc/e/6.png");
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(163, 423, 34, 18);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi.setBounds(45, 255, 17, 17);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.iiIIIiiiiiiiI = new IiIIIiiiIIiII((IiiiIiiiiIiIi)this, this.IIiiIiiiIIiIi);
        this.iiIIIiiiiiiiI.iIiIiiiiIIiii().setBounds(46, 64, 165, 187);
        this.add(this.iiIIIiiiiiiiI.iIiIiiiiIIiii());
        this.iiIIIiiiiiiiI.ALLATORIxDEMO().setBounds(216, 44, 306, 210);
        this.add(this.iiIIIiiiiiiiI.ALLATORIxDEMO());
        this.IIIIiiiiiiiII = new JLabel[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIiiiiiiiII.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)43, (int)165, (int)21, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u53ea\u663e\u793a\u5df2\u6709\u7389\u7b26" : (IiiiiiiiIIIII == 2 ? "\u6240\u9700\u91d1\u94b1\uff1a" : (IiiiiiiiIIIII == 3 ? "\u6240\u9700\u7075\u4fee\u503c\uff1a" : (IiiiiiiiIIIII == 4 ? "\u5df2\u6709\u7075\u4fee\u503c\uff1a" : "")))));
            if (IiiiiiiiIIIII == 0) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(63, 256, 100, 14);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(58, 371 + 35 * (IiiiiiiiIIIII - 3), 120, 17);
            }
            this.add(this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIiiIiiiiiiII.setBounds(396, 23, 110, 20);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iIIiIiiiiiiIi = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)(387 + (IiiiiiiiIIIII - 1) * 35), (int)144, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.iIIiIiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new MoneyType();
        this.ALLATORIxDEMO.setIdAndKey(0, "\u7075\u4fee\u503c");
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.ALLATORIxDEMO, (GameView)gameView);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(2);
        this.IiIIIiiiiIiiI.setBounds(55, 422, 144, 19);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.IiIiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(100, 278, 50, 50);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(46, 43, 165, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(46, 43, 165, 210);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(214, 44, 308, 210);
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(96, 274, 59, 57);
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(97, 331, 58, 1);
            } else if (IiiiiiiiIIIII == 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(214, 259, 309, 207);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 215, 261);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiiiIiiiIiiII.iIiIiiiiIIiii(true);
        this.add((Component)this.iiiiIiiiIiiII);
    }

    public void iIiIiiiiIIiIi() {
        PartJade IiiiiiiiIIIII = (PartJade)this.IiIiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            this.iiiIiiiiiiiIi = null;
            this.iIIiIiiiiiiIi[0].setText(null);
            this.iIiIiiiiIiIii = null;
            this.iIIiIiiiiiiIi[1].setText(null);
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        this.iiiIiiiiiiiIi = new BigDecimal((IiiiiiiiIIIII2.getPackRecord().getCollectionNum(IiiiiiiiIIIII, this.ALLATORIxDEMO()) + 1) * 1000000);
        this.iIiIiiiiIiIii = new BigDecimal(50);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIIiIiiiiiiIi[0], (long)this.iiiIiiiiiiiIi.longValue());
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIIiIiiiiiiIi[1], (long)this.iIiIiiiiIiIii.longValue());
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.iiIiiiiiiiIii != null) {
            if (this.iiIiiiiiiiIii.length == IiiiiiiiIIIII) return;
        }
        this.iiIiiiiiiiIii = this.ALLATORIxDEMO(this.iiIiiiiiiiIii, IiiiiiiiIIIII, this.iiiiIiiiIiiII.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 523;
        int IiiiiiiiIIIII3 = 259;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiIiiiiiiiIii.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.iiIiiiiiiiIii[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.iiiiIiiiIiiII.ALLATORIxDEMO(this.iiIiiiiiiiIii, 0);
    }
}
