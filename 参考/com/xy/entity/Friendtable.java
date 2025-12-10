package com.xy.entity;

import com.xy.bean.BeauBean;
import java.math.BigDecimal;

public class Friendtable {
   private String race_name;
   private int OnlineState;
   private BigDecimal grade;
   private BeauBean beauBean;
   private BigDecimal roleid;
   private BigDecimal role_id;
   private BigDecimal species_id;
   private String rolename;

   public void setBeauBean(BeauBean var1) {
      this.beauBean = var1;
   }

   public BigDecimal getGrade() {
      return this.grade;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }

   public int getOnlineState() {
      return this.OnlineState;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public String getRolename() {
      return this.rolename;
   }

   public BeauBean getBeauBean() {
      return this.beauBean;
   }

   public void setGrade(BigDecimal var1) {
      this.grade = var1;
   }

   public void setSpecies_id(BigDecimal var1) {
      this.species_id = var1;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public BigDecimal getSpecies_id() {
      return this.species_id;
   }

   public void setRace_name(String var1) {
      this.race_name = var1;
   }

   public String getRace_name() {
      return this.race_name;
   }

   public void setOnlineState(int var1) {
      this.OnlineState = var1;
   }
}
