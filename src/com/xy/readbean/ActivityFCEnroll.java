/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.readbean;

import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import java.awt.Point;

public class ActivityFCEnroll {
    private int t1;
    private ActivityFCBase[] uses;
    private static String[] KEYS = new String[]{"\u4eba\u6570\u8981\u6c42", "\u7b49\u7ea7\u8981\u6c42", "\u6d88\u8017", "\u8bf4\u660e"};
    private Point requireNum;
    private Point requireLvl;
    private int t2;

    public ActivityFCEnroll(String value) {
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
                this.iIiIiiiiIIiii(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[2])) {
                this.uses = ActivityFC.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[3])) {
                this.iiiIiiiiiiIIi(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public void iiiIiiiiiiIIi(String value, int index, int valueEnd) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            if (IiiiiiiiIIIII == 0) {
                this.t1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.t2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public int getT1() {
        return this.t1;
    }

    public void setUses(ActivityFCBase[] uses) {
        this.uses = uses;
    }

    public Point getRequireNum() {
        return this.requireNum;
    }

    public void setRequireNum(Point requireNum) {
        this.requireNum = requireNum;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public void iIiIiiiiIIiii(String value, int index, int valueEnd) {
        Point IiiiiiiiIIIII = new Point();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < valueEnd) {
            IiiiiiiiIIIII3 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > valueEnd) {
                IiiiiiiiIIIII3 = valueEnd;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII.x = IiiiIiiiiIIII.ALLATORIxDEMO((String)value.substring(index, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII.y = IiiiIiiiiIIII.ALLATORIxDEMO((String)value.substring(index, IiiiiiiiIIIII3));
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        this.requireLvl = IiiiiiiiIIIII;
    }

    public Point getRequireLvl() {
        return this.requireLvl;
    }

    public void ALLATORIxDEMO(String value, int index, int valueEnd) {
        Point IiiiiiiiIIIII = new Point();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < valueEnd) {
            IiiiiiiiIIIII3 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > valueEnd) {
                IiiiiiiiIIIII3 = valueEnd;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII.x = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII2 == 1) {
                IiiiiiiiIIIII.y = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        this.requireNum = IiiiiiiiIIIII;
    }

    public int getT2() {
        return this.t2;
    }

    public ActivityFCBase[] getUses() {
        return this.uses;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public void setRequireLvl(Point requireLvl) {
        this.requireLvl = requireLvl;
    }
}
