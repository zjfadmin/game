package com.xy.entity;

import java.math.BigDecimal;

public class Titletable {
   private BigDecimal titleid;
   private BigDecimal roleid;
   private String titlename;

   public void setTitlename(String var1) {
      this.titlename = var1;
   }

   public String getTitlename() {
      return this.titlename;
   }

   public BigDecimal getTitleid() {
      return this.titleid;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public void setTitleid(BigDecimal var1) {
      this.titleid = var1;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }
}
