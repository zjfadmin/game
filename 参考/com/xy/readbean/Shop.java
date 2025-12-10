package com.xy.readbean;

import java.math.BigDecimal;

public class Shop {
   private int shoptype;
   private String shopname;
   private long shopprice;
   private Boolean isPrice;
   private BigDecimal shopiid;
   private String shopskin;
   private String shopid;
   private String shoptext;

   public void setShopid(String var1) {
      this.shopid = var1;
   }

   public void setShopskin(String var1) {
      this.shopskin = var1;
   }

   public void setShoptext(String var1) {
      this.shoptext = var1;
   }

   public String getShopskin() {
      return this.shopskin;
   }

   public String getShoptext() {
      return this.shoptext;
   }

   public int getShoptype() {
      return this.shoptype;
   }

   public BigDecimal getShopiid() {
      return this.shopiid;
   }

   public void setShopprice(long var1) {
      this.shopprice = var1;
   }

   public String getShopid() {
      return this.shopid;
   }

   public Boolean getIsPrice() {
      return this.isPrice;
   }

   public String getShopname() {
      return this.shopname;
   }

   public void setShopname(String var1) {
      this.shopname = var1;
   }

   public void setShoptype(int var1) {
      this.shoptype = var1;
   }

   public void setIsPrice(Boolean var1) {
      this.isPrice = var1;
   }

   public long getShopprice() {
      return this.shopprice;
   }

   public void setShopiid(BigDecimal var1) {
      this.shopiid = var1;
   }
}
