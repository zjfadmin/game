package com.xy.readbean;

import com.xy.formula.FormulaNum;

public class ActivityFCRecord {
   private int type;
   private FormulaNum[] key3;
   private int id;
   private int key1;
   private String key2;
   private int reset;

   public int getReset() {
      return this.reset;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setKey2(String var1) {
      this.key2 = var1;
   }

   public FormulaNum[] getKey3() {
      return this.key3;
   }

   public void setKey3(FormulaNum[] var1) {
      this.key3 = var1;
   }

   public int getType() {
      return this.type;
   }

   public int getKey1() {
      return this.key1;
   }

   public void setReset(int var1) {
      this.reset = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public void a(int var1, String var2, int var3, int var4) {
      FormulaNum[] var10001 = new FormulaNum[var1];
      boolean var10003 = true;
      this.key3 = var10001;
      var1 = 3 >> 2;

      int var5;
      for(int var10000 = var5 = 3 & 4; var10000 < var4; var10000 = var5) {
         if ((var5 = var2.indexOf("#", var3 + --1)) == -4 >> 2 || var5 > var4) {
            var5 = var4;
         }

         this.key3[var1] = new FormulaNum(var2.substring(var3, var5));
         ++var1;
         var3 = var5 + --1;
      }

   }

   public String getKey2() {
      return this.key2;
   }

   public void setKey1(int var1) {
      this.key1 = var1;
   }
}
