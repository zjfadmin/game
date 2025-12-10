/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIIIiiiiiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiIIiiiiIiiII
 *  com.xy.w.iiIiIiiiiIiii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIIIiiiiiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiIIiiiiIiiII;
import com.xy.w.iiIiIiiiiIiii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIiIII
implements IiiiIiiiiIiIi {
    private int iIiiIiiiiiiII;
    private String IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private IIIIIiiiIiIii IiIIIiiiiIiiI;
    private IiiiIiiiiIiIi iiIiiiiiiiIii;
    private long IiiiiiiiIIIII;
    private IiiiIiiiiIiIi ALLATORIxDEMO;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IiiIiiiiiiIiI(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, dir);
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, alpha);
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.IiiIiiiiiiIiI(g, x, y, dir, time, alpha);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean ALLATORIxDEMO(int x, int y) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return false;
            return this.iiIiiiiiiiIii.ALLATORIxDEMO(x, y);
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI == null) return false;
            return this.IiIIIiiiiIiiI.ALLATORIxDEMO(x, y);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, float alpha) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return;
            this.iiIiiiiiiiIii.ALLATORIxDEMO(g, x, y, dir, alpha);
            return;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI == null) return;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO((long)(this.IiIIIiiiiIiiI.IIIiiiiiiIIiI() - 1), iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IiIIIiiiiIiiI.ALLATORIxDEMO()));
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, alpha);
            return;
        }
    }

    public void ALLATORIxDEMO(IiiiIiiiiIiIi part) {
        this.iiIiiiiiiiIii = part;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iiiIiiiiiiIIi(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI == null) return;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, dir);
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, alpha);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int iIiIiiiiIIiii() {
        if (this.iIiIiiiiIiIii != 1 && this.iiIiiiiiiiIii != null) {
            return this.iiIiiiiiiiIii.iIiIiiiiIIiii();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                return this.IiIIIiiiiIiiI.IIIiiiiiiIIiI();
            }
        }
        this.ALLATORIxDEMO();
        return 1200;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, long time) {
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.iiiIiiiiiiIIi(g, x, y, dir, time, 1.0f);
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, dir);
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y);
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(g, x, y, dir, time);
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String rSkin) {
        return rSkin.equals(this.IIiiIiiiIIiIi);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IiIIIiiiiIiiI.ALLATORIxDEMO()));
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, alpha);
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(g, x, y, dir, time, alpha);
    }

    public IiiiIiiiiIiIi iIiIiiiiIIiii() {
        IIiIiiiiIiIII IiiiiiiiIIIII = new IIiIiiiiIiIII(this.IIiiIiiiIIiIi, this.iIiiIiiiiiiII, this.iIiIiiiiIiIii, this.IiiiiiiiIIIII);
        if (this.iiIiiiiiiiIii == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIiiiiiiiIii.iIiIiiiiIIiii());
        return IiiiiiiiIIIII;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, long skin, IiIIIiiiiiiIi[] ones) {
        if (this.iIiIiiiiIiIii == lvl) {
            iiIIiiiiIiiII iiIIiiiiIiiII2 = new iiIIiiiiIiiII(skin, ones, this.iIiiIiiiiiiII, lvl, this.IiiiiiiiIIIII);
            iiIIiiiiIiiII2.ALLATORIxDEMO(this.iiIiiiiiiiIii);
            return iiIIiiiiIiiII2;
        }
        if (this.iiIiiiiiiiIii == null) return this;
        return this.iiIiiiiiiiIii.ALLATORIxDEMO(lvl, skin, ones);
    }

    public void ALLATORIxDEMO(String skin) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return;
            this.iiIiiiiiiiIii.ALLATORIxDEMO(skin);
            return;
        }
        if (skin == null) {
            this.ALLATORIxDEMO = null;
            return;
        }
        this.ALLATORIxDEMO = iiiiiiiiiiIiI.ALLATORIxDEMO((String)skin, (int)2, (int)1, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int IiiIiiiiiiIiI() {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return 2;
            return this.iiIiiiiiiiIii.IiiIiiiiiiIiI();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI == null) return 2;
            return this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        }
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiii() {
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            this.IiIIIiiiiIiiI = null;
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.iIiIiiiiIIiii();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiii(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        if (time == -1L && this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return;
            this.iiIiiiiiiiIii.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
            return;
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IiIIIiiiiIiiI.ALLATORIxDEMO()));
                this.IiIIIiiiiIiiI.iIiIiiiiIIiii(g, x, y, alpha);
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
    }

    public IIiIiiiiIiIII(String skin, int act, int lvl, long colorId) {
        this.IIiiIiiiIIiIi = skin;
        this.iIiiIiiiiiiII = act;
        this.iIiIiiiiIiIii = lvl;
        this.IiiiiiiiIIIII = colorId;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, String skin) {
        long IiiiiiiiIIIII;
        if (this.iIiIiiiiIiIii != lvl) {
            if (this.iiIiiiiiiiIii == null) return this;
            return this.iiIiiiiiiiIii.ALLATORIxDEMO(lvl, skin);
        }
        if (IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)skin) && iiiiiiiiiiIiI.ALLATORIxDEMO((long)(IiiiiiiiIIIII = Long.parseLong(skin)), (int)-1) != null) {
            iiIiIiiiiIiii iiIiIiiiiIiii2 = new iiIiIiiiiIiii(IiiiiiiiIIIII, this.iIiiIiiiiiiII, lvl, this.IiiiiiiiIIIII);
            iiIiIiiiiIiii2.ALLATORIxDEMO(this.iiIiiiiiiiIii);
            return iiIiIiiiiIiii2;
        }
        this.IIiiIiiiIIiIi = skin;
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            this.IiIIIiiiiIiiI = null;
            return this;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int iIiIiiiiIIiIi() {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiIiiiiiiiIii == null) return -1;
            return this.iiIiiiiiiiIii.iIiIiiiiIIiIi();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI == null) return -1;
            return this.IiIIIiiiiIiiI.IiiIiiiiiiIiI();
        }
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(String rSkin) {
        if (this.ALLATORIxDEMO(rSkin)) {
            return this.iiIiiiiiiiIii;
        }
        if (this.iiIiiiiiiiIii == null) return this;
        this.iiIiiiiiiiIii = this.iiIiiiiiiiIii.ALLATORIxDEMO(rSkin);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void ALLATORIxDEMO() {
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            this.IiIIIiiiiIiiI = this.iIiiIiiiiiiII == -2 ? iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)this.IIiiIiiiIIiIi)) : (this.iIiiIiiiiiiII == -1 ? iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.ALLATORIxDEMO((String)this.IIiiIiiiIIiIi)) : (this.ALLATORIxDEMO != null ? iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.ALLATORIxDEMO((String)this.IIiiIiiiIIiIi, (int)2, (long)this.IiiiiiiiIIIII)) : iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.ALLATORIxDEMO((String)this.IIiiIiiiIIiIi, (int)this.iIiiIiiiiiiII, (long)this.IiiiiiiiIIIII))));
            return;
        }
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi newPart) {
        if (newPart == null) {
            return this;
        }
        if (newPart.ALLATORIxDEMO() < this.iIiIiiiiIiIii) {
            newPart.ALLATORIxDEMO((IiiiIiiiiIiIi)this);
            return newPart;
        }
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = newPart;
            return this;
        }
        this.iiIiiiiiiiIii = this.iiIiiiiiiiIii.ALLATORIxDEMO(newPart);
        return this;
    }

    public int iiiIiiiiiiIIi() {
        if (this.iIiIiiiiIiIii == 1) return this.iIiiIiiiiiiII;
        if (this.iiIiiiiiiiIii == null) return this.iIiiIiiiiiiII;
        return this.iiIiiiiiiiIii.iiiIiiiiiiIIi();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(int Act) {
        if (this.iIiiIiiiiiiII > 0 && this.iIiiIiiiiiiII != Act) {
            this.iIiiIiiiiiiII = Act;
            IIiIiiiiIiIII iIiIiiiiIiIII = this;
            synchronized (iIiIiiiiIiIII) {
                this.IiIIIiiiiIiiI = null;
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO(Act);
    }

    public int ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiIi(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (this.ALLATORIxDEMO != null) {
            this.ALLATORIxDEMO.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.ALLATORIxDEMO();
        }
        IIiIiiiiIiIII iIiIiiiiIiIII = this;
        synchronized (iIiIiiiiIiIII) {
            if (this.IiIIIiiiiIiiI != null) {
                this.IiIIIiiiiIiiI.ALLATORIxDEMO(time, dir);
                this.IiIIIiiiiIiiI.iIiIiiiiIIiii(g, x, y, alpha);
            }
        }
        if (this.iiIiiiiiiiIii == null) return;
        this.iiIiiiiiiiIii.iIiIiiiiIIiIi(g, x, y, dir, time, alpha);
    }
}
