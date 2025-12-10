package com.xy.bean;

import java.math.BigDecimal;

public class ChatBean {
   private BigDecimal roleId;
   private String skin;
   private int id;
   private BeauBean beauBean;
   private String role;
   private String message;

   public int getId() {
      return this.id;
   }

   public BigDecimal getRoleId() {
      return this.roleId;
   }

   public String getMessage() {
      return this.message;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public BeauBean getBeauBean() {
      return this.beauBean;
   }

   public String getRole() {
      return this.role;
   }

   public void setBeauBean(BeauBean var1) {
      this.beauBean = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setMessage(String var1) {
      this.message = var1;
   }

   public void setRole(String var1) {
      this.role = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public void setRoleId(BigDecimal var1) {
      this.roleId = var1;
   }
}
