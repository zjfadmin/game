package com.xy.bean;

import java.math.BigDecimal;

public class QuackGameBean {
   private AssetUpdate assetUpdate;
   private String petmsg2;
   private Integer index;
   private int type;
   private String petmsg;
   private BigDecimal money;

   public void setMoney(BigDecimal var1) {
      this.money = var1;
   }

   public String getPetmsg() {
      return this.petmsg;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public BigDecimal getMoney() {
      return this.money;
   }

   public void setPetmsg2(String var1) {
      this.petmsg2 = var1;
   }

   public AssetUpdate getAssetUpdate() {
      return this.assetUpdate;
   }

   public Integer getIndex() {
      return this.index;
   }

   public void setPetmsg(String var1) {
      this.petmsg = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setIndex(Integer var1) {
      this.index = var1;
   }

   public void setAssetUpdate(AssetUpdate var1) {
      this.assetUpdate = var1;
   }

   public String getPetmsg2() {
      return this.petmsg2;
   }
}
