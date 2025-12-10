package com.xy.readbean;

import com.xy.W;

public class AlchemyUnit {
   private double min;
   private double max;
   private String key;
   private int size;

   public void setSize(int var1) {
      this.size = var1;
   }

   public String getKey() {
      return this.key;
   }

   public double getMin() {
      return this.min;
   }

   public AlchemyUnit(String var1, int var2, int var3) {
      int var10000 = 3 >> 2;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 2 & 5; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (3 & 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.key = var1.substring(var2, var5);
         } else if (var4 == 3 >> 1) {
            var10000 = var5;
            this.min = Double.parseDouble(var1.substring(var2, var5));
         } else {
            if (var4 == 5 >> 1) {
               this.max = Double.parseDouble(var1.substring(var2, var5));
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

      this.size = !this.key.equals("附加气血") && !this.key.equals("附加魔法") && !this.key.equals("附加攻击") && !this.key.equals("附加速度") && !this.key.equals("根骨") && !this.key.equals("灵性") && !this.key.equals("力量") && !this.key.equals("敏捷") && !this.key.equals("防御") && !this.key.equals("抗三尸虫") && !this.key.equals("抗毒伤害") && !this.key.equals("抗反震") && !this.key.equals("每回合HP") && !this.key.equals("每回合MP") ? 1 : 0;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public double getDoubleByMax(int var1, int var2) {
      double var3 = this.min;
      double var5;
      if ((var5 = this.max) <= var3) {
         return var5;
      } else {
         var1 += var1 < var2 ? W.c.nextInt(var2 - var1 + (3 & 5)) : 0;
         return Math.max(var3, var5 * (double)var1 / 100.0D);
      }
   }

   public int getSize() {
      return this.size;
   }

   public AlchemyUnit() {
   }

   public void setMin(double var1) {
      this.min = var1;
   }

   public void setMax(double var1) {
      this.max = var1;
   }

   public double getMax() {
      return this.max;
   }
}
