/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.formula;

import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.v.IiiiIiiiiIiIi;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BaseValue {
    private static Map<String, Integer> maps;
    public static String babyTotal1;
    public static String[] babyKeys;
    public static final double[] basevs;
    public static int[] babyTotal3XS;
    public static String babyTotal3;
    public static final double[] bases;

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

    public static double getValue(BigDecimal raceid, int type, int zhi) {
        if (type != 0) return basevs[zhi + BaseValue.getratio(raceid) * 5];
        return bases[zhi + BaseValue.getratio(raceid) * 4];
    }

    public static int getUpStarData(String DataStr, int starLvl, String qualityAttr) {
        double IiiiiiiiIIIII = Double.parseDouble(DataStr);
        if (qualityAttr != null) return (int)(IiiiiiiiIIIII * (1.0 + (double)starLvl * 0.1) * (1.0 + BaseValue.getQualityAttr(qualityAttr)));
        return 0;
    }

    private static /* synthetic */ void ALLATORIxDEMO(String k, int v) {
        if (maps.get(k) == null) {
            return;
        }
        maps.put(k, maps.get(k) + v);
    }

    public static int getLxLvl(int value) {
        int IiiiiiiiIIIII = 0;
        while ((value -= BaseValue.getLxExp(++IiiiiiiiIIIII)) >= 0) {
        }
        return --IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public static BigDecimal getLxXHMoney(int n, GameClient gameClient) {
        void gameClient2;
        int lxLvl;
        ++lxLvl;
        if (gameClient.ALLATORIxDEMO(2, 12)) {
            if (lxLvl > 60) return new BigDecimal(200000);
            return new BigDecimal(100000);
        }
        if (gameClient2.gameType == 2) {
            if (lxLvl > 60) return new BigDecimal(1800000);
            return new BigDecimal(1200000);
        }
        if (gameClient2.gameType == 1) {
            if (lxLvl <= 10) {
                return new BigDecimal(2500000);
            }
            if (lxLvl <= 20) {
                return new BigDecimal(5000000);
            }
            if (lxLvl <= 35) {
                return new BigDecimal(10000000);
            }
            if (lxLvl <= 50) {
                return new BigDecimal(20000000);
            }
            if (lxLvl <= 60) {
                return new BigDecimal(300);
            }
            if (lxLvl > 90) return new BigDecimal(500);
            return new BigDecimal(400);
        }
        if (lxLvl <= 10) {
            return new BigDecimal(500000);
        }
        if (lxLvl <= 20) {
            return new BigDecimal(1000000);
        }
        if (lxLvl <= 35) {
            return new BigDecimal(2000000);
        }
        if (lxLvl <= 50) {
            return new BigDecimal(4000000);
        }
        if (lxLvl <= 60) {
            return new BigDecimal(60);
        }
        if (lxLvl > 90) return new BigDecimal(100);
        return new BigDecimal(80);
    }

    public static int getFv(Lingbao lingbao) {
        int IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII += lingbao.getLingbaolvl().intValue();
        return IiiiiiiiIIIII += BaseValue.getQv(lingbao.getBaoquality());
    }

    public static int getLxTotalExp(int lvl) {
        return (15 + 3 * lvl) * lvl / 2;
    }

    public static int getLxExp(int lvl) {
        return lvl * 3 + 6;
    }

    public static int getSHLYJBySX(int lvl) {
        if (lvl <= 2) {
            return 2;
        }
        if (lvl > 8) return lvl * 2 - 8;
        return lvl;
    }

    public static int getMeridiansTotalExp(int lvl) {
        return (lvl + 1) * lvl * 50;
    }

    public static long getFZExp(long lvl) {
        if (lvl <= 100L) return lvl * 500L + 1000L;
        return 999999999L;
    }

    public static int getWingLevel(int exp) {
        int IiiiiiiiIIIII = 1;
        while (exp >= IiiiiiiiIIIII * IiiiiiiiIIIII * 100) {
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII - 1;
    }

    public static double ALLATORIxDEMO(double value, double sv, long qm, int lvl, int zs) {
        if (zs < 4) return value + (double)lvl / 200.0 * BaseValue.ALLATORIxDEMO(qm, sv);
        lvl = Math.max(lvl, 180);
        return value + (double)lvl / 200.0 * BaseValue.ALLATORIxDEMO(qm, sv);
    }

    public static Map<String, Integer> getProperty(Baby baby, BigDecimal[] bids, RoleData roleData) {
        BaseValue.ALLATORIxDEMO(baby);
        if (bids == null) return maps;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < bids.length) {
            Goodstable IiiiiiiiIIIII3 = roleData.getGoodEquip(bids[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII3 != null) {
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getValue().split("\\|");
                int IiiiiiiiIIIII5 = 1;
                while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                    String[] IiiiiiiiIIIII6 = IiiiiiiiIIIII4[IiiiiiiiIIIII5].split("=");
                    if (IiiiiiiiIIIII6[0].equals("\u7b49\u7ea7")) {
                        IiiiiiiiIIIII += Integer.parseInt(IiiiiiiiIIIII6[1]) >= 3 ? 1 : 0;
                    } else {
                        BaseValue.ALLATORIxDEMO(IiiiiiiiIIIII6[0], Integer.parseInt(IiiiiiiiIIIII6[1]));
                    }
                    ++IiiiiiiiIIIII5;
                }
            }
            ++IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII != 4) return maps;
        maps.put("\u76ae\u80a4", baby.getChildSex() == 0 ? 100005 + IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(3) * 2 : 100006 + IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(3) * 2);
        return maps;
    }

    public static int getMeridiansLvl(int value) {
        int IiiiiiiiIIIII = 0;
        while ((value -= BaseValue.getMeridiansExp(++IiiiiiiiIIIII)) >= 0) {
        }
        return IiiiiiiiIIIII;
    }

    public static double getQualityAttr(String qualityAttr) {
        switch (qualityAttr) {
            case "\u628a\u73a9": {
                return 0.0;
            }
            case "\u8d34\u8eab": {
                return 0.2;
            }
            case "\u73cd\u85cf": {
                return 0.4;
            }
            case "\u65e0\u4ef7": {
                return 0.8;
            }
            case "\u4f20\u4e16": {
                return 1.6;
            }
            case "\u795e\u8ff9": {
                return 3.2;
            }
        }
        return -1.0;
    }

    public static int getQv(String quality) {
        switch (quality) {
            case "\u628a\u73a9": {
                return 10;
            }
            case "\u8d34\u8eab": {
                return 20;
            }
            case "\u73cd\u85cf": {
                return 30;
            }
            case "\u65e0\u4ef7": {
                return 40;
            }
            case "\u4f20\u4e16": {
                return 50;
            }
            case "\u795e\u8ff9": {
                return 60;
            }
        }
        return 10;
    }

    /*
     * WARNING - void declaration
     */
    public static BigDecimal getFMXHMoney(int n, GameClient gameClient) {
        void gameClient2;
        int sld;
        ++sld;
        if (gameClient.gameType == 4) {
            return new BigDecimal(2000000);
        }
        if (gameClient2.ALLATORIxDEMO(2, 12)) {
            if (sld <= 2000) {
                return new BigDecimal(100000);
            }
            if (sld <= 4000) {
                return new BigDecimal(250000);
            }
            if (sld <= 6000) {
                return new BigDecimal(500000);
            }
            if (sld > 8000) return new BigDecimal(1000000);
            return new BigDecimal(750000);
        }
        if (gameClient2.gameType == 2) {
            if (sld <= 4000) {
                return new BigDecimal(12000000);
            }
            if (sld > 8000) return new BigDecimal(36000000);
            return new BigDecimal(24000000);
        }
        if (gameClient2.gameType == 3) {
            if (sld <= 1000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 2000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 3000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 4000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 5000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 6000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 7000) {
                return new BigDecimal(100);
            }
            if (sld <= 8000) {
                return new BigDecimal(150);
            }
            if (sld > 9000) return new BigDecimal(250);
            return new BigDecimal(200);
        }
        if (gameClient2.gameType == 1) {
            if (sld <= 1000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 2000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 3000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 4000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 5000) {
                return new BigDecimal(5000000);
            }
            if (sld <= 6000) {
                return new BigDecimal(50);
            }
            if (sld <= 7000) {
                return new BigDecimal(100);
            }
            if (sld <= 8000) {
                return new BigDecimal(150);
            }
            if (sld > 9000) return new BigDecimal(250);
            return new BigDecimal(200);
        }
        if (sld <= 1000) {
            return new BigDecimal(50000000);
        }
        if (sld <= 2000) {
            return new BigDecimal(80000000);
        }
        if (sld <= 4000) {
            return new BigDecimal(50);
        }
        if (sld <= 6000) {
            return new BigDecimal(100);
        }
        if (sld > 8000) return new BigDecimal(200);
        return new BigDecimal(150);
    }

    public static long getFZLvl(long value) {
        int IiiiiiiiIIIII = 0;
        while ((value -= BaseValue.getFZExp(++IiiiiiiiIIIII)) >= 0L) {
        }
        return --IiiiiiiiIIIII;
    }

    public static int getFBlvl(int t, int g, int zlvl, int qv, int lvl) {
        int IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII += (g += t * 25) * 3;
        IiiiiiiiIIIII += zlvl;
        return (IiiiiiiiIIIII += (qv += lvl) * 7) >> 5;
    }

    /*
     * WARNING - void declaration
     */
    public static BigDecimal getFMXHExp(int n, GameClient gameClient) {
        void gameClient2;
        int sld;
        ++sld;
        if (gameClient.gameType == 1) {
            return new BigDecimal(12000000);
        }
        if (gameClient2.gameType == 2) {
            if (sld <= 2000) {
                return new BigDecimal(32000000);
            }
            if (sld <= 4000) {
                return new BigDecimal(40000000);
            }
            if (sld <= 6000) {
                return new BigDecimal(48000000);
            }
            if (sld > 8000) return new BigDecimal(80000000);
            return new BigDecimal(60000000);
        }
        if (sld <= 2000) {
            return new BigDecimal(4000000);
        }
        if (sld <= 4000) {
            return new BigDecimal(5000000);
        }
        if (sld <= 6000) {
            return new BigDecimal(6000000);
        }
        if (sld > 8000) return new BigDecimal(8000000);
        return new BigDecimal(7000000);
    }

    public static Color getPalLvlColor(double grow) {
        if (grow == 1.0) {
            return Color.green;
        }
        if (grow == 1.1) {
            return Color.cyan;
        }
        if (grow == 1.22) {
            return Color.ORANGE;
        }
        if (grow == 1.36) {
            return Color.red;
        }
        if (grow == 1.52) {
            return Color.red;
        }
        if (grow == 1.7) {
            return Color.red;
        }
        if (grow != 1.9) return Color.green;
        return Color.red;
    }

    public static int getMeridiansExp(int lvl) {
        return lvl * 100;
    }

    public static String getPalLvl(double grow) {
        if (grow == 1.0) {
            return "\u8d44\u8d28\u5e73\u5e73";
        }
        if (grow == 1.1) {
            return "\u51fa\u7c7b\u62d4\u8403";
        }
        if (grow == 1.22) {
            return "\u795e\u901a\u5e7f\u5927";
        }
        if (grow == 1.36) {
            return "\u4e07\u4e2d\u65e0\u4e00";
        }
        if (grow == 1.52) {
            return "\u5320\u5fc3\u72ec\u8fd0";
        }
        if (grow == 1.7) {
            return "\u8d85\u51e1\u5165\u5723";
        }
        if (grow != 1.9) return "\u8d44\u8d28\u5e73\u5e73";
        return "\u4e5d\u4e5d\u5f52\u4e00";
    }

    public static int getPalBtnArrStr(String text) {
        if (text.equals("1\u53f7")) {
            return 1;
        }
        if (text.equals("2\u53f7")) {
            return 2;
        }
        if (text.equals("3\u53f7")) {
            return 3;
        }
        if (!text.equals("4\u53f7")) return 0;
        return 4;
    }

    private static /* synthetic */ void ALLATORIxDEMO(Baby baby) {
        if (maps == null) {
            maps = new HashMap<String, Integer>();
        } else {
            maps.clear();
        }
        maps.put("\u6c14\u8d28", baby.getQizhi());
        maps.put("\u5185\u529b", baby.getNeili());
        maps.put("\u667a\u529b", baby.getZhili());
        maps.put("\u8010\u529b", baby.getNaili());
        maps.put("\u540d\u6c14", baby.getMingqi());
        maps.put("\u9053\u5fb7", baby.getDaode());
        maps.put("\u53db\u9006", baby.getPanni());
        maps.put("\u73a9\u6027", baby.getWanxing());
        maps.put("\u5b5d\u5fc3", baby.getXiaoxin());
        maps.put("\u76ae\u80a4", baby.getChildSex() == 0 ? 100001 : 100002);
    }

    static {
        bases = new double[]{360.0, 300.0, 70.0, 8.0, 330.0, 210.0, 80.0, 10.0, 300.0, 390.0, 60.0, 10.0, 270.0, 350.0, 80.0, 9.0, 300.0, 240.0, 80.0, 10.0};
        basevs = new double[]{1.2, 1.0, 0.95, 0.8, 1.05, 1.1, 0.6, 1.3, 1.0, 1.0, 1.0, 1.4, 0.7, 1.0, 0.9, 1.25, 1.05, 0.95, 0.75, 0.9, 0.9, 0.7, 1.3, 1.0, 1.0};
        babyTotal1 = "\u603b\u57fa\u7840";
        babyTotal3 = "\u8bc4\u5206";
        babyTotal3XS = new int[]{600, 180, 150, 120, 90, 60, 30};
        babyKeys = new String[]{"\u5e74\u9f84", "\u6c14\u8d28", "\u5185\u529b", "\u667a\u529b", "\u8010\u529b", "\u540d\u6c14", "\u9053\u5fb7", "\u53db\u9006", "\u73a9\u6027", "\u4eb2\u5bc6", "\u5b5d\u5fc3", "\u6e29\u9971"};
    }

    public static BigDecimal getLxXHQm(int n, GameClient gameClient) {
        int lxLvl;
        ++lxLvl;
        if (gameClient.gameType == 1) {
            if (lxLvl <= 10) {
                return new BigDecimal(1000);
            }
            if (lxLvl <= 20) {
                return new BigDecimal(2000);
            }
            if (lxLvl <= 35) {
                return new BigDecimal(3000);
            }
            if (lxLvl <= 50) {
                return new BigDecimal(4000);
            }
            if (lxLvl <= 60) {
                return new BigDecimal(6000);
            }
            if (lxLvl > 90) return new BigDecimal(10000);
            return new BigDecimal(8000);
        }
        if (lxLvl <= 10) {
            return new BigDecimal(200);
        }
        if (lxLvl <= 20) {
            return new BigDecimal(400);
        }
        if (lxLvl <= 35) {
            return new BigDecimal(600);
        }
        if (lxLvl <= 50) {
            return new BigDecimal(800);
        }
        if (lxLvl <= 60) {
            return new BigDecimal(1200);
        }
        if (lxLvl > 90) return new BigDecimal(2000);
        return new BigDecimal(1600);
    }

    public static double getCubeRoot(long input) {
        if (input == 0L) {
            return 0.0;
        }
        double IiiiiiiiIIIII = input;
        double IiiiiiiiIIIII2 = 2.0 * IiiiiiiiIIIII / 3.0 + (double)input / (IiiiiiiiIIIII * IiiiiiiiIIIII * 3.0);
        while (Math.abs(IiiiiiiiIIIII2 - IiiiiiiiIIIII) > 1.0E-6) {
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
            IiiiiiiiIIIII2 = 2.0 * IiiiiiiiIIIII / 3.0 + (double)input / (IiiiiiiiIIIII * IiiiiiiiIIIII * 3.0);
        }
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static BigDecimal getLxXHExp(int n, GameClient gameClient) {
        void gameClient2;
        int lxLvl;
        ++lxLvl;
        if (gameClient.ALLATORIxDEMO(2, 12)) {
            if (lxLvl > 60) return new BigDecimal(15000000);
            return new BigDecimal(10000000);
        }
        if (gameClient2.gameType == 2) {
            if (lxLvl > 40) return new BigDecimal(7500000);
            return new BigDecimal(5000000);
        }
        if (gameClient2.gameType != 1) return new BigDecimal(3000000);
        return new BigDecimal(15000000);
    }

    public static int getSHExpByZT(int lvl) {
        return BaseValue.getSHExpBySX(lvl) * 2;
    }

    public static String getPalBtnArrStr(int i) {
        if (i == 0) {
            return "1\u53f7";
        }
        if (i == 1) {
            return "2\u53f7";
        }
        if (i == 2) {
            return "3\u53f7";
        }
        if (i == 3) {
            return "4\u53f7";
        }
        if (i != 4) return "1\u53f7";
        return "\u4f11\u606f";
    }

    public static long getFZTotalExp(long lvl) {
        if (lvl <= 100L) return (2500L + 500L * lvl) * lvl / 2L;
        return 2625000L + 999999999L * (lvl - 100L);
    }

    public static double ALLATORIxDEMO(String key, BigDecimal raceid) {
        if (raceid.intValue() == 10003) return 110.0;
        if (raceid.intValue() == 10002) {
            return 110.0;
        }
        if (raceid.intValue() == 10001) {
            return 140.0;
        }
        if (raceid.intValue() == 10004) {
            if (!key.equals("\u6297\u9057\u5fd8")) return 120.0;
            return 140.0;
        }
        if (raceid.intValue() != 10005) return 110.0;
        return 120.0;
    }

    public static long getBangQuality(BigDecimal gx, boolean zf) {
        long IiiiiiiiIIIII;
        if (gx == null) {
            gx = new BigDecimal(0);
        }
        if ((IiiiiiiiIIIII = (long)BaseValue.getCubeRoot(gx.longValue() / 500L)) >= 30L) return zf ? 30 : 15;
        if (!zf) return IiiiiiiiIIIII / 2L;
        return IiiiiiiiIIIII;
    }

    public static int getSHLYJByZT(int lvl) {
        return BaseValue.getSHLYJBySX(lvl) * 2;
    }

    public static long getSHMoney(int lvl) {
        if (lvl <= 3) {
            return 500000L;
        }
        if (lvl <= 6) {
            return 1000000L;
        }
        if (lvl <= 9) {
            return 2000000L;
        }
        if (lvl <= 12) {
            return 3000000L;
        }
        if (lvl <= 16) {
            return 4000000L;
        }
        if (lvl > 20) return 6000000L;
        return 5000000L;
    }

    public static int getSHExpBySX(int lvl) {
        if (lvl <= 2) {
            return 6 + 3 * lvl;
        }
        if (lvl > 6) return 9 * lvl - 18;
        return 6 * lvl;
    }

    public static int getRoleValue(BigDecimal raceid, int P, int lvl, int type) {
        double IiiiiiiiIIIII = BaseValue.getValue(raceid, 1, type);
        if (type >= 4) {
            return (int)(IiiiiiiiIIIII * (double)P);
        }
        double IiiiiiiiIIIII2 = BaseValue.getValue(raceid, 0, type);
        if (IiiiiiiiIIIII > 2.0 || IiiiiiiiIIIII2 > 400.0) {
            IiiiiiiiIIIII = 0.01;
        }
        int IiiiiiiiIIIII3 = (100 - lvl) / 5;
        int IiiiiiiiIIIII4 = (int)((double)((lvl + IiiiiiiiIIIII3) * P) * IiiiiiiiIIIII);
        if (type == 0) return (int)((double)IiiiiiiiIIIII4 + IiiiiiiiIIIII2);
        if (type == 1) {
            return (int)((double)IiiiiiiiIIIII4 + IiiiiiiiIIIII2);
        }
        if (type != 2) return (int)((double)(10 + P) * IiiiiiiiIIIII);
        return (int)((double)(IiiiiiiiIIIII4 / 5) + IiiiiiiiIIIII2);
    }

    public static int getratio(BigDecimal raceid) {
        if (raceid.intValue() == 10001) {
            return 0;
        }
        if (raceid.intValue() == 10002) {
            return 1;
        }
        if (raceid.intValue() == 10003) {
            return 2;
        }
        if (raceid.intValue() == 10004) {
            return 3;
        }
        if (raceid.intValue() != 10005) return 0;
        return 4;
    }
}
