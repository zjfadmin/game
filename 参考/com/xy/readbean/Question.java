package com.xy.readbean;

public class Question {
   private transient String[] values;
   private int id;
   private String key;
   private String value;

   public void setId(int var1) {
      this.id = var1;
   }

   public String[] getValues() {
      if (this.values == null) {
         this.values = this.value.split("\\|");
         this.value = null;
      }

      return this.values;
   }

   public String getValue() {
      return this.value;
   }

   public int getIndex(String var1) {
      this.getValues();
      int var2 = 2 & 5;

      for(int var10000 = var2; var10000 < this.values.length; var10000 = var2) {
         if (this.values[var2].equals(var1)) {
            return var2 + (4 ^ 5);
         }

         ++var2;
      }

      return 3 >> 2;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getKey() {
      return this.key;
   }
}
