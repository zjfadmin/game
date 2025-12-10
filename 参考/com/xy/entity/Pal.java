package com.xy.entity;

import java.math.BigDecimal;

public class Pal {
   private int pId;
   private BigDecimal id;
   private long exp;
   private double grow;
   private BigDecimal roleId;
   private String parts;

   public int getpId() {
      return this.pId;
   }

   public void setpId(int var1) {
      this.pId = var1;
   }

   public void setId(BigDecimal var1) {
      this.id = var1;
   }

   public void setRoleId(BigDecimal var1) {
      this.roleId = var1;
   }

   public double getGrow() {
      return this.grow;
   }

   public BigDecimal getId() {
      return this.id;
   }

   public void setParts(String var1) {
      this.parts = var1;
   }

   public String getParts() {
      return this.parts;
   }

   public void setGrow(double var1) {
      this.grow = var1;
   }

   public BigDecimal getRoleId() {
      return this.roleId;
   }

   public long getExp() {
      return this.exp;
   }

   public void setExp(long var1) {
      this.exp = var1;
   }
}
