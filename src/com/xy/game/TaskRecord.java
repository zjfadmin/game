/*
 * Decompiled with CFR 0.152.
 */
package com.xy.game;

public class TaskRecord {
    private int cSum;
    private int newID;
    private int bSum;
    private int taskId;
    private int rSum;

    public int getbSum() {
        return this.bSum;
    }

    public TaskRecord(int taskId) {
        this.taskId = taskId;
    }

    public int getNewID() {
        return this.newID;
    }

    public void setcSum(int cSum) {
        this.cSum = cSum;
    }

    public void setbSum(int bSum) {
        this.bSum = bSum;
    }

    public void iIiIiiiiIIiii(int add) {
        this.rSum += add;
    }

    public int getrSum() {
        return this.rSum;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public void setNewID(int newID) {
        this.newID = newID;
    }

    public void ALLATORIxDEMO(int add) {
        this.cSum += add;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void ALLATORIxDEMO(StringBuffer buffer) {
        if (buffer.length() != 0) {
            buffer.append("|");
        }
        buffer.append(this.taskId);
        buffer.append("-");
        buffer.append(this.rSum);
        buffer.append("-");
        buffer.append(this.cSum);
        if (this.newID != 0) {
            buffer.append("-");
            buffer.append(this.newID);
        }
        if (this.bSum == 0) return;
        buffer.append("-B");
        buffer.append(this.bSum);
    }

    public int getcSum() {
        return this.cSum;
    }

    public void setrSum(int rSum) {
        this.rSum = rSum;
    }
}
