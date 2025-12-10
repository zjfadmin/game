package com.xy.formula;

import com.xy.lg;
import com.xy.readbean.GemOld;

public class BaseGemOld {
   private int id;
   private int lvl;
   private int value;

   public int getLvl() {
      return this.lvl;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public GemOld getGemOld(lg var1) {
      return var1.cl(this.id);
   }

   public int getValue() {
      return this.value;
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public BaseGemOld(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 3 & 4;

      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 != var1.length(); var10000 = var2) {
         if ((var2 = var1.indexOf("#", var3 + (5 >> 2))) == -4 >> 2) {
            var2 = var1.length();
         }

         if (var4 == 0) {
            var10000 = var2;
            this.lvl = Integer.parseInt(var1.substring(var3, var2));
         } else if (var4 == --1) {
            var10000 = var2;
            this.id = Integer.parseInt(var1.substring(var3, var2));
         } else {
            if (var4 == 5 >> 1) {
               this.value = Integer.parseInt(var1.substring(var3, var2));
            }

            var10000 = var2;
         }

         ++var4;
         var3 = var10000 + 1;
      }

   }
}
