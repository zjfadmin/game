/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Goodstable
 */
package com.xy.bean;

import com.xy.readbean.Goodstable;
import java.util.ArrayList;
import java.util.List;

public class GoodsResultArrBean {
    private List<Goodstable> list;
    private int I;

    public int getI() {
        return this.I;
    }

    public void setList(List<Goodstable> list) {
        this.list = list;
    }

    public List<Goodstable> getList() {
        if (this.list != null) return this.list;
        this.list = new ArrayList<Goodstable>();
        return this.list;
    }

    public void setI(int i) {
        this.I = i;
    }
}
