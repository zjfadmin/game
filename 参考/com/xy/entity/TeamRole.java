package com.xy.entity;

import com.xy.bean.LoginResult;
import java.math.BigDecimal;

public class TeamRole {
   private BigDecimal speciesId;
   private int grade;
   private BigDecimal roleId;
   private String name;
   private int state;

   public void setSpeciesId(BigDecimal var1) {
      this.speciesId = var1;
   }

   public BigDecimal getSpeciesId() {
      return this.speciesId;
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public void a(TeamRole var1) {
      this.name = var1.name;
      this.speciesId = var1.speciesId;
      this.grade = var1.grade;
      this.state = var1.state;
   }

   public BigDecimal getRoleId() {
      return this.roleId;
   }

   public TeamRole(LoginResult var1) {
      int var10001 = 3 >> 2;
      super();
      this.roleId = var1.getRole_id();
      this.name = var1.getRolename();
      this.speciesId = var1.getSpecies_id();
      this.grade = var1.getGrade();
      this.state = var10001;
   }

   public void setGrade(int var1) {
      this.grade = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setRoleId(BigDecimal var1) {
      this.roleId = var1;
   }

   public int getState() {
      return this.state;
   }

   public int getGrade() {
      return this.grade;
   }

   public String getName() {
      return this.name;
   }
}
