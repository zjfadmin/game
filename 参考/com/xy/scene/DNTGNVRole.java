package com.xy.scene;

public class DNTGNVRole {
   private String size;
   private String name;

   public void a(String var1, String var2) {
      this.name = var1;
      this.size = var2;
   }

   public String getName() {
      return this.name;
   }

   public String getSize() {
      return this.size;
   }

   public void setSize(String var1) {
      this.size = var1;
   }

   public DNTGNVRole(String var1, String var2) {
      this.a(var1, var2);
   }

   public void setName(String var1) {
      this.name = var1;
   }
}
