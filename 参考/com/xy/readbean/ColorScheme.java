package com.xy.readbean;

public class ColorScheme {
   private int id;
   private String name;
   private int zid;
   private int max;
   private String value;
   private int min;

   public void setValue(String var1) {
      this.value = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setMax(int var1) {
      this.max = var1;
   }

   public int getMax() {
      return this.max;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public int getZid() {
      return this.zid;
   }

   public void setZid(int var1) {
      this.zid = var1;
   }

   public int getMin() {
      return this.min;
   }

   public String getValue() {
      return this.value;
   }

   public void setMin(int var1) {
      this.min = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }
}
