/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.TaskTQ
 */
package com.xy.readbean;

import com.xy.readbean.TaskTQ;

public class TaskSet {
    private int taskMsgID;
    private int sumcycle;
    private transient TaskTQ tq;
    private int sumreceive;
    private String taskMsg;
    private int sumlimit;
    private int resetcycle;
    private int taskSetID;
    private String taskTQ;
    private String taskType;

    public void setSumreceive(int sumreceive) {
        this.sumreceive = sumreceive;
    }

    public int getSumlimit() {
        return this.sumlimit;
    }

    public void setTaskSetID(int taskSetID) {
        this.taskSetID = taskSetID;
    }

    public int getTaskSetID() {
        return this.taskSetID;
    }

    public String getTaskType() {
        return this.taskType;
    }

    public TaskTQ getTq() {
        if (this.taskTQ == null) return this.tq;
        if (!this.taskTQ.equals("")) {
            this.tq = new TaskTQ(this.taskTQ);
        }
        this.taskTQ = null;
        return this.tq;
    }

    public double ALLATORIxDEMO(int ComSum) {
        ComSum = this.sumcycle == 0 ? 0 : (ComSum %= this.sumcycle);
        double IiiiiiiiIIIII = 1.0;
        return IiiiiiiiIIIII += 0.05 * (double)ComSum;
    }

    public int getResetcycle() {
        return this.resetcycle;
    }

    public int getSumcycle() {
        return this.sumcycle;
    }

    public void setTaskMsg(String taskMsg) {
        this.taskMsg = taskMsg;
    }

    public void setSumlimit(int sumlimit) {
        this.sumlimit = sumlimit;
    }

    public void setSumcycle(int sumcycle) {
        this.sumcycle = sumcycle;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public void setTaskMsgID(int taskMsgID) {
        this.taskMsgID = taskMsgID;
    }

    public int getSumreceive() {
        return this.sumreceive;
    }

    public void setResetcycle(int resetcycle) {
        this.resetcycle = resetcycle;
    }

    public String getTaskMsg() {
        return this.taskMsg;
    }

    public int getTaskMsgID() {
        return this.taskMsgID;
    }
}
