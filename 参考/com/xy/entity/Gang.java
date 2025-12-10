package com.xy.entity;

import java.math.BigDecimal;

public class Gang {
   private BigDecimal gangnumber;
   private String founder;
   private BigDecimal ganggrade;
   private BigDecimal pkvalue;
   private BigDecimal builder;
   private String gangname;
   private String gangbelong;
   private BigDecimal gangid;
   private String introduction;
   private BigDecimal property;

   public BigDecimal getProperty() {
      return this.property;
   }

   public void setPkvalue(BigDecimal var1) {
      this.pkvalue = var1;
   }

   public BigDecimal getGangid() {
      return this.gangid;
   }

   public void setBuilder(BigDecimal var1) {
      this.builder = var1;
   }

   public BigDecimal getGangnumber() {
      return this.gangnumber;
   }

   public BigDecimal getGanggrade() {
      return this.ganggrade;
   }

   public void setGangbelong(String var1) {
      this.gangbelong = var1 == null ? null : var1.trim();
   }

   public void setFounder(String var1) {
      this.founder = var1 == null ? null : var1.trim();
   }

   public void setGangid(BigDecimal var1) {
      this.gangid = var1;
   }

   public String getGangname() {
      return this.gangname;
   }

   public void setGanggrade(BigDecimal var1) {
      this.ganggrade = var1;
   }

   public String getIntroduction() {
      return this.introduction;
   }

   public void setGangname(String var1) {
      this.gangname = var1 == null ? null : var1.trim();
   }

   public BigDecimal getBuilder() {
      return this.builder;
   }

   public void setIntroduction(String var1) {
      this.introduction = var1 == null ? null : var1.trim();
   }

   public void setProperty(BigDecimal var1) {
      this.property = var1;
   }

   public BigDecimal getPkvalue() {
      return this.pkvalue;
   }

   public String getFounder() {
      return this.founder;
   }

   public String getGangbelong() {
      return this.gangbelong;
   }

   public void setGangnumber(BigDecimal var1) {
      this.gangnumber = var1;
   }
}
