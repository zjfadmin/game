/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 */
package com.xy.readbean;

import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import java.util.Map;

public class ActivitySeries {
    private Activity activityBeau;
    private Map<Integer, ActivityFC> activityFCMap;
    private Map<Integer, Activity> activityMap;

    public void ALLATORIxDEMO() {
        for (Activity activity : this.activityMap.values()) {
            activity.ALLATORIxDEMO();
            if (activity.getModelId() != 5) continue;
            this.activityBeau = activity;
        }
        for (ActivityFC activityFC : this.activityFCMap.values()) {
            activityFC.ALLATORIxDEMO();
        }
    }

    public Map<Integer, Activity> getActivityMap() {
        return this.activityMap;
    }

    public void setActivityBeau(Activity activityBeau) {
        this.activityBeau = activityBeau;
    }

    public Map<Integer, ActivityFC> getActivityFCMap() {
        return this.activityFCMap;
    }

    public void setActivityMap(Map<Integer, Activity> activityMap) {
        this.activityMap = activityMap;
    }

    public void setActivityFCMap(Map<Integer, ActivityFC> activityFCMap) {
        this.activityFCMap = activityFCMap;
    }

    public Activity getActivityBeau() {
        return this.activityBeau;
    }
}
