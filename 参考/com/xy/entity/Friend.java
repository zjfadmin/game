package com.xy.entity;

import java.math.BigDecimal;

public class Friend {
   private BigDecimal fid;
   private BigDecimal friendid;
   private BigDecimal roleid;

   public BigDecimal getFid() {
      return this.fid;
   }

   public BigDecimal getFriendid() {
      return this.friendid;
   }

   public void setFid(BigDecimal var1) {
      this.fid = var1;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public void setFriendid(BigDecimal var1) {
      this.friendid = var1;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }
}
