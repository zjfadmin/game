package com.xy.formula;

import com.xy.hd;

public class ActivityPetManualType {
   private int lvlExp;
   private String name;
   private FormulaNum[] types;
   private int addMoney;
   private int addExp;
   private int lvlMax;
   private int id;

   public int getAddExp() {
      return this.addExp;
   }

   public int getLvlExp() {
      return this.lvlExp;
   }

   public void setTypes(FormulaNum[] var1) {
      this.types = var1;
   }

   public void setLvlMax(int var1) {
      this.lvlMax = var1;
   }

   public int getAddMoney() {
      return this.addMoney;
   }

   public void setAddMoney(int var1) {
      this.addMoney = var1;
   }

   public void setAddExp(int var1) {
      this.addExp = var1;
   }

   public ActivityPetManualType(String var1) {
      int var10000 = 3 >> 2;
      super();
      int var4 = var10000;
      int var3 = 3 ^ 3;

      int var2;
      for(var10000 = var2 = 2 & 5; var10000 < var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("|", var3 + (2 ^ 3))) == -4 >> 2 || var2 > var1.length()) {
            var2 = var1.length();
         }

         if (var4 == 0) {
            this.id = hd.b(var1, var3, var2);
         } else if (var4 == --1) {
            this.name = var1.substring(var3, var2);
         } else if (var4 == 5 >> 1) {
            this.types = ActivityPetManualSet.a(var1, var3, var2);
         } else if (var4 == --3) {
            this.lvlMax = hd.b(var1, var3, var2);
         } else if (var4 == --4) {
            this.lvlExp = hd.b(var1, var3, var2);
         } else if (var4 == --5) {
            this.addExp = hd.b(var1, var3, var2);
         } else if (var4 == (126 & 7)) {
            this.addMoney = hd.b(var1, var3, var2);
         }

         ++var4;
         var3 = var2 + --1;
      }

   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public int getLvlMax() {
      return this.lvlMax;
   }

   public void setLvlExp(int var1) {
      this.lvlExp = var1;
   }

   public FormulaNum[] getTypes() {
      return this.types;
   }

   public int a(int var1) {
      int var2 = 5 >> 3;
      int var4 = 3 ^ 3;

      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < this.types.length; var10000 = var3) {
         if ((var4 = this.types[var3].a((long)var1)) != -4 >> 2) {
            return var2 + var4;
         }

         FormulaNum var10001 = this.types[var3];
         ++var3;
         var2 += var10001.getSize();
      }

      return -4 >> 2;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }
}
