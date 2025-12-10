/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiIii {
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

    public static boolean ALLATORIxDEMO(int id, String value) {
        if (value == null) return false;
        if (value.equals("")) {
            return false;
        }
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("-") != -1) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("-");
                Integer IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII3[0]);
                Integer IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII3[1]);
                if (id >= IiiiiiiiIIIII4 && id <= IiiiiiiiIIIII5) {
                    return true;
                }
            } else if (IiiiiiiiIIIII[IiiiiiiiIIIII2].indexOf("&") != -1 ? id == Integer.parseInt((IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("&"))[0]) : id == Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2])) {
                return true;
            }
            ++IiiiiiiiIIIII2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public static List<String> iIiIiiiiIIiii(String allNpcID) {
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

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(String value, String key, long zhi) {
        void IiiiiiiiIIIII;
        if (value == null) return String.valueOf(key) + "=" + zhi;
        if (value.equals("")) {
            return String.valueOf(key) + "=" + zhi;
        }
        if (value.startsWith(String.valueOf(key) + "=")) {
            int IiiiiiiiIIIII2 = value.indexOf("|");
            if (IiiiiiiiIIIII2 != -1) return String.valueOf(key) + "=" + zhi + value.substring(IiiiiiiiIIIII2);
            return String.valueOf(key) + "=" + zhi;
        }
        int IiiiiiiiIIIII3 = value.indexOf("|" + key + "=");
        if (IiiiiiiiIIIII3 == -1) {
            return String.valueOf(value) + "|" + key + "=" + zhi;
        }
        int IiiiiiiiIIIII4 = value.indexOf("|", IiiiiiiiIIIII3 + 1);
        if (IiiiiiiiIIIII4 == -1) {
            return String.valueOf(value.substring(0, IiiiiiiiIIIII3)) + "|" + key + "=" + zhi;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(value.substring(0, IiiiiiiiIIIII3 + key.length() + 2));
        stringBuffer.append(zhi);
        IiiiiiiiIIIII.append(value.substring(IiiiiiiiIIIII4));
        return IiiiiiiiIIIII.toString();
    }

    public static String ALLATORIxDEMO(String value, String head, String split, String data) {
        if (value == null) return data;
        if (value.equals("")) {
            return data;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (value.startsWith(head)) {
            int IiiiiiiiIIIII2 = value.indexOf(split);
            IiiiiiiiIIIII.append(value.substring(0, head.length() - head.length()));
            IiiiiiiiIIIII.append(data);
            if (IiiiiiiiIIIII2 == -1) return IiiiiiiiIIIII.toString();
            IiiiiiiiIIIII.append(value.substring(IiiiiiiiIIIII2));
            return IiiiiiiiIIIII.toString();
        }
        int IiiiiiiiIIIII3 = value.indexOf(String.valueOf(split) + head);
        if (IiiiiiiiIIIII3 == -1) {
            IiiiiiiiIIIII.append(value);
            IiiiiiiiIIIII.append(split);
            IiiiiiiiIIIII.append(data);
            return IiiiiiiiIIIII.toString();
        }
        IiiiiiiiIIIII.append(value.substring(0, IiiiiiiiIIIII3 + split.length()));
        String IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII3 + split.length() + head.length());
        IiiiiiiiIIIII3 = IiiiiiiiIIIII4.indexOf(split);
        if (IiiiiiiiIIIII3 == -1) {
            IiiiiiiiIIIII.append(data);
            return IiiiiiiiIIIII.toString();
        }
        IiiiiiiiIIIII.append(data);
        IiiiiiiiIIIII.append(IiiiiiiiIIIII4.substring(IiiiiiiiIIIII3));
        return IiiiiiiiIIIII.toString();
    }

    public static String ALLATORIxDEMO(String value, int num) {
        if (value == null) return value;
        if (value.equals("")) {
            return value;
        }
        int IiiiiiiiIIIII = value.indexOf(".");
        if (IiiiiiiiIIIII == -1) {
            return value;
        }
        if ((IiiiiiiiIIIII += num + 1) <= value.length()) return value.substring(0, IiiiiiiiIIIII);
        IiiiiiiiIIIII = value.length();
        return value.substring(0, IiiiiiiiIIIII);
    }

    public static long ALLATORIxDEMO(String value, String head, String split) {
        if ((value = IIIIIiiiIiIii.ALLATORIxDEMO(value, head, split)) == null) return 0L;
        if (!value.equals("")) return Long.parseLong(value);
        return 0L;
    }

    /*
     * Unable to fully structure code
     */
    public static List<Long> ALLATORIxDEMO(String strings) {
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

    public static int ALLATORIxDEMO(char v, String text) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while ((IiiiiiiiIIIII2 = text.indexOf(v, IiiiiiiiIIIII2)) != -1) {
            ++IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII;
        }
        return IiiiiiiiIIIII;
    }
}
