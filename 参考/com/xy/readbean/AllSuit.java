package com.xy.readbean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AllSuit {
   private Map<Integer, RoleSuitBean> rolesuit;

   public void setRolesuit(Map<Integer, RoleSuitBean> var1) {
      this.rolesuit = var1;
   }

   public RoleSuitBean a(String var1) {
      if (var1 != null && !var1.equals("")) {
         Iterator var2;
         for(Iterator var10000 = var2 = this.rolesuit.entrySet().iterator(); var10000.hasNext(); var10000 = var2) {
            Entry var3;
            if (((RoleSuitBean)(var3 = (Entry)var2.next()).getValue()).getSname().equals(var1)) {
               return (RoleSuitBean)var3.getValue();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public Map<Integer, RoleSuitBean> getRolesuit() {
      return this.rolesuit;
   }
}
