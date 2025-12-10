package com.xy.bean;

import com.xy.readbean.Shop;
import java.util.List;

public class ShopGoodsBean {
   private List<Shop> shopList;
   private int type;
   private Integer nId;

   public List<Shop> getShopList() {
      return this.shopList;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setnId(Integer var1) {
      this.nId = var1;
   }

   public void setShopList(List<Shop> var1) {
      this.shopList = var1;
   }

   public Integer getnId() {
      return this.nId;
   }
}
