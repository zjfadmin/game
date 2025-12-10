/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class ActivityFCBase {
    private int type;
    private int id;
    private String key;
    private long num;
    private int flag;

    public void setType(int type) {
        this.type = type;
    }

    public long getNum() {
        return this.num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ActivityFCBase() {
    }

    public String getKey() {
        return this.key;
    }

    public int getType() {
        return this.type;
    }

    public ActivityFCBase(int type) {
        this.type = type;
    }

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
