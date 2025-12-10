package com.xy.bean;

import java.math.BigDecimal;

public class QualityClBean {
   private String newAttr;
   private BigDecimal rgid;
   private int type;
   private String data;

   public BigDecimal getRgid() {
      return this.rgid;
   }

   public void setNewAttr(String var1) {
      this.newAttr = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setRgid(BigDecimal var1) {
      this.rgid = var1;
   }

   public String getNewAttr() {
      return this.newAttr;
   }

   public String getData() {
      return this.data;
   }

   public void setData(String var1) {
      this.data = var1;
   }

   public int getType() {
      return this.type;
   }
}
