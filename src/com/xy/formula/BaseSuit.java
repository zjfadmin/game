/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

public class BaseSuit {
    private int sum;
    private int lvl;
    private int suitId;

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static String getsuitSkill(int id) {
        if (id == 6001) {
            return "\u52a0\u5f3a\u5c01\u5370";
        }
        if (id == 6002) {
            return "\u52a0\u5f3a\u660f\u7761";
        }
        if (id == 6003) {
            return "\u52a0\u5f3a\u9057\u5fd8";
        }
        if (id == 6004) {
            return "\u52a0\u5f3a\u6df7\u4e71";
        }
        if (id == 6005) {
            return "\u52a0\u5f3a\u98ce";
        }
        if (id == 6006) return "\u52a0\u5f3a\u6cd5\u672f";
        if (id == 6007) {
            return "\u52a0\u5f3a\u6cd5\u672f";
        }
        if (id == 6008) {
            return "\u52a0\u5f3a\u706b";
        }
        if (id == 6009) {
            return "\u52a0\u5f3a\u9b3c\u706b";
        }
        if (id == 6010) {
            return "\u5ffd\u89c6\u6297\u706b";
        }
        if (id == 6011) {
            return "\u5ffd\u89c6\u6297\u6df7";
        }
        if (id == 6012) {
            return "\u5ffd\u89c6\u6297\u98ce";
        }
        if (id == 6013) {
            return "\u5ffd\u89c6\u6297\u5c01";
        }
        if (id == 6014) {
            return "\u5ffd\u89c6\u6297\u7761";
        }
        if (id == 6015) {
            return "\u5ffd\u89c6\u9057\u5fd8";
        }
        if (id == 6016) {
            return "\u52a0\u5f3a\u9707\u6151";
        }
        if (id == 6017) {
            return "\u56db\u6297\u4e0a\u9650";
        }
        if (id == 6030) {
            return "\u52a0\u5f3a\u901f\u5ea6\u6cd5\u672f\u6548\u679c";
        }
        if (id == 6031) {
            return "\u6c34\u9b54\u9644\u8eab";
        }
        if (id == 6032) {
            return "\u52a0\u5f3a\u4e09\u5c38\u866b";
        }
        if (id == 6035) {
            return "\u52a0\u5f3a\u9632\u5fa1\u6cd5\u672f\u6548\u679c";
        }
        if (id == 6036) {
            return "\u52a0\u5f3a\u9b45\u60d1";
        }
        if (id == 6039) {
            return "\u52a0\u5f3a\u653b\u51fb\u6cd5\u672f\u6548\u679c";
        }
        if (id != 6044) return null;
        return "\u4e94\u884c\u5f52\u4e00";
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getSum() {
        return this.sum;
    }

    public static double getSuitValue(int id, int lvl) {
        if (id == 6016) return 1.5 + (double)lvl * 0.5;
        if (id == 6004) {
            return 1.5 + (double)lvl * 0.5;
        }
        if (id == 6017) {
            return 5 + lvl;
        }
        if (id >= 6001) {
            if (id <= 6009) return 3 + lvl;
        }
        if (id == 6030) return 3 + lvl;
        if (id == 6035) return 3 + lvl;
        if (id == 6036) return 3 + lvl;
        if (id == 6039) {
            return 3 + lvl;
        }
        if (id == 6031) {
            return lvl;
        }
        if (id == 6032) {
            return 100 + lvl * 100;
        }
        if (id != 6044) return 0.5 + (double)lvl * 0.5;
        return lvl * 20;
    }

    public BaseSuit(int suitId, int lvl, int sum) {
        this.suitId = suitId;
        this.lvl = lvl;
        this.sum = sum;
    }

    public int getSuitId() {
        return this.suitId;
    }

    public void setSuitId(int suitId) {
        this.suitId = suitId;
    }

    public BaseSuit(int suitId, int lvl) {
        this.suitId = suitId;
        this.lvl = lvl;
    }
}
