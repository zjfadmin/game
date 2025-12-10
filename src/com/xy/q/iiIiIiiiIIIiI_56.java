/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.game.RoleData
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class iiIiIiiiIIIiI
extends IIiiIiiiiIIiI {
    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getParcelGood(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (roleData.getGoodPackSum(IiiiiiiiIIIII.getType().longValue(), IiiiiiiiIIIII.getGoodsid(), IiiiiiiiIIIII.getUsetime().intValue()) <= 0) {
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u80cc\u5305\u5df2\u6ee1");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"parcel", (String)IiiiiiiiIIIII.getRgid().toString());
        this.iiIiiiiiiiIii.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public iiIiIiiiIIIiI(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
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
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII4 = roleData2.getParcelGood(IiiiiiiiIIIII2)) == null) {
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
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII4.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getParcelGood(this.iiIIIiiiiiiiI + this.iiiIiiiiiiIIi());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }
}
