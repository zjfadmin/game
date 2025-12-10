package com.xy.bean;

public class BuyShopBean {
   private Integer nId;
   private String cd;
   private int sum;
   private int ate;

   public void setnId(Integer var1) {
      this.nId = var1;
   }

   public Integer getnId() {
      return this.nId;
   }

   public int getSum() {
      return this.sum;
   }

   public void setAte(int var1) {
      this.ate = var1;
   }

   public String getCd() {
      return this.cd;
   }

   public int getAte() {
      return this.ate;
   }

   public void setCd(String var1) {
      this.cd = var1;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }
}
