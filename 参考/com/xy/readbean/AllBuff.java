package com.xy.readbean;

import java.util.Map;

public class AllBuff {
   private Map<Integer, Buff> buffMap;

   public void setBuffMap(Map<Integer, Buff> var1) {
      this.buffMap = var1;
   }

   public Buff getBuff(int var1) {
      return (Buff)this.buffMap.get(var1);
   }

   public Map<Integer, Buff> getBuffMap() {
      return this.buffMap;
   }
}
