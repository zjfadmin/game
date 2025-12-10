package com.xy.readbean;

import java.util.List;
import java.util.Map;

public class NpcShopBean {
   private Map<String, List<Shop>> npcShopMap;

   public Map<String, List<Shop>> getNpcShopMap() {
      return this.npcShopMap;
   }

   public void setNpcShopMap(Map<String, List<Shop>> var1) {
      this.npcShopMap = var1;
   }
}
