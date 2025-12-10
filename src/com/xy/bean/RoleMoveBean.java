/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.PathPoint
 */
package com.xy.bean;

import com.xy.bean.PathPoint;
import java.util.ArrayList;
import java.util.List;

public class RoleMoveBean {
    List<PathPoint> Paths = new ArrayList<PathPoint>();
    private String role;

    public void setRole(String role) {
        this.role = role;
    }

    public void setPaths(List<PathPoint> paths) {
        this.Paths = paths;
    }

    public String getRole() {
        return this.role;
    }

    public List<PathPoint> getPaths() {
        return this.Paths;
    }
}
