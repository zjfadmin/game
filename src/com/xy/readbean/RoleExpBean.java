/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

import java.math.BigDecimal;
import java.util.Map;

public class RoleExpBean {
    private Map<Integer, BigDecimal> rolePetExpMap;

    public void setRolePetExpMap(Map<Integer, BigDecimal> rolePetExpMap) {
        this.rolePetExpMap = rolePetExpMap;
    }

    public Map<Integer, BigDecimal> getRolePetExpMap() {
        return this.rolePetExpMap;
    }
}
