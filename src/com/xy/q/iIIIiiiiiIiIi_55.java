/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIiiiiiiIiIii
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.a.IIiiiiiiIiIii;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class iIIIiiiiiIiIi
extends IIiiIiiiiIIiI {
    protected void ALLATORIxDEMO(RoleData roleData) {
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getFlyGood(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IIiiiiiiIiIii)) return;
        ((IIiiiiiiIiIii)this.iiIiiiiiiiIii).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public iIIIiiiiiIiIi(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
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
        if (IiiiiiiiIIIII2.getFlyGood(IiiiiiiiIIIII) == null) return false;
        return true;
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getFlyGood(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof IIiiiiiiIiIii)) return;
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"rolechange", (String)("FE" + IiiiiiiiIIIII.getRgid()));
        this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public int ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null) return (IiiiiiiiIIIII2.flyList.size() - 1) / IiiiiiiiIIIII;
        return 0;
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII3;
            this.iiIIIiiiiiiiI = IiiiiiiiIIIII2 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO, null);
            }
            if ((IiiiiiiiIIIII3 = roleData.getFlyGood(this.iiIIIiiiiiiiI)) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null || IiiiiiiiIIIII3.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII2].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII2] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII2] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO(IiiiiiiiIIIII3, roleData.getObjectArea());
                }
                if (this.iiIIIiiiiiiiI != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 4), (int)50, (int)50);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII2].ALLATORIxDEMO, (int)(IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 5), (int)(IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 5), (int)50, (int)50);
                }
                if (roleData.goodChoses[14] != null && IiiiiiiiIIIII3.getRgid().compareTo(roleData.goodChoses[14]) == 0) {
                    g.drawImage(IIiIiiiiIiiIi.IiiiIiiiIiIII, IiiiiiiiIIIII2 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII2 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 4, null);
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }
}
