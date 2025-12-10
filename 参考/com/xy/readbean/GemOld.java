package com.xy.readbean;

public class GemOld {
   private double value;
   private String key;
   private int type;
   private int[] parts;
   private int id;

   public void setParts(int[] var1) {
      this.parts = var1;
   }

   public int getType() {
      return this.type;
   }

   public String getKey() {
      return this.key;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public double getValue() {
      return this.value;
   }

   public void setValue(double var1) {
      this.value = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getId() {
      return this.id;
   }

   public int[] getParts() {
      return this.parts;
   }
}
