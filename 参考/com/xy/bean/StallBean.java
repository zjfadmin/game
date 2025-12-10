package com.xy.bean;

import java.math.BigDecimal;

public class StallBean {
   private int x;
   private boolean buy;
   private int state;
   private int mapid;
   private BigDecimal roleid;
   private String stall;
   private int y;
   private String role;
   private int id;

   public boolean a() {
      return this.buy;
   }

   public void setStall(String var1) {
      this.stall = var1;
   }

   public int getState() {
      return this.state;
   }

   public String getStall() {
      return this.stall;
   }

   public int getY() {
      return this.y;
   }

   public void setBuy(boolean var1) {
      this.buy = var1;
   }

   public int getId() {
      return this.id;
   }

   public String getRole() {
      return this.role;
   }

   public void setMapid(int var1) {
      this.mapid = var1;
   }

   public void setState(int var1) {
      this.state = var1;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void setRoleid(BigDecimal var1) {
      this.roleid = var1;
   }

   public void setRole(String var1) {
      this.role = var1;
   }

   public int getMapid() {
      return this.mapid;
   }

   public int getX() {
      return this.x;
   }

   public BigDecimal getRoleid() {
      return this.roleid;
   }

   public void setId(int var1) {
      this.id = var1;
   }
}
