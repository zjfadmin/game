/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

import java.math.BigDecimal;

public class Arith {
    private static final int DEF_DIV_SCALE = 10;

    public static void main(String[] stringArray) {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        double IiiiiiiiIIIII = 0.14;
        double IiiiiiiiIIIII2 = 100.0;
        System.out.println(Arith.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2));
        System.out.println(Arith.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2));
        System.out.println(Arith.iiiIiiiiiiIIi(IiiiiiiiIIIII, IiiiiiiiIIIII2));
        System.out.println(Arith.iIiIiiiiIIiIi(IiiiiiiiIIIII, IiiiiiiiIIIII2));
        System.out.println(Arith.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2, 1));
        System.out.println(Arith.ALLATORIxDEMO(IiiiiiiiIIIII, 1));
    }

    private /* synthetic */ Arith() {
    }

    public static double iIiIiiiiIIiIi(double v1, double v2) {
        return Arith.ALLATORIxDEMO(v1, v2, 10);
    }

    public static double iiiIiiiiiiIIi(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.multiply(IiiiiiiiIIIII2).doubleValue();
    }

    public static double iIiIiiiiIIiii(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.subtract(IiiiiiiiIIIII2).doubleValue();
    }

    public static double ALLATORIxDEMO(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.divide(IiiiiiiiIIIII2, scale, 4).doubleValue();
    }

    public static double ALLATORIxDEMO(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal("1");
        return IiiiiiiiIIIII.divide(IiiiiiiiIIIII2, scale, 4).doubleValue();
    }

    public static double ALLATORIxDEMO(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.add(IiiiiiiiIIIII2).doubleValue();
    }
}
