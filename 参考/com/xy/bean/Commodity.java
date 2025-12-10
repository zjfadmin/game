package com.xy.bean;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;

public class Commodity {
   private Goodstable good;
   private RoleSummoning pet;
   private long money;
   private Lingbao lingbao;
   private String currency;

   public void setLingbao(Lingbao var1) {
      this.lingbao = var1;
   }

   public Lingbao getLingbao() {
      return this.lingbao;
   }

   public void setCurrency(String var1) {
      this.currency = var1;
   }

   public long getMoney() {
      return this.money;
   }

   public void setPet(RoleSummoning var1) {
      this.pet = var1;
   }

   public Goodstable getGood() {
      return this.good;
   }

   public RoleSummoning getPet() {
      return this.pet;
   }

   public String getCurrency() {
      return this.currency;
   }

   public void setMoney(long var1) {
      this.money = var1;
   }

   public void setGood(Goodstable var1) {
      this.good = var1;
   }
}
