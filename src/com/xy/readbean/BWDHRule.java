/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Point;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BWDHRule {
    private Point[] BWDH1Times;
    private static String[] KEYS = new String[]{"\u62a5\u540d", "\u79ef\u5206\u8d5b", "\u5165\u56f4\u8d5b", "\u534a\u51b3\u8d5b", "\u603b\u51b3\u8d5b", "\u6d3b\u52a8\u7981\u6b62"};
    private Point[] BWDH4Times;
    private Point[] BWDH2Times;
    private Point[] banTimes;
    private static String[] ITMES = new String[]{"\u5929", "\u65f6", "\u5206", "\u79d2"};
    private Point[] BWDH3Times;
    private Point[] enrollTimes;

    public BWDHRule(String value) {
        Object IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII4 < value.length()) {
            IiiiiiiiIIIII4 = value.indexOf("|", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = value.length();
            }
            if ((IiiiiiiiIIIII5 = value.indexOf("=", IiiiiiiiIIIII3 + 1)) == -1 || IiiiiiiiIIIII5 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4;
            }
            IiiiiiiiIIIII2 = value.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII5);
            IiiiiiiiIIIII = this.ALLATORIxDEMO(value, IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4);
            if (((String)IiiiiiiiIIIII2).equals(KEYS[0])) {
                this.enrollTimes = IiiiiiiiIIIII;
            } else if (((String)IiiiiiiiIIIII2).equals(KEYS[1])) {
                this.BWDH1Times = IiiiiiiiIIIII;
            } else if (((String)IiiiiiiiIIIII2).equals(KEYS[2])) {
                this.BWDH2Times = IiiiiiiiIIIII;
            } else if (((String)IiiiiiiiIIIII2).equals(KEYS[3])) {
                this.BWDH3Times = IiiiiiiiIIIII;
            } else if (((String)IiiiiiiiIIIII2).equals(KEYS[4])) {
                this.BWDH4Times = IiiiiiiiIIIII;
            } else if (((String)IiiiiiiiIIIII2).equals(KEYS[5])) {
                this.banTimes = IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
        IiiiiiiiIIIII3 = 0;
        IiiiiiiiIIIII4 = 0;
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII3 < KEYS.length) {
            Object object = IiiiiiiiIIIII3 == 0 ? this.enrollTimes : (IiiiiiiiIIIII3 == 1 ? this.BWDH1Times : (IiiiiiiiIIIII3 == 2 ? this.BWDH2Times : (IiiiiiiiIIIII3 == 3 ? this.BWDH3Times : (IiiiiiiiIIIII2 = IiiiiiiiIIIII3 == 4 ? this.BWDH4Times : this.banTimes))));
            if (IiiiiiiiIIIII2 == null && IiiiiiiiIIIII3 != 5) {
                throw new ArithmeticException("\u5f02\u5e38\u8d5b\u5236\u8bbe\u7f6e:\u672a\u8bbe\u7f6e" + KEYS[IiiiiiiiIIIII3]);
            }
            if (IiiiiiiiIIIII2 != null) {
                Point[] pointArray = IiiiiiiiIIIII2;
                int n = pointArray.length;
                int n2 = 0;
                while (n2 < n) {
                    IiiiiiiiIIIII = pointArray[n2];
                    if (IiiiiiiiIIIII.x > IiiiiiiiIIIII.y) throw new ArithmeticException("\u5f02\u5e38\u8d5b\u5236\u8bbe\u7f6e:\u65f6\u95f4\u987a\u5e8f\u9519\u4e71" + KEYS[IiiiiiiiIIIII3]);
                    if (IiiiiiiiIIIII5 > IiiiiiiiIIIII.x) {
                        throw new ArithmeticException("\u5f02\u5e38\u8d5b\u5236\u8bbe\u7f6e:\u65f6\u95f4\u987a\u5e8f\u9519\u4e71" + KEYS[IiiiiiiiIIIII3]);
                    }
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII.y;
                    if (IiiiiiiiIIIII3 != 5 && IiiiiiiiIIIII4 > IiiiiiiiIIIII.x) {
                        throw new ArithmeticException("\u5f02\u5e38\u8d5b\u5236\u8bbe\u7f6e:\u603b\u4f53\u65f6\u95f4\u987a\u5e8f\u9519\u4e71" + KEYS[IiiiiiiiIIIII3]);
                    }
                    if (IiiiiiiiIIIII3 != 5) {
                        IiiiiiiiIIIII4 = IiiiiiiiIIIII.y;
                    }
                    ++n2;
                }
            }
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII5 = 0;
        }
    }

    public Point[] ALLATORIxDEMO(String value, int index, int valueEnd) {
        Point[] IiiiiiiiIIIII = new Point[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'=', (String)value, (int)index, (int)valueEnd)];
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII3 < valueEnd) {
            IiiiiiiiIIIII3 = value.indexOf("=", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > valueEnd) {
                IiiiiiiiIIIII3 = valueEnd;
            }
            if ((IiiiiiiiIIIII4 = value.indexOf("#", index + 1)) == -1 || IiiiiiiiIIIII4 > IiiiiiiiIIIII3) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            }
            IiiiiiiiIIIII[IiiiiiiiIIIII2] = new Point();
            IiiiiiiiIIIII[IiiiiiiiIIIII2].x = BWDHRule.ALLATORIxDEMO(value, index, IiiiiiiiIIIII4);
            IiiiiiiiIIIII[IiiiiiiiIIIII2].y = BWDHRule.ALLATORIxDEMO(value, IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        return IiiiiiiiIIIII;
    }

    public Point[] getRuleTimes(int ruleIndex) {
        if (ruleIndex == 1) {
            return this.enrollTimes;
        }
        if (ruleIndex == 2) {
            return this.BWDH1Times;
        }
        if (ruleIndex == 3) {
            return this.BWDH2Times;
        }
        if (ruleIndex == 4) {
            return this.BWDH3Times;
        }
        if (ruleIndex == 5) {
            return this.BWDH4Times;
        }
        if (ruleIndex != -1) return null;
        return this.banTimes;
    }

    public int getRuleIndex(long time) {
        if (time < (long)this.enrollTimes[0].x) {
            return 0;
        }
        if (time < (long)this.enrollTimes[this.enrollTimes.length - 1].y) {
            return 1;
        }
        if (time < (long)this.BWDH1Times[this.BWDH1Times.length - 1].y) {
            return 2;
        }
        if (time < (long)this.BWDH2Times[this.BWDH2Times.length - 1].y) {
            return 3;
        }
        if (time < (long)this.BWDH3Times[this.BWDH3Times.length - 1].y) {
            return 4;
        }
        if (time >= (long)this.BWDH4Times[this.BWDH4Times.length - 1].y) return 6;
        return 5;
    }

    public static int ALLATORIxDEMO(String value, int index, int valueEnd) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < ITMES.length) {
            IiiiiiiiIIIII3 = value.indexOf(ITMES[IiiiiiiiIIIII2], index + 1);
            if (IiiiiiiiIIIII3 != -1 && IiiiiiiiIIIII3 <= valueEnd) {
                index = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII2 == 0) {
                    index *= 86400;
                } else if (IiiiiiiiIIIII2 == 1) {
                    index *= 3600;
                } else if (IiiiiiiiIIIII2 == 2) {
                    index *= 60;
                }
                IiiiiiiiIIIII += index;
                index = IiiiiiiiIIIII3 + 1;
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }
}
