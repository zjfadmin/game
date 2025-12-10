/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.IIiiIiiiiIIiI
 *  com.xy.w.iiIiIiiiiiIIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.w.IIiiIiiiiIIiI;
import com.xy.w.iiIiIiiiiiIIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiIii {
    private static AffineTransform IIIiiiiiIIiII = new AffineTransform();
    private int iiIiiiiiiIIiI;
    public static AlphaComposite iIiiIiiiIiIIi;
    private int iiiiIiiiIIiii;
    private iiIiIiiiiiIIi[] iIIiIiiiiiiIi;
    private IIiiIiiiiIIiI IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private short IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi = 0;
    private int iiiiIiiiIiiII = -1;
    public static AlphaComposite iiiIiiiiiiiIi;
    public static AlphaComposite iIiiIiiiiiiII;
    private iiIiIiiiiiIIi IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    public static Map<Float, AlphaComposite> iiIiiiiiiiIii;
    private short IiiiiiiiIIIII;
    public static AlphaComposite ALLATORIxDEMO;

    static {
        iiiIiiiiiiiIi = AlphaComposite.getInstance(3, 0.4f);
        ALLATORIxDEMO = AlphaComposite.getInstance(3, 0.5f);
        iIiiIiiiiiiII = AlphaComposite.getInstance(3, 0.6f);
        iIiiIiiiIiIIi = AlphaComposite.getInstance(3, 1.0f);
        iiIiiiiiiiIii = new HashMap<Float, AlphaComposite>();
        iiIiiiiiiiIii.put(Float.valueOf(0.4f), iiiIiiiiiiiIi);
        iiIiiiiiiiIii.put(Float.valueOf(0.5f), ALLATORIxDEMO);
        iiIiiiiiiiIii.put(Float.valueOf(0.6f), iIiiIiiiiiiII);
        iiIiiiiiiiIii.put(Float.valueOf(1.0f), iIiiIiiiIiIIi);
    }

    public int IIIiiiiiiIIiI() {
        return this.iiIIIiiiiiiiI * 100;
    }

    public iiIiIiiiiiIIi[] ALLATORIxDEMO() {
        return this.iIIiIiiiiiiIi;
    }

    public iiIiIiiiiiIIi ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public short iIiIiiiiIIiii() {
        return this.IiIiiiiiIIIII;
    }

    public static AlphaComposite ALLATORIxDEMO(float alpha) {
        AlphaComposite IiiiiiiiIIIII = iiIiiiiiiiIii.get(Float.valueOf(alpha));
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = AlphaComposite.getInstance(3, alpha);
        iiIiiiiiiiIii.put(Float.valueOf(alpha), IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(short width) {
        this.IiiiiiiiIIIII = width;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void iIiIiiiiIIiii(Graphics g, int x, int y, float alpha) {
        Composite IiiiiiiiIIIII;
        Graphics2D IiiiiiiiIIIII2;
        block4: {
            AlphaComposite alphaComposite;
            Graphics2D graphics2D;
            if (alpha == 1.0f) {
                this.iIiIiiiiIIiii(g, x, y);
                return;
            }
            IiiiiiiiIIIII2 = (Graphics2D)g;
            IiiiiiiiIIIII = null;
            try {
                graphics2D = IiiiiiiiIIIII2;
                IiiiiiiiIIIII = IiiiiiiiIIIII2.getComposite();
                alphaComposite = alpha == 0.6f ? iIiiIiiiiiiII : AlphaComposite.getInstance(3, alpha);
            }
            catch (Exception IiiiiiiiIIIII3) {
                IiiiiiiiIIIII3.printStackTrace();
                break block4;
            }
            {
                graphics2D.setComposite(alphaComposite);
                this.iIiIiiiiIIiii(IiiiiiiiIIIII2, x, y);
            }
        }
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII2.setComposite(IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiii(Graphics g, int x, int y) {
        if (this.IIiiIiiiIIiIi.ALLATORIxDEMO() == null) return;
        if (this.IIiiIiiiIIiIi.iIiIiiiiIIiIi() == 0) {
            iiiiiiiiiiIiI.ALLATORIxDEMO((Graphics2D)((Graphics2D)g), (int)(x -= this.IIiiIiiiIIiIi.iiiIiiiiiiIIi()), (int)(y -= this.IIiiIiiiIIiIi.iIiIiiiiIIiii()), null, (BufferedImage)((BufferedImage)this.IIiiIiiiIIiIi.ALLATORIxDEMO()));
            return;
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IIIiiiiiIIiII.setToIdentity();
        IIIiiiiiIIiII.scale(-1.0, 1.0);
        IIIiiiiiIIiII.translate(-(x += this.IIiiIiiiIIiIi.iiiIiiiiiiIIi()), y -= this.IIiiIiiiIIiIi.iIiIiiiiIIiii());
        iiiiiiiiiiIiI.ALLATORIxDEMO((Graphics2D)IiiiiiiiIIIII, (int)x, (int)y, (AffineTransform)IIIiiiiiIIiII, (BufferedImage)((BufferedImage)this.IIiiIiiiIIiIi.ALLATORIxDEMO()));
    }

    public iiIiIiiiiiIIi ALLATORIxDEMO(int dir) {
        return this.iIIiIiiiiiiIi[dir * this.iiIIIiiiiiiiI];
    }

    public void ALLATORIxDEMO(long playTime, int dir) {
        try {
            if (playTime < 0L) {
                playTime %= (long)this.IIIiiiiiiIIiI();
                playTime += (long)this.IIIiiiiiiIIiI();
            }
            this.iiIiIiiiiIIIi = 1;
            playTime /= 100L;
            this.IIiiIiiiIIiIi = this.iIIiIiiiiiiIi[(int)((long)((dir %= this.iIiIiiiiIiIii) * this.iiIIIiiiiiiiI) + (playTime %= (long)this.iiIIIiiiiiiiI))];
            if (this.iiiiIiiiIiiII != -1) return;
            if (this.IIiiIiiiIIiIi.ALLATORIxDEMO() != null) return;
            this.iiiiIiiiIiiII = dir;
            iiiiiiiiiiIiI.ALLATORIxDEMO((Object)this);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public void ALLATORIxDEMO(Graphics g, int x, int y, float alpha) {
        if (alpha == 1.0f) {
            this.ALLATORIxDEMO(g, x, y);
            return;
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        Composite IiiiiiiiIIIII2 = null;
        try {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getComposite();
            IiiiiiiiIIIII.setComposite(IIIIIiiiIiIii.ALLATORIxDEMO(alpha));
            this.ALLATORIxDEMO(IiiiiiiiIIIII, x, y);
        }
        catch (Exception IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
        }
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII.setComposite(IiiiiiiiIIIII2);
    }

    public static int ALLATORIxDEMO(int dir, int id) {
        if (dir == 4) {
            if (id != 1) return 0;
            return 1;
        }
        if (dir == 0) {
            if (id != 1) return 7;
            return 4;
        }
        if (dir == 7) {
            if (id != 1) return 3;
            return 0;
        }
        if (dir == 3) {
            if (id != 1) return 6;
            return 7;
        }
        if (dir == 6) {
            if (id != 1) return 2;
            return 3;
        }
        if (dir == 2) {
            if (id != 1) return 5;
            return 6;
        }
        if (dir == 5) {
            if (id != 1) return 1;
            return 2;
        }
        if (id != 1) return 4;
        return 5;
    }

    public int IIIIIiiiiIIii() {
        return this.iiIiIiiiiIIIi;
    }

    public int iiiiiiiiIIiii() {
        return this.iiiiIiiiIiiII;
    }

    public int IiiIiiiiiiIiI() {
        return this.iiiiIiiiIIiii;
    }

    public void iIiIiiiiIIiii(int load) {
        this.iiiiIiiiIiiII = load;
    }

    public short ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public int iIiIiiiiIIiIi() {
        return this.iiIiiiiiiIIiI;
    }

    public IIIIIiiiIiIii(iiIiIiiiiiIIi[] frames, int animCount, int frameCount, IIiiIiiiiIIiI head, int refPixelX, int refPixelY, short width, short height) {
        this.iIIiIiiiiiiIi = frames;
        this.IIiiIiiiIIiIi = frames[0];
        this.iIiIiiiiIiIii = animCount;
        this.iiIIIiiiiiiiI = frameCount;
        this.IIIIiiiiiiiII = head;
        this.iiIiiiiiiIIiI = refPixelX;
        this.IiIIIiiiiIiiI = refPixelY;
        this.IiiiiiiiIIIII = width;
        this.IiIiiiiiIIIII = height;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public boolean ALLATORIxDEMO(int x, int y) {
        try {
            if (this.IIiiIiiiIIiIi.ALLATORIxDEMO() == null) {
                return false;
            }
            Image IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO();
            x = this.IIiiIiiiIIiIi.iIiIiiiiIIiIi() != 0 ? this.IIiiIiiiIIiIi.iiiIiiiiiiIIi() - x : (x += this.IIiiIiiiIIiIi.iiiIiiiiiiIIi());
            if (x < 0) return false;
            if (x >= IiiiiiiiIIIII.getWidth(null)) return false;
            if ((y += this.IIiiIiiiIIiIi.iIiIiiiiIIiii()) < 0) return false;
            if (y >= IiiiiiiiIIIII.getHeight(null)) return false;
            if (!(IiiiiiiiIIIII instanceof BufferedImage)) return true;
            if (((BufferedImage)IiiiiiiiIIIII).getRGB(x, y) == 0) return false;
            return true;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
        return false;
    }

    public int iiiIiiiiiiIIi() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(short height) {
        this.IiIiiiiiIIIII = height;
    }

    public void iIiIiiiiIIiii() {
        int IiiiiiiiIIIII = -99999;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iIIiIiiiiiiIi.length) {
            iiIiIiiiiiIIi IiiiiiiiIIIII3 = this.iIIiIiiiiiiIi[IiiiiiiiIIIII2];
            if (IiiiiiiiIIIII3.ALLATORIxDEMO() != null && IiiiiiiiIIIII3.iIiIiiiiIIiii() + IiiiiiiiIIIII3.IiiIiiiiiiIiI() > IiiiiiiiIIIII) {
                IiiiiiiiIIIII = IiiiiiiiIIIII3.iIiIiiiiIIiii() + IiiiiiiiIIIII3.IiiIiiiiiiIiI();
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII == -99999) {
            IiiiiiiiIIIII = 0;
        }
        this.iiiiIiiiIIiii = IiiiiiiiIIIII;
        if (this.iiiiIiiiIIiii < 135) return;
        this.iiiiIiiiIIiii = 135;
    }

    public int iIiIiiiiIIiii() {
        return this.iiIIIiiiiiiiI;
    }

    public void ALLATORIxDEMO(int dir1, int dir2) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIIIiiiiiiiI) {
            iiIiIiiiiiIIi IiiiiiiiIIIII2 = this.iIIiIiiiiiiIi[dir1 * this.iiIIIiiiiiiiI + IiiiiiiiIIIII];
            iiIiIiiiiiIIi iiIiIiiiiiIIi2 = this.iIIiIiiiiiiIi[dir2 * this.iiIIIiiiiiiiI + IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iiIiIiiiiiIIi2.ALLATORIxDEMO(IiiiiiiiIIIII2.ALLATORIxDEMO(), IiiiiiiiIIIII2.iiiIiiiiiiIIi(), IiiiiiiiIIIII2.iIiIiiiiIIiii());
        }
    }

    public IIiiIiiiiIIiI ALLATORIxDEMO() {
        return this.IIIIiiiiiiiII;
    }

    public int ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public void ALLATORIxDEMO(int use) {
        this.iiIiIiiiiIIIi = use;
    }

    public void ALLATORIxDEMO(Graphics g, int x, int y) {
        if (this.IIiiIiiiIIiIi.ALLATORIxDEMO() == null) return;
        if (this.IIiiIiiiIIiIi.iIiIiiiiIIiIi() == 0) {
            g.drawImage(this.IIiiIiiiIIiIi.ALLATORIxDEMO(), x -= this.IIiiIiiiIIiIi.iiiIiiiiiiIIi(), y -= this.IIiiIiiiIIiIi.iIiIiiiiIIiii(), this.IIiiIiiiIIiIi.ALLATORIxDEMO(), this.IIiiIiiiIIiIi.IiiIiiiiiiIiI(), null);
            return;
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        IIIiiiiiIIiII.setToIdentity();
        IIIiiiiiIIiII.scale(-1.0, 1.0);
        IIIiiiiiIIiII.translate(-(x += this.IIiiIiiiIIiIi.iiiIiiiiiiIIi()), y -= this.IIiiIiiiIIiIi.iIiIiiiiIIiii());
        IiiiiiiiIIIII.drawImage(this.IIiiIiiiIIiIi.ALLATORIxDEMO(), IIIiiiiiIIiII, null);
    }

    public void ALLATORIxDEMO() {
        this.iiiiIiiiIiiII = -1;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIIiIiiiiiiIi.length) {
            if (this.iIIiIiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO() == null) {
                this.iIiIiiiiIIiii();
                return;
            }
            ++IiiiiiiiIIIII;
        }
        this.IIIIiiiiiiiII.ALLATORIxDEMO();
        this.IIIIiiiiiiiII = null;
        this.iIiIiiiiIIiii();
    }
}
