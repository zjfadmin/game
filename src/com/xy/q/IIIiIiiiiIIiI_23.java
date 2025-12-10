/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIIiiiIiiiI
 *  com.xy.a.a.iiIIIiiiiiIII
 *  com.xy.a.i.IIIIIiiiIiiII
 *  com.xy.a.i.IIiIiiiiIiIII
 *  com.xy.a.i.IiiiiiiiiIIII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IiIiIiiiiIIiI
 *  com.xy.a.q.iIIIIiiiIiiIi
 *  com.xy.a.q.iiiiIiiiiiIiI
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

import com.xy.a.a.iIiIIiiiIiiiI;
import com.xy.a.a.iiIIIiiiiiIII;
import com.xy.a.i.IIiIiiiiIiIII;
import com.xy.a.i.IiiiiiiiiIIII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IiIiIiiiiIIiI;
import com.xy.a.q.iIIIIiiiIiiIi;
import com.xy.a.q.iiiiIiiiiiIiI;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class IIIiIiiiiIIiI
extends IIiiIiiiiIIiI {
    private List<Long> iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;

    /*
     * WARNING - void declaration
     */
    protected void ALLATORIxDEMO(RoleData roleData) {
        void roleData2;
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi(), (RoleData)roleData2);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex, roleData);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iIIIIiiiIiiIi) {
            ((iIIIIiiiIiiIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiiIiiiiiIiI) {
            ((iiiiIiiiiiIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI) {
            ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiiiiiiiiIIII) {
            ((IiiiiiiiiIIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof com.xy.a.i.IIIIIiiiIiiII) {
            ((com.xy.a.i.IIIIIiiiIiiII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIiIiiiiIiIII) {
            ((IIiIiiiiIiIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiIIIiiiiiIII) {
            ((iiIIIiiiiiIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIiIiiiiIIiI)) return;
        ((IiIiIiiiiIIiI)this.iiIiiiiiiiIii).iiiIiiiiiiIIi(IiiiiiiiIIIII);
    }

    public long ALLATORIxDEMO() {
        if (this.iiIiiiiiiiIii == null) return -1L;
        if (this.iiIiiiiiiiIii.size() == 0) return -1L;
        return this.iiIiiiiiiiIii.get(0);
    }

    public void iiiIiiiiiiIIi(int style) {
        this.IiiiiiiiIIIII = style;
    }

    public boolean ALLATORIxDEMO(int page) {
        int IiiiiiiiIIIII = page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII == 0) {
            return true;
        }
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) == null) return false;
        return true;
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public IIIiIiiiiIIiI(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex, roleData);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iIIIIiiiIiiIi) {
            ((iIIIIiiiIiiIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiiIiiiiiIiI) {
            ((iiiiIiiiiiIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI) {
            ((iIiIIiiiIiiiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiiiiiiiiIIII) {
            ((IiiiiiiiiIIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof com.xy.a.i.IIIIIiiiIiiII) {
            ((com.xy.a.i.IIIIIiiiIiiII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIiIiiiiIiIII) {
            ((IIiIiiiiIiIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiIIIiiiiiIII) {
            ((iiIIIiiiiiIII)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIiIiiiiIIiI)) return;
        ((IiIiIiiiiIIiI)this.iiIiiiiiiiIii).iiiIiiiiiiIIi(IiiiiiiiIIIII);
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
            Goodstable IiiiiiiiIIIII4 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII3]);
            if (IiiiiiiiIIIII4 != null && (this.iiIiiiiiiiIii == null || this.iiIiiiiiiiIii.contains(IiiiiiiiIIIII4.getType())) && (this.IiiiiiiiIIIII != 1 || ((IiIiIiiiiIIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII4))) {
                if (IiiiiiiiIIIII2 < 0) {
                    ++IiiiiiiiIIIII2;
                } else {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null || IiiiiiiiIIIII4.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iiIIIiiiiiiiI) {
                        if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null) {
                            this.iIiiIiiiiiiII[IiiiiiiiIIIII2] = new com.xy.w.IiIiIiiiiIIiI();
                        }
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII4);
                    }
                    if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                        IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    } else {
                        IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    }
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIIiIiiiiiiIi != null) {
                        g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iIIiIiiiiiiIi, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                    }
                    if (IiiiiiiiIIIII4.getGoodlock() == 1) {
                        g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                    }
                    if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 + IiiiiiiiIIIII == this.IIIIiiiiiiiII) {
                        g.setColor(Color.red);
                        g.drawRect(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                        g.drawRect(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 4, this.ALLATORIxDEMO - 4);
                        g.setColor(Color.white);
                    }
                    if (++IiiiiiiiIIIII2 >= this.iIiiIiiiiiiII.length) {
                        return;
                    }
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public int iiiiiiiiIIiii() {
        return this.IiiiiiiiIIIII;
    }

    public Goodstable ALLATORIxDEMO(int index, RoleData roleData) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < roleData.goodPacks.length) {
            Goodstable IiiiiiiiIIIII2 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII2 != null && (this.iiIiiiiiiiIii == null || this.iiIiiiiiiiIii.contains(IiiiiiiiIIIII2.getType())) && (this.IiiiiiiiIIIII != 1 || ((IiIiIiiiiIIiI)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII2))) {
                if (index == 0) {
                    return IiiiiiiiIIIII2;
                }
                --index;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(long ... goodTypes) {
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new ArrayList<Long>();
        } else {
            this.iiIiiiiiiiIii.clear();
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < goodTypes.length) {
            if (goodTypes[IiiiiiiiIIIII] != -1L) {
                this.iiIiiiiiiiIii.add(goodTypes[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
    }
}
