package com.xy.bean;

import java.math.BigDecimal;

public class FMRole {
   private BigDecimal species_id;
   private BigDecimal role_id;
   private int fmPlace;
   private int fmPlacePast;
   private int fmjfPast;
   private int fmjf;
   private String rolename;
   private Integer grade;

   public void setSpecies_id(BigDecimal var1) {
      this.species_id = var1;
   }

   public void setFmPlacePast(int var1) {
      this.fmPlacePast = var1;
   }

   public String getRolename() {
      return this.rolename;
   }

   public void setGrade(Integer var1) {
      this.grade = var1;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }

   public int getFmPlacePast() {
      return this.fmPlacePast;
   }

   public int getFmPlace() {
      return this.fmPlace;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public int getFmjf() {
      return this.fmjf;
   }

   public void setFmjf(int var1) {
      this.fmjf = var1;
   }

   public void setFmPlace(int var1) {
      this.fmPlace = var1;
   }

   public BigDecimal getSpecies_id() {
      return this.species_id;
   }

   public Integer getGrade() {
      return this.grade;
   }

   public void setFmjfPast(int var1) {
      this.fmjfPast = var1;
   }

   public int getFmjfPast() {
      return this.fmjfPast;
   }
}
