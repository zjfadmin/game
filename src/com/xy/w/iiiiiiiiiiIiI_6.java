/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.SystemData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiIII
 *  com.xy.w.IIiiIiiiiIIiI
 *  com.xy.w.IiIIIiiiiiiIi
 *  com.xy.w.IiiIiiiiIIIii
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iIIIIiiiIiiIi
 *  com.xy.w.iIiIIiiiIiiiI
 *  com.xy.w.iiIIiiiiIiiII
 *  com.xy.w.iiIiIiiiiIiii
 *  com.xy.w.iiIiIiiiiiIIi
 */
package com.xy.w;

import com.xy.text.SystemData;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiIII;
import com.xy.w.IIiiIiiiiIIiI;
import com.xy.w.IiIIIiiiiiiIi;
import com.xy.w.IiiIiiiiIIIii;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iIIIIiiiIiiIi;
import com.xy.w.iIiIIiiiIiiiI;
import com.xy.w.iiIIiiiiIiiII;
import com.xy.w.iiIiIiiiiIiii;
import com.xy.w.iiIiIiiiiiIIi;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiiiiiiiiIiI {
    static BufferedImage IIiIiiiiIIiII;
    public static String[] iIiiIiiiiIiiI;
    static String iiIiiiiiiiiiI;
    static final int iiIiIiiiiIIII = 12;
    public static final BufferedImage IiIIIiiiiiiiI;
    static final int iIiIIiiiIIIii = 128;
    public static Map<Long, long[]> IIIIIiiiIiIIi;
    public static iIiIIiiiIiiiI iiIIiiiiIiIIi;
    static String[] IiIIiiiiIIIII;
    static final int iIIIIiiiiiIIi = 32;
    static final String IiiIIiiiiiiiI = "SH";
    static final int IIiiiiiiIiiII = 192;
    public static Map<Long, short[]> IiiiIiiiIiIII;
    private static long IIiiiiiiiIIIi;
    static final int IIIiiiiiIIiII = 64;
    static BufferedImage iiIiiiiiiIIiI;
    public static Map<String, SoftReference<IIIIIiiiIiIii>> iIiiIiiiIiIIi;
    public static Object iiiiIiiiIIiii;
    public static Map<Integer, long[]> iIIiIiiiiiiIi;
    public static Map<Long, SoftReference<IIIIIiiiIiIii>> IIIIiiiiiiiII;
    public static final int iiIIIiiiiiiiI = 100;
    static final String IiIiiiiiIIIII = "SP";
    public static Map<Integer, IiiIiiiiIIIii> iiIiIiiiiIIIi;
    public static Map<String, Long> iiiiIiiiIiiII;
    static long[] iiiIiiiiiiiIi;
    public static Map<Long, IiIIIiiiiiiIi[]> iIiiIiiiiiiII;
    public static IIIIIiiiIiIii[] IIiiIiiiIIiIi;
    public static IIIIIiiiIiIii iIiIiiiiIiIii;
    public static List<Object> IiIIIiiiiIiiI;
    static final int iiIiiiiiiiIii = 0;
    static final int IiiiiiiiIIIII = 0;
    static final int ALLATORIxDEMO = 192;

    public static IIIIIiiiIiIii iIiIiiiiIIiii(long skin, int act) {
        SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII = IIIIiiiiiiiII.get(-skin);
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.get() != null) return IiiiiiiiIIIII.get();
        }
        iiiiiiiiiiIiI.ALLATORIxDEMO((Object)(String.valueOf(act == 0 || act == 1 || act == 2 || act == 10 ? iIiIIiiiIiiiI.iiiIiiiiiiiIi : iIiIIiiiIiiiI.iIiIiiiiIiIii) + skin));
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(IIIIIiiiIiIii sprite) {
        var1_1 = sprite;
        synchronized (var1_1) {
            IiiiiiiiIIIII = sprite.iiiiiiiiIIiii();
            IiiiiiiiIIIII = sprite.iIiIiiiiIIiii();
            if (IiiiiiiiIIIII == -1) {
                return;
            }
            IiiiiiiiIIIII %= sprite.ALLATORIxDEMO();
            IiiiiiiiIIIII = false;
            IiiiiiiiIIIII = sprite.ALLATORIxDEMO();
            if (sprite.ALLATORIxDEMO() != 4 && sprite.ALLATORIxDEMO() != 8 || IiiiiiiiIIIII == null || !IiiiiiiiIIIII.ALLATORIxDEMO()) ** GOTO lbl23
            IiiiiiiiIIIII = true;
            if (IiiiiiiiIIIII != 1) ** GOTO lbl-1000
            IiiiiiiiIIIII = 0;
            ** GOTO lbl23
lbl-1000:
            // 1 sources

            {
                if (IiiiiiiiIIIII == 3) {
                    IiiiiiiiIIIII = 2;
                } else if (IiiiiiiiIIIII == 7) {
                    IiiiiiiiIIIII = 5;
                }
lbl23:
                // 6 sources

                if (sprite.ALLATORIxDEMO(IiiiiiiiIIIII).ALLATORIxDEMO() != null) {
                    return;
                }
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = sprite.ALLATORIxDEMO()[IiiiiiiiIIIII * IiiiiiiiIIIII + IiiiiiiiIIIII];
                        var8_9 = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, sprite);
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII.ALLATORIxDEMO((BufferedImage)IiiiiiiiIIIII);
                    }
                } else {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        v1 = IiiiiiiiIIIII * IiiiiiiiIIIII + IiiiiiiiIIIII;
                        ++IiiiiiiiIIIII;
                        sprite.ALLATORIxDEMO()[v1].ALLATORIxDEMO(iiiiiiiiiiIiI.IiIIIiiiiiiiI);
                    }
                }
                if (IiiiiiiiIIIII) {
                    if (IiiiiiiiIIIII == 0) {
                        sprite.ALLATORIxDEMO(0, 1);
                    } else if (IiiiiiiiIIIII == 2) {
                        sprite.ALLATORIxDEMO(2, 3);
                    } else if (IiiiiiiiIIIII == 5) {
                        sprite.ALLATORIxDEMO(5, 7);
                    }
                }
                sprite.ALLATORIxDEMO();
                return;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                iiiiiiiiiiIiI.iiiiIiiiIIiii = new Object();
                iiiiiiiiiiIiI.iIiiIiiiiIiiI = new String[13];
                iiiiiiiiiiIiI.IiIIIiiiiIiiI = new ArrayList<Object>();
                iiiiiiiiiiIiI.IIiiIiiiIIiIi = new IIIIIiiiIiIii[6];
                iiiiiiiiiiIiI.iIiiIiiiIiIIi = new HashMap<String, SoftReference<IIIIIiiiIiIii>>();
                iiiiiiiiiiIiI.IIIIiiiiiiiII = new HashMap<Long, SoftReference<IIIIIiiiIiIii>>();
                iiiiiiiiiiIiI.IiiiIiiiIiIII = new HashMap<Long, short[]>();
                iiiiiiiiiiIiI.iiiiIiiiIiiII = new HashMap<String, Long>();
                iiiiiiiiiiIiI.iIIiIiiiiiiIi = new HashMap<Integer, long[]>();
                iiiiiiiiiiIiI.IiIIIiiiiiiiI = new BufferedImage(1, 1, 2);
                iiiiiiiiiiIiI.IiIIiiiiIIIII = new String[]{"hit.tcp", "magic.tcp", "defend.tcp", "guard.tcp", "die.tcp", "attack.tcp", "t2.tcp", "4001.tcp", "4002.tcp", "4003.tcp", "4004.tcp", "400509", "400535", "400314", "52106", "52114", "1252.tcp", "1253.tcp", "1254.tcp", "1255.tcp"};
                iiiiiiiiiiIiI.iiIiiiiiiiiiI = "1282.tcp";
                iiiiiiiiiiIiI.iiiIiiiiiiiIi = new long[0];
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[0] = "walk";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[1] = "run";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[2] = "stand";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[3] = "t1";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[4] = "hit";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[5] = "magic";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[6] = "defend";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[7] = "guard";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[8] = "die";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[9] = "attack";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[10] = "attackrun";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[11] = "t2";
                iiiiiiiiiiIiI.iIiiIiiiiIiiI[12] = "t3";
                iiiiiiiiiiIiI.iiIiIiiiiIIIi = new HashMap<Integer, IiiIiiiiIIIii>();
                iiiiiiiiiiIiI.iIiiIiiiiiiII = new HashMap<Long, IiIIIiiiiiiIi[]>();
                iiiiiiiiiiIiI.IIIIIiiiIiIIi = new HashMap<Long, long[]>();
                try {
                    IiiiiiiiIIIII = new File("sc/music/1");
                    if (!IiiiiiiiIIIII.exists()) break block8;
                    IiiiiiiiIIIII = new FileInputStream(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = new byte[IiiiiiiiIIIII.available()];
                    IiiiiiiiIIIII.read(IiiiiiiiIIIII);
                    IiiiiiiiIIIII = new IIiiIiiiiIIiI(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.ALLATORIxDEMO(2);
                    if (true) ** GOTO lbl47
                }
                catch (Exception IiiiiiiiIIIII) {
                    IiiiiiiiIIIII.printStackTrace();
                    break block9;
                }
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    iiiiiiiiiiIiI.iIiiIiiiiiiII.put(IiiiiiiiIIIII, iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII));
lbl47:
                    // 2 sources

                } while (IiiiiiiiIIIII.available() > 0);
                IiiiiiiiIIIII.close();
                IiiiiiiiIIIII.close();
            }
            if ((IiiiiiiiIIIII = new File("sc/music/0.png")).exists()) {
                IiiiiiiiIIIII = new FileInputStream(IiiiiiiiIIIII);
                IiiiiiiiIIIII = new byte[IiiiiiiiIIIII.available()];
                IiiiiiiiIIIII.read(IiiiiiiiIIIII);
                IiiiiiiiIIIII = new IIiiIiiiiIIiI(IiiiiiiiIIIII);
                IiiiiiiiIIIII.ALLATORIxDEMO(2);
                while (IiiiiiiiIIIII.available() > 0) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = new long[IiiiiiiiIIIII.read()];
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII.read();
                        v0 = IiiiiiiiIIIII;
                        v1 = IiiiiiiiIIIII[IiiiiiiiIIIII] << 32 | (long)IiiiiiiiIIIII.ALLATORIxDEMO();
                        ++IiiiiiiiIIIII;
                        IiiiiiiiIIIII[v0] = v1;
                    }
                    iiiiiiiiiiIiI.IIIIIiiiIiIIi.put(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    if (iiiiiiiiiiIiI.IIIIIiiiIiIIi.get(IiiiiiiiIIIII & 0xFFFFFFFL) != null) continue;
                    iiiiiiiiiiIiI.IIIIIiiiIiIIi.put(IiiiiiiiIIIII & 0xFFFFFFFL, iiiiiiiiiiIiI.iiiIiiiiiiiIi);
                }
                IiiiiiiiIIIII.close();
                IiiiiiiiIIIII.close();
            }
        }
        iiiiiiiiiiIiI.iiIIiiiiIiIIi = new iIiIIiiiIiiiI();
        iiiiiiiiiiIiI.iiIIiiiiIiIIi.start();
        iiiiiiiiiiIiI.iIiIiiiiIiIii = iiiiiiiiiiIiI.ALLATORIxDEMO("skin/YZ.tcp", null);
        iiiiiiiiiiIiI.iIiIiiiiIiIii.ALLATORIxDEMO(0L, 0);
    }

    public static long iIiIiiiiIIiIi(long skin) {
        if (skin == 22010L) {
            return 73014466042L;
        }
        if (skin == 20009L) {
            return 8589954601L;
        }
        if (skin == 21009L) {
            return 42949693969L;
        }
        if (skin == 21007L) {
            return 17179890191L;
        }
        if (skin == 20008L) {
            return 42949692968L;
        }
        if (skin == 20007L) {
            return 4294987303L;
        }
        if (skin == 21008L) {
            return 42949693968L;
        }
        if (skin == 20010L) {
            return 4294987306L;
        }
        if (skin == 22008L) {
            return 47244662264L;
        }
        if (skin == 21010L) {
            return 38654726674L;
        }
        if (skin == 22007L) {
            return 51539629559L;
        }
        if (skin != 22009L) return 0L;
        return 55834596857L;
    }

    public static long iiiIiiiiiiIIi(long skin) {
        long IiiiiiiiIIIII;
        if (skin < 25000L) {
            skin = iiiiiiiiiiIiI.iIiIiiiiIIiii(skin);
        }
        if (skin <= Integer.MAX_VALUE) return skin;
        if (skin >> 40 > 0L) {
            return skin;
        }
        if (skin >> 32 > 18L) {
            skin = (skin >> 32) - 18L << 32 | (long)((int)skin);
        }
        if ((IiiiiiiiIIIII = iiiiiiiiiiIiI.iIiIiiiiIIiIi(skin & Integer.MAX_VALUE)) != 0L) {
            skin = IiiiiiiiIIIII;
        }
        if (iIiiIiiiiiiII.get(skin) != null) return skin;
        skin = iiiiiiiiiiIiI.iIiIiiiiIIiii(skin & Integer.MAX_VALUE);
        return skin;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static synchronized IiiIiiiiIIIii ALLATORIxDEMO(int i) {
        IiiIiiiiIIIii IiiiiiiiIIIII = iiIiIiiiiIIIi.get(i);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.ALLATORIxDEMO(0);
            return IiiiiiiiIIIII;
        }
        try {
            IiiiiiiiIIIII = i > 32 ? new IiiIiiiiIIIii("sc/music/" + (i - 32) + ".png") : new IiiIiiiiIIIii("skin/" + i + ".hh");
        }
        catch (Exception IiiiiiiiIIIII2) {
            IiiiiiiiIIIII2.printStackTrace();
            return IiiiiiiiIIIII;
        }
        {
            iiIiIiiiiIIIi.put(i, IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static IIIIIiiiIiIii ALLATORIxDEMO(String filename, short[] schemes) {
        IIIIIiiiIiIii IiiiiiiiIIIII;
        block7: {
            int IiiiiiiiIIIII2;
            byte[] IiiiiiiiIIIII3;
            FileInputStream IiiiiiiiIIIII4;
            if (filename == null) return null;
            if (filename.length() == 0) {
                return null;
            }
            IiiiiiiiIIIII = null;
            try {
                File IiiiiiiiIIIII5 = new File(filename);
                if (IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.exists()) {
                    IiiiiiiiIIIII4 = new FileInputStream(IiiiiiiiIIIII5);
                    IiiiiiiiIIIII3 = new byte[2];
                    ((InputStream)IiiiiiiiIIIII4).read(IiiiiiiiIIIII3);
                    String IiiiiiiiIIIII6 = new String(IiiiiiiiIIIII3);
                    int n = IiiiiiiiIIIII6.equals(IiIiiiiiIIIII) ? 0 : (IiiiiiiiIIIII2 = IiiiiiiiIIIII6.equals(IiiIIiiiiiiiI) ? 1 : -1);
                }
                break block7;
            }
            catch (Exception IiiiiiiiIIIII7) {
                IiiiiiiiIIIII7.printStackTrace();
                break block7;
            }
            {
                if (IiiiiiiiIIIII2 >= 0) {
                    IiiiiiiiIIIII3 = new byte[((InputStream)IiiiiiiiIIIII4).available()];
                    int IiiiiiiiIIIII8 = 0;
                    int IiiiiiiiIIIII9 = 0;
                    while (((InputStream)IiiiiiiiIIIII4).available() > 0) {
                        IiiiiiiiIIIII8 = ((InputStream)IiiiiiiiIIIII4).read(IiiiiiiiIIIII3, IiiiiiiiIIIII9, ((InputStream)IiiiiiiiIIIII4).available());
                        IiiiiiiiIIIII9 += IiiiiiiiIIIII8;
                    }
                    ((InputStream)IiiiiiiiIIIII4).close();
                    IiiiiiiiIIIII = new IIiiIiiiiIIiI(IiiiiiiiIIIII3).ALLATORIxDEMO(iiiiiiiiiiIiI.ALLATORIxDEMO(filename), iiiiiiiiiiIiI.iIiIiiiiIIiii(filename), IiiiiiiiIIIII2, schemes);
                    break block7;
                }
                ((InputStream)IiiiiiiiIIIII4).close();
            }
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO(iiiiiiiiiiIiI.ALLATORIxDEMO(filename));
        return IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(int type) {
        return iIiiIiiiiIiiI[type];
    }

    public static IiIIIiiiiiiIi[] ALLATORIxDEMO(long skin, IIiiIiiiiIIiI randomIn) throws IOException {
        IiIIIiiiiiiIi[] IiiiiiiiIIIII = new IiIIIiiiiiiIi[randomIn.read()];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            IiIIIiiiiiiIi IiiiiiiiIIIII3 = new IiIIIiiiiiiIi();
            IiiiiiiiIIIII3.ALLATORIxDEMO((byte)randomIn.read());
            long[] IiiiiiiiIIIII4 = new long[randomIn.read()];
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                IiiiiiiiIIIII4[IiiiiiiiIIIII5++] = randomIn.ALLATORIxDEMO();
            }
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII4);
            IiiiiiiiIIIII[IiiiiiiiIIIII2++] = IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static boolean iIiIiiiiIIiii(String filename) {
        if (!filename.endsWith(iiIiiiiiiiiiI)) return true;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static Object ALLATORIxDEMO() {
        Object object = iiiiIiiiIIiii;
        synchronized (object) {
            Object object2 = IiIIIiiiiIiiI.size() != 0 ? IiIIIiiiiIiiI.get(0) : null;
            return object2;
        }
    }

    public static long iIiIiiiiIIiii(String color) {
        Long IiiiiiiiIIIII = iiiiIiiiIiiII.get(color);
        if (IiiiiiiiIIIII == null) return iiiiiiiiiiIiI.ALLATORIxDEMO(color);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    private static synchronized /* synthetic */ long ALLATORIxDEMO(String color) {
        IiiiiiiiIIIII = iiiiiiiiiiIiI.iiiiIiiiIiiII.get(color);
        if (IiiiiiiiIIIII != null) {
            return IiiiiiiiIIIII;
        }
        try {
            IiiiiiiiIIIII = ++iiiiiiiiiiIiI.IIiiiiiiiIIIi;
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl26
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            System.err.println("\u9519\u8bef\u683c\u5f0f\u7684\u7740\u8272\u65b9\u6848");
            return 0L;
        }
        do {
            if ((IiiiiiiiIIIII = color.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                IiiiiiiiIIIII = color.length();
            }
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII = com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)color, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII);
                IiiiiiiiIIIII = new short[2 + 10 * IiiiiiiiIIIII];
                IiiiiiiiIIIII[IiiiiiiiIIIII] = (short)IiiiiiiiIIIII;
            } else {
                IiiiiiiiIIIII[IiiiiiiiIIIII] = (short)com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)color, (int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl26:
            // 2 sources

        } while (IiiiiiiiIIIII != color.length());
        iiiiiiiiiiIiI.IiiiIiiiIiIII.put(IiiiiiiiIIIII, IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public static IIIIIiiiIiIii iIiIiiiiIIiii(long skin, boolean is, short[] schemes) {
        block4: {
            IiiiiiiiIIIII = null;
            try {
                IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO((int)(skin >> 32) + 32);
                if (IiiiiiiiIIIII == null) break block4;
                IiiiiiiiIIIII = new byte[4];
                IiiiiiiiIIIII.ALLATORIxDEMO(skin & 0x7FFFFFFFL, IiiiiiiiIIIII);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl16
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                break block4;
            }
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII] & 255;
                IiiiiiiiIIIII += (IiiiiiiiIIIII <<= 8 * ++IiiiiiiiIIIII);
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            IiiiiiiiIIIII = new byte[IiiiiiiiIIIII];
            IiiiiiiiIIIII.ALLATORIxDEMO(skin + 4L & 0x7FFFFFFFL, IiiiiiiiIIIII);
            IiiiiiiiIIIII = new IIiiIiiiiIIiI(IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(is, true, 1, schemes);
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO(1);
        return IiiiiiiiIIIII;
    }

    public static long iIiIiiiiIIiii(long skin) {
        if (skin == 24006L) {
            skin = 73014468038L;
            return skin;
        }
        if (skin == 21006L) {
            skin = 60129563150L;
            return skin;
        }
        if (skin == 20001L) {
            skin = 4294987297L;
            return skin;
        }
        if (skin == 21004L) {
            skin = 42949693964L;
            return skin;
        }
        if (skin == 20004L) {
            skin = 34359758372L;
            return skin;
        }
        if (skin == 20002L) {
            skin = 12884921890L;
            return skin;
        }
        if (skin == 21003L) {
            skin = 42949693963L;
            return skin;
        }
        if (skin == 24001L) {
            skin = 25769827777L;
            return skin;
        }
        if (skin == 20006L) {
            skin = 51539627558L;
            return skin;
        }
        if (skin == 22001L) {
            skin = 12884923889L;
            return skin;
        }
        if (skin == 22010L) {
            skin = 73014466042L;
            return skin;
        }
        if (skin == 22005L) {
            skin = 30064793077L;
            return skin;
        }
        if (skin == 22002L) {
            skin = 64424531442L;
            return skin;
        }
        if (skin == 20009L) {
            skin = 8589954601L;
            return skin;
        }
        if (skin == 23004L) {
            skin = 34359761372L;
            return skin;
        }
        if (skin == 24004L) {
            skin = 12884925892L;
            return skin;
        }
        if (skin == 21009L) {
            skin = 42949693969L;
            return skin;
        }
        if (skin == 21007L) {
            skin = 17179890191L;
            return skin;
        }
        if (skin == 21005L) {
            skin = 4294988301L;
            return skin;
        }
        if (skin == 24005L) {
            skin = 77309435333L;
            return skin;
        }
        if (skin == 22004L) {
            skin = 42949694964L;
            return skin;
        }
        if (skin == 23005L) {
            skin = 73014467037L;
            return skin;
        }
        if (skin == 21001L) {
            skin = 30064792073L;
            return skin;
        }
        if (skin == 20008L) {
            skin = 42949692968L;
            return skin;
        }
        if (skin == 20007L) {
            skin = 4294987303L;
            return skin;
        }
        if (skin == 21008L) {
            skin = 42949693968L;
            return skin;
        }
        if (skin == 20010L) {
            skin = 4294987306L;
            return skin;
        }
        if (skin == 23003L) {
            skin = 55834597851L;
            return skin;
        }
        if (skin == 22003L) {
            skin = 30064793075L;
            return skin;
        }
        if (skin == 24002L) {
            skin = 51539631554L;
            return skin;
        }
        if (skin == 23002L) {
            skin = 51539630554L;
            return skin;
        }
        if (skin == 22008L) {
            skin = 47244662264L;
            return skin;
        }
        if (skin == 20005L) {
            skin = 42949692965L;
            return skin;
        }
        if (skin == 24003L) {
            skin = 77309435331L;
            return skin;
        }
        if (skin == 20003L) {
            skin = 17179889187L;
            return skin;
        }
        if (skin == 21010L) {
            skin = 38654726674L;
            return skin;
        }
        if (skin == 22007L) {
            skin = 51539629559L;
            return skin;
        }
        if (skin == 21002L) {
            skin = 42949693962L;
            return skin;
        }
        if (skin == 23001L) {
            skin = 42949695961L;
            return skin;
        }
        if (skin == 23006L) {
            skin = 47244663262L;
            return skin;
        }
        if (skin == 22009L) {
            skin = 55834596857L;
            return skin;
        }
        if (skin == 22006L) {
            skin = 4294989302L;
            return skin;
        }
        if (skin == 23007L) {
            skin = 42949695967L;
            return skin;
        }
        if (skin == 21012L) {
            skin = 42949693972L;
            return skin;
        }
        if (skin == 20012L) {
            skin = 34359758380L;
            return skin;
        }
        if (skin == 22012L) {
            skin = 47244662268L;
            return skin;
        }
        if (skin == 22011L) {
            skin = 51539629563L;
            return skin;
        }
        if (skin == 23008L) {
            skin = 4294990304L;
            return skin;
        }
        if (skin == 20011L) {
            skin = 30064791083L;
            return skin;
        }
        if (skin != 21011L) return skin;
        skin = 42949693971L;
        return skin;
    }

    public static int ALLATORIxDEMO(String filename) {
        if (filename.length() <= 4) {
            return -1;
        }
        filename = filename.substring(0, filename.length() - 4);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < iIiiIiiiiIiiI.length) {
            if (filename.endsWith(iIiiIiiiiIiiI[IiiiiiiiIIIII])) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public static IiiiIiiiiIiIi ALLATORIxDEMO(long skin, int act, int lvl, String color) {
        IIiIiiiiIiIII IiiiiiiiIIIII;
        long IiiiiiiiIIIII2;
        block9: {
            IiiiiiiiIIIII2 = color != null ? iiiiiiiiiiIiI.iIiIiiiiIIiii(color) : 0L;
            IiiiiiiiIIIII = null;
            if (act != -2 && act != -1) {
                try {
                    IiIIIiiiiiiIi[] IiiiiiiiIIIII3;
                    long IiiiiiiiIIIII4 = iiiiiiiiiiIiI.ALLATORIxDEMO(skin);
                    if (IiiiiiiiIIIII4 != 0L) {
                        skin = IiiiiiiiIIIII4;
                    }
                    if ((IiiiiiiiIIIII3 = iiiiiiiiiiIiI.ALLATORIxDEMO(skin)) != null) {
                        if (SystemData.isOld) {
                            skin = iiiiiiiiiiIiI.iiiIiiiiiiIIi(skin);
                            break block9;
                        } else {
                            IiiiiiiiIIIII = new iiIIiiiiIiiII(skin, IiiiiiiiIIIII3, act, lvl, IiiiiiiiIIIII2);
                        }
                        break block9;
                    }
                    if (iiiiiiiiiiIiI.ALLATORIxDEMO(skin, -1) != null) {
                        IiiiiiiiIIIII = new iiIiIiiiiIiii(skin, act, lvl, IiiiiiiiIIIII2);
                    }
                }
                catch (Exception IiiiiiiiIIIII5) {
                    IiiiiiiiIIIII5.printStackTrace();
                }
            }
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        return new IIiIiiiiIiIII(String.valueOf(skin), act, lvl, IiiiiiiiIIIII2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void iIiIiiiiIIiii(Object load) {
        Object object = iiiiIiiiIIiii;
        synchronized (object) {
            IiIIIiiiiIiiI.remove(load);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static BufferedImage ALLATORIxDEMO(IIiiIiiiiIIiI in, iiIiIiiiiiIIi frame, IIIIIiiiIiIii sprite) {
        try {
            if (frame.iIiIiiiiIIiIi() == 0) {
                return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            }
            if (frame.ALLATORIxDEMO() != null) {
                return (BufferedImage)frame.ALLATORIxDEMO();
            }
            in.ALLATORIxDEMO(frame.iIiIiiiiIIiIi());
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            if (sprite.iIiIiiiiIIiii() == 1) {
                IiiiiiiiIIIII = sprite.iIiIiiiiIIiIi();
                IiiiiiiiIIIII = sprite.iiiIiiiiiiIIi();
            }
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            if (IiiiiiiiIIIII > 1000 || IiiiiiiiIIIII > 1000) {
                System.err.println("\u8b66\u62a5:" + IiiiiiiiIIIII + ":" + IiiiiiiiIIIII);
                if (IiiiiiiiIIIII >= 5000) return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
                if (IiiiiiiiIIIII >= 5000) {
                    return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
                }
            }
            IiiiiiiiIIIII = new int[IiiiiiiiIIIII];
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII[IiiiiiiiIIIII++] = in.ALLATORIxDEMO();
            }
            frame.iIiIiiiiIIiii(IiiiiiiiIIIII);
            frame.iiiIiiiiiiIIi(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII == 0) return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            if (IiiiiiiiIIIII == 0) {
                return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            }
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = new BufferedImage(IiiiiiiiIIIII, IiiiiiiiIIIII, 2);
            IiiiiiiiIIIII = IiiiiiiiIIIII.getRaster();
            IiiiiiiiIIIII = new int[4];
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                block23: {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII] == 0) break block23;
                    IiiiiiiiIIIII = 0;
                    in.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII] + frame.iIiIiiiiIIiIi());
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        block27: {
                            block26: {
                                block24: {
                                    block25: {
                                        IiiiiiiiIIIII = in.read();
                                        IiiiiiiiIIIII = IiiiiiiiIIIII & 192;
                                        if (IiiiiiiiIIIII != 0) break block24;
                                        if ((IiiiiiiiIIIII & 32) == 32) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                                            IiiiiiiiIIIII = IiiiiiiiIIIII << 3 | IiiiiiiiIIIII >>> 2;
                                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], IiiiiiiiIIIII);
                                            IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                                            ++IiiiiiiiIIIII;
                                            continue;
                                        }
                                        if (IiiiiiiiIIIII == 0) break block25;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                                        if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                                        }
                                        IiiiiiiiIIIII = in.read();
                                        IiiiiiiiIIIII = IiiiiiiiIIIII << 3 | IiiiiiiiIIIII >>> 2;
                                        iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], IiiiiiiiIIIII);
                                        IiiiiiiiIIIII = 0;
                                        if (true) ** GOTO lbl97
                                    }
                                    if (IiiiiiiiIIIII != 0 || IiiiiiiiIIIII == IiiiiiiiIIIII) break;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII - 1;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                                    if (true) ** GOTO lbl103
                                }
                                if (IiiiiiiiIIIII != 64) break block26;
                                IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                                if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                                }
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl110
                            }
                            if (IiiiiiiiIIIII != 128) break block27;
                            IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                            if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                            }
                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], 255);
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl116
                        }
                        if (IiiiiiiiIIIII != 192) continue;
                        IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                        if (IiiiiiiiIIIII == 0) {
                            IiiiiiiiIIIII = in.read();
                            IiiiiiiiIIIII = in.read();
                            continue;
                        }
                        if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                            continue;
                        }
                        IiiiiiiiIIIII += IiiiiiiiIIIII;
                        continue;
                        do {
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                            ++IiiiiiiiIIIII;
lbl97:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        continue;
                        do {
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII))[0] != 0 || IiiiiiiiIIIII[1] != 0 || IiiiiiiiIIIII[2] != 0 || IiiiiiiiIIIII[3] != 0) {
                                IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
lbl103:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        break;
                        do {
                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], 255);
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                            ++IiiiiiiiIIIII;
lbl110:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        continue;
                        do {
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII);
                            ++IiiiiiiiIIIII;
