package com.xy.scene;

import com.xy.hd;

public class BWDHRuleBattleRecord {
   private BWDHRuleBattle bwdhRuleBattle;
   private int id;
   private int index;
   private int type;
   private int win;

   public BWDHRuleBattle getBwdhRuleBattle() {
      return this.bwdhRuleBattle;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public BWDHRuleBattleRecord(int var1, String var2, int var3, int var4, BWDHRuleBattle var5) {
      int var10000 = 2 & 5;
      super();
      this.index = var1;
      this.bwdhRuleBattle = var5;
      var1 = var10000;

      int var6;
      for(var10000 = var6 = 3 & 4; var10000 < var4; var10000 = var6) {
         if ((var6 = var2.indexOf(",", var3 + (5 >> 2))) == -4 >> 2 || var6 > var4) {
            var6 = var4;
         }

         if (var1 == 0) {
            var10000 = var6;
            this.id = hd.b(var2, var3, var6);
         } else if (var1 == 5 >> 2) {
            var10000 = var6;
            this.type = hd.b(var2, var3, var6);
         } else {
            if (var1 == 5 >> 1) {
               this.win = hd.b(var2, var3, var6);
            }

            var10000 = var6;
         }

         ++var1;
         var3 = var10000 + 1;
      }

   }

   public void setBwdhRuleBattle(BWDHRuleBattle var1) {
      this.bwdhRuleBattle = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setWin(int var1) {
      this.win = var1;
   }

   public int getId() {
      return this.id;
   }

   public int getWin() {
      return this.win;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }

   public int getType() {
      return this.type;
   }

   public int getIndex() {
      return this.index;
   }
}
