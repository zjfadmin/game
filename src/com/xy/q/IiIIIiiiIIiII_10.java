/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IiIIIiiiiiiIi
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

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IiIIIiiiiiiIi;
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

public class IiIIIiiiIIiII
extends IIiiIiiiiIIiI {
    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IiIIIiiiiiiIi)) return;
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(Goodstable goodstable) {
        IiIIIiiiiiiIi IiiiiiiiIIIII = (IiIIIiiiiiiIi)this.iiIiiiiiiiIii;
        if (GoodType.IIiIIiiiiiIiI((long)goodstable.getType()) && this.iiIiiiiiiiIii.ALLATORIxDEMO().iIiIiiiiIIiii(94) != null) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8bf7\u5148\u505a\u5b8c\u66f4\u6362\u6280\u80fd\u64cd\u4f5c");
            return;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(goodstable);
    }

    public Goodstable ALLATORIxDEMO(int index) {
        RoleData IiiiiiiiIIIII = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return null;
        }
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.goodPacks.length) {
            Goodstable IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII3] != null && (IiiiiiiiIIIII4 = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.goodPacks[IiiiiiiiIIIII3])) != null && (GoodType.IIiIIiiiiiIiI((long)IiiiiiiiIIIII4.getType()) || GoodType.IIIIIiiiIiIIi((long)IiiiiiiiIIIII4.getType()))) {
                if (index == IiiiiiiiIIIII2) {
                    return IiiiiiiiIIIII4;
                }
                ++IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII3;
        }
        return null;
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.white);
        int IiiiiiiiIIIII = this.iiiIiiiiiiiIi != null ? 0 : this.iIiiIiiiiiiII.length;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            int n = IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII;
            int n2 = IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii;
            ++IiiiiiiiIIIII;
            g.drawImage(this.iiiIiiiiiiiIi, n, n2, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
        }
        IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < roleData.goodPacks.length) {
            Goodstable IiiiiiiiIIIII3;
            if (roleData.goodPacks[IiiiiiiiIIIII2] != null && (IiiiiiiiIIIII3 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII2])) != null && (GoodType.IIiIIiiiiiIiI((long)IiiiiiiiIIIII3.getType()) || GoodType.IIIIIiiiIiIIi((long)IiiiiiiiIIIII3.getType()))) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] == null || IiiiiiiiIIIII3.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII3);
                }
                if (IiiiiiiiIIIII != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO, (int)(IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO, (int)(IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIIiIiiiiiiIi, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII3.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (++IiiiiiiiIIIII >= 12) {
                    return;
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
    }

    public IiIIIiiiIIiII(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII = this.ALLATORIxDEMO(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }
}
