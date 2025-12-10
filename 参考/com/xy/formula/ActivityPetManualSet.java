package com.xy.formula;

import com.xy.hd;

public class ActivityPetManualSet {
   private FormulaNum[] types;
   private FormulaNum[] pets;
   private int[] skillTotalLvls;
   private int skillLvlMax;
   private int[] skillPetLvls;
   private FormulaNum[] skills;
   private int skillNum;

   public int getSkillId(int var1) {
      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.skills.length; var10000 = var2) {
         if (var1 < this.skills[var2].getSize()) {
            return (int)this.skills[var2].getZhi(var1);
         }

         FormulaNum var10001 = this.skills[var2];
         ++var2;
         var1 -= var10001.getSize();
      }

      return 3 ^ 3;
   }

   public FormulaNum[] getSkills() {
      return this.skills;
   }

   public static FormulaNum[] a(String var0, int var1, int var2) {
      FormulaNum[] var10000 = new FormulaNum[--1 + hd.aj((char)('s' & '/'), var0, var1, var2)];
      boolean var10002 = true;
      FormulaNum[] var5 = var10000;
      int var4 = 5 >> 3;

      int var3;
      for(int var6 = var3 = 3 ^ 3; var6 < var2; var6 = var3) {
         if ((var3 = var0.indexOf("#", var1 + --1)) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         var5[var4] = new FormulaNum(var0.substring(var1, var3));
         ++var4;
         var1 = var3 + (4 ^ 5);
      }

      return var5;
   }

   public FormulaNum[] getPets() {
      return this.pets;
   }

   public int getSkillNum() {
      return this.skillNum;
   }

   public int getSkillLvl(int var1, int var2) {
      int var5 = 5 >> 3;
      int var4 = 3 >> 2;
      int var3;
      int var10000 = var3 = this.skillPetLvls.length - (5 >> 2);

      ActivityPetManualSet var6;
      while(true) {
         if (var10000 < 0) {
            var6 = this;
            break;
         }

         if (this.skillPetLvls[var3] <= var1) {
            var5 = var3 + (3 >> 1);
            var6 = this;
            break;
         }

         --var3;
         var10000 = var3;
      }

      var10000 = var3 = var6.skillTotalLvls.length - (3 >> 1);

      while(true) {
         if (var10000 < 0) {
            var10000 = var5;
            break;
         }

         if (this.skillTotalLvls[var3] <= var2) {
            var4 = var3 + --1;
            var10000 = var5;
            break;
         }

         --var3;
         var10000 = var3;
      }

      return Math.min(Math.min(var10000, var4), this.skillLvlMax);
   }

   public int[] getSkillTotalLvls() {
      return this.skillTotalLvls;
   }

   public int[] getSkillPetLvls() {
      return this.skillPetLvls;
   }

   public FormulaNum[] getTypes() {
      return this.types;
   }

   public static int[] b(String var0, int var1, int var2) {
      int[] var10000 = new int[--1 + hd.aj((char)('<' & 'o'), var0, var1, var2)];
      boolean var10002 = true;
      int[] var5 = var10000;
      int var4 = 2 & 5;

      int var3;
      for(int var6 = var3 = 5 >> 3; var6 < var2; var6 = var3) {
         if ((var3 = var0.indexOf(",", var1 + (4 ^ 5))) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         var5[var4] = hd.b(var0, var1, var3);
         ++var4;
         var1 = var3 + --1;
      }

      return var5;
   }

   public int c(int var1) {
      int var2 = 3 ^ 3;
      int var4 = 3 & 4;

      int var3;
      for(int var10000 = var3 = 2 & 5; var10000 < this.skills.length; var10000 = var3) {
         if ((var4 = this.skills[var3].a((long)var1)) != -4 >> 2) {
            return var2 + var4;
         }

         FormulaNum var10001 = this.skills[var3];
         ++var3;
         var2 += var10001.getSize();
      }

      return -4 >> 2;
   }

   public ActivityPetManualSet(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 3 & 4;

      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("|", var4 + (2 ^ 3))) == -4 >> 2 || var2 > var1.length()) {
            var2 = var1.length();
         }

         if ((var3 = var1.indexOf("=", var4 + (2 ^ 3))) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         String var5;
         if ((var5 = var1.substring(var4, var3)).equals("契印等级上限")) {
            var10000 = var2;
            this.skillLvlMax = hd.b(var1, var3 + (5 >> 2), var2);
         } else if (var5.equals("解锁图鉴等级")) {
            var10000 = var2;
            this.skillPetLvls = b(var1, var3 + (3 >> 1), var2);
         } else if (var5.equals("解锁总等级")) {
            var10000 = var2;
            this.skillTotalLvls = b(var1, var3 + (2 ^ 3), var2);
         } else if (var5.equals("契印")) {
            var10000 = var2;
            this.skills = a(var1, var3 + (2 ^ 3), var2);
         } else if (var5.equals("图鉴分类")) {
            var10000 = var2;
            this.types = a(var1, var3 + (3 >> 1), var2);
         } else {
            if (var5.equals("图鉴")) {
               this.pets = a(var1, var3 + (3 & 5), var2);
            }

            var10000 = var2;
         }

         var4 = var10000 + 1;
      }

      for(var10000 = var4 = 2 & 5; var10000 < this.skills.length; var10000 = var4) {
         FormulaNum var10002 = this.skills[var4];
         ++var4;
         this.skillNum += var10002.getSize();
      }

   }
}
