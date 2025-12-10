package com.xy.bean;

import java.math.BigDecimal;

public class ChatFriendBean {
   private BigDecimal gangid;
   private String message;
   private BigDecimal troop_id;
   private Long mapid;
   private Integer grade;
   private String race_name;
   private String friendName;
   private long time;
   private String rolename;
   private BigDecimal SendRoleId;

   public BigDecimal getTroop_id() {
      return this.troop_id;
   }

   public Integer getGrade() {
      return this.grade;
   }

   public String getMessage() {
      return this.message;
   }

   public long getTime() {
      return this.time;
   }

   public void setRace_name(String var1) {
      this.race_name = var1;
   }

   public void setFriendName(String var1) {
      this.friendName = var1;
   }

   public BigDecimal getGangid() {
      return this.gangid;
   }

   public void setGrade(Integer var1) {
      this.grade = var1;
   }

   public void setGangid(BigDecimal var1) {
      this.gangid = var1;
   }

   public void setSendRoleId(BigDecimal var1) {
      this.SendRoleId = var1;
   }

   public Long getMapid() {
      return this.mapid;
   }

   public BigDecimal getSendRoleId() {
      return this.SendRoleId;
   }

   public void setTime(long var1) {
      this.time = var1;
   }

   public void setTroop_id(BigDecimal var1) {
      this.troop_id = var1;
   }

   public void setMapid(Long var1) {
      this.mapid = var1;
   }

   public String getRace_name() {
      return this.race_name;
   }

   public void setMessage(String var1) {
      this.message = var1;
   }

   public String getFriendName() {
      return this.friendName;
   }

   public void setRolename(String var1) {
      this.rolename = var1;
   }

   public String getRolename() {
      return this.rolename;
   }
}
