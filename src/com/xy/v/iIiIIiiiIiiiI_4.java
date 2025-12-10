/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIiiiI {
    public static int IiiiIiiiIiIII;
    public static Calendar IIiiiiiiiIIIi;
    static SimpleDateFormat IIIiiiiiIIiII;
    private static long iiIiiiiiiIIiI;
    private static long iIiiIiiiIiIIi;
    private static long iiiiIiiiIIiii;
    private static int iIIiIiiiiiiIi;
    public static int IIIIiiiiiiiII;
    private static int iiIIIiiiiiiiI;
    private static long IiIiiiiiIIIII;
    public static int iiIiIiiiiIIIi;
    private static int iiiiIiiiIiiII;
    private static long iiiIiiiiiiiIi;
    private static long iIiiIiiiiiiII;
    public static int IIiiIiiiIIiIi;
    private static int iIiIiiiiIiIii;
    private static long IiIIIiiiiIiiI;
    public static boolean iiIiiiiiiiIii;
    private static Object IiiiiiiiIIIII;
    private static long ALLATORIxDEMO;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String iiiIiiiiiiIIi(long time) {
        ++iIiiIiiiIiIIi;
        iiiiIiiiIIiii += time;
        iiIiiiiiiIIiI += time;
        Object object = IiiiiiiiIIIII;
        synchronized (object) {
            ALLATORIxDEMO = Math.max(ALLATORIxDEMO, iIiIIiiiIiiiI.iIiIiiiiIIiii());
        }
        if (iIiiIiiiIiIIi % 60L != 0L) {
            return null;
        }
        IIiiiiiiiIIIi.setTimeInMillis(iIiIIiiiIiiiI.iIiIiiiiIIiii());
        int IiiiiiiiIIIII = IIiiiiiiiIIIi.get(11);
        int IiiiiiiiIIIII2 = IIiiiiiiiIIIi.get(12);
        if (IiiiiiiiIIIII == iIiIiiiiIiIii && IiiiiiiiIIIII2 == iiiiIiiiIiiII) {
            return null;
        }
        iIiIiiiiIiIii = IiiiiiiiIIIII;
        iiiiIiiiIiiII = IiiiiiiiIIIII2;
        return iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    public static void iIiIiiiiIIiii(long serverTime) {
        if (iiiIiiiiiiiIi >= serverTime) {
            return;
        }
        iiIiiiiiiIIiI = 0L;
        iiiIiiiiiiiIi = serverTime;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long iiiIiiiiiiIIi() {
        Object object = IiiiiiiiIIIII;
        synchronized (object) {
            return ++ALLATORIxDEMO;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(long initTime) {
        if (IiIiiiiiIIIII != 0L) {
            iIiIIiiiIiiiI.iIiIiiiiIIiii(initTime);
            return;
        }
        IiIiiiiiIIIII = initTime;
        iiIiiiiiiIIiI = 0L;
        iiiIiiiiiiiIi = initTime;
        iiiiIiiiIIiii = initTime;
        IiIIIiiiiIiiI = System.currentTimeMillis();
        Object object = IiiiiiiiIIIII;
        synchronized (object) {
            ALLATORIxDEMO = Math.max(initTime, ALLATORIxDEMO);
        }
        IIiiiiiiiIIIi.setTimeInMillis(iIiIIiiiIiiiI.iIiIiiiiIIiii());
        iIiIiiiiIiIii = IIiiiiiiiIIIi.get(11);
        iiiiIiiiIiiII = IIiiiiiiiIIIi.get(12);
        iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    public static String iIiIiiiiIIiii() {
        return (iIiIiiiiIiIii < 10 ? "0" + iIiIiiiiIiIii : Integer.valueOf(iIiIiiiiIiIii)) + ":" + (iiiiIiiiIiiII < 10 ? "0" + iiiiIiiiIiiII : Integer.valueOf(iiiiIiiiIiiII));
    }

    public static long iIiIiiiiIIiii() {
        return iiiIiiiiiiiIi + iiIiiiiiiIIiI;
    }

    public static String ALLATORIxDEMO() {
        if (iIiIiiiiIiIii == 23 || iIiIiiiiIiIii == 0) {
            iiIiiiiiiiIii = true;
            return "\u5b50 \u65f6";
        }
        if (iIiIiiiiIiIii == 1 || iIiIiiiiIiIii == 2) {
            iiIiiiiiiiIii = true;
            return "\u4e11 \u65f6";
        }
        if (iIiIiiiiIiIii == 3 || iIiIiiiiIiIii == 4) {
            iiIiiiiiiiIii = true;
            return "\u5bc5 \u65f6";
        }
        if (iIiIiiiiIiIii == 5 || iIiIiiiiIiIii == 6) {
            iiIiiiiiiiIii = true;
            return "\u536f \u65f6";
        }
        if (iIiIiiiiIiIii == 7 || iIiIiiiiIiIii == 8) {
            iiIiiiiiiiIii = false;
            return "\u8fb0 \u65f6";
        }
        if (iIiIiiiiIiIii == 9 || iIiIiiiiIiIii == 10) {
            iiIiiiiiiiIii = false;
            return "\u5df3 \u65f6";
        }
        if (iIiIiiiiIiIii == 11 || iIiIiiiiIiIii == 12) {
            iiIiiiiiiiIii = false;
            return "\u5348 \u65f6";
        }
        if (iIiIiiiiIiIii == 13 || iIiIiiiiIiIii == 14) {
            iiIiiiiiiiIii = false;
            return "\u672a \u65f6";
        }
        if (iIiIiiiiIiIii == 15 || iIiIiiiiIiIii == 16) {
            iiIiiiiiiiIii = false;
            return "\u7533 \u65f6";
        }
        if (iIiIiiiiIiIii == 17 || iIiIiiiiIiIii == 18) {
            iiIiiiiiiiIii = false;
            return "\u9149 \u65f6";
        }
        if (iIiIiiiiIiIii == 19 || iIiIiiiiIiIii == 20) {
            iiIiiiiiiiIii = true;
            return "\u8f9b \u65f6";
        }
        if (iIiIiiiiIiIii != 21) {
            if (iIiIiiiiIiIii != 22) return "\u5b50 \u65f6";
        }
        iiIiiiiiiiIii = true;
        return "\u4ea5 \u65f6";
    }

    public static boolean ALLATORIxDEMO() {
        if (iiiiIiiiIIiii - iIiiIiiiiiiII < (long)IIIIiiiiiiiII) {
            return true;
        }
        iIiiIiiiiiiII = iiiiIiiiIIiii;
        return false;
    }

    public static synchronized String iIiIiiiiIIiii(long seconds) {
        return IIIiiiiiIIiII.format(new Date(seconds));
    }

    static {
        IIIIiiiiiiiII = 200;
        IiiiIiiiIiIII = 60000;
        IIiiIiiiIIiIi = 10000;
        iiIiIiiiiIIIi = 300000;
        IiiiiiiiIIIII = new Object();
        ALLATORIxDEMO = 1000000000000L;
        iIIiIiiiiiiIi = 3600000;
        iiIIIiiiiiiiI = 60000;
        IIiiiiiiiIIIi = Calendar.getInstance(Locale.CHINA);
        IIIiiiiiIIiII = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static String ALLATORIxDEMO(long seconds, String format) {
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date(seconds));
    }

    public static String ALLATORIxDEMO(long time) {
        int IiiiiiiiIIIII = (int)Math.max(0L, (time -= iIiIIiiiIiiiI.iIiIiiiiIIiii()) / (long)iIIiIiiiiiiIi);
        int IiiiiiiiIIIII2 = (int)Math.max(0L, (time -= (long)(IiiiiiiiIIIII * iIIiIiiiiiiIi)) / (long)iiIIIiiiiiiiI);
        time -= (long)(IiiiiiiiIIIII2 * iiIIIiiiiiiiI);
        time /= 1000L;
        if (IiiiiiiiIIIII > 0) {
            return String.valueOf(IiiiiiiiIIIII) + "\u65f6" + IiiiiiiiIIIII2 + "\u5206" + time + "\u79d2";
        }
        if (IiiiiiiiIIIII2 > 0) {
            return String.valueOf(IiiiiiiiIIIII2) + "\u5206" + time + "\u79d2";
        }
        if (time <= 0L) return "0\u79d2";
        return String.valueOf(time) + "\u79d2";
    }

    public static long ALLATORIxDEMO() {
        return iiiiIiiiIIiii;
    }
}
