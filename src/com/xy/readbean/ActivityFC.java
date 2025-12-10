/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActivityFCBase
 *  com.xy.readbean.ActivityFCBeau
 *  com.xy.readbean.ActivityFCBuy
 *  com.xy.readbean.ActivityFCEnroll
 *  com.xy.readbean.ActivityFCLucky
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.readbean.BWDHRule
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.readbean.ActivityFCBase;
import com.xy.readbean.ActivityFCBeau;
import com.xy.readbean.ActivityFCBuy;
import com.xy.readbean.ActivityFCEnroll;
import com.xy.readbean.ActivityFCLucky;
import com.xy.readbean.ActivityFCTarget;
import com.xy.readbean.BWDHRule;
import com.xy.v.IIiiIiiiiIIiI;
import java.util.ArrayList;
import java.util.List;

public class ActivityFC {
    private transient Object data;
    private int id;
    private static String[] MONEYS;
    private String value;
    private int type;
    private static String[] KEYS;

    public static void iIiIiiiiIIiIi(String value, int index, int valueEnd, List<ActivityFCBase> list) {
        ActivityFCBase IiiiiiiiIIIII = new ActivityFCBase(3);
        IiiiiiiiIIIII.setKey(value.substring(index, valueEnd));
        list.add(IiiiiiiiIIIII);
    }

    public int getId() {
        return this.id;
    }

