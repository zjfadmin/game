/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

import java.awt.Point;
import java.util.List;

public class StallBuyMenu {
    private List<StallBuyMenu> menuList;
    private String key;
    private List<Point> pointList;

    public List<Point> getPointList() {
        return this.pointList;
    }

    public void setMenuList(List<StallBuyMenu> menuList) {
        this.menuList = menuList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<StallBuyMenu> getMenuList() {
        return this.menuList;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
