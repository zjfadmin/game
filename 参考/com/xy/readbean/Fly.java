package com.xy.readbean;

public class Fly {
   private int rlUse;
   private int next;
   private int rlMax;
   private int id;
   private String name;
   private int lvl;
   private int ExpGrow;
   private String sn1;
   private String sn2;
   private double sp;
   private int lvlMax;

   public int getNext() {
      return this.next;
   }

   public void setRlUse(int var1) {
      this.rlUse = var1;
   }

   public void setRlMax(int var1) {
      this.rlMax = var1;
   }

   public int getRlMax() {
      return this.rlMax;
   }

   public void setNext(int var1) {
      this.next = var1;
   }

   public void setSp(double var1) {
      this.sp = var1;
   }

   public int getRlUse() {
      return this.rlUse;
   }

   public int getLvlMax() {
      return this.lvlMax;
   }

   public int getLvl() {
      return this.lvl;
   }

   public int getTotalExp(int var1) {
      return var1 * var1 * this.ExpGrow;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getSn1() {
      return this.sn1;
   }

   public void setSn1(String var1) {
      this.sn1 = var1;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public void setExpGrow(int var1) {
      this.ExpGrow = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public String getSn2() {
      return this.sn2;
   }

   public double getSp() {
      return this.sp;
   }

   public void setSn2(String var1) {
      this.sn2 = var1;
   }

   public int getExpGrow() {
      return this.ExpGrow;
   }

   public void setLvlMax(int var1) {
      this.lvlMax = var1;
   }

   public String getName() {
      return this.name;
   }
}
