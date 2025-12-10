package com.xy.formula;

import com.xy.hd;

public class ActivityMenuSet2 {
   private FormulaNum[] bases;
   private int t2;
   private String key;
   private int id;
   private static String[] KEYS;
   private int t1;

   public ActivityMenuSet2(String var1, int var2, int var3) {
      int var4 = var1.indexOf("#", var2 + (5 >> 2));
      this.id = hd.b(var1, var2, var4);
      var2 = var4 + (3 >> 1);
      var4 = var1.indexOf(",", var2 + --1);
      this.key = var1.substring(var2, var4);
      var2 = var4 + (3 >> 1);
      if ((var4 = var1.indexOf(",", var2 + (4 ^ 5))) == -4 >> 2 || var4 > var3) {
         var4 = var3;
      }

      this.a(var1, var2, var4);
      int var5 = var2 = var4 + (3 & 5);

      for(int var10000 = var5; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (3 & 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if ((var4 = var1.indexOf("#", var2 + (3 & 5))) == -4 >> 2 || var4 > var5) {
            var4 = var5;
         }

         String var6;
         if ((var6 = var1.substring(var2, var4)).equals(KEYS[3 >> 2])) {
            var10000 = var5;
            this.t1 = hd.b(var1, var4 + --1, var5);
         } else {
            if (var6.equals(KEYS[4 ^ 5])) {
               this.t2 = hd.b(var1, var4 + (2 ^ 3), var5);
            }

            var10000 = var5;
         }

         var2 = var10000 + 1;
      }

   }

   public String getKey() {
      return this.key;
   }

   public int getId() {
      return this.id;
   }

   public void setT2(int var1) {
      this.t2 = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public void a(String var1, int var2, int var3) {
      FormulaNum[] var10001 = new FormulaNum[(4 ^ 5) + hd.aj((char)('s' & '/'), var1, var2, var3)];
      boolean var10003 = true;
      this.bases = var10001;
      int var4 = 5 >> 3;

      int var5;
      for(int var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (4 ^ 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         this.bases[var4] = new FormulaNum(var1.substring(var2, var5));
         ++var4;
         var2 = var5 + --1;
      }

   }

   public void setBases(FormulaNum[] var1) {
      this.bases = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public FormulaNum[] getBases() {
      return this.bases;
   }

   public int getT1() {
      return this.t1;
   }

   static {
      String[] var10000 = new String[--2];
      boolean var10002 = true;
      var10000[2 & 5] = "说明";
      var10000[5 >> 2] = "奖励展示";
      KEYS = var10000;
   }

   public void setT1(int var1) {
      this.t1 = var1;
   }

   public int getT2() {
      return this.t2;
   }
}
