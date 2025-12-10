/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.RoleSuitBean
 */
package com.xy.readbean;

import com.xy.readbean.RoleSuitBean;
import java.util.Map;

public class AllSuit {
    private Map<Integer, RoleSuitBean> rolesuit;

    public void setRolesuit(Map<Integer, RoleSuitBean> rolesuit) {
        this.rolesuit = rolesuit;
    }

    public RoleSuitBean ALLATORIxDEMO(String sname) {
        if (sname == null) return null;
        if (sname.equals("")) {
            return null;
        }
        for (Map.Entry<Integer, RoleSuitBean> IiiiiiiiIIIII : this.rolesuit.entrySet()) {
            if (!IiiiiiiiIIIII.getValue().getSname().equals(sname)) continue;
            return IiiiiiiiIIIII.getValue();
        }
        return null;
    }

    public Map<Integer, RoleSuitBean> getRolesuit() {
        return this.rolesuit;
    }
}
