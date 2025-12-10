/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiIII
 *  com.xy.w.IiIIIiiiiiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiIIiiiiIiiII
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiIII;
import com.xy.w.IiIIIiiiiiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiIIiiiiIiiII;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiii
implements IiiiIiiiiIiIi {
    private int iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private IIIIIiiiIiIii[] IIiiIiiiIIiIi;
    private long iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private long[] iiIiiiiiiiIii;
    private IiiiIiiiiIiIi IiiiiiiiIIIII;
    private long ALLATORIxDEMO;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, long time) {
        var7_6 = this;
        synchronized (var7_6) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            if (this.IiiiiiiiIIIII == null) ** GOTO lbl-1000
            this.IiiiiiiiIIIII.iiiIiiiiiiIIi(g, x, y, dir, time, 1.0f);
            ** GOTO lbl12
lbl-1000:
            // 1 sources

            {
                iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
lbl12:
                // 2 sources

                IiiiiiiiIIIII = 0;
                ** while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length)
            }
lbl-1000:
            // 1 sources

            {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, dir);
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(g, x, y);
                }
                ++IiiiiiiiIIIII;
                continue;
            }
        }
lbl21:
        // 1 sources

        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, dir, time);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl17
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, dir);
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(g, x, y);
                }
                ++IiiiiiiiIIIII;
lbl17:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public int IiiIiiiiiiIiI() {
        if (this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return 2;
            return this.IiIIIiiiiIiiI.IiiIiiiiiiIiI();
        }
        var1_1 = this;
        synchronized (var1_1) {
            if (this.IIiiIiiiIIiIi == null) return 2;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    return this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO();
                }
                ++IiiiiiiiIIIII;
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
        }
        return 2;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(String skin) {
        if (this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(skin);
            return;
        }
        if (skin == null) {
            this.IiiiiiiiIIIII = null;
            return;
        }
        this.IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO((String)skin, (int)2, (int)1, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public int iIiIiiiiIIiIi() {
        if (this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return -1;
            return this.IiIIIiiiiIiiI.iIiIiiiiIIiIi();
        }
        var1_1 = this;
        synchronized (var1_1) {
            if (this.IIiiIiiiIIiIi == null) return -1;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl17
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null && this.IIiiIiiiIIiIi[IiiiiiiiIIIII].IiiIiiiiiiIiI() > IiiiiiiiIIIII) {
                    IiiiiiiiIIIII = this.IIiiIiiiIIiIi[IiiiiiiiIIIII].IiiIiiiiiiIiI();
                }
                ++IiiiiiiiIIIII;
lbl17:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
            return IiiiiiiiIIIII;
        }
    }

    public int ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, String skin) {
        long IiiiiiiiIIIII;
        if (this.iiiIiiiiiiiIi != lvl) {
            if (this.IiIIIiiiiIiiI == null) return this;
            return this.IiIIIiiiiIiiI.ALLATORIxDEMO(lvl, skin);
        }
        if (IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)skin) && iiiiiiiiiiIiI.ALLATORIxDEMO((long)(IiiiiiiiIIIII = Long.parseLong(skin)), (int)-1) != null) {
            if (this.ALLATORIxDEMO == IiiiiiiiIIIII) {
                return this;
            }
            iiIiIiiiiIiii iiIiIiiiiIiii2 = this;
            synchronized (iiIiIiiiiIiii2) {
                this.ALLATORIxDEMO = IiiiiiiiIIIII;
                this.iiiIiiiiiiIIi();
                return this;
            }
        }
        IIiIiiiiIiIII IiiiiiiiIIIII2 = new IIiIiiiiIiIII(skin, this.iIiiIiiiiiiII, lvl, this.iIiIiiiiIiIii);
        IiiiiiiiIIIII2.ALLATORIxDEMO(this.IiIIIiiiiIiiI);
        return IiiiiiiiIIIII2;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, long skin, IiIIIiiiiiiIi[] ones) {
        if (this.iiiIiiiiiiiIi == lvl) {
            iiIIiiiiIiiII iiIIiiiiIiiII2 = new iiIIiiiiIiiII(skin, ones, this.iIiiIiiiiiiII, lvl, this.iIiIiiiiIiIii);
            iiIIiiiiIiiII2.ALLATORIxDEMO(this.IiIIIiiiiIiiI);
            return iiIIiiiiIiiII2;
        }
        if (this.IiIIIiiiiIiiI == null) return this;
        return this.IiIIIiiiiIiiI.ALLATORIxDEMO(lvl, skin, ones);
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi newPart) {
        if (newPart == null) {
            return this;
        }
        if (newPart.ALLATORIxDEMO() < this.iiiIiiiiiiiIi) {
            newPart.ALLATORIxDEMO((IiiiIiiiiIiIi)this);
            return newPart;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.IiIIIiiiiIiiI = newPart;
            return this;
        }
        this.IiIIIiiiiIiiI = this.IiIIIiiiiIiiI.ALLATORIxDEMO(newPart);
        return this;
    }

    public IiiiIiiiiIiIi iIiIiiiiIIiii() {
        iiIiIiiiiIiii IiiiiiiiIIIII = new iiIiIiiiiIiii(this.ALLATORIxDEMO, this.iIiiIiiiiiiII, this.iiiIiiiiiiiIi, this.iIiIiiiiIiIii);
        if (this.IiIIIiiiiIiiI == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(this.IiIIIiiiiIiiI.iIiIiiiiIIiii());
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.IiiiiiiiIIIII == null) ** GOTO lbl-1000
            this.IiiiiiiiIIIII.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
            ** GOTO lbl10
lbl-1000:
            // 1 sources

            {
                iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
lbl10:
                // 2 sources

                if (this.IIiiIiiiIIiIi == null) {
                    this.iiiIiiiiiiIIi();
                }
                IiiiiiiiIIIII = 0;
                ** while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length)
            }
