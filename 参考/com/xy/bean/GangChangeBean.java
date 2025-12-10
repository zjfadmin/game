package com.xy.bean;

import java.math.BigDecimal;

public class GangChangeBean {
   private String msg;
   private String post;
   private String gangName;
   private BigDecimal gangid;

   public BigDecimal getGangid() {
      return this.gangid;
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }

   public String getGangName() {
      return this.gangName;
   }

   public String getPost() {
      return this.post;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setPost(String var1) {
      this.post = var1;
   }

   public void setGangName(String var1) {
      this.gangName = var1;
   }

   public GangChangeBean(LoginResult var1, String var2) {
      this.gangid = var1.getGang_id();
      this.gangName = var1.getGangname();
      this.post = var1.getGangpost();
      this.msg = var2;
   }

   public void setGangid(BigDecimal var1) {
      this.gangid = var1;
   }
}
