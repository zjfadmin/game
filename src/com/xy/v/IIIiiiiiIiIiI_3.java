/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.v;

import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiiiIiIiI {
    public static String iIiIiiiiIIiii(String v, String b, int type) {
        if (type == 2) return IIIiiiiiIiIiI.ALLATORIxDEMO(v, b, type);
        if (type == 3) {
            return IIIiiiiiIiIiI.ALLATORIxDEMO(v, b, type);
        }
        boolean IiiiiiiiIIIII = true;
        boolean IiiiiiiiIIIII2 = false;
        if (type == 2 || type == 3 || type == 5) {
            IiiiiiiiIIIII2 = true;
        }
        ArrayList<String> IiiiiiiiIIIII3 = new ArrayList<String>();
        if (v == null) {
            v = "";
        }
        String[] IiiiiiiiIIIII4 = v.split("\\|");
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
            if (type == 0) {
                if (!IiiiiiiiIIIII4[IiiiiiiiIIIII5].equals(b)) {
                    IiiiiiiiIIIII3.add(IiiiiiiiIIIII4[IiiiiiiiIIIII5]);
                } else {
                    IiiiiiiiIIIII = false;
                }
            } else {
                String[] IiiiiiiiIIIII6;
                String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII4[IiiiiiiiIIIII5].split("=");
                if (IiiiiiiiIIIII7[0].equals((IiiiiiiiIIIII6 = b.split("="))[0])) {
                    double IiiiiiiiIIIII8;
                    double IiiiiiiiIIIII9;
                    if (type == 1) {
                        IiiiiiiiIIIII3.add(b);
                    } else if (type == 2) {
                        IiiiiiiiIIIII2 = false;
                        IiiiiiiiIIIII9 = Double.parseDouble(IiiiiiiiIIIII7[1]);
                        IiiiiiiiIIIII8 = Double.parseDouble(IiiiiiiiIIIII6[1]);
                        if ((IiiiiiiiIIIII9 += IiiiiiiiIIIII8) % 1.0 == 0.0) {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + (int)IiiiiiiiIIIII9);
                        } else {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + IiiiiiiiIIIII9);
                        }
                    } else if (type == 3) {
                        IiiiiiiiIIIII2 = false;
                        IiiiiiiiIIIII9 = Double.parseDouble(IiiiiiiiIIIII7[1]);
                        IiiiiiiiIIIII8 = Double.parseDouble(IiiiiiiiIIIII6[1]);
                        if ((IiiiiiiiIIIII9 -= IiiiiiiiIIIII8) % 1.0 == 0.0) {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + (int)IiiiiiiiIIIII9);
                        } else {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + IiiiiiiiIIIII9);
                        }
                    } else if (type == 5) {
                        IiiiiiiiIIIII2 = false;
                        IiiiiiiiIIIII9 = Double.parseDouble(IiiiiiiiIIIII7[1]);
                        IiiiiiiiIIIII8 = Double.parseDouble(IiiiiiiiIIIII6[1]);
                        if (IiiiiiiiIIIII8 > IiiiiiiiIIIII9) {
                            IiiiiiiiIIIII9 = IiiiiiiiIIIII8;
                        }
                        if (IiiiiiiiIIIII9 % 1.0 == 0.0) {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + (int)IiiiiiiiIIIII9);
                        } else {
                            IiiiiiiiIIIII3.add(String.valueOf(IiiiiiiiIIIII7[0]) + "=" + IiiiiiiiIIIII9);
                        }
                    }
                } else {
                    IiiiiiiiIIIII3.add(IiiiiiiiIIIII4[IiiiiiiiIIIII5]);
                }
            }
            ++IiiiiiiiIIIII5;
        }
        if (IiiiiiiiIIIII && type == 0) {
            IiiiiiiiIIIII3.add(b);
        }
        if (IiiiiiiiIIIII2) {
            IiiiiiiiIIIII3.add(b);
        }
        StringBuffer IiiiiiiiIIIII22 = new StringBuffer();
        int IiiiiiiiIIIII10 = 0;
        while (IiiiiiiiIIIII10 < IiiiiiiiIIIII3.size()) {
            if (!IiiiiiiiIIIII22.toString().equals("")) {
                IiiiiiiiIIIII22.append("|" + (String)IiiiiiiiIIIII3.get(IiiiiiiiIIIII10));
            } else {
                IiiiiiiiIIIII22.append((String)IiiiiiiiIIIII3.get(IiiiiiiiIIIII10));
            }
            ++IiiiiiiiIIIII10;
        }
        return IiiiiiiiIIIII22.toString();
    }

    public static String ALLATORIxDEMO(int x) {
        switch (x) {
            case 1: {
                return "\u4e00";
            }
            case 2: {
                return "\u4e8c";
            }
            case 3: {
                return "\u4e09";
            }
            case 4: {
                return "\u56db";
            }
            case 5: {
                return "\u4e94";
            }
            case 6: {
                return "\u516d";
            }
            case 7: {
                return "\u4e03";
            }
            case 8: {
                return "\u516b";
            }
            case 9: {
                return "\u4e5d";
            }
        }
        return null;
    }

    public static String ALLATORIxDEMO(BigDecimal money) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        long IiiiiiiiIIIII2 = money.longValue();
        if ((IiiiiiiiIIIII2 /= 1000000L) <= 0L) {
            return "";
        }
        int IiiiiiiiIIIII3 = (int)(IiiiiiiiIIIII2 / 1000L % 10L);
        int IiiiiiiiIIIII4 = (int)(IiiiiiiiIIIII2 / 100L % 10L);
        int IiiiiiiiIIIII5 = (int)(IiiiiiiiIIIII2 / 10L % 10L);
        int IiiiiiiiIIIII6 = (int)(IiiiiiiiIIIII2 % 10L);
        String IiiiiiiiIIIII7 = IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII7 != null) {
            if (IiiiiiiiIIIII3 != 1) {
                IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
            }
            IiiiiiiiIIIII.append("\u5341");
        }
        if ((IiiiiiiiIIIII7 = IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII4)) != null) {
            IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
        }
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("\u4ebf");
        }
        if ((IiiiiiiiIIIII7 = IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII5)) != null) {
            IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
            IiiiiiiiIIIII.append("\u5343");
        }
        if ((IiiiiiiiIIIII7 = IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII6)) != null) {
            IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
            IiiiiiiiIIIII.append("\u767e");
        }
        if (IiiiiiiiIIIII.substring(IiiiiiiiIIIII.length() - 1, IiiiiiiiIIIII.length()).equals("\u4ebf")) return IiiiiiiiIIIII.toString();
        IiiiiiiiIIIII.append("\u4e07");
        return IiiiiiiiIIIII.toString();
    }

    public static String iIiIiiiiIIiii(double xs) {
        if (xs == (double)((int)xs)) {
            return String.valueOf((int)xs);
        }
        String IiiiiiiiIIIII = String.valueOf(xs);
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf(".");
        if (IiiiiiiiIIIII.length() - IiiiiiiiIIIII2 != 2) return String.valueOf(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII2)) + IiiiiiiiIIIII.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII2 + 2);
        return IiiiiiiiIIIII;
    }

    private static /* synthetic */ String ALLATORIxDEMO(String v, String b, int type) {
        if (v == null) {
            v = "";
        }
        if (b == null) return v;
        if (b.equals("")) {
            return v;
        }
        int IiiiiiiiIIIII = b.indexOf("=");
        if (IiiiiiiiIIIII == -1) {
            return v;
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        String IiiiiiiiIIIII3 = b.substring(0, IiiiiiiiIIIII + 1);
        double IiiiiiiiIIIII4 = Double.parseDouble(b.substring(IiiiiiiiIIIII + 1));
        if (type == 3) {
            IiiiiiiiIIIII4 = -IiiiiiiiIIIII4;
        }
        if (v.startsWith(IiiiiiiiIIIII3)) {
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3);
            if (v.equals("")) {
                IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII4);
                return IiiiiiiiIIIII2.toString();
            }
            IiiiiiiiIIIII = v.indexOf("|");
            if (IiiiiiiiIIIII == -1) {
                IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII3.length())));
            } else {
                IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII3.length(), IiiiiiiiIIIII)));
                IiiiiiiiIIIII2.append(v.substring(IiiiiiiiIIIII));
            }
            return IiiiiiiiIIIII2.toString();
        }
        IiiiiiiiIIIII = v.indexOf("|" + IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII == -1) {
            if (!v.equals("")) {
                IiiiiiiiIIIII2.append(v);
                IiiiiiiiIIIII2.append("|");
            }
            IiiiiiiiIIIII2.append(b);
            return IiiiiiiiIIIII2.toString();
        }
        int IiiiiiiiIIIII5 = v.indexOf("|", IiiiiiiiIIIII + 1);
        if (IiiiiiiiIIIII5 == -1) {
            IiiiiiiiIIIII2.append(v.substring(0, IiiiiiiiIIIII));
            IiiiiiiiIIIII2.append("|");
            IiiiiiiiIIIII2.append(IiiiiiiiIIIII3);
            IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1)));
            return IiiiiiiiIIIII2.toString();
        }
        IiiiiiiiIIIII2.append(v.substring(0, IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1));
        IIIiiiiiIiIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1, IiiiiiiiIIIII5)));
        IiiiiiiiIIIII2.append(v.substring(IiiiiiiiIIIII5));
        return IiiiiiiiIIIII2.toString();
    }

    public static String ALLATORIxDEMO(String[] stringArray) {
        String[] v;
        return stringArray[IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(v.length)];
    }

    public static String ALLATORIxDEMO(double xs) {
        String IiiiiiiiIIIII = String.valueOf(xs);
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("\\.");
        if (IiiiiiiiIIIII2.length == 1) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII2[1].length() <= 3) {
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII2[1] = IiiiiiiiIIIII2[1].substring(0, 3);
        IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII2[0]) + "." + IiiiiiiiIIIII2[1];
        return IiiiiiiiIIIII;
    }

    public static double ALLATORIxDEMO(double min, double max, int type) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < type) {
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append("0");
        }
        max -= min;
        max = max / 4.0 * (double)IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(5);
        DecimalFormat IiiiiiiiIIIII22 = new DecimalFormat("#." + IiiiiiiiIIIII);
        return Double.valueOf(IiiiiiiiIIIII22.format(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextDouble() * max + min));
    }

    public static String ALLATORIxDEMO(String value, String head, String split) {
        if (value == null) return null;
        if (value.equals("")) {
            return null;
        }
        if (value.startsWith(head)) {
            int IiiiiiiiIIIII = value.indexOf(split);
            return value.substring(head.length(), IiiiiiiiIIIII != -1 ? IiiiiiiiIIIII : value.length());
        }
        int IiiiiiiiIIIII = value.indexOf(String.valueOf(split) + head);
        if (IiiiiiiiIIIII == -1) {
            return null;
        }
        String IiiiiiiiIIIII2 = value.substring(IiiiiiiiIIIII + split.length() + head.length());
        if ((IiiiiiiiIIIII = IiiiiiiiIIIII2.indexOf(split)) != -1) return IiiiiiiiIIIII2.substring(0, IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    public static long ALLATORIxDEMO(String value, String head, String split) {
        if ((value = IIIiiiiiIiIiI.ALLATORIxDEMO(value, head, split)) == null) return 0L;
        if (!value.equals("")) return Long.parseLong(value);
        return 0L;
    }

    public static void ALLATORIxDEMO(StringBuffer buffer, double value) {
        if (value == (double)((int)value)) {
            buffer.append((int)value);
            return;
        }
        buffer.append(value);
    }

    public static String ALLATORIxDEMO(String v, String b) {
        try {
            return v.split(String.valueOf(b) + "=")[1].split("\\|")[0];
        }
        catch (Exception exception) {
            return "";
        }
    }
}
