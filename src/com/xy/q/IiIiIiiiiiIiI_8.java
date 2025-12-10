/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.Pal
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.Pal;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class IiIiIiiiiiIiI
extends IIiiIiiiiIIiI {
    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        if (this.iIiiIiiiiiiII[choseIndex] == null) return;
        if (this.iIiiIiiiiiiII[choseIndex].iIiIiiiiIiIii != 1) {
            return;
        }
        Pal IiiiiiiiIIIII = roleData.getChosePal();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append(IiiiiiiiIIIII.getId());
        IiiiiiiiIIIII2.append("|");
        IiiiiiiiIIIII2.append(this.iIiiIiiiiiiII[choseIndex].iiIIIiiiiiiiI);
        IiiiiiiiIIIII2.append("|T");
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"userpal", (String)IiiiiiiiIIIII2.toString());
        this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        g.setColor(iiIIiiiiIiiII.IIIIiiiiiiiII);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII2;
            if (this.iIiiIiiiiiiII[IiiiiiiiIIIII] != null && this.iIiiIiiiiiiII[IiiiiiiiIIIII].iIiIiiiiIiIii == 1 && (IiiiiiiiIIIII2 = roleData.getGoodEquip(this.iIiiIiiiiiiII[IiiiiiiiIIIII].iiIIIiiiiiiiI)) != null) {
                if (IiiiiiiiIIIII2.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII].iiIIIiiiiiiiI) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII2);
                }
                g.fillRect(IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 1, this.ALLATORIxDEMO + 1);
                if (IiiiiiiiIIIII != this.iIIiIiiiiiiIi) {
                    g.drawImage(this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO, null);
                } else {
                    g.drawImage(this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO, null);
                }
                if (IiiiiiiiIIIII2.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public IiIiIiiiiiIiI(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        if (this.iIiiIiiiiiiII[this.iiIIIiiiiiiiI] == null) return;
        if (this.iIiiIiiiiiiII[this.iiIIIiiiiiiiI].iIiIiiiiIiIii != 1) {
            return;
        }
        Goodstable IiiiiiiiIIIII = roleData.getGood(this.iIiiIiiiiiiII[this.iiIIIiiiiiiiI].iiIIIiiiiiiiI);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }
}
