/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.TaskData
 *  com.xy.readbean.TaskSet
 */
package com.xy.readbean;

import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AllTask {
    private List<Integer> setList;
    private Map<Integer, TaskSet> allTaskSet;
    private Map<Integer, TaskData> allTaskData;
    private List<String> typeList;

    public void setAllTaskData(Map<Integer, TaskData> allTaskData) {
        this.allTaskData = allTaskData;
    }

    public void setAllTaskSet(Map<Integer, TaskSet> allTaskSet) {
        this.allTaskSet = allTaskSet;
    }

    public List<Integer> getSetList() {
        if (this.setList != null) return this.setList;
        this.ALLATORIxDEMO();
        return this.setList;
    }

    public void getSetId(List<Integer> list) {
        this.getSetList();
        int IiiiiiiiIIIII = this.setList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            block4: {
                int IiiiiiiiIIIII2 = this.setList.get(IiiiiiiiIIIII);
                if (!list.contains(IiiiiiiiIIIII2)) {
                    int IiiiiiiiIIIII3 = 0;
                    while (IiiiiiiiIIIII3 < list.size()) {
                        if (list.get(IiiiiiiiIIIII3) < IiiiiiiiIIIII2) {
                            list.add(IiiiiiiiIIIII3, IiiiiiiiIIIII2);
                            break block4;
                        }
                        ++IiiiiiiiIIIII3;
                    }
                    list.add(IiiiiiiiIIIII2);
                }
            }
            --IiiiiiiiIIIII;
        }
    }

    public List<String> getTypeList() {
        if (this.setList != null) return this.typeList;
        this.ALLATORIxDEMO();
        return this.typeList;
    }

    public Map<Integer, TaskSet> getAllTaskSet() {
        return this.allTaskSet;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO() {
        void var1_6;
        for (TaskData taskData : this.allTaskData.values()) {
            TaskSet IiiiiiiiIIIII2 = this.allTaskSet.get(taskData.getTaskSetID());
            taskData.setTaskSet(IiiiiiiiIIIII2);
        }
        this.setList = new ArrayList<Integer>();
        this.typeList = new ArrayList<String>();
        block1: for (Integer n : this.allTaskSet.keySet()) {
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < this.setList.size()) {
                if (n < this.setList.get(IiiiiiiiIIIII3)) {
                    this.setList.add(IiiiiiiiIIIII3, n);
                    continue block1;
                }
                ++IiiiiiiiIIIII3;
            }
            this.setList.add(n);
        }
        int n = this.setList.size() - 1;
        while (var1_6 >= 0) {
            TaskSet IiiiiiiiIIIII4 = this.allTaskSet.get(this.setList.get((int)var1_6));
            if (IiiiiiiiIIIII4.getTaskMsgID() == 0) {
                this.setList.remove((int)var1_6);
            }
            if (!this.typeList.contains(IiiiiiiiIIIII4.getTaskType())) {
                this.typeList.add(IiiiiiiiIIIII4.getTaskType());
            }
            --var1_6;
        }
    }

    public Map<Integer, TaskData> getAllTaskData() {
        return this.allTaskData;
    }
}
