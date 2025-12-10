package com.xy.bean;

import java.math.BigDecimal;

public class StallBuy {
   private BigDecimal buyid;
   private int id;
   private int sum;
   private int type;
   private int soldId;

   public void setBuyid(BigDecimal var1) {
      this.buyid = var1;
   }

   public int getSoldId() {
      return this.soldId;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getSum() {
      return this.sum;
   }

   public void setSoldId(int var1) {
      this.soldId = var1;
   }

   public BigDecimal getBuyid() {
      return this.buyid;
   }

   public int getType() {
      return this.type;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }
}
