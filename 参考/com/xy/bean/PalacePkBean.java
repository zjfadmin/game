package com.xy.bean;

import java.math.BigDecimal;

public class PalacePkBean {
   private int Ntype;
   private BigDecimal exp;
   private BigDecimal gold;
   private int type;
   private BigDecimal xianyu;
   private int PId;
   private int choices;
   private String username;
   private String sendStr;

   public BigDecimal getExp() {
      return this.exp;
   }

   public void setPId(int var1) {
      this.PId = var1;
   }

   public String getSendStr() {
      return this.sendStr;
   }

   public BigDecimal getXianyu() {
      return this.xianyu;
   }

   public void setSendStr(String var1) {
      this.sendStr = var1;
   }

   public int getNtype() {
      return this.Ntype;
   }

   public String getUsername() {
      return this.username;
   }

   public int getType() {
      return this.type;
   }

   public int getPId() {
      return this.PId;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setXianyu(BigDecimal var1) {
      this.xianyu = var1;
   }

   public void setChoices(int var1) {
      this.choices = var1;
   }

   public void setUsername(String var1) {
      this.username = var1;
   }

   public void setNtype(int var1) {
      this.Ntype = var1;
   }

   public void setExp(BigDecimal var1) {
      this.exp = var1;
   }

   public BigDecimal getGold() {
      return this.gold;
   }

   public int getChoices() {
      return this.choices;
   }

   public PalacePkBean() {
      int var10001 = 5 >> 3;
      super();
      this.choices = var10001;
   }

   public void setGold(BigDecimal var1) {
      this.gold = var1;
   }
}
