package com.xy.bean;

import java.math.BigDecimal;
import java.util.List;

public class NpcComposeBean {
   private List<BigDecimal> goodstables;
   private String composetype;

   public void setComposetype(String var1) {
      this.composetype = var1;
   }

   public String getComposetype() {
      return this.composetype;
   }

   public void setGoodstables(List<BigDecimal> var1) {
      this.goodstables = var1;
   }

   public List<BigDecimal> getGoodstables() {
      return this.goodstables;
   }
}
