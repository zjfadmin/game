package com.xy.bean;

import java.math.BigDecimal;

public class GiveGoodsBean {
   private int type;
   private int sum;
   private BigDecimal gold;
   private BigDecimal otherID;
   private String otherName;
   private BigDecimal rgid;

   public void setType(int var1) {
      this.type = var1;
   }

   public void setOtherID(BigDecimal var1) {
      this.otherID = var1;
   }

   public void setGold(BigDecimal var1) {
      this.gold = var1;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }

   public BigDecimal getRgid() {
      return this.rgid;
   }

   public void setOtherName(String var1) {
      this.otherName = var1;
   }

   public BigDecimal getGold() {
      return this.gold;
   }

   public String getOtherName() {
      return this.otherName;
   }

   public int getSum() {
      return this.sum;
   }

   public BigDecimal getOtherID() {
      return this.otherID;
   }

   public int getType() {
      return this.type;
   }

   public void setRgid(BigDecimal var1) {
      this.rgid = var1;
   }
}
