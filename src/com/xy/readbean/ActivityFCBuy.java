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

public class ActivityFCBuy {
    private ActivityFCBase[] gains;
    private static String[] KEYS = new String[]{"\u6d88\u8017", "\u83b7\u5f97", "\u9650\u8d2d", "\u91cd\u7f6e"};
    private int reset;
    private ActivityFCBase[] uses;
    private int buyMax;

    public ActivityFCBase[] getGains() {
        return this.gains;
    }

    public void setUses(ActivityFCBase[] uses) {
        this.uses = uses;
    }

    public void setBuyMax(int buyMax) {
        this.buyMax = buyMax;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public ActivityFCBase[] getUses() {
        return this.uses;
    }

    public ActivityFCBuy(String value) {
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
                this.buyMax = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals(KEYS[3])) {
                this.reset = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public int getReset() {
        return this.reset;
    }

    public void setGains(ActivityFCBase[] gains) {
        this.gains = gains;
    }

    public int getBuyMax() {
        return this.buyMax;
    }
}
