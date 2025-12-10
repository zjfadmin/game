/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIiIiiiiIiIII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.n;

import com.xy.n.IIiIiiiiIiIII;
import com.xy.v.IiiiIiiiiIiIi;
import java.awt.Image;
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII {
    public IIiIiiiiIiIII[][] IIiiiiiiiIIIi;
    public byte[] IIIiiiiiIIiII;
    public static int iiIiiiiiiIIiI;
    private static String iIiiIiiiIiIIi;
    private static String iiiiIiiiIIiii;
    private static String iIIiIiiiiiiIi;
    public int IIIIiiiiiiiII;
    public boolean iiIIIiiiiiiiI;
    public int IiIiiiiiIIIII;
    public static int iiIiIiiiiIIIi;
    private RandomAccessFile iiiiIiiiIiiII;
    public int iiiIiiiiiiiIi;
    public long iIiiIiiiiiiII;
    public int IIiiIiiiIIiIi;
    public int iIiIiiiiIiIii;
    public int IiIIIiiiiIiiI;
    public static int iiIiiiiiiiIii;
    public int IiiiiiiiIIIII;
    private static String ALLATORIxDEMO;

    public static void ALLATORIxDEMO(RandomAccessFile mapFile, byte[] buf) throws IOException {
        mapFile.read(buf);
    }

    public static short ALLATORIxDEMO(RandomAccessFile mapFile) throws IOException {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = mapFile.read();
        if ((IiiiiiiiIIIII2 | (IiiiiiiiIIIII = mapFile.read())) >= 0) return (short)((IiiiiiiiIIIII2 << 0) + (IiiiiiiiIIIII << 8));
        throw new EOFException();
    }

    static {
        iiIiiiiiiiIii = 20;
        iiIiIiiiiIIIi = 320;
        iiIiiiiiiIIiI = 240;
        iIIiIiiiiiiIi = new String("HHYZ");
        iiiiIiiiIIiii = new String("hmap");
        iIiiIiiiIiIIi = new String("GEPJ");
        ALLATORIxDEMO = new String("LLEC");
    }

    public boolean iiiIiiiiiiIIi(int x, int y, int lvl) {
        if (x < 0) return true;
        if (y < 0) return true;
        if (y >= this.IiIIIiiiiIiiI) return true;
        if (x >= this.IIIIiiiiiiiII) return true;
        if (this.IIIiiiiiIIiII[this.IIIIiiiiiiiII * y + x] == 0) return true;
        return false;
    }

    public static IIIIIiiiIiiII iIiIiiiiIIiii(RandomAccessFile mapFile) throws Exception {
        int IiiiiiiiIIIII;
        IIIIIiiiIiiII IiiiiiiiIIIII2;
        IIIIIiiiIiiII iIIIIiiiIiiII = IiiiiiiiIIIII2 = new IIIIIiiiIiiII(mapFile);
        IiiiiiiiIIIII2.IiiiiiiiIIIII = 1;
        int IiiiiiiiIIIII3 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        int IiiiiiiiIIIII4 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        int IiiiiiiiIIIII5 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        int IiiiiiiiIIIII6 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        IiiiiiiiIIIII2.IiIiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        iIIIIiiiIiiII.iIiIiiiiIiIii = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        int IiiiiiiiIIIII7 = (int)Math.ceil((double)IiiiiiiiIIIII2.IiIiiiiiIIIII / (double)iiIiIiiiiIIIi);
        int IiiiiiiiIIIII8 = (int)Math.ceil((double)IiiiiiiiIIIII2.iIiIiiiiIiIii / (double)iiIiiiiiiIIiI);
        iIIIIiiiIiiII.IIIIiiiiiiiII = IiiiiiiiIIIII7 * 16;
        IiiiiiiiIIIII2.IiIIIiiiiIiiI = IiiiiiiiIIIII8 * 12;
        IiiiiiiiIIIII2.IIiiiiiiiIIIi = new IIiIiiiiIiIII[IiiiiiiiIIIII8][IiiiiiiiIIIII7];
        if (IiiiiiiiIIIII3 != 0) {
            mapFile.seek(IiiiiiiiIIIII3);
            IiiiiiiiIIIII = mapFile.read();
            byte[] IiiiiiiiIIIII9 = new byte[IIIIIiiiIiiII.ALLATORIxDEMO(mapFile)];
            IIIIIiiiIiiII.ALLATORIxDEMO(mapFile, IiiiiiiiIIIII9);
            IiiiiiiiIIIII9 = com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((byte[])IiiiiiiiIIIII9);
            IiiiiiiiIIIII2.IIIiiiiiIIiII = IiiiiiiiIIIII9;
        }
        mapFile.seek(IiiiiiiiIIIII6);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2.IIiiiiiiiIIIi.length) {
            int IiiiiiiiIIIII10 = 0;
            while (IiiiiiiiIIIII10 < IiiiiiiiIIIII2.IIiiiiiiiIIIi[0].length) {
                int IiiiiiiiIIIII11 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
                IiiiiiiiIIIII2.IIiiiiiiiIIIi[IiiiiiiiIIIII][IiiiiiiiIIIII10++] = new IIiIiiiiIiIII(IiiiiiiiIIIII11);
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII2.iiIIIiiiiiiiI = true;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2.IIIiiiiiIIiII.length) {
            if (IiiiiiiiIIIII2.IIIiiiiiIIiII[IiiiiiiiIIIII] == 3) {
                IiiiiiiiIIIII2.iiIIIiiiiiiiI = false;
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII2;
    }

    public IIIIIiiiIiiII(RandomAccessFile mapFile) {
        this.iiiiIiiiIiiII = mapFile;
    }

    public static IIIIIiiiIiiII ALLATORIxDEMO(RandomAccessFile mapFile) throws Exception {
        IIIIIiiiIiiII IiiiiiiiIIIII;
        IIIIIiiiIiiII iIIIIiiiIiiII = IiiiiiiiIIIII = new IIIIIiiiIiiII(mapFile);
        IiiiiiiiIIIII.IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII.IiIiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        iIIIIiiiIiiII.iIiIiiiiIiIii = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        int IiiiiiiiIIIII2 = (int)Math.ceil((double)IiiiiiiiIIIII.IiIiiiiiIIIII / (double)iiIiIiiiiIIIi);
        int IiiiiiiiIIIII3 = (int)Math.ceil((double)IiiiiiiiIIIII.iIiIiiiiIiIii / (double)iiIiiiiiiIIiI);
        iIIIIiiiIiiII.IIIIiiiiiiiII = IiiiiiiiIIIII2 * 16;
        IiiiiiiiIIIII.IiIIIiiiiIiiI = IiiiiiiiIIIII3 * 12;
        IiiiiiiiIIIII.IIiiiiiiiIIIi = new IIiIiiiiIiIII[IiiiiiiiIIIII3][IiiiiiiiIIIII2];
        IiiiiiiiIIIII.IIIiiiiiIIiII = new byte[IiiiiiiiIIIII2 * IiiiiiiiIIIII3 * 16 * 12];
        int[] IiiiiiiiIIIII4 = new int[IiiiiiiiIIIII3 * IiiiiiiiIIIII2];
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
            IiiiiiiiIIIII4[IiiiiiiiIIIII5++] = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
        }
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3) {
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII2) {
                int IiiiiiiiIIIII7;
                mapFile.seek(IiiiiiiiIIIII4[IiiiiiiiIIIII6 + IiiiiiiiIIIII5 * IiiiiiiiIIIII2]);
                mapFile.read();
                if (IIIIIiiiIiiII.ALLATORIxDEMO(mapFile, 4).equals(iIiiIiiiIiIIi)) {
                    IiiiiiiiIIIII7 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
                    IiiiiiiiIIIII.IIiiiiiiiIIIi[IiiiiiiiIIIII5][IiiiiiiiIIIII6] = new IIiIiiiiIiIII(IiiiiiiiIIIII4[IiiiiiiiIIIII6 + IiiiiiiiIIIII5 * IiiiiiiiIIIII2] + 5);
                    mapFile.seek(IiiiiiiiIIIII4[IiiiiiiiIIIII6 + IiiiiiiiIIIII5 * IiiiiiiiIIIII2] + IiiiiiiiIIIII7 + 4 + 4 + 1);
                }
                if (IIIIIiiiIiiII.ALLATORIxDEMO(mapFile, 4).equals(ALLATORIxDEMO)) {
                    IiiiiiiiIIIII7 = IIIIIiiiIiiII.ALLATORIxDEMO(mapFile);
                    byte[] IiiiiiiiIIIII8 = new byte[IiiiiiiiIIIII7];
                    mapFile.read(IiiiiiiiIIIII8);
                    int IiiiiiiiIIIII9 = 0;
                    int IiiiiiiiIIIII10 = 0;
                    while (IiiiiiiiIIIII9 < IiiiiiiiIIIII8.length) {
                        IiiiiiiiIIIII.IIIiiiiiIIiII[IiiiiiiiIIIII6 * 16 + IiiiiiiiIIIII9 % 16 + (IiiiiiiiIIIII5 * 12 + IiiiiiiiIIIII10) * IiiiiiiiIIIII.IIIIiiiiiiiII] = IiiiiiiiIIIII8[IiiiiiiiIIIII9];
                        if (IiiiiiiiIIIII9 % 16 == 15) {
                            ++IiiiiiiiIIIII10;
                        }
                        ++IiiiiiiiIIIII9;
                    }
                }
                ++IiiiiiiiIIIII6;
            }
            ++IiiiiiiiIIIII5;
        }
        return IiiiiiiiIIIII;
    }

    public static IIIIIiiiIiiII ALLATORIxDEMO(String path) throws Exception {
        RandomAccessFile IiiiiiiiIIIII = new RandomAccessFile(path, "r");
        String IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII, 4);
        if (IiiiiiiiIIIII2.equals(iIIiIiiiiiiIi)) {
            return IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        if (IiiiiiiiIIIII2.equals(iiiiIiiiIIiii)) {
            return IIIIIiiiIiiII.iIiIiiiiIIiii(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.close();
        throw new IllegalArgumentException("\u672a\u77e5\u683c\u5f0f\u5730\u56fe");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public byte[] ALLATORIxDEMO(int index) throws IOException {
        IIIIIiiiIiiII iIIIIiiiIiiII = this;
        synchronized (iIIIIiiiIiiII) {
            this.iiiiIiiiIiiII.seek(index);
            byte[] IiiiiiiiIIIII = new byte[IIIIIiiiIiiII.ALLATORIxDEMO(this.iiiiIiiiIiiII)];
            IIIIIiiiIiiII.ALLATORIxDEMO(this.iiiiIiiiIiiII, IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    public boolean iIiIiiiiIIiii(int x, int y, int lvl) {
        if (x <= 0) return false;
        if (y <= 0) return false;
        if (y >= this.IiIIIiiiiIiiI) return false;
        if (x >= this.IIIIiiiiiiiII) return false;
        if (this.IIIiiiiiIIiII[this.IIIIiiiiiiiII * y + x] != 2) return false;
        return true;
    }

    public RandomAccessFile ALLATORIxDEMO() {
        return this.iiiiIiiiIiiII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     * Converted monitor instructions to comments
     */
    public void ALLATORIxDEMO(IIiIiiiiIiIII mapImage) {
        IIiIiiiiIiIII iIiIiiiiIiIII = mapImage;
        // MONITORENTER : iIiIiiiiIiIII
        try {
            if (mapImage.IiiiiiiiIIIII == 0 || mapImage.ALLATORIxDEMO != null) {
                // MONITOREXIT : iIiIiiiiIiIII
                return;
            }
            byte[] IiiiiiiiIIIII = this.ALLATORIxDEMO(mapImage.IiiiiiiiIIIII);
            if (this.IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII = com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((byte[])IiiiiiiiIIIII);
            }
            mapImage.ALLATORIxDEMO = ImageIO.read(new ByteArrayInputStream(IiiiiiiiIIIII));
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            // MONITOREXIT : iIiIiiiiIiIII
            return;
        }
    }

    public Point ALLATORIxDEMO() {
        Point IiiiiiiiIIIII = new Point(400, 300);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 64) {
            IiiiiiiiIIIII.move(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(this.IIIIiiiiiiiII), IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(this.IiIIIiiiiIiiI));
            if (!this.iiiIiiiiiiIIi(IiiiiiiiIIIII.x, IiiiiiiiIIIII.y, 0)) {
                IiiiiiiiIIIII.move(IiiiiiiiIIIII.x * 20 + 10, IiiiiiiiIIIII.y * 20 + 10);
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII2;
        }
        IiiiiiiiIIIII.move(400, 300);
        return IiiiiiiiIIIII;
    }

    public static Point ALLATORIxDEMO(String path) throws Exception {
        RandomAccessFile IiiiiiiiIIIII = new RandomAccessFile(path, "r");
        String IiiiiiiiIIIII2 = IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII, 4);
        if (IiiiiiiiIIIII2.equals(iIIiIiiiiiiIi)) {
            Point IiiiiiiiIIIII3 = new Point(IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII), IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII));
            IiiiiiiiIIIII.close();
            return IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2.equals(iiiiIiiiIIiii)) {
            IiiiiiiiIIIII.seek(20L);
            Point IiiiiiiiIIIII4 = new Point(IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII), IIIIIiiiIiiII.ALLATORIxDEMO(IiiiiiiiIIIII));
            IiiiiiiiIIIII.close();
            return IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII.close();
        throw new IllegalArgumentException("\u672a\u77e5\u683c\u5f0f\u5730\u56fe");
    }

    public void ALLATORIxDEMO() {
        try {
            this.iiiiIiiiIiiII.close();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public boolean ALLATORIxDEMO(int x, int y, int lvl) {
        if (x <= 0) return false;
        if (y <= 0) return false;
        if (y >= this.IiIIIiiiiIiiI) return false;
        if (x >= this.IIIIiiiiiiiII) return false;
        if (this.IIIiiiiiIIiII[this.IIIIiiiiiiiII * y + x] != 3) return false;
        return true;
    }

    public static String ALLATORIxDEMO(RandomAccessFile mapFile, int size) throws IOException {
        byte[] IiiiiiiiIIIII = new byte[size];
        IIIIIiiiIiiII.ALLATORIxDEMO(mapFile, IiiiiiiiIIIII);
        return new String(IiiiiiiiIIIII);
    }

    public Image ALLATORIxDEMO(int x, int y) {
        if (x < 0) return null;
        if (y < 0) return null;
        if (y >= this.IIiiiiiiiIIIi.length) return null;
        if (x >= this.IIiiiiiiiIIIi[0].length) {
            return null;
        }
        IIiIiiiiIiIII IiiiiiiiIIIII = this.IIiiiiiiiIIIi[y][x];
        if (IiiiiiiiIIIII == null) {
            return null;
        }
        if (IiiiiiiiIIIII.IiiiiiiiIIIII == 0) return IiiiiiiiIIIII.ALLATORIxDEMO;
        if (IiiiiiiiIIIII.ALLATORIxDEMO != null) return IiiiiiiiIIIII.ALLATORIxDEMO;
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        return IiiiiiiiIIIII.ALLATORIxDEMO;
    }

    public static int ALLATORIxDEMO(RandomAccessFile mapFile) throws IOException {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        int IiiiiiiiIIIII4 = mapFile.read();
        if ((IiiiiiiiIIIII4 | (IiiiiiiiIIIII3 = mapFile.read()) | (IiiiiiiiIIIII2 = mapFile.read()) | (IiiiiiiiIIIII = mapFile.read())) >= 0) return (IiiiiiiiIIIII4 << 0) + (IiiiiiiiIIIII3 << 8) + (IiiiiiiiIIIII2 << 16) + (IiiiiiiiIIIII << 24);
        throw new EOFException();
    }
}
