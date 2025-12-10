/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IiIIiiiiiiiII
 *  com.xy.a.q.IiIiIiiiiiIiI
 *  com.xy.a.q.iiiIiiiiIiiiI
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Shop
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IiIIiiiiiiiII;
import com.xy.a.q.IiIiIiiiiiIiI;
import com.xy.a.q.iiiIiiiiIiiiI;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Shop;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiiIIi
extends IIiiIiiiiIIiI {
    private List<Shop> ALLATORIxDEMO;

    public int ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.iiiiiiiiIIiii();
        if (IiiiiiiiIIIII != 0) return (IiiiiiiiIIIII - 1) / this.iIiiIiiiiiiII.length;
        return 0;
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Shop IiiiiiiiIIIII = this.ALLATORIxDEMO(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Shop IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiIiiiiIiiiI) {
            this.ALLATORIxDEMO(choseIndex);
            iiiIiiiiIiiiI IiiiiiiiIIIII2 = (iiiIiiiiIiiiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, true);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIiIiiiiiIiI) {
            this.ALLATORIxDEMO(choseIndex);
            IiIiIiiiiiIiI IiiiiiiiIIIII3 = (IiIiIiiiiiIiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII, true);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIIiiiiiiiII)) return;
        this.ALLATORIxDEMO(choseIndex);
        IiIIiiiiiiiII IiiiiiiiIIIII4 = (IiIIiiiiiiiII)this.iiIiiiiiiiIii;
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII, true);
    }

    public boolean ALLATORIxDEMO(int page) {
        if (page > this.ALLATORIxDEMO()) return false;
        return true;
    }

    public iiIiIiiiiiIIi(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
        this.ALLATORIxDEMO(true);
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
            Shop IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, (int)(this.ALLATORIxDEMO + 2), null);
            }
            if ((IiiiiiiiIIIII4 = this.ALLATORIxDEMO(IiiiiiiiIIIII2)) != null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4 != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiiiIiiiIIiii) {
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
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 10);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, (int)(this.ALLATORIxDEMO - 2));
                    g.setColor(Color.white);
                } else if (this.iiIIIiiiiiiiI == IiiiiiiiIIIII3) {
                    g.setColor(Color.white);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, (int)(this.ALLATORIxDEMO - 2));
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public Shop ALLATORIxDEMO(int index) {
        if (this.ALLATORIxDEMO == null) {
            return null;
        }
        if (index >= this.ALLATORIxDEMO.size()) return null;
        return this.ALLATORIxDEMO.get(index);
    }

    public List<Shop> ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public int iiiiiiiiIIiii() {
        if (this.ALLATORIxDEMO != null) return this.ALLATORIxDEMO.size();
        return 0;
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Shop IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiIiiiiIiiiI) {
            this.ALLATORIxDEMO(choseIndex);
            iiiIiiiiIiiiI IiiiiiiiIIIII2 = (iiiIiiiiIiiiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, false);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIiIiiiiiIiI) {
            this.ALLATORIxDEMO(choseIndex);
            IiIiIiiiiiIiI IiiiiiiiIIIII3 = (IiIiIiiiiiIiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII, false);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIIiiiiiiiII)) return;
        this.ALLATORIxDEMO(choseIndex);
        IiIIiiiiiiiII IiiiiiiiIIIII4 = (IiIIiiiiiiiII)this.iiIiiiiiiiIii;
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    public void ALLATORIxDEMO(List<Shop> shops) {
        this.ALLATORIxDEMO = shops;
        if (this.IiIiiiiiIIIII != null) {
            this.IiIiiiiiIIIII.iIiIiiiiIIiIi(0);
            this.IiIiiiiiIIIII.ALLATORIxDEMO(this.ALLATORIxDEMO() > 0);
        }
        this.ALLATORIxDEMO();
    }
}
