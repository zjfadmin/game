package com.xy.readbean;

public class ActivityFCBase {
   private String key;
   private long num;
   private int type;
   private int id;
   private int flag;

   public void setType(int var1) {
      this.type = var1;
   }

   public void setFlag(int var1) {
      this.flag = var1;
   }

   public int getType() {
      return this.type;
   }

   public String getKey() {
      return this.key;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public ActivityFCBase(int var1) {
      this.type = var1;
   }

   public long getNum() {
      return this.num;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public ActivityFCBase() {
   }

   public void setNum(long var1) {
      this.num = var1;
   }

   public int getFlag() {
      return this.flag;
   }
}
