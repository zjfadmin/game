/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.text.GameView
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.text.GameView;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;
import java.awt.Point;

public class IIIiiiiiIiIiI {
    private iiiiiiiiIIIII[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private String ALLATORIxDEMO;

    public void ALLATORIxDEMO(long time) {
        time = (long)((double)time * 1.5);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII].iiiIiiiiiiIIi() != -1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiIi((int)((long)this.iiIiiiiiiiIii[IiiiiiiiIIIII].iiiIiiiiiiIIi() + time));
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(int x, int y, int dir) {
        if (this.IiiiiiiiIIIII-- >= 0) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII].iiiIiiiiiiIIi() == -1) {
                this.IiiiiiiiIIIII = 30;
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(0, dir, x, y);
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO(Graphics g, GameView view) {
        IIIIIiiiIiIii IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            if (this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iiiIiiiiiiIIi() != -1) {
                if (IiiiiiiiIIIII == null) {
                    IiiiiiiiIIIII = iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)this.ALLATORIxDEMO));
                }
                if (IiiiiiiiIIIII != null) {
                    if (this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iiiIiiiiiiIIi() <= IiiiiiiiIIIII.IIIiiiiiiIIiI()) {
                        Point IiiiiiiiIIIII3 = view.mapCamera.ALLATORIxDEMO(this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iIiIiiiiIIiIi(), this.iiIiiiiiiiIii[IiiiiiiiIIIII2].IiiIiiiiiiIiI());
                        if (IiiiiiiiIIIII3 != null) {
                            IiiiiiiiIIIII.ALLATORIxDEMO((long)this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iiiIiiiiiiIIi(), this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iIiIiiiiIIiii());
                            IiiiiiiiIIIII.ALLATORIxDEMO(g, IiiiiiiiIIIII3.x, IiiiiiiiIIIII3.y);
                        }
                    } else {
                        this.iiIiiiiiiiIii[IiiiiiiiIIIII2].iIiIiiiiIIiIi(-1);
                    }
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public IIIiiiiiIiIiI(String skin) {
        this.ALLATORIxDEMO = skin;
        this.iiIiiiiiiiIii = new iiiiiiiiIIIII[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII++] = new iiiiiiiiIIIII(-1, 0, 0, 0);
        }
        this.IiiiiiiiIIIII = 30;
    }

    public void ALLATORIxDEMO(String skin) {
        this.ALLATORIxDEMO = skin;
    }
}
