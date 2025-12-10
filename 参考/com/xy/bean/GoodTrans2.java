package com.xy.bean;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.math.BigDecimal;

public class GoodTrans2 {
   private RoleSummoning pet;
   private boolean i;
   private Goodstable goods;
   private BigDecimal money;
   private Lingbao lingbao;

   public void setGoods(Goodstable var1) {
      this.goods = var1;
   }

   public Goodstable getGoods() {
      return this.goods;
   }

   public void setLingbao(Lingbao var1) {
      this.lingbao = var1;
   }

   public void setPet(RoleSummoning var1) {
      this.pet = var1;
   }

   public BigDecimal getMoney() {
      return this.money;
   }

   public boolean a() {
      return this.i;
   }

   public Lingbao getLingbao() {
      return this.lingbao;
   }

   public void setI(boolean var1) {
      this.i = var1;
   }

   public RoleSummoning getPet() {
      return this.pet;
   }

   public void setMoney(BigDecimal var1) {
      this.money = var1;
   }
}
