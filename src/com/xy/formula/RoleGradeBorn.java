/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.Arith
 */
package com.xy.formula;

import com.xy.formula.Arith;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RoleGradeBorn {
    public String[] kx = new String[]{"\u6297\u6df7\u4e71", "\u6297\u5c01\u5370", "\u6297\u660f\u7761", "\u6297\u4e2d\u6bd2", "\u6297\u98ce", "\u6297\u706b", "\u6297\u96f7", "\u6297\u6c34", "\u547d\u4e2d\u7387", "\u72c2\u66b4\u7387", "\u81f4\u547d\u7387", "\u7269\u7406\u5438\u6536", "\u6297\u9057\u5fd8", "\u6297\u4e09\u5c38", "\u6297\u9b3c\u706b", "\u6297\u6d69\u7136\u6b63\u6c14", "\u8eb2\u95ea\u7387"};
    public String[] ren = new String[]{"0=4=1", "1=4=1", "2=4=1", "3=4=1"};
    public String[] xian;
    public String[] gui;
    public String[] mo = new String[]{"0=8=1", "1=8=1", "2=8=1", "3=8=1", "4=12=1", "5=12=1", "6=12=1", "7=12=1", "8=20=1", "11=8=1"};
    public String[] LONG;
    private static RoleGradeBorn gradekx;

    public String getgui(double lvl) {
        StringBuilder IiiiiiiiIIIII = new StringBuilder();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.gui.length) {
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("|");
            }
            String[] IiiiiiiiIIIII3 = this.gui[IiiiiiiiIIIII2].split("=");
            IiiiiiiiIIIII.append(this.kx[Integer.parseInt(IiiiiiiiIIIII3[0])]);
            IiiiiiiiIIIII.append("=");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(lvl / (double)Integer.parseInt(IiiiiiiiIIIII3[1]) * (double)Integer.parseInt(IiiiiiiiIIIII3[2]));
        }
        return IiiiiiiiIIIII.toString();
    }

    public String getren(double lvl) {
        StringBuilder IiiiiiiiIIIII = new StringBuilder();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ren.length) {
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("|");
            }
            String[] IiiiiiiiIIIII3 = this.ren[IiiiiiiiIIIII2].split("=");
            IiiiiiiiIIIII.append(this.kx[Integer.parseInt(IiiiiiiiIIIII3[0])]);
            IiiiiiiiIIIII.append("=");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(lvl / (double)Integer.parseInt(IiiiiiiiIIIII3[1]) * (double)Integer.parseInt(IiiiiiiiIIIII3[2]));
        }
        return IiiiiiiiIIIII.toString();
    }

    private static /* synthetic */ double ALLATORIxDEMO(int lvl, int point) {
        if (lvl == 2) {
            return (double)point * 1.2;
        }
        if (lvl == 3) {
            return (double)point * 1.5;
        }
        if (lvl == 4) {
            return point * 2;
        }
        if (lvl != 5) return point;
        return (double)point * 2.5;
    }

    public RoleGradeBorn() {
        this.xian = new String[]{"4=4=1", "5=4=1", "6=4=1", "7=4=1"};
        this.gui = new String[]{"15=1=-100", "16=4=1", "0=6=1", "1=6=1", "2=6=1", "3=6=1", "14=6=1", "12=6=1", "13=6=120", "4=8=-1", "5=8=-1", "6=8=-1", "7=8=-1", "8=12=1"};
        this.LONG = new String[]{"11=6=1", "0=6=1", "1=6=1", "2=6=1", "3=6=1", "12=6=1", "8=20=1"};
    }

    public static String ALLATORIxDEMO(String yuben) {
        if (yuben == null) return null;
        if (yuben.equals("")) {
            return null;
        }
        String[] IiiiiiiiIIIII = yuben.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (!IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith("\u53cc\u5c5e\u6027")) {
                double d;
                String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
                double IiiiiiiiIIIII4 = Math.abs(Double.parseDouble(IiiiiiiiIIIII3[1]));
                double IiiiiiiiIIIII5 = 369000.0;
                if (IiiiiiiiIIIII3[0].equals("\u6297\u6df7\u4e71") || IiiiiiiiIIIII3[0].equals("\u6297\u5c01\u5370") || IiiiiiiiIIIII3[0].equals("\u6297\u660f\u7761") || IiiiiiiiIIIII3[0].equals("\u6297\u9057\u5fd8") || IiiiiiiiIIIII3[0].equals("\u53cd\u9707\u7a0b\u5ea6") || IiiiiiiiIIIII3[0].equals("\u901f\u5ea6")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.25E-4);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6297\u6df7\u4e71\u4e0a\u9650") || IiiiiiiiIIIII3[0].equals("\u6297\u5c01\u5370\u4e0a\u9650") || IiiiiiiiIIIII3[0].equals("\u6297\u660f\u7761\u4e0a\u9650") || IiiiiiiiIIIII3[0].equals("\u6297\u9057\u5fd8\u4e0a\u9650")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.6875E-5);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6297\u6bd2\u4f24")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)0.02);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("MP\u6210\u957f") || IiiiiiiiIIIII3[0].equals("HP\u6210\u957f")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.0E-6);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u7269\u7406\u5438\u6536")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.875E-4);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6297\u9707\u6151")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.125E-4);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("SP\u6210\u957f")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)7.5E-7);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6297\u98ce") || IiiiiiiiIIIII3[0].equals("\u6297\u96f7") || IiiiiiiiIIIII3[0].equals("\u6297\u6c34") || IiiiiiiiIIIII3[0].equals("\u6297\u706b") || IiiiiiiiIIIII3[0].equals("\u6297\u9b3c\u706b")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.6875E-4);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6297\u4e09\u5c38")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)0.025);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u53cd\u9707\u7387")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)6.5E-5);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u8eb2\u95ea")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.0E-4);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u4f24\u5bb3\u51cf\u514d")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.85E-5);
                    d = IiiiiiiiIIIII4;
                } else if (IiiiiiiiIIIII3[0].equals("\u6cd5\u672f\u8eb2\u95ea")) {
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)1.85E-5);
                    d = IiiiiiiiIIIII4;
                } else {
                    if (!(IiiiiiiiIIIII3[0].equals("\u6297\u5929\u9b54\u89e3\u4f53") || IiiiiiiiIIIII3[0].equals("\u6297\u5206\u5149\u5316\u5f71") || IiiiiiiiIIIII3[0].equals("\u6297\u9752\u9762\u7360\u7259"))) {
                        if (!IiiiiiiiIIIII3[0].equals("\u6297\u5c0f\u697c\u591c\u54ed")) return null;
                    }
                    IiiiiiiiIIIII5 = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII5, (double)0.00625);
                    d = IiiiiiiiIIIII4;
                }
                if (d > IiiiiiiiIIIII5) {
                    return null;
                }
            }
            ++IiiiiiiiIIIII2;
        }
        return yuben;
    }

    public String getlong(double lvl) {
        StringBuilder IiiiiiiiIIIII = new StringBuilder();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.LONG.length) {
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("|");
            }
            String[] IiiiiiiiIIIII3 = this.LONG[IiiiiiiiIIIII2].split("=");
            IiiiiiiiIIIII.append(this.kx[Integer.parseInt(IiiiiiiiIIIII3[0])]);
            IiiiiiiiIIIII.append("=");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(lvl / (double)Integer.parseInt(IiiiiiiiIIIII3[1]) * (double)Integer.parseInt(IiiiiiiiIIIII3[2]));
        }
        IiiiiiiiIIIII.append("|\u547d\u4e2d\u7387=5|\u72c2\u66b4\u7387=5|\u81f4\u547d\u7387=5");
        return IiiiiiiiIIIII.toString();
    }

    public String ALLATORIxDEMO(int lvl, BigDecimal raceid) {
        if (lvl > 162) {
            lvl = 162;
        }
        if (raceid.intValue() == 10001) {
            return this.getren(lvl);
        }
        if (raceid.intValue() == 10002) {
            return this.getmo(lvl);
        }
        if (raceid.intValue() == 10003) {
            return this.getxian(lvl);
        }
        if (raceid.intValue() == 10004) {
            return this.getgui(lvl);
        }
        if (raceid.intValue() != 10005) return this.getren(lvl);
        return this.getlong(lvl);
    }

    public String getxian(double lvl) {
        StringBuilder IiiiiiiiIIIII = new StringBuilder();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.xian.length) {
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("|");
            }
            String[] IiiiiiiiIIIII3 = this.xian[IiiiiiiiIIIII2].split("=");
            IiiiiiiiIIIII.append(this.kx[Integer.parseInt(IiiiiiiiIIIII3[0])]);
            IiiiiiiiIIIII.append("=");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(lvl / (double)Integer.parseInt(IiiiiiiiIIIII3[1]) * (double)Integer.parseInt(IiiiiiiiIIIII3[2]));
        }
        return IiiiiiiiIIIII.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static int[] getbz(String[] v) {
        try {
            IiiiiiiiIIIII = new int[v.length];
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl13
        }
        catch (Exception IiiiiiiiIIIII) {
            return null;
        }
        do {
            IiiiiiiiIIIII[IiiiiiiiIIIII] = Integer.parseInt(v[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII[IiiiiiiiIIIII] < 1) return null;
            if (IiiiiiiiIIIII[IiiiiiiiIIIII] > 10) {
                return null;
            }
            ++IiiiiiiiIIIII;
lbl13:
            // 2 sources

        } while (IiiiiiiiIIIII < v.length);
        return IiiiiiiiIIIII;
    }

    private static /* synthetic */ void ALLATORIxDEMO(Map<String, Double> map, String key, int point, int lvl, double xs) {
        double IiiiiiiiIIIII = RoleGradeBorn.ALLATORIxDEMO(lvl, point);
        IiiiiiiiIIIII = Arith.iiiIiiiiiiIIi((double)IiiiiiiiIIIII, (double)xs);
        Double IiiiiiiiIIIII2 = map.get(key);
        if (IiiiiiiiIIIII2 == null) {
            IiiiiiiiIIIII2 = 0.0;
        }
        IiiiiiiiIIIII2 = Arith.ALLATORIxDEMO((double)IiiiiiiiIIIII2, (double)IiiiiiiiIIIII);
        map.put(key, IiiiiiiiIIIII2);
    }

    public static RoleGradeBorn getGradeKX() {
        if (gradekx != null) return gradekx;
        gradekx = new RoleGradeBorn();
        return gradekx;
    }

    public String getmo(double lvl) {
        StringBuilder IiiiiiiiIIIII = new StringBuilder();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.mo.length) {
            if (IiiiiiiiIIIII2 != 0) {
                IiiiiiiiIIIII.append("|");
            }
            String[] IiiiiiiiIIIII3 = this.mo[IiiiiiiiIIIII2].split("=");
            IiiiiiiiIIIII.append(this.kx[Integer.parseInt(IiiiiiiiIIIII3[0])]);
            IiiiiiiiIIIII.append("=");
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append(lvl / (double)Integer.parseInt(IiiiiiiiIIIII3[1]) * (double)Integer.parseInt(IiiiiiiiIIIII3[2]));
        }
        IiiiiiiiIIIII.append("|\u547d\u4e2d\u7387=5|\u72c2\u66b4\u7387=5|\u81f4\u547d\u7387=5");
        return IiiiiiiiIIIII.toString();
    }

    public static String ALLATORIxDEMO(String[] skills, String yuben) {
        if (skills == null) {
            return RoleGradeBorn.ALLATORIxDEMO(yuben);
        }
        if (yuben == null) {
            yuben = "";
        }
        String IiiiiiiiIIIII = null;
        HashMap<String, Double> IiiiiiiiIIIII2 = new HashMap<String, Double>();
        if (yuben != null && !yuben.equals("")) {
            String[] IiiiiiiiIIIII3 = yuben.split("\\|");
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
                if (IiiiiiiiIIIII3[IiiiiiiiIIIII4].startsWith("\u53cc\u5c5e\u6027")) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII3[IiiiiiiiIIIII4];
                } else {
                    String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("=");
                    IiiiiiiiIIIII2.put(IiiiiiiiIIIII5[0], Double.parseDouble(IiiiiiiiIIIII5[1]));
                }
                ++IiiiiiiiIIIII4;
            }
        }
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < skills.length) {
            String[] IiiiiiiiIIIII7 = skills[IiiiiiiiIIIII6].split("_");
            ++IiiiiiiiIIIII6;
            RoleGradeBorn.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII7[0], Integer.parseInt(IiiiiiiiIIIII7[1]));
        }
        StringBuffer IiiiiiiiIIIII22 = new StringBuffer();
        for (Map.Entry IiiiiiiiIIIII8 : IiiiiiiiIIIII2.entrySet()) {
            if (IiiiiiiiIIIII22.length() != 0) {
                IiiiiiiiIIIII22.append("|");
            }
            IiiiiiiiIIIII22.append((String)IiiiiiiiIIIII8.getKey());
            IiiiiiiiIIIII22.append("=");
            if ((Double)IiiiiiiiIIIII8.getValue() == (double)((Double)IiiiiiiiIIIII8.getValue()).intValue()) {
                IiiiiiiiIIIII22.append(((Double)IiiiiiiiIIIII8.getValue()).intValue());
                continue;
            }
            IiiiiiiiIIIII22.append(IiiiiiiiIIIII8.getValue());
        }
        String IiiiiiiiIIIII9 = RoleGradeBorn.ALLATORIxDEMO(IiiiiiiiIIIII22.toString());
        if (IiiiiiiiIIIII == null) return IiiiiiiiIIIII9;
        if (IiiiiiiiIIIII9 != null && IiiiiiiiIIIII9.length() != 0) {
            IiiiiiiiIIIII9 = String.valueOf(IiiiiiiiIIIII9) + "|" + IiiiiiiiIIIII;
            return IiiiiiiiIIIII9;
        }
        IiiiiiiiIIIII9 = IiiiiiiiIIIII;
        return IiiiiiiiIIIII9;
    }

    private static /* synthetic */ void ALLATORIxDEMO(Map<String, Double> map, String str, int ed) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = Integer.parseInt(str) - 1000;
        int n = IiiiiiiiIIIII = IiiiiiiiIIIII2 % 5 == 0 ? 5 : IiiiiiiiIIIII2 % 5;
        if (IiiiiiiiIIIII2 <= 5) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u6df7\u4e71", ed, IiiiiiiiIIIII, 1.25E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u6df7\u4e71\u4e0a\u9650", ed, IiiiiiiiIIIII, 1.6875E-5);
            return;
        }
        if (IiiiiiiiIIIII2 <= 10) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u5c01\u5370", ed, IiiiiiiiIIIII, 1.25E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u5c01\u5370\u4e0a\u9650", ed, IiiiiiiiIIIII, 1.6875E-5);
            return;
        }
        if (IiiiiiiiIIIII2 <= 15) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u660f\u7761", ed, IiiiiiiiIIIII, 1.25E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u660f\u7761\u4e0a\u9650", ed, IiiiiiiiIIIII, 1.6875E-5);
            return;
        }
        if (IiiiiiiiIIIII2 <= 20) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u6bd2\u4f24", ed, IiiiiiiiIIIII, 0.02);
            return;
        }
        if (IiiiiiiiIIIII2 <= 25) {
            RoleGradeBorn.ALLATORIxDEMO(map, "MP\u6210\u957f", ed, IiiiiiiiIIIII, 1.0E-6);
            return;
        }
        if (IiiiiiiiIIIII2 <= 30) {
            RoleGradeBorn.ALLATORIxDEMO(map, "HP\u6210\u957f", ed, IiiiiiiiIIIII, 1.0E-6);
            return;
        }
        if (IiiiiiiiIIIII2 <= 35) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u7269\u7406\u5438\u6536", ed, IiiiiiiiIIIII, 1.875E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u9707\u6151", ed, IiiiiiiiIIIII, 1.125E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 40) {
            RoleGradeBorn.ALLATORIxDEMO(map, "SP\u6210\u957f", ed, IiiiiiiiIIIII, 7.5E-7);
            return;
        }
        if (IiiiiiiiIIIII2 <= 45) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u98ce", ed, IiiiiiiiIIIII, 1.6875E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 50) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u96f7", ed, IiiiiiiiIIIII, 1.6875E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 55) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u6c34", ed, IiiiiiiiIIIII, 1.6875E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 60) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u706b", ed, IiiiiiiiIIIII, 1.6875E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 65) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u9b3c\u706b", ed, IiiiiiiiIIIII, 1.6875E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 70) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u4e09\u5c38", ed, IiiiiiiiIIIII, 0.025);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u901f\u5ea6", ed, IiiiiiiiIIIII, -1.25E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 75) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u9057\u5fd8", ed, IiiiiiiiIIIII, 1.25E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u9057\u5fd8\u4e0a\u9650", ed, IiiiiiiiIIIII, 1.6875E-5);
            return;
        }
        if (IiiiiiiiIIIII2 <= 80) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u53cd\u9707\u7a0b\u5ea6", ed, IiiiiiiiIIIII, 1.25E-4);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u53cd\u9707\u7387", ed, IiiiiiiiIIIII, 6.5E-5);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u5929\u9b54\u89e3\u4f53", ed, IiiiiiiiIIIII, 0.00625);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u5206\u5149\u5316\u5f71", ed, IiiiiiiiIIIII, 0.00625);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u9752\u9762\u7360\u7259", ed, IiiiiiiiIIIII, 0.00625);
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6297\u5c0f\u697c\u591c\u54ed", ed, IiiiiiiiIIIII, 0.00625);
            return;
        }
        if (IiiiiiiiIIIII2 <= 85) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u8eb2\u95ea", ed, IiiiiiiiIIIII, 1.0E-4);
            return;
        }
        if (IiiiiiiiIIIII2 <= 90) {
            RoleGradeBorn.ALLATORIxDEMO(map, "\u6cd5\u672f\u8eb2\u95ea", ed, IiiiiiiiIIIII, 1.85E-5);
            return;
        }
        if (IiiiiiiiIIIII2 <= 95) {
            RoleGradeBorn.ALLATORIxDEMO(map, "HP\u6210\u957f", ed, IiiiiiiiIIIII, 1.0E-6);
            return;
        }
        if (IiiiiiiiIIIII2 > 100) return;
        RoleGradeBorn.ALLATORIxDEMO(map, "\u4f24\u5bb3\u51cf\u514d", ed, IiiiiiiiIIIII, 1.85E-5);
    }
}
