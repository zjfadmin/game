package com.xy.readbean;

import java.util.Iterator;
import java.util.Map;

public class SkillBean {
   private Map<String, Skill> skillMap;

   public void a() {
      Iterator var1;
      for(Iterator var10000 = var1 = this.skillMap.values().iterator(); var10000.hasNext(); var10000 = var1) {
         ((Skill)var1.next()).a();
      }

   }

   public void setSkillMap(Map<String, Skill> var1) {
      this.skillMap = var1;
   }

   public Map<String, Skill> getSkillMap() {
      return this.skillMap;
   }
}