    public void ALLATORIxDEMO() {
        if (this.type == 0) {
            return;
        }
        if (this.type == 1) {
            this.data = new ActivityFCBuy(this.value);
        } else if (this.type == 2) {
            this.data = new ActivityFCTarget(this.value);
        } else if (this.type == 3) {
            this.data = new ActivityFCLucky(this.value);
        } else if (this.type == 4) {
            this.data = new ActivityFCEnroll(this.value);
        } else if (this.type == 5) {
            this.data = new BWDHRule(this.value);
        } else if (this.type == 6) {
            this.data = new ActivityFCBeau().ALLATORIxDEMO(this.value);
        } else if (this.type == 7) {
            this.data = new ActivityFCBeau().iIiIiiiiIIiii(this.value);
        }
        this.value = null;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
     * WARNING - void declaration
     */
    public static void iiiIiiiiiiIIi(String value, int index, int valueEnd, List<ActivityFCBase> list) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII < valueEnd) {
            void IiiiiiiiIIIII3;
            IiiiiiiiIIIII = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
                IiiiiiiiIIIII = valueEnd;
            }
            if ((IiiiiiiiIIIII2 = value.indexOf(",", index + 1)) == -1 || IiiiiiiiIIIII2 > IiiiiiiiIIIII) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII;
            }
            ActivityFCBase activityFCBase = new ActivityFCBase(2);
            IiiiiiiiIIIII3.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII2));
            activityFCBase.setNum(IiiiiiiiIIIII2 < IiiiiiiiIIIII ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII2 + 1), (int)IiiiiiiiIIIII) : 1L);
            list.add((ActivityFCBase)IiiiiiiiIIIII3);
            index = IiiiiiiiIIIII + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ActivityFCBase[] iIiIiiiiIIiii(String value, int index, int valueEnd) {
        ArrayList<void> IiiiiiiiIIIII = new ArrayList<void>();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            void IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = value.indexOf("=", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            IiiiiiiiIIIII3 = value.indexOf("#", index + 1);
            ActivityFCBase activityFCBase = new ActivityFCBase();
            IiiiiiiiIIIII4.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
            index = IiiiiiiiIIIII3 + 1;
            IiiiiiiiIIIII3 = value.indexOf("#", index + 1);
            IiiiiiiiIIIII4.setFlag((int)(Double.parseDouble(value.substring(index, IiiiiiiiIIIII3)) * 100.0));
            IiiiiiiiIIIII4.setNum(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII3 + 1), (int)IiiiiiiiIIIII2));
            IiiiiiiiIIIII.add(IiiiiiiiIIIII4);
            index = IiiiiiiiIIIII2 + 1;
        }
        ActivityFCBase[] IiiiiiiiIIIII22 = new ActivityFCBase[IiiiiiiiIIIII.size()];
        IiiiiiiiIIIII22 = IiiiiiiiIIIII.toArray(IiiiiiiiIIIII22);
        return IiiiiiiiIIIII22;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getType() {
        return this.type;
    }

    static {
        KEYS = new String[]{"\u6d3b\u52a8\u6570\u503c", "\u7269\u54c1", "\u6389\u843d", "\u8d27\u5e01"};
        MONEYS = new String[]{"\u91d1\u94b1", "\u7ed1\u7389", "\u4ed9\u7389", "\u79ef\u5206", "\u7d2f\u8ba1\u5145\u503c"};
    }

    public static ActivityFCBase[] ALLATORIxDEMO(String value, int index, int valueEnd) {
        ArrayList<ActivityFCBase> IiiiiiiiIIIII = new ArrayList<ActivityFCBase>();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            String IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = value.indexOf("=", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            if ((IiiiiiiiIIIII4 = value.substring(index, IiiiiiiiIIIII3 = value.indexOf("#", index + 1))).equals(KEYS[0])) {
                ActivityFC.iIiIiiiiIIiii(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2, IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII4.equals(KEYS[1])) {
                ActivityFC.iiiIiiiiiiIIi(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2, IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII4.equals(KEYS[2])) {
                ActivityFC.iIiIiiiiIIiIi(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2, IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII4.equals(KEYS[3])) {
                ActivityFC.ALLATORIxDEMO(value, IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2, IiiiiiiiIIIII);
            }
            index = IiiiiiiiIIIII2 + 1;
        }
        ActivityFCBase[] IiiiiiiiIIIII22 = new ActivityFCBase[IiiiiiiiIIIII.size()];
        IiiiiiiiIIIII22 = IiiiiiiiIIIII.toArray(IiiiiiiiIIIII22);
        return IiiiiiiiIIIII22;
    }

    public String getValue() {
        return this.value;
    }

    /*
     * WARNING - void declaration
     */
    public static void iIiIiiiiIIiii(String value, int index, int valueEnd, List<ActivityFCBase> list) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = value.indexOf(",", index + 1);
        if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
            IiiiiiiiIIIII2 = valueEnd;
        }
        ActivityFCBase activityFCBase = new ActivityFCBase(1);
        IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII2));
        IiiiiiiiIIIII.setNum(IiiiiiiiIIIII2 < valueEnd ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII2 + 1), (int)valueEnd) : 1L);
        list.add((ActivityFCBase)IiiiiiiiIIIII);
    }

    public Object getData() {
        return this.data;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(String value, int index, int valueEnd, List<ActivityFCBase> list) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII < valueEnd) {
            void IiiiiiiiIIIII3;
            IiiiiiiiIIIII = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
                IiiiiiiiIIIII = valueEnd;
            }
            if ((IiiiiiiiIIIII2 = value.indexOf(",", index + 1)) == -1 || IiiiiiiiIIIII2 > IiiiiiiiIIIII) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII;
            }
            String IiiiiiiiIIIII4 = value.substring(index, IiiiiiiiIIIII2);
            ActivityFCBase activityFCBase = new ActivityFCBase(4);
            IiiiiiiiIIIII3.setId(ActivityFC.getActivityMoneyKey(IiiiiiiiIIIII4));
            IiiiiiiiIIIII3.setKey(IiiiiiiiIIIII4);
            activityFCBase.setNum(IiiiiiiiIIIII2 < IiiiiiiiIIIII ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII2 + 1), (int)IiiiiiiiIIIII) : 1L);
            list.add((ActivityFCBase)IiiiiiiiIIIII3);
            index = IiiiiiiiIIIII + 1;
        }
    }

    public static int getActivityMoneyKey(String key) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < MONEYS.length) {
            if (MONEYS[IiiiiiiiIIIII].equals(key)) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public void setType(int type) {
        this.type = type;
    }
}
