package com.xy.readbean;

public class aCard {
   private int id;
   private String gn;
   private int type;
   private int cardType;
   private int time;
   private String name;
   private String skin;
   private String value;
   private int money;

   public String getSkin() {
      return this.skin;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public String getGn() {
      return this.gn;
   }

   public void setCardType(int var1) {
      this.cardType = var1;
   }

   public void setTime(int var1) {
      this.time = var1;
   }

   public String getValue() {
      return this.value;
   }

   public void setMoney(int var1) {
      this.money = var1;
   }

   public int getId() {
      return this.id;
   }

   public int getMoney() {
      return this.money;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public int getCardType() {
      return this.cardType;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setGn(String var1) {
      this.gn = var1;
   }

   public String getName() {
      return this.name;
   }

   public int getTime() {
      return this.time;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }
}
