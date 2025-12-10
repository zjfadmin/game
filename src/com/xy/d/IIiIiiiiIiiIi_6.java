/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIiIiiiiIiiIi
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.Point;

public class IIiIiiiiIiiIi {
    private long iIiiIiiiiiiII;
    private String IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private IIIIIiiiIiIii IiIIIiiiiIiiI;
    public IIiIiiiiIiiIi iiIiiiiiiiIii;
    private long IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public String ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    /*
     * WARNING - void declaration
     */
    public IIiIiiiiIiiIi(String string, int n, int n2) {
        void y;
        void x;
        void name;
        this.IIiiIiiiIIiIi = name;
        this.ALLATORIxDEMO((int)x, (int)y);
    }

    public void ALLATORIxDEMO(int n, int n2) {
        this.iIiIiiiiIiIii = n;
        this.ALLATORIxDEMO = n2;
        this.iIiiIiiiiiiII = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO() + (this.IIiiIiiiIIiIi.equals("\u5347\u7ea7") ? IiiiIiiiiIiIi.iiIiiiiiiiIii / 2L : IiiiIiiiiIiIi.iiIiiiiiiiIii / 4L);
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiiiiiiiIIIII = this.iIiiIiiiiiiII + (long)this.IiIIIiiiiIiiI.IIIiiiiiiIIiI();
    }

    public boolean ALLATORIxDEMO(Graphics g, long time, com.xy.n.IIiIiiiiIiiIi mapCamera) {
        if (time > this.IiiiiiiiIIIII) {
            return true;
        }
        Point IiiiiiiiIIIII = mapCamera.ALLATORIxDEMO(this.iIiIiiiiIiIii, this.ALLATORIxDEMO);
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.IiIIIiiiiIiiI = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)com.xy.w.IIiIiiiiIiiIi.iIiIiiiiIIiii((String)this.IIiiIiiiIIiIi));
            if (this.IiIIIiiiiIiiI != null) {
                this.IiiiiiiiIIIII = this.iIiiIiiiiiiII + (long)this.IiIIIiiiiIiiI.IIIiiiiiiIIiI();
            }
        }
        if (this.IiIIIiiiiIiiI == null) return false;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(time - this.iIiiIiiiiiiII, 0);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, IiiiiiiiIIIII.x, IiiiiiiiIIIII.y);
        return false;
    }
}
