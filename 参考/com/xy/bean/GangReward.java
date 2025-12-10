package com.xy.bean;

import java.math.BigDecimal;

public class GangReward {
   private int rewardNum;
   private BigDecimal goodId;
   private int dropNum;

   public int getDropNum() {
      return this.dropNum;
   }

   public GangReward(BigDecimal var1, int var2) {
      this.goodId = var1;
      this.dropNum = var2;
   }

   public GangReward() {
   }

   public BigDecimal getGoodId() {
      return this.goodId;
   }

   public GangReward(BigDecimal var1, int var2, int var3) {
      this.goodId = var1;
      this.dropNum = var2;
      this.rewardNum = var3;
   }

   public void setDropNum(int var1) {
      this.dropNum = var1;
   }

   public void setGoodId(BigDecimal var1) {
      this.goodId = var1;
   }

   public void setRewardNum(int var1) {
      this.rewardNum = var1;
   }

   public int getRewardNum() {
      return this.rewardNum;
   }

   public void a() {
      this.rewardNum += 5 >> 2;
   }
}
