package com.xy.readbean;

public class MoneyType {
   private long max;
   private String key;
   private int id;

   public void setMax(long var1) {
      this.max = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public MoneyType() {
   }

   public void setIdAndMax(int var1, long var2) {
      this.id = var1;
      this.max = var2;
   }

   public void setIdAndKey(int var1, String var2) {
      this.id = var1;
      this.key = var2;
   }

   public MoneyType(int var1, long var2) {
      this.id = var1;
      this.max = var2;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public String getKey() {
      return this.key;
   }

   public long getMax() {
      return this.max;
   }
}
