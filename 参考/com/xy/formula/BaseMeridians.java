package com.xy.formula;

public class BaseMeridians {
   private String key;
   private int xs;
   private int exp;
   private double value;
   private int bh;

   public int getNextExp(int var1) {
      return BaseValue.getMeridiansExp(var1);
   }

   public int getExp() {
      return this.exp;
   }

   public void a(StringBuffer var1) {
      if (this.bh == (123 & 103)) {
         var1.append(this.bh);
         var1.append("=");
         var1.append(this.key);
      } else {
         var1.append(this.bh);
         var1.append("_");
         var1.append(this.exp);
         var1.append("_");
         var1.append(this.xs);
         if (this.key != null) {
            var1.append("_");
            var1.append(this.key);
            var1.append("_");
            var1.append(this.value);
         }

      }
   }

   public int getUpExp(int var1) {
      return this.exp - BaseValue.getMeridiansTotalExp(var1 - (2 ^ 3));
   }

   public double getKeyValue() {
      return this.value * (double)this.getLvl() * (double)this.xs / 100.0D;
   }

   public void b(int var1, String var2, double var3) {
      this.xs = var1;
      this.key = var2;
      this.value = var3;
   }

   public int getBh() {
      return this.bh;
   }

   public String getKey() {
      return this.key;
   }

   public BaseMeridians(int var1, int var2, int var3, String var4, double var5) {
      this.bh = var1;
      this.exp = var2;
      this.b(var3, var4, var5);
   }

   public int getXs() {
      return this.xs;
   }

   public void setExp(int var1) {
      this.exp = var1;
   }

   public int getLvl() {
      return BaseValue.getMeridiansLvl(this.exp);
   }
}
