package com.xy.formula;

public class BaseSuit {
   private int sum;
   private int suitId;
   private int lvl;

   public static String getsuitSkill(int var0) {
      if (var0 == (24563 & 14205)) {
         return "加强封印";
      } else if (var0 == (22514 & 16255)) {
         return "加强昏睡";
      } else if (var0 == (16251 & 22519)) {
         return "加强遗忘";
      } else if (var0 == (16245 & 22526)) {
         return "加强混乱";
      } else if (var0 == (6143 & 32629)) {
         return "加强风";
      } else if (var0 != (14199 & 24574) && var0 != (6143 & 32631)) {
         if (var0 == (16382 & 22393)) {
            return "加强火";
         } else if (var0 == (6137 & 32639)) {
            return "加强鬼火";
         } else if (var0 == (6138 & 32639)) {
            return "忽视抗火";
         } else if (var0 == (6011 & 32767)) {
            return "忽视抗混";
         } else if (var0 == (30716 & 8063)) {
            return "忽视抗风";
         } else if (var0 == (24573 & 14207)) {
            return "忽视抗封";
         } else if (var0 == (16383 & 22398)) {
            return "忽视抗睡";
         } else if (var0 == (6143 & 32639)) {
            return "忽视遗忘";
         } else if (var0 == (22404 & 16379)) {
            return "加强震慑";
         } else if (var0 == 6017) {
            return "四抗上限";
         } else if (var0 == 6030) {
            return "加强速度法术效果";
         } else if (var0 == 6031) {
            return "水魔附身";
         } else if (var0 == 6032) {
            return "加强三尸虫";
         } else if (var0 == 6035) {
            return "加强防御法术效果";
         } else if (var0 == 6036) {
            return "加强魅惑";
         } else if (var0 == 6039) {
            return "加强攻击法术效果";
         } else {
            return var0 == 6044 ? "五行归一" : null;
         }
      } else {
         return "加强法术";
      }
   }

   public void setSuitId(int var1) {
      this.suitId = var1;
   }

   public void setSum(int var1) {
      this.sum = var1;
   }

   public int getLvl() {
      return this.lvl;
   }

   public static double getSuitValue(int var0, int var1) {
      if (var0 != (22526 & 16257) && var0 != (30582 & 8189)) {
         if (var0 == (16269 & 22515)) {
            return (double)(--5 + var1);
         } else if ((var0 < (14323 & 24445) || var0 > (8061 & 30715)) && var0 != (6078 & 32719) && var0 != (22451 & 16351) && var0 != (30677 & 8126) && var0 != (14231 & 24575)) {
            if (var0 == (6143 & 32655)) {
               return (double)var1;
            } else if (var0 == (32701 & 6098)) {
               return (double)((109 & 118) + var1 * (109 & 118));
            } else {
               return var0 == (24510 & 14301) ? (double)(var1 * (52 & 95)) : 0.5D + (double)var1 * 0.5D;
            }
         } else {
            return (double)(3 + var1);
         }
      } else {
         return 1.5D + (double)var1 * 0.5D;
      }
   }

   public void setLvl(int var1) {
      this.lvl = var1;
   }

   public BaseSuit(int var1, int var2, int var3) {
      this.suitId = var1;
      this.lvl = var2;
      this.sum = var3;
   }

   public int getSum() {
      return this.sum;
   }

   public BaseSuit(int var1, int var2) {
      this.suitId = var1;
      this.lvl = var2;
   }

   public int getSuitId() {
      return this.suitId;
   }
}
