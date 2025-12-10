/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActivityRole
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.readbean.ActivityRole;
import com.xy.v.IIiiIiiiiIIiI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Activity2Role
implements ActivityRole {
    private boolean save;
    private ConcurrentHashMap<Integer, Long> dataMap;

    public long getValueByKey(int key) {
        Long IiiiiiiiIIIII = this.dataMap.get(key);
        if (IiiiiiiiIIIII == null) return 0L;
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(String string, int n, int n2) {
        void valueEnd;
        int index;
        void data;
        this.dataMap = new ConcurrentHashMap();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)data)) return;
        if (index >= valueEnd) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII < valueEnd) {
            IiiiiiiiIIIII = data.indexOf("#", (int)(index + true));
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
                IiiiiiiiIIIII = valueEnd;
            }
            IiiiiiiiIIIII2 = data.indexOf(",", (int)(index + true));
            this.dataMap.put(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2), IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)(IiiiiiiiIIIII2 + 1), (int)IiiiiiiiIIIII));
            index = IiiiiiiiIIIII + 1;
        }
    }

    public void ALLATORIxDEMO(String value, int index, int valueEnd) {
        if (index >= valueEnd) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII < valueEnd) {
            long IiiiiiiiIIIII3;
            IiiiiiiiIIIII = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
                IiiiiiiiIIIII = valueEnd;
            }
            if ((IiiiiiiiIIIII2 = value.indexOf(",", IiiiiiiiIIIII2 + 1)) == -1 || IiiiiiiiIIIII2 > IiiiiiiiIIIII) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII;
            }
            int IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII2);
            long l = IiiiiiiiIIIII3 = IiiiiiiiIIIII2 < IiiiiiiiIIIII ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII2 + 1), (int)IiiiiiiiIIIII) : 0L;
            if (IiiiiiiiIIIII3 != 0L) {
                this.dataMap.put(IiiiiiiiIIIII4, IiiiiiiiIIIII3);
            } else {
                this.dataMap.remove(IiiiiiiiIIIII4);
            }
            index = IiiiiiiiIIIII + 1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public String ALLATORIxDEMO() {
        var1_1 = this;
        synchronized (var1_1) {
            if (!this.save) {
                return null;
            }
            this.save = false;
            IiiiiiiiIIIII = new StringBuffer();
            IiiiiiiiIIIII = this.dataMap.entrySet().iterator();
            if (true) ** GOTO lbl23
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII.next();
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("#");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getKey());
                IiiiiiiiIIIII.append(",");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII.getValue());
lbl23:
                // 2 sources

            } while (IiiiiiiiIIIII.hasNext());
            return IiiiiiiiIIIII.toString();
        }
    }

    public void setValueByKey(String value, int index, int valueEnd) {
        int IiiiiiiiIIIII = value.indexOf(",", index + 1);
        if (IiiiiiiiIIIII == -1) return;
        if (IiiiiiiiIIIII > valueEnd) {
            return;
        }
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII);
        long IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)valueEnd);
        if (IiiiiiiiIIIII3 != 0L) {
            this.dataMap.put(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            return;
        }
        this.dataMap.remove(IiiiiiiiIIIII2);
    }

    public ConcurrentHashMap<Integer, Long> getDataMap() {
        return this.dataMap;
    }

    public void getRole(int activityId, StringBuffer buffer) {
        if (buffer.length() != 0) {
            buffer.append("|");
        }
        buffer.append(activityId);
        for (Map.Entry<Integer, Long> IiiiiiiiIIIII : this.dataMap.entrySet()) {
            buffer.append("#");
            buffer.append(IiiiiiiiIIIII.getKey());
            buffer.append(",");
            buffer.append(IiiiiiiiIIIII.getValue());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Activity2Role(String string, int n, int n2) {
        void valueEnd;
        void index;
        void data;
        this.iIiIiiiiIIiii((String)data, (int)index, (int)valueEnd);
    }
}
