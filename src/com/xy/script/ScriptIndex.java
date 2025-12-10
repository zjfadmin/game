/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIiiIiiiiIIiI
 */
package com.xy.script;

import com.xy.n.IIiiIiiiiIIiI;

public class ScriptIndex {
    private int type;
    private int key;
    private IIiiIiiiiIIiI mapPoint;

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getKey() {
        return this.key;
    }

    public ScriptIndex(int type) {
        this.type = type;
    }

    public void setMapPoint(IIiiIiiiiIIiI mapPoint) {
        this.mapPoint = mapPoint;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public IIiiIiiiiIIiI getMapPoint() {
        return this.mapPoint;
    }
}
