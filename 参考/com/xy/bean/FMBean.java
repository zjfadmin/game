package com.xy.bean;

import java.math.BigDecimal;
import java.util.List;

public class FMBean {
   private String fmTime;
   private List<FMRole> fmRoleList;
   private FMRole myRole;
   private BigDecimal[] goodIds;
   private FMRole fmRole;

   public void setFmRoleList(List<FMRole> var1) {
      this.fmRoleList = var1;
   }

   public void setFmTime(String var1) {
      this.fmTime = var1;
   }

   public BigDecimal[] getGoodIds() {
      return this.goodIds;
   }

   public void setFmRole(FMRole var1) {
      this.fmRole = var1;
   }

   public FMRole getFmRole() {
      return this.fmRole;
   }

   public List<FMRole> getFmRoleList() {
      return this.fmRoleList;
   }

   public FMRole getMyRole() {
      return this.myRole;
   }

   public void setGoodIds(BigDecimal[] var1) {
      this.goodIds = var1;
   }

   public String getFmTime() {
      return this.fmTime;
   }

   public void setMyRole(FMRole var1) {
      this.myRole = var1;
   }
}
