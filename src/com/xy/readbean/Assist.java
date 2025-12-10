/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Assist {
    private int max;
    private String value;
    private int sid;
    private String name;
    private int type;
    private int num;
    private int id;
    private transient boolean on = false;

    public int getType() {
        return this.type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public int getMax() {
        return this.max;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return this.sid;
    }

    public boolean ALLATORIxDEMO() {
        return this.on;
    }

    public int getId() {
        return this.id;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getValue() {
        return this.value;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
