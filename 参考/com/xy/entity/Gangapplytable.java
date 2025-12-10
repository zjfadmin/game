package com.xy.entity;

import java.math.BigDecimal;

public class Gangapplytable {
   private BigDecimal gangid;
   private BigDecimal role_id;
   private BigDecimal grade;
   private String race_name;
   private String rolename;

   public String getRace_name() {
      return this.race_name;
   }

   public String getRolename() {
      return this.rolename;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public void setRace_name(String var1) {
      this.race_name = var1;
   }

   public BigDecimal getGrade() {
      return this.grade;
   }

   public void setGangid(BigDecimal var1) {
      this.gangid = var1;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public BigDecimal getGangid() {
      return this.gangid;
   }

   public void setGrade(BigDecimal var1) {
      this.grade = var1;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }
}
