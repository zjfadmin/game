package com.xy.readbean;

import java.math.BigDecimal;
import java.util.Map;

public class RoleExpBean {
   private Map<Integer, BigDecimal> rolePetExpMap;

   public void setRolePetExpMap(Map<Integer, BigDecimal> var1) {
      this.rolePetExpMap = var1;
   }

   public Map<Integer, BigDecimal> getRolePetExpMap() {
      return this.rolePetExpMap;
   }
}
