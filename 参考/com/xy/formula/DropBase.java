package com.xy.formula;

public class DropBase {
   private int id;
   private FormulaNum num;
   private int v;

   public FormulaNum getFormulaNum() {
      return this.num;
   }

   public long getNum() {
      return this.num != null ? this.num.getZhi() : 1L;
   }

   public DropBase(int var1, int var2, FormulaNum var3) {
      this.id = var1;
      this.v = var2;
      this.num = var3;
   }

   public void setNum(FormulaNum var1) {
      this.num = var1;
   }

   public void setV(int var1) {
      this.v = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public int getV() {
      return this.v;
   }

   public DropBase() {
   }

   public long getNum(int var1) {
      return this.num != null ? this.num.getZhiCount(var1) : 1L;
   }
}