lbl-1000:
            // 1 sources

            {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, dir);
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(g, x, y, alpha);
                }
                ++IiiiiiiiIIIII;
                continue;
            }
        }
lbl21:
        // 1 sources

        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.IiiIiiiiiiIiI(g, x, y, dir, time, alpha);
    }

    public void iiiIiiiiiiIIi() {
        this.iiIiiiiiiiIii = iiiiiiiiiiIiI.ALLATORIxDEMO((long)this.ALLATORIxDEMO, (int)(this.IiiiiiiiIIIII != null ? 2 : this.iIiiIiiiiiiII));
        if (this.IIiiIiiiIIiIi == null || this.IIiiIiiiIIiIi.length != this.iiIiiiiiiiIii.length) {
            this.IIiiIiiiIIiIi = new IIIIIiiiIiIii[this.iiIiiiiiiiIii.length];
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII++] = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, float alpha) {
        if (this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return;
            this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, dir, alpha);
            return;
        }
        var6_6 = this;
        synchronized (var6_6) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl22
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO((long)(this.IIiiIiiiIIiIi[IiiiiiiiIIIII].IIIiiiiiiIIiI() - 1), iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO()));
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(g, x, y, alpha);
                }
                ++IiiiiiiiIIIII;
lbl22:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
            return;
        }
    }

    public void iIiIiiiiIIiii(int i) {
        this.IIiiIiiiIIiIi[i] = iiiiiiiiiiIiI.iIiIiiiiIIiii((long)(this.iIiIiiiiIiIii << 40 | this.iiIiiiiiiiIii[i]), (int)this.iIiiIiiiiiiII);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii() {
        block5: {
            var1_1 = this;
            synchronized (var1_1) {
                if (this.IIiiIiiiIIiIi == null) break block5;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl11
                do {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII++] = null;
lbl11:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
            }
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.IiiiiiiiIIIII == null) ** GOTO lbl-1000
            this.IiiiiiiiIIIII.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
            ** GOTO lbl10
lbl-1000:
            // 1 sources

            {
                iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
lbl10:
                // 2 sources

                if (this.IIiiIiiiIIiIi == null) {
                    this.iiiIiiiiiiIIi();
                }
                IiiiiiiiIIIII = 0;
                ** while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length)
            }
lbl-1000:
            // 1 sources

            {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, dir);
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii(g, x, y, alpha);
                }
                ++IiiiiiiiIIIII;
                continue;
            }
        }
