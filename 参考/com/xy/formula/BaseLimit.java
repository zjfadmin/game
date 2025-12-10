package com.xy.formula;

public class BaseLimit {
   private int zsMax;
   private int lvl;
   private int gg;
   private int mj;
   private int zs;
   private double xs;
   private int sex;
   private boolean isL;
   private int sw;
   private int lx;
   private int lvlMax;
   private String role;
   private int lm;

   public int getZs() {
      return this.zs;
   }

   public int getLvl() {
      return this.lvl;
   }

   public void setLm(int var1) {
      this.lm = var1;
   }

   public int getMj() {
      return this.mj;
   }

   public double getXs() {
      return this.xs;
   }

   public int getSex() {
      return this.sex;
   }

   public void setSex(int var1) {
      this.sex = var1;
   }

   public void setSw(int var1) {
      this.sw = var1;
   }

   public int getLvlMax() {
      return this.lvlMax;
   }

   public void setRole(String var1) {
      this.role = var1;
   }

   public int getLm() {
      return this.lm;
   }

   public BaseLimit() {
      int var10001 = --2;
      int var10003 = 5 >> 3;
      int var10005 = 24556 & 8411;
      int var10007 = --4;
      super();
      this.xs = 100.0D;
      this.zsMax = var10007;
      this.lvlMax = var10005;
      this.isL = (boolean)var10003;
      this.sex = var10001;
   }

   public int getSXValue(int var1) {
      if (var1 == 0) {
         return (int)((double)this.gg * this.xs / 100.0D);
      } else if (var1 == 3 >> 1) {
         return (int)((double)this.lx * this.xs / 100.0D);
      } else if (var1 == 5 >> 1) {
         return (int)((double)this.lm * this.xs / 100.0D);
      } else {
         return var1 == --3 ? (int)((double)this.mj * this.xs / 100.0D) : 0;
      }
   }

   public void setXs(double var1) {
      this.xs = var1;
   }

   public void setLvlMax(int var1) {
      this.lvlMax = var1;
   }

   public int getZsMax() {
      return this.zsMax;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public void setLx(int var1) {
      this.lx = var1;
   }

   public int getLx() {
      return this.lx;
   }

   public void setMj(int var1) {
      this.mj = var1;
   }

   public BaseLimit(int var1, int var2, int var3, int var4, double var5, int var7, int var8, int var9, int var10, boolean var11, int var12) {
      this.lm = var1;
      this.lx = var2;
      this.gg = var3;
      this.mj = var4;
      this.xs = var5;
      this.zs = var7;
      this.lvl = var8;
      this.zsMax = var9;
      this.lvlMax = var10;
      this.isL = var11;
      this.sex = var12;
   }

   public boolean a() {
      return this.isL;
   }

   public int getGg() {
      return this.gg;
   }

   public String getRole() {
      return this.role;
   }

   public void setZsMax(int var1) {
      this.zsMax = var1;
   }

   public void setZs(int var1) {
      this.zs = var1;
   }

   public void setGg(int var1) {
      this.gg = var1;
   }

   public void setL(boolean var1) {
      this.isL = var1;
   }

   public int getSw() {
      return this.sw;
   }
}
