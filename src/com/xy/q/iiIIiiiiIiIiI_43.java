/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIIIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IiIIIiiiiiiIi
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.StallBuyData
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.IIIIIiiiIIIiI;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IiIIIiiiiiiIi;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.StallBuyData;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiiiiIiIiI
extends IIiiIiiiiIIiI {
    private List<BigDecimal> ALLATORIxDEMO = new ArrayList<BigDecimal>();

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getGood(this.ALLATORIxDEMO(choseIndex));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIIIiiiiiiIi)) {
            if (!(this.iiIiiiiiiiIii instanceof IIIIIiiiIIIiI)) return;
            ((IIIIIiiiIIIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.getUsetime().intValue());
            return;
        }
        IiIIIiiiiiiIi IiiiiiiiIIIII2 = (IiIIIiiiiiiIi)this.iiIiiiiiiiIii;
        if (GoodType.IIiIIiiiiiIiI((long)IiiiiiiiIIIII.getType()) && this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiii(94) != null) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u5148\u505a\u5b8c\u66f4\u6362\u6280\u80fd\u64cd\u4f5c");
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII);
        IiiiiiiiIIIII2.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(List<BigDecimal> goodList) {
        this.ALLATORIxDEMO = goodList;
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getGood(this.ALLATORIxDEMO(choseIndex));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IIIIIiiiIIIiI)) return;
        ((IIIIIiiiIIIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII, 1);
    }

    public BigDecimal ALLATORIxDEMO(int index) {
        if (this.ALLATORIxDEMO == null) {
            return null;
        }
        if (index >= this.ALLATORIxDEMO.size()) return null;
        return this.ALLATORIxDEMO.get(index);
    }

    /*
     * WARNING - void declaration
     */
    protected void ALLATORIxDEMO(Graphics graphics, RoleData roleData) {
        void g;
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        graphics.setColor(Color.white);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            void roleData2;
            Goodstable IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, (int)(this.ALLATORIxDEMO + 2), null);
            }
            if ((IiiiiiiiIIIII4 = roleData2.getGood(this.ALLATORIxDEMO(IiiiiiiiIIIII2))) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII4.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, (int)(this.ALLATORIxDEMO - 2));
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getGood(this.ALLATORIxDEMO(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi()));
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    public List<BigDecimal> ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public iiIIiiiiIiIiI(IiiiIiiiiIiIi iiiiIiiiiIiIi, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(iiiiIiiiiIiIi, n, n2, n3, n4, n5, n6, n7, n8);
    }

    public boolean ALLATORIxDEMO(StallBuyData buyData) {
        if (buyData == null) {
            return false;
        }
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.goodPacks.length) {
            Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII3 != null && !GoodType.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII3)) {
                if (buyData.ALLATORIxDEMO(IiiiiiiiIIIII3)) return true;
            }
            ++IiiiiiiiIIIII2;
        }
        return false;
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(StallBuyData buyData) {
        if (buyData == null) {
            this.ALLATORIxDEMO((List<BigDecimal>)null);
            return;
        }
        List<BigDecimal> IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.clear();
        }
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.goodPacks.length) {
            Goodstable IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getGood(IiiiiiiiIIIII2.goodPacks[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII4 != null && !GoodType.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII4) && buyData.ALLATORIxDEMO(IiiiiiiiIIIII4)) {
                if (IiiiiiiiIIIII == null) {
                    IiiiiiiiIIIII = new ArrayList<BigDecimal>();
                }
                IiiiiiiiIIIII.add(IiiiiiiiIIIII4.getRgid());
            }
            ++IiiiiiiiIIIII3;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public boolean ALLATORIxDEMO(int page) {
        int IiiiiiiiIIIII = page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII == 0) {
            return true;
        }
        if (this.iiIiiiiiiiIii.ALLATORIxDEMO() == null) {
            return false;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII) == null) return false;
        return true;
    }
}
