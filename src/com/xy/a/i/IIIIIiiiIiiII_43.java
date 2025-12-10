/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiiiIiiiiIiII
 *  com.xy.bean.SuitOperBean
 *  com.xy.entity.Baby
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.iiIiIiiiiIiii
 *  com.xy.q.IIIiIiiiiIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiIIiiiIIIii
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.i;

import com.xy.a.i.IiiiIiiiiIiII;
import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.iiIiIiiiiIiii;
import com.xy.q.IIIiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiIIiiiIIIii;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII
extends IiiiIiiiiIiIi {
    private int iIiiIiiiiiiII = -1;
    private iIIiIiiiIiiIi IIiiIiiiIIiIi;
    private IIIiIiiiiIIiI iIiIiiiiIiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private iiIiIiiiiIiii[] iiIiiiiiiiIii;
    private IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private IiiiIiiiiIiII ALLATORIxDEMO;

    public void iIiIiiiiIIiii(int id) {
        if (id == 71) {
            this.iIiIiiiiIIiIi();
            return;
        }
        if (id != 72) return;
        this.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO((Goodstable)null);
        return super.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.ALLATORIxDEMO == null && !is) {
            return;
        }
        if (is) {
            if (this.ALLATORIxDEMO == null) {
                this.ALLATORIxDEMO = new IiiiIiiiiIiII((IiiiIiiiiIiIi)this);
                this.add((Component)this.ALLATORIxDEMO, 0);
            }
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO(false);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO().removeAllElements();
            int IiiiiiiiIIIII = 0;
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            List<BigDecimal> IiiiiiiiIIIII3 = null;
            int IiiiiiiiIIIII222 = 0;
            while (IiiiiiiiIIIII222 < IiiiiiiiIIIII2.babys.size()) {
                Baby IiiiiiiiIIIII4 = (Baby)IiiiiiiiIIIII2.babys.get(IiiiiiiiIIIII222);
                BigDecimal[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getpartAll();
                if (IiiiiiiiIIIII3 != null) {
                    IiiiiiiiIIIII3.clear();
                }
                if ((IiiiiiiiIIIII3 = this.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII5)) != null && IiiiiiiiIIIII3.size() != 0) {
                    IiiiiiiiIIIII += IiiiiiiiIIIII3.size();
                    iiiIIiiiIIIii IiiiiiiiIIIII6 = new iiiIIiiiIIIii(String.valueOf(IiiiiiiiIIIII4.getBabyname()) + "(" + IiiiiiiiIIIII3.size() + ")", (Object)IiiiiiiiIIIII4.getBabyid());
                    this.ALLATORIxDEMO.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII6);
                }
                ++IiiiiiiiIIIII222;
            }
            iiiIIiiiIIIii IiiiiiiiIIIII222 = new iiiIIiiiIIIii("\u5168\u90e8(" + IiiiiiiiIIIII + ")", null);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.iiiIiiiiiiIIi(IiiiiiiiIIIII222);
            this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO(this.ALLATORIxDEMO.iIiIiiiiIiIii.ALLATORIxDEMO().size() - 1);
            this.ALLATORIxDEMO.setBounds(30, 108, 330, 150);
        }
        this.ALLATORIxDEMO.setVisible(is);
    }

    public void ALLATORIxDEMO(BigDecimal babyId) {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        List<BigDecimal> IiiiiiiiIIIII2 = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.babys.size()) {
            Baby IiiiiiiiIIIII4 = (Baby)IiiiiiiiIIIII.babys.get(IiiiiiiiIIIII3);
            if (babyId == null || IiiiiiiiIIIII4.getBabyid().compareTo(babyId) == 0) {
                BigDecimal[] IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getpartAll();
                IiiiiiiiIIIII2 = this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII5);
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO.IiIIIiiiiIiiI.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.ALLATORIxDEMO.IiIIIiiiiIiiI.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public boolean iIiIiiiiIIiii() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        Goodstable IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO(137L);
        if (IiiiiiiiIIIII2 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7f3a\u5c11\u70b9\u91d1\u77f3");
            return false;
        }
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiIIIiiiiIiiI[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII3 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u5bf9\u5e94\u7269\u54c1");
            return false;
        }
        if (GoodType.getExtra((String)IiiiiiiiIIIII3.getValue(), (String)"\u70bc\u5668\u5c5e\u6027") != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u88c5\u5907\u5df2\u7ecf\u70b9\u91d1\u6210\u529f");
            return false;
        }
        SuitOperBean IiiiiiiiIIIII4 = new SuitOperBean();
        ArrayList<BigDecimal> IiiiiiiiIIIII5 = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII5.add(IiiiiiiiIIIII3.getRgid());
        IiiiiiiiIIIII5.add(IiiiiiiiIIIII2.getRgid());
        IiiiiiiiIIIII4.setType(134);
        IiiiiiiiIIIII4.setGoods(IiiiiiiiIIIII5);
        String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
        return true;
    }

    public IIIIIiiiIiiII(GameView gameView) {
        super(165, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 382, 375, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u70b9\u91d1");
        this.iiIiiiiiiiIii = new iiIiIiiiiIiii[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiiIiii(IiiiiiiiIIIII == 0 ? "sc/e/28.png" : "sc/e/7.png", 1, 71 + IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u5df2\u7a7f\u88c5\u5907" : (IiiiiiiiIIIII == 1 ? "\u70b9\u91d1" : ""), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(110, 123, 60, 18);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(172, 190, 59, 25);
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)233, (int)122, (int)64, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO("sc/d/4.png");
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIiIiiiiIIII);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(110 + IiiiiiiiIIIII * 125, 64, 59, 57);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(47, 231, 311, 105);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/49.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(46, 32, 311, 200);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(316, 338, 18, 18);
            } else {
                IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(338, 338, 18, 18);
            }
            this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
        }
        this.iIiIiiiiIiIii = new IIIiIiiiiIIiI((IiiiIiiiiIiIi)this, 6, 2, 51, 51, 0, 0, 48, 233);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(new long[]{139L});
        this.add((Component)this.iIiIiiiiIiIii);
        Goodstable IiiiiiiiIIIII32 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(667));
        this.IiIIIiiiiIiiI[1].ALLATORIxDEMO(IiiiiiiiIIIII32 != null ? 1 : 0, (Object)IiiiiiiiIIIII32);
    }

    public void iIiIiiiiIIiIi() {
        if (this.ALLATORIxDEMO == null) {
            this.iiiIiiiiiiIIi(true);
            return;
        }
        this.iiiIiiiiiiIIi(!this.ALLATORIxDEMO.isVisible());
    }

    public List<BigDecimal> ALLATORIxDEMO(List<BigDecimal> list, BigDecimal[] bigs) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < bigs.length) {
            Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getGoodEquip(bigs[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII2 != null) {
                if (list == null) {
                    list = new ArrayList<BigDecimal>();
                }
                list.add(IiiiiiiiIIIII2.getRgid());
            }
            ++IiiiiiiiIIIII;
        }
        return list;
    }

    protected void paintComponent(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iiiIiiiiiiIIi();
        }
        super.paintComponent(g);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        this.IiIIIiiiiIiiI[0].ALLATORIxDEMO(good != null ? 1 : 0, (Object)good);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public void iiiIiiiiiiIIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGoodTypeNum(137);
        if ((long)this.iIiiIiiiiiiII != IiiiiiiiIIIII2) {
            this.iIiiIiiiiiiII = (int)IiiiiiiiIIIII2;
            this.IIiiIiiiIIiIi.setText("1/" + this.iIiiIiiiiiiII);
        }
        if (this.IiIIIiiiiIiiI[0].ALLATORIxDEMO() == 0) return;
        Goodstable IiiiiiiiIIIII3 = (Goodstable)this.IiIIIiiiiIiiI[0].ALLATORIxDEMO();
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII3.getRgid());
        }
        if (IiiiiiiiIIIII3 != null) return;
        this.ALLATORIxDEMO((Goodstable)null);
    }
}
