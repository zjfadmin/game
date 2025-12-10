package com.xy.bean;

public class QuoteOutBean {
   private long value;
   private int type;
   private String data;

   public void setValue(long var1) {
      this.value = var1;
   }

   public String getData() {
      return this.data;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setData(String var1) {
      this.data = var1;
   }

   public int getType() {
      return this.type;
   }

   public long getValue() {
      return this.value;
   }
}
