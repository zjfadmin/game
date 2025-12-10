/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

public class FBUtil {
    public static int IIiiIiiiiIiII(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 426) {
                return 2;
            }
            if (ed < 3098) {
                return 3;
            }
            if (ed >= 9866) return 5;
            return 4;
        }
        if (lvl != 5) return 1;
        if (ed < 226) {
            return 3;
        }
        if (ed < 1638) {
            return 4;
        }
        if (ed < 5215) {
            return 5;
        }
        if (ed >= 11868) return 7;
        return 6;
    }

    public static int IIIiiiiiiIIiI(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 428) {
                return 2;
            }
            if (ed < 3098) {
                return 3;
            }
            if (ed >= 9866) return 5;
            return 4;
        }
        if (lvl != 5) return 1;
        if (ed < 226) {
            return 3;
        }
        if (ed < 1638) {
            return 4;
        }
        if (ed < 5215) {
            return 5;
        }
        if (ed >= 11864) return 7;
        return 6;
    }

    public static int IIIIIiiiiIIii(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 5200) {
                return 2;
            }
            if (ed >= 6800) return 4;
            return 3;
        }
        if (lvl != 5) return 1;
        if (ed < 2200) {
            return 3;
        }
        if (ed >= 6800) return 5;
        return 4;
    }

    public static int getFBcx(int id, int lvl) {
        if (id == 5007) return 0;
        if (id == 5010) return 0;
        if (id == 5012) return 0;
        if (id == 5015) {
            return 0;
        }
        if (id == 5006) {
            if (lvl >= 158) {
                return 7;
            }
            if (lvl >= 112) {
                return 6;
            }
            if (lvl >= 65) {
                return 5;
            }
            if (lvl < 20) return 3;
            return 4;
        }
        if (id == 5009) {
            if (lvl >= 182) {
                return 8;
            }
            if (lvl >= 138) {
                return 7;
            }
            if (lvl >= 94) {
                return 6;
            }
            if (lvl >= 51) {
                return 5;
            }
            if (lvl < 7) return 3;
            return 4;
        }
        if (lvl >= 200) {
            return 8;
        }
        if (lvl >= 156) {
            return 7;
        }
        if (lvl >= 112) {
            return 6;
        }
        if (lvl >= 80) {
            return 5;
        }
        if (lvl >= 60) {
            return 4;
        }
        if (lvl < 20) return 2;
        return 3;
    }

    public static int getFBsum(int id, int lvl) {
        if (id == 5003) return 1;
        if (id == 5006) return 1;
        if (id == 5008) return 1;
        if (id == 5011) return 1;
        if (id == 5014) return 1;
        if (id == 5015) {
            return 1;
        }
        if (lvl < 100) return 1;
        return 2;
    }

    public static int iiiiiiiiIIiii(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 720) {
                return 2;
            }
            if (ed < 5215) {
                return 3;
            }
            if (ed >= 16610) return 5;
            return 4;
        }
        if (lvl != 5) return 1;
        if (ed < 558) {
            return 3;
        }
        if (ed >= 5621) return 5;
        return 4;
    }

    public static int ALLATORIxDEMO(int level, int ed, String type) {
        if (type.equals("\u9b3c\u706b")) return FBUtil.iiiiiiiiIIiii(ed, level);
        if (type.equals("\u706b")) return FBUtil.iiiiiiiiIIiii(ed, level);
        if (type.equals("\u6c34")) return FBUtil.iiiiiiiiIIiii(ed, level);
        if (type.equals("\u96f7")) return FBUtil.iiiiiiiiIIiii(ed, level);
        if (type.equals("\u98ce")) {
            return FBUtil.iiiiiiiiIIiii(ed, level);
        }
        if (type.equals("\u9707\u6151")) {
            return FBUtil.IIiiIiiiiIiII(ed, level);
        }
        if (type.equals("\u529b\u91cf")) return FBUtil.iIiIiiiiIIiii(ed, level);
        if (type.equals("\u6297\u6027")) return FBUtil.iIiIiiiiIIiii(ed, level);
        if (type.equals("\u52a0\u901f")) return FBUtil.iIiIiiiiIIiii(ed, level);
        if (type.equals("smmh")) {
            return FBUtil.iIiIiiiiIIiii(ed, level);
        }
        if (type.equals("\u4e2d\u6bd2")) return FBUtil.IIIiiiiiiIIiI(ed, level);
        if (type.equals("\u5c01\u5370")) return FBUtil.IIIiiiiiiIIiI(ed, level);
        if (type.equals("\u660f\u7761")) return FBUtil.IIIiiiiiiIIiI(ed, level);
        if (type.equals("\u9057\u5fd8")) {
            return FBUtil.IIIiiiiiiIIiI(ed, level);
        }
        if (type.equals("\u6df7\u4e71")) {
            return FBUtil.iiiIiiiiiiIIi(ed, level);
        }
        if (type.equals("\u4e09\u5c38\u866b")) {
            return FBUtil.IIIIIiiiiIIii(ed, level);
        }
        if (type.equals("\u9739\u96f3")) {
            return FBUtil.IiiIiiiiiiIiI(ed, level);
        }
        if (type.equals("\u6276\u6447")) return FBUtil.iIiIiiiiIIiIi(ed, level);
        if (!type.equals("\u6ca7\u6ce2")) return FBUtil.iiiiiiiiIIiii(ed, level);
        return FBUtil.iIiIiiiiIIiIi(ed, level);
    }

    public static int IiiIiiiiiiIiI(int ed, int lvl) {
        if (lvl != 3) {
            if (lvl != 5) return 1;
        }
        if (ed < 5200) {
            return 2;
        }
        if (ed >= 6800) return 4;
        return 3;
    }

    public static int iIiIiiiiIIiIi(int ed, int lvl) {
        if (lvl != 3) {
            if (lvl != 5) return 1;
        }
        if (ed < 2200) {
            return 2;
        }
        if (ed < 4600) {
            return 3;
        }
        if (ed < 9600) {
            return 4;
        }
        if (lvl == 3) return 5;
        if (ed >= 12000) return 6;
        return 5;
    }

    public static int iiiIiiiiiiIIi(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 1362) {
                return 2;
            }
            if (ed >= 9866) return 4;
            return 3;
        }
        if (lvl != 5) return 1;
        if (ed < 973) {
            return 3;
        }
        if (ed >= 7051) return 5;
        return 4;
    }

    public static int iIiIiiiiIIiii(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 214) {
                return 2;
            }
            if (ed < 2155) {
                return 3;
            }
            if (ed >= 8324) return 5;
            return 4;
        }
        if (lvl != 5) return 1;
        if (ed < 117) {
            return 3;
        }
        if (ed < 1174) {
            return 4;
        }
        if (ed < 4533) {
            return 5;
        }
        if (ed >= 11826) return 7;
        return 6;
    }

    public static int ALLATORIxDEMO(int ed, int lvl) {
        if (lvl == 3) {
            if (ed < 2200) {
                return 2;
            }
            if (ed < 4600) {
                return 3;
            }
            if (ed >= 9600) return 5;
            return 4;
        }
        if (lvl != 5) return 1;
        if (ed < 2200) {
            return 3;
        }
        if (ed < 4600) {
            return 4;
        }
        if (ed < 9600) {
            return 5;
        }
        if (ed >= 12000) return 7;
        return 6;
    }

    public static int getFBlvl(int t, int g, int zlvl, int qv, int lvl) {
        int IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII += (g += t * 25) * 3;
        IiiiiiiiIIIII += zlvl;
        return (IiiiiiiiIIIII += (qv += lvl) * 7) >> 5;
    }
}
