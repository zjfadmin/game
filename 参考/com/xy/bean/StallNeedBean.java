package com.xy.bean;

public class StallNeedBean {
   private int id;
   private long money;
   private int total;
   private int num;

   public long getMoney() {
      return this.money;
   }

   public int getId() {
      return this.id;
   }

   public int getNum() {
      return this.num;
   }

   public int getTotal() {
      return this.total;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setNum(int var1) {
      this.num = var1;
   }

   public void setTotal(int var1) {
      this.total = var1;
   }

   public void setMoney(long var1) {
      this.money = var1;
   }
}
