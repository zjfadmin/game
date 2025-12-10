package com.xy.readbean;

public class LaborShop {
   private String name;
   private int id;
   private long money;
   private int[] goods;
   private Integer zk;
   private Integer XGNum;
   private String skin;
   private String text;
   private Integer choice;
   private Integer XGTime;
   private int type;
   private Integer vip;
   private String moneyType;

   public void setText(String var1) {
      this.text = var1;
   }

   public void setMoney(long var1) {
      this.money = var1;
   }

   public String getSkin() {
      return this.skin;
   }

   public int getId() {
      return this.id;
   }

   public Integer getXGTime() {
      return this.XGTime;
   }

   public String getText() {
      return this.text;
   }

   public String getName() {
      return this.name;
   }

   public Integer getXGNum() {
      return this.XGNum;
   }

   public void setZk(Integer var1) {
      this.zk = var1;
   }

   public String getXGString(int var1) {
      if (this.XGNum == null) {
         return null;
      } else {
         StringBuffer var2;
         (var2 = new StringBuffer()).append("限购:");
         var2.append(var1);
         var2.append("/");
         var2.append(this.XGNum);
         return var2.toString();
      }
   }

   public int getType() {
      return this.type;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public Integer getChoice() {
      return this.choice;
   }

   public void setChoice(Integer var1) {
      this.choice = var1;
   }

   public void setVip(Integer var1) {
      this.vip = var1;
   }

   public Integer getVip() {
      return this.vip;
   }

   public long getMoney() {
      return this.money;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public void setMoneyType(String var1) {
      this.moneyType = var1;
   }

   public void setXGTime(Integer var1) {
      this.XGTime = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getZKMoneyString(int var1, double var2) {
      StringBuffer var4;
      (var4 = new StringBuffer()).append(var1 == 0 ? "原价:" : "现价:");
      var4.append(var2 == 1.0D ? this.money : (long)((double)this.money * var2));
      var4.append(this.moneyType);
      return var4.toString();
   }

   public String getMoneyString(double var1) {
      StringBuffer var3 = new StringBuffer();
      var3.append(this.moneyType);
      var3.append(":");
      var3.append(var1 == 1.0D ? this.money : (long)((double)this.money * var1));
      return var3.toString();
   }

   public String getMoneyType() {
      return this.moneyType;
   }

   public int[] getGoods() {
      return this.goods;
   }

   public Integer getZk() {
      return this.zk;
   }

   public void setXGNum(Integer var1) {
      this.XGNum = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setGoods(int[] var1) {
      this.goods = var1;
   }
}
