package com.xy.formula;

import com.xy.lg;
import com.xy.readbean.Fly;

public class BaseFly {
   private int lvl;
   private int rl;
   private int exp;
   private int id;

   public Fly getFly(lg var1) {
      return var1.t(this.id);
   }

   public int getRl() {
      return this.rl;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setExp(int var1) {
      this.exp = var1;
   }

   public String getSkinGood(lg var1) {
      return this.getFly(var1).getSn1();
   }

   public int getLvl() {
      return this.lvl;
   }

   public int getExp() {
      return this.exp;
   }

   public void setRl(int var1) {
      this.rl = var1;
   }

   public BaseFly(String var1) {
      int var10000 = 3 >> 2;
      super();
      int var4 = var10000;
      int var3 = 3 >> 2;

      int var2;
      for(var10000 = var2 = 3 & 4; var10000 != var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("|", var3 + --1)) == -4 >> 2) {
            var2 = var1.length();
         }

         if (var4 == 0) {
            var10000 = var2;
            this.id = Integer.parseInt(var1.substring(var3, var2));
         } else if (var4 == (2 ^ 3)) {
            var10000 = var2;
            this.rl = Integer.parseInt(var1.substring(var3, var2));
         } else if (var4 == --2) {
            var10000 = var2;
            this.lvl = Integer.parseInt(var1.substring(var3, var2));
         } else {
            if (var4 == --3) {
               this.exp = Integer.parseInt(var1.substring(var3, var2));
            }

            var10000 = var2;
         }

         ++var4;
         var3 = var10000 + 1;
      }

   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public int getId() {
      return this.id;
   }

   public String getSkinPart(lg var1) {
      return this.getFly(var1).getSn2();
   }
}
