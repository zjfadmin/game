/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IIIIIiiiIiIii
 */
package com.xy.formula;

import com.xy.readbean.Goodstable;
import com.xy.v.IIIIIiiiIiIii;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GoodType {
    public static String[] Extras = new String[]{"\u70bc\u5316\u5c5e\u6027", "\u70bc\u5668\u5c5e\u6027", "\u795e\u5175\u5c5e\u6027", "\u5957\u88c5\u5c5e\u6027", "\u5b9d\u77f3\u5c5e\u6027", "\u89c9\u9192\u6280", "\u4e94\u884c\u5c5e\u6027", "\u661f\u9635\u5c5e\u6027", "\u70b9\u7cb9\u5c5e\u6027", "\u77f3\u5934\u5c5e\u6027"};
    static List<String> strings = IIIIIiiiIiIii.iIiIiiiiIIiii((String)"0-1|8|49-52|88|99|100|105|107|111|112|116-120|123-127|131-138|151|189|190|191|193|212|214|492-505|507|513-515|521-524|555|559|560|715|716|721|901-910|2040-2043|2053|2070-2079|2080|2113-2116|7005|7010|801-802|1002|1003|1005|1006|1008|2323|2324|2525|728|556|557|889|891|744|8889-8893|60003|7500-7502|7511|5001-5006|777|778|8902|8903");

    public static String getExtra(String value, String extra) {
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].length() >= 4 && IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(0, 4).equals(extra)) {
                return IiiiiiiiIIIII[IiiiiiiiIIIII2];
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public static boolean IiIiIiiiIIIiI(long type) {
        if (type != 120L) return false;
        return true;
    }

    public static int iIiIiiiiIIiii(long type) {
        if (type == 123L) {
            return 0;
        }
        if (type == 124L) {
            return 2;
        }
        if (type == 125L) {
            return 5;
        }
        if (type == 126L) {
            return 1;
        }
        if (type != 127L) return -1;
        return 3;
    }

    public static boolean iIIIiiiiiIiIi(long type) {
        if (type != 606L) return false;
        return true;
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

    public static String ALLATORIxDEMO(String[] v, int type, String newEx) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < v.length) {
            if (v[IiiiiiiiIIIII2].startsWith(Extras[type])) {
                if (newEx != null && !newEx.equals("")) {
                    if (IiiiiiiiIIIII2 != 0) {
                        IiiiiiiiIIIII.append("|");
                    }
                    IiiiiiiiIIIII.append(newEx);
                    newEx = null;
                }
            } else {
                if (IiiiiiiiIIIII2 != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(v[IiiiiiiiIIIII2]);
            }
            ++IiiiiiiiIIIII2;
        }
        if (newEx == null) return IiiiiiiiIIIII.toString();
        IiiiiiiiIIIII.append("|");
        IiiiiiiiIIIII.append(newEx);
        return IiiiiiiiIIIII.toString();
    }

    public static boolean IiIIIiiiIiiiI(long type) {
        if (GoodType.iiIIiiiiiIIIi(type)) return true;
        if (type == 770L) return true;
        if (type == 744L) return true;
        return false;
    }

    public static boolean IiiIiiiiIIiII(long type) {
        if (type == 603L) return true;
        if (type == 7002L) return true;
        if (type != 6800L) return false;
        return true;
    }

    public static boolean IIIiiiiiIIIII(long type) {
        if (type == 800L) return true;
        if (type == 6500L) return true;
        if (type != 7004L) return false;
        return true;
    }

    public static String ALLATORIxDEMO(long type) {
        String IiiiiiiiIIIII = null;
        switch (GoodType.ALLATORIxDEMO(type)) {
            case 0: {
                IiiiiiiiIIIII = "\u6b66\u5668";
                break;
            }
            case 1: {
                IiiiiiiiIIIII = "\u5e3d\u5b50";
                break;
            }
            case 2: {
                IiiiiiiiIIIII = "\u9879\u94fe";
                break;
            }
            case 3: {
                IiiiiiiiIIIII = "\u8863\u670d";
                break;
            }
            case 4: {
                IiiiiiiiIIIII = "\u62a4\u8eab\u7b26";
                break;
            }
            case 5: {
                IiiiiiiiIIIII = "\u978b\u5b50";
                break;
            }
            case 12: {
                IiiiiiiiIIIII = "\u7fc5\u8180";
                break;
            }
            case 6: {
                IiiiiiiiIIIII = "\u9762\u5177";
                break;
            }
            case 7: {
                IiiiiiiiIIIII = "\u8170\u5e26";
                break;
            }
            case 8: {
                IiiiiiiiIIIII = "\u62ab\u98ce";
                break;
            }
            case 9: {
                IiiiiiiiIIIII = "\u6302\u4ef6";
                break;
            }
            case 10: 
            case 11: {
                IiiiiiiiIIIII = "\u6212\u6307";
                break;
            }
        }
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII;
        if (!GoodType.IIIIIiiiiIIii(type)) {
            if (!GoodType.iiiIIiiiiIIii(type)) return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = "\u4ed9\u5668" + IiiiiiiiIIIII;
        return IiiiiiiiIIIII;
    }

    public static boolean IIIIIiiiiiiIi(long type) {
        if (type < 7500L) return false;
        if (type > 7550L) return false;
        return true;
    }

    public static boolean iIiIIiiiIiiIi(long type) {
        if (type == 123L) return true;
        if (type == 124L) return true;
        if (type == 125L) return true;
        if (type == 126L) return true;
        if (type != 127L) return false;
        return true;
    }

    public static boolean iiiiIiiiIIIiI(long type) {
        if (type == 800L) return true;
        if (type < 600L) return false;
        if (type > 605L) return false;
        return true;
    }

    public static boolean iiiiIiiiiIIII(long type) {
        if (type != 609L) return false;
        return true;
    }

    public static boolean iiIiiiiiiIiii(long type) {
        if (type == 602L) return true;
        if (type == 6900L) return true;
        if (type != 7003L) return false;
        return true;
    }

    public static boolean IiiIiiiiIiiiI(long type) {
        if (type == 1L) return true;
        if (type == 3L) return true;
        if (type == 5L) return true;
        return false;
    }

    public static boolean iiiIiiiiiIiii(long type) {
        if (type == 494L) return true;
        if (type == 495L) return true;
        if (type != 496L) return false;
        return true;
    }

    public static boolean IiIiIiiiIIiii(long type) {
        if (type == 605L) return true;
        if (type == 604L) return true;
        if (type == 6700L) return true;
        if (type == 6701L) return true;
        if (type != 7000L) return false;
        return true;
    }

    public static int ALLATORIxDEMO(long type) {
        if (GoodType.IIIiiiiiIIIII(type)) {
            return 0;
        }
        if (GoodType.IIIiIiiiIiIii(type)) {
            return 1;
        }
        if (GoodType.IiiIiiiiIIiII(type)) {
            return 2;
        }
        if (GoodType.IiIiIiiiIIiii(type)) {
            return 3;
        }
        if (GoodType.iiiIiiiiiiIIi(type)) return 4;
        if (GoodType.iiiiiiiiIIiii(type)) {
            return 4;
        }
        if (GoodType.iiIiiiiiiIiii(type)) {
            return 5;
        }
        if (GoodType.iiiiIiiiiIIII(type)) {
            return 6;
        }
        if (GoodType.IIiiIiiiiIiII(type)) {
            return 7;
        }
        if (GoodType.IIiiiiiiiIiIi(type)) {
            return 8;
        }
        if (GoodType.ALLATORIxDEMO(type)) {
            return 9;
        }
        if (!GoodType.iIIIiiiiiIiIi(type)) return -1;
        return 10;
    }

    public static boolean IIiiiiiiIIiiI(long type) {
        if (type == 493L) return true;
        if (type != 492L) return false;
        return true;
    }

    public static String getQualityColorOx(String qualityName) {
        switch (qualityName) {
            case "\u628a\u73a9": {
                return "#c29BF6B";
            }
            case "\u8d34\u8eab": {
                return "#c01FBF9";
            }
            case "\u73cd\u85cf": {
                return "#cEFEE0C";
            }
            case "\u65e0\u4ef7": {
                return "#cDB0ACD";
            }
            case "\u4f20\u4e16": {
                return "#cF35E01";
            }
            case "\u795e\u8ff9": {
                return "#cFB0001";
            }
        }
        return null;
    }

    public static boolean iiIIIiiiiiIII(long type) {
        if (type == 0L) return true;
        if (type != 1L) return false;
        return true;
    }

    public static boolean IIIiiiiiiiiII(long type) {
        if (type != 500L) return false;
        return true;
    }

    public static boolean iiIIiiiiiIIIi(long type) {
        if (type == 746L) return true;
        if (type == 749L) return true;
        if (type == 752L) return true;
        if (type == 755L) return true;
        if (type == 758L) return true;
        if (type == 761L) return true;
        if (type == 764L) return true;
        if (type == 767L) return true;
        return false;
    }

    public static boolean iiiIIiiiiIIii(long type) {
        if (type < 7000L) return false;
        if (type > 7004L) return false;
        return true;
    }

    public static boolean IiiIiiiiiIiII(long type) {
        if (type == 7503L) return true;
        if (type == 7504L) return true;
        if (type == 7505L) return true;
        if (type == 7506L) return true;
        if (type == 7507L) return true;
        if (type == 7508L) return true;
        if (type != 7509L) return false;
        return true;
    }

    public static boolean iIiIiiiiiIIiI(long type) {
        if (GoodType.iiiiIiiiiIIII(type)) return true;
        if (GoodType.IIiiIiiiiIiII(type)) return true;
        if (GoodType.IIiiiiiiiIiIi(type)) return true;
        if (GoodType.ALLATORIxDEMO(type)) return true;
        if (GoodType.iIIIiiiiiIiIi(type)) return true;
        return false;
    }

    public static boolean ALLATORIxDEMO(Long goodstype) {
        return strings.contains(goodstype.toString());
    }

    public static boolean IIiiiiiiiIiIi(long type) {
        if (type != 610L) return false;
        return true;
    }

    public static boolean IIIIIiiiIiIIi(long type) {
        if (type == 498L) return true;
        if (type == 497L) return true;
        if (type == 513L) return true;
        if (type == 514L) return true;
        if (type != 515L) return false;
        return true;
    }

    public static boolean iIiIIiiiiIIiI(long type) {
        if (type == 100L) return true;
        if (type == 8L) return true;
        if (type == 49L) return true;
        if (type == 88L) return true;
        if (type == 99L) return true;
        if (type == 111L) return true;
        if (type == 113L) return true;
        if (type == 212L) return true;
        if (type == 213L) return true;
        if (type == 501L) return true;
        if (type == 502L) return true;
        if (type == 503L) return true;
        if (type == 504L) return true;
        if (type == 716L) return true;
        if (type == 717L) return true;
        if (type == 718L) return true;
        if (type == 719L) return true;
        if (type == 720L) return true;
        if (type == 721L) return true;
        if (type == 7005L) return true;
        if (type == 118L) return true;
        if (type == 190L) return true;
        if (type == 1003L) return true;
        if (type == 1L) return true;
        if (type == 559L) return true;
        if (type == 555L) return true;
        if (type == 560L) return true;
        if (type == 559L) return true;
        if (type == 2525L) return true;
        if (type != 60005L) return false;
        return true;
    }

    public static boolean iiiiiiiiIiIiI(long type) {
        if (GoodType.IIIiiiiiIIIII(type)) return true;
        if (GoodType.IIIiIiiiIiIii(type)) return true;
        if (GoodType.IiiIiiiiIIiII(type)) return true;
        if (GoodType.IiIiIiiiIIiii(type)) return true;
        if (GoodType.iiIiiiiiiIiii(type)) return true;
        return false;
    }

    public static boolean IIiIIiiiiiIII(long type) {
        if (GoodType.IIIiIiiiIiIii(type)) return true;
        if (GoodType.IiiIiiiiIIiII(type)) return true;
        if (GoodType.IiIiIiiiIIiii(type)) return true;
        if (GoodType.iiiiIiiiiIIII(type)) return true;
        if (GoodType.IIiiIiiiiIiII(type)) return true;
        if (GoodType.IIiiiiiiiIiIi(type)) return true;
        if (GoodType.ALLATORIxDEMO(type)) return true;
        if (GoodType.iIIIiiiiiIiIi(type)) return true;
        return false;
    }

    public static boolean iiiiIiiiIiIiI(long type) {
        if (type != 8889L) return false;
        return true;
    }

    public static boolean IIiIIiiiiiIiI(long type) {
        if (type == 510L) return true;
        if (type == 511L) return true;
        if (type != 512L) return false;
        return true;
    }

    public static boolean IIIiIiiiIiIii(long type) {
        if (type == 601L) return true;
        if (type == 600L) return true;
        if (type == 6600L) return true;
        if (type == 6601L) return true;
        if (type == 600L) return true;
        if (type != 7001L) return false;
        return true;
    }

    public static int ALLATORIxDEMO(int leixing, long type) {
        if (leixing == 0) {
            if (type == 746L) {
                return 1;
            }
            if (type == 767L) {
                return 2;
            }
            if (type != 755L) return 0;
            return 3;
        }
        if (leixing == 1) {
            if (type == 761L) {
                return 1;
            }
            if (type != 749L) return 0;
            return 2;
        }
        if (leixing == 2) {
            if (type == 764L) {
                return 1;
            }
            if (type != 749L) return 0;
            return 2;
        }
        if (leixing == 3) {
            if (type == 761L) {
                return 1;
            }
            if (type != 764L) return 0;
            return 2;
        }
        if (leixing != 5) return 0;
        if (type == 758L) {
            return 1;
        }
        if (type != 752L) return 0;
        return 2;
    }

    public static boolean IIiIIiiiIiIIi(long type) {
        if (type == 2010L) return true;
        if (type == 2011L) return true;
        if (type != 2012L) return false;
        return true;
    }

    public static String[] ALLATORIxDEMO(String vlaue) {
        return vlaue.split("\\|");
    }

    public static boolean IIiiIiiiiIiII(long type) {
        if (type != 608L) return false;
        return true;
    }

    public static boolean IIIiiiiiiIIiI(long type) {
        if (type == 888L) return true;
        if (type == 100L) return true;
        if (type == 715L) return true;
        if (type == 2041L) return true;
        if (type == 2040L) return true;
        if (type != 2042L) return false;
        return true;
    }

    public static boolean IIIIIiiiiIIii(long type) {
        if (type == 6500L) return true;
        if (type == 6900L) return true;
        if (type == 6601L) return true;
        if (type == 6600L) return true;
        if (type == 6701L) return true;
        if (type == 6700L) return true;
        if (type == 6900L) return true;
        if (type != 6800L) return false;
        return true;
    }

    public static boolean iiiiiiiiIIiii(long type) {
        if (type != 612L) return false;
        return true;
    }

    public static boolean IiiIiiiiiiIiI(long type) {
        if (type >= 702L) {
            if (type <= 711L) return true;
        }
        if (type == 722L) return true;
        if (type != 723L) return false;
        return true;
    }

    public static boolean iIiIiiiiIIiIi(long type) {
        if (GoodType.iiiiIiiiiIIII(type)) {
            return true;
        }
        if (GoodType.IIiiIiiiiIiII(type)) {
            return true;
        }
        if (GoodType.IIiiiiiiiIiIi(type)) {
            return true;
        }
        if (GoodType.ALLATORIxDEMO(type)) {
            return true;
        }
        if (GoodType.iIIIiiiiiIiIi(type)) {
            return true;
        }
        if (!GoodType.iiiIiiiiiiIIi(type)) return false;
        return true;
    }

    public static String ALLATORIxDEMO(int etype) {
        String IiiiiiiiIIIII = null;
        switch (etype) {
            case 0: {
                IiiiiiiiIIIII = "\u6b66\u5668";
                return IiiiiiiiIIIII;
            }
            case 1: {
                IiiiiiiiIIIII = "\u5e3d\u5b50";
                return IiiiiiiiIIIII;
            }
            case 2: {
                IiiiiiiiIIIII = "\u9879\u94fe";
                return IiiiiiiiIIIII;
            }
            case 3: {
                IiiiiiiiIIIII = "\u8863\u670d";
                return IiiiiiiiIIIII;
            }
            case 4: {
                IiiiiiiiIIIII = "\u62a4\u8eab\u7b26";
                return IiiiiiiiIIIII;
            }
            case 5: {
                IiiiiiiiIIIII = "\u978b\u5b50";
                return IiiiiiiiIIIII;
            }
            case 12: {
                IiiiiiiiIIIII = "\u7fc5\u8180";
                return IiiiiiiiIIIII;
            }
            case 6: {
                IiiiiiiiIIIII = "\u9762\u5177";
                return IiiiiiiiIIIII;
            }
            case 7: {
                IiiiiiiiIIIII = "\u8170\u5e26";
                return IiiiiiiiIIIII;
            }
            case 8: {
                IiiiiiiiIIIII = "\u62ab\u98ce";
                return IiiiiiiiIIIII;
            }
            case 9: {
                IiiiiiiiIIIII = "\u6302\u4ef6";
                return IiiiiiiiIIIII;
            }
            case 10: 
            case 11: {
                IiiiiiiiIIIII = "\u6212\u6307";
                break;
            }
        }
        return IiiiiiiiIIIII;
    }

    public static boolean iiiIiiiiiiIIi(long type) {
        if (type != 611L) return false;
        return true;
    }

    public static boolean ALLATORIxDEMO(int leixing, long type) {
        if (leixing == 0) {
            if (type == 746L) return true;
            if (type == 755L) return true;
            if (type == 767L) return true;
            return false;
        }
        if (leixing == 1) {
            if (type == 749L) return true;
            if (type == 761L) return true;
            return false;
        }
        if (leixing == 2) {
            if (type == 749L) return true;
            if (type == 764L) return true;
            return false;
        }
        if (leixing == 3) {
            if (type == 761L) return true;
            if (type == 764L) return true;
            return false;
        }
        if (leixing != 5) return false;
        if (type == 752L) return true;
        if (type == 758L) return true;
        return false;
    }

    public static int getPetGoodType(Long type) {
        if (type == 510L) {
            return 0;
        }
        if (type == 511L) {
            return 1;
        }
        if (type == 512L) {
            return 2;
        }
        if (type != 729L) return 4;
        return 3;
    }

    public static boolean iIiIiiiiIIiii(long type) {
        if (type != 7005L) return false;
        return true;
    }

    public static boolean ALLATORIxDEMO(long type) {
        if (type != 607L) return false;
        return true;
    }

    public static boolean ALLATORIxDEMO(Goodstable good) {
        if (good.getGoodlock() == 1) return true;
        if (GoodType.IiiIiiiiIiiiI(good.getQuality())) {
            return true;
        }
        if (GoodType.ALLATORIxDEMO((long)good.getType()) == -1) return false;
        if (GoodType.getExtra(good.getValue(), Extras[3]) != null) {
            return true;
        }
        if (GoodType.getExtra(good.getValue(), Extras[4]) == null) return false;
        return true;
    }
}
