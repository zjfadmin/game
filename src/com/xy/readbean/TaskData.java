/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.TaskSet
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.readbean.TaskSet;
import com.xy.v.IIiiIiiiiIIiI;

public class TaskData {
    private int time;
    private int TeamSum;
    private int taskID;
    private String lvl;
    private String taskEnd;
    private String unknow;
    private transient TaskSet taskSet;
    private String taskText;
    private String taskName;
    private int isTP;
    private String openTime;
    private String taskOpen;
    private int taskSetID;
    private int nd;

    public String getUnknowType(String type) {
        if (this.unknow != null) return IIiiIiiiiIIiI.iIiIiiiiIIiii((String)this.unknow, (String)(String.valueOf(type) + "="), (String)"|");
        return null;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getTime() {
        return this.time;
    }

    public void setTaskOpen(String taskOpen) {
        this.taskOpen = taskOpen;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getOpenTime() {
        return this.openTime;
    }

    public int getTaskSetID() {
        return this.taskSetID;
    }

    public int getNd() {
        return this.nd;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public void setIsTP(int isTP) {
        this.isTP = isTP;
    }

    public void setUnknow(String unknow) {
        this.unknow = unknow;
    }

    public String getLvl() {
        return this.lvl;
    }

    public int getTeamSum() {
        return this.TeamSum;
    }

    public void setTaskSetID(int taskSetID) {
        this.taskSetID = taskSetID;
    }

    public void setNd(int nd) {
        this.nd = nd;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public TaskSet getTaskSet() {
        return this.taskSet;
    }

    public void setTeamSum(int teamSum) {
        this.TeamSum = teamSum;
    }

    public int getIsTP() {
        return this.isTP;
    }

    public String getTaskOpen() {
        return this.taskOpen;
    }

    public String getTaskEnd() {
        return this.taskEnd;
    }

    public String getTaskText() {
        return this.taskText;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getUnknow() {
        return this.unknow;
    }

    public void setTaskEnd(String taskEnd) {
        this.taskEnd = taskEnd;
    }

    public int getTaskID() {
        return this.taskID;
    }

    public void setTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
