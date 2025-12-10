/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.NpcInfoBean
 */
package com.xy.readbean;

import com.xy.readbean.NpcInfoBean;
import java.util.Map;

public class AllNpcBean {
    private Map<String, NpcInfoBean> allNpcInfo;

    public Map<String, NpcInfoBean> getAllNpcInfo() {
        return this.allNpcInfo;
    }

    public void setAllNpcInfo(Map<String, NpcInfoBean> allNpcInfo) {
        this.allNpcInfo = allNpcInfo;
    }
}
