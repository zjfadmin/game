/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIIiiiiIiii
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Bbuy
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.a.q;

import com.xy.a.q.IiIIIiiiiIiii;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Goodstable;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/*
 * Exception performing whole class analysis ignored.
 */
static class IiiiIiiiiiIIi
extends iiiiiiiiiiIiI {
    final /* synthetic */ IiIIIiiiiIiii ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    IiiiIiiiiiIIi(IiIIIiiiiIiii iiIIIiiiiIiii, IiiiIiiiiIiIi iiiiIiiiiIiIi, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        void $anonymous8;
        void $anonymous7;
        void $anonymous6;
        void $anonymous5;
        void $anonymous4;
        void $anonymous3;
        void $anonymous2;
        void $anonymous1;
        void $anonymous0;
        this.ALLATORIxDEMO = iiIIIiiiiIiii;
        super((IiiiIiiiiIiIi)$anonymous0, (int)$anonymous1, (int)$anonymous2, (int)$anonymous3, (int)$anonymous4, (int)$anonymous5, (int)$anonymous6, (int)$anonymous7, (int)$anonymous8);
    }

    protected void iIiIiiiiIIiii(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, (int)(this.ALLATORIxDEMO + 2), null);
            }
            ++IiiiiiiiIIIII;
        }
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        if (this.ALLATORIxDEMO != false && IiiiiiiiIIIII >= this.IiiIiiiiiiIiI() - this.iIiiIiiiiiiII.length) {
            this.iIiIiiiiIIiii(g, roleData);
            return;
        }
        int IiiiiiiiIIIII2 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.white);
        IiiiiiiiiIIII IiiiiiiiIIIII3 = IiIIIiiiiIiii.ALLATORIxDEMO((IiIIIiiiiIiii)this.ALLATORIxDEMO) == 1 || IiIIIiiiiIiii.ALLATORIxDEMO((IiIIIiiiiIiii)this.ALLATORIxDEMO) == 2 ? this.ALLATORIxDEMO.ALLATORIxDEMO() : null;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII5;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, (int)(this.ALLATORIxDEMO + 2), null);
            }
            if ((IiiiiiiiIIIII5 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII2])) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO();
                }
            } else {
                Bbuy IiiiiiiiIIIII6;
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null || IiiiiiiiIIIII5.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII4] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IiiiiiiiIIIII5);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iIIiIiiiiiiIi, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII5.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (IiiiiiiiIIIII3 != null && (IiiiiiiiIIIII6 = IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII5.getGoodsid())) != null && (IiIIIiiiiIiii.ALLATORIxDEMO((IiIIIiiiiIiii)this.ALLATORIxDEMO) == 1 && IiiiiiiiIIIII6.getPrice1() != 0L || IiIIIiiiiIiii.ALLATORIxDEMO((IiIIIiiiiIiii)this.ALLATORIxDEMO) == 2 && IiiiiiiiIIIII6.getPrice2() != 0L)) {
                    g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 4, 20, 20, null);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, (int)(this.ALLATORIxDEMO - 2));
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII4;
        }
    }
}
