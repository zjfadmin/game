/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.ActivityMenuSet2
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCRecord
 *  com.xy.readbean.ActivityFCTarget
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiIiiiiIiii
 */
package com.xy.readbean;

import com.xy.formula.ActivityMenuSet2;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCRecord;
import com.xy.readbean.ActivityFCTarget;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiIiiiiIiii;

public class Activity {
    private int id;
    private long timeEnd;
    private String baseSet;
    private long timeStop;
    private transient iiIiIiiiiIiii[] keys;
    private long timeOpen;
    private String activitySet;
    private int modelId;
    private transient ActivityMenuSet2[] menuSet2s;
    private transient ActivityFCRecord[] records;

    public long getTimeEnd() {
        return this.timeEnd;
    }

    public void ALLATORIxDEMO() {
        if (this.modelId != 1 && this.modelId != 2) {
            if (this.modelId == 3) return;
            if (this.modelId == 5) return;
            this.activitySet = null;
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < this.activitySet.length()) {
            String IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = this.activitySet.indexOf("|", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = this.activitySet.length();
            }
            if ((IiiiiiiiIIIII3 = this.activitySet.indexOf("=", IiiiiiiiIIIII + 1)) == -1 || IiiiiiiiIIIII3 > IiiiiiiiIIIII2) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
            }
            if ((IiiiiiiiIIIII4 = this.activitySet.substring(IiiiiiiiIIIII, IiiiiiiiIIIII3)).equals("\u529f\u80fd\u9009\u9879")) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals("\u6d3b\u52a8\u6570\u503c")) {
                this.iiiIiiiiiiIIi(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII4.equals("\u8bb0\u5f55\u6570\u503c")) {
                this.iIiIiiiiIIiii(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
        this.activitySet = null;
    }

    public String getActivitySet() {
        return this.activitySet;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiiIiiiiiiIIi(int n, int n2) {
        void valueEnd;
        int index;
        this.keys = new iiIiIiiiiIiii[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'=', (String)this.activitySet, (int)index, (int)valueEnd)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = this.activitySet.indexOf("=", (int)(index + true));
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            IiiiiiiiIIIII3 = this.activitySet.indexOf("#", (int)(index + true));
            this.keys[IiiiiiiiIIIII] = new iiIiIiiiiIiii();
            this.keys[IiiiiiiiIIIII].ALLATORIxDEMO = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.activitySet, (int)index, (int)IiiiiiiiIIIII3);
            this.keys[IiiiiiiiIIIII].IiiiiiiiIIIII = this.activitySet.substring(IiiiiiiiIIIII3 + 1, IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public int getId() {
        return this.id;
    }

    public ActivityFCRecord getActivityFCRecord(int id) {
        if (this.records == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.records.length) {
            if (this.records[IiiiiiiiIIIII].getId() == id) {
                return this.records[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void setTimeOpen(long timeOpen) {
        this.timeOpen = timeOpen;
    }

    public ActivityMenuSet2[] getMenuSet2s() {
        return this.menuSet2s;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iIiIiiiiIIiii(int n, int n2) {
        void valueEnd;
        int index;
        this.records = new ActivityFCRecord[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'=', (String)this.activitySet, (int)index, (int)valueEnd)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = this.activitySet.indexOf("=", (int)(index + true));
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            this.records[IiiiiiiiIIIII] = Activity.ALLATORIxDEMO(this.activitySet, index, IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public Object getActivityKey(int id) {
        iiIiIiiiiIiii IiiiiiiiIIIII = this.getPointKey(id < 0 ? -id : id);
        if (IiiiiiiiIIIII != null) {
            return IiiiiiiiIIIII;
        }
        ActivityFCRecord IiiiiiiiIIIII2 = this.getActivityFCRecord(id);
        if (IiiiiiiiIIIII2 == null) return null;
        return IiiiiiiiIIIII2;
    }

    public int getActivityState(long time) {
        if (time >= this.timeEnd) return 0;
        if (time >= this.timeStop) return 2;
        if (time >= this.timeOpen) return 1;
        return 0;
    }

    public String getBaseSet() {
        return this.baseSet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setActivitySet(String activitySet) {
        this.activitySet = activitySet;
    }

    public long getTimeOpen() {
        return this.timeOpen;
    }

    public void setBaseSet(String baseSet) {
        this.baseSet = baseSet;
    }

    public long getTimeStop() {
        return this.timeStop;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public void setMenuSet2s(ActivityMenuSet2[] menuSet2s) {
        this.menuSet2s = menuSet2s;
    }

    public int getModelId() {
        return this.modelId;
    }

    public iiIiIiiiiIiii getPointKey(int id) {
        if (this.keys == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.keys.length) {
            if (this.keys[IiiiiiiiIIIII].ALLATORIxDEMO == (long)id) {
                return this.keys[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public static ActivityFCRecord ALLATORIxDEMO(String value, int index, int valueEnd) {
        ActivityFCRecord IiiiiiiiIIIII = new ActivityFCRecord();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < valueEnd) {
            block8: {
                String IiiiiiiiIIIII4;
                block10: {
                    block13: {
                        block12: {
                            block11: {
                                block9: {
                                    IiiiiiiiIIIII3 = value.indexOf(",", index + 1);
                                    if (IiiiiiiiIIIII3 == -1 || IiiiiiiiIIIII3 > valueEnd) {
                                        IiiiiiiiIIIII3 = valueEnd;
                                    }
                                    if (IiiiiiiiIIIII2 != 0) break block9;
                                    IiiiiiiiIIIII.setId(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
                                    break block10;
                                }
                                if (IiiiiiiiIIIII2 != true) break block11;
                                IiiiiiiiIIIII.setType(ActivityFCTarget.getActivityRecordKey((String)value.substring(index, IiiiiiiiIIIII3)));
                                if (IiiiiiiiIIIII.getType() == 0) {
                                    throw new ArithmeticException("\u5f02\u5e38\u8bb0\u5f55\u7c7b\u578b:" + value.substring(index, IiiiiiiiIIIII3));
                                }
                                break block8;
                            }
                            if (IiiiiiiiIIIII2 != 2) break block10;
                            if (IiiiiiiiIIIII.getType() != 1 && IiiiiiiiIIIII.getType() != 2) break block12;
                            String string = value.substring(index, IiiiiiiiIIIII3);
                            IiiiiiiiIIIII.setKey1(ActivityFC.getActivityMoneyKey((String)IiiiiiiiIIIII4));
                            IiiiiiiiIIIII.setKey2(IiiiiiiiIIIII4);
                            break block8;
                        }
                        if (IiiiiiiiIIIII.getType() != 3 && IiiiiiiiIIIII.getType() != 4) break block13;
                        int IiiiiiiiIIIII5 = IIiiIiiiiIIiI.ALLATORIxDEMO((char)'#', (String)value, (int)index, (int)IiiiiiiiIIIII3);
                        if (IiiiiiiiIIIII5 != 0) {
                            IiiiiiiiIIIII.ALLATORIxDEMO(1 + IiiiiiiiIIIII5, value, index, IiiiiiiiIIIII3);
                            break block8;
                        } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((char)'-', (String)value, (int)index, (int)IiiiiiiiIIIII3) != 0) {
                            IiiiiiiiIIIII.ALLATORIxDEMO(1, value, index, IiiiiiiiIIIII3);
                            break block8;
                        } else {
                            IiiiiiiiIIIII.setKey1(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
                        }
                        break block8;
                    }
                    IiiiiiiiIIIII.setKey1(IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII3));
                    break block8;
                }
                IiiiiiiiIIIII4 = value.substring(index, IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.equals("\u6bcf\u65e5\u91cd\u7f6e")) {
                    IiiiiiiiIIIII.setReset(1);
                }
            }
            ++IiiiiiiiIIIII2;
            index = IiiiiiiiIIIII3 + 1;
        }
        return IiiiiiiiIIIII;
    }

    private /* synthetic */ void ALLATORIxDEMO(int index, int valueEnd) {
        if (this.modelId != 1) {
            if (this.modelId != 2) return;
        }
        this.menuSet2s = new ActivityMenuSet2[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'=', (String)this.activitySet, (int)index, (int)valueEnd)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = this.activitySet.indexOf("=", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            this.menuSet2s[IiiiiiiiIIIII] = new ActivityMenuSet2(this.activitySet, index, IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setTimeStop(long timeStop) {
        this.timeStop = timeStop;
    }
}
