/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.v.IIiiIiiiiIIiI;

public class ActivityFCTarget {
    private String skin;
    private int t2;
    private static String[] RECORDKEYS;
    private ActivityFCBase target;
    private static String[] TARGETKEYS;
    private int reset;
    private int t1;
    private static String[] KEYS;
    private ActivityFCBase[] gains;

    public int getT1() {
        return this.t1;
    }

    public ActivityFCBase getTarget() {
        return this.target;
    }

    public int getReset() {
        return this.reset;
    }

    public int getT2() {
        return this.t2;
    }

    static {
        KEYS = new String[]{"\u8981\u6c42", "\u83b7\u5f97", "\u91cd\u7f6e", "\u6807\u9898", "\u7b80\u4ecb", "\u56fe\u6807"};
        TARGETKEYS = new String[]{"\u6d3b\u52a8\u6570\u503c", "\u5b8c\u6210\u4efb\u52a1"};
        RECORDKEYS = new String[]{"\u83b7\u5f97\u8d27\u5e01", "\u6d88\u8017\u8d27\u5e01", "\u5b8c\u6210\u4efb\u52a1", "\u6307\u5b9arobot", "\u7948\u798f"};
    }

    public void setGains(ActivityFCBase[] gains) {
        this.gains = gains;
    }

    public void ALLATORIxDEMO(String value, int index, int valueEnd) {
        ActivityFCBase IiiiiiiiIIIII = new ActivityFCBase();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < valueEnd) {
            IiiiiiiiIIIII3 = value.indexOf(",", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > valueEnd) {
                IiiiiiiiIIIII3 = valueEnd;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII.setType(ActivityFCTarget.getActivityTargetKey(value.substring(index, IiiiiiiiIIIII3)));
                if (IiiiiiiiIIIII.getType() == 0) {
                    throw new ArithmeticException("\u5f02\u5e38\u8981\u6c42\u7c7b\u578b:" + value.substring(index, IiiiiiiiIIIII3));
                }
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 2) {
                IiiiiiiiIIIII.setNum((long)IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        this.target = IiiiiiiiIIIII;
    }

    public void setTarget(ActivityFCBase target) {
        this.target = target;
    }

    public ActivityFCTarget(String value) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < value.length()) {
            String IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = value.indexOf("|", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = value.length();
            }
            if ((IiiiiiiiIIIII3 = value.indexOf("=", IiiiiiiiIIIII + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII2) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
            }
            if ((IiiiiiiiIIIII4 = value.substring(IiiiiiiiIIIII, IiiiiiiiIIIII3)).equals(KEYS[0])) {
                this.ALLATORIxDEMO(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[1])) {
                this.gains = ActivityFC.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[2])) {
                this.reset = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[3])) {
                this.t1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[4])) {
                this.t2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[5])) {
                this.skin = value.substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public static int getActivityTargetKey(String key) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < TARGETKEYS.length) {
            if (TARGETKEYS[IiiiiiiiIIIII].equals(key)) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public static int getActivityRecordKey(String key) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < RECORDKEYS.length) {
            if (RECORDKEYS[IiiiiiiiIIIII].equals(key)) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public String getSkin() {
        return this.skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public ActivityFCBase[] getGains() {
        return this.gains;
    }
}
