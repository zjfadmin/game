package com.xy.bean;

public class ConfirmBean {
   private String value;
   private int type;
   private String MSG;

   public void setType(int var1) {
      this.type = var1;
   }

   public void setMSG(String var1) {
      this.MSG = var1;
   }

   public ConfirmBean() {
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getValue() {
      return this.value;
   }

   public int getType() {
      return this.type;
   }

   public String getMSG() {
      return this.MSG;
   }

   public ConfirmBean(int var1, String var2, String var3) {
      this.type = var1;
      this.MSG = var3;
      this.value = var2;
   }
}
