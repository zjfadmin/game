package com.xy.formula;

public class Stunt {
   private int suitid;
   private int sum;
   private int maxSum;
   private int skillId;
   private int lvl;
   private double value;

   public int getMaxSum() {
      return this.maxSum;
   }

   public double getValue() {
      return this.value;
   }

   public boolean a() {
      return (boolean)(this.sum >= this.maxSum ? 4 ^ 5 : 0);
   }

   public Stunt(int var1, int var2, int var3, int var4) {
      this.skillId = var1;
      this.suitid = var2;
      this.lvl = var3;
      this.maxSum = var4;
   }

   public int getSum() {
      return this.sum;
   }

   public void setSkillId(int var1) {
      this.skillId = var1;
   }

   public void b() {
      this.sum += 4 ^ 5;
   }

   public void setSuitid(int var1) {
      this.suitid = var1;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }

   public boolean c() {
      return this.skillId >= (32633 & 6135) && this.skillId <= (14253 & 24531) || this.skillId == (24478 & 14319) || this.skillId == (16379 & 22423) || this.skillId == (32671 & 6132) || this.skillId == (8127 & 30679) || this.skillId == (32751 & 6047) || this.skillId == (24499 & 14300) || this.skillId >= (16349 & 24419) && this.skillId <= (32759 & 8031) || this.skillId >= (16383 & 24414) && this.skillId <= (32765 & 8038) || this.skillId >= (8039 & 32766) && this.skillId <= (16231 & 24575);
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public void setMaxSum(int var1) {
      this.maxSum = var1;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public int getSuitid() {
      return this.suitid;
   }

   public int getLvl() {
      return this.lvl;
   }

   public void setValue(double var1) {
      this.value = var1;
   }
}
