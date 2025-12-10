package com.xy.bean;

import java.math.BigDecimal;

public class OneArenaRole {
   private BigDecimal roleId;
   private int place;
   private String skin;
   private String name;
   private int lvl;

   public String getName() {
      return this.name;
   }

   public void setPlace(int var1) {
      this.place = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setRoleId(BigDecimal var1) {
      this.roleId = var1;
   }

   public int getLvl() {
      return this.lvl;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public BigDecimal getRoleId() {
      return this.roleId;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public int getPlace() {
      return this.place;
   }

   public String getSkin() {
      return this.skin;
   }
}
