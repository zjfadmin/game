/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.iIIIIiiiIiiIi
 *  com.xy.w.iiIiIiiiiiIIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.w;

import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.iIIIIiiiIiiIi;
import com.xy.w.iiIiIiiiiiIIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiIiiiiIIiI
extends ByteArrayInputStream {
    private short[] IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    public long iiiIiiiiiiIIi() {
        return this.count;
    }

    public static void ALLATORIxDEMO(short[] palette, short[] schemes) {
        byte[] IiiiiiiiIIIII = new byte[3];
        int[] IiiiiiiiIIIII2 = new int[3];
        int IiiiiiiiIIIII3 = 0;
        short IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < schemes[0]) {
            IiiiiiiiIIIII3 = schemes[IiiiiiiiIIIII6 + 1];
            IiiiiiiiIIIII4 = schemes[IiiiiiiiIIIII6 + 2];
            IiiiiiiiIIIII5 = schemes[0] + 2 + 9 * IiiiiiiiIIIII6;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII4) {
                IiiiiiiiIIIII[0] = (byte)(palette[IiiiiiiiIIIII3] >>> 11 & 0x1F);
                IiiiiiiiIIIII[1] = (byte)(palette[IiiiiiiiIIIII3] >>> 5 & 0x3F);
                IiiiiiiiIIIII[2] = (byte)(palette[IiiiiiiiIIIII3] & 0x1F);
                IiiiiiiiIIIII2[0] = IiiiiiiiIIIII[0] * schemes[IiiiiiiiIIIII5] + IiiiiiiiIIIII[1] * schemes[IiiiiiiiIIIII5 + 1] + IiiiiiiiIIIII[2] * schemes[IiiiiiiiIIIII5 + 2] >>> 8;
                IiiiiiiiIIIII2[1] = IiiiiiiiIIIII[0] * schemes[IiiiiiiiIIIII5 + 3] + IiiiiiiiIIIII[1] * schemes[IiiiiiiiIIIII5 + 4] + IiiiiiiiIIIII[2] * schemes[IiiiiiiiIIIII5 + 5] >>> 8;
                IiiiiiiiIIIII2[2] = IiiiiiiiIIIII[0] * schemes[IiiiiiiiIIIII5 + 6] + IiiiiiiiIIIII[1] * schemes[IiiiiiiiIIIII5 + 7] + IiiiiiiiIIIII[2] * schemes[IiiiiiiiIIIII5 + 8] >>> 8;
                IiiiiiiiIIIII[0] = (byte)Math.min(IiiiiiiiIIIII2[0], 31);
                IiiiiiiiIIIII[1] = (byte)Math.min(IiiiiiiiIIIII2[1], 63);
                IiiiiiiiIIIII[2] = (byte)Math.min(IiiiiiiiIIIII2[2], 31);
                palette[IiiiiiiiIIIII3++] = (short)(IiiiiiiiIIIII[0] << 11 | IiiiiiiiIIIII[1] << 5 | IiiiiiiiIIIII[2]);
            }
            ++IiiiiiiiIIIII6;
        }
    }

    public short[] ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public long iIiIiiiiIIiii() {
        return this.pos;
    }

    public boolean ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int pos) {
        if (pos < 0) throw new IndexOutOfBoundsException(pos + ":" + this.count);
        if (pos > this.count) {
            throw new IndexOutOfBoundsException(pos + ":" + this.count);
        }
        this.pos = pos;
    }

    public short ALLATORIxDEMO() throws IOException {
        int IiiiiiiiIIIII = this.read();
        return (short)((this.read() << 8) + IiiiiiiiIIIII);
    }

    public IIiiIiiiiIIiI(byte[] buf) {
        super(buf);
    }

    public void ALLATORIxDEMO() {
        try {
            this.close();
            this.buf = null;
            this.count = 0;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean ALLATORIxDEMO(byte[] buf) throws IOException {
        this.read(buf);
        return false;
    }

    public IIIIIiiiIiIii ALLATORIxDEMO(boolean is, boolean isFZ, int version, short[] schemes) throws IOException {
        this.ALLATORIxDEMO = isFZ;
        short IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII7 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII - 12;
        if (IiiiiiiiIIIII8 < 0) {
            throw new IllegalStateException("\u5e27\u5ef6\u65f6\u4fe1\u606f\u9519\u8bef: " + IiiiiiiiIIIII8);
        }
        if (IiiiiiiiIIIII8 != 0) {
            this.ALLATORIxDEMO((int)(this.iIiIiiiiIIiii() + (long)IiiiiiiiIIIII8));
        }
        IiiiiiiiIIIII = (short)(IiiiiiiiIIIII + 2);
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.IiiiiiiiIIIII = new short[256];
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < 256) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII9++] = this.ALLATORIxDEMO();
        }
        if (schemes != null) {
            IIiiIiiiiIIiI.ALLATORIxDEMO(this.IiiiiiiiIIIII, schemes);
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII + 512);
        iiIiIiiiiiIIi[] IiiiiiiiIIIII22 = null;
        IiiiiiiiIIIII22 = is && IiiiiiiiIIIII2 == 4 ? new iiIiIiiiiiIIi[2 * IiiiiiiiIIIII3] : new iiIiIiiiiiIIi[IiiiiiiiIIIII2 * IiiiiiiiIIIII3];
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII22.length) {
            int IiiiiiiiIIIII11;
            if (is && IiiiiiiiIIIII2 == 4 && IiiiiiiiIIIII10 == IiiiiiiiIIIII3) {
                this.ALLATORIxDEMO((int)(this.iIiIiiiiIIiii() + (long)(IiiiiiiiIIIII3 * 4)));
            }
            if ((IiiiiiiiIIIII11 = this.ALLATORIxDEMO()) != 0) {
                IiiiiiiiIIIII11 += IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII22[IiiiiiiiIIIII10++] = new iiIiIiiiiiIIi(IiiiiiiiIIIII11);
        }
        return new IIIIIiiiIiIii(IiiiiiiiIIIII22, is && IiiiiiiiIIIII2 == 4 ? 2 : IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3, this, (int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII7, IiiiiiiiIIIII4, IiiiiiiiIIIII5);
    }

    public int ALLATORIxDEMO() throws IOException {
        int IiiiiiiiIIIII = this.read();
        int IiiiiiiiIIIII2 = this.read();
        int IiiiiiiiIIIII3 = this.read();
        int IiiiiiiiIIIII4 = this.read();
        return IiiiiiiiIIIII + (IiiiiiiiIIIII2 << 8) + (IiiiiiiiIIIII3 << 16) + (IiiiiiiiIIIII4 << 24);
    }

    /*
     * WARNING - void declaration
     */
    public iIIIIiiiIiiIi ALLATORIxDEMO() throws IOException {
        short IiiiiiiiIIIII = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII5 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
        short IiiiiiiiIIIII7 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII8 = IiiiiiiiIIIII - 12;
        if (IiiiiiiiIIIII8 < 0) {
            throw new IllegalStateException("\u5e27\u5ef6\u65f6\u4fe1\u606f\u9519\u8bef: " + IiiiiiiiIIIII8);
        }
        if (IiiiiiiiIIIII8 != 0) {
            this.ALLATORIxDEMO((int)(this.iIiIiiiiIIiii() + (long)IiiiiiiiIIIII8));
        }
        IiiiiiiiIIIII = (short)(IiiiiiiiIIIII + 2);
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.IiiiiiiiIIIII = new short[256];
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 < 256) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII9++] = this.ALLATORIxDEMO();
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII + 512);
        Vector<void> IiiiiiiiIIIII22 = new Vector<void>();
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII3) {
            void IiiiiiiiIIIII11;
            int IiiiiiiiIIIII12 = this.ALLATORIxDEMO();
            if (IiiiiiiiIIIII12 != 0) {
                IiiiiiiiIIIII12 += IiiiiiiiIIIII;
            }
            iiIiIiiiiiIIi iiIiIiiiiiIIi2 = new iiIiIiiiiiIIi(IiiiiiiiIIIII12);
            ++IiiiiiiiIIIII10;
            IiiiiiiiIIIII22.add(IiiiiiiiIIIII11);
        }
        IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII3) {
            BufferedImage IiiiiiiiIIIII13 = iiiiiiiiiiIiI.ALLATORIxDEMO((IIiiIiiiiIIiI)this, (iiIiIiiiiiIIi)((iiIiIiiiiiIIi)IiiiiiiiIIIII22.get(IiiiiiiiIIIII10)), (int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII7, (int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5);
            Object e = IiiiiiiiIIIII22.get(IiiiiiiiIIIII10);
            ++IiiiiiiiIIIII10;
            ((iiIiIiiiiiIIi)e).ALLATORIxDEMO(IiiiiiiiIIIII13);
        }
        this.ALLATORIxDEMO();
        return new iIIIIiiiIiiIi(IiiiiiiiIIIII22);
    }

    public long ALLATORIxDEMO() throws IOException {
        int IiiiiiiiIIIII = this.read();
        int IiiiiiiiIIIII2 = this.read();
        int IiiiiiiiIIIII3 = this.read();
        int IiiiiiiiIIIII4 = this.read();
        long IiiiiiiiIIIII5 = this.read();
        long IiiiiiiiIIIII6 = this.read();
        long IiiiiiiiIIIII7 = this.read();
        long IiiiiiiiIIIII8 = this.read();
        return (long)(IiiiiiiiIIIII + (IiiiiiiiIIIII2 << 8) + (IiiiiiiiIIIII3 << 16) + (IiiiiiiiIIIII4 << 24)) + (IiiiiiiiIIIII5 << 32) + (IiiiiiiiIIIII6 << 40) + (IiiiiiiiIIIII7 << 48) + (IiiiiiiiIIIII8 << 56);
    }
}
