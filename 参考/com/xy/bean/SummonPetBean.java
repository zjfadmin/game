package com.xy.bean;

import java.math.BigDecimal;

public class SummonPetBean {
   private int opertype;
   private BigDecimal petid;
   private BigDecimal goodid;

   public SummonPetBean() {
   }

   public void setPetid(BigDecimal var1) {
      this.petid = var1;
   }

   public BigDecimal getGoodid() {
      return this.goodid;
   }

   public SummonPetBean(int var1) {
      this.opertype = var1;
   }

   public BigDecimal getPetid() {
      return this.petid;
   }

   public int getOpertype() {
      return this.opertype;
   }

   public void setOpertype(int var1) {
      this.opertype = var1;
   }

   public void setGoodid(BigDecimal var1) {
      this.goodid = var1;
   }
}
