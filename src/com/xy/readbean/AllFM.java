/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.FM
 */
package com.xy.readbean;

import com.xy.readbean.FM;
import java.util.ArrayList;
import java.util.List;

public class AllFM {
    private List<FM> allList;
    private List<String> list;

    public void setAllList(List<FM> allList) {
        this.allList = allList;
    }

    public List<String> getFmType() {
        if (this.list != null) return this.list;
        this.list = new ArrayList<String>();
        for (FM IiiiiiiiIIIII : this.allList) {
            if (this.list.contains(IiiiiiiiIIIII.getFmType())) continue;
            this.list.add(IiiiiiiiIIIII.getFmType());
        }
        return this.list;
    }

    public List<FM> getAllList() {
        return this.allList;
    }
}
