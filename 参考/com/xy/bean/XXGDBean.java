package com.xy.bean;

import java.math.BigDecimal;

public class XXGDBean {
   private BigDecimal id;
   private long tag;
   private int sum;

   public void setSum(int var1) {
      this.sum = var1;
   }

   public int getSum() {
      return this.sum;
   }

   public void setTag(long var1) {
      this.tag = var1;
   }

   public long getTag() {
      return this.tag;
   }

   public BigDecimal getId() {
      return this.id;
   }

   public void setId(BigDecimal var1) {
      this.id = var1;
   }
}
