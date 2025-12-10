/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBase
 */
package com.xy.readbean;

import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBase;

public class ActivityFCLucky {
    private ActivityFCBase[] luckys;
    private ActivityFCBase[] uses;
    private static String[] KEYS = new String[]{"\u6d88\u8017", "\u83b7\u5f97", "\u5927\u5956\u8bbe\u7f6e"};
    private ActivityFCBase[] gains;

    public ActivityFCLucky(String value) {
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
                this.uses = ActivityFC.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[1])) {
                this.gains = ActivityFC.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[2])) {
                this.luckys = ActivityFC.iIiIiiiiIIiii((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public ActivityFCBase[] getGains() {
        return this.gains;
    }

    public ActivityFCBase[] getUses() {
        return this.uses;
    }

    public void setLuckys(ActivityFCBase[] luckys) {
        this.luckys = luckys;
    }

    public ActivityFCBase[] getLuckys() {
        return this.luckys;
    }

    public void setGains(ActivityFCBase[] gains) {
        this.gains = gains;
    }

    public void setUses(ActivityFCBase[] uses) {
        this.uses = uses;
    }
}
