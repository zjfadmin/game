/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiIII
 *  com.xy.w.IiIIIiiiiiiIi
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiIiIiiiiIiii
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiIII;
import com.xy.w.IiIIIiiiiiiIi;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiIiIiiiiIiii;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiiiiIiiII
implements IiiiIiiiiIiIi {
    private IiiiIiiiiIiIi iiiiIiiiIiiII;
    private IiiiIiiiiIiIi iiiIiiiiiiiIi;
    private long iIiiIiiiiiiII;
    private IIIIIiiiIiIii[] IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private long IiIIIiiiiIiiI;
    private long[] iiIiiiiiiiIii;
    private IiIIIiiiiiiIi[] IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

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
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.iIiIiiiiIIiii();
    }

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
            if (this.iiiIiiiiiiiIi == null) ** GOTO lbl-1000
            this.iiiIiiiiiiiIi.iiiIiiiiiiIIi(g, x, y, dir, time, 1.0f);
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

        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(g, x, y, dir, time);
    }

    public void ALLATORIxDEMO(IiiiIiiiiIiIi part) {
        this.iiiiIiiiIiiII = part;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, long skin, IiIIIiiiiiiIi[] ones) {
        if (this.iIiIiiiiIiIii != lvl) {
            if (this.iiiiIiiiIiiII == null) return this;
            return this.iiiiIiiiIiiII.ALLATORIxDEMO(lvl, skin, ones);
        }
        if (this.iIiiIiiiiiiII == skin) {
            return this;
        }
        iiIIiiiiIiiII iiIIiiiiIiiII2 = this;
        synchronized (iiIIiiiiIiiII2) {
            this.iIiiIiiiiiiII = skin;
            this.IiiiiiiiIIIII = ones;
            this.iiiIiiiiiiIIi();
            return this;
        }
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        block6: {
            block7: {
                this.iiIiiiiiiiIii = this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
                if (this.iiiIiiiiiiiIi == null) break block7;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl13
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl20
            do {
                if (this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO() == 2) {
                    this.iiIiiiiiiiIii = this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO();
                    break block6;
                }
                ++IiiiiiiiIIIII;
lbl13:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length);
            break block6;
            do {
                if (this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO() == this.ALLATORIxDEMO) {
                    this.iiIiiiiiiiIii = this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO();
                    break;
                }
                ++IiiiiiiiIIIII;
lbl20:
                // 2 sources

            } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length);
        }
        if (this.IIiiIiiiIIiIi == null || this.IIiiIiiiIIiIi.length != this.iiIiiiiiiiIii.length) {
            this.IIiiIiiiIIiIi = new IIIIIiiiIiIii[this.iiIiiiiiiiIii.length];
            return;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII++] = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, float alpha) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return;
            this.iiiiIiiiIiiII.ALLATORIxDEMO(g, x, y, dir, alpha);
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

    public void ALLATORIxDEMO() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.iiiIiiiiiiiIi == null) ** GOTO lbl-1000
            this.iiiIiiiiiiiIi.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
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

        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.IiiIiiiiiiIiI(g, x, y, dir, time, alpha);
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(String rSkin) {
        if (this.ALLATORIxDEMO(rSkin)) {
            return this.iiiiIiiiIiiII;
        }
        if (this.iiiiIiiiIiiII == null) return this;
        this.iiiiIiiiIiiII = this.iiiiIiiiIiiII.ALLATORIxDEMO(rSkin);
        return this;
    }

    public int iiiIiiiiiiIIi() {
        if (this.iIiIiiiiIiIii == 1) return this.ALLATORIxDEMO;
        if (this.iiiiIiiiIiiII == null) return this.ALLATORIxDEMO;
        return this.iiiiIiiiIiiII.iiiIiiiiiiIIi();
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi newPart) {
        if (newPart == null) {
            return this;
        }
        if (newPart.ALLATORIxDEMO() < this.iIiIiiiiIiIii) {
            newPart.ALLATORIxDEMO((IiiiIiiiiIiIi)this);
            return newPart;
        }
        if (this.iiiiIiiiIiiII == null) {
            this.iiiiIiiiIiiII = newPart;
            return this;
        }
        this.iiiiIiiiIiiII = this.iiiiIiiiIiiII.ALLATORIxDEMO(newPart);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI(Graphics g, int x, int y, int dir, long time, float alpha) {
        var8_7 = this;
        synchronized (var8_7) {
            if (this.iiiIiiiiiiiIi == null) ** GOTO lbl-1000
            this.iiiIiiiiiiiIi.iiiIiiiiiiIIi(g, x, y, dir, time, alpha);
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

        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.IiiIiiiiiiIiI(g, x, y, dir, time, alpha);
    }

    public void iIiIiiiiIIiii(int i) {
        this.IIiiIiiiIIiIi[i] = iiiiiiiiiiIiI.ALLATORIxDEMO((long)(this.IiIIIiiiiIiiI << 40 | this.iiIiiiiiiiIii[i]), (int)this.ALLATORIxDEMO);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public int iIiIiiiiIIiIi() {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return -1;
            return this.iiiiIiiiIiiII.iIiIiiiiIIiIi();
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
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
    }

    public IiiiIiiiiIiIi iIiIiiiiIIiii() {
        iiIIiiiiIiiII IiiiiiiiIIIII = new iiIIiiiiIiiII(this.iIiiIiiiiiiII, this.IiiiiiiiIIIII, this.ALLATORIxDEMO, this.iIiIiiiiIiIii, this.IiIIIiiiiIiiI);
        if (this.iiiiIiiiIiiII == null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII.ALLATORIxDEMO(this.iiiiIiiiIiiII.iIiIiiiiIIiii());
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(int x, int y) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return false;
            return this.iiiiIiiiIiiII.ALLATORIxDEMO(x, y);
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(int Act) {
        if (this.ALLATORIxDEMO != Act) {
            this.ALLATORIxDEMO = Act;
            iiIIiiiiIiiII iiIIiiiiIiiII2 = this;
            synchronized (iiIIiiiiIiiII2) {
                this.iiiIiiiiiiIIi();
            }
        }
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(Act);
    }

    public iiIIiiiiIiiII(long skin, IiIIIiiiiiiIi[] ones, int act, int lvl, long colorId) {
        this.iIiiIiiiiiiII = skin;
        this.IiiiiiiiIIIII = ones;
        this.iiIiiiiiiiIii = ones[0].ALLATORIxDEMO();
        this.ALLATORIxDEMO = act;
        this.iIiIiiiiIiIii = lvl;
        this.IiIIIiiiiIiiI = colorId;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Graphics g, int x, int y, int dir, long time, float alpha) {
        if (time == -1L && this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return;
            this.iiiiIiiiIiiII.iIiIiiiiIIiii(g, x, y, dir, time, alpha);
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
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(g, x, y, dir, time, alpha);
    }

    public int ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int iIiIiiiiIIiii() {
        if (this.iIiIiiiiIiIii != 1 && this.iiiiIiiiIiiII != null) {
            return this.iiiiIiiiIiiII.iIiIiiiiIIiii();
        }
        iiIIiiiiIiiII iiIIiiiiIiiII2 = this;
        synchronized (iiIIiiiiIiiII2) {
            if (this.IIiiIiiiIIiIi == null) {
                this.iiiIiiiiiiIIi();
            }
            if (this.IIiiIiiiIIiIi.length > 1) {
                if (this.IIiiIiiiIIiIi[1] != null) {
                    return this.IIiiIiiiIIiIi[1].IIIiiiiiiIIiI();
                }
                this.iIiIiiiiIIiii(1);
            } else {
                if (this.IIiiIiiiIIiIi[0] != null) {
                    return this.IIiiIiiiIIiIi[0].IIIiiiiiiIIiI();
                }
                this.iIiIiiiiIIiii(0);
            }
        }
        return 1200;
    }

    public void ALLATORIxDEMO(String skin) {
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return;
            this.iiiiIiiiIiiII.ALLATORIxDEMO(skin);
            return;
        }
        if (skin == null) {
            this.iiiIiiiiiiiIi = null;
            return;
        }
        this.iiiIiiiiiiiIi = iiiiiiiiiiIiI.ALLATORIxDEMO((String)skin, (int)2, (int)1, null);
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
        if (this.iIiIiiiiIiIii != 1) {
            if (this.iiiiIiiiIiiII == null) return 2;
            return this.iiiiIiiiIiiII.IiiIiiiiiiIiI();
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

    public IiiiIiiiiIiIi ALLATORIxDEMO(int lvl, String skin) {
        long IiiiiiiiIIIII;
        if (this.iIiIiiiiIiIii != lvl) {
            if (this.iiiiIiiiIiiII == null) return this;
            return this.iiiiIiiiIiiII.ALLATORIxDEMO(lvl, skin);
        }
        IIiIiiiiIiIII IiiiiiiiIIIII2 = null;
        if (IIiiIiiiiIIiI.iiiIiiiiiiIIi((String)skin) && iiiiiiiiiiIiI.ALLATORIxDEMO((long)(IiiiiiiiIIIII = Long.parseLong(skin)), (int)-1) != null) {
            IiiiiiiiIIIII2 = new iiIiIiiiiIiii(IiiiiiiiIIIII, this.ALLATORIxDEMO, lvl, this.IiIIIiiiiIiiI);
        }
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII2 = new IIiIiiiiIiIII(skin, this.ALLATORIxDEMO, lvl, this.IiIIIiiiiIiiI);
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(this.iiiiIiiiIiiII);
        return IiiiiiiiIIIII2;
    }

    private /* synthetic */ boolean ALLATORIxDEMO(String string) {
        return string.equals(String.valueOf(this.iIiiIiiiiiiII));
    }
}
