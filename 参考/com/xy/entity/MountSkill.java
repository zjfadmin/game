package com.xy.entity;

import java.math.BigDecimal;

public class MountSkill {
   private BigDecimal skillid;
   private String skillname;
   private BigDecimal mid;

   public BigDecimal getMid() {
      return this.mid;
   }

   public void setSkillid(BigDecimal var1) {
      this.skillid = var1;
   }

   public void setSkillname(String var1) {
      this.skillname = var1;
   }

   public String getSkillname() {
      return this.skillname;
   }

   public void setMid(BigDecimal var1) {
      this.mid = var1;
   }

   public BigDecimal getSkillid() {
      return this.skillid;
   }
}