lbl116:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                    }
                    if (IiiiiiiiIIIII > IiiiiiiiIIIII) {
                        System.err.println("block end error: [" + IiiiiiiiIIIII + "][" + IiiiiiiiIIIII + "/" + IiiiiiiiIIIII + "]");
                    }
                }
                ++IiiiiiiiIIIII;
            }
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
        }
    }

    public static int ALLATORIxDEMO(int dir, int size) {
        if (size == 2) {
            if (dir != 3) return 1;
            return 0;
        }
        switch (dir) {
            case 0: {
                dir = 6;
                return dir;
            }
            case 1: {
                dir = 3;
                return dir;
            }
            case 2: {
                dir = 7;
                return dir;
            }
            case 3: {
                dir = 0;
                return dir;
            }
            case 4: {
                dir = 4;
                return dir;
            }
            case 5: {
                dir = 1;
                return dir;
            }
            case 6: {
                dir = 5;
                return dir;
            }
            case 7: {
                dir = 2;
                return dir;
            }
        }
        return dir;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static IiiiIiiiiIiIi ALLATORIxDEMO(String skin, int act, int lvl, String color) {
        IIiIiiiiIiIII IiiiiiiiIIIII;
        long IiiiiiiiIIIII2;
        block8: {
            IiiiiiiiIIIII2 = color != null ? iiiiiiiiiiIiI.iIiIiiiiIIiii(color) : 0L;
            IiiiiiiiIIIII = null;
            if (act != -2 && act != -1) {
                long l;
                try {
                    l = !com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)skin) ? Long.parseLong(skin) : 0L;
                }
                catch (Exception IiiiiiiiIIIII3) {
                    IiiiiiiiIIIII3.printStackTrace();
                    break block8;
                }
                {
                    IiIIIiiiiiiIi[] IiiiiiiiIIIII4;
                    long IiiiiiiiIIIII5 = l;
                    long IiiiiiiiIIIII6 = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII5);
                    if (IiiiiiiiIIIII6 != 0L) {
                        skin = String.valueOf(IiiiiiiiIIIII6);
                        IiiiiiiiIIIII5 = IiiiiiiiIIIII6;
                    }
                    if ((IiiiiiiiIIIII4 = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII5)) != null) {
                        if (SystemData.isOld) {
                            skin = String.valueOf(iiiiiiiiiiIiI.iiiIiiiiiiIIi(IiiiiiiiIIIII5));
                        } else {
                            IiiiiiiiIIIII = new iiIIiiiiIiiII(IiiiiiiiIIIII5, IiiiiiiiIIIII4, act, lvl, IiiiiiiiIIIII2);
                        }
                        break block8;
                    }
                    if (iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII5, -1) == null) break block8;
                    IiiiiiiiIIIII = new iiIiIiiiiIiii(IiiiiiiiIIIII5, act, lvl, IiiiiiiiIIIII2);
                }
            }
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new IIiIiiiiIiIII(skin, act, lvl, IiiiiiiiIIIII2);
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static iIIIIiiiIiiIi ALLATORIxDEMO(String filename) {
        File IiiiiiiiIIIII;
        iIIIIiiiIiiIi IiiiiiiiIIIII2;
        block7: {
            int IiiiiiiiIIIII3;
            byte[] IiiiiiiiIIIII4;
            FileInputStream IiiiiiiiIIIII5;
            IiiiiiiiIIIII2 = null;
            try {
                IiiiiiiiIIIII = new File(filename);
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.exists()) {
                    IiiiiiiiIIIII5 = new FileInputStream(IiiiiiiiIIIII);
                    IiiiiiiiIIIII4 = new byte[2];
                    ((InputStream)IiiiiiiiIIIII5).read(IiiiiiiiIIIII4);
                    String IiiiiiiiIIIII6 = new String(IiiiiiiiIIIII4);
                    int n = IiiiiiiiIIIII6.equals(IiIiiiiiIIIII) ? 0 : (IiiiiiiiIIIII3 = IiiiiiiiIIIII6.equals(IiiIIiiiiiiiI) ? 1 : -1);
                }
                break block7;
            }
            catch (Exception IiiiiiiiIIIII7) {
                IiiiiiiiIIIII7.printStackTrace();
                break block7;
            }
            {
                if (IiiiiiiiIIIII3 >= 0) {
                    IiiiiiiiIIIII4 = new byte[((InputStream)IiiiiiiiIIIII5).available()];
                    int IiiiiiiiIIIII8 = 0;
                    int IiiiiiiiIIIII9 = 0;
                    while (((InputStream)IiiiiiiiIIIII5).available() > 0) {
                        IiiiiiiiIIIII8 = ((InputStream)IiiiiiiiIIIII5).read(IiiiiiiiIIIII4, IiiiiiiiIIIII9, ((InputStream)IiiiiiiiIIIII5).available());
                        IiiiiiiiIIIII9 += IiiiiiiiIIIII8;
                    }
                    ((InputStream)IiiiiiiiIIIII5).close();
                    IiiiiiiiIIIII2 = new IIiiIiiiiIIiI(IiiiiiiiIIIII4).ALLATORIxDEMO();
                    break block7;
                }
                ((InputStream)IiiiiiiiIIIII5).close();
            }
        }
        if (IiiiiiiiIIIII2 != null) return IiiiiiiiIIIII2;
        IiiiiiiiIIIII2 = new iIIIIiiiIiiIi();
        IiiiiiiiIIIII = new iiIiIiiiiiIIi(IiIIIiiiiiiiI, 0, 0);
        IiiiiiiiIIIII2.ALLATORIxDEMO((iiIiIiiiiiIIi)IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    public static short[] ALLATORIxDEMO(long key) {
        return IiiiIiiiIiIII.get(key);
    }

    public static int ALLATORIxDEMO(int color) {
        if (color == 0) {
            return 0;
        }
        int IiiiiiiiIIIII = color >> 16 & 0xFF;
        int IiiiiiiiIIIII2 = color >> 8 & 0xFF;
        int IiiiiiiiIIIII3 = color & 0xFF;
        int IiiiiiiiIIIII4 = color >> 24 & 0xFF;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII * 400 >>> 8;
        int IiiiiiiiIIIII6 = IiiiiiiiIIIII2 * 400 >>> 8;
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII3 * 400 >>> 8;
        IiiiiiiiIIIII = Math.min(IiiiiiiiIIIII5, 255);
        IiiiiiiiIIIII2 = Math.min(IiiiiiiiIIIII6, 255);
        IiiiiiiiIIIII3 = Math.min(IiiiiiiiIIIII7, 255);
        return IiiiiiiiIIIII4 << 24 | IiiiiiiiIIIII << 16 | IiiiiiiiIIIII2 << 8 | IiiiiiiiIIIII3;
    }

    public static IIIIIiiiIiIii iIiIiiiiIIiii(String path) {
        SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII = iIiiIiiiIiIIi.get(path);
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.get() != null) return IiiiiiiiIIIII.get();
        }
        iiiiiiiiiiIiI.ALLATORIxDEMO((Object)path);
        return null;
    }

    public static long[] ALLATORIxDEMO(long skin, int act) {
        if (act == -1) {
            return IIIIIiiiIiIIi.get(skin);
        }
        long[] IiiiiiiiIIIII = IIIIIiiiIiIIi.get((long)(act << 28) | skin);
        if (IiiiiiiiIIIII != null) {
            return IiiiiiiiIIIII;
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < iIiiIiiiiIiiI.length) {
            IiiiiiiiIIIII = IIIIIiiiIiIIi.get((long)(IiiiiiiiIIIII2 << 28) | skin);
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.length != 0) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII2;
        }
        return iiiIiiiiiiiIi;
    }

    /*
     * Unable to fully structure code
     */
    public static IIIIIiiiIiIii ALLATORIxDEMO(long skin, boolean is, short[] schemes) {
        block4: {
            IiiiiiiiIIIII = null;
            try {
                IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO((int)(skin >> 32));
                if (IiiiiiiiIIIII == null) break block4;
                IiiiiiiiIIIII = new byte[4];
                IiiiiiiiIIIII.ALLATORIxDEMO(skin & 0x7FFFFFFFL, IiiiiiiiIIIII);
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl16
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                break block4;
            }
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII] & 255;
                IiiiiiiiIIIII += (IiiiiiiiIIIII <<= 8 * ++IiiiiiiiIIIII);
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            IiiiiiiiIIIII = new byte[IiiiiiiiIIIII];
            IiiiiiiiIIIII.ALLATORIxDEMO(skin + 4L & 0x7FFFFFFFL, IiiiiiiiIIIII);
            IiiiiiiiIIIII = new IIiiIiiiiIIiI(IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(is, true, 1, schemes);
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO(1);
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public static BufferedImage ALLATORIxDEMO(IIiiIiiiiIIiI in, iiIiIiiiiiIIi frame, int frameCount, int refPixelX, int refPixelY, int width, int height) {
        try {
            if (frame.iIiIiiiiIIiIi() == 0) {
                return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            }
            if (frame.ALLATORIxDEMO() != null) {
                return (BufferedImage)frame.ALLATORIxDEMO();
            }
            in.ALLATORIxDEMO(frame.iIiIiiiiIIiIi());
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            frame.iIiIiiiiIIiii(IiiiiiiiIIIII);
            frame.iiiIiiiiiiIIi(IiiiiiiiIIIII);
            if (frameCount == 1) {
                IiiiiiiiIIIII = refPixelX;
                IiiiiiiiIIIII = refPixelY;
            }
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = new int[IiiiiiiiIIIII];
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII[IiiiiiiiIIIII++] = in.ALLATORIxDEMO();
            }
            if (IiiiiiiiIIIII == 0) return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            if (IiiiiiiiIIIII == 0) {
                return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
            }
            IiiiiiiiIIIII = in.ALLATORIxDEMO();
            IiiiiiiiIIIII = new BufferedImage(width, height, 2);
            IiiiiiiiIIIII = IiiiiiiiIIIII.getRaster();
            IiiiiiiiIIIII = refPixelX - IiiiiiiiIIIII;
            IiiiiiiiIIIII = refPixelY - IiiiiiiiIIIII;
            IiiiiiiiIIIII = new int[4];
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                block21: {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII] == 0) break block21;
                    IiiiiiiiIIIII = 0;
                    in.ALLATORIxDEMO(IiiiiiiiIIIII[IiiiiiiiIIIII] + frame.iIiIiiiiIIiIi());
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        block25: {
                            block24: {
                                block22: {
                                    block23: {
                                        IiiiiiiiIIIII = in.read();
                                        IiiiiiiiIIIII = IiiiiiiiIIIII & 192;
                                        if (IiiiiiiiIIIII != 0) break block22;
                                        if ((IiiiiiiiIIIII & 32) == 32) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                                            IiiiiiiiIIIII = IiiiiiiiIIIII << 3 | IiiiiiiiIIIII >>> 2;
                                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], IiiiiiiiIIIII);
                                            IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII);
                                            ++IiiiiiiiIIIII;
                                            continue;
                                        }
                                        if (IiiiiiiiIIIII == 0) break block23;
                                        IiiiiiiiIIIII = IiiiiiiiIIIII & 31;
                                        if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                                        }
                                        IiiiiiiiIIIII = in.read();
                                        IiiiiiiiIIIII = IiiiiiiiIIIII << 3 | IiiiiiiiIIIII >>> 2;
                                        iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], IiiiiiiiIIIII);
                                        IiiiiiiiIIIII = 0;
                                        if (true) ** GOTO lbl95
                                    }
                                    if (IiiiiiiiIIIII != 0 || IiiiiiiiIIIII == IiiiiiiiIIIII) break;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII - 1;
                                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                                    if (true) ** GOTO lbl101
                                }
                                if (IiiiiiiiIIIII != 64) break block24;
                                IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                                if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                    IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                                }
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl109
                            }
                            if (IiiiiiiiIIIII != 128) break block25;
                            IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                            if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                            }
                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], 255);
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl116
                        }
                        if (IiiiiiiiIIIII != 192) continue;
                        IiiiiiiiIIIII = IiiiiiiiIIIII & 63;
                        if (IiiiiiiiIIIII == 0) {
                            IiiiiiiiIIIII = in.read();
                            IiiiiiiiIIIII = in.read();
                            continue;
                        }
                        if (IiiiiiiiIIIII + IiiiiiiiIIIII > IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                            continue;
                        }
                        IiiiiiiiIIIII += IiiiiiiiIIIII;
                        continue;
                        do {
                            v0 = IiiiiiiiIIIII + IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(v0, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII);
lbl95:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        continue;
                        do {
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII.getPixel(IiiiiiiiIIIII, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII))[0] != 0 || IiiiiiiiIIIII[1] != 0 || IiiiiiiiIIIII[2] != 0 || IiiiiiiiIIIII[3] != 0) {
                                IiiiiiiiIIIII.setPixel(IiiiiiiiIIIII, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
lbl101:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        break;
                        do {
                            iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[in.read()], 255);
                            v1 = IiiiiiiiIIIII + IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(v1, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII);
lbl109:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                        continue;
                        do {
                            v2 = IiiiiiiiIIIII + IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            ++IiiiiiiiIIIII;
                            IiiiiiiiIIIII.setPixel(v2, IiiiiiiiIIIII + IiiiiiiiIIIII, IiiiiiiiIIIII);
lbl116:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                    }
                    if (IiiiiiiiIIIII > IiiiiiiiIIIII) {
                        System.err.println("block end error: [" + IiiiiiiiIIIII + "][" + IiiiiiiiIIIII + "/" + IiiiiiiiIIIII + "]");
                    }
                }
                ++IiiiiiiiIIIII;
            }
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return iiiiiiiiiiIiI.IiIIIiiiiiiiI;
        }
    }

    public static IiIIIiiiiiiIi[] ALLATORIxDEMO(long skin) {
        IiIIIiiiiiiIi[] IiiiiiiiIIIII;
        if (skin < 25000L) {
            skin = iiiiiiiiiiIiI.iIiIiiiiIIiii(skin);
        }
        if ((IiiiiiiiIIIII = iIiiIiiiiiiII.get(skin)) == null && skin > Integer.MAX_VALUE && skin >> 32 > 18L) {
            IiiiiiiiIIIII = iIiiIiiiiiiII.get((skin >> 32) - 18L << 32 | (long)((int)skin));
        }
        if (IiiiiiiiIIIII != null) return IiiiiiiiIIIII;
        skin = iiiiiiiiiiIiI.iIiIiiiiIIiii(skin & Integer.MAX_VALUE);
        IiiiiiiiIIIII = iIiiIiiiiiiII.get(skin);
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(Object object) {
        if (object == null) {
            return;
        }
        Object object2 = iiiiIiiiIIiii;
        synchronized (object2) {
            if (IiIIIiiiiIiiI.contains(object)) return;
            IiIIIiiiiIiiI.add(object);
            iiIIiiiiIiIIi.ALLATORIxDEMO();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int[] nArray, short s, int n) {
        void alpha;
        int[] iArray;
        void color;
        iArray[0] = color >>> 11 & 0x1F;
        iArray[1] = color >>> 5 & 0x3F;
        iArray[2] = color & 0x1F;
        iArray[0] = iArray[0] << 3 | iArray[0] & 7;
        iArray[1] = iArray[1] << 2 | iArray[1] & 3;
        iArray[2] = iArray[2] << 3 | iArray[2] & 7;
        nArray[3] = alpha;
    }

    public static synchronized IIIIIiiiIiIii ALLATORIxDEMO(String path) {
        SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII = iIiiIiiiIiIIi.get(path);
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.get() != null) return IiiiiiiiIIIII.get();
        }
        IIIIIiiiIiIii IiiiiiiiIIIII2 = iiiiiiiiiiIiI.ALLATORIxDEMO(path, null);
        iIiiIiiiIiIIi.put(path, new SoftReference<IIIIIiiiIiIii>(IiiiiiiiIIIII2));
        return IiiiiiiiIIIII2;
    }

    public static IIIIIiiiIiIii ALLATORIxDEMO(int act) {
        int IiiiiiiiIIIII = 0;
        if (act == 1 || act == 0 || act == 10) {
            IiiiiiiiIIIII = 1;
        } else if (act == 2 || act == 7) {
            IiiiiiiiIIIII = 2;
        } else if (act == 4 || act == 6) {
            IiiiiiiiIIIII = 3;
        } else if (act == 5 || act == 3 || act == 9 || act == 11 || act == 12) {
            IiiiiiiiIIIII = 4;
        } else if (act == 8) {
            IiiiiiiiIIIII = 5;
        }
        IIIIIiiiIiIii IiiiiiiiIIIII2 = IIiiIiiiIIiIi[IiiiiiiiIIIII];
        if (IiiiiiiiIIIII2 != null) return IiiiiiiiIIIII2;
        String IiiiiiiiIIIII3 = null;
        IiiiiiiiIIIII3 = IiiiiiiiIIIII == 1 ? "skin/\u706b\u67f4\u4eba/run.tcp" : (IiiiiiiiIIIII == 2 ? "skin/\u706b\u67f4\u4eba/stand.tcp" : (IiiiiiiiIIIII == 3 ? "skin/\u706b\u67f4\u4eba/hit.tcp" : (IiiiiiiiIIIII == 4 ? "skin/\u706b\u67f4\u4eba/magic.tcp" : (IiiiiiiiIIIII == 5 ? "sc/FightingSkill/\u6301\u7eed\u72b6\u6001/\u5893\u7891.tcp" : "sc/FightingSkill/1025.tcp"))));
        iiiiiiiiiiIiI.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiiiiiiiIIIII2 = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII3, null);
        return IiiiiiiiIIIII2;
    }

    public static IIIIIiiiIiIii ALLATORIxDEMO(long skin, int act) {
        SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII = IIIIiiiiiiiII.get(skin);
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.get() != null) return IiiiiiiiIIIII.get();
        }
        iiiiiiiiiiIiI.ALLATORIxDEMO((Object)(String.valueOf(act == 0 || act == 1 || act == 2 || act == 10 ? iIiIIiiiIiiiI.iIiiIiiiiiiII : iIiIIiiiIiiiI.iiIiiiiiiiIii) + skin));
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public static IiiiIiiiiIiIi ALLATORIxDEMO(IiiiIiiiiIiIi newPart, int lvl, String skin) {
        try {
            IiIIIiiiiiiIi[] IiiiiiiiIIIII;
            long IiiiiiiiIIIII2 = Long.parseLong(skin);
            long IiiiiiiiIIIII3 = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 != 0L) {
                skin = String.valueOf(IiiiiiiiIIIII3);
                IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
            }
            if ((IiiiiiiiIIIII = iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2)) == null) return newPart.ALLATORIxDEMO(lvl, skin);
            if (!SystemData.isOld) return newPart.ALLATORIxDEMO(lvl, IiiiiiiiIIIII2, IiiiiiiiIIIII);
            skin = String.valueOf(iiiiiiiiiiIiI.iiiIiiiiiiIIi(IiiiiiiiIIIII2));
        }
        catch (Exception IiiiiiiiIIIII2) {
            // empty catch block
        }
        return newPart.ALLATORIxDEMO(lvl, skin);
    }

    /*
     * Unable to fully structure code
     */
    public static boolean ALLATORIxDEMO(String filename) {
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 11) {
            block2: {
                if (!filename.endsWith(iiiiiiiiiiIiI.IiIIiiiiIIIII[IiiiiiiiIIIII])) break block2;
                IiiiiiiiIIIII = 11;
                ** GOTO lbl11
            }
            ++IiiiiiiiIIIII;
            continue;
            while (filename.indexOf(iiiiiiiiiiIiI.IiIIiiiiIIIII[IiiiiiiiIIIII]) == -1) {
                ++IiiiiiiiIIIII;
lbl11:
                // 2 sources

                if (IiiiiiiiIIIII < iiiiiiiiiiIiI.IiIIiiiiIIIII.length) continue;
                return true;
            }
            break block0;
        }
        return false;
    }

    public static long ALLATORIxDEMO(long newRole) {
        long IiiiiiiiIIIII = newRole & Integer.MAX_VALUE;
        if (newRole <= Integer.MAX_VALUE) return iiiiiiiiiiIiI.iIiIiiiiIIiii(newRole);
        if (newRole >> 40 > 0L) {
            return newRole;
        }
        long IiiiiiiiIIIII2 = newRole >> 32;
        if (IiiiiiiiIIIII == 23007L && IiiiiiiiIIIII2 != 10L && IiiiiiiiIIIII2 != 1L) {
            newRole = 0xA00000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 21012L && IiiiiiiiIIIII2 != 10L && IiiiiiiiIIIII2 != 14L) {
            newRole = 0xA00000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 20012L && IiiiiiiiIIIII2 != 8L && IiiiiiiiIIIII2 != 10L) {
            newRole = 0x800000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 22012L && IiiiiiiiIIIII2 != 11L && IiiiiiiiIIIII2 != 16L) {
            newRole = 0xB00000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 22011L && IiiiiiiiIIIII2 != 12L && IiiiiiiiIIIII2 != 7L) {
            newRole = 0xC00000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 23008L && IiiiiiiiIIIII2 != 1L && IiiiiiiiIIIII2 != 16L) {
            newRole = 0x100000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII == 20011L && IiiiiiiiIIIII2 != 7L && IiiiiiiiIIIII2 != 1L) {
            newRole = 0x700000000L | IiiiiiiiIIIII;
            return newRole;
        }
        if (IiiiiiiiIIIII != 21011L) return newRole;
        if (IiiiiiiiIIIII2 == 10L) return newRole;
        if (IiiiiiiiIIIII2 == 12L) return newRole;
        newRole = 0xA00000000L | IiiiiiiiIIIII;
        return newRole;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public static void ALLATORIxDEMO() {
        try {
            IIiIiiiiIIiII = null;
            Iterator<String> IiiiiiiiIIIII = iIiiIiiiIiIIi.keySet().iterator();
            while (IiiiiiiiIIIII.hasNext()) {
                String IiiiiiiiIIIII2 = IiiiiiiiIIIII.next();
                SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII3 = iIiiIiiiIiIIi.get(IiiiiiiiIIIII2);
                if (IiiiiiiiIIIII3 == null || IiiiiiiiIIIII3.get() == null || IiiiiiiiIIIII3.get().IIIIIiiiiIIii() == 0) {
                    IiiiiiiiIIIII.remove();
                    continue;
                }
                IiiiiiiiIIIII3.get().ALLATORIxDEMO(0);
            }
            Iterator<Long> IiiiiiiiIIIII4 = IIIIiiiiiiiII.keySet().iterator();
            while (IiiiiiiiIIIII4.hasNext()) {
                long IiiiiiiiIIIII5 = IiiiiiiiIIIII4.next();
                SoftReference<IIIIIiiiIiIii> IiiiiiiiIIIII6 = IIIIiiiiiiiII.get(IiiiiiiiIIIII5);
                if (IiiiiiiiIIIII6 == null || IiiiiiiiIIIII6.get() == null || IiiiiiiiIIIII6.get().IIIIIiiiiIIii() == 0) {
                    IiiiiiiiIIIII4.remove();
                    continue;
                }
                IiiiiiiiIIIII6.get().ALLATORIxDEMO(0);
            }
            Iterator<Integer> IiiiiiiiIIIII7 = iiIiIiiiiIIIi.keySet().iterator();
            while (IiiiiiiiIIIII7.hasNext()) {
                int IiiiiiiiIIIII8 = IiiiiiiiIIIII7.next();
                IiiIiiiiIIIii IiiiiiiiIIIII9 = iiIiIiiiiIIIi.get(IiiiiiiiIIIII8);
                if (IiiiiiiiIIIII9 != null && !IiiiiiiiIIIII9.ALLATORIxDEMO()) continue;
                IiiiiiiiIIIII7.remove();
            }
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static synchronized void ALLATORIxDEMO(Graphics2D g, int px, int py, AffineTransform transform, BufferedImage image) {
        if (iiIiiiiiiIIiI == null || iiIiiiiiiIIiI.getWidth() < image.getWidth() || iiIiiiiiiIIiI.getHeight() < image.getHeight()) {
            iiIiiiiiiIIiI = new BufferedImage(image.getWidth() < 120 ? 120 : image.getWidth(), image.getHeight() < 160 ? 160 : image.getHeight(), 2);
        }
        if (IIiIiiiiIIiII != image) {
            void IiiiiiiiIIIII;
            Graphics2D graphics2D = iiIiiiiiiIIiI.createGraphics();
            IiiiiiiiIIIII.setBackground(com.xy.q.iiIIiiiiIiiII.IIiIiiiiIIiII);
            graphics2D.clearRect(0, 0, iiIiiiiiiIIiI.getWidth(), iiIiiiiiiIIiI.getHeight());
            int IiiiiiiiIIIII2 = image.getHeight() - 1;
            while (IiiiiiiiIIIII2 >= 0) {
                int IiiiiiiiIIIII3 = image.getWidth() - 1;
                while (IiiiiiiiIIIII3 >= 0) {
                    int IiiiiiiiIIIII4 = image.getRGB(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
                    if (IiiiiiiiIIIII4 != 0) {
                        iiIiiiiiiIIiI.setRGB(IiiiiiiiIIIII3, IiiiiiiiIIIII2, iiiiiiiiiiIiI.ALLATORIxDEMO(IiiiiiiiIIIII4));
                    }
                    --IiiiiiiiIIIII3;
                }
                --IiiiiiiiIIIII2;
            }
            IiiiiiiiIIIII.dispose();
            IIiIiiiiIIiII = image;
        }
        Graphics2D graphics2D = g;
        if (transform != null) {
            graphics2D.drawImage(iiIiiiiiiIIiI, transform, null);
            return;
        }
        graphics2D.drawImage((Image)iiIiiiiiiIIiI, px, py, null);
    }
}
