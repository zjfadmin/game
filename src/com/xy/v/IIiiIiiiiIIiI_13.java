/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.v;

import com.xy.v.IiiiIiiiiIiIi;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiiIiiiiIIiI {
    private static final char iiiiIiiiIiiII = 'A';
    private static Pattern iiiIiiiiiiiIi;
    private static Pattern iIiiIiiiiiiII;
    private static final char IIiiIiiiIIiIi = '-';
    static int iIiIiiiiIiIii;
    private static Pattern IiIIIiiiiIiiI;
    private static final char iiIiiiiiiiIii = '9';
    private static final char IiiiiiiiIIIII = 'V';
    private static final char ALLATORIxDEMO = '0';

    public static int ALLATORIxDEMO(String v, String text) {
        if (v == null) return 0;
        if (v.equals("")) {
            return 0;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while ((IiiiiiiiIIIII2 = text.indexOf(v, IiiiiiiiIIIII2)) != -1) {
            ++IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public static void ALLATORIxDEMO(StringBuffer buffer, double value) {
        if (value == (double)((int)value)) {
            buffer.append((int)value);
            return;
        }
        buffer.append(value);
    }

    public static long[] ALLATORIxDEMO(String strings, long id) {
        String[] IiiiiiiiIIIII = strings.split("\\|");
        if (!IiiiiiiiIIIII[0].equals(String.valueOf(id))) {
            return null;
        }
        long[] IiiiiiiiIIIII2 = new long[IiiiiiiiIIIII.length];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            int n = IiiiiiiiIIIII3;
            long l = Long.parseLong(IiiiiiiiIIIII[IiiiiiiiIIIII3]);
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2[n] = l;
        }
        return IiiiiiiiIIIII2;
    }

    public static String ALLATORIxDEMO(long[] ids, int index, String split) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = index;
        while (IiiiiiiiIIIII3 < ids.length) {
            if (ids[IiiiiiiiIIIII3] == 0L) {
                ++IiiiiiiiIIIII2;
            } else {
                if (IiiiiiiiIIIII2 != 0) {
                    if (IiiiiiiiIIIII.length() != 0) {
                        IiiiiiiiIIIII.append(split);
                    }
                    IiiiiiiiIIIII.append(-IiiiiiiiIIIII2);
                    IiiiiiiiIIIII2 = 0;
                }
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append(split);
                }
                IiiiiiiiIIIII.append(ids[IiiiiiiiIIIII3]);
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII.toString();
    }

    public static String ALLATORIxDEMO(double xs, int num) {
        if (xs == (double)((int)xs)) return String.valueOf((int)xs);
        if (num <= 0) {
            return String.valueOf((int)xs);
        }
        String IiiiiiiiIIIII = String.valueOf(xs);
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.indexOf(".");
        if (IiiiiiiiIIIII2 == -1) return IiiiiiiiIIIII;
        if (IiiiiiiiIIIII.length() - IiiiiiiiIIIII2 >= ++num) return String.valueOf(IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII2)) + IiiiiiiiIIIII.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII2 + num);
        return IiiiiiiiIIIII;
    }

    public static int ALLATORIxDEMO(String value, String head, String split) {
        if ((value = IIiiIiiiiIIiI.iIiIiiiiIIiii(value, head, split)) == null) return 0;
        if (!value.equals("")) return Integer.parseInt(value);
        return 0;
    }

    static NumberFormatException ALLATORIxDEMO(String s) {
        return new NumberFormatException("For input string: \"" + s + "\"");
    }

    public static boolean iIiIiiiiIIiIi(String v) {
        if (v == null) return true;
        if (v.equals("")) return true;
        return false;
    }

    private static /* synthetic */ String iIiIiiiiIIiii(String v, String b, int type) {
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
                IIiiIiiiiIIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII4);
                return IiiiiiiiIIIII2.toString();
            }
            IiiiiiiiIIIII = v.indexOf("|");
            if (IiiiiiiiIIIII == -1) {
                IIiiIiiiiIIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII3.length())));
            } else {
                IIiiIiiiiIIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII3.length(), IiiiiiiiIIIII)));
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
            IIiiIiiiiIIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1)));
            return IiiiiiiiIIIII2.toString();
        }
        IiiiiiiiIIIII2.append(v.substring(0, IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1));
        IIiiIiiiiIIiI.ALLATORIxDEMO(IiiiiiiiIIIII2, type == 1 ? IiiiiiiiIIIII4 : IiiiiiiiIIIII4 + Double.parseDouble(v.substring(IiiiiiiiIIIII + IiiiiiiiIIIII3.length() + 1, IiiiiiiiIIIII5)));
        IiiiiiiiIIIII2.append(v.substring(IiiiiiiiIIIII5));
        return IiiiiiiiIIIII2.toString();
    }

    public static long iIiIiiiiIIiii(String s, int i, int len) throws NumberFormatException {
        if (s == null) {
            throw new NumberFormatException("null");
        }
        if (i < 0) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (len > s.length()) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (i >= len) {
            throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        }
        long IiiiiiiiIIIII = 0L;
        boolean IiiiiiiiIIIII2 = true;
        char IiiiiiiiIIIII3 = s.charAt(i);
        if (IiiiiiiiIIIII3 == '-') {
            IiiiiiiiIIIII2 = false;
            ++i;
        }
        --len;
        while (len >= i) {
            IiiiiiiiIIIII3 = s.charAt(len);
            IiiiiiiiIIIII <<= 5;
            if (IiiiiiiiIIIII3 >= '0' && IiiiiiiiIIIII3 <= '9') {
                IiiiiiiiIIIII += (long)(IiiiiiiiIIIII3 - 48);
            } else {
                if (IiiiiiiiIIIII3 < 'A') throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
                if (IiiiiiiiIIIII3 > 'V') throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
                IiiiiiiiIIIII += (long)(IiiiiiiiIIIII3 - 65 + 10);
            }
            --len;
        }
        if (!IiiiiiiiIIIII2) return -IiiiiiiiIIIII;
        return IiiiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(int[] datas, int id) {
        int[] nArray = datas;
        int n = nArray.length;
        int n2 = 0;
        while (n2 < n) {
            if (nArray[n2] == id) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static String ALLATORIxDEMO(int index) {
        if (index == 0) {
            return "A";
        }
        if (index == 1) {
            return "B";
        }
        if (index == 2) {
            return "C";
        }
        if (index == 3) {
            return "D";
        }
        if (index == 4) {
            return "E";
        }
        if (index == 5) {
            return "F";
        }
        if (index == 6) {
            return "G";
        }
        if (index == 7) {
            return "H";
        }
        if (index == 8) {
            return "I";
        }
        if (index == 9) {
            return "J";
        }
        if (index == 10) {
            return "K";
        }
        if (index == 11) {
            return "L";
        }
        if (index == 12) {
            return "M";
        }
        if (index == 13) {
            return "N";
        }
        if (index == 14) {
            return "O";
        }
        if (index == 15) {
            return "P";
        }
        if (index == 16) {
            return "Q";
        }
        if (index == 17) {
            return "R";
        }
        if (index == 18) {
            return "S";
        }
        if (index == 19) {
            return "T";
        }
        if (index == 20) {
            return "U";
        }
        if (index == 21) {
            return "V";
        }
        if (index == 22) {
            return "W";
        }
        if (index == 23) {
            return "X";
        }
        if (index == 24) {
            return "Y";
        }
        if (index != 25) return "A";
        return "Z";
    }

    public static int ALLATORIxDEMO(String string) {
        String s;
        return IIiiIiiiiIIiI.ALLATORIxDEMO(string, 0, s.length());
    }

    public static long ALLATORIxDEMO(int point, String value, int index, String split) {
        if (value == null) return 0L;
        if (value.equals("")) {
            return 0L;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (true) {
            long IiiiiiiiIIIII3;
            index = (IiiiiiiiIIIII3 = Long.parseLong(value.substring(IiiiiiiiIIIII2, (IiiiiiiiIIIII = value.indexOf(split, IiiiiiiiIIIII2)) != -1 ? IiiiiiiiIIIII : value.length()))) < 0L ? (int)((long)index + -IiiiiiiiIIIII3) : (IiiiiiiiIIIII3 == 0L ? ++index : ++index);
            if (index >= point) {
                if (IiiiiiiiIIIII3 <= 0L) return 0L;
                return IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII == -1) {
                return 0L;
            }
            IiiiiiiiIIIII2 = IiiiiiiiIIIII + 1;
        }
    }

    public static long ALLATORIxDEMO(String value, String head, String split) {
        if ((value = IIiiIiiiiIIiI.iIiIiiiiIIiii(value, head, split)) == null) return 0L;
        if (!value.equals("")) return Long.parseLong(value);
        return 0L;
    }

    public static String ALLATORIxDEMO(String v, String b, int type) {
        if (type == 2) return IIiiIiiiiIIiI.iIiIiiiiIIiii(v, b, type);
        if (type == 3) {
            return IIiiIiiiiIIiI.iIiIiiiiIIiii(v, b, type);
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

    public static int ALLATORIxDEMO(int[] datas, int mask, int id) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < datas.length) {
            if ((datas[IiiiiiiiIIIII] & mask) == id) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return -1;
    }

    public static String ALLATORIxDEMO(String value, String head, String split, String data) {
        if (value == null) return data;
        if (value.equals("")) {
            return data;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (value.startsWith(head)) {
            int IiiiiiiiIIIII2 = value.indexOf(split);
            if (data != null) {
                IiiiiiiiIIIII.append(value.substring(0, head.length() - head.length()));
                IiiiiiiiIIIII.append(data);
                if (IiiiiiiiIIIII2 == -1) return IiiiiiiiIIIII.toString();
                IiiiiiiiIIIII.append(value.substring(IiiiiiiiIIIII2));
            } else {
                if (IiiiiiiiIIIII2 == -1) return IiiiiiiiIIIII.toString();
                IiiiiiiiIIIII.append(value.substring(IiiiiiiiIIIII2 + 1));
            }
            return IiiiiiiiIIIII.toString();
        }
        int IiiiiiiiIIIII3 = value.indexOf(String.valueOf(split) + head);
        if (IiiiiiiiIIIII3 == -1) {
            if (data == null) {
                return value;
            }
            IiiiiiiiIIIII.append(value);
            IiiiiiiiIIIII.append(split);
            IiiiiiiiIIIII.append(data);
            return IiiiiiiiIIIII.toString();
        }
        if (data == null) {
            IiiiiiiiIIIII.append(value.substring(0, IiiiiiiiIIIII3));
            String IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII3 + split.length() + head.length());
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4.indexOf(split);
            if (IiiiiiiiIIIII3 == -1) {
                return IiiiiiiiIIIII.toString();
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII4.substring(IiiiiiiiIIIII3));
            return IiiiiiiiIIIII.toString();
        }
        IiiiiiiiIIIII.append(value.substring(0, IiiiiiiiIIIII3 + split.length()));
        String IiiiiiiiIIIII5 = value.substring(IiiiiiiiIIIII3 + split.length() + head.length());
        IiiiiiiiIIIII3 = IiiiiiiiIIIII5.indexOf(split);
        if (IiiiiiiiIIIII3 == -1) {
            IiiiiiiiIIIII.append(data);
            return IiiiiiiiIIIII.toString();
        }
        IiiiiiiiIIIII.append(data);
        IiiiiiiiIIIII.append(IiiiiiiiIIIII5.substring(IiiiiiiiIIIII3));
        return IiiiiiiiIIIII.toString();
    }

    public static long ALLATORIxDEMO(String s, int i, int len) throws NumberFormatException {
        if (s == null) {
            throw new NumberFormatException("null");
        }
        if (i < 0) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (len > s.length()) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (i >= len) {
            throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        }
        long IiiiiiiiIIIII = 0L;
        boolean IiiiiiiiIIIII2 = false;
        long IiiiiiiiIIIII3 = -9223372036854775807L;
        char IiiiiiiiIIIII4 = s.charAt(i);
        if (IiiiiiiiIIIII4 < '0') {
            if (IiiiiiiiIIIII4 == '-') {
                IiiiiiiiIIIII2 = true;
                IiiiiiiiIIIII3 = Long.MIN_VALUE;
            } else if (IiiiiiiiIIIII4 != '+') {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            if (++i == len) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
        }
        long IiiiiiiiIIIII5 = IiiiiiiiIIIII3 / (long)iIiIiiiiIiIii;
        while (i < len) {
            int n = Character.digit(s.charAt(i), iIiIiiiiIiIii);
            ++i;
            int IiiiiiiiIIIII6 = n;
            if (IiiiiiiiIIIII6 < 0) throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            if (IiiiiiiiIIIII < IiiiiiiiIIIII5) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            if ((IiiiiiiiIIIII *= (long)iIiIiiiiIiIii) < IiiiiiiiIIIII3 + (long)IiiiiiiiIIIII6) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            IiiiiiiiIIIII -= (long)IiiiiiiiIIIII6;
        }
        if (!IiiiiiiiIIIII2) return -IiiiiiiiIIIII;
        return IiiiiiiiIIIII;
    }

    public static int ALLATORIxDEMO(int num) {
        if (num < 10) {
            return 1;
        }
        if (num < 100) {
            return 2;
        }
        if (num < 1000) {
            return 3;
        }
        if (num < 10000) {
            return 4;
        }
        if (num < 100000) {
            return 5;
        }
        if (num < 1000000) {
            return 6;
        }
        if (num < 10000000) {
            return 7;
        }
        if (num < 100000000) {
            return 8;
        }
        if (num >= 1000000000) return 10;
        return 9;
    }

    public static boolean iiiIiiiiiiIIi(String str) {
        if (str == null) return false;
        if (!str.equals("")) return iIiiIiiiiiiII.matcher(str).matches();
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public static List<Long> iiiIiiiiiiIIi(String strings) {
        IiiiiiiiIIIII = new ArrayList<Long>();
        if (strings == null) return IiiiiiiiIIIII;
        if (strings.equals("")) {
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = strings.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                block5: {
                    block4: {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-") == -1) break block4;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.intValue();
                        if (true) ** GOTO lbl29
                    }
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("&") == -1) break block5;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = Long.parseLong(IiiiiiiiIIIII[0]);
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl35
                }
                IiiiiiiiIIIII.add(Long.parseLong(IiiiiiiiIIIII[IiiiiiiiIIIII]));
                break block6;
                do {
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                    ++IiiiiiiiIIIII;
lbl29:
                    // 2 sources

                } while (IiiiiiiiIIIII <= (long)IiiiiiiiIIIII.intValue());
                break block6;
                do {
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII);
lbl35:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public static Integer ALLATORIxDEMO(String string) {
        if (string == null) return null;
        if (string.equals("")) {
            return null;
        }
        Integer IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = string.indexOf("|");
        int IiiiiiiiIIIII5 = -1;
        while (true) {
            String IiiiiiiiIIIII6 = null;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII3 == 0 && IiiiiiiiIIIII4 == -1 ? string : string.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII4 != -1 ? IiiiiiiiIIIII4 : string.length());
            IiiiiiiiIIIII5 = IiiiiiiiIIIII6.indexOf("-");
            if (IiiiiiiiIIIII5 == -1) {
                if (IiiiiiiiIIIII == null || IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(++IiiiiiiiIIIII2) == 1) {
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII6);
                }
            } else {
                int IiiiiiiiIIIII7;
                Integer IiiiiiiiIIIII8 = Integer.parseInt(IiiiiiiiIIIII6.substring(0, IiiiiiiiIIIII5));
                Integer IiiiiiiiIIIII9 = Integer.parseInt(IiiiiiiiIIIII6.substring(IiiiiiiiIIIII5 + 1));
                if (IiiiiiiiIIIII9 > IiiiiiiiIIIII8 && (IiiiiiiiIIIII7 = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII2 += IiiiiiiiIIIII9 - IiiiiiiiIIIII8 + 1)) <= IiiiiiiiIIIII9 - IiiiiiiiIIIII8) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII8 + IiiiiiiiIIIII7;
                }
            }
            if (IiiiiiiiIIIII4 == -1) {
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
            IiiiiiiiIIIII4 = string.indexOf("|", IiiiiiiiIIIII3);
        }
    }

    public static boolean ALLATORIxDEMO(BigDecimal v1, BigDecimal v2) {
        if (v1 == null && v2 == null) {
            return true;
        }
        if (v1 == null) return false;
        if (v2 == null) {
            return false;
        }
        if (v1.compareTo(v2) != 0) return false;
        return true;
    }

    public static long[] ALLATORIxDEMO(long[] ids, String value, int index, String split) {
        if (value == null) return ids;
        if (value.equals("")) {
            return ids;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (true) {
            long IiiiiiiiIIIII3;
            if ((IiiiiiiiIIIII3 = Long.parseLong(value.substring(IiiiiiiiIIIII2, (IiiiiiiiIIIII = value.indexOf(split, IiiiiiiiIIIII2)) != -1 ? IiiiiiiiIIIII : value.length()))) < 0L) {
                index = (int)((long)index + -IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII3 == 0L) {
                ++index;
            } else {
                ids[index++] = IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII == -1) return ids;
            if (index >= ids.length) {
                return ids;
            }
            IiiiiiiiIIIII2 = IiiiiiiiIIIII + 1;
        }
    }

    public static boolean ALLATORIxDEMO(Integer v1, Integer v2) {
        if (v1 != null && v2 != null) {
            if (v1.intValue() != v2.intValue()) return false;
            return true;
        }
        if (v1 != null) return false;
        if (v2 != null) return false;
        return true;
    }

    public static boolean iIiIiiiiIIiii(String str) {
        return iiiIiiiiiiiIi.matcher(str).matches();
    }

    static {
        iIiiIiiiiiiII = Pattern.compile("^[0-9]*$");
        iiiIiiiiiiiIi = Pattern.compile("^-?\\d+$");
        IiIIIiiiiIiiI = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,24}$");
        iIiIiiiiIiIii = 10;
    }

    public static boolean ALLATORIxDEMO(String str) {
        return IiIIIiiiiIiiI.matcher(str).matches();
    }

    public static int ALLATORIxDEMO(char v, String text) {
        return IIiiIiiiiIIiI.ALLATORIxDEMO(v, text, 0, text.length());
    }

    public static int ALLATORIxDEMO(String s, int i, int len) throws NumberFormatException {
        if (s == null) {
            throw new NumberFormatException("null");
        }
        if (i < 0) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (len > s.length()) throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        if (i >= len) {
            throw new NumberFormatException("For input string: \"" + s + "\"" + " " + i + " " + len);
        }
        int IiiiiiiiIIIII = 0;
        boolean IiiiiiiiIIIII2 = false;
        int IiiiiiiiIIIII3 = -2147483647;
        char IiiiiiiiIIIII4 = s.charAt(i);
        if (IiiiiiiiIIIII4 < '0') {
            if (IiiiiiiiIIIII4 == '-') {
                IiiiiiiiIIIII2 = true;
                IiiiiiiiIIIII3 = Integer.MIN_VALUE;
            } else if (IiiiiiiiIIIII4 != '+') {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            if (++i == len) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
        }
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII3 / iIiIiiiiIiIii;
        while (i < len) {
            int n = Character.digit(s.charAt(i), iIiIiiiiIiIii);
            ++i;
            int IiiiiiiiIIIII6 = n;
            if (IiiiiiiiIIIII6 < 0) throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            if (IiiiiiiiIIIII < IiiiiiiiIIIII5) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            if ((IiiiiiiiIIIII *= iIiIiiiiIiIii) < IiiiiiiiIIIII3 + IiiiiiiiIIIII6) {
                throw IIiiIiiiiIIiI.ALLATORIxDEMO(s);
            }
            IiiiiiiiIIIII -= IiiiiiiiIIIII6;
        }
        if (!IiiiiiiiIIIII2) return -IiiiiiiiIIIII;
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public static List<Integer> iIiIiiiiIIiii(String strings) {
        IiiiiiiiIIIII = new ArrayList<Integer>();
        if (strings == null) return IiiiiiiiIIIII;
        if (strings.equals("")) {
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = strings.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                block5: {
                    block4: {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-") == -1) break block4;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                        if (true) ** GOTO lbl28
                    }
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("&") == -1) break block5;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl34
                }
                IiiiiiiiIIIII.add(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]));
                break block6;
                do {
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII++);
lbl28:
                    // 2 sources

                } while (IiiiiiiiIIIII <= IiiiiiiiIIIII);
                break block6;
                do {
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII);
lbl34:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public static void ALLATORIxDEMO(long value, StringBuffer buffer) throws NumberFormatException {
        if (value < 0L) {
            buffer.append('-');
            value = -value;
        }
        long IiiiiiiiIIIII = 1L;
        while (true) {
            buffer.append((char)((IiiiiiiiIIIII = value % 32L) >= 10L ? 65L + (IiiiiiiiIIIII - 10L) : 48L + IiiiiiiiIIIII));
            if (value < 32L) {
                return;
            }
            value /= 32L;
        }
    }

    public static long ALLATORIxDEMO(String string) {
        String s;
        return IIiiIiiiiIIiI.ALLATORIxDEMO(string, 0, s.length());
    }

    public static List<String> ALLATORIxDEMO(String splitKey, String value) {
        ArrayList<String> IiiiiiiiIIIII = new ArrayList<String>();
        int IiiiiiiiIIIII2 = -1;
        while (IiiiiiiiIIIII2 != value.length()) {
            int IiiiiiiiIIIII3;
            if ((IiiiiiiiIIIII3 = value.indexOf(splitKey, ++IiiiiiiiIIIII2)) == -1) {
                IiiiiiiiIIIII3 = value.length();
            }
            String IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            IiiiiiiiIIIII.add(IiiiiiiiIIIII4);
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static String iIiIiiiiIIiii(String value, String head, String split) {
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

    public static String ALLATORIxDEMO(String str, String strStart, String strEnd) {
        int IiiiiiiiIIIII = str.indexOf(strStart);
        if (IiiiiiiiIIIII == -1) {
            return null;
        }
        int IiiiiiiiIIIII2 = str.indexOf(strEnd, IiiiiiiiIIIII += strStart.length());
        if (IiiiiiiiIIIII2 != -1) return str.substring(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static List<String> ALLATORIxDEMO(String allNpcID) {
        IiiiiiiiIIIII = new ArrayList<String>();
        if (allNpcID == null) return IiiiiiiiIIIII;
        if (allNpcID.equals("") != false) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = allNpcID.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block5: {
                block4: {
                    block3: {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-") == -1) break block3;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-");
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                        if (true) ** GOTO lbl26
                    }
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("&") == -1) break block4;
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("&");
                    IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl32
                }
                IiiiiiiiIIIII.add(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                break block5;
                do {
                    IiiiiiiiIIIII.add(String.valueOf(IiiiiiiiIIIII++));
lbl26:
                    // 2 sources

                } while (IiiiiiiiIIIII <= IiiiiiiiIIIII);
                break block5;
                do {
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII[0]);
lbl32:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }

    public static void main(String[] stringArray) {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        System.out.println(IIiiIiiiiIIiI.iIiIiiiiIIiii("-10.00"));
        System.out.println(IIiiIiiiiIIiI.iiiIiiiiiiIIi("100.1"));
        System.out.println(0.3999999999999999);
    }

    /*
     * Handled impossible loop by duplicating code
     */
    public static int ALLATORIxDEMO(char v, String text, int index, int indexEnd) {
        int IiiiiiiiIIIII;
        block3: {
            block2: {
                IiiiiiiiIIIII = 0;
                if (!true) break block2;
                index = text.indexOf(v, index);
                if (index == -1) return IiiiiiiiIIIII;
                if (index >= indexEnd) break block3;
            }
            do {
                ++index;
                ++IiiiiiiiIIIII;
                index = text.indexOf(v, index);
                if (index == -1) return IiiiiiiiIIIII;
            } while (index < indexEnd);
        }
        return IiiiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(String v1, String v2) {
        if (v1 != null && v1.equals("")) {
            v1 = null;
        }
        if (v2 != null && v2.equals("")) {
            v2 = null;
        }
        if (v1 != null) {
            if (v2 != null) return v1.equals(v2);
        }
        if (v1 != null) return false;
        if (v2 != null) return false;
        return true;
    }
}
