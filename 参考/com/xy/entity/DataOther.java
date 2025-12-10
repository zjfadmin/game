package com.xy.entity;

public class DataOther {
   private String key;
   private int type;
   private long roleId;
   private long id;
   private String data;

   public void setRoleId(long var1) {
      this.roleId = var1;
   }

   public void setData(String var1) {
      this.data = var1;
   }

   public void setId(long var1) {
      this.id = var1;
   }

   public String getData() {
      return this.data;
   }

   public long getId() {
      return this.id;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public boolean a() {
      return (boolean)(this.type >= 0 && this.type <= (47 & 90) ? --1 : 0);
   }

   public int getType() {
      return this.type;
   }

   public long getRoleId() {
      return this.roleId;
   }

   public String getKey() {
      return this.key;
   }

   public void setKey(String var1) {
      this.key = var1;
   }
}
