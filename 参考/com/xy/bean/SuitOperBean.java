package com.xy.bean;

import com.xy.entity.PartJade;
import java.math.BigDecimal;
import java.util.List;

public class SuitOperBean {
   private List<BigDecimal> goods;
   private PartJade jade;
   private int type;

   public void setGoods(List<BigDecimal> var1) {
      this.goods = var1;
   }

   public void setJade(PartJade var1) {
      this.jade = var1;
   }

   public PartJade getJade() {
      return this.jade;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public List<BigDecimal> getGoods() {
      return this.goods;
   }
}
