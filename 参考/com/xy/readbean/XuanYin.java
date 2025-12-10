package com.xy.readbean;

import com.xy.formula.BaseQl;

public class XuanYin {
   private String name;
   private int type;
   private String value;
   private int id;
   private transient BaseQl baseQl;

   public void setType(int var1) {
      this.type = var1;
   }

   public void a() {
      int var1 = this.value.indexOf("=");
      this.baseQl = new BaseQl(this.value.substring(3 & 4, var1), Double.parseDouble(this.value.substring(var1 + (3 >> 1))));
      this.value = null;
   }

   public void setBaseQl(BaseQl var1) {
      this.baseQl = var1;
   }

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public BaseQl getBaseQl() {
      return this.baseQl;
   }

   public String getName() {
      return this.name;
   }
}
