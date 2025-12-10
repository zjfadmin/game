/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.iiIiIiiiiiIIi
 */
package com.xy.w;

import com.xy.w.iiIiIiiiiiIIi;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIIiiiIiiIi {
    private long iiiIiiiiiiiIi;
    private static final long iIiiIiiiiiiII = 1L;
    private iiIiIiiiiiIIi IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private long iiIiiiiiiiIii;
    private Object IiiiiiiiIIIII = new Object();
    private Vector<iiIiIiiiiiIIi> ALLATORIxDEMO;

    public void ALLATORIxDEMO(Vector<iiIiIiiiiiIIi> frames) {
        this.ALLATORIxDEMO = frames;
    }

    public iiIiIiiiiiIIi ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public Object ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public int IiiIiiiiiiIiI() {
        return this.iIiIiiiiIiIii;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void iIiIiiiiIIiii() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = this;
            this.iiIiiiiiiiIii = 0L;
            this.iIiIiiiiIiIii = 0;
            iiIiIiiiiiIIi iiIiIiiiiiIIi2 = this.ALLATORIxDEMO.size() > 0 ? this.ALLATORIxDEMO.get(0) : null;
            {
                iIIIIiiiIiiIi2.IIiiIiiiIIiIi = iiIiIiiiiiIIi2;
                return;
            }
        }
    }

    public iIIIIiiiIiiIi() {
        this.ALLATORIxDEMO = new Vector();
    }

    public void iIiIiiiiIIiii(iiIiIiiiiiIIi currFrame) {
        this.IIiiIiiiIIiIi = currFrame;
    }

    public iIIIIiiiIiiIi(Vector<iiIiIiiiiiIIi> frames) {
        this.ALLATORIxDEMO = frames;
        this.IIiiIiiiIIiIi = frames.get(0);
        this.IiIIIiiiiIiiI = frames.size();
        this.iiiIiiiiiiiIi = 100 * this.IiIIIiiiiIiiI;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(BufferedImage image, int centerX, int centerY) {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            this.iiiIiiiiiiiIi += 100L;
            iiIiIiiiiiIIi IiiiiiiiIIIII = new iiIiIiiiiiIIi(image, centerX, centerY);
            this.ALLATORIxDEMO.add(IiiiiiiiIIIII);
            ++this.IiIIIiiiiIiiI;
            this.IIiiIiiiIIiIi = IiiiiiiiIIIII;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public int iIiIiiiiIIiIi() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            int n = this.IIiiIiiiIIiIi == null ? 0 : this.IIiiIiiiIIiIi.iIiIiiiiIIiii();
            return n;
        }
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        return this.IIiiIiiiIIiIi.ALLATORIxDEMO(x, y);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public int iiiIiiiiiiIIi() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            int n = this.IIiiIiiiIIiIi == null ? 0 : this.IIiiIiiiIIiIi.iiiIiiiiiiIIi();
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(iiIiIiiiiiIIi frame) {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            this.iiiIiiiiiiiIi += 100L;
            this.ALLATORIxDEMO.add(frame);
            ++this.IiIIIiiiiIiiI;
            this.IIiiIiiiIIiIi = frame;
            return;
        }
    }

    public iIIIIiiiIiiIi ALLATORIxDEMO() {
        return new iIIIIiiiIiiIi(this);
    }

    public void ALLATORIxDEMO() {
        Iterator<iiIiIiiiiiIIi> iterator = this.ALLATORIxDEMO.iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO();
        }
        this.ALLATORIxDEMO.clear();
    }

    public void iIiIiiiiIIiIi(long animTime) {
        this.iiIiiiiiiiIii = animTime;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public int iIiIiiiiIIiii() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            int n = this.IIiiIiiiIIiIi == null ? 0 : this.IIiiIiiiIIiIi.ALLATORIxDEMO();
            return n;
        }
    }

    public void ALLATORIxDEMO(Object uPDATE_LOCK) {
        this.IiiiiiiiIIIII = uPDATE_LOCK;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public Image ALLATORIxDEMO() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            Image image = this.IIiiIiiiIIiIi == null ? null : this.IIiiIiiiIIiIi.ALLATORIxDEMO();
            return image;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void iiiIiiiiiiIIi(long playTime) {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            if (this.IiIIIiiiiIiiI > 1) {
                this.iiIiiiiiiiIii = playTime;
                this.iIiIiiiiIiIii = (int)(this.iiIiiiiiiiIii / 100L);
                this.iIiIiiiiIiIii %= this.IiIIIiiiiIiiI;
                this.IIiiIiiiIIiIi = this.ALLATORIxDEMO.get(this.iIiIiiiiIiIii);
            } else if (this.IiIIIiiiiIiiI > 0) {
                this.IIiiIiiiIIiIi = this.ALLATORIxDEMO.get(0);
            }
            this.IiiiiiiiIIIII.notifyAll();
            return;
        }
    }

    public long iiiIiiiiiiIIi() {
        return this.iiiIiiiiiiiIi;
    }

    public Vector<iiIiIiiiiiIIi> ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public int ALLATORIxDEMO() {
        Object object = this.IiiiiiiiIIIII;
        synchronized (object) {
            int n = this.IIiiIiiiIIiIi == null ? 0 : this.IIiiIiiiIIiIi.IiiIiiiiiiIiI();
            return n;
        }
    }

    public iIIIIiiiIiiIi(iIIIIiiiIiiIi anim) {
        this.iiiIiiiiiiiIi = anim.iiiIiiiiiiiIi;
        this.ALLATORIxDEMO = anim.ALLATORIxDEMO;
        this.IIiiIiiiIIiIi = anim.IIiiIiiiIIiIi;
        this.IiIIIiiiiIiiI = ((Vector)anim.ALLATORIxDEMO()).size();
    }

    public static long iIiIiiiiIIiii() {
        return 1L;
    }

    public void iIiIiiiiIIiii(long elapsedTime) {
        this.iiIiiiiiiiIii += elapsedTime;
        this.iiiIiiiiiiIIi(this.iiIiiiiiiiIii);
    }

    public void ALLATORIxDEMO(int index) {
        this.iIiIiiiiIiIii = index;
        this.IIiiIiiiIIiIi = this.ALLATORIxDEMO.get(index);
    }

    public long ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(long totalDuration) {
        this.iiiIiiiiiiiIi = totalDuration;
    }
}
