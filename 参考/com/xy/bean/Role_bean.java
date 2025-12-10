package com.xy.bean;

import java.math.BigDecimal;

public class Role_bean {
   private String gangname;
   private BeauBean beauBean;
   private String rolename;
   private BigDecimal role_id;
   private String race_name;
   private String skin;
   private String title;
   private Integer grade;

   public String getTitle() {
      return this.title;
   }

   public void setGrade(Integer var1) {
      this.grade = var1;
   }

   public void setGangname(String var1) {
      this.gangname = var1;
   }

   public String getRace_name() {
      return this.race_name;
   }

   public Integer getGrade() {
      return this.grade;
   }

   public String getRolename() {
      return this.rolename;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public String getGangname() {
      return this.gangname;
   }

   public BeauBean getBeauBean() {
      return this.beauBean;
   }

   public String getSkin() {
      return this.skin;
   }

   public void setBeauBean(BeauBean var1) {
      this.beauBean = var1;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public BigDecimal getRole_id() {
      return this.role_id;
   }

   public void setRace_name(String var1) {
      this.race_name = var1;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public void setRole_id(BigDecimal var1) {
      this.role_id = var1;
   }
}
