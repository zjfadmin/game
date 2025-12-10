/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.game.Task
 */
package com.xy.game;

import com.xy.game.Task;

public class TaskProgress {
    private int sum;
    private int DId;
    private int y;
    private Task task;
    private String DName;
    private int map;
    private int GId;
    private int max;
    private int type;
    private String GName;
    private int x;

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Task getTask() {
        return this.task;
    }

    public void setDName(String dName) {
        this.DName = dName;
    }

    public int getMax() {
        return this.max;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMap() {
        return this.map;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDId() {
        return this.DId;
    }

    public int getGId() {
        return this.GId;
    }

    public int getX() {
        return this.x;
    }

    public TaskProgress(Task task) {
        this.task = task;
    }

    public int getY() {
        return this.y;
    }

    public void ALLATORIxDEMO(int add) {
        this.sum += add;
        if (this.sum <= this.max) return;
        this.sum = this.max;
    }

    public String getDName() {
        return this.DName;
    }

    public String getGName() {
        return this.GName;
    }

    public void setGName(String gName) {
        this.GName = gName;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSum() {
        return this.sum;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setGId(int gId) {
        this.GId = gId;
    }

    public void setDId(int dId) {
        this.DId = dId;
    }
}
