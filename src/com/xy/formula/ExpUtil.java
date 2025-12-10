/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 */
package com.xy.formula;

import com.xy.socket.GameClient;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ExpUtil {
    public static long DAY;
    public static long YEAR;

    public static long iIiIiiiiIIiii(int lvl) {
        return lvl * lvl * 15 - (lvl - 1) * (lvl - 1) * 15;
    }

    public static String ALLATORIxDEMO(BigDecimal raceId, int realmNow) {
        switch (raceId.toString()) {
            case "10001": {
                return ExpUtil.ALLATORIxDEMO("\u65cb\u7167\u671f|\u5f00\u5149\u671f|\u878d\u5408\u671f|\u7075\u5bc2\u671f", realmNow);
            }
            case "10002": {
                return ExpUtil.ALLATORIxDEMO("\u9b54\u5149\u671f|\u51dd\u5143\u671f|\u7ed3\u4e39\u671f|\u79bb\u5a74\u671f", realmNow);
            }
            case "10004": {
                return ExpUtil.ALLATORIxDEMO("\u70bc\u9b42\u671f|\u6df7\u6c8c\u671f|\u7a7a\u51a5\u671f|\u795e\u6e38\u671f", realmNow);
            }
            case "10003": {
                return ExpUtil.ALLATORIxDEMO("\u5730\u4ed9\u671f|\u5929\u4ed9\u671f|\u7384\u4ed9\u671f|\u91d1\u4ed9\u671f", realmNow);
            }
        }
        return null;
    }

    public static int ALLATORIxDEMO(int level) {
        if (level >= 437) {
            return 4;
        }
        if (level >= 417) {
            return 3;
        }
        if (level >= 335) {
            return 2;
        }
        if (level < 315) return 0;
        return 1;
    }

    public static long ALLATORIxDEMO(long exp) {
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII <= 20) {
            if ((long)((IiiiiiiiIIIII * 250 + 50 + 300) * IiiiiiiiIIIII / 2) > exp) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return 20L;
    }

    public static int getTSX(int P) {
        int IiiiiiiiIIIII = 9;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (true) {
            if (IiiiiiiiIIIII3 % 2 == 0) {
                ++IiiiiiiiIIIII2;
            }
            if (IiiiiiiiIIIII3 % 38 == 4) {
                ++IiiiiiiiIIIII2;
            }
            if (P < (IiiiiiiiIIIII += IiiiiiiiIIIII2)) return P;
            ++IiiiiiiiIIIII3;
            P -= IiiiiiiiIIIII;
        }
    }

    public static long ALLATORIxDEMO(int lvl) {
        return lvl * lvl * 15;
    }

    static {
        YEAR = 4380L;
        DAY = 12L;
    }

    public static String ALLATORIxDEMO(String raceNmae, int realmNow) {
        if (realmNow > 0) return raceNmae.split("\\|")[realmNow - 1];
        return null;
    }

    public static long getPetSkillMaxExp(long level) {
        return level * 250L + 50L;
    }

    public static int ALLATORIxDEMO(int realm, GameClient gameClient) {
        switch (realm) {
            case 1: {
                return 15;
            }
            case 2: {
                return 25;
            }
            case 3: {
                return 40;
            }
            case 4: {
                if (!gameClient.gameNewTyc) return 60;
                return 120;
            }
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(long exp) {
        void IiiiiiiiIIIII;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(exp / YEAR);
        stringBuffer.append("\u5e74");
        IiiiiiiiIIIII.append((exp %= YEAR) / DAY);
        IiiiiiiiIIIII.append("\u5929");
        IiiiiiiiIIIII.append(exp %= DAY);
        IiiiiiiiIIIII.append("\u65f6\u8fb0");
        return IiiiiiiiIIIII.toString();
    }

    public static int getTSP(int P) {
        int IiiiiiiiIIIII = 9;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (true) {
            if (IiiiiiiiIIIII3 % 2 == 0) {
                ++IiiiiiiiIIIII2;
            }
            if (IiiiiiiiIIIII3 % 38 == 4) {
                ++IiiiiiiiIIIII2;
            }
            if (P < (IiiiiiiiIIIII += IiiiiiiiIIIII2)) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII3;
            P -= IiiiiiiiIIIII;
        }
    }

    public static long getPetSkillNowExp(long exp) {
        long IiiiiiiiIIIII = ExpUtil.ALLATORIxDEMO(exp);
        long IiiiiiiiIIIII2 = ((IiiiiiiiIIIII - 1L) * 250L + 50L + 300L) * (IiiiiiiiIIIII - 1L) / 2L;
        return exp - IiiiiiiiIIIII2;
    }

    public static int getTSExp(int lvl) {
        int IiiiiiiiIIIII = 9;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < lvl) {
            if (IiiiiiiiIIIII3 % 2 == 0) {
                ++IiiiiiiiIIIII2;
            }
            if (IiiiiiiiIIIII3 % 38 == 4) {
                ++IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII += IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public static int getMountExp(int grade) {
        if (grade <= 100) return (grade + 1) * (grade + 1) * 15;
        grade -= 90;
        return (grade + 1) * (grade + 1) * 15;
    }
}