lbl21:
        // 1 sources

        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.iIiIiiiiIIiIi(g, x, y, dir, time, alpha);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl18
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO()));
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].iIiIiiiiIIiii(g, x, y, alpha);
                }
                ++IiiiiiiiIIIII;
lbl18:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(int Act) {
        if (this.iIiiIiiiiiiII != Act) {
            this.iIiiIiiiiiiII = Act;
            iiIiIiiiiIiii iiIiIiiiiIiii2 = this;
            synchronized (iiIiIiiiiIiii2) {
                this.iiiIiiiiiiIIi();
            }
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(Act);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int iIiIiiiiIIiii() {
        if (this.iiiIiiiiiiiIi != 1 && this.IiIIIiiiiIiiI != null) {
            return this.IiIIIiiiiIiiI.iIiIiiiiIIiii();
        }
        iiIiIiiiiIiii iiIiIiiiiIiii2 = this;
        synchronized (iiIiIiiiiIiii2) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            if (this.IIiiIiiiIIiIi.length > 1) {
                if (this.IIiiIiiiIIiIi[1] != null) {
                    return this.IIiiIiiiIIiIi[1].IIIiiiiiiIIiI();
                }
                this.iIiIiiiiIIiii(1);
            } else {
                if (this.IIiiIiiiIIiIi.length != 1) return 1200;
                if (this.IIiiIiiiIIiIi[0] != null) {
                    return this.IIiiIiiiIIiIi[0].IIIiiiiiiIIiI();
                }
                this.iIiIiiiiIIiii(0);
            }
        }
        return 1200;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        return string.equals(String.valueOf(this.ALLATORIxDEMO));
    }

    public int iiiIiiiiiiIIi() {
        if (this.iiiIiiiiiiiIi == 1) return this.iIiiIiiiiiiII;
        if (this.IiIIIiiiiIiiI == null) return this.iIiiIiiiiiiII;
        return this.IiIIIiiiiIiiI.iiiIiiiiiiIIi();
    }

    public iiIiIiiiiIiii(long skin, int act, int lvl, long colorId) {
        this.ALLATORIxDEMO = skin;
        this.iIiiIiiiiiiII = act;
        this.iiiIiiiiiiiIi = lvl;
        this.iIiIiiiiIiIii = colorId;
    }

    public void ALLATORIxDEMO() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (time == -1L && this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return;
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
            return;
        }
        var8_7 = this;
        synchronized (var8_7) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(g, x, y);
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl22
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] == null) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII);
                }
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(time, iiiiiiiiiiIiI.ALLATORIxDEMO((int)dir, (int)this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO()));
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(g, x, y, alpha);
                }
                ++IiiiiiiiIIIII;
lbl22:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
        }
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, x, y, dir, time, alpha);
    }

    public void ALLATORIxDEMO(IiiiIiiiiIiIi part) {
        this.IiIIIiiiiIiiI = part;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(int x, int y) {
        if (this.iiiIiiiiiiiIi != 1) {
            if (this.IiIIIiiiiIiiI == null) return false;
            return this.IiIIIiiiiIiiI.ALLATORIxDEMO(x, y);
        }
        var3_3 = this;
        synchronized (var3_3) {
            if (this.IIiiIiiiIIiIi == null) return false;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
            do {
                if (this.IIiiIiiiIIiIi[IiiiiiiiIIIII] != null && (IiiiiiiiIIIII = this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(x, y))) {
                    return IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
        }
        return false;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(String rSkin) {
        if (this.ALLATORIxDEMO(rSkin)) {
            return this.IiIIIiiiiIiiI;
        }
        if (this.IiIIIiiiiIiiI == null) return this;
        this.IiIIIiiiiIiiI = this.IiIIIiiiiIiiI.ALLATORIxDEMO(rSkin);
        return this;
    }
}
