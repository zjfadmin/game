package com.xy.bean;

import java.math.BigDecimal;

public class FightOperation {
   private int camp;
   private int type;
   private BigDecimal good;
   private String Spell;
   private int man;

   public void setMan(int var1) {
      this.man = var1;
   }

   public int getMan() {
      return this.man;
   }

   public void setSpell(String var1) {
      this.Spell = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public BigDecimal getGood() {
      return this.good;
   }

   public String getSpell() {
      return this.Spell;
   }

   public int getType() {
      return this.type;
   }

   public int getCamp() {
      return this.camp;
   }

   public void a(boolean var1, int var2, int var3, String var4) {
      this.camp = var1 ? 3 & 5 : 0;
      this.man = var2;
      this.type = var3;
      if (var3 == --1) {
         this.Spell = var4;
      } else {
         if (var3 == 5 >> 1) {
            this.good = new BigDecimal(var4);
         }

      }
   }

   public void setCamp(int var1) {
      this.camp = var1;
   }

   public FightOperation() {
      int var10001 = -4 >> 2;
      int var10003 = -4 >> 2;
      super();
      this.camp = var10003;
      this.man = var10001;
   }

   public void setGood(BigDecimal var1) {
      this.good = var1;
   }
}
