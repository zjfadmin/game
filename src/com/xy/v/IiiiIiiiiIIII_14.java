/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiIIII {
    public static int ALLATORIxDEMO(String lvlstring) {
        int IiiiiiiiIIIII;
        if (lvlstring.endsWith("\u7ea7")) {
            lvlstring = lvlstring.substring(0, lvlstring.length() - 1);
        }
        if ((IiiiiiiiIIIII = lvlstring.indexOf("\u98de\u5347")) != -1) {
            return Integer.parseInt(lvlstring.substring(2)) + 459 - 139;
        }
        IiiiiiiiIIIII = lvlstring.indexOf("\u8f6c");
        if (IiiiiiiiIIIII == -1) return Integer.parseInt(lvlstring);
        if (lvlstring.startsWith("0\u8f6c")) return Integer.parseInt(lvlstring.substring(2));
        if (lvlstring.startsWith("\u672a\u8f6c")) {
            return Integer.parseInt(lvlstring.substring(2));
        }
        if (lvlstring.startsWith("1\u8f6c")) {
            return Integer.parseInt(lvlstring.substring(2)) + 102 - 14;
        }
        if (lvlstring.startsWith("2\u8f6c")) {
            return Integer.parseInt(lvlstring.substring(2)) + 210 - 14;
        }
        if (!lvlstring.startsWith("3\u8f6c")) return 0;
        return Integer.parseInt(lvlstring.substring(2)) + 338 - 59;
    }

    public static boolean iIiIiiiiIIiii(int lvl, String lvlstring) {
        if (lvl < IiiiIiiiiIIII.ALLATORIxDEMO(lvlstring)) return false;
        return true;
    }

    public static void main(String[] stringArray) {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        System.out.println(IiiiIiiiiIIII.ALLATORIxDEMO("\u98de\u5347120\u7ea7"));
    }

    public static int IIIIIiiiiIIii(int lvl) {
        if (lvl <= 100) {
            return 0;
        }
        if (lvl <= 221) {
            return 1;
        }
        if (lvl <= 362) {
            return 2;
        }
        if (lvl > 543) return 4;
        return 3;
    }

    public static double ALLATORIxDEMO(String value, String type) {
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
            if (IiiiiiiiIIIII3.length > 1 && type.equals(IiiiiiiiIIIII3[0])) {
                if (type.equals("\u6d3b\u8dc3")) return Double.parseDouble(IiiiiiiiIIIII3[1]);
                if (type.equals("\u901f\u5ea6")) return Double.parseDouble(IiiiiiiiIIIII3[1]);
                if (!type.equals("\u8d1f\u654f")) return Double.parseDouble(IiiiiiiiIIIII3[1]) / 100.0;
                return Double.parseDouble(IiiiiiiiIIIII3[1]);
            }
            ++IiiiiiiiIIIII2;
        }
        return 0.0;
    }

    public static BigDecimal iiiIiiiiiiIIi(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.multiply(IiiiiiiiIIIII2);
    }

    public static int iiiiiiiiIIiii(int lvl) {
        if (lvl <= 100) {
            return lvl;
        }
        if (lvl <= 221) {
            return lvl - 101;
        }
        if (lvl <= 362) {
            return lvl - 222;
        }
        if (lvl > 543) return lvl - 544;
        return lvl - 363;
    }

    public static int IiiIiiiiiiIiI(int lvl) {
        int IiiiiiiiIIIII = 5000;
        if (lvl <= 102) {
            return IiiiiiiiIIIII += 5000;
        }
        if (lvl <= 210) {
            return IiiiiiiiIIIII += 10000;
        }
        if (lvl > 338) return IiiiiiiiIIIII += 20000;
        return IiiiiiiiIIIII += 15000;
    }

    public static String iIiIiiiiIIiii(int lvl) {
        if (lvl <= 102) {
            return "0\u8f6c" + lvl;
        }
        if (lvl <= 210) {
            return "1\u8f6c" + (lvl - 102 + 14);
        }
        if (lvl <= 338) {
            return "2\u8f6c" + (lvl - 210 + 14);
        }
        if (lvl > 459) return "\u98de\u5347" + (lvl - 459 + 139);
        return "3\u8f6c" + (lvl - 338 + 59);
    }

    public static BigDecimal iIiIiiiiIIiii(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.subtract(IiiiiiiiIIIII2);
    }

    public static int[] ALLATORIxDEMO(String value) {
        int[] IiiiiiiiIIIII = new int[4];
        String[] IiiiiiiiIIIII2 = value.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=").length >= 2) {
                if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("HP")) {
                    IiiiiiiiIIIII[0] = Integer.parseInt(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("MP")) {
                    IiiiiiiiIIIII[1] = Integer.parseInt(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("HP%")) {
                    IiiiiiiiIIIII[2] = Integer.parseInt(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("MP%")) {
                    IiiiiiiiIIIII[3] = Integer.parseInt(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(int lvl) {
        if (lvl <= 100) {
            return "0\u8f6c" + lvl;
        }
        if (lvl <= 221) {
            return "1\u8f6c" + (lvl - 101);
        }
        if (lvl <= 362) {
            return "2\u8f6c" + (lvl - 222);
        }
        if (lvl > 543) return "\u70b9\u5316" + (lvl - 544);
        return "3\u8f6c" + (lvl - 363);
    }

    public static int iIiIiiiiIIiIi(int lvl) {
        if (lvl >= 150) return lvl - 144;
        return 6;
    }

    public static int iiiIiiiiiiIIi(int lvl) {
        return IiiiIiiiiIIII.iIiIiiiiIIiIi(lvl) * 5;
    }

    public static BigDecimal ALLATORIxDEMO(double v1, double v2) {
        BigDecimal IiiiiiiiIIIII = new BigDecimal(Double.toString(v1));
        BigDecimal IiiiiiiiIIIII2 = new BigDecimal(Double.toString(v2));
        return IiiiiiiiIIIII.add(IiiiiiiiIIIII2);
    }

    public static long[] ALLATORIxDEMO(String value) {
        long[] IiiiiiiiIIIII = new long[5];
        String[] IiiiiiiiIIIII2 = value.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=").length >= 2) {
                if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("\u94b1")) {
                    IiiiiiiiIIIII[0] = Long.parseLong(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("\u70b9")) {
                    IiiiiiiiIIIII[1] = Long.parseLong(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("\u7ecf\u9a8c")) {
                    IiiiiiiiIIIII[2] = Long.parseLong(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("\u4eb2\u5bc6")) {
                    IiiiiiiiIIIII[3] = Long.parseLong(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                } else if (IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[0].equals("\u6280\u80fd")) {
                    IiiiiiiiIIIII[4] = Long.parseLong(IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("=")[1]);
                }
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(long type) {
        if (type == 1L) return true;
        if (type == 3L) return true;
        if (type != 5L) return false;
        return true;
    }

    public static int iIiIiiiiIIiii(int lvl) {
        if (lvl <= 102) {
            return 0;
        }
        if (lvl <= 210) {
            return 1;
        }
        if (lvl <= 338) {
            return 2;
        }
        if (lvl > 459) return 4;
        return 3;
    }

    public static boolean ALLATORIxDEMO(int lvl, String lvlstring) {
        if (lvl > IiiiIiiiiIIII.ALLATORIxDEMO(lvlstring)) return false;
        return true;
    }

    public static int ALLATORIxDEMO(int lvl) {
        if (lvl <= 102) {
            return lvl;
        }
        if (lvl <= 210) {
            return lvl - 102 + 14;
        }
        if (lvl <= 338) {
            return lvl - 210 + 14;
        }
        if (lvl > 459) return lvl - 459 + 139;
        return lvl - 338 + 59;
    }

    public static String ALLATORIxDEMO(BigDecimal pkrecord) {
        int IiiiiiiiIIIII = pkrecord.intValue();
        if (IiiiiiiiIIIII < 100) {
            return "\u5165\u95e8" + IiiiiiiiIIIII + "\u70b9";
        }
        if (IiiiiiiiIIIII < 200) {
            return "\u8fdb\u9636" + (IiiiiiiiIIIII - 100) + "\u70b9";
        }
        if (IiiiiiiiIIIII < 300) {
            return "\u7cbe\u9510" + (IiiiiiiiIIIII - 200) + "\u70b9";
        }
        if (IiiiiiiiIIIII < 400) {
            return "\u82f1\u6770" + (IiiiiiiiIIIII - 300) + "\u70b9";
        }
        if (IiiiiiiiIIIII < 500) {
            return "\u8c6a\u4fa0" + (IiiiiiiiIIIII - 400) + "\u70b9";
        }
        if (IiiiiiiiIIIII < 600) {
            return "\u5b97\u5e08" + (IiiiiiiiIIIII - 500) + "\u70b9";
        }
        if (IiiiiiiiIIIII >= 700) return "\u738b\u8005" + (IiiiiiiiIIIII - 700) + "\u70b9";
        return "\u6b66\u5723" + (IiiiiiiiIIIII - 600) + "\u70b9";
    }
}
