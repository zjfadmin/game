/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

import java.math.BigDecimal;

public class CustomFunction {
    private static final double LOGANDPOW15000 = 1.1760912590556813;
    private static final double LOGANDPOW25000 = 1.3979400086720375;
    private static final double LOGANDPOW10000 = 1.0;
    private static final double LOGANDPOW1 = 0.0625;
    private static final double LOGANDPOW20000 = 1.3010299956639813;

    /*
     * Unable to fully structure code
     */
    public static double ALLATORIxDEMO(long v, double xs) {
        if (v > 0L) ** GOTO lbl5
        return 0.0;
lbl-1000:
        // 1 sources

        {
            v /= 16L;
            xs *= 1.86;
lbl5:
            // 2 sources

            ** while (v / 16L > 0L)
        }
lbl6:
        // 1 sources

        return new BigDecimal(xs *= 1.0 + 0.86 * ((double)v / 16.0)).setScale(2, 4).doubleValue();
    }

    public static void main(String[] stringArray) {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        long IiiiiiiiIIIII = 20000000L;
        double IiiiiiiiIIIII2 = 0.0;
        double IiiiiiiiIIIII3 = 55.0;
        while (!(CustomFunction.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2 += 0.01) >= IiiiiiiiIIIII3)) {
        }
        System.out.println(String.valueOf(IiiiiiiiIIIII2) + ":" + CustomFunction.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2));
        System.out.println(String.valueOf(IiiiiiiiIIIII2) + ":" + CustomFunction.ALLATORIxDEMO(IiiiiiiiIIIII, 1.3));
    }

    public static double getLogAndPow(double lvl) {
        if (lvl == 25000.0) {
            return 1.3979400086720375;
        }
        if (lvl == 0.0) {
            return 0.0;
        }
        if (lvl == 1.0) {
            return 0.0625;
        }
        if (lvl == 10000.0) {
            return 1.0;
        }
        if (lvl == 15000.0) {
            return 1.1760912590556813;
        }
        if (lvl == 20000.0) {
            return 1.3010299956639813;
        }
        double IiiiiiiiIIIII = Math.log10(lvl);
        double IiiiiiiiIIIII2 = Math.pow(2.0, (int)IiiiiiiiIIIII) * 100.0;
        return (1.0 + (IiiiiiiiIIIII %= 1.0)) * IiiiiiiiIIIII2 / 1600.0;
    }
}
