/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class EventModel {
    private int gId;
    private int taskBigType;
    private String taskName;
    private int taskId;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getgId() {
        return this.gId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public void setTaskBigType(int taskBigType) {
        this.taskBigType = taskBigType;
    }

    public int getTaskBigType() {
        return this.taskBigType;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public int getTaskId() {
        return this.taskId;
    }
}
