/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.WorkshopBtn
 *  com.xy.a.i.IIiiIiiiiIIiI
 *  com.xy.a.i.iiIIiiiiIiiII
 *  com.xy.a.i.iiIiIiiiiIiii
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.i.WorkshopBtn;
import com.xy.a.i.iiIiIiiiiIiii;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiiIiii
extends IIiiIiiiiIIiI {
    private int IiiiiiiiIIIII;

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

    public IiIiIiiiiIiii(int type, IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
        this.IiiiiiiiIIIII = type;
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiIiIiiiiIiii) {
            iiIiIiiiiIiii IiiiiiiiIIIII2 = (iiIiIiiiiIiii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII2.ALLATORIxDEMO()[0].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof com.xy.a.i.iiIIiiiiIiiII) {
            com.xy.a.i.iiIIiiiiIiiII IiiiiiiiIIIII3 = (com.xy.a.i.iiIIiiiiIiiII)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII3.ALLATORIxDEMO().ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII3.IiiIiiiiiiIiI();
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIiIii) {
            IIIIIiiiIiIii IiiiiiiiIIIII4 = (IIIIIiiiIiIii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII4.ALLATORIxDEMO()[0].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII4.iIiIiiiiIIiIi();
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof com.xy.a.i.IIiiIiiiiIIiI)) return;
        com.xy.a.i.IIiiIiiiiIIiI IiiiiiiiIIIII5 = (com.xy.a.i.IIiiIiiiiIIiI)this.iiIiiiiiiiIii;
        if (this.IiiiiiiiIIIII == 2) {
            IiiiiiiiIIIII5.ALLATORIxDEMO()[0].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII5.ALLATORIxDEMO()[1].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
        } else {
            IiiiiiiiIIIII5.ALLATORIxDEMO()[2].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII5.IiiIiiiiiiIiI();
    }

    public Goodstable ALLATORIxDEMO(int index) {
        if (index < 0) {
            return null;
        }
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.goodPacks.length) {
            long IiiiiiiiIIIII3;
            Goodstable IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII2] != null && (IiiiiiiiIIIII4 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII2])) != null && GoodType.IIiIIiiiiiIII((long)IiiiiiiiIIIII4.getType()) && (IiiiiiiiIIIII3 = IiiiiiiiIIIII4.getGoodsid().longValue()) != 6029L && IiiiiiiiIIIII3 != 6030L && IiiiiiiiIIIII3 != 6031L && IiiiiiiiIIIII3 != 6032L && IiiiiiiiIIIII3 != 6033L && IiiiiiiiIIIII3 != 6034L) {
                int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getValue().indexOf(GoodType.Extras[3]);
                if (!(this.IiiiiiiiIIIII == 1 && IiiiiiiiIIIII5 != -1 || this.IiiiiiiiIIIII == 2 && IiiiiiiiIIIII5 == -1)) {
                    if (index == 0) {
                        return IiiiiiiiIIIII4;
                    }
                    --index;
                }
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.white);
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = -IiiiiiiiIIIII;
        int IiiiiiiiIIIII3 = this.iiiIiiiiiiiIi != null ? 0 : this.iIiiIiiiiiiII.length;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            int n = IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII;
            int n2 = IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii;
            ++IiiiiiiiIIIII3;
            g.drawImage(this.iiiIiiiiiiiIi, n, n2, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
        }
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < roleData.goodPacks.length) {
            long IiiiiiiiIIIII4;
            Goodstable IiiiiiiiIIIII5;
            if (roleData.goodPacks[IiiiiiiiIIIII3] != null && (IiiiiiiiIIIII5 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII3])) != null && GoodType.IIiIIiiiiiIII((long)IiiiiiiiIIIII5.getType()) && (IiiiiiiiIIIII4 = IiiiiiiiIIIII5.getGoodsid().longValue()) != 6029L && IiiiiiiiIIIII4 != 6030L && IiiiiiiiIIIII4 != 6031L && IiiiiiiiIIIII4 != 6032L && IiiiiiiiIIIII4 != 6033L && IiiiiiiiIIIII4 != 6034L) {
                int IiiiiiiiIIIII6 = IiiiiiiiIIIII5.getValue().indexOf(GoodType.Extras[3]);
                if (!(this.IiiiiiiiIIIII == 1 && IiiiiiiiIIIII6 != -1 || this.IiiiiiiiIIIII == 2 && IiiiiiiiIIIII6 == -1)) {
                    if (IiiiiiiiIIIII2 < 0) {
                        ++IiiiiiiiIIIII2;
                    } else {
                        if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null || IiiiiiiiIIIII5.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iiIIIiiiiiiiI) {
                            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null) {
                                this.iIiiIiiiiiiII[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI();
                            }
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII5);
                        }
                        if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                            IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                        } else {
                            IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                        }
                        if (IiiiiiiiIIIII5.getGoodlock() == 1) {
                            g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                        }
                        if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 + IiiiiiiiIIIII == this.IIIIiiiiiiiII) {
                            g.setColor(Color.red);
                            g.drawRect(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                            g.drawRect(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                            g.setColor(Color.white);
                        }
                        if (++IiiiiiiiIIIII2 >= this.iIiiIiiiiiiII.length) {
                            return;
                        }
                    }
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }
}
