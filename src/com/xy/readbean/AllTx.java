/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.RoleTxBean
 */
package com.xy.readbean;

import com.xy.readbean.RoleTxBean;
import java.util.Map;

public class AllTx {
    private Map<Integer, RoleTxBean> txmap;

    public Map<Integer, RoleTxBean> getTxmap() {
        return this.txmap;
    }

    public void setTxmap(Map<Integer, RoleTxBean> txmap) {
        this.txmap = txmap;
    }
}
