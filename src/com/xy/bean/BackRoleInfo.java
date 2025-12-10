/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleTable
 */
package com.xy.bean;

import com.xy.entity.RoleTable;
import java.util.List;

public class BackRoleInfo {
    private int pageNum;
    private List<RoleTable> list;
    private int pages;

    public List<RoleTable> getList() {
        return this.list;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPages() {
        return this.pages;
    }

    public void setList(List<RoleTable> list) {
        this.list = list;
    }
}
