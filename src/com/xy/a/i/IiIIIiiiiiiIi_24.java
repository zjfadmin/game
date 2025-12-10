/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIIIiiiIIiII
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.PartJade
 *  com.xy.formula.MsgUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.i;

import com.xy.a.i.IiIIIiiiIIiII;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.formula.MsgUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
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
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIIIiiiiiiIi
extends IiiiIiiiiIiIi {
    private com.xy.q.IIIiiiiiIiIiI IiIiiiiiIIIII;
    private IiIIIiiiIIiII iiIiIiiiiIIIi;
    private iiiiiiiiiiIiI iiiiIiiiIiiII;
    private IIIiiiiiIiIiI iiiIiiiiiiiIi;
    private IiiiIiiiiIiII[] iIiiIiiiiiiII;
    private IIiiIiiiIiiiI[] IIiiIiiiIIiIi;
    private iIIiIiiiIiiIi iIiIiiiiIiIii;
    private JLabel[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private iiIiIiiiiIiii[] IiiiiiiiIIIII;
    private IIiIIiiiIIIiI ALLATORIxDEMO;

    public IiiiIiiiiIiII[] ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public com.xy.q.IIIiiiiiIiIiI ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.IIiiIiiiIIiIi != null) {
            if (this.IIiiIiiiIIiIi.length == IiiiiiiiIIIII) return;
        }
        this.IIiiIiiiIIiIi = this.ALLATORIxDEMO(this.IIiiIiiiIIiIi, IiiiiiiiIIIII, this.iiiiIiiiIiiII.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 523;
        int IiiiiiiiIIIII3 = 259;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IIiiIiiiIIiIi.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.IIiiIiiiIIiIi[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.iiiiIiiiIiiII.ALLATORIxDEMO(this.IIiiIiiiIIiIi, 0);
    }

    public IiIIIiiiiiiIi(GameView gameView) {
        super(63, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 559, 495, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5151\u6362\u7075\u4fee\u503c");
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(14, 0, 7, 0));
        this.IiiiiiiiIIIII = new iiIiIiiiiIiii[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iiIiIiiiiIiii("sc/e/28.png", 1, 7 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u9ad8\u7ea7\u67e5\u8be2" : (IiiiiiiiIIIII == 2 ? "\u5151\u6362" : ""), (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(323, 24, 68, 18);
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setImage("sc/e/65.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(487, 24, 18, 18);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setForeground(Color.black);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(97, 445, 59, 25);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI();
        this.iiiIiiiiiiiIi.setBounds(45, 255, 17, 17);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiIiIiiiiIIIi = new IiIIIiiiIIiII((IiiiIiiiiIiIi)this, this.iiiIiiiiiiiIi);
        this.iiIiIiiiiIIIi.iIiIiiiiIIiii().setBounds(46, 64, 165, 187);
        this.add(this.iiIiIiiiiIIIi.iIiIiiiiIIiii());
        this.iiIiIiiiiIIIi.ALLATORIxDEMO().setBounds(216, 44, 306, 210);
        this.add(this.iiIiIiiiiIIIi.ALLATORIxDEMO());
        this.IiIIIiiiiIiiI = new JLabel[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)43, (int)165, (int)21, (int)10, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5957\u88c5\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u53ea\u663e\u793a\u5df2\u6709\u7389\u7b26" : (IiiiiiiiIIIII == 2 ? "\u7389\u7b26\u6216\u4e5d\u7384\u4ed9\u7389" : (IiiiiiiiIIIII == 3 ? "\u5151\u6362\u6570\u91cf" : (IiiiiiiiIIIII == 4 ? "\u53ef\u83b7\u5f97\u7075\u4fee\u503c" : "")))));
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"));
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(63, 256, 100, 14);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(36, 340, 180, 18);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 4) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(58, 371 + 35 * (IiiiiiiiIIIII - 3), 120, 17);
            }
            this.add(this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IiiiIiiiiIiII[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
            IiIIIiiiiiiIi iiIIIiiiiiiIi = this;
            if (IiiiiiiiIIIII == 0) {
                iiIIIiiiiiiIi.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(396, 23, 110, 20);
            } else {
                iiIIIiiiiiiIi.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(55, 387, 144, 19);
            }
            if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO = new IIiIIiiiIIIiI(15, (JTextField)this.iIiiIiiiiiiII[IiiiiiiiIIIII], (IiiiIiiiiIiIi)this);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)55, (int)422, (int)144, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiIiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(100, 284, 50, 50);
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(46, 43, 165, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(46, 43, 165, 210);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(214, 44, 308, 210);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(96, 280, 59, 57);
            } else if (IiiiiiiiIIIII == 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(97, 337, 58, 1);
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(214, 259, 309, 207);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiiiIiiiIiiII = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 215, 261);
        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiiiIiiiIiiII.iIiIiiiiIIiii(true);
        this.add((Component)this.iiiiIiiiIiiII);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        this.iiIiIiiiiIIIi.iiiIiiiiiiIIi();
        this.IiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        this.iIiiIiiiiiiII[1].setText("0");
        super.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (number <= 0L) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiIiiiiIiIii, (long)0L);
            return;
        }
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 1) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiIiiiiIiIii, (long)(3L * number));
            return;
        }
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 14) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiIiiiiIiIii, (long)((long)MsgUntil.ALLATORIxDEMO((int)((int)this.IiIiiiiiIIIII.ALLATORIxDEMO())) * number));
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIiIiiiiIiIii, (long)0L);
    }

    public IiIIIiiiIIiII ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }

    public void iIiIiiiiIIiii(int id) {
        String IiiiiiiiIIIII;
        if (id != 9) return;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII3 = null;
        PartJade IiiiiiiiIIIII4 = null;
        int IiiiiiiiIIIII5 = 0;
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 1) {
            IiiiiiiiIIIII3 = (Goodstable)this.IiIiiiiiIIIII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII3.getRgid());
            }
        } else if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 14) {
            IiiiiiiiIIIII4 = (PartJade)this.IiIiiiiiIIIII.ALLATORIxDEMO();
            IiiiiiiiIIIII5 = (int)this.IiIiiiiiIIIII.ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII3 == null && IiiiiiiiIIIII4 == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u9009\u62e9\u4f60\u8981\u5151\u6362\u7684\u7389\u7b26\u6216\u7384\u7389\u3002");
            return;
        }
        int IiiiiiiiIIIII6 = (int)this.ALLATORIxDEMO.ALLATORIxDEMO();
        if (IiiiiiiiIIIII6 <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u4f60\u8981\u5151\u6362\u7684\u7389\u7b26\u6216\u7384\u7389\u7684\u6570\u91cf\u3002");
            return;
        }
        int IiiiiiiiIIIII7 = 0;
        SuitOperBean IiiiiiiiIIIII8 = new SuitOperBean();
        IiiiiiiiIIIII8.setType(7);
        if (IiiiiiiiIIIII4 != null) {
            PartJade partJade = new PartJade(IiiiiiiiIIIII4.getSuitid(), IiiiiiiiIIIII4.getPartId());
            IiiiiiiiIIIII.setJade(IiiiiiiiIIIII5, IiiiiiiiIIIII6);
            IiiiiiiiIIIII7 = MsgUntil.ALLATORIxDEMO((int)IiiiiiiiIIIII5) * IiiiiiiiIIIII6;
            IiiiiiiiIIIII8.setJade((PartJade)IiiiiiiiIIIII);
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII6);
        } else if (IiiiiiiiIIIII3 != null) {
            if (IiiiiiiiIIIII6 > IiiiiiiiIIIII3.getUsetime()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u6570\u91cf\u4e0d\u8db3");
                return;
            }
            IiiiiiiiIIIII = new PartJade(-1L, -1);
            IiiiiiiiIIIII.setJade1(IiiiiiiiIIIII6);
            ArrayList<BigDecimal> IiiiiiiiIIIII9 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII9.add(IiiiiiiiIIIII3.getRgid());
            IiiiiiiiIIIII8.setGoods(IiiiiiiiIIIII9);
            IiiiiiiiIIIII8.setJade((PartJade)IiiiiiiiIIIII);
            IiiiiiiiIIIII7 = IiiiiiiiIIIII6 * 3;
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII3.getUsetime() <= 0) {
                IiiiiiiiIIIII2.iIiIiiiiIIiii(IiiiiiiiIIIII3.getRgid());
            }
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u83b7\u5f97\u4e86 " + IiiiiiiiIIIII7 + " \u70b9\u7075\u4fee\u503c..");
        this.IiIiiiiiIIIII.ALLATORIxDEMO(0, null);
        this.iIiiIiiiiiiII[1].setText("0");
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        int IiiiiiiiIIIII;
        PartJade IiiiiiiiIIIII2;
        if (number == 0L) {
            return null;
        }
        if (number < 0L) return 0L;
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 0) {
            return 0L;
        }
        if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 1) {
            Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiIiiiiiIIIII.ALLATORIxDEMO();
            if (number > (long)IiiiiiiiIIIII3.getUsetime().intValue() && IiiiiiiiIIIII3.getUsetime() <= 999) {
                return IiiiiiiiIIIII3.getUsetime().longValue();
            }
        } else if (this.IiIiiiiiIIIII.ALLATORIxDEMO() == 14 && number > (long)(IiiiiiiiIIIII2 = (PartJade)this.IiIiiiiiIIIII.ALLATORIxDEMO()).getJade(IiiiiiiiIIIII = (int)this.IiIiiiiiIIIII.ALLATORIxDEMO()) && IiiiiiiiIIIII2.getJade(IiiiiiiiIIIII) <= 999) {
            return IiiiiiiiIIIII2.getJade(IiiiiiiiIIIII);
        }
        if (number <= 999L) return null;
        return 999L;
    }
}
